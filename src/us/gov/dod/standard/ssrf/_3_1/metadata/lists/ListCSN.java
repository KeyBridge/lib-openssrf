/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.multiple.Usage;
import us.gov.dod.standard.ssrf._3_1.toa.Allocation;
import us.gov.dod.standard.ssrf._3_1.toa.Variance;

/**
 * Enumerated values for fields using the ListCSN type.
 * <p>
 * Used in {@link Allocation}, {@link Usage}, {@link Variance}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCSN")
@XmlEnum
public enum ListCSN {

  @XmlEnumValue("Aeronautical Fixed Service")
  AERONAUTICAL_FIXED_SERVICE("Aeronautical Fixed Service"),
  @XmlEnumValue("Aeronautical Mobile (Off Route) Service")
  AERONAUTICAL_MOBILE__OFF_ROUTE__SERVICE("Aeronautical Mobile (Off Route) Service"),
  @XmlEnumValue("Aeronautical Mobile (Route) Service")
  AERONAUTICAL_MOBILE__ROUTE__SERVICE("Aeronautical Mobile (Route) Service"),
  @XmlEnumValue("Aeronautical Mobile Service")
  AERONAUTICAL_MOBILE_SERVICE("Aeronautical Mobile Service"),
  @XmlEnumValue("Aeronautical Mobile-Satellite (OR) Service")
  AERONAUTICAL_MOBILE_SATELLITE__OR__SERVICE("Aeronautical Mobile-Satellite (OR) Service"),
  @XmlEnumValue("Aeronautical Mobile-Satellite (R) Service")
  AERONAUTICAL_MOBILE_SATELLITE__R__SERVICE("Aeronautical Mobile-Satellite (R) Service"),
  @XmlEnumValue("Aeronautical Mobile-Satellite Service")
  AERONAUTICAL_MOBILE_SATELLITE_SERVICE("Aeronautical Mobile-Satellite Service"),
  @XmlEnumValue("Aeronautical Radionavigation Service")
  AERONAUTICAL_RADIONAVIGATION_SERVICE("Aeronautical Radionavigation Service"),
  @XmlEnumValue("Aeronautical Radionavigation-Satellite Service")
  AERONAUTICAL_RADIONAVIGATION_SATELLITE_SERVICE("Aeronautical Radionavigation-Satellite Service"),
  @XmlEnumValue("Amateur Service")
  AMATEUR_SERVICE("Amateur Service"),
  @XmlEnumValue("Amateur-Satellite Service")
  AMATEUR_SATELLITE_SERVICE("Amateur-Satellite Service"),
  @XmlEnumValue("Broadcasting Service")
  BROADCASTING_SERVICE("Broadcasting Service"),
  @XmlEnumValue("Broadcasting-Satellite Service")
  BROADCASTING_SATELLITE_SERVICE("Broadcasting-Satellite Service"),
  @XmlEnumValue("Earth Exploration-Satellite (active)")
  EARTH_EXPLORATION_SATELLITE__ACTIVE__("Earth Exploration-Satellite (active)"),
  @XmlEnumValue("Earth Exploration-Satellite (passive)")
  EARTH_EXPLORATION_SATELLITE__PASSIVE__("Earth Exploration-Satellite (passive)"),
  @XmlEnumValue("Earth Exploration-Satellite Service")
  EARTH_EXPLORATION_SATELLITE_SERVICE("Earth Exploration-Satellite Service"),
  @XmlEnumValue("Fixed Service")
  FIXED_SERVICE("Fixed Service"),
  @XmlEnumValue("Fixed-Satellite Service")
  FIXED_SATELLITE_SERVICE("Fixed-Satellite Service"),
  @XmlEnumValue("Inter-Satellite Service")
  INTER_SATELLITE_SERVICE("Inter-Satellite Service"),
  @XmlEnumValue("Land Mobile Service")
  LAND_MOBILE_SERVICE("Land Mobile Service"),
  @XmlEnumValue("Land Mobile-Satellite Service")
  LAND_MOBILE_SATELLITE_SERVICE("Land Mobile-Satellite Service"),
  @XmlEnumValue("Maritime Mobile Service")
  MARITIME_MOBILE_SERVICE("Maritime Mobile Service"),
  @XmlEnumValue("Maritime Mobile-Satellite Service")
  MARITIME_MOBILE_SATELLITE_SERVICE("Maritime Mobile-Satellite Service"),
  @XmlEnumValue("Maritime Radionavigation Service")
  MARITIME_RADIONAVIGATION_SERVICE("Maritime Radionavigation Service"),
  @XmlEnumValue("Maritime Radionavigation-Satellite Service")
  MARITIME_RADIONAVIGATION_SATELLITE_SERVICE("Maritime Radionavigation-Satellite Service"),
  @XmlEnumValue("Meteorological Aids Service")
  METEOROLOGICAL_AIDS_SERVICE("Meteorological Aids Service"),
  @XmlEnumValue("Meteorological-Satellite Service")
  METEOROLOGICAL_SATELLITE_SERVICE("Meteorological-Satellite Service"),
  @XmlEnumValue("Mobile Service")
  MOBILE_SERVICE("Mobile Service"),
  @XmlEnumValue("Mobile-Satellite Service")
  MOBILE_SATELLITE_SERVICE("Mobile-Satellite Service"),
  @XmlEnumValue("Radio Astronomy Service")
  RADIO_ASTRONOMY_SERVICE("Radio Astronomy Service"),
  @XmlEnumValue("Radiodetermination Service")
  RADIODETERMINATION_SERVICE("Radiodetermination Service"),
  @XmlEnumValue("Radiodetermination-Satellite Service")
  RADIODETERMINATION_SATELLITE_SERVICE("Radiodetermination-Satellite Service"),
  @XmlEnumValue("Radiolocation Service")
  RADIOLOCATION_SERVICE("Radiolocation Service"),
  @XmlEnumValue("Radiolocation-Satellite Service")
  RADIOLOCATION_SATELLITE_SERVICE("Radiolocation-Satellite Service"),
  @XmlEnumValue("Radionavigation Service")
  RADIONAVIGATION_SERVICE("Radionavigation Service"),
  @XmlEnumValue("Radionavigation-Satellite Service")
  RADIONAVIGATION_SATELLITE_SERVICE("Radionavigation-Satellite Service"),
  @XmlEnumValue("Space Operation Service")
  SPACE_OPERATION_SERVICE("Space Operation Service"),
  @XmlEnumValue("Space Research (active)")
  SPACE_RESEARCH__ACTIVE__("Space Research (active)"),
  @XmlEnumValue("Space Research (passive)")
  SPACE_RESEARCH__PASSIVE__("Space Research (passive)"),
  @XmlEnumValue("Space Research Service")
  SPACE_RESEARCH_SERVICE("Space Research Service"),
  @XmlEnumValue("Space Telecommand")
  SPACE_TELECOMMAND("Space Telecommand"),
  @XmlEnumValue("Space Telecommand (TT&C)")
  SPACE_TELECOMMAND__TT_C__("Space Telecommand (TT&C)"),
  @XmlEnumValue("Space Telemetering")
  SPACE_TELEMETERING("Space Telemetering"),
  @XmlEnumValue("Space Telemetering (TT&C)")
  SPACE_TELEMETERING__TT_C__("Space Telemetering (TT&C)"),
  @XmlEnumValue("Space Tracking")
  SPACE_TRACKING("Space Tracking"),
  @XmlEnumValue("Space Tracking (TT&C)")
  SPACE_TRACKING__TT_C__("Space Tracking (TT&C)"),
  @XmlEnumValue("Special Service")
  SPECIAL_SERVICE("Special Service"),
  @XmlEnumValue("Specialised Mobile Radio Service")
  SPECIALISED_MOBILE_RADIO_SERVICE("Specialised Mobile Radio Service"),
  @XmlEnumValue("Standard Frequency and Time Signal Service")
  STANDARD_FREQUENCY_AND_TIME_SIGNAL_SERVICE("Standard Frequency and Time Signal Service"),
  @XmlEnumValue("Standard Frequency and Time Signal-Satellite Service")
  STANDARD_FREQUENCY_AND_TIME_SIGNAL_SATELLITE_SERVICE("Standard Frequency and Time Signal-Satellite Service"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCSN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSN fromValue(String v) {
    for (ListCSN c : ListCSN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
