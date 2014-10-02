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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
   * Validate a SSRF Object instance.
   * <p>
   * This method recursively validates the provided object instance and all of
   * its components.
   * <p>
   * The validation procedure ensures that all required fields are set and that
   * all configured fields contain valid data according to the SSRF data
   * formatting rules.
   * <p>
   * It is expected that this method will only be called on the top-level SSRF
   * class. However it will just as easily validate any SSRF data type.
   * <p>
   * If the object instance is NOT valid call
   * {@link #getErrorMessages(java.lang.Object)} to retrieve a list of
   * validation errors.
   * <p>
   * @param instance the object instance to validate
   * @return TRUE the object instance validates OK; otherwise FALSE.
   */
  public static boolean isValid(Object instance) {
    return validate(instance, null, null, null).isEmpty();
  }

  /**
   * Validate a SSRF Object instance.
   * <p>
   * This method recursively validates the provided object instance and all of
   * its components.
   * <p>
   * The validation procedure ensures that all required fields are set and that
   * all configured fields contain valid data according to the SSRF data
   * formatting rules.
   * <p>
   * It is expected that this method will only be called on the top-level SSRF
   * class. However it will just as easily validate any SSRF data type.
   * <p>
   * @param instance the object instance to validate
   * @return a non-null Collection of error messages. The collection is EMPTY if
   *         the object instance validates OK.
   */
  public static Collection<String> getErrorMessages(Object instance) {
    return validate(instance, null, null, null);
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
  private static Collection<String> validate(Object instance, Object parentInstance, Field parentField, Collection<String> messages) {
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
    if (instance.getClass().isEnum() || !clazz.getName().startsWith("us.gov.dod.standard.ssrf")) {
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
            validate(entry, instance, field, messages);
          }
        }
      } else {
        validate(fieldValue, instance, field, messages);
        /**
         * After the field validation status is completed try to validate the
         * object instance configuration against an XmlJavaTypeAdapter, if
         * present.
         */
        try {
          validateField(field, fieldValue);
        } catch (Exception exception) {
//          System.err.println(instance.getClass().getSimpleName() + "." + field.getName() + " " + exception.getMessage());
          messages.add(instance.getClass().getSimpleName() + "." + field.getName() + " " + exception.getMessage());
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
   * @return a non-null {@link HashSet} instance
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

}
