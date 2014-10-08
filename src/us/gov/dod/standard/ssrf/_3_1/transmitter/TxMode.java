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
package us.gov.dod.standard.ssrf._3_1.transmitter;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "ModeID", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * Description - Mode Description (Optional)
   * <p>
   * A description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * Format is S100
   * <p>
   * Attribute group ModeInfo (Required)
   */
  @XmlElement(name = "Description", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * NecessaryBw - Necessary Bandwidth (Optional)
   * <p>
   * The necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "NecessaryBw", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal necessaryBw;
  /**
   * Tunability - Tunability (Optional)
   * <p>
   * The tuning capability.
   * <p>
   * Format is L:CTU
   * <p>
   * Attribute group Tunability (Optional)
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
   */
  @XmlElement(name = "TuningMethod", required = false)
  private TString tuningMethod;

  @XmlElement(name = "IntermodPct", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal intermodPct;

  @XmlElement(name = "IntermodEffect", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intermodEffect;
  /**
   * BurstRate - Burst Rate (Optional)
   * <p>
   * The number of pulse bursts per second.
   * <p>
   * Format is UN(12,3)
   * <p>
   * Attribute group Burst (Optional)
   */
  @XmlElement(name = "BurstRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterBURSTRATE.class)
  private TDecimal burstRate;
  /**
   * BurstDuration - Burst Duration (Optional)
   * <p>
   * The pulse burst duration.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Burst (Optional)
   */
  @XmlElement(name = "BurstDuration", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstDuration;
  /**
   * BurstNumPulses - Number of Pulses in Burst (Optional)
   * <p>
   * The number of pulses in a single pulse burst.
   * <p>
   * Format is UN(8)
   * <p>
   * Attribute group Burst (Optional)
   */
  @XmlElement(name = "BurstNumPulses", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN8.class)
  private TInteger burstNumPulses;
  /**
   * BurstOffTime - Burst Off-Time (Optional)
   * <p>
   * The pulse burst off time in microseconds (duration of time between the end
   * of one pulse burst to the start of the next pulse burst).
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group Burst (Optional)
   */
  @XmlElement(name = "BurstOffTime", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstOffTime;
  /**
   * OccBw - Occupied Bandwidth (Optional)
   * <p>
   * The minimum bandwidth utilized to process 99.5% of the emission spectra.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group OccupiedBw (Optional)
   */
  @XmlElement(name = "OccBw")
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal occBw;
  /**
   * OccBwCalculated - Calculated Occupied Bandwidth Indicator (Optional)
   * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement.
   * <p>
   * Format is L:CBO
   * <p>
   * Attribute group OccupiedBw (Optional)
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
   */
  @XmlElement(name = "SecondHarmonicLevel", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal secondHarmonicLevel;
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
   */
  @XmlElement(name = "ThirdHarmonicLevel", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal thirdHarmonicLevel;
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
   */
  @XmlElement(name = "OtherHarmonicLevel", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal otherHarmonicLevel;
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
   */
  @XmlElement(name = "SpuriousLevel", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal spuriousLevel;
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
   */
  @XmlElement(name = "FreqTolerance")
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUN18_6.class)
  private TDecimal freqTolerance;
  /**
   * FreqToleranceUnit - Frequency Tolerance Unit (Optional)
   * <p>
   * The units in which the Frequency Tolerance is expressed.
   * <p>
   * Format is L:CFO
   * <p>
   * Attribute group FreqTolerance (Optional)
   */
  @XmlElement(name = "FreqToleranceUnit")
  private TString freqToleranceUnit;
  /**
   * RadarType - Radar Modulation Type (Optional)
   * <p>
   * The type of radar.
   * <p>
   * Format is L:CRA
   */
  @XmlElement(name = "RadarType", required = false)
  private TString radarType;
  /**
   * ChannelDwell - Channel Duration (Optional)
   * <p>
   * The time the transmitter is on.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "ChannelDwell", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal channelDwell;
  /**
   * NumSubCarriers - Number of Subcarriers (Optional)
   * <p>
   * The number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   */
  @XmlElement(name = "NumSubCarriers", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSubCarriers;
  /**
   * NumSideTones - Number of Side Tones (Optional)
   * <p>
   * The number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * Format is UN(5)
   */
  @XmlElement(name = "NumSideTones", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSideTones;
  /**
   * US:GpsNBL1Level - GPS NBL1 Level (Optional)
   * <p>
   * The narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * Format is SN(5,3) (dBW)
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "GpsNBL1Level", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL1Level;
  /**
   * US:GpsNBL2Level - GPS NBL2 Level (Optional)
   * <p>
   * The narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * Format is SN(5,3) (dBW)
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "GpsNBL2Level", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL2Level;
  /**
   * US:GpsWBL1Level - GpsWBL1Level (Optional)
   * <p>
   * The wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * Format is SN(9,6) (dBW/Hz)
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "GpsWBL1Level", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL1Level;
  /**
   * US:GpsWBL2Level - GpsWBL1Level (Optional)
   * <p>
   * The wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * Format is SN(9,6) (dBW/Hz)
   * <p>
   * Attribute group (Optional)
   */
  @XmlElement(name = "GpsWBL2Level", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL2Level;
  /**
   * US:ModulationType - Modulation Type (Optional)
   * <p>
   * The type of modulation.
   * <p>
   * Format is L:UMD
   */
  @XmlElement(name = "ModulationType", required = false)
  private TString modulationType;
  /**
   * US:ModeName - Mode Name (Optional)
   * <p>
   * A short name for the mode.
   * <p>
   * Format is S40
   */
  @XmlElement(name = "ModeName", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;
  /**
   * JitterCapable (US), indicate whether the mode of the pulse stream is jitter
   * capable.
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
   */
  @XmlElement(name = "EmsClass", nillable = true)
  private Collection<EmsClass> emsClass;
  /**
   * PowerLimit - Power Limit (Optional)
   * <p>
   * The power limit of this transmitter mode when in this configuration.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "Power")
  private Collection<Power> power;
  /**
   * TxSignalTuning (Optional)
   * <p>
   * TxSignalTuning indicates the tuning capabilities, the specific frequency or
   * range of frequencies within which the equipment may tune, and the tuning
   * increments of the equipment.
   */
  @XmlElement(name = "TxSignalTuning")
  private Collection<TxSignalTuning> txSignalTuning;
  /**
   * TxModulation (Optional)
   * <p>
   * TxModulation contains the detailed characteristics of the modulation on the
   * transmitter side.
   */
  @XmlElement(name = "TxModulation")
  private Collection<TxModulation> txModulation;
  /**
   * Baseband (Optional)
   * <p>
   * Baseband defines the parameters of the modulating or received signal.
   */
  @XmlElement(name = "Baseband")
  private Collection<Baseband> baseband;
  /**
   * BurstNumPulses - Number of Pulses in Burst (Optional)
   * <p>
   * The number of pulses in a single pulse burst.
   * <p>
   * Format is UN(8)
   * <p>
   * Attribute group Burst (Optional)
   */
  @XmlElement(name = "Pulse")
  private Collection<Pulse> pulse;
  /**
   * SubcarrierFreq (Optional)
   * <p>
   * SubcarrierFreq describes the secondary channel that
   */
  @XmlElement(name = "SubcarrierFreq")
  private Collection<SubcarrierFreq> subcarrierFreq;
  /**
   * Spread Spectrum (Optional)
   * <p>
   * SpreadSpectrum contains characteristics of systems using spread spectrum
   * techniques.
   */
  @XmlElement(name = "SpreadSpectrum")
  private SpreadSpectrum spreadSpectrum;
  /**
   * US:ObservedMOPAnalysis (Optional)
   * <p>
   * ObservedMOPAnalysis (US) contains data describing the characteristic and
   * pattern information for the Modulation impressed On the Pulse (MOP).
   */
  @XmlElement(name = "ObservedMOPAnalysis")
  private Collection<ObservedMOPAnalysis> observedMOPAnalysis;
  /**
   * US:ObservedRFAnalysis (Optional)
   * <p>
   * ObservedRFAnalysis (US) contains the statisical results of actual RF
   * observations.
   */
  @XmlElement(name = "ObservedRFAnalysis")
  private Collection<ObservedRFAnalysis> observedRFAnalysis;
  /**
   * US:ObservedPulseAnalysis (Optional)
   * <p>
   * ObservedPulseAnalysis (US) contains data describing the specific
   * characteristics of the pulse group, pulse sequence, and distinct pulse
   * information.
   */
  @XmlElement(name = "ObservedPulseAnalysis")
  private Collection<ObservedPulseAnalysis> observedPulseAnalysis;
  /**
   * curves - Links to Curves (Optional)
   * <p>
   * The list of indices referring to Curves applicable to the data item.
   * <p>
   * Format is List of UN(6)
   */
  @XmlAttribute(name = "curves")
  private Collection<BigInteger> curves;

  /**
   * Get the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @return the ModeID value in a {@link TString} data type
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Set the unique identifier of a TxMode of the transmitter in this
   * configuration. This mode is from the transmitter specified in the Serial
   * field of the parent TxRef element.
   * <p>
   * @param value the ModeID value in a {@link TString} data type
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value the Description value in a {@link TString} data type
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * emission curve.
   * <p>
   * @return the NecessaryBw value in a {@link TDecimal} data type
   */
  public TDecimal getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @param value the NecessaryBw value in a {@link TDecimal} data type
   */
  public void setNecessaryBw(TDecimal value) {
    this.necessaryBw = value;
  }

  /**
   * Determine if the NecessaryBw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNecessaryBw() {
    return (this.necessaryBw != null ? this.necessaryBw.isSetValue() : false);
  }

  /**
   * Get the tuning capability.
   * <p>
   * @return the Tunability value in a {@link TString} data type
   */
  public TString getTunability() {
    return tunability;
  }

  /**
   * Set the tuning capability.
   * <p>
   * @param value the Tunability value in a {@link TString} data type
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
   * spectrum.
   * <p>
   * @return the TuningMethod value in a {@link TString} data type
   */
  public TString getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @param value the TuningMethod value in a {@link TString} data type
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
   * Get
   * <p>
   * @return the IntermodPct value in a {@link TDecimal} data type
   */
  public TDecimal getIntermodPct() {
    return intermodPct;
  }

  /**
   * Set
   * <p>
   * @param value the IntermodPct value in a {@link TDecimal} data type
   */
  public void setIntermodPct(TDecimal value) {
    this.intermodPct = value;
  }

  /**
   * Determine if the IntermodPct is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodPct() {
    return (this.intermodPct != null ? this.intermodPct.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the IntermodEffect value in a {@link TString} data type
   */
  public TString getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Set
   * <p>
   * @param value the IntermodEffect value in a {@link TString} data type
   */
  public void setIntermodEffect(TString value) {
    this.intermodEffect = value;
  }

  /**
   * Determine if the IntermodEffect is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodEffect() {
    return (this.intermodEffect != null ? this.intermodEffect.isSetValue() : false);
  }

  /**
   * Get the number of pulse bursts per second.
   * <p>
   * @return the BurstRate value in a {@link TDecimal} data type
   */
  public TDecimal getBurstRate() {
    return burstRate;
  }

  /**
   * Set the number of pulse bursts per second.
   * <p>
   * @param value the BurstRate value in a {@link TDecimal} data type
   */
  public void setBurstRate(TDecimal value) {
    this.burstRate = value;
  }

  /**
   * Determine if the BurstRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstRate() {
    return (this.burstRate != null ? this.burstRate.isSetValue() : false);
  }

  /**
   * Get the pulse burst duration.
   * <p>
   * @return the BurstDuration value in a {@link TDecimal} data type
   */
  public TDecimal getBurstDuration() {
    return burstDuration;
  }

  /**
   * Set the pulse burst duration.
   * <p>
   * @param value the BurstDuration value in a {@link TDecimal} data type
   */
  public void setBurstDuration(TDecimal value) {
    this.burstDuration = value;
  }

  /**
   * Determine if the BurstDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstDuration() {
    return (this.burstDuration != null ? this.burstDuration.isSetValue() : false);
  }

  /**
   * Get the number of pulses in a single pulse burst.
   * <p>
   * @return the BurstNumPulses value in a {@link TInteger} data type
   */
  public TInteger getBurstNumPulses() {
    return burstNumPulses;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param value the BurstNumPulses value in a {@link TInteger} data type
   */
  public void setBurstNumPulses(TInteger value) {
    this.burstNumPulses = value;
  }

  /**
   * Determine if the BurstNumPulses is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstNumPulses() {
    return (this.burstNumPulses != null ? this.burstNumPulses.isSetValue() : false);
  }

  /**
   * Get the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst).
   * <p>
   * @return the BurstOffTime value in a {@link TDecimal} data type
   */
  public TDecimal getBurstOffTime() {
    return burstOffTime;
  }

  /**
   * Set the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst).
   * <p>
   * @param value the BurstOffTime value in a {@link TDecimal} data type
   */
  public void setBurstOffTime(TDecimal value) {
    this.burstOffTime = value;
  }

  /**
   * Determine if the BurstOffTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBurstOffTime() {
    return (this.burstOffTime != null ? this.burstOffTime.isSetValue() : false);
  }

  /**
   * Get the minimum bandwidth utilized to process 99.5% of the emission
   * spectra.
   * <p>
   * @return the OccBw value in a {@link TDecimal} data type
   */
  public TDecimal getOccBw() {
    return occBw;
  }

  /**
   * Set the minimum bandwidth utilized to process 99.5% of the emission
   * spectra.
   * <p>
   * @param value the OccBw value in a {@link TDecimal} data type
   */
  public void setOccBw(TDecimal value) {
    this.occBw = value;
  }

  /**
   * Determine if the OccBw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOccBw() {
    return (this.occBw != null ? this.occBw.isSetValue() : false);
  }

  /**
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement.
   * <p>
   * @return the OccBwCalculated value in a {@link TString} data type
   */
  public TString getOccBwCalculated() {
    return occBwCalculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement.
   * <p>
   * @param value the OccBwCalculated value in a {@link TString} data type
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
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * @return the SecondHarmonicLevel value in a {@link TDecimal} data type
   */
  public TDecimal getSecondHarmonicLevel() {
    return secondHarmonicLevel;
  }

  /**
   * Set the out-of-band emission level at the frequency that is two times the
   * fundamental frequency. The value is expressed as the power level in
   * decibels relative to the peak output power of the carrier signal.
   * <p>
   * @param value the SecondHarmonicLevel value in a {@link TDecimal} data type
   */
  public void setSecondHarmonicLevel(TDecimal value) {
    this.secondHarmonicLevel = value;
  }

  /**
   * Determine if the SecondHarmonicLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecondHarmonicLevel() {
    return (this.secondHarmonicLevel != null ? this.secondHarmonicLevel.isSetValue() : false);
  }

  /**
   * Get the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * @return the ThirdHarmonicLevel value in a {@link TDecimal} data type
   */
  public TDecimal getThirdHarmonicLevel() {
    return thirdHarmonicLevel;
  }

  /**
   * Set the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * @param value the ThirdHarmonicLevel value in a {@link TDecimal} data type
   */
  public void setThirdHarmonicLevel(TDecimal value) {
    this.thirdHarmonicLevel = value;
  }

  /**
   * Determine if the ThirdHarmonicLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * signal.
   * <p>
   * @return the OtherHarmonicLevel value in a {@link TDecimal} data type
   */
  public TDecimal getOtherHarmonicLevel() {
    return otherHarmonicLevel;
  }

  /**
   * Set the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * @param value the OtherHarmonicLevel value in a {@link TDecimal} data type
   */
  public void setOtherHarmonicLevel(TDecimal value) {
    this.otherHarmonicLevel = value;
  }

  /**
   * Determine if the OtherHarmonicLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * of the carrier signal.
   * <p>
   * @return the SpuriousLevel value in a {@link TDecimal} data type
   */
  public TDecimal getSpuriousLevel() {
    return spuriousLevel;
  }

  /**
   * Set the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * @param value the SpuriousLevel value in a {@link TDecimal} data type
   */
  public void setSpuriousLevel(TDecimal value) {
    this.spuriousLevel = value;
  }

  /**
   * Determine if the SpuriousLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpuriousLevel() {
    return (this.spuriousLevel != null ? this.spuriousLevel.isSetValue() : false);
  }

  /**
   * Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @return the FreqTolerance value in a {@link TDecimal} data type
   */
  public TDecimal getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value the FreqTolerance value in a {@link TDecimal} data type
   */
  public void setFreqTolerance(TDecimal value) {
    this.freqTolerance = value;
  }

  /**
   * Determine if the FreqTolerance is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqTolerance() {
    return (this.freqTolerance != null ? this.freqTolerance.isSetValue() : false);
  }

  /**
   * Get the units in which the Frequency Tolerance is expressed.
   * <p>
   * @return the FreqToleranceUnit value in a {@link TString} data type
   */
  public TString getFreqToleranceUnit() {
    return freqToleranceUnit;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value the FreqToleranceUnit value in a {@link TString} data type
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
   * Get the type of radar.
   * <p>
   * @return the RadarType value in a {@link TString} data type
   */
  public TString getRadarType() {
    return radarType;
  }

  /**
   * Set the type of radar.
   * <p>
   * @param value the RadarType value in a {@link TString} data type
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
   * Get the time the transmitter is on.
   * <p>
   * @return the ChannelDwell value in a {@link TDecimal} data type
   */
  public TDecimal getChannelDwell() {
    return channelDwell;
  }

  /**
   * Set the time the transmitter is on.
   * <p>
   * @param value the ChannelDwell value in a {@link TDecimal} data type
   */
  public void setChannelDwell(TDecimal value) {
    this.channelDwell = value;
  }

  /**
   * Determine if the ChannelDwell is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelDwell() {
    return (this.channelDwell != null ? this.channelDwell.isSetValue() : false);
  }

  /**
   * Get the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @return the NumSubCarriers value in a {@link TInteger} data type
   */
  public TInteger getNumSubCarriers() {
    return numSubCarriers;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @param value the NumSubCarriers value in a {@link TInteger} data type
   */
  public void setNumSubCarriers(TInteger value) {
    this.numSubCarriers = value;
  }

  /**
   * Determine if the NumSubCarriers is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSubCarriers() {
    return (this.numSubCarriers != null ? this.numSubCarriers.isSetValue() : false);
  }

  /**
   * Get the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @return the NumSideTones value in a {@link TInteger} data type
   */
  public TInteger getNumSideTones() {
    return numSideTones;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @param value the NumSideTones value in a {@link TInteger} data type
   */
  public void setNumSideTones(TInteger value) {
    this.numSideTones = value;
  }

  /**
   * Determine if the NumSideTones is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumSideTones() {
    return (this.numSideTones != null ? this.numSideTones.isSetValue() : false);
  }

  /**
   * Get the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @return the GpsNBL1Level value in a {@link TDecimal} data type
   */
  public TDecimal getGpsNBL1Level() {
    return gpsNBL1Level;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value the GpsNBL1Level value in a {@link TDecimal} data type
   */
  public void setGpsNBL1Level(TDecimal value) {
    this.gpsNBL1Level = value;
  }

  /**
   * Determine if the GpsNBL1Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsNBL1Level() {
    return (this.gpsNBL1Level != null ? this.gpsNBL1Level.isSetValue() : false);
  }

  /**
   * Get the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @return the GpsNBL2Level value in a {@link TDecimal} data type
   */
  public TDecimal getGpsNBL2Level() {
    return gpsNBL2Level;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value the GpsNBL2Level value in a {@link TDecimal} data type
   */
  public void setGpsNBL2Level(TDecimal value) {
    this.gpsNBL2Level = value;
  }

  /**
   * Determine if the GpsNBL2Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsNBL2Level() {
    return (this.gpsNBL2Level != null ? this.gpsNBL2Level.isSetValue() : false);
  }

  /**
   * Get the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @return the GpsWBL1Level value in a {@link TDecimal} data type
   */
  public TDecimal getGpsWBL1Level() {
    return gpsWBL1Level;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value the GpsWBL1Level value in a {@link TDecimal} data type
   */
  public void setGpsWBL1Level(TDecimal value) {
    this.gpsWBL1Level = value;
  }

  /**
   * Determine if the GpsWBL1Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsWBL1Level() {
    return (this.gpsWBL1Level != null ? this.gpsWBL1Level.isSetValue() : false);
  }

  /**
   * Get the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @return the GpsWBL2Level value in a {@link TDecimal} data type
   */
  public TDecimal getGpsWBL2Level() {
    return gpsWBL2Level;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value the GpsWBL2Level value in a {@link TDecimal} data type
   */
  public void setGpsWBL2Level(TDecimal value) {
    this.gpsWBL2Level = value;
  }

  /**
   * Determine if the GpsWBL2Level is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGpsWBL2Level() {
    return (this.gpsWBL2Level != null ? this.gpsWBL2Level.isSetValue() : false);
  }

  /**
   * Get the type of modulation.
   * <p>
   * @return the ModulationType value in a {@link TString} data type
   */
  public TString getModulationType() {
    return modulationType;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value the ModulationType value in a {@link TString} data type
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
   * Get a short name for the mode.
   * <p>
   * @return the ModeName value in a {@link TString} data type
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Set a short name for the mode.
   * <p>
   * @param value the ModeName value in a {@link TString} data type
   */
  public void setModeName(TString value) {
    this.modeName = value;
  }

  /**
   * Determine if the ModeName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeName() {
    return (this.modeName != null ? this.modeName.isSetValue() : false);
  }

  /**
   * Get JitterCapable (US), indicate whether the mode of the pulse stream is
   * jitter capable.
   * <p>
   * @return the JitterCapable value in a {@link TString} data type
   */
  public TString getJitterCapable() {
    return jitterCapable;
  }

  /**
   * Set JitterCapable (US), indicate whether the mode of the pulse stream is
   * jitter capable.
   * <p>
   * @param value the JitterCapable value in a {@link TString} data type
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
   * symbols and the two optional symbols.
   * <p>
   * @return a non-null but possibly empty list of {@link EmsClass} instances
   */
  public Collection<EmsClass> getEmsClass() {
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
   * Get the power limit of this transmitter mode when in this configuration.
   * <p>
   * @return a non-null but possibly empty list of {@link Power} instances
   */
  public Collection<Power> getPower() {
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
   * tune, and the tuning increments of the equipment.
   * <p>
   * @return a non-null but possibly empty list of {@link TxSignalTuning}
   *         instances
   */
  public Collection<TxSignalTuning> getTxSignalTuning() {
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
   * modulation on the transmitter side.
   * <p>
   * @return a non-null but possibly empty list of {@link TxModulation}
   *         instances
   */
  public Collection<TxModulation> getTxModulation() {
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
   * received signal.
   * <p>
   * @return a non-null but possibly empty list of {@link Baseband} instances
   */
  public Collection<Baseband> getBaseband() {
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
   * Get the number of pulses in a single pulse burst.
   * <p>
   * @return a non-null but possibly empty list of {@link Pulse} instances
   */
  public Collection<Pulse> getPulse() {
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
   * frequency.
   * <p>
   * @return a non-null but possibly empty list of {@link SubcarrierFreq}
   *         instances
   */
  public Collection<SubcarrierFreq> getSubcarrierFreq() {
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
   * spread spectrum techniques.
   * <p>
   * @return a {@link SpreadSpectrum} instance
   */
  public SpreadSpectrum getSpreadSpectrum() {
    return spreadSpectrum;
  }

  /**
   * Set the Spread Spectrum
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques.
   * <p>
   * @param value a {@link SpreadSpectrum} instance
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
    return (this.spreadSpectrum != null);
  }

  /**
   * Get the US:ObservedMOPAnalysis
   * <p>
   * Complex element ObservedMOPAnalysis (US) contains data describing the
   * characteristic and pattern information for the Modulation impressed On the
   * Pulse (MOP).
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedMOPAnalysis}
   *         instances
   */
  public Collection<ObservedMOPAnalysis> getObservedMOPAnalysis() {
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
   * actual RF observations.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedRFAnalysis}
   *         instances
   */
  public Collection<ObservedRFAnalysis> getObservedRFAnalysis() {
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
   * pulse information.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedPulseAnalysis}
   *         instances
   */
  public Collection<ObservedPulseAnalysis> getObservedPulseAnalysis() {
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
   * Get the list of indices referring to Curves applicable to the data item.
   * <p>
   * @return a non-null but possibly empty list of {@link BigInteger} instances
   */
  public Collection<BigInteger> getCurves() {
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
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   */
  public TxMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   */
  public TxMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withNecessaryBw(Double value) {
    setNecessaryBw(new TDecimal(value));
    return this;
  }

  /**
   * Set the tuning capability.
   * <p>
   * @param value An instances of type {@link ListCTU}
   * @return The current TxMode object instance
   */
  public TxMode withTunability(ListCTU value) {
    setTunability(new TString(value.value()));
    return this;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @param value An instances of type {@link ListCTN}
   * @return The current TxMode object instance
   */
  public TxMode withTuningMethod(ListCTN value) {
    setTuningMethod(new TString(value.value()));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withIntermodPct(Double value) {
    setIntermodPct(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   */
  public TxMode withIntermodEffect(String value) {
    setIntermodEffect(new TString(value));
    return this;
  }

  /**
   * Set the number of pulse bursts per second.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withBurstRate(Double value) {
    setBurstRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the pulse burst duration.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withBurstDuration(Double value) {
    setBurstDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of pulses in a single pulse burst.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current TxMode object instance
   */
  public TxMode withBurstNumPulses(Integer value) {
    setBurstNumPulses(new TInteger(value));
    return this;
  }

  /**
   * Set the pulse burst off time in microseconds (duration of time between the
   * end of one pulse burst to the start of the next pulse burst).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withBurstOffTime(Double value) {
    setBurstOffTime(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum bandwidth utilized to process 99.5% of the emission
   * spectra.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withOccBw(Double value) {
    setOccBw(new TDecimal(value));
    return this;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current TxMode object instance
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
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withSecondHarmonicLevel(Double value) {
    setSecondHarmonicLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the out-of-band emission level at the frequency that is three times the
   * fundamental frequency. The value is the ratio of the power level to peak
   * output power of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withThirdHarmonicLevel(Double value) {
    setThirdHarmonicLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the greatest out-of-band emission level at harmonic frequencies greater
   * than three times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withOtherHarmonicLevel(Double value) {
    setOtherHarmonicLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum of all emission levels which occur outside the bandwidth of
   * the fundamental emission and not at a harmonic frequency. The value is
   * expressed as the power level in decibels relative to the peak output power
   * of the carrier signal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withSpuriousLevel(Double value) {
    setSpuriousLevel(new TDecimal(value));
    return this;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withFreqTolerance(Double value) {
    setFreqTolerance(new TDecimal(value));
    return this;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value An instances of type {@link ListCFO}
   * @return The current TxMode object instance
   */
  public TxMode withFreqToleranceUnit(ListCFO value) {
    setFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of radar.
   * <p>
   * @param value An instances of type {@link ListCRA}
   * @return The current TxMode object instance
   */
  public TxMode withRadarType(ListCRA value) {
    setRadarType(new TString(value.value()));
    return this;
  }

  /**
   * Set the time the transmitter is on.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withChannelDwell(Double value) {
    setChannelDwell(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of subcarrier frequencies for the subcarriers modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current TxMode object instance
   */
  public TxMode withNumSubCarriers(Integer value) {
    setNumSubCarriers(new TInteger(value));
    return this;
  }

  /**
   * Set the number of side tone frequencies for the sidetones modulating the
   * carrier individually.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current TxMode object instance
   */
  public TxMode withNumSideTones(Integer value) {
    setNumSideTones(new TInteger(value));
    return this;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withGpsNBL1Level(Double value) {
    setGpsNBL1Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the narrowband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withGpsNBL2Level(Double value) {
    setGpsNBL2Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1164-1240 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withGpsWBL1Level(Double value) {
    setGpsWBL1Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the wideband levels emitted by this system in the Navstar Global
   * Positioning System (GPS) 1559-1610 MHz band.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current TxMode object instance
   */
  public TxMode withGpsWBL2Level(Double value) {
    setGpsWBL2Level(new TDecimal(value));
    return this;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value An instances of type {@link ListUMD}
   * @return The current TxMode object instance
   */
  public TxMode withModulationType(ListUMD value) {
    setModulationType(new TString(value.value()));
    return this;
  }

  /**
   * Set a short name for the mode.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TxMode object instance
   */
  public TxMode withModeName(String value) {
    setModeName(new TString(value));
    return this;
  }

  /**
   * Set JitterCapable (US), indicate whether the mode of the pulse stream is
   * jitter capable.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link EmsClass}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link Power}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link TxSignalTuning}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link TxModulation}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link Baseband}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link Pulse}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link SubcarrierFreq}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param value An instances of type {@link SpreadSpectrum}
   * @return The current TxMode object instance
   */
  public TxMode withSpreadSpectrum(SpreadSpectrum value) {
    setSpreadSpectrum(value);
    return this;
  }

  /**
   * Set the US:ObservedMOPAnalysis
   * <p>
   * Complex element ObservedMOPAnalysis (US) contains data describing the
   * characteristic and pattern information for the Modulation impressed On the
   * Pulse (MOP).
   * <p>
   * @param values One or more instances of type {@link ObservedMOPAnalysis}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link ObservedRFAnalysis}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link ObservedPulseAnalysis}
   * @return The current TxMode object instance
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
   * @return The current TxMode object instance
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
   * @param values One or more instances of type {@link BigInteger}
   * @return The current TxMode object instance
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
   * @param values A collection of {@link BigInteger} instances
   * @return The current TxMode object instance
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
    return "TxMode {"
      + (observedMOPAnalysis != null ? " observedMOPAnalysis [" + observedMOPAnalysis + "]" : "")
      + (modulationType != null ? " modulationType [" + modulationType + "]" : "")
      + (modeID != null ? " modeID [" + modeID + "]" : "")
      + (burstDuration != null ? " burstDuration [" + burstDuration + "]" : "")
      + (gpsWBL1Level != null ? " gpsWBL1Level [" + gpsWBL1Level + "]" : "")
      + (tuningMethod != null ? " tuningMethod [" + tuningMethod + "]" : "")
      + (freqTolerance != null ? " freqTolerance [" + freqTolerance + "]" : "")
      + (occBw != null ? " occBw [" + occBw + "]" : "")
      + (burstOffTime != null ? " burstOffTime [" + burstOffTime + "]" : "")
      + (burstNumPulses != null ? " burstNumPulses [" + burstNumPulses + "]" : "")
      + (intermodPct != null ? " intermodPct [" + intermodPct + "]" : "")
      + (occBwCalculated != null ? " occBwCalculated [" + occBwCalculated + "]" : "")
      + (pulse != null ? " pulse [" + pulse + "]" : "")
      + (modeName != null ? " modeName [" + modeName + "]" : "")
      + (curves != null ? " curves [" + curves + "]" : "")
      + (baseband != null ? " baseband [" + baseband + "]" : "")
      + (gpsNBL2Level != null ? " gpsNBL2Level [" + gpsNBL2Level + "]" : "")
      + (channelDwell != null ? " channelDwell [" + channelDwell + "]" : "")
      + (spuriousLevel != null ? " spuriousLevel [" + spuriousLevel + "]" : "")
      + (observedRFAnalysis != null ? " observedRFAnalysis [" + observedRFAnalysis + "]" : "")
      + (spreadSpectrum != null ? " spreadSpectrum [" + spreadSpectrum + "]" : "")
      + (intermodEffect != null ? " intermodEffect [" + intermodEffect + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (numSubCarriers != null ? " numSubCarriers [" + numSubCarriers + "]" : "")
      + (gpsNBL1Level != null ? " gpsNBL1Level [" + gpsNBL1Level + "]" : "")
      + (power != null ? " power [" + power + "]" : "")
      + (freqToleranceUnit != null ? " freqToleranceUnit [" + freqToleranceUnit + "]" : "")
      + (thirdHarmonicLevel != null ? " thirdHarmonicLevel [" + thirdHarmonicLevel + "]" : "")
      + (observedPulseAnalysis != null ? " observedPulseAnalysis [" + observedPulseAnalysis + "]" : "")
      + (secondHarmonicLevel != null ? " secondHarmonicLevel [" + secondHarmonicLevel + "]" : "")
      + (subcarrierFreq != null ? " subcarrierFreq [" + subcarrierFreq + "]" : "")
      + (gpsWBL2Level != null ? " gpsWBL2Level [" + gpsWBL2Level + "]" : "")
      + (burstRate != null ? " burstRate [" + burstRate + "]" : "")
      + (tunability != null ? " tunability [" + tunability + "]" : "")
      + (txSignalTuning != null ? " txSignalTuning [" + txSignalTuning + "]" : "")
      + (emsClass != null ? " emsClass [" + emsClass + "]" : "")
      + (necessaryBw != null ? " necessaryBw [" + necessaryBw + "]" : "")
      + (numSideTones != null ? " numSideTones [" + numSideTones + "]" : "")
      + (jitterCapable != null ? " jitterCapable [" + jitterCapable + "]" : "")
      + (txModulation != null ? " txModulation [" + txModulation + "]" : "")
      + (otherHarmonicLevel != null ? " otherHarmonicLevel [" + otherHarmonicLevel + "]" : "")
      + (radarType != null ? " radarType [" + radarType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TxMode} requires {@link TString ModeID}.
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
