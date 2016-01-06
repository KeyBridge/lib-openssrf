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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Enumerated values for fields using the ListUST type.
 * <p>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
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
  UNAPPROVED_BY("UNAPPROVED BY"),
  @XmlEnumValue("Other")
  OTHER("Other");
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
