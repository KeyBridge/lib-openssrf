/* 
 * Copyright 2014 Key Bridge Global LLC.
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

import java.io.*;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.InvalidPropertiesFormatException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * SSRF Properties manager.
 * <p>
 * This simple utility class enables the selective (or global) application of
 * metadata configurations to SSRF components.
 * <p>
 * SSRF Properties extends {@link Properties} and represents a persistent set of
 * properties. Each key and its corresponding value in the property list is a
 * string.
 * <p>
 * SSRF Properties can be saved to a File/Stream or loaded from a File/Stream.
 * <p>
 * @author Jesse Caulfield
 * @version 1.0, 10/07/14
 * @since 3.1.0
 */
public class SSRFProperties extends Properties {

  private static final long serialVersionUID = 1L;

  /**
   * Get an instance of the default SSRF properties configuration.
   * <p>
   * The default SSRF profile is a global classification Unclassified
   * configuration
   * <strong>cls=U</strong> ("Unclassified") suitable for general (public)
   * distribution.
   * <p>
   * The returned SSRFProperties instance may be freely edited and updated
   * before assigning it to a SSRF configuration. Typically at minimum the
   * "TSerial.organisation" property is set to a four-character organization
   * code.
   * <p>
   * @return the default SSRFProperties "Unclassified" instance
   */
  public static SSRFProperties getDefault() {
    SSRFProperties p = new SSRFProperties();
    try {
      p.load(SSRFProperties.class.getClassLoader().getResourceAsStream("META-INF/profiles/default.properties"));
    } catch (IOException ex) {
      Logger.getLogger(SSRFProperties.class.getName()).log(Level.SEVERE, null, ex);
    }
    return p;
  }

  /**
   * Determine if the properties contains the indicated class.
   * <p>
   * This method scans the properties KEYs looking for any entry with the
   * indicated class value.
   * <p>
   * @param clazz the class type to look for
   * @return TRUE if the properties contains a setting for the indicated class
   */
  public boolean containsClass(Class<?> clazz) {
    Pattern p = Pattern.compile("^(\\w+)\\.(\\w+)$");
    for (Map.Entry<Object, Object> entry : entrySet()) {
      Matcher m = p.matcher((String) entry.getKey());
      if (m.find()) {
        return true;
      }
    }
    return false;
  }

  /**
   * Searches for the property with the specified key in this property list.
   * <p>
   * If the key is not found in this property list, the default property list,
   * and its defaults, recursively, are then checked. The method returns null if
   * the property is not found.
   * <p>
   * @param clazz the containing class under inspection
   * @param field the class field under inspection
   * @return a string representation of the value, if set; otherwise NULL.
   */
  public String getProperty(Class<?> clazz, Field field) {
    return getProperty(clazz.getSimpleName(), field.getName(), null);
  }

  /**
   * Searches for the property with the specified key in this property list.
   * <p>
   * Searches for the property with the specified key in this property list. If
   * the key is not found in this property list, the default property list, and
   * its defaults, recursively, are then checked. The method returns null if the
   * property is not found.
   * <p>
   * @param classPath the containing class name
   * @param fieldName the field name
   * @return a string representation of the value, if set; otherwise NULL.
   */
  @Override
  public String getProperty(String classPath, String fieldName) {
    return getProperty(classPath, fieldName, null);
  }

  /**
   * Searches for the property with the specified key in this property list.
   * <p>
   * If the key is not found in this property list, the default property list,
   * and its defaults, recursively, are then checked. The method returns the
   * default value argument if the property is not found.
   * <p>
   * @param classPath    the containing class name
   * @param fieldName    the field name
   * @param defaultValue a default value
   * @return a string representation of the value, if set; otherwise NULL.
   */
  public String getProperty(String classPath, String fieldName, String defaultValue) {
    /**
     * First try a specific match for the full class path PLUS field.
     */
    Pattern p = Pattern.compile(classPath + "\\." + fieldName + "$");
    for (Map.Entry<Object, Object> entry : entrySet()) {
      Matcher m = p.matcher((String) entry.getKey());
      if (m.find()) {
        return (String) entry.getValue();
      }
    }
    /**
     * If the specific match failed then try for a global match. If no global
     * value is set then return the user-defined default value.
     */
    return getProperty(fieldName) != null ? getProperty(fieldName) : defaultValue;
  }

  /**
   * Read a property list (key and element pairs) from the input propertie file.
   * <p>
   * The input file is in a simple line-oriented format and is assumed to use
   * the ISO 8859-1 character encoding; that is each byte is one Latin1
   * character. Characters not in Latin1, and certain special characters, are
   * represented in keys and elements using Unicode escapes as defined in
   * section 3.3 of The Java™ Language Specification.
   * <p>
   * @param inFile a properties file
   * @throws IOException if the file cannot be read, is malformed or does not
   *                     exist
   */
  public synchronized void load(File inFile) throws IOException {
    super.load(new FileInputStream(inFile));
  }

  /**
   * Loads all of the properties represented by the XML document on the
   * specified input file into this properties table.
   * <p>
   * The XML document must have the following DOCTYPE declaration: &lt;!DOCTYPE
   * properties SYSTEM "http://java.sun.com/dtd/properties.dtd"&gt;
   * <p>
   * Furthermore, the document must satisfy the properties DTD described above.
   * <p>
   * @param inFile a properties file
   * @throws IOException
   * @throws InvalidPropertiesFormatException
   */
  public synchronized void loadFromXML(File inFile) throws IOException, InvalidPropertiesFormatException {
    super.loadFromXML(new FileInputStream(inFile));
  }

  /**
   * Writes the property list (key and element pairs) in this Properties table
   * to the output file in a format suitable for loading into a Properties table
   * using the {@link #load(File)} method.
   * <p>
   * This method outputs the comments, properties keys and values in the same
   * format as specified in store(Writer), with the following differences:
   * <p>
   * The stream is written using the ISO 8859-1 character encoding.
   * <p>
   * Characters not in Latin-1 in the comments are written as \\uxxxx for their
   * appropriate unicode hexadecimal value xxxx.
   * <p>
   * Characters less than \u0020 and characters greater than \u007E in property
   * keys or values are written as \\uxxxx for the appropriate hexadecimal value
   * xxxx.
   * <p>
   * @param outFile the output file
   * @throws IOException if the output file cannot be written
   */
  public void store(File outFile) throws IOException {
    super.store(new FileOutputStream(outFile), Calendar.getInstance().getTime().toString());
  }

  /**
   * Writes the property list (key and element pairs) in this Properties table
   * to the output file in a format suitable for loading into a Properties table
   * using the {@link #loadFromXML(java.io.File)} method.
   * <p>
   * The XML document will have the following DOCTYPE declaration: &lt;!DOCTYPE
   * properties SYSTEM "http://java.sun.com/dtd/properties.dtd"&gt;
   * <p>
   * If the specified comment is null then no comment will be stored in the
   * document.
   * <p>
   * @param outFile the output file
   * @throws IOException if the output file cannot be written
   */
  public void storeToXML(File outFile) throws IOException {
    super.storeToXML(new FileOutputStream(outFile), Calendar.getInstance().getTime().toString());
  }

}
