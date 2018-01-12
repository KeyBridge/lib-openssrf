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
package us.gov.dod.standard.ssrf._3_1.receiver;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.Receiver;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;

/**
 * RxMode and sub-elements define all the technical parameters for a mode of
 * operation of the Receiver.
 * <p>
 * Element of {@link Receiver}
 * <p>
 * Sub-Elements are
 * {@link Baseband}, {@link EmsClass}, {@link FreqConversion}, {@link RxModulation}, {@link RxSignalTuning}, {@link SpreadSpectrum}
 * <p>
 * Example:
 * <pre>
 * &lt;SensitivityLevel&gt;-92&lt;/SensitivityLevel&gt;
 * &lt;NoiseFigure&gt;9&lt;/NoiseFigure&gt;
 * &lt;NoiseTemp&gt;850&lt;/NoiseTemp&gt;
 * &lt;SensitivityCriteriaType&gt;SINAD&lt;/SensitivityCriteriaType&gt;
 *  &lt;SensitivityCriteriaText&gt;10 dB at 30 kHz BW&lt;/SensitivityCriteriaText&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxMode", propOrder = {
  "modeID",
  "description",
  "rxType",
  "necessaryBw",
  "tunability",
  "tuningMethod",
  "intermodPct",
  "intermodEffect",
  "sensitivityLevel",
  "noiseFigure",
  "noiseTemp",
  "sensitivityCriteriaType",
  "sensitivityCriteriaLevel",
  "sensitivityCriteriaText",
  "postDetectionFreqMin",
  "postDetectionFreqMax",
  "processingGainMin",
  "processingGainMax",
  "spuriousRejection",
  "imageRejection",
  "intermodRejection",
  "adjacentChannelSelectivity",
  "freqTolerance",
  "freqToleranceUnit",
  "modeName",
  "emsClass",
  "rxSignalTuning",
  "rxModulation",
  "baseband",
  "freqConversion",
  "spreadSpectrum"
})
public class RxMode {

  /**
   * ModeID - Mode Identifier (Required)
   * <p>
   * A short name for the mode; this name should be a meaningful identification
   * of the mode, but it can also be automatically generated. The Name MUST be
   * unique within the dataset and SHOULD NOT be modified during the lifetime of
   * the Dataset.
   * <p>
   * Format is S20
   * <p>
   * Attribute group ModeInfo (Required)
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
   * RxType - Receiver Type (Optional)
   * <p>
   * The type of receiver. If there is no suitable entry in the code list, use
   * Other and indicate the type in a Remark.
   * <p>
   * Format is L:CRT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxType", required = false)
  private TString rxType;
  /**
   * NecessaryBw - Necessary Bandwidth (Optional).
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
   * TuningMethod - Tuning Method (Optional).
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
   * SensitivityLevel - Sensitivity Level (Optional).
   * <p>
   * The minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * Format is SN(6,3) (dBm)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityLevel", required = false)
  private dBm sensitivityLevel;
  /**
   * NoiseFigure - Noise Figure (Optional).
   * <p>
   * The ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NoiseFigure", required = false)
  private dB noiseFigure;
  /**
   * NoiseTemp - Noise Temperature (Optional).
   * <p>
   * The absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * Format is UN(7,1) (kelvins)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NoiseTemp", required = false)
  private Kelvins noiseTemp;
  /**
   * SensitivityCriteriaType - Type of Sensitivity Criteria (Optional).
   * <p>
   * The criteria used to determine the minimum RF signal power present at the
   * input terminals that ensures acceptable detection and demodulation of the
   * desired signal.
   * <p>
   * Format is L:CSE
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityCriteriaType", required = false)
  private TString sensitivityCriteriaType;
  /**
   * SensitivityCriteriaLevel - Sensitivity Criteria Level (Optional).
   * <p>
   * The value of the criteria; the meaning and unit of this value depends on
   * the Sensitivity Criteria Type selected.
   * <p>
   * Format is SN(16,15) (dBm)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityCriteriaLevel", required = false)
  private SCLevel sensitivityCriteriaLevel;
  /**
   * SensitivityCriteriaText - Sensitivity Criteria Description (Optional).
   * <p>
   * The value of the criteria when it cannot be expressed as a number.
   * <p>
   * Format is S50
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SensitivityCriteriaText", required = false)
  private S50 sensitivityCriteriaText;
  /**
   * PostDetectionFreqMin - Minimum Post Detection Frequency (Optional).
   * <p>
   * The maximum post detection frequency at the baseband half-power point.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group PostDetection (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PostDetectionFreqMin", required = false)
  private FreqM postDetectionFreqMin;
  /**
   * PostDetectionFreqMax - Maximum Post Detection Frequency (Optional).
   * <p>
   * The maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group PostDetection (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PostDetectionFreqMax", required = false)
  private FreqM postDetectionFreqMax;
  @XmlElement(name = "ProcessingGainMin", required = false)
  private dB processingGainMin;
  /**
   * ProcessingGainMax - Maximum Processing Gain (Optional).
   * <p>
   * The maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ProcessingGainMax", required = false)
  private dB processingGainMax;
  /**
   * SpuriousRejection - Rejection of Spurious Emissions (Optional).
   * <p>
   * The spurious receiver responses that arise when strong undesired signals
   * and the receiver local oscillator (LO) combine in the mixer to produce a
   * frequency on or near the intermediate frequency. The rejection is the ratio
   * in dB of a particular out-of-band frequency (outside the fundamental IF
   * bandwidth) signal level required to produce a specified output, to the
   * signal level required to produce the same output.
   * <p>
   * Format is UN(5,2) [0..150] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpuriousRejection", required = false)
  private Rejection_DB1 spuriousRejection;
  /**
   * ImageRejection - Rejection on Image Frequency (Optional).
   * <p>
   * The ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output. This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * Format is UN(5,2) [0..150] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ImageRejection", required = false)
  private Rejection_DB1 imageRejection;
  /**
   * IntermodRejection - Rejection of Intermodulation (Optional).
   * <p>
   * The rejection of spurious emissions involving the mixing of two or more
   * signals. Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * Format is UN(5,2) [0..200] (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IntermodRejection", required = false)
  private Rejection_DB2 intermodRejection;
  /**
   * AdjacentChannelSelectivity - Adjacent Channel Selectivity (Optional).
   * <p>
   * The ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * Format is SN(6,3) (dBm)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AdjacentChannelSelectivity", required = false)
  private dB adjacentChannelSelectivity;
  /**
   * FreqTolerance - Frequency Tolerance (Required).
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
   * FreqToleranceUnit - Frequency Tolerance Unit (Required).
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
   * US:ModeName - Mode Name (Optional).
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
   * EmsClass (Optional).
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
   * RxSignalTuning (Optional).
   * <p>
   * RxSignalTuning indicates the tuning capabilities, the specific frequency or
   * range of frequencies within which the equipment may tune, and the tuning
   * increments of the equipment.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxSignalTuning")
  private Set<RxSignalTuning> rxSignalTuning;
  /**
   * RxModulation (Optional).
   * <p>
   * RxModulation contains the detailed characteristics of the modulation on the
   * receiver side.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RxModulation")
  private Set<RxModulation> rxModulation;
  /**
   * Baseband (Optional).
   * <p>
   * Baseband defines the parameters of the modulating or received signal.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Baseband")
  private Set<Baseband> baseband;
  /**
   * FreqConversion (Optional).
   * <p>
   * FreqConversion contains the characteristics of a frequency conversion
   * stage: intermediate frequency (IF) and local oscillator (LO) parameters.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqConversion")
  private Set<FreqConversion> freqConversion;
  /**
   * Spread Spectrum (Optional).
   * <p>
   * SpreadSpectrum contains characteristics of systems using spread spectrum
   * techniques.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SpreadSpectrum")
  private SpreadSpectrum spreadSpectrum;
  /**
   * curves - Links to Curves (Optional).
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
   * Get a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated. The
   * Name MUST be unique within the dataset and SHOULD NOT be modified during
   * the lifetime of the Dataset.
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getModeID() {
    return modeID;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated. The
   * Name MUST be unique within the dataset and SHOULD NOT be modified during
   * the lifetime of the Dataset.
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
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getDescription() {
    return description;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
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
   * Get the type of receiver. If there is no suitable entry in the code list,
   * use Other and indicate the type in a Remark.
   * <p>
   * @return the RxType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRxType() {
    return rxType;
  }

  /**
   * Set the type of receiver. If there is no suitable entry in the code list,
   * use Other and indicate the type in a Remark.
   * <p>
   * @param value the RxType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRxType(TString value) {
    this.rxType = value;
  }

  /**
   * Determine if the RxType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxType() {
    return (this.rxType != null ? this.rxType.isSetValue() : false);
  }

  /**
   * Get the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
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
   * emission curve.
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
   * Get the tuning capability.
   * <p>
   * @return the Tunability value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTunability() {
    return tunability;
  }

  /**
   * Set the tuning capability.
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
   * spectrum.
   * <p>
   * @return the TuningMethod value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
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
   * Get Intermodulation Percentage.
   * <p>
   * This is the percentage of the total signal either transmitted or receive
   * affected by the distortion products.
   *
   * @return a {@link Percent} instance
   * @since 3.1.0
   */
  public Percent getIntermodPct() {
    return intermodPct;
  }

  /**
   * Set Intermodulation Percentage.
   * <p>
   * This is the percentage of the total signal either transmitted or received
   * affected by the distortion products.
   *
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
   * Get Intermodulation Effect.
   * <p>
   * This is the effect on circuit operation caused by the level of
   * intermodulation distortion.
   *
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Set Intermodulation Effect.
   * <p>
   * This is the effect on circuit operation caused by the level of
   * intermodulation distortion.
   *
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
   * Get the minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * @return a {@link dBm} instance
   * @since 3.1.0
   */
  public dBm getSensitivityLevel() {
    return sensitivityLevel;
  }

  /**
   * Set the minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * @param value a {@link dBm} instance
   * @since 3.1.0
   */
  public void setSensitivityLevel(dBm value) {
    this.sensitivityLevel = value;
  }

  /**
   * Determine if the SensitivityLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityLevel() {
    return (this.sensitivityLevel != null ? this.sensitivityLevel.isSetValue() : false);
  }

  /**
   * Get the ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getNoiseFigure() {
    return noiseFigure;
  }

  /**
   * Set the ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setNoiseFigure(dB value) {
    this.noiseFigure = value;
  }

  /**
   * Determine if the NoiseFigure is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNoiseFigure() {
    return (this.noiseFigure != null ? this.noiseFigure.isSetValue() : false);
  }

  /**
   * Get the absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * @return a {@link Kelvins} instance
   * @since 3.1.0
   */
  public Kelvins getNoiseTemp() {
    return noiseTemp;
  }

  /**
   * Set the absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * @param value a {@link Kelvins} instance
   * @since 3.1.0
   */
  public void setNoiseTemp(Kelvins value) {
    this.noiseTemp = value;
  }

  /**
   * Determine if the NoiseTemp is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNoiseTemp() {
    return (this.noiseTemp != null ? this.noiseTemp.isSetValue() : false);
  }

  /**
   * Get the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @return the SensitivityCriteriaType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSensitivityCriteriaType() {
    return sensitivityCriteriaType;
  }

  /**
   * Set the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @param value the SensitivityCriteriaType value in a {@link TString} data
   *              type
   * @since 3.1.0
   */
  public void setSensitivityCriteriaType(TString value) {
    this.sensitivityCriteriaType = value;
  }

  /**
   * Determine if the SensitivityCriteriaType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityCriteriaType() {
    return (this.sensitivityCriteriaType != null ? this.sensitivityCriteriaType.isSetValue() : false);
  }

  /**
   * Get the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @return a {@link SCLevel} instance
   * @since 3.1.0
   */
  public SCLevel getSensitivityCriteriaLevel() {
    return sensitivityCriteriaLevel;
  }

  /**
   * Set the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @param value a {@link SCLevel} instance
   * @since 3.1.0
   */
  public void setSensitivityCriteriaLevel(SCLevel value) {
    this.sensitivityCriteriaLevel = value;
  }

  /**
   * Determine if the SensitivityCriteriaLevel is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityCriteriaLevel() {
    return (this.sensitivityCriteriaLevel != null ? this.sensitivityCriteriaLevel.isSetValue() : false);
  }

  /**
   * Get the value of the criteria when it cannot be expressed as a number.
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getSensitivityCriteriaText() {
    return sensitivityCriteriaText;
  }

  /**
   * Set the value of the criteria when it cannot be expressed as a number.
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setSensitivityCriteriaText(S50 value) {
    this.sensitivityCriteriaText = value;
  }

  /**
   * Determine if the SensitivityCriteriaText is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSensitivityCriteriaText() {
    return (this.sensitivityCriteriaText != null ? this.sensitivityCriteriaText.isSetValue() : false);
  }

  /**
   * Get the maximum post detection frequency at the baseband half-power point.
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getPostDetectionFreqMin() {
    return postDetectionFreqMin;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setPostDetectionFreqMin(FreqM value) {
    this.postDetectionFreqMin = value;
  }

  /**
   * Determine if the PostDetectionFreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPostDetectionFreqMin() {
    return (this.postDetectionFreqMin != null ? this.postDetectionFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getPostDetectionFreqMax() {
    return postDetectionFreqMax;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setPostDetectionFreqMax(FreqM value) {
    this.postDetectionFreqMax = value;
  }

  /**
   * Determine if the PostDetectionFreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPostDetectionFreqMax() {
    return (this.postDetectionFreqMax != null ? this.postDetectionFreqMax.isSetValue() : false);
  }

  /**
   * Get the minimum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getProcessingGainMin() {
    return processingGainMin;
  }

  /**
   * Set the minimum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setProcessingGainMin(dB value) {
    this.processingGainMin = value;
  }

  /**
   * Determine if the ProcessingGainMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProcessingGainMin() {
    return (this.processingGainMin != null ? this.processingGainMin.isSetValue() : false);
  }

  /**
   * Get the maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getProcessingGainMax() {
    return processingGainMax;
  }

  /**
   * Set the maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setProcessingGainMax(dB value) {
    this.processingGainMax = value;
  }

  /**
   * Determine if the ProcessingGainMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetProcessingGainMax() {
    return (this.processingGainMax != null ? this.processingGainMax.isSetValue() : false);
  }

  /**
   * Get the spurious receiver responses that arise when strong undesired
   * signals and the receiver local oscillator (LO) combine in the mixer to
   * produce a frequency on or near the intermediate frequency. The rejection is
   * the ratio in dB of a particular out-of-band frequency (outside the
   * fundamental IF bandwidth) signal level required to produce a specified
   * output, to the signal level required to produce the same output.
   * <p>
   * @return a {@link Rejection_DB1} instance
   * @since 3.1.0
   */
  public Rejection_DB1 getSpuriousRejection() {
    return spuriousRejection;
  }

  /**
   * Set the spurious receiver responses that arise when strong undesired
   * signals and the receiver local oscillator (LO) combine in the mixer to
   * produce a frequency on or near the intermediate frequency. The rejection is
   * the ratio in dB of a particular out-of-band frequency (outside the
   * fundamental IF bandwidth) signal level required to produce a specified
   * output, to the signal level required to produce the same output.
   * <p>
   * @param value a {@link Rejection_DB1} instance
   * @since 3.1.0
   */
  public void setSpuriousRejection(Rejection_DB1 value) {
    this.spuriousRejection = value;
  }

  /**
   * Determine if the SpuriousRejection is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSpuriousRejection() {
    return (this.spuriousRejection != null ? this.spuriousRejection.isSetValue() : false);
  }

  /**
   * Get the ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output. This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * @return a {@link Rejection_DB1} instance
   * @since 3.1.0
   */
  public Rejection_DB1 getImageRejection() {
    return imageRejection;
  }

  /**
   * Set the ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output. This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * @param value a {@link Rejection_DB1} instance
   * @since 3.1.0
   */
  public void setImageRejection(Rejection_DB1 value) {
    this.imageRejection = value;
  }

  /**
   * Determine if the ImageRejection is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetImageRejection() {
    return (this.imageRejection != null ? this.imageRejection.isSetValue() : false);
  }

  /**
   * Get the rejection of spurious emissions involving the mixing of two or more
   * signals. Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * @return a {@link Rejection_DB2} instance
   * @since 3.1.0
   */
  public Rejection_DB2 getIntermodRejection() {
    return intermodRejection;
  }

  /**
   * Set the rejection of spurious emissions involving the mixing of two or more
   * signals. Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * @param value a {@link Rejection_DB2} instance
   * @since 3.1.0
   */
  public void setIntermodRejection(Rejection_DB2 value) {
    this.intermodRejection = value;
  }

  /**
   * Determine if the IntermodRejection is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIntermodRejection() {
    return (this.intermodRejection != null ? this.intermodRejection.isSetValue() : false);
  }

  /**
   * Get the ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getAdjacentChannelSelectivity() {
    return adjacentChannelSelectivity;
  }

  /**
   * Set the ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setAdjacentChannelSelectivity(dB value) {
    this.adjacentChannelSelectivity = value;
  }

  /**
   * Determine if the AdjacentChannelSelectivity is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdjacentChannelSelectivity() {
    return (this.adjacentChannelSelectivity != null ? this.adjacentChannelSelectivity.isSetValue() : false);
  }

  /**
   * Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
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
   * in FreqToleranceUnit.
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
   * Get the units in which the Frequency Tolerance is expressed.
   * <p>
   * @return the FreqToleranceUnit value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getFreqToleranceUnit() {
    return freqToleranceUnit;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
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
   * Get a short name for the mode.
   * <p>
   * @return a {@link S40} instance
   * @since 3.1.0
   */
  public S40 getModeName() {
    return modeName;
  }

  /**
   * Set a short name for the mode.
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
   * Get the EmsClass.
   * <p>
   * Complex element EmsClass identifies the emission classification symbols
   * that define the baseband modulating characteristics of the emission
   * designator. The emission classification consists of the three required
   * symbols and the two optional symbols.
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
   * Clear the EmsClass field.
   *
   * This sets the field to null.
   */
  public void unsetEmsClass() {
    this.emsClass = null;
  }

  /**
   * Get the RxSignalTuning
   * <p>
   * Complex element RxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @return a {@link RxSignalTuning} instance
   * @since 3.1.0
   */
  public Set<RxSignalTuning> getRxSignalTuning() {
    if (rxSignalTuning == null) {
      rxSignalTuning = new HashSet<>();
    }
    return this.rxSignalTuning;
  }

  /**
   * Determine if the RxSignalTuning is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxSignalTuning() {
    return ((this.rxSignalTuning != null) && (!this.rxSignalTuning.isEmpty()));
  }

  /**
   * Clear the RxSignalTuning field. This sets the field to null.
   */
  public void unsetRxSignalTuning() {
    this.rxSignalTuning = null;
  }

  /**
   * Get the RxModulation
   * <p>
   * Complex element RxModulation contains the detailed characteristics of the
   * modulation on the receiver side.
   * <p>
   * @return a {@link RxModulation} instance
   * @since 3.1.0
   */
  public Set<RxModulation> getRxModulation() {
    if (rxModulation == null) {
      rxModulation = new HashSet<>();
    }
    return this.rxModulation;
  }

  /**
   * Determine if the RxModulation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRxModulation() {
    return ((this.rxModulation != null) && (!this.rxModulation.isEmpty()));
  }

  /**
   * Clear the RxModulation field.
   *
   * This sets the field to null.
   */
  public void unsetRxModulation() {
    this.rxModulation = null;
  }

  /**
   * Get the Baseband.
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
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
   * Clear the Baseband field.
   *
   * This sets the field to null.
   */
  public void unsetBaseband() {
    this.baseband = null;
  }

  /**
   * Get the FreqConversion
   * <p>
   * Complex element FreqConversion contains the characteristics of a frequency
   * conversion stage: intermediate frequency (IF) and local oscillator (LO)
   * parameters.
   * <p>
   * @return a {@link FreqConversion} instance
   * @since 3.1.0
   */
  public Set<FreqConversion> getFreqConversion() {
    if (freqConversion == null) {
      freqConversion = new HashSet<>();
    }
    return this.freqConversion;
  }

  /**
   * Determine if the FreqConversion is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqConversion() {
    return ((this.freqConversion != null) && (!this.freqConversion.isEmpty()));
  }

  /**
   * Clear the FreqConversion field. This sets the field to null.
   */
  public void unsetFreqConversion() {
    this.freqConversion = null;
  }

  /**
   * Get the Spread Spectrum.
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
   * spread spectrum techniques.
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
   * Get the list of indices referring to Curves applicable to the data item.
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
   * Clear the Curves field.
   *
   * This sets the field to null.
   */
  public void unsetCurves() {
    this.curves = null;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated. The
   * Name MUST be unique within the dataset and SHOULD NOT be modified during
   * the lifetime of the Dataset.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withModeID(String value) {
    setModeID(new S20(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withDescription(String value) {
    setDescription(new S100(value));
    return this;
  }

  /**
   * Set the type of receiver. If there is no suitable entry in the code list,
   * use Other and indicate the type in a Remark.
   * <p>
   * @param value An instances of type {@link ListCRT}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withRxType(ListCRT value) {
    setRxType(new TString(value.value()));
    return this;
  }

  /**
   * Set the necessary bandwidth which is defined as the minimum width of the
   * frequency band sufficient to ensure the transmission of information at the
   * required rate and quality. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withNecessaryBw(Double value) {
    setNecessaryBw(new FreqM(value));
    return this;
  }

  /**
   * Set the tuning capability.
   * <p>
   * @param value An instances of type {@link ListCTU}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withTunability(ListCTU value) {
    setTunability(new TString(value.value()));
    return this;
  }

  /**
   * Set the device or process used to tune the equipment through the RF
   * spectrum.
   * <p>
   * @param value An instances of type {@link ListCTN}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withTuningMethod(ListCTN value) {
    setTuningMethod(new TString(value.value()));
    return this;
  }

  /**
   * Set Intermodulation Percentage.
   * <p>
   * This is the percentage of the total signal either transmitted or received
   * affected by the distortion products.
   *
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withIntermodPct(Double value) {
    setIntermodPct(new Percent(value));
    return this;
  }

  /**
   * Set Intermodulation Effect.
   * <p>
   * This is the effect on circuit operation caused by the level of
   * intermodulation distortion.
   *
   * @param value An instances of type {@link String}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withIntermodEffect(String value) {
    setIntermodEffect(new MEMO(value));
    return this;
  }

  /**
   * Set the minimum RF signal power level as it relates to one of the four
   * Sensitivity Criteria Types: PWOP, SINAD, S/N or S+N/N indicated in item
   * SensitivityCriteriaType. Note, for MDS and MTR criteria, the RF signal
   * power level is zero and this item may be left blank in those instances.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withSensitivityLevel(Double value) {
    setSensitivityLevel(new dBm(value));
    return this;
  }

  /**
   * Set the ratio of the output noise power to the portion of noise power
   * attributable to thermal noise in the input termination at 290 Kelvins.
   * Noise Figure is related to Noise Temperature by the following formula:
   * NoiseFigure [dB] = 10 x log10((NoiseTemp [K] / 290) + 1).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withNoiseFigure(Double value) {
    setNoiseFigure(new dB(value));
    return this;
  }

  /**
   * Set the absolute temperature of a passive system having an available noise
   * power per unit bandwidth at a specified frequency equal to that of the
   * actual terminals of a network. Noise Figure is related to Noise Temperature
   * by the following formula: NoiseFigure [dB] = 10 x log10((NoiseTemp [K] /
   * 290) + 1).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withNoiseTemp(Double value) {
    setNoiseTemp(new Kelvins(value));
    return this;
  }

  /**
   * Set the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @param value An instances of type {@link ListCSE}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withSensitivityCriteriaType(ListCSE value) {
    setSensitivityCriteriaType(new TString(value.value()));
    return this;
  }

  /**
   * Set the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withSensitivityCriteriaLevel(Double value) {
    setSensitivityCriteriaLevel(new SCLevel(value));
    return this;
  }

  /**
   * Set the value of the criteria when it cannot be expressed as a number.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withSensitivityCriteriaText(String value) {
    setSensitivityCriteriaText(new S50(value));
    return this;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withPostDetectionFreqMin(Double value) {
    setPostDetectionFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withPostDetectionFreqMax(Double value) {
    setPostDetectionFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the minimum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withProcessingGainMin(Double value) {
    setProcessingGainMin(new dB(value));
    return this;
  }

  /**
   * Set the maximum ratio of the post processing signal-to-noise ratio to the
   * received signal-to-noise ratio.
   * <p>
   * [XSL ERR MINMAX] If ProcessingGainMax is used, it MUST be greater than
   * ProcessingGainMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withProcessingGainMax(Double value) {
    setProcessingGainMax(new dB(value));
    return this;
  }

  /**
   * Set the spurious receiver responses that arise when strong undesired
   * signals and the receiver local oscillator (LO) combine in the mixer to
   * produce a frequency on or near the intermediate frequency.
   * 
   * The rejection is the ratio in dB of a particular out-of-band frequency
   * (outside the fundamental IF bandwidth) signal level required to produce a
   * specified output, to the signal level required to produce the same
   * output.
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withSpuriousRejection(Double value) {
    setSpuriousRejection(new Rejection_DB1(value));
    return this;
  }

  /**
   * Set the ratio of the image frequency signal level required to produce a
   * specified output, to the desired signal level required to produce the same
   * output.
   *
   * This applies to superheterodyne receivers. For example, if a
   * receiver has a sensitivity of -100 dBm and could receive an image signal
   * with a maximum power of -20 dBm without causing the standard response, then
   * the receive image rejection would be 80 dB.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withImageRejection(Double value) {
    setImageRejection(new Rejection_DB1(value));
    return this;
  }

  /**
   * Set the rejection of spurious emissions involving the mixing of two or more
   * signals.
   *
   * Spurious emissions are emissions on a frequency or frequencies
   * that are outside the necessary bandwidth and the level of which may be
   * reduced without affecting the related transmission of information.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withIntermodRejection(Double value) {
    setIntermodRejection(new Rejection_DB2(value));
    return this;
  }

  /**
   * Set the ratio in dB between the wanted signal and the maximum level of an
   * unwanted signal in the adjacent channel which still allows correct
   * reception of the wanted signal.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withAdjacentChannelSelectivity(Double value) {
    setAdjacentChannelSelectivity(new dB(value));
    return this;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withFreqTolerance(Double value) {
    setFreqTolerance(new UN18_6(value));
    return this;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value An instances of type {@link ListCFO}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withFreqToleranceUnit(ListCFO value) {
    setFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  /**
   * Set a short name for the mode.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withModeName(String value) {
    setModeName(new S40(value));
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
   * @param values One or more instances of type {@link EmsClass}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withEmsClass(EmsClass... values) {
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
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withEmsClass(Collection<EmsClass> values) {
    if (values != null) {
      getEmsClass().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxSignalTuning
   * <p>
   * Complex element RxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values One or more instances of type {@link RxSignalTuning}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withRxSignalTuning(RxSignalTuning... values) {
    if (values != null) {
      getRxSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxSignalTuning
   * <p>
   * Complex element RxSignalTuning indicates the tuning capabilities, the
   * specific frequency or range of frequencies within which the equipment may
   * tune, and the tuning increments of the equipment.
   * <p>
   * @param values A collection of {@link RxSignalTuning} instances
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withRxSignalTuning(Collection<RxSignalTuning> values) {
    if (values != null) {
      getRxSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the RxModulation
   * <p>
   * Complex element RxModulation contains the detailed characteristics of the
   * modulation on the receiver side.
   * <p>
   * @param values One or more instances of type {@link RxModulation}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withRxModulation(RxModulation... values) {
    if (values != null) {
      getRxModulation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RxModulation
   * <p>
   * Complex element RxModulation contains the detailed characteristics of the
   * modulation on the receiver side.
   * <p>
   * @param values A collection of {@link RxModulation} instances
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withRxModulation(Collection<RxModulation> values) {
    if (values != null) {
      getRxModulation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Baseband.
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
   * <p>
   * @param values One or more instances of type {@link Baseband}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withBaseband(Baseband... values) {
    if (values != null) {
      getBaseband().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Baseband.
   * <p>
   * Complex element Baseband defines the parameters of the modulating or
   * received signal.
   * <p>
   * @param values A collection of {@link Baseband} instances
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withBaseband(Collection<Baseband> values) {
    if (values != null) {
      getBaseband().addAll(values);
    }
    return this;
  }

  /**
   * Set the FreqConversion.
   * <p>
   * Complex element FreqConversion contains the characteristics of a frequency
   * conversion stage: intermediate frequency (IF) and local oscillator (LO)
   * parameters.
   * <p>
   * @param values One or more instances of type {@link FreqConversion}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withFreqConversion(FreqConversion... values) {
    if (values != null) {
      getFreqConversion().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the FreqConversion.
   * <p>
   * Complex element FreqConversion contains the characteristics of a frequency
   * conversion stage: intermediate frequency (IF) and local oscillator (LO)
   * parameters.
   * <p>
   * @param values A collection of {@link FreqConversion} instances
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withFreqConversion(Collection<FreqConversion> values) {
    if (values != null) {
      getFreqConversion().addAll(values);
    }
    return this;
  }

  /**
   * Set the Spread Spectrum.
   * <p>
   * Complex element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques.
   * <p>
   * @param value An instances of type {@link SpreadSpectrum}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withSpreadSpectrum(SpreadSpectrum value) {
    setSpreadSpectrum(value);
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger}.
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withCurves(BigInteger... values) {
    if (values != null) {
      getCurves().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current RxMode object instance.
   * @since 3.1.0
   */
  public RxMode withCurves(Collection<BigInteger> values) {
    if (values != null) {
      getCurves().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this RxMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  RxMode {"
           + (adjacentChannelSelectivity != null ? " adjacentChannelSelectivity [" + adjacentChannelSelectivity + "]" : "")
           + (baseband != null ? " baseband [" + baseband + "]" : "")
           + (curves != null ? " curves [" + curves + "]" : "")
           + (description != null ? " description [" + description + "]" : "")
           + (emsClass != null ? " emsClass [" + emsClass + "]" : "")
           + (freqConversion != null ? " freqConversion [" + freqConversion + "]" : "")
           + (freqTolerance != null ? " freqTolerance [" + freqTolerance + "]" : "")
           + (freqToleranceUnit != null ? " freqToleranceUnit [" + freqToleranceUnit + "]" : "")
           + (imageRejection != null ? " imageRejection [" + imageRejection + "]" : "")
           + (intermodEffect != null ? " intermodEffect [" + intermodEffect + "]" : "")
           + (intermodPct != null ? " intermodPct [" + intermodPct + "]" : "")
           + (intermodRejection != null ? " intermodRejection [" + intermodRejection + "]" : "")
           + (modeID != null ? " modeID [" + modeID + "]" : "")
           + (modeName != null ? " modeName [" + modeName + "]" : "")
           + (necessaryBw != null ? " necessaryBw [" + necessaryBw + "]" : "")
           + (noiseFigure != null ? " noiseFigure [" + noiseFigure + "]" : "")
           + (noiseTemp != null ? " noiseTemp [" + noiseTemp + "]" : "")
           + (postDetectionFreqMax != null ? " postDetectionFreqMax [" + postDetectionFreqMax + "]" : "")
           + (postDetectionFreqMin != null ? " postDetectionFreqMin [" + postDetectionFreqMin + "]" : "")
           + (processingGainMax != null ? " processingGainMax [" + processingGainMax + "]" : "")
           + (processingGainMin != null ? " processingGainMin [" + processingGainMin + "]" : "")
           + (rxModulation != null ? " rxModulation [" + rxModulation + "]" : "")
           + (rxSignalTuning != null ? " rxSignalTuning [" + rxSignalTuning + "]" : "")
           + (rxType != null ? " rxType [" + rxType + "]" : "")
           + (sensitivityCriteriaLevel != null ? " sensitivityCriteriaLevel [" + sensitivityCriteriaLevel + "]" : "")
           + (sensitivityCriteriaText != null ? " sensitivityCriteriaText [" + sensitivityCriteriaText + "]" : "")
           + (sensitivityCriteriaType != null ? " sensitivityCriteriaType [" + sensitivityCriteriaType + "]" : "")
           + (sensitivityLevel != null ? " sensitivityLevel [" + sensitivityLevel + "]" : "")
           + (spreadSpectrum != null ? " spreadSpectrum [" + spreadSpectrum + "]" : "")
           + (spuriousRejection != null ? " spuriousRejection [" + spuriousRejection + "]" : "")
           + (tunability != null ? " tunability [" + tunability + "]" : "")
           + (tuningMethod != null ? " tuningMethod [" + tuningMethod + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxMode} requires {@link S20 ModeID}.
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
