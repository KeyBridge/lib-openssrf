/*
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.common.Remarks;
import us.gov.dod.standard.ssrf._3_1.location.Ellipse;
import us.gov.dod.standard.ssrf._3_1.location.Point;
import us.gov.dod.standard.ssrf._3_1.location.Polygon;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.multiple.ConfigFreq;
import us.gov.dod.standard.ssrf._3_1.receiver.Curve;
import us.gov.dod.standard.ssrf._3_1.ssreply.Comment;
import us.gov.dod.standard.ssrf._3_1.toa.Footnote;

/**
 * A collection of useful SSRF and JAXB Utility classes.
 * <p>
 * These methods help to assemble, validate, serialize and un-serialize object
 * representations to and from XML.
 * <p>
 * @author Jesse Caulfield
 * @version 1.0, 10/02/14
 * @since 3.1.0
 */
@SuppressWarnings({"unchecked"})
public class SSRFUtility {

  private static final Logger logger = Logger.getLogger(SSRFUtility.class.getName());

  /**
   * 33 characters. The maximum string length to be extracted from a class field
   * configuration and reported in an error message. String values longer than
   * this length are trimmed and a "..." suffix is added. This improves
   * readability while providing useful context to the user.
   */
  private static final int MAX_STRING_LENGTH = 33;

  /**
   * "us.gov.dod.standard.ssrf". The SSRF top level package.
   */
  private static final String SSRF_PACKAGE = "us.gov.dod.standard.ssrf";

  /**
   * A randomly seeded AtomicInteger used to provide guaranteed unique index
   * values for SSRF classes requiring an index.
   * <p>
   * This implementation provides a unique sequence of Integer values
   * incrementing from one (1).
   */
  private static final AtomicInteger atomicIndex = new AtomicInteger();

  /**
   * Get the next guaranteed unique index compatible with SSRF "idx" fields. *
   * The returned value is monotonically incremented by one from the previously
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
    /**
     * Index values are UN6 and must remain below 100,000. Reset the atomic
     * index counter to zero if the index value climbs above 10,000. This is
     * somewhat conservative, but we NEVER expect to see more than a few indices
     * in any given SSRF document.
     */
    if (atomicIndex.get() >= 1e4) {
      atomicIndex.set(0);
    }
    return new BigInteger(String.valueOf(Math.abs(atomicIndex.incrementAndGet())));
  }

  /**
   * Validate a SSRF object instance.
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
  public static void validate(Object instance) throws Exception {
    validate(instance, null);
  }

  /**
   * Validate a SSRF object instance. (internal, recursive)
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
   * @param cls      The parent (maximum) classification. If set all subordinate
   *                 classifications in the class tree must be less than or
   *                 equal to this value.
   * @throws java.lang.Exception if the SSRF instance fails to validate
   */
  @SuppressWarnings({"AssignmentToMethodParameter"})
  public static void validate(Object instance, ListCCL cls) throws Exception {
    /**
     * Assign the class type under study to a local variable for convenience.
     */
    Class<?> clazz = instance.getClass();
    /**
     * Important: NO NOT inspect classes that are not within the SSRF package.
     * Also and equally important: DO NOT inspect or try to validate enumerated
     * classes.
     */
    if (clazz.isEnum() || !clazz.getName().startsWith(SSRF_PACKAGE)) {
      return;
    }
    /**
     * Test the classification order. SSRF requires that subordinate objects
     * have a classification less than or equal to their parents.
     */
    Set<Field> fields = findDeclaredAndInheritedFields(clazz);
    if (cls != null) {
      for (Field field : fields) {
        if (field.getType().equals(ListCCL.class)) {
          field.setAccessible(true);
          if (cls.compareTo((ListCCL) field.get(instance)) < 0) {
            throw new Exception("Field classification \"" + field.get(instance) + "\" is less than parent \"" + cls + "\"");
          }
        }
      }
    } else {
      for (Field field : fields) {
        if (field.getType().equals(ListCCL.class)) {
          field.setAccessible(true);
          cls = (ListCCL) field.get(instance);
        }
      }
    }

    /**
     * Iterate through the list of declared fields (public, protected and
     * private) and inspect each according to its annotated configuration and
     * state.
     */
    for (Field field : fields) {
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
        for (Object entry : (Iterable<? extends Object>) fieldValue) {
          if (entry != null) {
            validate(entry, cls);
          }
        }
      } else {
        validate(fieldValue, cls);
        /**
         * After the field validation status is completed try to validate the
         * object instance configuration against an XmlTypeValidator, if
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
  public static Set<String> evaluate(Object instance) {
    return evaluate(instance, null, null, null, null);
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
  @SuppressWarnings({"AssignmentToMethodParameter"})
  private static Set<String> evaluate(Object instance, ListCCL cls, Object parentInstance, Field parentField, Set<String> messages) {
    /**
     * Initialize the messages collection if required. Use a TreeSet to
     * eliminate duplicates and provide a pretty-print output.
     */
    if (messages == null) {
      messages = new TreeSet<>();
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
    if (clazz.isEnum() || !clazz.getName().startsWith(SSRF_PACKAGE)) {
      return messages;
    }
    /**
     * Test the classification order. SSRF requires that subordinate objects
     * have a classification less than or equal to their parents.
     */
    Set<Field> fields = findDeclaredAndInheritedFields(clazz);
    if (cls != null) {
      for (Field field : fields) {
        if (field.getType().equals(ListCCL.class)) {
          try {
            field.setAccessible(true);
            if (cls.compareTo((ListCCL) field.get(instance)) < 0) {
              messages.add(parentInstance.getClass().getSimpleName() + "." + parentField.getName() + "." + field.getName() + " classification \"" + field.get(instance) + "\" is less restrictive than parent classification \"" + cls + "\"");
            }
          } catch (SecurityException | IllegalArgumentException | IllegalAccessException exception) {
            logger.log(Level.WARNING, "CLS comparison failed for {0}", instance.getClass().getSimpleName());
            logger.log(Level.SEVERE, null, exception);
          }
        }
      }
    } else {
      for (Field field : fields) {
        if (field.getType().equals(ListCCL.class)) {
          try {
            field.setAccessible(true);
            cls = (ListCCL) field.get(instance);
          } catch (SecurityException | IllegalArgumentException | IllegalAccessException exception) {
            logger.log(Level.WARNING, "CLS comparison failed for {0}", instance.getClass().getSimpleName());
            logger.log(Level.SEVERE, null, exception);
          }
        }
      }
    }
    /**
     * Iterate through the list of declared fields (public, protected and
     * private) and inspect each according to its annotated configuration and
     * state.
     */
    for (Field field : fields) {
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
        continue;
      }
      /**
       * Report an ERROR if the field is required and not configured.
       */
      if (isRequired(field) && fieldValue == null) {
        messages.add(parentInstance.getClass().getSimpleName() + "." + parentField.getName() + getErrorLabel(parentField, parentInstance) + " (" + field.getType().getSimpleName() + ") " + field.getName() + " is required");
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
        for (Object entry : (Iterable<? extends Object>) fieldValue) {
          if (entry != null) {
            evaluate(entry, cls, instance, field, messages);
          }
        }
      } else {
        evaluate(fieldValue, cls, instance, field, messages);
        /**
         * After the field validation status is completed try to validate the
         * object instance configuration against an XmlTypeValidator, if
         * present.
         */
        try {
          validateField(field, fieldValue);
        } catch (Exception exception) {
          /**
           * If there is a null pointer error then dump the output.
           */
          if (exception instanceof NullPointerException) {
            logger.log(Level.SEVERE, null, exception);
          }
//          logger.log(Level.WARNING, "{0}.{1} failed XML type validation: {2}", new Object[]{instance.getClass().getSimpleName(), field.getName(), exception.getMessage()});
//          messages.add(instance.getClass().getSimpleName() + "." + field.getName() + "  " + exception.getMessage());
          messages.add(parentInstance.getClass().getSimpleName() + "." + parentField.getName() + "." + field.getName() + " (" + instance.getClass().getSimpleName() + ") :  " + exception.getMessage());
        }
      }
    }
    return messages;
  }

  /**
   * Validate a field setting.
   * <p>
   * This method inspects the field annotation for an XmlTypeValidator. If found
   * then the XmlTypeValidator is instantiated and called against the provided
   * field value.
   * <p>
   * If no XmlTypeValidator annotation is found then the field value is assumed
   * to be valid.
   * <p>
   * If the field value is null then NO VALIDATION is done.
   * <p>
   * <p>
   * @param field      the class field
   * @param fieldValue the class field configured value
   * @throws Exception the XmlTypeValidator marshal error, thrown ONLY if the
   *                   field value is not valid
   */
  private static void validateField(Field field, Object fieldValue) throws Exception {
    /**
     * Do not validate fields with null values.
     */
    if (fieldValue == null) {
      return;
    }
    /**
     * Scan the field annotations looking for an XmlJavaTypeAdapter instance.
     */
    for (Annotation annotation : field.getAnnotations()) {
      if (annotation instanceof XmlJavaTypeAdapter) {
        /**
         * If an XmlJavaTypeAdapter annotation is found then instantiate the
         * XmlAdapter class referred to in the "value" field and attempt to
         * marshal the field value. This action will complete silently if the
         * field value is valid and throw an exception if the field value is not
         * valid (as determined by the marshal method).
         */
        try {
          XmlAdapter<Object, Object> adapterInstance = ((XmlJavaTypeAdapter) annotation).value().getConstructor().newInstance();
          adapterInstance.marshal(fieldValue);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
          logger.log(Level.WARNING, "XmlJavaTypeAdapter failed to instantiate: {0}", ex.getMessage());
          logger.log(Level.SEVERE, null, ex);
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
        return " \"" + trimString(fieldValue.toString(), MAX_STRING_LENGTH) + "\"";
      }
    } catch (IllegalArgumentException | IllegalAccessException ex) {
      Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
    }
    return "";
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
  public static Set<Field> findDeclaredAndInheritedFields(Class<?> clazz) {
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
  protected static Set<Method> findDeclaredAndInheritedMethods(Class<?> clazz) {
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
   * and {@link XmlElementRef} field annotation types marked as REQUIRED; also,
   * {@link XmlValue}.
   * <p>
   * @param field the field to inspect
   * @return TRUE if and only if the XML annotation is marked "required = true"
   */
  protected static boolean isRequired(Field field) {
    for (Annotation annotation : field.getAnnotations()) {
      if (annotation instanceof XmlAttribute) {
        return ((XmlAttribute) annotation).required();
      } else if (annotation instanceof XmlElement) {
        return ((XmlElement) annotation).required();
      } else if (annotation instanceof XmlElementRef) {
        return ((XmlElementRef) annotation).required();
      } else if (annotation instanceof XmlValue) {
        return true;
      }
    }
    return false;
  }

  /**
   * Inspect a class field and determine if it is TRANSIENT - e.g. should NOT be
   * processed .
   * <p>
   * This method looks for a {@link XmlTransient} field annotation.
   * <p>
   * @param field the field to inspect
   * @return TRUE if and only if the XML annotation is marked "required = true"
   */
  protected static boolean isTransient(Field field) {
    for (Annotation annotation : field.getAnnotations()) {
      if (annotation instanceof XmlTransient) {
        return true;
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
   * Process a SSRF instance object for export.
   * <p>
   * This method examines the class tree and copies all required data objects
   * into their proper location and prepares the SSRF destination instance for
   * export.
   * <p>
   * @param ssrf A SSRF working copy
   * @return The input SSRF instance after preparation. The live object is
   *         returned to support method chaining.
   */
  public static SSRF prepare(SSRF ssrf) {
    prepare(ssrf, null);
    return ssrf;
  }

  /**
   * Process a SSRF instance object for export (recursive, internal).
   * <p>
   * This method examines the class tree and copies all required data objects
   * into their proper location and prepares the SSRF destination instance for
   * export.
   * <p>
   * @param sourceInstance the current object instance to inspect
   * @param rootInstance   the root SSRF/SMADEF object instance into which the
   *                       source instance components are copied
   */
  @SuppressWarnings("AssignmentToMethodParameter")
  public static void prepare(Object sourceInstance, Object rootInstance) {
    /**
     * Return immediately if the source instance is null. Instantiate a new
     * destination instance if none is provided.
     */
    if (sourceInstance == null) {
      return;
    } else if (rootInstance == null) {
      rootInstance = sourceInstance;
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
    if (clazz.isEnum() || !clazz.getName().startsWith(SSRF_PACKAGE)) {
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
        fieldValue = field.get(sourceInstance);
      } catch (IllegalArgumentException | IllegalAccessException ex) {
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
        /**
         * To avoid a ConcurrentModificationException create a temporary list of
         * objects that are preparable then invoke prepare() on each instance in
         * turn.
         * <p>
         * If the instance does NOT implement prepare() then recurse into that
         * object, then try to add it to the SSRF ROOT.
         */
        Set<Object> preparablObjects = new HashSet<>();
        for (Object entryCandidate : (Iterable<? extends Object>) fieldValue) {
          /**
           * The fluent "WITH" setters tend to add null entries to various
           * collections. Skip and ignore all null collection entries.
           */
          if (entryCandidate == null) {
            continue;
          }
          /**
           * If the entry candidate implements the prepare() method then store
           * it for later processing. Else recurse into the candidate to examine
           * its components and try to add the candidate to the root instance.
           */
          if (implementsPrepare(entryCandidate)) {
            preparablObjects.add(entryCandidate);
          } else {
            prepare(entryCandidate, rootInstance); // recurse
            addValueToDestinationInstance(entryCandidate, rootInstance);
          }
        }
        /**
         * Now call and recurse into all of the preparable object instances
         * identified above.
         */
        for (Object preparableObject : preparablObjects) {
          /**
           * Try to invoke the prepare method within the class instance. If
           * available this will copy transient SSRF data type serial numbers
           * into their respective reference containers.
           */
          invokePrepare(preparableObject);
          /**
           * Recurse into the class instance.
           */
          prepare(preparableObject, rootInstance); // recurse
          /**
           * After recursion try adding the value to the destination (root SSRF)
           * instance.
           */
          addValueToDestinationInstance(preparableObject, rootInstance);
        }
      } else {
        /**
         * Same process as above except working on single instances and not
         * Collection entries. If the object instance implements prepare() then
         * invoke it.
         */
        if (implementsPrepare(fieldValue)) {
          invokePrepare(fieldValue);
        }
        prepare(fieldValue, rootInstance); // recurse
        addValueToDestinationInstance(fieldValue, rootInstance);
      }
    }
    /**
     * This recursion branch is finished.
     */
  }

  /**
   * Try to add the source object instance to the destination object instance.
   * <p>
   * This method tries to find a "with" setter in the destination instance that
   * accepts the source object instance class type. If found the source object
   * instance is added to the destination object instance.
   * <p>
   * @param commonInstance the source object instance to add to the destination
   *                       object instance. Ignored if does not extend
   *                       {@link Common}.
   * @param rootInstance   the {@link Common} root instance to which the source
   *                       object instance is to be added
   */
  private static void addValueToDestinationInstance(Object commonInstance, Object rootInstance) {
    /**
     * SchemaRoot only contains sets of object instances that extend Common.
     * Simplify and speed up processing by only trying to add SSRF object
     * instances to the ROOT instance (the SSRF message) that extend Common.
     * <p>
     * Important - This method should fail gracefully and silently: Catch a
     * NullPointerException here just in case the sourceInstance is null.
     */
    try {
      if (Common.class.equals(commonInstance.getClass().getSuperclass())) {
        Method method = rootInstance.getClass().getMethod("with" + commonInstance.getClass().getSimpleName(), Collection.class);
        method.invoke(rootInstance, Arrays.asList(new Object[]{commonInstance}));
//        System.out.println("SSRFUtility.addValueToDestinationInstance " + commonInstance.getClass().getSimpleName());
      }
    } catch (NullPointerException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
      logger.log(Level.WARNING, "Failed to add {0} value to SSRF root instance:  {1}", new Object[]{commonInstance.getClass().getSimpleName(), ex.getMessage()});
//      System.err.println("ERROR SSRFUtility.addValueToDestinationInstance " + commonInstance.getClass().getSimpleName() + "  " + ex.getMessage());
//      Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Test if the object instance class is preparable; that is, whether an
   * attempt to invoke the prepare() method should be made.
   * <p>
   * @param instance the object instance
   * @return true if the object class implements the prepare() method.
   */
  private static boolean implementsPrepare(Object instance) {
    if (instance == null) {
      return false;
    }
    String className = instance.getClass().getName();
    /**
     * Only inspect SSRF classes, but ignore ADAPTER and METADATA helpers.
     */
    if (className.startsWith(SSRF_PACKAGE)
        && !className.contains(".adapter.")
        && !className.contains(".metadata.")) {
      try {
        return instance.getClass().getMethod("prepare") != null;
      } catch (NoSuchMethodException | SecurityException ex) {
        /**
         * Does not implement prepare().
         */
//      Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    return false;
  }

  /**
   * Try to invoke the prepare() method on the provided object instance. If the
   * object does not implement prepare() this method will fail gracefully.
   * <p>
   * @param instance the object instance
   */
  private static void invokePrepare(Object instance) {
    if (instance == null) {
      return;
    }
    /**
     * Try to invoke the prepare() method. Fail gracefully if the instance class
     * does not implement the prepare() method.
     */
    try {
      instance.getClass().getMethod("prepare").invoke(instance);
    } catch (NoSuchMethodException | SecurityException ex) {
      /**
       * Does not implement prepare().
       */
    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
      /**
       * prepare() is not accessible (e.g. private).
       */
    }
  }

  /**
   * Process a SSRF instance object after reading from XML.
   * <p>
   * This method examines the class tree and copies all required data objects
   * into their proper location and preparing the SSRF software class hierarchy
   * for working.
   * <p>
   * @param ssrf a {@link SSRF} instance
   * @return The input SSRF instance after post-load. The live object is
   *         returned to support method chaining.
   */
  public static SSRF postLoad(SSRF ssrf) {
    postLoad(ssrf, ssrf);
    return ssrf;
  }

  /**
   * Process a SSRF instance object after reading from XML.
   * <p>
   * This method examines the class tree and copies all required data objects
   * into their proper location and preparing the SSRF software class hierarchy
   * for working.
   * <p>
   * @param sourceInstance any of SSRF data type object instance
   * @param rootInstance   a {@link SSRF} instance
   */
  @SuppressWarnings("AssignmentToMethodParameter")
  private static void postLoad(Object sourceInstance, SSRF rootInstance) {
    /**
     * Return immediately if the source instance is null. Instantiate a new
     * destination instance if none is provided.
     */
    if (sourceInstance == null) {
      return;
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
    if (clazz.isEnum() || !clazz.getName().startsWith(SSRF_PACKAGE)) {
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
        fieldValue = field.get(sourceInstance);
      } catch (IllegalArgumentException | IllegalAccessException ex) {
//        Logger.getLogger(SSRFUtility.class.getName()).log(Level.SEVERE, null, ex);
        continue;
      }
      /**
       * If the field value is not set then DO NOT try to test it.
       */
      if (fieldValue == null) {
        continue;
      }
      /**
       * If the field value object is a Collection then iterate through the
       * collection to recursively test each entry object instance, otherwise
       * recurse to test the field value object instance directly.
       */
      if (fieldValue instanceof Collection) {
        /**
         * To avoid a ConcurrentModificationException create a temporary list of
         * objects that are loadable then proceed to call each in turn.
         */
        Set<Object> loadableObjects = new HashSet<>();
        for (Object entryCandidate : (Iterable<? extends Object>) fieldValue) {
          if (implementsPostLoad(entryCandidate)) {
            loadableObjects.add(entryCandidate);
          }
        }
        /**
         * Now call and recurse into all of the preparable object instances.
         */
        for (Object loadable : loadableObjects) {
          /**
           * Try to invoke the postLoad method within the class instance. If
           * available this will sync SSRF data types serial numbers with their
           * respective reference containers.
           */
          invokePostLoad(loadable, rootInstance);
          /**
           * Recurse into the class instance.
           */
          postLoad(loadable, rootInstance);
          /**
           * After recursion try adding the value to the destination (root SSRF)
           * instance.
           */
        }
      } else {
        if (implementsPostLoad(fieldValue)) {
          /**
           * Same process as above.
           */
          invokePostLoad(fieldValue, rootInstance);
          postLoad(fieldValue, rootInstance);
        }
      }
    }
    /**
     * This recursion branch is finished.
     */
  }

  /**
   * Test if the object instance class is loadable; that is, whether an attempt
   * to invoke the postLoad(SSRF) or postLoad() method should be made.
   * <p>
   * @param instance the object instance
   * @return true if the object class implements the postLoad(SSRF) or
   *         postLoad() method.
   */
  private static boolean implementsPostLoad(Object instance) {
    if (instance == null) {
      return false;
    }
    String className = instance.getClass().getName();
    /**
     * Only inspect SSRF classes, but ignore ADAPTER and LIST helpers.
     */
    if (className.startsWith(SSRF_PACKAGE)
        && !className.contains(".adapter.")
        && !className.contains(".metadata.lists")) {
      try {
        return instance.getClass().getMethod("postLoad", SSRF.class) != null;
      } catch (NoSuchMethodException | SecurityException ex) {
        try {
          return instance.getClass().getMethod("postLoad") != null;
        } catch (NoSuchMethodException | SecurityException ex1) {
        }
      }
    }
    return false;
  }

  /**
   * Try to invoke the postLoad() method on the provided object instance. If the
   * object does not implement postLoad() this method will fail gracefully.
   * <p>
   * @param instance the object instance
   */
  private static void invokePostLoad(Object instance, SSRF rootInstance) {
    if (instance == null) {
      return;
    }
    /**
     * Try to invoke the postLoad(SSRF) or postLoad() methods. Fail gracefully
     * if the instance class does not implement the prepare() method.
     */
    try {
      instance.getClass().getMethod("postLoad", SSRF.class).invoke(instance, rootInstance);
    } catch (NoSuchMethodException | SecurityException ex) {
      try {
        instance.getClass().getMethod("postLoad").invoke(instance);
      } catch (NoSuchMethodException | SecurityException ex1) {
      } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex1) {
      }
    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
    }
  }

  /**
   * Assign a SSRF Properties configuration to a SSRF object instance.
   * <p>
   * This assigns default values declared in a SSRF configuration profile to a
   * SSRF configuration.
   * <p>
   * @param properties a SSRF properties configuration
   * @param instance   a SSRF object instance. The field type is a generic
   *                   object as this method calls itself recursively.
   */
  public static void setProperties(SSRFProperties properties, Object instance) {
    setProperties(properties, instance, "");
  }

  /**
   * Assign a SSRF Properties configuration to a SSRF object instance.
   * <p>
   * This assigns default values declared in a SSRF configuration profile to a
   * SSRF configuration.
   * <p>
   * @param properties a SSRF properties configuration
   * @param instance   a SSRF object instance. The field type is a generic
   *                   object as this method calls itself recursively.
   * @param classPath  the current dot-delimited classPath going into this
   *                   object instance
   */
  @SuppressWarnings("unchecked")
  private static void setProperties(SSRFProperties properties, Object instance, String classPath) {
    if (instance == null) {
      return;
    }
    /**
     * Assign the class type under study to a local variable for convenience.
     */
    Class<?> clazz = instance.getClass();
    /**
     * Append the object instance to the classPath.
     */
    String classPathInternal = classPath + "." + clazz.getSimpleName();
    /**
     * Important: NO NOT inspect classes that are not within the SSRF package.
     * Also and equally important: DO NOT inspect or try to validate enumerated
     * classes.
     */
    if (clazz.isEnum() || !clazz.getName().startsWith(SSRF_PACKAGE)) {
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
       * Try to recurse into the configured field value. Get the instance field
       * value. Skip (do not check and fail gracefully) if the field value is
       * null (e.g. not configured) or (somehow) not accessible.
       */
      Object fieldValue;
      try {
        fieldValue = field.get(instance);
      } catch (IllegalArgumentException | IllegalAccessException ex) {
        continue;
      }
      /**
       * If the field value is not set then inspect the properties to determine
       * if a user-defined setting exists for this field.
       * <p>
       * Special condition: Default values may be overwritten (only) in class
       * type TSerial.
       */
      if (fieldValue == null || clazz.getSimpleName().equals("TSerial")) {
        /**
         * First try to get the most specific property value possible (e.g.
         * "SSRF.Contact.TSerial.organisation"). If none is found then look for
         * a less specific, class level value (e.g. "TSerial.organisation"). If
         * a configured property is found for the classPath (or class) and the
         * current field try to set the value using the WITH setter.
         */
        String propertyValue = properties.getProperty(classPathInternal.replaceFirst("\\.", ""), field.getName());
        if (propertyValue == null) {
          propertyValue = properties.getProperty(clazz, field);
        }
        if (propertyValue != null) {
          /**
           * Get the SET setter.
           */
          Method method = findSetMethod(clazz, field);
//          if (method == null) {            method = findSetMethod(clazz, field);          }
          if (method != null && method.getParameterTypes().length != 0) {
            Class<?> paramType = method.getParameterTypes()[0];
            /**
             * Handle the case where the class is an enumerated type.
             */
            Object objectValue;
            if (paramType.isEnum()) {
              objectValue = Enum.valueOf((Class<Enum>) paramType, propertyValue);
            } else {
              objectValue = propertyValue;
            }
            /**
             * Try to invoke the SET setter with the user-defined properties
             * configuration (either an ENUM or String). Ignore all errors to
             * fail gracefully.
             */
            try {
              method.invoke(instance, objectValue);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
              logger.log(Level.SEVERE, "Failed to set SSRF property {0} as {1}:  {2}",
                         new Object[]{field, objectValue, ex.getMessage()});
            }
          }
        } else {
          /**
           * If the field is null and no SSRF Property is configured for this
           * field then skip it.
           */
          continue;
        }
      }
      /**
       * If the field value object is a Collection then iterate through the
       * collection to recursively set each entry object instance, otherwise
       * recurse to set the field value object instance directly.
       */
      if (fieldValue instanceof Collection) {
        for (Object entry : (Iterable<? extends Object>) fieldValue) {
          setProperties(properties, entry, classPathInternal);
        }
      } else {
        setProperties(properties, fieldValue, classPathInternal);
      }
    }
  }

  /**
   * Helper method to inspect the indicated Class to find the first declared or
   * inherited WITH setter method for the indicated field type.
   * <p>
   * This method supports
   * {@link #setProperties(SSRFProperties, java.lang.Object)}.
   * <p>
   * @param clazz the class type to inspect
   * @param field the field to look for
   * @return a WITH setter method, if present
   */
  protected static Method findWithMethod(Class<?> clazz, Field field) {
    /**
     * Push all names to lower case to perform a case-insensitive search.
     */
    for (Method method : findDeclaredAndInheritedMethods(clazz)) {
      if (method.getName().toLowerCase().startsWith("with" + field.getName().toLowerCase())) {
        return method;
      }
    }
    return null;
  }

  /**
   * Helper method to inspect the indicated Class to find the declared or
   * inherited WITH setter method for the indicated field type that accepts a
   * SET.
   * <p>
   * This method supports
   * {@link #setProperties(SSRFProperties, java.lang.Object)}.
   * <p>
   * @param clazz the class type to inspect
   * @param field the field to look for
   * @return a WITH setter method, if present
   */
  protected static Method findWithCollectionMethod(Class<?> clazz, Field field) {
    /**
     * Push all names to lower case to perform a case-insensitive search.
     */
    Set<Method> methods = new HashSet<>();
    for (Method method : findDeclaredAndInheritedMethods(clazz)) {
      if (method.getName().toLowerCase().startsWith("with" + field.getName().toLowerCase())
          && Arrays.asList(method.getParameterTypes()).contains(Collection.class)) {
        methods.add(method);
      }
    }
    for (Method method : methods) {
      for (Class<?> parameterType : method.getParameterTypes()) {
        if (parameterType.isEnum()) {
          return method;
        }
      }
    }
    return !methods.isEmpty() ? methods.toArray(new Method[methods.size()])[0] : null;
//    return null;
  }

  /**
   * Helper method to inspect the indicated Class to find the declared or
   * inherited WITH setter method for the indicated field type that accepts a
   * SET.
   * <p>
   * This method supports
   * {@link #setProperties(SSRFProperties, java.lang.Object)}.
   * <p>
   * @param clazz the class type to inspect
   * @param field the field to look for
   * @return a WITH setter method, if present
   */
  protected static Method findWithEnumMethod(Class<?> clazz, Field field) {
    /**
     * Push all names to lower case to perform a case-insensitive search.
     */
    for (Method method : findDeclaredAndInheritedMethods(clazz)) {
      if (method.getName().toLowerCase().startsWith("with" + field.getName().toLowerCase())) {
        for (Class<?> parameterType : method.getParameterTypes()) {
          if (parameterType.isEnum()) {
            return method;
          }
        }
      }
    }
    return findWithMethod(clazz, field);
  }

  /**
   * Helper method to inspect the indicated Class to find the first declared or
   * inherited SET setter method for the indicated field type.
   * <p>
   * @param clazz the class type to inspect
   * @param field the field to look for
   * @return a SET setter method, if present
   */
  protected static Method findSetMethod(Class<?> clazz, Field field) {
    /**
     * Push all names to lower case to perform a case-insensitive search.
     */
    for (Method method : findDeclaredAndInheritedMethods(clazz)) {
      if (method.getName().toLowerCase().startsWith("set" + field.getName().toLowerCase())) {
        return method;
      }
    }
    return null;
  }

  /**
   * Helper method to inspect the indicated Class to find the first declared or
   * inherited GET setter method for the indicated field type.
   * <p>
   * @param clazz the class type to inspect
   * @param field the field to look for
   * @return a SET setter method, if present
   */
  protected static Method findGetMethod(Class<?> clazz, Field field) {
    /**
     * Push all names to lower case to perform a case-insensitive search.
     */
    for (Method method : findDeclaredAndInheritedMethods(clazz)) {
      if (method.getName().toLowerCase().startsWith("get" + field.getName().toLowerCase())) {
        return method;
      }
    }
    return null;
  }

  /**
   * Marshal an entity class into a XML String representation.
   * <p/>
   * The output of this method is typically either written to a file or sent via
   * a SOAP communication link.
   * <p/>
   * @param <T>   the entity class type
   * @param clazz the entity class to be written
   * @return the entity class serialized into XML form
   * @throws JAXBException if the entity class cannot be marshaled (serialized)
   */
  public static <T> String marshal(T clazz) throws JAXBException {
    JAXBContext jaxbContext = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class<?>[]{clazz.getClass()}, null, null);
//    JAXBContext jaxbContext = org.eclipse.persistence.jaxb.JAXBContext.newInstance(clazz.getClass());
    Marshaller marshaller = jaxbContext.createMarshaller();
    /**
     * Add newlines to the output. This helps visually inspect the output.
     */
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    StringWriter stringWriter = new StringWriter();
    marshaller.marshal(clazz, stringWriter);
    return stringWriter.toString();
  }

  /**
   * Parse an XML file into a container class. This method calls the JAXB
   * un-marshaler and returns a class containing all of the content defined in
   * the XML file.
   * <p/>
   * @param <T>   the class type to be returned
   * @param xml   the XML source content
   * @param clazz the parsed and populated class type; this is the same as the
   *              class type that is returned
   * @return the XML source file parsed into the identified class type
   * @throws JAXBException if the XML source file does not match the input class
   *                       type
   */
  public static <T> T unmarshal(String xml, Class<T> clazz) throws JAXBException {
    Unmarshaller unmarshaller = JAXBContext.newInstance(clazz).createUnmarshaller();
    return clazz.cast(unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes())));
  }

}
