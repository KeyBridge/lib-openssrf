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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;

/**
 * IntfReport contains information on a source and victim of an interference
 * incident.
 * <p>
 * Sub-Element is {@link POCInformation}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "HelpRequired", required = false)
  private TString helpRequired;
  /**
   * IntfPeriod - Interference Period (Optional)
   * <p>
   * How often the interference is experienced.
   * <p>
   * Format is L:CTI
   */
  @XmlElement(name = "IntfPeriod", required = false)
  private TString intfPeriod;
  /**
   * IntfStartDateTime - Interference Start Date/Time (Required)
   * <p>
   * The date/time the interference was first perceived.
   * <p>
   * Format is DT
   */
  @XmlElement(name = "IntfStartDateTime", required = true)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar intfStartDateTime;
  /**
   * IntfStopDateTime - Interference Stop Date/Time (Optional)
   * <p>
   * The date/time the interference ceased.
   * <p>
   * Format is DT
   */
  @XmlElement(name = "IntfStopDateTime", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar intfStopDateTime;
  /**
   * IntfDescr, describe the interference. Provide as much information as
   * possible. State what actions you have taken so far to resolve the
   * interference.
   */
  @XmlElement(name = "IntfDescr", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intfDescr;
  /**
   * AffectedEquipment - Victim Equipment Description (Optional)
   * <p>
   * The nomenclature or description of equipment experiencing the interference.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "AffectedEquipment", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString affectedEquipment;
  /**
   * SourceFieldStrength - Field Strength (Optional)
   * <p>
   * The measured electromagnetic field strength.
   * <p>
   * Format is UN(6,1) (dB)
   */
  @XmlElement(name = "SourceFieldStrength", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFIELDSTRENGTH.class)
  private TDecimal sourceFieldStrength;
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
   */
  @XmlElement(name = "SourceLon", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLON.class)
  private TString sourceLon;
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
   */
  @XmlElement(name = "SourceLat", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLAT.class)
  private TString sourceLat;
  /**
   * SourceAz - Source Azimuth (Optional)
   * <p>
   * The measured azimuth of the source from the victim.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   */
  @XmlElement(name = "SourceAz", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal sourceAz;
  /**
   * SourceLocDescr - Location Description of the Source (Optional)
   * <p>
   * The approximate position the source, if exact coordinates are not known.
   * <p>
   * Format is S255
   */
  @XmlElement(name = "SourceLocDescr", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS255.class)
  private TString sourceLocDescr;
  /**
   * SourceFreqMin - Minimum Source Frequency (Optional)
   * <p>
   * The nominal frequency of the interference, or the minimum frequency in case
   * of a range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   */
  @XmlElement(name = "SourceFreqMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal sourceFreqMin;
  /**
   * SourceFreqMax - Maximum Source Frequency (Optional)
   * <p>
   * The maximum frequency of the interference, in case of a range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   */
  @XmlElement(name = "SourceFreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal sourceFreqMax;
  /**
   * SourceEmsClass, EmsClass, enter a three to five characters code, derived
   * from the table below, representing the emission classification. If an "X"
   * is used in any of the symbols, Remarks SHOULD be used to explain the nature
   * of the signal. First Symbol - Designates Type of Modulation of the Main
   * Carrier Unmodulated N - Emission of unmodulated carrier Amplitude Modulated
   * A - Double sideband H - Single sideband, full carrier R - Single sideband,
   * reduced or variable level carrier J - Single sideband, suppressed carrier B
   * - Independent sidebands C - Vestigial sidebands Angle-Modulated F -
   * Frequency modulation G - Phase modulation Amplitude and Angle-Modulated D -
   * Main carrier is amplitude-modulated and angle-modulated simultaneously or
   * in a preestablished sequence Pulse P - Sequence of unmodulated pulses K -
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
   */
  @XmlElement(name = "SourceEmsClass", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterEMSDES.class)
  private TString sourceEmsClass;
  /**
   * SourceEmsBw - Emission Bandwidth of the interference source (Optional)
   * <p>
   * The calculated or measured bandwidth of the interference source.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   */
  @XmlElement(name = "SourceEmsBw", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal sourceEmsBw;
  /**
   * VictimAsgnRef - The serial number of the assignment victim of the
   * interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   */
  @XmlElement(name = "VictimAsgnRef", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString victimAsgnRef;
  /**
   * VictimSystem - Victim System (Optional)
   * <p>
   * The nomenclature or other identifier of equipment experiencing the
   * interference.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "VictimSystem", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString victimSystem;
  /**
   * VictimCountry - Country/Area of the Victim (Optional)
   * <p>
   * The country or area where the victim of the interference is located.
   * <p>
   * Format is L:CAO
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
   */
  @XmlElement(name = "VictimLon", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLON.class)
  private TString victimLon;
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
   */
  @XmlElement(name = "VictimLat", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLAT.class)
  private TString victimLat;
  /**
   * VictimLocDescr - Location Description of the Victim (Optional)
   * <p>
   * The approximate position the victim of the interference, if exact
   * coordinates are not known.
   * <p>
   * Format is S255
   */
  @XmlElement(name = "VictimLocDescr", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS255.class)
  private TString victimLocDescr;
  /**
   * VictimFreqMin - Minimum Victim Frequency (Required)
   * <p>
   * The nominal or lower frequency used by the victim of the interference.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   */
  @XmlElement(name = "VictimFreqMin", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal victimFreqMin;
  /**
   * VictimFreqMax - Maximum Victim Frequency (Optional)
   * <p>
   * The upper frequency of the range, in case of an assignment over a frequency
   * range.
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   */
  @XmlElement(name = "VictimFreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal victimFreqMax;
  /**
   * SatelliteName - Victim Satellite Name (Optional)
   * <p>
   * The name of the satellite experiencing the interference.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "SatelliteName", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteName;
  /**
   * SatelliteChannel - Victim Satellite Channel (Optional)
   * <p>
   * The identifier of satellite channel experiencing the interference.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "SatelliteChannel", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteChannel;
  /**
   * SatelliteUplinkFreq - Victim Satellite Uplink Freq (Optional)
   * <p>
   * The satellite uplink frequency experiencing the interference
   * <p>
   * Format is UN(16,9) [0..1.0E9] (MHz)
   */
  @XmlElement(name = "SatelliteUplinkFreq", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal satelliteUplinkFreq;
  /**
   * PerformanceEffects - Effects On Performance (Optional)
   * <p>
   * The effect the interference has on normal operations.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "PerformanceEffects", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString performanceEffects;
  /**
   * Evaluation - Evaluation (Optional)
   * <p>
   * Your best guess as to the cause of the interference.
   * <p>
   * Format is L:CJ1
   */
  @XmlElement(name = "Evaluation", required = false)
  private TString evaluation;
  /**
   * Solution - Description of the Solution (Optional)
   * <p>
   * What actions were taken to resolve the interference.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "Solution", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString solution;
  /**
   * US:AffectedCSA - Affected CSA (Optional)
   * <p>
   * The responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization.
   * <p>
   * Format is L:UAG
   */
  @XmlElement(name = "AffectedCSA", required = false)
  private TString affectedCSA;
  /**
   * US:Characteristics - Characteristics (Optional)
   * <p>
   * The interference characteristics.
   * <p>
   * Format is L:UCH
   */
  @XmlElement(name = "Characteristics", required = false)
  private TString characteristics;
  /**
   * US:GPSAffected - GPS Affected (Optional)
   * <p>
   * Whether the interference affects GPS reception.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "GPSAffected", required = false)
  private TString gpsAffected;
  /**
   * US:LocalEventID - Local Event ID (Optional)
   * <p>
   * The local event ID.
   * <p>
   * Format is S20
   */
  @XmlElement(name = "LocalEventID", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString localEventID;
  /**
   * US:NetCircuitsAffected - Net Circuits Affected (Optional)
   * <p>
   * The network circuits affected by the interference.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "NetCircuitsAffected", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString netCircuitsAffected;
  /**
   * US:NetsAffected - Nets Affected (Optional)
   * <p>
   * The networks affected by the interference.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "NetsAffected", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString netsAffected;
  /**
   * US:SATCOMPriority - SATCOM Priority (Optional)
   * <p>
   * The satellite communication priority.
   * <p>
   * Format is L:UPR
   */
  @XmlElement(name = "SATCOMPriority", required = false)
  private TString satcomPriority;
  /**
   * US:SatelliteAffected - Satellite Affected (Optional)
   * <p>
   * Whether the interference affects satellite reception.
   * <p>
   * Format is L:CBO
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
   */
  @XmlElement(name = "SatelliteDownlinkPolarisation", required = false)
  private TString satelliteDownlinkPolarisation;
  /**
   * US:SatelliteHemisphere - Satellite Hemisphere (Optional)
   * <p>
   * The satellite hemisphere.
   * <p>
   * Format is L:CCO
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
   */
  @XmlElement(name = "SatelliteLongitude", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLON.class)
  private TString satelliteLongitude;
  /**
   * US:SatelliteTransponderID - Satellite Transponder ID (Optional)
   * <p>
   * The satellite transponder ID.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "SatelliteTransponderID", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString satelliteTransponderID;
  /**
   * US:SatelliteUplinkPolarisation - Satellite Uplink Polarisation (Optional)
   * <p>
   * The polarisation of the satellite uplink signal.
   * <p>
   * Format is L:CPO
   */
  @XmlElement(name = "SatelliteUplinkPolarisation", required = false)
  private TString satelliteUplinkPolarisation;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;

  /**
   * Get whether the user needs technical assistance from another organisation
   * to solve the interference. If not used, consider as "No".
   * <p>
   * @return the HelpRequired value in a {@link TString} data type
   */
  public TString getHelpRequired() {
    return helpRequired;
  }

  /**
   * Set whether the user needs technical assistance from another organisation
   * to solve the interference. If not used, consider as "No".
   * <p>
   * @param value the HelpRequired value in a {@link TString} data type
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
   * Get how often the interference is experienced.
   * <p>
   * @return the IntfPeriod value in a {@link TString} data type
   */
  public TString getIntfPeriod() {
    return intfPeriod;
  }

  /**
   * Set how often the interference is experienced.
   * <p>
   * @param value the IntfPeriod value in a {@link TString} data type
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
   * Get the date/time the interference was first perceived.
   * <p>
   * @return the IntfStartDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getIntfStartDateTime() {
    return intfStartDateTime;
  }

  /**
   * Set the date/time the interference was first perceived.
   * <p>
   * @param value the IntfStartDateTime value in a {@link TCalendar} data type
   */
  public void setIntfStartDateTime(TCalendar value) {
    this.intfStartDateTime = value;
  }

  /**
   * Determine if the IntfStartDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfStartDateTime() {
    return (this.intfStartDateTime != null ? this.intfStartDateTime.isSetValue() : false);
  }

  /**
   * Get the date/time the interference ceased.
   * <p>
   * @return the IntfStopDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getIntfStopDateTime() {
    return intfStopDateTime;
  }

  /**
   * Set the date/time the interference ceased.
   * <p>
   * @param value the IntfStopDateTime value in a {@link TCalendar} data type
   */
  public void setIntfStopDateTime(TCalendar value) {
    this.intfStopDateTime = value;
  }

  /**
   * Determine if the IntfStopDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfStopDateTime() {
    return (this.intfStopDateTime != null ? this.intfStopDateTime.isSetValue() : false);
  }

  /**
   * Get IntfDescr, describe the interference. Provide as much information as
   * possible. State what actions you have taken so far to resolve the
   * interference.
   * <p>
   * @return the IntfDescr value in a {@link TString} data type
   */
  public TString getIntfDescr() {
    return intfDescr;
  }

  /**
   * Set IntfDescr, describe the interference. Provide as much information as
   * possible. State what actions you have taken so far to resolve the
   * interference.
   * <p>
   * @param value the IntfDescr value in a {@link TString} data type
   */
  public void setIntfDescr(TString value) {
    this.intfDescr = value;
  }

  /**
   * Determine if the IntfDescr is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntfDescr() {
    return (this.intfDescr != null ? this.intfDescr.isSetValue() : false);
  }

  /**
   * Get the nomenclature or description of equipment experiencing the
   * interference.
   * <p>
   * @return the AffectedEquipment value in a {@link TString} data type
   */
  public TString getAffectedEquipment() {
    return affectedEquipment;
  }

  /**
   * Set the nomenclature or description of equipment experiencing the
   * interference.
   * <p>
   * @param value the AffectedEquipment value in a {@link TString} data type
   */
  public void setAffectedEquipment(TString value) {
    this.affectedEquipment = value;
  }

  /**
   * Determine if the AffectedEquipment is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAffectedEquipment() {
    return (this.affectedEquipment != null ? this.affectedEquipment.isSetValue() : false);
  }

  /**
   * Get the measured electromagnetic field strength.
   * <p>
   * @return the SourceFieldStrength value in a {@link TDecimal} data type
   */
  public TDecimal getSourceFieldStrength() {
    return sourceFieldStrength;
  }

  /**
   * Set the measured electromagnetic field strength.
   * <p>
   * @param value the SourceFieldStrength value in a {@link TDecimal} data type
   */
  public void setSourceFieldStrength(TDecimal value) {
    this.sourceFieldStrength = value;
  }

  /**
   * Determine if the SourceFieldStrength is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * [0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * @return the SourceLon value in a {@link TString} data type
   */
  public TString getSourceLon() {
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
   * [0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * @param value the SourceLon value in a {@link TString} data type
   */
  public void setSourceLon(TString value) {
    this.sourceLon = value;
  }

  /**
   * Determine if the SourceLon is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * @return the SourceLat value in a {@link TString} data type
   */
  public TString getSourceLat() {
    return sourceLat;
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
   * @param value the SourceLat value in a {@link TString} data type
   */
  public void setSourceLat(TString value) {
    this.sourceLat = value;
  }

  /**
   * Determine if the SourceLat is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceLat() {
    return (this.sourceLat != null ? this.sourceLat.isSetValue() : false);
  }

  /**
   * Get the measured azimuth of the source from the victim.
   * <p>
   * @return the SourceAz value in a {@link TDecimal} data type
   */
  public TDecimal getSourceAz() {
    return sourceAz;
  }

  /**
   * Set the measured azimuth of the source from the victim.
   * <p>
   * @param value the SourceAz value in a {@link TDecimal} data type
   */
  public void setSourceAz(TDecimal value) {
    this.sourceAz = value;
  }

  /**
   * Determine if the SourceAz is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceAz() {
    return (this.sourceAz != null ? this.sourceAz.isSetValue() : false);
  }

  /**
   * Get the approximate position the source, if exact coordinates are not
   * known.
   * <p>
   * @return the SourceLocDescr value in a {@link TString} data type
   */
  public TString getSourceLocDescr() {
    return sourceLocDescr;
  }

  /**
   * Set the approximate position the source, if exact coordinates are not
   * known.
   * <p>
   * @param value the SourceLocDescr value in a {@link TString} data type
   */
  public void setSourceLocDescr(TString value) {
    this.sourceLocDescr = value;
  }

  /**
   * Determine if the SourceLocDescr is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceLocDescr() {
    return (this.sourceLocDescr != null ? this.sourceLocDescr.isSetValue() : false);
  }

  /**
   * Get the nominal frequency of the interference, or the minimum frequency in
   * case of a range.
   * <p>
   * @return the SourceFreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getSourceFreqMin() {
    return sourceFreqMin;
  }

  /**
   * Set the nominal frequency of the interference, or the minimum frequency in
   * case of a range.
   * <p>
   * @param value the SourceFreqMin value in a {@link TDecimal} data type
   */
  public void setSourceFreqMin(TDecimal value) {
    this.sourceFreqMin = value;
  }

  /**
   * Determine if the SourceFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceFreqMin() {
    return (this.sourceFreqMin != null ? this.sourceFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum frequency of the interference, in case of a range.
   * <p>
   * @return the SourceFreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getSourceFreqMax() {
    return sourceFreqMax;
  }

  /**
   * Set the maximum frequency of the interference, in case of a range.
   * <p>
   * @param value the SourceFreqMax value in a {@link TDecimal} data type
   */
  public void setSourceFreqMax(TDecimal value) {
    this.sourceFreqMax = value;
  }

  /**
   * Determine if the SourceFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceFreqMax() {
    return (this.sourceFreqMax != null ? this.sourceFreqMax.isSetValue() : false);
  }

  /**
   * Get SourceEmsClass, EmsClass, enter a three to five characters code,
   * derived from the table below, representing the emission classification. If
   * an "X" is used in any of the symbols, Remarks SHOULD be used to explain the
   * nature of the signal. First Symbol - Designates Type of Modulation of the
   * Main Carrier Unmodulated N - Emission of unmodulated carrier Amplitude
   * Modulated A - Double sideband H - Single sideband, full carrier R - Single
   * sideband, reduced or variable level carrier J - Single sideband, suppressed
   * carrier B - Independent sidebands C - Vestigial sidebands Angle-Modulated F
   * - Frequency modulation G - Phase modulation Amplitude and Angle-Modulated D
   * - Main carrier is amplitude-modulated and angle-modulated simultaneously or
   * in a preestablished sequence Pulse P - Sequence of unmodulated pulses K -
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
   * @return the SourceEmsClass value in a {@link TString} data type
   */
  public TString getSourceEmsClass() {
    return sourceEmsClass;
  }

  /**
   * Set SourceEmsClass, EmsClass, enter a three to five characters code,
   * derived from the table below, representing the emission classification. If
   * an "X" is used in any of the symbols, Remarks SHOULD be used to explain the
   * nature of the signal. First Symbol - Designates Type of Modulation of the
   * Main Carrier Unmodulated N - Emission of unmodulated carrier Amplitude
   * Modulated A - Double sideband H - Single sideband, full carrier R - Single
   * sideband, reduced or variable level carrier J - Single sideband, suppressed
   * carrier B - Independent sidebands C - Vestigial sidebands Angle-Modulated F
   * - Frequency modulation G - Phase modulation Amplitude and Angle-Modulated D
   * - Main carrier is amplitude-modulated and angle-modulated simultaneously or
   * in a preestablished sequence Pulse P - Sequence of unmodulated pulses K -
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
   * @param value the SourceEmsClass value in a {@link TString} data type
   */
  public void setSourceEmsClass(TString value) {
    this.sourceEmsClass = value;
  }

  /**
   * Determine if the SourceEmsClass is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceEmsClass() {
    return (this.sourceEmsClass != null ? this.sourceEmsClass.isSetValue() : false);
  }

  /**
   * Get the calculated or measured bandwidth of the interference source.
   * <p>
   * @return the SourceEmsBw value in a {@link TDecimal} data type
   */
  public TDecimal getSourceEmsBw() {
    return sourceEmsBw;
  }

  /**
   * Set the calculated or measured bandwidth of the interference source.
   * <p>
   * @param value the SourceEmsBw value in a {@link TDecimal} data type
   */
  public void setSourceEmsBw(TDecimal value) {
    this.sourceEmsBw = value;
  }

  /**
   * Determine if the SourceEmsBw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSourceEmsBw() {
    return (this.sourceEmsBw != null ? this.sourceEmsBw.isSetValue() : false);
  }

  /**
   * Get VictimAsgnRef - The serial number of the assignment victim of the
   * interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @return the VictimAsgnRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getVictimAssignment()} instead.
   */
  @Deprecated
  public TString getVictimAsgnRef() {
    return victimAsgnRef;
  }

  /**
   * Set VictimAsgnRef - The serial number of the assignment victim of the
   * interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value the VictimAsgnRef value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setVictimAssignment(Assignment)} instead.
   */
  @Deprecated
  public void setVictimAsgnRef(TString value) {
    this.victimAsgnRef = value;
  }

  /**
   * Determine if the VictimAsgnRef is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimAsgnRef() {
    return (this.victimAsgnRef != null ? this.victimAsgnRef.isSetValue() : false);
  }

  /**
   * Get the nomenclature or other identifier of equipment experiencing the
   * interference.
   * <p>
   * @return the VictimSystem value in a {@link TString} data type
   */
  public TString getVictimSystem() {
    return victimSystem;
  }

  /**
   * Set the nomenclature or other identifier of equipment experiencing the
   * interference.
   * <p>
   * @param value the VictimSystem value in a {@link TString} data type
   */
  public void setVictimSystem(TString value) {
    this.victimSystem = value;
  }

  /**
   * Determine if the VictimSystem is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimSystem() {
    return (this.victimSystem != null ? this.victimSystem.isSetValue() : false);
  }

  /**
   * Get the country or area where the victim of the interference is located.
   * <p>
   * @return the VictimCountry value in a {@link TString} data type
   */
  public TString getVictimCountry() {
    return victimCountry;
  }

  /**
   * Set the country or area where the victim of the interference is located.
   * <p>
   * @param value the VictimCountry value in a {@link TString} data type
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
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * @return the VictimLon value in a {@link TString} data type
   */
  public TString getVictimLon() {
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
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * @param value the VictimLon value in a {@link TString} data type
   */
  public void setVictimLon(TString value) {
    this.victimLon = value;
  }

  /**
   * Determine if the VictimLon is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * @return the VictimLat value in a {@link TString} data type
   */
  public TString getVictimLat() {
    return victimLat;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the victim of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * @param value the VictimLat value in a {@link TString} data type
   */
  public void setVictimLat(TString value) {
    this.victimLat = value;
  }

  /**
   * Determine if the VictimLat is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimLat() {
    return (this.victimLat != null ? this.victimLat.isSetValue() : false);
  }

  /**
   * Get the approximate position the victim of the interference, if exact
   * coordinates are not known.
   * <p>
   * @return the VictimLocDescr value in a {@link TString} data type
   */
  public TString getVictimLocDescr() {
    return victimLocDescr;
  }

  /**
   * Set the approximate position the victim of the interference, if exact
   * coordinates are not known.
   * <p>
   * @param value the VictimLocDescr value in a {@link TString} data type
   */
  public void setVictimLocDescr(TString value) {
    this.victimLocDescr = value;
  }

  /**
   * Determine if the VictimLocDescr is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimLocDescr() {
    return (this.victimLocDescr != null ? this.victimLocDescr.isSetValue() : false);
  }

  /**
   * Get the nominal or lower frequency used by the victim of the interference.
   * <p>
   * @return the VictimFreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getVictimFreqMin() {
    return victimFreqMin;
  }

  /**
   * Set the nominal or lower frequency used by the victim of the interference.
   * <p>
   * @param value the VictimFreqMin value in a {@link TDecimal} data type
   */
  public void setVictimFreqMin(TDecimal value) {
    this.victimFreqMin = value;
  }

  /**
   * Determine if the VictimFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimFreqMin() {
    return (this.victimFreqMin != null ? this.victimFreqMin.isSetValue() : false);
  }

  /**
   * Get the upper frequency of the range, in case of an assignment over a
   * frequency range.
   * <p>
   * @return the VictimFreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getVictimFreqMax() {
    return victimFreqMax;
  }

  /**
   * Set the upper frequency of the range, in case of an assignment over a
   * frequency range.
   * <p>
   * @param value the VictimFreqMax value in a {@link TDecimal} data type
   */
  public void setVictimFreqMax(TDecimal value) {
    this.victimFreqMax = value;
  }

  /**
   * Determine if the VictimFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVictimFreqMax() {
    return (this.victimFreqMax != null ? this.victimFreqMax.isSetValue() : false);
  }

  /**
   * Get the name of the satellite experiencing the interference.
   * <p>
   * @return the SatelliteName value in a {@link TString} data type
   */
  public TString getSatelliteName() {
    return satelliteName;
  }

  /**
   * Set the name of the satellite experiencing the interference.
   * <p>
   * @param value the SatelliteName value in a {@link TString} data type
   */
  public void setSatelliteName(TString value) {
    this.satelliteName = value;
  }

  /**
   * Determine if the SatelliteName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteName() {
    return (this.satelliteName != null ? this.satelliteName.isSetValue() : false);
  }

  /**
   * Get the identifier of satellite channel experiencing the interference.
   * <p>
   * @return the SatelliteChannel value in a {@link TString} data type
   */
  public TString getSatelliteChannel() {
    return satelliteChannel;
  }

  /**
   * Set the identifier of satellite channel experiencing the interference.
   * <p>
   * @param value the SatelliteChannel value in a {@link TString} data type
   */
  public void setSatelliteChannel(TString value) {
    this.satelliteChannel = value;
  }

  /**
   * Determine if the SatelliteChannel is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteChannel() {
    return (this.satelliteChannel != null ? this.satelliteChannel.isSetValue() : false);
  }

  /**
   * Get the satellite uplink frequency experiencing the interference
   * <p>
   * @return the SatelliteUplinkFreq value in a {@link TDecimal} data type
   */
  public TDecimal getSatelliteUplinkFreq() {
    return satelliteUplinkFreq;
  }

  /**
   * Set the satellite uplink frequency experiencing the interference
   * <p>
   * @param value the SatelliteUplinkFreq value in a {@link TDecimal} data type
   */
  public void setSatelliteUplinkFreq(TDecimal value) {
    this.satelliteUplinkFreq = value;
  }

  /**
   * Determine if the SatelliteUplinkFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteUplinkFreq() {
    return (this.satelliteUplinkFreq != null ? this.satelliteUplinkFreq.isSetValue() : false);
  }

  /**
   * Get the effect the interference has on normal operations.
   * <p>
   * @return the PerformanceEffects value in a {@link TString} data type
   */
  public TString getPerformanceEffects() {
    return performanceEffects;
  }

  /**
   * Set the effect the interference has on normal operations.
   * <p>
   * @param value the PerformanceEffects value in a {@link TString} data type
   */
  public void setPerformanceEffects(TString value) {
    this.performanceEffects = value;
  }

  /**
   * Determine if the PerformanceEffects is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPerformanceEffects() {
    return (this.performanceEffects != null ? this.performanceEffects.isSetValue() : false);
  }

  /**
   * Get your best guess as to the cause of the interference.
   * <p>
   * @return the Evaluation value in a {@link TString} data type
   */
  public TString getEvaluation() {
    return evaluation;
  }

  /**
   * Set your best guess as to the cause of the interference.
   * <p>
   * @param value the Evaluation value in a {@link TString} data type
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
   * Get what actions were taken to resolve the interference.
   * <p>
   * @return the Solution value in a {@link TString} data type
   */
  public TString getSolution() {
    return solution;
  }

  /**
   * Set what actions were taken to resolve the interference.
   * <p>
   * @param value the Solution value in a {@link TString} data type
   */
  public void setSolution(TString value) {
    this.solution = value;
  }

  /**
   * Determine if the Solution is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSolution() {
    return (this.solution != null ? this.solution.isSetValue() : false);
  }

  /**
   * Get the responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization.
   * <p>
   * @return the AffectedCSA value in a {@link TString} data type
   */
  public TString getAffectedCSA() {
    return affectedCSA;
  }

  /**
   * Set the responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization.
   * <p>
   * @param value the AffectedCSA value in a {@link TString} data type
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
   * Get the interference characteristics.
   * <p>
   * @return the Characteristics value in a {@link TString} data type
   */
  public TString getCharacteristics() {
    return characteristics;
  }

  /**
   * Set the interference characteristics.
   * <p>
   * @param value the Characteristics value in a {@link TString} data type
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
   * Get whether the interference affects GPS reception.
   * <p>
   * @return the GPSAffected value in a {@link TString} data type
   */
  public TString getGPSAffected() {
    return gpsAffected;
  }

  /**
   * Set whether the interference affects GPS reception.
   * <p>
   * @param value the GPSAffected value in a {@link TString} data type
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
   * Get the local event ID.
   * <p>
   * @return the LocalEventID value in a {@link TString} data type
   */
  public TString getLocalEventID() {
    return localEventID;
  }

  /**
   * Set the local event ID.
   * <p>
   * @param value the LocalEventID value in a {@link TString} data type
   */
  public void setLocalEventID(TString value) {
    this.localEventID = value;
  }

  /**
   * Determine if the LocalEventID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLocalEventID() {
    return (this.localEventID != null ? this.localEventID.isSetValue() : false);
  }

  /**
   * Get the network circuits affected by the interference.
   * <p>
   * @return the NetCircuitsAffected value in a {@link TString} data type
   */
  public TString getNetCircuitsAffected() {
    return netCircuitsAffected;
  }

  /**
   * Set the network circuits affected by the interference.
   * <p>
   * @param value the NetCircuitsAffected value in a {@link TString} data type
   */
  public void setNetCircuitsAffected(TString value) {
    this.netCircuitsAffected = value;
  }

  /**
   * Determine if the NetCircuitsAffected is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetCircuitsAffected() {
    return (this.netCircuitsAffected != null ? this.netCircuitsAffected.isSetValue() : false);
  }

  /**
   * Get the networks affected by the interference.
   * <p>
   * @return the NetsAffected value in a {@link TString} data type
   */
  public TString getNetsAffected() {
    return netsAffected;
  }

  /**
   * Set the networks affected by the interference.
   * <p>
   * @param value the NetsAffected value in a {@link TString} data type
   */
  public void setNetsAffected(TString value) {
    this.netsAffected = value;
  }

  /**
   * Determine if the NetsAffected is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNetsAffected() {
    return (this.netsAffected != null ? this.netsAffected.isSetValue() : false);
  }

  /**
   * Get the satellite communication priority.
   * <p>
   * @return the SATCOMPriority value in a {@link TString} data type
   */
  public TString getSATCOMPriority() {
    return satcomPriority;
  }

  /**
   * Set the satellite communication priority.
   * <p>
   * @param value the SATCOMPriority value in a {@link TString} data type
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
   * Get whether the interference affects satellite reception.
   * <p>
   * @return the SatelliteAffected value in a {@link TString} data type
   */
  public TString getSatelliteAffected() {
    return satelliteAffected;
  }

  /**
   * Set whether the interference affects satellite reception.
   * <p>
   * @param value the SatelliteAffected value in a {@link TString} data type
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
   * Get the polarisation of the satellite downlink signal.
   * <p>
   * @return the SatelliteDownlinkPolarisation value in a {@link TString} data
   *         type
   */
  public TString getSatelliteDownlinkPolarisation() {
    return satelliteDownlinkPolarisation;
  }

  /**
   * Set the polarisation of the satellite downlink signal.
   * <p>
   * @param value the SatelliteDownlinkPolarisation value in a {@link TString}
   *              data type
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
   * Get the satellite hemisphere.
   * <p>
   * @return the SatelliteHemisphere value in a {@link TString} data type
   */
  public TString getSatelliteHemisphere() {
    return satelliteHemisphere;
  }

  /**
   * Set the satellite hemisphere.
   * <p>
   * @param value the SatelliteHemisphere value in a {@link TString} data type
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
   * (US),2})?)|1800000)(E|W))|X"
   * <p>
   * @return the SatelliteLongitude value in a {@link TString} data type
   */
  public TString getSatelliteLongitude() {
    return satelliteLongitude;
  }

  /**
   * Set the satellite longitude.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1
   * (US),2})?)|1800000)(E|W))|X"
   * <p>
   * @param value the SatelliteLongitude value in a {@link TString} data type
   */
  public void setSatelliteLongitude(TString value) {
    this.satelliteLongitude = value;
  }

  /**
   * Determine if the SatelliteLongitude is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteLongitude() {
    return (this.satelliteLongitude != null ? this.satelliteLongitude.isSetValue() : false);
  }

  /**
   * Get the satellite transponder ID.
   * <p>
   * @return the SatelliteTransponderID value in a {@link TString} data type
   */
  public TString getSatelliteTransponderID() {
    return satelliteTransponderID;
  }

  /**
   * Set the satellite transponder ID.
   * <p>
   * @param value the SatelliteTransponderID value in a {@link TString} data
   *              type
   */
  public void setSatelliteTransponderID(TString value) {
    this.satelliteTransponderID = value;
  }

  /**
   * Determine if the SatelliteTransponderID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSatelliteTransponderID() {
    return (this.satelliteTransponderID != null ? this.satelliteTransponderID.isSetValue() : false);
  }

  /**
   * Get the polarisation of the satellite uplink signal.
   * <p>
   * @return the SatelliteUplinkPolarisation value in a {@link TString} data
   *         type
   */
  public TString getSatelliteUplinkPolarisation() {
    return satelliteUplinkPolarisation;
  }

  /**
   * Set the polarisation of the satellite uplink signal.
   * <p>
   * @param value the SatelliteUplinkPolarisation value in a {@link TString}
   *              data type
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
   * Organisation or Role dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link POCInformation}
   *         instances
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
   * @param value An instances of type {@link ListCBO}
   * @return The current IntfReport object instance
   */
  public IntfReport withHelpRequired(ListCBO value) {
    setHelpRequired(new TString(value.value()));
    return this;
  }

  /**
   * Set how often the interference is experienced.
   * <p>
   * @param value An instances of type {@link ListCTI}
   * @return The current IntfReport object instance
   */
  public IntfReport withIntfPeriod(ListCTI value) {
    setIntfPeriod(new TString(value.value()));
    return this;
  }

  /**
   * Set the date/time the interference was first perceived.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current IntfReport object instance
   */
  public IntfReport withIntfStartDateTime(Calendar value) {
    setIntfStartDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date/time the interference was first perceived.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current IntfReport object instance
   */
  public IntfReport withIntfStartDateTime(Date value) {
    setIntfStartDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date/time the interference ceased.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current IntfReport object instance
   */
  public IntfReport withIntfStopDateTime(Calendar value) {
    setIntfStopDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set the date/time the interference ceased.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current IntfReport object instance
   */
  public IntfReport withIntfStopDateTime(Date value) {
    setIntfStopDateTime(new TCalendar(value));
    return this;
  }

  /**
   * Set IntfDescr, describe the interference. Provide as much information as
   * possible. State what actions you have taken so far to resolve the
   * interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withIntfDescr(String value) {
    setIntfDescr(new TString(value));
    return this;
  }

  /**
   * Set the nomenclature or description of equipment experiencing the
   * interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withAffectedEquipment(String value) {
    setAffectedEquipment(new TString(value));
    return this;
  }

  /**
   * Set the measured electromagnetic field strength.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceFieldStrength(Double value) {
    setSourceFieldStrength(new TDecimal(value));
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
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceLon(String value) {
    setSourceLon(new TString(value));
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
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceLat(String value) {
    setSourceLat(new TString(value));
    return this;
  }

  /**
   * Set the measured azimuth of the source from the victim.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceAz(Double value) {
    setSourceAz(new TDecimal(value));
    return this;
  }

  /**
   * Set the approximate position the source, if exact coordinates are not
   * known.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceLocDescr(String value) {
    setSourceLocDescr(new TString(value));
    return this;
  }

  /**
   * Set the nominal frequency of the interference, or the minimum frequency in
   * case of a range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceFreqMin(Double value) {
    setSourceFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum frequency of the interference, in case of a range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceFreqMax(Double value) {
    setSourceFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set SourceEmsClass, EmsClass, enter a three to five characters code,
   * derived from the table below, representing the emission classification. If
   * an "X" is used in any of the symbols, Remarks SHOULD be used to explain the
   * nature of the signal. First Symbol - Designates Type of Modulation of the
   * Main Carrier Unmodulated N - Emission of unmodulated carrier Amplitude
   * Modulated A - Double sideband H - Single sideband, full carrier R - Single
   * sideband, reduced or variable level carrier J - Single sideband, suppressed
   * carrier B - Independent sidebands C - Vestigial sidebands Angle-Modulated F
   * - Frequency modulation G - Phase modulation Amplitude and Angle-Modulated D
   * - Main carrier is amplitude-modulated and angle-modulated simultaneously or
   * in a preestablished sequence Pulse P - Sequence of unmodulated pulses K -
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
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceEmsClass(String value) {
    setSourceEmsClass(new TString(value));
    return this;
  }

  /**
   * Set the calculated or measured bandwidth of the interference source.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withSourceEmsBw(Double value) {
    setSourceEmsBw(new TDecimal(value));
    return this;
  }

  /**
   * Set VictimAsgnRef - The serial number of the assignment victim of the
   * interference.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "AS". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withVictimAssignment(Assignment)} instead.
   */
  @Deprecated
  public IntfReport withVictimAsgnRef(String value) {
    setVictimAsgnRef(new TString(value));
    return this;
  }

  /**
   * Set the nomenclature or other identifier of equipment experiencing the
   * interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withVictimSystem(String value) {
    setVictimSystem(new TString(value));
    return this;
  }

  /**
   * Set the country or area where the victim of the interference is located.
   * <p>
   * @param value An instances of type {@link ListCAO}
   * @return The current IntfReport object instance
   */
  public IntfReport withVictimCountry(ListCAO value) {
    setVictimCountry(new TString(value.value()));
    return this;
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
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|1800000)(E|W))|X"
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withVictimLon(String value) {
    setVictimLon(new TString(value));
    return this;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the victim of the interference. Same remarks for seconds and
   * leading zeros. Enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X"
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withVictimLat(String value) {
    setVictimLat(new TString(value));
    return this;
  }

  /**
   * Set the approximate position the victim of the interference, if exact
   * coordinates are not known.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withVictimLocDescr(String value) {
    setVictimLocDescr(new TString(value));
    return this;
  }

  /**
   * Set the nominal or lower frequency used by the victim of the interference.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withVictimFreqMin(Double value) {
    setVictimFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the upper frequency of the range, in case of an assignment over a
   * frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withVictimFreqMax(Double value) {
    setVictimFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the name of the satellite experiencing the interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteName(String value) {
    setSatelliteName(new TString(value));
    return this;
  }

  /**
   * Set the identifier of satellite channel experiencing the interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteChannel(String value) {
    setSatelliteChannel(new TString(value));
    return this;
  }

  /**
   * Set the satellite uplink frequency experiencing the interference
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteUplinkFreq(Double value) {
    setSatelliteUplinkFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set the effect the interference has on normal operations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withPerformanceEffects(String value) {
    setPerformanceEffects(new TString(value));
    return this;
  }

  /**
   * Set your best guess as to the cause of the interference.
   * <p>
   * @param value An instances of type {@link ListCJ1}
   * @return The current IntfReport object instance
   */
  public IntfReport withEvaluation(ListCJ1 value) {
    setEvaluation(new TString(value.value()));
    return this;
  }

  /**
   * Set what actions were taken to resolve the interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSolution(String value) {
    setSolution(new TString(value));
    return this;
  }

  /**
   * Set the responsible Combatant Commander for the geographic area where the
   * interference occurred and/or the victim's organization.
   * <p>
   * @param value An instances of type {@link ListUAG}
   * @return The current IntfReport object instance
   */
  public IntfReport withAffectedCSA(ListUAG value) {
    setAffectedCSA(new TString(value.value()));
    return this;
  }

  /**
   * Set the interference characteristics.
   * <p>
   * @param value An instances of type {@link ListUCH}
   * @return The current IntfReport object instance
   */
  public IntfReport withCharacteristics(ListUCH value) {
    setCharacteristics(new TString(value.value()));
    return this;
  }

  /**
   * Set whether the interference affects GPS reception.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current IntfReport object instance
   */
  public IntfReport withGPSAffected(ListCBO value) {
    setGPSAffected(new TString(value.value()));
    return this;
  }

  /**
   * Set the local event ID.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withLocalEventID(String value) {
    setLocalEventID(new TString(value));
    return this;
  }

  /**
   * Set the network circuits affected by the interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withNetCircuitsAffected(String value) {
    setNetCircuitsAffected(new TString(value));
    return this;
  }

  /**
   * Set the networks affected by the interference.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withNetsAffected(String value) {
    setNetsAffected(new TString(value));
    return this;
  }

  /**
   * Set the satellite communication priority.
   * <p>
   * @param value An instances of type {@link ListUPR}
   * @return The current IntfReport object instance
   */
  public IntfReport withSATCOMPriority(ListUPR value) {
    setSATCOMPriority(new TString(value.value()));
    return this;
  }

  /**
   * Set whether the interference affects satellite reception.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteAffected(ListCBO value) {
    setSatelliteAffected(new TString(value.value()));
    return this;
  }

  /**
   * Set the polarisation of the satellite downlink signal.
   * <p>
   * @param value An instances of type {@link ListCPO}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteDownlinkPolarisation(ListCPO value) {
    setSatelliteDownlinkPolarisation(new TString(value.value()));
    return this;
  }

  /**
   * Set the satellite hemisphere.
   * <p>
   * @param value An instances of type {@link ListCCO}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteHemisphere(ListCCO value) {
    setSatelliteHemisphere(new TString(value.value()));
    return this;
  }

  /**
   * Set the satellite longitude.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "((((((0[0-9]{2})|(1[0-7][0-9]))([0-5][0-9]){2})(.[0-9]{1
   * (US),2})?)|1800000)(E|W))|X"
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteLongitude(String value) {
    setSatelliteLongitude(new TString(value));
    return this;
  }

  /**
   * Set the satellite transponder ID.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfReport object instance
   */
  public IntfReport withSatelliteTransponderID(String value) {
    setSatelliteTransponderID(new TString(value));
    return this;
  }

  /**
   * Set the polarisation of the satellite uplink signal.
   * <p>
   * @param value An instances of type {@link ListCPO}
   * @return The current IntfReport object instance
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
   * @param values One or more instances of type {@link POCInformation}
   * @return The current IntfReport object instance
   */
  public IntfReport withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current IntfReport object instance
   */
  public IntfReport withPOCInformation(Set<POCInformation> values) {
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
      + (satelliteDownlinkPolarisation != null ? " satelliteDownlinkPolarisation [" + satelliteDownlinkPolarisation + "]" : "")
      + (victimLat != null ? " victimLat [" + victimLat + "]" : "")
      + (satelliteLongitude != null ? " satelliteLongitude [" + satelliteLongitude + "]" : "")
      + (intfStartDateTime != null ? " intfStartDateTime [" + intfStartDateTime + "]" : "")
      + (satelliteName != null ? " satelliteName [" + satelliteName + "]" : "")
      + (sourceLon != null ? " sourceLon [" + sourceLon + "]" : "")
      + (sourceFreqMax != null ? " sourceFreqMax [" + sourceFreqMax + "]" : "")
      + (sourceLat != null ? " sourceLat [" + sourceLat + "]" : "")
      + (solution != null ? " solution [" + solution + "]" : "")
      + (evaluation != null ? " evaluation [" + evaluation + "]" : "")
      + (performanceEffects != null ? " performanceEffects [" + performanceEffects + "]" : "")
      + (satelliteHemisphere != null ? " satelliteHemisphere [" + satelliteHemisphere + "]" : "")
      + (victimLocDescr != null ? " victimLocDescr [" + victimLocDescr + "]" : "")
      + (sourceFieldStrength != null ? " sourceFieldStrength [" + sourceFieldStrength + "]" : "")
      + (sourceEmsClass != null ? " sourceEmsClass [" + sourceEmsClass + "]" : "")
      + (satelliteUplinkPolarisation != null ? " satelliteUplinkPolarisation [" + satelliteUplinkPolarisation + "]" : "")
      + (gpsAffected != null ? " gpsAffected [" + gpsAffected + "]" : "")
      + (satelliteChannel != null ? " satelliteChannel [" + satelliteChannel + "]" : "")
      + (sourceAz != null ? " sourceAz [" + sourceAz + "]" : "")
      + (satelliteTransponderID != null ? " satelliteTransponderID [" + satelliteTransponderID + "]" : "")
      + (victimFreqMax != null ? " victimFreqMax [" + victimFreqMax + "]" : "")
      + (satelliteUplinkFreq != null ? " satelliteUplinkFreq [" + satelliteUplinkFreq + "]" : "")
      + (satelliteAffected != null ? " satelliteAffected [" + satelliteAffected + "]" : "")
      + (sourceLocDescr != null ? " sourceLocDescr [" + sourceLocDescr + "]" : "")
      + (affectedEquipment != null ? " affectedEquipment [" + affectedEquipment + "]" : "")
      + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
      + (intfPeriod != null ? " intfPeriod [" + intfPeriod + "]" : "")
      + (satcomPriority != null ? " satcomPriority [" + satcomPriority + "]" : "")
      + (victimAsgnRef != null ? " victimAsgnRef [" + victimAsgnRef + "]" : "")
      + (netsAffected != null ? " netsAffected [" + netsAffected + "]" : "")
      + (characteristics != null ? " characteristics [" + characteristics + "]" : "")
      + (victimCountry != null ? " victimCountry [" + victimCountry + "]" : "")
      + (sourceFreqMin != null ? " sourceFreqMin [" + sourceFreqMin + "]" : "")
      + (netCircuitsAffected != null ? " netCircuitsAffected [" + netCircuitsAffected + "]" : "")
      + (victimLon != null ? " victimLon [" + victimLon + "]" : "")
      + (intfStopDateTime != null ? " intfStopDateTime [" + intfStopDateTime + "]" : "")
      + (helpRequired != null ? " helpRequired [" + helpRequired + "]" : "")
      + (intfDescr != null ? " intfDescr [" + intfDescr + "]" : "")
      + (victimSystem != null ? " victimSystem [" + victimSystem + "]" : "")
      + (affectedCSA != null ? " affectedCSA [" + affectedCSA + "]" : "")
      + (victimFreqMin != null ? " victimFreqMin [" + victimFreqMin + "]" : "")
      + (sourceEmsBw != null ? " sourceEmsBw [" + sourceEmsBw + "]" : "")
      + (localEventID != null ? " localEventID [" + localEventID + "]" : "")
      + "\n  IntfReport." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link IntfReport} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TCalendar IntfStartDateTime}, {@link TDecimal VictimFreqMin}.
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
   * "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
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
   * @param value An instances of type {@link Assignment}
   * @return The current IntfReport object instance
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
   * @return The current IntfReport object instance
   */
  @Override
  public IntfReport prepare() {
    super.prepare();
    this.victimAsgnRef = victimAssignment != null ? victimAssignment.getSerial() : null;
    return this;
  }//</editor-fold>

}
