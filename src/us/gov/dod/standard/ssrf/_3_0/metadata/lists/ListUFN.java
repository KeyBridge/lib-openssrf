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
 * Java class for ListUFN.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListUFN"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S150"> &lt;enumeration
 * value="UNKNOWN"/> &lt;enumeration value="A2C2S (Army Airborne Command &amp;
 * Control System)"/> &lt;enumeration value="ACS (Aerial Common Sensor)"/>
 * &lt;enumeration value="ADMINISTRATIVE"/> &lt;enumeration value="AEGIS"/>
 * &lt;enumeration value="A-EPLRS"/> &lt;enumeration value="AERO CLUB"/>
 * &lt;enumeration value="AFATDS"/> &lt;enumeration value="AFAUX/CAP (Air Force
 * Auxiliary/Civil Air Patrol)"/> &lt;enumeration value="AFSATCOM"/>
 * &lt;enumeration value="AHFEWS (Army HF EW System)"/> &lt;enumeration
 * value="AIR DEFENSE"/> &lt;enumeration value="AIR DEFENSE WARNING"/>
 * &lt;enumeration value="AIR DEFENSE/INTERCEPT"/> &lt;enumeration value="AIR
 * FORCE ONE"/> &lt;enumeration value="AIR FORCE SPECIAL OPERATIONS"/>
 * &lt;enumeration value="AIR OPERATIONS"/> &lt;enumeration value="AIR ROUTE
 * SURVEILLANCE RADAR"/> &lt;enumeration value="AIR TRAFFIC CONTROL"/>
 * &lt;enumeration value="AIR/AIR COMMUNICATIONS"/> &lt;enumeration
 * value="AIR/GROUND/AIR COMMUNICATIONS"/> &lt;enumeration value="AIRBORNE
 * COMMAND CENTER"/> &lt;enumeration value="AIRCRAFT"/> &lt;enumeration
 * value="AIRPORT SURVEILLANCE RADAR"/> &lt;enumeration value="ALARM SYSTEMS"/>
 * &lt;enumeration value="AMPS (Air Movement Planning System)"/> &lt;enumeration
 * value="AMSS (Automatic Meteorological Sensor System)"/> &lt;enumeration
 * value="ANTI-TERRORISM"/> &lt;enumeration value="APPROACH CONTROL"/>
 * &lt;enumeration value="AQF (Advanced Quick Fix)"/> &lt;enumeration value="ARL
 * (Aerial Reconnaissance-Low)"/> &lt;enumeration value="ARMY AVIATION"/>
 * &lt;enumeration value="ARMY SPECIAL OPERATIONS"/> &lt;enumeration
 * value="ARTILLERY"/> &lt;enumeration value="ARTS (Automated Remote Tracking
 * System) (Telemetry)"/> &lt;enumeration value="ASAS (All Source Analysis
 * System)"/> &lt;enumeration value="ASOS (Automated Surface Observation
 * System)"/> &lt;enumeration value="ASW (Anti-Submarine Warfare)"/>
 * &lt;enumeration value="ATFP"/> &lt;enumeration value="ATIS (Auto Terminal
 * Information Service)"/> &lt;enumeration value="AVENGER-STC"/> &lt;enumeration
 * value="AWACS"/> &lt;enumeration value="AWOS (Automatic Weather Observing
 * System)"/> &lt;enumeration value="BACKBONE"/> &lt;enumeration value="BASE
 * OPERATIONS"/> &lt;enumeration value="BATTLE COMMAND"/> &lt;enumeration
 * value="BEACON"/> &lt;enumeration value="BLUE ANGELS"/> &lt;enumeration
 * value="BMDS (Ballistic Missile Defense System)"/> &lt;enumeration
 * value="BMEWS (Ballistic Missile Early Warning System)"/> &lt;enumeration
 * value="BROADCAST"/> &lt;enumeration value="C3 (Command, Control, &amp;
 * Communications)"/> &lt;enumeration value="CARS (Contingency Airborne
 * Reconnaissance System)"/> &lt;enumeration value="CAVALRY"/> &lt;enumeration
 * value="CBR (Chemical, Biological, Radiological)"/> &lt;enumeration
 * value="CID"/> &lt;enumeration value="CIVIL AFFAIRS"/> &lt;enumeration
 * value="CIVIL DISTURBANCES"/> &lt;enumeration value="CIVIL ENGINEERING"/>
 * &lt;enumeration value="CIVIL SUPPORT TEAM"/> &lt;enumeration value="CIVIL
 * WORKS"/> &lt;enumeration value="CIWS (Close-In Weapons System)"/>
 * &lt;enumeration value="CLEARANCE DELIVERY"/> &lt;enumeration value="CLOSE AIR
 * SUPPORT (CAS)"/> &lt;enumeration value="COG/COOP"/> &lt;enumeration
 * value="COLOR/HONOR GUARD"/> &lt;enumeration value="COMBAT CONTROL TEAM"/>
 * &lt;enumeration value="COMBATANT COMMAND/GENERAL OFFICER SUPPORT"/>
 * &lt;enumeration value="COMMAND AND CONTROL"/> &lt;enumeration value="COMMAND
 * DESTRUCT/TERMINATION"/> &lt;enumeration value="COMMAND NET"/> &lt;enumeration
 * value="COMMAND POST"/> &lt;enumeration value="COMMAND POST/CENTER"/>
 * &lt;enumeration value="COMMANDER"/> &lt;enumeration value="COMMUNICATIONS"/>
 * &lt;enumeration value="COMMUNITY ASSISTANCE"/> &lt;enumeration
 * value="CONSEQUENCE MANAGEMENT"/> &lt;enumeration value="CONSERVATION"/>
 * &lt;enumeration value="CONSTRUCTION"/> &lt;enumeration value="CONTINGENCY"/>
 * &lt;enumeration value="COUNTER DRUG"/> &lt;enumeration value="CSSCS (Combat
 * Service Support Control System)"/> &lt;enumeration value="CTT (Commander’s
 * Tactical Terminal)"/> &lt;enumeration value="DATA COLLECTION PLATFORM"/>
 * &lt;enumeration value="DATA LINK"/> &lt;enumeration value="DBRITE (Digital
 * Bright Radar Indicator Tower Equipment)"/> &lt;enumeration value="DEPARTURE
 * CONTROL"/> &lt;enumeration value="DIS (Defense Investigative Service)"/>
 * &lt;enumeration value="DISASTER PLANNING"/> &lt;enumeration value="DMSP
 * (Defense Meteorological Satellite Program)"/> &lt;enumeration value="DOMESTIC
 * SUPPORT OPERATIONS"/> &lt;enumeration value="DRONE CONTROL"/> &lt;enumeration
 * value="DSCS (Defense Satellite Communication System)"/> &lt;enumeration
 * value="DTSS (Digital Topographic Support System)"/> &lt;enumeration
 * value="EDUCATION"/> &lt;enumeration value="ELECTRONIC WARFARE"/>
 * &lt;enumeration value="EMERGENCY SERVICES"/> &lt;enumeration value="EMWIN"/>
 * &lt;enumeration value="ENGINEERS"/> &lt;enumeration value="ENVIRONMENTAL"/>
 * &lt;enumeration value="ENVIRONMENTAL CLEANUP"/> &lt;enumeration value="EOD
 * (Emergency Ordinance Disposal)"/> &lt;enumeration value="EPLRS (Enhanced
 * Position Location Reporting System)"/> &lt;enumeration value="EQUIPMENT
 * CHECKS"/> &lt;enumeration value="ERCS (Emergency Rocket Communications
 * Systems)"/> &lt;enumeration value="ETCAS (Enhanced Traffic Collision
 * Avoidance System)"/> &lt;enumeration value="ETRAC (Enhanced Tactical Radar
 * Correlator)"/> &lt;enumeration value="EXECUTIVE"/> &lt;enumeration
 * value="EXERCISE"/> &lt;enumeration value="EXPERIMENTAL"/> &lt;enumeration
 * value="FAADC2 (Forward Area Air Defense, Command and Control)"/>
 * &lt;enumeration value="FEEDER CONTROL"/> &lt;enumeration value="FEMA (Federal
 * Emergency Mgt Agency)"/> &lt;enumeration value="FIRE"/> &lt;enumeration
 * value="FIRE ALARM"/> &lt;enumeration value="FIRE SUPPORT"/> &lt;enumeration
 * value="FLEET SUPPORT"/> &lt;enumeration value="FLIGHT FOLLOWING"/>
 * &lt;enumeration value="FLIGHT INSPECTION"/> &lt;enumeration value="FLIGHT
 * TEST"/> &lt;enumeration value="FLOOD WARNING SYSTEM"/> &lt;enumeration
 * value="FLTSATCOM (Fleet Satellite Communications)"/> &lt;enumeration
 * value="FORACS (Fleet Operational Readiness Accuracy Check Site)"/>
 * &lt;enumeration value="FORWARD AIR CONTROL POST"/> &lt;enumeration
 * value="GBCS-L (Ground Based Common Sensor-Light)"/> &lt;enumeration
 * value="GBS (Global Broadcast System)"/> &lt;enumeration value="GCA (Ground
 * Control Approach)"/> &lt;enumeration value="GCCS (Global Command and Control
 * System-Army)"/> &lt;enumeration value="GLOBAL"/> &lt;enumeration
 * value="GLOBAL ALE (Automatic Link Establishment)"/> &lt;enumeration
 * value="GLOBAL BLACK"/> &lt;enumeration value="GLOBAL DISCRETE"/>
 * &lt;enumeration value="GLOBAL RED"/> &lt;enumeration value="GMD (Ground
 * Missile Defense)"/> &lt;enumeration value="GOES (Geostationary Operational
 * Environmental Satellites)"/> &lt;enumeration value="GOLDEN KNIGHTS"/>
 * &lt;enumeration value="GPS (Global Positioning System)"/> &lt;enumeration
 * value="GRCS (Guardrail Common Sensor)"/> &lt;enumeration value="GRIZZLY (M1
 * Bleacher MineSweeper)"/> &lt;enumeration value="GROUND CONTROL"/>
 * &lt;enumeration value="GROUND INTERDICTION"/> &lt;enumeration value="GROUND
 * OPERATIONS"/> &lt;enumeration value="GSR (Ground Surveillance Radar)"/>
 * &lt;enumeration value="HAARP (High Frequency Active Auroral Research
 * Program)"/> &lt;enumeration value="HARBOR-PORT OPERATIONS"/> &lt;enumeration
 * value="HAVE QUICK"/> &lt;enumeration value="HAZARDOUS MATERIAL RELEASE"/>
 * &lt;enumeration value="HAZMAT (Hazardous Materials)"/> &lt;enumeration
 * value="HELO CONTROL"/> &lt;enumeration value="HICOM (High Command)"/>
 * &lt;enumeration value="HYDRA (Hierarchical Yet Dynamically Reprogrammable
 * Architecture)"/> &lt;enumeration value="HYDROLOGIC"/> &lt;enumeration
 * value="IEWCS (Intelligence Electronic Warfare Common Sensor)"/>
 * &lt;enumeration value="IFF/SIF"/> &lt;enumeration value="ILS (Instrument
 * Landing System)"/> &lt;enumeration value="IMETS (Integrated Meteorological
 * System)"/> &lt;enumeration value="INDUSTRIAL CONTROLS"/> &lt;enumeration
 * value="INFANTRY"/> &lt;enumeration value="INSPECTION"/> &lt;enumeration
 * value="INSTALLATION PA SYSTEM (Giant Voice)"/> &lt;enumeration
 * value="INSTRUCTOR/STUDENT TRAINING"/> &lt;enumeration value="INTELLIGENCE"/>
 * &lt;enumeration value="INTERPLANE"/> &lt;enumeration
 * value="INVENTORY/INVENTORY CONTROLS (e.g., Optical Scanners)"/>
 * &lt;enumeration value="IONOSPHERIC SOUNDER"/> &lt;enumeration
 * value="I-REMBASS (Improved-Remotely Monitored Battlefield Sensor System)"/>
 * &lt;enumeration value="ISYSCON (Integrated System Control)"/> &lt;enumeration
 * value="JSS (Joint Surveillance System)"/> &lt;enumeration value="JTIDS/MIDS
 * (Joint Tactical Information Distribution System)"/> &lt;enumeration
 * value="LAND WARRIOR"/> &lt;enumeration value="LAW ENFORCEMENT"/>
 * &lt;enumeration value="LEASAT (Leased Satellite)"/> &lt;enumeration
 * value="LINEBACKER"/> &lt;enumeration value="LLDR (Lightweight Laser
 * Designator Rangefinder)"/> &lt;enumeration value="LMRDFS (Light Man-portable
 * Radio Direction Finding System)"/> &lt;enumeration value="LOCAL CONTROL"/>
 * &lt;enumeration value="LOCKS AND DAMS"/> &lt;enumeration value="LONGBOW
 * (Apache Helicopter)"/> &lt;enumeration value="LOOTING PREVENTION"/>
 * &lt;enumeration value="M93A1 FOX"/> &lt;enumeration value="MAINTENANCE"/>
 * &lt;enumeration value="MARS (Military Affiliated Radio System)"/>
 * &lt;enumeration value="MEDICAL"/> &lt;enumeration value="METEOROLOGICAL"/>
 * &lt;enumeration value="MFCS (Mortar Fire control System)"/> &lt;enumeration
 * value="MICROWAVE"/> &lt;enumeration value="MICROWAVE DATA LINK"/>
 * &lt;enumeration value="MILITARY POLICE"/> &lt;enumeration value="MILSTAR
 * (Military Strategic and Tactical Relay System)"/> &lt;enumeration value="MISC
 * (Miscellaneous)"/> &lt;enumeration value="MISSILE"/> &lt;enumeration
 * value="MITT/DTES (Mobile Integrated Tactical Terminal/Distributed Common
 * Ground System Test and Evaluation Strategy)"/> &lt;enumeration value="MLRS
 * (Multiple Launch Rocket System)"/> &lt;enumeration value="MLS (Microwave
 * Landing System)"/> &lt;enumeration value="MOBILE TELEPHONE"/> &lt;enumeration
 * value="MOMS (Man on the Move System)"/> &lt;enumeration value="MOTOR POOL"/>
 * &lt;enumeration value="MSE (Mobile Subscriber Equipment)"/> &lt;enumeration
 * value="MTS (Movement Tracking System)"/> &lt;enumeration value="MUNITIONS"/>
 * &lt;enumeration value="MUTUAL AID"/> &lt;enumeration value="MYSTIC STAR"/>
 * &lt;enumeration value="NAOC (National Airborne Operations Center)"/>
 * &lt;enumeration value="NASA"/> &lt;enumeration value="NATURAL RESOURCES"/>
 * &lt;enumeration value="NAVAIDS"/> &lt;enumeration value="NAVAIDS CONTROLS"/>
 * &lt;enumeration value="NAVAL GUNFIRE SUPPORT"/> &lt;enumeration
 * value="NAVIGATION RADAR"/> &lt;enumeration value="NAVY SPECIAL OPERATIONS"/>
 * &lt;enumeration value="NCIS (Naval Criminal Investigative Service)"/>
 * &lt;enumeration value="NDB"/> &lt;enumeration value="NERON (NOAA
 * Environmental Real-Time Observation Network)"/> &lt;enumeration
 * value="NEXRAD"/> &lt;enumeration value="NOAA WEATHER RADIO"/> &lt;enumeration
 * value="NOAA WEATHER RADIO LINK"/> &lt;enumeration value="NORAD (North
 * American Air defense Command)"/> &lt;enumeration value="NTDR (Near Term
 * Digital Radio)"/> &lt;enumeration value="OCCS SUPPORT"/> &lt;enumeration
 * value="OPERATION ALLIANCE"/> &lt;enumeration value="OSI (Office of Special
 * Investigation)"/> &lt;enumeration value="OTHER OPERATIONS"/> &lt;enumeration
 * value="OTHR/ROTHR (Over-the-Horizon Radars)"/> &lt;enumeration
 * value="PAGING"/> &lt;enumeration value="PAR (Precision Approach Radar)"/>
 * &lt;enumeration value="PATRIOT"/> &lt;enumeration value="PAVE PAWS (Precision
 * Acquisition Vehicle Entry Phased Array Warning System)"/> &lt;enumeration
 * value="PILOT-TO-DISPATCHER"/> &lt;enumeration value="PILOT-TO-METRO"/>
 * &lt;enumeration value="PILOT-TO-PILOT"/> &lt;enumeration value="POL
 * (Petroleum, Oil, and Lubricants)"/> &lt;enumeration value="POSTAL
 * OPERATIONS"/> &lt;enumeration value="PRIME BEEF"/> &lt;enumeration
 * value="PRISON BUS"/> &lt;enumeration value="PROJECT COTHEN"/> &lt;enumeration
 * value="PSYCHOLOGICAL OPERATIONS"/> &lt;enumeration value="PUBLIC WORKS"/>
 * &lt;enumeration value="RADAR (Radio Detection and Ranging)"/> &lt;enumeration
 * value="RADIO RELAY"/> &lt;enumeration value="RADIOLOCATION"/> &lt;enumeration
 * value="RADIOSONDE"/> &lt;enumeration value="RAMP CONTROL"/> &lt;enumeration
 * value="RANGE CONTROL"/> &lt;enumeration value="RANGE OPERATIONS"/>
 * &lt;enumeration value="RANGER UNITS"/> &lt;enumeration value="RDMS (Range
 * Data Management Subsystem)"/> &lt;enumeration value="RDTE SUPPORT"/>
 * &lt;enumeration value="RED HORSE"/> &lt;enumeration value="REFUELING"/>
 * &lt;enumeration value="REMOTE BARRIER CONTROL SYSTEMS"/> &lt;enumeration
 * value="REMOTE CONTROL CRANE"/> &lt;enumeration value="RESOURCES
 * CONSERVATION"/> &lt;enumeration value="RESUPPLY"/> &lt;enumeration value="RF
 * TAGS"/> &lt;enumeration value="RUNWAY ICE DETECTION SYSTEMS"/>
 * &lt;enumeration value="RUNWAY LIGHTING CONTROL"/> &lt;enumeration
 * value="SAFETY"/> &lt;enumeration value="SATELLITE COMMUNICATIONS"/>
 * &lt;enumeration value="SAWDS (Satellite Automated WX Dist Sys)"/>
 * &lt;enumeration value="SCAMP (Single Channel Anti-Jam Manportable
 * Terminal)"/> &lt;enumeration value="SCOPE SHIELD"/> &lt;enumeration
 * value="SEA OPERATIONS"/> &lt;enumeration value="SEABEES"/> &lt;enumeration
 * value="SEARCH AND RESCUE"/> &lt;enumeration value="SECURITY FORCE"/>
 * &lt;enumeration value="SEISMIC"/> &lt;enumeration value="SENTINEL (AN/MPQ-64
 * Surveillance Radar)"/> &lt;enumeration value="SGLS (Space Ground Link
 * Subsystem) (Telemetry)"/> &lt;enumeration value="SHIP/AIR OPERATIONS"/>
 * &lt;enumeration value="SHIP/SHIP"/> &lt;enumeration value="SHIP/SHORE
 * OPERATIONS"/> &lt;enumeration value="SHIPYARD"/> &lt;enumeration value="SHORE
 * PATROL"/> &lt;enumeration value="SHORT TERM INCIDENT RESPONSE"/>
 * &lt;enumeration value="SHUTTLE"/> &lt;enumeration value="SIMULATOR"/>
 * &lt;enumeration value="SINCGARS (Single Channel Ground and Airborne Radio
 * System)"/> &lt;enumeration value="SINCGARS-ASIP (Single Channel Ground and
 * Airborne Radio System-Advanced System Improvement Plan)"/> &lt;enumeration
 * value="SNOW REMOVAL"/> &lt;enumeration value="SOF (Supervisor of Flying)"/>
 * &lt;enumeration value="SONOBUOY"/> &lt;enumeration value="SORT (Special
 * Operations Response Team)"/> &lt;enumeration value="SPACE OPERATIONS"/>
 * &lt;enumeration value="SPECIAL COURIER"/> &lt;enumeration value="SPECIAL
 * FORCES"/> &lt;enumeration value="SPECIAL OPERATIONS"/> &lt;enumeration
 * value="SPECIAL PROJECTS"/> &lt;enumeration value="SPECIAL SECURITY
 * OPERATIONS"/> &lt;enumeration value="SPEED MEASUREMENT SYSTEMS"/>
 * &lt;enumeration value="SPITFIRE (SPITFIRE Manpack UHF SATCOM DAMA
 * Terminal)"/> &lt;enumeration value="SQUADRON/WING COMMON"/> &lt;enumeration
 * value="STRIKER II (Advanced Fire Support/Scout/Surveillance System)"/>
 * &lt;enumeration value="SUPPLY AND LOGISTICS"/> &lt;enumeration value="SURFACE
 * NAVAIDS"/> &lt;enumeration value="SURVEILLANCE SYSTEMS"/> &lt;enumeration
 * value="SURVEILLANCE/ RECONNAISSANCE"/> &lt;enumeration value="SURVEY"/>
 * &lt;enumeration value="SUSTAINING OPERATIONS"/> &lt;enumeration value="TACAN
 * (Tactical Air Navigation)"/> &lt;enumeration value="TACCS (Tactical Army
 * Combat Service Support Computer System)"/> &lt;enumeration value="TACJAM
 * (Tactical Communications Jamming System)"/> &lt;enumeration value="TACTS
 * (Tactical Trunk Signaling)"/> &lt;enumeration value="TADIL-A"/>
 * &lt;enumeration value="TADIL-C"/> &lt;enumeration value="TARGET"/>
 * &lt;enumeration value="TARGET ACQUISITION"/> &lt;enumeration value="TARGET
 * SCORING"/> &lt;enumeration value="TAXI"/> &lt;enumeration value="TCAS
 * (Traffic Collision Avoidance System)"/> &lt;enumeration value="TCRS (Target
 * Control System)"/> &lt;enumeration value="TEAMMATE"/> &lt;enumeration
 * value="TECHNICAL ESCORT UNIT"/> &lt;enumeration value="TELECOMMAND"/>
 * &lt;enumeration value="TELEMETRY"/> &lt;enumeration value="TEST AND
 * MEASUREMENT"/> &lt;enumeration value="TEST RANGE"/> &lt;enumeration
 * value="TEST RANGE TIMING"/> &lt;enumeration value="TETHERED AREOSTAT RADAR"/>
 * &lt;enumeration value="THUNDERBIRDS"/> &lt;enumeration value="TIS or
 * TRAVELERS INFORMATION SYSTEM"/> &lt;enumeration value="TMGS (Transportable
 * mobile ground subsystems)"/> &lt;enumeration value="TOSS (TV Ordnance Scoring
 * System)"/> &lt;enumeration value="TOWER"/> &lt;enumeration
 * value="TRACKWOLF"/> &lt;enumeration value="TRAILBLAZER (Ground Based
 * Communications Intelligence System)"/> &lt;enumeration value="TRAINING"/>
 * &lt;enumeration value="TRANSPORTATION"/> &lt;enumeration value="TROJAN
 * SPIRIT"/> &lt;enumeration value="TRUNKING"/> &lt;enumeration value="TSU"/>
 * &lt;enumeration value="UAV (Unmanned Aerial Vehicle)"/> &lt;enumeration
 * value="UNLICENSED DEVICE"/> &lt;enumeration value="UTILITIES"/>
 * &lt;enumeration value="VOR (Very High Frequency Omnidirectional Range)"/>
 * &lt;enumeration value="VORTAC (VHF Omni-range TACAN)"/> &lt;enumeration
 * value="WARNING SYSTEM"/> &lt;enumeration value="WEAPON SYSTEMS"/>
 * &lt;enumeration value="WEAPONS STORAGE PROTECTION"/> &lt;enumeration
 * value="WEATHER"/> &lt;enumeration value="WEATHER RADAR"/> &lt;enumeration
 * value="WHCA (White House Communications Agency)"/> &lt;enumeration
 * value="WIDEBAND GLOBAL SATCOM"/> &lt;enumeration value="WILDLIFE
 * PRESERVATION"/> &lt;enumeration value="WIND PROFILER"/> &lt;enumeration
 * value="WIN-T (Warfighter Information Network-Tactical)"/> &lt;enumeration
 * value="WIRELESS LOCAL AREA NETWORK"/> &lt;enumeration value="WIRELESS MIKE"/>
 * &lt;enumeration value="WOLVERINE (Assault Bridge)"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUFN")
@XmlEnum
public enum ListUFN {

  UNKNOWN("UNKNOWN"),
  @XmlEnumValue("A2C2S (Army Airborne Command & Control System)")
  A_2_C_2_S____ARMY___AIRBORNE___COMMAND_____CONTROL___SYSTEM__("A2C2S (Army Airborne Command & Control System)"),
  @XmlEnumValue("ACS (Aerial Common Sensor)")
  ACS____AERIAL___COMMON___SENSOR__("ACS (Aerial Common Sensor)"),
  ADMINISTRATIVE("ADMINISTRATIVE"),
  AEGIS("AEGIS"),
  @XmlEnumValue("A-EPLRS")
  A___EPLRS("A-EPLRS"),
  @XmlEnumValue("AERO CLUB")
  AERO___CLUB("AERO CLUB"),
  AFATDS("AFATDS"),
  @XmlEnumValue("AFAUX/CAP (Air Force Auxiliary/Civil Air Patrol)")
  AFAUX___CAP____AIR___FORCE___AUXILIARY___CIVIL___AIR___PATROL__("AFAUX/CAP (Air Force Auxiliary/Civil Air Patrol)"),
  AFSATCOM("AFSATCOM"),
  @XmlEnumValue("AHFEWS (Army HF EW System)")
  AHFEWS____ARMY___HF___EW___SYSTEM__("AHFEWS (Army HF EW System)"),
  @XmlEnumValue("AIR DEFENSE")
  AIR___DEFENSE("AIR DEFENSE"),
  @XmlEnumValue("AIR DEFENSE WARNING")
  AIR___DEFENSE___WARNING("AIR DEFENSE WARNING"),
  @XmlEnumValue("AIR DEFENSE/INTERCEPT")
  AIR___DEFENSE___INTERCEPT("AIR DEFENSE/INTERCEPT"),
  @XmlEnumValue("AIR FORCE ONE")
  AIR___FORCE___ONE("AIR FORCE ONE"),
  @XmlEnumValue("AIR FORCE SPECIAL OPERATIONS")
  AIR___FORCE___SPECIAL___OPERATIONS("AIR FORCE SPECIAL OPERATIONS"),
  @XmlEnumValue("AIR OPERATIONS")
  AIR___OPERATIONS("AIR OPERATIONS"),
  @XmlEnumValue("AIR ROUTE SURVEILLANCE RADAR")
  AIR___ROUTE___SURVEILLANCE___RADAR("AIR ROUTE SURVEILLANCE RADAR"),
  @XmlEnumValue("AIR TRAFFIC CONTROL")
  AIR___TRAFFIC___CONTROL("AIR TRAFFIC CONTROL"),
  @XmlEnumValue("AIR/AIR COMMUNICATIONS")
  AIR___AIR___COMMUNICATIONS("AIR/AIR COMMUNICATIONS"),
  @XmlEnumValue("AIR/GROUND/AIR COMMUNICATIONS")
  AIR___GROUND___AIR___COMMUNICATIONS("AIR/GROUND/AIR COMMUNICATIONS"),
  @XmlEnumValue("AIRBORNE COMMAND CENTER")
  AIRBORNE___COMMAND___CENTER("AIRBORNE COMMAND CENTER"),
  AIRCRAFT("AIRCRAFT"),
  @XmlEnumValue("AIRPORT SURVEILLANCE RADAR")
  AIRPORT___SURVEILLANCE___RADAR("AIRPORT SURVEILLANCE RADAR"),
  @XmlEnumValue("ALARM SYSTEMS")
  ALARM___SYSTEMS("ALARM SYSTEMS"),
  @XmlEnumValue("AMPS (Air Movement Planning System)")
  AMPS____AIR___MOVEMENT___PLANNING___SYSTEM__("AMPS (Air Movement Planning System)"),
  @XmlEnumValue("AMSS (Automatic Meteorological Sensor System)")
  AMSS____AUTOMATIC___METEOROLOGICAL___SENSOR___SYSTEM__("AMSS (Automatic Meteorological Sensor System)"),
  @XmlEnumValue("ANTI-TERRORISM")
  ANTI___TERRORISM("ANTI-TERRORISM"),
  @XmlEnumValue("APPROACH CONTROL")
  APPROACH___CONTROL("APPROACH CONTROL"),
  @XmlEnumValue("AQF (Advanced Quick Fix)")
  AQF____ADVANCED___QUICK___FIX__("AQF (Advanced Quick Fix)"),
  @XmlEnumValue("ARL (Aerial Reconnaissance-Low)")
  ARL____AERIAL___RECONNAISSANCE___LOW__("ARL (Aerial Reconnaissance-Low)"),
  @XmlEnumValue("ARMY AVIATION")
  ARMY___AVIATION("ARMY AVIATION"),
  @XmlEnumValue("ARMY SPECIAL OPERATIONS")
  ARMY___SPECIAL___OPERATIONS("ARMY SPECIAL OPERATIONS"),
  ARTILLERY("ARTILLERY"),
  @XmlEnumValue("ARTS (Automated Remote Tracking System) (Telemetry)")
  ARTS____AUTOMATED___REMOTE___TRACKING___SYSTEM_____TELEMETRY__("ARTS (Automated Remote Tracking System) (Telemetry)"),
  @XmlEnumValue("ASAS (All Source Analysis System)")
  ASAS____ALL___SOURCE___ANALYSIS___SYSTEM__("ASAS (All Source Analysis System)"),
  @XmlEnumValue("ASOS (Automated Surface Observation System)")
  ASOS____AUTOMATED___SURFACE___OBSERVATION___SYSTEM__("ASOS (Automated Surface Observation System)"),
  @XmlEnumValue("ASW (Anti-Submarine Warfare)")
  ASW____ANTI___SUBMARINE___WARFARE__("ASW (Anti-Submarine Warfare)"),
  ATFP("ATFP"),
  @XmlEnumValue("ATIS (Auto Terminal Information Service)")
  ATIS____AUTO___TERMINAL___INFORMATION___SERVICE__("ATIS (Auto Terminal Information Service)"),
  @XmlEnumValue("AVENGER-STC")
  AVENGER___STC("AVENGER-STC"),
  AWACS("AWACS"),
  @XmlEnumValue("AWOS (Automatic Weather Observing System)")
  AWOS____AUTOMATIC___WEATHER___OBSERVING___SYSTEM__("AWOS (Automatic Weather Observing System)"),
  BACKBONE("BACKBONE"),
  @XmlEnumValue("BASE OPERATIONS")
  BASE___OPERATIONS("BASE OPERATIONS"),
  @XmlEnumValue("BATTLE COMMAND")
  BATTLE___COMMAND("BATTLE COMMAND"),
  BEACON("BEACON"),
  @XmlEnumValue("BLUE ANGELS")
  BLUE___ANGELS("BLUE ANGELS"),
  @XmlEnumValue("BMDS (Ballistic Missile Defense System)")
  BMDS____BALLISTIC___MISSILE___DEFENSE___SYSTEM__("BMDS (Ballistic Missile Defense System)"),
  @XmlEnumValue("BMEWS (Ballistic Missile Early Warning System)")
  BMEWS____BALLISTIC___MISSILE___EARLY___WARNING___SYSTEM__("BMEWS (Ballistic Missile Early Warning System)"),
  BROADCAST("BROADCAST"),
  @XmlEnumValue("C3 (Command, Control, & Communications)")
  C_3____COMMAND____CONTROL______COMMUNICATIONS__("C3 (Command, Control, & Communications)"),
  @XmlEnumValue("CARS (Contingency Airborne Reconnaissance System)")
  CARS____CONTINGENCY___AIRBORNE___RECONNAISSANCE___SYSTEM__("CARS (Contingency Airborne Reconnaissance System)"),
  CAVALRY("CAVALRY"),
  @XmlEnumValue("CBR (Chemical, Biological, Radiological)")
  CBR____CHEMICAL____BIOLOGICAL____RADIOLOGICAL__("CBR (Chemical, Biological, Radiological)"),
  CID("CID"),
  @XmlEnumValue("CIVIL AFFAIRS")
  CIVIL___AFFAIRS("CIVIL AFFAIRS"),
  @XmlEnumValue("CIVIL DISTURBANCES")
  CIVIL___DISTURBANCES("CIVIL DISTURBANCES"),
  @XmlEnumValue("CIVIL ENGINEERING")
  CIVIL___ENGINEERING("CIVIL ENGINEERING"),
  @XmlEnumValue("CIVIL SUPPORT TEAM")
  CIVIL___SUPPORT___TEAM("CIVIL SUPPORT TEAM"),
  @XmlEnumValue("CIVIL WORKS")
  CIVIL___WORKS("CIVIL WORKS"),
  @XmlEnumValue("CIWS (Close-In Weapons System)")
  CIWS____CLOSE___IN___WEAPONS___SYSTEM__("CIWS (Close-In Weapons System)"),
  @XmlEnumValue("CLEARANCE DELIVERY")
  CLEARANCE___DELIVERY("CLEARANCE DELIVERY"),
  @XmlEnumValue("CLOSE AIR SUPPORT (CAS)")
  CLOSE___AIR___SUPPORT____CAS__("CLOSE AIR SUPPORT (CAS)"),
  @XmlEnumValue("COG/COOP")
  COG___COOP("COG/COOP"),
  @XmlEnumValue("COLOR/HONOR GUARD")
  COLOR___HONOR___GUARD("COLOR/HONOR GUARD"),
  @XmlEnumValue("COMBAT CONTROL TEAM")
  COMBAT___CONTROL___TEAM("COMBAT CONTROL TEAM"),
  @XmlEnumValue("COMBATANT COMMAND/GENERAL OFFICER SUPPORT")
  COMBATANT___COMMAND___GENERAL___OFFICER___SUPPORT("COMBATANT COMMAND/GENERAL OFFICER SUPPORT"),
  @XmlEnumValue("COMMAND AND CONTROL")
  COMMAND___AND___CONTROL("COMMAND AND CONTROL"),
  @XmlEnumValue("COMMAND DESTRUCT/TERMINATION")
  COMMAND___DESTRUCT___TERMINATION("COMMAND DESTRUCT/TERMINATION"),
  @XmlEnumValue("COMMAND NET")
  COMMAND___NET("COMMAND NET"),
  @XmlEnumValue("COMMAND POST")
  COMMAND___POST("COMMAND POST"),
  @XmlEnumValue("COMMAND POST/CENTER")
  COMMAND___POST___CENTER("COMMAND POST/CENTER"),
  COMMANDER("COMMANDER"),
  COMMUNICATIONS("COMMUNICATIONS"),
  @XmlEnumValue("COMMUNITY ASSISTANCE")
  COMMUNITY___ASSISTANCE("COMMUNITY ASSISTANCE"),
  @XmlEnumValue("CONSEQUENCE MANAGEMENT")
  CONSEQUENCE___MANAGEMENT("CONSEQUENCE MANAGEMENT"),
  CONSERVATION("CONSERVATION"),
  CONSTRUCTION("CONSTRUCTION"),
  CONTINGENCY("CONTINGENCY"),
  @XmlEnumValue("COUNTER DRUG")
  COUNTER___DRUG("COUNTER DRUG"),
  @XmlEnumValue("CSSCS (Combat Service Support Control System)")
  CSSCS____COMBAT___SERVICE___SUPPORT___CONTROL___SYSTEM__("CSSCS (Combat Service Support Control System)"),
  @XmlEnumValue("CTT (Commander\u2019s Tactical Terminal)")
  CTT____COMMANDER___S___TACTICAL___TERMINAL__("CTT (Commander\u2019s Tactical Terminal)"),
  @XmlEnumValue("DATA COLLECTION PLATFORM")
  DATA___COLLECTION___PLATFORM("DATA COLLECTION PLATFORM"),
  @XmlEnumValue("DATA LINK")
  DATA___LINK("DATA LINK"),
  @XmlEnumValue("DBRITE (Digital Bright Radar Indicator Tower Equipment)")
  DBRITE____DIGITAL___BRIGHT___RADAR___INDICATOR___TOWER___EQUIPMENT__("DBRITE (Digital Bright Radar Indicator Tower Equipment)"),
  @XmlEnumValue("DEPARTURE CONTROL")
  DEPARTURE___CONTROL("DEPARTURE CONTROL"),
  @XmlEnumValue("DIS (Defense Investigative Service)")
  DIS____DEFENSE___INVESTIGATIVE___SERVICE__("DIS (Defense Investigative Service)"),
  @XmlEnumValue("DISASTER PLANNING")
  DISASTER___PLANNING("DISASTER PLANNING"),
  @XmlEnumValue("DMSP (Defense Meteorological Satellite Program)")
  DMSP____DEFENSE___METEOROLOGICAL___SATELLITE___PROGRAM__("DMSP (Defense Meteorological Satellite Program)"),
  @XmlEnumValue("DOMESTIC SUPPORT OPERATIONS")
  DOMESTIC___SUPPORT___OPERATIONS("DOMESTIC SUPPORT OPERATIONS"),
  @XmlEnumValue("DRONE CONTROL")
  DRONE___CONTROL("DRONE CONTROL"),
  @XmlEnumValue("DSCS (Defense Satellite Communication System)")
  DSCS____DEFENSE___SATELLITE___COMMUNICATION___SYSTEM__("DSCS (Defense Satellite Communication System)"),
  @XmlEnumValue("DTSS (Digital Topographic Support System)")
  DTSS____DIGITAL___TOPOGRAPHIC___SUPPORT___SYSTEM__("DTSS (Digital Topographic Support System)"),
  EDUCATION("EDUCATION"),
  @XmlEnumValue("ELECTRONIC WARFARE")
  ELECTRONIC___WARFARE("ELECTRONIC WARFARE"),
  @XmlEnumValue("EMERGENCY SERVICES")
  EMERGENCY___SERVICES("EMERGENCY SERVICES"),
  EMWIN("EMWIN"),
  ENGINEERS("ENGINEERS"),
  ENVIRONMENTAL("ENVIRONMENTAL"),
  @XmlEnumValue("ENVIRONMENTAL CLEANUP")
  ENVIRONMENTAL___CLEANUP("ENVIRONMENTAL CLEANUP"),
  @XmlEnumValue("EOD (Emergency Ordinance Disposal)")
  EOD____EMERGENCY___ORDINANCE___DISPOSAL__("EOD (Emergency Ordinance Disposal)"),
  @XmlEnumValue("EPLRS (Enhanced Position Location Reporting System)")
  EPLRS____ENHANCED___POSITION___LOCATION___REPORTING___SYSTEM__("EPLRS (Enhanced Position Location Reporting System)"),
  @XmlEnumValue("EQUIPMENT CHECKS")
  EQUIPMENT___CHECKS("EQUIPMENT CHECKS"),
  @XmlEnumValue("ERCS (Emergency Rocket Communications Systems)")
  ERCS____EMERGENCY___ROCKET___COMMUNICATIONS___SYSTEMS__("ERCS (Emergency Rocket Communications Systems)"),
  @XmlEnumValue("ETCAS (Enhanced Traffic Collision Avoidance System)")
  ETCAS____ENHANCED___TRAFFIC___COLLISION___AVOIDANCE___SYSTEM__("ETCAS (Enhanced Traffic Collision Avoidance System)"),
  @XmlEnumValue("ETRAC (Enhanced Tactical Radar Correlator)")
  ETRAC____ENHANCED___TACTICAL___RADAR___CORRELATOR__("ETRAC (Enhanced Tactical Radar Correlator)"),
  EXECUTIVE("EXECUTIVE"),
  EXERCISE("EXERCISE"),
  EXPERIMENTAL("EXPERIMENTAL"),
  @XmlEnumValue("FAADC2 (Forward Area Air Defense, Command and Control)")
  FAADC_2____FORWARD___AREA___AIR___DEFENSE____COMMAND___AND___CONTROL__("FAADC2 (Forward Area Air Defense, Command and Control)"),
  @XmlEnumValue("FEEDER CONTROL")
  FEEDER___CONTROL("FEEDER CONTROL"),
  @XmlEnumValue("FEMA (Federal Emergency Mgt Agency)")
  FEMA____FEDERAL___EMERGENCY___MGT___AGENCY__("FEMA (Federal Emergency Mgt Agency)"),
  FIRE("FIRE"),
  @XmlEnumValue("FIRE ALARM")
  FIRE___ALARM("FIRE ALARM"),
  @XmlEnumValue("FIRE SUPPORT")
  FIRE___SUPPORT("FIRE SUPPORT"),
  @XmlEnumValue("FLEET SUPPORT")
  FLEET___SUPPORT("FLEET SUPPORT"),
  @XmlEnumValue("FLIGHT FOLLOWING")
  FLIGHT___FOLLOWING("FLIGHT FOLLOWING"),
  @XmlEnumValue("FLIGHT INSPECTION")
  FLIGHT___INSPECTION("FLIGHT INSPECTION"),
  @XmlEnumValue("FLIGHT TEST")
  FLIGHT___TEST("FLIGHT TEST"),
  @XmlEnumValue("FLOOD WARNING SYSTEM")
  FLOOD___WARNING___SYSTEM("FLOOD WARNING SYSTEM"),
  @XmlEnumValue("FLTSATCOM (Fleet Satellite Communications)")
  FLTSATCOM____FLEET___SATELLITE___COMMUNICATIONS__("FLTSATCOM (Fleet Satellite Communications)"),
  @XmlEnumValue("FORACS (Fleet Operational Readiness Accuracy Check Site)")
  FORACS____FLEET___OPERATIONAL___READINESS___ACCURACY___CHECK___SITE__("FORACS (Fleet Operational Readiness Accuracy Check Site)"),
  @XmlEnumValue("FORWARD AIR CONTROL POST")
  FORWARD___AIR___CONTROL___POST("FORWARD AIR CONTROL POST"),
  @XmlEnumValue("GBCS-L (Ground Based Common Sensor-Light)")
  GBCS___L____GROUND___BASED___COMMON___SENSOR___LIGHT__("GBCS-L (Ground Based Common Sensor-Light)"),
  @XmlEnumValue("GBS (Global Broadcast System)")
  GBS____GLOBAL___BROADCAST___SYSTEM__("GBS (Global Broadcast System)"),
  @XmlEnumValue("GCA (Ground Control Approach)")
  GCA____GROUND___CONTROL___APPROACH__("GCA (Ground Control Approach)"),
  @XmlEnumValue("GCCS (Global Command and Control System-Army)")
  GCCS____GLOBAL___COMMAND___AND___CONTROL___SYSTEM___ARMY__("GCCS (Global Command and Control System-Army)"),
  GLOBAL("GLOBAL"),
  @XmlEnumValue("GLOBAL ALE (Automatic Link Establishment)")
  GLOBAL___ALE____AUTOMATIC___LINK___ESTABLISHMENT__("GLOBAL ALE (Automatic Link Establishment)"),
  @XmlEnumValue("GLOBAL BLACK")
  GLOBAL___BLACK("GLOBAL BLACK"),
  @XmlEnumValue("GLOBAL DISCRETE")
  GLOBAL___DISCRETE("GLOBAL DISCRETE"),
  @XmlEnumValue("GLOBAL RED")
  GLOBAL___RED("GLOBAL RED"),
  @XmlEnumValue("GMD (Ground Missile Defense)")
  GMD____GROUND___MISSILE___DEFENSE__("GMD (Ground Missile Defense)"),
  @XmlEnumValue("GOES (Geostationary Operational Environmental Satellites)")
  GOES____GEOSTATIONARY___OPERATIONAL___ENVIRONMENTAL___SATELLITES__("GOES (Geostationary Operational Environmental Satellites)"),
  @XmlEnumValue("GOLDEN KNIGHTS")
  GOLDEN___KNIGHTS("GOLDEN KNIGHTS"),
  @XmlEnumValue("GPS (Global Positioning System)")
  GPS____GLOBAL___POSITIONING___SYSTEM__("GPS (Global Positioning System)"),
  @XmlEnumValue("GRCS (Guardrail Common Sensor)")
  GRCS____GUARDRAIL___COMMON___SENSOR__("GRCS (Guardrail Common Sensor)"),
  @XmlEnumValue("GRIZZLY (M1 Bleacher MineSweeper)")
  GRIZZLY____M_1___BLEACHER___MINE_SWEEPER__("GRIZZLY (M1 Bleacher MineSweeper)"),
  @XmlEnumValue("GROUND CONTROL")
  GROUND___CONTROL("GROUND CONTROL"),
  @XmlEnumValue("GROUND INTERDICTION")
  GROUND___INTERDICTION("GROUND INTERDICTION"),
  @XmlEnumValue("GROUND OPERATIONS")
  GROUND___OPERATIONS("GROUND OPERATIONS"),
  @XmlEnumValue("GSR (Ground Surveillance Radar)")
  GSR____GROUND___SURVEILLANCE___RADAR__("GSR (Ground Surveillance Radar)"),
  @XmlEnumValue("HAARP (High Frequency Active Auroral Research Program)")
  HAARP____HIGH___FREQUENCY___ACTIVE___AURORAL___RESEARCH___PROGRAM__("HAARP (High Frequency Active Auroral Research Program)"),
  @XmlEnumValue("HARBOR-PORT OPERATIONS")
  HARBOR___PORT___OPERATIONS("HARBOR-PORT OPERATIONS"),
  @XmlEnumValue("HAVE QUICK")
  HAVE___QUICK("HAVE QUICK"),
  @XmlEnumValue("HAZARDOUS MATERIAL RELEASE")
  HAZARDOUS___MATERIAL___RELEASE("HAZARDOUS MATERIAL RELEASE"),
  @XmlEnumValue("HAZMAT (Hazardous Materials)")
  HAZMAT____HAZARDOUS___MATERIALS__("HAZMAT (Hazardous Materials)"),
  @XmlEnumValue("HELO CONTROL")
  HELO___CONTROL("HELO CONTROL"),
  @XmlEnumValue("HICOM (High Command)")
  HICOM____HIGH___COMMAND__("HICOM (High Command)"),
  @XmlEnumValue("HYDRA (Hierarchical Yet Dynamically Reprogrammable Architecture)")
  HYDRA____HIERARCHICAL___YET___DYNAMICALLY___REPROGRAMMABLE___ARCHITECTURE__("HYDRA (Hierarchical Yet Dynamically Reprogrammable Architecture)"),
  HYDROLOGIC("HYDROLOGIC"),
  @XmlEnumValue("IEWCS (Intelligence Electronic Warfare Common Sensor)")
  IEWCS____INTELLIGENCE___ELECTRONIC___WARFARE___COMMON___SENSOR__("IEWCS (Intelligence Electronic Warfare Common Sensor)"),
  @XmlEnumValue("IFF/SIF")
  IFF___SIF("IFF/SIF"),
  @XmlEnumValue("ILS (Instrument Landing System)")
  ILS____INSTRUMENT___LANDING___SYSTEM__("ILS (Instrument Landing System)"),
  @XmlEnumValue("IMETS (Integrated Meteorological System)")
  IMETS____INTEGRATED___METEOROLOGICAL___SYSTEM__("IMETS (Integrated Meteorological System)"),
  @XmlEnumValue("INDUSTRIAL CONTROLS")
  INDUSTRIAL___CONTROLS("INDUSTRIAL CONTROLS"),
  INFANTRY("INFANTRY"),
  INSPECTION("INSPECTION"),
  @XmlEnumValue("INSTALLATION PA SYSTEM (Giant Voice)")
  INSTALLATION___PA___SYSTEM____GIANT___VOICE__("INSTALLATION PA SYSTEM (Giant Voice)"),
  @XmlEnumValue("INSTRUCTOR/STUDENT TRAINING")
  INSTRUCTOR___STUDENT___TRAINING("INSTRUCTOR/STUDENT TRAINING"),
  INTELLIGENCE("INTELLIGENCE"),
  INTERPLANE("INTERPLANE"),
  @XmlEnumValue("INVENTORY/INVENTORY CONTROLS (e.g., Optical Scanners)")
  INVENTORY___INVENTORY___CONTROLS____E___G_____OPTICAL___SCANNERS__("INVENTORY/INVENTORY CONTROLS (e.g., Optical Scanners)"),
  @XmlEnumValue("IONOSPHERIC SOUNDER")
  IONOSPHERIC___SOUNDER("IONOSPHERIC SOUNDER"),
  @XmlEnumValue("I-REMBASS (Improved-Remotely Monitored Battlefield Sensor System)")
  I___REMBASS____IMPROVED___REMOTELY___MONITORED___BATTLEFIELD___SENSOR___SYSTEM__("I-REMBASS (Improved-Remotely Monitored Battlefield Sensor System)"),
  @XmlEnumValue("ISYSCON (Integrated System Control)")
  ISYSCON____INTEGRATED___SYSTEM___CONTROL__("ISYSCON (Integrated System Control)"),
  @XmlEnumValue("JSS (Joint Surveillance System)")
  JSS____JOINT___SURVEILLANCE___SYSTEM__("JSS (Joint Surveillance System)"),
  @XmlEnumValue("JTIDS/MIDS (Joint Tactical Information Distribution System)")
  JTIDS___MIDS____JOINT___TACTICAL___INFORMATION___DISTRIBUTION___SYSTEM__("JTIDS/MIDS (Joint Tactical Information Distribution System)"),
  @XmlEnumValue("LAND WARRIOR")
  LAND___WARRIOR("LAND WARRIOR"),
  @XmlEnumValue("LAW ENFORCEMENT")
  LAW___ENFORCEMENT("LAW ENFORCEMENT"),
  @XmlEnumValue("LEASAT (Leased Satellite)")
  LEASAT____LEASED___SATELLITE__("LEASAT (Leased Satellite)"),
  LINEBACKER("LINEBACKER"),
  @XmlEnumValue("LLDR (Lightweight Laser Designator Rangefinder)")
  LLDR____LIGHTWEIGHT___LASER___DESIGNATOR___RANGEFINDER__("LLDR (Lightweight Laser Designator Rangefinder)"),
  @XmlEnumValue("LMRDFS (Light Man-portable Radio Direction Finding System)")
  LMRDFS____LIGHT___MAN___PORTABLE___RADIO___DIRECTION___FINDING___SYSTEM__("LMRDFS (Light Man-portable Radio Direction Finding System)"),
  @XmlEnumValue("LOCAL CONTROL")
  LOCAL___CONTROL("LOCAL CONTROL"),
  @XmlEnumValue("LOCKS AND DAMS")
  LOCKS___AND___DAMS("LOCKS AND DAMS"),
  @XmlEnumValue("LONGBOW (Apache Helicopter)")
  LONGBOW____APACHE___HELICOPTER__("LONGBOW (Apache Helicopter)"),
  @XmlEnumValue("LOOTING PREVENTION")
  LOOTING___PREVENTION("LOOTING PREVENTION"),
  @XmlEnumValue("M93A1 FOX")
  M_93_A_1___FOX("M93A1 FOX"),
  MAINTENANCE("MAINTENANCE"),
  @XmlEnumValue("MARS (Military Affiliated Radio System)")
  MARS____MILITARY___AFFILIATED___RADIO___SYSTEM__("MARS (Military Affiliated Radio System)"),
  MEDICAL("MEDICAL"),
  METEOROLOGICAL("METEOROLOGICAL"),
  @XmlEnumValue("MFCS (Mortar Fire control System)")
  MFCS____MORTAR___FIRE___CONTROL___SYSTEM__("MFCS (Mortar Fire control System)"),
  MICROWAVE("MICROWAVE"),
  @XmlEnumValue("MICROWAVE DATA LINK")
  MICROWAVE___DATA___LINK("MICROWAVE DATA LINK"),
  @XmlEnumValue("MILITARY POLICE")
  MILITARY___POLICE("MILITARY POLICE"),
  @XmlEnumValue("MILSTAR (Military Strategic and Tactical Relay System)")
  MILSTAR____MILITARY___STRATEGIC___AND___TACTICAL___RELAY___SYSTEM__("MILSTAR (Military Strategic and Tactical Relay System)"),
  @XmlEnumValue("MISC (Miscellaneous)")
  MISC____MISCELLANEOUS__("MISC (Miscellaneous)"),
  MISSILE("MISSILE"),
  @XmlEnumValue("MITT/DTES (Mobile Integrated Tactical Terminal/Distributed Common Ground System Test and Evaluation Strategy)")
  MITT___DTES____MOBILE___INTEGRATED___TACTICAL___TERMINAL___DISTRIBUTED___COMMON___GROUND___SYSTEM___TEST___AND___EVALUATION___STRATEGY__("MITT/DTES (Mobile Integrated Tactical Terminal/Distributed Common Ground System Test and Evaluation Strategy)"),
  @XmlEnumValue("MLRS (Multiple Launch Rocket System)")
  MLRS____MULTIPLE___LAUNCH___ROCKET___SYSTEM__("MLRS (Multiple Launch Rocket System)"),
  @XmlEnumValue("MLS (Microwave Landing System)")
  MLS____MICROWAVE___LANDING___SYSTEM__("MLS (Microwave Landing System)"),
  @XmlEnumValue("MOBILE TELEPHONE")
  MOBILE___TELEPHONE("MOBILE TELEPHONE"),
  @XmlEnumValue("MOMS (Man on the Move System)")
  MOMS____MAN___ON___THE___MOVE___SYSTEM__("MOMS (Man on the Move System)"),
  @XmlEnumValue("MOTOR POOL")
  MOTOR___POOL("MOTOR POOL"),
  @XmlEnumValue("MSE (Mobile Subscriber Equipment)")
  MSE____MOBILE___SUBSCRIBER___EQUIPMENT__("MSE (Mobile Subscriber Equipment)"),
  @XmlEnumValue("MTS (Movement Tracking System)")
  MTS____MOVEMENT___TRACKING___SYSTEM__("MTS (Movement Tracking System)"),
  MUNITIONS("MUNITIONS"),
  @XmlEnumValue("MUTUAL AID")
  MUTUAL___AID("MUTUAL AID"),
  @XmlEnumValue("MYSTIC STAR")
  MYSTIC___STAR("MYSTIC STAR"),
  @XmlEnumValue("NAOC (National Airborne Operations Center)")
  NAOC____NATIONAL___AIRBORNE___OPERATIONS___CENTER__("NAOC (National Airborne Operations Center)"),
  NASA("NASA"),
  @XmlEnumValue("NATURAL RESOURCES")
  NATURAL___RESOURCES("NATURAL RESOURCES"),
  NAVAIDS("NAVAIDS"),
  @XmlEnumValue("NAVAIDS CONTROLS")
  NAVAIDS___CONTROLS("NAVAIDS CONTROLS"),
  @XmlEnumValue("NAVAL GUNFIRE SUPPORT")
  NAVAL___GUNFIRE___SUPPORT("NAVAL GUNFIRE SUPPORT"),
  @XmlEnumValue("NAVIGATION RADAR")
  NAVIGATION___RADAR("NAVIGATION RADAR"),
  @XmlEnumValue("NAVY SPECIAL OPERATIONS")
  NAVY___SPECIAL___OPERATIONS("NAVY SPECIAL OPERATIONS"),
  @XmlEnumValue("NCIS (Naval Criminal Investigative Service)")
  NCIS____NAVAL___CRIMINAL___INVESTIGATIVE___SERVICE__("NCIS (Naval Criminal Investigative Service)"),
  NDB("NDB"),
  @XmlEnumValue("NERON (NOAA Environmental Real-Time Observation Network)")
  NERON____NOAA___ENVIRONMENTAL___REAL___TIME___OBSERVATION___NETWORK__("NERON (NOAA Environmental Real-Time Observation Network)"),
  NEXRAD("NEXRAD"),
  @XmlEnumValue("NOAA WEATHER RADIO")
  NOAA___WEATHER___RADIO("NOAA WEATHER RADIO"),
  @XmlEnumValue("NOAA WEATHER RADIO LINK")
  NOAA___WEATHER___RADIO___LINK("NOAA WEATHER RADIO LINK"),
  @XmlEnumValue("NORAD (North American Air defense Command)")
  NORAD____NORTH___AMERICAN___AIR___DEFENSE___COMMAND__("NORAD (North American Air defense Command)"),
  @XmlEnumValue("NTDR (Near Term Digital Radio)")
  NTDR____NEAR___TERM___DIGITAL___RADIO__("NTDR (Near Term Digital Radio)"),
  @XmlEnumValue("OCCS SUPPORT")
  OCCS___SUPPORT("OCCS SUPPORT"),
  @XmlEnumValue("OPERATION ALLIANCE")
  OPERATION___ALLIANCE("OPERATION ALLIANCE"),
  @XmlEnumValue("OSI (Office of Special Investigation)")
  OSI____OFFICE___OF___SPECIAL___INVESTIGATION__("OSI (Office of Special Investigation)"),
  @XmlEnumValue("OTHER OPERATIONS")
  OTHER___OPERATIONS("OTHER OPERATIONS"),
  @XmlEnumValue("OTHR/ROTHR (Over-the-Horizon Radars)")
  OTHR___ROTHR____OVER___THE___HORIZON___RADARS__("OTHR/ROTHR (Over-the-Horizon Radars)"),
  PAGING("PAGING"),
  @XmlEnumValue("PAR (Precision Approach Radar)")
  PAR____PRECISION___APPROACH___RADAR__("PAR (Precision Approach Radar)"),
  PATRIOT("PATRIOT"),
  @XmlEnumValue("PAVE PAWS (Precision Acquisition Vehicle Entry Phased Array Warning System)")
  PAVE___PAWS____PRECISION___ACQUISITION___VEHICLE___ENTRY___PHASED___ARRAY___WARNING___SYSTEM__("PAVE PAWS (Precision Acquisition Vehicle Entry Phased Array Warning System)"),
  @XmlEnumValue("PILOT-TO-DISPATCHER")
  PILOT___TO___DISPATCHER("PILOT-TO-DISPATCHER"),
  @XmlEnumValue("PILOT-TO-METRO")
  PILOT___TO___METRO("PILOT-TO-METRO"),
  @XmlEnumValue("PILOT-TO-PILOT")
  PILOT___TO___PILOT("PILOT-TO-PILOT"),
  @XmlEnumValue("POL (Petroleum, Oil, and Lubricants)")
  POL____PETROLEUM____OIL____AND___LUBRICANTS__("POL (Petroleum, Oil, and Lubricants)"),
  @XmlEnumValue("POSTAL OPERATIONS")
  POSTAL___OPERATIONS("POSTAL OPERATIONS"),
  @XmlEnumValue("PRIME BEEF")
  PRIME___BEEF("PRIME BEEF"),
  @XmlEnumValue("PRISON BUS")
  PRISON___BUS("PRISON BUS"),
  @XmlEnumValue("PROJECT COTHEN")
  PROJECT___COTHEN("PROJECT COTHEN"),
  @XmlEnumValue("PSYCHOLOGICAL OPERATIONS")
  PSYCHOLOGICAL___OPERATIONS("PSYCHOLOGICAL OPERATIONS"),
  @XmlEnumValue("PUBLIC WORKS")
  PUBLIC___WORKS("PUBLIC WORKS"),
  @XmlEnumValue("RADAR (Radio Detection and Ranging)")
  RADAR____RADIO___DETECTION___AND___RANGING__("RADAR (Radio Detection and Ranging)"),
  @XmlEnumValue("RADIO RELAY")
  RADIO___RELAY("RADIO RELAY"),
  RADIOLOCATION("RADIOLOCATION"),
  RADIOSONDE("RADIOSONDE"),
  @XmlEnumValue("RAMP CONTROL")
  RAMP___CONTROL("RAMP CONTROL"),
  @XmlEnumValue("RANGE CONTROL")
  RANGE___CONTROL("RANGE CONTROL"),
  @XmlEnumValue("RANGE OPERATIONS")
  RANGE___OPERATIONS("RANGE OPERATIONS"),
  @XmlEnumValue("RANGER UNITS")
  RANGER___UNITS("RANGER UNITS"),
  @XmlEnumValue("RDMS (Range Data Management Subsystem)")
  RDMS____RANGE___DATA___MANAGEMENT___SUBSYSTEM__("RDMS (Range Data Management Subsystem)"),
  @XmlEnumValue("RDTE SUPPORT")
  RDTE___SUPPORT("RDTE SUPPORT"),
  @XmlEnumValue("RED HORSE")
  RED___HORSE("RED HORSE"),
  REFUELING("REFUELING"),
  @XmlEnumValue("REMOTE BARRIER CONTROL SYSTEMS")
  REMOTE___BARRIER___CONTROL___SYSTEMS("REMOTE BARRIER CONTROL SYSTEMS"),
  @XmlEnumValue("REMOTE CONTROL CRANE")
  REMOTE___CONTROL___CRANE("REMOTE CONTROL CRANE"),
  @XmlEnumValue("RESOURCES CONSERVATION")
  RESOURCES___CONSERVATION("RESOURCES CONSERVATION"),
  RESUPPLY("RESUPPLY"),
  @XmlEnumValue("RF TAGS")
  RF___TAGS("RF TAGS"),
  @XmlEnumValue("RUNWAY ICE DETECTION SYSTEMS")
  RUNWAY___ICE___DETECTION___SYSTEMS("RUNWAY ICE DETECTION SYSTEMS"),
  @XmlEnumValue("RUNWAY LIGHTING CONTROL")
  RUNWAY___LIGHTING___CONTROL("RUNWAY LIGHTING CONTROL"),
  SAFETY("SAFETY"),
  @XmlEnumValue("SATELLITE COMMUNICATIONS")
  SATELLITE___COMMUNICATIONS("SATELLITE COMMUNICATIONS"),
  @XmlEnumValue("SAWDS (Satellite Automated WX Dist Sys)")
  SAWDS____SATELLITE___AUTOMATED___WX___DIST___SYS__("SAWDS (Satellite Automated WX Dist Sys)"),
  @XmlEnumValue("SCAMP (Single Channel Anti-Jam Manportable Terminal)")
  SCAMP____SINGLE___CHANNEL___ANTI___JAM___MANPORTABLE___TERMINAL__("SCAMP (Single Channel Anti-Jam Manportable Terminal)"),
  @XmlEnumValue("SCOPE SHIELD")
  SCOPE___SHIELD("SCOPE SHIELD"),
  @XmlEnumValue("SEA OPERATIONS")
  SEA___OPERATIONS("SEA OPERATIONS"),
  SEABEES("SEABEES"),
  @XmlEnumValue("SEARCH AND RESCUE")
  SEARCH___AND___RESCUE("SEARCH AND RESCUE"),
  @XmlEnumValue("SECURITY FORCE")
  SECURITY___FORCE("SECURITY FORCE"),
  SEISMIC("SEISMIC"),
  @XmlEnumValue("SENTINEL (AN/MPQ-64 Surveillance Radar)")
  SENTINEL____AN___MPQ___64___SURVEILLANCE___RADAR__("SENTINEL (AN/MPQ-64 Surveillance Radar)"),
  @XmlEnumValue("SGLS (Space Ground Link Subsystem) (Telemetry)")
  SGLS____SPACE___GROUND___LINK___SUBSYSTEM_____TELEMETRY__("SGLS (Space Ground Link Subsystem) (Telemetry)"),
  @XmlEnumValue("SHIP/AIR OPERATIONS")
  SHIP___AIR___OPERATIONS("SHIP/AIR OPERATIONS"),
  @XmlEnumValue("SHIP/SHIP")
  SHIP___SHIP("SHIP/SHIP"),
  @XmlEnumValue("SHIP/SHORE OPERATIONS")
  SHIP___SHORE___OPERATIONS("SHIP/SHORE OPERATIONS"),
  SHIPYARD("SHIPYARD"),
  @XmlEnumValue("SHORE PATROL")
  SHORE___PATROL("SHORE PATROL"),
  @XmlEnumValue("SHORT TERM INCIDENT RESPONSE")
  SHORT___TERM___INCIDENT___RESPONSE("SHORT TERM INCIDENT RESPONSE"),
  SHUTTLE("SHUTTLE"),
  SIMULATOR("SIMULATOR"),
  @XmlEnumValue("SINCGARS (Single Channel Ground and Airborne Radio System)")
  SINCGARS____SINGLE___CHANNEL___GROUND___AND___AIRBORNE___RADIO___SYSTEM__("SINCGARS (Single Channel Ground and Airborne Radio System)"),
  @XmlEnumValue("SINCGARS-ASIP (Single Channel Ground and Airborne Radio System-Advanced System Improvement Plan)")
  SINCGARS___ASIP____SINGLE___CHANNEL___GROUND___AND___AIRBORNE___RADIO___SYSTEM___ADVANCED___SYSTEM___IMPROVEMENT___PLAN__("SINCGARS-ASIP (Single Channel Ground and Airborne Radio System-Advanced System Improvement Plan)"),
  @XmlEnumValue("SNOW REMOVAL")
  SNOW___REMOVAL("SNOW REMOVAL"),
  @XmlEnumValue("SOF (Supervisor of Flying)")
  SOF____SUPERVISOR___OF___FLYING__("SOF (Supervisor of Flying)"),
  SONOBUOY("SONOBUOY"),
  @XmlEnumValue("SORT (Special Operations Response Team)")
  SORT____SPECIAL___OPERATIONS___RESPONSE___TEAM__("SORT (Special Operations Response Team)"),
  @XmlEnumValue("SPACE OPERATIONS")
  SPACE___OPERATIONS("SPACE OPERATIONS"),
  @XmlEnumValue("SPECIAL COURIER")
  SPECIAL___COURIER("SPECIAL COURIER"),
  @XmlEnumValue("SPECIAL FORCES")
  SPECIAL___FORCES("SPECIAL FORCES"),
  @XmlEnumValue("SPECIAL OPERATIONS")
  SPECIAL___OPERATIONS("SPECIAL OPERATIONS"),
  @XmlEnumValue("SPECIAL PROJECTS")
  SPECIAL___PROJECTS("SPECIAL PROJECTS"),
  @XmlEnumValue("SPECIAL SECURITY OPERATIONS")
  SPECIAL___SECURITY___OPERATIONS("SPECIAL SECURITY OPERATIONS"),
  @XmlEnumValue("SPEED MEASUREMENT SYSTEMS")
  SPEED___MEASUREMENT___SYSTEMS("SPEED MEASUREMENT SYSTEMS"),
  @XmlEnumValue("SPITFIRE (SPITFIRE Manpack UHF SATCOM DAMA Terminal)")
  SPITFIRE____SPITFIRE___MANPACK___UHF___SATCOM___DAMA___TERMINAL__("SPITFIRE (SPITFIRE Manpack UHF SATCOM DAMA Terminal)"),
  @XmlEnumValue("SQUADRON/WING COMMON")
  SQUADRON___WING___COMMON("SQUADRON/WING COMMON"),
  @XmlEnumValue("STRIKER II (Advanced Fire Support/Scout/Surveillance System)")
  STRIKER___II____ADVANCED___FIRE___SUPPORT___SCOUT___SURVEILLANCE___SYSTEM__("STRIKER II (Advanced Fire Support/Scout/Surveillance System)"),
  @XmlEnumValue("SUPPLY AND LOGISTICS")
  SUPPLY___AND___LOGISTICS("SUPPLY AND LOGISTICS"),
  @XmlEnumValue("SURFACE NAVAIDS")
  SURFACE___NAVAIDS("SURFACE NAVAIDS"),
  @XmlEnumValue("SURVEILLANCE SYSTEMS")
  SURVEILLANCE___SYSTEMS("SURVEILLANCE SYSTEMS"),
  @XmlEnumValue("SURVEILLANCE/ RECONNAISSANCE")
  SURVEILLANCE____RECONNAISSANCE("SURVEILLANCE/ RECONNAISSANCE"),
  SURVEY("SURVEY"),
  @XmlEnumValue("SUSTAINING OPERATIONS")
  SUSTAINING___OPERATIONS("SUSTAINING OPERATIONS"),
  @XmlEnumValue("TACAN (Tactical Air Navigation)")
  TACAN____TACTICAL___AIR___NAVIGATION__("TACAN (Tactical Air Navigation)"),
  @XmlEnumValue("TACCS (Tactical Army Combat Service Support Computer System)")
  TACCS____TACTICAL___ARMY___COMBAT___SERVICE___SUPPORT___COMPUTER___SYSTEM__("TACCS (Tactical Army Combat Service Support Computer System)"),
  @XmlEnumValue("TACJAM (Tactical Communications Jamming System)")
  TACJAM____TACTICAL___COMMUNICATIONS___JAMMING___SYSTEM__("TACJAM (Tactical Communications Jamming System)"),
  @XmlEnumValue("TACTS (Tactical Trunk Signaling)")
  TACTS____TACTICAL___TRUNK___SIGNALING__("TACTS (Tactical Trunk Signaling)"),
  @XmlEnumValue("TADIL-A")
  TADIL___A("TADIL-A"),
  @XmlEnumValue("TADIL-C")
  TADIL___C("TADIL-C"),
  TARGET("TARGET"),
  @XmlEnumValue("TARGET ACQUISITION")
  TARGET___ACQUISITION("TARGET ACQUISITION"),
  @XmlEnumValue("TARGET SCORING")
  TARGET___SCORING("TARGET SCORING"),
  TAXI("TAXI"),
  @XmlEnumValue("TCAS (Traffic Collision Avoidance System)")
  TCAS____TRAFFIC___COLLISION___AVOIDANCE___SYSTEM__("TCAS (Traffic Collision Avoidance System)"),
  @XmlEnumValue("TCRS (Target Control System)")
  TCRS____TARGET___CONTROL___SYSTEM__("TCRS (Target Control System)"),
  TEAMMATE("TEAMMATE"),
  @XmlEnumValue("TECHNICAL ESCORT UNIT")
  TECHNICAL___ESCORT___UNIT("TECHNICAL ESCORT UNIT"),
  TELECOMMAND("TELECOMMAND"),
  TELEMETRY("TELEMETRY"),
  @XmlEnumValue("TEST AND MEASUREMENT")
  TEST___AND___MEASUREMENT("TEST AND MEASUREMENT"),
  @XmlEnumValue("TEST RANGE")
  TEST___RANGE("TEST RANGE"),
  @XmlEnumValue("TEST RANGE TIMING")
  TEST___RANGE___TIMING("TEST RANGE TIMING"),
  @XmlEnumValue("TETHERED AREOSTAT RADAR")
  TETHERED___AREOSTAT___RADAR("TETHERED AREOSTAT RADAR"),
  THUNDERBIRDS("THUNDERBIRDS"),
  @XmlEnumValue("TIS or TRAVELERS INFORMATION SYSTEM")
  TIS___OR___TRAVELERS___INFORMATION___SYSTEM("TIS or TRAVELERS INFORMATION SYSTEM"),
  @XmlEnumValue("TMGS (Transportable mobile ground subsystems)")
  TMGS____TRANSPORTABLE___MOBILE___GROUND___SUBSYSTEMS__("TMGS (Transportable mobile ground subsystems)"),
  @XmlEnumValue("TOSS (TV Ordnance Scoring System)")
  TOSS____TV___ORDNANCE___SCORING___SYSTEM__("TOSS (TV Ordnance Scoring System)"),
  TOWER("TOWER"),
  TRACKWOLF("TRACKWOLF"),
  @XmlEnumValue("TRAILBLAZER (Ground Based Communications Intelligence System)")
  TRAILBLAZER____GROUND___BASED___COMMUNICATIONS___INTELLIGENCE___SYSTEM__("TRAILBLAZER (Ground Based Communications Intelligence System)"),
  TRAINING("TRAINING"),
  TRANSPORTATION("TRANSPORTATION"),
  @XmlEnumValue("TROJAN SPIRIT")
  TROJAN___SPIRIT("TROJAN SPIRIT"),
  TRUNKING("TRUNKING"),
  TSU("TSU"),
  @XmlEnumValue("UAV (Unmanned Aerial Vehicle)")
  UAV____UNMANNED___AERIAL___VEHICLE__("UAV (Unmanned Aerial Vehicle)"),
  @XmlEnumValue("UNLICENSED DEVICE")
  UNLICENSED___DEVICE("UNLICENSED DEVICE"),
  UTILITIES("UTILITIES"),
  @XmlEnumValue("VOR (Very High Frequency Omnidirectional Range)")
  VOR____VERY___HIGH___FREQUENCY___OMNIDIRECTIONAL___RANGE__("VOR (Very High Frequency Omnidirectional Range)"),
  @XmlEnumValue("VORTAC (VHF Omni-range TACAN)")
  VORTAC____VHF___OMNI___RANGE___TACAN__("VORTAC (VHF Omni-range TACAN)"),
  @XmlEnumValue("WARNING SYSTEM")
  WARNING___SYSTEM("WARNING SYSTEM"),
  @XmlEnumValue("WEAPON SYSTEMS")
  WEAPON___SYSTEMS("WEAPON SYSTEMS"),
  @XmlEnumValue("WEAPONS STORAGE PROTECTION")
  WEAPONS___STORAGE___PROTECTION("WEAPONS STORAGE PROTECTION"),
  WEATHER("WEATHER"),
  @XmlEnumValue("WEATHER RADAR")
  WEATHER___RADAR("WEATHER RADAR"),
  @XmlEnumValue("WHCA (White House Communications Agency)")
  WHCA____WHITE___HOUSE___COMMUNICATIONS___AGENCY__("WHCA (White House Communications Agency)"),
  @XmlEnumValue("WIDEBAND GLOBAL SATCOM")
  WIDEBAND___GLOBAL___SATCOM("WIDEBAND GLOBAL SATCOM"),
  @XmlEnumValue("WILDLIFE PRESERVATION")
  WILDLIFE___PRESERVATION("WILDLIFE PRESERVATION"),
  @XmlEnumValue("WIND PROFILER")
  WIND___PROFILER("WIND PROFILER"),
  @XmlEnumValue("WIN-T (Warfighter Information Network-Tactical)")
  WIN___T____WARFIGHTER___INFORMATION___NETWORK___TACTICAL__("WIN-T (Warfighter Information Network-Tactical)"),
  @XmlEnumValue("WIRELESS LOCAL AREA NETWORK")
  WIRELESS___LOCAL___AREA___NETWORK("WIRELESS LOCAL AREA NETWORK"),
  @XmlEnumValue("WIRELESS MIKE")
  WIRELESS___MIKE("WIRELESS MIKE"),
  @XmlEnumValue("WOLVERINE (Assault Bridge)")
  WOLVERINE____ASSAULT___BRIDGE__("WOLVERINE (Assault Bridge)");
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
