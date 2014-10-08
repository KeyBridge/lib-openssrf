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
import us.gov.dod.standard.ssrf._3_1.ssrequest.DiagramEndpoint;

/**
 * Enumerated values for fields using the ListCIC type.
 * <p>
 * Used in {@link DiagramEndpoint}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCIC")
@XmlEnum
public enum ListCIC {

  @XmlEnumValue("Airborne")
  AIRBORNE("Airborne"),
  @XmlEnumValue("Earth")
  EARTH("Earth"),
  @XmlEnumValue("Fixed")
  FIXED("Fixed"),
  @XmlEnumValue("Land")
  LAND("Land"),
  @XmlEnumValue("Land Mobile")
  LAND_MOBILE("Land Mobile"),
  @XmlEnumValue("METAIDS Ground")
  METAIDS_GROUND("METAIDS Ground"),
  @XmlEnumValue("METAIDS Radar")
  METAIDS_RADAR("METAIDS Radar"),
  @XmlEnumValue("METAIDS Radiosonde")
  METAIDS_RADIOSONDE("METAIDS Radiosonde"),
  @XmlEnumValue("Mobile Earth-Air")
  MOBILE_EARTH_AIR("Mobile Earth-Air"),
  @XmlEnumValue("Mobile Earth-Land")
  MOBILE_EARTH_LAND("Mobile Earth-Land"),
  @XmlEnumValue("Mobile Earth-Sea")
  MOBILE_EARTH_SEA("Mobile Earth-Sea"),
  @XmlEnumValue("Radar-Air")
  RADAR_AIR("Radar-Air"),
  @XmlEnumValue("Radar-Land")
  RADAR_LAND("Radar-Land"),
  @XmlEnumValue("Radar-Sea")
  RADAR_SEA("Radar-Sea"),
  @XmlEnumValue("Satellite")
  SATELLITE("Satellite"),
  @XmlEnumValue("Sea")
  SEA("Sea"),
  @XmlEnumValue("Secondary Radar-Air")
  SECONDARY_RADAR_AIR("Secondary Radar-Air"),
  @XmlEnumValue("Secondary Radar-Land")
  SECONDARY_RADAR_LAND("Secondary Radar-Land"),
  @XmlEnumValue("Secondary Radar-Sea")
  SECONDARY_RADAR_SEA("Secondary Radar-Sea"),
  @XmlEnumValue("Target")
  TARGET("Target"),
  @XmlEnumValue("Transport")
  TRANSPORT("Transport"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCIC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCIC fromValue(String v) {
    for (ListCIC c : ListCIC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
