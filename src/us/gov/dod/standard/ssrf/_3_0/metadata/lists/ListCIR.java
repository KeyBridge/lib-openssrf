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
 * Java class for ListCIR.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCIR"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="Not
 * requested-Security"/> &lt;enumeration value="Not required"/> &lt;enumeration
 * value="Outside Rules"/> &lt;enumeration value="Pending"/> &lt;enumeration
 * value="Registered"/> &lt;enumeration value="Registered on Insistence"/>
 * &lt;enumeration value="Registered-Needs modification"/> &lt;enumeration
 * value="Required"/> &lt;enumeration value="Unfavourable"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCIR")
@XmlEnum
public enum ListCIR {

  /**
   * Registration with ITU-R not requested for security reasons
   * <p>
   */
  @XmlEnumValue("Not requested-Security")
  NOT_REQUESTED_SECURITY("Not requested-Security"),
  /**
   * Registration with ITU-R not required
   * <p>
   */
  @XmlEnumValue("Not required")
  NOT_REQUIRED("Not required"),
  /**
   * Not notified to ITU-R due to the rules laid down in the ITU regulations
   * <p>
   */
  @XmlEnumValue("Outside Rules")
  OUTSIDE_RULES("Outside Rules"),
  /**
   * Pending notification to ITU-R
   * <p>
   */
  @XmlEnumValue("Pending")
  PENDING("Pending"),
  /**
   * Registered with ITU-R
   * <p>
   */
  @XmlEnumValue("Registered")
  REGISTERED("Registered"),
  /**
   * Registration with ITU-R on an insistence basis
   * <p>
   */
  @XmlEnumValue("Registered on Insistence")
  REGISTERED_ON_INSISTENCE("Registered on Insistence"),
  /**
   * Registered with ITU-R but needs to be modified
   * <p>
   */
  @XmlEnumValue("Registered-Needs modification")
  REGISTERED_NEEDS_MODIFICATION("Registered-Needs modification"),
  /**
   * Registration with ITU-R is required
   * <p>
   */
  @XmlEnumValue("Required")
  REQUIRED("Required"),
  /**
   * Notified to ITU-R but received unfavourable findings and therefore not
   * registered in the International Frequency List (IFL)
   * <p>
   */
  @XmlEnumValue("Unfavourable")
  UNFAVOURABLE("Unfavourable");
  private final String value;

  ListCIR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCIR fromValue(String v) {
    for (ListCIR c : ListCIR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
