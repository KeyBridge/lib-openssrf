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
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPerformance;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPlan;

/**
 * Enumerated values for fields using the ListUWB type.
 * <p>
 * Used in {@link JammingPerformance}, {@link JammingPlan}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUWB")
@XmlEnum
public enum ListUWB {

  @XmlEnumValue("Fully Effective")
  FULLY_EFFECTIVE("Fully Effective"),
  @XmlEnumValue("Not Effective")
  NOT_EFFECTIVE("Not Effective"),
  @XmlEnumValue("Partially Effective")
  PARTIALLY_EFFECTIVE("Partially Effective"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUWB(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUWB fromValue(String v) {
    for (ListUWB c : ListUWB.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
