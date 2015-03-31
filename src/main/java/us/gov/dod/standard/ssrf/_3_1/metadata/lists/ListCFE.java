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
import us.gov.dod.standard.ssrf._3_1.ForceElement;

/**
 * Enumerated values for fields using the ListCFE type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCFE")
@XmlEnum
public enum ListCFE {

  @XmlEnumValue("Specific Platform")
  SPECIFIC_PLATFORM("Specific Platform"),
  @XmlEnumValue("Platform Class")
  PLATFORM_CLASS("Platform Class"),
  @XmlEnumValue("Specific Weapon")
  SPECIFIC_WEAPON("Specific Weapon"),
  @XmlEnumValue("Weapon Class")
  WEAPON_CLASS("Weapon Class"),
  @XmlEnumValue("Unit")
  UNIT("Unit");
  private final String value;

  ListCFE(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCFE fromValue(String v) {
    for (ListCFE c : ListCFE.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
