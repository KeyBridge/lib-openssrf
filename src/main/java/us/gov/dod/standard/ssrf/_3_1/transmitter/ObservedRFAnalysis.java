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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCFO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS7;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUSY;

/**
 * ObservedRFAnalysis (US) contains the statisical results of actual RF
 * observations.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Sub-Element is {@link ObservedRFValues}
 * <p>
 * Example:
 * <pre>
 * &lt;ObservedRFAnalysis&gt;
 *   &lt;ChipRate cls="U"&gt;346&lt;/ChipRate&gt;
 *   &lt;DwellTime cls="U"&gt;78.98&lt;/DwellTime&gt;
 *   &lt;FreqMax cls="U"&gt;3107.56&lt;/FreqMax&gt;
 *   &lt;FreqMin cls="U"&gt;2999.753&lt;/FreqMin&gt;
 *   &lt;GuardBand cls="U"&gt;2986&lt;/GuardBand&gt;
 *   &lt;InstantRFBW03 cls="U"&gt;24.79&lt;/InstantRFBW03&gt;
 *   &lt;InstantRFBW06 cls="U"&gt;45.64&lt;/InstantRFBW06&gt;
 *   &lt;InstantRFBW10 cls="U"&gt;56.83&lt;/InstantRFBW10&gt;
 *   &lt;InstantRFBW20 cls="U"&gt;99.76&lt;/InstantRFBW20&gt;
 *   &lt;NumRFChannels cls="U"&gt;300&lt;/NumRFChannels&gt;
 *   &lt;NumRFElements cls="U"&gt;355&lt;/NumRFElements&gt;
 *   &lt;NumRFPositions cls="U"&gt;890&lt;/NumRFPositions&gt;
 *   &lt;NumRFSimultaneous cls="U"&gt;248&lt;/NumRFSimultaneous&gt;
 *   &lt;OperationalRFBW cls="U"&gt;87.9&lt;/OperationalRFBW&gt;
 *   &lt;RFAdaptiveDriver cls="U"&gt;Target Motion Tracking&lt;/RFAdaptiveDriver&gt;
 *   &lt;RFAdaptiveRule cls="U"&gt;Required Pattern Collection&lt;/RFAdaptiveRule&gt;
 *   &lt;RFBasicClockPeriod cls="U"&gt;0.0001&lt;/RFBasicClockPeriod&gt;
 *   &lt;RFChangeRate cls="U"&gt;84&lt;/RFChangeRate&gt;
 *   &lt;RFChannelFreqMax cls="U"&gt;3107.56&lt;/RFChannelFreqMax&gt;
 *   &lt;RFChannelFreqMin cls="U"&gt;2999.753&lt;/RFChannelFreqMin&gt;
 *   &lt;RFCoherent cls="U"&gt;Non-Coherent&lt;/RFCoherent&gt;
 *   &lt;RFContinuous cls="U"&gt;Yes&lt;/RFContinuous&gt;
 *   &lt;RFFreqMax cls="U"&gt;3107.56&lt;/RFFreqMax&gt;
 *   &lt;RFFreqMin cls="U"&gt;2999.753&lt;/RFFreqMin&gt;
 *   &lt;RFMean cls="U"&gt;3094.56&lt;/RFMean&gt;
 *   &lt;RFMedian cls="U"&gt;3097.54&lt;/RFMedian&gt;
 *   &lt;RFPatternPeriod cls="U"&gt;0.001&lt;/RFPatternPeriod&gt;
 *   &lt;RFPatternType cls="U"&gt;Non-Patterned&lt;/RFPatternType&gt;
 *   &lt;RFRestFreq cls="U"&gt;3000.54&lt;/RFRestFreq&gt;
 *   &lt;RFSequenceDesc cls="U"&gt;Required Pattern Collection set A35&lt;/RFSequenceDesc&gt;
 *   &lt;RFSlotDuration cls="U"&gt;12.45&lt;/RFSlotDuration&gt;
 *   &lt;RFStability cls="U"&gt;ppm&lt;/RFStability&gt;
 *   &lt;RFStability cls="U"&gt;ppm&lt;/RFStability&gt;
 *   &lt;RFStabilityInterval cls="U"&gt;.00034&lt;/RFStabilityInterval&gt;
 *   &lt;RFStandardDeviation cls="U"&gt;.00023&lt;/RFStandardDeviation&gt;
 *   &lt;RFTuningStep cls="U"&gt;0.025&lt;/RFTuningStep&gt;
 *   &lt;TuningStep cls="U"&gt;0.025&lt;/TuningStep&gt;
 *   &lt;ObservedRFValues&gt;
 *     &lt;RFValue cls="U"&gt;3000&lt;/RFValue&gt;
 *     &lt;StatisticalIndicator cls="U"&gt;97.2&lt;/StatisticalIndicator&gt;
 *   &lt;/ObservedRFValues&gt;
 * &lt;/ObservedRFAnalysis&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedRFAnalysis", propOrder = {
  "chipRate",
  "dwellTime",
  "freqMax",
  "freqMin",
  "guardBand",
  "instantRFBW03",
  "instantRFBW06",
  "instantRFBW10",
  "instantRFBW20",
  "numRFChannels",
  "numRFElements",
  "numRFPositions",
  "numRFSimultaneous",
  "operationalRFBW",
  "rfAdaptiveDriver",
  "rfAdaptiveRule",
  "rfBasicClockPeriod",
  "rfChangeRate",
  "rfChannelFreqMax",
  "rfChannelFreqMin",
  "rfCoherent",
  "rfContinuous",
  "rfFreqMax",
  "rfFreqMin",
  "rfMean",
  "rfMedian",
  "rfPatternPeriod",
  "rfPatternType",
  "rfRestFreq",
  "rfSequenceDesc",
  "rfSlotDuration",
  "rfFreqTolerance",
  "rfFreqToleranceUnit",
  "rfFreqToleranceInterval",
  "rfStandardDeviation",
  "rfTuningStep",
  "tuningStep",
  "observedRFValues"
})
public class ObservedRFAnalysis {

  /**
   * US:ChipRate - Chip Rate (Optional)
   * <p>
   * The chip rate. Pertains mostly to spread spectrum.
   * <p>
   * Format is UN(16,9) (MChip/s)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChipRate", required = false)
  private MChips chipRate;
  /**
   * US:DwellTime - Dwell Time (Optional)
   * <p>
   * The dwell time at any RF when the RF dwells at particular values for more
   * than one pulse in a row.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DwellTime", required = false)
  private microsecs dwellTime;
  /**
   * US:FreqMax - Maximum Frequency (Optional)
   * <p>
   * The upper end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMax", required = false)
  private FreqM freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Optional)
   * <p>
   * The lower end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqMin", required = false)
  private FreqM freqMin;
  /**
   * US:GuardBand - Guard Band (Optional)
   * <p>
   * The RF band between carriers which is not used. Pertains mostly to spread
   * spectrum.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GuardBand", required = false)
  private FreqM guardBand;
  /**
   * US:InstantRFBW03 - Instant RF BW 03 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 3
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InstantRFBW03", required = false)
  private FreqM instantRFBW03;
  /**
   * US:InstantRFBW06 - Instant RF BW 06 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 6
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InstantRFBW06", required = false)
  private FreqM instantRFBW06;
  /**
   * US:InstantRFBW10 - Instant RF BW 10 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 10
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InstantRFBW10", required = false)
  private FreqM instantRFBW10;
  /**
   * US:InstantRFBW20 - Instant RF BW 20 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 20
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "InstantRFBW20", required = false)
  private FreqM instantRFBW20;
  /**
   * US:NumRFChannels - Num RF Channels (Optional)
   * <p>
   * The number of channels into which the RF range of the emitter is divided.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumRFChannels", required = false)
  private UN6 numRFChannels;
  /**
   * US:NumRFElements - Num RF Elements (Optional)
   * <p>
   * The number of discrete RFs (channels) a multiple RF signal contains.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumRFElements", required = false)
  private UN6 numRFElements;
  /**
   * US:NumRFPositions - Num RF Positions (Optional)
   * <p>
   * The number of RF values in a signal RF sequence before it repeats.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumRFPositions", required = false)
  private UN6 numRFPositions;
  /**
   * US:NumRFSimultaneous - Num RF Simultaneous (Optional)
   * <p>
   * The number of frequencies simultaneously used by the emitter.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumRFSimultaneous", required = false)
  private UN6 numRFSimultaneous;
  /**
   * US:OperationalRFBW - Operational RF Bandwidth (Optional)
   * <p>
   * The delta (aka. separation) from the signals lowest-min RF value to its
   * highest-max RF value; only pertains to signals which have RF changes
   * between pulses or groups of pulses (aka. RF agile signals) or signals which
   * use a changing RF continuous waveform (CW); e.g., a CW signal with a
   * sweeping RF.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OperationalRFBW", required = false)
  private FreqM operationalRFBW;
  /**
   * US:RFAdaptiveDriver - RF Adaptive Driver (Optional)
   * <p>
   * The condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency)
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFAdaptiveDriver", required = false)
  private S500 rfAdaptiveDriver;
  /**
   * In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for
   * Adaptive RF variations.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFAdaptiveRule", required = false)
  private S500 rfAdaptiveRule;
  /**
   * US:RFBasicClockPeriod - RF Basic Clock Period (Optional)
   * <p>
   * The frequency divisor common to all RF separations (not necessarily to all
   * RF) RF crystal is not always the same as the RF channelization (min).
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFBasicClockPeriod", required = false)
  private FreqM rfBasicClockPeriod;
  /**
   * US:RFChangeRate - RF Change Rate (Optional)
   * <p>
   * The RF change per unit of time, measured over a significant portion of the
   * waveform. Applies to Continuous RF variations.
   * <p>
   * Format is UN(16,9) (MHz/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFChangeRate", required = false)
  private RFChgRate rfChangeRate;
  /**
   * US:RFChannelFreqMax - Maximum RF Channel Frequency (Optional)
   * <p>
   * The maximum RF channel values.
   * <p>
   * [XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than
   * US:RFChannelFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFChannelFreqMax", required = false)
  private FreqM rfChannelFreqMax;
  /**
   * US:RFChannelFreqMin - RF Channel Freq Min (Optional)
   * <p>
   * The minimum RF channel values.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFChannelFreqMin", required = false)
  private FreqM rfChannelFreqMin;
  /**
   * In Data Item RFCoherent (US), indicate if the observed RF signal is
   * coherent, non-coherent, or unknown.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFCoherent", required = false)
  private TString rfCoherent;
  /**
   * US:RFContinuous - Continuous RF Signal (Optional)
   * <p>
   * Whether pulse-to-pulse RF variations are Discrete or Continuous. Discrete
   * uses a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFContinuous", required = false)
  private TString rfContinuous;
  /**
   * US:RFFreqMax - Maximum RF Frequency (Optional)
   * <p>
   * The typical highest RF value observed on a single intercept.
   * <p>
   * [XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than
   * US:RFFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFFreqMax", required = false)
  private FreqM rfFreqMax;
  /**
   * US:RFFreqMin - Minimum RF Frequency (Optional)
   * <p>
   * The typical lowest RF value observed on a single intercept.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFFreqMin", required = false)
  private FreqM rfFreqMin;
  /**
   * US:RFMean - RF Mean (Optional)
   * <p>
   * The average RF of a signal which changes RFs on a non-patterned basis.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFMean", required = false)
  private FreqM rfMean;
  /**
   * US:RFMedian - RF Median (Optional)
   * <p>
   * The most probable RF values.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFMedian", required = false)
  private FreqM rfMedian;
  /**
   * US:RFPatternPeriod - RF Pattern Period (Optional)
   * <p>
   * The duration of one cycle of the pattern for patterned RF variations.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFPatternPeriod", required = false)
  private microsecs rfPatternPeriod;
  /**
   * In Data Item RFPatternType (US), Indicate whether RF is unmodulated or
   * pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFPatternType", required = false)
  private TString rfPatternType;
  /**
   * US:RFRestFreq - RF Rest Freq (Optional)
   * <p>
   * The observed carrier or rest frequency when the modulation is off. Applies
   * mostly to Electronic Attack (EA) signals.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFRestFreq", required = false)
  private FreqM rfRestFreq;
  /**
   * US:RFSequenceDesc - RF Sequence Description (Optional)
   * <p>
   * A free text description of the RF Sequence.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFSequenceDesc", required = false)
  private S500 rfSequenceDesc;
  /**
   * US:RFSlotDuration - RF Slot Duration (Optional)
   * <p>
   * The duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFSlotDuration", required = false)
  private microsecs rfSlotDuration;
  /**
   * US:RFFreqTolerance - RF Frequency Tolerance (Optional)
   * <p>
   * The drift in Hz or in ppm using the formula: Frequency tolerance (ppm) =
   * Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm) in
   * FreqToleranceUnit.
   * <p>
   * Format is UN(18,6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFFreqTolerance", required = false)
  private UN18_6 rfFreqTolerance;
  /**
   * US:RFFreqToleranceUnit - Frequency Tolerance Units (Optional)
   * <p>
   * The units in which the Frequency Tolerance is expressed.
   * <p>
   * Format is L:CFO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFFreqToleranceUnit", required = false)
  private TString rfFreqToleranceUnit;
  /**
   * In Data Item:RFFreqToleranceInterval (US), enter the time interval over
   * which the RF stability measurements were taken.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFFreqToleranceInterval", required = false)
  private microsecs rfFreqToleranceInterval;
  /**
   * US:RFStandardDeviation - RF Standard Deviation (Optional)
   * <p>
   * The standard deviation of the data set used to calculate RF Mean.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFStandardDeviation", required = false)
  private FreqM rfStandardDeviation;
  /**
   * US:RFTuningStep - RF Tuning Step (Optional)
   * <p>
   * The separation between the mean RF values of adjacent RFs in signal with
   * discrete RF channels.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RFTuningStep", required = false)
  private FreqM rfTuningStep;
  /**
   * US:RFTuningStep - RF Tuning Step (Optional)
   * <p>
   * The separation between the mean RF values of adjacent RFs in signal with
   * discrete RF channels.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TuningStep", required = false)
  private FreqM tuningStep;
  /**
   * US:ObservedRFValues (Optional)
   * <p>
   * ObservedRFValues (US) contains details of actual RF observations.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedRFValues")
  private Set<ObservedRFValues> observedRFValues;

  /**
   * Get the chip rate. Pertains mostly to spread spectrum..
   * <p>
   * @return a {@link MChips} instance
   * @since 3.1.0
   */
  public MChips getChipRate() {
    return chipRate;
  }

  /**
   * Set the chip rate. Pertains mostly to spread spectrum..
   * <p>
   * @param value a {@link MChips} instance
   * @since 3.1.0
   */
  public void setChipRate(MChips value) {
    this.chipRate = value;
  }

  /**
   * Determine if the ChipRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChipRate() {
    return (this.chipRate != null ? this.chipRate.isSetValue() : false);
  }

  /**
   * Get the dwell time at any RF when the RF dwells at particular values for
   * more than one pulse in a row..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getDwellTime() {
    return dwellTime;
  }

  /**
   * Set the dwell time at any RF when the RF dwells at particular values for
   * more than one pulse in a row..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setDwellTime(microsecs value) {
    this.dwellTime = value;
  }

  /**
   * Determine if the DwellTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDwellTime() {
    return (this.dwellTime != null ? this.dwellTime.isSetValue() : false);
  }

  /**
   * Get the upper end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMax() {
    return freqMax;
  }

  /**
   * Set the upper end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than
   * US:FreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMax(FreqM value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of RF values that represent 100% of observed
   * signals..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Set the lower end of the range of RF values that represent 100% of observed
   * signals..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setFreqMin(FreqM value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the RF band between carriers which is not used. Pertains mostly to
   * spread spectrum..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getGuardBand() {
    return guardBand;
  }

  /**
   * Set the RF band between carriers which is not used. Pertains mostly to
   * spread spectrum..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setGuardBand(FreqM value) {
    this.guardBand = value;
  }

  /**
   * Determine if the GuardBand is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGuardBand() {
    return (this.guardBand != null ? this.guardBand.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 3 dB points (min).
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getInstantRFBW03() {
    return instantRFBW03;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 3 dB points (min).
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setInstantRFBW03(FreqM value) {
    this.instantRFBW03 = value;
  }

  /**
   * Determine if the InstantRFBW03 is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW03() {
    return (this.instantRFBW03 != null ? this.instantRFBW03.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 6 dB points (min).
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getInstantRFBW06() {
    return instantRFBW06;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 6 dB points (min).
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setInstantRFBW06(FreqM value) {
    this.instantRFBW06 = value;
  }

  /**
   * Determine if the InstantRFBW06 is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW06() {
    return (this.instantRFBW06 != null ? this.instantRFBW06.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 10 dB points (min).
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getInstantRFBW10() {
    return instantRFBW10;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 10 dB points (min).
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setInstantRFBW10(FreqM value) {
    this.instantRFBW10 = value;
  }

  /**
   * Determine if the InstantRFBW10 is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW10() {
    return (this.instantRFBW10 != null ? this.instantRFBW10.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 20 dB points (min).
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getInstantRFBW20() {
    return instantRFBW20;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 20 dB points (min).
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setInstantRFBW20(FreqM value) {
    this.instantRFBW20 = value;
  }

  /**
   * Determine if the InstantRFBW20 is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW20() {
    return (this.instantRFBW20 != null ? this.instantRFBW20.isSetValue() : false);
  }

  /**
   * Get the number of channels into which the RF range of the emitter is
   * divided..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumRFChannels() {
    return numRFChannels;
  }

  /**
   * Set the number of channels into which the RF range of the emitter is
   * divided..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumRFChannels(UN6 value) {
    this.numRFChannels = value;
  }

  /**
   * Determine if the NumRFChannels is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRFChannels() {
    return (this.numRFChannels != null ? this.numRFChannels.isSetValue() : false);
  }

  /**
   * Get the number of discrete RFs (channels) a multiple RF signal contains..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumRFElements() {
    return numRFElements;
  }

  /**
   * Set the number of discrete RFs (channels) a multiple RF signal contains..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumRFElements(UN6 value) {
    this.numRFElements = value;
  }

  /**
   * Determine if the NumRFElements is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRFElements() {
    return (this.numRFElements != null ? this.numRFElements.isSetValue() : false);
  }

  /**
   * Get the number of RF values in a signal RF sequence before it repeats..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumRFPositions() {
    return numRFPositions;
  }

  /**
   * Set the number of RF values in a signal RF sequence before it repeats..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumRFPositions(UN6 value) {
    this.numRFPositions = value;
  }

  /**
   * Determine if the NumRFPositions is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRFPositions() {
    return (this.numRFPositions != null ? this.numRFPositions.isSetValue() : false);
  }

  /**
   * Get The number of frequencies simultaneously used by the emitter..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumRFSimultaneous() {
    return numRFSimultaneous;
  }

  /**
   * Set The number of frequencies simultaneously used by the emitter..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumRFSimultaneous(UN6 value) {
    this.numRFSimultaneous = value;
  }

  /**
   * Determine if the NumRFSimultaneous is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRFSimultaneous() {
    return (this.numRFSimultaneous != null ? this.numRFSimultaneous.isSetValue() : false);
  }

  /**
   * Get the delta (aka. separation) from the signals lowest-min RF value to its
   * highest-max RF value; only pertains to signals which have RF changes
   * between pulses or groups of pulses (aka. RF agile signals) or signals which
   * use a changing RF continuous waveform (CW); e.g., a CW signal with a
   * sweeping RF. .
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getOperationalRFBW() {
    return operationalRFBW;
  }

  /**
   * Set the delta (aka. separation) from the signals lowest-min RF value to its
   * highest-max RF value; only pertains to signals which have RF changes
   * between pulses or groups of pulses (aka. RF agile signals) or signals which
   * use a changing RF continuous waveform (CW); e.g., a CW signal with a
   * sweeping RF. .
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setOperationalRFBW(FreqM value) {
    this.operationalRFBW = value;
  }

  /**
   * Determine if the OperationalRFBW is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOperationalRFBW() {
    return (this.operationalRFBW != null ? this.operationalRFBW.isSetValue() : false);
  }

  /**
   * Get the condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency).
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getRFAdaptiveDriver() {
    return rfAdaptiveDriver;
  }

  /**
   * Set the condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency).
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setRFAdaptiveDriver(S500 value) {
    this.rfAdaptiveDriver = value;
  }

  /**
   * Determine if the RFAdaptiveDriver is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFAdaptiveDriver() {
    return (this.rfAdaptiveDriver != null ? this.rfAdaptiveDriver.isSetValue() : false);
  }

  /**
   * Get In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for
   * Adaptive RF variations..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getRFAdaptiveRule() {
    return rfAdaptiveRule;
  }

  /**
   * Set In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for
   * Adaptive RF variations..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setRFAdaptiveRule(S500 value) {
    this.rfAdaptiveRule = value;
  }

  /**
   * Determine if the RFAdaptiveRule is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFAdaptiveRule() {
    return (this.rfAdaptiveRule != null ? this.rfAdaptiveRule.isSetValue() : false);
  }

  /**
   * Get the frequency divisor common to all RF separations (not necessarily to
   * all RF) RF crystal is not always the same as the RF channelization (min)..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFBasicClockPeriod() {
    return rfBasicClockPeriod;
  }

  /**
   * Set the frequency divisor common to all RF separations (not necessarily to
   * all RF) RF crystal is not always the same as the RF channelization (min)..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFBasicClockPeriod(FreqM value) {
    this.rfBasicClockPeriod = value;
  }

  /**
   * Determine if the RFBasicClockPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFBasicClockPeriod() {
    return (this.rfBasicClockPeriod != null ? this.rfBasicClockPeriod.isSetValue() : false);
  }

  /**
   * Get the RF change per unit of time, measured over a significant portion of
   * the waveform. Applies to Continuous RF variations..
   * <p>
   * @return a {@link RFChgRate} instance
   * @since 3.1.0
   */
  public RFChgRate getRFChangeRate() {
    return rfChangeRate;
  }

  /**
   * Set the RF change per unit of time, measured over a significant portion of
   * the waveform. Applies to Continuous RF variations..
   * <p>
   * @param value a {@link RFChgRate} instance
   * @since 3.1.0
   */
  public void setRFChangeRate(RFChgRate value) {
    this.rfChangeRate = value;
  }

  /**
   * Determine if the RFChangeRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFChangeRate() {
    return (this.rfChangeRate != null ? this.rfChangeRate.isSetValue() : false);
  }

  /**
   * Get the maximum RF channel values.
   * <p>
   * [XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than
   * US:RFChannelFreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFChannelFreqMax() {
    return rfChannelFreqMax;
  }

  /**
   * Set the maximum RF channel values.
   * <p>
   * [XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than
   * US:RFChannelFreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFChannelFreqMax(FreqM value) {
    this.rfChannelFreqMax = value;
  }

  /**
   * Determine if the RFChannelFreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFChannelFreqMax() {
    return (this.rfChannelFreqMax != null ? this.rfChannelFreqMax.isSetValue() : false);
  }

  /**
   * Get the minimum RF channel values..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFChannelFreqMin() {
    return rfChannelFreqMin;
  }

  /**
   * Set the minimum RF channel values..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFChannelFreqMin(FreqM value) {
    this.rfChannelFreqMin = value;
  }

  /**
   * Determine if the RFChannelFreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFChannelFreqMin() {
    return (this.rfChannelFreqMin != null ? this.rfChannelFreqMin.isSetValue() : false);
  }

  /**
   * Get In Data Item RFCoherent (US), indicate if the observed RF signal is
   * coherent, non-coherent, or unknown..
   * <p>
   * @return the RFCoherent value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRFCoherent() {
    return rfCoherent;
  }

  /**
   * Set In Data Item RFCoherent (US), indicate if the observed RF signal is
   * coherent, non-coherent, or unknown..
   * <p>
   * @param value the RFCoherent value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRFCoherent(TString value) {
    this.rfCoherent = value;
  }

  /**
   * Determine if the RFCoherent is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFCoherent() {
    return (this.rfCoherent != null ? this.rfCoherent.isSetValue() : false);
  }

  /**
   * Get whether pulse-to-pulse RF variations are Discrete or Continuous.
   * Discrete uses a finite number of fixed values separated by ranges of unused
   * values. Continuous potentially uses an infinite number of values within one
   * or more ranges..
   * <p>
   * @return the RFContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRFContinuous() {
    return rfContinuous;
  }

  /**
   * Set whether pulse-to-pulse RF variations are Discrete or Continuous.
   * Discrete uses a finite number of fixed values separated by ranges of unused
   * values. Continuous potentially uses an infinite number of values within one
   * or more ranges..
   * <p>
   * @param value the RFContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRFContinuous(TString value) {
    this.rfContinuous = value;
  }

  /**
   * Determine if the RFContinuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFContinuous() {
    return (this.rfContinuous != null ? this.rfContinuous.isSetValue() : false);
  }

  /**
   * Get the typical highest RF value observed on a single intercept.
   * <p>
   * [XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than
   * US:RFFreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFFreqMax() {
    return rfFreqMax;
  }

  /**
   * Set the typical highest RF value observed on a single intercept.
   * <p>
   * [XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than
   * US:RFFreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFFreqMax(FreqM value) {
    this.rfFreqMax = value;
  }

  /**
   * Determine if the RFFreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqMax() {
    return (this.rfFreqMax != null ? this.rfFreqMax.isSetValue() : false);
  }

  /**
   * Get the typical lowest RF value observed on a single intercept..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFFreqMin() {
    return rfFreqMin;
  }

  /**
   * Set the typical lowest RF value observed on a single intercept..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFFreqMin(FreqM value) {
    this.rfFreqMin = value;
  }

  /**
   * Determine if the RFFreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqMin() {
    return (this.rfFreqMin != null ? this.rfFreqMin.isSetValue() : false);
  }

  /**
   * Get the average RF of a signal which changes RFs on a non-patterned basis..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFMean() {
    return rfMean;
  }

  /**
   * Set the average RF of a signal which changes RFs on a non-patterned basis..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFMean(FreqM value) {
    this.rfMean = value;
  }

  /**
   * Determine if the RFMean is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFMean() {
    return (this.rfMean != null ? this.rfMean.isSetValue() : false);
  }

  /**
   * Get the most probable RF values..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFMedian() {
    return rfMedian;
  }

  /**
   * Set the most probable RF values..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFMedian(FreqM value) {
    this.rfMedian = value;
  }

  /**
   * Determine if the RFMedian is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFMedian() {
    return (this.rfMedian != null ? this.rfMedian.isSetValue() : false);
  }

  /**
   * Get the duration of one cycle of the pattern for patterned RF variations..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getRFPatternPeriod() {
    return rfPatternPeriod;
  }

  /**
   * Set the duration of one cycle of the pattern for patterned RF variations..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setRFPatternPeriod(microsecs value) {
    this.rfPatternPeriod = value;
  }

  /**
   * Determine if the RFPatternPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFPatternPeriod() {
    return (this.rfPatternPeriod != null ? this.rfPatternPeriod.isSetValue() : false);
  }

  /**
   * Get In Data Item RFPatternType (US), Indicate whether RF is unmodulated or
   * pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive..
   * <p>
   * @return the RFPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRFPatternType() {
    return rfPatternType;
  }

  /**
   * Set In Data Item RFPatternType (US), Indicate whether RF is unmodulated or
   * pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive..
   * <p>
   * @param value the RFPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRFPatternType(TString value) {
    this.rfPatternType = value;
  }

  /**
   * Determine if the RFPatternType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFPatternType() {
    return (this.rfPatternType != null ? this.rfPatternType.isSetValue() : false);
  }

  /**
   * Get the observed carrier or rest frequency when the modulation is off.
   * Applies mostly to Electronic Attack (EA) signals..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFRestFreq() {
    return rfRestFreq;
  }

  /**
   * Set the observed carrier or rest frequency when the modulation is off.
   * Applies mostly to Electronic Attack (EA) signals..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFRestFreq(FreqM value) {
    this.rfRestFreq = value;
  }

  /**
   * Determine if the RFRestFreq is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFRestFreq() {
    return (this.rfRestFreq != null ? this.rfRestFreq.isSetValue() : false);
  }

  /**
   * Get a free text description of the RF Sequence..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getRFSequenceDesc() {
    return rfSequenceDesc;
  }

  /**
   * Set a free text description of the RF Sequence..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setRFSequenceDesc(S500 value) {
    this.rfSequenceDesc = value;
  }

  /**
   * Determine if the RFSequenceDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSequenceDesc() {
    return (this.rfSequenceDesc != null ? this.rfSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getRFSlotDuration() {
    return rfSlotDuration;
  }

  /**
   * Set the duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setRFSlotDuration(microsecs value) {
    this.rfSlotDuration = value;
  }

  /**
   * Determine if the RFSlotDuration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSlotDuration() {
    return (this.rfSlotDuration != null ? this.rfSlotDuration.isSetValue() : false);
  }

  /**
   * Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm)
   * in FreqToleranceUnit..
   * <p>
   * @return a {@link UN18_6} instance
   * @since 3.1.0
   */
  public UN18_6 getRFFreqTolerance() {
    return rfFreqTolerance;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm)
   * in FreqToleranceUnit..
   * <p>
   * @param value a {@link UN18_6} instance
   * @since 3.1.0
   */
  public void setRFFreqTolerance(UN18_6 value) {
    this.rfFreqTolerance = value;
  }

  /**
   * Determine if the RFFreqTolerance is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqTolerance() {
    return (this.rfFreqTolerance != null ? this.rfFreqTolerance.isSetValue() : false);
  }

  /**
   * Get the units in which the Frequency Tolerance is expressed..
   * <p>
   * @return the RFFreqToleranceUnit value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRFFreqToleranceUnit() {
    return rfFreqToleranceUnit;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed..
   * <p>
   * @param value the RFFreqToleranceUnit value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRFFreqToleranceUnit(TString value) {
    this.rfFreqToleranceUnit = value;
  }

  /**
   * Determine if the RFFreqToleranceUnit is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqToleranceUnit() {
    return (this.rfFreqToleranceUnit != null ? this.rfFreqToleranceUnit.isSetValue() : false);
  }

  /**
   * Get In Data Item:RFFreqToleranceInterval (US), enter the time interval over
   * which the RF stability measurements were taken..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getRFFreqToleranceInterval() {
    return rfFreqToleranceInterval;
  }

  /**
   * Set In Data Item:RFFreqToleranceInterval (US), enter the time interval over
   * which the RF stability measurements were taken..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setRFFreqToleranceInterval(microsecs value) {
    this.rfFreqToleranceInterval = value;
  }

  /**
   * Determine if the RFFreqToleranceInterval is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqToleranceInterval() {
    return (this.rfFreqToleranceInterval != null ? this.rfFreqToleranceInterval.isSetValue() : false);
  }

  /**
   * Get the standard deviation of the data set used to calculate RF Mean..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFStandardDeviation() {
    return rfStandardDeviation;
  }

  /**
   * Set the standard deviation of the data set used to calculate RF Mean..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFStandardDeviation(FreqM value) {
    this.rfStandardDeviation = value;
  }

  /**
   * Determine if the RFStandardDeviation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFStandardDeviation() {
    return (this.rfStandardDeviation != null ? this.rfStandardDeviation.isSetValue() : false);
  }

  /**
   * Get the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getRFTuningStep() {
    return rfTuningStep;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setRFTuningStep(FreqM value) {
    this.rfTuningStep = value;
  }

  /**
   * Determine if the RFTuningStep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFTuningStep() {
    return (this.rfTuningStep != null ? this.rfTuningStep.isSetValue() : false);
  }

  /**
   * Get the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setTuningStep(FreqM value) {
    this.tuningStep = value;
  }

  /**
   * Determine if the TuningStep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTuningStep() {
    return (this.tuningStep != null ? this.tuningStep.isSetValue() : false);
  }

  /**
   * Get the US:ObservedRFValues
   * <p>
   * Complex element ObservedRFValues (US) contains details of actual RF
   * observations..
   * <p>
   * @return a {@link ObservedRFValues} instance
   * @since 3.1.0
   */
  public Set<ObservedRFValues> getObservedRFValues() {
    if (observedRFValues == null) {
      observedRFValues = new HashSet<>();
    }
    return this.observedRFValues;
  }

  /**
   * Determine if the ObservedRFValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedRFValues() {
    return ((this.observedRFValues != null) && (!this.observedRFValues.isEmpty()));
  }

  /**
   * Clear the ObservedRFValues field. This sets the field to null.
   */
  public void unsetObservedRFValues() {
    this.observedRFValues = null;
  }

  /**
   * Set the chip rate. Pertains mostly to spread spectrum.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withChipRate(Double value) {
    setChipRate(new MChips(value));
    return this;
  }

  /**
   * Set the dwell time at any RF when the RF dwells at particular values for
   * more than one pulse in a row.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withDwellTime(Double value) {
    setDwellTime(new microsecs(value));
    return this;
  }

  /**
   * Set the upper end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the lower end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the RF band between carriers which is not used. Pertains mostly to
   * spread spectrum.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withGuardBand(Double value) {
    setGuardBand(new FreqM(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 3 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withInstantRFBW03(Double value) {
    setInstantRFBW03(new FreqM(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 6 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withInstantRFBW06(Double value) {
    setInstantRFBW06(new FreqM(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 10 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withInstantRFBW10(Double value) {
    setInstantRFBW10(new FreqM(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 20 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withInstantRFBW20(Double value) {
    setInstantRFBW20(new FreqM(value));
    return this;
  }

  /**
   * Set the number of channels into which the RF range of the emitter is
   * divided.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withNumRFChannels(Integer value) {
    setNumRFChannels(new UN6(value));
    return this;
  }

  /**
   * Set the number of discrete RFs (channels) a multiple RF signal contains.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withNumRFElements(Integer value) {
    setNumRFElements(new UN6(value));
    return this;
  }

  /**
   * Set the number of RF values in a signal RF sequence before it repeats.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withNumRFPositions(Integer value) {
    setNumRFPositions(new UN6(value));
    return this;
  }

  /**
   * Set The number of frequencies simultaneously used by the emitter.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withNumRFSimultaneous(Integer value) {
    setNumRFSimultaneous(new UN6(value));
    return this;
  }

  /**
   * Set the delta (aka. separation) from the signals lowest-min RF value to its
   * highest-max RF value; only pertains to signals which have RF changes
   * between pulses or groups of pulses (aka. RF agile signals) or signals which
   * use a changing RF continuous waveform (CW); e.g., a CW signal with a
   * sweeping RF.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withOperationalRFBW(Double value) {
    setOperationalRFBW(new FreqM(value));
    return this;
  }

  /**
   * Set the condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency)
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFAdaptiveDriver(String value) {
    setRFAdaptiveDriver(new S500(value));
    return this;
  }

  /**
   * Set In Data Item RFAdaptiveRule (US), indicate how the RF is chosen for
   * Adaptive RF variations.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFAdaptiveRule(String value) {
    setRFAdaptiveRule(new S500(value));
    return this;
  }

  /**
   * Set the frequency divisor common to all RF separations (not necessarily to
   * all RF) RF crystal is not always the same as the RF channelization (min).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFBasicClockPeriod(Double value) {
    setRFBasicClockPeriod(new FreqM(value));
    return this;
  }

  /**
   * Set the RF change per unit of time, measured over a significant portion of
   * the waveform. Applies to Continuous RF variations.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFChangeRate(Double value) {
    setRFChangeRate(new RFChgRate(value));
    return this;
  }

  /**
   * Set the maximum RF channel values.
   * <p>
   * [XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than
   * US:RFChannelFreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFChannelFreqMax(Double value) {
    setRFChannelFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the minimum RF channel values.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFChannelFreqMin(Double value) {
    setRFChannelFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set In Data Item RFCoherent (US), indicate if the observed RF signal is
   * coherent, non-coherent, or unknown.
   * <p>
   * @param value An instances of type {@link ListUSY}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFCoherent(ListUSY value) {
    setRFCoherent(new TString(value.value()));
    return this;
  }

  /**
   * Set whether pulse-to-pulse RF variations are Discrete or Continuous.
   * Discrete uses a finite number of fixed values separated by ranges of unused
   * values. Continuous potentially uses an infinite number of values within one
   * or more ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFContinuous(ListCBO value) {
    setRFContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set the typical highest RF value observed on a single intercept.
   * <p>
   * [XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than
   * US:RFFreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFFreqMax(Double value) {
    setRFFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the typical lowest RF value observed on a single intercept.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFFreqMin(Double value) {
    setRFFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the average RF of a signal which changes RFs on a non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFMean(Double value) {
    setRFMean(new FreqM(value));
    return this;
  }

  /**
   * Set the most probable RF values.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFMedian(Double value) {
    setRFMedian(new FreqM(value));
    return this;
  }

  /**
   * Set the duration of one cycle of the pattern for patterned RF variations.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFPatternPeriod(Double value) {
    setRFPatternPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item RFPatternType (US), Indicate whether RF is unmodulated or
   * pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFPatternType(ListUS7 value) {
    setRFPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set the observed carrier or rest frequency when the modulation is off.
   * Applies mostly to Electronic Attack (EA) signals.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFRestFreq(Double value) {
    setRFRestFreq(new FreqM(value));
    return this;
  }

  /**
   * Set a free text description of the RF Sequence.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFSequenceDesc(String value) {
    setRFSequenceDesc(new S500(value));
    return this;
  }

  /**
   * Set the duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFSlotDuration(Double value) {
    setRFSlotDuration(new microsecs(value));
    return this;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFFreqTolerance(Double value) {
    setRFFreqTolerance(new UN18_6(value));
    return this;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value An instances of type {@link ListCFO}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFFreqToleranceUnit(ListCFO value) {
    setRFFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item:RFFreqToleranceInterval (US), enter the time interval over
   * which the RF stability measurements were taken.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFFreqToleranceInterval(Double value) {
    setRFFreqToleranceInterval(new microsecs(value));
    return this;
  }

  /**
   * Set the standard deviation of the data set used to calculate RF Mean.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFStandardDeviation(Double value) {
    setRFStandardDeviation(new FreqM(value));
    return this;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withRFTuningStep(Double value) {
    setRFTuningStep(new FreqM(value));
    return this;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withTuningStep(Double value) {
    setTuningStep(new FreqM(value));
    return this;
  }

  /**
   * Set the US:ObservedRFValues
   * <p>
   * Complex element ObservedRFValues (US) contains details of actual RF
   * observations.
   * <p>
   * @param values One or more instances of type {@link ObservedRFValues...}.
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withObservedRFValues(ObservedRFValues... values) {
    if (values != null) {
      getObservedRFValues().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedRFValues
   * <p>
   * Complex element ObservedRFValues (US) contains details of actual RF
   * observations.
   * <p>
   * @param values A collection of {@link ObservedRFValues} instances
   * @return The current ObservedRFAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedRFAnalysis withObservedRFValues(Collection<ObservedRFValues> values) {
    if (values != null) {
      getObservedRFValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedRFAnalysis instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  ObservedRFAnalysis {"
           + (chipRate != null ? " chipRate [" + chipRate + "]" : "")
           + (dwellTime != null ? " dwellTime [" + dwellTime + "]" : "")
           + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
           + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
           + (guardBand != null ? " guardBand [" + guardBand + "]" : "")
           + (instantRFBW03 != null ? " instantRFBW03 [" + instantRFBW03 + "]" : "")
           + (instantRFBW06 != null ? " instantRFBW06 [" + instantRFBW06 + "]" : "")
           + (instantRFBW10 != null ? " instantRFBW10 [" + instantRFBW10 + "]" : "")
           + (instantRFBW20 != null ? " instantRFBW20 [" + instantRFBW20 + "]" : "")
           + (numRFChannels != null ? " numRFChannels [" + numRFChannels + "]" : "")
           + (numRFElements != null ? " numRFElements [" + numRFElements + "]" : "")
           + (numRFPositions != null ? " numRFPositions [" + numRFPositions + "]" : "")
           + (numRFSimultaneous != null ? " numRFSimultaneous [" + numRFSimultaneous + "]" : "")
           + (observedRFValues != null ? " observedRFValues [" + observedRFValues + "]" : "")
           + (operationalRFBW != null ? " operationalRFBW [" + operationalRFBW + "]" : "")
           + (rfAdaptiveDriver != null ? " rfAdaptiveDriver [" + rfAdaptiveDriver + "]" : "")
           + (rfAdaptiveRule != null ? " rfAdaptiveRule [" + rfAdaptiveRule + "]" : "")
           + (rfBasicClockPeriod != null ? " rfBasicClockPeriod [" + rfBasicClockPeriod + "]" : "")
           + (rfChangeRate != null ? " rfChangeRate [" + rfChangeRate + "]" : "")
           + (rfChannelFreqMax != null ? " rfChannelFreqMax [" + rfChannelFreqMax + "]" : "")
           + (rfChannelFreqMin != null ? " rfChannelFreqMin [" + rfChannelFreqMin + "]" : "")
           + (rfCoherent != null ? " rfCoherent [" + rfCoherent + "]" : "")
           + (rfContinuous != null ? " rfContinuous [" + rfContinuous + "]" : "")
           + (rfFreqMax != null ? " rfFreqMax [" + rfFreqMax + "]" : "")
           + (rfFreqMin != null ? " rfFreqMin [" + rfFreqMin + "]" : "")
           + (rfFreqTolerance != null ? " rfFreqTolerance [" + rfFreqTolerance + "]" : "")
           + (rfFreqToleranceInterval != null ? " rfFreqToleranceInterval [" + rfFreqToleranceInterval + "]" : "")
           + (rfFreqToleranceUnit != null ? " rfFreqToleranceUnit [" + rfFreqToleranceUnit + "]" : "")
           + (rfMean != null ? " rfMean [" + rfMean + "]" : "")
           + (rfMedian != null ? " rfMedian [" + rfMedian + "]" : "")
           + (rfPatternPeriod != null ? " rfPatternPeriod [" + rfPatternPeriod + "]" : "")
           + (rfPatternType != null ? " rfPatternType [" + rfPatternType + "]" : "")
           + (rfRestFreq != null ? " rfRestFreq [" + rfRestFreq + "]" : "")
           + (rfSequenceDesc != null ? " rfSequenceDesc [" + rfSequenceDesc + "]" : "")
           + (rfSlotDuration != null ? " rfSlotDuration [" + rfSlotDuration + "]" : "")
           + (rfStandardDeviation != null ? " rfStandardDeviation [" + rfStandardDeviation + "]" : "")
           + (rfTuningStep != null ? " rfTuningStep [" + rfTuningStep + "]" : "")
           + (tuningStep != null ? " tuningStep [" + tuningStep + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedRFAnalysis} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
