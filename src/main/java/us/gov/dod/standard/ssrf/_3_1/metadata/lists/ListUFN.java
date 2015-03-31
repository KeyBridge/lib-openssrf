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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.assignment.DetailedFunction;
import us.gov.dod.standard.ssrf._3_1.assignment.Link;

/**
 * Enumerated values for fields using the ListUFN type.
 * <p>
 * Used in {@link DetailedFunction}, {@link Link}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUFN")
@XmlEnum
public enum ListUFN {

  UNKNOWN("UNKNOWN"),
  @XmlEnumValue("A2C2S (Army Airborne Command & Control System)")
  A2C2S_ARMY_AIRBORNE_COMMAND_CONTROL_SYSTEM("A2C2S (Army Airborne Command & Control System)"),
  @XmlEnumValue("ACS (Aerial Common Sensor)")
  ACS_AERIAL_COMMON_SENSOR("ACS (Aerial Common Sensor)"),
  ADMINISTRATIVE("ADMINISTRATIVE"),
  AEGIS("AEGIS"),
  @XmlEnumValue("A-EPLRS")
  A_EPLRS("A-EPLRS"),
  @XmlEnumValue("AERO CLUB")
  AERO_CLUB("AERO CLUB"),
  AFATDS("AFATDS"),
  @XmlEnumValue("AFAUX/CAP (Air Force Auxiliary/Civil Air Patrol)")
  AFAUX_CAP_AIR_FORCE_AUXILIARY_CIVIL_AIR_PATROL("AFAUX/CAP (Air Force Auxiliary/Civil Air Patrol)"),
  AFSATCOM("AFSATCOM"),
  @XmlEnumValue("AHFEWS (Army HF EW System)")
  AHFEWS_ARMY_HF_EW_SYSTEM("AHFEWS (Army HF EW System)"),
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
  AMPS_AIR_MOVEMENT_PLANNING_SYSTEM("AMPS (Air Movement Planning System)"),
  @XmlEnumValue("AMSS (Automatic Meteorological Sensor System)")
  AMSS_AUTOMATIC_METEOROLOGICAL_SENSOR_SYSTEM("AMSS (Automatic Meteorological Sensor System)"),
  @XmlEnumValue("ANTI-TERRORISM")
  ANTI_TERRORISM("ANTI-TERRORISM"),
  @XmlEnumValue("APPROACH CONTROL")
  APPROACH_CONTROL("APPROACH CONTROL"),
  @XmlEnumValue("AQF (Advanced Quick Fix)")
  AQF_ADVANCED_QUICK_FIX("AQF (Advanced Quick Fix)"),
  @XmlEnumValue("ARL (Aerial Reconnaissance-Low)")
  ARL_AERIAL_RECONNAISSANCE_LOW("ARL (Aerial Reconnaissance-Low)"),
  @XmlEnumValue("ARMY AVIATION")
  ARMY_AVIATION("ARMY AVIATION"),
  @XmlEnumValue("ARMY SPECIAL OPERATIONS")
  ARMY_SPECIAL_OPERATIONS("ARMY SPECIAL OPERATIONS"),
  ARTILLERY("ARTILLERY"),
  @XmlEnumValue("ARTS (Automated Remote Tracking System) (Telemetry)")
  ARTS_AUTOMATED_REMOTE_TRACKING_SYSTEM_TELEMETRY("ARTS (Automated Remote Tracking System) (Telemetry)"),
  @XmlEnumValue("ASAS (All Source Analysis System)")
  ASAS_ALL_SOURCE_ANALYSIS_SYSTEM("ASAS (All Source Analysis System)"),
  @XmlEnumValue("ASOS (Automated Surface Observation System)")
  ASOS_AUTOMATED_SURFACE_OBSERVATION_SYSTEM("ASOS (Automated Surface Observation System)"),
  @XmlEnumValue("ASW (Anti-Submarine Warfare)")
  ASW_ANTI_SUBMARINE_WARFARE("ASW (Anti-Submarine Warfare)"),
  ATFP("ATFP"),
  @XmlEnumValue("ATIS (Auto Terminal Information Service)")
  ATIS_AUTO_TERMINAL_INFORMATION_SERVICE("ATIS (Auto Terminal Information Service)"),
  @XmlEnumValue("AVENGER-STC")
  AVENGER_STC("AVENGER-STC"),
  AWACS("AWACS"),
  @XmlEnumValue("AWOS (Automatic Weather Observing System)")
  AWOS_AUTOMATIC_WEATHER_OBSERVING_SYSTEM("AWOS (Automatic Weather Observing System)"),
  BACKBONE("BACKBONE"),
  @XmlEnumValue("BASE OPERATIONS")
  BASE_OPERATIONS("BASE OPERATIONS"),
  @XmlEnumValue("BATTLE COMMAND")
  BATTLE_COMMAND("BATTLE COMMAND"),
  BEACON("BEACON"),
  @XmlEnumValue("BLUE ANGELS")
  BLUE_ANGELS("BLUE ANGELS"),
  @XmlEnumValue("BMDS (Ballistic Missile Defense System)")
  BMDS_BALLISTIC_MISSILE_DEFENSE_SYSTEM("BMDS (Ballistic Missile Defense System)"),
  @XmlEnumValue("BMEWS (Ballistic Missile Early Warning System)")
  BMEWS_BALLISTIC_MISSILE_EARLY_WARNING_SYSTEM("BMEWS (Ballistic Missile Early Warning System)"),
  BROADCAST("BROADCAST"),
  @XmlEnumValue("C3 (Command, Control, & Communications)")
  C_3_COMMAND_CONTROL_COMMUNICATIONS("C3 (Command, Control, & Communications)"),
  @XmlEnumValue("CARS (Contingency Airborne Reconnaissance System)")
  CARS_CONTINGENCY_AIRBORNE_RECONNAISSANCE_SYSTEM("CARS (Contingency Airborne Reconnaissance System)"),
  CAVALRY("CAVALRY"),
  @XmlEnumValue("CBR (Chemical, Biological, Radiological)")
  CBR_CHEMICAL_BIOLOGICAL_RADIOLOGICAL("CBR (Chemical, Biological, Radiological)"),
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
  CIWS_CLOSE_IN_WEAPONS_SYSTEM("CIWS (Close-In Weapons System)"),
  @XmlEnumValue("CLEARANCE DELIVERY")
  CLEARANCE_DELIVERY("CLEARANCE DELIVERY"),
  @XmlEnumValue("CLOSE AIR SUPPORT (CAS)")
  CLOSE_AIR_SUPPORT_CAS("CLOSE AIR SUPPORT (CAS)"),
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
  CSSCS_COMBAT_SERVICE_SUPPORT_CONTROL_SYSTEM("CSSCS (Combat Service Support Control System)"),
  @XmlEnumValue("CTT (Commander\u2019s Tactical Terminal)")
  CTT_COMMANDER_S_TACTICAL_TERMINAL("CTT (Commander\u2019s Tactical Terminal)"),
  @XmlEnumValue("DATA COLLECTION PLATFORM")
  DATA_COLLECTION_PLATFORM("DATA COLLECTION PLATFORM"),
  @XmlEnumValue("DATA LINK")
  DATA_LINK("DATA LINK"),
  @XmlEnumValue("DBRITE (Digital Bright Radar Indicator Tower Equipment)")
  DBRITE_DIGITAL_BRIGHT_RADAR_INDICATOR_TOWER_EQUIPMENT("DBRITE (Digital Bright Radar Indicator Tower Equipment)"),
  @XmlEnumValue("DEPARTURE CONTROL")
  DEPARTURE_CONTROL("DEPARTURE CONTROL"),
  @XmlEnumValue("DIS (Defense Investigative Service)")
  DIS_DEFENSE_INVESTIGATIVE_SERVICE("DIS (Defense Investigative Service)"),
  @XmlEnumValue("DISASTER PLANNING")
  DISASTER_PLANNING("DISASTER PLANNING"),
  @XmlEnumValue("DMSP (Defense Meteorological Satellite Program)")
  DMSP_DEFENSE_METEOROLOGICAL_SATELLITE_PROGRAM("DMSP (Defense Meteorological Satellite Program)"),
  @XmlEnumValue("DOMESTIC SUPPORT OPERATIONS")
  DOMESTIC_SUPPORT_OPERATIONS("DOMESTIC SUPPORT OPERATIONS"),
  @XmlEnumValue("DRONE CONTROL")
  DRONE_CONTROL("DRONE CONTROL"),
  @XmlEnumValue("DSCS (Defense Satellite Communication System)")
  DSCS_DEFENSE_SATELLITE_COMMUNICATION_SYSTEM("DSCS (Defense Satellite Communication System)"),
  @XmlEnumValue("DTSS (Digital Topographic Support System)")
  DTSS_DIGITAL_TOPOGRAPHIC_SUPPORT_SYSTEM("DTSS (Digital Topographic Support System)"),
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
  EOD_EMERGENCY_ORDINANCE_DISPOSAL("EOD (Emergency Ordinance Disposal)"),
  @XmlEnumValue("EPLRS (Enhanced Position Location Reporting System)")
  EPLRS_ENHANCED_POSITION_LOCATION_REPORTING_SYSTEM("EPLRS (Enhanced Position Location Reporting System)"),
  @XmlEnumValue("EQUIPMENT CHECKS")
  EQUIPMENT_CHECKS("EQUIPMENT CHECKS"),
  @XmlEnumValue("ERCS (Emergency Rocket Communications Systems)")
  ERCS_EMERGENCY_ROCKET_COMMUNICATIONS_SYSTEMS("ERCS (Emergency Rocket Communications Systems)"),
  @XmlEnumValue("ETCAS (Enhanced Traffic Collision Avoidance System)")
  ETCAS_ENHANCED_TRAFFIC_COLLISION_AVOIDANCE_SYSTEM("ETCAS (Enhanced Traffic Collision Avoidance System)"),
  @XmlEnumValue("ETRAC (Enhanced Tactical Radar Correlator)")
  ETRAC_ENHANCED_TACTICAL_RADAR_CORRELATOR("ETRAC (Enhanced Tactical Radar Correlator)"),
  EXECUTIVE("EXECUTIVE"),
  EXERCISE("EXERCISE"),
  EXPERIMENTAL("EXPERIMENTAL"),
  @XmlEnumValue("FAADC2 (Forward Area Air Defense, Command and Control)")
  FAADC_2_FORWARD_AREA_AIR_DEFENSE_COMMAND_AND_CONTROL("FAADC2 (Forward Area Air Defense, Command and Control)"),
  @XmlEnumValue("FEEDER CONTROL")
  FEEDER_CONTROL("FEEDER CONTROL"),
  @XmlEnumValue("FEMA (Federal Emergency Mgt Agency)")
  FEMA_FEDERAL_EMERGENCY_MGT_AGENCY("FEMA (Federal Emergency Mgt Agency)"),
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
  FLTSATCOM_FLEET_SATELLITE_COMMUNICATIONS("FLTSATCOM (Fleet Satellite Communications)"),
  @XmlEnumValue("FORACS (Fleet Operational Readiness Accuracy Check Site)")
  FORACS_FLEET_OPERATIONAL_READINESS_ACCURACY_CHECK_SITE("FORACS (Fleet Operational Readiness Accuracy Check Site)"),
  @XmlEnumValue("FORWARD AIR CONTROL POST")
  FORWARD_AIR_CONTROL_POST("FORWARD AIR CONTROL POST"),
  @XmlEnumValue("GBCS-L (Ground Based Common Sensor-Light)")
  GBCS_L_GROUND_BASED_COMMON_SENSOR_LIGHT("GBCS-L (Ground Based Common Sensor-Light)"),
  @XmlEnumValue("GBS (Global Broadcast System)")
  GBS_GLOBAL_BROADCAST_SYSTEM("GBS (Global Broadcast System)"),
  @XmlEnumValue("GCA (Ground Control Approach)")
  GCA_GROUND_CONTROL_APPROACH("GCA (Ground Control Approach)"),
  @XmlEnumValue("GCCS (Global Command and Control System-Army)")
  GCCS_GLOBAL_COMMAND_AND_CONTROL_SYSTEM_ARMY("GCCS (Global Command and Control System-Army)"),
  GLOBAL("GLOBAL"),
  @XmlEnumValue("GLOBAL ALE (Automatic Link Establishment)")
  GLOBAL_ALE_AUTOMATIC_LINK_ESTABLISHMENT("GLOBAL ALE (Automatic Link Establishment)"),
  @XmlEnumValue("GLOBAL BLACK")
  GLOBAL_BLACK("GLOBAL BLACK"),
  @XmlEnumValue("GLOBAL DISCRETE")
  GLOBAL_DISCRETE("GLOBAL DISCRETE"),
  @XmlEnumValue("GLOBAL RED")
  GLOBAL_RED("GLOBAL RED"),
  @XmlEnumValue("GMD (Ground Missile Defense)")
  GMD_GROUND_MISSILE_DEFENSE("GMD (Ground Missile Defense)"),
  @XmlEnumValue("GOES (Geostationary Operational Environmental Satellites)")
  GOES_GEOSTATIONARY_OPERATIONAL_ENVIRONMENTAL_SATELLITES("GOES (Geostationary Operational Environmental Satellites)"),
  @XmlEnumValue("GOLDEN KNIGHTS")
  GOLDEN_KNIGHTS("GOLDEN KNIGHTS"),
  @XmlEnumValue("GPS (Global Positioning System)")
  GPS_GLOBAL_POSITIONING_SYSTEM("GPS (Global Positioning System)"),
  @XmlEnumValue("GRCS (Guardrail Common Sensor)")
  GRCS_GUARDRAIL_COMMON_SENSOR("GRCS (Guardrail Common Sensor)"),
  @XmlEnumValue("GRIZZLY (M1 Bleacher MineSweeper)")
  GRIZZLY_M_1_BLEACHER_MINE_SWEEPER("GRIZZLY (M1 Bleacher MineSweeper)"),
  @XmlEnumValue("GROUND CONTROL")
  GROUND_CONTROL("GROUND CONTROL"),
  @XmlEnumValue("GROUND INTERDICTION")
  GROUND_INTERDICTION("GROUND INTERDICTION"),
  @XmlEnumValue("GROUND OPERATIONS")
  GROUND_OPERATIONS("GROUND OPERATIONS"),
  @XmlEnumValue("GSR (Ground Surveillance Radar)")
  GSR_GROUND_SURVEILLANCE_RADAR("GSR (Ground Surveillance Radar)"),
  @XmlEnumValue("HAARP (High Frequency Active Auroral Research Program)")
  HAARP_HIGH_FREQUENCY_ACTIVE_AURORAL_RESEARCH_PROGRAM("HAARP (High Frequency Active Auroral Research Program)"),
  @XmlEnumValue("HARBOR-PORT OPERATIONS")
  HARBOR_PORT_OPERATIONS("HARBOR-PORT OPERATIONS"),
  @XmlEnumValue("HAVE QUICK")
  HAVE_QUICK("HAVE QUICK"),
  @XmlEnumValue("HAZARDOUS MATERIAL RELEASE")
  HAZARDOUS_MATERIAL_RELEASE("HAZARDOUS MATERIAL RELEASE"),
  @XmlEnumValue("HAZMAT (Hazardous Materials)")
  HAZMAT_HAZARDOUS_MATERIALS("HAZMAT (Hazardous Materials)"),
  @XmlEnumValue("HELO CONTROL")
  HELO_CONTROL("HELO CONTROL"),
  @XmlEnumValue("HICOM (High Command)")
  HICOM_HIGH_COMMAND("HICOM (High Command)"),
  @XmlEnumValue("HYDRA (Hierarchical Yet Dynamically Reprogrammable Architecture)")
  HYDRA_HIERARCHICAL_YET_DYNAMICALLY_REPROGRAMMABLE_ARCHITECTURE("HYDRA (Hierarchical Yet Dynamically Reprogrammable Architecture)"),
  HYDROLOGIC("HYDROLOGIC"),
  @XmlEnumValue("IEWCS (Intelligence Electronic Warfare Common Sensor)")
  IEWCS_INTELLIGENCE_ELECTRONIC_WARFARE_COMMON_SENSOR("IEWCS (Intelligence Electronic Warfare Common Sensor)"),
  @XmlEnumValue("IFF/SIF")
  IFF_SIF("IFF/SIF"),
  @XmlEnumValue("ILS (Instrument Landing System)")
  ILS_INSTRUMENT_LANDING_SYSTEM("ILS (Instrument Landing System)"),
  @XmlEnumValue("IMETS (Integrated Meteorological System)")
  IMETS_INTEGRATED_METEOROLOGICAL_SYSTEM("IMETS (Integrated Meteorological System)"),
  @XmlEnumValue("INDUSTRIAL CONTROLS")
  INDUSTRIAL_CONTROLS("INDUSTRIAL CONTROLS"),
  INFANTRY("INFANTRY"),
  INSPECTION("INSPECTION"),
  @XmlEnumValue("INSTALLATION PA SYSTEM (Giant Voice)")
  INSTALLATION_PA_SYSTEM_GIANT_VOICE("INSTALLATION PA SYSTEM (Giant Voice)"),
  @XmlEnumValue("INSTRUCTOR/STUDENT TRAINING")
  INSTRUCTOR_STUDENT_TRAINING("INSTRUCTOR/STUDENT TRAINING"),
  INTELLIGENCE("INTELLIGENCE"),
  INTERPLANE("INTERPLANE"),
  @XmlEnumValue("INVENTORY/INVENTORY CONTROLS (e.g., Optical Scanners)")
  INVENTORY_INVENTORY_CONTROLS_E_G_OPTICAL_SCANNERS("INVENTORY/INVENTORY CONTROLS (e.g., Optical Scanners)"),
  @XmlEnumValue("IONOSPHERIC SOUNDER")
  IONOSPHERIC_SOUNDER("IONOSPHERIC SOUNDER"),
  @XmlEnumValue("I-REMBASS (Improved-Remotely Monitored Battlefield Sensor System)")
  I_REMBASS_IMPROVED_REMOTELY_MONITORED_BATTLEFIELD_SENSOR_SYSTEM("I-REMBASS (Improved-Remotely Monitored Battlefield Sensor System)"),
  @XmlEnumValue("ISYSCON (Integrated System Control)")
  ISYSCON_INTEGRATED_SYSTEM_CONTROL("ISYSCON (Integrated System Control)"),
  @XmlEnumValue("JSS (Joint Surveillance System)")
  JSS_JOINT_SURVEILLANCE_SYSTEM("JSS (Joint Surveillance System)"),
  @XmlEnumValue("JTIDS/MIDS (Joint Tactical Information Distribution System)")
  JTIDS_MIDS_JOINT_TACTICAL_INFORMATION_DISTRIBUTION_SYSTEM("JTIDS/MIDS (Joint Tactical Information Distribution System)"),
  @XmlEnumValue("LAND WARRIOR")
  LAND_WARRIOR("LAND WARRIOR"),
  @XmlEnumValue("LAW ENFORCEMENT")
  LAW_ENFORCEMENT("LAW ENFORCEMENT"),
  @XmlEnumValue("LEASAT (Leased Satellite)")
  LEASAT_LEASED_SATELLITE("LEASAT (Leased Satellite)"),
  LINEBACKER("LINEBACKER"),
  @XmlEnumValue("LLDR (Lightweight Laser Designator Rangefinder)")
  LLDR_LIGHTWEIGHT_LASER_DESIGNATOR_RANGEFINDER("LLDR (Lightweight Laser Designator Rangefinder)"),
  @XmlEnumValue("LMRDFS (Light Man-portable Radio Direction Finding System)")
  LMRDFS_LIGHT_MAN_PORTABLE_RADIO_DIRECTION_FINDING_SYSTEM("LMRDFS (Light Man-portable Radio Direction Finding System)"),
  @XmlEnumValue("LOCAL CONTROL")
  LOCAL_CONTROL("LOCAL CONTROL"),
  @XmlEnumValue("LOCKS AND DAMS")
  LOCKS_AND_DAMS("LOCKS AND DAMS"),
  @XmlEnumValue("LONGBOW (Apache Helicopter)")
  LONGBOW_APACHE_HELICOPTER("LONGBOW (Apache Helicopter)"),
  @XmlEnumValue("LOOTING PREVENTION")
  LOOTING_PREVENTION("LOOTING PREVENTION"),
  @XmlEnumValue("M93A1 FOX")
  M_93_A_1_FOX("M93A1 FOX"),
  MAINTENANCE("MAINTENANCE"),
  @XmlEnumValue("MARS (Military Affiliated Radio System)")
  MARS_MILITARY_AFFILIATED_RADIO_SYSTEM("MARS (Military Affiliated Radio System)"),
  MEDICAL("MEDICAL"),
  METEOROLOGICAL("METEOROLOGICAL"),
  @XmlEnumValue("MFCS (Mortar Fire control System)")
  MFCS_MORTAR_FIRE_CONTROL_SYSTEM("MFCS (Mortar Fire control System)"),
  MICROWAVE("MICROWAVE"),
  @XmlEnumValue("MICROWAVE DATA LINK")
  MICROWAVE_DATA_LINK("MICROWAVE DATA LINK"),
  @XmlEnumValue("MILITARY POLICE")
  MILITARY_POLICE("MILITARY POLICE"),
  @XmlEnumValue("MILSTAR (Military Strategic and Tactical Relay System)")
  MILSTAR_MILITARY_STRATEGIC_AND_TACTICAL_RELAY_SYSTEM("MILSTAR (Military Strategic and Tactical Relay System)"),
  @XmlEnumValue("MISC (Miscellaneous)")
  MISC_MISCELLANEOUS("MISC (Miscellaneous)"),
  MISSILE("MISSILE"),
  @XmlEnumValue("MITT/DTES (Mobile Integrated Tactical Terminal/Distributed Common Ground System Test and Evaluation Strategy)")
  MITT_DTES_MOBILE_INTEGRATED_TACTICAL_TERMINAL_DISTRIBUTED_COMMON_GROUND_SYSTEM_TEST_AND_EVALUATION_STRATEGY("MITT/DTES (Mobile Integrated Tactical Terminal/Distributed Common Ground System Test and Evaluation Strategy)"),
  @XmlEnumValue("MLRS (Multiple Launch Rocket System)")
  MLRS_MULTIPLE_LAUNCH_ROCKET_SYSTEM("MLRS (Multiple Launch Rocket System)"),
  @XmlEnumValue("MLS (Microwave Landing System)")
  MLS_MICROWAVE_LANDING_SYSTEM("MLS (Microwave Landing System)"),
  @XmlEnumValue("MOBILE TELEPHONE")
  MOBILE_TELEPHONE("MOBILE TELEPHONE"),
  @XmlEnumValue("MOMS (Man on the Move System)")
  MOMS_MAN_ON_THE_MOVE_SYSTEM("MOMS (Man on the Move System)"),
  @XmlEnumValue("MOTOR POOL")
  MOTOR_POOL("MOTOR POOL"),
  @XmlEnumValue("MSE (Mobile Subscriber Equipment)")
  MSE_MOBILE_SUBSCRIBER_EQUIPMENT("MSE (Mobile Subscriber Equipment)"),
  @XmlEnumValue("MTS (Movement Tracking System)")
  MTS_MOVEMENT_TRACKING_SYSTEM("MTS (Movement Tracking System)"),
  MUNITIONS("MUNITIONS"),
  @XmlEnumValue("MUTUAL AID")
  MUTUAL_AID("MUTUAL AID"),
  @XmlEnumValue("MYSTIC STAR")
  MYSTIC_STAR("MYSTIC STAR"),
  @XmlEnumValue("NAOC (National Airborne Operations Center)")
  NAOC_NATIONAL_AIRBORNE_OPERATIONS_CENTER("NAOC (National Airborne Operations Center)"),
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
  NCIS_NAVAL_CRIMINAL_INVESTIGATIVE_SERVICE("NCIS (Naval Criminal Investigative Service)"),
  NDB("NDB"),
  @XmlEnumValue("NERON (NOAA Environmental Real-Time Observation Network)")
  NERON_NOAA_ENVIRONMENTAL_REAL_TIME_OBSERVATION_NETWORK("NERON (NOAA Environmental Real-Time Observation Network)"),
  NEXRAD("NEXRAD"),
  @XmlEnumValue("NOAA WEATHER RADIO")
  NOAA_WEATHER_RADIO("NOAA WEATHER RADIO"),
  @XmlEnumValue("NOAA WEATHER RADIO LINK")
  NOAA_WEATHER_RADIO_LINK("NOAA WEATHER RADIO LINK"),
  @XmlEnumValue("NORAD (North American Air defense Command)")
  NORAD_NORTH_AMERICAN_AIR_DEFENSE_COMMAND("NORAD (North American Air defense Command)"),
  @XmlEnumValue("NTDR (Near Term Digital Radio)")
  NTDR_NEAR_TERM_DIGITAL_RADIO("NTDR (Near Term Digital Radio)"),
  @XmlEnumValue("OCCS SUPPORT")
  OCCS_SUPPORT("OCCS SUPPORT"),
  @XmlEnumValue("OPERATION ALLIANCE")
  OPERATION_ALLIANCE("OPERATION ALLIANCE"),
  @XmlEnumValue("OSI (Office of Special Investigation)")
  OSI_OFFICE_OF_SPECIAL_INVESTIGATION("OSI (Office of Special Investigation)"),
  @XmlEnumValue("OTHER OPERATIONS")
  OTHER_OPERATIONS("OTHER OPERATIONS"),
  @XmlEnumValue("OTHR/ROTHR (Over-the-Horizon Radars)")
  OTHR_ROTHR_OVER_THE_HORIZON_RADARS("OTHR/ROTHR (Over-the-Horizon Radars)"),
  PAGING("PAGING"),
  @XmlEnumValue("PAR (Precision Approach Radar)")
  PAR_PRECISION_APPROACH_RADAR("PAR (Precision Approach Radar)"),
  PATRIOT("PATRIOT"),
  @XmlEnumValue("PAVE PAWS (Precision Acquisition Vehicle Entry Phased Array Warning System)")
  PAVE_PAWS_PRECISION_ACQUISITION_VEHICLE_ENTRY_PHASED_ARRAY_WARNING_SYSTEM("PAVE PAWS (Precision Acquisition Vehicle Entry Phased Array Warning System)"),
  @XmlEnumValue("PILOT-TO-DISPATCHER")
  PILOT_TO_DISPATCHER("PILOT-TO-DISPATCHER"),
  @XmlEnumValue("PILOT-TO-METRO")
  PILOT_TO_METRO("PILOT-TO-METRO"),
  @XmlEnumValue("PILOT-TO-PILOT")
  PILOT_TO_PILOT("PILOT-TO-PILOT"),
  @XmlEnumValue("POL (Petroleum, Oil, and Lubricants)")
  POL_PETROLEUM_OIL_AND_LUBRICANTS("POL (Petroleum, Oil, and Lubricants)"),
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
  RADAR_RADIO_DETECTION_AND_RANGING("RADAR (Radio Detection and Ranging)"),
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
  RDMS_RANGE_DATA_MANAGEMENT_SUBSYSTEM("RDMS (Range Data Management Subsystem)"),
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
  SAWDS_SATELLITE_AUTOMATED_WX_DIST_SYS("SAWDS (Satellite Automated WX Dist Sys)"),
  @XmlEnumValue("SCAMP (Single Channel Anti-Jam Manportable Terminal)")
  SCAMP_SINGLE_CHANNEL_ANTI_JAM_MANPORTABLE_TERMINAL("SCAMP (Single Channel Anti-Jam Manportable Terminal)"),
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
  SENTINEL_AN_MPQ_64_SURVEILLANCE_RADAR("SENTINEL (AN/MPQ-64 Surveillance Radar)"),
  @XmlEnumValue("SGLS (Space Ground Link Subsystem) (Telemetry)")
  SGLS_SPACE_GROUND_LINK_SUBSYSTEM_TELEMETRY("SGLS (Space Ground Link Subsystem) (Telemetry)"),
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
  SINCGARS_SINGLE_CHANNEL_GROUND_AND_AIRBORNE_RADIO_SYSTEM("SINCGARS (Single Channel Ground and Airborne Radio System)"),
  @XmlEnumValue("SINCGARS-ASIP (Single Channel Ground and Airborne Radio System-Advanced System Improvement Plan)")
  SINCGARS_ASIP_SINGLE_CHANNEL_GROUND_AND_AIRBORNE_RADIO_SYSTEM_ADVANCED_SYSTEM_IMPROVEMENT_PLAN("SINCGARS-ASIP (Single Channel Ground and Airborne Radio System-Advanced System Improvement Plan)"),
  @XmlEnumValue("SNOW REMOVAL")
  SNOW_REMOVAL("SNOW REMOVAL"),
  @XmlEnumValue("SOF (Supervisor of Flying)")
  SOF_SUPERVISOR_OF_FLYING("SOF (Supervisor of Flying)"),
  SONOBUOY("SONOBUOY"),
  @XmlEnumValue("SORT (Special Operations Response Team)")
  SORT_SPECIAL_OPERATIONS_RESPONSE_TEAM("SORT (Special Operations Response Team)"),
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
  SPITFIRE_SPITFIRE_MANPACK_UHF_SATCOM_DAMA_TERMINAL("SPITFIRE (SPITFIRE Manpack UHF SATCOM DAMA Terminal)"),
  @XmlEnumValue("SQUADRON/WING COMMON")
  SQUADRON_WING_COMMON("SQUADRON/WING COMMON"),
  @XmlEnumValue("STRIKER II (Advanced Fire Support/Scout/Surveillance System)")
  STRIKER_II_ADVANCED_FIRE_SUPPORT_SCOUT_SURVEILLANCE_SYSTEM("STRIKER II (Advanced Fire Support/Scout/Surveillance System)"),
  @XmlEnumValue("SUPPLY AND LOGISTICS")
  SUPPLY_AND_LOGISTICS("SUPPLY AND LOGISTICS"),
  @XmlEnumValue("SURFACE NAVAIDS")
  SURFACE_NAVAIDS("SURFACE NAVAIDS"),
  @XmlEnumValue("SURVEILLANCE SYSTEMS")
  SURVEILLANCE_SYSTEMS("SURVEILLANCE SYSTEMS"),
  @XmlEnumValue("SURVEILLANCE/ RECONNAISSANCE")
  SURVEILLANCE_RECONNAISSANCE("SURVEILLANCE/ RECONNAISSANCE"),
  SURVEY("SURVEY"),
  @XmlEnumValue("SUSTAINING OPERATIONS")
  SUSTAINING_OPERATIONS("SUSTAINING OPERATIONS"),
  @XmlEnumValue("TACAN (Tactical Air Navigation)")
  TACAN_TACTICAL_AIR_NAVIGATION("TACAN (Tactical Air Navigation)"),
  @XmlEnumValue("TACCS (Tactical Army Combat Service Support Computer System)")
  TACCS_TACTICAL_ARMY_COMBAT_SERVICE_SUPPORT_COMPUTER_SYSTEM("TACCS (Tactical Army Combat Service Support Computer System)"),
  @XmlEnumValue("TACJAM (Tactical Communications Jamming System)")
  TACJAM_TACTICAL_COMMUNICATIONS_JAMMING_SYSTEM("TACJAM (Tactical Communications Jamming System)"),
  @XmlEnumValue("TACTS (Tactical Trunk Signaling)")
  TACTS_TACTICAL_TRUNK_SIGNALING("TACTS (Tactical Trunk Signaling)"),
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
  TCAS_TRAFFIC_COLLISION_AVOIDANCE_SYSTEM("TCAS (Traffic Collision Avoidance System)"),
  @XmlEnumValue("TCRS (Target Control System)")
  TCRS_TARGET_CONTROL_SYSTEM("TCRS (Target Control System)"),
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
  TMGS_TRANSPORTABLE_MOBILE_GROUND_SUBSYSTEMS("TMGS (Transportable mobile ground subsystems)"),
  @XmlEnumValue("TOSS (TV Ordnance Scoring System)")
  TOSS_TV_ORDNANCE_SCORING_SYSTEM("TOSS (TV Ordnance Scoring System)"),
  TOWER("TOWER"),
  TRACKWOLF("TRACKWOLF"),
  @XmlEnumValue("TRAILBLAZER (Ground Based Communications Intelligence System)")
  TRAILBLAZER_GROUND_BASED_COMMUNICATIONS_INTELLIGENCE_SYSTEM("TRAILBLAZER (Ground Based Communications Intelligence System)"),
  TRAINING("TRAINING"),
  TRANSPORTATION("TRANSPORTATION"),
  @XmlEnumValue("TROJAN SPIRIT")
  TROJAN_SPIRIT("TROJAN SPIRIT"),
  TRUNKING("TRUNKING"),
  TSU("TSU"),
  @XmlEnumValue("UAV (Unmanned Aerial Vehicle)")
  UAV_UNMANNED_AERIAL_VEHICLE("UAV (Unmanned Aerial Vehicle)"),
  @XmlEnumValue("UNLICENSED DEVICE")
  UNLICENSED_DEVICE("UNLICENSED DEVICE"),
  UTILITIES("UTILITIES"),
  @XmlEnumValue("VOR (Very High Frequency Omnidirectional Range)")
  VOR_VERY_HIGH_FREQUENCY_OMNIDIRECTIONAL_RANGE("VOR (Very High Frequency Omnidirectional Range)"),
  @XmlEnumValue("VORTAC (VHF Omni-range TACAN)")
  VORTAC_VHF_OMNI_RANGE_TACAN("VORTAC (VHF Omni-range TACAN)"),
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
  WHCA_WHITE_HOUSE_COMMUNICATIONS_AGENCY("WHCA (White House Communications Agency)"),
  @XmlEnumValue("WIDEBAND GLOBAL SATCOM")
  WIDEBAND_GLOBAL_SATCOM("WIDEBAND GLOBAL SATCOM"),
  @XmlEnumValue("WILDLIFE PRESERVATION")
  WILDLIFE_PRESERVATION("WILDLIFE PRESERVATION"),
  @XmlEnumValue("WIND PROFILER")
  WIND_PROFILER("WIND PROFILER"),
  @XmlEnumValue("WIN-T (Warfighter Information Network-Tactical)")
  WIN_T_WARFIGHTER_INFORMATION_NETWORK_TACTICAL("WIN-T (Warfighter Information Network-Tactical)"),
  @XmlEnumValue("WIRELESS LOCAL AREA NETWORK")
  WIRELESS_LOCAL_AREA_NETWORK("WIRELESS LOCAL AREA NETWORK"),
  @XmlEnumValue("WIRELESS MIKE")
  WIRELESS_MIKE("WIRELESS MIKE"),
  @XmlEnumValue("WOLVERINE (Assault Bridge)")
  WOLVERINE_ASSAULT_BRIDGE("WOLVERINE (Assault Bridge)");
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
