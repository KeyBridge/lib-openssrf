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
 * Java class for ListCDR.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCDR"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration value="Code
 * List Change"/> &lt;enumeration value="Data Invalid"/> &lt;enumeration
 * value="Data Not Supported"/> &lt;enumeration value="Data Recall"/>
 * &lt;enumeration value="Data Rejected"/> &lt;enumeration value="Data
 * Deleted"/> &lt;enumeration value="Missing Refs"/> &lt;enumeration value="Data
 * Retired"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCDR")
@XmlEnum
public enum ListCDR {

  /**
   * The dataset adds, deletes, or modifies Codes or Code Lists
   * <p>
   */
  @XmlEnumValue("Code List Change")
  CODE___LIST___CHANGE("Code List Change"),
  /**
   * An invalid dataset was received (other than Missing refs).
   * <p>
   */
  @XmlEnumValue("Data Invalid")
  DATA___INVALID("Data Invalid"),
  /**
   * The referenced dataset is not supported by the system.
   * <p>
   */
  @XmlEnumValue("Data Not Supported")
  DATA___NOT___SUPPORTED("Data Not Supported"),
  /**
   * The referenced dataset is being recalled.
   * <p>
   */
  @XmlEnumValue("Data Recall")
  DATA___RECALL("Data Recall"),
  /**
   * The received dataset does not fulfill the requirement.
   * <p>
   */
  @XmlEnumValue("Data Rejected")
  DATA___REJECTED("Data Rejected"),
  /**
   * The referenced datasets should be removed from the recipient local
   * repository
   * <p>
   */
  @XmlEnumValue("Data Deleted")
  DATA___DELETED("Data Deleted"),
  /**
   * The referenced dataset has been rejected because of missing
   * cross-references.
   * <p>
   */
  @XmlEnumValue("Missing Refs")
  MISSING___REFS("Missing Refs"),
  /**
   * The dataset is no longer Active, but may be reactivated at a future date
   * <p>
   */
  @XmlEnumValue("Data Retired")
  DATA___RETIRED("Data Retired");
  private final String value;

  ListCDR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCDR fromValue(String v) {
    for (ListCDR c : ListCDR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
