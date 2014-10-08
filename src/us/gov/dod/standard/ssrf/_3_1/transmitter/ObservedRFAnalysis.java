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

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "ChipRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMCHIPS.class)
  private TDecimal chipRate;
  /**
   * US:DwellTime - Dwell Time (Optional)
   * <p>
   * The dwell time at any RF when the RF dwells at particular values for more
   * than one pulse in a row.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "DwellTime", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal dwellTime;
  /**
   * US:FreqMax - Maximum Frequency (Optional)
   * <p>
   * The upper end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * US:FreqMin - Minimum Frequency (Optional)
   * <p>
   * The lower end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * US:GuardBand - Guard Band (Optional)
   * <p>
   * The RF band between carriers which is not used. Pertains mostly to spread
   * spectrum.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "GuardBand", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal guardBand;
  /**
   * US:InstantRFBW03 - Instant RF BW 03 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 3
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "InstantRFBW03", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal instantRFBW03;
  /**
   * US:InstantRFBW06 - Instant RF BW 06 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 6
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "InstantRFBW06", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal instantRFBW06;
  /**
   * US:InstantRFBW10 - Instant RF BW 10 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 10
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "InstantRFBW10", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal instantRFBW10;
  /**
   * US:InstantRFBW20 - Instant RF BW 20 (Optional)
   * <p>
   * The transmitter pulse bandwidth (burst or instantaneous) measured at the 20
   * dB points (min)
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "InstantRFBW20", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal instantRFBW20;
  /**
   * US:NumRFChannels - Num RF Channels (Optional)
   * <p>
   * The number of channels into which the RF range of the emitter is divided.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumRFChannels", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numRFChannels;
  /**
   * US:NumRFElements - Num RF Elements (Optional)
   * <p>
   * The number of discrete RFs (channels) a multiple RF signal contains.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumRFElements", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numRFElements;
  /**
   * US:NumRFPositions - Num RF Positions (Optional)
   * <p>
   * The number of RF values in a signal RF sequence before it repeats.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumRFPositions", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numRFPositions;
  /**
   * US:NumRFSimultaneous - Num RF Simultaneous (Optional)
   * <p>
   * The number of frequencies simultaneously used by the emitter.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumRFSimultaneous", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numRFSimultaneous;
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
   */
  @XmlElement(name = "OperationalRFBW", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal operationalRFBW;
  /**
   * US:RFAdaptiveDriver - RF Adaptive Driver (Optional)
   * <p>
   * The condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency)
   * <p>
   * Format is S500
   */
  @XmlElement(name = "RFAdaptiveDriver", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString rfAdaptiveDriver;
  /**
   * RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF
   * variations.
   */
  @XmlElement(name = "RFAdaptiveRule", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString rfAdaptiveRule;
  /**
   * US:RFBasicClockPeriod - RF Basic Clock Period (Optional)
   * <p>
   * The frequency divisor common to all RF separations (not necessarily to all
   * RF) RF crystal is not always the same as the RF channelization (min).
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFBasicClockPeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfBasicClockPeriod;
  /**
   * US:RFChangeRate - RF Change Rate (Optional)
   * <p>
   * The RF change per unit of time, measured over a significant portion of the
   * waveform. Applies to Continuous RF variations.
   * <p>
   * Format is UN(16,9) (MHz/sec)
   */
  @XmlElement(name = "RFChangeRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterRFCHGRATE.class)
  private TDecimal rfChangeRate;
  /**
   * US:RFChannelFreqMax - Maximum RF Channel Frequency (Optional)
   * <p>
   * The maximum RF channel values.
   * <p>
   * [XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than
   * US:RFChannelFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFChannelFreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfChannelFreqMax;
  /**
   * US:RFChannelFreqMin - RF Channel Freq Min (Optional)
   * <p>
   * The minimum RF channel values.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFChannelFreqMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfChannelFreqMin;
  /**
   * RFCoherent (US), indicate if the observed RF signal is coherent,
   * non-coherent, or unknown.
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
   */
  @XmlElement(name = "RFFreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfFreqMax;
  /**
   * US:RFFreqMin - Minimum RF Frequency (Optional)
   * <p>
   * The typical lowest RF value observed on a single intercept.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFFreqMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfFreqMin;
  /**
   * US:RFMean - RF Mean (Optional)
   * <p>
   * The average RF of a signal which changes RFs on a non-patterned basis.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFMean", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfMean;
  /**
   * US:RFMedian - RF Median (Optional)
   * <p>
   * The most probable RF values.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFMedian", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfMedian;
  /**
   * US:RFPatternPeriod - RF Pattern Period (Optional)
   * <p>
   * The duration of one cycle of the pattern for patterned RF variations.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "RFPatternPeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal rfPatternPeriod;
  /**
   * RFPatternType (US), Indicate whether RF is unmodulated or pulse-to-pulse RF
   * variations are Patterned, Non-Patterned, or Adaptive.
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
   */
  @XmlElement(name = "RFRestFreq", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfRestFreq;
  /**
   * US:RFSequenceDesc - RF Sequence Description (Optional)
   * <p>
   * A free text description of the RF Sequence.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "RFSequenceDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString rfSequenceDesc;
  /**
   * US:RFSlotDuration - RF Slot Duration (Optional)
   * <p>
   * The duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "RFSlotDuration", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal rfSlotDuration;
  /**
   * US:RFFreqTolerance - RF Frequency Tolerance (Optional)
   * <p>
   * The drift in Hz or in ppm using the formula: Frequency tolerance (ppm) =
   * Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm) in
   * FreqToleranceUnit.
   * <p>
   * Format is UN(18,6)
   */
  @XmlElement(name = "RFFreqTolerance", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUN18_6.class)
  private TDecimal rfFreqTolerance;
  /**
   * US:RFFreqToleranceUnit - Frequency Tolerance Units (Optional)
   * <p>
   * The units in which the Frequency Tolerance is expressed.
   * <p>
   * Format is L:CFO
   */
  @XmlElement(name = "RFFreqToleranceUnit", required = false)
  private TString rfFreqToleranceUnit;
  /**
   * In Data Item:RFFreqToleranceInterval (US) - The time interval over which
   * the RF stability measurements were taken.
   */
  @XmlElement(name = "RFFreqToleranceInterval", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal rfFreqToleranceInterval;
  /**
   * US:RFStandardDeviation - RF Standard Deviation (Optional)
   * <p>
   * The standard deviation of the data set used to calculate RF Mean.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFStandardDeviation", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfStandardDeviation;
  /**
   * US:RFTuningStep - RF Tuning Step (Optional)
   * <p>
   * The separation between the mean RF values of adjacent RFs in signal with
   * discrete RF channels.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "RFTuningStep", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal rfTuningStep;
  /**
   * US:RFTuningStep - RF Tuning Step (Optional)
   * <p>
   * The separation between the mean RF values of adjacent RFs in signal with
   * discrete RF channels.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "TuningStep", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  /**
   * US:ObservedRFValues (Optional)
   * <p>
   * ObservedRFValues (US) contains details of actual RF observations.
   */
  @XmlElement(name = "ObservedRFValues")
  private Set<ObservedRFValues> observedRFValues;

  /**
   * Get the chip rate. Pertains mostly to spread spectrum.
   * <p>
   * @return the ChipRate value in a {@link TDecimal} data type
   */
  public TDecimal getChipRate() {
    return chipRate;
  }

  /**
   * Set the chip rate. Pertains mostly to spread spectrum.
   * <p>
   * @param value the ChipRate value in a {@link TDecimal} data type
   */
  public void setChipRate(TDecimal value) {
    this.chipRate = value;
  }

  /**
   * Determine if the ChipRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChipRate() {
    return (this.chipRate != null ? this.chipRate.isSetValue() : false);
  }

  /**
   * Get the dwell time at any RF when the RF dwells at particular values for
   * more than one pulse in a row.
   * <p>
   * @return the DwellTime value in a {@link TDecimal} data type
   */
  public TDecimal getDwellTime() {
    return dwellTime;
  }

  /**
   * Set the dwell time at any RF when the RF dwells at particular values for
   * more than one pulse in a row.
   * <p>
   * @param value the DwellTime value in a {@link TDecimal} data type
   */
  public void setDwellTime(TDecimal value) {
    this.dwellTime = value;
  }

  /**
   * Determine if the DwellTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the upper end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the lower end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the RF band between carriers which is not used. Pertains mostly to
   * spread spectrum.
   * <p>
   * @return the GuardBand value in a {@link TDecimal} data type
   */
  public TDecimal getGuardBand() {
    return guardBand;
  }

  /**
   * Set the RF band between carriers which is not used. Pertains mostly to
   * spread spectrum.
   * <p>
   * @param value the GuardBand value in a {@link TDecimal} data type
   */
  public void setGuardBand(TDecimal value) {
    this.guardBand = value;
  }

  /**
   * Determine if the GuardBand is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGuardBand() {
    return (this.guardBand != null ? this.guardBand.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 3 dB points (min)
   * <p>
   * @return the InstantRFBW03 value in a {@link TDecimal} data type
   */
  public TDecimal getInstantRFBW03() {
    return instantRFBW03;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 3 dB points (min)
   * <p>
   * @param value the InstantRFBW03 value in a {@link TDecimal} data type
   */
  public void setInstantRFBW03(TDecimal value) {
    this.instantRFBW03 = value;
  }

  /**
   * Determine if the InstantRFBW03 is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW03() {
    return (this.instantRFBW03 != null ? this.instantRFBW03.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 6 dB points (min)
   * <p>
   * @return the InstantRFBW06 value in a {@link TDecimal} data type
   */
  public TDecimal getInstantRFBW06() {
    return instantRFBW06;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 6 dB points (min)
   * <p>
   * @param value the InstantRFBW06 value in a {@link TDecimal} data type
   */
  public void setInstantRFBW06(TDecimal value) {
    this.instantRFBW06 = value;
  }

  /**
   * Determine if the InstantRFBW06 is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW06() {
    return (this.instantRFBW06 != null ? this.instantRFBW06.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 10 dB points (min)
   * <p>
   * @return the InstantRFBW10 value in a {@link TDecimal} data type
   */
  public TDecimal getInstantRFBW10() {
    return instantRFBW10;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 10 dB points (min)
   * <p>
   * @param value the InstantRFBW10 value in a {@link TDecimal} data type
   */
  public void setInstantRFBW10(TDecimal value) {
    this.instantRFBW10 = value;
  }

  /**
   * Determine if the InstantRFBW10 is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW10() {
    return (this.instantRFBW10 != null ? this.instantRFBW10.isSetValue() : false);
  }

  /**
   * Get the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 20 dB points (min)
   * <p>
   * @return the InstantRFBW20 value in a {@link TDecimal} data type
   */
  public TDecimal getInstantRFBW20() {
    return instantRFBW20;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 20 dB points (min)
   * <p>
   * @param value the InstantRFBW20 value in a {@link TDecimal} data type
   */
  public void setInstantRFBW20(TDecimal value) {
    this.instantRFBW20 = value;
  }

  /**
   * Determine if the InstantRFBW20 is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetInstantRFBW20() {
    return (this.instantRFBW20 != null ? this.instantRFBW20.isSetValue() : false);
  }

  /**
   * Get the number of channels into which the RF range of the emitter is
   * divided.
   * <p>
   * @return the NumRFChannels value in a {@link TInteger} data type
   */
  public TInteger getNumRFChannels() {
    return numRFChannels;
  }

  /**
   * Set the number of channels into which the RF range of the emitter is
   * divided.
   * <p>
   * @param value the NumRFChannels value in a {@link TInteger} data type
   */
  public void setNumRFChannels(TInteger value) {
    this.numRFChannels = value;
  }

  /**
   * Determine if the NumRFChannels is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRFChannels() {
    return (this.numRFChannels != null ? this.numRFChannels.isSetValue() : false);
  }

  /**
   * Get the number of discrete RFs (channels) a multiple RF signal contains.
   * <p>
   * @return the NumRFElements value in a {@link TInteger} data type
   */
  public TInteger getNumRFElements() {
    return numRFElements;
  }

  /**
   * Set the number of discrete RFs (channels) a multiple RF signal contains.
   * <p>
   * @param value the NumRFElements value in a {@link TInteger} data type
   */
  public void setNumRFElements(TInteger value) {
    this.numRFElements = value;
  }

  /**
   * Determine if the NumRFElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRFElements() {
    return (this.numRFElements != null ? this.numRFElements.isSetValue() : false);
  }

  /**
   * Get the number of RF values in a signal RF sequence before it repeats.
   * <p>
   * @return the NumRFPositions value in a {@link TInteger} data type
   */
  public TInteger getNumRFPositions() {
    return numRFPositions;
  }

  /**
   * Set the number of RF values in a signal RF sequence before it repeats.
   * <p>
   * @param value the NumRFPositions value in a {@link TInteger} data type
   */
  public void setNumRFPositions(TInteger value) {
    this.numRFPositions = value;
  }

  /**
   * Determine if the NumRFPositions is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRFPositions() {
    return (this.numRFPositions != null ? this.numRFPositions.isSetValue() : false);
  }

  /**
   * Get The number of frequencies simultaneously used by the emitter.
   * <p>
   * @return the NumRFSimultaneous value in a {@link TInteger} data type
   */
  public TInteger getNumRFSimultaneous() {
    return numRFSimultaneous;
  }

  /**
   * Set The number of frequencies simultaneously used by the emitter.
   * <p>
   * @param value the NumRFSimultaneous value in a {@link TInteger} data type
   */
  public void setNumRFSimultaneous(TInteger value) {
    this.numRFSimultaneous = value;
  }

  /**
   * Determine if the NumRFSimultaneous is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
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
   * sweeping RF.
   * <p>
   * @return the OperationalRFBW value in a {@link TDecimal} data type
   */
  public TDecimal getOperationalRFBW() {
    return operationalRFBW;
  }

  /**
   * Set the delta (aka. separation) from the signals lowest-min RF value to its
   * highest-max RF value; only pertains to signals which have RF changes
   * between pulses or groups of pulses (aka. RF agile signals) or signals which
   * use a changing RF continuous waveform (CW); e.g., a CW signal with a
   * sweeping RF.
   * <p>
   * @param value the OperationalRFBW value in a {@link TDecimal} data type
   */
  public void setOperationalRFBW(TDecimal value) {
    this.operationalRFBW = value;
  }

  /**
   * Determine if the OperationalRFBW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOperationalRFBW() {
    return (this.operationalRFBW != null ? this.operationalRFBW.isSetValue() : false);
  }

  /**
   * Get the condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency)
   * <p>
   * @return the RFAdaptiveDriver value in a {@link TString} data type
   */
  public TString getRFAdaptiveDriver() {
    return rfAdaptiveDriver;
  }

  /**
   * Set the condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency)
   * <p>
   * @param value the RFAdaptiveDriver value in a {@link TString} data type
   */
  public void setRFAdaptiveDriver(TString value) {
    this.rfAdaptiveDriver = value;
  }

  /**
   * Determine if the RFAdaptiveDriver is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFAdaptiveDriver() {
    return (this.rfAdaptiveDriver != null ? this.rfAdaptiveDriver.isSetValue() : false);
  }

  /**
   * Get RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF
   * variations.
   * <p>
   * @return the RFAdaptiveRule value in a {@link TString} data type
   */
  public TString getRFAdaptiveRule() {
    return rfAdaptiveRule;
  }

  /**
   * Set RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF
   * variations.
   * <p>
   * @param value the RFAdaptiveRule value in a {@link TString} data type
   */
  public void setRFAdaptiveRule(TString value) {
    this.rfAdaptiveRule = value;
  }

  /**
   * Determine if the RFAdaptiveRule is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFAdaptiveRule() {
    return (this.rfAdaptiveRule != null ? this.rfAdaptiveRule.isSetValue() : false);
  }

  /**
   * Get the frequency divisor common to all RF separations (not necessarily to
   * all RF) RF crystal is not always the same as the RF channelization (min).
   * <p>
   * @return the RFBasicClockPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getRFBasicClockPeriod() {
    return rfBasicClockPeriod;
  }

  /**
   * Set the frequency divisor common to all RF separations (not necessarily to
   * all RF) RF crystal is not always the same as the RF channelization (min).
   * <p>
   * @param value the RFBasicClockPeriod value in a {@link TDecimal} data type
   */
  public void setRFBasicClockPeriod(TDecimal value) {
    this.rfBasicClockPeriod = value;
  }

  /**
   * Determine if the RFBasicClockPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFBasicClockPeriod() {
    return (this.rfBasicClockPeriod != null ? this.rfBasicClockPeriod.isSetValue() : false);
  }

  /**
   * Get the RF change per unit of time, measured over a significant portion of
   * the waveform. Applies to Continuous RF variations.
   * <p>
   * @return the RFChangeRate value in a {@link TDecimal} data type
   */
  public TDecimal getRFChangeRate() {
    return rfChangeRate;
  }

  /**
   * Set the RF change per unit of time, measured over a significant portion of
   * the waveform. Applies to Continuous RF variations.
   * <p>
   * @param value the RFChangeRate value in a {@link TDecimal} data type
   */
  public void setRFChangeRate(TDecimal value) {
    this.rfChangeRate = value;
  }

  /**
   * Determine if the RFChangeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:RFChannelFreqMin.
   * <p>
   * @return the RFChannelFreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getRFChannelFreqMax() {
    return rfChannelFreqMax;
  }

  /**
   * Set the maximum RF channel values.
   * <p>
   * [XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than
   * US:RFChannelFreqMin.
   * <p>
   * @param value the RFChannelFreqMax value in a {@link TDecimal} data type
   */
  public void setRFChannelFreqMax(TDecimal value) {
    this.rfChannelFreqMax = value;
  }

  /**
   * Determine if the RFChannelFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFChannelFreqMax() {
    return (this.rfChannelFreqMax != null ? this.rfChannelFreqMax.isSetValue() : false);
  }

  /**
   * Get the minimum RF channel values.
   * <p>
   * @return the RFChannelFreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getRFChannelFreqMin() {
    return rfChannelFreqMin;
  }

  /**
   * Set the minimum RF channel values.
   * <p>
   * @param value the RFChannelFreqMin value in a {@link TDecimal} data type
   */
  public void setRFChannelFreqMin(TDecimal value) {
    this.rfChannelFreqMin = value;
  }

  /**
   * Determine if the RFChannelFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFChannelFreqMin() {
    return (this.rfChannelFreqMin != null ? this.rfChannelFreqMin.isSetValue() : false);
  }

  /**
   * Get RFCoherent (US), indicate if the observed RF signal is coherent,
   * non-coherent, or unknown.
   * <p>
   * @return the RFCoherent value in a {@link TString} data type
   */
  public TString getRFCoherent() {
    return rfCoherent;
  }

  /**
   * Set RFCoherent (US), indicate if the observed RF signal is coherent,
   * non-coherent, or unknown.
   * <p>
   * @param value the RFCoherent value in a {@link TString} data type
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
   * or more ranges.
   * <p>
   * @return the RFContinuous value in a {@link TString} data type
   */
  public TString getRFContinuous() {
    return rfContinuous;
  }

  /**
   * Set whether pulse-to-pulse RF variations are Discrete or Continuous.
   * Discrete uses a finite number of fixed values separated by ranges of unused
   * values. Continuous potentially uses an infinite number of values within one
   * or more ranges.
   * <p>
   * @param value the RFContinuous value in a {@link TString} data type
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
   * US:RFFreqMin.
   * <p>
   * @return the RFFreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getRFFreqMax() {
    return rfFreqMax;
  }

  /**
   * Set the typical highest RF value observed on a single intercept.
   * <p>
   * [XSL ERR MINMAX] If US:RFFreqMax is used, it MUST be greater than
   * US:RFFreqMin.
   * <p>
   * @param value the RFFreqMax value in a {@link TDecimal} data type
   */
  public void setRFFreqMax(TDecimal value) {
    this.rfFreqMax = value;
  }

  /**
   * Determine if the RFFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqMax() {
    return (this.rfFreqMax != null ? this.rfFreqMax.isSetValue() : false);
  }

  /**
   * Get the typical lowest RF value observed on a single intercept.
   * <p>
   * @return the RFFreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getRFFreqMin() {
    return rfFreqMin;
  }

  /**
   * Set the typical lowest RF value observed on a single intercept.
   * <p>
   * @param value the RFFreqMin value in a {@link TDecimal} data type
   */
  public void setRFFreqMin(TDecimal value) {
    this.rfFreqMin = value;
  }

  /**
   * Determine if the RFFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqMin() {
    return (this.rfFreqMin != null ? this.rfFreqMin.isSetValue() : false);
  }

  /**
   * Get the average RF of a signal which changes RFs on a non-patterned basis.
   * <p>
   * @return the RFMean value in a {@link TDecimal} data type
   */
  public TDecimal getRFMean() {
    return rfMean;
  }

  /**
   * Set the average RF of a signal which changes RFs on a non-patterned basis.
   * <p>
   * @param value the RFMean value in a {@link TDecimal} data type
   */
  public void setRFMean(TDecimal value) {
    this.rfMean = value;
  }

  /**
   * Determine if the RFMean is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFMean() {
    return (this.rfMean != null ? this.rfMean.isSetValue() : false);
  }

  /**
   * Get the most probable RF values.
   * <p>
   * @return the RFMedian value in a {@link TDecimal} data type
   */
  public TDecimal getRFMedian() {
    return rfMedian;
  }

  /**
   * Set the most probable RF values.
   * <p>
   * @param value the RFMedian value in a {@link TDecimal} data type
   */
  public void setRFMedian(TDecimal value) {
    this.rfMedian = value;
  }

  /**
   * Determine if the RFMedian is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFMedian() {
    return (this.rfMedian != null ? this.rfMedian.isSetValue() : false);
  }

  /**
   * Get the duration of one cycle of the pattern for patterned RF variations.
   * <p>
   * @return the RFPatternPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getRFPatternPeriod() {
    return rfPatternPeriod;
  }

  /**
   * Set the duration of one cycle of the pattern for patterned RF variations.
   * <p>
   * @param value the RFPatternPeriod value in a {@link TDecimal} data type
   */
  public void setRFPatternPeriod(TDecimal value) {
    this.rfPatternPeriod = value;
  }

  /**
   * Determine if the RFPatternPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFPatternPeriod() {
    return (this.rfPatternPeriod != null ? this.rfPatternPeriod.isSetValue() : false);
  }

  /**
   * Get RFPatternType (US), Indicate whether RF is unmodulated or
   * pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @return the RFPatternType value in a {@link TString} data type
   */
  public TString getRFPatternType() {
    return rfPatternType;
  }

  /**
   * Set RFPatternType (US), Indicate whether RF is unmodulated or
   * pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value the RFPatternType value in a {@link TString} data type
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
   * Applies mostly to Electronic Attack (EA) signals.
   * <p>
   * @return the RFRestFreq value in a {@link TDecimal} data type
   */
  public TDecimal getRFRestFreq() {
    return rfRestFreq;
  }

  /**
   * Set the observed carrier or rest frequency when the modulation is off.
   * Applies mostly to Electronic Attack (EA) signals.
   * <p>
   * @param value the RFRestFreq value in a {@link TDecimal} data type
   */
  public void setRFRestFreq(TDecimal value) {
    this.rfRestFreq = value;
  }

  /**
   * Determine if the RFRestFreq is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFRestFreq() {
    return (this.rfRestFreq != null ? this.rfRestFreq.isSetValue() : false);
  }

  /**
   * Get a free text description of the RF Sequence.
   * <p>
   * @return the RFSequenceDesc value in a {@link TString} data type
   */
  public TString getRFSequenceDesc() {
    return rfSequenceDesc;
  }

  /**
   * Set a free text description of the RF Sequence.
   * <p>
   * @param value the RFSequenceDesc value in a {@link TString} data type
   */
  public void setRFSequenceDesc(TString value) {
    this.rfSequenceDesc = value;
  }

  /**
   * Determine if the RFSequenceDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSequenceDesc() {
    return (this.rfSequenceDesc != null ? this.rfSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum.
   * <p>
   * @return the RFSlotDuration value in a {@link TDecimal} data type
   */
  public TDecimal getRFSlotDuration() {
    return rfSlotDuration;
  }

  /**
   * Set the duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum.
   * <p>
   * @param value the RFSlotDuration value in a {@link TDecimal} data type
   */
  public void setRFSlotDuration(TDecimal value) {
    this.rfSlotDuration = value;
  }

  /**
   * Determine if the RFSlotDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFSlotDuration() {
    return (this.rfSlotDuration != null ? this.rfSlotDuration.isSetValue() : false);
  }

  /**
   * Get the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @return the RFFreqTolerance value in a {@link TDecimal} data type
   */
  public TDecimal getRFFreqTolerance() {
    return rfFreqTolerance;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value the RFFreqTolerance value in a {@link TDecimal} data type
   */
  public void setRFFreqTolerance(TDecimal value) {
    this.rfFreqTolerance = value;
  }

  /**
   * Determine if the RFFreqTolerance is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqTolerance() {
    return (this.rfFreqTolerance != null ? this.rfFreqTolerance.isSetValue() : false);
  }

  /**
   * Get the units in which the Frequency Tolerance is expressed.
   * <p>
   * @return the RFFreqToleranceUnit value in a {@link TString} data type
   */
  public TString getRFFreqToleranceUnit() {
    return rfFreqToleranceUnit;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value the RFFreqToleranceUnit value in a {@link TString} data type
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
   * Get In Data Item:RFFreqToleranceInterval (US) - The time interval over
   * which the RF stability measurements were taken.
   * <p>
   * @return the RFFreqToleranceInterval value in a {@link TDecimal} data type
   */
  public TDecimal getRFFreqToleranceInterval() {
    return rfFreqToleranceInterval;
  }

  /**
   * Set In Data Item:RFFreqToleranceInterval (US) - The time interval over
   * which the RF stability measurements were taken.
   * <p>
   * @param value the RFFreqToleranceInterval value in a {@link TDecimal} data
   *              type
   */
  public void setRFFreqToleranceInterval(TDecimal value) {
    this.rfFreqToleranceInterval = value;
  }

  /**
   * Determine if the RFFreqToleranceInterval is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFFreqToleranceInterval() {
    return (this.rfFreqToleranceInterval != null ? this.rfFreqToleranceInterval.isSetValue() : false);
  }

  /**
   * Get the standard deviation of the data set used to calculate RF Mean.
   * <p>
   * @return the RFStandardDeviation value in a {@link TDecimal} data type
   */
  public TDecimal getRFStandardDeviation() {
    return rfStandardDeviation;
  }

  /**
   * Set the standard deviation of the data set used to calculate RF Mean.
   * <p>
   * @param value the RFStandardDeviation value in a {@link TDecimal} data type
   */
  public void setRFStandardDeviation(TDecimal value) {
    this.rfStandardDeviation = value;
  }

  /**
   * Determine if the RFStandardDeviation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFStandardDeviation() {
    return (this.rfStandardDeviation != null ? this.rfStandardDeviation.isSetValue() : false);
  }

  /**
   * Get the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @return the RFTuningStep value in a {@link TDecimal} data type
   */
  public TDecimal getRFTuningStep() {
    return rfTuningStep;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @param value the RFTuningStep value in a {@link TDecimal} data type
   */
  public void setRFTuningStep(TDecimal value) {
    this.rfTuningStep = value;
  }

  /**
   * Determine if the RFTuningStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRFTuningStep() {
    return (this.rfTuningStep != null ? this.rfTuningStep.isSetValue() : false);
  }

  /**
   * Get the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @return the TuningStep value in a {@link TDecimal} data type
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @param value the TuningStep value in a {@link TDecimal} data type
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  /**
   * Determine if the TuningStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * observations.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedRFValues}
   *         instances
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
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withChipRate(Double value) {
    setChipRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the dwell time at any RF when the RF dwells at particular values for
   * more than one pulse in a row.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withDwellTime(Double value) {
    setDwellTime(new TDecimal(value));
    return this;
  }

  /**
   * Set the upper end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * [XSL ERR MINMAX] If US:FreqMax is used, it MUST be greater than US:FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lower end of the range of RF values that represent 100% of observed
   * signals.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the RF band between carriers which is not used. Pertains mostly to
   * spread spectrum.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withGuardBand(Double value) {
    setGuardBand(new TDecimal(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 3 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withInstantRFBW03(Double value) {
    setInstantRFBW03(new TDecimal(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 6 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withInstantRFBW06(Double value) {
    setInstantRFBW06(new TDecimal(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 10 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withInstantRFBW10(Double value) {
    setInstantRFBW10(new TDecimal(value));
    return this;
  }

  /**
   * Set the transmitter pulse bandwidth (burst or instantaneous) measured at
   * the 20 dB points (min)
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withInstantRFBW20(Double value) {
    setInstantRFBW20(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of channels into which the RF range of the emitter is
   * divided.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withNumRFChannels(Integer value) {
    setNumRFChannels(new TInteger(value));
    return this;
  }

  /**
   * Set the number of discrete RFs (channels) a multiple RF signal contains.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withNumRFElements(Integer value) {
    setNumRFElements(new TInteger(value));
    return this;
  }

  /**
   * Set the number of RF values in a signal RF sequence before it repeats.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withNumRFPositions(Integer value) {
    setNumRFPositions(new TInteger(value));
    return this;
  }

  /**
   * Set The number of frequencies simultaneously used by the emitter.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withNumRFSimultaneous(Integer value) {
    setNumRFSimultaneous(new TInteger(value));
    return this;
  }

  /**
   * Set the delta (aka. separation) from the signals lowest-min RF value to its
   * highest-max RF value; only pertains to signals which have RF changes
   * between pulses or groups of pulses (aka. RF agile signals) or signals which
   * use a changing RF continuous waveform (CW); e.g., a CW signal with a
   * sweeping RF.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withOperationalRFBW(Double value) {
    setOperationalRFBW(new TDecimal(value));
    return this;
  }

  /**
   * Set the condition controlling the choice of RF for Adaptive RF variations
   * (e.g., least jammed frequency)
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFAdaptiveDriver(String value) {
    setRFAdaptiveDriver(new TString(value));
    return this;
  }

  /**
   * Set RFAdaptiveRule (US), indicate how the RF is chosen for Adaptive RF
   * variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFAdaptiveRule(String value) {
    setRFAdaptiveRule(new TString(value));
    return this;
  }

  /**
   * Set the frequency divisor common to all RF separations (not necessarily to
   * all RF) RF crystal is not always the same as the RF channelization (min).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFBasicClockPeriod(Double value) {
    setRFBasicClockPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the RF change per unit of time, measured over a significant portion of
   * the waveform. Applies to Continuous RF variations.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFChangeRate(Double value) {
    setRFChangeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum RF channel values.
   * <p>
   * [XSL ERR MINMAX] If US:RFChannelFreqMax is used, it MUST be greater than
   * US:RFChannelFreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFChannelFreqMax(Double value) {
    setRFChannelFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum RF channel values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFChannelFreqMin(Double value) {
    setRFChannelFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set RFCoherent (US), indicate if the observed RF signal is coherent,
   * non-coherent, or unknown.
   * <p>
   * @param value An instances of type {@link ListUSY}
   * @return The current ObservedRFAnalysis object instance
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
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedRFAnalysis object instance
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
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFFreqMax(Double value) {
    setRFFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the typical lowest RF value observed on a single intercept.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFFreqMin(Double value) {
    setRFFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the average RF of a signal which changes RFs on a non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFMean(Double value) {
    setRFMean(new TDecimal(value));
    return this;
  }

  /**
   * Set the most probable RF values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFMedian(Double value) {
    setRFMedian(new TDecimal(value));
    return this;
  }

  /**
   * Set the duration of one cycle of the pattern for patterned RF variations.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFPatternPeriod(Double value) {
    setRFPatternPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set RFPatternType (US), Indicate whether RF is unmodulated or
   * pulse-to-pulse RF variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFPatternType(ListUS7 value) {
    setRFPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set the observed carrier or rest frequency when the modulation is off.
   * Applies mostly to Electronic Attack (EA) signals.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFRestFreq(Double value) {
    setRFRestFreq(new TDecimal(value));
    return this;
  }

  /**
   * Set a free text description of the RF Sequence.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFSequenceDesc(String value) {
    setRFSequenceDesc(new TString(value));
    return this;
  }

  /**
   * Set the duration of a single time slot for the hop dwell. Applies mostly to
   * spread spectrum.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFSlotDuration(Double value) {
    setRFSlotDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set the drift in Hz or in ppm using the formula: Frequency tolerance (ppm)
   * = Maximum drift (Hz) / Center frequency (MHz). Enter the units (Hz or ppm)
   * in FreqToleranceUnit.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFFreqTolerance(Double value) {
    setRFFreqTolerance(new TDecimal(value));
    return this;
  }

  /**
   * Set the units in which the Frequency Tolerance is expressed.
   * <p>
   * @param value An instances of type {@link ListCFO}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFFreqToleranceUnit(ListCFO value) {
    setRFFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item:RFFreqToleranceInterval (US) - The time interval over
   * which the RF stability measurements were taken.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFFreqToleranceInterval(Double value) {
    setRFFreqToleranceInterval(new TDecimal(value));
    return this;
  }

  /**
   * Set the standard deviation of the data set used to calculate RF Mean.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFStandardDeviation(Double value) {
    setRFStandardDeviation(new TDecimal(value));
    return this;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withRFTuningStep(Double value) {
    setRFTuningStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the separation between the mean RF values of adjacent RFs in signal
   * with discrete RF channels.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the US:ObservedRFValues
   * <p>
   * Complex element ObservedRFValues (US) contains details of actual RF
   * observations.
   * <p>
   * @param values One or more instances of type {@link ObservedRFValues}
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withObservedRFValues(ObservedRFValues... values) {
    if (values != null) {
      getObservedRFValues().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current ObservedRFAnalysis object instance
   */
  public ObservedRFAnalysis withObservedRFValues(Set<ObservedRFValues> values) {
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
    return "ObservedRFAnalysis {"
      + (rfPatternPeriod != null ? " rfPatternPeriod [" + rfPatternPeriod + "]" : "")
      + (numRFElements != null ? " numRFElements [" + numRFElements + "]" : "")
      + (instantRFBW06 != null ? " instantRFBW06 [" + instantRFBW06 + "]" : "")
      + (rfPatternType != null ? " rfPatternType [" + rfPatternType + "]" : "")
      + (rfChangeRate != null ? " rfChangeRate [" + rfChangeRate + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (rfFreqToleranceUnit != null ? " rfFreqToleranceUnit [" + rfFreqToleranceUnit + "]" : "")
      + (dwellTime != null ? " dwellTime [" + dwellTime + "]" : "")
      + (numRFChannels != null ? " numRFChannels [" + numRFChannels + "]" : "")
      + (rfChannelFreqMin != null ? " rfChannelFreqMin [" + rfChannelFreqMin + "]" : "")
      + (rfFreqToleranceInterval != null ? " rfFreqToleranceInterval [" + rfFreqToleranceInterval + "]" : "")
      + (rfChannelFreqMax != null ? " rfChannelFreqMax [" + rfChannelFreqMax + "]" : "")
      + (numRFSimultaneous != null ? " numRFSimultaneous [" + numRFSimultaneous + "]" : "")
      + (rfCoherent != null ? " rfCoherent [" + rfCoherent + "]" : "")
      + (rfTuningStep != null ? " rfTuningStep [" + rfTuningStep + "]" : "")
      + (rfMean != null ? " rfMean [" + rfMean + "]" : "")
      + (rfAdaptiveDriver != null ? " rfAdaptiveDriver [" + rfAdaptiveDriver + "]" : "")
      + (rfSlotDuration != null ? " rfSlotDuration [" + rfSlotDuration + "]" : "")
      + (rfRestFreq != null ? " rfRestFreq [" + rfRestFreq + "]" : "")
      + (instantRFBW20 != null ? " instantRFBW20 [" + instantRFBW20 + "]" : "")
      + (numRFPositions != null ? " numRFPositions [" + numRFPositions + "]" : "")
      + (rfSequenceDesc != null ? " rfSequenceDesc [" + rfSequenceDesc + "]" : "")
      + (rfMedian != null ? " rfMedian [" + rfMedian + "]" : "")
      + (instantRFBW03 != null ? " instantRFBW03 [" + instantRFBW03 + "]" : "")
      + (rfStandardDeviation != null ? " rfStandardDeviation [" + rfStandardDeviation + "]" : "")
      + (rfBasicClockPeriod != null ? " rfBasicClockPeriod [" + rfBasicClockPeriod + "]" : "")
      + (rfFreqTolerance != null ? " rfFreqTolerance [" + rfFreqTolerance + "]" : "")
      + (chipRate != null ? " chipRate [" + chipRate + "]" : "")
      + (operationalRFBW != null ? " operationalRFBW [" + operationalRFBW + "]" : "")
      + (observedRFValues != null ? " observedRFValues [" + observedRFValues + "]" : "")
      + (tuningStep != null ? " tuningStep [" + tuningStep + "]" : "")
      + (rfFreqMin != null ? " rfFreqMin [" + rfFreqMin + "]" : "")
      + (rfContinuous != null ? " rfContinuous [" + rfContinuous + "]" : "")
      + (rfFreqMax != null ? " rfFreqMax [" + rfFreqMax + "]" : "")
      + (rfAdaptiveRule != null ? " rfAdaptiveRule [" + rfAdaptiveRule + "]" : "")
      + (guardBand != null ? " guardBand [" + guardBand + "]" : "")
      + (instantRFBW10 != null ? " instantRFBW10 [" + instantRFBW10 + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedRFAnalysis} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
