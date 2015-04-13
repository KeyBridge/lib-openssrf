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
import us.gov.dod.standard.ssrf._3_1.Organisation;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;

/**
 * Enumerated values for fields using the ListCTO type.
 * <p>
 * Used in {@link Nomenclature}, {@link Organisation}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCTO")
@XmlEnum
public enum ListCTO {

  @XmlEnumValue("Civilian/Commercial")
  CIVILIAN_COMMERCIAL("Civilian/Commercial"),
  @XmlEnumValue("Generic")
  GENERIC("Generic"),
  @XmlEnumValue("Government ")
  GOVERNMENT("Government "),
  @XmlEnumValue("Military")
  MILITARY("Military"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCTO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCTO fromValue(String v) {
    for (ListCTO c : ListCTO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
