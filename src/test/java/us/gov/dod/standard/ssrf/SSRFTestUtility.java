/*
 * Copyright 2015 OpenSSRF.org.
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

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import us.gov.dod.standard.ssrf._3_1.Contact;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 *
 * @author jesse
 */
public class SSRFTestUtility {

  private static final Logger logger = Logger.getLogger(SSRFTestUtility.class.getName());

  /**
   * "us.gov.dod.standard.ssrf". The SSRF top level package.
   */
  private static final String SSRF_PACKAGE = "us.gov.dod.standard.ssrf";

  /**
   * Recursively populate the Object instance with the minimum required
   * configuration.
   * <p>
   * This method inspects the object instance annotations and recursively
   * populates those fields annotated as required.
   * <p>
   * @param instance the (top-level) object instance
   * @throws Exception on error
   */
  public static void fill(Object instance, boolean maximum) throws Exception {
    if (instance == null) {
      return;
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
      System.err.println("ENUM OR NON_SSRF " + clazz.getSimpleName() + " skipping ...");
      return;
    }

    System.out.println(">>> ----------------- " + clazz.getSimpleName());

    Set<Field> fields = SSRFUtility.findDeclaredAndInheritedFields(clazz);

    // print the field name
//    for (Field field : fields) {      System.out.println("  FIELD " + clazz.getSimpleName() + " : " + field.getName());    }
    /**
     * Iterate through the list of declared fields (public, protected and
     * private) and populate each according to its annotated configuration.
     */
    for (Field field : fields) {
      /**
       * Important: Enable access to the Object instance fields (public,
       * protected and private).
       */
      field.setAccessible(true);
      /**
       * Populate if the field is required.
       */
      if ((SSRFUtility.isRequired(field) || maximum) && !SSRFUtility.isTransient(field)) {
        System.out.println("  FIELD " + clazz.getSimpleName() + " : " + field.getName());
        /**
         * Get the field class type.
         */
        Class<?> c = field.getType();
        /**
         * If the field is a SET then recursively instantiate a new instance of
         * the Set type and add that type to the set.
         */
        if (c.equals(Set.class)) {
          /**
           * The field is a SET. Inspect the WITH setter to identify the
           * preferred object type for this field.
           */
          Object fieldInstance = getFillSet(clazz, field, maximum);

          field.set(instance, fieldInstance);
//
        } else {
          /**
           * The field is a single instance.
           */
          Object fillObject = getFillObject(clazz, field);
          /**
           * Try to populate the field.
           */
          if (fillObject != null) {
            /**
             * The field was easily populated: it either had an annotation or
             * was another object.
             */
            field.set(instance, fillObject);
          } else {
            /**
             * The field is not easily accommodated and must be examined
             * further. It is either a serial number reference or an enumerated
             * type.
             */
            String fieldClassName = field.getType().toString().replace("class ", "").trim();
            Class<?> fieldClass = Class.forName(fieldClassName);
            if (fieldClass.equals(TSerial.class)) {
              System.out.println("  TSerial " + field.getName() + "  skipping ...");
              continue;
            }
            /**
             * Handle the case where the class is an enumerated type.
             */
            Object fieldInstance = null;
            if (fieldClass.isEnum()) {
              /**
               * If the field class is an enumerated instance then get a random
               * enumerated value.
               */
              fieldInstance = fieldClass.getEnumConstants()[new Random().nextInt(fieldClass.getEnumConstants().length)];
            } else {
              /**
               * Otherwise get a new instance of the class object.
               */
              try {
                fieldInstance = fieldClass.getConstructor().newInstance();
              } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException noSuchMethodException) {
              }
            }
            /**
             * RECURSE: Call fill on the new instance, then add it to the set by
             * calling invoke on the setter method with a new HashHet.
             */
            if (fieldInstance != null) {
              SSRFTestUtility.fill(fieldInstance, maximum);
              field.set(instance, fieldInstance);
            }
//            System.out.println("    set " + clazz.getSimpleName() + "." + field.getName() + " to instance " + fieldInstance);
          }
        }
      }
    }
    System.out.println("<<< ----------------- " + clazz.getSimpleName());
  }

  /**
   * Inspect the field class type and annotations to generate a SET fill value.
   * <p>
   * @param clazz
   * @param field
   * @param maximum
   * @return
   * @throws ClassNotFoundException
   * @throws Exception
   */
  private static Object getFillSet(Class<?> clazz, Field field, boolean maximum) throws ClassNotFoundException, Exception {
    /**
     * Look for a WITH method to try setting the field with the preferred type.
     */
    Method with = SSRFUtility.findWithSetMethod(clazz, field);
    Type type;
    if (with != null) {
      /**
       * Returns an array of Type objects that represent the formal parameter
       * types, in declaration order, of the method represented by this Method
       * object. Returns an array of length 0 if the underlying method takes no
       * parameters. If a formal parameter type is a parameterized type, the
       * Type object returned for it must accurately reflect the actual type
       * parameters used in the source code.
       */
      type = with.getGenericParameterTypes()[0];
    } else {
      /**
       * Get the Parameterized Type object that represents the declared type for
       * the field represented by this Field object. For SSRF sets the Type is a
       * parameterized type and the Type object identifies the actual type
       * parameters used in the source code.
       */
      type = field.getGenericType();
    }
    /**
     * Get the (only) Type objects representing the actual type argument.
     */
    Type fieldType = ((ParameterizedTypeImpl) type).getActualTypeArguments()[0];
    /**
     * The fieldType is a (very) generic Type and apparently cannot be used to
     * instantiate an instance. Instead use its name, which must be processed to
     * strip the 'class ' prefix that Java classes prepend in the default
     * toString.
     */
    String fieldClassName = fieldType.toString().replace("class ", "").trim();
    Class<?> fieldClass = Class.forName(fieldClassName);

    /**
     * Handle the case where the class is an enumerated type.
     */
    Object fieldInstance = null;
    if (fieldClass.isEnum()) {
      /**
       * If the field class is an enumerated instance then get a random
       * enumerated value.
       */
      fieldInstance = fieldClass.getEnumConstants()[new Random().nextInt(fieldClass.getEnumConstants().length)];
//    } else if (fieldType.equals(TSerial.class)) {      fieldInstance = new ChannelPlan().getSerial();
    } else if (fieldType.equals(BigInteger.class)) {
      fieldInstance = new BigInteger(String.valueOf(new Random().nextInt(1024)));
    } else {
      /**
       * Otherwise get a new instance of the class object.
       */
      try {
        fieldInstance = fieldClass.getConstructor().newInstance();
      } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException noSuchMethodException) {
      }
    }
    /**
     * RECURSE: Call fill on the new instance, then add it to the set by calling
     * invoke on the setter method with a new HashHet.
     */
    if (fieldInstance != null) {
      SSRFTestUtility.fill(fieldInstance, maximum);
      try {
        return new HashSet<>(Arrays.asList(new Object[]{fieldInstance}));
//        field.set(instance, tempSet);
//            System.out.println("    set " + clazz.getSimpleName() + "." + field.getName() + " to " + tempSet);
//            SSRFUtility.findWithSetMethod(clazz, field).invoke(instance, tempSet);
      } catch (Exception exception) {
        logger.log(Level.SEVERE, "Failed to invoke setter on {0} {1}: {2} ",
                   new Object[]{SSRFUtility.findWithSetMethod(clazz, field), fieldClass, exception.getMessage()});
      }
    }
    logger.log(Level.SEVERE, "Failed to build Set on {0} {1}: {2} ",
               new Object[]{SSRFUtility.findWithSetMethod(clazz, field), fieldClass});
    return null;
  }

  /**
   * Inspect the field class type and annotations to generate a fill value.
   * <p>
   * @param field the field to inspect
   * @return a minimum fill value
   * @throws Exception on error
   */
  private static Object getFillObject(Class<?> clazz, Field field) throws Exception {
//    System.out.println("DEBUG getFillValue for " + field.getDeclaringClass().getSimpleName() + " " + field.getName());
    /**
     * Set all CLS to U for testing.
     */
    if (field.getName().equals("cls")) {
      return ListCCL.UNCLASSIFIED;
    }

    /**
     * Look for a WITH method to try setting the field with the preferred type.
     */
//    System.out.println("  " + field.getType() + "  " + field.getDeclaringClass().getSimpleName() + " " + field.getName() + "  ");
    Class<?> type = field.getType();

    if (type.equals(String.class)) {
      /**
       * If the field is a TString then inspect the WITH setter to determine if
       * the field expects an enumerated input.
       */
      Object enumInstance = getEnumEntry(field.getDeclaringClass(), field);
      return enumInstance != null ? enumInstance : getTestString(32, 32);
    } else if (type.equals(TString.class)) {
      /**
       * If the field is a TString then inspect the WITH setter to determine if
       * the field expects an enumerated input.
       */
      Object enumInstance = getEnumEntry(field.getDeclaringClass(), field);
      return enumInstance != null
             ? new TString(enumInstance.toString())
             : new TString(getTestString(32, 32));
    } else if (type.equals(BigDecimal.class)) {
      return new BigDecimal(new Random().nextInt(1024000) * new Random().nextDouble());
    } else if (type.equals(BigInteger.class)) {
      return new BigInteger(String.valueOf(new Random().nextInt(1024)));
    } else if (type.equals(Double.class)) {
      return new Double(new Random().nextInt(1024000) * new Random().nextDouble());
    } else if (type.equals(TDate.class)) {
      return new TDate(Calendar.getInstance());
    } else if (type.equals(TDateTime.class)) {
      return new TDateTime(Calendar.getInstance());
    } else if (type.isEnum()) {
      String fieldClassName = type.toString().replace("class ", "").trim();
      Class<?> fieldClass = Class.forName(fieldClassName);
      return fieldClass.getEnumConstants()[new Random().nextInt(fieldClass.getEnumConstants().length)];
    }

    /**
     * Scan the field annotations looking for an XmlJavaTypeAdapter instance.
     */
    for (Annotation annotation : field.getAnnotations()) {
      if (annotation instanceof XmlTypeValidator) {
//        System.out.println("getFillValue  " + field.getType() + "  " + field.getDeclaringClass().getSimpleName() + " " + field.getName() + " with annotation ");
        /**
         * If an XmlJavaTypeAdapter annotation is found then instantiate the
         * XmlAdapter class referred to in the "value" field and attempt to
         * marshal the field value. This action will complete silently if the
         * field value is valid and throw an exception if the field value is not
         * valid (as determined by the marshal method).
         */
        try {
          type = ((XmlTypeValidator) annotation).type();
          XmlAdapter adapter = ((XmlTypeValidator) annotation).value().getConstructor().newInstance();

          if (adapter instanceof AXmlAdapterNumber) {
            Number value = getTestNumber(((AXmlAdapterNumber) adapter).getMaxValue(),
                                         ((AXmlAdapterNumber) adapter).getMinValue());
            /**
             * Try to build a new number. If that fails try with the string
             * value, which is required for BigInteger, BigDecimal, etc.
             */
            try {
              return type.getConstructor(Number.class).newInstance(value);
            } catch (Exception exception) {
              return type.getConstructor(String.class).newInstance(value.toString());
            }
          } else if (adapter instanceof AXmlAdapterTNumber) {
            Number value = getTestNumber(((AXmlAdapterTNumber) adapter).getMaxValue(),
                                         ((AXmlAdapterTNumber) adapter).getMinValue());
            /**
             * Try to build a new number. If that fails try with the string
             * value, which is required for BigInteger, BigDecimal, etc.
             */
            try {
              return type.getConstructor(Number.class).newInstance(value);
            } catch (Exception exception) {
              return type.getConstructor(String.class).newInstance(value.toString());
            }
          } else if (adapter instanceof AXmlAdapterString) {
            /**
             * If the field is a TString then inspect the WITH setter to
             * determine if the field expects an enumerated input.
             */
            String value = getTestString(((AXmlAdapterString) adapter).getMaxLength(),
                                         ((AXmlAdapterString) adapter).getMinLength());
            return type.getConstructor(String.class).newInstance(value);
          } else if (adapter instanceof AXmlAdapterTString) {
            String value = getTestString(((AXmlAdapterTString) adapter).getMaxLength(),
                                         ((AXmlAdapterTString) adapter).getMinLength());
            return type.getConstructor(String.class).newInstance(value);
          } else if (adapter instanceof XmlAdapterDATE) {
            return type.getConstructor(Calendar.class).newInstance(Calendar.getInstance());
          } else if (adapter instanceof XmlAdapterDATETIME) {
            return type.getConstructor(Calendar.class).newInstance(Calendar.getInstance());
          } else if (adapter instanceof XmlAdapterSERIAL) {
            /**
             * If the field has an XmlAdapterSERIAL then inspect the field name.
             * <p>
             * If the name is NOT 'serial' then assume the field is a reference
             * and provide a (bogus) temporary serial number. Otherwise the
             * (serial) field should be ignored.
             */
            if (!"serial".equals(field.getName())) {
              return new Contact().getSerial();
            } else {
              System.out.println("NOOP for serial field " + field.getName());
              return null;
            }
          } else {
            System.err.println("UNKNOWN annotation " + field.getType() + "  " + field.getDeclaringClass().getSimpleName() + " : " + field.getName() + "  ");
          }

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
          logger.log(Level.WARNING, "XmlValidator failed to instantiate for field {0}: {1}", new Object[]{field, ex.getMessage()});
          logger.log(Level.SEVERE, null, ex);
        }
      }
    }

    /**
     * Assume the field is an object type. Return NULL to indicate to the
     * calling method that it should try to instantiate and populate a new
     * object instance.
     */
//    System.out.println("  NULL FILL for " + field);
    return null;
  }

  private static Object getEnumEntry(Class<?> type, Field field) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    /**
     * Inspect the WITH setter to determine if the field expects an enumerated
     * input.
     */
    Method with = SSRFUtility.findWithEnumMethod(type, field);
    if (with != null) {
      for (Class<?> parameterType : with.getParameterTypes()) {
//        System.out.println("getEnumEntry  " + field.getName() + " looking for an enumerated input of type " + parameterType);
        if (parameterType.isEnum()) {
//          System.out.println("  " + type.getSimpleName() + " : " + field.getName() + " type " + parameterType + " is an ENUM");
          String fieldClassName = parameterType.toString().replace("class ", "").trim();
          Class<?> fieldClass = Class.forName(fieldClassName); // throws ClassNotFoundException
//            System.out.println("  " + field.getName() + " expect an enumerated input of type " + fieldClassName);
          Enum fieldInstance = (Enum) fieldClass.getEnumConstants()[new Random().nextInt(fieldClass.getEnumConstants().length)];
//          System.out.println("  " + field.getName() + " expect an enumerated input of type " + fieldClassName + " returning " + fieldInstance);

          XmlEnumValue xmlEnumValue = fieldInstance.getClass().getAnnotation(XmlEnumValue.class);
          if (xmlEnumValue != null) {
            return xmlEnumValue.value();
          }

          for (Method method : fieldClass.getDeclaredMethods()) {
            if (method.getName().equals("value")) {
              return method.invoke(fieldInstance);
            }
          }
          return fieldInstance.name();
        }
//        else {          System.out.println("  " + type.getSimpleName() + " : " + field.getName() + " type " + parameterType + " is NOT ENUM");        }
      }
    }
    /**
     * No enumerated instance found. Return null.
     */
    return null;
  }

  /**
   * Get a TEST value. This is useful only for testing.
   * <p>
   * @return
   */
  private static Number getTestNumber(Number max, Number min) {
    Number maxValue = max != null ? max : 1024.0;
    Number minValue = min != null ? min : 0.0;

    for (int i = 0; i < 1000; i++) {
      int candidate = new Random().nextInt(maxValue.intValue());
      if (candidate <= maxValue.intValue() && candidate >= minValue.intValue()) {
        return candidate;
      }
    }
    System.err.println("ERROR getTestNumber timeout for " + max + "/" + min);
    return 0.0;
  }

  /**
   * Get a TEST value. This is useful only for testing.
   * <p>
   * @return
   */
  private static String getTestString(Integer maxLength, Integer minLength) {
    int lengthMin = minLength != null ? minLength : new Random().nextInt(8);
    int lengthMax = maxLength != null ? maxLength : minLength + new Random().nextInt(64);

//    String text = loadText();
//    if (text != null) {
//      /**
//       * Generate a random offset so that the text substring will be somewhat
//       * randomly unique.
//       */
//      int start = new Random().nextInt(text.length() - lengthMax);
//      String candidate = text.substring(start, start + lengthMax);
//      if (candidate.length() < lengthMin) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <= lengthMin; i++) {
//          sb.append("#");
//        }
//        return sb.toString();
//      } else {
//        return candidate;
//      }
//    }
    /**
     * Finally, if the text fails to load then build a placeholder.
     */
    StringBuilder sb = new StringBuilder();
    for (int i = lengthMin; i <= lengthMax; i++) {
      sb.append("#");
    }
    return sb.toString();
  }

  private static String loadText() {
    try {
      URL resource = SSRFTestUtility.class.getClassLoader().getResource("text/lorem-ipsum.txt");
      String text = new String(Files.readAllBytes(Paths.get(resource.toURI())));
      return text;
    } catch (IOException | URISyntaxException ex) {
      Logger.getLogger(SSRFTestUtility.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

}
