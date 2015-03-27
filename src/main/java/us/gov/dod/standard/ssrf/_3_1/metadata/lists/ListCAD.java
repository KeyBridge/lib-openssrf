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
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;

/**
 * Enumerated values for fields using the ListCAD type.
 * <p>
 * Used in {@link AntMode}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAD")
@XmlEnum
public enum ListCAD {

  @XmlEnumValue("Directional")
  DIRECTIONAL("Directional"),
  @XmlEnumValue("Non-Dir Or Omni")
  NON_DIR_OR_OMNI("Non-Dir Or Omni"),
  @XmlEnumValue("Rotating")
  ROTATING("Rotating"),
  @XmlEnumValue("Sector Scan H")
  SECTOR_SCAN_H("Sector Scan H"),
  @XmlEnumValue("Sector Scan V")
  SECTOR_SCAN_V("Sector Scan V"),
  @XmlEnumValue("Steerable")
  STEERABLE("Steerable"),
  @XmlEnumValue("Tracking")
  TRACKING("Tracking"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCAD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAD fromValue(String v) {
    for (ListCAD c : ListCAD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
