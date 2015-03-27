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
 * Enumerated values for fields using the ListCAS type.
 * <p>
 * Used in {@link AntMode}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAS")
@XmlEnum
public enum ListCAS {

  @XmlEnumValue("360 Degrees Rotating")
  THREE_60_DEGREES_ROTATING("360 Degrees Rotating"),
  @XmlEnumValue("Bi-Directional Sector")
  BI_DIRECTIONAL_SECTOR("Bi-Directional Sector"),
  @XmlEnumValue("Conical")
  CONICAL("Conical"),
  @XmlEnumValue("Electronic Scan (360 Degrees)")
  ELECTRONIC_SCAN_360_DEGREES("Electronic Scan (360 Degrees)"),
  @XmlEnumValue("Electronic Scan (Sector)")
  ELECTRONIC_SCAN_SECTOR("Electronic Scan (Sector)"),
  @XmlEnumValue("Fixed")
  FIXED("Fixed"),
  @XmlEnumValue("Fixed-3 Axis Stabilised")
  FIXED_3_AXIS_STABILISED("Fixed-3 Axis Stabilised"),
  @XmlEnumValue("Helical")
  HELICAL("Helical"),
  @XmlEnumValue("Horizontal")
  HORIZONTAL("Horizontal"),
  @XmlEnumValue("Lobing")
  LOBING("Lobing"),
  @XmlEnumValue("Manual")
  MANUAL("Manual"),
  @XmlEnumValue("Mechanically Steerable")
  MECHANICALLY_STEERABLE("Mechanically Steerable"),
  @XmlEnumValue("Palmer Raster")
  PALMER_RASTER("Palmer Raster"),
  @XmlEnumValue("Raster")
  RASTER("Raster"),
  @XmlEnumValue("Sector Scan")
  SECTOR_SCAN("Sector Scan"),
  @XmlEnumValue("Spiral ")
  SPIRAL("Spiral "),
  @XmlEnumValue("Tracker")
  TRACKER("Tracker"),
  @XmlEnumValue("Unidirectional Sector")
  UNIDIRECTIONAL_SECTOR("Unidirectional Sector"),
  @XmlEnumValue("Vertical")
  VERTICAL("Vertical"),
  /**
   * If selected, a clarifying remark SHOULD be entered
   */
  @XmlEnumValue("Other")
  OTHER("Other");

  private final String value;

  ListCAS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAS fromValue(String v) {
    for (ListCAS c : ListCAS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
