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
package us.gov.dod.standard.ssrf._3_0.enumerate;

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
 * &lt;simpleType name="ListCAS"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="360
 * Degrees Rotating"/> &lt;enumeration value="Bi-Directional Sector"/>
 * &lt;enumeration value="Conical"/> &lt;enumeration value="Electronic Scan (360
 * Degrees)"/> &lt;enumeration value="Electronic Scan (Sector)"/>
 * &lt;enumeration value="Fixed"/> &lt;enumeration value="Fixed-3 Axis
 * Stabilised"/> &lt;enumeration value="Helical"/> &lt;enumeration
 * value="Horizontal"/> &lt;enumeration value="Lobing"/> &lt;enumeration
 * value="Manual"/> &lt;enumeration value="Mechanically Steerable"/>
 * &lt;enumeration value="Palmer Raster"/> &lt;enumeration value="Raster"/>
 * &lt;enumeration value="Sector Scan"/> &lt;enumeration value="Spiral "/>
 * &lt;enumeration value="Tracker"/> &lt;enumeration value="Unidirectional
 * Sector"/> &lt;enumeration value="Vertical"/> &lt;enumeration value="Other"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCAS")
@XmlEnum
public enum ListCAS {

  @XmlEnumValue("360 Degrees Rotating")
  VALUE_1("360 Degrees Rotating"),
  @XmlEnumValue("Bi-Directional Sector")
  VALUE_2("Bi-Directional Sector"),
  @XmlEnumValue("Conical")
  VALUE_3("Conical"),
  @XmlEnumValue("Electronic Scan (360 Degrees)")
  VALUE_4("Electronic Scan (360 Degrees)"),
  @XmlEnumValue("Electronic Scan (Sector)")
  VALUE_5("Electronic Scan (Sector)"),
  @XmlEnumValue("Fixed")
  VALUE_6("Fixed"),
  @XmlEnumValue("Fixed-3 Axis Stabilised")
  VALUE_7("Fixed-3 Axis Stabilised"),
  @XmlEnumValue("Helical")
  VALUE_8("Helical"),
  @XmlEnumValue("Horizontal")
  VALUE_9("Horizontal"),
  @XmlEnumValue("Lobing")
  VALUE_10("Lobing"),
  @XmlEnumValue("Manual")
  VALUE_11("Manual"),
  @XmlEnumValue("Mechanically Steerable")
  VALUE_12("Mechanically Steerable"),
  @XmlEnumValue("Palmer Raster")
  VALUE_13("Palmer Raster"),
  @XmlEnumValue("Raster")
  VALUE_14("Raster"),
  @XmlEnumValue("Sector Scan")
  VALUE_15("Sector Scan"),
  @XmlEnumValue("Spiral ")
  VALUE_16("Spiral "),
  @XmlEnumValue("Tracker")
  VALUE_17("Tracker"),
  @XmlEnumValue("Unidirectional Sector")
  VALUE_18("Unidirectional Sector"),
  @XmlEnumValue("Vertical")
  VALUE_19("Vertical"),
  @XmlEnumValue("Other")
  VALUE_20("Other");
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
