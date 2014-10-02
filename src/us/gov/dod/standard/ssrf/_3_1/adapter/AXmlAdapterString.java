/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.adapter;

import java.util.Locale;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;

/**
 * Abstract String type XmlAdapter.
 * <p>
 * The maximum and minimum string lengths are identified in the constructor.
 * <p>
 * Sx is a character string of x characters maximum, USx is a Uppercase
 * character string of x characters maximum (the attribute accepts only upper
 * case characters).
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 */
public abstract class AXmlAdapterString extends XmlAdapter<String, TString> {

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
  public String marshal(TString v) throws Exception {
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
  public TString unmarshal(String v) throws Exception {
    /**
     * DEBUG - simply return the value for a relaxed configuration.
     */
//    return convert(v);
    return new TString(v);
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
  private String convert(TString v) throws Exception {
    if (minLength != null && v.getValue().length() < minLength) {
      throw new Exception("string length violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " [" + minLength + "-" + maxLength + "]" + " with length = " + v.getValue().length() + ".");
    }
    if (maxLength != null && v.getValue().length() > maxLength) {
      throw new Exception("string length violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " [" + minLength + "-" + maxLength + "]" + " with length = " + v.getValue().length() + ".");
    }
    /**
     * If the string length is valid then validate the pattern if applicable.
     */
    if (pattern != null) {
      if (!Pattern.compile(pattern).matcher(v.getValue()).find()) {
        throw new Exception("string pattern violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " [" + pattern + "] for \"" + v.getValue() + "\".");
      }
    }
    /**
     * Convert to upper case if indicated.
     */
    return upperCase ? v.getValue().toUpperCase(Locale.getDefault()) : v.getValue();
  }

}
