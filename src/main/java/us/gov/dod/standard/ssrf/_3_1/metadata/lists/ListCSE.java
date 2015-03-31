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
import us.gov.dod.standard.ssrf._3_1.receiver.RxMode;

/**
 * Enumerated values for fields using the ListCSE type.
 * <p>
 * Used in {@link RxMode}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCSE")
@XmlEnum
public enum ListCSE {

  @XmlEnumValue("Pulse Width Opposition")
  PULSE_WIDTH_OPPOSITION("Pulse Width Opposition"),
  @XmlEnumValue("Bit Error Rate")
  BIT_ERROR_RATE("Bit Error Rate"),
  @XmlEnumValue("Minimum Discernible Signal")
  MINIMUM_DISCERNIBLE_SIGNAL("Minimum Discernible Signal"),
  @XmlEnumValue("Minimum Target Recognition")
  MINIMUM_TARGET_RECOGNITION("Minimum Target Recognition"),
  SINAD("SINAD"),
  @XmlEnumValue("S/N")
  S_N("S/N"),
  @XmlEnumValue("(S+N)/N")
  S_N_N("(S+N)/N");
  private final String value;

  ListCSE(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSE fromValue(String v) {
    for (ListCSE c : ListCSE.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
