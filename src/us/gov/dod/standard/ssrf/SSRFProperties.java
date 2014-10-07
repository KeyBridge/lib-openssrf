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
 * @author Jesse Caulfield <jesse@caulfield.org>
 * @version 1.0, 10/07/14
 * @since 3.1.0
 */
public class SSRFProperties extends Properties {

  private static final long serialVersionUID = 1L;

  /**
   * Get an instance of the default SSRF properties configuration.
   * <p>
   * A SSRF properties with the global classification to U "Unclassified".
   * Existing properties may be edited and new properties may be freely added.
   * <p>
   * @return the default SSRFProperties instance
   */
  public static SSRFProperties getDefault() {
    System.out.println("DEBUG SSRFProperties getDefault");
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
   * @param className the containing class name
   * @param fieldName the field name
   * @return a string representation of the value, if set; otherwise NULL.
   */
  @Override
  public String getProperty(String className, String fieldName) {
    return getProperty(className, fieldName, null);
  }

  /**
   * Searches for the property with the specified key in this property list.
   * <p>
   * If the key is not found in this property list, the default property list,
   * and its defaults, recursively, are then checked. The method returns the
   * default value argument if the property is not found.
   * <p>
   * @param className    the containing class name
   * @param fieldName    the field name
   * @param defaultValue a default value
   * @return a string representation of the value, if set; otherwise NULL.
   */
  public String getProperty(String className, String fieldName, String defaultValue) {
    /**
     * First try a specific match for the class PLUS field.
     */
    Pattern p = Pattern.compile(className + "\\." + fieldName + "$");
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
