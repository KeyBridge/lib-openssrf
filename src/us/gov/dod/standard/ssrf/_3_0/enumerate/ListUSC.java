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
package us.gov.dod.standard.ssrf._3_0.enumerate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListUSC.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListUSC"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S5"> &lt;enumeration value="AL"/>
 * &lt;enumeration value="ALA"/> &lt;enumeration value="ALB"/> &lt;enumeration
 * value="ALC"/> &lt;enumeration value="ALG"/> &lt;enumeration value="ALL"/>
 * &lt;enumeration value="ALO"/> &lt;enumeration value="ALR"/> &lt;enumeration
 * value="ALS"/> &lt;enumeration value="ALTM"/> &lt;enumeration value="ALTO"/>
 * &lt;enumeration value="AM"/> &lt;enumeration value="AMA"/> &lt;enumeration
 * value="APX"/> &lt;enumeration value="APX2"/> &lt;enumeration value="AT"/>
 * &lt;enumeration value="AX"/> &lt;enumeration value="AX2"/> &lt;enumeration
 * value="BC"/> &lt;enumeration value="BT"/> &lt;enumeration value="DAMS"/>
 * &lt;enumeration value="DARS"/> &lt;enumeration value="DBS"/> &lt;enumeration
 * value="DFSS"/> &lt;enumeration value="DGP"/> &lt;enumeration value="DHFS"/>
 * &lt;enumeration value="DLMS"/> &lt;enumeration value="DMMS"/> &lt;enumeration
 * value="DMSS"/> &lt;enumeration value="DTH"/> &lt;enumeration value="E1"/>
 * &lt;enumeration value="E2"/> &lt;enumeration value="E3"/> &lt;enumeration
 * value="E4"/> &lt;enumeration value="EA"/> &lt;enumeration value="EB"/>
 * &lt;enumeration value="EC"/> &lt;enumeration value="ED"/> &lt;enumeration
 * value="EE"/> &lt;enumeration value="EESS"/> &lt;enumeration value="EF"/>
 * &lt;enumeration value="EG"/> &lt;enumeration value="EH"/> &lt;enumeration
 * value="EI"/> &lt;enumeration value="EJ"/> &lt;enumeration value="EK"/>
 * &lt;enumeration value="ELT"/> &lt;enumeration value="ELT1"/> &lt;enumeration
 * value="EM"/> &lt;enumeration value="EMER"/> &lt;enumeration value="EMSS"/>
 * &lt;enumeration value="EN"/> &lt;enumeration value="EO"/> &lt;enumeration
 * value="EQ"/> &lt;enumeration value="ER"/> &lt;enumeration value="ES"/>
 * &lt;enumeration value="ESV"/> &lt;enumeration value="ET"/> &lt;enumeration
 * value="EU"/> &lt;enumeration value="EV"/> &lt;enumeration value="EW"/>
 * &lt;enumeration value="EX"/> &lt;enumeration value="EY"/> &lt;enumeration
 * value="FA"/> &lt;enumeration value="FA1"/> &lt;enumeration value="FA2"/>
 * &lt;enumeration value="FAA"/> &lt;enumeration value="FAA1"/> &lt;enumeration
 * value="FAA2"/> &lt;enumeration value="FAB"/> &lt;enumeration value="FAC"/>
 * &lt;enumeration value="FAD"/> &lt;enumeration value="FAS"/> &lt;enumeration
 * value="FAS1"/> &lt;enumeration value="FAT"/> &lt;enumeration value="FAT1"/>
 * &lt;enumeration value="FAT3"/> &lt;enumeration value="FB"/> &lt;enumeration
 * value="FB2"/> &lt;enumeration value="FB2A"/> &lt;enumeration value="FB2C"/>
 * &lt;enumeration value="FB2I"/> &lt;enumeration value="FB2J"/> &lt;enumeration
 * value="FB2K"/> &lt;enumeration value="FB2L"/> &lt;enumeration value="FB2S"/>
 * &lt;enumeration value="FB2T"/> &lt;enumeration value="FB4"/> &lt;enumeration
 * value="FB4C"/> &lt;enumeration value="FB4I"/> &lt;enumeration value="FB4J"/>
 * &lt;enumeration value="FB4K"/> &lt;enumeration value="FB4S"/> &lt;enumeration
 * value="FB4T"/> &lt;enumeration value="FB6"/> &lt;enumeration value="FB6C"/>
 * &lt;enumeration value="FB6I"/> &lt;enumeration value="FB6J"/> &lt;enumeration
 * value="FB6K"/> &lt;enumeration value="FB6L"/> &lt;enumeration value="FB6S"/>
 * &lt;enumeration value="FB6T"/> &lt;enumeration value="FB7"/> &lt;enumeration
 * value="FB7C"/> &lt;enumeration value="FB7J"/> &lt;enumeration value="FB7T"/>
 * &lt;enumeration value="FB8"/> &lt;enumeration value="FB8A"/> &lt;enumeration
 * value="FB8C"/> &lt;enumeration value="FB8I"/> &lt;enumeration value="FB8J"/>
 * &lt;enumeration value="FB8L"/> &lt;enumeration value="FB8S"/> &lt;enumeration
 * value="FB8T"/> &lt;enumeration value="FBA"/> &lt;enumeration value="FBAT"/>
 * &lt;enumeration value="FBBS"/> &lt;enumeration value="FBC"/> &lt;enumeration
 * value="FBCT"/> &lt;enumeration value="FBD"/> &lt;enumeration value="FBGS"/>
 * &lt;enumeration value="FBI"/> &lt;enumeration value="FBJ"/> &lt;enumeration
 * value="FBK"/> &lt;enumeration value="FBL"/> &lt;enumeration value="FBS"/>
 * &lt;enumeration value="FBSI"/> &lt;enumeration value="FBST"/> &lt;enumeration
 * value="FBT"/> &lt;enumeration value="FC"/> &lt;enumeration value="FCA"/>
 * &lt;enumeration value="FCA2"/> &lt;enumeration value="FCB"/> &lt;enumeration
 * value="FCD"/> &lt;enumeration value="FCL"/> &lt;enumeration value="FCL2"/>
 * &lt;enumeration value="FCU"/> &lt;enumeration value="FCU1"/> &lt;enumeration
 * value="FD"/> &lt;enumeration value="FDBS"/> &lt;enumeration value="FG"/>
 * &lt;enumeration value="FIS"/> &lt;enumeration value="FL"/> &lt;enumeration
 * value="FLD"/> &lt;enumeration value="FLE"/> &lt;enumeration value="FLEA"/>
 * &lt;enumeration value="FLEB"/> &lt;enumeration value="FLEC"/> &lt;enumeration
 * value="FLFS"/> &lt;enumeration value="FLH"/> &lt;enumeration value="FLU"/>
 * &lt;enumeration value="FLU1"/> &lt;enumeration value="FLW"/> &lt;enumeration
 * value="FMA1"/> &lt;enumeration value="FP"/> &lt;enumeration value="FR"/>
 * &lt;enumeration value="FSS"/> &lt;enumeration value="FSSF"/> &lt;enumeration
 * value="FX"/> &lt;enumeration value="FX1"/> &lt;enumeration value="FX1A"/>
 * &lt;enumeration value="FX1C"/> &lt;enumeration value="FX1I"/> &lt;enumeration
 * value="FX1J"/> &lt;enumeration value="FX1K"/> &lt;enumeration value="FX1L"/>
 * &lt;enumeration value="FX1S"/> &lt;enumeration value="FX1T"/> &lt;enumeration
 * value="FX2"/> &lt;enumeration value="FX2C"/> &lt;enumeration value="FX2I"/>
 * &lt;enumeration value="FX2J"/> &lt;enumeration value="FX2K"/> &lt;enumeration
 * value="FX2L"/> &lt;enumeration value="FX2S"/> &lt;enumeration value="FX2T"/>
 * &lt;enumeration value="FX3"/> &lt;enumeration value="FX3C"/> &lt;enumeration
 * value="FX3J"/> &lt;enumeration value="FX3S"/> &lt;enumeration value="FX3T"/>
 * &lt;enumeration value="FX5"/> &lt;enumeration value="FXC"/> &lt;enumeration
 * value="FXCO"/> &lt;enumeration value="FXCT"/> &lt;enumeration value="FXD"/>
 * &lt;enumeration value="FXDI"/> &lt;enumeration value="FXE"/> &lt;enumeration
 * value="FXH"/> &lt;enumeration value="FXI"/> &lt;enumeration value="FXIO"/>
 * &lt;enumeration value="FXK"/> &lt;enumeration value="FXO"/> &lt;enumeration
 * value="FXOC"/> &lt;enumeration value="FXOI"/> &lt;enumeration value="FXOJ"/>
 * &lt;enumeration value="FXOS"/> &lt;enumeration value="FXOT"/> &lt;enumeration
 * value="FXRP"/> &lt;enumeration value="FXRX"/> &lt;enumeration value="FXS"/>
 * &lt;enumeration value="FXSB"/> &lt;enumeration value="FXT"/> &lt;enumeration
 * value="FXTS"/> &lt;enumeration value="GCO"/> &lt;enumeration value="GS"/>
 * &lt;enumeration value="IAMS"/> &lt;enumeration value="IFLM"/> &lt;enumeration
 * value="IFSS"/> &lt;enumeration value="IMMS"/> &lt;enumeration value="IMSS"/>
 * &lt;enumeration value="LR"/> &lt;enumeration value="LRT"/> &lt;enumeration
 * value="MA"/> &lt;enumeration value="MAD"/> &lt;enumeration value="MAP"/>
 * &lt;enumeration value="ME"/> &lt;enumeration value="MFL"/> &lt;enumeration
 * value="MFL1"/> &lt;enumeration value="MFL2"/> &lt;enumeration value="MFX"/>
 * &lt;enumeration value="ML"/> &lt;enumeration value="MLD"/> &lt;enumeration
 * value="MLP"/> &lt;enumeration value="MMS"/> &lt;enumeration value="MO"/>
 * &lt;enumeration value="MO3"/> &lt;enumeration value="MO3C"/> &lt;enumeration
 * value="MO3I"/> &lt;enumeration value="MO5"/> &lt;enumeration value="MO6"/>
 * &lt;enumeration value="MO6C"/> &lt;enumeration value="MO6I"/> &lt;enumeration
 * value="MO6L"/> &lt;enumeration value="MO6S"/> &lt;enumeration value="MO7"/>
 * &lt;enumeration value="MO7C"/> &lt;enumeration value="MO7I"/> &lt;enumeration
 * value="MO7L"/> &lt;enumeration value="MO8"/> &lt;enumeration value="MO8A"/>
 * &lt;enumeration value="MO8C"/> &lt;enumeration value="MOA"/> &lt;enumeration
 * value="MOB"/> &lt;enumeration value="MOC"/> &lt;enumeration value="MOD"/>
 * &lt;enumeration value="MOE"/> &lt;enumeration value="MOEA"/> &lt;enumeration
 * value="MOEB"/> &lt;enumeration value="MOEC"/> &lt;enumeration value="MOH"/>
 * &lt;enumeration value="MOI"/> &lt;enumeration value="MOL"/> &lt;enumeration
 * value="MOP"/> &lt;enumeration value="MOS"/> &lt;enumeration value="MOT"/>
 * &lt;enumeration value="MOU"/> &lt;enumeration value="MOU1"/> &lt;enumeration
 * value="MR"/> &lt;enumeration value="MRP"/> &lt;enumeration value="MRT"/>
 * &lt;enumeration value="MRT2"/> &lt;enumeration value="MS"/> &lt;enumeration
 * value="MSC"/> &lt;enumeration value="MSD"/> &lt;enumeration value="MSP"/>
 * &lt;enumeration value="MSR"/> &lt;enumeration value="MSS"/> &lt;enumeration
 * value="NL"/> &lt;enumeration value="NLC"/> &lt;enumeration value="NLM"/>
 * &lt;enumeration value="NR"/> &lt;enumeration value="OD"/> &lt;enumeration
 * value="OE"/> &lt;enumeration value="OTH"/> &lt;enumeration value="PA"/>
 * &lt;enumeration value="PL"/> &lt;enumeration value="PLAN"/> &lt;enumeration
 * value="RA"/> &lt;enumeration value="RCO"/> &lt;enumeration value="RDS"/>
 * &lt;enumeration value="RG"/> &lt;enumeration value="RLA"/> &lt;enumeration
 * value="RLB"/> &lt;enumeration value="RLB1"/> &lt;enumeration value="RLB2"/>
 * &lt;enumeration value="RLC"/> &lt;enumeration value="RLC2"/> &lt;enumeration
 * value="RLD"/> &lt;enumeration value="RLG"/> &lt;enumeration value="RLL"/>
 * &lt;enumeration value="RLO"/> &lt;enumeration value="RLR"/> &lt;enumeration
 * value="RLT"/> &lt;enumeration value="RLT1"/> &lt;enumeration value="RM"/>
 * &lt;enumeration value="RN"/> &lt;enumeration value="RNL"/> &lt;enumeration
 * value="RNV"/> &lt;enumeration value="RPC"/> &lt;enumeration value="SA"/>
 * &lt;enumeration value="SAR"/> &lt;enumeration value="SAR1"/> &lt;enumeration
 * value="SM"/> &lt;enumeration value="SMB"/> &lt;enumeration value="SMD"/>
 * &lt;enumeration value="SMRG"/> &lt;enumeration value="SN"/> &lt;enumeration
 * value="SP"/> &lt;enumeration value="SS"/> &lt;enumeration value="TA"/>
 * &lt;enumeration value="TB"/> &lt;enumeration value="TC"/> &lt;enumeration
 * value="TD"/> &lt;enumeration value="TE"/> &lt;enumeration value="TF"/>
 * &lt;enumeration value="TG"/> &lt;enumeration value="TH"/> &lt;enumeration
 * value="TI"/> &lt;enumeration value="TJ"/> &lt;enumeration value="TK"/>
 * &lt;enumeration value="TL"/> &lt;enumeration value="TM"/> &lt;enumeration
 * value="TN"/> &lt;enumeration value="TO"/> &lt;enumeration value="TP"/>
 * &lt;enumeration value="TQ"/> &lt;enumeration value="TR"/> &lt;enumeration
 * value="TS"/> &lt;enumeration value="TT"/> &lt;enumeration value="TU"/>
 * &lt;enumeration value="TV"/> &lt;enumeration value="TW"/> &lt;enumeration
 * value="TX"/> &lt;enumeration value="TY"/> &lt;enumeration value="TZ"/>
 * &lt;enumeration value="UA"/> &lt;enumeration value="UB"/> &lt;enumeration
 * value="UD"/> &lt;enumeration value="UE"/> &lt;enumeration value="UH"/>
 * &lt;enumeration value="UK"/> &lt;enumeration value="UM"/> &lt;enumeration
 * value="UN"/> &lt;enumeration value="UR"/> &lt;enumeration value="UT"/>
 * &lt;enumeration value="UV"/> &lt;enumeration value="UW"/> &lt;enumeration
 * value="UY"/> &lt;enumeration value="VA"/> &lt;enumeration value="WDX"/>
 * &lt;enumeration value="WDXT"/> &lt;enumeration value="X"/> &lt;enumeration
 * value="XC"/> &lt;enumeration value="XD"/> &lt;enumeration value="XE"/>
 * &lt;enumeration value="XM"/> &lt;enumeration value="XR"/> &lt;enumeration
 * value="XT"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUSC")
@XmlEnum
public enum ListUSC {

  /**
   * Aeronautical Radionavigation Land Station: A land station in the
   * aeronautical radionavigation service not intended for use while in motion.
   * <p>
   */
  AL("AL"),
  /**
   * Aeronautical Marker Beacon Station: A radionavigation land station in the
   * aeronautical radionavigation service which employs a marker beacon.
   * <p>
   */
  ALA("ALA"),
  /**
   * Aeronautical Radiobeacon Station: A radiobeacon station in the aeronautical
   * radionavigation service in-tended for the benefit of aircraft.
   * <p>
   */
  ALB("ALB"),
  /**
   * Aeronautical Radar Beacon (racon) Station: A land station in the
   * aeronautical radionavigation service which employs a radar beacon (racon).
   * <p>
   */
  ALC("ALC"),
  /**
   * Glide Path (Slope) Sta-tion: A radionavigation land station which provides
   * vertical guidance to aircraft during approach to landing.
   * <p>
   */
  ALG("ALG"),
  /**
   * Localizer Station: A radionavigation land station in the aeronautical
   * radionavigation service which employs an Instrument Landing System
   * Localizer.
   * <p>
   */
  ALL("ALL"),
  /**
   * Omnidirectional Range Station: A radionavigation land station in the
   * aeronautical radionavigation service providing direct indication of the
   * bearing (omni-bearing) of that station from an aircraft.
   * <p>
   */
  ALO("ALO"),
  /**
   * Radio Range Station: A radionavigation land station in the aeronautical
   * radionavigation service providing radial equisignal zones. (In certain
   * instances a radio range station may be placed on board a ship.)
   * <p>
   */
  ALR("ALR"),
  /**
   * Surveillance Radar Station: A radionavigation land station in the
   * aeronautical radionavigation service employing radar to display the
   * presence of aircraft within its range. (In certain instances, a
   * surveillance radar station may be placed on board a ship.)
   * <p>
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
   * <p>
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
   * <p>
   */
  ALTO("ALTO"),
  /**
   * Aeronautical Radionavigation Mobile Station: A mobile station in the
   * aeronautical radionavigation service intended to be used while in motion or
   * during halts at unspecified points.
   * <p>
   */
  AM("AM"),
  /**
   * Altimeter Station: A radionavigation mobile station in the aeronautical
   * radionavigation service which employs a radio altimeter.
   * <p>
   */
  AMA("AMA"),
  /**
   * ALASKA PRIVATE
   * <p>
   */
  APX("APX"),
  /**
   * ALASKA PRIVATE (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("APX2")
  APX_2("APX2"),
  /**
   * Amateur station
   * <p>
   */
  AT("AT"),
  /**
   * Fixed station in the Aeronautical Fixed Service
   * <p>
   */
  AX("AX"),
  /**
   * AERONAUTICAL FIXED (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("AX2")
  AX_2("AX2"),
  /**
   * Broadcasting Station (sound): A station (sound) in the broadcasting
   * service.
   * <p>
   */
  BC("BC"),
  /**
   * Broadcasting Station (television): A station (television) in the
   * broadcasting service.
   * <p>
   */
  BT("BT"),
  /**
   * DOMESTIC AERONAUTICAL MOBILE-SATELLITE SERVICE
   * <p>
   */
  DAMS("DAMS"),
  /**
   * SATELLITE DIGITAL AUDIO RADIO SERVICE
   * <p>
   */
  DARS("DARS"),
  /**
   * DIRECT BROADCAST SATELLITE SERVICE
   * <p>
   */
  DBS("DBS"),
  /**
   * DOMESTIC FIXED SATELLITE SERVICE
   * <p>
   */
  DFSS("DFSS"),
  /**
   * Differential-Global-Positioning-System (DGPS) Station: a terrestrial
   * station used for the transmission of differential correction information to
   * DGPS receivers aboard aircraft for navigation.
   * <p>
   */
  DGP("DGP"),
  /**
   * DIRECT TO HOME FIXED SATELLITE
   * <p>
   */
  DHFS("DHFS"),
  /**
   * DOMESTIC LAND MOBILE SATELLITE SERVICE
   * <p>
   */
  DLMS("DLMS"),
  /**
   * DOMESTIC MARITIME MOBILE SATELLITE SERVICE
   * <p>
   */
  DMMS("DMMS"),
  /**
   * DOMESTIC MOBILE SATELLITE SERVICE
   * <p>
   */
  DMSS("DMSS"),
  /**
   * DIRECT TO HOME SATELLITE
   * <p>
   */
  DTH("DTH"),
  /**
   * Space research (active sensor) space station
   * <p>
   */
  @XmlEnumValue("E1")
  E_1("E1"),
  /**
   * Space research (passive sensor) space station
   * <p>
   */
  @XmlEnumValue("E2")
  E_2("E2"),
  /**
   * Space station in the Earth exploration-satellite service(active sensor)
   * <p>
   */
  @XmlEnumValue("E3")
  E_3("E3"),
  /**
   * Space station in the Earth exploration-satellite (passive sensor)
   * <p>
   */
  @XmlEnumValue("E4")
  E_4("E4"),
  /**
   * Space station in the amateur-satellite service
   * <p>
   */
  EA("EA"),
  /**
   * Broadcasting-Satellite Space Station (sound broadcasting): A space station
   * in the broadcasting-satellite service (sound broadcasting).
   * <p>
   */
  EB("EB"),
  /**
   * Fixed-Satellite Space Station: A space station in the fixed-satellite
   * service.
   * <p>
   */
  EC("EC"),
  /**
   * Space Telecommand Space Station: A space station which receives emissions
   * used for space telecommand.
   * <p>
   */
  ED("ED"),
  /**
   * Standard Frequency Satellite Space Station: A space station in the standard
   * frequency satellite service.
   * <p>
   */
  EE("EE"),
  /**
   * EARTH EXPLORATION SATELLITE SERVICE
   * <p>
   */
  EESS("EESS"),
  /**
   * Radiodetermination-Satellite Space Station: A space station in the
   * radiodetermination-satellite service.
   * <p>
   */
  EF("EF"),
  /**
   * Maritime Mobile-Satellite Space Station: A space station in the maritime
   * mobile-satellite service.
   * <p>
   */
  EG("EG"),
  /**
   * Space Research Space Station: A space station in the space research
   * service.
   * <p>
   */
  EH("EH"),
  /**
   * Mobile-Satellite Space Station: A space station in the mobile-satellite
   * service.
   * <p>
   */
  EI("EI"),
  /**
   * Aeronautical Mobile-Satellite Space Station: A space station in the
   * aeronautical mobile-satellite service.
   * <p>
   */
  EJ("EJ"),
  /**
   * Space Tracking Space Station: A space station which transmits or receives
   * and retransmits emissions used for space tracking.
   * <p>
   */
  EK("EK"),
  /**
   * ELT TEST
   * <p>
   */
  ELT("ELT"),
  /**
   * ELT TEST (MOBILE)
   * <p>
   */
  @XmlEnumValue("ELT1")
  ELT_1("ELT1"),
  /**
   * Meteorological-Satellite Space Station: A space station in the
   * meteorological-satellite service.
   * <p>
   */
  EM("EM"),
  /**
   * Meteorological-Satellite Telemetry Space Station
   * <p>
   */
  EMER("EMER"),
  /**
   * Meteorological-Satellite Tracking Space Station
   * <p>
   */
  EMSS("EMSS"),
  /**
   * Radionavigation-Satellite Space Station: A space station in the
   * radionavigation-satellite service.
   * <p>
   */
  EN("EN"),
  /**
   * Aeronautical Radionavigation-Satellite Space Station: A space station in
   * the aeronautical radionavigation-satellite service.
   * <p>
   */
  EO("EO"),
  /**
   * Maritime Radionavigation-Satellite Space Station: A space station in the
   * maritime radionavigation-satellite service.
   * <p>
   */
  EQ("EQ"),
  /**
   * Space Telemetering Space Station: A space station the emissions of which
   * are used for space telemetering.
   * <p>
   */
  ER("ER"),
  /**
   * Inter-Satellite Space Station: A space station in the inter-satellite
   * service.
   * <p>
   */
  ES("ES"),
  /**
   * EARTH STATION ON BOARD VESSEL
   * <p>
   */
  ESV("ESV"),
  /**
   * Space Operation Space Station: A space station in the space operation
   * service.
   * <p>
   */
  ET("ET"),
  /**
   * Land Mobile-Satellite Space Station: A space station in the land
   * mobile-satellite service.
   * <p>
   */
  EU("EU"),
  /**
   * Broadcasting-Satellite Space Station (television): A space station in the
   * broadcasting-satellite service (television).
   * <p>
   */
  EV("EV"),
  /**
   * Earth Exploration-Satellite Space Station: A space station in the Earth
   * exploration-satellite service.
   * <p>
   */
  EW("EW"),
  /**
   * Experimental Station: A station utilising radio waves in experiments with a
   * view to development of science or technique. (EX is not used on
   * applications.)
   * <p>
   */
  EX("EX"),
  /**
   * Space station in the time signal-satellite service
   * <p>
   */
  EY("EY"),
  /**
   * Aeronautical Station: A land station in the aeronautical mobile service. In
   * certain instances, an aeronautical station may be located, for example on
   * board ship or on a platform at sea.
   * <p>
   */
  FA("FA"),
  /**
   * AERONAUTICAL ENROUTE (MOBILE)
   * <p>
   */
  @XmlEnumValue("FA1")
  FA_1("FA1"),
  /**
   * AERONAUTICAL ENROUTE (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("FA2")
  FA_2("FA2"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM)
   * <p>
   */
  FAA("FAA"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM) (MOBILE)
   * <p>
   */
  @XmlEnumValue("FAA1")
  FAA_1("FAA1"),
  /**
   * AERONAUTICAL ADVISORY (UNICOM) (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("FAA2")
  FAA_2("FAA2"),
  /**
   * Aeronautical Broadcast Station: An aeronautical station which makes
   * scheduled broadcasts of meteorological information and notices to airmen.
   * (In certain instances, an aeronautical broadcast station may be placed on
   * board a ship.)
   * <p>
   */
  FAB("FAB"),
  /**
   * Airdrome Control Station: An aeronautical station providing communication
   * between an airdrome control tower and aircraft.
   * <p>
   */
  FAC("FAC"),
  /**
   * Telecommand Aeronautical Station: A land station in the aeronautical mobile
   * service the emissions of which are used for terrestrial telecommand.
   * <p>
   */
  FAD("FAD"),
  /**
   * AVIATION SUPPORT INSTRUCTIONAL
   * <p>
   */
  FAS("FAS"),
  /**
   * AVIATION SUPPORT INSTRUCTIONAL (MOBILE)
   * <p>
   */
  @XmlEnumValue("FAS1")
  FAS_1("FAS1"),
  /**
   * Flight Test Station: An aeronautical station used for the transmission of
   * essential communications in connection with the testing of aircraft or
   * major components of aircraft.
   * <p>
   */
  FAT("FAT"),
  /**
   * FLIGHT TEST (MOBILE)
   * <p>
   */
  @XmlEnumValue("FAT1")
  FAT_1("FAT1"),
  /**
   * FLIGHT TEST (ITINERANT)
   * <p>
   */
  @XmlEnumValue("FAT3")
  FAT_3("FAT3"),
  /**
   * Base Station: A land station in the land mobile service.
   * <p>
   */
  FB("FB"),
  /**
   * MOBILE RELAY
   * <p>
   */
  @XmlEnumValue("FB2")
  FB_2("FB2"),
  /**
   * MOBILE RELAY - AIRPORT TERMINAL USE
   * <p>
   */
  @XmlEnumValue("FB2A")
  FB_2_A("FB2A"),
  /**
   * MOBILE RELAY - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB2C")
  FB_2_C("FB2C"),
  /**
   * MOBILE RELAY - ITINERANT
   * <p>
   */
  @XmlEnumValue("FB2I")
  FB_2_I("FB2I"),
  /**
   * MOBILE RELAY - TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB2J")
  FB_2_J("FB2J"),
  /**
   * MOBILE RELAY - STAND-BY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB2K")
  FB_2_K("FB2K"),
  /**
   * MOBILE RELAY - ITINERANT INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB2L")
  FB_2_L("FB2L"),
  /**
   * MOBILE RELAY - STAND-BY
   * <p>
   */
  @XmlEnumValue("FB2S")
  FB_2_S("FB2S"),
  /**
   * MOBILE RELAY - TEMPORARY
   * <p>
   */
  @XmlEnumValue("FB2T")
  FB_2_T("FB2T"),
  /**
   * COMMUNITY REPEATER
   * <p>
   */
  @XmlEnumValue("FB4")
  FB_4("FB4"),
  /**
   * COMMUNITY REPEATER - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB4C")
  FB_4_C("FB4C"),
  /**
   * COMMUNITY REPEATER - ITINERANT
   * <p>
   */
  @XmlEnumValue("FB4I")
  FB_4_I("FB4I"),
  /**
   * COMMUNITY REPEATER - TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB4J")
  FB_4_J("FB4J"),
  /**
   * COMMUNITY REPEATER - STAND-BY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB4K")
  FB_4_K("FB4K"),
  /**
   * COMMUNITY REPEATER - STAND-BY
   * <p>
   */
  @XmlEnumValue("FB4S")
  FB_4_S("FB4S"),
  /**
   * COMMUNITY REPEATER - TEMPORARY
   * <p>
   */
  @XmlEnumValue("FB4T")
  FB_4_T("FB4T"),
  /**
   * PRIVATE CARRIER (PROFIT)
   * <p>
   */
  @XmlEnumValue("FB6")
  FB_6("FB6"),
  /**
   * PRIVATE CARRIER (PROFIT) - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB6C")
  FB_6_C("FB6C"),
  /**
   * PRIVATE CARRIER (PROFIT) - ITINERANT
   * <p>
   */
  @XmlEnumValue("FB6I")
  FB_6_I("FB6I"),
  /**
   * PRIVATE CARRIER (PROFIT) - TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB6J")
  FB_6_J("FB6J"),
  /**
   * PRIVATE CARRIER (PROFIT) - STAND -BY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB6K")
  FB_6_K("FB6K"),
  /**
   * PRIVATE CARRIER (PROFIT) - ITINERANT INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB6L")
  FB_6_L("FB6L"),
  /**
   * PRIVATE CARRIER (PROFIT) - STAND-BY
   * <p>
   */
  @XmlEnumValue("FB6S")
  FB_6_S("FB6S"),
  /**
   * PRIVATE CARRIER (PROFIT) - TEMPORARY
   * <p>
   */
  @XmlEnumValue("FB6T")
  FB_6_T("FB6T"),
  /**
   * PRIVATE CARRIER (NON-PROFIT)
   * <p>
   */
  @XmlEnumValue("FB7")
  FB_7("FB7"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB7C")
  FB_7_C("FB7C"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - ITINERANT
   * <p>
   */
  @XmlEnumValue("FB7J")
  FB_7_J("FB7J"),
  /**
   * PRIVATE CARRIER (NON-PROFIT) - TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB7T")
  FB_7_T("FB7T"),
  /**
   * CENTRALIZED TRUNK RELAY
   * <p>
   */
  @XmlEnumValue("FB8")
  FB_8("FB8"),
  /**
   * CENTRALIZED TRUNK RELAY - AIRPORT TERMINAL USE
   * <p>
   */
  @XmlEnumValue("FB8A")
  FB_8_A("FB8A"),
  /**
   * CENTRALIZED TRUNK RELAY - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB8C")
  FB_8_C("FB8C"),
  /**
   * CENTRALIZED TRUNK RELAY - ITINERANT
   * <p>
   */
  @XmlEnumValue("FB8I")
  FB_8_I("FB8I"),
  /**
   * CENTRALIZED TRUNK RELAY - TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB8J")
  FB_8_J("FB8J"),
  /**
   * CENTRALIZED TRUNK RELAY - ITINERANT INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FB8L")
  FB_8_L("FB8L"),
  /**
   * CENTRALIZED TRUNK RELAY - STANDBY
   * <p>
   */
  @XmlEnumValue("FB8S")
  FB_8_S("FB8S"),
  /**
   * CENTRALIZED TRUNK RELAY- TEMPORARY
   * <p>
   */
  @XmlEnumValue("FB8T")
  FB_8_T("FB8T"),
  /**
   * SMALL BASE
   * <p>
   */
  FBA("FBA"),
  /**
   * SMALL BASE - TEMPORARY
   * <p>
   */
  FBAT("FBAT"),
  /**
   * BASE
   * <p>
   */
  FBBS("FBBS"),
  /**
   * BASE - INTERCONNECT
   * <p>
   */
  FBC("FBC"),
  /**
   * BASE - INTERCONNECT
   * <p>
   */
  FBCT("FBCT"),
  /**
   * Telecommand Base Station: A land station in the land mobile service the
   * emissions of which are used for terrestrial telecommand.
   * <p>
   */
  FBD("FBD"),
  /**
   * GROUND
   * <p>
   */
  FBGS("FBGS"),
  /**
   * BASE - ITINERANT
   * <p>
   */
  FBI("FBI"),
  /**
   * BASE- TEMPORARY INTERCONNECT
   * <p>
   */
  FBJ("FBJ"),
  /**
   * BASE - STAND-BY INTERCONNECT
   * <p>
   */
  FBK("FBK"),
  /**
   * BASE - ITINERANT INTERCONNECT
   * <p>
   */
  FBL("FBL"),
  /**
   * BASE - STAND-BY
   * <p>
   */
  FBS("FBS"),
  /**
   * AIR-GROUND SIGNALING
   * <p>
   */
  FBSI("FBSI"),
  /**
   * STAND-BY
   * <p>
   */
  FBST("FBST"),
  /**
   * BASE - TEMPORARY
   * <p>
   */
  FBT("FBT"),
  /**
   * Coast Station: A land station in the maritime mobile service.
   * <p>
   */
  FC("FC"),
  /**
   * MARINE SUPPORT - TESTING & TRAINING
   * <p>
   */
  FCA("FCA"),
  /**
   * MARINE SUPPORT - TESTING & TRAINING (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("FCA2")
  FCA_2("FCA2"),
  /**
   * Marine Broadcast Station: A coast station which makes scheduled broadcast
   * of time, meteorological, and hydrographical information.
   * <p>
   */
  FCB("FCB"),
  /**
   * Telecommand Coast Station: A land station in the maritime mobile service
   * the emissions of which are used for terrestrial telecommand.
   * <p>
   */
  FCD("FCD"),
  /**
   * PRIVATE COAST
   * <p>
   */
  FCL("FCL"),
  /**
   * PRIVATE COAST (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("FCL2")
  FCL_2("FCL2"),
  /**
   * MARINE UTILITY
   * <p>
   */
  FCU("FCU"),
  /**
   * MARINE UTILITY (MOBILE)
   * <p>
   */
  @XmlEnumValue("FCU1")
  FCU_1("FCU1"),
  /**
   * Aeronautical Station (R): An aeronautical station in the aeronautical
   * mobile (R) service.
   * <p>
   */
  FD("FD"),
  /**
   * FEEDER LIINK FOR DBS IN FIXED SATELLITE SERVICE
   * <p>
   */
  FDBS("FDBS"),
  /**
   * Aeronautical Station (OR): An aeronautical station in the aeronautical
   * mobile (OR) service.
   * <p>
   */
  FG("FG"),
  /**
   * FLIGHT INFORMATION SERVICES
   * <p>
   */
  FIS("FIS"),
  /**
   * Land Station: A station in the mobile service not intended to be used while
   * in motion.
   * <p>
   */
  FL("FL"),
  /**
   * Telecommand Land Station: A land station in the mobile service the
   * emissions of which are used for terrestrial telecommand.
   * <p>
   */
  FLD("FLD"),
  /**
   * Telemetering Land Station: A land station the emissions of which are used
   * for telemetering.
   * <p>
   */
  FLE("FLE"),
  /**
   * Aeronautical Telemetering Land Station: A telemetering land station used in
   * the flight testing of manned or unmanned aircraft, missiles, or major
   * components thereof.
   * <p>
   */
  FLEA("FLEA"),
  /**
   * Flight Telemetering Land Station: A telemetering land station the emissions
   * of which are used for telemetering to a balloon; to a booster or rocket,
   * excluding a booster or rocket in orbit about the Earth or in deep space; or
   * to an aircraft, excluding a station used in the flight testing of an
   * aircraft.
   * <p>
   */
  FLEB("FLEB"),
  /**
   * Surface Telemetering Land Station: A telemetering land station the
   * emissions of which are intended to be received on the surface of the Earth.
   * <p>
   */
  FLEC("FLEC"),
  /**
   * FEEDER LINK IN FIXED SATELLITE SERVICE
   * <p>
   */
  FLFS("FLFS"),
  /**
   * Hydrologic and Meteorological Land Station: A land station the emissions of
   * which are used for the automatic transmission of either hydrologic or
   * meteorological data, or both.
   * <p>
   */
  FLH("FLH"),
  /**
   * Aeronautical Utility Land Station: A land station located at airdrome
   * control towers and used for control of ground vehicles and aircraft on the
   * ground at airdromes.
   * <p>
   */
  FLU("FLU"),
  /**
   * AVIATION SUPPORT SERVICE (MOBILE)
   * <p>
   */
  @XmlEnumValue("FLU1")
  FLU_1("FLU1"),
  /**
   * FEEDER LINK FOR WIDE AREA AUGMENTATION SYSTEM
   * <p>
   */
  FLW("FLW"),
  /**
   * AIRCRAFT FLIGHT TEST STATION
   * <p>
   */
  @XmlEnumValue("FMA1")
  FMA_1("FMA1"),
  /**
   * Port Station: A coast station in the port operations service.
   * <p>
   */
  FP("FP"),
  /**
   * Receiving station only, connected with the general network of
   * telecommunication channels
   * <p>
   */
  FR("FR"),
  /**
   * FIXED SATELLITE SERVICE
   * <p>
   */
  FSS("FSS"),
  /**
   * FIXED SATELLITE SERVICE
   * <p>
   */
  FSSF("FSSF"),
  /**
   * Fixed Station: A station in the fixed service.
   * <p>
   */
  FX("FX"),
  /**
   * CONTROL
   * <p>
   */
  @XmlEnumValue("FX1")
  FX_1("FX1"),
  /**
   * CONTROL - AIRPORT TERMINAL USE
   * <p>
   */
  @XmlEnumValue("FX1A")
  FX_1_A("FX1A"),
  /**
   * CONTROL - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX1C")
  FX_1_C("FX1C"),
  /**
   * CONTROL - ITINERANT
   * <p>
   */
  @XmlEnumValue("FX1I")
  FX_1_I("FX1I"),
  /**
   * CONTROL - TEMPOARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX1J")
  FX_1_J("FX1J"),
  /**
   * CONTROL - STAND-BY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX1K")
  FX_1_K("FX1K"),
  /**
   * CONTROL - ITINERT INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX1L")
  FX_1_L("FX1L"),
  /**
   * CONTROL- STAND-BY
   * <p>
   */
  @XmlEnumValue("FX1S")
  FX_1_S("FX1S"),
  /**
   * CONTROL - TEMPORARY
   * <p>
   */
  @XmlEnumValue("FX1T")
  FX_1_T("FX1T"),
  /**
   * FIXED RELAY
   * <p>
   */
  @XmlEnumValue("FX2")
  FX_2("FX2"),
  /**
   * FIXED RELAY - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX2C")
  FX_2_C("FX2C"),
  /**
   * FIXED RELAY - ITINERANT
   * <p>
   */
  @XmlEnumValue("FX2I")
  FX_2_I("FX2I"),
  /**
   * FIXED RELAY - TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX2J")
  FX_2_J("FX2J"),
  /**
   * FIXED RELAY - STAND-BY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX2K")
  FX_2_K("FX2K"),
  /**
   * FIXED REALY - ITINERANT INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX2L")
  FX_2_L("FX2L"),
  /**
   * FIXED RELAY - STAND-BY
   * <p>
   */
  @XmlEnumValue("FX2S")
  FX_2_S("FX2S"),
  /**
   * FIXED RELAY - TEMPORARY
   * <p>
   */
  @XmlEnumValue("FX2T")
  FX_2_T("FX2T"),
  /**
   * SECONDARY FIXED (TONE SIGNALLING)
   * <p>
   */
  @XmlEnumValue("FX3")
  FX_3("FX3"),
  /**
   * SECONDARY FIXED - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX3C")
  FX_3_C("FX3C"),
  /**
   * SECONDARY FIXED - TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("FX3J")
  FX_3_J("FX3J"),
  /**
   * SECONDARY FIXED - STAND-BY
   * <p>
   */
  @XmlEnumValue("FX3S")
  FX_3_S("FX3S"),
  /**
   * SECONDARY FIXED - TEMPORARY
   * <p>
   */
  @XmlEnumValue("FX3T")
  FX_3_T("FX3T"),
  /**
   * TEMPORARY FIXED
   * <p>
   */
  @XmlEnumValue("FX5")
  FX_5("FX5"),
  /**
   * FIXED - INTERCONNECT
   * <p>
   */
  FXC("FXC"),
  /**
   * CENTRAL OFFICE
   * <p>
   */
  FXCO("FXCO"),
  /**
   * CONTROL
   * <p>
   */
  FXCT("FXCT"),
  /**
   * Telecommand Fixed Station: A fixed station in the fixed service the
   * emissions of which are used for terrestrial telecommand.
   * <p>
   */
  FXD("FXD"),
  /**
   * DISPATCH
   * <p>
   */
  FXDI("FXDI"),
  /**
   * Telemetering Fixed Station: A fixed station the emissions of which are used
   * for telemetering.
   * <p>
   */
  FXE("FXE"),
  /**
   * Hydrologic and Meteorological Fixed Station: A fixed station the emissions
   * of which are used for the automatic transmission of either hydrologic or
   * meteorological data, or both.
   * <p>
   */
  FXH("FXH"),
  /**
   * FIXED - ITINERANT
   * <p>
   */
  FXI("FXI"),
  /**
   * INTER-OFFICE
   * <p>
   */
  FXIO("FXIO"),
  /**
   * FIXED - STAND-BY INTERCONNECT
   * <p>
   */
  FXK("FXK"),
  /**
   * OPERATIONAL FIXED
   * <p>
   */
  FXO("FXO"),
  /**
   * OPERATIONAL FIXED - INTERCONNECT
   * <p>
   */
  FXOC("FXOC"),
  /**
   * OPERATIONA FIXED - ITINERANT
   * <p>
   */
  FXOI("FXOI"),
  /**
   * OPERATIONAL FIXED - TEMPORARY INTERCONNECT
   * <p>
   */
  FXOJ("FXOJ"),
  /**
   * OPERATIONAL FIXED - STAND-BY
   * <p>
   */
  FXOS("FXOS"),
  /**
   * OPERATIONAL FIXED - TEMPORARY
   * <p>
   */
  FXOT("FXOT"),
  /**
   * REPEATER
   * <p>
   */
  FXRP("FXRP"),
  /**
   * FIXED RELAY
   * <p>
   */
  FXRX("FXRX"),
  /**
   * FIXED - STAND-BY
   * <p>
   */
  FXS("FXS"),
  /**
   * FIXED SUBSCRIBER
   * <p>
   */
  FXSB("FXSB"),
  /**
   * FIXED - TEMPORARY
   * <p>
   */
  FXT("FXT"),
  /**
   * AUXILIARY TEST
   * <p>
   */
  FXTS("FXTS"),
  /**
   * GROUND COMMUNICATIONS OUTLET
   * <p>
   */
  GCO("GCO"),
  /**
   * Station on board a warship or a military or naval aircraft
   * <p>
   */
  GS("GS"),
  /**
   * INTERNATIONAL AERONAUTICAL MOBILE SATELLITE SERVICE
   * <p>
   */
  IAMS("IAMS"),
  /**
   * FEEDER LINK FOR MOBILE SATELLITE SERVICE
   * <p>
   */
  IFLM("IFLM"),
  /**
   * INTERNATIONAL FIXED SATELLITE SERVICE
   * <p>
   */
  IFSS("IFSS"),
  /**
   * INTERNATIONAL MARITIME MOBILE SATELLITE SERVICE
   * <p>
   */
  IMMS("IMMS"),
  /**
   * INTERNATIONAL MOBILE SATELLITE SERVICE
   * <p>
   */
  IMSS("IMSS"),
  /**
   * Radiolocation Land Station: A station in the radiolocation service not
   * intended to be used while in motion.
   * <p>
   */
  LR("LR"),
  /**
   * RADIOLOCATION LAND - TEMPORARY
   * <p>
   */
  LRT("LRT"),
  /**
   * Aircraft Station: A mobile station in the aeronautical mobile service other
   * than a survival craft station, located on board an aircraft.
   * <p>
   */
  MA("MA"),
  /**
   * Telecommand Aircraft Station: A mobile station in the aeronautical mobile
   * service the emissions of which are used for terrestrial telecommand.
   * <p>
   */
  MAD("MAD"),
  /**
   * Portable Aircraft Station: A portable station operating in the aeronautical
   * mobile service.
   * <p>
   */
  MAP("MAP"),
  /**
   * Space Station: A station located on an object which is beyond, is intended
   * to go beyond, or has been beyond, the major portion of the Earth's
   * atmosphere. (ME is not used on applications.)
   * <p>
   */
  ME("ME"),
  /**
   * AERONAUTICAL MULTICOM
   * <p>
   */
  MFL("MFL"),
  /**
   * AERONAUTICAL MULTICOM (MOBILE)
   * <p>
   */
  @XmlEnumValue("MFL1")
  MFL_1("MFL1"),
  /**
   * AERONAUTICAL MULTICOM (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("MFL2")
  MFL_2("MFL2"),
  /**
   * MARINE OPS FIXED
   * <p>
   */
  MFX("MFX"),
  /**
   * Land Mobile Station: A mobile station in the land mobile service capable of
   * surface movement within the geographical limits of a country or continent.
   * <p>
   */
  ML("ML"),
  /**
   * Telecommand Land Mobile Station: A mobile station in the land mobile
   * service the emissions of which are used for terrestrial telecommand.
   * <p>
   */
  MLD("MLD"),
  /**
   * Portable Land Mobile Station: A portable station operating in the land
   * mobile service.
   * <p>
   */
  MLP("MLP"),
  /**
   * MARITIME MOBILE SATELLITE SERVICE
   * <p>
   */
  MMS("MMS"),
  /**
   * Mobile Station: A station in the mobile service intended to be used while
   * in motion or during halts at unspecified points.
   * <p>
   */
  MO("MO"),
  /**
   * MOBILE/VEHICULAR REPEATER
   * <p>
   */
  @XmlEnumValue("MO3")
  MO_3("MO3"),
  /**
   * MOBILE/VEHICULAR REPEATER WITH INTERCONNECT
   * <p>
   */
  @XmlEnumValue("MO3C")
  MO_3_C("MO3C"),
  /**
   * MOBILE/VEHICULAR REPEATER - ITINERANT
   * <p>
   */
  @XmlEnumValue("MO3I")
  MO_3_I("MO3I"),
  /**
   * MOBILE & TEMPORARY FIXED
   * <p>
   */
  @XmlEnumValue("MO5")
  MO_5("MO5"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT)
   * <p>
   */
  @XmlEnumValue("MO6")
  MO_6("MO6"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("MO6C")
  MO_6_C("MO6C"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - ITINERANT
   * <p>
   */
  @XmlEnumValue("MO6I")
  MO_6_I("MO6I"),
  /**
   * PRIVATE CARRIER MOBILE OPERATION (PROFIT) WITH TEMPORARY INTERCONNECT
   * <p>
   */
  @XmlEnumValue("MO6L")
  MO_6_L("MO6L"),
  /**
   * PRIVATE CARRIER MOBILE OP (PROFIT) - STAND-BY
   * <p>
   */
  @XmlEnumValue("MO6S")
  MO_6_S("MO6S"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT)
   * <p>
   */
  @XmlEnumValue("MO7")
  MO_7("MO7"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("MO7C")
  MO_7_C("MO7C"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - ITINERANT
   * <p>
   */
  @XmlEnumValue("MO7I")
  MO_7_I("MO7I"),
  /**
   * PRIVATE CARRIER MOBILE OP (NON-PROFIT) - WITH ITINERANT INTERCONNECT
   * <p>
   */
  @XmlEnumValue("MO7L")
  MO_7_L("MO7L"),
  /**
   * CENTRALIZED TRUNK MOBILE
   * <p>
   */
  @XmlEnumValue("MO8")
  MO_8("MO8"),
  /**
   * CENTRALIZED TRUNK MOBILE - AIRPORT TERMINAL USE
   * <p>
   */
  @XmlEnumValue("MO8A")
  MO_8_A("MO8A"),
  /**
   * CENTRALIZED TRUNK MOBILE - INTERCONNECT
   * <p>
   */
  @XmlEnumValue("MO8C")
  MO_8_C("MO8C"),
  /**
   * MOBILE - AIRPORT TERMINAL USE
   * <p>
   */
  MOA("MOA"),
  /**
   * Radio Beacon Mobile Station: A mobile station the emissions of which are
   * used to deter-mine its location.
   * <p>
   */
  MOB("MOB"),
  /**
   * MOBILE - INTERCONNECT
   * <p>
   */
  MOC("MOC"),
  /**
   * Telecommand Mobile Station: A mobile station in the mobile service the
   * emissions of which are used for terrestrial telecommand.
   * <p>
   */
  MOD("MOD"),
  /**
   * Telemetering Mobile Station: A mobile station the emissions of which are
   * used for telemetering.
   * <p>
   */
  MOE("MOE"),
  /**
   * Aeronautical Telemetering Mobile Station: A telemetering mobile station
   * used for transmitting data directly related to the airborne testing of the
   * vehicle, (or major components), on which the station is installed.
   * <p>
   */
  MOEA("MOEA"),
  /**
   * Flight Telemetering Mobile Station: A telemetering mobile station used for
   * transmitting data from an airborne vehicle, excluding data related to
   * airborne testing of the vehicle itself, (or major components thereof).
   * <p>
   */
  MOEB("MOEB"),
  /**
   * Surface Telemetering Mobile Station: A telemetering mobile station located
   * on the surface of the Earth and the emissions of which are intended to be
   * received on the surface of the Earth.
   * <p>
   */
  MOEC("MOEC"),
  /**
   * Hydrologic and Meteorological Mobile Station: A mobile station the
   * emissions of which are used for the automatic transmission of either
   * hydrologic or meteorological data, or both.
   * <p>
   */
  MOH("MOH"),
  /**
   * MOBILE - ITINERANT
   * <p>
   */
  MOI("MOI"),
  /**
   * MOBILE WITH ITINERANT INTERCONNECT
   * <p>
   */
  MOL("MOL"),
  /**
   * Portable Mobile Station: A portable station operating in the mobile
   * service.
   * <p>
   */
  MOP("MOP"),
  /**
   * MOBILE - STAND-BY
   * <p>
   */
  MOS("MOS"),
  /**
   * TEMPORATY MOBILE
   * <p>
   */
  MOT("MOT"),
  /**
   * Aeronautical Utility Mobile Station: A mobile station used for
   * communication at airdromes with the aeronautical utility land station, the
   * airdrome control station, the US FAA flight service station, ground
   * vehicles, and aircraft on the ground. (All transmissions shall be subject
   * to the control of the airdrome control station and shall be discontinued
   * immediately when so requested by the airdrome control operators.)
   * <p>
   */
  MOU("MOU"),
  /**
   * AERONAUTICAL UTILITY MOBILE
   * <p>
   */
  @XmlEnumValue("MOU1")
  MOU_1("MOU1"),
  /**
   * Radiolocation Mobile Station: A station in the radiolocation service
   * intended to be used while in motion or during halts at unspecified points.
   * <p>
   */
  MR("MR"),
  /**
   * Portable Radiolocation Station: A portable station operating in the
   * radiolocation service.
   * <p>
   */
  MRP("MRP"),
  /**
   * MARINE RECEIVER TEST
   * <p>
   */
  MRT("MRT"),
  /**
   * MARINE RECEIVER TEST (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("MRT2")
  MRT_2("MRT2"),
  /**
   * Ship Station: A mobile station in the maritime mobile service located on
   * board a vessel which is not permanently moored, other than a survival craft
   * station.
   * <p>
   */
  MS("MS"),
  /**
   * SHORE RADAR TEST
   * <p>
   */
  MSC("MSC"),
  /**
   * Telecommand Ship Station: A mobile station in the maritime mobile service
   * the emissions of which are used for terrestrial telecommand.
   * <p>
   */
  MSD("MSD"),
  /**
   * Portable Ship Station: A portable station operating in the maritime mobile
   * service.
   * <p>
   */
  MSP("MSP"),
  /**
   * SHORE RADIONAVIGATION
   * <p>
   */
  MSR("MSR"),
  /**
   * MOBILE SATELLITE SERVICE
   * <p>
   */
  MSS("MSS"),
  /**
   * Maritime Radionavigation Land Station: A land station in the Maritime
   * Radionavigation Service not intended for use while in motion
   * <p>
   */
  NL("NL"),
  /**
   * Maritime Radar Beacon (racon) Station: A land station in the maritime
   * radionavigation service which employs a radar beacon (racon).
   * <p>
   */
  NLC("NLC"),
  /**
   * Marine Radiobeacon Station: A radiobeacon station in the maritime
   * radionavigation service intended for the benefit of ships.
   * <p>
   */
  NLM("NLM"),
  /**
   * Radionavigation Mobile Station: A station in the radionavigation service
   * intended to be used while in motion or during halts at unspecified points.
   * <p>
   */
  NR("NR"),
  /**
   * Oceanographic Data Station: A station in the maritime mobile service
   * located on a ship, buoy or other sensor platform the emissions of which are
   * used for the transmission of oceanographic data.
   * <p>
   */
  OD("OD"),
  /**
   * Oceanographic Data Interrogating Station: A station in the maritime mobile
   * service the emissions of which are used to initiate, modify, or terminate
   * functions of equipment directly associated with an oceanographic data
   * station, including the station itself.
   * <p>
   */
  OE("OE"),
  /**
   * OTHER
   * <p>
   */
  OTH("OTH"),
  /**
   * Passenger Ship
   * <p>
   */
  PA("PA"),
  /**
   * Combination of 2 or more classes of station
   * <p>
   */
  PL("PL"),
  /**
   * FIXED SATELLITE SERVICE ORB-88 ALLOTMENT PLAN
   * <p>
   */
  PLAN("PLAN"),
  /**
   * Radio Astronomy Station: A station in the radio astronomy service. (This is
   * always a receiving station.)
   * <p>
   */
  RA("RA"),
  /**
   * REMOTE COMMUNICATIONS OUTLET
   * <p>
   */
  RCO("RCO"),
  /**
   * RADIO DETERMINATION SATELLITE SERVICE
   * <p>
   */
  RDS("RDS"),
  /**
   * Radiodetermination station using radio direction finding
   * <p>
   */
  RG("RG"),
  /**
   * AERONAUTICAL MARKER BEACON
   * <p>
   */
  RLA("RLA"),
  /**
   * AERONAUTICAL RADIO BEACON
   * <p>
   */
  RLB("RLB"),
  /**
   * AERONAUTICAL RADIO BEACON (MOBILE)
   * <p>
   */
  @XmlEnumValue("RLB1")
  RLB_1("RLB1"),
  /**
   * AERONAUTICAL RADIO BEACON (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("RLB2")
  RLB_2("RLB2"),
  /**
   * SHORE RADIOLOCATION TEST
   * <p>
   */
  RLC("RLC"),
  /**
   * SHORE RADIOLOCATION TEST (TEMPORARY)
   * <p>
   */
  @XmlEnumValue("RLC2")
  RLC_2("RLC2"),
  /**
   * RADAR/RADAR TEST
   * <p>
   */
  RLD("RLD"),
  /**
   * GLIDE PATH (SLOPE)
   * <p>
   */
  RLG("RLG"),
  /**
   * LOCALIZER
   * <p>
   */
  RLL("RLL"),
  /**
   * OMNIDIRECTIONAL RADIO RANGE
   * <p>
   */
  RLO("RLO"),
  /**
   * SHORE RADIOLOCATION/RACON
   * <p>
   */
  RLR("RLR"),
  /**
   * RADIONAVIGATION LAND TEST
   * <p>
   */
  RLT("RLT"),
  /**
   * RADIONAVIGATION LAND TEST (MOBILE)
   * <p>
   */
  @XmlEnumValue("RLT1")
  RLT_1("RLT1"),
  /**
   * Maritime radionavigation mobile station
   * <p>
   */
  RM("RM"),
  /**
   * Radionavigation Land Station: A station in the radionavigation service not
   * intended to be used in motion.
   * <p>
   */
  RN("RN"),
  /**
   * Loran Station: A long distance radionavigation land station transmitting
   * synchronised pulses. Hyperbolic lines of position are determined by the
   * measurement of the difference in the time of arrival of these pulses.
   * <p>
   */
  RNL("RNL"),
  /**
   * RADIONAVIGATION LAND
   * <p>
   */
  RNV("RNV"),
  /**
   * RAMP CONTROL
   * <p>
   */
  RPC("RPC"),
  /**
   * Meteorological Aids Mobile Station: A mobile station in the meteorological
   * aids service intended to be used while in motion or during halts at
   * unspecified points.
   * <p>
   */
  SA("SA"),
  /**
   * Radiosonde Station: A station in the meteorological aids service employing
   * a radiosonde.
   * <p>
   */
  SAR("SAR"),
  /**
   * SEARCH AND RESCUE (MOBILE)
   * <p>
   */
  @XmlEnumValue("SAR1")
  SAR_1("SAR1"),
  /**
   * Meteorological Aids Base Station: A land station in the meteorological aids
   * service not intended for use while in motion.
   * <p>
   */
  SM("SM"),
  /**
   * Radar Beacon Precipitation Gage Station: A transponder station in the
   * meteorological aids service, the emissions of which are used for
   * telemetering.
   * <p>
   */
  SMB("SMB"),
  /**
   * Meteorological Radar Station: A station in the meteorological aids service
   * employing radar.
   * <p>
   */
  SMD("SMD"),
  /**
   * Radiosonde Ground Station: A station in the meteorological aids service
   * employing a ground station associated with a radiosonde.
   * <p>
   */
  SMRG("SMRG"),
  /**
   * Sounder Network Station: A station equipped with an ionosphere sounder used
   * for the real-time selection of frequencies for operational communication
   * circuits.
   * <p>
   */
  SN("SN"),
  /**
   * Sounder Prediction Station: A station equipped with an ionosphere sounder
   * for real-time monitoring of upper atmosphere phenomena or to obtain data
   * for the prediction of propagation conditions.
   * <p>
   */
  SP("SP"),
  /**
   * Standard Frequency and Time Signal Station: A station in the standard
   * frequency and time signal service.
   * <p>
   */
  SS("SS"),
  /**
   * Space operation earth station in the amateur-satellite service
   * <p>
   */
  TA("TA"),
  /**
   * Aeronautical Earth Station: An earth station in the fixed-satellite service
   * or in some cases in the aeronautical mobile-satellite service located at a
   * specified fixed point on land to provide a feeder link for the aeronautical
   * mobile-satellite service.
   * <p>
   */
  TB("TB"),
  /**
   * Fixed-Satellite Earth Station: An earth station in the fixed-satellite
   * service.
   * <p>
   */
  TC("TC"),
  /**
   * Space Telecommand Earth Station: An earth station the emissions of which
   * are used for space telecommand.
   * <p>
   */
  TD("TD"),
  /**
   * Satellite EPIRB Station: A satellite Emergency Position-Indicating Radio
   * Beacon (EPIRB) in the mobile-satellite service
   * <p>
   */
  TE("TE"),
  /**
   * Radiodetermination-Satellite Earth Station: A fixed earth station in the
   * radiodetermination-satellite service.
   * <p>
   */
  TF("TF"),
  /**
   * Ship Earth Station: A mobile earth station in the maritime mobile-satellite
   * service located on board ship.
   * <p>
   */
  TG("TG"),
  /**
   * Space Research Earth Station: An earth station in the space research
   * service.
   * <p>
   */
  TH("TH"),
  /**
   * Coast Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the maritime mobile-satellite service located at a specified
   * fixed point on land to provide a feeder link for the maritime
   * mobile-satellite.
   * <p>
   */
  TI("TI"),
  /**
   * Aircraft Earth Station: A mobile earth station in the aeronautical
   * mobile-satellite service located on board an aircraft.
   * <p>
   */
  TJ("TJ"),
  /**
   * Space Tracking Earth Station: An earth station which transmits or receives
   * emissions used for space tracking.
   * <p>
   */
  TK("TK"),
  /**
   * Radiodetermination-Satellite Mobile Earth Station: A mobile earth station
   * in the radiodetermination-satellite service.
   * <p>
   */
  TL("TL"),
  /**
   * Meteorological-Satellite Earth Station: An earth station in the
   * meteorological-satellite service.
   * <p>
   */
  TM("TM"),
  /**
   * Radionavigation-Satellite Fixed Earth Station: A fixed earth station in the
   * radionavigation-satellite service.
   * <p>
   */
  TN("TN"),
  /**
   * Aeronautical Radionavigation-Satellite Mobile Earth Station: A mobile earth
   * station in the aeronautical radionavigation-satellite service.
   * <p>
   */
  TO("TO"),
  /**
   * Earth Station (receiving): An earth station used for receiving. (TP is not
   * used on applications.)
   * <p>
   */
  TP("TP"),
  /**
   * Maritime Radionavigation-Satellite Mobile Earth Station: A mobile earth
   * station in the maritime radionavigation-satellite service.
   * <p>
   */
  TQ("TQ"),
  /**
   * Space Telemetering Earth Station: An earth station which receives emissions
   * used for space telemetering.
   * <p>
   */
  TR("TR"),
  /**
   * Television Sound Channel
   * <p>
   */
  TS("TS"),
  /**
   * Space Operation Earth Station: An earth station in the space operation
   * service.
   * <p>
   */
  TT("TT"),
  /**
   * Land Mobile Earth Station: A mobile earth station in the land
   * mobile-satellite service capable of surface movement within the
   * geographical limits of a country or continent.
   * <p>
   */
  TU("TU"),
  /**
   * Television Vision Channel
   * <p>
   */
  TV("TV"),
  /**
   * Earth Exploration-Satellite Earth Station: An earth station in the Earth
   * exploration-satellite service.
   * <p>
   */
  TW("TW"),
  /**
   * Maritime Radionavigation-Satellite Earth Station: A fixed earth station in
   * the maritime radionavigation-satellite service.
   * <p>
   */
  TX("TX"),
  /**
   * Base Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the land mobile-satellite service located at a specified
   * point or within a specified area on land to provide a feeder link for the
   * land mobile-satellite service.
   * <p>
   */
  TY("TY"),
  /**
   * Aeronautical Radionavigation-Satellite Earth Station: A fixed earth station
   * in the aeronautical radionavigation-satellite service.
   * <p>
   */
  TZ("TZ"),
  /**
   * Mobile Earth Station: An earth station in the mobile-satellite service
   * intended to be used while in motion or during halts at unspecified points.
   * <p>
   */
  UA("UA"),
  /**
   * Earth station in the broadcasting-satellite service (sound broadcasting)
   * <p>
   */
  UB("UB"),
  /**
   * Space telecommand mobile earth station
   * <p>
   */
  UD("UD"),
  /**
   * Earth station in the standard frequency-satellite service
   * <p>
   */
  UE("UE"),
  /**
   * Mobile earth station in the space research service
   * <p>
   */
  UH("UH"),
  /**
   * Space tracking mobile earth station
   * <p>
   */
  UK("UK"),
  /**
   * Radionavigation-Satellite Mobile Earth Station: A mobile earth station in
   * the radionavigation-satellite service.
   * <p>
   */
  UM("UM"),
  /**
   * Mobile earth station in the meteorological-satellite service
   * <p>
   */
  UN("UN"),
  /**
   * * Space telemetering mobile earth station
   * <p>
   */
  UR("UR"),
  /**
   * Mobile earth station in the space operation service
   * <p>
   */
  UT("UT"),
  /**
   * Earth station in the broadcasting-satellite service (television)
   * <p>
   */
  UV("UV"),
  /**
   * Mobile earth station in the earth exploration-satellite service
   * <p>
   */
  UW("UW"),
  /**
   * Earth station in the time signal-satellite service
   * <p>
   */
  UY("UY"),
  /**
   * Land Earth Station: An earth station in the fixed-satellite service or in
   * some cases in the mobile-satellite service located at a specified point or
   * within a specified area on land to provide a feeder link for the
   * mobile-satellite service.
   * <p>
   */
  VA("VA"),
  /**
   * RADIOLOCATION WEATHER RADAR
   * <p>
   */
  WDX("WDX"),
  /**
   * RADIOLOCATION WEATHER RADAR - TEMPORARY
   * <p>
   */
  WDXT("WDXT"),
  /**
   * The station class is not known (legacy data only)
   * <p>
   */
  X("X"),
  /**
   * Experimental Contract Developmental Station: An experimental station used
   * for the evaluation or testing under Government contract of electronics
   * equipment or systems in a design or development stage.
   * <p>
   */
  XC("XC"),
  /**
   * Experimental Developmental Station: An experimental station used for
   * evaluation or testing of electronics equipment or systems in a design or
   * development stage.
   * <p>
   */
  XD("XD"),
  /**
   * Experimental Export Station: An experimental station intended for export
   * and used for the evaluation or testing of electronics equipment or systems
   * in the design or development stage.
   * <p>
   */
  XE("XE"),
  /**
   * Experimental Composite Station: An experimental station used in
   * experimental operations of a complex nature not readily specified or used
   * in an operation which is a composite of two or more of the established
   * experimental categories.
   * <p>
   */
  XM("XM"),
  /**
   * Experimental Research Station: An experimental station used in basic
   * studies concerning scientific investigation looking toward the improvement
   * of the art of radiocommunications.
   * <p>
   */
  XR("XR"),
  /**
   * Experimental Testing Station: An experimental station used for the
   * evaluation or testing of electronics equipment or systems, including site
   * selection and transmission path surveys, which have been developed for
   * operational use.
   * <p>
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
