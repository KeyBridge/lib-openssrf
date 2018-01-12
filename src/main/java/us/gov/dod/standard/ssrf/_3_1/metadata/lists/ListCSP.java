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
import us.gov.dod.standard.ssrf._3_1.Satellite;

/**
 * Enumerated values for fields using the ListCSP type.
 * <p>
 * Used in {@link Satellite}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
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
