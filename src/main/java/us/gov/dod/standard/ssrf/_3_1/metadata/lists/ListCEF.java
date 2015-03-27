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
import us.gov.dod.standard.ssrf._3_1.multiple.Usage;

/**
 * Enumerated values for fields using the ListCEF type.
 * <p>
 * Used in {@link Usage}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCEF")
@XmlEnum
public enum ListCEF {

  @XmlEnumValue("Broadcast Radio/Television")
  BROADCAST_RADIOTELEVISION("Broadcast Radio/Television"),
  @XmlEnumValue("Broadcast-Satellite")
  BROADCAST_SATELLITE("Broadcast-Satellite"),
  @XmlEnumValue("Collision Avoidance")
  COLLISION_AVOIDANCE("Collision Avoidance"),
  @XmlEnumValue("Communications")
  COMMUNICATIONS("Communications"),
  @XmlEnumValue("Communications-Air Traffic Control")
  COMMUNICATIONS_AIR_TRAFFIC_CONTROL("Communications-Air Traffic Control"),
  @XmlEnumValue("Communications-Data")
  COMMUNICATIONS_DATA("Communications-Data"),
  @XmlEnumValue("Communications-Emergency")
  COMMUNICATIONS_EMERGENCY("Communications-Emergency"),
  @XmlEnumValue("Communications-Monitor")
  COMMUNICATIONS_MONITOR("Communications-Monitor"),
  @XmlEnumValue("Communications-P/P Or Net")
  COMMUNICATIONS_PP_OR_NET("Communications-P/P Or Net"),
  @XmlEnumValue("Communications-Pager")
  COMMUNICATIONS_PAGER("Communications-Pager"),
  @XmlEnumValue("Communications-Radio Relay")
  COMMUNICATIONS_RADIO_RELAY("Communications-Radio Relay"),
  @XmlEnumValue("Communications-Satellite")
  COMMUNICATIONS_SATELLITE("Communications-Satellite"),
  @XmlEnumValue("Communications-Secure Voice")
  COMMUNICATIONS_SECURE_VOICE("Communications-Secure Voice"),
  @XmlEnumValue("Communications-Special")
  COMMUNICATIONS_SPECIAL("Communications-Special"),
  @XmlEnumValue("Communications-Spread Spectrum")
  COMMUNICATIONS_SPREAD_SPECTRUM("Communications-Spread Spectrum"),
  @XmlEnumValue("Communications-Troposcatter")
  COMMUNICATIONS_TROPOSCATTER("Communications-Troposcatter"),
  @XmlEnumValue("Communications-Trunking")
  COMMUNICATIONS_TRUNKING("Communications-Trunking"),
  @XmlEnumValue("Communications-Video")
  COMMUNICATIONS_VIDEO("Communications-Video"),
  @XmlEnumValue("Communications-Video/Data")
  COMMUNICATIONS_VIDEODATA("Communications-Video/Data"),
  @XmlEnumValue("Control")
  CONTROL("Control"),
  @XmlEnumValue("Control-Guidance")
  CONTROL_GUIDANCE("Control-Guidance"),
  @XmlEnumValue("Control-Satellite (Uplink)")
  CONTROL_SATELLITE_UPLINK("Control-Satellite (Uplink)"),
  @XmlEnumValue("Deep Space Mission")
  DEEP_SPACE_MISSION("Deep Space Mission"),
  @XmlEnumValue("Electronic Warfare")
  ELECTRONIC_WARFARE("Electronic Warfare"),
  @XmlEnumValue("Electroptical Equipment")
  ELECTROPTICAL_EQUIPMENT("Electroptical Equipment"),
  @XmlEnumValue("Elint Reconnaissance")
  ELINT_RECONNAISSANCE("Elint Reconnaissance"),
  @XmlEnumValue("EO-Forward Looking Infrared")
  EO_FORWARD_LOOKING_INFRARED("EO-Forward Looking Infrared"),
  @XmlEnumValue("EO-Forward Looking Radar")
  EO_FORWARD_LOOKING_RADAR("EO-Forward Looking Radar"),
  @XmlEnumValue("EO-Infrared Countermeasures")
  EO_INFRARED_COUNTERMEASURES("EO-Infrared Countermeasures"),
  @XmlEnumValue("EO-Infrared Search And Track")
  EO_INFRARED_SEARCH_AND_TRACK("EO-Infrared Search And Track"),
  @XmlEnumValue("EO-Infrared Seeker")
  EO_INFRARED_SEEKER("EO-Infrared Seeker"),
  @XmlEnumValue("EO-Infrared Surveillance")
  EO_INFRARED_SURVEILLANCE("EO-Infrared Surveillance"),
  @XmlEnumValue("EO-Infrared Warning Receiver")
  EO_INFRARED_WARNING_RECEIVER("EO-Infrared Warning Receiver"),
  @XmlEnumValue("EO-Laser Communications")
  EO_LASER_COMMUNICATIONS("EO-Laser Communications"),
  @XmlEnumValue("EO-Laser Designator")
  EO_LASER_DESIGNATOR("EO-Laser Designator"),
  @XmlEnumValue("EO-Laser Radar")
  EO_LASER_RADAR("EO-Laser Radar"),
  @XmlEnumValue("EO-Laser Range Finder")
  EO_LASER_RANGE_FINDER("EO-Laser Range Finder"),
  @XmlEnumValue("EO-Laser Seeker")
  EO_LASER_SEEKER("EO-Laser Seeker"),
  @XmlEnumValue("EO-Laser Tracker")
  EO_LASER_TRACKER("EO-Laser Tracker"),
  @XmlEnumValue("EO-Laser Warning Receiver")
  EO_LASER_WARNING_RECEIVER("EO-Laser Warning Receiver"),
  @XmlEnumValue("EO-Laser Weapon")
  EO_LASER_WEAPON("EO-Laser Weapon"),
  @XmlEnumValue("EO-Night Vision/Image Intensifier")
  EO_NIGHT_VISIONIMAGE_INTENSIFIER("EO-Night Vision/Image Intensifier"),
  @XmlEnumValue("EO-Night Vision/Thermal Image")
  EO_NIGHT_VISIONTHERMAL_IMAGE("EO-Night Vision/Thermal Image"),
  @XmlEnumValue("EO-Surveillance")
  EO_SURVEILLANCE("EO-Surveillance"),
  @XmlEnumValue("EO-Telescope")
  EO_TELESCOPE("EO-Telescope"),
  @XmlEnumValue("EO-TV Seeker")
  EO_TV_SEEKER("EO-TV Seeker"),
  @XmlEnumValue("EO-Ultraviolet Warning Receiver")
  EO_ULTRAVIOLET_WARNING_RECEIVER("EO-Ultraviolet Warning Receiver"),
  @XmlEnumValue("EW-Active jamming")
  EW_ACTIVE_JAMMING("EW-Active jamming"),
  @XmlEnumValue("EW-Anti-Satellite")
  EW_ANTI_SATELLITE("EW-Anti-Satellite"),
  @XmlEnumValue("EW-Anti-Satellite Target")
  EW_ANTI_SATELLITE_TARGET("EW-Anti-Satellite Target"),
  @XmlEnumValue("EW-Deception")
  EW_DECEPTION("EW-Deception"),
  @XmlEnumValue("EW-ECCM/EPM")
  EW_ECCMEPM("EW-ECCM/EPM"),
  @XmlEnumValue("EW-Frequency Hopping")
  EW_FREQUENCY_HOPPING("EW-Frequency Hopping"),
  @XmlEnumValue("EW-Intercept")
  EW_INTERCEPT("EW-Intercept"),
  @XmlEnumValue("EW-Jamming")
  EW_JAMMING("EW-Jamming"),
  @XmlEnumValue("EW-Jamming-Barrage")
  EW_JAMMING_BARRAGE("EW-Jamming-Barrage"),
  @XmlEnumValue("EW-Jamming-Spot")
  EW_JAMMING_SPOT("EW-Jamming-Spot"),
  @XmlEnumValue("EW-Jamming-Sweep")
  EW_JAMMING_SWEEP("EW-Jamming-Sweep"),
  @XmlEnumValue("EW-Radar Warning Receiver")
  EW_RADAR_WARNING_RECEIVER("EW-Radar Warning Receiver"),
  @XmlEnumValue("EW-Reactive jamming")
  EW_REACTIVE_JAMMING("EW-Reactive jamming"),
  @XmlEnumValue("Instrumentation")
  INSTRUMENTATION("Instrumentation"),
  @XmlEnumValue("Instrumentation-Calibration")
  INSTRUMENTATION_CALIBRATION("Instrumentation-Calibration"),
  @XmlEnumValue("Instrumentation-Equipment Monitor")
  INSTRUMENTATION_EQUIPMENT_MONITOR("Instrumentation-Equipment Monitor"),
  @XmlEnumValue("Instrumentation-Frequency Standard")
  INSTRUMENTATION_FREQUENCY_STANDARD("Instrumentation-Frequency Standard"),
  @XmlEnumValue("Instrumentation-Test Equipment")
  INSTRUMENTATION_TEST_EQUIPMENT("Instrumentation-Test Equipment"),
  @XmlEnumValue("Instrumentation-Test Range")
  INSTRUMENTATION_TEST_RANGE("Instrumentation-Test Range"),
  @XmlEnumValue("Interrogator")
  INTERROGATOR("Interrogator"),
  @XmlEnumValue("Ionospheric Sounder")
  IONOSPHERIC_SOUNDER("Ionospheric Sounder"),
  @XmlEnumValue("Location")
  LOCATION("Location"),
  @XmlEnumValue("Location-Homing")
  LOCATION_HOMING("Location-Homing"),
  @XmlEnumValue("Location-Intrusion Detector")
  LOCATION_INTRUSION_DETECTOR("Location-Intrusion Detector"),
  @XmlEnumValue("Location-Laser Reflector")
  LOCATION_LASER_REFLECTOR("Location-Laser Reflector"),
  @XmlEnumValue("Location-Low-Light Level Television")
  LOCATION_LOW_LIGHT_LEVEL_TELEVISION("Location-Low-Light Level Television"),
  @XmlEnumValue("Location-Miss Distance Indicator (MDI)")
  LOCATION_MISS_DISTANCE_INDICATOR_MDI("Location-Miss Distance Indicator (MDI)"),
  @XmlEnumValue("Location-Satellite Beacon")
  LOCATION_SATELLITE_BEACON("Location-Satellite Beacon"),
  @XmlEnumValue("Location-Satellite Tracking")
  LOCATION_SATELLITE_TRACKING("Location-Satellite Tracking"),
  @XmlEnumValue("Location-Sonobuoy")
  LOCATION_SONOBUOY("Location-Sonobuoy"),
  @XmlEnumValue("Location-Tracking/Ranging")
  LOCATION_TRACKINGRANGING("Location-Tracking/Ranging"),
  @XmlEnumValue("Manned Platform")
  MANNED_PLATFORM("Manned Platform"),
  @XmlEnumValue("Meteor Burst")
  METEOR_BURST("Meteor Burst"),
  @XmlEnumValue("Meteorological Aid")
  METEOROLOGICAL_AID("Meteorological Aid"),
  @XmlEnumValue("Meteorological Satellite")
  METEOROLOGICAL_SATELLITE("Meteorological Satellite"),
  @XmlEnumValue("Missile Guidance")
  MISSILE_GUIDANCE("Missile Guidance"),
  @XmlEnumValue("Missile Homing")
  MISSILE_HOMING("Missile Homing"),
  @XmlEnumValue("Missile Tracking")
  MISSILE_TRACKING("Missile Tracking"),
  @XmlEnumValue("Nav-Altimeter")
  NAV_ALTIMETER("Nav-Altimeter"),
  @XmlEnumValue("Nav-Beacon")
  NAV_BEACON("Nav-Beacon"),
  @XmlEnumValue("Nav-Direction Finder")
  NAV_DIRECTION_FINDER("Nav-Direction Finder"),
  @XmlEnumValue("Nav-DME")
  NAV_DME("Nav-DME"),
  @XmlEnumValue("Nav-Drift Angle Measurement")
  NAV_DRIFT_ANGLE_MEASUREMENT("Nav-Drift Angle Measurement"),
  @XmlEnumValue("Nav-GPS/Navstar")
  NAV_GPSNAVSTAR("Nav-GPS/Navstar"),
  @XmlEnumValue("Nav-IFF/SIF")
  NAV_IFFSIF("Nav-IFF/SIF"),
  @XmlEnumValue("Navigation Aids")
  NAVIGATION_AIDS("Navigation Aids"),
  @XmlEnumValue("Nav-ILS")
  NAV_ILS("Nav-ILS"),
  @XmlEnumValue("Nav-Localizer")
  NAV_LOCALIZER("Nav-Localizer"),
  @XmlEnumValue("Nav-LORAC")
  NAV_LORAC("Nav-LORAC"),
  @XmlEnumValue("Nav-LORAN")
  NAV_LORAN("Nav-LORAN"),
  @XmlEnumValue("Nav-MLS")
  NAV_MLS("Nav-MLS"),
  @XmlEnumValue("Nav-Navigation Transponder")
  NAV_NAVIGATION_TRANSPONDER("Nav-Navigation Transponder"),
  @XmlEnumValue("Nav-SHORAN")
  NAV_SHORAN("Nav-SHORAN"),
  @XmlEnumValue("Nav-Space Based Navigation Aid")
  NAV_SPACE_BASED_NAVIGATION_AID("Nav-Space Based Navigation Aid"),
  @XmlEnumValue("Nav-TACAN")
  NAV_TACAN("Nav-TACAN"),
  @XmlEnumValue("Nav-VOR")
  NAV_VOR("Nav-VOR"),
  @XmlEnumValue("Nav-VORTAC")
  NAV_VORTAC("Nav-VORTAC"),
  @XmlEnumValue("Nuclear Detonation Detection")
  NUCLEAR_DETONATION_DETECTION("Nuclear Detonation Detection"),
  @XmlEnumValue("Optical Astronomy")
  OPTICAL_ASTRONOMY("Optical Astronomy"),
  @XmlEnumValue("Photo Reconnaissance")
  PHOTO_RECONNAISSANCE("Photo Reconnaissance"),
  @XmlEnumValue("Radar")
  RADAR("Radar"),
  @XmlEnumValue("Radar Calibration Aid")
  RADAR_CALIBRATION_AID("Radar Calibration Aid"),
  @XmlEnumValue("Radar Intercept")
  RADAR_INTERCEPT("Radar Intercept"),
  @XmlEnumValue("Radar Navigation")
  RADAR_NAVIGATION("Radar Navigation"),
  @XmlEnumValue("Radar Transponder")
  RADAR_TRANSPONDER("Radar Transponder"),
  @XmlEnumValue("Radar, Spread Spectrum")
  RADAR_SPREAD_SPECTRUM("Radar, Spread Spectrum"),
  @XmlEnumValue("Radar-Acquisition")
  RADAR_ACQUISITION("Radar-Acquisition"),
  @XmlEnumValue("Radar-Bombing")
  RADAR_BOMBING("Radar-Bombing"),
  @XmlEnumValue("Radar-CW")
  RADAR_CW("Radar-CW"),
  @XmlEnumValue("Radar-Doppler")
  RADAR_DOPPLER("Radar-Doppler"),
  @XmlEnumValue("Radar-Duplex Repeater")
  RADAR_DUPLEX_REPEATER("Radar-Duplex Repeater"),
  @XmlEnumValue("Radar-Fire Control")
  RADAR_FIRE_CONTROL("Radar-Fire Control"),
  @XmlEnumValue("Radar-Ground Control Approach")
  RADAR_GROUND_CONTROL_APPROACH("Radar-Ground Control Approach"),
  @XmlEnumValue("Radar-Height Finder")
  RADAR_HEIGHT_FINDER("Radar-Height Finder"),
  @XmlEnumValue("Radar-Illuminator")
  RADAR_ILLUMINATOR("Radar-Illuminator"),
  @XmlEnumValue("Radar-Mapping")
  RADAR_MAPPING("Radar-Mapping"),
  @XmlEnumValue("Radar-Meteorological")
  RADAR_METEOROLOGICAL("Radar-Meteorological"),
  @XmlEnumValue("Radar-Monopulse")
  RADAR_MONOPULSE("Radar-Monopulse"),
  @XmlEnumValue("Radar-Over The Horizon")
  RADAR_OVER_THE_HORIZON("Radar-Over The Horizon"),
  @XmlEnumValue("Radar-Precision Approach")
  RADAR_PRECISION_APPROACH("Radar-Precision Approach"),
  @XmlEnumValue("Radar-Pulse Compression")
  RADAR_PULSE_COMPRESSION("Radar-Pulse Compression"),
  @XmlEnumValue("Radar-Ranging")
  RADAR_RANGING("Radar-Ranging"),
  @XmlEnumValue("Radar-Reconnaissance")
  RADAR_RECONNAISSANCE("Radar-Reconnaissance"),
  @XmlEnumValue("Radar-Search")
  RADAR_SEARCH("Radar-Search"),
  @XmlEnumValue("Radar-Side Looking")
  RADAR_SIDE_LOOKING("Radar-Side Looking"),
  @XmlEnumValue("Radar-Space-Based")
  RADAR_SPACE_BASED("Radar-Space-Based"),
  @XmlEnumValue("Radar-Special")
  RADAR_SPECIAL("Radar-Special"),
  @XmlEnumValue("Radar-Synthetic Aperture")
  RADAR_SYNTHETIC_APERTURE("Radar-Synthetic Aperture"),
  @XmlEnumValue("Radar-Tail Warning")
  RADAR_TAIL_WARNING("Radar-Tail Warning"),
  @XmlEnumValue("Radar-Target Acquisition")
  RADAR_TARGET_ACQUISITION("Radar-Target Acquisition"),
  @XmlEnumValue("Radar-Terrain Avoidance")
  RADAR_TERRAIN_AVOIDANCE("Radar-Terrain Avoidance"),
  @XmlEnumValue("Radar-Terrain Following")
  RADAR_TERRAIN_FOLLOWING("Radar-Terrain Following"),
  @XmlEnumValue("Radar-Tracking")
  RADAR_TRACKING("Radar-Tracking"),
  @XmlEnumValue("Radar-Track-While Scan")
  RADAR_TRACK_WHILE_SCAN("Radar-Track-While Scan"),
  @XmlEnumValue("Radar-Velocity Measurement")
  RADAR_VELOCITY_MEASUREMENT("Radar-Velocity Measurement"),
  @XmlEnumValue("Radar-Warfare Simulator")
  RADAR_WARFARE_SIMULATOR("Radar-Warfare Simulator"),
  @XmlEnumValue("Radar-Weather Avoidance")
  RADAR_WEATHER_AVOIDANCE("Radar-Weather Avoidance"),
  @XmlEnumValue("Radio Astronomy")
  RADIO_ASTRONOMY("Radio Astronomy"),
  @XmlEnumValue("Radiosonde")
  RADIOSONDE("Radiosonde"),
  @XmlEnumValue("Remote Sensing")
  REMOTE_SENSING("Remote Sensing"),
  @XmlEnumValue("Research")
  RESEARCH("Research"),
  @XmlEnumValue("Retransmission")
  RETRANSMISSION("Retransmission"),
  @XmlEnumValue("Scientific Investigation")
  SCIENTIFIC_INVESTIGATION("Scientific Investigation"),
  @XmlEnumValue("Search And Rescue")
  SEARCH_AND_RESCUE("Search And Rescue"),
  @XmlEnumValue("Seeker")
  SEEKER("Seeker"),
  @XmlEnumValue("Signal Collection")
  SIGNAL_COLLECTION("Signal Collection"),
  @XmlEnumValue("Simulator")
  SIMULATOR("Simulator"),
  @XmlEnumValue("Space-Based Surveillance")
  SPACE_BASED_SURVEILLANCE("Space-Based Surveillance"),
  @XmlEnumValue("Submarine Buoy")
  SUBMARINE_BUOY("Submarine Buoy"),
  @XmlEnumValue("Telemetry")
  TELEMETRY("Telemetry"),
  @XmlEnumValue("Telemetry-Satellite")
  TELEMETRY_SATELLITE("Telemetry-Satellite"),
  @XmlEnumValue("Trainer")
  TRAINER("Trainer"),
  /**
   * If selected, a clarifying remark SHOULD be entered
   */
  @XmlEnumValue("Other")
  OTHER("Other");

  private final String value;

  ListCEF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCEF fromValue(String v) {
    for (ListCEF c : ListCEF.values()) {
      if (c.value.equals(v)) {
        return c;
      } else if (c.value.equals(v.replaceAll(" ", "-"))) {
        return c;
      } else if (c.value.equals(v.replaceAll("-", " "))) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
