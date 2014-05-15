/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0;

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
 * &lt;simpleType name="ListCEF"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Broadcast Radio/Television"/> &lt;enumeration
 * value="Broadcast-Satellite"/> &lt;enumeration value="Collision Avoidance"/>
 * &lt;enumeration value="Comms-Air Traffic Control"/> &lt;enumeration
 * value="Comms-Data"/> &lt;enumeration value="Comms-Emergency"/>
 * &lt;enumeration value="Comms-Monitor"/> &lt;enumeration value="Comms-P/P Or
 * Net"/> &lt;enumeration value="Comms-Pager"/> &lt;enumeration
 * value="Comms-Radio Relay"/> &lt;enumeration value="Comms-Satellite"/>
 * &lt;enumeration value="Comms-Secure Voice"/> &lt;enumeration
 * value="Comms-Troposcatter"/> &lt;enumeration value="Comms-Trunking"/>
 * &lt;enumeration value="Comms-Video"/> &lt;enumeration
 * value="Comms-Video/Data"/> &lt;enumeration value="Communications"/>
 * &lt;enumeration value="Communications, Special"/> &lt;enumeration
 * value="Communications, Spread Spectrum"/> &lt;enumeration value="Control"/>
 * &lt;enumeration value="Control-Guidance"/> &lt;enumeration
 * value="Control-Satellite (Uplink)"/> &lt;enumeration value="Deep Space
 * Mission"/> &lt;enumeration value="Electronic Warfare"/> &lt;enumeration
 * value="Electroptical Equipment"/> &lt;enumeration value="Elint
 * Reconnaissance"/> &lt;enumeration value="EO-Forward Looking Infrared"/>
 * &lt;enumeration value="EO-Forward Looking Radar"/> &lt;enumeration
 * value="EO-Infrared Countermeasures"/> &lt;enumeration value="EO-Infrared
 * Search And Track"/> &lt;enumeration value="EO-Infrared Seeker"/>
 * &lt;enumeration value="EO-Infrared Surveillance"/> &lt;enumeration
 * value="EO-Infrared Warning Receiver"/> &lt;enumeration value="EO-Laser
 * Communications"/> &lt;enumeration value="EO-Laser Designator"/>
 * &lt;enumeration value="EO-Laser Radar"/> &lt;enumeration value="EO-Laser
 * Range Finder"/> &lt;enumeration value="EO-Laser Seeker"/> &lt;enumeration
 * value="EO-Laser Tracker"/> &lt;enumeration value="EO-Laser Warning
 * Receiver"/> &lt;enumeration value="EO-Laser Weapon"/> &lt;enumeration
 * value="EO-Night Vision/Image Intensifier"/> &lt;enumeration value="EO-Night
 * Vision/Thermal Image"/> &lt;enumeration value="EO-Surveillance"/>
 * &lt;enumeration value="EO-Telescope"/> &lt;enumeration value="EO-TV Seeker"/>
 * &lt;enumeration value="EO-Ultraviolet Warning Receiver"/> &lt;enumeration
 * value="EW-Active jamming"/> &lt;enumeration value="EW-Anti-Satellite"/>
 * &lt;enumeration value="EW-Anti-Satellite Target"/> &lt;enumeration
 * value="EW-Deception"/> &lt;enumeration value="EW-ECCM/EPM"/> &lt;enumeration
 * value="EW-Frequency Hopping"/> &lt;enumeration value="EW-Intercept"/>
 * &lt;enumeration value="EW-Jamming"/> &lt;enumeration
 * value="EW-Jamming-Barrage"/> &lt;enumeration value="EW-Jamming-Spot"/>
 * &lt;enumeration value="EW-Jamming-Sweep"/> &lt;enumeration value="EW-Radar
 * Warning Receiver"/> &lt;enumeration value="EW-Reactive jamming"/>
 * &lt;enumeration value="Instrumentation"/> &lt;enumeration
 * value="Instrumentation-Calibration"/> &lt;enumeration
 * value="Instrumentation-Equipment Monitor"/> &lt;enumeration
 * value="Instrumentation-Frequency Standard"/> &lt;enumeration
 * value="Instrumentation-Test Equipment"/> &lt;enumeration
 * value="Instrumentation-Test Range"/> &lt;enumeration value="Interrogator"/>
 * &lt;enumeration value="Ionospheric Sounder"/> &lt;enumeration
 * value="Location"/> &lt;enumeration value="Location-Homing"/> &lt;enumeration
 * value="Location-Intrusion Detector"/> &lt;enumeration value="Location-Laser
 * Reflector"/> &lt;enumeration value="Location-Low-Light Level Television"/>
 * &lt;enumeration value="Location-Miss Distance Indicator (MDI)"/>
 * &lt;enumeration value="Location-Satellite Beacon"/> &lt;enumeration
 * value="Location-Satellite Tracking"/> &lt;enumeration
 * value="Location-Sonobuoy"/> &lt;enumeration
 * value="Location-Tracking/Ranging"/> &lt;enumeration value="Manned Platform"/>
 * &lt;enumeration value="Meteor Burst"/> &lt;enumeration value="Meteorological
 * Aid"/> &lt;enumeration value="Meteorological Satellite"/> &lt;enumeration
 * value="Missile Guidance"/> &lt;enumeration value="Missile Homing"/>
 * &lt;enumeration value="Missile Tracking"/> &lt;enumeration
 * value="Nav-Altimeter"/> &lt;enumeration value="Nav-Beacon"/> &lt;enumeration
 * value="Nav-Direction Finder"/> &lt;enumeration value="Nav-DME"/>
 * &lt;enumeration value="Nav-Drift Angle Measurement"/> &lt;enumeration
 * value="Nav-GPS/Navstar"/> &lt;enumeration value="Nav-IFF/SIF"/>
 * &lt;enumeration value="Navigation Aids"/> &lt;enumeration value="Nav-ILS"/>
 * &lt;enumeration value="Nav-Localizer"/> &lt;enumeration value="Nav-LORAC"/>
 * &lt;enumeration value="Nav-LORAN"/> &lt;enumeration value="Nav-MLS"/>
 * &lt;enumeration value="Nav-Navigation Transponder"/> &lt;enumeration
 * value="Nav-SHORAN"/> &lt;enumeration value="Nav-Space Based Navigation Aid"/>
 * &lt;enumeration value="Nav-TACAN"/> &lt;enumeration value="Nav-VOR"/>
 * &lt;enumeration value="Nav-VORTAC"/> &lt;enumeration value="Nuclear
 * Detonation Detection"/> &lt;enumeration value="Optical Astronomy"/>
 * &lt;enumeration value="Photo Reconnaissance"/> &lt;enumeration
 * value="Radar"/> &lt;enumeration value="Radar Calibration Aid"/>
 * &lt;enumeration value="Radar Intercept"/> &lt;enumeration value="Radar
 * Navigation"/> &lt;enumeration value="Radar Transponder"/> &lt;enumeration
 * value="Radar, Spread Spectrum"/> &lt;enumeration value="Radar-Acquisition"/>
 * &lt;enumeration value="Radar-Bombing"/> &lt;enumeration value="Radar-CW"/>
 * &lt;enumeration value="Radar-Doppler"/> &lt;enumeration value="Radar-Duplex
 * Repeater"/> &lt;enumeration value="Radar-Fire Control"/> &lt;enumeration
 * value="Radar-Ground Control Approach"/> &lt;enumeration value="Radar-Height
 * Finder"/> &lt;enumeration value="Radar-Illuminator"/> &lt;enumeration
 * value="Radar-Mapping"/> &lt;enumeration value="Radar-Meteorological"/>
 * &lt;enumeration value="Radar-Monopulse"/> &lt;enumeration value="Radar-Over
 * The Horizon"/> &lt;enumeration value="Radar-Precision Approach"/>
 * &lt;enumeration value="Radar-Pulse Compression"/> &lt;enumeration
 * value="Radar-Ranging"/> &lt;enumeration value="Radar-Reconnaissance"/>
 * &lt;enumeration value="Radar-Search"/> &lt;enumeration value="Radar-Side
 * Looking"/> &lt;enumeration value="Radar-Space-Based"/> &lt;enumeration
 * value="Radar-Special"/> &lt;enumeration value="Radar-Synthetic Aperture"/>
 * &lt;enumeration value="Radar-Tail Warning"/> &lt;enumeration
 * value="Radar-Target Acquisition"/> &lt;enumeration value="Radar-Terrain
 * Avoidance"/> &lt;enumeration value="Radar-Terrain Following"/>
 * &lt;enumeration value="Radar-Tracking"/> &lt;enumeration
 * value="Radar-Track-While Scan"/> &lt;enumeration value="Radar-Transponder"/>
 * &lt;enumeration value="Radar-Velocity Measurement"/> &lt;enumeration
 * value="Radar-Warfare Simulator"/> &lt;enumeration value="Radar-Weather
 * Avoidance"/> &lt;enumeration value="Radio Astronomy"/> &lt;enumeration
 * value="Radiosonde"/> &lt;enumeration value="Remote Sensing"/> &lt;enumeration
 * value="Research"/> &lt;enumeration value="Retransmission"/> &lt;enumeration
 * value="Scientific Investigation"/> &lt;enumeration value="Search And
 * Rescue"/> &lt;enumeration value="Seeker"/> &lt;enumeration value="Signal
 * Collection"/> &lt;enumeration value="Simulator"/> &lt;enumeration
 * value="Space-Based Surveillance"/> &lt;enumeration value="Submarine Buoy"/>
 * &lt;enumeration value="Telemetry"/> &lt;enumeration
 * value="Telemetry-Satellite"/> &lt;enumeration value="Trainer"/>
 * &lt;enumeration value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCEF")
@XmlEnum
public enum ListCEF {

  @XmlEnumValue("Broadcast Radio/Television")
  VALUE_1("Broadcast Radio/Television"),
  @XmlEnumValue("Broadcast-Satellite")
  VALUE_2("Broadcast-Satellite"),
  @XmlEnumValue("Collision Avoidance")
  VALUE_3("Collision Avoidance"),
  @XmlEnumValue("Comms-Air Traffic Control")
  VALUE_4("Comms-Air Traffic Control"),
  @XmlEnumValue("Comms-Data")
  VALUE_5("Comms-Data"),
  @XmlEnumValue("Comms-Emergency")
  VALUE_6("Comms-Emergency"),
  @XmlEnumValue("Comms-Monitor")
  VALUE_7("Comms-Monitor"),
  @XmlEnumValue("Comms-P/P Or Net")
  VALUE_8("Comms-P/P Or Net"),
  @XmlEnumValue("Comms-Pager")
  VALUE_9("Comms-Pager"),
  @XmlEnumValue("Comms-Radio Relay")
  VALUE_10("Comms-Radio Relay"),
  @XmlEnumValue("Comms-Satellite")
  VALUE_11("Comms-Satellite"),
  @XmlEnumValue("Comms-Secure Voice")
  VALUE_12("Comms-Secure Voice"),
  @XmlEnumValue("Comms-Troposcatter")
  VALUE_13("Comms-Troposcatter"),
  @XmlEnumValue("Comms-Trunking")
  VALUE_14("Comms-Trunking"),
  @XmlEnumValue("Comms-Video")
  VALUE_15("Comms-Video"),
  @XmlEnumValue("Comms-Video/Data")
  VALUE_16("Comms-Video/Data"),
  @XmlEnumValue("Communications")
  VALUE_17("Communications"),
  @XmlEnumValue("Communications, Special")
  VALUE_18("Communications, Special"),
  @XmlEnumValue("Communications, Spread Spectrum")
  VALUE_19("Communications, Spread Spectrum"),
  @XmlEnumValue("Control")
  VALUE_20("Control"),
  @XmlEnumValue("Control-Guidance")
  VALUE_21("Control-Guidance"),
  @XmlEnumValue("Control-Satellite (Uplink)")
  VALUE_22("Control-Satellite (Uplink)"),
  @XmlEnumValue("Deep Space Mission")
  VALUE_23("Deep Space Mission"),
  @XmlEnumValue("Electronic Warfare")
  VALUE_24("Electronic Warfare"),
  @XmlEnumValue("Electroptical Equipment")
  VALUE_25("Electroptical Equipment"),
  @XmlEnumValue("Elint Reconnaissance")
  VALUE_26("Elint Reconnaissance"),
  @XmlEnumValue("EO-Forward Looking Infrared")
  VALUE_27("EO-Forward Looking Infrared"),
  @XmlEnumValue("EO-Forward Looking Radar")
  VALUE_28("EO-Forward Looking Radar"),
  @XmlEnumValue("EO-Infrared Countermeasures")
  VALUE_29("EO-Infrared Countermeasures"),
  @XmlEnumValue("EO-Infrared Search And Track")
  VALUE_30("EO-Infrared Search And Track"),
  @XmlEnumValue("EO-Infrared Seeker")
  VALUE_31("EO-Infrared Seeker"),
  @XmlEnumValue("EO-Infrared Surveillance")
  VALUE_32("EO-Infrared Surveillance"),
  @XmlEnumValue("EO-Infrared Warning Receiver")
  VALUE_33("EO-Infrared Warning Receiver"),
  @XmlEnumValue("EO-Laser Communications")
  VALUE_34("EO-Laser Communications"),
  @XmlEnumValue("EO-Laser Designator")
  VALUE_35("EO-Laser Designator"),
  @XmlEnumValue("EO-Laser Radar")
  VALUE_36("EO-Laser Radar"),
  @XmlEnumValue("EO-Laser Range Finder")
  VALUE_37("EO-Laser Range Finder"),
  @XmlEnumValue("EO-Laser Seeker")
  VALUE_38("EO-Laser Seeker"),
  @XmlEnumValue("EO-Laser Tracker")
  VALUE_39("EO-Laser Tracker"),
  @XmlEnumValue("EO-Laser Warning Receiver")
  VALUE_40("EO-Laser Warning Receiver"),
  @XmlEnumValue("EO-Laser Weapon")
  VALUE_41("EO-Laser Weapon"),
  @XmlEnumValue("EO-Night Vision/Image Intensifier")
  VALUE_42("EO-Night Vision/Image Intensifier"),
  @XmlEnumValue("EO-Night Vision/Thermal Image")
  VALUE_43("EO-Night Vision/Thermal Image"),
  @XmlEnumValue("EO-Surveillance")
  VALUE_44("EO-Surveillance"),
  @XmlEnumValue("EO-Telescope")
  VALUE_45("EO-Telescope"),
  @XmlEnumValue("EO-TV Seeker")
  VALUE_46("EO-TV Seeker"),
  @XmlEnumValue("EO-Ultraviolet Warning Receiver")
  VALUE_47("EO-Ultraviolet Warning Receiver"),
  @XmlEnumValue("EW-Active jamming")
  VALUE_48("EW-Active jamming"),
  @XmlEnumValue("EW-Anti-Satellite")
  VALUE_49("EW-Anti-Satellite"),
  @XmlEnumValue("EW-Anti-Satellite Target")
  VALUE_50("EW-Anti-Satellite Target"),
  @XmlEnumValue("EW-Deception")
  VALUE_51("EW-Deception"),
  @XmlEnumValue("EW-ECCM/EPM")
  VALUE_52("EW-ECCM/EPM"),
  @XmlEnumValue("EW-Frequency Hopping")
  VALUE_53("EW-Frequency Hopping"),
  @XmlEnumValue("EW-Intercept")
  VALUE_54("EW-Intercept"),
  @XmlEnumValue("EW-Jamming")
  VALUE_55("EW-Jamming"),
  @XmlEnumValue("EW-Jamming-Barrage")
  VALUE_56("EW-Jamming-Barrage"),
  @XmlEnumValue("EW-Jamming-Spot")
  VALUE_57("EW-Jamming-Spot"),
  @XmlEnumValue("EW-Jamming-Sweep")
  VALUE_58("EW-Jamming-Sweep"),
  @XmlEnumValue("EW-Radar Warning Receiver")
  VALUE_59("EW-Radar Warning Receiver"),
  @XmlEnumValue("EW-Reactive jamming")
  VALUE_60("EW-Reactive jamming"),
  @XmlEnumValue("Instrumentation")
  VALUE_61("Instrumentation"),
  @XmlEnumValue("Instrumentation-Calibration")
  VALUE_62("Instrumentation-Calibration"),
  @XmlEnumValue("Instrumentation-Equipment Monitor")
  VALUE_63("Instrumentation-Equipment Monitor"),
  @XmlEnumValue("Instrumentation-Frequency Standard")
  VALUE_64("Instrumentation-Frequency Standard"),
  @XmlEnumValue("Instrumentation-Test Equipment")
  VALUE_65("Instrumentation-Test Equipment"),
  @XmlEnumValue("Instrumentation-Test Range")
  VALUE_66("Instrumentation-Test Range"),
  @XmlEnumValue("Interrogator")
  VALUE_67("Interrogator"),
  @XmlEnumValue("Ionospheric Sounder")
  VALUE_68("Ionospheric Sounder"),
  @XmlEnumValue("Location")
  VALUE_69("Location"),
  @XmlEnumValue("Location-Homing")
  VALUE_70("Location-Homing"),
  @XmlEnumValue("Location-Intrusion Detector")
  VALUE_71("Location-Intrusion Detector"),
  @XmlEnumValue("Location-Laser Reflector")
  VALUE_72("Location-Laser Reflector"),
  @XmlEnumValue("Location-Low-Light Level Television")
  VALUE_73("Location-Low-Light Level Television"),
  @XmlEnumValue("Location-Miss Distance Indicator (MDI)")
  VALUE_74("Location-Miss Distance Indicator (MDI)"),
  @XmlEnumValue("Location-Satellite Beacon")
  VALUE_75("Location-Satellite Beacon"),
  @XmlEnumValue("Location-Satellite Tracking")
  VALUE_76("Location-Satellite Tracking"),
  @XmlEnumValue("Location-Sonobuoy")
  VALUE_77("Location-Sonobuoy"),
  @XmlEnumValue("Location-Tracking/Ranging")
  VALUE_78("Location-Tracking/Ranging"),
  @XmlEnumValue("Manned Platform")
  VALUE_79("Manned Platform"),
  @XmlEnumValue("Meteor Burst")
  VALUE_80("Meteor Burst"),
  @XmlEnumValue("Meteorological Aid")
  VALUE_81("Meteorological Aid"),
  @XmlEnumValue("Meteorological Satellite")
  VALUE_82("Meteorological Satellite"),
  @XmlEnumValue("Missile Guidance")
  VALUE_83("Missile Guidance"),
  @XmlEnumValue("Missile Homing")
  VALUE_84("Missile Homing"),
  @XmlEnumValue("Missile Tracking")
  VALUE_85("Missile Tracking"),
  @XmlEnumValue("Nav-Altimeter")
  VALUE_86("Nav-Altimeter"),
  @XmlEnumValue("Nav-Beacon")
  VALUE_87("Nav-Beacon"),
  @XmlEnumValue("Nav-Direction Finder")
  VALUE_88("Nav-Direction Finder"),
  @XmlEnumValue("Nav-DME")
  VALUE_89("Nav-DME"),
  @XmlEnumValue("Nav-Drift Angle Measurement")
  VALUE_90("Nav-Drift Angle Measurement"),
  @XmlEnumValue("Nav-GPS/Navstar")
  VALUE_91("Nav-GPS/Navstar"),
  @XmlEnumValue("Nav-IFF/SIF")
  VALUE_92("Nav-IFF/SIF"),
  @XmlEnumValue("Navigation Aids")
  VALUE_93("Navigation Aids"),
  @XmlEnumValue("Nav-ILS")
  VALUE_94("Nav-ILS"),
  @XmlEnumValue("Nav-Localizer")
  VALUE_95("Nav-Localizer"),
  @XmlEnumValue("Nav-LORAC")
  VALUE_96("Nav-LORAC"),
  @XmlEnumValue("Nav-LORAN")
  VALUE_97("Nav-LORAN"),
  @XmlEnumValue("Nav-MLS")
  VALUE_98("Nav-MLS"),
  @XmlEnumValue("Nav-Navigation Transponder")
  VALUE_99("Nav-Navigation Transponder"),
  @XmlEnumValue("Nav-SHORAN")
  VALUE_100("Nav-SHORAN"),
  @XmlEnumValue("Nav-Space Based Navigation Aid")
  VALUE_101("Nav-Space Based Navigation Aid"),
  @XmlEnumValue("Nav-TACAN")
  VALUE_102("Nav-TACAN"),
  @XmlEnumValue("Nav-VOR")
  VALUE_103("Nav-VOR"),
  @XmlEnumValue("Nav-VORTAC")
  VALUE_104("Nav-VORTAC"),
  @XmlEnumValue("Nuclear Detonation Detection")
  VALUE_105("Nuclear Detonation Detection"),
  @XmlEnumValue("Optical Astronomy")
  VALUE_106("Optical Astronomy"),
  @XmlEnumValue("Photo Reconnaissance")
  VALUE_107("Photo Reconnaissance"),
  @XmlEnumValue("Radar")
  VALUE_108("Radar"),
  @XmlEnumValue("Radar Calibration Aid")
  VALUE_109("Radar Calibration Aid"),
  @XmlEnumValue("Radar Intercept")
  VALUE_110("Radar Intercept"),
  @XmlEnumValue("Radar Navigation")
  VALUE_111("Radar Navigation"),
  @XmlEnumValue("Radar Transponder")
  VALUE_112("Radar Transponder"),
  @XmlEnumValue("Radar, Spread Spectrum")
  VALUE_113("Radar, Spread Spectrum"),
  @XmlEnumValue("Radar-Acquisition")
  VALUE_114("Radar-Acquisition"),
  @XmlEnumValue("Radar-Bombing")
  VALUE_115("Radar-Bombing"),
  @XmlEnumValue("Radar-CW")
  VALUE_116("Radar-CW"),
  @XmlEnumValue("Radar-Doppler")
  VALUE_117("Radar-Doppler"),
  @XmlEnumValue("Radar-Duplex Repeater")
  VALUE_118("Radar-Duplex Repeater"),
  @XmlEnumValue("Radar-Fire Control")
  VALUE_119("Radar-Fire Control"),
  @XmlEnumValue("Radar-Ground Control Approach")
  VALUE_120("Radar-Ground Control Approach"),
  @XmlEnumValue("Radar-Height Finder")
  VALUE_121("Radar-Height Finder"),
  @XmlEnumValue("Radar-Illuminator")
  VALUE_122("Radar-Illuminator"),
  @XmlEnumValue("Radar-Mapping")
  VALUE_123("Radar-Mapping"),
  @XmlEnumValue("Radar-Meteorological")
  VALUE_124("Radar-Meteorological"),
  @XmlEnumValue("Radar-Monopulse")
  VALUE_125("Radar-Monopulse"),
  @XmlEnumValue("Radar-Over The Horizon")
  VALUE_126("Radar-Over The Horizon"),
  @XmlEnumValue("Radar-Precision Approach")
  VALUE_127("Radar-Precision Approach"),
  @XmlEnumValue("Radar-Pulse Compression")
  VALUE_128("Radar-Pulse Compression"),
  @XmlEnumValue("Radar-Ranging")
  VALUE_129("Radar-Ranging"),
  @XmlEnumValue("Radar-Reconnaissance")
  VALUE_130("Radar-Reconnaissance"),
  @XmlEnumValue("Radar-Search")
  VALUE_131("Radar-Search"),
  @XmlEnumValue("Radar-Side Looking")
  VALUE_132("Radar-Side Looking"),
  @XmlEnumValue("Radar-Space-Based")
  VALUE_133("Radar-Space-Based"),
  @XmlEnumValue("Radar-Special")
  VALUE_134("Radar-Special"),
  @XmlEnumValue("Radar-Synthetic Aperture")
  VALUE_135("Radar-Synthetic Aperture"),
  @XmlEnumValue("Radar-Tail Warning")
  VALUE_136("Radar-Tail Warning"),
  @XmlEnumValue("Radar-Target Acquisition")
  VALUE_137("Radar-Target Acquisition"),
  @XmlEnumValue("Radar-Terrain Avoidance")
  VALUE_138("Radar-Terrain Avoidance"),
  @XmlEnumValue("Radar-Terrain Following")
  VALUE_139("Radar-Terrain Following"),
  @XmlEnumValue("Radar-Tracking")
  VALUE_140("Radar-Tracking"),
  @XmlEnumValue("Radar-Track-While Scan")
  VALUE_141("Radar-Track-While Scan"),
  @XmlEnumValue("Radar-Transponder")
  VALUE_142("Radar-Transponder"),
  @XmlEnumValue("Radar-Velocity Measurement")
  VALUE_143("Radar-Velocity Measurement"),
  @XmlEnumValue("Radar-Warfare Simulator")
  VALUE_144("Radar-Warfare Simulator"),
  @XmlEnumValue("Radar-Weather Avoidance")
  VALUE_145("Radar-Weather Avoidance"),
  @XmlEnumValue("Radio Astronomy")
  VALUE_146("Radio Astronomy"),
  @XmlEnumValue("Radiosonde")
  VALUE_147("Radiosonde"),
  @XmlEnumValue("Remote Sensing")
  VALUE_148("Remote Sensing"),
  @XmlEnumValue("Research")
  VALUE_149("Research"),
  @XmlEnumValue("Retransmission")
  VALUE_150("Retransmission"),
  @XmlEnumValue("Scientific Investigation")
  VALUE_151("Scientific Investigation"),
  @XmlEnumValue("Search And Rescue")
  VALUE_152("Search And Rescue"),
  @XmlEnumValue("Seeker")
  VALUE_153("Seeker"),
  @XmlEnumValue("Signal Collection")
  VALUE_154("Signal Collection"),
  @XmlEnumValue("Simulator")
  VALUE_155("Simulator"),
  @XmlEnumValue("Space-Based Surveillance")
  VALUE_156("Space-Based Surveillance"),
  @XmlEnumValue("Submarine Buoy")
  VALUE_157("Submarine Buoy"),
  @XmlEnumValue("Telemetry")
  VALUE_158("Telemetry"),
  @XmlEnumValue("Telemetry-Satellite")
  VALUE_159("Telemetry-Satellite"),
  @XmlEnumValue("Trainer")
  VALUE_160("Trainer"),
  @XmlEnumValue("Other")
  VALUE_161("Other");
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
      }
    }
    throw new IllegalArgumentException(v);
  }

}
