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
 * Java class for ListCPO.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCPO"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="45-degrees"/> &lt;enumeration value="Left-hand circular"/>
 * &lt;enumeration value="Right-hand circular"/> &lt;enumeration value="Dual"/>
 * &lt;enumeration value="Elliptical"/> &lt;enumeration value="Elliptic left"/>
 * &lt;enumeration value="Elliptic right"/> &lt;enumeration value="Horizontal
 * linear"/> &lt;enumeration value="Horizontal and vertical"/> &lt;enumeration
 * value="Linear"/> &lt;enumeration value="Mixed"/> &lt;enumeration
 * value="Oblique, angled, crossed"/> &lt;enumeration value="Rotating"/>
 * &lt;enumeration value="Right-hand slant"/> &lt;enumeration value="Left-hand
 * slant"/> &lt;enumeration value="Right and left-hand circular"/>
 * &lt;enumeration value="Vertical linear"/> &lt;enumeration value="Other or
 * unknown"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCPO")
@XmlEnum
public enum ListCPO {

  @XmlEnumValue("45-degrees")
  FOURTYFIVE_DEGREES,
  @XmlEnumValue("Left-hand circular")
  LEFT_HAND_CIRCULAR,
  @XmlEnumValue("Right-hand circular")
  RIGHT_HAND_CIRCULAR,
  @XmlEnumValue("Dual")
  DUAL,
  @XmlEnumValue("Elliptical")
  ELLIPTICAL,
  @XmlEnumValue("Elliptic left")
  ELLIPTIC_LEFT,
  @XmlEnumValue("Elliptic right")
  ELLIPTIC_RIGHT,
  @XmlEnumValue("Horizontal linear")
  HORIZONTAL_LINEAR,
  @XmlEnumValue("Horizontal and vertical")
  HORIZONTAL_AND_VERTICAL,
  @XmlEnumValue("Linear")
  LINEAR,
  @XmlEnumValue("Mixed")
  MIXED,
  @XmlEnumValue("Oblique, angled, crossed")
  OBLIQUE_ANGLED_CROSSED,
  @XmlEnumValue("Rotating")
  ROTATING,
  @XmlEnumValue("Right-hand slant")
  RIGHT_HAND_SLANT,
  @XmlEnumValue("Left-hand slant")
  LEFT_HAND_SLANT,
  @XmlEnumValue("Right and left-hand circular")
  RIGHT_AND_LEFT_HAND_CIRCULAR,
  @XmlEnumValue("Vertical linear")
  VERTICAL_LINEAR,
  @XmlEnumValue("Other or unknown")
  OTHER_OR_UNKNOWN;

  public String value() {
    return name();
  }

  public static ListCPO fromValue(String v) {
    for (ListCPO c : ListCPO.values()) {
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
