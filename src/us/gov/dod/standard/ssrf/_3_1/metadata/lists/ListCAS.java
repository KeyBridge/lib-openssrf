/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
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
  SPIRAL_("Spiral "),
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
