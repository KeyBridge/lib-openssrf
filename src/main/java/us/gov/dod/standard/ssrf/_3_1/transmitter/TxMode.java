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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;
import us.gov.dod.standard.ssrf._3_1.receiver.Baseband;
import us.gov.dod.standard.ssrf._3_1.receiver.EmsClass;
import us.gov.dod.standard.ssrf._3_1.receiver.SpreadSpectrum;

/**
 * TxMode and its sub-elements define all the technical parameters for a mode of
 * operation of the Transmitter.
 * <p>
 * Element of {@link Transmitter}
 * <p>
 * Sub-Elements are
 * {@link Baseband}, {@link EmsClass}, {@link ObservedMOPAnalysis}, {@link ObservedPulseAnalysis}, {@link ObservedRFAnalysis}, {@link Power}, {@link Pulse}, {@link SpreadSpectrum}, {@link SubcarrierFreq}, {@link TxModulation}, {@link TxSignalTuning}
 * <p>
 * Example:
 * <pre>
 * &lt;TxMode&gt;
 *   &lt;BurstDuration  cls="U"&gt;.001&lt;/BurstDuration &gt;
 *   &lt;BurstNumPulses  cls="U"&gt;458&lt;/BurstNumPulses &gt;
 *   &lt;BurstOffTime  cls="U"&gt;.13&lt;/BurstOffTime &gt;
 *   &lt;BurstRate  cls="U"&gt;5984&lt;/BurstRate &gt;
 *   &lt;ChannelDwell cls="U"&gt;.2387&lt;/ChannelDwell&gt;
 *   &lt;curves cls="U"&gt;34&lt;/curves&gt;
 *   &lt;Description  cls="U"&gt;Targets 893 and 569&lt;/Description &gt;
 *   &lt;FreqTolerance  cls="U"&gt;.0001&lt;/FreqTolerance &gt;
 *   &lt;FreqToleranceUnit cls="U"&gt;ppm&lt;/FreqToleranceUnit&gt;
 *   &lt;IntermodulationEffect cls="U"&gt;Friendly receivers performance degraded by 12 percent&lt;/IntermodulationEffect&gt;
 *   &lt;IntermodulationPct  cls="U"&gt;17&lt;/IntermodulationPct &gt;
 *   &lt;ModeID  cls="U"&gt;Narrowband Pulse&lt;/ModeID &gt;
 *   &lt;NecessaryBw  cls="U"&gt;3123.67&lt;/NecessaryBw &gt;
 *   &lt;NumSideTones  cls="U"&gt;16&lt;/NumSideTones &gt;
 *   &lt;NumSubCarriers  cls="U"&gt;16&lt;/NumSubCarriers &gt;
 *   &lt;OccBw cls="U"&gt;3363.67&lt;/OccBw&gt;
 *   &lt;OccBwCalculated cls="U"&gt;Yes&lt;/OccBwCalculated&gt;
 *   &lt;OtherHarmonicLevel  cls="U"&gt;106&lt;/OtherHarmonicLevel &gt;
 *   &lt;RadarType  cls="U"&gt;FM Pulse&lt;/RadarType &gt;
 *   &lt;SecondHarmonicLevel  cls="U"&gt;89&lt;/SecondHarmonicLevel &gt;
 *   &lt;SpuriousLevel  cls="U"&gt;90&lt;/SpuriousLevel &gt;
 *   &lt;ThirdHarmonicLevel  cls="U"&gt;93&lt;/ThirdHarmonicLevel &gt;
 *   &lt;Tunability  cls="U"&gt;Fixed+Stepped&lt;/Tunability &gt;
 *   &lt;TuningMethod  cls="U"&gt;Synthesizer Microprocessor Controlled&lt;/TuningMethod &gt;
 *   &lt;GpsNBL1Level  cls="U"&gt;46.95&lt;/GpsNBL1Level &gt;
 *   &lt;GpsNBL2Level  cls="U"&gt;66.98&lt;/GpsNBL2Level &gt;
 *   &lt;GpsWBL1Level  cls="U"&gt;12.89&lt;/GpsWBL1Level &gt;
 *   &lt;GpsWBL2Level  cls="U"&gt;16.975&lt;/GpsWBL2Level &gt;
 *   &lt;JitterCapable cls="U"&gt;Yes&lt;/JitterCapable&gt;
 *   &lt;ModeName  cls="U"&gt;Broadband Sweep Jamming&lt;/ModeName &gt;
 *   &lt;ModulationType  cls="U"&gt;Pulse&lt;/ModulationType &gt;
 * &lt;/TxMode&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxMode", propOrder = {
  "modeID",
  "description",
  "necessaryBw",
  "tunability",
  "tuningMethod",
  "intermodPct",
  "intermodEffect",
  "burstRate",
  "burstDuration",
  "burstNumPulses",
  "burstOffTime",
  "occBw",
  "occBwCalculated",
  "secondHarmonicLevel",
  "thirdHarmonicLevel",
  "otherHarmonicLevel",
  "spuriousLevel",
  "freqTolerance",
  "freqToleranceUnit",
  "radarType",
  "channelDwell",
  "numSubCarriers",
  "numSideTones",
  "gpsNBL1Level",
  "gpsNBL2Level",
  "gpsWBL1Level",
  "gpsWBL2Level",
  "modulationType",
  "modeName",
  "jitterCapable",
  "emsClass",
  "power",
  "txSignalTuning",
  "txModulation",
  "baseband",
  "pulse",
  "subcarrierFreq",
  "spreadSpectrum",
  "observedMOPAnalysis",
  "observedRFAnalysis",
  "observedPulseAnalysis"
})
public class TxMode {

  /**
   * ModeID - Mode Identifier (Required)
   * <p>
   * The unique identifier of a TxMode of the transmitter in this configuration.
   * This mode is from the transmitter specified in the Serial field of the
   * parent TxRef element.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeID", required = true)
  private S20 modeID;
  /**
   * Description - Mode Description (Optional)
   * <p>
   * A description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * Format is S100
   * <p>
   * Attribute group ModeInfo (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private S100 description;
  /**
   * NecessaryBw - Necessary Bandwidth (Optional)
   * <p>
   * The necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NecessaryBw", required = false)
  private FreqM necessaryBw;
  /**
   * Tunability - Tunability (Optional)
   * <p>
   * The tuning capability.
   * <p>
   * Format is L:CTU
   * <p>
   * Attribute group Tunability (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Tunability", required = false)
  private TString tunability;
  /**
   * TuningMethod - Tuning Method (Optional)
   * <p>
   * The device or process used to tune the equipment through the RF spectrum.
   * <p>
   * Format is L:CTN
   * <p>
   * Attribute group Tunability (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TuningMethod", required = false)
  private TString tuningMethod;

  @XmlElement(name = "IntermodPct", required = false)
  private Percent intermodPct;

  @XmlElement(name = "IntermodEffect", required = false)
  private MEMO intermodEffect;
  /**
   * BurstRate - Burst Rate (Optional)
   * <p>
   * The number of pulse bursts per second.
   * <p>
   * Format is UN(12,3)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstRate", required = false)
  private BurstRate burstRate;
  /**
   * BurstDuration - Burst Duration (Optional)
   * <p>
   * The pulse burst duration.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstDuration", required = false)
  private microsecs burstDuration;
  /**
   * BurstNumPulses - Number of Pulses in Burst (Optional)
   * <p>
   * The number of pulses in a single pulse burst.
   * <p>
   * Format is UN(8)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstNumPulses", required = false)
  private UN8 burstNumPulses;
  /**
   * BurstOffTime - Burst Off-Time (Optional)
   * <p>
   * The pulse burst off time in microseconds (duration of time between the end
   * of one pulse burst to the start of the next pulse burst).
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "BurstOffTime", required = false)
  private microsecs burstOffTime;
  /**
   * OccBw - Occupied Bandwidth (Optional)
   * <p>
   * The minimum bandwidth utilized to process 99.5% of the emission spectra.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group OccupiedBw (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OccBw")
  private FreqM occBw;
  /**
   * OccBwCalculated - Calculated Occupied Bandwidth Indicator (Optional)
   * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement.
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group OccupiedBw (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OccBwCalculated", required = false)
  private TString occBwCalculated;
  /**
   * SecondHarmonicLevel - Second Harmonic Level (Optional)
   * <p>
   * The out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SecondHarmonicLevel", required = false)
  private dB secondHarmonicLevel;
  /**
   * ThirdHarmonicLevel - Third Harmonic Level (Optional)
   * <p>
   * The out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ThirdHarmonicLevel", required = false)
  private dB thirdHarmonicLevel;
  /**
   * OtherHarmonicLevel - Other Harmonic Level (Optional)
   * <p>
   * The greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OtherHarmonicLevel", required = false)
  private dB otherHarmonicLevel;
  /**
   * SpuriousLevel - Spurious Emissions Level (Optional)
   * <p>
   * The maximum of all emission levels which occur outside the bandwidth of the
   * fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Spurious (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpuriousLevel", required = false)
  private dB spuriousLevel;
  /**
   * FreqTolerance - Frequency Tolerance (Optional)
   * <p>
   * The drift in Hz or in ppm using the formula: Frequency tolerance (ppm) =
   * Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm) in
   * FreqToleranceUnit.
   * <p>
   * Format is UN(18,6)
   * <p>
   * Attribute group FreqTolerance (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqTolerance")
  private UN18_6 freqTolerance;
  /**
   * FreqToleranceUnit - Frequency Tolerance Unit (Optional)
   * <p>
   * The units in which the Frequency Tolerance is expressed.
   * <p>
   * Format is L:CFO
   * <p>
   * Attribute group FreqTolerance (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqToleranceUnit")
  private TString freqToleranceUnit;
  /**
   * RadarType - Radar Modulation Type (Optional)
   * <p>
   * The type of radar.
   * <p>
   * Format is L:CRA
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RadarType", required = false)
  private TString radarType;
  /**
   * ChannelDwell - Channel Duration (Optional)
   * <p>
   * The time the transmitter is on.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChannelDwell", required = false)
  private microsecs channelDwell;
  /**
   * NumSubCarriers - Number of Subcarriers (Optional)
   * <p>
   * The number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumSubCarriers", required = false)
  private UN5 numSubCarriers;
  /**
   * NumSideTones - Number of Side Tones (Optional)
   * <p>
   * The number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumSideTones", required = false)
  private UN5 numSideTones;
  /**
   * US:GpsNBL1Level - GPS NBL1 Level (Optional)
   * <p>
   * The narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * Format is SN(5,3) (dBW)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsNBL1Level", required = false)
  private US_DBW gpsNBL1Level;
  /**
   * US:GpsNBL2Level - GPS NBL2 Level (Optional)
   * <p>
   * The narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * Format is SN(5,3) (dBW)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsNBL2Level", required = false)
  private US_DBW gpsNBL2Level;
  /**
   * US:GpsWBL1Level - GpsWBL1Level (Optional)
   * <p>
   * The wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * Format is SN(9,6) (dBW/Hz)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsWBL1Level", required = false)
  private US_DBWHz gpsWBL1Level;
  /**
   * US:GpsWBL2Level - GpsWBL1Level (Optional)
   * <p>
   * The wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * Format is SN(9,6) (dBW/Hz)
   * <p>
   * Attribute group (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GpsWBL2Level", required = false)
  private US_DBWHz gpsWBL2Level;
  /**
   * US:ModulationType - Modulation Type (Optional)
   * <p>
   * The type of modulation.
   * <p>
   * Format is L:UMD
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModulationType", required = false)
  private TString modulationType;
  /**
   * US:ModeName - Mode Name (Optional)
   * <p>
   * A short name for the mode.
   * <p>
   * Format is S40
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModeName", required = false)
  private S40 modeName;
  /**
   * In Data Item JitterCapable (US), indicate whether the mode of the pulse
   * stream is jitter capable.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JitterCapable", required = false)
  private TString jitterCapable;
  /**
   * EmsClass (Optional)
   * <p>
   * EmsClass identifies the emission classification symbols that define the
   * baseband modulating characteristics of the emission designator. The
   * emission classification consists of the three required symbols and the two
   * optional symbols.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EmsClass", nillable = true)
  private Set<EmsClass> emsClass;
  /**
   * PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of this transmitter mode when in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Power")
  private Set<Power> power;
  /**
   * TxSignalTuning (Optional)
   * <p>
   * TxSignalTuning indicates the tuning capabilities, the specific frequency or
   * range of frequencies within which the equipment may tune, and the tuning
   * increments of the equipment.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TxSignalTuning")
  private Set<TxSignalTuning> txSignalTuning;
  /**
   * TxModulation (Optional)
   * <p>
   * TxModulation contains the detailed characteristics of the modulation on the
   * transmitter side.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TxModulation")
  private Set<TxModulation> txModulation;
  /**
   * Baseband (Optional)
   * <p>
   * Baseband defines the parameters of the modulating or received signal.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Baseband")
  private Set<Baseband> baseband;
  /**
   * BurstNumPulses - Number of Pulses in Burst (Optional)
   * <p>
   * The number of pulses in a single pulse burst.
   * <p>
   * Format is UN(8)
   * <p>
   * Attribute group Burst (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Pulse")
  private Set<Pulse> pulse;
  /**
   * SubcarrierFreq (Optional)
   * <p>
   * SubcarrierFreq describes the secondary channel that
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SubcarrierFreq")
  private Set<SubcarrierFreq> subcarrierFreq;
  /**
   * Spread Spectrum (Optional)
   * <p>
   * SpreadSpectrum contains characteristics of systems using spread spectrum
   * techniques.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpreadSpectrum")
  private SpreadSpectrum spreadSpectrum;
  /**
   * US:ObservedMOPAnalysis (Optional)
   * <p>
   * ObservedMOPAnalysis (US) contains data describing the characteristic and
   * pattern information for the Modulation impressed On the Pulse (MOP).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedMOPAnalysis")
  private Set<ObservedMOPAnalysis> observedMOPAnalysis;
  /**
   * US:ObservedRFAnalysis (Optional)
   * <p>
   * ObservedRFAnalysis (US) contains the statisical results of actual RF
   * observations.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedRFAnalysis")
  private Set<ObservedRFAnalysis> observedRFAnalysis;
  /**
   * US:ObservedPulseAnalysis (Optional)
   * <p>
   * ObservedPulseAnalysis (US) contains data describing the specific
   * characteristics of the pulse group, pulse sequence, and distinct pulse
   * information.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedPulseAnalysis")
  private Set<ObservedPulseAnalysis> observedPulseAnalysis;
  /**
   * curves - Links to Curves (Optional)
   * <p>
   * The list of indices referring to Curves applicable to the data item.
   * <p>
   * Format is List of UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "curves")
  private Set<BigInteger> curves;

  /**
   * Get the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getModeID() {
    return modeID;
  }

  /**
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setModeID(S20 value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getDescription() {
    return description;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setDescription(S100 value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setNecessaryBw(FreqM value) {
    this.necessaryBw = value;
  }

  /**
   * Determine if the NecessaryBw is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNecessaryBw() {
    return (this.necessaryBw != null ? this.necessaryBw.isSetValue() : false);
  }

  /**
   * Get the tuning capability..
   * <p>
   * @return the Tunability value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTunability() {
    return tunability;
  }

  /**
   * Set the tuning capability..
   * <p>
   * @param value the Tunability value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTunability(TString value) {
    this.tunability = value;
  }

  /**
   * Determine if the Tunability is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTunability() {
    return (this.tunability != null ? this.tunability.isSetValue() : false);
  }

  /**
   * Get the device or process used to tune the equipment through the RF
   * spectrum..
   * <p>
   * @return the TuningMethod value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum..
   * <p>
   * @param value the TuningMethod value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setTuningMethod(TString value) {
    this.tuningMethod = value;
  }

  /**
   * Determine if the TuningMethod is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningMethod() {
    return (this.tuningMethod != null ? this.tuningMethod.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link Percent} instance
   * @since 3.1.0
   */
  public Percent getIntermodPct() {
    return intermodPct;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link Percent} instance
   * @since 3.1.0
   */
  public void setIntermodPct(Percent value) {
    this.intermodPct = value;
  }

  /**
   * Determine if the IntermodPct is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodPct() {
    return (this.intermodPct != null ? this.intermodPct.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Set .
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setIntermodEffect(MEMO value) {
    this.intermodEffect = value;
  }

  /**
   * Determine if the IntermodEffect is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodEffect() {
    return (this.intermodEffect != null ? this.intermodEffect.isSetValue() : false);
  }

  /**
   * Get the number of pulse bursts per second..
   * <p>
   * @return a {@link BurstRate} instance
   * @since 3.1.0
   */
  public BurstRate getBurstRate() {
    return burstRate;
  }

  /**
   * Set the number of pulse bursts per second..
   * <p>
   * @param value a {@link BurstRate} instance
   * @since 3.1.0
   */
  public void setBurstRate(BurstRate value) {
    this.burstRate = value;
  }

  /**
   * Determine if the BurstRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstRate() {
    return (this.burstRate != null ? this.burstRate.isSetValue() : false);
  }

  /**
   * Get the pulse burst duration..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getBurstDuration() {
    return burstDuration;
  }

  /**
   * Set the pulse burst duration..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setBurstDuration(microsecs value) {
    this.burstDuration = value;
  }

  /**
   * Determine if the BurstDuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstDuration() {
    return (this.burstDuration != null ? this.burstDuration.isSetValue() : false);
  }

  /**
   * Get the number of pulses in a single pulse burst..
   * <p>
   * @return a {@link UN8} instance
   * @since 3.1.0
   */
  public UN8 getBurstNumPulses() {
    return burstNumPulses;
  }

  /**
   * Set the number of pulses in a single pulse burst..
   * <p>
   * @param value a {@link UN8} instance
   * @since 3.1.0
   */
  public void setBurstNumPulses(UN8 value) {
    this.burstNumPulses = value;
  }

  /**
   * Determine if the BurstNumPulses is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstNumPulses() {
    return (this.burstNumPulses != null ? this.burstNumPulses.isSetValue() : false);
  }

  /**
   * Get the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst)..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getBurstOffTime() {
    return burstOffTime;
  }

  /**
   * Set the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst)..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setBurstOffTime(microsecs value) {
    this.burstOffTime = value;
  }

  /**
   * Determine if the BurstOffTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstOffTime() {
    return (this.burstOffTime != null ? this.burstOffTime.isSetValue() : false);
  }

  /**
   * Get the minimum bandwidth utilized to process 99.5% of the emission
   * spectra..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getOccBw() {
    return occBw;
  }

  /**
   * Set the minimum bandwidth utilized to process 99.5% of the emission
   * spectra..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setOccBw(FreqM value) {
    this.occBw = value;
  }

  /**
   * Determine if the OccBw is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOccBw() {
    return (this.occBw != null ? this.occBw.isSetValue() : false);
  }

  /**
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement..
   * <p>
   * @return the OccBwCalculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOccBwCalculated() {
    return occBwCalculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement..
   * <p>
   * @param value the OccBwCalculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOccBwCalculated(TString value) {
    this.occBwCalculated = value;
  }

  /**
   * Determine if the OccBwCalculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOccBwCalculated() {
    return (this.occBwCalculated != null ? this.occBwCalculated.isSetValue() : false);
  }

  /**
   * Get the out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getSecondHarmonicLevel() {
    return secondHarmonicLevel;
  }

  /**
   * Set the out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setSecondHarmonicLevel(dB value) {
    this.secondHarmonicLevel = value;
  }

  /**
   * Determine if the SecondHarmonicLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecondHarmonicLevel() {
    return (this.secondHarmonicLevel != null ? this.secondHarmonicLevel.isSetValue() : false);
  }

  /**
   * Get the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getThirdHarmonicLevel() {
    return thirdHarmonicLevel;
  }

  /**
   * Set the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setThirdHarmonicLevel(dB value) {
    this.thirdHarmonicLevel = value;
  }

  /**
   * Determine if the ThirdHarmonicLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetThirdHarmonicLevel() {
    return (this.thirdHarmonicLevel != null ? this.thirdHarmonicLevel.isSetValue() : false);
  }

  /**
   * Get the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getOtherHarmonicLevel() {
    return otherHarmonicLevel;
  }

  /**
   * Set the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setOtherHarmonicLevel(dB value) {
    this.otherHarmonicLevel = value;
  }

  /**
   * Determine if the OtherHarmonicLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOtherHarmonicLevel() {
    return (this.otherHarmonicLevel != null ? this.otherHarmonicLevel.isSetValue() : false);
  }

  /**
   * Get the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal..
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getSpuriousLevel() {
    return spuriousLevel;
  }

  /**
   * Set the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal..
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setSpuriousLevel(dB value) {
    this.spuriousLevel = value;
  }

  /**
   * Determine if the SpuriousLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpuriousLevel() {
    return (this.spuriousLevel != null ? this.spuriousLevel.isSetValue() : false);
  }

  /**
   * Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit..
   * <p>
   * @return a {@link UN18_6} instance
   * @since 3.1.0
   */
  public UN18_6 getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit..
   * <p>
   * @param value a {@link UN18_6} instance
   * @since 3.1.0
   */
  public void setFreqTolerance(UN18_6 value) {
    this.freqTolerance = value;
  }

  /**
   * Determine if the FreqTolerance is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqTolerance() {
    return (this.freqTolerance != null ? this.freqTolerance.isSetValue() : false);
  }

  /**
   * Get the units in which the Frequency Tolerance is expressed..
   * <p>
   * @return the FreqToleranceUnit value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqToleranceUnit() {
    return freqToleranceUnit;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed..
   * <p>
   * @param value the FreqToleranceUnit value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setFreqToleranceUnit(TString value) {
    this.freqToleranceUnit = value;
  }

  /**
   * Determine if the FreqToleranceUnit is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqToleranceUnit() {
    return (this.freqToleranceUnit != null ? this.freqToleranceUnit.isSetValue() : false);
  }

  /**
   * Get the type of radar..
   * <p>
   * @return the RadarType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRadarType() {
    return radarType;
  }

  /**
   * Set the type of radar..
   * <p>
   * @param value the RadarType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRadarType(TString value) {
    this.radarType = value;
  }

  /**
   * Determine if the RadarType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRadarType() {
    return (this.radarType != null ? this.radarType.isSetValue() : false);
  }

  /**
   * Get the time the transmitter is on..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getChannelDwell() {
    return channelDwell;
  }

  /**
   * Set the time the transmitter is on..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setChannelDwell(microsecs value) {
    this.channelDwell = value;
  }

  /**
   * Determine if the ChannelDwell is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelDwell() {
    return (this.channelDwell != null ? this.channelDwell.isSetValue() : false);
  }

  /**
   * Get the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually..
   * <p>
   * @return a {@link UN5} instance
   * @since 3.1.0
   */
  public UN5 getNumSubCarriers() {
    return numSubCarriers;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually..
   * <p>
   * @param value a {@link UN5} instance
   * @since 3.1.0
   */
  public void setNumSubCarriers(UN5 value) {
    this.numSubCarriers = value;
  }

  /**
   * Determine if the NumSubCarriers is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSubCarriers() {
    return (this.numSubCarriers != null ? this.numSubCarriers.isSetValue() : false);
  }

  /**
   * Get the number of side tone frequencies for the sidetones modulating the
   * carrier individually..
   * <p>
   * @return a {@link UN5} instance
   * @since 3.1.0
   */
  public UN5 getNumSideTones() {
    return numSideTones;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually..
   * <p>
   * @param value a {@link UN5} instance
   * @since 3.1.0
   */
  public void setNumSideTones(UN5 value) {
    this.numSideTones = value;
  }

  /**
   * Determine if the NumSideTones is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSideTones() {
    return (this.numSideTones != null ? this.numSideTones.isSetValue() : false);
  }

  /**
   * Get the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band..
   * <p>
   * @return a {@link US_DBW} instance
   * @since 3.1.0
   */
  public US_DBW getGpsNBL1Level() {
    return gpsNBL1Level;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band..
   * <p>
   * @param value a {@link US_DBW} instance
   * @since 3.1.0
   */
  public void setGpsNBL1Level(US_DBW value) {
    this.gpsNBL1Level = value;
  }

  /**
   * Determine if the GpsNBL1Level is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsNBL1Level() {
    return (this.gpsNBL1Level != null ? this.gpsNBL1Level.isSetValue() : false);
  }

  /**
   * Get the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band..
   * <p>
   * @return a {@link US_DBW} instance
   * @since 3.1.0
   */
  public US_DBW getGpsNBL2Level() {
    return gpsNBL2Level;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band..
   * <p>
   * @param value a {@link US_DBW} instance
   * @since 3.1.0
   */
  public void setGpsNBL2Level(US_DBW value) {
    this.gpsNBL2Level = value;
  }

  /**
   * Determine if the GpsNBL2Level is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsNBL2Level() {
    return (this.gpsNBL2Level != null ? this.gpsNBL2Level.isSetValue() : false);
  }

  /**
   * Get the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band..
   * <p>
   * @return a {@link US_DBWHz} instance
   * @since 3.1.0
   */
  public US_DBWHz getGpsWBL1Level() {
    return gpsWBL1Level;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band..
   * <p>
   * @param value a {@link US_DBWHz} instance
   * @since 3.1.0
   */
  public void setGpsWBL1Level(US_DBWHz value) {
    this.gpsWBL1Level = value;
  }

  /**
   * Determine if the GpsWBL1Level is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsWBL1Level() {
    return (this.gpsWBL1Level != null ? this.gpsWBL1Level.isSetValue() : false);
  }

  /**
   * Get the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band..
   * <p>
   * @return a {@link US_DBWHz} instance
   * @since 3.1.0
   */
  public US_DBWHz getGpsWBL2Level() {
    return gpsWBL2Level;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band..
   * <p>
   * @param value a {@link US_DBWHz} instance
   * @since 3.1.0
   */
  public void setGpsWBL2Level(US_DBWHz value) {
    this.gpsWBL2Level = value;
  }

  /**
   * Determine if the GpsWBL2Level is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsWBL2Level() {
    return (this.gpsWBL2Level != null ? this.gpsWBL2Level.isSetValue() : false);
  }

  /**
   * Get the type of modulation..
   * <p>
   * @return the ModulationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModulationType() {
    return modulationType;
  }

  /**
   * Set the type of modulation..
   * <p>
   * @param value the ModulationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModulationType(TString value) {
    this.modulationType = value;
  }

  /**
   * Determine if the ModulationType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModulationType() {
    return (this.modulationType != null ? this.modulationType.isSetValue() : false);
  }

  /**
   * Get a short name for the mode..
   * <p>
   * @return a {@link S40} instance
   * @since 3.1.0
   */
  public S40 getModeName() {
    return modeName;
  }

  /**
   * Set a short name for the mode..
   * <p>
   * @param value a {@link S40} instance
   * @since 3.1.0
   */
  public void setModeName(S40 value) {
    this.modeName = value;
  }

  /**
   * Determine if the ModeName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeName() {
    return (this.modeName != null ? this.modeName.isSetValue() : false);
  }

  /**
   * Get In Data Item JitterCapable (US), indicate whether the mode of the pulse
   * stream is jitter capable..
   * <p>
   * @return the JitterCapable value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getJitterCapable() {
    return jitterCapable;
  }

  /**
   * Set In Data Item JitterCapable (US), indicate whether the mode of the pulse
   * stream is jitter capable..
   * <p>
   * @param value the JitterCapable value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setJitterCapable(TString value) {
    this.jitterCapable = value;
  }

  /**
   * Determine if the JitterCapable is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetJitterCapable() {
    return (this.jitterCapable != null ? this.jitterCapable.isSetValue() : false);
  }

  /**
   * Get the EmsClass
   * <p>
   * Complex element EmsClass identifies the emission classification symbols
   * that define the baseband modulating characteristics of the emission
   * designator. The emission classification consists of the three required
   * symbols and the two optional symbols..
   * <p>
   * @return a {@link EmsClass} instance
   * @since 3.1.0
   */
  public Set<EmsClass> getEmsClass() {
    if (emsClass == null) {
      emsClass = new HashSet<>();
    }
    return this.emsClass;
  }

  /**
   * Determine if the EmsClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEmsClass() {
    return ((this.emsClass != null) && (!this.emsClass.isEmpty()));
  }

  /**
   * Clear the EmsClass field. This sets the field to null.
   */
  public void unsetEmsClass() {
    this.emsClass = null;
  }

  /**
   * Get the power limit of this transmitter mode when in this configuration..
   * <p>
   * @return a {@link Power} instance
   * @since 3.1.0
   */
  public Set<Power> getPower() {
    if (power == null) {
      power = new HashSet<>();
    }
    return this.power;
  }

  /**
   * Determine if the Power is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPower() {
    return ((this.power != null) && (!this.power.isEmpty()));
  }

  /**
   * Clear the Power field. This sets the field to null.
   */
  public void unsetPower() {
    this.power = null;
  }

  /**
   * Get the TxSignalTuning
   * <p>
   * Complex element TxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment..
   * <p>
   * @return a {@link TxSignalTuning} instance
   * @since 3.1.0
   */
  public Set<TxSignalTuning> getTxSignalTuning() {
    if (txSignalTuning == null) {
      txSignalTuning = new HashSet<>();
    }
    return this.txSignalTuning;
  }

  /**
   * Determine if the TxSignalTuning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxSignalTuning() {
    return ((this.txSignalTuning != null) && (!this.txSignalTuning.isEmpty()));
  }

  /**
   * Clear the TxSignalTuning field. This sets the field to null.
   */
  public void unsetTxSignalTuning() {
    this.txSignalTuning = null;
  }

  /**
   * Get the TxModulation
   * <p>
   * Complex element TxModulation contains the detailed characteristics of the
   * modulation on the transmitter side..
   * <p>
   * @return a {@link TxModulation} instance
   * @since 3.1.0
   */
  public Set<TxModulation> getTxModulation() {
    if (txModulation == null) {
      txModulation = new HashSet<>();
    }
    return this.txModulation;
  }

  /**
   * Determine if the TxModulation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTxModulation() {
    return ((this.txModulation != null) && (!this.txModulation.isEmpty()));
  }

  /**
   * Clear the TxModulation field. This sets the field to null.
   */
  public void unsetTxModulation() {
    this.txModulation = null;
  }

  /**
   * Get the Baseband
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal..
   * <p>
   * @return a {@link Baseband} instance
   * @since 3.1.0
   */
  public Set<Baseband> getBaseband() {
    if (baseband == null) {
      baseband = new HashSet<>();
    }
    return this.baseband;
  }

  /**
   * Determine if the Baseband is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBaseband() {
    return ((this.baseband != null) && (!this.baseband.isEmpty()));
  }

  /**
   * Clear the Baseband field. This sets the field to null.
   */
  public void unsetBaseband() {
    this.baseband = null;
  }

  /**
   * Get the number of pulses in a single pulse burst..
   * <p>
   * @return a {@link Pulse} instance
   * @since 3.1.0
   */
  public Set<Pulse> getPulse() {
    if (pulse == null) {
      pulse = new HashSet<>();
    }
    return this.pulse;
  }

  /**
   * Determine if the Pulse is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPulse() {
    return ((this.pulse != null) && (!this.pulse.isEmpty()));
  }

  /**
   * Clear the Pulse field. This sets the field to null.
   */
  public void unsetPulse() {
    this.pulse = null;
  }

  /**
   * Get the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency..
   * <p>
   * @return a {@link SubcarrierFreq} instance
   * @since 3.1.0
   */
  public Set<SubcarrierFreq> getSubcarrierFreq() {
    if (subcarrierFreq == null) {
      subcarrierFreq = new HashSet<>();
    }
    return this.subcarrierFreq;
  }

  /**
   * Determine if the SubcarrierFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSubcarrierFreq() {
    return ((this.subcarrierFreq != null) && (!this.subcarrierFreq.isEmpty()));
  }

  /**
   * Clear the SubcarrierFreq field. This sets the field to null.
   */
  public void unsetSubcarrierFreq() {
    this.subcarrierFreq = null;
  }

  /**
   * Get the Spread Spectrum
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques..
   * <p>
   * @return a {@link SpreadSpectrum} instance
   * @since 3.1.0
   */
  public SpreadSpectrum getSpreadSpectrum() {
    return spreadSpectrum;
  }

  /**
   * Set the Spread Spectrum
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques..
   * <p>
   * @param value a {@link SpreadSpectrum} instance
   * @since 3.1.0
   */
  public void setSpreadSpectrum(SpreadSpectrum value) {
    this.spreadSpectrum = value;
  }

  /**
   * Determine if the SpreadSpectrum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpreadSpectrum() {
    return (this.spreadSpectrum != null ? this.spreadSpectrum.isSet() : false);
  }

  /**
   * Get the US:ObservedMOPAnalysis
   * <p>
   * Complex element ObservedMOPAnalysis (US) contains data describing the
   * characteristic and pattern information for the Modulation impressed On the
   * Pulse (MOP)..
   * <p>
   * @return a {@link ObservedMOPAnalysis} instance
   * @since 3.1.0
   */
  public Set<ObservedMOPAnalysis> getObservedMOPAnalysis() {
    if (observedMOPAnalysis == null) {
      observedMOPAnalysis = new HashSet<>();
    }
    return this.observedMOPAnalysis;
  }

  /**
   * Determine if the ObservedMOPAnalysis is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedMOPAnalysis() {
    return ((this.observedMOPAnalysis != null) && (!this.observedMOPAnalysis.isEmpty()));
  }

  /**
   * Clear the ObservedMOPAnalysis field. This sets the field to null.
   */
  public void unsetObservedMOPAnalysis() {
    this.observedMOPAnalysis = null;
  }

  /**
   * Get the US:ObservedRFAnalysis
   * <p>
   * Complex element ObservedRFAnalysis (US) contains the statisical results of
   * actual RF observations..
   * <p>
   * @return a {@link ObservedRFAnalysis} instance
   * @since 3.1.0
   */
  public Set<ObservedRFAnalysis> getObservedRFAnalysis() {
    if (observedRFAnalysis == null) {
      observedRFAnalysis = new HashSet<>();
    }
    return this.observedRFAnalysis;
  }

  /**
   * Determine if the ObservedRFAnalysis is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedRFAnalysis() {
    return ((this.observedRFAnalysis != null) && (!this.observedRFAnalysis.isEmpty()));
  }

  /**
   * Clear the ObservedRFAnalysis field. This sets the field to null.
   */
  public void unsetObservedRFAnalysis() {
    this.observedRFAnalysis = null;
  }

  /**
   * Get the US:ObservedPulseAnalysis
   * <p>
   * Complex element ObservedPulseAnalysis (US) contains data describing the
   * specific characteristics of the pulse group, pulse sequence, and distinct
   * pulse information..
   * <p>
   * @return a {@link ObservedPulseAnalysis} instance
   * @since 3.1.0
   */
  public Set<ObservedPulseAnalysis> getObservedPulseAnalysis() {
    if (observedPulseAnalysis == null) {
      observedPulseAnalysis = new HashSet<>();
    }
    return this.observedPulseAnalysis;
  }

  /**
   * Determine if the ObservedPulseAnalysis is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPulseAnalysis() {
    return ((this.observedPulseAnalysis != null) && (!this.observedPulseAnalysis.isEmpty()));
  }

  /**
   * Clear the ObservedPulseAnalysis field. This sets the field to null.
   */
  public void unsetObservedPulseAnalysis() {
    this.observedPulseAnalysis = null;
  }

  /**
   * Get the list of indices referring to Curves applicable to the data item..
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public Set<BigInteger> getCurves() {
    if (curves == null) {
      curves = new HashSet<>();
    }
    return this.curves;
  }

  /**
   * Determine if the Curves is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCurves() {
    return ((this.curves != null) && (!this.curves.isEmpty()));
  }

  /**
   * Clear the Curves field. This sets the field to null.
   */
  public void unsetCurves() {
    this.curves = null;
  }

  /**
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withModeID(String value) {
    setModeID(new S20(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withDescription(String value) {
    setDescription(new S100(value));
    return this;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withNecessaryBw(Double value) {
    setNecessaryBw(new FreqM(value));
    return this;
  }

  /**
   * Set the tuning capability.
   * <p>
   * @param value An instances of type {@link ListCTU}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withTunability(ListCTU value) {
    setTunability(new TString(value.value()));
    return this;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @param value An instances of type {@link ListCTN}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withTuningMethod(ListCTN value) {
    setTuningMethod(new TString(value.value()));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withIntermodPct(Double value) {
    setIntermodPct(new Percent(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withIntermodEffect(String value) {
    setIntermodEffect(new MEMO(value));
    return this;
  }

  /**
   * Set the number of pulse bursts per second.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withBurstRate(Double value) {
    setBurstRate(new BurstRate(value));
    return this;
  }

  /**
   * Set the pulse burst duration.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withBurstDuration(Double value) {
    setBurstDuration(new microsecs(value));
    return this;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withBurstNumPulses(Integer value) {
    setBurstNumPulses(new UN8(value));
    return this;
  }

  /**
   * Set the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withBurstOffTime(Double value) {
    setBurstOffTime(new microsecs(value));
    return this;
  }

  /**
   * Set the minimum bandwidth utilized to process 99.5% of the emission
   * spectra.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withOccBw(Double value) {
    setOccBw(new FreqM(value));
    return this;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withOccBwCalculated(ListCBO value) {
    setOccBwCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Set the out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withSecondHarmonicLevel(Double value) {
    setSecondHarmonicLevel(new dB(value));
    return this;
  }

  /**
   * Set the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withThirdHarmonicLevel(Double value) {
    setThirdHarmonicLevel(new dB(value));
    return this;
  }

  /**
   * Set the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withOtherHarmonicLevel(Double value) {
    setOtherHarmonicLevel(new dB(value));
    return this;
  }

  /**
   * Set the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withSpuriousLevel(Double value) {
    setSpuriousLevel(new dB(value));
    return this;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withFreqTolerance(Double value) {
    setFreqTolerance(new UN18_6(value));
    return this;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value An instances of type {@link ListCFO}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withFreqToleranceUnit(ListCFO value) {
    setFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of radar.
   * <p>
   * @param value An instances of type {@link ListCRA}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withRadarType(ListCRA value) {
    setRadarType(new TString(value.value()));
    return this;
  }

  /**
   * Set the time the transmitter is on.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withChannelDwell(Double value) {
    setChannelDwell(new microsecs(value));
    return this;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withNumSubCarriers(Integer value) {
    setNumSubCarriers(new UN5(value));
    return this;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withNumSideTones(Integer value) {
    setNumSideTones(new UN5(value));
    return this;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withGpsNBL1Level(Double value) {
    setGpsNBL1Level(new US_DBW(value));
    return this;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withGpsNBL2Level(Double value) {
    setGpsNBL2Level(new US_DBW(value));
    return this;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withGpsWBL1Level(Double value) {
    setGpsWBL1Level(new US_DBWHz(value));
    return this;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withGpsWBL2Level(Double value) {
    setGpsWBL2Level(new US_DBWHz(value));
    return this;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value An instances of type {@link ListUMD}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withModulationType(ListUMD value) {
    setModulationType(new TString(value.value()));
    return this;
  }

  /**
   * Set a short name for the mode.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withModeName(String value) {
    setModeName(new S40(value));
    return this;
  }

  /**
   * Set In Data Item JitterCapable (US), indicate whether the mode of the pulse
   * stream is jitter capable.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withJitterCapable(ListCBO value) {
    setJitterCapable(new TString(value.value()));
    return this;
  }

  /**
   * Set the EmsClass
   * <p>
   * Complex element EmsClass identifies the emission classification symbols
   * that define the baseband modulating characteristics of the emission
   * designator. The emission classification consists of the three required
   * symbols and the two optional symbols.
   * <p>
   * @param values One or more instances of type {@link EmsClass...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withEmsClass(EmsClass... values) {
    if (values != null) {
      getEmsClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the EmsClass
   * <p>
   * Complex element EmsClass identifies the emission classification symbols
   * that define the baseband modulating characteristics of the emission
   * designator. The emission classification consists of the three required
   * symbols and the two optional symbols.
   * <p>
   * @param values A collection of {@link EmsClass} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withEmsClass(Collection<EmsClass> values) {
    if (values != null) {
      getEmsClass().addAll(values);
    }
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param values One or more instances of type {@link Power...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withPower(Power... values) {
    if (values != null) {
      getPower().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the power limit of this transmitter mode when in this configuration.
   * <p>
   * @param values A collection of {@link Power} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withPower(Collection<Power> values) {
    if (values != null) {
      getPower().addAll(values);
    }
    return this;
  }

  /**
   * Set the TxSignalTuning
   * <p>
   * Complex element TxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values One or more instances of type {@link TxSignalTuning...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withTxSignalTuning(TxSignalTuning... values) {
    if (values != null) {
      getTxSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TxSignalTuning
   * <p>
   * Complex element TxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values A collection of {@link TxSignalTuning} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withTxSignalTuning(Collection<TxSignalTuning> values) {
    if (values != null) {
      getTxSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the TxModulation
   * <p>
   * Complex element TxModulation contains the detailed characteristics of the
   * modulation on the transmitter side.
   * <p>
   * @param values One or more instances of type {@link TxModulation...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withTxModulation(TxModulation... values) {
    if (values != null) {
      getTxModulation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TxModulation
   * <p>
   * Complex element TxModulation contains the detailed characteristics of the
   * modulation on the transmitter side.
   * <p>
   * @param values A collection of {@link TxModulation} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withTxModulation(Collection<TxModulation> values) {
    if (values != null) {
      getTxModulation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Baseband
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
   * <p>
   * @param values One or more instances of type {@link Baseband...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withBaseband(Baseband... values) {
    if (values != null) {
      getBaseband().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Baseband
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
   * <p>
   * @param values A collection of {@link Baseband} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withBaseband(Collection<Baseband> values) {
    if (values != null) {
      getBaseband().addAll(values);
    }
    return this;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param values One or more instances of type {@link Pulse...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withPulse(Pulse... values) {
    if (values != null) {
      getPulse().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param values A collection of {@link Pulse} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withPulse(Collection<Pulse> values) {
    if (values != null) {
      getPulse().addAll(values);
    }
    return this;
  }

  /**
   * Set the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @param values One or more instances of type {@link SubcarrierFreq...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withSubcarrierFreq(SubcarrierFreq... values) {
    if (values != null) {
      getSubcarrierFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the SubcarrierFreq
   * <p>
   * Complex element SubcarrierFreq describes the secondary channel that resides
   * within the main channel (a carrier within a carrier). A type of
   * multiplexing, the subcarrier is a modulated signal at a lower frequency
   * that is combined with the main carrier signal operating at a higher
   * frequency.
   * <p>
   * @param values A collection of {@link SubcarrierFreq} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withSubcarrierFreq(Collection<SubcarrierFreq> values) {
    if (values != null) {
      getSubcarrierFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the Spread Spectrum
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques.
   * <p>
   * @param value An instances of type {@link SpreadSpectrum}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withSpreadSpectrum(SpreadSpectrum value) {
    return this;
  }

  /**
   * Set the US:ObservedMOPAnalysis
   * <p>
   * Complex element ObservedMOPAnalysis (US) contains data describing the
   * characteristic and pattern information for the Modulation impressed On the
   * Pulse (MOP).
   * <p>
   * @param values One or more instances of type {@link ObservedMOPAnalysis...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withObservedMOPAnalysis(ObservedMOPAnalysis... values) {
    if (values != null) {
      getObservedMOPAnalysis().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedMOPAnalysis
   * <p>
   * Complex element ObservedMOPAnalysis (US) contains data describing the
   * characteristic and pattern information for the Modulation impressed On the
   * Pulse (MOP).
   * <p>
   * @param values A collection of {@link ObservedMOPAnalysis} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withObservedMOPAnalysis(Collection<ObservedMOPAnalysis> values) {
    if (values != null) {
      getObservedMOPAnalysis().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ObservedRFAnalysis
   * <p>
   * Complex element ObservedRFAnalysis (US) contains the statisical results of
   * actual RF observations.
   * <p>
   * @param values One or more instances of type {@link ObservedRFAnalysis...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withObservedRFAnalysis(ObservedRFAnalysis... values) {
    if (values != null) {
      getObservedRFAnalysis().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedRFAnalysis
   * <p>
   * Complex element ObservedRFAnalysis (US) contains the statisical results of
   * actual RF observations.
   * <p>
   * @param values A collection of {@link ObservedRFAnalysis} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withObservedRFAnalysis(Collection<ObservedRFAnalysis> values) {
    if (values != null) {
      getObservedRFAnalysis().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ObservedPulseAnalysis
   * <p>
   * Complex element ObservedPulseAnalysis (US) contains data describing the
   * specific characteristics of the pulse group, pulse sequence, and distinct
   * pulse information.
   * <p>
   * @param values One or more instances of type
   *               {@link ObservedPulseAnalysis...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withObservedPulseAnalysis(ObservedPulseAnalysis... values) {
    if (values != null) {
      getObservedPulseAnalysis().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedPulseAnalysis
   * <p>
   * Complex element ObservedPulseAnalysis (US) contains data describing the
   * specific characteristics of the pulse group, pulse sequence, and distinct
   * pulse information.
   * <p>
   * @param values A collection of {@link ObservedPulseAnalysis} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withObservedPulseAnalysis(Collection<ObservedPulseAnalysis> values) {
    if (values != null) {
      getObservedPulseAnalysis().addAll(values);
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}.
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withCurves(BigInteger... values) {
    if (values != null) {
      getCurves().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values A collection of {@link Curves} instances
   * @return The current TxMode object instance.
   * @since 3.1.0
   */
  public TxMode withCurves(Collection<BigInteger> values) {
    if (values != null) {
      getCurves().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this TxMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  TxMode {"
           + (baseband != null ? " baseband [" + baseband + "]" : "")
           + (burstDuration != null ? " burstDuration [" + burstDuration + "]" : "")
           + (burstNumPulses != null ? " burstNumPulses [" + burstNumPulses + "]" : "")
           + (burstOffTime != null ? " burstOffTime [" + burstOffTime + "]" : "")
           + (burstRate != null ? " burstRate [" + burstRate + "]" : "")
           + (channelDwell != null ? " channelDwell [" + channelDwell + "]" : "")
           + (curves != null ? " curves [" + curves + "]" : "")
           + (description != null ? " description [" + description + "]" : "")
           + (emsClass != null ? " emsClass [" + emsClass + "]" : "")
           + (freqTolerance != null ? " freqTolerance [" + freqTolerance + "]" : "")
           + (freqToleranceUnit != null ? " freqToleranceUnit [" + freqToleranceUnit + "]" : "")
           + (gpsNBL1Level != null ? " gpsNBL1Level [" + gpsNBL1Level + "]" : "")
           + (gpsNBL2Level != null ? " gpsNBL2Level [" + gpsNBL2Level + "]" : "")
           + (gpsWBL1Level != null ? " gpsWBL1Level [" + gpsWBL1Level + "]" : "")
           + (gpsWBL2Level != null ? " gpsWBL2Level [" + gpsWBL2Level + "]" : "")
           + (intermodEffect != null ? " intermodEffect [" + intermodEffect + "]" : "")
           + (intermodPct != null ? " intermodPct [" + intermodPct + "]" : "")
           + (jitterCapable != null ? " jitterCapable [" + jitterCapable + "]" : "")
           + (modeID != null ? " modeID [" + modeID + "]" : "")
           + (modeName != null ? " modeName [" + modeName + "]" : "")
           + (modulationType != null ? " modulationType [" + modulationType + "]" : "")
           + (necessaryBw != null ? " necessaryBw [" + necessaryBw + "]" : "")
           + (numSideTones != null ? " numSideTones [" + numSideTones + "]" : "")
           + (numSubCarriers != null ? " numSubCarriers [" + numSubCarriers + "]" : "")
           + (observedMOPAnalysis != null ? " observedMOPAnalysis [" + observedMOPAnalysis + "]" : "")
           + (observedPulseAnalysis != null ? " observedPulseAnalysis [" + observedPulseAnalysis + "]" : "")
           + (observedRFAnalysis != null ? " observedRFAnalysis [" + observedRFAnalysis + "]" : "")
           + (occBw != null ? " occBw [" + occBw + "]" : "")
           + (occBwCalculated != null ? " occBwCalculated [" + occBwCalculated + "]" : "")
           + (otherHarmonicLevel != null ? " otherHarmonicLevel [" + otherHarmonicLevel + "]" : "")
           + (power != null ? " power [" + power + "]" : "")
           + (pulse != null ? " pulse [" + pulse + "]" : "")
           + (radarType != null ? " radarType [" + radarType + "]" : "")
           + (secondHarmonicLevel != null ? " secondHarmonicLevel [" + secondHarmonicLevel + "]" : "")
           + (spreadSpectrum != null ? " spreadSpectrum [" + spreadSpectrum + "]" : "")
           + (spuriousLevel != null ? " spuriousLevel [" + spuriousLevel + "]" : "")
           + (subcarrierFreq != null ? " subcarrierFreq [" + subcarrierFreq + "]" : "")
           + (thirdHarmonicLevel != null ? " thirdHarmonicLevel [" + thirdHarmonicLevel + "]" : "")
           + (tunability != null ? " tunability [" + tunability + "]" : "")
           + (tuningMethod != null ? " tuningMethod [" + tuningMethod + "]" : "")
           + (txModulation != null ? " txModulation [" + txModulation + "]" : "")
           + (txSignalTuning != null ? " txSignalTuning [" + txSignalTuning + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxMode} requires {@link S20 ModeID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetModeID();
  }

}
