/*
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCAS.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCAS">
 *   &lt;restriction base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50">
 *     &lt;enumeration value="360 Degrees Rotating"/>
 *     &lt;enumeration value="Bi-Directional Sector"/>
 *     &lt;enumeration value="Conical"/>
 *     &lt;enumeration value="Electronic Scan (360 Degrees)"/>
 *     &lt;enumeration value="Electronic Scan (Sector)"/>
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="Fixed-3 Axis Stabilised"/>
 *     &lt;enumeration value="Helical"/>
 *     &lt;enumeration value="Horizontal"/>
 *     &lt;enumeration value="Lobing"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Mechanically Steerable"/>
 *     &lt;enumeration value="Palmer Raster"/>
 *     &lt;enumeration value="Raster"/>
 *     &lt;enumeration value="Sector Scan"/>
 *     &lt;enumeration value="Spiral "/>
 *     &lt;enumeration value="Tracker"/>
 *     &lt;enumeration value="Unidirectional Sector"/>
 *     &lt;enumeration value="Vertical"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCAS")
@XmlEnum
public enum ListCAS {

  @XmlEnumValue("360 Degrees Rotating")
  THREEHUNDEREDSIXTY_DEGREES_ROTATING,
  @XmlEnumValue("Bi-Directional Sector")
  BI_DIRECTIONAL_SECTOR,
  @XmlEnumValue("Conical")
  CONICAL,
  @XmlEnumValue("Electronic Scan (360 Degrees)")
  ELECTRONIC_SCAN_360_DEGREES,
  @XmlEnumValue("Electronic Scan (Sector)")
  ELECTRONIC_SCAN_SECTOR,
  @XmlEnumValue("Fixed")
  FIXED,
  @XmlEnumValue("Fixed-3 Axis Stabilised")
  FIXED_3_AXIS_STABILISED,
  @XmlEnumValue("Helical")
  HELICAL,
  @XmlEnumValue("Horizontal")
  HORIZONTAL,
  @XmlEnumValue("Lobing")
  LOBING,
  @XmlEnumValue("Manual")
  MANUAL,
  @XmlEnumValue("Mechanically Steerable")
  MECHANICALLY_STEERABLE,
  @XmlEnumValue("Palmer Raster")
  PALMER_RASTER,
  @XmlEnumValue("Raster")
  RASTER,
  @XmlEnumValue("Sector Scan")
  SECTOR_SCAN,
  @XmlEnumValue("Spiral ")
  SPIRAL_,
  @XmlEnumValue("Tracker")
  TRACKER,
  @XmlEnumValue("Unidirectional Sector")
  UNIDIRECTIONAL_SECTOR,
  @XmlEnumValue("Vertical")
  VERTICAL,
  @XmlEnumValue("Other")
  OTHER;

  public String value() {
    return name();
  }

  public static ListCAS fromValue(String v) {
    for (ListCAS c : ListCAS.values()) {
      if (c.name().equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String enumValue() {
    return this.value();
  }

}
