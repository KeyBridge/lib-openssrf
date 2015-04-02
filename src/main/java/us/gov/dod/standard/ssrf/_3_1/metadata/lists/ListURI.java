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
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListURI type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListURI")
@XmlEnum
public enum ListURI {

  @XmlEnumValue("Routine Application")
  ROUTINE_APPLICATION("Routine Application"),
  @XmlEnumValue("Regular Application")
  REGULAR_APPLICATION("Regular Application"),
  @XmlEnumValue("Aeronautical Assignment Group (AAG) Application")
  AERONAUTICAL_ASSIGNMENT_GROUP_AAG_APPLICATION("Aeronautical Assignment Group (AAG) Application"),
  @XmlEnumValue("Marine Assignment Group (MAG) Application")
  MARINE_ASSIGNMENT_GROUP_MAG_APPLICATION("Marine Assignment Group (MAG) Application"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListURI(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListURI fromValue(String v) {
    for (ListURI c : ListURI.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
