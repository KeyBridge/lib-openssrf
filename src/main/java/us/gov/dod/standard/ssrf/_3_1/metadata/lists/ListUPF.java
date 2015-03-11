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
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListUPF type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUPF")
@XmlEnum
public enum ListUPF {

  @XmlEnumValue("Air/ground/air")
  AIR_GROUND_AIR("Air/ground/air"),
  @XmlEnumValue("Air to air")
  AIR_TO_AIR("Air to air"),
  @XmlEnumValue("Air/ground/air pool")
  AIR_GROUND_AIR_POOL("Air/ground/air pool"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUPF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUPF fromValue(String v) {
    for (ListUPF c : ListUPF.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
