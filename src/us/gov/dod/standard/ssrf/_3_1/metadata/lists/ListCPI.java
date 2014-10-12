/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListCPI type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCPI")
@XmlEnum
public enum ListCPI {

  @XmlEnumValue("International Approval")
  INTERNATIONAL_APPROVAL("International Approval"),
  @XmlEnumValue("Local Approval")
  LOCAL_APPROVAL("Local Approval"),
  @XmlEnumValue("National Approval")
  NATIONAL_APPROVAL("National Approval"),
  @XmlEnumValue("Outside National Boundaries")
  OUTSIDE_NATIONAL_BOUNDARIES("Outside National Boundaries"),
  @XmlEnumValue("Other")
  OTHER("Other");
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
