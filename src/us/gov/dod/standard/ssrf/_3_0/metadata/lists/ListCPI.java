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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ListCPI.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCPI"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="International Approval"/> &lt;enumeration value="Local Approval"/>
 * &lt;enumeration value="National Approval"/> &lt;enumeration value="Outside
 * National Boundaries"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCPI")
@XmlEnum
public enum ListCPI {

  /**
   * The dataset is outside national boundaries; however, it must be processed
   * to national or international level authority for approval
   * <p>
   */
  @XmlEnumValue("International Approval")
  INTERNATIONAL_APPROVAL("International Approval"),
  /**
   * The dataset is within national boundaries; however, it need not be
   * processed to national level authority for approval
   * <p>
   */
  @XmlEnumValue("Local Approval")
  LOCAL_APPROVAL("Local Approval"),
  /**
   * The dataset is to be processed to national level authority for approval
   * <p>
   */
  @XmlEnumValue("National Approval")
  NATIONAL_APPROVAL("National Approval"),
  /**
   * The dataset is outside national boundaries and need not be processed to
   * national level authority for approval
   * <p>
   */
  @XmlEnumValue("Outside National Boundaries")
  OUTSIDE_NATIONAL_BOUNDARIES("Outside National Boundaries");
  private final String value;

  ListCPI(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCPI fromValue(String v) {
    for (ListCPI c : ListCPI.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
