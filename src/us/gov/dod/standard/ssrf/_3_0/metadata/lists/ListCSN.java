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
 * Java class for ListCSN.
 * <p>
 * Used in elements Allocation, Usage, Variance
 */
@XmlType(name = "ListCSN")
@XmlEnum
public enum ListCSN {

  /**
   * A radiocommunication service between specified fixed points provided
   * primarily for the safety of air navigation and for the regular, efficient
   * and economical operation of air transport.
   * <p>
   */
  @XmlEnumValue("Aeronautical Fixed Service")
  AERONAUTICAL_FIXED_SERVICE("Aeronautical Fixed Service"),
  /**
   * An aeronautical mobile service intended for communications, including those
   * relating to flight coordination, primarily outside national or
   * international civil air routes.
   * <p>
   */
  @XmlEnumValue("Aeronautical Mobile (Off Route) Service")
  AERONAUTICAL_MOBILE__OFF_ROUTE__SERVICE("Aeronautical Mobile (Off Route) Service"),
  /**
   * An aeronautical mobile service reserved for communications relating to
   * safety and regularity of flight, primarily along national or international
   * civil air routes.
   * <p>
   */
  @XmlEnumValue("Aeronautical Mobile (Route) Service")
  AERONAUTICAL_MOBILE__ROUTE__SERVICE("Aeronautical Mobile (Route) Service"),
  /**
   * A mobile service between aeronautical stations and aircraft stations, or
   * between aircraft stations, in which survival craft stations may
   * participate; emergency position-indicating radiobeacon stations may also
   * participate in this service on designated distress and emergency
   * frequencies.
   * <p>
   */
  @XmlEnumValue("Aeronautical Mobile Service")
  AERONAUTICAL_MOBILE_SERVICE("Aeronautical Mobile Service"),
  /**
   * An aeronautical mobile-satellite service intended for communications,
   * including those relating to flight coordination, primarily outside national
   * and international civil air routes.
   * <p>
   */
  @XmlEnumValue("Aeronautical Mobile-Satellite (OR) Service")
  AERONAUTICAL_MOBILE_SATELLITE__OR__SERVICE("Aeronautical Mobile-Satellite (OR) Service"),
  /**
   * An aeronautical mobile-satellite service reserved for communications
   * relating to safety and regularity of flight, primarily along national or
   * international civil air routes.
   * <p>
   */
  @XmlEnumValue("Aeronautical Mobile-Satellite (R) Service")
  AERONAUTICAL_MOBILE_SATELLITE__R__SERVICE("Aeronautical Mobile-Satellite (R) Service"),
  /**
   * A mobile-satellite service in which mobile earth stations are located on
   * board aircraft; survival craft stations and emergency position-indicating
   * radiobeacon stations may also participate in this service.
   * <p>
   */
  @XmlEnumValue("Aeronautical Mobile-Satellite Service")
  AERONAUTICAL_MOBILE_SATELLITE_SERVICE("Aeronautical Mobile-Satellite Service"),
  /**
   * A radionavigation service intended for the benefit and for the safe
   * operation of aircraft.
   * <p>
   */
  @XmlEnumValue("Aeronautical Radionavigation Service")
  AERONAUTICAL_RADIONAVIGATION_SERVICE("Aeronautical Radionavigation Service"),
  /**
   * A radionavigation-satellite service in which earth stations are located on
   * board aircraft.
   * <p>
   */
  @XmlEnumValue("Aeronautical Radionavigation-Satellite Service")
  AERONAUTICAL_RADIONAVIGATION_SATELLITE_SERVICE("Aeronautical Radionavigation-Satellite Service"),
  /**
   * A radiocommunication service for the purpose of self-training,
   * inter-communication and technical investigation carried out by amateurs,
   * that is, by duly authorised persons interested in radio technique solely
   * with a personal aim and without pecuniary interest.
   * <p>
   */
  @XmlEnumValue("Amateur Service")
  AMATEUR_SERVICE("Amateur Service"),
  /**
   * A radiocommunication service using space stations on earth satellites for
   * the same purposes as those of the amateur service.
   * <p>
   */
  @XmlEnumValue("Amateur-Satellite Service")
  AMATEUR_SATELLITE_SERVICE("Amateur-Satellite Service"),
  /**
   * A radiocommunication service in which the transmissions are intended for
   * direct reception by the general public. This service may include sound
   * transmissions, television trans-missions or other types of transmissions.
   * <p>
   */
  @XmlEnumValue("Broadcasting Service")
  BROADCASTING_SERVICE("Broadcasting Service"),
  /**
   * A radiocommunication service in which signals transmitted or retransmitted
   * by space stations are intended for direct reception by the general public.
   * In the broadcasting-satellite service, the term "direct reception" shall
   * encompass both individual reception and community reception.
   * <p>
   */
  @XmlEnumValue("Broadcasting-Satellite Service")
  BROADCASTING_SATELLITE_SERVICE("Broadcasting-Satellite Service"),
  /**
   * A radiocommunication service between earth stations and one or more active
   * space stations, which may include links between space stations, in which:;
   * -information relating to the characteristics of the Earth and its natural
   * phenomena including data relating to the state of the environment is
   * obtained from active sensors or passive sensors on earth satellites
   * -similar information is collected from airborne or earth-based platforms;
   * -such information may be distributed to earth stations within the system
   * con- cerned; -platform interrogation may be included.;This service may also
   * include feeder links necessary for its operation.
   * <p>
   */
  @XmlEnumValue("Earth Exploration-Satellite (active)")
  EARTH_EXPLORATION_SATELLITE__ACTIVE__("Earth Exploration-Satellite (active)"),
  /**
   * A radiocommunication service between earth stations and one or more passive
   * space stations, which may include links between space stations, in which:;
   * -information relating to the characteristics of the Earth and its natural
   * phenomena including data relating to the state of the environment is
   * obtained from active sensors or passive sensors on earth satellites
   * -similar information is collected from airborne or earth-based platforms;
   * -such information may be distributed to earth stations within the system
   * con- cerned; -platform interrogation may be included.;This service may also
   * include feeder links necessary for its operation.
   * <p>
   */
  @XmlEnumValue("Earth Exploration-Satellite (passive)")
  EARTH_EXPLORATION_SATELLITE__PASSIVE__("Earth Exploration-Satellite (passive)"),
  /**
   * A radiocommunication service between earth stations and one or more space
   * stations, which may include links between space stations, in which: -
   * information relating to the characteristics of the Earth and its natural
   * phenomena, including data relating to the state of the environment, is
   * obtained from active sensors or passive sensors on earth satellites; -
   * similar information is collected from airborne or Earth-based platforms; -
   * such information may be distributed to earth stations within the system
   * concerned; - platform interrogation may be included.
   * <p>
   */
  @XmlEnumValue("Earth Exploration-Satellite Service")
  EARTH_EXPLORATION_SATELLITE_SERVICE("Earth Exploration-Satellite Service"),
  /**
   * A radiocommunication service between specified fixed points.
   * <p>
   */
  @XmlEnumValue("Fixed Service")
  FIXED_SERVICE("Fixed Service"),
  /**
   * A radiocommunication service between earth stations at given positions when
   * one or more satellites are used; the given position may be a specified
   * fixed point or any fixed point within specified areas; in some cases this
   * service includes satellite-to-satellite links, which may also be operated
   * in the inter-satellite service, the fixed-satellite service may also
   * include feeder links for other space radiocommunication services.
   * <p>
   */
  @XmlEnumValue("Fixed-Satellite Service")
  FIXED_SATELLITE_SERVICE("Fixed-Satellite Service"),
  /**
   * A radiocommunication service providing links between artificial earth
   * satellites.
   * <p>
   */
  @XmlEnumValue("Inter-Satellite Service")
  INTER_SATELLITE_SERVICE("Inter-Satellite Service"),
  /**
   * A mobile service between base stations and land mobile stations, or between
   * land mobile stations.
   * <p>
   */
  @XmlEnumValue("Land Mobile Service")
  LAND_MOBILE_SERVICE("Land Mobile Service"),
  /**
   * A mobile-satellite service in which mobile earth stations are located on
   * land.
   * <p>
   */
  @XmlEnumValue("Land Mobile-Satellite Service")
  LAND_MOBILE_SATELLITE_SERVICE("Land Mobile-Satellite Service"),
  /**
   * A mobile service between coast stations and ship stations, or between ship
   * stations, or between associated on-board communication stations; survival
   * craft stations and emergency position-indicating radiobeacon stations may
   * also participate in this service.
   * <p>
   */
  @XmlEnumValue("Maritime Mobile Service")
  MARITIME_MOBILE_SERVICE("Maritime Mobile Service"),
  /**
   * A mobile-satellite service in which mobile earth stations are located on
   * board ships; survival craft stations and emergency position-indicating
   * radiobeacon stations may also participate in this service.
   * <p>
   */
  @XmlEnumValue("Maritime Mobile-Satellite Service")
  MARITIME_MOBILE_SATELLITE_SERVICE("Maritime Mobile-Satellite Service"),
  /**
   * A radionavigation service intended for the benefit and for the safe
   * operation of ships.
   * <p>
   */
  @XmlEnumValue("Maritime Radionavigation Service")
  MARITIME_RADIONAVIGATION_SERVICE("Maritime Radionavigation Service"),
  /**
   * A radionavigation-satellite service in which earth stations are located on
   * board ships.
   * <p>
   */
  @XmlEnumValue("Maritime Radionavigation-Satellite Service")
  MARITIME_RADIONAVIGATION_SATELLITE_SERVICE("Maritime Radionavigation-Satellite Service"),
  /**
   * A radiocommunication service used for meteorological, including
   * hydrological, observations and exploration.
   * <p>
   */
  @XmlEnumValue("Meteorological Aids Service")
  METEOROLOGICAL_AIDS_SERVICE("Meteorological Aids Service"),
  /**
   * An Earth exploration-satellite service for meteorological purposes.
   * <p>
   */
  @XmlEnumValue("Meteorological-Satellite Service")
  METEOROLOGICAL_SATELLITE_SERVICE("Meteorological-Satellite Service"),
  /**
   * A radiocommunication service between mobile and land stations, or between
   * mobile stations.
   * <p>
   */
  @XmlEnumValue("Mobile Service")
  MOBILE_SERVICE("Mobile Service"),
  /**
   * A radiocommunication service: - between mobile earth stations and one or
   * more space stations, or between space stations used by this service; or -
   * between mobile Earth stations by means of one or more space stations. This
   * service may also include feeder links necessary for its operation.
   * <p>
   */
  @XmlEnumValue("Mobile-Satellite Service")
  MOBILE_SATELLITE_SERVICE("Mobile-Satellite Service"),
  /**
   * A service involving the use of radio astronomy.
   * <p>
   */
  @XmlEnumValue("Radio Astronomy Service")
  RADIO_ASTRONOMY_SERVICE("Radio Astronomy Service"),
  /**
   * A radiocommunication service for the purpose of radiodetermination.
   * <p>
   */
  @XmlEnumValue("Radiodetermination Service")
  RADIODETERMINATION_SERVICE("Radiodetermination Service"),
  /**
   * A radiocommunication service for the purpose of radio-determination
   * involving the use of one or more space stations. This service may also
   * include feeder links necessary for its own operation.
   * <p>
   */
  @XmlEnumValue("Radiodetermination-Satellite Service")
  RADIODETERMINATION_SATELLITE_SERVICE("Radiodetermination-Satellite Service"),
  /**
   * A radiodetermination service for the purpose of radiolocation.
   * <p>
   */
  @XmlEnumValue("Radiolocation Service")
  RADIOLOCATION_SERVICE("Radiolocation Service"),
  /**
   * A radiodetermination-satellite service used for the purpose of
   * radiolocation. This service may also include the feeder links necessary for
   * its operation.
   * <p>
   */
  @XmlEnumValue("Radiolocation-Satellite Service")
  RADIOLOCATION_SATELLITE_SERVICE("Radiolocation-Satellite Service"),
  /**
   * A radiodetermination service for the purpose of radionavigation.
   * <p>
   */
  @XmlEnumValue("Radionavigation Service")
  RADIONAVIGATION_SERVICE("Radionavigation Service"),
  /**
   * A radiodetermination-satellite service used for the purpose of
   * radionavigation. This service may also include feeder links necessary for
   * its operation.
   * <p>
   */
  @XmlEnumValue("Radionavigation-Satellite Service")
  RADIONAVIGATION_SATELLITE_SERVICE("Radionavigation-Satellite Service"),
  /**
   * A radiocommunication service concerned exclusively with the operation of
   * spacecraft, in particular space tracking, space telemetry and space
   * telecommand. These functions will normally be provided within the service
   * in which the space station is operating.
   * <p>
   */
  @XmlEnumValue("Space Operation Service")
  SPACE_OPERATION_SERVICE("Space Operation Service"),
  /**
   * A radiocommunication service in which spacecraft or other active objects in
   * space are used for scientific or technological research purposes.
   * <p>
   */
  @XmlEnumValue("Space Research (active)")
  SPACE_RESEARCH__ACTIVE__("Space Research (active)"),
  /**
   * A radiocommunication service in which spacecraft or other passive objects
   * in space are used for scientific or technological research purposes.
   * <p>
   */
  @XmlEnumValue("Space Research (passive)")
  SPACE_RESEARCH__PASSIVE__("Space Research (passive)"),
  /**
   * A radiocommunication service in which spacecraft or other objects in space
   * are used for scientific or technological research purposes.
   * <p>
   */
  @XmlEnumValue("Space Research Service")
  SPACE_RESEARCH_SERVICE("Space Research Service"),
  /**
   * The use of radiocommunication for the transmission of signals to a space
   * station to initiate, modify or teminate functions of equipment on an
   * associated space object, including the space station.
   * <p>
   */
  @XmlEnumValue("Space Telecommand")
  SPACE_TELECOMMAND("Space Telecommand"),
  /**
   * The use of radiocommunication for the transmission of signals to a space
   * station to initiate, modify or teminate functions of equipment on an
   * associated space object, including the space station.
   * <p>
   */
  @XmlEnumValue("Space Telecommand (TT&C)")
  SPACE_TELECOMMAND__TT_C__("Space Telecommand (TT&C)"),
  /**
   * The use of telemetry for the transmission from a space station of results
   * of measurements made in a spacecraft, including those relating to the
   * functioning of the spacecraft.
   * <p>
   */
  @XmlEnumValue("Space Telemetering")
  SPACE_TELEMETERING("Space Telemetering"),
  /**
   * The use of telemetry for the transmission from a space station of results
   * of measurements made in a spacecraft, including those relating to the
   * functioning of the spacecraft. (RR)
   * <p>
   */
  @XmlEnumValue("Space Telemetering (TT&C)")
  SPACE_TELEMETERING__TT_C__("Space Telemetering (TT&C)"),
  /**
   * Determination of the orbit, velocity or instantaneous position of an object
   * in space by means of radiodetermination, excluding primary radar, for the
   * purpose of following the movement of the object.
   * <p>
   */
  @XmlEnumValue("Space Tracking")
  SPACE_TRACKING("Space Tracking"),
  /**
   * Determination of the orbit, velocity or instantaneous position of an object
   * in space by means of radiodetermination, excluding primary radar, for the
   * purpose of following the movement of the object.
   * <p>
   */
  @XmlEnumValue("Space Tracking (TT&C)")
  SPACE_TRACKING__TT_C__("Space Tracking (TT&C)"),
  /**
   * A radiocommunication service, not otherwise defined in this Section,
   * carried on exclusively for specific needs of general utility, and not open
   * to public correspondence.
   * <p>
   */
  @XmlEnumValue("Special Service")
  SPECIAL_SERVICE("Special Service"),
  /**
   * A radio service in which licensees provide land mobile communications
   * services in the 800 MHz and 900 MHz bands on a commercial basis to entities
   * eligible to be licensed under this part, federal government entities, and
   * individuals.
   * <p>
   */
  @XmlEnumValue("Specialised Mobile Radio Service")
  SPECIALISED_MOBILE_RADIO_SERVICE("Specialised Mobile Radio Service"),
  /**
   * A radiocommunication service for scientific, technical and other purposes,
   * providing the transmission of specified frequencies, time signals, or both,
   * of stated high precision, intended for general reception.
   * <p>
   */
  @XmlEnumValue("Standard Frequency and Time Signal Service")
  STANDARD_FREQUENCY_AND_TIME_SIGNAL_SERVICE("Standard Frequency and Time Signal Service"),
  /**
   * A radiocommunication service using space stations on earth satellites for
   * the same purpose as those of the standard frequency and time signal
   * service. This service may also include feeder links necessary for its
   * operation.
   * <p>
   */
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
