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
import us.gov.dod.standard.ssrf._3_1.radiationplan.JammingPlan;

/**
 * Enumerated values for fields using the ListUWF type.
 * <p>
 * Used in {@link JammingPlan}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUWF")
@XmlEnum
public enum ListUWF {

  @XmlEnumValue("Date/Time")
  DATE_TIME("Date/Time"),
  @XmlEnumValue("Never")
  NEVER("Never"),
  @XmlEnumValue("Signal Detected")
  SIGNAL_DETECTED("Signal Detected"),
  @XmlEnumValue("Signal Not Detected")
  SIGNAL_NOT_DETECTED("Signal Not Detected"),
  @XmlEnumValue("Troops in Contact")
  TROOPS_IN_CONTACT("Troops in Contact"),
  @XmlEnumValue("Troops in Region")
  TROOPS_IN_REGION("Troops in Region"),
  @XmlEnumValue("Troops Not in Contact")
  TROOPS_NOT_IN_CONTACT("Troops Not in Contact"),
  @XmlEnumValue("Troops Not in Region")
  TROOPS_NOT_IN_REGION("Troops Not in Region"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUWF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUWF fromValue(String v) {
    for (ListUWF c : ListUWF.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
