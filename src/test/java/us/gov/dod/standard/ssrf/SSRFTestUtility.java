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
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import us.gov.dod.standard.ssrf._3_1.adapter.*;

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

  public static void minfill(Object instance) throws Exception {
    System.out.println("------------------------ DEBUG MINFILL " + instance.getClass());

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

    Set<Field> fields = SSRFUtility.findDeclaredAndInheritedFields(clazz);
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
      if (SSRFUtility.isRequired(field)) {
        /**
         * Get the field class type.
         */
        Class<?> c = field.getType();
        /**
         * If the field is a SET then recursively instantiate a new instance of
         * the Set type and add that type to the set.
         */
        if (c.equals(Set.class)) {
//          Method getter = SSRFUtility.findGetMethod(clazz, field);          getter.invoke(instance);
//          System.out.println("  " + field + " generic type is " + field.getGenericType());
          /**
           * Get the Parameterized Type object that represents the declared type
           * for the field represented by this Field object. For SSRF sets the
           * Type is a parameterized type and the Type object identifies the
           * actual type parameters used in the source code.
           */
          ParameterizedTypeImpl type = (ParameterizedTypeImpl) field.getGenericType();
          /**
           * Get the (only) Type objects representing the actual type argument.
           */
          Type fieldType = type.getActualTypeArguments()[0];
          /**
           * The fieldType is a (very) generic Type and apparently cannot be
           * used to instantiate an instance. Instead use its name, which must
           * be processed to strip the 'class ' prefix that Java classes prepend
           * in the default toString.
           */
          String fieldClassName = fieldType.toString().replace("class ", "").trim();
          Class<?> fieldClass = Class.forName(fieldClassName);
          Object fieldInstance = fieldClass.getConstructor().newInstance();
          /**
           * RECURSE: Call minfill on the new instance, then add it to the set
           * by calling invoke on the setter method with a new HashHet.
           */
          minfill(fieldInstance);
          Set tempSet = new HashSet<>(Arrays.asList(new Object[]{fieldInstance}));
          Method withMethod = SSRFUtility.findWithSetMethod(clazz, field);
          try {
            withMethod.invoke(instance, tempSet);
//            SSRFUtility.findWithMethod(clazz, field).invoke(instance, tempSet);
          } catch (Exception exception) {
            logger.log(Level.SEVERE, "Failed to invoke setter on {0} {1}: {2} ",
                       new Object[]{withMethod, fieldClass, exception.getMessage()});
          }
        } else {
          Object minFill = getMinfill(field);
          /**
           * Try to populate the field.
           */
          if (minFill != null) {
            field.set(instance, getMinfill(field));
          }
        }
      }
    }
  }

  private static Object getMinfill(Field field) throws Exception {
    /**
     * Scan the field annotations looking for an XmlJavaTypeAdapter instance.
     */
    for (Annotation annotation : field.getAnnotations()) {
      if (annotation instanceof XmlTypeValidator) {
        /**
         * If an XmlJavaTypeAdapter annotation is found then instantiate the
         * XmlAdapter class referred to in the "value" field and attempt to
         * marshal the field value. This action will complete silently if the
         * field value is valid and throw an exception if the field value is not
         * valid (as determined by the marshal method).
         */
        try {
          Class<?> type = ((XmlTypeValidator) annotation).type();

          @SuppressWarnings("unchecked")
          XmlAdapter anInstance = ((XmlTypeValidator) annotation).value().getConstructor().newInstance();
          System.out.println("field " + field.getName() + " has xmladapter type " + anInstance.getClass().getSimpleName());

          if (anInstance instanceof AXmlAdapterNumber) {
            Number value = getTestNumber(((AXmlAdapterNumber) anInstance).getMaxValue(),
                                         ((AXmlAdapterNumber) anInstance).getMinValue());
            return type.getConstructor(Number.class).newInstance(value);
          } else if (anInstance instanceof AXmlAdapterTNumber) {
            Number value = getTestNumber(((AXmlAdapterTNumber) anInstance).getMaxValue(),
                                         ((AXmlAdapterTNumber) anInstance).getMinValue());
            return type.getConstructor(Number.class).newInstance(value);
          } else if (anInstance instanceof AXmlAdapterString) {
            String value = getTestString(((AXmlAdapterString) anInstance).getMaxLength(),
                                         ((AXmlAdapterString) anInstance).getMaxLength());
            return type.getConstructor(String.class).newInstance(value);
          } else if (anInstance instanceof AXmlAdapterTString) {
            String value = getTestString(((AXmlAdapterTString) anInstance).getMaxLength(),
                                         ((AXmlAdapterTString) anInstance).getMaxLength());
            return type.getConstructor(String.class).newInstance(value);
          } else if (anInstance instanceof XmlAdapterDATE) {
            return type.getConstructor(Calendar.class).newInstance(Calendar.getInstance());
          } else if (anInstance instanceof XmlAdapterDATETIME) {
            return type.getConstructor(Calendar.class).newInstance(Calendar.getInstance());
          } else if (anInstance instanceof XmlAdapterSERIAL) {
            /**
             * NO OP.
             */
            System.out.println(" serial noOP " + field.getName());
          }

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
          logger.log(Level.WARNING, "XmlValidator failed to instantiate: {0}", ex.getMessage());
          logger.log(Level.SEVERE, null, ex);
        }
      }
    }

    return null;
  }

  /**
   * Get a TEST value. This is useful only for testing.
   * <p>
   * @return
   */
  private static Number getTestNumber(Number maxRange, Number minRange) {
    while (true) {
      int candidate = new Random().nextInt(maxRange.intValue());
      if (candidate <= maxRange.intValue() && candidate >= minRange.intValue()) {
        return candidate;
      }
    }
  }

  /**
   * Get a TEST value. This is useful only for testing.
   * <p>
   * @return
   */
  private static String getTestString(Integer maxLength, Integer minLength) {
    String text = loadText();
    if (text != null) {
      return text.substring(0, maxLength);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < maxLength; i++) {
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
