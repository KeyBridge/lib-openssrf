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
 * Enumerated values for fields using the ListUPU type.
 * <p>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUPU")
@XmlEnum
public enum ListUPU {

  @XmlEnumValue("Repeater Out")
  REPEATER_OUT("Repeater Out"),
  @XmlEnumValue("Repeater In")
  REPEATER_IN("Repeater In"),
  @XmlEnumValue("Duplex Pairing")
  DUPLEX_PAIRING("Duplex Pairing"),
  @XmlEnumValue("Frequency Diversity")
  FREQUENCY_DIVERSITY("Frequency Diversity"),
  @XmlEnumValue("Space Diversity")
  SPACE_DIVERSITY("Space Diversity"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUPU(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUPU fromValue(String v) {
    for (ListUPU c : ListUPU.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
