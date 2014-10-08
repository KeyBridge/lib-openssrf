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
import us.gov.dod.standard.ssrf._3_1.DetailedFunction;
import us.gov.dod.standard.ssrf._3_1.assignment.Link;

/**
 * Enumerated values for fields using the ListUFN type.
 * <p>
 * Used in {@link DetailedFunction}, {@link Link}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUFN")
@XmlEnum
public enum ListUFN {

  UNKNOWN("UNKNOWN"),
  @XmlEnumValue("A2C2S (Army Airborne Command & Control System)")
  A_2_C_2_S__ARMY_AIRBORNE_COMMAND___CONTROL_SYSTEM__("A2C2S (Army Airborne Command & Control System)"),
  @XmlEnumValue("ACS (Aerial Common Sensor)")
  ACS__AERIAL_COMMON_SENSOR__("ACS (Aerial Common Sensor)"),
  ADMINISTRATIVE("ADMINISTRATIVE"),
  AEGIS("AEGIS"),
  @XmlEnumValue("A-EPLRS")
  A_EPLRS("A-EPLRS"),
  @XmlEnumValue("AERO CLUB")
  AERO_CLUB("AERO CLUB"),
  AFATDS("AFATDS"),
  @XmlEnumValue("AFAUX/CAP (Air Force Auxiliary/Civil Air Patrol)")
  AFAUX_CAP__AIR_FORCE_AUXILIARY_CIVIL_AIR_PATROL__("AFAUX/CAP (Air Force Auxiliary/Civil Air Patrol)"),
  AFSATCOM("AFSATCOM"),
  @XmlEnumValue("AHFEWS (Army HF EW System)")
  AHFEWS__ARMY_HF_EW_SYSTEM__("AHFEWS (Army HF EW System)"),
  @XmlEnumValue("AIR DEFENSE")
  AIR_DEFENSE("AIR DEFENSE"),
  @XmlEnumValue("AIR DEFENSE WARNING")
  AIR_DEFENSE_WARNING("AIR DEFENSE WARNING"),
  @XmlEnumValue("AIR DEFENSE/INTERCEPT")
  AIR_DEFENSE_INTERCEPT("AIR DEFENSE/INTERCEPT"),
  @XmlEnumValue("AIR FORCE ONE")
  AIR_FORCE_ONE("AIR FORCE ONE"),
  @XmlEnumValue("AIR FORCE SPECIAL OPERATIONS")
  AIR_FORCE_SPECIAL_OPERATIONS("AIR FORCE SPECIAL OPERATIONS"),
  @XmlEnumValue("AIR OPERATIONS")
  AIR_OPERATIONS("AIR OPERATIONS"),
  @XmlEnumValue("AIR ROUTE SURVEILLANCE RADAR")
  AIR_ROUTE_SURVEILLANCE_RADAR("AIR ROUTE SURVEILLANCE RADAR"),
  @XmlEnumValue("AIR TRAFFIC CONTROL")
  AIR_TRAFFIC_CONTROL("AIR TRAFFIC CONTROL"),
  @XmlEnumValue("AIR/AIR COMMUNICATIONS")
  AIR_AIR_COMMUNICATIONS("AIR/AIR COMMUNICATIONS"),
  @XmlEnumValue("AIR/GROUND/AIR COMMUNICATIONS")
  AIR_GROUND_AIR_COMMUNICATIONS("AIR/GROUND/AIR COMMUNICATIONS"),
  @XmlEnumValue("AIRBORNE COMMAND CENTER")
  AIRBORNE_COMMAND_CENTER("AIRBORNE COMMAND CENTER"),
  AIRCRAFT("AIRCRAFT"),
  @XmlEnumValue("AIRPORT SURVEILLANCE RADAR")
  AIRPORT_SURVEILLANCE_RADAR("AIRPORT SURVEILLANCE RADAR"),
  @XmlEnumValue("ALARM SYSTEMS")
  ALARM_SYSTEMS("ALARM SYSTEMS"),
  @XmlEnumValue("AMPS (Air Movement Planning System)")
  AMPS__AIR_MOVEMENT_PLANNING_SYSTEM__("AMPS (Air Movement Planning System)"),
  @XmlEnumValue("AMSS (Automatic Meteorological Sensor System)")
  AMSS__AUTOMATIC_METEOROLOGICAL_SENSOR_SYSTEM__("AMSS (Automatic Meteorological Sensor System)"),
  @XmlEnumValue("ANTI-TERRORISM")
  ANTI_TERRORISM("ANTI-TERRORISM"),
  @XmlEnumValue("APPROACH CONTROL")
  APPROACH_CONTROL("APPROACH CONTROL"),
  @XmlEnumValue("AQF (Advanced Quick Fix)")
  AQF__ADVANCED_QUICK_FIX__("AQF (Advanced Quick Fix)"),
  @XmlEnumValue("ARL (Aerial Reconnaissance-Low)")
  ARL__AERIAL_RECONNAISSANCE_LOW__("ARL (Aerial Reconnaissance-Low)"),
  @XmlEnumValue("ARMY AVIATION")
  ARMY_AVIATION("ARMY AVIATION"),
  @XmlEnumValue("ARMY SPECIAL OPERATIONS")
  ARMY_SPECIAL_OPERATIONS("ARMY SPECIAL OPERATIONS"),
  ARTILLERY("ARTILLERY"),
  @XmlEnumValue("ARTS (Automated Remote Tracking System) (Telemetry)")
  ARTS__AUTOMATED_REMOTE_TRACKING_SYSTEM___TELEMETRY__("ARTS (Automated Remote Tracking System) (Telemetry)"),
  @XmlEnumValue("ASAS (All Source Analysis System)")
  ASAS__ALL_SOURCE_ANALYSIS_SYSTEM__("ASAS (All Source Analysis System)"),
  @XmlEnumValue("ASOS (Automated Surface Observation System)")
  ASOS__AUTOMATED_SURFACE_OBSERVATION_SYSTEM__("ASOS (Automated Surface Observation System)"),
  @XmlEnumValue("ASW (Anti-Submarine Warfare)")
  ASW__ANTI_SUBMARINE_WARFARE__("ASW (Anti-Submarine Warfare)"),
  ATFP("ATFP"),
  @XmlEnumValue("ATIS (Auto Terminal Information Service)")
  ATIS__AUTO_TERMINAL_INFORMATION_SERVICE__("ATIS (Auto Terminal Information Service)"),
  @XmlEnumValue("AVENGER-STC")
  AVENGER_STC("AVENGER-STC"),
  AWACS("AWACS"),
  @XmlEnumValue("AWOS (Automatic Weather Observing System)")
  AWOS__AUTOMATIC_WEATHER_OBSERVING_SYSTEM__("AWOS (Automatic Weather Observing System)"),
  BACKBONE("BACKBONE"),
  @XmlEnumValue("BASE OPERATIONS")
  BASE_OPERATIONS("BASE OPERATIONS"),
  @XmlEnumValue("BATTLE COMMAND")
  BATTLE_COMMAND("BATTLE COMMAND"),
  BEACON("BEACON"),
  @XmlEnumValue("BLUE ANGELS")
  BLUE_ANGELS("BLUE ANGELS"),
  @XmlEnumValue("BMDS (Ballistic Missile Defense System)")
  BMDS__BALLISTIC_MISSILE_DEFENSE_SYSTEM__("BMDS (Ballistic Missile Defense System)"),
  @XmlEnumValue("BMEWS (Ballistic Missile Early Warning System)")
  BMEWS__BALLISTIC_MISSILE_EARLY_WARNING_SYSTEM__("BMEWS (Ballistic Missile Early Warning System)"),
  BROADCAST("BROADCAST"),
  @XmlEnumValue("C3 (Command, Control, & Communications)")
  C_3__COMMAND__CONTROL__COMMUNICATIONS__("C3 (Command, Control, & Communications)"),
  @XmlEnumValue("CARS (Contingency Airborne Reconnaissance System)")
  CARS__CONTINGENCY_AIRBORNE_RECONNAISSANCE_SYSTEM__("CARS (Contingency Airborne Reconnaissance System)"),
  CAVALRY("CAVALRY"),
  @XmlEnumValue("CBR (Chemical, Biological, Radiological)")
  CBR__CHEMICAL__BIOLOGICAL__RADIOLOGICAL__("CBR (Chemical, Biological, Radiological)"),
  CID("CID"),
  @XmlEnumValue("CIVIL AFFAIRS")
  CIVIL_AFFAIRS("CIVIL AFFAIRS"),
  @XmlEnumValue("CIVIL DISTURBANCES")
  CIVIL_DISTURBANCES("CIVIL DISTURBANCES"),
  @XmlEnumValue("CIVIL ENGINEERING")
  CIVIL_ENGINEERING("CIVIL ENGINEERING"),
  @XmlEnumValue("CIVIL SUPPORT TEAM")
  CIVIL_SUPPORT_TEAM("CIVIL SUPPORT TEAM"),
  @XmlEnumValue("CIVIL WORKS")
  CIVIL_WORKS("CIVIL WORKS"),
  @XmlEnumValue("CIWS (Close-In Weapons System)")
  CIWS__CLOSE_IN_WEAPONS_SYSTEM__("CIWS (Close-In Weapons System)"),
  @XmlEnumValue("CLEARANCE DELIVERY")
  CLEARANCE_DELIVERY("CLEARANCE DELIVERY"),
  @XmlEnumValue("CLOSE AIR SUPPORT (CAS)")
  CLOSE_AIR_SUPPORT__CAS__("CLOSE AIR SUPPORT (CAS)"),
  @XmlEnumValue("COG/COOP")
  COG_COOP("COG/COOP"),
  @XmlEnumValue("COLOR/HONOR GUARD")
  COLOR_HONOR_GUARD("COLOR/HONOR GUARD"),
  @XmlEnumValue("COMBAT CONTROL TEAM")
  COMBAT_CONTROL_TEAM("COMBAT CONTROL TEAM"),
  @XmlEnumValue("COMBATANT COMMAND/GENERAL OFFICER SUPPORT")
  COMBATANT_COMMAND_GENERAL_OFFICER_SUPPORT("COMBATANT COMMAND/GENERAL OFFICER SUPPORT"),
  @XmlEnumValue("COMMAND AND CONTROL")
  COMMAND_AND_CONTROL("COMMAND AND CONTROL"),
  @XmlEnumValue("COMMAND DESTRUCT/TERMINATION")
  COMMAND_DESTRUCT_TERMINATION("COMMAND DESTRUCT/TERMINATION"),
  @XmlEnumValue("COMMAND NET")
  COMMAND_NET("COMMAND NET"),
  @XmlEnumValue("COMMAND POST")
  COMMAND_POST("COMMAND POST"),
  @XmlEnumValue("COMMAND POST/CENTER")
  COMMAND_POST_CENTER("COMMAND POST/CENTER"),
  COMMANDER("COMMANDER"),
  COMMUNICATIONS("COMMUNICATIONS"),
  @XmlEnumValue("COMMUNITY ASSISTANCE")
  COMMUNITY_ASSISTANCE("COMMUNITY ASSISTANCE"),
  @XmlEnumValue("CONSEQUENCE MANAGEMENT")
  CONSEQUENCE_MANAGEMENT("CONSEQUENCE MANAGEMENT"),
  CONSERVATION("CONSERVATION"),
  CONSTRUCTION("CONSTRUCTION"),
  CONTINGENCY("CONTINGENCY"),
  @XmlEnumValue("COUNTER DRUG")
  COUNTER_DRUG("COUNTER DRUG"),
  @XmlEnumValue("CSSCS (Combat Service Support Control System)")
  CSSCS__COMBAT_SERVICE_SUPPORT_CONTROL_SYSTEM__("CSSCS (Combat Service Support Control System)"),
  @XmlEnumValue("CTT (Commander\u2019s Tactical Terminal)")
  CTT__COMMANDER_S_TACTICAL_TERMINAL__("CTT (Commander\u2019s Tactical Terminal)"),
  @XmlEnumValue("DATA COLLECTION PLATFORM")
  DATA_COLLECTION_PLATFORM("DATA COLLECTION PLATFORM"),
  @XmlEnumValue("DATA LINK")
  DATA_LINK("DATA LINK"),
  @XmlEnumValue("DBRITE (Digital Bright Radar Indicator Tower Equipment)")
  DBRITE__DIGITAL_BRIGHT_RADAR_INDICATOR_TOWER_EQUIPMENT__("DBRITE (Digital Bright Radar Indicator Tower Equipment)"),
  @XmlEnumValue("DEPARTURE CONTROL")
  DEPARTURE_CONTROL("DEPARTURE CONTROL"),
  @XmlEnumValue("DIS (Defense Investigative Service)")
  DIS__DEFENSE_INVESTIGATIVE_SERVICE__("DIS (Defense Investigative Service)"),
  @XmlEnumValue("DISASTER PLANNING")
  DISASTER_PLANNING("DISASTER PLANNING"),
  @XmlEnumValue("DMSP (Defense Meteorological Satellite Program)")
  DMSP__DEFENSE_METEOROLOGICAL_SATELLITE_PROGRAM__("DMSP (Defense Meteorological Satellite Program)"),
  @XmlEnumValue("DOMESTIC SUPPORT OPERATIONS")
  DOMESTIC_SUPPORT_OPERATIONS("DOMESTIC SUPPORT OPERATIONS"),
  @XmlEnumValue("DRONE CONTROL")
  DRONE_CONTROL("DRONE CONTROL"),
  @XmlEnumValue("DSCS (Defense Satellite Communication System)")
  DSCS__DEFENSE_SATELLITE_COMMUNICATION_SYSTEM__("DSCS (Defense Satellite Communication System)"),
  @XmlEnumValue("DTSS (Digital Topographic Support System)")
  DTSS__DIGITAL_TOPOGRAPHIC_SUPPORT_SYSTEM__("DTSS (Digital Topographic Support System)"),
  EDUCATION("EDUCATION"),
  @XmlEnumValue("ELECTRONIC WARFARE")
  ELECTRONIC_WARFARE("ELECTRONIC WARFARE"),
  @XmlEnumValue("EMERGENCY SERVICES")
  EMERGENCY_SERVICES("EMERGENCY SERVICES"),
  EMWIN("EMWIN"),
  ENGINEERS("ENGINEERS"),
  ENVIRONMENTAL("ENVIRONMENTAL"),
  @XmlEnumValue("ENVIRONMENTAL CLEANUP")
  ENVIRONMENTAL_CLEANUP("ENVIRONMENTAL CLEANUP"),
  @XmlEnumValue("EOD (Emergency Ordinance Disposal)")
  EOD__EMERGENCY_ORDINANCE_DISPOSAL__("EOD (Emergency Ordinance Disposal)"),
  @XmlEnumValue("EPLRS (Enhanced Position Location Reporting System)")
  EPLRS__ENHANCED_POSITION_LOCATION_REPORTING_SYSTEM__("EPLRS (Enhanced Position Location Reporting System)"),
  @XmlEnumValue("EQUIPMENT CHECKS")
  EQUIPMENT_CHECKS("EQUIPMENT CHECKS"),
  @XmlEnumValue("ERCS (Emergency Rocket Communications Systems)")
  ERCS__EMERGENCY_ROCKET_COMMUNICATIONS_SYSTEMS__("ERCS (Emergency Rocket Communications Systems)"),
  @XmlEnumValue("ETCAS (Enhanced Traffic Collision Avoidance System)")
  ETCAS__ENHANCED_TRAFFIC_COLLISION_AVOIDANCE_SYSTEM__("ETCAS (Enhanced Traffic Collision Avoidance System)"),
  @XmlEnumValue("ETRAC (Enhanced Tactical Radar Correlator)")
  ETRAC__ENHANCED_TACTICAL_RADAR_CORRELATOR__("ETRAC (Enhanced Tactical Radar Correlator)"),
  EXECUTIVE("EXECUTIVE"),
  EXERCISE("EXERCISE"),
  EXPERIMENTAL("EXPERIMENTAL"),
  @XmlEnumValue("FAADC2 (Forward Area Air Defense, Command and Control)")
  FAADC_2__FORWARD_AREA_AIR_DEFENSE__COMMAND_AND_CONTROL__("FAADC2 (Forward Area Air Defense, Command and Control)"),
  @XmlEnumValue("FEEDER CONTROL")
  FEEDER_CONTROL("FEEDER CONTROL"),
  @XmlEnumValue("FEMA (Federal Emergency Mgt Agency)")
  FEMA__FEDERAL_EMERGENCY_MGT_AGENCY__("FEMA (Federal Emergency Mgt Agency)"),
  FIRE("FIRE"),
  @XmlEnumValue("FIRE ALARM")
  FIRE_ALARM("FIRE ALARM"),
  @XmlEnumValue("FIRE SUPPORT")
  FIRE_SUPPORT("FIRE SUPPORT"),
  @XmlEnumValue("FLEET SUPPORT")
  FLEET_SUPPORT("FLEET SUPPORT"),
  @XmlEnumValue("FLIGHT FOLLOWING")
  FLIGHT_FOLLOWING("FLIGHT FOLLOWING"),
  @XmlEnumValue("FLIGHT INSPECTION")
  FLIGHT_INSPECTION("FLIGHT INSPECTION"),
  @XmlEnumValue("FLIGHT TEST")
  FLIGHT_TEST("FLIGHT TEST"),
  @XmlEnumValue("FLOOD WARNING SYSTEM")
  FLOOD_WARNING_SYSTEM("FLOOD WARNING SYSTEM"),
  @XmlEnumValue("FLTSATCOM (Fleet Satellite Communications)")
  FLTSATCOM__FLEET_SATELLITE_COMMUNICATIONS__("FLTSATCOM (Fleet Satellite Communications)"),
  @XmlEnumValue("FORACS (Fleet Operational Readiness Accuracy Check Site)")
  FORACS__FLEET_OPERATIONAL_READINESS_ACCURACY_CHECK_SITE__("FORACS (Fleet Operational Readiness Accuracy Check Site)"),
  @XmlEnumValue("FORWARD AIR CONTROL POST")
  FORWARD_AIR_CONTROL_POST("FORWARD AIR CONTROL POST"),
  @XmlEnumValue("GBCS-L (Ground Based Common Sensor-Light)")
  GBCS_L__GROUND_BASED_COMMON_SENSOR_LIGHT__("GBCS-L (Ground Based Common Sensor-Light)"),
  @XmlEnumValue("GBS (Global Broadcast System)")
  GBS__GLOBAL_BROADCAST_SYSTEM__("GBS (Global Broadcast System)"),
  @XmlEnumValue("GCA (Ground Control Approach)")
  GCA__GROUND_CONTROL_APPROACH__("GCA (Ground Control Approach)"),
  @XmlEnumValue("GCCS (Global Command and Control System-Army)")
  GCCS__GLOBAL_COMMAND_AND_CONTROL_SYSTEM_ARMY__("GCCS (Global Command and Control System-Army)"),
  GLOBAL("GLOBAL"),
  @XmlEnumValue("GLOBAL ALE (Automatic Link Establishment)")
  GLOBAL_ALE__AUTOMATIC_LINK_ESTABLISHMENT__("GLOBAL ALE (Automatic Link Establishment)"),
  @XmlEnumValue("GLOBAL BLACK")
  GLOBAL_BLACK("GLOBAL BLACK"),
  @XmlEnumValue("GLOBAL DISCRETE")
  GLOBAL_DISCRETE("GLOBAL DISCRETE"),
  @XmlEnumValue("GLOBAL RED")
  GLOBAL_RED("GLOBAL RED"),
  @XmlEnumValue("GMD (Ground Missile Defense)")
  GMD__GROUND_MISSILE_DEFENSE__("GMD (Ground Missile Defense)"),
  @XmlEnumValue("GOES (Geostationary Operational Environmental Satellites)")
  GOES__GEOSTATIONARY_OPERATIONAL_ENVIRONMENTAL_SATELLITES__("GOES (Geostationary Operational Environmental Satellites)"),
  @XmlEnumValue("GOLDEN KNIGHTS")
  GOLDEN_KNIGHTS("GOLDEN KNIGHTS"),
  @XmlEnumValue("GPS (Global Positioning System)")
  GPS__GLOBAL_POSITIONING_SYSTEM__("GPS (Global Positioning System)"),
  @XmlEnumValue("GRCS (Guardrail Common Sensor)")
  GRCS__GUARDRAIL_COMMON_SENSOR__("GRCS (Guardrail Common Sensor)"),
  @XmlEnumValue("GRIZZLY (M1 Bleacher MineSweeper)")
  GRIZZLY__M_1_BLEACHER_MINE_SWEEPER__("GRIZZLY (M1 Bleacher MineSweeper)"),
  @XmlEnumValue("GROUND CONTROL")
  GROUND_CONTROL("GROUND CONTROL"),
  @XmlEnumValue("GROUND INTERDICTION")
  GROUND_INTERDICTION("GROUND INTERDICTION"),
  @XmlEnumValue("GROUND OPERATIONS")
  GROUND_OPERATIONS("GROUND OPERATIONS"),
  @XmlEnumValue("GSR (Ground Surveillance Radar)")
  GSR__GROUND_SURVEILLANCE_RADAR__("GSR (Ground Surveillance Radar)"),
  @XmlEnumValue("HAARP (High Frequency Active Auroral Research Program)")
  HAARP__HIGH_FREQUENCY_ACTIVE_AURORAL_RESEARCH_PROGRAM__("HAARP (High Frequency Active Auroral Research Program)"),
  @XmlEnumValue("HARBOR-PORT OPERATIONS")
  HARBOR_PORT_OPERATIONS("HARBOR-PORT OPERATIONS"),
  @XmlEnumValue("HAVE QUICK")
  HAVE_QUICK("HAVE QUICK"),
  @XmlEnumValue("HAZARDOUS MATERIAL RELEASE")
  HAZARDOUS_MATERIAL_RELEASE("HAZARDOUS MATERIAL RELEASE"),
  @XmlEnumValue("HAZMAT (Hazardous Materials)")
  HAZMAT__HAZARDOUS_MATERIALS__("HAZMAT (Hazardous Materials)"),
  @XmlEnumValue("HELO CONTROL")
  HELO_CONTROL("HELO CONTROL"),
  @XmlEnumValue("HICOM (High Command)")
  HICOM__HIGH_COMMAND__("HICOM (High Command)"),
  @XmlEnumValue("HYDRA (Hierarchical Yet Dynamically Reprogrammable Architecture)")
  HYDRA__HIERARCHICAL_YET_DYNAMICALLY_REPROGRAMMABLE_ARCHITECTURE__("HYDRA (Hierarchical Yet Dynamically Reprogrammable Architecture)"),
  HYDROLOGIC("HYDROLOGIC"),
  @XmlEnumValue("IEWCS (Intelligence Electronic Warfare Common Sensor)")
  IEWCS__INTELLIGENCE_ELECTRONIC_WARFARE_COMMON_SENSOR__("IEWCS (Intelligence Electronic Warfare Common Sensor)"),
  @XmlEnumValue("IFF/SIF")
  IFF_SIF("IFF/SIF"),
  @XmlEnumValue("ILS (Instrument Landing System)")
  ILS__INSTRUMENT_LANDING_SYSTEM__("ILS (Instrument Landing System)"),
  @XmlEnumValue("IMETS (Integrated Meteorological System)")
  IMETS__INTEGRATED_METEOROLOGICAL_SYSTEM__("IMETS (Integrated Meteorological System)"),
  @XmlEnumValue("INDUSTRIAL CONTROLS")
  INDUSTRIAL_CONTROLS("INDUSTRIAL CONTROLS"),
  INFANTRY("INFANTRY"),
  INSPECTION("INSPECTION"),
  @XmlEnumValue("INSTALLATION PA SYSTEM (Giant Voice)")
  INSTALLATION_PA_SYSTEM__GIANT_VOICE__("INSTALLATION PA SYSTEM (Giant Voice)"),
  @XmlEnumValue("INSTRUCTOR/STUDENT TRAINING")
  INSTRUCTOR_STUDENT_TRAINING("INSTRUCTOR/STUDENT TRAINING"),
  INTELLIGENCE("INTELLIGENCE"),
  INTERPLANE("INTERPLANE"),
  @XmlEnumValue("INVENTORY/INVENTORY CONTROLS (e.g., Optical Scanners)")
  INVENTORY_INVENTORY_CONTROLS__E_G___OPTICAL_SCANNERS__("INVENTORY/INVENTORY CONTROLS (e.g., Optical Scanners)"),
  @XmlEnumValue("IONOSPHERIC SOUNDER")
  IONOSPHERIC_SOUNDER("IONOSPHERIC SOUNDER"),
  @XmlEnumValue("I-REMBASS (Improved-Remotely Monitored Battlefield Sensor System)")
  I_REMBASS__IMPROVED_REMOTELY_MONITORED_BATTLEFIELD_SENSOR_SYSTEM__("I-REMBASS (Improved-Remotely Monitored Battlefield Sensor System)"),
  @XmlEnumValue("ISYSCON (Integrated System Control)")
  ISYSCON__INTEGRATED_SYSTEM_CONTROL__("ISYSCON (Integrated System Control)"),
  @XmlEnumValue("JSS (Joint Surveillance System)")
  JSS__JOINT_SURVEILLANCE_SYSTEM__("JSS (Joint Surveillance System)"),
  @XmlEnumValue("JTIDS/MIDS (Joint Tactical Information Distribution System)")
  JTIDS_MIDS__JOINT_TACTICAL_INFORMATION_DISTRIBUTION_SYSTEM__("JTIDS/MIDS (Joint Tactical Information Distribution System)"),
  @XmlEnumValue("LAND WARRIOR")
  LAND_WARRIOR("LAND WARRIOR"),
  @XmlEnumValue("LAW ENFORCEMENT")
  LAW_ENFORCEMENT("LAW ENFORCEMENT"),
  @XmlEnumValue("LEASAT (Leased Satellite)")
  LEASAT__LEASED_SATELLITE__("LEASAT (Leased Satellite)"),
  LINEBACKER("LINEBACKER"),
  @XmlEnumValue("LLDR (Lightweight Laser Designator Rangefinder)")
  LLDR__LIGHTWEIGHT_LASER_DESIGNATOR_RANGEFINDER__("LLDR (Lightweight Laser Designator Rangefinder)"),
  @XmlEnumValue("LMRDFS (Light Man-portable Radio Direction Finding System)")
  LMRDFS__LIGHT_MAN_PORTABLE_RADIO_DIRECTION_FINDING_SYSTEM__("LMRDFS (Light Man-portable Radio Direction Finding System)"),
  @XmlEnumValue("LOCAL CONTROL")
  LOCAL_CONTROL("LOCAL CONTROL"),
  @XmlEnumValue("LOCKS AND DAMS")
  LOCKS_AND_DAMS("LOCKS AND DAMS"),
  @XmlEnumValue("LONGBOW (Apache Helicopter)")
  LONGBOW__APACHE_HELICOPTER__("LONGBOW (Apache Helicopter)"),
  @XmlEnumValue("LOOTING PREVENTION")
  LOOTING_PREVENTION("LOOTING PREVENTION"),
  @XmlEnumValue("M93A1 FOX")
  M_93_A_1_FOX("M93A1 FOX"),
  MAINTENANCE("MAINTENANCE"),
  @XmlEnumValue("MARS (Military Affiliated Radio System)")
  MARS__MILITARY_AFFILIATED_RADIO_SYSTEM__("MARS (Military Affiliated Radio System)"),
  MEDICAL("MEDICAL"),
  METEOROLOGICAL("METEOROLOGICAL"),
  @XmlEnumValue("MFCS (Mortar Fire control System)")
  MFCS__MORTAR_FIRE_CONTROL_SYSTEM__("MFCS (Mortar Fire control System)"),
  MICROWAVE("MICROWAVE"),
  @XmlEnumValue("MICROWAVE DATA LINK")
  MICROWAVE_DATA_LINK("MICROWAVE DATA LINK"),
  @XmlEnumValue("MILITARY POLICE")
  MILITARY_POLICE("MILITARY POLICE"),
  @XmlEnumValue("MILSTAR (Military Strategic and Tactical Relay System)")
  MILSTAR__MILITARY_STRATEGIC_AND_TACTICAL_RELAY_SYSTEM__("MILSTAR (Military Strategic and Tactical Relay System)"),
  @XmlEnumValue("MISC (Miscellaneous)")
  MISC__MISCELLANEOUS__("MISC (Miscellaneous)"),
  MISSILE("MISSILE"),
  @XmlEnumValue("MITT/DTES (Mobile Integrated Tactical Terminal/Distributed Common Ground System Test and Evaluation Strategy)")
  MITT_DTES__MOBILE_INTEGRATED_TACTICAL_TERMINAL_DISTRIBUTED_COMMON_GROUND_SYSTEM_TEST_AND_EVALUATION_STRATEGY__("MITT/DTES (Mobile Integrated Tactical Terminal/Distributed Common Ground System Test and Evaluation Strategy)"),
  @XmlEnumValue("MLRS (Multiple Launch Rocket System)")
  MLRS__MULTIPLE_LAUNCH_ROCKET_SYSTEM__("MLRS (Multiple Launch Rocket System)"),
  @XmlEnumValue("MLS (Microwave Landing System)")
  MLS__MICROWAVE_LANDING_SYSTEM__("MLS (Microwave Landing System)"),
  @XmlEnumValue("MOBILE TELEPHONE")
  MOBILE_TELEPHONE("MOBILE TELEPHONE"),
  @XmlEnumValue("MOMS (Man on the Move System)")
  MOMS__MAN_ON_THE_MOVE_SYSTEM__("MOMS (Man on the Move System)"),
  @XmlEnumValue("MOTOR POOL")
  MOTOR_POOL("MOTOR POOL"),
  @XmlEnumValue("MSE (Mobile Subscriber Equipment)")
  MSE__MOBILE_SUBSCRIBER_EQUIPMENT__("MSE (Mobile Subscriber Equipment)"),
  @XmlEnumValue("MTS (Movement Tracking System)")
  MTS__MOVEMENT_TRACKING_SYSTEM__("MTS (Movement Tracking System)"),
  MUNITIONS("MUNITIONS"),
  @XmlEnumValue("MUTUAL AID")
  MUTUAL_AID("MUTUAL AID"),
  @XmlEnumValue("MYSTIC STAR")
  MYSTIC_STAR("MYSTIC STAR"),
  @XmlEnumValue("NAOC (National Airborne Operations Center)")
  NAOC__NATIONAL_AIRBORNE_OPERATIONS_CENTER__("NAOC (National Airborne Operations Center)"),
  NASA("NASA"),
  @XmlEnumValue("NATURAL RESOURCES")
  NATURAL_RESOURCES("NATURAL RESOURCES"),
  NAVAIDS("NAVAIDS"),
  @XmlEnumValue("NAVAIDS CONTROLS")
  NAVAIDS_CONTROLS("NAVAIDS CONTROLS"),
  @XmlEnumValue("NAVAL GUNFIRE SUPPORT")
  NAVAL_GUNFIRE_SUPPORT("NAVAL GUNFIRE SUPPORT"),
  @XmlEnumValue("NAVIGATION RADAR")
  NAVIGATION_RADAR("NAVIGATION RADAR"),
  @XmlEnumValue("NAVY SPECIAL OPERATIONS")
  NAVY_SPECIAL_OPERATIONS("NAVY SPECIAL OPERATIONS"),
  @XmlEnumValue("NCIS (Naval Criminal Investigative Service)")
  NCIS__NAVAL_CRIMINAL_INVESTIGATIVE_SERVICE__("NCIS (Naval Criminal Investigative Service)"),
  NDB("NDB"),
  @XmlEnumValue("NERON (NOAA Environmental Real-Time Observation Network)")
  NERON__NOAA_ENVIRONMENTAL_REAL_TIME_OBSERVATION_NETWORK__("NERON (NOAA Environmental Real-Time Observation Network)"),
  NEXRAD("NEXRAD"),
  @XmlEnumValue("NOAA WEATHER RADIO")
  NOAA_WEATHER_RADIO("NOAA WEATHER RADIO"),
  @XmlEnumValue("NOAA WEATHER RADIO LINK")
  NOAA_WEATHER_RADIO_LINK("NOAA WEATHER RADIO LINK"),
  @XmlEnumValue("NORAD (North American Air defense Command)")
  NORAD__NORTH_AMERICAN_AIR_DEFENSE_COMMAND__("NORAD (North American Air defense Command)"),
  @XmlEnumValue("NTDR (Near Term Digital Radio)")
  NTDR__NEAR_TERM_DIGITAL_RADIO__("NTDR (Near Term Digital Radio)"),
  @XmlEnumValue("OCCS SUPPORT")
  OCCS_SUPPORT("OCCS SUPPORT"),
  @XmlEnumValue("OPERATION ALLIANCE")
  OPERATION_ALLIANCE("OPERATION ALLIANCE"),
  @XmlEnumValue("OSI (Office of Special Investigation)")
  OSI__OFFICE_OF_SPECIAL_INVESTIGATION__("OSI (Office of Special Investigation)"),
  @XmlEnumValue("OTHER OPERATIONS")
  OTHER_OPERATIONS("OTHER OPERATIONS"),
  @XmlEnumValue("OTHR/ROTHR (Over-the-Horizon Radars)")
  OTHR_ROTHR__OVER_THE_HORIZON_RADARS__("OTHR/ROTHR (Over-the-Horizon Radars)"),
  PAGING("PAGING"),
  @XmlEnumValue("PAR (Precision Approach Radar)")
  PAR__PRECISION_APPROACH_RADAR__("PAR (Precision Approach Radar)"),
  PATRIOT("PATRIOT"),
  @XmlEnumValue("PAVE PAWS (Precision Acquisition Vehicle Entry Phased Array Warning System)")
  PAVE_PAWS__PRECISION_ACQUISITION_VEHICLE_ENTRY_PHASED_ARRAY_WARNING_SYSTEM__("PAVE PAWS (Precision Acquisition Vehicle Entry Phased Array Warning System)"),
  @XmlEnumValue("PILOT-TO-DISPATCHER")
  PILOT_TO_DISPATCHER("PILOT-TO-DISPATCHER"),
  @XmlEnumValue("PILOT-TO-METRO")
  PILOT_TO_METRO("PILOT-TO-METRO"),
  @XmlEnumValue("PILOT-TO-PILOT")
  PILOT_TO_PILOT("PILOT-TO-PILOT"),
  @XmlEnumValue("POL (Petroleum, Oil, and Lubricants)")
  POL__PETROLEUM__OIL__AND_LUBRICANTS__("POL (Petroleum, Oil, and Lubricants)"),
  @XmlEnumValue("POSTAL OPERATIONS")
  POSTAL_OPERATIONS("POSTAL OPERATIONS"),
  @XmlEnumValue("PRIME BEEF")
  PRIME_BEEF("PRIME BEEF"),
  @XmlEnumValue("PRISON BUS")
  PRISON_BUS("PRISON BUS"),
  @XmlEnumValue("PROJECT COTHEN")
  PROJECT_COTHEN("PROJECT COTHEN"),
  @XmlEnumValue("PSYCHOLOGICAL OPERATIONS")
  PSYCHOLOGICAL_OPERATIONS("PSYCHOLOGICAL OPERATIONS"),
  @XmlEnumValue("PUBLIC WORKS")
  PUBLIC_WORKS("PUBLIC WORKS"),
  @XmlEnumValue("RADAR (Radio Detection and Ranging)")
  RADAR__RADIO_DETECTION_AND_RANGING__("RADAR (Radio Detection and Ranging)"),
  @XmlEnumValue("RADIO RELAY")
  RADIO_RELAY("RADIO RELAY"),
  RADIOLOCATION("RADIOLOCATION"),
  RADIOSONDE("RADIOSONDE"),
  @XmlEnumValue("RAMP CONTROL")
  RAMP_CONTROL("RAMP CONTROL"),
  @XmlEnumValue("RANGE CONTROL")
  RANGE_CONTROL("RANGE CONTROL"),
  @XmlEnumValue("RANGE OPERATIONS")
  RANGE_OPERATIONS("RANGE OPERATIONS"),
  @XmlEnumValue("RANGER UNITS")
  RANGER_UNITS("RANGER UNITS"),
  @XmlEnumValue("RDMS (Range Data Management Subsystem)")
  RDMS__RANGE_DATA_MANAGEMENT_SUBSYSTEM__("RDMS (Range Data Management Subsystem)"),
  @XmlEnumValue("RDTE SUPPORT")
  RDTE_SUPPORT("RDTE SUPPORT"),
  @XmlEnumValue("RED HORSE")
  RED_HORSE("RED HORSE"),
  REFUELING("REFUELING"),
  @XmlEnumValue("REMOTE BARRIER CONTROL SYSTEMS")
  REMOTE_BARRIER_CONTROL_SYSTEMS("REMOTE BARRIER CONTROL SYSTEMS"),
  @XmlEnumValue("REMOTE CONTROL CRANE")
  REMOTE_CONTROL_CRANE("REMOTE CONTROL CRANE"),
  @XmlEnumValue("RESOURCES CONSERVATION")
  RESOURCES_CONSERVATION("RESOURCES CONSERVATION"),
  RESUPPLY("RESUPPLY"),
  @XmlEnumValue("RF TAGS")
  RF_TAGS("RF TAGS"),
  @XmlEnumValue("RUNWAY ICE DETECTION SYSTEMS")
  RUNWAY_ICE_DETECTION_SYSTEMS("RUNWAY ICE DETECTION SYSTEMS"),
  @XmlEnumValue("RUNWAY LIGHTING CONTROL")
  RUNWAY_LIGHTING_CONTROL("RUNWAY LIGHTING CONTROL"),
  SAFETY("SAFETY"),
  @XmlEnumValue("SATELLITE COMMUNICATIONS")
  SATELLITE_COMMUNICATIONS("SATELLITE COMMUNICATIONS"),
  @XmlEnumValue("SAWDS (Satellite Automated WX Dist Sys)")
  SAWDS__SATELLITE_AUTOMATED_WX_DIST_SYS__("SAWDS (Satellite Automated WX Dist Sys)"),
  @XmlEnumValue("SCAMP (Single Channel Anti-Jam Manportable Terminal)")
  SCAMP__SINGLE_CHANNEL_ANTI_JAM_MANPORTABLE_TERMINAL__("SCAMP (Single Channel Anti-Jam Manportable Terminal)"),
  @XmlEnumValue("SCOPE SHIELD")
  SCOPE_SHIELD("SCOPE SHIELD"),
  @XmlEnumValue("SEA OPERATIONS")
  SEA_OPERATIONS("SEA OPERATIONS"),
  SEABEES("SEABEES"),
  @XmlEnumValue("SEARCH AND RESCUE")
  SEARCH_AND_RESCUE("SEARCH AND RESCUE"),
  @XmlEnumValue("SECURITY FORCE")
  SECURITY_FORCE("SECURITY FORCE"),
  SEISMIC("SEISMIC"),
  @XmlEnumValue("SENTINEL (AN/MPQ-64 Surveillance Radar)")
  SENTINEL__AN_MPQ_64_SURVEILLANCE_RADAR__("SENTINEL (AN/MPQ-64 Surveillance Radar)"),
  @XmlEnumValue("SGLS (Space Ground Link Subsystem) (Telemetry)")
  SGLS__SPACE_GROUND_LINK_SUBSYSTEM___TELEMETRY__("SGLS (Space Ground Link Subsystem) (Telemetry)"),
  @XmlEnumValue("SHIP/AIR OPERATIONS")
  SHIP_AIR_OPERATIONS("SHIP/AIR OPERATIONS"),
  @XmlEnumValue("SHIP/SHIP")
  SHIP_SHIP("SHIP/SHIP"),
  @XmlEnumValue("SHIP/SHORE OPERATIONS")
  SHIP_SHORE_OPERATIONS("SHIP/SHORE OPERATIONS"),
  SHIPYARD("SHIPYARD"),
  @XmlEnumValue("SHORE PATROL")
  SHORE_PATROL("SHORE PATROL"),
  @XmlEnumValue("SHORT TERM INCIDENT RESPONSE")
  SHORT_TERM_INCIDENT_RESPONSE("SHORT TERM INCIDENT RESPONSE"),
  SHUTTLE("SHUTTLE"),
  SIMULATOR("SIMULATOR"),
  @XmlEnumValue("SINCGARS (Single Channel Ground and Airborne Radio System)")
  SINCGARS__SINGLE_CHANNEL_GROUND_AND_AIRBORNE_RADIO_SYSTEM__("SINCGARS (Single Channel Ground and Airborne Radio System)"),
  @XmlEnumValue("SINCGARS-ASIP (Single Channel Ground and Airborne Radio System-Advanced System Improvement Plan)")
  SINCGARS_ASIP__SINGLE_CHANNEL_GROUND_AND_AIRBORNE_RADIO_SYSTEM_ADVANCED_SYSTEM_IMPROVEMENT_PLAN__("SINCGARS-ASIP (Single Channel Ground and Airborne Radio System-Advanced System Improvement Plan)"),
  @XmlEnumValue("SNOW REMOVAL")
  SNOW_REMOVAL("SNOW REMOVAL"),
  @XmlEnumValue("SOF (Supervisor of Flying)")
  SOF__SUPERVISOR_OF_FLYING__("SOF (Supervisor of Flying)"),
  SONOBUOY("SONOBUOY"),
  @XmlEnumValue("SORT (Special Operations Response Team)")
  SORT__SPECIAL_OPERATIONS_RESPONSE_TEAM__("SORT (Special Operations Response Team)"),
  @XmlEnumValue("SPACE OPERATIONS")
  SPACE_OPERATIONS("SPACE OPERATIONS"),
  @XmlEnumValue("SPECIAL COURIER")
  SPECIAL_COURIER("SPECIAL COURIER"),
  @XmlEnumValue("SPECIAL FORCES")
  SPECIAL_FORCES("SPECIAL FORCES"),
  @XmlEnumValue("SPECIAL OPERATIONS")
  SPECIAL_OPERATIONS("SPECIAL OPERATIONS"),
  @XmlEnumValue("SPECIAL PROJECTS")
  SPECIAL_PROJECTS("SPECIAL PROJECTS"),
  @XmlEnumValue("SPECIAL SECURITY OPERATIONS")
  SPECIAL_SECURITY_OPERATIONS("SPECIAL SECURITY OPERATIONS"),
  @XmlEnumValue("SPEED MEASUREMENT SYSTEMS")
  SPEED_MEASUREMENT_SYSTEMS("SPEED MEASUREMENT SYSTEMS"),
  @XmlEnumValue("SPITFIRE (SPITFIRE Manpack UHF SATCOM DAMA Terminal)")
  SPITFIRE__SPITFIRE_MANPACK_UHF_SATCOM_DAMA_TERMINAL__("SPITFIRE (SPITFIRE Manpack UHF SATCOM DAMA Terminal)"),
  @XmlEnumValue("SQUADRON/WING COMMON")
  SQUADRON_WING_COMMON("SQUADRON/WING COMMON"),
  @XmlEnumValue("STRIKER II (Advanced Fire Support/Scout/Surveillance System)")
  STRIKER_II__ADVANCED_FIRE_SUPPORT_SCOUT_SURVEILLANCE_SYSTEM__("STRIKER II (Advanced Fire Support/Scout/Surveillance System)"),
  @XmlEnumValue("SUPPLY AND LOGISTICS")
  SUPPLY_AND_LOGISTICS("SUPPLY AND LOGISTICS"),
  @XmlEnumValue("SURFACE NAVAIDS")
  SURFACE_NAVAIDS("SURFACE NAVAIDS"),
  @XmlEnumValue("SURVEILLANCE SYSTEMS")
  SURVEILLANCE_SYSTEMS("SURVEILLANCE SYSTEMS"),
  @XmlEnumValue("SURVEILLANCE/ RECONNAISSANCE")
  SURVEILLANCE__RECONNAISSANCE("SURVEILLANCE/ RECONNAISSANCE"),
  SURVEY("SURVEY"),
  @XmlEnumValue("SUSTAINING OPERATIONS")
  SUSTAINING_OPERATIONS("SUSTAINING OPERATIONS"),
  @XmlEnumValue("TACAN (Tactical Air Navigation)")
  TACAN__TACTICAL_AIR_NAVIGATION__("TACAN (Tactical Air Navigation)"),
  @XmlEnumValue("TACCS (Tactical Army Combat Service Support Computer System)")
  TACCS__TACTICAL_ARMY_COMBAT_SERVICE_SUPPORT_COMPUTER_SYSTEM__("TACCS (Tactical Army Combat Service Support Computer System)"),
  @XmlEnumValue("TACJAM (Tactical Communications Jamming System)")
  TACJAM__TACTICAL_COMMUNICATIONS_JAMMING_SYSTEM__("TACJAM (Tactical Communications Jamming System)"),
  @XmlEnumValue("TACTS (Tactical Trunk Signaling)")
  TACTS__TACTICAL_TRUNK_SIGNALING__("TACTS (Tactical Trunk Signaling)"),
  @XmlEnumValue("TADIL-A")
  TADIL_A("TADIL-A"),
  @XmlEnumValue("TADIL-C")
  TADIL_C("TADIL-C"),
  TARGET("TARGET"),
  @XmlEnumValue("TARGET ACQUISITION")
  TARGET_ACQUISITION("TARGET ACQUISITION"),
  @XmlEnumValue("TARGET SCORING")
  TARGET_SCORING("TARGET SCORING"),
  TAXI("TAXI"),
  @XmlEnumValue("TCAS (Traffic Collision Avoidance System)")
  TCAS__TRAFFIC_COLLISION_AVOIDANCE_SYSTEM__("TCAS (Traffic Collision Avoidance System)"),
  @XmlEnumValue("TCRS (Target Control System)")
  TCRS__TARGET_CONTROL_SYSTEM__("TCRS (Target Control System)"),
  TEAMMATE("TEAMMATE"),
  @XmlEnumValue("TECHNICAL ESCORT UNIT")
  TECHNICAL_ESCORT_UNIT("TECHNICAL ESCORT UNIT"),
  TELECOMMAND("TELECOMMAND"),
  TELEMETRY("TELEMETRY"),
  @XmlEnumValue("TEST AND MEASUREMENT")
  TEST_AND_MEASUREMENT("TEST AND MEASUREMENT"),
  @XmlEnumValue("TEST RANGE")
  TEST_RANGE("TEST RANGE"),
  @XmlEnumValue("TEST RANGE TIMING")
  TEST_RANGE_TIMING("TEST RANGE TIMING"),
  @XmlEnumValue("TETHERED AREOSTAT RADAR")
  TETHERED_AREOSTAT_RADAR("TETHERED AREOSTAT RADAR"),
  THUNDERBIRDS("THUNDERBIRDS"),
  @XmlEnumValue("TIS or TRAVELERS INFORMATION SYSTEM")
  TIS_OR_TRAVELERS_INFORMATION_SYSTEM("TIS or TRAVELERS INFORMATION SYSTEM"),
  @XmlEnumValue("TMGS (Transportable mobile ground subsystems)")
  TMGS__TRANSPORTABLE_MOBILE_GROUND_SUBSYSTEMS__("TMGS (Transportable mobile ground subsystems)"),
  @XmlEnumValue("TOSS (TV Ordnance Scoring System)")
  TOSS__TV_ORDNANCE_SCORING_SYSTEM__("TOSS (TV Ordnance Scoring System)"),
  TOWER("TOWER"),
  TRACKWOLF("TRACKWOLF"),
  @XmlEnumValue("TRAILBLAZER (Ground Based Communications Intelligence System)")
  TRAILBLAZER__GROUND_BASED_COMMUNICATIONS_INTELLIGENCE_SYSTEM__("TRAILBLAZER (Ground Based Communications Intelligence System)"),
  TRAINING("TRAINING"),
  TRANSPORTATION("TRANSPORTATION"),
  @XmlEnumValue("TROJAN SPIRIT")
  TROJAN_SPIRIT("TROJAN SPIRIT"),
  TRUNKING("TRUNKING"),
  TSU("TSU"),
  @XmlEnumValue("UAV (Unmanned Aerial Vehicle)")
  UAV__UNMANNED_AERIAL_VEHICLE__("UAV (Unmanned Aerial Vehicle)"),
  @XmlEnumValue("UNLICENSED DEVICE")
  UNLICENSED_DEVICE("UNLICENSED DEVICE"),
  UTILITIES("UTILITIES"),
  @XmlEnumValue("VOR (Very High Frequency Omnidirectional Range)")
  VOR__VERY_HIGH_FREQUENCY_OMNIDIRECTIONAL_RANGE__("VOR (Very High Frequency Omnidirectional Range)"),
  @XmlEnumValue("VORTAC (VHF Omni-range TACAN)")
  VORTAC__VHF_OMNI_RANGE_TACAN__("VORTAC (VHF Omni-range TACAN)"),
  @XmlEnumValue("WARNING SYSTEM")
  WARNING_SYSTEM("WARNING SYSTEM"),
  @XmlEnumValue("WEAPON SYSTEMS")
  WEAPON_SYSTEMS("WEAPON SYSTEMS"),
  @XmlEnumValue("WEAPONS STORAGE PROTECTION")
  WEAPONS_STORAGE_PROTECTION("WEAPONS STORAGE PROTECTION"),
  WEATHER("WEATHER"),
  @XmlEnumValue("WEATHER RADAR")
  WEATHER_RADAR("WEATHER RADAR"),
  @XmlEnumValue("WHCA (White House Communications Agency)")
  WHCA__WHITE_HOUSE_COMMUNICATIONS_AGENCY__("WHCA (White House Communications Agency)"),
  @XmlEnumValue("WIDEBAND GLOBAL SATCOM")
  WIDEBAND_GLOBAL_SATCOM("WIDEBAND GLOBAL SATCOM"),
  @XmlEnumValue("WILDLIFE PRESERVATION")
  WILDLIFE_PRESERVATION("WILDLIFE PRESERVATION"),
  @XmlEnumValue("WIND PROFILER")
  WIND_PROFILER("WIND PROFILER"),
  @XmlEnumValue("WIN-T (Warfighter Information Network-Tactical)")
  WIN_T__WARFIGHTER_INFORMATION_NETWORK_TACTICAL__("WIN-T (Warfighter Information Network-Tactical)"),
  @XmlEnumValue("WIRELESS LOCAL AREA NETWORK")
  WIRELESS_LOCAL_AREA_NETWORK("WIRELESS LOCAL AREA NETWORK"),
  @XmlEnumValue("WIRELESS MIKE")
  WIRELESS_MIKE("WIRELESS MIKE"),
  @XmlEnumValue("WOLVERINE (Assault Bridge)")
  WOLVERINE__ASSAULT_BRIDGE__("WOLVERINE (Assault Bridge)");
  private final String value;

  ListUFN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUFN fromValue(String v) {
    for (ListUFN c : ListUFN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
