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
import us.gov.dod.standard.ssrf._3_1.multiple.Notation;
import us.gov.dod.standard.ssrf._3_1.multiple.NotationTimeline;

/**
 * Enumerated values for fields using the ListUNT type.
 * <p>
 * Used in {@link Notation}, {@link NotationTimeline}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUNT")
@XmlEnum
public enum ListUNT {

  @XmlEnumValue("Active")
  ACTIVE("Active"),
  @XmlEnumValue("Associated")
  ASSOCIATED("Associated"),
  @XmlEnumValue("Cancelled")
  CANCELLED("Cancelled"),
  @XmlEnumValue("Future")
  FUTURE("Future"),
  @XmlEnumValue("Incorporated")
  INCORPORATED("Incorporated"),
  @XmlEnumValue("Renotated")
  RENOTATED("Renotated"),
  @XmlEnumValue("Retired")
  RETIRED("Retired"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUNT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUNT fromValue(String v) {
    for (ListUNT c : ListUNT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
