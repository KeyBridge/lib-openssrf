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
import us.gov.dod.standard.ssrf._3_1.multiple.Usage;
import us.gov.dod.standard.ssrf._3_1.toa.StnClass;

/**
 * Enumerated values for fields using the ListUSC type.
 * <p>
 * Used in {@link StnClass}, {@link Usage}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUSC")
@XmlEnum
public enum ListUSC {

  /**
   * Aeronautical Radionavigation Land Station: A land station in the
   * aeronautical radionavigation service not intended for use while in motion.
   * (ITU)
   */
  AL("AL"),
  /**
   * Aeronautical Marker Beacon Station: A radionavigation land station in the
   * aeronautical radionavigation service which employs a marker beacon. (INTL)
   */
  ALA("ALA"),
  /**
   * Aeronautical Radiobeacon Station: A radiobeacon station in the aeronautical
   * radionavigation service intended for the benefit of aircraft. (INTL)
   */
  ALB("ALB"),
  /**
   * Aeronautical Radar Beacon (racon) Station: A land station in the
   * aeronautical radionavigation service which employs a radar beacon (racon).
   * (INTL)
   */
  ALC("ALC"),
  /**
   * Glide Path (Slope) Station: A radionavigation land station which provides
   * vertical guidance to aircraft during approach to landing. (INTL)
   */
  ALG("ALG"),
  /**
   * Localizer Station: A radionavigation land station in the aeronautical
   * radionavigation service which employs an Instrument Landing System
   * Localizer. (INTL)
   */
  ALL("ALL"),
  /**
   * Omnidirectional Range Station: A radionavigation land station in the
   * aeronautical radionavigation service providing direct indication of the
   * bearing (omni-bearing) of that station from an aircraft. (INTL)
   */
  ALO("ALO"),
  /**
   * Radio Range Station: A radionavigation land station in the aeronautical
   * radionavigation service providing radial equisignal zones. (In certain
   * instances a radio range station may be placed on board a ship.) (INTL)
   */
  ALR("ALR"),
  /**
   * Surveillance Radar Station: A radionavigation land station in the
   * aeronautical radionavigation service employing radar to display the
   * presence of aircraft within its range. (In certain instances, a
   * surveillance radar station may be placed on board a ship.) (INTL)
   */
  ALS("ALS"),
  /**
   * Radionavigation Land Test Station (Maintenance Test Facility): A
   * radionavigation land station in the aeronautical radionavigation service
   * which is used as a radionavigation calibration station for the transmission
   * of essential information in connection with the testing and calibration of
   * aircraft navigational aids, receiving equipment and interrogators at
   * predetermined surface locations. The primary purpose of this facility is to
   * permit maintenance testing by aircraft radio service personnel. (INTL)
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
   * prior to takeoff. (INTL)
   */
  ALTO("ALTO"),
  /**
   * Aeronautical Radionavigation Mobile Station: A mobile station in the
   * aeronautical radionavigation service intended to be used while in motion or
   * during halts at unspecified points. (ITU)
   */
  AM("AM"),
  /**
   * Altimeter Station: A radionavigation mobile station in the aeronautical
   * radionavigation service which employs a radio altimeter. (INTL)
   */
  AMA("AMA"),
  /**
   * ALASKA PRIVATE (FCC)
   */
  APX("APX"),
  /**
   * ALASKA PRIVATE (TEMPORARY) (FCC)
   */
  @XmlEnumValue("APX2")
  APX_2("APX2"),
  /**
   * Amateur station (ITU)
   */
  AT("AT"),
  /**
   * Fixed station in the Aeronautical Fixed Service (ITU)
   */
  AX("AX"),
  /**
   * AERONAUTICAL FIXED (TEMPORARY) (FCC)
   */
  @XmlEnumValue("AX2")
  AX_2("AX2"),
  /**
   * Broadcasting Station (sound): A station (sound) in the broadcasting
   * service. (ITU)
   */
  BC("BC"),
  /**
   * Broadcasting Station (television): A station (television) in the
   * broadcasting service. (ITU)
   */
  BT("BT"),
  /**
   * DOMESTIC AERONAUTICAL MOBILE-SATELLITE SERVICE (FCC)
   */
  DAMS("DAMS"),
  /**
   * SATELLITE DIGITAL AUDIO RADIO SERVICE (FCC)
   */
  DARS("DARS"),
  /**
   * DIRECT BROADCAST SATELLITE SERVICE (FCC)
   */
  DBS("DBS"),
  /**
   * DOMESTIC FIXED SATELLITE SERVICE (FCC)
   */
  DFSS("DFSS"),
  /**
   * Differential-Global-Positioning-System (DGPS) Station: a terrestrial
   * station used for the transmission of differential correction information to
   * DGPS receivers aboard aircraft for navigation. (INTL)
   */
  DGP("DGP"),
  /**
   * DIRECT TO HOME FIXED SATELLITE (FCC)
   */
  DHFS("DHFS"),
  /**
   * DOMESTIC LAND MOBILE SATELLITE SERVICE (FCC)
   */
  DLMS("DLMS"),
  /**
   * DOMESTIC MARITIME MOBILE SATELLITE SERVICE (FCC)
   */
  DMMS("DMMS"),
  /**
   * DOMESTIC MOBILE SATELLITE SERVICE (FCC)
   */
  DMSS("DMSS"),
  /**
   * DIRECT TO HOME SATELLITE (FCC)
   */
  DTH("DTH"),
  /**
   * Space research (active sensor) space station (ITU)
   */
  @XmlEnumValue("E1")
  E_1("E1"),
  /**
   * Space research (passive sensor) space station (ITU)
   */
  @XmlEnumValue("E2")
  E_2("E2"),
  /**
   * Space station in the Earth exploration-satellite service(active sensor)
   * (ITU)
   */
  @XmlEnumValue("E3")
  E_3("E3"),
  /**
   * Space station in the Earth exploration-satellite (passive sensor) (ITU)
   */
  @XmlEnumValue("E4")
  E_4("E4"),
  /**
   * Space station in the amateur-satellite service (ITU)
   */
  EA("EA"),
  /**
   * Broadcasting-Satellite Space Station (sound broadcasting): A space station
   * in the broadcasting-satellite service (sound broadcasting). (ITU)
   */
  EB("EB"),
  /**
   * Fixed-Satellite Space Station: A space station in the fixed-satellite
   * service. (ITU)
   */
  EC("EC"),
  /**
   * Space Telecommand Space Station: A space station which receives emissions
   * used for space telecommand. (ITU)
   */
  ED("ED"),
  /**
   * Standard Frequency Satellite Space Station: A space station in the standard
   * frequency satellite service. (ITU)
   */
  EE("EE"),
  /**
   * EARTH EXPLORATION SATELLITE SERVICE (FCC)
   */
  EESS("EESS"),
  /**
   * Radiodetermination-Satellite Space Station: A space station in the
   * radiodetermination-satellite service. (ITU)
   */
  EF("EF"),
  /**
   * Maritime Mobile-Satellite Space Station: A space station in the maritime
   * mobile-satellite service. (ITU)
   */
  EG("EG"),
  /**
   * Space Research Space Station: A space station in the space research
   * service. (ITU)
   */
  EH("EH"),
  /**
   * Mobile-Satellite Space Station: A space station in the mobile-satellite
   * service. (ITU)
   */
  EI("EI"),
  /**
   * Aeronautical Mobile-Satellite Space Station: A space station in the
   * aeronautical mobile-satellite service. (ITU)
   */
  EJ("EJ"),
  /**
   * Space Tracking Space Station: A space station which transmits or receives
   * and retransmits emissions used for space tracking. (ITU)
   */
  EK("EK"),
  /**
   * ELT TEST (FCC)
   */
  ELT("ELT"),
  /**
   * ELT TEST (MOBILE) (FCC)
   */
  @XmlEnumValue("ELT1")
  ELT_1("ELT1"),
  /**
   * Meteorological-Satellite Space Station: A space station in the
   * meteorological-satellite service. (ITU)
   */
  EM("EM"),
  /**
   * Meteorological-Satellite Telemetry Space Station (INTL)
   */
  EMER("EMER"),
  /**
   * Meteorological-Satellite Tracking Space Station (INTL)
   */
  EMSS("EMSS"),
  /**
   * Radionavigation-Satellite Space Station: A space station in the
   * radionavigation-satellite service. (ITU)
   */
  EN("EN"),
  /**
   * Aeronautical Radionavigation-Satellite Space Station: A space station in
   * the aeronautical radionavigation-satellite service. (ITU)
   */
  EO("EO"),
  /**
   * Maritime Radionavigation-Satellite Space Station: A space station in the
   * maritime radionavigation-satellite service. (ITU)
   */
  EQ("EQ"),
  /**
   * Space Telemetering Space Station: A space station the emissions of which
   * are used for space telemetering. (ITU)
   */
  ER("ER"),
  /**
   * Inter-Satellite Space Station: A space station in the inter-satellite
   * service. (ITU)
   */
  ES("ES"),
  /**
   * EARTH STATION ON BOARD VESSEL (FCC)
   */
  ESV("ESV"),
  /**
   * Space Operation Space Station: A space station in the space operation
   * service. (ITU)
   */
  ET("ET"),
  /**
   * Land Mobile-Satellite Space Station: A space station in the land
   * mobile-satellite service. (ITU)
   */
  EU("EU"),
  /**
   * Broadcasting-Satellite Space Station (television): A space station in the
   * broadcasting-satellite service (television). (ITU)
   */
  EV("EV"),
  /**
   * Earth Exploration-Satellite Space Station: A space station in the Earth
   * exploration-satellite service. (ITU)
   */
  EW("EW"),
  /**
   * Experimental Station: A station utilising radio waves in experiments with a
   * view to development of science or technique. (EX is not used on
   * applications.) (INTL)
   */
  EX("EX"),
  /**
   * Space station in the time signal-satellite service (ITU)
   */
  EY("EY"),
  /**
   * Aeronautical Station: A land station in the aeronautical mobile service. In
   * certain instances, an aeronautical station may be located, for example on
   * board ship or on a platform at sea. (ITU)
   */
  FA("FA"),
  /**
   * AERONAUTICAL ENROUTE (MOBILE) (FCC)
   */
  @XmlEnumValue("FA1")
  FA_1("FA1"),
  /**
   * AERONAUTICAL ENROUTE (TEMPORARY) (FCC)
   */
  @XmlEnumValue("FA2")
  FA_2("FA2"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM) (FCC)
   */
  FAA("FAA"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM) (MOBILE) (FCC)
   */
  @XmlEnumValue("FAA1")
  FAA_1("FAA1"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM) (TEMPORARY) (FCC)
   */
  @XmlEnumValue("FAA2")
  FAA_2("FAA2"),
  /**
   * Aeronautical Broadcast Station: An aeronautical station which makes
   * scheduled broadcasts of meteorological information and notices to airmen.
   * (In certain instances, an aeronautical broadcast station may be placed on
   * board a ship.) (INTL)
   */
  FAB("FAB"),
  /**
   * Airdrome Control Station: An aeronautical station providing communication
   * between an airdrome control tower and aircraft. (INTL)
   */
  FAC("FAC"),
  /**
   * Telecommand Aeronautical Station: A land station in the aeronautical mobile
   * service the emissions of which are used for terrestrial telecommand. (INTL)
   */
  FAD("FAD"),
  /**
   * AVIATION SUPPORT INSTRUCTIONAL (FCC)
   */
  FAS("FAS"),
  /**
   * AVIATION SUPPORT INSTRUCTIONAL (MOBILE) (FCC)
   */
  @XmlEnumValue("FAS1")
  FAS_1("FAS1"),
  /**
   * Flight Test Station: An aeronautical station used for the transmission of
   * essential communications in connection with the testing of aircraft or
   * major components of aircraft. (INTL)
   */
  FAT("FAT"),
  /**
   * FLIGHT TEST (MOBILE) (FCC)
   */
  @XmlEnumValue("FAT1")
  FAT_1("FAT1"),
  /**
   * FLIGHT TEST (ITINERANT) (FCC)
   */
  @XmlEnumValue("FAT3")
  FAT_3("FAT3"),
  /**
   * Base Station: A land station in the land mobile service. (ITU)
   */
  FB("FB"),
  /**
   * MOBILE RELAY (FCC)
   */
  @XmlEnumValue("FB2")
  FB_2("FB2"),
  /**
   * MOBILE RELAY - AIRPORT TERMINAL USE (FCC)
   */
  @XmlEnumValue("FB2A")
  FB_2_A("FB2A"),
  /**
   * MOBILE RELAY - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB2C")
  FB_2_C("FB2C"),
  /**
   * MOBILE RELAY - ITINERANT (FCC)
   */
  @XmlEnumValue("FB2I")
  FB_2_I("FB2I"),
  /**
   * MOBILE RELAY - TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB2J")
  FB_2_J("FB2J"),
  /**
   * MOBILE RELAY - STAND-BY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB2K")
  FB_2_K("FB2K"),
  /**
   * MOBILE RELAY - ITINERANT INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB2L")
  FB_2_L("FB2L"),
  /**
   * MOBILE RELAY - STAND-BY (FCC)
   */
  @XmlEnumValue("FB2S")
  FB_2_S("FB2S"),
  /**
   * MOBILE RELAY - TEMPORARY (FCC)
   */
  @XmlEnumValue("FB2T")
  FB_2_T("FB2T"),
  /**
   * COMMUNITY REPEATER (FCC)
   */
  @XmlEnumValue("FB4")
  FB_4("FB4"),
  /**
   * COMMUNITY REPEATER - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB4C")
  FB_4_C("FB4C"),
  /**
   * COMMUNITY REPEATER - ITINERANT (FCC)
   */
  @XmlEnumValue("FB4I")
  FB_4_I("FB4I"),
  /**
   * COMMUNITY REPEATER - TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB4J")
  FB_4_J("FB4J"),
  /**
   * COMMUNITY REPEATER - STAND-BY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB4K")
  FB_4_K("FB4K"),
  /**
   * COMMUNITY REPEATER - STAND-BY (FCC)
   */
  @XmlEnumValue("FB4S")
  FB_4_S("FB4S"),
  /**
   * COMMUNITY REPEATER - TEMPORARY (FCC)
   */
  @XmlEnumValue("FB4T")
  FB_4_T("FB4T"),
  /**
   * PRIVATE CARRIER (PROFIT) (FCC)
   */
  @XmlEnumValue("FB6")
  FB_6("FB6"),
  /**
   * PRIVATE CARRIER (PROFIT) - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB6C")
  FB_6_C("FB6C"),
  /**
   * PRIVATE CARRIER (PROFIT) - ITINERANT (FCC)
   */
  @XmlEnumValue("FB6I")
  FB_6_I("FB6I"),
  /**
   * PRIVATE CARRIER (PROFIT) - TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB6J")
  FB_6_J("FB6J"),
  /**
   * PRIVATE CARRIER (PROFIT) - STAND -BY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB6K")
  FB_6_K("FB6K"),
  /**
   * PRIVATE CARRIER (PROFIT) - ITINERANT INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB6L")
  FB_6_L("FB6L"),
  /**
   * PRIVATE CARRIER (PROFIT) - STAND-BY (FCC)
   */
  @XmlEnumValue("FB6S")
  FB_6_S("FB6S"),
  /**
   * PRIVATE CARRIER (PROFIT) - TEMPORARY (FCC)
   */
  @XmlEnumValue("FB6T")
  FB_6_T("FB6T"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) (FCC)
   */
  @XmlEnumValue("FB7")
  FB_7("FB7"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB7C")
  FB_7_C("FB7C"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - ITINERANT (FCC)
   */
  @XmlEnumValue("FB7J")
  FB_7_J("FB7J"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB7T")
  FB_7_T("FB7T"),
  /**
   * CENTRALIZED TRUNK RELAY (FCC)
   */
  @XmlEnumValue("FB8")
  FB_8("FB8"),
  /**
   * CENTRALIZED TRUNK RELAY - AIRPORT TERMINAL USE (FCC)
   */
  @XmlEnumValue("FB8A")
  FB_8_A("FB8A"),
  /**
   * CENTRALIZED TRUNK RELAY - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB8C")
  FB_8_C("FB8C"),
  /**
   * CENTRALIZED TRUNK RELAY - ITINERANT (FCC)
   */
  @XmlEnumValue("FB8I")
  FB_8_I("FB8I"),
  /**
   * CENTRALIZED TRUNK RELAY - TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB8J")
  FB_8_J("FB8J"),
  /**
   * CENTRALIZED TRUNK RELAY - ITINERANT INTERCONNECT (FCC)
   */
  @XmlEnumValue("FB8L")
  FB_8_L("FB8L"),
  /**
   * CENTRALIZED TRUNK RELAY - STANDBY (FCC)
   */
  @XmlEnumValue("FB8S")
  FB_8_S("FB8S"),
  /**
   * CENTRALIZED TRUNK RELAY- TEMPORARY (FCC)
   */
  @XmlEnumValue("FB8T")
  FB_8_T("FB8T"),
  /**
   * SMALL BASE (FCC)
   */
  FBA("FBA"),
  /**
   * SMALL BASE - TEMPORARY (FCC)
   */
  FBAT("FBAT"),
  /**
   * BASE (FCC)
   */
  FBBS("FBBS"),
  /**
   * BASE - INTERCONNECT (FCC)
   */
  FBC("FBC"),
  /**
   * BASE - INTERCONNECT (FCC)
   */
  FBCT("FBCT"),
  /**
   * Telecommand Base Station: A land station in the land mobile service the
   * emissions of which are used for terrestrial telecommand. (INTL)
   */
  FBD("FBD"),
  /**
   * GROUND (FCC)
   */
  FBGS("FBGS"),
  /**
   * BASE - ITINERANT (FCC)
   */
  FBI("FBI"),
  /**
   * BASE- TEMPORARY INTERCONNECT (FCC)
   */
  FBJ("FBJ"),
  /**
   * BASE - STAND-BY INTERCONNECT (FCC)
   */
  FBK("FBK"),
  /**
   * BASE - ITINERANT INTERCONNECT (FCC)
   */
  FBL("FBL"),
  /**
   * BASE - STAND-BY (FCC)
   */
  FBS("FBS"),
  /**
   * AIR-GROUND SIGNALING (FCC)
   */
  FBSI("FBSI"),
  /**
   * STAND-BY (FCC)
   */
  FBST("FBST"),
  /**
   * BASE - TEMPORARY (FCC)
   */
  FBT("FBT"),
  /**
   * Coast Station: A land station in the maritime mobile service. (ITU)
   */
  FC("FC"),
  /**
   * MARINE SUPPORT - TESTING & TRAINING (FCC)
   */
  FCA("FCA"),
  /**
   * MARINE SUPPORT - TESTING & TRAINING (TEMPORARY) (FCC)
   */
  @XmlEnumValue("FCA2")
  FCA_2("FCA2"),
  /**
   * Marine Broadcast Station: A coast station which makes scheduled broadcast
   * of time, meteorological, and hydrographical information. (INTL)
   */
  FCB("FCB"),
  /**
   * Telecommand Coast Station: A land station in the maritime mobile service
   * the emissions of which are used for terrestrial telecommand. (INTL)
   */
  FCD("FCD"),
  /**
   * PRIVATE COAST (FCC)
   */
  FCL("FCL"),
  /**
   * PRIVATE COAST (TEMPORARY) (FCC)
   */
  @XmlEnumValue("FCL2")
  FCL_2("FCL2"),
  /**
   * MARINE UTILITY (FCC)
   */
  FCU("FCU"),
  /**
   * MARINE UTILITY (MOBILE) (FCC)
   */
  @XmlEnumValue("FCU1")
  FCU_1("FCU1"),
  /**
   * Aeronautical Station (R): An aeronautical station in the aeronautical
   * mobile (R) service. (ITU)
   */
  FD("FD"),
  /**
   * FEEDER LIINK FOR DBS IN FIXED SATELLITE SERVICE (FCC)
   */
  FDBS("FDBS"),
  /**
   * Aeronautical Station (OR): An aeronautical station in the aeronautical
   * mobile (OR) service. (ITU)
   */
  FG("FG"),
  /**
   * FLIGHT INFORMATION SERVICES (FCC)
   */
  FIS("FIS"),
  /**
   * Land Station: A station in the mobile service not intended to be used while
   * in motion. (ITU)
   */
  FL("FL"),
  /**
   * Telecommand Land Station: A land station in the mobile service the
   * emissions of which are used for terrestrial telecommand. (INTL)
   */
  FLD("FLD"),
  /**
   * Telemetering Land Station: A land station the emissions of which are used
   * for telemetering. (INTL)
   */
  FLE("FLE"),
  /**
   * Aeronautical Telemetering Land Station: A telemetering land station used in
   * the flight testing of manned or unmanned aircraft, missiles, or major
   * components thereof. (INTL)
   */
  FLEA("FLEA"),
  /**
   * Flight Telemetering Land Station: A telemetering land station the emissions
   * of which are used for telemetering to a balloon; to a booster or rocket,
   * excluding a booster or rocket in orbit about the Earth or in deep space; or
   * to an aircraft, excluding a station used in the flight testing of an
   * aircraft. (INTL)
   */
  FLEB("FLEB"),
  /**
   * Surface Telemetering Land Station: A telemetering land station the
   * emissions of which are intended to be received on the surface of the Earth.
   * (INTL)
   */
  FLEC("FLEC"),
  /**
   * FEEDER LINK IN FIXED SATELLITE SERVICE (FCC)
   */
  FLFS("FLFS"),
  /**
   * Hydrologic and Meteorological Land Station: A land station the emissions of
   * which are used for the automatic transmission of either hydrologic or
   * meteorological data, or both. (INTL)
   */
  FLH("FLH"),
  /**
   * Aeronautical Utility Land Station: A land station located at airdrome
   * control towers and used for control of ground vehicles and aircraft on the
   * ground at airdromes. (INTL)
   */
  FLU("FLU"),
  /**
   * AVIATION SUPPORT SERVICE (MOBILE) (FCC)
   */
  @XmlEnumValue("FLU1")
  FLU_1("FLU1"),
  /**
   * FEEDER LINK FOR WIDE AREA AUGMENTATION SYSTEM (FCC)
   */
  FLW("FLW"),
  /**
   * AIRCRAFT FLIGHT TEST STATION (FCC)
   */
  @XmlEnumValue("FMA1")
  FMA_1("FMA1"),
  /**
   * Port Station: A coast station in the port operations service. (ITU)
   */
  FP("FP"),
  /**
   * Receiving station only, connected with the general network of
   * telecommunication channels (INTL)
   */
  FR("FR"),
  /**
   * FIXED SATELLITE SERVICE (FCC)
   */
  FSS("FSS"),
  /**
   * FIXED SATELLITE SERVICE (FCC)
   */
  FSSF("FSSF"),
  /**
   * Fixed Station: A station in the fixed service. (ITU)
   */
  FX("FX"),
  /**
   * CONTROL (FCC)
   */
  @XmlEnumValue("FX1")
  FX_1("FX1"),
  /**
   * CONTROL - AIRPORT TERMINAL USE (FCC)
   */
  @XmlEnumValue("FX1A")
  FX_1_A("FX1A"),
  /**
   * CONTROL - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX1C")
  FX_1_C("FX1C"),
  /**
   * CONTROL - ITINERANT (FCC)
   */
  @XmlEnumValue("FX1I")
  FX_1_I("FX1I"),
  /**
   * CONTROL - TEMPOARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX1J")
  FX_1_J("FX1J"),
  /**
   * CONTROL - STAND-BY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX1K")
  FX_1_K("FX1K"),
  /**
   * CONTROL - ITINERT INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX1L")
  FX_1_L("FX1L"),
  /**
   * CONTROL- STAND-BY (FCC)
   */
  @XmlEnumValue("FX1S")
  FX_1_S("FX1S"),
  /**
   * CONTROL - TEMPORARY (FCC)
   */
  @XmlEnumValue("FX1T")
  FX_1_T("FX1T"),
  /**
   * FIXED RELAY (FCC)
   */
  @XmlEnumValue("FX2")
  FX_2("FX2"),
  /**
   * FIXED RELAY - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX2C")
  FX_2_C("FX2C"),
  /**
   * FIXED RELAY - ITINERANT (FCC)
   */
  @XmlEnumValue("FX2I")
  FX_2_I("FX2I"),
  /**
   * FIXED RELAY - TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX2J")
  FX_2_J("FX2J"),
  /**
   * FIXED RELAY - STAND-BY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX2K")
  FX_2_K("FX2K"),
  /**
   * FIXED REALY - ITINERANT INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX2L")
  FX_2_L("FX2L"),
  /**
   * FIXED RELAY - STAND-BY (FCC)
   */
  @XmlEnumValue("FX2S")
  FX_2_S("FX2S"),
  /**
   * FIXED RELAY - TEMPORARY (FCC)
   */
  @XmlEnumValue("FX2T")
  FX_2_T("FX2T"),
  /**
   * SECONDARY FIXED (TONE SIGNALLING) (FCC)
   */
  @XmlEnumValue("FX3")
  FX_3("FX3"),
  /**
   * SECONDARY FIXED - INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX3C")
  FX_3_C("FX3C"),
  /**
   * SECONDARY FIXED - TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("FX3J")
  FX_3_J("FX3J"),
  /**
   * SECONDARY FIXED - STAND-BY (FCC)
   */
  @XmlEnumValue("FX3S")
  FX_3_S("FX3S"),
  /**
   * SECONDARY FIXED - TEMPORARY (FCC)
   */
  @XmlEnumValue("FX3T")
  FX_3_T("FX3T"),
  /**
   * TEMPORARY FIXED (FCC)
   */
  @XmlEnumValue("FX5")
  FX_5("FX5"),
  /**
   * FIXED - INTERCONNECT (FCC)
   */
  FXC("FXC"),
  /**
   * CENTRAL OFFICE (FCC)
   */
  FXCO("FXCO"),
  /**
   * CONTROL (FCC)
   */
  FXCT("FXCT"),
  /**
   * Telecommand Fixed Station: A fixed station in the fixed service the
   * emissions of which are used for terrestrial telecommand. (INTL)
   */
  FXD("FXD"),
  /**
   * DISPATCH (FCC)
   */
  FXDI("FXDI"),
  /**
   * Telemetering Fixed Station: A fixed station the emissions of which are used
   * for telemetering. (INTL)
   */
  FXE("FXE"),
  /**
   * Hydrologic and Meteorological Fixed Station: A fixed station the emissions
   * of which are used for the automatic transmission of either hydrologic or
   * meteorological data, or both. (INTL)
   */
  FXH("FXH"),
  /**
   * FIXED - ITINERANT (FCC)
   */
  FXI("FXI"),
  /**
   * INTER-OFFICE (FCC)
   */
  FXIO("FXIO"),
  /**
   * FIXED - STAND-BY INTERCONNECT (FCC)
   */
  FXK("FXK"),
  /**
   * OPERATIONAL FIXED (FCC)
   */
  FXO("FXO"),
  /**
   * OPERATIONAL FIXED - INTERCONNECT (FCC)
   */
  FXOC("FXOC"),
  /**
   * OPERATIONA FIXED - ITINERANT (FCC)
   */
  FXOI("FXOI"),
  /**
   * OPERATIONAL FIXED - TEMPORARY INTERCONNECT (FCC)
   */
  FXOJ("FXOJ"),
  /**
   * OPERATIONAL FIXED - STAND-BY (FCC)
   */
  FXOS("FXOS"),
  /**
   * OPERATIONAL FIXED - TEMPORARY (FCC)
   */
  FXOT("FXOT"),
  /**
   * REPEATER (FCC)
   */
  FXRP("FXRP"),
  /**
   * FIXED RELAY (FCC)
   */
  FXRX("FXRX"),
  /**
   * FIXED - STAND-BY (FCC)
   */
  FXS("FXS"),
  /**
   * FIXED SUBSCRIBER (FCC)
   */
  FXSB("FXSB"),
  /**
   * FIXED - TEMPORARY (FCC)
   */
  FXT("FXT"),
  /**
   * AUXILIARY TEST (FCC)
   */
  FXTS("FXTS"),
  /**
   * GROUND COMMUNICATIONS OUTLET (FCC)
   */
  GCO("GCO"),
  /**
   * Station on board a warship or a military or naval aircraft (INTL)
   */
  GS("GS"),
  /**
   * INTERNATIONAL AERONAUTICAL MOBILE SATELLITE SERVICE (FCC)
   */
  IAMS("IAMS"),
  /**
   * FEEDER LINK FOR MOBILE SATELLITE SERVICE (FCC)
   */
  IFLM("IFLM"),
  /**
   * INTERNATIONAL FIXED SATELLITE SERVICE (FCC)
   */
  IFSS("IFSS"),
  /**
   * INTERNATIONAL MARITIME MOBILE SATELLITE SERVICE (FCC)
   */
  IMMS("IMMS"),
  /**
   * INTERNATIONAL MOBILE SATELLITE SERVICE (FCC)
   */
  IMSS("IMSS"),
  /**
   * Radiolocation Land Station: A station in the radiolocation service not
   * intended to be used while in motion. (ITU)
   */
  LR("LR"),
  /**
   * RADIOLOCATION LAND - TEMPORARY (FCC)
   */
  LRT("LRT"),
  /**
   * Aircraft Station: A mobile station in the aeronautical mobile service other
   * than a survival craft station, located on board an aircraft. (ITU)
   */
  MA("MA"),
  /**
   * Telecommand Aircraft Station: A mobile station in the aeronautical mobile
   * service the emissions of which are used for terrestrial telecommand. (INTL)
   */
  MAD("MAD"),
  /**
   * Portable Aircraft Station: A portable station operating in the aeronautical
   * mobile service. (INTL)
   */
  MAP("MAP"),
  /**
   * Space Station: A station located on an object which is beyond, is intended
   * to go beyond, or has been beyond, the major portion of the Earth's
   * atmosphere. (ME is not used on applications.) (INTL)
   */
  ME("ME"),
  /**
   * AERONAUTICAL MULTICOM (FCC)
   */
  MFL("MFL"),
  /**
   * AERONAUTICAL MULTICOM (MOBILE) (FCC)
   */
  @XmlEnumValue("MFL1")
  MFL_1("MFL1"),
  /**
   * AERONAUTICAL MULTICOM (TEMPORARY) (FCC)
   */
  @XmlEnumValue("MFL2")
  MFL_2("MFL2"),
  /**
   * MARINE OPS FIXED (FCC)
   */
  MFX("MFX"),
  /**
   * Land Mobile Station: A mobile station in the land mobile service capable of
   * surface movement within the geographical limits of a country or continent.
   * (ITU)
   */
  ML("ML"),
  /**
   * Telecommand Land Mobile Station: A mobile station in the land mobile
   * service the emissions of which are used for terrestrial telecommand. (INTL)
   */
  MLD("MLD"),
  /**
   * Portable Land Mobile Station: A portable station operating in the land
   * mobile service. (INTL)
   */
  MLP("MLP"),
  /**
   * MARITIME MOBILE SATELLITE SERVICE (FCC)
   */
  MMS("MMS"),
  /**
   * Mobile Station: A station in the mobile service intended to be used while
   * in motion or during halts at unspecified points. (ITU)
   */
  MO("MO"),
  /**
   * MOBILE/VEHICULAR REPEATER (FCC)
   */
  @XmlEnumValue("MO3")
  MO_3("MO3"),
  /**
   * MOBILE/VEHICULAR REPEATER WITH INTERCONNECT (FCC)
   */
  @XmlEnumValue("MO3C")
  MO_3_C("MO3C"),
  /**
   * MOBILE/VEHICULAR REPEATER - ITINERANT (FCC)
   */
  @XmlEnumValue("MO3I")
  MO_3_I("MO3I"),
  /**
   * MOBILE & TEMPORARY FIXED (FCC)
   */
  @XmlEnumValue("MO5")
  MO_5("MO5"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) (FCC)
   */
  @XmlEnumValue("MO6")
  MO_6("MO6"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - INTERCONNECT (FCC)
   */
  @XmlEnumValue("MO6C")
  MO_6_C("MO6C"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - ITINERANT (FCC)
   */
  @XmlEnumValue("MO6I")
  MO_6_I("MO6I"),
  /**
   * PRIVATE CARRIER MOBILE OPERATION (PROFIT) WITH TEMPORARY INTERCONNECT (FCC)
   */
  @XmlEnumValue("MO6L")
  MO_6_L("MO6L"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - STAND-BY (FCC)
   */
  @XmlEnumValue("MO6S")
  MO_6_S("MO6S"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) (FCC)
   */
  @XmlEnumValue("MO7")
  MO_7("MO7"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - INTERCONNECT (FCC)
   */
  @XmlEnumValue("MO7C")
  MO_7_C("MO7C"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - ITINERANT (FCC)
   */
  @XmlEnumValue("MO7I")
  MO_7_I("MO7I"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - WITH ITINERANT INTERCONNECT (FCC)
   */
  @XmlEnumValue("MO7L")
  MO_7_L("MO7L"),
  /**
   * CENTRALIZED TRUNK MOBILE (FCC)
   */
  @XmlEnumValue("MO8")
  MO_8("MO8"),
  /**
   * CENTRALIZED TRUNK MOBILE - AIRPORT TERMINAL USE (FCC)
   */
  @XmlEnumValue("MO8A")
  MO_8_A("MO8A"),
  /**
   * CENTRALIZED TRUNK MOBILE - INTERCONNECT (FCC)
   */
  @XmlEnumValue("MO8C")
  MO_8_C("MO8C"),
  /**
   * MOBILE - AIRPORT TERMINAL USE (FCC)
   */
  MOA("MOA"),
  /**
   * Radio Beacon Mobile Station: A mobile station the emissions of which are
   * used to deter-mine its location. (INTL)
   */
  MOB("MOB"),
  /**
   * MOBILE - INTERCONNECT (FCC)
   */
  MOC("MOC"),
  /**
   * Telecommand Mobile Station: A mobile station in the mobile service the
   * emissions of which are used for terrestrial telecommand. (INTL)
   */
  MOD("MOD"),
  /**
   * Telemetering Mobile Station: A mobile station the emissions of which are
   * used for telemetering. (INTL)
   */
  MOE("MOE"),
  /**
   * Aeronautical Telemetering Mobile Station: A telemetering mobile station
   * used for transmitting data directly related to the airborne testing of the
   * vehicle, (or major components), on which the station is installed. (INTL)
   */
  MOEA("MOEA"),
  /**
   * Flight Telemetering Mobile Station: A telemetering mobile station used for
   * transmitting data from an airborne vehicle, excluding data related to
   * airborne testing of the vehicle itself, (or major components thereof).
   * (INTL)
   */
  MOEB("MOEB"),
  /**
   * Surface Telemetering Mobile Station: A telemetering mobile station located
   * on the surface of the Earth and the emissions of which are intended to be
   * received on the surface of the Earth. (INTL)
   */
  MOEC("MOEC"),
  /**
   * Hydrologic and Meteorological Mobile Station: A mobile station the
   * emissions of which are used for the automatic transmission of either
   * hydrologic or meteorological data, or both. (INTL)
   */
  MOH("MOH"),
  /**
   * MOBILE - ITINERANT (FCC)
   */
  MOI("MOI"),
  /**
   * MOBILE WITH ITINERANT INTERCONNECT (FCC)
   */
  MOL("MOL"),
  /**
   * Portable Mobile Station: A portable station operating in the mobile
   * service. (INTL)
   */
  MOP("MOP"),
  /**
   * MOBILE - STAND-BY (FCC)
   */
  MOS("MOS"),
  /**
   * TEMPORATY MOBILE (FCC)
   */
  MOT("MOT"),
  /**
   * Aeronautical Utility Mobile Station: A mobile station used for
   * communication at airdromes with the aeronautical utility land station, the
   * airdrome control station, the US FAA flight service station, ground
   * vehicles, and aircraft on the ground. (All transmissions shall be subject
   * to the control of the airdrome control station and shall be discontinued
   * immediately when so requested by the airdrome control operators.) (INTL)
   */
  MOU("MOU"),
  /**
   * AERONAUTICAL UTILITY MOBILE (FCC)
   */
  @XmlEnumValue("MOU1")
  MOU_1("MOU1"),
  /**
   * Radiolocation Mobile Station: A station in the radiolocation service
   * intended to be used while in motion or during halts at unspecified points.
   * (ITU)
   */
  MR("MR"),
  /**
   * Portable Radiolocation Station: A portable station operating in the
   * radiolocation service. (INTL)
   */
  MRP("MRP"),
  /**
   * MARINE RECEIVER TEST (FCC)
   */
  MRT("MRT"),
  /**
   * MARINE RECEIVER TEST (TEMPORARY) (FCC)
   */
  @XmlEnumValue("MRT2")
  MRT_2("MRT2"),
  /**
   * Ship Station: A mobile station in the maritime mobile service located on
   * board a vessel which is not permanently moored, other than a survival craft
   * station. (ITU)
   */
  MS("MS"),
  /**
   * SHORE RADAR TEST (FCC)
   */
  MSC("MSC"),
  /**
   * Telecommand Ship Station: A mobile station in the maritime mobile service
   * the emissions of which are used for terrestrial telecommand. (INTL)
   */
  MSD("MSD"),
  /**
   * Portable Ship Station: A portable station operating in the maritime mobile
   * service. (INTL)
   */
  MSP("MSP"),
  /**
   * SHORE RADIONAVIGATION (FCC)
   */
  MSR("MSR"),
  /**
   * MOBILE SATELLITE SERVICE (FCC)
   */
  MSS("MSS"),
  /**
   * Maritime Radionavigation Land Station: A land station in the Maritime
   * Radionavigation Service not intended for use while in motion (ITU)
   */
  NL("NL"),
  /**
   * Maritime Radar Beacon (racon) Station: A land station in the maritime
   * radionavigation service which employs a radar beacon (racon). (INTL)
   */
  NLC("NLC"),
  /**
   * Marine Radiobeacon Station: A radiobeacon station in the maritime
   * radionavigation service intended for the benefit of ships. (INTL)
   */
  NLM("NLM"),
  /**
   * Radionavigation Mobile Station: A station in the radionavigation service
   * intended to be used while in motion or during halts at unspecified points.
   * (ITU)
   */
  NR("NR"),
  /**
   * Oceanographic Data Station: A station in the maritime mobile service
   * located on a ship, buoy or other sensor platform the emissions of which are
   * used for the transmission of oceanographic data. (ITU)
   */
  OD("OD"),
  /**
   * Oceanographic Data Interrogating Station: A station in the maritime mobile
   * service the emissions of which are used to initiate, modify, or terminate
   * functions of equipment directly associated with an oceanographic data
   * station, including the station itself. (ITU)
   */
  OE("OE"),
  /**
   * OTHER - If selected a clarifying Remark SHOULD be entered.
   */
  OTH("OTH"),
  /**
   * Passenger Ship (INTL)
   */
  PA("PA"),
  /**
   * Combination of 2 or more classes of station (ITU)
   */
  PL("PL"),
  /**
   * FIXED SATELLITE SERVICE ORB-88 ALLOTMENT PLAN (FCC)
   */
  PLAN("PLAN"),
  /**
   * Radio Astronomy Station: A station in the radio astronomy service. (This is
   * always a receiving station.) (ITU)
   */
  RA("RA"),
  /**
   * REMOTE COMMUNICATIONS OUTLET (FCC)
   */
  RCO("RCO"),
  /**
   * RADIO DETERMINATION SATELLITE SERVICE (FCC)
   */
  RDS("RDS"),
  /**
   * Radiodetermination station using radio direction finding (ITU)
   */
  RG("RG"),
  /**
   * AERONAUTICAL MARKER BEACON (FCC)
   */
  RLA("RLA"),
  /**
   * AERONAUTICAL RADIO BEACON (FCC)
   */
  RLB("RLB"),
  /**
   * AERONAUTICAL RADIO BEACON (MOBILE) (FCC)
   */
  @XmlEnumValue("RLB1")
  RLB_1("RLB1"),
  /**
   * AERONAUTICAL RADIO BEACON (TEMPORARY) (FCC)
   */
  @XmlEnumValue("RLB2")
  RLB_2("RLB2"),
  /**
   * SHORE RADIOLOCATION TEST (FCC)
   */
  RLC("RLC"),
  /**
   * SHORE RADIOLOCATION TEST (TEMPORARY) (FCC)
   */
  @XmlEnumValue("RLC2")
  RLC_2("RLC2"),
  /**
   * RADAR/RADAR TEST (FCC)
   */
  RLD("RLD"),
  /**
   * GLIDE PATH (SLOPE) (FCC)
   */
  RLG("RLG"),
  /**
   * LOCALIZER (FCC)
   */
  RLL("RLL"),
  /**
   * OMNIDIRECTIONAL RADIO RANGE (FCC)
   */
  RLO("RLO"),
  /**
   * SHORE RADIOLOCATION/RACON (FCC)
   */
  RLR("RLR"),
  /**
   * RADIONAVIGATION LAND TEST (FCC)
   */
  RLT("RLT"),
  /**
   * RADIONAVIGATION LAND TEST (MOBILE) (FCC)
   */
  @XmlEnumValue("RLT1")
  RLT_1("RLT1"),
  /**
   * Maritime radionavigation mobile station (ITU)
   */
  RM("RM"),
  /**
   * Radionavigation Land Station: A station in the radionavigation service not
   * intended to be used in motion. (ITU)
   */
  RN("RN"),
  /**
   * Loran Station: A long distance radionavigation land station transmitting
   * synchronised pulses. Hyperbolic lines of position are determined by the
   * measurement of the difference in the time of arrival of these pulses.
   * (INTL)
   */
  RNL("RNL"),
  /**
   * RADIONAVIGATION LAND (FCC)
   */
  RNV("RNV"),
  /**
   * RAMP CONTROL (FCC)
   */
  RPC("RPC"),
  /**
   * Meteorological Aids Mobile Station: A mobile station in the meteorological
   * aids service intended to be used while in motion or during halts at
   * unspecified points. (ITU)
   */
  SA("SA"),
  /**
   * Radiosonde Station: A station in the meteorological aids service employing
   * a radiosonde. (INTL)
   */
  SAR("SAR"),
  /**
   * SEARCH AND RESCUE (MOBILE) (FCC)
   */
  @XmlEnumValue("SAR1")
  SAR_1("SAR1"),
  /**
   * Meteorological Aids Base Station: A land station in the meteorological aids
   * service not intended for use while in motion. (ITU)
   */
  SM("SM"),
  /**
   * Radar Beacon Precipitation Gage Station: A transponder station in the
   * meteorological aids service, the emissions of which are used for
   * telemetering. (INTL)
   */
  SMB("SMB"),
  /**
   * Meteorological Radar Station: A station in the meteorological aids service
   * employing radar. (INTL)
   */
  SMD("SMD"),
  /**
   * Radiosonde Ground Station: A station in the meteorological aids service
   * employing a ground station associated with a radiosonde. (INTL)
   */
  SMRG("SMRG"),
  /**
   * Sounder Network Station: A station equipped with an ionosphere sounder used
   * for the real-time selection of frequencies for operational communication
   * circuits. (INTL)
   */
  SN("SN"),
  /**
   * Sounder Prediction Station: A station equipped with an ionosphere sounder
   * for real-time monitoring of upper atmosphere phenomena or to obtain data
   * for the prediction of propagation conditions. (INTL)
   */
  SP("SP"),
  /**
   * Standard Frequency and Time Signal Station: A station in the standard
   * frequency and time signal service. (ITU)
   */
  SS("SS"),
  /**
   * Space operation earth station in the amateur-satellite service (ITU)
   */
  TA("TA"),
  /**
   * Aeronautical Earth Station: An earth station in the fixed-satellite service
   * or in some cases in the aeronautical mobile-satellite service located at a
   * specified fixed point on land to provide a feeder link for the aeronautical
   * mobile-satellite service. (ITU)
   */
  TB("TB"),
  /**
   * Fixed-Satellite Earth Station: An earth station in the fixed-satellite
   * service. (ITU)
   */
  TC("TC"),
  /**
   * Space Telecommand Earth Station: An earth station the emissions of which
   * are used for space telecommand. (ITU)
   */
  TD("TD"),
  /**
   * Satellite EPIRB Station: A satellite Emergency Position-Indicating Radio
   * Beacon (EPIRB) in the mobile-satellite service (ITU)
   */
  TE("TE"),
  /**
   * Radiodetermination-Satellite Earth Station: A fixed earth station in the
   * radiodetermination-satellite service. (ITU)
   */
  TF("TF"),
  /**
   * Ship Earth Station: A mobile earth station in the maritime mobile-satellite
   * service located on board ship. (ITU)
   */
  TG("TG"),
  /**
   * Space Research Earth Station: An earth station in the space research
   * service. (ITU)
   */
  TH("TH"),
  /**
   * Coast Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the maritime mobile-satellite service located at a specified
   * fixed point on land to provide a feeder link for the maritime
   * mobile-satellite. (ITU)
   */
  TI("TI"),
  /**
   * Aircraft Earth Station: A mobile earth station in the aeronautical
   * mobile-satellite service located on board an aircraft. (ITU)
   */
  TJ("TJ"),
  /**
   * Space Tracking Earth Station: An earth station which transmits or receives
   * emissions used for space tracking. (ITU)
   */
  TK("TK"),
  /**
   * Radiodetermination-Satellite Mobile Earth Station: A mobile earth station
   * in the radiodetermination-satellite service. (ITU)
   */
  TL("TL"),
  /**
   * Meteorological-Satellite Earth Station: An earth station in the
   * meteorological-satellite service. (ITU)
   */
  TM("TM"),
  /**
   * Radionavigation-Satellite Fixed Earth Station: A fixed earth station in the
   * radionavigation-satellite service. (ITU)
   */
  TN("TN"),
  /**
   * Aeronautical Radionavigation-Satellite Mobile Earth Station: A mobile earth
   * station in the aeronautical radionavigation-satellite service. (ITU)
   */
  TO("TO"),
  /**
   * Earth Station (receiving): An earth station used for receiving. (TP is not
   * used on applications.) (INTL)
   */
  TP("TP"),
  /**
   * Maritime Radionavigation-Satellite Mobile Earth Station: A mobile earth
   * station in the maritime radionavigation-satellite service. (ITU)
   */
  TQ("TQ"),
  /**
   * Space Telemetering Earth Station: An earth station which receives emissions
   * used for space telemetering. (ITU)
   */
  TR("TR"),
  /**
   * Television Sound Channel (INTL)
   */
  TS("TS"),
  /**
   * Space Operation Earth Station: An earth station in the space operation
   * service. (ITU)
   */
  TT("TT"),
  /**
   * Land Mobile Earth Station: A mobile earth station in the land
   * mobile-satellite service capable of surface movement within the
   * geographical limits of a country or continent. (ITU)
   */
  TU("TU"),
  /**
   * Television Vision Channel (INTL)
   */
  TV("TV"),
  /**
   * Earth Exploration-Satellite Earth Station: An earth station in the Earth
   * exploration-satellite service. (ITU)
   */
  TW("TW"),
  /**
   * Maritime Radionavigation-Satellite Earth Station: A fixed earth station in
   * the maritime radionavigation-satellite service. (ITU)
   */
  TX("TX"),
  /**
   * Base Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the land mobile-satellite service located at a specified
   * point or within a specified area on land to provide a feeder link for the
   * land mobile-satellite service. (ITU)
   */
  TY("TY"),
  /**
   * Aeronautical Radionavigation-Satellite Earth Station: A fixed earth station
   * in the aeronautical radionavigation-satellite service. (ITU)
   */
  TZ("TZ"),
  /**
   * Mobile Earth Station: An earth station in the mobile-satellite service
   * intended to be used while in motion or during halts at unspecified points.
   * (ITU)
   */
  UA("UA"),
  /**
   * Earth station in the broadcasting-satellite service (sound broadcasting)
   * (ITU)
   */
  UB("UB"),
  /**
   * Space telecommand mobile earth station (ITU)
   */
  UD("UD"),
  /**
   * Earth station in the standard frequency-satellite service (ITU)
   */
  UE("UE"),
  /**
   * Mobile earth station in the space research service (ITU)
   */
  UH("UH"),
  /**
   * Space tracking mobile earth station (ITU)
   */
  UK("UK"),
  /**
   * Radionavigation-Satellite Mobile Earth Station: A mobile earth station in
   * the radionavigation-satellite service. (ITU)
   */
  UM("UM"),
  /**
   * Mobile earth station in the meteorological-satellite service (ITU)
   */
  UN("UN"),
  /**
   * * Space telemetering mobile earth station (ITU)
   */
  UR("UR"),
  /**
   * Mobile earth station in the space operation service (ITU)
   */
  UT("UT"),
  /**
   * Earth station in the broadcasting-satellite service (television) (ITU)
   */
  UV("UV"),
  /**
   * Mobile earth station in the earth exploration-satellite service (ITU)
   */
  UW("UW"),
  /**
   * Earth station in the time signal-satellite service (ITU)
   */
  UY("UY"),
  /**
   * Land Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the mobile-satellite service located at a specified point or
   * within a specified area on land to provide a feeder link for the
   * mobile-satellite service. (ITU)
   */
  VA("VA"),
  /**
   * RADIOLOCATION WEATHER RADAR (FCC)
   */
  WDX("WDX"),
  /**
   * RADIOLOCATION WEATHER RADAR - TEMPORARY (FCC)
   */
  WDXT("WDXT"),
  /**
   * The station class is not known (legacy data only) (INTL)
   */
  X("X"),
  /**
   * Experimental Contract Developmental Station: An experimental station used
   * for the evaluation or testing under Government contract of electronics
   * equipment or systems in a design or development stage. (INTL)
   */
  XC("XC"),
  /**
   * Experimental Developmental Station: An experimental station used for
   * evaluation or testing of electronics equipment or systems in a design or
   * development stage. (INTL)
   */
  XD("XD"),
  /**
   * Experimental Export Station: An experimental station intended for export
   * and used for the evaluation or testing of electronics equipment or systems
   * in the design or development stage. (INTL)
   */
  XE("XE"),
  /**
   * Experimental Composite Station: An experimental station used in
   * experimental operations of a complex nature not readily specified or used
   * in an operation which is a composite of two or more of the established
   * experimental categories. (INTL)
   */
  XM("XM"),
  /**
   * Experimental Research Station: An experimental station used in basic
   * studies concerning scientific investigation looking toward the improvement
   * of the art of radiocommunications. (INTL)
   */
  XR("XR"),
  /**
   * Experimental Testing Station: An experimental station used for the
   * evaluation or testing of electronics equipment or systems, including site
   * selection and transmission path surveys, which have been developed for
   * operational use. (INTL)
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
