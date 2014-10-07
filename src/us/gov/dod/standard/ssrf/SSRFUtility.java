/*
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.common.Remarks;
import us.gov.dod.standard.ssrf._3_1.location.Ellipse;
import us.gov.dod.standard.ssrf._3_1.location.Point;
import us.gov.dod.standard.ssrf._3_1.location.Polygon;
import us.gov.dod.standard.ssrf._3_1.multiple.ConfigFreq;
import us.gov.dod.standard.ssrf._3_1.receiver.Curve;
import us.gov.dod.standard.ssrf._3_1.ssreply.Comment;
import us.gov.dod.standard.ssrf._3_1.toa.Footnote;

/**
 * SSRF Utility classes.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 * @version 3.1.0, 10/02/14
 */
public class SSRFUtility {

  /**
   * 33 characters. The maximum string length to be extracted from a class field
   * configuration and reported in an error message. String values longer than
   * this length are trimmed and a "..." suffix is added. This improves
   * readability while providing useful context to the user.
   */
  private static final int MAX_STRING_LENGTH = 33;

  /**
   * A randomly seeded AtomicInteger used to provide guaranteed unique index
   * values for SSRF classes requiring an index. This implementation   * provides a unique sequence of Integer values incrementing from a randomly
   * selected start value.
   */
  private static final AtomicInteger atomicIndex = new AtomicInteger(new Random().nextInt());

  /**
   * Get the next guaranteed unique index compatible with SSRF "idx" fields.   * The returned value is monotonically incremented by one from the previously
   * provided value.
   * <p>
   * All values increment from a randomly selected start value unique to each
   * SSRFUtility instantiation.
   * <p>
   * This method is required by the following 9 classes which set an index in
   * their constructors:
   * {@link Comment}, {@link ConfigFreq}, {@link Curve}, {@link Ellipse}, {@link ExtReferenceRef}, {@link Footnote}, {@link Point}, {@link Polygon}, {@link Remarks},
   * <p>
   * @return an {@link AtomicInteger}, wrapped inside a {@link BigInteger}
   *         instance.
   */
  public static BigInteger nextIndex() {
    return new BigInteger(String.valueOf(Math.abs(atomicIndex.incrementAndGet())));
  }

  /**
   * Internal method to recursively validate an object instance.
   * <p>
   * This method keeps track of the instance parent instance, plus the field
   * within that parent instance where the current object instance is set. These
   * are tracked to help produce a set of legible error messages.
   * <p>
   * Developer note: For more information about Java reflection see
   * <a href="http://docs.oracle.com/javase/tutorial/reflect/index.html">The
   * Reflection API</a> and <a
   * href="http://tutorials.jenkov.com/java-reflection/index.html">Java
   * Reflection Tutorial</a>.
   * <p>
   * @param instance the object instance to validate
   * @throws java.lang.Exception if the SSRF instance fails to validate
   */
  @SuppressWarnings({"unchecked", "AssignmentToMethodParameter"})
  public static void validate(Object instance) throws Exception {
    /**
     * Assign the class type under study to a local variable for convenience.
     */
    Class<?> clazz = instance.getClass();
    /**
     * Important: NO NOT inspect classes that are not within the SSRF package.
     * Also and equally important: DO NOT inspect or try to validate enumerated
     * classes.
     */
    if (clazz.isEnum() || !clazz.getName().startsWith("us.gov.dod.standard.ssrf")) {
      return;
    }
    /**
     * Iterate through the list of declared fields (public, protected and
     * private) and inspect each according to its annotated configuration and
     * state.
     */
    for (Field field : findDeclaredAndInheritedFields(clazz)) {
      /**
       * Important: Enable access to the Object instance fields (public,
       * protected and private).
       */
      field.setAccessible(true);
      /**
       * Get the instance field value. Skip (do not check and fail gracefully)
       * if the field value is null (e.g. not configured) or (somehow) not
       * accessible.
       */
      Object fieldValue;
      try {
        fieldValue = field.get(instance);
      } catch (IllegalArgumentException | IllegalAccessException ex) {
//        Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
        continue;
      }
      /**
       * Report an ERROR if the field is required and not configured.
       */
      if (isRequired(field) && fieldValue == null) {
        throw new Exception(field.getName() + " is required.");
      }
      /**
       * If the field value is not required and NULL then DO NOT try to validate
       * it.
       */
      if (fieldValue == null) {
        continue;
      }
      /**
       * If the field value object is a Collection then iterate through the
       * collection to recursively validate each entry object instance,
       * otherwise recurse to validate the field value object instance directly.
       */
      if (fieldValue instanceof Collection) {
        for (Object entry : (Collection) fieldValue) {
          if (entry != null) {
            validate(entry);
          }
        }
      } else {
        validate(fieldValue);
        /**
         * After the field validation status is completed try to validate the
         * object instance configuration against an XmlJavaTypeAdapter, if
         * present.
         */
        validateField(field, fieldValue);
      }
    }
  }

  /**
   * Evaluate a SSRF Object instance; record and report any configuration
   * errors.
   * <p>
   * This method recursively validates the provided object instance and all of
   * its components. The validation procedure ensures that all required fields
   * are set and that all configured fields contain valid data according to the
   * SSRF data formatting rules.
   * <p>
   * If the SSRF object instance does not validate OK then each specific
   * validation error condition is recorded and returned.
   * <p>
   * It is expected that this method will only be called on the top-level SSRF
   * class. However it will just as easily validate any SSRF data type.
   * <p>
   * @param instance the object instance to validate
   * @return a non-null Collection of error messages. The collection is EMPTY if
   *         the object instance validates OK.
   */
  public static Collection<String> evaluate(Object instance) {
    return evaluate(instance, null, null, null);
  }

  /**
   * Internal method to recursively validate an object instance.
   * <p>
   * This method keeps track of the instance parent instance, plus the field
   * within that parent instance where the current object instance is set. These
   * are tracked to help produce a set of legible error messages.
   * <p>
   * Developer note: For more information about Java reflection see
   * <a href="http://docs.oracle.com/javase/tutorial/reflect/index.html">The
   * Reflection API</a> and <a
   * href="http://tutorials.jenkov.com/java-reflection/index.html">Java
   * Reflection Tutorial</a>.
   * <p>
   * @param instance       the object instance to validate
   * @param parentInstance the parent object instance
   * @param parentField    the parent field where the object instance lives
   * @param messages       a collection of pretty-print error messages
   * @return a non-null Collection of error messages. The collection is EMPTY if
   *         the object instance validates OK.
   */
  @SuppressWarnings({"unchecked", "AssignmentToMethodParameter"})
  private static Collection<String> evaluate(Object instance, Object parentInstance, Field parentField, Collection<String> messages) {
    /**
     * Initialize the messages collection if required.
     */
    if (messages == null) {
      messages = new ArrayList<>();
    }
    /**
     * Assign the class type under study to a local variable for convenience.
     */
    Class<?> clazz = instance.getClass();
    /**
     * Important: NO NOT inspect classes that are not within the SSRF package.
     * Also and equally important: DO NOT inspect or try to validate enumerated
     * classes.
     */
    if (clazz.isEnum() || !clazz.getName().startsWith("us.gov.dod.standard.ssrf")) {
      return messages;
    }
    /**
     * Iterate through the list of declared fields (public, protected and
     * private) and inspect each according to its annotated configuration and
     * state.
     */
    for (Field field : findDeclaredAndInheritedFields(clazz)) {
      /**
       * Important: Enable access to the Object instance fields (public,
       * protected and private).
       */
      field.setAccessible(true);
      /**
       * Get the instance field value. Skip (do not check and fail gracefully)
       * if the field value is null (e.g. not configured) or (somehow) not
       * accessible.
       */
      Object fieldValue;
      try {
        fieldValue = field.get(instance);
      } catch (IllegalArgumentException | IllegalAccessException ex) {
//        Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
        continue;
      }
      /**
       * Report an ERROR if the field is required and not configured.
       */
      if (isRequired(field) && fieldValue == null) {
        messages.add(parentInstance.getClass().getSimpleName() + "." + parentField.getName() + " " + getErrorLabel(parentField, parentInstance) + " requires (" + field.getType().getSimpleName() + ") " + field.getName());
      }
      /**
       * If the field value is not required and NULL then DO NOT try to validate
       * it.
       */
      if (fieldValue == null) {
        continue;
      }
      /**
       * If the field value object is a Collection then iterate through the
       * collection to recursively validate each entry object instance,
       * otherwise recurse to validate the field value object instance directly.
       */
      if (fieldValue instanceof Collection) {
        for (Object entry : (Collection) fieldValue) {
          if (entry != null) {
            evaluate(entry, instance, field, messages);
          }
        }
      } else {
        evaluate(fieldValue, instance, field, messages);
        /**
         * After the field validation status is completed try to validate the
         * object instance configuration against an XmlJavaTypeAdapter, if
         * present.
         */
        try {
          validateField(field, fieldValue);
        } catch (Exception exception) {
//          System.err.println(instance.getClass().getSimpleName() + "." + field.getName() + " " + exception.getMessage());
          messages.add(clazz.getSimpleName() + "." + field.getName() + " " + exception.getMessage());
        }
      }
    }
    return messages;
  }

  /**
   * Validate a field setting.
   * <p>
   * This method inspects the field annotation for an XmlJavaTypeAdapter. If
   * found then the XmlJavaTypeAdapter is instantiated and called against the
   * provided field value.
   * <p>
   * If no XmlJavaTypeAdapter annotation is found then the field value is
   * assumed to be valid.
   * <p>
   * If the field value is null then NO VALIDATION is done.
   * <p>
   * <p>
   * @param field      the class field
   * @param fieldValue the class field configured value
   * @throws Exception the XmlJavaTypeAdapter marshal error, thrown ONLY if the
   *                   field value is not valid
   */
  private static void validateField(Field field, Object fieldValue) throws Exception {
    if (fieldValue == null) {
      return;
    }
    /**
     * Scan the field annotations, looking for an XmlJavaTypeAdapter instance.
     */
    for (Annotation annotation : field.getAnnotations()) {
      if (annotation instanceof XmlJavaTypeAdapter) {
        /**
         * If an XmlJavaTypeAdapter annotation is found then instantiate it and
         * attempt to marshal the field value. This action will complete
         * silently if the field value is valid and throw an exception if the
         * field value is not valid.
         */
        try {
          @SuppressWarnings("unchecked")
          XmlAdapter<Object, Object> anInstance = ((XmlJavaTypeAdapter) annotation).value().getConstructor().newInstance();
          anInstance.marshal(fieldValue);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
          System.err.println("XmlJavaTypeAdapter failed to instantiate: " + ex.getMessage());
          Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }
  }

  /**
   * Inspect the field and field type to get a user-friendly error label.
   * <p>
   * If the field is an end-type then the field value (trimmed to 25 characters)
   * is returned. Otherwise if the field is an object type then the work
   * "instance" is returned.
   * <p>
   * @param field    the field to get the value from
   * @param instance the object instance to query
   * @return either the field value or the string "instance"
   */
  private static String getErrorLabel(Field field, Object instance) {
    try {
      field.setAccessible(true);
      Object fieldValue = field.get(instance);
      /**
       * If the object instance is a String or a "metaData.domain" instance then
       * get the value. Else return the word "instance" to indicate a
       * class-level instance.
       */
      if (fieldValue.getClass().getName().contains("metadata.domains") || fieldValue.getClass().getName().equals("java.lang.String")) {
        return "\"" + trimString(fieldValue.toString(), MAX_STRING_LENGTH) + "\"";
      }
    } catch (IllegalArgumentException | IllegalAccessException ex) {
      Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
    }
    return "instance";
  }

  /**
   * Get all declared and inherited fields from a class type.
   * <p>
   * Reflection does not expose inherited fields. This method implements a
   * recursive search (up to but not including the base Object) of the Class
   * inheritance tree and returns all declared fields.
   * <p>
   * @param clazz the class type to inspect
   * @return a non-null {@link HashSet} instance of Fields
   */
  private static Set<Field> findDeclaredAndInheritedFields(Class<?> clazz) {
    Set<Field> fieldSet = new HashSet<>();
    Class<?> clazzType = clazz;
    while (clazzType != null && clazzType != Object.class) {
      fieldSet.addAll(Arrays.asList(clazzType.getDeclaredFields()));
      clazzType = clazzType.getSuperclass();
    }
    return fieldSet;
  }

  /**
   * Get all declared and inherited methods from a class type.
   * <p>
   * Reflection does not expose inherited fields. This method implements a
   * recursive search (up to but not including the base Object) of the Class
   * inheritance tree and returns all declared methods.
   * <p>
   * @param clazz the class type to inspect
   * @return a non-null {@link HashSet} instance of Methods
   */
  private static Set<Method> findDeclaredAndInheritedMethods(Class<?> clazz) {
    Set<Method> methodSet = new HashSet<>();
    Class<?> clazzType = clazz;
    while (clazzType != null && clazzType != Object.class) {
      methodSet.addAll(Arrays.asList(clazzType.getDeclaredMethods()));
      clazzType = clazzType.getSuperclass();
    }
    return methodSet;
  }

  /**
   * Inspect a class field and determine if it is required.
   * <p>
   * This method looks for and inspects {@link XmlAttribute}, {@link XmlElement}
   * and {@link XmlElementRef} field annotation types marked as REQUIRED.
   * <p>
   * @param field the field to inspect
   * @return TRUE if and only if the XML annotation is marked "required = true"
   */
  private static boolean isRequired(Field field) {
    for (Annotation annotation : field.getAnnotations()) {
      if (annotation instanceof XmlAttribute) {
        return ((XmlAttribute) annotation).required();
      } else if (annotation instanceof XmlElement) {
        return ((XmlElement) annotation).required();
      } else if (annotation instanceof XmlElementRef) {
        return ((XmlElementRef) annotation).required();
      }
    }
    return false;
  }

  /**
   * Trim a string to the desired maximum length.
   * <p>
   * @param value     the {@link String} instance to trim.
   * @param maxLength the maximum desired string length
   * @return the input value, trimmed to the desired length.
   */
  private static String trimString(String value, int maxLength) {
    return value.length() <= maxLength
      ? value
      : value.substring(0, maxLength - 3) + "...";
  }

  /**
   * Process an SSRF source instance for export.
   * <p>
   * This method makes a copy of the source instance configuration, copying all
   * required data objects into their proper location and preparing the SSRF
   * destination instance for export.
   * <p>
   * @param ssrf the SSRF working copy
   * @return a finali
   */
  public static SSRF build(SSRF ssrf) {
    return (SSRF) build(ssrf, null);
  }

  /**
   * Process an SSRF source instance for export. This method makes a copy of the
   * source instance configuration, copying all required data objects into their
   * proper location and preparing the SSRF destination instance for export.
   * <p>
   * @param sourceInstance      the SSRF working copy
   * @param destinationInstance a new SSRF instance with the components copied
   *                            into their proper destination
   */
  private static Object build(Object sourceInstance, Object destinationInstance) {
    /**
     * Return immediately if the source instance is null. Instantiate a new
     * destination instance if none is provided.
     */
    if (sourceInstance == null) {
      return null;
    } else if (destinationInstance == null) {
      try {
        destinationInstance = Class.forName(sourceInstance.getClass().getName()).getConstructor().newInstance();
      } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    /**
     * Assign the class type under study to a local variable for convenience.
     */
    Class<?> clazz = sourceInstance.getClass();
    /**
     * Important: NO NOT inspect classes that are not within the SSRF package.
     * Also and equally important: DO NOT inspect or try to validate enumerated
     * classes.
     */
    if (clazz.isEnum() || !clazz.getName().startsWith("us.gov.dod.standard.ssrf")) {
      return destinationInstance;
    }
    /**
     * Iterate through the list of declared fields (public, protected and
     * private) and inspect each according to its annotated configuration and
     * state.
     */
    for (Field field : findDeclaredAndInheritedFields(clazz)) {
      /**
       * Important: Enable access to the Object instance fields (public,
       * protected and private).
       */
      field.setAccessible(true);
      /**
       * Get the instance field value. Skip (do not check and fail gracefully)
       * if the field value is null (e.g. not configured) or (somehow) not
       * accessible.
       */
      Object fieldValue;
      try {
        fieldValue = field.get(sourceInstance);
      } catch (IllegalArgumentException | IllegalAccessException ex) {
//        Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
        continue;
      }
      /**
       * If the field value is not required and NULL then DO NOT try to validate
       * it.
       */
      if (fieldValue == null) {
        continue;
      }
      /**
       * If the field value object is a Collection then iterate through the
       * collection to recursively validate each entry object instance,
       * otherwise recurse to validate the field value object instance directly.
       */
      if (fieldValue instanceof Collection) {
        for (Object entry : (Collection) fieldValue) {
          if (isBuildable(entry)) {
            /**
             * Try to invoke the build method within the class instance. If
             * available this will copy transient SSRF data type serial numbers
             * into their respective reference containers.
             */
            invokeBuild(entry);
            /**
             * Recurse into the class instance.
             */
            build(entry, destinationInstance);
            /**
             * After recursion try adding the value to the destination (root
             * SSRF) instance.
             */
            addValueToDestinationInstance(entry, destinationInstance);
          }
        }
      } else {
        if (isBuildable(fieldValue)) {
          /**
           * Same process as above.
           */
          invokeBuild(fieldValue);
          build(fieldValue, destinationInstance);
          addValueToDestinationInstance(fieldValue, destinationInstance);
        }
      }
    }
    /**
     * This recursion branch is finished.
     */
    return destinationInstance;
  }

  /**
   * Add the object instance to the destination instance. This method tries to
   * find a "with" setter in the destination instance that accepts the source
   * object instance class type. If found the source object instance is added to
   * the destination object instance.
   * <p>
   * @param sourceInstance      the source object instance to add to the
   *                            destination object instance
   * @param destinationInstance the destination object instance to which the
   *                            source object instance is to be added
   */
  private static void addValueToDestinationInstance(Object sourceInstance, Object destinationInstance) {
    try {
      Method method = destinationInstance.getClass().getMethod("with" + sourceInstance.getClass().getSimpleName(), Collection.class);
      method.invoke(destinationInstance, Arrays.asList(new Object[]{sourceInstance}));
    } catch (NoSuchMethodException | SecurityException ex) {
    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
      //      Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex );
    }
  }

  /**
   * Test if the object instance class is buildable; that is, whether an attempt
   * to invoke the build() method should be made.
   * <p>
   * @param instance the object instance
   * @return true if the object class name matches classes that _might_
   *         implement the build() method.
   */
  private static boolean isBuildable(Object instance) {
    if (instance == null) {
      return false;
    }
    return instance.getClass().getName().startsWith("us.gov.dod.standard.ssrf")
      && !instance.getClass().getName().contains(".adapter.")
      && !instance.getClass().getName().contains(".metadata.");
  }

  /**
   * Try to invoke the build() method on the provided object instance. If the
   * object does not implement build() this method will fail gracefully.
   * <p>
   * @param instance the object instance
   */
  private static void invokeBuild(Object instance) {
    if (instance == null) {
      return;
    }
    try {
      Method buildMethod = instance.getClass().getMethod("build", null);
      System.out.println(instance.getClass().getSimpleName() + " invoking build()");
      buildMethod.invoke(instance, null);
    } catch (NoSuchMethodException | SecurityException ex) {
//              Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
//      Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

}
