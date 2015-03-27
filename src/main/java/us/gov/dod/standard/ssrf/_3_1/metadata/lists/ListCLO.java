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
import us.gov.dod.standard.ssrf._3_1.receiver.FreqConversion;

/**
 * Enumerated values for fields using the ListCLO type.
 * <p>
 * Used in {@link FreqConversion}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCLO")
@XmlEnum
public enum ListCLO {

  @XmlEnumValue("LO above or below RF")
  LO_ABOVE_OR_BELOW_RF("LO above or below RF"),
  @XmlEnumValue("LO above RF")
  LO_ABOVE_RF("LO above RF"),
  @XmlEnumValue("LO below RF")
  LO_BELOW_RF("LO below RF");
  private final String value;

  ListCLO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCLO fromValue(String v) {
    for (ListCLO c : ListCLO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
