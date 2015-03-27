/* 
 * Copyright 2014 Key Bridge LLC.
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
import us.gov.dod.standard.ssrf._3_1.Allotment;
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListCUT type.
 * <p>
 * Used in {@link Allotment}, {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCUT")
@XmlEnum
public enum ListCUT {

  @XmlEnumValue("Request Temporary")
  REQUEST_TEMPORARY("Request Temporary"),
  @XmlEnumValue("Request Permanent")
  REQUEST_PERMANENT("Request Permanent"),
  @XmlEnumValue("Approved Temporary")
  APPROVED_TEMPORARY("Approved Temporary"),
  @XmlEnumValue("Approved Permanent")
  APPROVED_PERMANENT("Approved Permanent"),
  @XmlEnumValue("Cancelled/Rejected")
  CANCELLED_REJECTED("Cancelled/Rejected"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCUT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCUT fromValue(String v) {
    for (ListCUT c : ListCUT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
