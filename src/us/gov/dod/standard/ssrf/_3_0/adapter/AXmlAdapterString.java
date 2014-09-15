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
package us.gov.dod.standard.ssrf._3_0.adapter;

import java.util.regex.Pattern;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Abstract String type XmlAdapter.
 * <p>
 * The maximum and minimum string lengths are identified in the constructor.
 * <p>
 * Sx is a character string of x characters maximum, USx is a Uppercase
 * character string of x characters maximum (the attribute accepts only upper
 * case characters).
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public abstract class AXmlAdapterString extends XmlAdapter<String, TString> {

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
   * @param v The value to be convereted. Can be null.
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
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public TString unmarshal(String v) throws Exception {
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
      throw new Exception(this.getClass().getSimpleName() + " [" + minLength + "-" + maxLength + "] string length violation [" + v.getValue().length() + "]");
    }
    if (maxLength != null && v.getValue().length() > maxLength) {
      throw new Exception(this.getClass().getSimpleName() + " [" + minLength + "-" + maxLength + "] string length violation [" + v.getValue().length() + "]");
    }
    /**
     * Validate the pattern if set.
     */
    if (pattern != null) {
      if (!Pattern.compile(pattern).matcher(v.getValue()).find()) {
        throw new Exception(this.getClass().getSimpleName() + " [" + pattern + "] string pattern violation [" + v.getValue() + "]");
      }
    }
    /**
     * Convert to upper case if indicated.
     */
    return upperCase ? v.getValue().toUpperCase() : v.getValue();
  }

}
