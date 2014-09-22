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
 * Java class for ListUSC.
 */
@XmlType(name = "ListUSC")
@XmlEnum
public enum ListUSC {

  /**
   * Aeronautical Radionavigation Land Station: A land station in the
   * aeronautical radionavigation service not intended for use while in motion.
   */
  AL("AL"),
  /**
   * Aeronautical Marker Beacon Station: A radionavigation land station in the
   * aeronautical radionavigation service which employs a marker beacon.
   */
  ALA("ALA"),
  /**
   * Aeronautical Radiobeacon Station: A radiobeacon station in the aeronautical
   * radionavigation service in-tended for the benefit of aircraft.
   */
  ALB("ALB"),
  /**
   * Aeronautical Radar Beacon (racon) Station: A land station in the
   * aeronautical radionavigation service which employs a radar beacon (racon).
   */
  ALC("ALC"),
  /**
   * Glide Path (Slope) Sta-tion: A radionavigation land station which provides
   * vertical guidance to aircraft during approach to landing.
   */
  ALG("ALG"),
  /**
   * Localizer Station: A radionavigation land station in the aeronautical
   * radionavigation service which employs an Instrument Landing System
   * Localizer.
   */
  ALL("ALL"),
  /**
   * Omnidirectional Range Station: A radionavigation land station in the
   * aeronautical radionavigation service providing direct indication of the
   * bearing (omni-bearing) of that station from an aircraft.
   */
  ALO("ALO"),
  /**
   * Radio Range Station: A radionavigation land station in the aeronautical
   * radionavigation service providing radial equisignal zones. (In certain
   * instances a radio range station may be placed on board a ship.)
   */
  ALR("ALR"),
  /**
   * Surveillance Radar Station: A radionavigation land station in the
   * aeronautical radionavigation service employing radar to display the
   * presence of aircraft within its range. (In certain instances, a
   * surveillance radar station may be placed on board a ship.)
   */
  ALS("ALS"),
  /**
   * Radionavigation Land Test Station (Maintenance Test Facility): A
   * radionavigation land station in the aeronautical radionavigation service
   * which is used as a radionavigation calibration station for the transmission
   * of essential information in connection with the testing and calibration of
   * aircraft navigational aids, receiving equipment and interrogators at
   * predetermined surface locations. The primary purpose of this facility is to
   * permit maintenance testing by aircraft radio service personnel.
   */
  ALTM("ALTM"),
  /**
   * Radionavigation Land Test Station (Operational Test Facility): A
   * radionavigation land station in the aeronautical radionavigation service
   * which is used as a radionavigation calibration station for the transmission
   * of essential information in connection with the testing and calibration of
   * aircraft navigational aids, receiving equipment and interrogators at
   * predetermined surface locations. The primary purpose of this facility is to
   * permit the pilot to check a radionavigation system aboard the aircraft
   * prior to takeoff.
   */
  ALTO("ALTO"),
  /**
   * Aeronautical Radionavigation Mobile Station: A mobile station in the
   * aeronautical radionavigation service intended to be used while in motion or
   * during halts at unspecified points.
   */
  AM("AM"),
  /**
   * Altimeter Station: A radionavigation mobile station in the aeronautical
   * radionavigation service which employs a radio altimeter.
   */
  AMA("AMA"),
  /**
   * ALASKA PRIVATE
   */
  APX("APX"),
  /**
   * ALASKA PRIVATE (TEMPORARY)
   */
  @XmlEnumValue("APX2")
  APX_2("APX2"),
  /**
   * Amateur station
   */
  AT("AT"),
  /**
   * Fixed station in the Aeronautical Fixed Service
   */
  AX("AX"),
  /**
   * AERONAUTICAL FIXED (TEMPORARY)
   */
  @XmlEnumValue("AX2")
  AX_2("AX2"),
  /**
   * Broadcasting Station (sound): A station (sound) in the broadcasting
   * service.
   */
  BC("BC"),
  /**
   * Broadcasting Station (television): A station (television) in the
   * broadcasting service.
   */
  BT("BT"),
  /**
   * DOMESTIC AERONAUTICAL MOBILE-SATELLITE SERVICE
   */
  DAMS("DAMS"),
  /**
   * SATELLITE DIGITAL AUDIO RADIO SERVICE
   */
  DARS("DARS"),
  /**
   * DIRECT BROADCAST SATELLITE SERVICE
   */
  DBS("DBS"),
  /**
   * DOMESTIC FIXED SATELLITE SERVICE
   */
  DFSS("DFSS"),
  /**
   * Differential-Global-Positioning-System (DGPS) Station: a terrestrial
   * station used for the transmission of differential correction information to
   * DGPS receivers aboard aircraft for navigation.
   */
  DGP("DGP"),
  /**
   * DIRECT TO HOME FIXED SATELLITE
   */
  DHFS("DHFS"),
  /**
   * DOMESTIC LAND MOBILE SATELLITE SERVICE
   */
  DLMS("DLMS"),
  /**
   * DOMESTIC MARITIME MOBILE SATELLITE SERVICE
   */
  DMMS("DMMS"),
  /**
   * DOMESTIC MOBILE SATELLITE SERVICE
   */
  DMSS("DMSS"),
  /**
   * DIRECT TO HOME SATELLITE
   */
  DTH("DTH"),
  /**
   * Space research (active sensor) space station
   */
  @XmlEnumValue("E1")
  E_1("E1"),
  /**
   * Space research (passive sensor) space station
   */
  @XmlEnumValue("E2")
  E_2("E2"),
  /**
   * Space station in the Earth exploration-satellite service(active sensor)
   */
  @XmlEnumValue("E3")
  E_3("E3"),
  /**
   * Space station in the Earth exploration-satellite (passive sensor)
   */
  @XmlEnumValue("E4")
  E_4("E4"),
  /**
   * Space station in the amateur-satellite service
   */
  EA("EA"),
  /**
   * Broadcasting-Satellite Space Station (sound broadcasting): A space station
   * in the broadcasting-satellite service (sound broadcasting).
   */
  EB("EB"),
  /**
   * Fixed-Satellite Space Station: A space station in the fixed-satellite
   * service.
   */
  EC("EC"),
  /**
   * Space Telecommand Space Station: A space station which receives emissions
   * used for space telecommand.
   */
  ED("ED"),
  /**
   * Standard Frequency Satellite Space Station: A space station in the standard
   * frequency satellite service.
   */
  EE("EE"),
  /**
   * EARTH EXPLORATION SATELLITE SERVICE
   */
  EESS("EESS"),
  /**
   * Radiodetermination-Satellite Space Station: A space station in the
   * radiodetermination-satellite service.
   */
  EF("EF"),
  /**
   * Maritime Mobile-Satellite Space Station: A space station in the maritime
   * mobile-satellite service.
   */
  EG("EG"),
  /**
   * Space Research Space Station: A space station in the space research
   * service.
   */
  EH("EH"),
  /**
   * Mobile-Satellite Space Station: A space station in the mobile-satellite
   * service.
   */
  EI("EI"),
  /**
   * Aeronautical Mobile-Satellite Space Station: A space station in the
   * aeronautical mobile-satellite service.
   */
  EJ("EJ"),
  /**
   * Space Tracking Space Station: A space station which transmits or receives
   * and retransmits emissions used for space tracking.
   */
  EK("EK"),
  /**
   * ELT TEST
   */
  ELT("ELT"),
  /**
   * ELT TEST (MOBILE)
   */
  @XmlEnumValue("ELT1")
  ELT_1("ELT1"),
  /**
   * Meteorological-Satellite Space Station: A space station in the
   * meteorological-satellite service.
   */
  EM("EM"),
  /**
   * Meteorological-Satellite Telemetry Space Station
   */
  EMER("EMER"),
  /**
   * Meteorological-Satellite Tracking Space Station
   */
  EMSS("EMSS"),
  /**
   * Radionavigation-Satellite Space Station: A space station in the
   * radionavigation-satellite service.
   */
  EN("EN"),
  /**
   * Aeronautical Radionavigation-Satellite Space Station: A space station in
   * the aeronautical radionavigation-satellite service.
   */
  EO("EO"),
  /**
   * Maritime Radionavigation-Satellite Space Station: A space station in the
   * maritime radionavigation-satellite service.
   */
  EQ("EQ"),
  /**
   * Space Telemetering Space Station: A space station the emissions of which
   * are used for space telemetering.
   */
  ER("ER"),
  /**
   * Inter-Satellite Space Station: A space station in the inter-satellite
   * service.
   */
  ES("ES"),
  /**
   * EARTH STATION ON BOARD VESSEL
   */
  ESV("ESV"),
  /**
   * Space Operation Space Station: A space station in the space operation
   * service.
   */
  ET("ET"),
  /**
   * Land Mobile-Satellite Space Station: A space station in the land
   * mobile-satellite service.
   */
  EU("EU"),
  /**
   * Broadcasting-Satellite Space Station (television): A space station in the
   * broadcasting-satellite service (television).
   */
  EV("EV"),
  /**
   * Earth Exploration-Satellite Space Station: A space station in the Earth
   * exploration-satellite service.
   */
  EW("EW"),
  /**
   * Experimental Station: A station utilising radio waves in experiments with a
   * view to development of science or technique. (EX is not used on
   * applications.)
   */
  EX("EX"),
  /**
   * Space station in the time signal-satellite service
   */
  EY("EY"),
  /**
   * Aeronautical Station: A land station in the aeronautical mobile service. In
   * certain instances, an aeronautical station may be located, for example on
   * board ship or on a platform at sea.
   */
  FA("FA"),
  /**
   * AERONAUTICAL ENROUTE (MOBILE)
   */
  @XmlEnumValue("FA1")
  FA_1("FA1"),
  /**
   * AERONAUTICAL ENROUTE (TEMPORARY)
   */
  @XmlEnumValue("FA2")
  FA_2("FA2"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM)
   */
  FAA("FAA"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM) (MOBILE)
   */
  @XmlEnumValue("FAA1")
  FAA_1("FAA1"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM) (TEMPORARY)
   */
  @XmlEnumValue("FAA2")
  FAA_2("FAA2"),
  /**
   * Aeronautical Broadcast Station: An aeronautical station which makes
   * scheduled broadcasts of meteorological information and notices to airmen.
   * (In certain instances, an aeronautical broadcast station may be placed on
   * board a ship.)
   */
  FAB("FAB"),
  /**
   * Airdrome Control Station: An aeronautical station providing communication
   * between an airdrome control tower and aircraft.
   */
  FAC("FAC"),
  /**
   * Telecommand Aeronautical Station: A land station in the aeronautical mobile
   * service the emissions of which are used for terrestrial telecommand.
   */
  FAD("FAD"),
  /**
   * AVIATION SUPPORT INSTRUCTIONAL
   */
  FAS("FAS"),
  /**
   * AVIATION SUPPORT INSTRUCTIONAL (MOBILE)
   */
  @XmlEnumValue("FAS1")
  FAS_1("FAS1"),
  /**
   * Flight Test Station: An aeronautical station used for the transmission of
   * essential communications in connection with the testing of aircraft or
   * major components of aircraft.
   */
  FAT("FAT"),
  /**
   * FLIGHT TEST (MOBILE)
   */
  @XmlEnumValue("FAT1")
  FAT_1("FAT1"),
  /**
   * FLIGHT TEST (ITINERANT)
   */
  @XmlEnumValue("FAT3")
  FAT_3("FAT3"),
  /**
   * Base Station: A land station in the land mobile service.
   */
  FB("FB"),
  /**
   * MOBILE RELAY
   */
  @XmlEnumValue("FB2")
  FB_2("FB2"),
  /**
   * MOBILE RELAY - AIRPORT TERMINAL USE
   */
  @XmlEnumValue("FB2A")
  FB_2_A("FB2A"),
  /**
   * MOBILE RELAY - INTERCONNECT
   */
  @XmlEnumValue("FB2C")
  FB_2_C("FB2C"),
  /**
   * MOBILE RELAY - ITINERANT
   */
  @XmlEnumValue("FB2I")
  FB_2_I("FB2I"),
  /**
   * MOBILE RELAY - TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("FB2J")
  FB_2_J("FB2J"),
  /**
   * MOBILE RELAY - STAND-BY INTERCONNECT
   */
  @XmlEnumValue("FB2K")
  FB_2_K("FB2K"),
  /**
   * MOBILE RELAY - ITINERANT INTERCONNECT
   */
  @XmlEnumValue("FB2L")
  FB_2_L("FB2L"),
  /**
   * MOBILE RELAY - STAND-BY
   */
  @XmlEnumValue("FB2S")
  FB_2_S("FB2S"),
  /**
   * MOBILE RELAY - TEMPORARY
   */
  @XmlEnumValue("FB2T")
  FB_2_T("FB2T"),
  /**
   * COMMUNITY REPEATER
   */
  @XmlEnumValue("FB4")
  FB_4("FB4"),
  /**
   * COMMUNITY REPEATER - INTERCONNECT
   */
  @XmlEnumValue("FB4C")
  FB_4_C("FB4C"),
  /**
   * COMMUNITY REPEATER - ITINERANT
   */
  @XmlEnumValue("FB4I")
  FB_4_I("FB4I"),
  /**
   * COMMUNITY REPEATER - TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("FB4J")
  FB_4_J("FB4J"),
  /**
   * COMMUNITY REPEATER - STAND-BY INTERCONNECT
   */
  @XmlEnumValue("FB4K")
  FB_4_K("FB4K"),
  /**
   * COMMUNITY REPEATER - STAND-BY
   */
  @XmlEnumValue("FB4S")
  FB_4_S("FB4S"),
  /**
   * COMMUNITY REPEATER - TEMPORARY
   */
  @XmlEnumValue("FB4T")
  FB_4_T("FB4T"),
  /**
   * PRIVATE CARRIER (PROFIT)
   */
  @XmlEnumValue("FB6")
  FB_6("FB6"),
  /**
   * PRIVATE CARRIER (PROFIT) - INTERCONNECT
   */
  @XmlEnumValue("FB6C")
  FB_6_C("FB6C"),
  /**
   * PRIVATE CARRIER (PROFIT) - ITINERANT
   */
  @XmlEnumValue("FB6I")
  FB_6_I("FB6I"),
  /**
   * PRIVATE CARRIER (PROFIT) - TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("FB6J")
  FB_6_J("FB6J"),
  /**
   * PRIVATE CARRIER (PROFIT) - STAND -BY INTERCONNECT
   */
  @XmlEnumValue("FB6K")
  FB_6_K("FB6K"),
  /**
   * PRIVATE CARRIER (PROFIT) - ITINERANT INTERCONNECT
   */
  @XmlEnumValue("FB6L")
  FB_6_L("FB6L"),
  /**
   * PRIVATE CARRIER (PROFIT) - STAND-BY
   */
  @XmlEnumValue("FB6S")
  FB_6_S("FB6S"),
  /**
   * PRIVATE CARRIER (PROFIT) - TEMPORARY
   */
  @XmlEnumValue("FB6T")
  FB_6_T("FB6T"),
  /**
   * PRIVATE CARRIER (NON-PROFIT)
   */
  @XmlEnumValue("FB7")
  FB_7("FB7"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - INTERCONNECT
   */
  @XmlEnumValue("FB7C")
  FB_7_C("FB7C"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - ITINERANT
   */
  @XmlEnumValue("FB7J")
  FB_7_J("FB7J"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("FB7T")
  FB_7_T("FB7T"),
  /**
   * CENTRALIZED TRUNK RELAY
   */
  @XmlEnumValue("FB8")
  FB_8("FB8"),
  /**
   * CENTRALIZED TRUNK RELAY - AIRPORT TERMINAL USE
   */
  @XmlEnumValue("FB8A")
  FB_8_A("FB8A"),
  /**
   * CENTRALIZED TRUNK RELAY - INTERCONNECT
   */
  @XmlEnumValue("FB8C")
  FB_8_C("FB8C"),
  /**
   * CENTRALIZED TRUNK RELAY - ITINERANT
   */
  @XmlEnumValue("FB8I")
  FB_8_I("FB8I"),
  /**
   * CENTRALIZED TRUNK RELAY - TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("FB8J")
  FB_8_J("FB8J"),
  /**
   * CENTRALIZED TRUNK RELAY - ITINERANT INTERCONNECT
   */
  @XmlEnumValue("FB8L")
  FB_8_L("FB8L"),
  /**
   * CENTRALIZED TRUNK RELAY - STANDBY
   */
  @XmlEnumValue("FB8S")
  FB_8_S("FB8S"),
  /**
   * CENTRALIZED TRUNK RELAY- TEMPORARY
   */
  @XmlEnumValue("FB8T")
  FB_8_T("FB8T"),
  /**
   * SMALL BASE
   */
  FBA("FBA"),
  /**
   * SMALL BASE - TEMPORARY
   */
  FBAT("FBAT"),
  /**
   * BASE
   */
  FBBS("FBBS"),
  /**
   * BASE - INTERCONNECT
   */
  FBC("FBC"),
  /**
   * BASE - INTERCONNECT
   */
  FBCT("FBCT"),
  /**
   * Telecommand Base Station: A land station in the land mobile service the
   * emissions of which are used for terrestrial telecommand.
   */
  FBD("FBD"),
  /**
   * GROUND
   */
  FBGS("FBGS"),
  /**
   * BASE - ITINERANT
   */
  FBI("FBI"),
  /**
   * BASE- TEMPORARY INTERCONNECT
   */
  FBJ("FBJ"),
  /**
   * BASE - STAND-BY INTERCONNECT
   */
  FBK("FBK"),
  /**
   * BASE - ITINERANT INTERCONNECT
   */
  FBL("FBL"),
  /**
   * BASE - STAND-BY
   */
  FBS("FBS"),
  /**
   * AIR-GROUND SIGNALING
   */
  FBSI("FBSI"),
  /**
   * STAND-BY
   */
  FBST("FBST"),
  /**
   * BASE - TEMPORARY
   */
  FBT("FBT"),
  /**
   * Coast Station: A land station in the maritime mobile service.
   */
  FC("FC"),
  /**
   * MARINE SUPPORT - TESTING & TRAINING
   */
  FCA("FCA"),
  /**
   * MARINE SUPPORT - TESTING & TRAINING (TEMPORARY)
   */
  @XmlEnumValue("FCA2")
  FCA_2("FCA2"),
  /**
   * Marine Broadcast Station: A coast station which makes scheduled broadcast
   * of time, meteorological, and hydrographical information.
   */
  FCB("FCB"),
  /**
   * Telecommand Coast Station: A land station in the maritime mobile service
   * the emissions of which are used for terrestrial telecommand.
   */
  FCD("FCD"),
  /**
   * PRIVATE COAST
   */
  FCL("FCL"),
  /**
   * PRIVATE COAST (TEMPORARY)
   */
  @XmlEnumValue("FCL2")
  FCL_2("FCL2"),
  /**
   * MARINE UTILITY
   */
  FCU("FCU"),
  /**
   * MARINE UTILITY (MOBILE)
   */
  @XmlEnumValue("FCU1")
  FCU_1("FCU1"),
  /**
   * Aeronautical Station (R): An aeronautical station in the aeronautical
   * mobile (R) service.
   */
  FD("FD"),
  /**
   * FEEDER LIINK FOR DBS IN FIXED SATELLITE SERVICE
   */
  FDBS("FDBS"),
  /**
   * Aeronautical Station (OR): An aeronautical station in the aeronautical
   * mobile (OR) service.
   */
  FG("FG"),
  /**
   * FLIGHT INFORMATION SERVICES
   */
  FIS("FIS"),
  /**
   * Land Station: A station in the mobile service not intended to be used while
   * in motion.
   */
  FL("FL"),
  /**
   * Telecommand Land Station: A land station in the mobile service the
   * emissions of which are used for terrestrial telecommand.
   */
  FLD("FLD"),
  /**
   * Telemetering Land Station: A land station the emissions of which are used
   * for telemetering.
   */
  FLE("FLE"),
  /**
   * Aeronautical Telemetering Land Station: A telemetering land station used in
   * the flight testing of manned or unmanned aircraft, missiles, or major
   * components thereof.
   */
  FLEA("FLEA"),
  /**
   * Flight Telemetering Land Station: A telemetering land station the emissions
   * of which are used for telemetering to a balloon; to a booster or rocket,
   * excluding a booster or rocket in orbit about the Earth or in deep space; or
   * to an aircraft, excluding a station used in the flight testing of an
   * aircraft.
   */
  FLEB("FLEB"),
  /**
   * Surface Telemetering Land Station: A telemetering land station the
   * emissions of which are intended to be received on the surface of the Earth.
   */
  FLEC("FLEC"),
  /**
   * FEEDER LINK IN FIXED SATELLITE SERVICE
   */
  FLFS("FLFS"),
  /**
   * Hydrologic and Meteorological Land Station: A land station the emissions of
   * which are used for the automatic transmission of either hydrologic or
   * meteorological data, or both.
   */
  FLH("FLH"),
  /**
   * Aeronautical Utility Land Station: A land station located at airdrome
   * control towers and used for control of ground vehicles and aircraft on the
   * ground at airdromes.
   */
  FLU("FLU"),
  /**
   * AVIATION SUPPORT SERVICE (MOBILE)
   */
  @XmlEnumValue("FLU1")
  FLU_1("FLU1"),
  /**
   * FEEDER LINK FOR WIDE AREA AUGMENTATION SYSTEM
   */
  FLW("FLW"),
  /**
   * AIRCRAFT FLIGHT TEST STATION
   */
  @XmlEnumValue("FMA1")
  FMA_1("FMA1"),
  /**
   * Port Station: A coast station in the port operations service.
   */
  FP("FP"),
  /**
   * Receiving station only, connected with the general network of
   * telecommunication channels
   */
  FR("FR"),
  /**
   * FIXED SATELLITE SERVICE
   */
  FSS("FSS"),
  /**
   * FIXED SATELLITE SERVICE
   */
  FSSF("FSSF"),
  /**
   * Fixed Station: A station in the fixed service.
   */
  FX("FX"),
  /**
   * CONTROL
   */
  @XmlEnumValue("FX1")
  FX_1("FX1"),
  /**
   * CONTROL - AIRPORT TERMINAL USE
   */
  @XmlEnumValue("FX1A")
  FX_1_A("FX1A"),
  /**
   * CONTROL - INTERCONNECT
   */
  @XmlEnumValue("FX1C")
  FX_1_C("FX1C"),
  /**
   * CONTROL - ITINERANT
   */
  @XmlEnumValue("FX1I")
  FX_1_I("FX1I"),
  /**
   * CONTROL - TEMPOARY INTERCONNECT
   */
  @XmlEnumValue("FX1J")
  FX_1_J("FX1J"),
  /**
   * CONTROL - STAND-BY INTERCONNECT
   */
  @XmlEnumValue("FX1K")
  FX_1_K("FX1K"),
  /**
   * CONTROL - ITINERT INTERCONNECT
   */
  @XmlEnumValue("FX1L")
  FX_1_L("FX1L"),
  /**
   * CONTROL- STAND-BY
   */
  @XmlEnumValue("FX1S")
  FX_1_S("FX1S"),
  /**
   * CONTROL - TEMPORARY
   */
  @XmlEnumValue("FX1T")
  FX_1_T("FX1T"),
  /**
   * FIXED RELAY
   */
  @XmlEnumValue("FX2")
  FX_2("FX2"),
  /**
   * FIXED RELAY - INTERCONNECT
   */
  @XmlEnumValue("FX2C")
  FX_2_C("FX2C"),
  /**
   * FIXED RELAY - ITINERANT
   */
  @XmlEnumValue("FX2I")
  FX_2_I("FX2I"),
  /**
   * FIXED RELAY - TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("FX2J")
  FX_2_J("FX2J"),
  /**
   * FIXED RELAY - STAND-BY INTERCONNECT
   */
  @XmlEnumValue("FX2K")
  FX_2_K("FX2K"),
  /**
   * FIXED REALY - ITINERANT INTERCONNECT
   */
  @XmlEnumValue("FX2L")
  FX_2_L("FX2L"),
  /**
   * FIXED RELAY - STAND-BY
   */
  @XmlEnumValue("FX2S")
  FX_2_S("FX2S"),
  /**
   * FIXED RELAY - TEMPORARY
   */
  @XmlEnumValue("FX2T")
  FX_2_T("FX2T"),
  /**
   * SECONDARY FIXED (TONE SIGNALLING)
   */
  @XmlEnumValue("FX3")
  FX_3("FX3"),
  /**
   * SECONDARY FIXED - INTERCONNECT
   */
  @XmlEnumValue("FX3C")
  FX_3_C("FX3C"),
  /**
   * SECONDARY FIXED - TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("FX3J")
  FX_3_J("FX3J"),
  /**
   * SECONDARY FIXED - STAND-BY
   */
  @XmlEnumValue("FX3S")
  FX_3_S("FX3S"),
  /**
   * SECONDARY FIXED - TEMPORARY
   */
  @XmlEnumValue("FX3T")
  FX_3_T("FX3T"),
  /**
   * TEMPORARY FIXED
   */
  @XmlEnumValue("FX5")
  FX_5("FX5"),
  /**
   * FIXED - INTERCONNECT
   */
  FXC("FXC"),
  /**
   * CENTRAL OFFICE
   */
  FXCO("FXCO"),
  /**
   * CONTROL
   */
  FXCT("FXCT"),
  /**
   * Telecommand Fixed Station: A fixed station in the fixed service the
   * emissions of which are used for terrestrial telecommand.
   */
  FXD("FXD"),
  /**
   * DISPATCH
   */
  FXDI("FXDI"),
  /**
   * Telemetering Fixed Station: A fixed station the emissions of which are used
   * for telemetering.
   */
  FXE("FXE"),
  /**
   * Hydrologic and Meteorological Fixed Station: A fixed station the emissions
   * of which are used for the automatic transmission of either hydrologic or
   * meteorological data, or both.
   */
  FXH("FXH"),
  /**
   * FIXED - ITINERANT
   */
  FXI("FXI"),
  /**
   * INTER-OFFICE
   */
  FXIO("FXIO"),
  /**
   * FIXED - STAND-BY INTERCONNECT
   */
  FXK("FXK"),
  /**
   * OPERATIONAL FIXED
   */
  FXO("FXO"),
  /**
   * OPERATIONAL FIXED - INTERCONNECT
   */
  FXOC("FXOC"),
  /**
   * OPERATIONA FIXED - ITINERANT
   */
  FXOI("FXOI"),
  /**
   * OPERATIONAL FIXED - TEMPORARY INTERCONNECT
   */
  FXOJ("FXOJ"),
  /**
   * OPERATIONAL FIXED - STAND-BY
   */
  FXOS("FXOS"),
  /**
   * OPERATIONAL FIXED - TEMPORARY
   */
  FXOT("FXOT"),
  /**
   * REPEATER
   */
  FXRP("FXRP"),
  /**
   * FIXED RELAY
   */
  FXRX("FXRX"),
  /**
   * FIXED - STAND-BY
   */
  FXS("FXS"),
  /**
   * FIXED SUBSCRIBER
   */
  FXSB("FXSB"),
  /**
   * FIXED - TEMPORARY
   */
  FXT("FXT"),
  /**
   * AUXILIARY TEST
   */
  FXTS("FXTS"),
  /**
   * GROUND COMMUNICATIONS OUTLET
   */
  GCO("GCO"),
  /**
   * Station on board a warship or a military or naval aircraft
   */
  GS("GS"),
  /**
   * INTERNATIONAL AERONAUTICAL MOBILE SATELLITE SERVICE
   */
  IAMS("IAMS"),
  /**
   * FEEDER LINK FOR MOBILE SATELLITE SERVICE
   */
  IFLM("IFLM"),
  /**
   * INTERNATIONAL FIXED SATELLITE SERVICE
   */
  IFSS("IFSS"),
  /**
   * INTERNATIONAL MARITIME MOBILE SATELLITE SERVICE
   */
  IMMS("IMMS"),
  /**
   * INTERNATIONAL MOBILE SATELLITE SERVICE
   */
  IMSS("IMSS"),
  /**
   * Radiolocation Land Station: A station in the radiolocation service not
   * intended to be used while in motion.
   */
  LR("LR"),
  /**
   * RADIOLOCATION LAND - TEMPORARY
   */
  LRT("LRT"),
  /**
   * Aircraft Station: A mobile station in the aeronautical mobile service other
   * than a survival craft station, located on board an aircraft.
   */
  MA("MA"),
  /**
   * Telecommand Aircraft Station: A mobile station in the aeronautical mobile
   * service the emissions of which are used for terrestrial telecommand.
   */
  MAD("MAD"),
  /**
   * Portable Aircraft Station: A portable station operating in the aeronautical
   * mobile service.
   */
  MAP("MAP"),
  /**
   * Space Station: A station located on an object which is beyond, is intended
   * to go beyond, or has been beyond, the major portion of the Earth's
   * atmosphere. (ME is not used on applications.)
   */
  ME("ME"),
  /**
   * AERONAUTICAL MULTICOM
   */
  MFL("MFL"),
  /**
   * AERONAUTICAL MULTICOM (MOBILE)
   */
  @XmlEnumValue("MFL1")
  MFL_1("MFL1"),
  /**
   * AERONAUTICAL MULTICOM (TEMPORARY)
   */
  @XmlEnumValue("MFL2")
  MFL_2("MFL2"),
  /**
   * MARINE OPS FIXED
   */
  MFX("MFX"),
  /**
   * Land Mobile Station: A mobile station in the land mobile service capable of
   * surface movement within the geographical limits of a country or continent.
   */
  ML("ML"),
  /**
   * Telecommand Land Mobile Station: A mobile station in the land mobile
   * service the emissions of which are used for terrestrial telecommand.
   */
  MLD("MLD"),
  /**
   * Portable Land Mobile Station: A portable station operating in the land
   * mobile service.
   */
  MLP("MLP"),
  /**
   * MARITIME MOBILE SATELLITE SERVICE
   */
  MMS("MMS"),
  /**
   * Mobile Station: A station in the mobile service intended to be used while
   * in motion or during halts at unspecified points.
   */
  MO("MO"),
  /**
   * MOBILE/VEHICULAR REPEATER
   */
  @XmlEnumValue("MO3")
  MO_3("MO3"),
  /**
   * MOBILE/VEHICULAR REPEATER WITH INTERCONNECT
   */
  @XmlEnumValue("MO3C")
  MO_3_C("MO3C"),
  /**
   * MOBILE/VEHICULAR REPEATER - ITINERANT
   */
  @XmlEnumValue("MO3I")
  MO_3_I("MO3I"),
  /**
   * MOBILE & TEMPORARY FIXED
   */
  @XmlEnumValue("MO5")
  MO_5("MO5"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT)
   */
  @XmlEnumValue("MO6")
  MO_6("MO6"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - INTERCONNECT
   */
  @XmlEnumValue("MO6C")
  MO_6_C("MO6C"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - ITINERANT
   */
  @XmlEnumValue("MO6I")
  MO_6_I("MO6I"),
  /**
   * PRIVATE CARRIER MOBILE OPERATION (PROFIT) WITH TEMPORARY INTERCONNECT
   */
  @XmlEnumValue("MO6L")
  MO_6_L("MO6L"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - STAND-BY
   */
  @XmlEnumValue("MO6S")
  MO_6_S("MO6S"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT)
   */
  @XmlEnumValue("MO7")
  MO_7("MO7"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - INTERCONNECT
   */
  @XmlEnumValue("MO7C")
  MO_7_C("MO7C"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - ITINERANT
   */
  @XmlEnumValue("MO7I")
  MO_7_I("MO7I"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - WITH ITINERANT INTERCONNECT
   */
  @XmlEnumValue("MO7L")
  MO_7_L("MO7L"),
  /**
   * CENTRALIZED TRUNK MOBILE
   */
  @XmlEnumValue("MO8")
  MO_8("MO8"),
  /**
   * CENTRALIZED TRUNK MOBILE - AIRPORT TERMINAL USE
   */
  @XmlEnumValue("MO8A")
  MO_8_A("MO8A"),
  /**
   * CENTRALIZED TRUNK MOBILE - INTERCONNECT
   */
  @XmlEnumValue("MO8C")
  MO_8_C("MO8C"),
  /**
   * MOBILE - AIRPORT TERMINAL USE
   */
  MOA("MOA"),
  /**
   * Radio Beacon Mobile Station: A mobile station the emissions of which are
   * used to deter-mine its location.
   */
  MOB("MOB"),
  /**
   * MOBILE - INTERCONNECT
   */
  MOC("MOC"),
  /**
   * Telecommand Mobile Station: A mobile station in the mobile service the
   * emissions of which are used for terrestrial telecommand.
   */
  MOD("MOD"),
  /**
   * Telemetering Mobile Station: A mobile station the emissions of which are
   * used for telemetering.
   */
  MOE("MOE"),
  /**
   * Aeronautical Telemetering Mobile Station: A telemetering mobile station
   * used for transmitting data directly related to the airborne testing of the
   * vehicle, (or major components), on which the station is installed.
   */
  MOEA("MOEA"),
  /**
   * Flight Telemetering Mobile Station: A telemetering mobile station used for
   * transmitting data from an airborne vehicle, excluding data related to
   * airborne testing of the vehicle itself, (or major components thereof).
   */
  MOEB("MOEB"),
  /**
   * Surface Telemetering Mobile Station: A telemetering mobile station located
   * on the surface of the Earth and the emissions of which are intended to be
   * received on the surface of the Earth.
   */
  MOEC("MOEC"),
  /**
   * Hydrologic and Meteorological Mobile Station: A mobile station the
   * emissions of which are used for the automatic transmission of either
   * hydrologic or meteorological data, or both.
   */
  MOH("MOH"),
  /**
   * MOBILE - ITINERANT
   */
  MOI("MOI"),
  /**
   * MOBILE WITH ITINERANT INTERCONNECT
   */
  MOL("MOL"),
  /**
   * Portable Mobile Station: A portable station operating in the mobile
   * service.
   */
  MOP("MOP"),
  /**
   * MOBILE - STAND-BY
   */
  MOS("MOS"),
  /**
   * TEMPORATY MOBILE
   */
  MOT("MOT"),
  /**
   * Aeronautical Utility Mobile Station: A mobile station used for
   * communication at airdromes with the aeronautical utility land station, the
   * airdrome control station, the US FAA flight service station, ground
   * vehicles, and aircraft on the ground. (All transmissions shall be subject
   * to the control of the airdrome control station and shall be discontinued
   * immediately when so requested by the airdrome control operators.)
   */
  MOU("MOU"),
  /**
   * AERONAUTICAL UTILITY MOBILE
   */
  @XmlEnumValue("MOU1")
  MOU_1("MOU1"),
  /**
   * Radiolocation Mobile Station: A station in the radiolocation service
   * intended to be used while in motion or during halts at unspecified points.
   */
  MR("MR"),
  /**
   * Portable Radiolocation Station: A portable station operating in the
   * radiolocation service.
   */
  MRP("MRP"),
  /**
   * MARINE RECEIVER TEST
   */
  MRT("MRT"),
  /**
   * MARINE RECEIVER TEST (TEMPORARY)
   */
  @XmlEnumValue("MRT2")
  MRT_2("MRT2"),
  /**
   * Ship Station: A mobile station in the maritime mobile service located on
   * board a vessel which is not permanently moored, other than a survival craft
   * station.
   */
  MS("MS"),
  /**
   * SHORE RADAR TEST
   */
  MSC("MSC"),
  /**
   * Telecommand Ship Station: A mobile station in the maritime mobile service
   * the emissions of which are used for terrestrial telecommand.
   */
  MSD("MSD"),
  /**
   * Portable Ship Station: A portable station operating in the maritime mobile
   * service.
   */
  MSP("MSP"),
  /**
   * SHORE RADIONAVIGATION
   */
  MSR("MSR"),
  /**
   * MOBILE SATELLITE SERVICE
   */
  MSS("MSS"),
  /**
   * Maritime Radionavigation Land Station: A land station in the Maritime
   * Radionavigation Service not intended for use while in motion
   */
  NL("NL"),
  /**
   * Maritime Radar Beacon (racon) Station: A land station in the maritime
   * radionavigation service which employs a radar beacon (racon).
   */
  NLC("NLC"),
  /**
   * Marine Radiobeacon Station: A radiobeacon station in the maritime
   * radionavigation service intended for the benefit of ships.
   */
  NLM("NLM"),
  /**
   * Radionavigation Mobile Station: A station in the radionavigation service
   * intended to be used while in motion or during halts at unspecified points.
   */
  NR("NR"),
  /**
   * Oceanographic Data Station: A station in the maritime mobile service
   * located on a ship, buoy or other sensor platform the emissions of which are
   * used for the transmission of oceanographic data.
   */
  OD("OD"),
  /**
   * Oceanographic Data Interrogating Station: A station in the maritime mobile
   * service the emissions of which are used to initiate, modify, or terminate
   * functions of equipment directly associated with an oceanographic data
   * station, including the station itself.
   */
  OE("OE"),
  /**
   * OTHER
   */
  OTH("OTH"),
  /**
   * Passenger Ship
   */
  PA("PA"),
  /**
   * Combination of 2 or more classes of station
   */
  PL("PL"),
  /**
   * FIXED SATELLITE SERVICE ORB-88 ALLOTMENT PLAN
   */
  PLAN("PLAN"),
  /**
   * Radio Astronomy Station: A station in the radio astronomy service. (This is
   * always a receiving station.)
   */
  RA("RA"),
  /**
   * REMOTE COMMUNICATIONS OUTLET
   */
  RCO("RCO"),
  /**
   * RADIO DETERMINATION SATELLITE SERVICE
   */
  RDS("RDS"),
  /**
   * Radiodetermination station using radio direction finding
   */
  RG("RG"),
  /**
   * AERONAUTICAL MARKER BEACON
   */
  RLA("RLA"),
  /**
   * AERONAUTICAL RADIO BEACON
   */
  RLB("RLB"),
  /**
   * AERONAUTICAL RADIO BEACON (MOBILE)
   */
  @XmlEnumValue("RLB1")
  RLB_1("RLB1"),
  /**
   * AERONAUTICAL RADIO BEACON (TEMPORARY)
   */
  @XmlEnumValue("RLB2")
  RLB_2("RLB2"),
  /**
   * SHORE RADIOLOCATION TEST
   */
  RLC("RLC"),
  /**
   * SHORE RADIOLOCATION TEST (TEMPORARY)
   */
  @XmlEnumValue("RLC2")
  RLC_2("RLC2"),
  /**
   * RADAR/RADAR TEST
   */
  RLD("RLD"),
  /**
   * GLIDE PATH (SLOPE)
   */
  RLG("RLG"),
  /**
   * LOCALIZER
   */
  RLL("RLL"),
  /**
   * OMNIDIRECTIONAL RADIO RANGE
   */
  RLO("RLO"),
  /**
   * SHORE RADIOLOCATION/RACON
   */
  RLR("RLR"),
  /**
   * RADIONAVIGATION LAND TEST
   */
  RLT("RLT"),
  /**
   * RADIONAVIGATION LAND TEST (MOBILE)
   */
  @XmlEnumValue("RLT1")
  RLT_1("RLT1"),
  /**
   * Maritime radionavigation mobile station
   */
  RM("RM"),
  /**
   * Radionavigation Land Station: A station in the radionavigation service not
   * intended to be used in motion.
   */
  RN("RN"),
  /**
   * Loran Station: A long distance radionavigation land station transmitting
   * synchronised pulses. Hyperbolic lines of position are determined by the
   * measurement of the difference in the time of arrival of these pulses.
   */
  RNL("RNL"),
  /**
   * RADIONAVIGATION LAND
   */
  RNV("RNV"),
  /**
   * RAMP CONTROL
   */
  RPC("RPC"),
  /**
   * Meteorological Aids Mobile Station: A mobile station in the meteorological
   * aids service intended to be used while in motion or during halts at
   * unspecified points.
   */
  SA("SA"),
  /**
   * Radiosonde Station: A station in the meteorological aids service employing
   * a radiosonde.
   */
  SAR("SAR"),
  /**
   * SEARCH AND RESCUE (MOBILE)
   */
  @XmlEnumValue("SAR1")
  SAR_1("SAR1"),
  /**
   * Meteorological Aids Base Station: A land station in the meteorological aids
   * service not intended for use while in motion.
   */
  SM("SM"),
  /**
   * Radar Beacon Precipitation Gage Station: A transponder station in the
   * meteorological aids service, the emissions of which are used for
   * telemetering.
   */
  SMB("SMB"),
  /**
   * Meteorological Radar Station: A station in the meteorological aids service
   * employing radar.
   */
  SMD("SMD"),
  /**
   * Radiosonde Ground Station: A station in the meteorological aids service
   * employing a ground station associated with a radiosonde.
   */
  SMRG("SMRG"),
  /**
   * Sounder Network Station: A station equipped with an ionosphere sounder used
   * for the real-time selection of frequencies for operational communication
   * circuits.
   */
  SN("SN"),
  /**
   * Sounder Prediction Station: A station equipped with an ionosphere sounder
   * for real-time monitoring of upper atmosphere phenomena or to obtain data
   * for the prediction of propagation conditions.
   */
  SP("SP"),
  /**
   * Standard Frequency and Time Signal Station: A station in the standard
   * frequency and time signal service.
   */
  SS("SS"),
  /**
   * Space operation earth station in the amateur-satellite service
   */
  TA("TA"),
  /**
   * Aeronautical Earth Station: An earth station in the fixed-satellite service
   * or in some cases in the aeronautical mobile-satellite service located at a
   * specified fixed point on land to provide a feeder link for the aeronautical
   * mobile-satellite service.
   */
  TB("TB"),
  /**
   * Fixed-Satellite Earth Station: An earth station in the fixed-satellite
   * service.
   */
  TC("TC"),
  /**
   * Space Telecommand Earth Station: An earth station the emissions of which
   * are used for space telecommand.
   */
  TD("TD"),
  /**
   * Satellite EPIRB Station: A satellite Emergency Position-Indicating Radio
   * Beacon (EPIRB) in the mobile-satellite service
   */
  TE("TE"),
  /**
   * Radiodetermination-Satellite Earth Station: A fixed earth station in the
   * radiodetermination-satellite service.
   */
  TF("TF"),
  /**
   * Ship Earth Station: A mobile earth station in the maritime mobile-satellite
   * service located on board ship.
   */
  TG("TG"),
  /**
   * Space Research Earth Station: An earth station in the space research
   * service.
   */
  TH("TH"),
  /**
   * Coast Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the maritime mobile-satellite service located at a specified
   * fixed point on land to provide a feeder link for the maritime
   * mobile-satellite.
   */
  TI("TI"),
  /**
   * Aircraft Earth Station: A mobile earth station in the aeronautical
   * mobile-satellite service located on board an aircraft.
   */
  TJ("TJ"),
  /**
   * Space Tracking Earth Station: An earth station which transmits or receives
   * emissions used for space tracking.
   */
  TK("TK"),
  /**
   * Radiodetermination-Satellite Mobile Earth Station: A mobile earth station
   * in the radiodetermination-satellite service.
   */
  TL("TL"),
  /**
   * Meteorological-Satellite Earth Station: An earth station in the
   * meteorological-satellite service.
   */
  TM("TM"),
  /**
   * Radionavigation-Satellite Fixed Earth Station: A fixed earth station in the
   * radionavigation-satellite service.
   */
  TN("TN"),
  /**
   * Aeronautical Radionavigation-Satellite Mobile Earth Station: A mobile earth
   * station in the aeronautical radionavigation-satellite service.
   */
  TO("TO"),
  /**
   * Earth Station (receiving): An earth station used for receiving. (TP is not
   * used on applications.)
   */
  TP("TP"),
  /**
   * Maritime Radionavigation-Satellite Mobile Earth Station: A mobile earth
   * station in the maritime radionavigation-satellite service.
   */
  TQ("TQ"),
  /**
   * Space Telemetering Earth Station: An earth station which receives emissions
   * used for space telemetering.
   */
  TR("TR"),
  /**
   * Television Sound Channel
   */
  TS("TS"),
  /**
   * Space Operation Earth Station: An earth station in the space operation
   * service.
   */
  TT("TT"),
  /**
   * Land Mobile Earth Station: A mobile earth station in the land
   * mobile-satellite service capable of surface movement within the
   * geographical limits of a country or continent.
   */
  TU("TU"),
  /**
   * Television Vision Channel
   */
  TV("TV"),
  /**
   * Earth Exploration-Satellite Earth Station: An earth station in the Earth
   * exploration-satellite service.
   */
  TW("TW"),
  /**
   * Maritime Radionavigation-Satellite Earth Station: A fixed earth station in
   * the maritime radionavigation-satellite service.
   */
  TX("TX"),
  /**
   * Base Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the land mobile-satellite service located at a specified
   * point or within a specified area on land to provide a feeder link for the
   * land mobile-satellite service.
   */
  TY("TY"),
  /**
   * Aeronautical Radionavigation-Satellite Earth Station: A fixed earth station
   * in the aeronautical radionavigation-satellite service.
   */
  TZ("TZ"),
  /**
   * Mobile Earth Station: An earth station in the mobile-satellite service
   * intended to be used while in motion or during halts at unspecified points.
   */
  UA("UA"),
  /**
   * Earth station in the broadcasting-satellite service (sound broadcasting)
   */
  UB("UB"),
  /**
   * Space telecommand mobile earth station
   */
  UD("UD"),
  /**
   * Earth station in the standard frequency-satellite service
   */
  UE("UE"),
  /**
   * Mobile earth station in the space research service
   */
  UH("UH"),
  /**
   * Space tracking mobile earth station
   */
  UK("UK"),
  /**
   * Radionavigation-Satellite Mobile Earth Station: A mobile earth station in
   * the radionavigation-satellite service.
   */
  UM("UM"),
  /**
   * Mobile earth station in the meteorological-satellite service
   */
  UN("UN"),
  /**
   * * Space telemetering mobile earth station
   */
  UR("UR"),
  /**
   * Mobile earth station in the space operation service
   */
  UT("UT"),
  /**
   * Earth station in the broadcasting-satellite service (television)
   */
  UV("UV"),
  /**
   * Mobile earth station in the earth exploration-satellite service
   */
  UW("UW"),
  /**
   * Earth station in the time signal-satellite service
   */
  UY("UY"),
  /**
   * Land Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the mobile-satellite service located at a specified point or
   * within a specified area on land to provide a feeder link for the
   * mobile-satellite service.
   */
  VA("VA"),
  /**
   * RADIOLOCATION WEATHER RADAR
   */
  WDX("WDX"),
  /**
   * RADIOLOCATION WEATHER RADAR - TEMPORARY
   */
  WDXT("WDXT"),
  /**
   * The station class is not known (legacy data only)
   */
  X("X"),
  /**
   * Experimental Contract Developmental Station: An experimental station used
   * for the evaluation or testing under Government contract of electronics
   * equipment or systems in a design or development stage.
   */
  XC("XC"),
  /**
   * Experimental Developmental Station: An experimental station used for
   * evaluation or testing of electronics equipment or systems in a design or
   * development stage.
   */
  XD("XD"),
  /**
   * Experimental Export Station: An experimental station intended for export
   * and used for the evaluation or testing of electronics equipment or systems
   * in the design or development stage.
   */
  XE("XE"),
  /**
   * Experimental Composite Station: An experimental station used in
   * experimental operations of a complex nature not readily specified or used
   * in an operation which is a composite of two or more of the established
   * experimental categories.
   */
  XM("XM"),
  /**
   * Experimental Research Station: An experimental station used in basic
   * studies concerning scientific investigation looking toward the improvement
   * of the art of radiocommunications.
   */
  XR("XR"),
  /**
   * Experimental Testing Station: An experimental station used for the
   * evaluation or testing of electronics equipment or systems, including site
   * selection and transmission path surveys, which have been developed for
   * operational use.
   */
  XT("XT");
  private final String value;

  ListUSC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUSC fromValue(String v) {
    for (ListUSC c : ListUSC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
