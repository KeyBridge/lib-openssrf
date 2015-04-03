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

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
   * A copy of the SSRF XSD is located in the TEST META-INF directory.
   */
  private static final URL SSRF_XSD = SSRFTestUtility.class.getResource("/META-INF/xsd/3.1.0/ssrf.xsd");

  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate
   */
  public static void testMaximumPositiveFill(EDatasetType ssrfType) throws Exception {
    String testName = "Maximum Positive Fill Test";
//    System.out.println("\n" + testName + ": " + ssrfType.getClassSimpleName()); // identify the test
    System.out.println("");
    /**
     * Instantiate an instance of the SSRF type.
     */
    Common<?> instance = ssrfType.getClazz().getConstructor().newInstance();
    /**
     * MIN Fill it with known good values.
     */
    fill(instance, true);
    SSRF ssrf = buildSSRF(instance);

    try {
      Set<String> detect = SSRFTestUtility.validate(ssrf);
      if (detect.isEmpty()) {
        System.out.println("  PASS: " + ssrfType.getClassSimpleName() + " " + testName);
        saveFile(ssrf, ssrfType, true, true);
      } else {
        System.out.println("  FAIL: " + ssrfType.getClassSimpleName() + " " + testName);
        for (String line : detect) {
          System.out.println("    " + line);
        }
        saveFile(ssrf, ssrfType, true, false);
      }
    } catch (Exception exception) {
      System.out.println("  FAIL: " + ssrfType.getClassSimpleName() + " " + testName + "  " + " " + exception.getMessage());
      saveFile(ssrf, ssrfType, true, false);
    }
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate
   */
  public static void testMinimumPositiveFill(EDatasetType ssrfType) throws Exception {
    String testName = "Minimum Positive Fill Test";
//    System.out.println("\n" + testName + ": " + ssrfType.getClassSimpleName()); // identify the test
    System.out.println("");
    /**
     * Instantiate an instance of the SSRF type.
     */
    Common<?> instance = ssrfType.getClazz().getConstructor().newInstance();
    /**
     * MIN Fill it with known good values.
     */
    fill(instance, false);
    SSRF ssrf = buildSSRF(instance);

    try {
      Set<String> detect = SSRFTestUtility.validate(ssrf);
      if (detect.isEmpty()) {
        System.out.println("  PASS: " + ssrfType.getClassSimpleName() + " " + testName);
        saveFile(ssrf, ssrfType, false, true);
      } else {
        System.out.println("  FAIL: " + ssrfType.getClassSimpleName() + " " + testName);
        for (String line : detect) {
          System.out.println("    " + line);
        }
        saveFile(ssrf, ssrfType, false, false);
      }
    } catch (Exception exception) {
      System.out.println("  FAIL: " + ssrfType.getClassSimpleName() + " " + testName + "  " + " " + exception.getMessage());
      saveFile(ssrf, ssrfType, false, false);
    }
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate
   */
  public static void testMinimumNegativeFill(EDatasetType ssrfType) throws Exception {
    /**
     * Instantiate an instance of the SSRF type.
     */
    Common<?> instance = ssrfType.getClazz().getConstructor().newInstance();
    /**
     * MIN Fill it with known good values.
     */
    fill(instance, false);
    SSRF ssrf = buildSSRF(instance);
    testNegativeFill(ssrf, ssrfType, "Minimum Negative Fill Test");
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate
   */
  public static void testMaximumNegativeFill(EDatasetType ssrfType) throws Exception {
    /**
     * Instantiate an instance of the SSRF type.
     */
    Common<?> instance = ssrfType.getClazz().getConstructor().newInstance();
    /**
     * MIN Fill it with known good values.
     */
    fill(instance, true);
    SSRF ssrf = buildSSRF(instance);
    testNegativeFill(ssrf, ssrfType, "Maximum Negative Fill Test");
  }

  /**
   * Internal common aspects of a NEGATIVE FILL test.
   * <p>
   * @param ssrf     the SSRF document
   * @param ssrfType the SSRF type under test - used when printing results
   * @param testName the test name - used when printing results
   * @throws Exception if the test fails
   */
  private static void testNegativeFill(SSRF ssrf, EDatasetType ssrfType, String testName) throws Exception {
    System.out.println("");
    /**
     * Corrupt various randomly selected fields in the object tree.
     */
    Set<String> corrupt = SSRFTestUtility.corrupt(ssrf);
    /**
     * Detect the corrupted fields.
     */
    Set<String> detect;
    try {
      detect = SSRFTestUtility.validate(ssrf, corrupt.size()); // throws xmllint exception
    } catch (Exception exception) {
      System.out.println("  FAIL: " + ssrfType.getClassSimpleName() + " " + testName + "  " + exception.getMessage());
      return;
    }
    /**
     * Scan and organize the results.
     */
    Map<String, String> keyMap = new TreeMap<>();
    Set<String> corruptSet = new HashSet<>();
    Pattern p = Pattern.compile("(.*) \\((\\w+)\\) ");
    for (String line : corrupt) {
      Matcher m = p.matcher(line);
      if (m.find()) {
        keyMap.put(m.group(1), m.group(2));
        corruptSet.add(m.group(1));
      }
    }
    Set<String> detectSet = new HashSet<>();
    for (String line : detect) {
      Matcher m = p.matcher(line);
      if (m.find()) {
        keyMap.put(m.group(1), m.group(2));
        detectSet.add(m.group(1));
      }
    }
    boolean ok = true;
    /**
     * Set the OK flag to FALSE if the two sets do not match. Do not consider
     * SETS as the contents may have shifted but are still OK.
     */
    for (Map.Entry<String, String> entry : keyMap.entrySet()) {
      if (!"Set".equals(entry.getValue())) {
        ok = ok && detectSet.contains(entry.getKey());
      }
    }
    /**
     * If test not OK then print the results for inspection.
     */
    if (ok) {
      System.out.println("  PASS: " + ssrfType.getClassSimpleName() + " " + testName);
    } else {
      System.out.println("  FAIL: " + ssrfType.getClassSimpleName() + " " + testName + "  Result requires manual inspection.");
//      System.out.println("");
      /**
       * Pretty-Print the results.
       */
      int i = 0;
//      System.out.println("  " + testName + " Results");
      System.out.println(String.format("    %4s %5s %5s %-20s %-50s",
                                       "#",
                                       "ERR",
                                       "DET",
                                       "Type",
                                       "FieldName"));
      for (Map.Entry<String, String> entry : keyMap.entrySet()) {
        System.out.println(String.format("    %4d %5s %5s %-20s %-50s",
                                         i,
                                         corruptSet.contains(entry.getKey()) ? "  " : "ND",
                                         detectSet.contains(entry.getKey()) ? "  " : "ND",
                                         entry.getValue(),
                                         entry.getKey()
        ));
        i++;
      }
    }
  }

  /**
   * Save a SSRF object to a file.
   * <p>
   * @param ssrf     the ssrf object
   * @param ssrfType the ssrf data type
   * @param pass     if the test passes or fails
   */
  private static void saveFile(SSRF ssrf, EDatasetType ssrfType, boolean max, boolean pass) {
    try {
      String xml = ssrf.toXML(); // throws exception
      Path dir = Paths.get("/tmp",
                           "certification",
                           "xml",
                           ssrfType.getClassSimpleName(),
                           pass ? "pass" : "fail");
      if (!dir.toFile().exists()) {
        dir.toFile().mkdirs();
      }
      Path file = Files.createTempFile(dir, ssrfType.getClassSimpleName() + "-", "-" + (max ? "max" : "min") + ".xml");
      Files.write(file, xml.getBytes());
    } catch (Exception ex) {
//      System.err.println("FAILED to save SSRF " + ssrfType.getClassSimpleName() + " to file. " + ex.getMessage());
//      Logger.getLogger(SSRFTestUtility.class.getName()).log(Level.SEVERE, null, ex);
      for (String evaluate : ssrf.evaluate()) {
        System.out.println("    " + evaluate);
      }
    }
  }

  /**
   * Common helper method to validate a SSRF component class instance.
   * <p>
   * This method inserts the component in to a SSRF document, then attempts to
   * validate the resultant SSRF document.
   * <p>
   * @param instance a SSRF component class instance (extends Common)
   * @throws Exception if the SSRF XML document fails to validate or fails to
   *                   validate against the SSRF schema.
   */
  public static Set<String> validate(SSRF instance) throws Exception {
    return validate(instance, 0);
  }

  /**
   * Common helper method to validate a SSRF component class instance.
   * <p>
   * This method inserts the component in to a SSRF document, then attempts to
   * validate the resultant SSRF document.
   * <p>
   * @param instance      a SSRF component class instance (extends Common)
   * @param errorExpected the number of validation errors to expect
   * @return the set of SSRF document validation errors
   * @throws Exception if the SSRF XML document fails to validate or fails to
   *                   validate against the SSRF schema.
   */
  public static Set<String> validate(SSRF ssrf, int errorExpected) throws Exception {
    /**
     * Evaluate the SSRF document.
     */
    Set<String> errorDetected = ssrf.evaluate();
    if (errorDetected.isEmpty()) {
      /**
       * If the SSRF document evaluates with no errors then run XMLLINT on the
       * SSRF XML document.
       */
      errorDetected = XmlLint.validate(ssrf.toXML(), Paths.get(SSRF_XSD.toURI()));
    }
//    else {
    /**
     * If the SSRF document fails to validate then log the error detail and
     * throw an exception to report the failure.
     */
//      System.out.println(errorDetected.size() + " validation errors detected in SSRF instance.");
//      for (String error : errorDetected) {        System.out.println("  " + error);      }
//    }
    return errorDetected;
  }

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
      return;
    }
//    System.out.println(">>> ----------------- " + clazz.getSimpleName());
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
       * Skip if the field is already populated
       */
      if (field.get(instance) != null) {
        continue;
      }
      /**
       * Populate if the field is required.
       */
      if ((SSRFUtility.isRequired(field) || maximum) && !SSRFUtility.isTransient(field)) {
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
          Object fieldSet = getFillSet(clazz, field, maximum);
          field.set(instance, fieldSet);
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
             * The field is not a basic type and is an object or enumerated
             * type. Instantiate the object (or type).
             */
            String fieldClassName = field.getType().toString().replace("class ", "").trim();
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
              /**
               * Special handling: TxMode modeId requires a unique field.<br/>
               * Station.stationId requires a unique field.<br/>
               * Configuration.configId requires a unique field.<br/>
               */
              if (field.getName().equalsIgnoreCase("modeId")) {
                ((S20) fieldInstance).setValue(UUID.randomUUID().toString().substring(0, 20));
              } else if (field.getName().equalsIgnoreCase("stationID")) {
                ((S100) fieldInstance).setValue(UUID.randomUUID().toString());
              } else if (field.getName().equalsIgnoreCase("linkId")) {
                ((S100) fieldInstance).setValue(UUID.randomUUID().toString());
              } else if (field.getName().equalsIgnoreCase("configID")) {
                ((S100) fieldInstance).setValue(UUID.randomUUID().toString());
              }
              field.set(instance, fieldInstance);
            }
          }
        }
      }
      /**
       * For maximum fill also try to add at least one reference.
       */
      if (maximum && SSRFUtility.isTransient(field)) {
        Class<?> c = field.getType();
        if (c.equals(Set.class)) {
          Object fieldSet = getFillSet(clazz, field, false);
          field.set(instance, fieldSet);
        } else {
          Object fillObject = getFillObject(clazz, field);
          field.set(instance, fillObject);
        }
      }
    }
//    System.out.println("<<< ----------------- " + clazz.getSimpleName());
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
     * Inspect the Collection declaration to identify the internal class type.
     */
    Type genericType = field.getGenericType();
    Type type = ((ParameterizedType) genericType).getActualTypeArguments()[0];
    /**
     * The fieldType is a (very) generic Type and apparently cannot be used to
     * instantiate an instance. Instead use its name, which must be processed to
     * strip the 'class ' prefix that Java classes prepend in the default
     * toString.
     */
    String fieldClassName = type.toString().replace("class ", "").trim();
    /**
     * Some sets refer to generic Common<?> types. Ignore these.
     */
    if (fieldClassName.contains("Common")) {
      return null;
    }
    /**
     * Look up the class by its name.
     */
    Class<?> fieldClass = Class.forName(fieldClassName);
    /**
     * Initialize a new HashSet, then fill it with a random number of entries.
     * Set the response set size to 1 if MIN, else to a random number greater
     * than zero for MAX.
     */
    Set response = new HashSet<>();
    int responseSize = new Random().nextInt(10);
    responseSize = maximum
                   ? responseSize == 0 ? 1 : responseSize
                   : 1;
    /**
     * Special handling:
     * <p>
     * The SecurityClass.downgrade field is limited to 3 entries. <br/>
     * The SSRequest.stage field is limited to 4 entries. <br/>
     * The Polygon.polygonPoint field is required at least 3 entries. <br/>
     * Administrative.codeList and dataset are mutually exclusive. <br/>
     */
    if (maximum && field.getName().equals("downgrade")) {
      responseSize = 3;
    } else if (maximum && field.getName().equals("stage")) {
      responseSize = 4;
    } else if (maximum && field.getName().equals("polygonPoint")) {
      responseSize = 10;
    } else if (maximum && field.getName().equals("codeList")) {
      return null;
    }
    /**
     * Handle the case where the class is an enumerated type.
     */
    if (fieldClass.isEnum()) {
      /**
       * If the field class is an enumerated instance then get a random
       * enumerated value.
       */
      for (int i = 0; i < responseSize; i++) {
        Object fieldInstance = fieldClass.getEnumConstants()[new Random().nextInt(fieldClass.getEnumConstants().length)];
        if (fieldInstance != null) {
          SSRFTestUtility.fill(fieldInstance, maximum);
        }
        response.add(fieldInstance);
      }
    } else if (type.equals(BigInteger.class)) {
      for (int i = 0; i < responseSize; i++) {
        Object fieldInstance = new BigInteger(String.valueOf(new Random().nextInt(1024)));
        if (fieldInstance != null) {
          SSRFTestUtility.fill(fieldInstance, maximum);
        }
        response.add(fieldInstance);
      }
    } else {
      /**
       * Otherwise get a new instance of the class object. Special handling for
       * referenced Serial sets.
       */
      if (fieldClass.equals(Serial.class)) {
        response.add(new Location().getSerial());
      } else {
        try {
          for (int i = 0; i < responseSize; i++) {
            Object fieldInstance = fieldClass.getConstructor().newInstance();
            if (fieldInstance != null) {
              SSRFTestUtility.fill(fieldInstance, maximum);
            }
            response.add(fieldInstance);
          }
        } catch (Exception ex) {
          /**
           * This will FAIL for Serial types since the no-arg constructor is set
           * to PRIVATE. Safe to ignore since serial references are handled
           * separately via Transient lists.
           */
//        System.err.println("ERROR FAIL: " + clazz.getSimpleName() + " " + field.getName() + " " + fieldClass.getSimpleName() + " instance " + ex.getMessage());
//        logger.log(Level.SEVERE, null, ex);
        }
      }
    }
    return response;
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
     * Get the field type. Scan the field annotations looking for an
     * XmlJavaTypeAdapter instance.
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
          Class<?> fieldType = field.getType();
          XmlAdapter adapter = ((XmlJavaTypeAdapter) annotation).value().getConstructor().newInstance();

          if (adapter instanceof AXmlAdapterNumber) {
            if (fieldType.equals(BigInteger.class) || fieldType.equals(Integer.class)) {
              Number value = getTestInteger(((AXmlAdapterNumber) adapter).getMaxValue(),
                                            ((AXmlAdapterNumber) adapter).getMinValue());
              try {
                return fieldType.getConstructor(Number.class).newInstance(value);
              } catch (Exception exception) {
                return fieldType.getConstructor(String.class).newInstance(value.toString());
              }
            } else if (fieldType.equals(BigDecimal.class) || fieldType.equals(Double.class)) {
              Double value = getTestDouble(((AXmlAdapterNumber) adapter).getMaxValue(),
                                           ((AXmlAdapterNumber) adapter).getMinValue());
              try {
                return fieldType.getConstructor(Double.class).newInstance(value);
              } catch (Exception exception) {
                return fieldType.getConstructor(String.class).newInstance(value.toString());
              }
            } else {
              Double value = getTestDouble(((AXmlAdapterNumber) adapter).getMaxValue(),
                                           ((AXmlAdapterNumber) adapter).getMinValue());
              try {
                return fieldType.getConstructor(Number.class).newInstance(value);
              } catch (Exception exception) {
                return fieldType.getConstructor(String.class).newInstance(value.toString());
              }
            }
          } else if (adapter instanceof AXmlAdapterInteger) {
            return getTestInteger(((AXmlAdapterInteger) adapter).getMaxValue(),
                                  ((AXmlAdapterInteger) adapter).getMinValue());
          } else if (adapter instanceof XmlAdapterSERIAL) {
            /**
             * If the field has an XmlAdapterSERIAL then inspect the field name.
             * <p>
             * If the name is NOT 'serial' then assume the field is a reference
             * and provide a (bogus) temporary serial number. Otherwise the
             * (serial) field should be ignored. (It should be skipped if
             * already populatd.
             */
            return new Contact().getSerial().toString();
          } else if (adapter instanceof XmlAdapterUS_DURATION) {
            return "123.12.123456789";
          } else if (adapter instanceof XmlAdapterMINSEC) {
            return "30";
          } else if (adapter instanceof XmlAdapterHOURS) {
            return "8";
          } else if (adapter instanceof XmlAdapterDAYSOFWEEK) {
            return "1";
          } else if (adapter instanceof XmlAdapterMONTHS) {
            return "1";
          } else if (adapter instanceof XmlAdapterYEARS) {
            return "2007";
          } else if (adapter instanceof XmlAdapterDAYSOFMONTH) {
            return "15";
          } else if (adapter instanceof XmlAdapterNAVAIDCHNL) {
            return "123X";
          } else if (adapter instanceof XmlAdapterNETNUMBER) {
            return "A12325";
          } else if (adapter instanceof XmlAdapterTSDFVALUE) {
            return "40/20";
          } else if (adapter instanceof XmlAdapterUS_DBM) {
            return -90.0;
          } else if (adapter instanceof XmlAdapterEMSDES) {
            /**
             * Special case for a Emission Designator (only supports 5
             * characters)
             */
            return "A1AAF";   // unknown pattern
          } else if (adapter instanceof AXmlAdapterString) {
            /**
             * If the field is a TString then inspect the WITH setter to
             * determine if the field expects an enumerated input.
             */
            String value = getTextString(((AXmlAdapterString) adapter).getMaxLength(),
                                         ((AXmlAdapterString) adapter).getMinLength());
//            return adapterType.getConstructor(String.class).newInstance(value);
            return value;
          } else if (adapter instanceof AXmlAdapterTString) {
            /**
             * TStrings typically only represent List entries...
             */
            String value = getTextString(((AXmlAdapterTString) adapter).getMaxLength(),
                                         ((AXmlAdapterTString) adapter).getMinLength());
            return fieldType.getConstructor(String.class).newInstance(value);
          } else if (adapter instanceof XmlAdapterDATE) {
            return fieldType.getConstructor(Calendar.class).newInstance(Calendar.getInstance());
          } else if (adapter instanceof XmlAdapterDATETIME) {
            return fieldType.getConstructor(Calendar.class).newInstance(Calendar.getInstance());
          } else {
            logger.log(Level.WARNING, "UNKNOWN annotation {0}  {1} {2} {3} ", new Object[]{adapter.getClass().getSimpleName(), field.getType(), field.getDeclaringClass().getSimpleName(), field.getName()});
          }
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
          logger.log(Level.WARNING, "XmlValidator failed to instantiate for field {0}: {1}", new Object[]{field, ex.getMessage()});
          logger.log(Level.SEVERE, null, ex);
        }
      }
    }
    /**
     * NO XmlTypeValidator annotation. Fill with a basic type.
     */
    Class<?> type = field.getType();
    if (type.equals(String.class)) {
      /**
       * If the field is a TString then inspect the WITH setter to determine if
       * the field expects an enumerated input.
       */
      Object enumInstance = getEnumEntry(field.getDeclaringClass(), field);
      return enumInstance != null ? enumInstance : getTextString(8, 0);
    } else if (type.equals(Serial.class)) {
      /**
       * Return a bogus serial number.
       */
      return new Contact().getSerial();
    } else if (type.equals(TString.class)) {
      /**
       * If the field is a TString then inspect the WITH setter to determine if
       * the field expects an enumerated input.
       */
      Object enumInstance = getEnumEntry(field.getDeclaringClass(), field);
      return enumInstance != null
             ? new TString(enumInstance.toString())
             : new TString(getTextString(8, 0));
    } else if (type.equals(BigDecimal.class)) {
      return new BigDecimal(new Random().nextInt(1024000) * new Random().nextDouble());
    } else if (type.equals(BigInteger.class)) {
      return new BigInteger(String.valueOf(new Random().nextInt(999999)));
    } else if (type.equals(Double.class)) {
      return new Random().nextInt(1024000) * new Random().nextDouble();
    } else if (type.equals(D.class)) {
      return new D(Calendar.getInstance());
    } else if (type.equals(DT.class)) {
      return new DT(Calendar.getInstance());
    } else if (type.isEnum()) {
      String fieldClassName = type.toString().replace("class ", "").trim();
      Class<?> fieldClass = Class.forName(fieldClassName);
      return fieldClass.getEnumConstants()[new Random().nextInt(fieldClass.getEnumConstants().length)];
    }
    /**
     * Assume the field is an object type. Return NULL to indicate to the
     * calling method that it should try to instantiate and populate a new
     * object instance.
     */
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
        if (parameterType.isEnum()) {
          String fieldClassName = parameterType.toString().replace("class ", "").trim();
          Class<?> fieldClass = Class.forName(fieldClassName); // throws ClassNotFoundException
          Enum fieldInstance = (Enum) fieldClass.getEnumConstants()[new Random().nextInt(fieldClass.getEnumConstants().length)];
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
   * @param max the maximum number value
   * @param min the minimum number value
   * @return a random number ranging between the maximum and minimum values
   */
  private static Number getTestInteger(Number max, Number min) {
    Number maxValue = max != null ? max : 1024.0;
    Number minValue = min != null ? min.doubleValue() : 0.0;
    Random r = new Random();
    for (int i = 0; i < 1000; i++) {
      Integer candidate = r.nextInt(maxValue.intValue());
      if (candidate <= maxValue.intValue() && candidate >= minValue.intValue()) {
        return candidate;
      }
    }
    return minValue;
  }

  /**
   * Get a TEST value. This is useful only for testing.
   * <p>
   * @param max the maximum number value
   * @param min the minimum number value
   * @return a random number ranging between the maximum and minimum values
   */
  private static Double getTestDouble(Number max, Number min) {
    Number maxValue = max != null ? max.doubleValue() <= 0.0 ? 1024.0 : max : 1024.0;
    Double minValue = min != null ? min.doubleValue() : 0.0;
    Random r = new Random();
    for (int i = 0; i < 1000; i++) {
      Double candidate = r.nextInt(maxValue.intValue()) * r.nextDouble();
      if (candidate <= maxValue.intValue() && candidate >= minValue.intValue()) {
        return candidate;
      }
    }
    return minValue;
  }

  /**
   * Get a text string guaranteed to range between the maximum and minimum
   * length.
   * <p>
   * @param maxLength the maximum string length
   * @param minLength the minimum string length
   * @return a non-null text string containing random LATIN text.
   */
  private static String getTextLatin(Integer maxLength, Integer minLength) {
    int lengthMin = minLength != null ? minLength : new Random().nextInt(8);
    int lengthMax = maxLength != null ? maxLength : minLength + new Random().nextInt(64);

    String text = loadText();
    if (text != null) {
      /**
       * Generate a random offset so that the text substring will be somewhat
       * randomly unique.
       */
      int start = new Random().nextInt(text.length() - lengthMax);
      String candidate = text.substring(start, start + lengthMax);
      if (candidate.length() < lengthMin) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= lengthMin; i++) {
          sb.append("#");
        }
        return sb.toString();
      } else {
        return candidate;
      }
    }
    /**
     * Finally, if the text fails to load then build a placeholder.
     */
    return getTextString(maxLength, minLength);
  }

  /**
   * Get a text string guaranteed to range between the maximum and minimum
   * length.
   * <p>
   * @param maxLength the maximum string length
   * @param minLength the minimum string length
   * @return a non-null text string containing hash (#) characters.
   */
  private static String getTextString(Integer maxLength, Integer minLength) {
    int lengthMin = minLength != null ? minLength : new Random().nextInt(8);
    int lengthMax = maxLength != null ? maxLength : minLength + new Random().nextInt(64);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < lengthMin; i++) {
      sb.append("R");
    }
    for (int i = lengthMin; i < lengthMax; i++) {
      sb.append("#");
    }
    return sb.toString();
  }

  /**
   * Internal method to load latin text from a resource file.
   * <p>
   * @return the entire latin text file.
   */
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

  /**
   * Build a SSRF instance
   * <p>
   * @param instance
   * @return
   */
  public static SSRF buildSSRF(Common<?> instance) {
    /**
     * Initialize a new SSRF document.
     */
    SSRF ssrf = new SSRF().withProperties(SSRFProperties.getDefault());
    /**
     * Add the SSRF component to the document by calling the corresponding WITH
     * setter.
     */
    switch (EDatasetType.fromInstance(instance)) {
      case AD:
        ssrf.withAdministrative((Administrative) instance);
        break;
      case AL:
        ssrf.withAllotment((Allotment) instance);
        break;
      case AN:
        ssrf.withAntenna((Antenna) instance);
        break;
      case AS:
        ssrf.withAssignment((Assignment) instance);
        break;
      case CN:
        ssrf.withContact((Contact) instance);
        break;
      case CP:
        ssrf.withChannelPlan((ChannelPlan) instance);
        break;
      case EX:
        ssrf.withExternalReference((ExternalReference) instance);
        break;
      case FD:
        ssrf.withFEDeployment((FEDeployment) instance);
        break;
      case FE:
        ssrf.withForceElement((ForceElement) instance);
        break;
      case HD:
        ssrf.withSSReply((SSReply) instance);
        break;
      case IF:
        ssrf.withIntfReport((IntfReport) instance);
        break;
      case JA:
        ssrf.withRole((Role) instance);
        break;
      case JR:
        ssrf.withJRFL((JRFL) instance);
        break;
      case LO:
        ssrf.withLocation((Location) instance);
        break;
      case LS:
        ssrf.withLoadset((Loadset) instance);
        break;
      case MS:
        ssrf.withMessage((Message) instance);
        break;
      case NT:
        ssrf.withNote((Note) instance);
        break;
      case OR:
        ssrf.withOrganisation((Organisation) instance);
        break;
      case RP:
        ssrf.withRadiationPlan((RadiationPlan) instance);
        break;
      case RX:
        ssrf.withReceiver((Receiver) instance);
        break;
      case SA:
        ssrf.withSatellite((Satellite) instance);
        break;
      case SR:
        ssrf.withSSRequest((SSRequest) instance);
        break;
      case TA:
        ssrf.withTOA((TOA) instance);
        break;
      case TR:
        ssrf.withRFSystem((RFSystem) instance);
        break;
      case TX:
        ssrf.withTransmitter((Transmitter) instance);
        break;
      default:
        throw new AssertionError(EDatasetType.fromInstance(instance).name());
    }
    return ssrf;
  }

  /**
   * Walk through an object tree and randomly modify fields.
   * <p>
   * This method may be run against a known good instance configuration to
   * introduce random errors. The introduced errors are logged to the console
   * for correlation with any validation scheme. The number of introduced errors
   * is returned; also for correlation.
   * <p>
   * @param instance a SSRF component class instance (extends Common)
   * @return the number of fields corrupted
   */
  public static Set<String> corrupt(Object instance) {
    Set<String> messages = new TreeSet<>();
    corrupt(instance, null, null, messages);
//    System.out.println(messages.size() + " validation errors introduced into " + instance.getClass().getSimpleName() + " instance");
//    for (String message : messages) {      System.out.println("  " + message);    }
    return messages;
  }

  private static void corrupt(Object instance, Object parentInstance, Field parentField, Set<String> messages) {
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
      return;
    }
//    System.out.println(">>> ----------------- " + clazz.getSimpleName());
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
       * Skip Serial fields: they are generated on demand and (almost)
       * incorruptable.
       * <p>
       * Skip MEMO fields: they are unbounded and incorruptable.
       */
      if (field.getType().equals(Serial.class) || field.getType().equals(MEMO.class)) {
        continue;
      }
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
       * If the field value NULL then ignore it.
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
            corrupt(entry, instance, field, messages);
          }
        }
      } else {
        /**
         * Ignore attributes: these are not really important.
         */
        boolean isAttribute = false;
        for (Annotation annotation : field.getAnnotations()) {
          if (annotation instanceof XmlAttribute) {
            isAttribute = true;
          }
        }
        if (isAttribute) {
          continue;
        }
        /**
         * After the field validation status is completed try to validate the
         * object instance configuration against an XmlTypeValidator, if
         * present.
         */
        corrupt(fieldValue, instance, field, messages);
        for (Annotation annotation : field.getAnnotations()) {
          if (annotation instanceof XmlJavaTypeAdapter) {
            try {
              /**
               * Generate a (potentially) corrupt value. IF the value is NOT
               * corrupted then ignore, else set it.
               */
              Object corrupt = corruptField(fieldValue);
              if (corrupt != fieldValue) {
                field.set(instance, corrupt);
                String message = parentInstance.getClass().getSimpleName() + "." + parentField.getName() + "." + field.getName() + " (" + parentField.getType().getSimpleName() + ") :  Field corrupted.";
                messages.add(message);
//          logger.log(Level.INFO, "{0}.{1} is purposefully corrupted.", new Object[]{instance.getClass().getSimpleName(), field.getName()});
              }
            } catch (IllegalArgumentException | IllegalAccessException illegalArgumentException) {
//          logger.log(Level.SEVERE, "Failed to set {0} {1}", new Object[]{instance.getClass().getSimpleName(), field.getName()});
            } catch (Exception ex) {
              /**
               * Corruption for this field type is not supported.
               */
            }
          }
        }
      }
    }
  }

  /**
   * Internal method to try (possibly not successfully) to corrupt a field.
   * <p>
   * @param instance the current field configuration instance
   * @return a slightly modified version of the current field configuration
   *         instance
   */
  private static Object corruptField(Object instance) throws Exception {
    /**
     * Introduce some randomization in the corruption scheme.
     */
    if (new Random().nextInt(1024) % 2 != 0) {
      return instance;
    }
    /**
     * Do not manipulate fields with null values.
     */
    if (instance == null) {
      return null;
    }
    /**
     * Scan the field annotations looking for an XmlJavaTypeAdapter instance.
     */
    if (instance instanceof String) {
      return instance.toString() + "_BOGUS_TEXT";
    } else if (instance instanceof BigDecimal) {
      return BigDecimal.valueOf(Double.MAX_VALUE);
    } else if (instance instanceof BigInteger) {
      return BigInteger.valueOf(Integer.MAX_VALUE);
    } else if (instance instanceof Integer) {
      return Integer.MAX_VALUE;
    }
    /**
     * Just null out the field.
     */
    return instance;
  }
}
