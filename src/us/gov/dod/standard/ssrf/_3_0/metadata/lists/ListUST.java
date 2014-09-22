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
 * Java class for ListUST.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListUST"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="ACCEPTED BY"/> &lt;enumeration value="ACTIVATED BY"/> &lt;enumeration
 * value="ADMIN MOD BY"/> &lt;enumeration value="APPROVED BY"/> &lt;enumeration
 * value="ASSIGNED BY"/> &lt;enumeration value="AUTHORISED BY"/> &lt;enumeration
 * value="COMMENT BY"/> &lt;enumeration value="COMPLIANCE"/> &lt;enumeration
 * value="COORDINATION (from, to list)"/> &lt;enumeration value="DELETED BY"/>
 * &lt;enumeration value="EXPIRED BY"/> &lt;enumeration value="FORWARDED (from,
 * to)"/> &lt;enumeration value="IMPORTED BY"/> &lt;enumeration
 * value="IN-PROCESS AT"/> &lt;enumeration value="INFO (from, to list)"/>
 * &lt;enumeration value="LATERAL COORDINATION"/> &lt;enumeration
 * value="MODIFIED BY"/> &lt;enumeration value="NOTIFIED BY"/> &lt;enumeration
 * value="ORIGINATED BY"/> &lt;enumeration value="RECALLED (from, to)"/>
 * &lt;enumeration value="RECEIVED BY"/> &lt;enumeration value="REGISTERED
 * WITH"/> &lt;enumeration value="REJECTED (from, to)"/> &lt;enumeration
 * value="RESOLVED (from, to)"/> &lt;enumeration value="REVIEW REQUIRED (from,
 * to)"/> &lt;enumeration value="SUBMITTED TO"/> &lt;enumeration value="TABLED
 * BY"/> &lt;enumeration value="EXPORT BY"/> &lt;enumeration value="IMPORT BY"/>
 * &lt;enumeration value="UNAPPROVED BY"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUST")
@XmlEnum
public enum ListUST {

  @XmlEnumValue("ACCEPTED BY")
  ACCEPTED_BY("ACCEPTED BY"),
  @XmlEnumValue("ACTIVATED BY")
  ACTIVATED_BY("ACTIVATED BY"),
  @XmlEnumValue("ADMIN MOD BY")
  ADMIN_MOD_BY("ADMIN MOD BY"),
  @XmlEnumValue("APPROVED BY")
  APPROVED_BY("APPROVED BY"),
  @XmlEnumValue("ASSIGNED BY")
  ASSIGNED_BY("ASSIGNED BY"),
  @XmlEnumValue("AUTHORISED BY")
  AUTHORISED_BY("AUTHORISED BY"),
  @XmlEnumValue("COMMENT BY")
  COMMENT_BY("COMMENT BY"),
  COMPLIANCE("COMPLIANCE"),
  @XmlEnumValue("COORDINATION (from, to list)")
  COORDINATION_FROM_TO_LIST("COORDINATION (from, to list)"),
  @XmlEnumValue("DELETED BY")
  DELETED_BY("DELETED BY"),
  @XmlEnumValue("EXPIRED BY")
  EXPIRED_BY("EXPIRED BY"),
  @XmlEnumValue("FORWARDED (from, to)")
  FORWARDED_FROM_TO("FORWARDED (from, to)"),
  @XmlEnumValue("IMPORTED BY")
  IMPORTED_BY("IMPORTED BY"),
  @XmlEnumValue("IN-PROCESS AT")
  IN_PROCESS_AT("IN-PROCESS AT"),
  @XmlEnumValue("INFO (from, to list)")
  INFO_FROM_TO_LIST("INFO (from, to list)"),
  @XmlEnumValue("LATERAL COORDINATION")
  LATERAL_COORDINATION("LATERAL COORDINATION"),
  @XmlEnumValue("MODIFIED BY")
  MODIFIED_BY("MODIFIED BY"),
  @XmlEnumValue("NOTIFIED BY")
  NOTIFIED_BY("NOTIFIED BY"),
  @XmlEnumValue("ORIGINATED BY")
  ORIGINATED_BY("ORIGINATED BY"),
  @XmlEnumValue("RECALLED (from, to)")
  RECALLED_FROM_TO("RECALLED (from, to)"),
  @XmlEnumValue("RECEIVED BY")
  RECEIVED_BY("RECEIVED BY"),
  @XmlEnumValue("REGISTERED WITH")
  REGISTERED_WITH("REGISTERED WITH"),
  @XmlEnumValue("REJECTED (from, to)")
  REJECTED_FROM_TO("REJECTED (from, to)"),
  @XmlEnumValue("RESOLVED (from, to)")
  RESOLVED_FROM_TO("RESOLVED (from, to)"),
  @XmlEnumValue("REVIEW REQUIRED (from, to)")
  REVIEW_REQUIRED_FROM_TO("REVIEW REQUIRED (from, to)"),
  @XmlEnumValue("SUBMITTED TO")
  SUBMITTED_TO("SUBMITTED TO"),
  @XmlEnumValue("TABLED BY")
  TABLED_BY("TABLED BY"),
  @XmlEnumValue("EXPORT BY")
  EXPORT_BY("EXPORT BY"),
  @XmlEnumValue("IMPORT BY")
  IMPORT_BY("IMPORT BY"),
  @XmlEnumValue("UNAPPROVED BY")
  UNAPPROVED_BY("UNAPPROVED BY");
  private final String value;

  ListUST(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUST fromValue(String v) {
    for (ListUST c : ListUST.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
