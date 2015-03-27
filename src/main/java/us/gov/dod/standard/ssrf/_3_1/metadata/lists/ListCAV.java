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
import us.gov.dod.standard.ssrf._3_1.toa.Variance;

/**
 * Enumerated values for fields using the ListCAV type.
 * <p>
 * This is used to identify a Variance TYPE.
 * <p>
 * Used in {@link Variance}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAV")
@XmlEnum
public enum ListCAV {

  /**
   * Addition. Indicates that this variance service type extends (e.g.
   * supplements) the parent allocation.
   */
  @XmlEnumValue("Additional")
  ADDITIONAL("Additional"),
  /**
   * Modification. Indicates that this variance service type changes (e.g.
   * modifies) the parent allocation.
   */
  @XmlEnumValue("Different")
  DIFFERENT("Different");
  /**
   * Exclude. (Unofficial). Indicates that this variance service type is NOT
   * allowed (e.g. excluded) from the parent allocation.
   */
//  @XmlEnumValue("Exclude")  EXCLUDE("Exclude");

  private final String value;

  ListCAV(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAV fromValue(String v) {
    for (ListCAV c : ListCAV.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
