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
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;

/**
 * Enumerated values for fields using the ListUS5 type.
 * <p>
 * Used in {@link Nomenclature}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUS5")
@XmlEnum
public enum ListUS5 {

  @XmlEnumValue("Associated Equipment")
  ASSOCIATED_EQUIPMENT("Associated Equipment"),
  @XmlEnumValue("Associated Platform")
  ASSOCIATED_PLATFORM("Associated Platform"),
  @XmlEnumValue("Associated Unit")
  ASSOCIATED_UNIT("Associated Unit"),
  @XmlEnumValue("Associated Weapon")
  ASSOCIATED_WEAPON("Associated Weapon"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUS5(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUS5 fromValue(String v) {
    for (ListUS5 c : ListUS5.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
