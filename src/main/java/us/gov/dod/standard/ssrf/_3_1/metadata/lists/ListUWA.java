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
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPerformance;
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPlan;

/**
 * Enumerated values for fields using the ListUWA type.
 * <p>
 * Used in {@link JammingPerformance}, {@link JammingPlan}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUWA")
@XmlEnum
public enum ListUWA {

  @XmlEnumValue("Deception")
  DECEPTION("Deception"),
  @XmlEnumValue("Degradation")
  DEGRADATION("Degradation"),
  @XmlEnumValue("Denial")
  DENIAL("Denial"),
  @XmlEnumValue("Destruction")
  DESTRUCTION("Destruction"),
  @XmlEnumValue("Disruption")
  DISRUPTION("Disruption"),
  @XmlEnumValue("Intrusion")
  INTRUSION("Intrusion"),
  @XmlEnumValue("Masking")
  MASKING("Masking"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUWA(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUWA fromValue(String v) {
    for (ListUWA c : ListUWA.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
