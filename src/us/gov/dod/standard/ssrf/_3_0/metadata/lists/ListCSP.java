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
 * Java class for ListCSP.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCSP"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration value="Deep
 * Eccentric"/> &lt;enumeration value="Deep Space"/> &lt;enumeration value="GEO
 * Drift"/> &lt;enumeration value="GEO Inclined"/> &lt;enumeration value="GEO
 * Inclined Drift"/> &lt;enumeration value="GEO Near-Synchronous"/>
 * &lt;enumeration value="GEO Stationary"/> &lt;enumeration value="GEO
 * Synchronous"/> &lt;enumeration value="GEO Transfer"/> &lt;enumeration
 * value="Heliocentric"/> &lt;enumeration value="Highly Elliptic (HEO)"/>
 * &lt;enumeration value="LEO"/> &lt;enumeration value="LEO Equatorial"/>
 * &lt;enumeration value="LEO Intermediate"/> &lt;enumeration value="LEO
 * Polar"/> &lt;enumeration value="LEO Retrograde"/> &lt;enumeration value="LEO
 * Sun-Synchronous"/> &lt;enumeration value="Lunar"/> &lt;enumeration
 * value="MEO"/> &lt;enumeration value="Molniya"/> &lt;enumeration
 * value="Non-Earth"/> &lt;enumeration value="Non-GEO"/> &lt;enumeration
 * value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCSP")
@XmlEnum
public enum ListCSP {

  @XmlEnumValue("Deep Eccentric")
  DEEP_ECCENTRIC("Deep Eccentric"),
  @XmlEnumValue("Deep Space")
  DEEP_SPACE("Deep Space"),
  @XmlEnumValue("GEO Drift")
  GEO_DRIFT("GEO Drift"),
  @XmlEnumValue("GEO Inclined")
  GEO_INCLINED("GEO Inclined"),
  @XmlEnumValue("GEO Inclined Drift")
  GEO_INCLINED_DRIFT("GEO Inclined Drift"),
  @XmlEnumValue("GEO Near-Synchronous")
  GEO_NEAR_SYNCHRONOUS("GEO Near-Synchronous"),
  @XmlEnumValue("GEO Stationary")
  GEO_STATIONARY("GEO Stationary"),
  @XmlEnumValue("GEO Synchronous")
  GEO_SYNCHRONOUS("GEO Synchronous"),
  @XmlEnumValue("GEO Transfer")
  GEO_TRANSFER("GEO Transfer"),
  @XmlEnumValue("Heliocentric")
  HELIOCENTRIC("Heliocentric"),
  @XmlEnumValue("Highly Elliptic (HEO)")
  HIGHLY_ELLIPTIC_HEO("Highly Elliptic (HEO)"),
  LEO("LEO"),
  @XmlEnumValue("LEO Equatorial")
  LEO_EQUATORIAL("LEO Equatorial"),
  @XmlEnumValue("LEO Intermediate")
  LEO_INTERMEDIATE("LEO Intermediate"),
  @XmlEnumValue("LEO Polar")
  LEO_POLAR("LEO Polar"),
  @XmlEnumValue("LEO Retrograde")
  LEO_RETROGRADE("LEO Retrograde"),
  @XmlEnumValue("LEO Sun-Synchronous")
  LEO_SUN_SYNCHRONOUS("LEO Sun-Synchronous"),
  @XmlEnumValue("Lunar")
  LUNAR("Lunar"),
  MEO("MEO"),
  @XmlEnumValue("Molniya")
  MOLNIYA("Molniya"),
  @XmlEnumValue("Non-Earth")
  NON_EARTH("Non-Earth"),
  @XmlEnumValue("Non-GEO")
  NON_GEO("Non-GEO"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCSP(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSP fromValue(String v) {
    for (ListCSP c : ListCSP.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
