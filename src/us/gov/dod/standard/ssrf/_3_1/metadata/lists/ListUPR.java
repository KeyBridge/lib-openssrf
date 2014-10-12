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
import us.gov.dod.standard.ssrf._3_1.IntfReport;

/**
 * Enumerated values for fields using the ListUPR type.
 * <p>
 * Used in {@link IntfReport}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUPR")
@XmlEnum
public enum ListUPR {

  @XmlEnumValue("Priority 1 Strategic Order")
  PRIORITY_1_STRATEGIC_ORDER("Priority 1 Strategic Order"),
  @XmlEnumValue("Priority 2 Tasked Plan Execution")
  PRIORITY_2_TASKED_PLAN_EXECUTION("Priority 2 Tasked Plan Execution"),
  @XmlEnumValue("Priority 3 Essential Operational Support")
  PRIORITY_3_ESSENTIAL_OPERATIONAL_SUPPORT("Priority 3 Essential Operational Support"),
  @XmlEnumValue("Priority 4 Training")
  PRIORITY_4_TRAINING("Priority 4 Training"),
  @XmlEnumValue("Priority 5 VIP Support")
  PRIORITY_5_VIP_SUPPORT("Priority 5 VIP Support"),
  @XmlEnumValue("Priority 6 RDT&E and General")
  PRIORITY_6_RDT_E_AND_GENERAL("Priority 6 RDT&E and General"),
  @XmlEnumValue("Priority 7 Miscellaneous")
  PRIORITY_7_MISCELLANEOUS("Priority 7 Miscellaneous"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUPR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUPR fromValue(String v) {
    for (ListUPR c : ListUPR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
