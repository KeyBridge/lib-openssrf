/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCTU.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCTU"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration
 * value="Continuous"/> &lt;enumeration value="Continuous+Stepped"/>
 * &lt;enumeration value="Fixed"/> &lt;enumeration value="Fixed+Continuous"/>
 * &lt;enumeration value="Fixed+Stepped"/> &lt;enumeration value="Stepped"/>
 * &lt;enumeration value="Fixed-Constrained"/> &lt;enumeration value="Fixed or
 * Random"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCTU")
@XmlEnum
public enum ListCTU {

  /**
   * Systems capable of being tuned to any frequency within the requested band
   * <p>
   */
  @XmlEnumValue("Continuous")
  CONTINUOUS("Continuous"),
  /**
   * Combination of continuous and stepped
   * <p>
   */
  @XmlEnumValue("Continuous+Stepped")
  CONTINUOUS___STEPPED("Continuous+Stepped"),
  /**
   * Systems capable of operating on a single discrete frequency
   * <p>
   */
  @XmlEnumValue("Fixed")
  FIXED("Fixed"),
  /**
   * Combination of fixed and continuous
   * <p>
   */
  @XmlEnumValue("Fixed+Continuous")
  FIXED___CONTINUOUS("Fixed+Continuous"),
  /**
   * Combination of fixed and stepped
   * <p>
   */
  @XmlEnumValue("Fixed+Stepped")
  FIXED___STEPPED("Fixed+Stepped"),
  /**
   * Systems capable of being tuned across the authorised or requested band in
   * discrete steps or increments. This includes crystal control
   * <p>
   */
  @XmlEnumValue("Stepped")
  STEPPED("Stepped"),
  /**
   * Systems capable of operating on a single discrete frequency, determined by
   * the bandwidth constraints of the power generating or frequency determining
   * device
   * <p>
   */
  @XmlEnumValue("Fixed-Constrained")
  FIXED___CONSTRAINED("Fixed-Constrained"),
  /**
   * Frequency-agile radars that operate on various frequencies within a band,
   * either specified or random mode
   * <p>
   */
  @XmlEnumValue("Fixed or Random")
  FIXED___OR___RANDOM("Fixed or Random");
  private final String value;

  ListCTU(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCTU fromValue(String v) {
    for (ListCTU c : ListCTU.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
