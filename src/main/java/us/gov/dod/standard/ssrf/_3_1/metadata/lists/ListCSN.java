/* 
 * Copyright 2014 Key Bridge LLC.
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

import java.util.*;
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
  AERONAUTICAL_FIXED("Aeronautical Fixed Service"),
  @XmlEnumValue("Aeronautical Mobile (Off Route) Service")
  AERONAUTICAL_MOBILE_OFF_ROUTE("Aeronautical Mobile (Off Route) Service"),
  @XmlEnumValue("Aeronautical Mobile (Route) Service")
  AERONAUTICAL_MOBILE_ROUTE("Aeronautical Mobile (Route) Service"),
  @XmlEnumValue("Aeronautical Mobile Service")
  AERONAUTICAL_MOBILE("Aeronautical Mobile Service"),
  @XmlEnumValue("Aeronautical Mobile-Satellite (OR) Service")
  AERONAUTICAL_MOBILE_SATELLITE_OR("Aeronautical Mobile-Satellite (OR) Service"),
  @XmlEnumValue("Aeronautical Mobile-Satellite (R) Service")
  AERONAUTICAL_MOBILE_SATELLITE_R("Aeronautical Mobile-Satellite (R) Service"),
  @XmlEnumValue("Aeronautical Mobile-Satellite Service")
  AERONAUTICAL_MOBILE_SATELLITE("Aeronautical Mobile-Satellite Service"),
  @XmlEnumValue("Aeronautical Radionavigation Service")
  AERONAUTICAL_RADIONAVIGATION("Aeronautical Radionavigation Service"),
  @XmlEnumValue("Aeronautical Radionavigation-Satellite Service")
  AERONAUTICAL_RADIONAVIGATION_SATELLITE("Aeronautical Radionavigation-Satellite Service"),
  @XmlEnumValue("Amateur Service")
  AMATEUR("Amateur Service"),
  @XmlEnumValue("Amateur-Satellite Service")
  AMATEUR_SATELLITE("Amateur-Satellite Service"),
  @XmlEnumValue("Broadcasting Service")
  BROADCASTING("Broadcasting Service"),
  @XmlEnumValue("Broadcasting-Satellite Service")
  BROADCASTING_SATELLITE("Broadcasting-Satellite Service"),
  @XmlEnumValue("Earth Exploration-Satellite (active)")
  EARTH_EXPLORATION_SATELLITE_ACTIVE("Earth Exploration-Satellite (active)"),
  @XmlEnumValue("Earth Exploration-Satellite (passive)")
  EARTH_EXPLORATION_SATELLITE_PASSIVE("Earth Exploration-Satellite (passive)"),
  @XmlEnumValue("Earth Exploration-Satellite Service")
  EARTH_EXPLORATION_SATELLITE("Earth Exploration-Satellite Service"),
  @XmlEnumValue("Fixed Service")
  FIXED("Fixed Service"),
  @XmlEnumValue("Fixed-Satellite Service")
  FIXED_SATELLITE("Fixed-Satellite Service"),
  @XmlEnumValue("Inter-Satellite Service")
  INTER_SATELLITE("Inter-Satellite Service"),
  @XmlEnumValue("Land Mobile Service")
  LAND_MOBILE("Land Mobile Service"),
  @XmlEnumValue("Land Mobile-Satellite Service")
  LAND_MOBILE_SATELLITE("Land Mobile-Satellite Service"),
  @XmlEnumValue("Maritime Mobile Service")
  MARITIME_MOBILE("Maritime Mobile Service"),
  @XmlEnumValue("Maritime Mobile-Satellite Service")
  MARITIME_MOBILE_SATELLITE("Maritime Mobile-Satellite Service"),
  @XmlEnumValue("Maritime Radionavigation Service")
  MARITIME_RADIONAVIGATION("Maritime Radionavigation Service"),
  @XmlEnumValue("Maritime Radionavigation-Satellite Service")
  MARITIME_RADIONAVIGATION_SATELLITE("Maritime Radionavigation-Satellite Service"),
  @XmlEnumValue("Meteorological Aids Service")
  METEOROLOGICAL_AIDS("Meteorological Aids Service"),
  @XmlEnumValue("Meteorological-Satellite Service")
  METEOROLOGICAL_SATELLITE("Meteorological-Satellite Service"),
  @XmlEnumValue("Mobile Service")
  MOBILE("Mobile Service"),
  @XmlEnumValue("Mobile-Satellite Service")
  MOBILE_SATELLITE("Mobile-Satellite Service"),
  @XmlEnumValue("Radio Astronomy Service")
  RADIO_ASTRONOMY("Radio Astronomy Service"),
  @XmlEnumValue("Radiodetermination Service")
  RADIODETERMINATION("Radiodetermination Service"),
  @XmlEnumValue("Radiodetermination-Satellite Service")
  RADIODETERMINATION_SATELLITE("Radiodetermination-Satellite Service"),
  @XmlEnumValue("Radiolocation Service")
  RADIOLOCATION("Radiolocation Service"),
  @XmlEnumValue("Radiolocation-Satellite Service")
  RADIOLOCATION_SATELLITE("Radiolocation-Satellite Service"),
  @XmlEnumValue("Radionavigation Service")
  RADIONAVIGATION("Radionavigation Service"),
  @XmlEnumValue("Radionavigation-Satellite Service")
  RADIONAVIGATION_SATELLITE("Radionavigation-Satellite Service"),
  @XmlEnumValue("Space Operation Service")
  SPACE_OPERATION("Space Operation Service"),
  @XmlEnumValue("Space Research (active)")
  SPACE_RESEARCH_ACTIVE("Space Research (active)"),
  @XmlEnumValue("Space Research (passive)")
  SPACE_RESEARCH_PASSIVE("Space Research (passive)"),
  @XmlEnumValue("Space Research Service")
  SPACE_RESEARCH("Space Research Service"),
  @XmlEnumValue("Space Telecommand")
  SPACE_TELECOMMAND("Space Telecommand"),
  @XmlEnumValue("Space Telecommand (TT&C)")
  SPACE_TELECOMMAND_TT_C("Space Telecommand (TT&C)"),
  @XmlEnumValue("Space Telemetering")
  SPACE_TELEMETERING("Space Telemetering"),
  @XmlEnumValue("Space Telemetering (TT&C)")
  SPACE_TELEMETERING_TT_C("Space Telemetering (TT&C)"),
  @XmlEnumValue("Space Tracking")
  SPACE_TRACKING("Space Tracking"),
  @XmlEnumValue("Space Tracking (TT&C)")
  SPACE_TRACKING_TT_C("Space Tracking (TT&C)"),
  @XmlEnumValue("Special Service")
  SPECIAL("Special Service"),
  @XmlEnumValue("Specialised Mobile Radio Service")
  SPECIALISED_MOBILE_RADIO("Specialised Mobile Radio Service"),
  @XmlEnumValue("Standard Frequency and Time Signal Service")
  STANDARD_FREQUENCY_AND_TIME_SIGNAL("Standard Frequency and Time Signal Service"),
  @XmlEnumValue("Standard Frequency and Time Signal-Satellite Service")
  STANDARD_FREQUENCY_AND_TIME_SIGNAL_SATELLITE("Standard Frequency and Time Signal-Satellite Service"),
  /**
   * Not allocated. This is used in ECC TOA records for bands below 9kHz and
   * above 270GHz.
   * <p>
   * 11/13/14 - request to be added to spec. Until the spec is amended use OTHER
   * and add a Remark.
   */
  //  @XmlEnumValue("Not allocated")  NOT_ALLOCATED("Not allocated"),

  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCSN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  /**
   * Get a allocated service from a service name.
   * <p>
   * e.g. "RADIONAVIGATION-SATELLITE (space-to-Earth) (space-to-space)" will
   * return "RADIONAVIGATION-SATELLITE".
   * <p>
   * Use the {@link qualifier} method for "except" or other qualifying
   * statements.
   * <p>
   * @param value a frequency table allocation name
   * @return a CSN entry if found
   */
  public static ListCSN fromValue(String value) {
    /**
     * First try an exact match with the provided VALUE (also try NAME for
     * maximum flexibility).
     */
    for (ListCSN listCSN : ListCSN.values()) {
      if (listCSN.value().equalsIgnoreCase(value) || listCSN.name().equalsIgnoreCase(value)) {
        return listCSN;
      }
    }
    /**
     * Next try to match a longer name, possibly with a qualifier attached.
     * Expect a pattern of A (extraA) except B (extraB)
     * <p>
     * Parse this by splitting on "extra" if present, then processing the left.
     */
    if (value.contains("except")) {
      return parse(value.split("except")[0]);
    }
    StringTokenizer st = new StringTokenizer(value, "[()]", false);
    while (st.hasMoreTokens()) {
      return parse(st.nextToken());
    }
    throw new IllegalArgumentException(value);
  }

  /**
   * Match a ListCSN entry with a NAME candidate. This method is designed to
   * match frequency table entries (with spaces, parentheses and dashes).
   * <p>
   * @param name the frequency table allocation name
   * @return a match if found
   */
  private static ListCSN parse(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException(name);
    }
    /**
     * First try to match the name directly.
     */
    for (ListCSN csn : ListCSN.values()) {
      if (csn.name().equalsIgnoreCase(name.trim().replaceAll("[\\W\\s]", "_"))) {
        return csn;
      }
    }
    /**
     * If a name match fails then search for a match from longest to shortest.
     * This assumes the "name" field contains extra junk descriptions and the
     * allocation is buried somewhere within. Sort by reverse name length
     */
    List<ListCSN> csn = new ArrayList<>(Arrays.asList(ListCSN.values()));
    Collections.sort(csn, new Comparator<ListCSN>() {

      @Override
      public int compare(ListCSN o1, ListCSN o2) {
        return o1.name().length() > o2.name().length() ? -1 : 1;
      }
    });
    /**
     * Replace all non-word and whitespace characters with underscore, then try
     * to match the name.
     */
    String query = name.replaceAll("[\\W\\s]", "_");
    for (ListCSN c : csn) {
      if (query.toLowerCase().matches("^" + c.name().toLowerCase() + ".*$")) {
        return c;
      }
    }
    throw new IllegalArgumentException("ListCSN name not recognized: \"" + name + "\"");
  }

  /**
   * Get a allocated service qualifying statement from a service name.
   * <p>
   * e.g. "RADIONAVIGATION-SATELLITE (space-to-Earth) (space-to-space)" will
   * return "(space-to-Earth) (space-to-space)".
   * <p>
   * @param name a frequency table allocation name
   * @return a CSN entry if found
   */
  public static String qualifier(String name) {
    /**
     * Try to match the first portion of the name, before any parentheses.
     */
    if (name.contains("except")) {
      return "except" + name.split("except")[1];
    }
    /**
     * Try to match the first portion of the name, before any parentheses.
     */
    Set<String> qualifier = new HashSet<>();
    StringTokenizer st = new StringTokenizer(name, "[()]", false);
    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      if (token != null && !token.trim().isEmpty()) {
        /**
         * If the token is NOT a service name then add it.
         */
        try {
          parse(token);
        } catch (Exception e) {
          qualifier.add("(" + token.replaceAll("\\s+", " ") + ")");
        }
      }
    }
    /**
     * If one or more qualifier were found then assemble a String.
     */
    if (!qualifier.isEmpty()) {
      StringBuilder sb = new StringBuilder();
      boolean first = true;
      for (String entry : qualifier) {
        if (first) {
          sb.append(entry);
          first = false;
        } else {
          sb.append(" ").append(entry);
        }
      }
      return sb.toString();
    }
    return null;
  }

}
