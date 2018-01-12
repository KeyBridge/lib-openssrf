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
import us.gov.dod.standard.ssrf._3_1.ssrequest.DiagramEndpoint;

/**
 * Enumerated values for fields using the ListCIC type.
 * <p>
 * Used in {@link DiagramEndpoint}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
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
