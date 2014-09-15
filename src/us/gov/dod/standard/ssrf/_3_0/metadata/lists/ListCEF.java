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
 * <p>
 * Java class for ListCEF.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCEF">
 *   &lt;restriction base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50">
 *     &lt;enumeration value="Broadcast Radio/Television"/>
 *     &lt;enumeration value="Broadcast-Satellite"/>
 *     &lt;enumeration value="Collision Avoidance"/>
 *     &lt;enumeration value="Comms-Air Traffic Control"/>
 *     &lt;enumeration value="Comms-Data"/>
 *     &lt;enumeration value="Comms-Emergency"/>
 *     &lt;enumeration value="Comms-Monitor"/>
 *     &lt;enumeration value="Comms-P/P Or Net"/>
 *     &lt;enumeration value="Comms-Pager"/>
 *     &lt;enumeration value="Comms-Radio Relay"/>
 *     &lt;enumeration value="Comms-Satellite"/>
 *     &lt;enumeration value="Comms-Secure Voice"/>
 *     &lt;enumeration value="Comms-Troposcatter"/>
 *     &lt;enumeration value="Comms-Trunking"/>
 *     &lt;enumeration value="Comms-Video"/>
 *     &lt;enumeration value="Comms-Video/Data"/>
 *     &lt;enumeration value="Communications"/>
 *     &lt;enumeration value="Communications, Special"/>
 *     &lt;enumeration value="Communications, Spread Spectrum"/>
 *     &lt;enumeration value="Control"/>
 *     &lt;enumeration value="Control-Guidance"/>
 *     &lt;enumeration value="Control-Satellite (Uplink)"/>
 *     &lt;enumeration value="Deep Space Mission"/>
 *     &lt;enumeration value="Electronic Warfare"/>
 *     &lt;enumeration value="Electroptical Equipment"/>
 *     &lt;enumeration value="Elint Reconnaissance"/>
 *     &lt;enumeration value="EO-Forward Looking Infrared"/>
 *     &lt;enumeration value="EO-Forward Looking Radar"/>
 *     &lt;enumeration value="EO-Infrared Countermeasures"/>
 *     &lt;enumeration value="EO-Infrared Search And Track"/>
 *     &lt;enumeration value="EO-Infrared Seeker"/>
 *     &lt;enumeration value="EO-Infrared Surveillance"/>
 *     &lt;enumeration value="EO-Infrared Warning Receiver"/>
 *     &lt;enumeration value="EO-Laser Communications"/>
 *     &lt;enumeration value="EO-Laser Designator"/>
 *     &lt;enumeration value="EO-Laser Radar"/>
 *     &lt;enumeration value="EO-Laser Range Finder"/>
 *     &lt;enumeration value="EO-Laser Seeker"/>
 *     &lt;enumeration value="EO-Laser Tracker"/>
 *     &lt;enumeration value="EO-Laser Warning Receiver"/>
 *     &lt;enumeration value="EO-Laser Weapon"/>
 *     &lt;enumeration value="EO-Night Vision/Image Intensifier"/>
 *     &lt;enumeration value="EO-Night Vision/Thermal Image"/>
 *     &lt;enumeration value="EO-Surveillance"/>
 *     &lt;enumeration value="EO-Telescope"/>
 *     &lt;enumeration value="EO-TV Seeker"/>
 *     &lt;enumeration value="EO-Ultraviolet Warning Receiver"/>
 *     &lt;enumeration value="EW-Active jamming"/>
 *     &lt;enumeration value="EW-Anti-Satellite"/>
 *     &lt;enumeration value="EW-Anti-Satellite Target"/>
 *     &lt;enumeration value="EW-Deception"/>
 *     &lt;enumeration value="EW-ECCM/EPM"/>
 *     &lt;enumeration value="EW-Frequency Hopping"/>
 *     &lt;enumeration value="EW-Intercept"/>
 *     &lt;enumeration value="EW-Jamming"/>
 *     &lt;enumeration value="EW-Jamming-Barrage"/>
 *     &lt;enumeration value="EW-Jamming-Spot"/>
 *     &lt;enumeration value="EW-Jamming-Sweep"/>
 *     &lt;enumeration value="EW-Radar Warning Receiver"/>
 *     &lt;enumeration value="EW-Reactive jamming"/>
 *     &lt;enumeration value="Instrumentation"/>
 *     &lt;enumeration value="Instrumentation-Calibration"/>
 *     &lt;enumeration value="Instrumentation-Equipment Monitor"/>
 *     &lt;enumeration value="Instrumentation-Frequency Standard"/>
 *     &lt;enumeration value="Instrumentation-Test Equipment"/>
 *     &lt;enumeration value="Instrumentation-Test Range"/>
 *     &lt;enumeration value="Interrogator"/>
 *     &lt;enumeration value="Ionospheric Sounder"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Location-Homing"/>
 *     &lt;enumeration value="Location-Intrusion Detector"/>
 *     &lt;enumeration value="Location-Laser Reflector"/>
 *     &lt;enumeration value="Location-Low-Light Level Television"/>
 *     &lt;enumeration value="Location-Miss Distance Indicator (MDI)"/>
 *     &lt;enumeration value="Location-Satellite Beacon"/>
 *     &lt;enumeration value="Location-Satellite Tracking"/>
 *     &lt;enumeration value="Location-Sonobuoy"/>
 *     &lt;enumeration value="Location-Tracking/Ranging"/>
 *     &lt;enumeration value="Manned Platform"/>
 *     &lt;enumeration value="Meteor Burst"/>
 *     &lt;enumeration value="Meteorological Aid"/>
 *     &lt;enumeration value="Meteorological Satellite"/>
 *     &lt;enumeration value="Missile Guidance"/>
 *     &lt;enumeration value="Missile Homing"/>
 *     &lt;enumeration value="Missile Tracking"/>
 *     &lt;enumeration value="Nav-Altimeter"/>
 *     &lt;enumeration value="Nav-Beacon"/>
 *     &lt;enumeration value="Nav-Direction Finder"/>
 *     &lt;enumeration value="Nav-DME"/>
 *     &lt;enumeration value="Nav-Drift Angle Measurement"/>
 *     &lt;enumeration value="Nav-GPS/Navstar"/>
 *     &lt;enumeration value="Nav-IFF/SIF"/>
 *     &lt;enumeration value="Navigation Aids"/>
 *     &lt;enumeration value="Nav-ILS"/>
 *     &lt;enumeration value="Nav-Localizer"/>
 *     &lt;enumeration value="Nav-LORAC"/>
 *     &lt;enumeration value="Nav-LORAN"/>
 *     &lt;enumeration value="Nav-MLS"/>
 *     &lt;enumeration value="Nav-Navigation Transponder"/>
 *     &lt;enumeration value="Nav-SHORAN"/>
 *     &lt;enumeration value="Nav-Space Based Navigation Aid"/>
 *     &lt;enumeration value="Nav-TACAN"/>
 *     &lt;enumeration value="Nav-VOR"/>
 *     &lt;enumeration value="Nav-VORTAC"/>
 *     &lt;enumeration value="Nuclear Detonation Detection"/>
 *     &lt;enumeration value="Optical Astronomy"/>
 *     &lt;enumeration value="Photo Reconnaissance"/>
 *     &lt;enumeration value="Radar"/>
 *     &lt;enumeration value="Radar Calibration Aid"/>
 *     &lt;enumeration value="Radar Intercept"/>
 *     &lt;enumeration value="Radar Navigation"/>
 *     &lt;enumeration value="Radar Transponder"/>
 *     &lt;enumeration value="Radar, Spread Spectrum"/>
 *     &lt;enumeration value="Radar-Acquisition"/>
 *     &lt;enumeration value="Radar-Bombing"/>
 *     &lt;enumeration value="Radar-CW"/>
 *     &lt;enumeration value="Radar-Doppler"/>
 *     &lt;enumeration value="Radar-Duplex Repeater"/>
 *     &lt;enumeration value="Radar-Fire Control"/>
 *     &lt;enumeration value="Radar-Ground Control Approach"/>
 *     &lt;enumeration value="Radar-Height Finder"/>
 *     &lt;enumeration value="Radar-Illuminator"/>
 *     &lt;enumeration value="Radar-Mapping"/>
 *     &lt;enumeration value="Radar-Meteorological"/>
 *     &lt;enumeration value="Radar-Monopulse"/>
 *     &lt;enumeration value="Radar-Over The Horizon"/>
 *     &lt;enumeration value="Radar-Precision Approach"/>
 *     &lt;enumeration value="Radar-Pulse Compression"/>
 *     &lt;enumeration value="Radar-Ranging"/>
 *     &lt;enumeration value="Radar-Reconnaissance"/>
 *     &lt;enumeration value="Radar-Search"/>
 *     &lt;enumeration value="Radar-Side Looking"/>
 *     &lt;enumeration value="Radar-Space-Based"/>
 *     &lt;enumeration value="Radar-Special"/>
 *     &lt;enumeration value="Radar-Synthetic Aperture"/>
 *     &lt;enumeration value="Radar-Tail Warning"/>
 *     &lt;enumeration value="Radar-Target Acquisition"/>
 *     &lt;enumeration value="Radar-Terrain Avoidance"/>
 *     &lt;enumeration value="Radar-Terrain Following"/>
 *     &lt;enumeration value="Radar-Tracking"/>
 *     &lt;enumeration value="Radar-Track-While Scan"/>
 *     &lt;enumeration value="Radar-Transponder"/>
 *     &lt;enumeration value="Radar-Velocity Measurement"/>
 *     &lt;enumeration value="Radar-Warfare Simulator"/>
 *     &lt;enumeration value="Radar-Weather Avoidance"/>
 *     &lt;enumeration value="Radio Astronomy"/>
 *     &lt;enumeration value="Radiosonde"/>
 *     &lt;enumeration value="Remote Sensing"/>
 *     &lt;enumeration value="Research"/>
 *     &lt;enumeration value="Retransmission"/>
 *     &lt;enumeration value="Scientific Investigation"/>
 *     &lt;enumeration value="Search And Rescue"/>
 *     &lt;enumeration value="Seeker"/>
 *     &lt;enumeration value="Signal Collection"/>
 *     &lt;enumeration value="Simulator"/>
 *     &lt;enumeration value="Space-Based Surveillance"/>
 *     &lt;enumeration value="Submarine Buoy"/>
 *     &lt;enumeration value="Telemetry"/>
 *     &lt;enumeration value="Telemetry-Satellite"/>
 *     &lt;enumeration value="Trainer"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCEF")
@XmlEnum
public enum ListCEF {

  @XmlEnumValue("Broadcast Radio/Television")
  BROADCAST_RADIOTELEVISION,
  @XmlEnumValue("Broadcast-Satellite")
  BROADCAST_SATELLITE,
  @XmlEnumValue("Collision Avoidance")
  COLLISION_AVOIDANCE,
  @XmlEnumValue("Comms-Air Traffic Control")
  COMMS_AIR_TRAFFIC_CONTROL,
  @XmlEnumValue("Comms-Data")
  COMMS_DATA,
  @XmlEnumValue("Comms-Emergency")
  COMMS_EMERGENCY,
  @XmlEnumValue("Comms-Monitor")
  COMMS_MONITOR,
  @XmlEnumValue("Comms-P/P Or Net")
  COMMS_PP_OR_NET,
  @XmlEnumValue("Comms-Pager")
  COMMS_PAGER,
  @XmlEnumValue("Comms-Radio Relay")
  COMMS_RADIO_RELAY,
  @XmlEnumValue("Comms-Satellite")
  COMMS_SATELLITE,
  @XmlEnumValue("Comms-Secure Voice")
  COMMS_SECURE_VOICE,
  @XmlEnumValue("Comms-Troposcatter")
  COMMS_TROPOSCATTER,
  @XmlEnumValue("Comms-Trunking")
  COMMS_TRUNKING,
  @XmlEnumValue("Comms-Video")
  COMMS_VIDEO,
  @XmlEnumValue("Comms-Video/Data")
  COMMS_VIDEODATA,
  @XmlEnumValue("Communications")
  COMMUNICATIONS,
  @XmlEnumValue("Communications, Special")
  COMMUNICATIONS_SPECIAL,
  @XmlEnumValue("Communications, Spread Spectrum")
  COMMUNICATIONS_SPREAD_SPECTRUM,
  @XmlEnumValue("Control")
  CONTROL,
  @XmlEnumValue("Control-Guidance")
  CONTROL_GUIDANCE,
  @XmlEnumValue("Control-Satellite (Uplink)")
  CONTROL_SATELLITE_UPLINK,
  @XmlEnumValue("Deep Space Mission")
  DEEP_SPACE_MISSION,
  @XmlEnumValue("Electronic Warfare")
  ELECTRONIC_WARFARE,
  @XmlEnumValue("Electroptical Equipment")
  ELECTROPTICAL_EQUIPMENT,
  @XmlEnumValue("Elint Reconnaissance")
  ELINT_RECONNAISSANCE,
  @XmlEnumValue("EO-Forward Looking Infrared")
  EO_FORWARD_LOOKING_INFRARED,
  @XmlEnumValue("EO-Forward Looking Radar")
  EO_FORWARD_LOOKING_RADAR,
  @XmlEnumValue("EO-Infrared Countermeasures")
  EO_INFRARED_COUNTERMEASURES,
  @XmlEnumValue("EO-Infrared Search And Track")
  EO_INFRARED_SEARCH_AND_TRACK,
  @XmlEnumValue("EO-Infrared Seeker")
  EO_INFRARED_SEEKER,
  @XmlEnumValue("EO-Infrared Surveillance")
  EO_INFRARED_SURVEILLANCE,
  @XmlEnumValue("EO-Infrared Warning Receiver")
  EO_INFRARED_WARNING_RECEIVER,
  @XmlEnumValue("EO-Laser Communications")
  EO_LASER_COMMUNICATIONS,
  @XmlEnumValue("EO-Laser Designator")
  EO_LASER_DESIGNATOR,
  @XmlEnumValue("EO-Laser Radar")
  EO_LASER_RADAR,
  @XmlEnumValue("EO-Laser Range Finder")
  EO_LASER_RANGE_FINDER,
  @XmlEnumValue("EO-Laser Seeker")
  EO_LASER_SEEKER,
  @XmlEnumValue("EO-Laser Tracker")
  EO_LASER_TRACKER,
  @XmlEnumValue("EO-Laser Warning Receiver")
  EO_LASER_WARNING_RECEIVER,
  @XmlEnumValue("EO-Laser Weapon")
  EO_LASER_WEAPON,
  @XmlEnumValue("EO-Night Vision/Image Intensifier")
  EO_NIGHT_VISIONIMAGE_INTENSIFIER,
  @XmlEnumValue("EO-Night Vision/Thermal Image")
  EO_NIGHT_VISIONTHERMAL_IMAGE,
  @XmlEnumValue("EO-Surveillance")
  EO_SURVEILLANCE,
  @XmlEnumValue("EO-Telescope")
  EO_TELESCOPE,
  @XmlEnumValue("EO-TV Seeker")
  EO_TV_SEEKER,
  @XmlEnumValue("EO-Ultraviolet Warning Receiver")
  EO_ULTRAVIOLET_WARNING_RECEIVER,
  @XmlEnumValue("EW-Active jamming")
  EW_ACTIVE_JAMMING,
  @XmlEnumValue("EW-Anti-Satellite")
  EW_ANTI_SATELLITE,
  @XmlEnumValue("EW-Anti-Satellite Target")
  EW_ANTI_SATELLITE_TARGET,
  @XmlEnumValue("EW-Deception")
  EW_DECEPTION,
  @XmlEnumValue("EW-ECCM/EPM")
  EW_ECCMEPM,
  @XmlEnumValue("EW-Frequency Hopping")
  EW_FREQUENCY_HOPPING,
  @XmlEnumValue("EW-Intercept")
  EW_INTERCEPT,
  @XmlEnumValue("EW-Jamming")
  EW_JAMMING,
  @XmlEnumValue("EW-Jamming-Barrage")
  EW_JAMMING_BARRAGE,
  @XmlEnumValue("EW-Jamming-Spot")
  EW_JAMMING_SPOT,
  @XmlEnumValue("EW-Jamming-Sweep")
  EW_JAMMING_SWEEP,
  @XmlEnumValue("EW-Radar Warning Receiver")
  EW_RADAR_WARNING_RECEIVER,
  @XmlEnumValue("EW-Reactive jamming")
  EW_REACTIVE_JAMMING,
  @XmlEnumValue("Instrumentation")
  INSTRUMENTATION,
  @XmlEnumValue("Instrumentation-Calibration")
  INSTRUMENTATION_CALIBRATION,
  @XmlEnumValue("Instrumentation-Equipment Monitor")
  INSTRUMENTATION_EQUIPMENT_MONITOR,
  @XmlEnumValue("Instrumentation-Frequency Standard")
  INSTRUMENTATION_FREQUENCY_STANDARD,
  @XmlEnumValue("Instrumentation-Test Equipment")
  INSTRUMENTATION_TEST_EQUIPMENT,
  @XmlEnumValue("Instrumentation-Test Range")
  INSTRUMENTATION_TEST_RANGE,
  @XmlEnumValue("Interrogator")
  INTERROGATOR,
  @XmlEnumValue("Ionospheric Sounder")
  IONOSPHERIC_SOUNDER,
  @XmlEnumValue("Location")
  LOCATION,
  @XmlEnumValue("Location-Homing")
  LOCATION_HOMING,
  @XmlEnumValue("Location-Intrusion Detector")
  LOCATION_INTRUSION_DETECTOR,
  @XmlEnumValue("Location-Laser Reflector")
  LOCATION_LASER_REFLECTOR,
  @XmlEnumValue("Location-Low-Light Level Television")
  LOCATION_LOW_LIGHT_LEVEL_TELEVISION,
  @XmlEnumValue("Location-Miss Distance Indicator (MDI)")
  LOCATION_MISS_DISTANCE_INDICATOR_MDI,
  @XmlEnumValue("Location-Satellite Beacon")
  LOCATION_SATELLITE_BEACON,
  @XmlEnumValue("Location-Satellite Tracking")
  LOCATION_SATELLITE_TRACKING,
  @XmlEnumValue("Location-Sonobuoy")
  LOCATION_SONOBUOY,
  @XmlEnumValue("Location-Tracking/Ranging")
  LOCATION_TRACKINGRANGING,
  @XmlEnumValue("Manned Platform")
  MANNED_PLATFORM,
  @XmlEnumValue("Meteor Burst")
  METEOR_BURST,
  @XmlEnumValue("Meteorological Aid")
  METEOROLOGICAL_AID,
  @XmlEnumValue("Meteorological Satellite")
  METEOROLOGICAL_SATELLITE,
  @XmlEnumValue("Missile Guidance")
  MISSILE_GUIDANCE,
  @XmlEnumValue("Missile Homing")
  MISSILE_HOMING,
  @XmlEnumValue("Missile Tracking")
  MISSILE_TRACKING,
  @XmlEnumValue("Nav-Altimeter")
  NAV_ALTIMETER,
  @XmlEnumValue("Nav-Beacon")
  NAV_BEACON,
  @XmlEnumValue("Nav-Direction Finder")
  NAV_DIRECTION_FINDER,
  @XmlEnumValue("Nav-DME")
  NAV_DME,
  @XmlEnumValue("Nav-Drift Angle Measurement")
  NAV_DRIFT_ANGLE_MEASUREMENT,
  @XmlEnumValue("Nav-GPS/Navstar")
  NAV_GPSNAVSTAR,
  @XmlEnumValue("Nav-IFF/SIF")
  NAV_IFFSIF,
  @XmlEnumValue("Navigation Aids")
  NAVIGATION_AIDS,
  @XmlEnumValue("Nav-ILS")
  NAV_ILS,
  @XmlEnumValue("Nav-Localizer")
  NAV_LOCALIZER,
  @XmlEnumValue("Nav-LORAC")
  NAV_LORAC,
  @XmlEnumValue("Nav-LORAN")
  NAV_LORAN,
  @XmlEnumValue("Nav-MLS")
  NAV_MLS,
  @XmlEnumValue("Nav-Navigation Transponder")
  NAV_NAVIGATION_TRANSPONDER,
  @XmlEnumValue("Nav-SHORAN")
  NAV_SHORAN,
  @XmlEnumValue("Nav-Space Based Navigation Aid")
  NAV_SPACE_BASED_NAVIGATION_AID,
  @XmlEnumValue("Nav-TACAN")
  NAV_TACAN,
  @XmlEnumValue("Nav-VOR")
  NAV_VOR,
  @XmlEnumValue("Nav-VORTAC")
  NAV_VORTAC,
  @XmlEnumValue("Nuclear Detonation Detection")
  NUCLEAR_DETONATION_DETECTION,
  @XmlEnumValue("Optical Astronomy")
  OPTICAL_ASTRONOMY,
  @XmlEnumValue("Photo Reconnaissance")
  PHOTO_RECONNAISSANCE,
  @XmlEnumValue("Radar")
  RADAR,
  @XmlEnumValue("Radar Calibration Aid")
  RADAR_CALIBRATION_AID,
  @XmlEnumValue("Radar Intercept")
  RADAR_INTERCEPT,
  @XmlEnumValue("Radar Navigation")
  RADAR_NAVIGATION,
  @XmlEnumValue("Radar Transponder")
  RADAR_TRANSPONDER,
  @XmlEnumValue("Radar, Spread Spectrum")
  RADAR_SPREAD_SPECTRUM,
  @XmlEnumValue("Radar-Acquisition")
  RADAR_ACQUISITION,
  @XmlEnumValue("Radar-Bombing")
  RADAR_BOMBING,
  @XmlEnumValue("Radar-CW")
  RADAR_CW,
  @XmlEnumValue("Radar-Doppler")
  RADAR_DOPPLER,
  @XmlEnumValue("Radar-Duplex Repeater")
  RADAR_DUPLEX_REPEATER,
  @XmlEnumValue("Radar-Fire Control")
  RADAR_FIRE_CONTROL,
  @XmlEnumValue("Radar-Ground Control Approach")
  RADAR_GROUND_CONTROL_APPROACH,
  @XmlEnumValue("Radar-Height Finder")
  RADAR_HEIGHT_FINDER,
  @XmlEnumValue("Radar-Illuminator")
  RADAR_ILLUMINATOR,
  @XmlEnumValue("Radar-Mapping")
  RADAR_MAPPING,
  @XmlEnumValue("Radar-Meteorological")
  RADAR_METEOROLOGICAL,
  @XmlEnumValue("Radar-Monopulse")
  RADAR_MONOPULSE,
  @XmlEnumValue("Radar-Over The Horizon")
  RADAR_OVER_THE_HORIZON,
  @XmlEnumValue("Radar-Precision Approach")
  RADAR_PRECISION_APPROACH,
  @XmlEnumValue("Radar-Pulse Compression")
  RADAR_PULSE_COMPRESSION,
  @XmlEnumValue("Radar-Ranging")
  RADAR_RANGING,
  @XmlEnumValue("Radar-Reconnaissance")
  RADAR_RECONNAISSANCE,
  @XmlEnumValue("Radar-Search")
  RADAR_SEARCH,
  @XmlEnumValue("Radar-Side Looking")
  RADAR_SIDE_LOOKING,
  @XmlEnumValue("Radar-Space-Based")
  RADAR_SPACE_BASED,
  @XmlEnumValue("Radar-Special")
  RADAR_SPECIAL,
  @XmlEnumValue("Radar-Synthetic Aperture")
  RADAR_SYNTHETIC_APERTURE,
  @XmlEnumValue("Radar-Tail Warning")
  RADAR_TAIL_WARNING,
  @XmlEnumValue("Radar-Target Acquisition")
  RADAR_TARGET_ACQUISITION,
  @XmlEnumValue("Radar-Terrain Avoidance")
  RADAR_TERRAIN_AVOIDANCE,
  @XmlEnumValue("Radar-Terrain Following")
  RADAR_TERRAIN_FOLLOWING,
  @XmlEnumValue("Radar-Tracking")
  RADAR_TRACKING,
  @XmlEnumValue("Radar-Track-While Scan")
  RADAR_TRACK_WHILE_SCAN,
  @XmlEnumValue("Radar-Velocity Measurement")
  RADAR_VELOCITY_MEASUREMENT,
  @XmlEnumValue("Radar-Warfare Simulator")
  RADAR_WARFARE_SIMULATOR,
  @XmlEnumValue("Radar-Weather Avoidance")
  RADAR_WEATHER_AVOIDANCE,
  @XmlEnumValue("Radio Astronomy")
  RADIO_ASTRONOMY,
  @XmlEnumValue("Radiosonde")
  RADIOSONDE,
  @XmlEnumValue("Remote Sensing")
  REMOTE_SENSING,
  @XmlEnumValue("Research")
  RESEARCH,
  @XmlEnumValue("Retransmission")
  RETRANSMISSION,
  @XmlEnumValue("Scientific Investigation")
  SCIENTIFIC_INVESTIGATION,
  @XmlEnumValue("Search And Rescue")
  SEARCH_AND_RESCUE,
  @XmlEnumValue("Seeker")
  SEEKER,
  @XmlEnumValue("Signal Collection")
  SIGNAL_COLLECTION,
  @XmlEnumValue("Simulator")
  SIMULATOR,
  @XmlEnumValue("Space-Based Surveillance")
  SPACE_BASED_SURVEILLANCE,
  @XmlEnumValue("Submarine Buoy")
  SUBMARINE_BUOY,
  @XmlEnumValue("Telemetry")
  TELEMETRY,
  @XmlEnumValue("Telemetry-Satellite")
  TELEMETRY_SATELLITE,
  @XmlEnumValue("Trainer")
  TRAINER,
  @XmlEnumValue("Other")
  OTHER;

  public String value() {
    return name();
  }

  public static ListCEF fromValue(String v) {
    for (ListCEF c : ListCEF.values()) {
      if (c.name().equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String enumValue() {
    return this.value();
  }

}
