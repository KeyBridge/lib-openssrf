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
import us.gov.dod.standard.ssrf._3_1.transmitter.TxModulation;

/**
 * Enumerated values for fields using the ListCFM type.
 * <p>
 * Used in {@link TxModulation}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCFM")
@XmlEnum
public enum ListCFM {

  @XmlEnumValue("Multichannel")
  MULTICHANNEL("Multichannel"),
  @XmlEnumValue("Per Channel ")
  PER_CHANNEL("Per Channel ");
  private final String value;

  ListCFM(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCFM fromValue(String v) {
    for (ListCFM c : ListCFM.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
