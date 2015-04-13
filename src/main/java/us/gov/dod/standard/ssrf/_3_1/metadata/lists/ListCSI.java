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
import us.gov.dod.standard.ssrf._3_1.transmitter.TxModulation;

/**
 * Enumerated values for fields using the ListCSI type.
 * <p>
 * Used in {@link TxModulation}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCSI")
@XmlEnum
public enum ListCSI {

  @XmlEnumValue("Lower sideband")
  LOWER_SIDEBAND("Lower sideband"),
  @XmlEnumValue("Upper sideband")
  UPPER_SIDEBAND("Upper sideband");
  private final String value;

  ListCSI(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSI fromValue(String v) {
    for (ListCSI c : ListCSI.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
