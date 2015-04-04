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
package us.gov.dod.standard.ssrf._3_1.adapter;

import java.util.Locale;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Abstract String type XmlAdapter.
 * <p>
 * The maximum and minimum string lengths are identified in the constructor.
 * <p>
 * Sx is a character string of x characters maximum, USx is a Uppercase
 * character string of x characters maximum (the attribute accepts only upper
 * case characters).
 * <p>
 * This abstract adapter converts between a {@link java.lang.String} and a
 * {@link String}.
 * <p>
 * @author Jesse Caulfield
 */
public abstract class AXmlAdapterString extends XmlAdapter<String, String> {

  /**
   * "XmlAdapter". The standard adapter name prefix. This is used when
   * constructing an error message.
   */
  private static final String NAME_PREFIX = "XmlAdapter";

  /**
   * The minimum string length.
   */
  private final Integer minLength;
  /**
   * The maximum string length.
   */
  private final Integer maxLength;
  /**
   * Indicator that the string should be converted to upper case. If FALSE then
   * the string is passed un-converted (mixed-case).
   */
  private final Boolean upperCase;
  /**
   * The REGEX pattern that the string must conform to.
   */
  private final String pattern;

  public AXmlAdapterString(Integer minLength, Integer maxLength) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.upperCase = false;
    this.pattern = null;
  }

  public AXmlAdapterString(Integer minLength, Integer maxLength, String pattern) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.upperCase = false;
    this.pattern = pattern;
  }

  public AXmlAdapterString(Integer minLength, Integer maxLength, boolean upperCase, String pattern) {
    this.minLength = minLength;
    this.maxLength = maxLength;
    this.upperCase = upperCase;
    this.pattern = pattern;
  }

  /**
   * Convert a bound type to a value type.
   * <p>
   * This is called when converting an object to XML.
   * <p>
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public String marshal(String v) throws Exception {
    return convert(v);
  }

  /**
   * Convert a value type to a bound type.
   * <p>
   * This is called with converting XML to an object.
   * <p>
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public String unmarshal(String v) throws Exception {
    return convert(v);
  }

  /**
   * Internal method to perform the validation.
   * <p>
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  private String convert(String v) throws Exception {
    if (minLength != null && v.length() < minLength) {
      throw new Exception("Minimum length violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " min length " + minLength + " required.");
    }
    if (maxLength != null && v.length() > maxLength) {
      throw new Exception("String length violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " max length " + maxLength + " exceeded.");
    }
    /**
     * If the string length is valid then validate the pattern if applicable.
     */
    if (pattern != null) {
      if (!Pattern.compile(pattern).matcher(v).find()) {
        throw new Exception("String pattern violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " requires " + pattern + " received \"" + v + "\"");
      }
    }
    /**
     * Convert to upper case if indicated.
     */
    return upperCase ? v.toUpperCase(Locale.getDefault()) : v;
  }

  /**
   * Get the maximum string length.
   * <p>
   * @return the maximum string length.
   */
  public Integer getMaxLength() {
    return maxLength;
  }

  /**
   * Get the minimum string length.
   * <p>
   * @return the minimum string length.
   */
  public Integer getMinLength() {
    return minLength;
  }
}
