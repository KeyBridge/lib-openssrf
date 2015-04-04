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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;

/**
 * IntfReport contains information on a source and victim of an interference
 * incident.
 * <p>
 * Sub-Element is {@link POCInformation}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntfReport", propOrder = {
  "helpRequired",
  "intfPeriod",
  "intfStartDateTime",
  "intfStopDateTime",
  "intfDescr",
  "affectedEquipment",
  "sourceFieldStrength",
  "sourceLon",
  "sourceLat",
  "sourceAz",
  "sourceLocDescr",
  "sourceFreqMin",
  "sourceFreqMax",
  "sourceEmsClass",
  "sourceEmsBw",
  "victimAsgnRef",
  "victimSystem",
  "victimCountry",
  "victimLon",
  "victimLat",
  "victimLocDescr",
  "victimFreqMin",
  "victimFreqMax",
  "satelliteName",
  "satelliteChannel",
  "satelliteUplinkFreq",
  "performanceEffects",
  "evaluation",
  "solution",
  "affectedCSA",
  "characteristics",
  "gpsAffected",
  "localEventID",
  "netCircuitsAffected",
  "netsAffected",
  "satcomPriority",
  "satelliteAffected",
  "satelliteDownlinkPolarisation",
  "satelliteHemisphere",
  "satelliteLongitude",
  "satelliteTransponderID",
  "satelliteUplinkPolarisation",
  "pocInformation"
})
public class IntfReport extends Common<IntfReport> {

  /**
   * HelpRequired - Help Required (Optional)
   * <p>
   * Whether the user needs technical assistance from another organisation to
   * solve the interference. If not used, consider as "No".
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HelpRequired", required = false)
  private TString helpRequired;
  /**
   * IntfPeriod - Interference Period (Optional)
   * <p>
   * How often the interference is experienced.
   * <p>
   * Format is L:CTI
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IntfPeriod", required = false)
  private TString intfPeriod;
  /**
   * IntfStartDateTime - Interference Start Date/Time (Required)
   * <p>
   * The date/time the interference was first perceived.
   * <p>
   * Format is DT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IntfStartDateTime", required = true)
  private DT intfStartDateTime;
  /**
   * IntfStopDateTime - Interference Stop Date/Time (Optional)
   * <p>
   * The date/time the interference ceased.
   * <p>
   * Format is DT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IntfStopDateTime", required = false)
  private DT intfStopDateTime;
  /**
   * In Data Item IntfDescr, describe the interference. Provide as much
   * information as possible. State what actions you have taken so far to
   * resolve the interference.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IntfDescr", required = false)
  private MEMO intfDescr;
  /**
   * AffectedEquipment - Victim Equipment Description (Optional)
   * <p>
   * The nomenclature or description of equipment experiencing the interference.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AffectedEquipment", required = false)
  private S100 affectedEquipment;
  /**
   * SourceFieldStrength - Field Strength (Optional)
   * <p>
   * The measured electromagnetic field strength.
   * <p>
   * Format is UN(6,1) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceFieldStrength", required = false)
  private FieldStrength sourceFieldStrength;
  /**
   * SourceLon - Longitude of the Source (Optional)
   * <p>
   * The geographical longitude (degrees, minutes, seconds, and hemisphere E or
   * W) of the source of the interference. If the seconds are not known, use 00.
   * Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. Enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
   * [0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * Format is pattern (S11)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceLon", required = false)
  private Lon sourceLon;
  /**
   * SourceLat - Latitude of the Source (Optional)
   * <p>
   * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
   * of the source of the interference. Same remarks for seconds and leading
   * zeros. Enter N or S immediately following the seconds. The format is:
   * ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * Format is pattern (S10)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceLat", required = false)
  private Lat sourceLat;
  /**
   * SourceAz - Source Azimuth (Optional)
   * <p>
   * The measured azimuth of the source from the victim.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceAz", required = false)
  private Az sourceAz;
  /**
   * SourceLocDescr - Location Description of the Source (Optional)
   * <p>
   * The approximate position the source, if exact coordinates are not known.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceLocDescr", required = false)
  private S255 sourceLocDescr;
  /**
   * SourceFreqMin - Minimum Source Frequency (Optional)
   * <p>
   * The nominal frequency of the interference, or the minimum frequency in case
   * of a range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceFreqMin", required = false)
  private FreqM sourceFreqMin;
  /**
   * SourceFreqMax - Maximum Source Frequency (Optional)
   * <p>
   * The maximum frequency of the interference, in case of a range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceFreqMax", required = false)
  private FreqM sourceFreqMax;
  /**
   * In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to five
   * characters code, derived from the table below, representing the emission
   * classification. If an "X" is used in any of the symbols, Remarks SHOULD be
   * used to explain the nature of the signal. First Symbol - Designates Type of
   * Modulation of the Main Carrier Unmodulated N - Emission of unmodulated
   * carrier Amplitude Modulated A - Double sideband H - Single sideband, full
   * carrier R - Single sideband, reduced or variable level carrier J - Single
   * sideband, suppressed carrier B - Independent sidebands C - Vestigial
   * sidebands Angle-Modulated F - Frequency modulation G - Phase modulation
   * Amplitude and Angle-Modulated D - Main carrier is amplitude-modulated and
   * angle-modulated simultaneously or in a preestablished sequence Pulse P -
   * Sequence of unmodulated pulses K - Modulated in amplitude L - Modulated in
   * width/duration M - Modulated in position phase Q - Carrier is
   * angle-modulated during the period of the pulse V - Combination of the
   * foregoing or is produced by other means Combination W - Cases not covered
   * above in which an emission consists of the main carrier being modulated,
   * either simultaneously or in a preestablished sequence, in a combination of
   * two or more of the following modes: amplitude, angle, pulse Other X - Cases
   * not otherwise covered - : Unknown (to be used only by legacy data) Second
   * Symbol - Designates the Nature of Signal(s) Modulating the Main Carrier 0 -
   * No modulating signal 1 - A single channel containing quantised or digital
   * information, not using a modulating subcarrier. (Excludes time-division
   * multiplex) 2 - A single channel containing quantised or digital
   * information, using a modulating subcarrier 3 - A single channel containing
   * analogue information 7 - Two or more channels containing quantised or
   * digital information 8 - Two or more channels containing analogue
   * information 9 - Composite system with one or more channels containing
   * quantised or digital information, together with one or more channels
   * containing analogue information X - Cases not otherwise covered - : Unknown
   * (to be used only by legacy data) Third Symbol - Type of Information to be
   * Transmitted a N - No information transmitted A - Telegraphy - for aural
   * reception B - Telegraphy - for automatic reception C - Facsimile D - Data
   * transmission, telemetry, telecommand E - Telephony (including sound
   * broadcasting) F - Television (video) W - Combination of the above X - Cases
   * not otherwise covered. - : Unknown (to be used only by legacy data) a In
   * this context, the word "information" does not include information of a
   * constant, unvarying, nature such as that provided by standard frequency
   * emissions, continuous wave, pulse radars, etc. b A full explanation for the
   * selection of the letter X shall be provided in Information unless the
   * application is for a non-directional beacon in the bands 190-435 and
   * 510-535 kHz. Fourth Symbol - Designates the Details of Signal(s) A -
   * Two-condition code with elements of differing numbers and/or durations B -
   * Two-condition code with elements of the same number and duration without
   * error correction C - Two-condition code with elements of the same number
   * and duration with error correction D - Four-condition code in which each
   * condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
   * W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?"
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceEmsClass", required = false)
  private EmsDes sourceEmsClass;
  /**
   * SourceEmsBw - Emission Bandwidth of the interference source (Optional)
   * <p>
   * The calculated or measured bandwidth of the interference source.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SourceEmsBw", required = false)
  private FreqM sourceEmsBw;
  /**
   * In Data Item VictimAsgnRef, Enter the serial number of the assignment
   * victim of the interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimAsgnRef", required = false)
  private Serial victimAsgnRef;
  /**
   * VictimSystem - Victim System (Optional)
   * <p>
   * The nomenclature or other identifier of equipment experiencing the
   * interference.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimSystem", required = false)
  private S100 victimSystem;
  /**
   * VictimCountry - Country/Area of the Victim (Optional)
   * <p>
   * The country or area where the victim of the interference is located.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimCountry", required = false)
  private TString victimCountry;
  /**
   * VictimLon - Longitude of the Victim (Optional)
   * <p>
   * The geographical longitude (degrees, minutes, seconds, and hemisphere E or
   * W) of the victim of the interference. If the seconds are not known, use 00.
   * Use leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. Enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * Format is pattern (S11)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimLon", required = false)
  private Lon victimLon;
  /**
   * VictimLat - Latitude of the Victim (Optional)
   * <p>
   * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
   * of the victim of the interference. Same remarks for seconds and leading
   * zeros. Enter N or S immediately following the seconds. The format is:
   * ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * Format is pattern (S10)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimLat", required = false)
  private Lat victimLat;
  /**
   * VictimLocDescr - Location Description of the Victim (Optional)
   * <p>
   * The approximate position the victim of the interference, if exact
   * coordinates are not known.
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimLocDescr", required = false)
  private S255 victimLocDescr;
  /**
   * VictimFreqMin - Minimum Victim Frequency (Required)
   * <p>
   * The nominal or lower frequency used by the victim of the interference.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimFreqMin", required = true)
  private FreqM victimFreqMin;
  /**
   * VictimFreqMax - Maximum Victim Frequency (Optional)
   * <p>
   * The upper frequency of the range, in case of an assignment over a frequency
   * range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VictimFreqMax", required = false)
  private FreqM victimFreqMax;
  /**
   * SatelliteName - Victim Satellite Name (Optional)
   * <p>
   * The name of the satellite experiencing the interference.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteName", required = false)
  private S50 satelliteName;
  /**
   * SatelliteChannel - Victim Satellite Channel (Optional)
   * <p>
   * The identifier of satellite channel experiencing the interference.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteChannel", required = false)
  private S50 satelliteChannel;
  /**
   * SatelliteUplinkFreq - Victim Satellite Uplink Freq (Optional)
   * <p>
   * The satellite uplink frequency experiencing the interference
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteUplinkFreq", required = false)
  private FreqM satelliteUplinkFreq;
  /**
   * PerformanceEffects - Effects On Performance (Optional)
   * <p>
   * The effect the interference has on normal operations.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PerformanceEffects", required = false)
  private MEMO performanceEffects;
  /**
   * Evaluation - Evaluation (Optional)
   * <p>
   * Your best guess as to the cause of the interference.
   * <p>
   * Format is L:CJ1
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Evaluation", required = false)
  private TString evaluation;
  /**
   * Solution - Description of the Solution (Optional)
   * <p>
   * What actions were taken to resolve the interference.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Solution", required = false)
  private MEMO solution;
  /**
   * US:AffectedCSA - Affected CSA (Optional)
   * <p>
   * The responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization.
   * <p>
   * Format is L:UAG
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AffectedCSA", required = false)
  private TString affectedCSA;
  /**
   * US:Characteristics - Characteristics (Optional)
   * <p>
   * The interference characteristics.
   * <p>
   * Format is L:UCH
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Characteristics", required = false)
  private TString characteristics;
  /**
   * US:GPSAffected - GPS Affected (Optional)
   * <p>
   * Whether the interference affects GPS reception.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GPSAffected", required = false)
  private TString gpsAffected;
  /**
   * US:LocalEventID - Local Event ID (Optional)
   * <p>
   * The local event ID.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LocalEventID", required = false)
  private S20 localEventID;
  /**
   * US:NetCircuitsAffected - Net Circuits Affected (Optional)
   * <p>
   * The network circuits affected by the interference.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NetCircuitsAffected", required = false)
  private MEMO netCircuitsAffected;
  /**
   * US:NetsAffected - Nets Affected (Optional)
   * <p>
   * The networks affected by the interference.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NetsAffected", required = false)
  private MEMO netsAffected;
  /**
   * US:SATCOMPriority - SATCOM Priority (Optional)
   * <p>
   * The satellite communication priority.
   * <p>
   * Format is L:UPR
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SATCOMPriority", required = false)
  private TString satcomPriority;
  /**
   * US:SatelliteAffected - Satellite Affected (Optional)
   * <p>
   * Whether the interference affects satellite reception.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteAffected", required = false)
  private TString satelliteAffected;
  /**
   * US:SatelliteDownlinkPolarisation - Satellite Downlink Polarisation
   * (Optional)
   * <p>
   * The polarisation of the satellite downlink signal.
   * <p>
   * Format is L:CPO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteDownlinkPolarisation", required = false)
  private TString satelliteDownlinkPolarisation;
  /**
   * US:SatelliteHemisphere - Satellite Hemisphere (Optional)
   * <p>
   * The satellite hemisphere.
   * <p>
   * Format is L:CCO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteHemisphere", required = false)
  private TString satelliteHemisphere;
  /**
   * US:SatelliteLongitude - Satellite Longitude (Optional)
   * <p>
   * The satellite longitude.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1
   * (US),2})?)|1800000)(E|W))|X"
   * <p>
   * Format is pattern (S11)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteLongitude", required = false)
  private Lon satelliteLongitude;
  /**
   * US:SatelliteTransponderID - Satellite Transponder ID (Optional)
   * <p>
   * The satellite transponder ID.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteTransponderID", required = false)
  private S50 satelliteTransponderID;
  /**
   * US:SatelliteUplinkPolarisation - Satellite Uplink Polarisation (Optional)
   * <p>
   * The polarisation of the satellite uplink signal.
   * <p>
   * Format is L:CPO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SatelliteUplinkPolarisation", required = false)
  private TString satelliteUplinkPolarisation;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public IntfReport() {
    super();
  }

  /**
   * Get whether the user needs technical assistance from another organisation
   * to solve the interference. If not used, consider as "No"..
   * <p>
   * @return the HelpRequired value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getHelpRequired() {
    return helpRequired;
  }

  /**
   * Set whether the user needs technical assistance from another organisation
   * to solve the interference. If not used, consider as "No"..
   * <p>
   * @param value the HelpRequired value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setHelpRequired(TString value) {
    this.helpRequired = value;
  }

  /**
   * Determine if the HelpRequired is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHelpRequired() {
    return (this.helpRequired != null ? this.helpRequired.isSetValue() : false);
  }

  /**
   * Get how often the interference is experienced..
   * <p>
   * @return the IntfPeriod value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIntfPeriod() {
    return intfPeriod;
  }

  /**
   * Set how often the interference is experienced..
   * <p>
   * @param value the IntfPeriod value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIntfPeriod(TString value) {
    this.intfPeriod = value;
  }

  /**
   * Determine if the IntfPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfPeriod() {
    return (this.intfPeriod != null ? this.intfPeriod.isSetValue() : false);
  }

  /**
   * Get the date/time the interference was first perceived..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getIntfStartDateTime() {
    return intfStartDateTime;
  }

  /**
   * Set the date/time the interference was first perceived..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setIntfStartDateTime(DT value) {
    this.intfStartDateTime = value;
  }

  /**
   * Determine if the IntfStartDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfStartDateTime() {
    return (this.intfStartDateTime != null ? this.intfStartDateTime.isSetValue() : false);
  }

  /**
   * Get the date/time the interference ceased..
   * <p>
   * @return a {@link DT} instance
   * @since 3.1.0
   */
  public DT getIntfStopDateTime() {
    return intfStopDateTime;
  }

  /**
   * Set the date/time the interference ceased..
   * <p>
   * @param value a {@link DT} instance
   * @since 3.1.0
   */
  public void setIntfStopDateTime(DT value) {
    this.intfStopDateTime = value;
  }

  /**
   * Determine if the IntfStopDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfStopDateTime() {
    return (this.intfStopDateTime != null ? this.intfStopDateTime.isSetValue() : false);
  }

  /**
   * Get In Data Item IntfDescr, describe the interference. Provide as much
   * information as possible. State what actions you have taken so far to
   * resolve the interference..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getIntfDescr() {
    return intfDescr;
  }

  /**
   * Set In Data Item IntfDescr, describe the interference. Provide as much
   * information as possible. State what actions you have taken so far to
   * resolve the interference..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setIntfDescr(MEMO value) {
    this.intfDescr = value;
  }

  /**
   * Determine if the IntfDescr is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfDescr() {
    return (this.intfDescr != null ? this.intfDescr.isSetValue() : false);
  }

  /**
   * Get the nomenclature or description of equipment experiencing the
   * interference..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getAffectedEquipment() {
    return affectedEquipment;
  }

  /**
   * Set the nomenclature or description of equipment experiencing the
   * interference..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setAffectedEquipment(S100 value) {
    this.affectedEquipment = value;
  }

  /**
   * Determine if the AffectedEquipment is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAffectedEquipment() {
    return (this.affectedEquipment != null ? this.affectedEquipment.isSetValue() : false);
  }

  /**
   * Get the measured electromagnetic field strength..
   * <p>
   * @return a {@link FieldStrength} instance
   * @since 3.1.0
   */
  public FieldStrength getSourceFieldStrength() {
    return sourceFieldStrength;
  }

  /**
   * Set the measured electromagnetic field strength..
   * <p>
   * @param value a {@link FieldStrength} instance
   * @since 3.1.0
   */
  public void setSourceFieldStrength(FieldStrength value) {
    this.sourceFieldStrength = value;
  }

  /**
   * Determine if the SourceFieldStrength is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceFieldStrength() {
    return (this.sourceFieldStrength != null ? this.sourceFieldStrength.isSetValue() : false);
  }

  /**
   * Get the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the source of the interference. If the seconds are not known, use
   * 00. Use leading zeros as appropriate for degrees, minutes, or seconds.
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
   * [0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X".
   * <p>
   * @return a {@link Lon} instance
   * @since 3.1.0
   */
  public Lon getSourceLon() {
    return sourceLon;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the source of the interference. If the seconds are not known, use
   * 00. Use leading zeros as appropriate for degrees, minutes, or seconds.
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
   * [0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X".
   * <p>
   * @param value a {@link Lon} instance
   * @since 3.1.0
   */
  public void setSourceLon(Lon value) {
    this.sourceLon = value;
  }

  /**
   * Determine if the SourceLon is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceLon() {
    return (this.sourceLon != null ? this.sourceLon.isSetValue() : false);
  }

  /**
   * Get the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the source of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X".
   * <p>
   * @return a {@link Lat} instance
   * @since 3.1.0
   */
  public Lat getSourceLat() {
    return sourceLat;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the source of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X".
   * <p>
   * @param value a {@link Lat} instance
   * @since 3.1.0
   */
  public void setSourceLat(Lat value) {
    this.sourceLat = value;
  }

  /**
   * Determine if the SourceLat is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceLat() {
    return (this.sourceLat != null ? this.sourceLat.isSetValue() : false);
  }

  /**
   * Get the measured azimuth of the source from the victim..
   * <p>
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getSourceAz() {
    return sourceAz;
  }

  /**
   * Set the measured azimuth of the source from the victim..
   * <p>
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setSourceAz(Az value) {
    this.sourceAz = value;
  }

  /**
   * Determine if the SourceAz is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceAz() {
    return (this.sourceAz != null ? this.sourceAz.isSetValue() : false);
  }

  /**
   * Get the approximate position the source, if exact coordinates are not
   * known..
   * <p>
   * @return a {@link S255} instance
   * @since 3.1.0
   */
  public S255 getSourceLocDescr() {
    return sourceLocDescr;
  }

  /**
   * Set the approximate position the source, if exact coordinates are not
   * known..
   * <p>
   * @param value a {@link S255} instance
   * @since 3.1.0
   */
  public void setSourceLocDescr(S255 value) {
    this.sourceLocDescr = value;
  }

  /**
   * Determine if the SourceLocDescr is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceLocDescr() {
    return (this.sourceLocDescr != null ? this.sourceLocDescr.isSetValue() : false);
  }

  /**
   * Get the nominal frequency of the interference, or the minimum frequency in
   * case of a range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getSourceFreqMin() {
    return sourceFreqMin;
  }

  /**
   * Set the nominal frequency of the interference, or the minimum frequency in
   * case of a range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setSourceFreqMin(FreqM value) {
    this.sourceFreqMin = value;
  }

  /**
   * Determine if the SourceFreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceFreqMin() {
    return (this.sourceFreqMin != null ? this.sourceFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum frequency of the interference, in case of a range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getSourceFreqMax() {
    return sourceFreqMax;
  }

  /**
   * Set the maximum frequency of the interference, in case of a range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setSourceFreqMax(FreqM value) {
    this.sourceFreqMax = value;
  }

  /**
   * Determine if the SourceFreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceFreqMax() {
    return (this.sourceFreqMax != null ? this.sourceFreqMax.isSetValue() : false);
  }

  /**
   * Get In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to
   * five characters code, derived from the table below, representing the
   * emission classification. If an "X" is used in any of the symbols, Remarks
   * SHOULD be used to explain the nature of the signal. First Symbol -
   * Designates Type of Modulation of the Main Carrier Unmodulated N - Emission
   * of unmodulated carrier Amplitude Modulated A - Double sideband H - Single
   * sideband, full carrier R - Single sideband, reduced or variable level
   * carrier J - Single sideband, suppressed carrier B - Independent sidebands C
   * - Vestigial sidebands Angle-Modulated F - Frequency modulation G - Phase
   * modulation Amplitude and Angle-Modulated D - Main carrier is
   * amplitude-modulated and angle-modulated simultaneously or in a
   * preestablished sequence Pulse P - Sequence of unmodulated pulses K -
   * Modulated in amplitude L - Modulated in width/duration M - Modulated in
   * position phase Q - Carrier is angle-modulated during the period of the
   * pulse V - Combination of the foregoing or is produced by other means
   * Combination W - Cases not covered above in which an emission consists of
   * the main carrier being modulated, either simultaneously or in a
   * preestablished sequence, in a combination of two or more of the following
   * modes: amplitude, angle, pulse Other X - Cases not otherwise covered - :
   * Unknown (to be used only by legacy data) Second Symbol - Designates the
   * Nature of Signal(s) Modulating the Main Carrier 0 - No modulating signal 1
   * - A single channel containing quantised or digital information, not using a
   * modulating subcarrier. (Excludes time-division multiplex) 2 - A single
   * channel containing quantised or digital information, using a modulating
   * subcarrier 3 - A single channel containing analogue information 7 - Two or
   * more channels containing quantised or digital information 8 - Two or more
   * channels containing analogue information 9 - Composite system with one or
   * more channels containing quantised or digital information, together with
   * one or more channels containing analogue information X - Cases not
   * otherwise covered - : Unknown (to be used only by legacy data) Third Symbol
   * - Type of Information to be Transmitted a N - No information transmitted A
   * - Telegraphy - for aural reception B - Telegraphy - for automatic reception
   * C - Facsimile D - Data transmission, telemetry, telecommand E - Telephony
   * (including sound broadcasting) F - Television (video) W - Combination of
   * the above X - Cases not otherwise covered. - : Unknown (to be used only by
   * legacy data) a In this context, the word "information" does not include
   * information of a constant, unvarying, nature such as that provided by
   * standard frequency emissions, continuous wave, pulse radars, etc. b A full
   * explanation for the selection of the letter X shall be provided in
   * Information unless the application is for a non-directional beacon in the
   * bands 190-435 and 510-535 kHz. Fourth Symbol - Designates the Details of
   * Signal(s) A - Two-condition code with elements of differing numbers and/or
   * durations B - Two-condition code with elements of the same number and
   * duration without error correction C - Two-condition code with elements of
   * the same number and duration with error correction D - Four-condition code
   * in which each condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
   * W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?".
   * <p>
   * @return a {@link EmsDes} instance
   * @since 3.1.0
   */
  public EmsDes getSourceEmsClass() {
    return sourceEmsClass;
  }

  /**
   * Set In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to
   * five characters code, derived from the table below, representing the
   * emission classification. If an "X" is used in any of the symbols, Remarks
   * SHOULD be used to explain the nature of the signal. First Symbol -
   * Designates Type of Modulation of the Main Carrier Unmodulated N - Emission
   * of unmodulated carrier Amplitude Modulated A - Double sideband H - Single
   * sideband, full carrier R - Single sideband, reduced or variable level
   * carrier J - Single sideband, suppressed carrier B - Independent sidebands C
   * - Vestigial sidebands Angle-Modulated F - Frequency modulation G - Phase
   * modulation Amplitude and Angle-Modulated D - Main carrier is
   * amplitude-modulated and angle-modulated simultaneously or in a
   * preestablished sequence Pulse P - Sequence of unmodulated pulses K -
   * Modulated in amplitude L - Modulated in width/duration M - Modulated in
   * position phase Q - Carrier is angle-modulated during the period of the
   * pulse V - Combination of the foregoing or is produced by other means
   * Combination W - Cases not covered above in which an emission consists of
   * the main carrier being modulated, either simultaneously or in a
   * preestablished sequence, in a combination of two or more of the following
   * modes: amplitude, angle, pulse Other X - Cases not otherwise covered - :
   * Unknown (to be used only by legacy data) Second Symbol - Designates the
   * Nature of Signal(s) Modulating the Main Carrier 0 - No modulating signal 1
   * - A single channel containing quantised or digital information, not using a
   * modulating subcarrier. (Excludes time-division multiplex) 2 - A single
   * channel containing quantised or digital information, using a modulating
   * subcarrier 3 - A single channel containing analogue information 7 - Two or
   * more channels containing quantised or digital information 8 - Two or more
   * channels containing analogue information 9 - Composite system with one or
   * more channels containing quantised or digital information, together with
   * one or more channels containing analogue information X - Cases not
   * otherwise covered - : Unknown (to be used only by legacy data) Third Symbol
   * - Type of Information to be Transmitted a N - No information transmitted A
   * - Telegraphy - for aural reception B - Telegraphy - for automatic reception
   * C - Facsimile D - Data transmission, telemetry, telecommand E - Telephony
   * (including sound broadcasting) F - Television (video) W - Combination of
   * the above X - Cases not otherwise covered. - : Unknown (to be used only by
   * legacy data) a In this context, the word "information" does not include
   * information of a constant, unvarying, nature such as that provided by
   * standard frequency emissions, continuous wave, pulse radars, etc. b A full
   * explanation for the selection of the letter X shall be provided in
   * Information unless the application is for a non-directional beacon in the
   * bands 190-435 and 510-535 kHz. Fourth Symbol - Designates the Details of
   * Signal(s) A - Two-condition code with elements of differing numbers and/or
   * durations B - Two-condition code with elements of the same number and
   * duration without error correction C - Two-condition code with elements of
   * the same number and duration with error correction D - Four-condition code
   * in which each condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
   * W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?".
   * <p>
   * @param value a {@link EmsDes} instance
   * @since 3.1.0
   */
  public void setSourceEmsClass(EmsDes value) {
    this.sourceEmsClass = value;
  }

  /**
   * Determine if the SourceEmsClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceEmsClass() {
    return (this.sourceEmsClass != null ? this.sourceEmsClass.isSetValue() : false);
  }

  /**
   * Get the calculated or measured bandwidth of the interference source..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getSourceEmsBw() {
    return sourceEmsBw;
  }

  /**
   * Set the calculated or measured bandwidth of the interference source..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setSourceEmsBw(FreqM value) {
    this.sourceEmsBw = value;
  }

  /**
   * Determine if the SourceEmsBw is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceEmsBw() {
    return (this.sourceEmsBw != null ? this.sourceEmsBw.isSetValue() : false);
  }

  /**
   * Get In Data Item VictimAsgnRef, Enter the serial number of the assignment
   * victim of the interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getVictimAssignment()} instead.
   */
  @Deprecated
  public Serial getVictimAsgnRef() {
    return victimAsgnRef;
  }

  /**
   * Set In Data Item VictimAsgnRef, Enter the serial number of the assignment
   * victim of the interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setVictimAssignment(Assignment)} instead.
   */
  @Deprecated
  public void setVictimAsgnRef(Serial value) {
    this.victimAsgnRef = value;
  }

  /**
   * Determine if the VictimAsgnRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimAsgnRef() {
    return (this.victimAsgnRef != null ? this.victimAsgnRef.isSetValue() : false);
  }

  /**
   * Get the nomenclature or other identifier of equipment experiencing the
   * interference..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getVictimSystem() {
    return victimSystem;
  }

  /**
   * Set the nomenclature or other identifier of equipment experiencing the
   * interference..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setVictimSystem(S100 value) {
    this.victimSystem = value;
  }

  /**
   * Determine if the VictimSystem is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimSystem() {
    return (this.victimSystem != null ? this.victimSystem.isSetValue() : false);
  }

  /**
   * Get the country or area where the victim of the interference is located..
   * <p>
   * @return the VictimCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getVictimCountry() {
    return victimCountry;
  }

  /**
   * Set the country or area where the victim of the interference is located..
   * <p>
   * @param value the VictimCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setVictimCountry(TString value) {
    this.victimCountry = value;
  }

  /**
   * Determine if the VictimCountry is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimCountry() {
    return (this.victimCountry != null ? this.victimCountry.isSetValue() : false);
  }

  /**
   * Get the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the victim of the interference. If the seconds are not known, use
   * 00. Use leading zeros as appropriate for degrees, minutes, or seconds.
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X".
   * <p>
   * @return a {@link Lon} instance
   * @since 3.1.0
   */
  public Lon getVictimLon() {
    return victimLon;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the victim of the interference. If the seconds are not known, use
   * 00. Use leading zeros as appropriate for degrees, minutes, or seconds.
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X".
   * <p>
   * @param value a {@link Lon} instance
   * @since 3.1.0
   */
  public void setVictimLon(Lon value) {
    this.victimLon = value;
  }

  /**
   * Determine if the VictimLon is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimLon() {
    return (this.victimLon != null ? this.victimLon.isSetValue() : false);
  }

  /**
   * Get the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the victim of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X".
   * <p>
   * @return a {@link Lat} instance
   * @since 3.1.0
   */
  public Lat getVictimLat() {
    return victimLat;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the victim of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X".
   * <p>
   * @param value a {@link Lat} instance
   * @since 3.1.0
   */
  public void setVictimLat(Lat value) {
    this.victimLat = value;
  }

  /**
   * Determine if the VictimLat is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimLat() {
    return (this.victimLat != null ? this.victimLat.isSetValue() : false);
  }

  /**
   * Get the approximate position the victim of the interference, if exact
   * coordinates are not known..
   * <p>
   * @return a {@link S255} instance
   * @since 3.1.0
   */
  public S255 getVictimLocDescr() {
    return victimLocDescr;
  }

  /**
   * Set the approximate position the victim of the interference, if exact
   * coordinates are not known..
   * <p>
   * @param value a {@link S255} instance
   * @since 3.1.0
   */
  public void setVictimLocDescr(S255 value) {
    this.victimLocDescr = value;
  }

  /**
   * Determine if the VictimLocDescr is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimLocDescr() {
    return (this.victimLocDescr != null ? this.victimLocDescr.isSetValue() : false);
  }

  /**
   * Get the nominal or lower frequency used by the victim of the interference..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getVictimFreqMin() {
    return victimFreqMin;
  }

  /**
   * Set the nominal or lower frequency used by the victim of the interference..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setVictimFreqMin(FreqM value) {
    this.victimFreqMin = value;
  }

  /**
   * Determine if the VictimFreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimFreqMin() {
    return (this.victimFreqMin != null ? this.victimFreqMin.isSetValue() : false);
  }

  /**
   * Get the upper frequency of the range, in case of an assignment over a
   * frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getVictimFreqMax() {
    return victimFreqMax;
  }

  /**
   * Set the upper frequency of the range, in case of an assignment over a
   * frequency range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setVictimFreqMax(FreqM value) {
    this.victimFreqMax = value;
  }

  /**
   * Determine if the VictimFreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimFreqMax() {
    return (this.victimFreqMax != null ? this.victimFreqMax.isSetValue() : false);
  }

  /**
   * Get the name of the satellite experiencing the interference..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getSatelliteName() {
    return satelliteName;
  }

  /**
   * Set the name of the satellite experiencing the interference..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setSatelliteName(S50 value) {
    this.satelliteName = value;
  }

  /**
   * Determine if the SatelliteName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteName() {
    return (this.satelliteName != null ? this.satelliteName.isSetValue() : false);
  }

  /**
   * Get the identifier of satellite channel experiencing the interference..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getSatelliteChannel() {
    return satelliteChannel;
  }

  /**
   * Set the identifier of satellite channel experiencing the interference..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setSatelliteChannel(S50 value) {
    this.satelliteChannel = value;
  }

  /**
   * Determine if the SatelliteChannel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteChannel() {
    return (this.satelliteChannel != null ? this.satelliteChannel.isSetValue() : false);
  }

  /**
   * Get the satellite uplink frequency experiencing the interference.
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getSatelliteUplinkFreq() {
    return satelliteUplinkFreq;
  }

  /**
   * Set the satellite uplink frequency experiencing the interference.
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setSatelliteUplinkFreq(FreqM value) {
    this.satelliteUplinkFreq = value;
  }

  /**
   * Determine if the SatelliteUplinkFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteUplinkFreq() {
    return (this.satelliteUplinkFreq != null ? this.satelliteUplinkFreq.isSetValue() : false);
  }

  /**
   * Get the effect the interference has on normal operations..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getPerformanceEffects() {
    return performanceEffects;
  }

  /**
   * Set the effect the interference has on normal operations..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setPerformanceEffects(MEMO value) {
    this.performanceEffects = value;
  }

  /**
   * Determine if the PerformanceEffects is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPerformanceEffects() {
    return (this.performanceEffects != null ? this.performanceEffects.isSetValue() : false);
  }

  /**
   * Get your best guess as to the cause of the interference..
   * <p>
   * @return the Evaluation value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getEvaluation() {
    return evaluation;
  }

  /**
   * Set your best guess as to the cause of the interference..
   * <p>
   * @param value the Evaluation value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setEvaluation(TString value) {
    this.evaluation = value;
  }

  /**
   * Determine if the Evaluation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEvaluation() {
    return (this.evaluation != null ? this.evaluation.isSetValue() : false);
  }

  /**
   * Get what actions were taken to resolve the interference..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getSolution() {
    return solution;
  }

  /**
   * Set what actions were taken to resolve the interference..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setSolution(MEMO value) {
    this.solution = value;
  }

  /**
   * Determine if the Solution is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSolution() {
    return (this.solution != null ? this.solution.isSetValue() : false);
  }

  /**
   * Get the responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization..
   * <p>
   * @return the AffectedCSA value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAffectedCSA() {
    return affectedCSA;
  }

  /**
   * Set the responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization..
   * <p>
   * @param value the AffectedCSA value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAffectedCSA(TString value) {
    this.affectedCSA = value;
  }

  /**
   * Determine if the AffectedCSA is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAffectedCSA() {
    return (this.affectedCSA != null ? this.affectedCSA.isSetValue() : false);
  }

  /**
   * Get the interference characteristics..
   * <p>
   * @return the Characteristics value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCharacteristics() {
    return characteristics;
  }

  /**
   * Set the interference characteristics..
   * <p>
   * @param value the Characteristics value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCharacteristics(TString value) {
    this.characteristics = value;
  }

  /**
   * Determine if the Characteristics is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCharacteristics() {
    return (this.characteristics != null ? this.characteristics.isSetValue() : false);
  }

  /**
   * Get whether the interference affects GPS reception..
   * <p>
   * @return the GPSAffected value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getGPSAffected() {
    return gpsAffected;
  }

  /**
   * Set whether the interference affects GPS reception..
   * <p>
   * @param value the GPSAffected value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setGPSAffected(TString value) {
    this.gpsAffected = value;
  }

  /**
   * Determine if the GPSAffected is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGPSAffected() {
    return (this.gpsAffected != null ? this.gpsAffected.isSetValue() : false);
  }

  /**
   * Get the local event ID..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getLocalEventID() {
    return localEventID;
  }

  /**
   * Set the local event ID..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setLocalEventID(S20 value) {
    this.localEventID = value;
  }

  /**
   * Determine if the LocalEventID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocalEventID() {
    return (this.localEventID != null ? this.localEventID.isSetValue() : false);
  }

  /**
   * Get the network circuits affected by the interference..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getNetCircuitsAffected() {
    return netCircuitsAffected;
  }

  /**
   * Set the network circuits affected by the interference..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setNetCircuitsAffected(MEMO value) {
    this.netCircuitsAffected = value;
  }

  /**
   * Determine if the NetCircuitsAffected is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetCircuitsAffected() {
    return (this.netCircuitsAffected != null ? this.netCircuitsAffected.isSetValue() : false);
  }

  /**
   * Get the networks affected by the interference..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getNetsAffected() {
    return netsAffected;
  }

  /**
   * Set the networks affected by the interference..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setNetsAffected(MEMO value) {
    this.netsAffected = value;
  }

  /**
   * Determine if the NetsAffected is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetsAffected() {
    return (this.netsAffected != null ? this.netsAffected.isSetValue() : false);
  }

  /**
   * Get the satellite communication priority..
   * <p>
   * @return the SATCOMPriority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSATCOMPriority() {
    return satcomPriority;
  }

  /**
   * Set the satellite communication priority..
   * <p>
   * @param value the SATCOMPriority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSATCOMPriority(TString value) {
    this.satcomPriority = value;
  }

  /**
   * Determine if the SATCOMPriority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSATCOMPriority() {
    return (this.satcomPriority != null ? this.satcomPriority.isSetValue() : false);
  }

  /**
   * Get whether the interference affects satellite reception..
   * <p>
   * @return the SatelliteAffected value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSatelliteAffected() {
    return satelliteAffected;
  }

  /**
   * Set whether the interference affects satellite reception..
   * <p>
   * @param value the SatelliteAffected value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSatelliteAffected(TString value) {
    this.satelliteAffected = value;
  }

  /**
   * Determine if the SatelliteAffected is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteAffected() {
    return (this.satelliteAffected != null ? this.satelliteAffected.isSetValue() : false);
  }

  /**
   * Get the polarisation of the satellite downlink signal..
   * <p>
   * @return the SatelliteDownlinkPolarisation value in a {@link TString} data
   *         type
   * @since 3.1.0
   */
  public TString getSatelliteDownlinkPolarisation() {
    return satelliteDownlinkPolarisation;
  }

  /**
   * Set the polarisation of the satellite downlink signal..
   * <p>
   * @param value the SatelliteDownlinkPolarisation value in a {@link TString}
   *              data type
   * @since 3.1.0
   */
  public void setSatelliteDownlinkPolarisation(TString value) {
    this.satelliteDownlinkPolarisation = value;
  }

  /**
   * Determine if the SatelliteDownlinkPolarisation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteDownlinkPolarisation() {
    return (this.satelliteDownlinkPolarisation != null ? this.satelliteDownlinkPolarisation.isSetValue() : false);
  }

  /**
   * Get the satellite hemisphere..
   * <p>
   * @return the SatelliteHemisphere value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSatelliteHemisphere() {
    return satelliteHemisphere;
  }

  /**
   * Set the satellite hemisphere..
   * <p>
   * @param value the SatelliteHemisphere value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSatelliteHemisphere(TString value) {
    this.satelliteHemisphere = value;
  }

  /**
   * Determine if the SatelliteHemisphere is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteHemisphere() {
    return (this.satelliteHemisphere != null ? this.satelliteHemisphere.isSetValue() : false);
  }

  /**
   * Get the satellite longitude.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1
   * (US),2})?)|1800000)(E|W))|X".
   * <p>
   * @return a {@link Lon} instance
   * @since 3.1.0
   */
  public Lon getSatelliteLongitude() {
    return satelliteLongitude;
  }

  /**
   * Set the satellite longitude.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1
   * (US),2})?)|1800000)(E|W))|X".
   * <p>
   * @param value a {@link Lon} instance
   * @since 3.1.0
   */
  public void setSatelliteLongitude(Lon value) {
    this.satelliteLongitude = value;
  }

  /**
   * Determine if the SatelliteLongitude is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteLongitude() {
    return (this.satelliteLongitude != null ? this.satelliteLongitude.isSetValue() : false);
  }

  /**
   * Get the satellite transponder ID..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getSatelliteTransponderID() {
    return satelliteTransponderID;
  }

  /**
   * Set the satellite transponder ID..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setSatelliteTransponderID(S50 value) {
    this.satelliteTransponderID = value;
  }

  /**
   * Determine if the SatelliteTransponderID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteTransponderID() {
    return (this.satelliteTransponderID != null ? this.satelliteTransponderID.isSetValue() : false);
  }

  /**
   * Get the polarisation of the satellite uplink signal..
   * <p>
   * @return the SatelliteUplinkPolarisation value in a {@link TString} data
   *         type
   * @since 3.1.0
   */
  public TString getSatelliteUplinkPolarisation() {
    return satelliteUplinkPolarisation;
  }

  /**
   * Set the polarisation of the satellite uplink signal..
   * <p>
   * @param value the SatelliteUplinkPolarisation value in a {@link TString}
   *              data type
   * @since 3.1.0
   */
  public void setSatelliteUplinkPolarisation(TString value) {
    this.satelliteUplinkPolarisation = value;
  }

  /**
   * Determine if the SatelliteUplinkPolarisation is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteUplinkPolarisation() {
    return (this.satelliteUplinkPolarisation != null ? this.satelliteUplinkPolarisation.isSetValue() : false);
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset..
   * <p>
   * @return a {@link POCInformation} instance
   * @since 3.1.0
   */
  public Set<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new HashSet<>();
    }
    return this.pocInformation;
  }

  /**
   * Determine if the POCInformation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  /**
   * Clear the POCInformation field. This sets the field to null.
   */
  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Set whether the user needs technical assistance from another organisation
   * to solve the interference. If not used, consider as "No".
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withHelpRequired(ListCBO value) {
    setHelpRequired(new TString(value.value()));
    return this;
  }

  /**
   * Set how often the interference is experienced.
   * <p>
   * @param value An instances of type {@link ListCTI}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withIntfPeriod(ListCTI value) {
    setIntfPeriod(new TString(value.value()));
    return this;
  }

  /**
   * Set the date/time the interference was first perceived.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withIntfStartDateTime(Calendar value) {
    setIntfStartDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date/time the interference was first perceived.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withIntfStartDateTime(Date value) {
    setIntfStartDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date/time the interference ceased.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withIntfStopDateTime(Calendar value) {
    setIntfStopDateTime(new DT(value));
    return this;
  }

  /**
   * Set the date/time the interference ceased.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withIntfStopDateTime(Date value) {
    setIntfStopDateTime(new DT(value));
    return this;
  }

  /**
   * Set In Data Item IntfDescr, describe the interference. Provide as much
   * information as possible. State what actions you have taken so far to
   * resolve the interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withIntfDescr(String value) {
    setIntfDescr(new MEMO(value));
    return this;
  }

  /**
   * Set the nomenclature or description of equipment experiencing the
   * interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withAffectedEquipment(String value) {
    setAffectedEquipment(new S100(value));
    return this;
  }

  /**
   * Set the measured electromagnetic field strength.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceFieldStrength(Double value) {
    setSourceFieldStrength(new FieldStrength(value));
    return this;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the source of the interference. If the seconds are not known, use
   * 00. Use leading zeros as appropriate for degrees, minutes, or seconds.
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5]
   * [0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceLon(String value) throws Exception {
    setSourceLon(new Lon(value));
    return this;
  }

  /**
   * Set the geographical longitude in decimal degrees.
   * <p>
   * @param value The coordinate value in decimal degrees
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceLon(Double value) {
    setSourceLon(new Lon(value));
    return this;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the source of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceLat(String value) throws Exception {
    setSourceLat(new Lat(value));
    return this;
  }

  /**
   * Set the geographical latitude in decimal degrees.
   * <p>
   * @param value The coordinate value in decimal degrees
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceLat(Double value) {
    setSourceLat(new Lat(value));
    return this;
  }

  /**
   * Set the measured azimuth of the source from the victim.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceAz(Double value) {
    setSourceAz(new Az(value));
    return this;
  }

  /**
   * Set the approximate position the source, if exact coordinates are not
   * known.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceLocDescr(String value) {
    setSourceLocDescr(new S255(value));
    return this;
  }

  /**
   * Set the nominal frequency of the interference, or the minimum frequency in
   * case of a range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceFreqMin(Double value) {
    setSourceFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum frequency of the interference, in case of a range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceFreqMax(Double value) {
    setSourceFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item SourceEmsClass, In Data Item EmsClass, enter a three to
   * five characters code, derived from the table below, representing the
   * emission classification. If an "X" is used in any of the symbols, Remarks
   * SHOULD be used to explain the nature of the signal. First Symbol -
   * Designates Type of Modulation of the Main Carrier Unmodulated N - Emission
   * of unmodulated carrier Amplitude Modulated A - Double sideband H - Single
   * sideband, full carrier R - Single sideband, reduced or variable level
   * carrier J - Single sideband, suppressed carrier B - Independent sidebands C
   * - Vestigial sidebands Angle-Modulated F - Frequency modulation G - Phase
   * modulation Amplitude and Angle-Modulated D - Main carrier is
   * amplitude-modulated and angle-modulated simultaneously or in a
   * preestablished sequence Pulse P - Sequence of unmodulated pulses K -
   * Modulated in amplitude L - Modulated in width/duration M - Modulated in
   * position phase Q - Carrier is angle-modulated during the period of the
   * pulse V - Combination of the foregoing or is produced by other means
   * Combination W - Cases not covered above in which an emission consists of
   * the main carrier being modulated, either simultaneously or in a
   * preestablished sequence, in a combination of two or more of the following
   * modes: amplitude, angle, pulse Other X - Cases not otherwise covered - :
   * Unknown (to be used only by legacy data) Second Symbol - Designates the
   * Nature of Signal(s) Modulating the Main Carrier 0 - No modulating signal 1
   * - A single channel containing quantised or digital information, not using a
   * modulating subcarrier. (Excludes time-division multiplex) 2 - A single
   * channel containing quantised or digital information, using a modulating
   * subcarrier 3 - A single channel containing analogue information 7 - Two or
   * more channels containing quantised or digital information 8 - Two or more
   * channels containing analogue information 9 - Composite system with one or
   * more channels containing quantised or digital information, together with
   * one or more channels containing analogue information X - Cases not
   * otherwise covered - : Unknown (to be used only by legacy data) Third Symbol
   * - Type of Information to be Transmitted a N - No information transmitted A
   * - Telegraphy - for aural reception B - Telegraphy - for automatic reception
   * C - Facsimile D - Data transmission, telemetry, telecommand E - Telephony
   * (including sound broadcasting) F - Television (video) W - Combination of
   * the above X - Cases not otherwise covered. - : Unknown (to be used only by
   * legacy data) a In this context, the word "information" does not include
   * information of a constant, unvarying, nature such as that provided by
   * standard frequency emissions, continuous wave, pulse radars, etc. b A full
   * explanation for the selection of the letter X shall be provided in
   * Information unless the application is for a non-directional beacon in the
   * bands 190-435 and 510-535 kHz. Fourth Symbol - Designates the Details of
   * Signal(s) A - Two-condition code with elements of differing numbers and/or
   * durations B - Two-condition code with elements of the same number and
   * duration without error correction C - Two-condition code with elements of
   * the same number and duration with error correction D - Four-condition code
   * in which each condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|
   * W|X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?"
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceEmsClass(String value) {
    setSourceEmsClass(new EmsDes(value));
    return this;
  }

  /**
   * Set the calculated or measured bandwidth of the interference source.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSourceEmsBw(Double value) {
    setSourceEmsBw(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item VictimAsgnRef, Enter the serial number of the assignment
   * victim of the interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withVictimAssignment(Assignment)} instead.
   */
  @Deprecated
  public IntfReport withVictimAsgnRef(Serial value) {
    setVictimAsgnRef(value);
    return this;
  }

  /**
   * Set the nomenclature or other identifier of equipment experiencing the
   * interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimSystem(String value) {
    setVictimSystem(new S100(value));
    return this;
  }

  /**
   * Set the country or area where the victim of the interference is located.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimCountry(ListCAO value) {
    setVictimCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set the geographical longitude in decimal degrees.
   * <p>
   * @param value The coordinate value in decimal degrees
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimLon(Double value) {
    setVictimLon(new Lon(value));
    return this;
  }

  /**
   * Set the geographical latitude in decimal degrees.
   * <p>
   * @param value The coordinate value in decimal degrees
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimLat(Double value) {
    setVictimLat(new Lat(value));
    return this;
  }

  /**
   * Set the approximate position the victim of the interference, if exact
   * coordinates are not known.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimLocDescr(String value) {
    setVictimLocDescr(new S255(value));
    return this;
  }

  /**
   * Set the nominal or lower frequency used by the victim of the interference.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimFreqMin(Double value) {
    setVictimFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the upper frequency of the range, in case of an assignment over a
   * frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimFreqMax(Double value) {
    setVictimFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the name of the satellite experiencing the interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteName(String value) {
    setSatelliteName(new S50(value));
    return this;
  }

  /**
   * Set the identifier of satellite channel experiencing the interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteChannel(String value) {
    setSatelliteChannel(new S50(value));
    return this;
  }

  /**
   * Set the satellite uplink frequency experiencing the interference
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteUplinkFreq(Double value) {
    setSatelliteUplinkFreq(new FreqM(value));
    return this;
  }

  /**
   * Set the effect the interference has on normal operations.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withPerformanceEffects(String value) {
    setPerformanceEffects(new MEMO(value));
    return this;
  }

  /**
   * Set your best guess as to the cause of the interference.
   * <p>
   * @param value An instances of type {@link ListCJ1}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withEvaluation(ListCJ1 value) {
    setEvaluation(new TString(value.value()));
    return this;
  }

  /**
   * Set what actions were taken to resolve the interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSolution(String value) {
    setSolution(new MEMO(value));
    return this;
  }

  /**
   * Set the responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization.
   * <p>
   * @param value An instances of type {@link ListUAG}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withAffectedCSA(ListUAG value) {
    setAffectedCSA(new TString(value.value()));
    return this;
  }

  /**
   * Set the interference characteristics.
   * <p>
   * @param value An instances of type {@link ListUCH}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withCharacteristics(ListUCH value) {
    setCharacteristics(new TString(value.value()));
    return this;
  }

  /**
   * Set whether the interference affects GPS reception.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withGPSAffected(ListCBO value) {
    setGPSAffected(new TString(value.value()));
    return this;
  }

  /**
   * Set the local event ID.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withLocalEventID(String value) {
    setLocalEventID(new S20(value));
    return this;
  }

  /**
   * Set the network circuits affected by the interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withNetCircuitsAffected(String value) {
    setNetCircuitsAffected(new MEMO(value));
    return this;
  }

  /**
   * Set the networks affected by the interference.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withNetsAffected(String value) {
    setNetsAffected(new MEMO(value));
    return this;
  }

  /**
   * Set the satellite communication priority.
   * <p>
   * @param value An instances of type {@link ListUPR}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSATCOMPriority(ListUPR value) {
    setSATCOMPriority(new TString(value.value()));
    return this;
  }

  /**
   * Set whether the interference affects satellite reception.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteAffected(ListCBO value) {
    setSatelliteAffected(new TString(value.value()));
    return this;
  }

  /**
   * Set the polarisation of the satellite downlink signal.
   * <p>
   * @param value An instances of type {@link ListCPO}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteDownlinkPolarisation(ListCPO value) {
    setSatelliteDownlinkPolarisation(new TString(value.value()));
    return this;
  }

  /**
   * Set the satellite hemisphere.
   * <p>
   * @param value An instances of type {@link ListCCO}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteHemisphere(ListCCO value) {
    setSatelliteHemisphere(new TString(value.value()));
    return this;
  }

  /**
   * Set the satellite longitude in decimal degrees.
   * <p>
   * @param value The coordinate value in decimal degrees
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteLongitude(Double value) {
    setSatelliteLongitude(new Lon(value));
    return this;
  }

  /**
   * Set the satellite transponder ID.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteTransponderID(String value) {
    setSatelliteTransponderID(new S50(value));
    return this;
  }

  /**
   * Set the polarisation of the satellite uplink signal.
   * <p>
   * @param value An instances of type {@link ListCPO}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withSatelliteUplinkPolarisation(ListCPO value) {
    setSatelliteUplinkPolarisation(new TString(value.value()));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation...}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values A collection of {@link POCInformation} instances
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this IntfReport instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "IntfReport {"
           + (affectedCSA != null ? "\n affectedCSA [" + affectedCSA + "]" : "")
           + (affectedEquipment != null ? "\n affectedEquipment [" + affectedEquipment + "]" : "")
           + (characteristics != null ? "\n characteristics [" + characteristics + "]" : "")
           + (evaluation != null ? "\n evaluation [" + evaluation + "]" : "")
           + (gpsAffected != null ? "\n gpsAffected [" + gpsAffected + "]" : "")
           + (helpRequired != null ? "\n helpRequired [" + helpRequired + "]" : "")
           + (intfDescr != null ? "\n intfDescr [" + intfDescr + "]" : "")
           + (intfPeriod != null ? "\n intfPeriod [" + intfPeriod + "]" : "")
           + (intfStartDateTime != null ? "\n intfStartDateTime [" + intfStartDateTime + "]" : "")
           + (intfStopDateTime != null ? "\n intfStopDateTime [" + intfStopDateTime + "]" : "")
           + (localEventID != null ? "\n localEventID [" + localEventID + "]" : "")
           + (netCircuitsAffected != null ? "\n netCircuitsAffected [" + netCircuitsAffected + "]" : "")
           + (netsAffected != null ? "\n netsAffected [" + netsAffected + "]" : "")
           + (performanceEffects != null ? "\n performanceEffects [" + performanceEffects + "]" : "")
           + (pocInformation != null ? "\n pocInformation [" + pocInformation + "]" : "")
           + (satcomPriority != null ? "\n satcomPriority [" + satcomPriority + "]" : "")
           + (satelliteAffected != null ? "\n satelliteAffected [" + satelliteAffected + "]" : "")
           + (satelliteChannel != null ? "\n satelliteChannel [" + satelliteChannel + "]" : "")
           + (satelliteDownlinkPolarisation != null ? "\n satelliteDownlinkPolarisation [" + satelliteDownlinkPolarisation + "]" : "")
           + (satelliteHemisphere != null ? "\n satelliteHemisphere [" + satelliteHemisphere + "]" : "")
           + (satelliteLongitude != null ? "\n satelliteLongitude [" + satelliteLongitude + "]" : "")
           + (satelliteName != null ? "\n satelliteName [" + satelliteName + "]" : "")
           + (satelliteTransponderID != null ? "\n satelliteTransponderID [" + satelliteTransponderID + "]" : "")
           + (satelliteUplinkFreq != null ? "\n satelliteUplinkFreq [" + satelliteUplinkFreq + "]" : "")
           + (satelliteUplinkPolarisation != null ? "\n satelliteUplinkPolarisation [" + satelliteUplinkPolarisation + "]" : "")
           + (solution != null ? "\n solution [" + solution + "]" : "")
           + (sourceAz != null ? "\n sourceAz [" + sourceAz + "]" : "")
           + (sourceEmsBw != null ? "\n sourceEmsBw [" + sourceEmsBw + "]" : "")
           + (sourceEmsClass != null ? "\n sourceEmsClass [" + sourceEmsClass + "]" : "")
           + (sourceFieldStrength != null ? "\n sourceFieldStrength [" + sourceFieldStrength + "]" : "")
           + (sourceFreqMax != null ? "\n sourceFreqMax [" + sourceFreqMax + "]" : "")
           + (sourceFreqMin != null ? "\n sourceFreqMin [" + sourceFreqMin + "]" : "")
           + (sourceLat != null ? "\n sourceLat [" + sourceLat + "]" : "")
           + (sourceLocDescr != null ? "\n sourceLocDescr [" + sourceLocDescr + "]" : "")
           + (sourceLon != null ? "\n sourceLon [" + sourceLon + "]" : "")
           + (victimAsgnRef != null ? "\n victimAsgnRef [" + victimAsgnRef + "]" : "")
           + (victimCountry != null ? "\n victimCountry [" + victimCountry + "]" : "")
           + (victimFreqMax != null ? "\n victimFreqMax [" + victimFreqMax + "]" : "")
           + (victimFreqMin != null ? "\n victimFreqMin [" + victimFreqMin + "]" : "")
           + (victimLat != null ? "\n victimLat [" + victimLat + "]" : "")
           + (victimLocDescr != null ? "\n victimLocDescr [" + victimLocDescr + "]" : "")
           + (victimLon != null ? "\n victimLon [" + victimLon + "]" : "")
           + (victimSystem != null ? "\n victimSystem [" + victimSystem + "]" : "")
           + "}\n  IntfReport." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link IntfReport} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link DT IntfStartDateTime}, {@link FreqM VictimFreqMin}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetIntfStartDateTime() && isSetVictimFreqMin();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * In Data Item VictimAsgnRef, Enter the serial number of the assignment
   * victim of the interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Assignment victimAssignment;

  /**
   * Get In Data Item VictimAsgnRef, Enter the serial number of the assignment
   * victim of the interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}".
   * <p>
   * @return a {@link Assignment} instance
   * @since 3.1.0
   */
  public Assignment getVictimAssignment() {
    return victimAssignment;
  }

  /**
   * Determine if the victimAssignment field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimAssignment() {
    return this.victimAssignment != null;
  }

  /**
   * Set In Data Item VictimAsgnRef, Enter the serial number of the assignment
   * victim of the interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link Assignment}.
   * @return The current IntfReport object instance.
   * @since 3.1.0
   */
  public IntfReport withVictimAssignment(Assignment value) {
    this.victimAssignment = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this IntfReport record.
   * <p>
   * This method builds the exported {@link #victimAsgnRef} field with values
   * from the transient {@link #victimAssignment} field. This method should
   * typically be called after the IntfReport is configured and (optionally)
   * before exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.victimAsgnRef = victimAssignment != null ? victimAssignment.getSerial() : this.victimAsgnRef;
  }

  /**
   * Update the SSRF data type references in this IntfReport record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #victimAssignment} with values from
   * the imported {@link #victimAsgnRef} field. This method should typically be
   * called after the IntfReport is imported from XML. * @param root the SSRF
   * root instance.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (victimAsgnRef == null || !victimAsgnRef.isSetValue()) {
      return;
    }
    for (Assignment instance : root.getAssignment()) {
      if (victimAsgnRef.equals(instance.getSerial())) {
        victimAssignment = instance;
        return;
      }
    }
  }//</editor-fold>

}
