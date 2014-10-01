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
import us.gov.dod.standard.ssrf._3_1.Satellite;

/**
 * Enumerated values for fields using the ListCSP type.
 * <p>
 * Used in {@link Satellite}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
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
  HIGHLY_ELLIPTIC__HEO__("Highly Elliptic (HEO)"),
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
