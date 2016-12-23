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
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS7;

/**
 * ObservedPulseAnalysis (US) contains data describing the specific
 * characteristics of the pulse group, pulse sequence, and distinct pulse
 * information.
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Sub-Element is {@link ObservedPulseValues}
 * <p>
 * Example:
 * <pre>
 * &lt;ObservedPulseAnalysis&gt;
 *   &lt;FallTime cls="U"&gt;.015&lt;/FallTime&gt;
 *   &lt;NumPDPositions cls="U"&gt;869&lt;/NumPDPositions&gt;
 *   &lt;NumPDValues cls="U"&gt;568&lt;/NumPDValues&gt;
 *   &lt;NumPRIElements cls="U"&gt;355&lt;/NumPRIElements&gt;
 *   &lt;NumPRIPositions cls="U"&gt;298&lt;/NumPRIPositions&gt;
 *   &lt;PDAdaptiveRuleDesc cls="U"&gt;Required Pattern Collection&lt;/PDAdaptiveRuleDesc&gt;
 *   &lt;PDContinuous cls="U"&gt;Yes&lt;/PDContinuous&gt;
 *   &lt;PDDwellMax cls="U"&gt;99.54&lt;/PDDwellMax&gt;
 *   &lt;PDDwellMin cls="U"&gt;65.43&lt;/PDDwellMin&gt;
 *   &lt;PDExtremeMax cls="U"&gt;6809&lt;/PDExtremeMax&gt;
 *   &lt;PDExtremeMin cls="U"&gt;6723&lt;/PDExtremeMin&gt;
 *   &lt;PDMax cls="U"&gt;6709&lt;/PDMax&gt;
 *   &lt;PDMean cls="U"&gt;6623&lt;/PDMean&gt;
 *   &lt;PDMedian cls="U"&gt;6690&lt;/PDMedian&gt;
 *   &lt;PDMin cls="U"&gt;6601&lt;/PDMin&gt;
 *   &lt;PDPatternPeriod cls="U"&gt;0.001&lt;/PDPatternPeriod&gt;
 *   &lt;PDPatternType cls="U"&gt;Non-Patterned&lt;/PDPatternType&gt;
 *   &lt;PDSequenceDesc cls="U"&gt;Required Pattern Collection set A34&lt;/PDSequenceDesc&gt;
 *   &lt;PDStdDev cls="U"&gt;276&lt;/PDStdDev&gt;
 *   &lt;PDStep cls="U"&gt;23&lt;/PDStep&gt;
 *   &lt;PDTypicalMax cls="U"&gt;698&lt;/PDTypicalMax&gt;
 *   &lt;PDTypicalMin cls="U"&gt;378&lt;/PDTypicalMin&gt;
 *   &lt;PRFChangeRate cls="U"&gt;3000&lt;/PRFChangeRate&gt;
 *   &lt;PRFExtremeMax cls="U"&gt;3129&lt;/PRFExtremeMax&gt;
 *   &lt;PRFExtremeMin cls="U"&gt;2790&lt;/PRFExtremeMin&gt;
 *   &lt;PRFMax cls="U"&gt;3102&lt;/PRFMax&gt;
 *   &lt;PRFMin cls="U"&gt;2703&lt;/PRFMin&gt;
 *   &lt;PRFTypicalMax cls="U"&gt;3019&lt;/PRFTypicalMax&gt;
 *   &lt;PRFTypicalMin cls="U"&gt;2783&lt;/PRFTypicalMin&gt;
 *   &lt;PRIAdaptiveDriverDesc cls="U"&gt;Target Motion Tracking&lt;/PRIAdaptiveDriverDesc&gt;
 *   &lt;PRIAdaptiveRuleDesc cls="U"&gt;Required Pattern Collection&lt;/PRIAdaptiveRuleDesc&gt;
 *   &lt;PRIAnomalousValues cls="U"&gt;Ground clutter introduced distortion&lt;/PRIAnomalousValues&gt;
 *   &lt;PRIBasicClockPeriod cls="U"&gt;0.00001&lt;/PRIBasicClockPeriod&gt;
 *   &lt;PRIChangeRate cls="U"&gt;376&lt;/PRIChangeRate&gt;
 *   &lt;PRIContinuous cls="U"&gt;Yes&lt;/PRIContinuous&gt;
 *   &lt;PRICountdown cls="U"&gt;678&lt;/PRICountdown&gt;
 *   &lt;PRICountdownKey cls="U"&gt;342&lt;/PRICountdownKey&gt;
 *   &lt;PRIExtremeMax cls="U"&gt;200&lt;/PRIExtremeMax&gt;
 *   &lt;PRIExtremeMin cls="U"&gt;900&lt;/PRIExtremeMin&gt;
 *   &lt;PRIFramePeriod cls="U"&gt;0.001&lt;/PRIFramePeriod&gt;
 *   &lt;PRIFrameRate cls="U"&gt;500&lt;/PRIFrameRate&gt;
 *   &lt;PRIGroupPulseSpacing cls="U"&gt;2890&lt;/PRIGroupPulseSpacing&gt;
 *   &lt;PRIGroupSpacing cls="U"&gt;2581&lt;/PRIGroupSpacing&gt;
 *   &lt;PRIMean cls="U"&gt;500&lt;/PRIMean&gt;
 *   &lt;PRIMedian cls="U"&gt;472&lt;/PRIMedian&gt;
 *   &lt;PRIMedianCountdowns cls="U"&gt;6890&lt;/PRIMedianCountdowns&gt;
 *   &lt;PRIPatternPeriod cls="U"&gt;23&lt;/PRIPatternPeriod&gt;
 *   &lt;PRIPatternType cls="U"&gt;Non-Patterned&lt;/PRIPatternType&gt;
 *   &lt;PRIPulsesPerGroup cls="U"&gt;2386&lt;/PRIPulsesPerGroup&gt;
 *   &lt;PRISequenceDesc cls="U"&gt;Required Pattern Collection set A34&lt;/PRISequenceDesc&gt;
 *   &lt;PRIStability cls="U"&gt;0.0001&lt;/PRIStability&gt;
 *   &lt;PRIStabilitySamplePeriod cls="U"&gt;0.12&lt;/PRIStabilitySamplePeriod&gt;
 *   &lt;PRIStdDev cls="U"&gt;.0145&lt;/PRIStdDev&gt;
 *   &lt;PRIStep cls="U"&gt;23&lt;/PRIStep&gt;
 *   &lt;PRISubframePeriod cls="U"&gt;0.001&lt;/PRISubframePeriod&gt;
 *   &lt;PRISubframeRate cls="U"&gt;300&lt;/PRISubframeRate&gt;
 *   &lt;PRITimingShift cls="U"&gt;238&lt;/PRITimingShift&gt;
 *   &lt;PRITypicalMax cls="U"&gt;293&lt;/PRITypicalMax&gt;
 *   &lt;PRITypicalMin cls="U"&gt;587&lt;/PRITypicalMin&gt;
 *   &lt;RiseTime cls="U"&gt;.015&lt;/RiseTime&gt;
 *   &lt;ObservedPulseValues&gt;
 *     &lt;ObservedPDValue cls="U"&gt;573&lt;/ObservedPDValue&gt;
 *     &lt;ObservedPRFValue cls="U"&gt;512&lt;/ObservedPRFValue&gt;
 *     &lt;ObservedPRIValue cls="U"&gt;512&lt;/ObservedPRIValue&gt;
 *     &lt;StatisticalIndicator cls="U"&gt;97.2&lt;/StatisticalIndicator&gt;
 *   &lt;/ObservedPulseValues&gt;
 * &lt;/ObservedPulseAnalysis&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPulseAnalysis", propOrder = {
  "fallTime",
  "numPDPositions",
  "numPDValues",
  "numPRIElements",
  "numPRIPositions",
  "pdAdaptiveRuleDesc",
  "pdContinuous",
  "pdDwellMax",
  "pdDwellMin",
  "pdExtremeMax",
  "pdExtremeMin",
  "pdMax",
  "pdMean",
  "pdMedian",
  "pdMin",
  "pdPatternPeriod",
  "pdPatternType",
  "pdSequenceDesc",
  "pdStdDev",
  "pdStep",
  "pdTypicalMax",
  "pdTypicalMin",
  "prfChangeRate",
  "prfExtremeMax",
  "prfExtremeMin",
  "prfMax",
  "prfMin",
  "prfTypicalMax",
  "prfTypicalMin",
  "priAdaptiveDriverDesc",
  "priAdaptiveRuleDesc",
  "priAnomalousValues",
  "priBasicClockPeriod",
  "priChangeRate",
  "priContinuous",
  "priCountdown",
  "priCountdownKey",
  "priExtremeMax",
  "priExtremeMin",
  "priFramePeriod",
  "priFrameRate",
  "priGroupPulseSpacing",
  "priGroupSpacing",
  "priMean",
  "priMedian",
  "priMedianCountdowns",
  "priPatternPeriod",
  "priPatternType",
  "priPulsesPerGroup",
  "priSequenceDesc",
  "priStability",
  "priStabilitySamplePeriod",
  "priStdDev",
  "priStep",
  "priSubframePeriod",
  "priSubframeRate",
  "priTimingShift",
  "priTypicalMax",
  "priTypicalMin",
  "riseTime",
  "observedPulseValues"
})
public class ObservedPulseAnalysis {

  /**
   * US:FallTime - Fall Time (Optional)
   * <p>
   * The time required for a pulse to fall from 90% to 10 percent of the mean
   * peak amplitude of its voltage waveform/envelope.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FallTime", required = false)
  private microsecs fallTime;
  /**
   * US:NumPDPositions - Num PD Positions (Optional)
   * <p>
   * The number of pulses (i.e., positions) in a repeating sequence of pulses
   * which has multiple (2 or more) PD values.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumPDPositions", required = false)
  private UN6 numPDPositions;
  /**
   * US:NumPDValues - Num PD Values (Optional)
   * <p>
   * The number of discrete PD values (i.e., elements) in a repeating sequence
   * of pulses which has multiple (2 or more) PD values.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumPDValues", required = false)
  private UN6 numPDValues;
  /**
   * US:NumPRIElements - Num PRI Elements (Optional)
   * <p>
   * The number of discrete PRI values in a repeating sequence of discrete PRIs.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumPRIElements", required = false)
  private UN6 numPRIElements;
  /**
   * US:NumPRIPositions - Num PRI Positions (Optional)
   * <p>
   * The number of time intervals between pulses or pulse groups, or the number
   * of PRI dwell groups, in a repeating PRI sequence which uses discrete PRI
   * values.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumPRIPositions", required = false)
  private UN6 numPRIPositions;
  /**
   * US:PDAdaptiveRuleDesc - PD Adaptive Rule Description (Optional)
   * <p>
   * The rule which describes the signal PD variations (aka. modulation).
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDAdaptiveRuleDesc", required = false)
  private S500 pdAdaptiveRuleDesc;
  /**
   * In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDContinuous", required = false)
  private TString pdContinuous;
  /**
   * US:PDDwellMax - PD Dwell Max (Optional)
   * <p>
   * The maximum time duration for a complete dwell/group of pulses which all
   * have the same PD value.
   * <p>
   * [XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than
   * US:PDDwellMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDDwellMax", required = false)
  private microsecs pdDwellMax;
  /**
   * US:PDDwellMin - PD Dwell Min (Optional)
   * <p>
   * The minimum time duration for a complete dwell/group of pulses which all
   * have the same PD value.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDDwellMin", required = false)
  private microsecs pdDwellMin;
  /**
   * US:PDExtremeMax - Maximum PD Extreme (Optional)
   * <p>
   * The maximum PD value that represents 100% of observed values.
   * <p>
   * [XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than
   * US:PDExtremeMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDExtremeMax", required = false)
  private microsecs pdExtremeMax;
  /**
   * US:PDExtremeMin - Minimum PD Extreme (Optional)
   * <p>
   * The minimum PD value that represents 100% of observed values.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDExtremeMin", required = false)
  private microsecs pdExtremeMin;
  /**
   * US:PDMax - Maximum PD (Optional)
   * <p>
   * The highest discrete PD value in a repeating sequence of pulses which has
   * multiple PD values
   * <p>
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMax", required = false)
  private microsecs pdMax;
  /**
   * US:PDMean - Average PD (Optional)
   * <p>
   * The average PD of a signal which changes PD values on a non-patterned
   * basis.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMean", required = false)
  private microsecs pdMean;
  /**
   * US:PDMedian - PD Median (Optional)
   * <p>
   * The PD value that the signal most often used, based on a statistical study.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMedian", required = false)
  private microsecs pdMedian;
  /**
   * US:PDMin - Minimum PD (Optional)
   * <p>
   * The delta lowest discrete PD value in a repeating sequence of pulses which
   * has multiple PD values
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDMin", required = false)
  private microsecs pdMin;
  /**
   * US:PDPatternPeriod - PD Pattern Period (Optional)
   * <p>
   * The time duration for one complete cycle of a repeating sequence of pulses
   * which has multiple (2 or more) PD values; the time duration shall go from a
   * point in one cycle to a like point in the next cycle.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDPatternPeriod", required = false)
  private microsecs pdPatternPeriod;
  /**
   * In Data Item PDPatternType (US), Indicate whether PD is unmodulated or
   * pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDPatternType", required = false)
  private TString pdPatternType;
  /**
   * US:PDSequenceDesc - PD Sequence Description (Optional)
   * <p>
   * A freetext description of the PD Sequence.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDSequenceDesc", required = false)
  private S500 pdSequenceDesc;
  /**
   * US:PDStdDev - PD Standard Deviation (Optional)
   * <p>
   * The standard deviation of the data sample used to calculate PD Mean.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDStdDev", required = false)
  private microsecs pdStdDev;
  /**
   * US:PDStep - PD Step (Optional)
   * <p>
   * The Step between adjacent PD values; pertains to discrete PD variations.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDStep", required = false)
  private microsecs pdStep;
  /**
   * US:PDTypicalMax - Maximum PD Typical (Optional)
   * <p>
   * The upper end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than
   * US:PDTypicalMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDTypicalMax", required = false)
  private microsecs pdTypicalMax;
  /**
   * US:PDTypicalMin - Minimum PD Typical (Optional)
   * <p>
   * The lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PDTypicalMin", required = false)
  private microsecs pdTypicalMin;
  /**
   * US:PRFChangeRate - PRF Change Rate (Optional)
   * <p>
   * The rate of change for PD variations expressed as PD change per unit of
   * time.
   * <p>
   * Format is UN(12,6) (μsec/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRFChangeRate", required = false)
  private US_PRIChgRate prfChangeRate;
  /**
   * US:PRFExtremeMax - Maximum PRF Extreme (Optional)
   * <p>
   * The minimum Observed PRF in the signal sample.
   * <p>
   * [XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than
   * US:PRFExtremeMin.
   * <p>
   * Format is UN(7,2) (pps)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRFExtremeMax", required = false)
  private US_PPS prfExtremeMax;
  /**
   * US:PRFExtremeMin - Minimum PRF Extreme (Optional)
   * <p>
   * The minimum Observed PRF in the signal sample.
   * <p>
   * Format is UN(7,2) (pps)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRFExtremeMin", required = false)
  private US_PPS prfExtremeMin;
  /**
   * US:PRFMax - PRF Max (Optional)
   * <p>
   * The highest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.
   * <p>
   * Format is UN(7,2) (pps)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRFMax", required = false)
  private US_PPS prfMax;
  /**
   * US:PRFMin - PRF Min (Optional)
   * <p>
   * The lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * Format is UN(7,2) (pps)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRFMin", required = false)
  private US_PPS prfMin;
  /**
   * US:PRFTypicalMax - Maximum PRF Typical (Optional)
   * <p>
   * The upper end of the range of PRF values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than
   * US:PRFTypicalMin.
   * <p>
   * Format is UN(7,2) (pps)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRFTypicalMax", required = false)
  private US_PPS prfTypicalMax;
  /**
   * US:PRFTypicalMin - Minimum PRF Typical (Optional)
   * <p>
   * The lower end of the range of PRF values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * Format is UN(7,2) (pps)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRFTypicalMin", required = false)
  private US_PPS prfTypicalMin;
  /**
   * US:PRIAdaptiveDriverDesc - PRI Adaptive Driver Description (Optional)
   * <p>
   * The condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes).
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIAdaptiveDriverDesc", required = false)
  private S500 priAdaptiveDriverDesc;
  /**
   * US:PRIAdaptiveRuleDesc - PRI Adaptive Rule Description (Optional)
   * <p>
   * The rule which describes the signal PRI variations (aka, interpulse
   * modulation changes)
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIAdaptiveRuleDesc", required = false)
  private S500 priAdaptiveRuleDesc;
  /**
   * US:PRIAnomalousValues - PRI Anomalous Values (Optional)
   * <p>
   * Any regularly occurring signal values which do not fit in any of the other
   * PRI related fields. For example Minimum Scheduling Interval (MSI) values,
   * or Engagement Group Duration values can be documented in this field.. When
   * used, the data shall be clearly described, so all users understand the
   * meaning of the values.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIAnomalousValues", required = false)
  private S500 priAnomalousValues;
  /**
   * US:PRIBasicClockPeriod - PRI Basic Clock Period (Optional)
   * <p>
   * The fundamental period of the emitter clock which is used to generate the
   * subject signal PRIs
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIBasicClockPeriod", required = false)
  private microsecs priBasicClockPeriod;
  /**
   * US:PRIChangeRate - PRI Change Rate (Optional)
   * <p>
   * The PRI change per unit of time, measured over a significant portion of the
   * waveform. This applies to Continuous PRI variations.
   * <p>
   * Format is UN(12,6) (μsec/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIChangeRate", required = false)
  private US_PRIChgRate priChangeRate;
  /**
   * In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIContinuous", required = false)
  private TString priContinuous;
  /**
   * US:PRICountdown - PRI Countdown (Optional)
   * <p>
   * The integer (aka, count or countdown) associated with the PRI Crystal value
   * to provide the Pattern Period.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRICountdown", required = false)
  private UN6 priCountdown;
  /**
   * US:PRICountdownKey - PRI Countdown Key (Optional)
   * <p>
   * The integer (aka, count or countdown) used to generate the PRI from the PRI
   * Crystal value.
   * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRICountdownKey", required = false)
  private UN9 priCountdownKey;
  /**
   * US:PRIExtremeMax - PRI Extreme Max (Optional)
   * <p>
   * The maximum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than
   * US:PRIExtremeMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIExtremeMax", required = false)
  private microsecs priExtremeMax;
  /**
   * US:PRIExtremeMin - PRI Extreme Min (Optional)
   * <p>
   * The minimum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIExtremeMin", required = false)
  private microsecs priExtremeMin;
  /**
   * US:PRIFramePeriod - PRI Frame Period (Optional)
   * <p>
   * The time difference between a point on the leading edge of the frame marker
   * (or an alternate pulse in the frame), to the similar point on the leading
   * edge of the frame marker (or the alternate pulse) in the next/consecutive
   * frame.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIFramePeriod", required = false)
  private microsecs priFramePeriod;
  /**
   * US:PRIFrameRate - PRI Frame Rate (Optional)
   * <p>
   * The rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIFrameRate", required = false)
  private FreqM priFrameRate;
  /**
   * US:PRIGroupPulseSpacing - PRI Group Pulse Spacing (Optional)
   * <p>
   * The time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIGroupPulseSpacing", required = false)
  private microsecs priGroupPulseSpacing;
  /**
   * US:PRIGroupSpacing - PRI Group Spacing (Optional)
   * <p>
   * The PRI between two groups of pulses which both have constant but different
   * PRIs (aka, the PRI between consecutive PRI dwell groups).
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIGroupSpacing", required = false)
  private microsecs priGroupSpacing;
  /**
   * US:PRIMean - Average PRI (Optional)
   * <p>
   * The average PRI value for a signal which changes PRI values on a
   * non-patterned basis.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIMean", required = false)
  private microsecs priMean;
  /**
   * US:PRIMedian - PRI Median (Optional)
   * <p>
   * The observed PRI value that the signal most often used based on statistical
   * study of a data set.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIMedian", required = false)
  private microsecs priMedian;
  /**
   * US:PRIMedianCountdowns - PRI Median Countdowns (Optional)
   * <p>
   * The observed PRI Crystal Counts used to generate the PRIs used most often
   * by the signal, based on statistical study of a data set.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIMedianCountdowns", required = false)
  private S100 priMedianCountdowns;
  /**
   * US:PRIPatternPeriod - PRI Pattern Period (Optional)
   * <p>
   * The time duration for one complete cycle of a repeating PRI sequence.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIPatternPeriod", required = false)
  private microsecs priPatternPeriod;
  /**
   * US:PRIPatternType - PRI Pattern Type (Optional)
   * <p>
   * Whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive.
   * <p>
   * Format is L:US7
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIPatternType", required = false)
  private TString priPatternType;
  /**
   * US:PRIPulsesPerGroup - PRI Pulses Per Group (Optional)
   * <p>
   * The number of pulses in a pulse group.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIPulsesPerGroup", required = false)
  private UN6 priPulsesPerGroup;
  /**
   * US:PRISequenceDesc - PRI Sequence Description (Optional)
   * <p>
   * A free text description of the PRI Sequence.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRISequenceDesc", required = false)
  private S500 priSequenceDesc;
  /**
   * US:PRIStability - PRI Stability (Optional)
   * <p>
   * The variation of a mean PRI value measured from one time to another time
   * <p>
   * Format is UN(18,6) (ppm)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIStability", required = false)
  private US_PPM priStability;
  /**
   * US:PRIStabilitySamplePeriod - PRI Stability Sample Period (Optional)
   * <p>
   * The time interval used to determine the PRI stability value.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIStabilitySamplePeriod", required = false)
  private microsecs priStabilitySamplePeriod;
  /**
   * US:PRIStdDev - PRI Standard Deviation (Optional)
   * <p>
   * The standard deviation associated with the data set used to calculate the
   * values entered in the PRI Mean fields
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIStdDev", required = false)
  private microsecs priStdDev;
  /**
   * US:PRIStep - PRI Step (Optional)
   * <p>
   * The delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRIStep", required = false)
  private microsecs priStep;
  /**
   * US:PRISubframePeriod - PRI Subframe Period (Optional)
   * <p>
   * The time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRISubframePeriod", required = false)
  private microsecs priSubframePeriod;
  /**
   * US:PRISubframeRate - PRI Subframe Rate (Optional)
   * <p>
   * The number of subframes detected during each PRI Subframe period.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRISubframeRate", required = false)
  private FreqM priSubframeRate;
  /**
   * US:PRITimingShift - PRI Timing Shift (Optional)
   * <p>
   * The PRI timing shift value, on Emitters with repeated timing shifts of a
   * predictable magnitude, but not predictable timing.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRITimingShift", required = false)
  private microsecs priTimingShift;
  /**
   * US:PRITypicalMax - PRI Typical Max (Optional)
   * <p>
   * The upper end of the range of PRI values that represent 95% of the signal
   * observed PRI values, from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than
   * US:PRITypicalMin.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRITypicalMax", required = false)
  private microsecs priTypicalMax;
  /**
   * US:PRITypicalMin - PRI Typical Min (Optional)
   * <p>
   * The lower end of the range of PRI values that represent 95% of the signal
   * observed PRI values, from a statistical study of a data set.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PRITypicalMin", required = false)
  private microsecs priTypicalMin;
  /**
   * US:RiseTime - RiseTime (Optional)
   * <p>
   * The time required for a pulse to rise from 10% to 90 percent of the mean
   * peak amplitude of the voltage pattern.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "RiseTime", required = false)
  private microsecs riseTime;
  /**
   * US:ObservedPulseValues (Optional)
   * <p>
   * ObservedPulseValues (US) contains data describing the distinct Pulse values
   * related to the Modulation Type.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedPulseValues")
  private Set<ObservedPulseValues> observedPulseValues;

  /**
   * Get the time required for a pulse to fall from 90% to 10 percent of the
   * mean peak amplitude of its voltage waveform/envelope..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getFallTime() {
    return fallTime;
  }

  /**
   * Set the time required for a pulse to fall from 90% to 10 percent of the
   * mean peak amplitude of its voltage waveform/envelope..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setFallTime(microsecs value) {
    this.fallTime = value;
  }

  /**
   * Determine if the FallTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFallTime() {
    return (this.fallTime != null ? this.fallTime.isSetValue() : false);
  }

  /**
   * Get the number of pulses (i.e., positions) in a repeating sequence of
   * pulses which has multiple (2 or more) PD values..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumPDPositions() {
    return numPDPositions;
  }

  /**
   * Set the number of pulses (i.e., positions) in a repeating sequence of
   * pulses which has multiple (2 or more) PD values..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumPDPositions(UN6 value) {
    this.numPDPositions = value;
  }

  /**
   * Determine if the NumPDPositions is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPDPositions() {
    return (this.numPDPositions != null ? this.numPDPositions.isSetValue() : false);
  }

  /**
   * Get the number of discrete PD values (i.e., elements) in a repeating
   * sequence of pulses which has multiple (2 or more) PD values..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumPDValues() {
    return numPDValues;
  }

  /**
   * Set the number of discrete PD values (i.e., elements) in a repeating
   * sequence of pulses which has multiple (2 or more) PD values..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumPDValues(UN6 value) {
    this.numPDValues = value;
  }

  /**
   * Determine if the NumPDValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPDValues() {
    return (this.numPDValues != null ? this.numPDValues.isSetValue() : false);
  }

  /**
   * Get the number of discrete PRI values in a repeating sequence of discrete
   * PRIs..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumPRIElements() {
    return numPRIElements;
  }

  /**
   * Set the number of discrete PRI values in a repeating sequence of discrete
   * PRIs..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumPRIElements(UN6 value) {
    this.numPRIElements = value;
  }

  /**
   * Determine if the NumPRIElements is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPRIElements() {
    return (this.numPRIElements != null ? this.numPRIElements.isSetValue() : false);
  }

  /**
   * Get the number of time intervals between pulses or pulse groups, or the
   * number of PRI dwell groups, in a repeating PRI sequence which uses discrete
   * PRI values..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumPRIPositions() {
    return numPRIPositions;
  }

  /**
   * Set the number of time intervals between pulses or pulse groups, or the
   * number of PRI dwell groups, in a repeating PRI sequence which uses discrete
   * PRI values..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumPRIPositions(UN6 value) {
    this.numPRIPositions = value;
  }

  /**
   * Determine if the NumPRIPositions is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPRIPositions() {
    return (this.numPRIPositions != null ? this.numPRIPositions.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal PD variations (aka. modulation)..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getPDAdaptiveRuleDesc() {
    return pdAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal PD variations (aka. modulation)..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setPDAdaptiveRuleDesc(S500 value) {
    this.pdAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the PDAdaptiveRuleDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDAdaptiveRuleDesc() {
    return (this.pdAdaptiveRuleDesc != null ? this.pdAdaptiveRuleDesc.isSetValue() : false);
  }

  /**
   * Get In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges..
   * <p>
   * @return the PDContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPDContinuous() {
    return pdContinuous;
  }

  /**
   * Set In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges..
   * <p>
   * @param value the PDContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPDContinuous(TString value) {
    this.pdContinuous = value;
  }

  /**
   * Determine if the PDContinuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDContinuous() {
    return (this.pdContinuous != null ? this.pdContinuous.isSetValue() : false);
  }

  /**
   * Get the maximum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * [XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than
   * US:PDDwellMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDDwellMax() {
    return pdDwellMax;
  }

  /**
   * Set the maximum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * [XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than
   * US:PDDwellMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDDwellMax(microsecs value) {
    this.pdDwellMax = value;
  }

  /**
   * Determine if the PDDwellMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDDwellMax() {
    return (this.pdDwellMax != null ? this.pdDwellMax.isSetValue() : false);
  }

  /**
   * Get the minimum time duration for a complete dwell/group of pulses which
   * all have the same PD value..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDDwellMin() {
    return pdDwellMin;
  }

  /**
   * Set the minimum time duration for a complete dwell/group of pulses which
   * all have the same PD value..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDDwellMin(microsecs value) {
    this.pdDwellMin = value;
  }

  /**
   * Determine if the PDDwellMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDDwellMin() {
    return (this.pdDwellMin != null ? this.pdDwellMin.isSetValue() : false);
  }

  /**
   * Get the maximum PD value that represents 100% of observed values.
   * <p>
   * [XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than
   * US:PDExtremeMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDExtremeMax() {
    return pdExtremeMax;
  }

  /**
   * Set the maximum PD value that represents 100% of observed values.
   * <p>
   * [XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than
   * US:PDExtremeMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDExtremeMax(microsecs value) {
    this.pdExtremeMax = value;
  }

  /**
   * Determine if the PDExtremeMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDExtremeMax() {
    return (this.pdExtremeMax != null ? this.pdExtremeMax.isSetValue() : false);
  }

  /**
   * Get the minimum PD value that represents 100% of observed values..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDExtremeMin() {
    return pdExtremeMin;
  }

  /**
   * Set the minimum PD value that represents 100% of observed values..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDExtremeMin(microsecs value) {
    this.pdExtremeMin = value;
  }

  /**
   * Determine if the PDExtremeMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDExtremeMin() {
    return (this.pdExtremeMin != null ? this.pdExtremeMin.isSetValue() : false);
  }

  /**
   * Get the highest discrete PD value in a repeating sequence of pulses which
   * has multiple PD values
   * <p>
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDMax() {
    return pdMax;
  }

  /**
   * Set the highest discrete PD value in a repeating sequence of pulses which
   * has multiple PD values
   * <p>
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDMax(microsecs value) {
    this.pdMax = value;
  }

  /**
   * Determine if the PDMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMax() {
    return (this.pdMax != null ? this.pdMax.isSetValue() : false);
  }

  /**
   * Get the average PD of a signal which changes PD values on a non-patterned
   * basis..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDMean() {
    return pdMean;
  }

  /**
   * Set the average PD of a signal which changes PD values on a non-patterned
   * basis..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDMean(microsecs value) {
    this.pdMean = value;
  }

  /**
   * Determine if the PDMean is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMean() {
    return (this.pdMean != null ? this.pdMean.isSetValue() : false);
  }

  /**
   * Get the PD value that the signal most often used, based on a statistical
   * study..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDMedian() {
    return pdMedian;
  }

  /**
   * Set the PD value that the signal most often used, based on a statistical
   * study..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDMedian(microsecs value) {
    this.pdMedian = value;
  }

  /**
   * Determine if the PDMedian is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMedian() {
    return (this.pdMedian != null ? this.pdMedian.isSetValue() : false);
  }

  /**
   * Get the delta lowest discrete PD value in a repeating sequence of pulses
   * which has multiple PD values.
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDMin() {
    return pdMin;
  }

  /**
   * Set the delta lowest discrete PD value in a repeating sequence of pulses
   * which has multiple PD values.
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDMin(microsecs value) {
    this.pdMin = value;
  }

  /**
   * Determine if the PDMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMin() {
    return (this.pdMin != null ? this.pdMin.isSetValue() : false);
  }

  /**
   * Get the time duration for one complete cycle of a repeating sequence of
   * pulses which has multiple (2 or more) PD values; the time duration shall go
   * from a point in one cycle to a like point in the next cycle..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDPatternPeriod() {
    return pdPatternPeriod;
  }

  /**
   * Set the time duration for one complete cycle of a repeating sequence of
   * pulses which has multiple (2 or more) PD values; the time duration shall go
   * from a point in one cycle to a like point in the next cycle..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDPatternPeriod(microsecs value) {
    this.pdPatternPeriod = value;
  }

  /**
   * Determine if the PDPatternPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDPatternPeriod() {
    return (this.pdPatternPeriod != null ? this.pdPatternPeriod.isSetValue() : false);
  }

  /**
   * Get In Data Item PDPatternType (US), Indicate whether PD is unmodulated or
   * pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive..
   * <p>
   * @return the PDPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPDPatternType() {
    return pdPatternType;
  }

  /**
   * Set In Data Item PDPatternType (US), Indicate whether PD is unmodulated or
   * pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive..
   * <p>
   * @param value the PDPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPDPatternType(TString value) {
    this.pdPatternType = value;
  }

  /**
   * Determine if the PDPatternType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDPatternType() {
    return (this.pdPatternType != null ? this.pdPatternType.isSetValue() : false);
  }

  /**
   * Get a freetext description of the PD Sequence..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getPDSequenceDesc() {
    return pdSequenceDesc;
  }

  /**
   * Set a freetext description of the PD Sequence..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setPDSequenceDesc(S500 value) {
    this.pdSequenceDesc = value;
  }

  /**
   * Determine if the PDSequenceDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDSequenceDesc() {
    return (this.pdSequenceDesc != null ? this.pdSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the standard deviation of the data sample used to calculate PD Mean..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDStdDev() {
    return pdStdDev;
  }

  /**
   * Set the standard deviation of the data sample used to calculate PD Mean..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDStdDev(microsecs value) {
    this.pdStdDev = value;
  }

  /**
   * Determine if the PDStdDev is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDStdDev() {
    return (this.pdStdDev != null ? this.pdStdDev.isSetValue() : false);
  }

  /**
   * Get the Step between adjacent PD values; pertains to discrete PD
   * variations..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDStep() {
    return pdStep;
  }

  /**
   * Set the Step between adjacent PD values; pertains to discrete PD
   * variations..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDStep(microsecs value) {
    this.pdStep = value;
  }

  /**
   * Determine if the PDStep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDStep() {
    return (this.pdStep != null ? this.pdStep.isSetValue() : false);
  }

  /**
   * Get the upper end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than
   * US:PDTypicalMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDTypicalMax() {
    return pdTypicalMax;
  }

  /**
   * Set the upper end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than
   * US:PDTypicalMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDTypicalMax(microsecs value) {
    this.pdTypicalMax = value;
  }

  /**
   * Determine if the PDTypicalMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDTypicalMax() {
    return (this.pdTypicalMax != null ? this.pdTypicalMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPDTypicalMin() {
    return pdTypicalMin;
  }

  /**
   * Set the lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPDTypicalMin(microsecs value) {
    this.pdTypicalMin = value;
  }

  /**
   * Determine if the PDTypicalMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDTypicalMin() {
    return (this.pdTypicalMin != null ? this.pdTypicalMin.isSetValue() : false);
  }

  /**
   * Get the rate of change for PD variations expressed as PD change per unit of
   * time..
   * <p>
   * @return a {@link US_PRIChgRate} instance
   * @since 3.1.0
   */
  public US_PRIChgRate getPRFChangeRate() {
    return prfChangeRate;
  }

  /**
   * Set the rate of change for PD variations expressed as PD change per unit of
   * time..
   * <p>
   * @param value a {@link US_PRIChgRate} instance
   * @since 3.1.0
   */
  public void setPRFChangeRate(US_PRIChgRate value) {
    this.prfChangeRate = value;
  }

  /**
   * Determine if the PRFChangeRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFChangeRate() {
    return (this.prfChangeRate != null ? this.prfChangeRate.isSetValue() : false);
  }

  /**
   * Get the minimum Observed PRF in the signal sample.
   * <p>
   * [XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than
   * US:PRFExtremeMin..
   * <p>
   * @return a {@link US_PPS} instance
   * @since 3.1.0
   */
  public US_PPS getPRFExtremeMax() {
    return prfExtremeMax;
  }

  /**
   * Set the minimum Observed PRF in the signal sample.
   * <p>
   * [XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than
   * US:PRFExtremeMin..
   * <p>
   * @param value a {@link US_PPS} instance
   * @since 3.1.0
   */
  public void setPRFExtremeMax(US_PPS value) {
    this.prfExtremeMax = value;
  }

  /**
   * Determine if the PRFExtremeMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFExtremeMax() {
    return (this.prfExtremeMax != null ? this.prfExtremeMax.isSetValue() : false);
  }

  /**
   * Get the minimum Observed PRF in the signal sample..
   * <p>
   * @return a {@link US_PPS} instance
   * @since 3.1.0
   */
  public US_PPS getPRFExtremeMin() {
    return prfExtremeMin;
  }

  /**
   * Set the minimum Observed PRF in the signal sample..
   * <p>
   * @param value a {@link US_PPS} instance
   * @since 3.1.0
   */
  public void setPRFExtremeMin(US_PPS value) {
    this.prfExtremeMin = value;
  }

  /**
   * Determine if the PRFExtremeMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFExtremeMin() {
    return (this.prfExtremeMin != null ? this.prfExtremeMin.isSetValue() : false);
  }

  /**
   * Get the highest discrete PRI value (convert PRI to PRF) which are found in
   * a single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin..
   * <p>
   * @return a {@link US_PPS} instance
   * @since 3.1.0
   */
  public US_PPS getPRFMax() {
    return prfMax;
  }

  /**
   * Set the highest discrete PRI value (convert PRI to PRF) which are found in
   * a single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin..
   * <p>
   * @param value a {@link US_PPS} instance
   * @since 3.1.0
   */
  public void setPRFMax(US_PPS value) {
    this.prfMax = value;
  }

  /**
   * Determine if the PRFMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFMax() {
    return (this.prfMax != null ? this.prfMax.isSetValue() : false);
  }

  /**
   * Get the lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set. .
   * <p>
   * @return a {@link US_PPS} instance
   * @since 3.1.0
   */
  public US_PPS getPRFMin() {
    return prfMin;
  }

  /**
   * Set the lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set. .
   * <p>
   * @param value a {@link US_PPS} instance
   * @since 3.1.0
   */
  public void setPRFMin(US_PPS value) {
    this.prfMin = value;
  }

  /**
   * Determine if the PRFMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFMin() {
    return (this.prfMin != null ? this.prfMin.isSetValue() : false);
  }

  /**
   * Get the upper end of the range of PRF values that represents 95% of
   * observed values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than
   * US:PRFTypicalMin..
   * <p>
   * @return a {@link US_PPS} instance
   * @since 3.1.0
   */
  public US_PPS getPRFTypicalMax() {
    return prfTypicalMax;
  }

  /**
   * Set the upper end of the range of PRF values that represents 95% of
   * observed values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than
   * US:PRFTypicalMin..
   * <p>
   * @param value a {@link US_PPS} instance
   * @since 3.1.0
   */
  public void setPRFTypicalMax(US_PPS value) {
    this.prfTypicalMax = value;
  }

  /**
   * Determine if the PRFTypicalMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFTypicalMax() {
    return (this.prfTypicalMax != null ? this.prfTypicalMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of PRF values that represents 95% of
   * observed values, from a statistical study.
   * <p>
   * @return a {@link US_PPS} instance
   * @since 3.1.0
   */
  public US_PPS getPRFTypicalMin() {
    return prfTypicalMin;
  }

  /**
   * Set the lower end of the range of PRF values that represents 95% of
   * observed values, from a statistical study.
   * <p>
   * @param value a {@link US_PPS} instance
   * @since 3.1.0
   */
  public void setPRFTypicalMin(US_PPS value) {
    this.prfTypicalMin = value;
  }

  /**
   * Determine if the PRFTypicalMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFTypicalMin() {
    return (this.prfTypicalMin != null ? this.prfTypicalMin.isSetValue() : false);
  }

  /**
   * Get the condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes)..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getPRIAdaptiveDriverDesc() {
    return priAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes)..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setPRIAdaptiveDriverDesc(S500 value) {
    this.priAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the PRIAdaptiveDriverDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIAdaptiveDriverDesc() {
    return (this.priAdaptiveDriverDesc != null ? this.priAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal PRI variations (aka, interpulse
   * modulation changes).
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getPRIAdaptiveRuleDesc() {
    return priAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal PRI variations (aka, interpulse
   * modulation changes).
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setPRIAdaptiveRuleDesc(S500 value) {
    this.priAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the PRIAdaptiveRuleDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIAdaptiveRuleDesc() {
    return (this.priAdaptiveRuleDesc != null ? this.priAdaptiveRuleDesc.isSetValue() : false);
  }

  /**
   * Get any regularly occurring signal values which do not fit in any of the
   * other PRI related fields. For example Minimum Scheduling Interval (MSI)
   * values, or Engagement Group Duration values can be documented in this
   * field.. When used, the data shall be clearly described, so all users
   * understand the meaning of the values..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getPRIAnomalousValues() {
    return priAnomalousValues;
  }

  /**
   * Set any regularly occurring signal values which do not fit in any of the
   * other PRI related fields. For example Minimum Scheduling Interval (MSI)
   * values, or Engagement Group Duration values can be documented in this
   * field.. When used, the data shall be clearly described, so all users
   * understand the meaning of the values..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setPRIAnomalousValues(S500 value) {
    this.priAnomalousValues = value;
  }

  /**
   * Determine if the PRIAnomalousValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIAnomalousValues() {
    return (this.priAnomalousValues != null ? this.priAnomalousValues.isSetValue() : false);
  }

  /**
   * Get the fundamental period of the emitter clock which is used to generate
   * the subject signal PRIs.
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIBasicClockPeriod() {
    return priBasicClockPeriod;
  }

  /**
   * Set the fundamental period of the emitter clock which is used to generate
   * the subject signal PRIs.
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIBasicClockPeriod(microsecs value) {
    this.priBasicClockPeriod = value;
  }

  /**
   * Determine if the PRIBasicClockPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIBasicClockPeriod() {
    return (this.priBasicClockPeriod != null ? this.priBasicClockPeriod.isSetValue() : false);
  }

  /**
   * Get the PRI change per unit of time, measured over a significant portion of
   * the waveform. This applies to Continuous PRI variations..
   * <p>
   * @return a {@link US_PRIChgRate} instance
   * @since 3.1.0
   */
  public US_PRIChgRate getPRIChangeRate() {
    return priChangeRate;
  }

  /**
   * Set the PRI change per unit of time, measured over a significant portion of
   * the waveform. This applies to Continuous PRI variations..
   * <p>
   * @param value a {@link US_PRIChgRate} instance
   * @since 3.1.0
   */
  public void setPRIChangeRate(US_PRIChgRate value) {
    this.priChangeRate = value;
  }

  /**
   * Determine if the PRIChangeRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIChangeRate() {
    return (this.priChangeRate != null ? this.priChangeRate.isSetValue() : false);
  }

  /**
   * Get In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges..
   * <p>
   * @return the PRIContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPRIContinuous() {
    return priContinuous;
  }

  /**
   * Set In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges..
   * <p>
   * @param value the PRIContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPRIContinuous(TString value) {
    this.priContinuous = value;
  }

  /**
   * Determine if the PRIContinuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIContinuous() {
    return (this.priContinuous != null ? this.priContinuous.isSetValue() : false);
  }

  /**
   * Get the integer (aka, count or countdown) associated with the PRI Crystal
   * value to provide the Pattern Period..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getPRICountdown() {
    return priCountdown;
  }

  /**
   * Set the integer (aka, count or countdown) associated with the PRI Crystal
   * value to provide the Pattern Period..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setPRICountdown(UN6 value) {
    this.priCountdown = value;
  }

  /**
   * Determine if the PRICountdown is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRICountdown() {
    return (this.priCountdown != null ? this.priCountdown.isSetValue() : false);
  }

  /**
   * Get the integer (aka, count or countdown) used to generate the PRI from the
   * PRI Crystal value..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getPRICountdownKey() {
    return priCountdownKey;
  }

  /**
   * Set the integer (aka, count or countdown) used to generate the PRI from the
   * PRI Crystal value..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setPRICountdownKey(UN9 value) {
    this.priCountdownKey = value;
  }

  /**
   * Determine if the PRICountdownKey is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRICountdownKey() {
    return (this.priCountdownKey != null ? this.priCountdownKey.isSetValue() : false);
  }

  /**
   * Get the maximum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than
   * US:PRIExtremeMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIExtremeMax() {
    return priExtremeMax;
  }

  /**
   * Set the maximum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than
   * US:PRIExtremeMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIExtremeMax(microsecs value) {
    this.priExtremeMax = value;
  }

  /**
   * Determine if the PRIExtremeMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIExtremeMax() {
    return (this.priExtremeMax != null ? this.priExtremeMax.isSetValue() : false);
  }

  /**
   * Get the minimum observed PRI value, from a statistical study of a 100% data
   * set..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIExtremeMin() {
    return priExtremeMin;
  }

  /**
   * Set the minimum observed PRI value, from a statistical study of a 100% data
   * set..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIExtremeMin(microsecs value) {
    this.priExtremeMin = value;
  }

  /**
   * Determine if the PRIExtremeMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIExtremeMin() {
    return (this.priExtremeMin != null ? this.priExtremeMin.isSetValue() : false);
  }

  /**
   * Get the time difference between a point on the leading edge of the frame
   * marker (or an alternate pulse in the frame), to the similar point on the
   * leading edge of the frame marker (or the alternate pulse) in the
   * next/consecutive frame..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIFramePeriod() {
    return priFramePeriod;
  }

  /**
   * Set the time difference between a point on the leading edge of the frame
   * marker (or an alternate pulse in the frame), to the similar point on the
   * leading edge of the frame marker (or the alternate pulse) in the
   * next/consecutive frame..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIFramePeriod(microsecs value) {
    this.priFramePeriod = value;
  }

  /**
   * Determine if the PRIFramePeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIFramePeriod() {
    return (this.priFramePeriod != null ? this.priFramePeriod.isSetValue() : false);
  }

  /**
   * Get the rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getPRIFrameRate() {
    return priFrameRate;
  }

  /**
   * Set the rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setPRIFrameRate(FreqM value) {
    this.priFrameRate = value;
  }

  /**
   * Determine if the PRIFrameRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIFrameRate() {
    return (this.priFrameRate != null ? this.priFrameRate.isSetValue() : false);
  }

  /**
   * Get the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIGroupPulseSpacing() {
    return priGroupPulseSpacing;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIGroupPulseSpacing(microsecs value) {
    this.priGroupPulseSpacing = value;
  }

  /**
   * Determine if the PRIGroupPulseSpacing is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIGroupPulseSpacing() {
    return (this.priGroupPulseSpacing != null ? this.priGroupPulseSpacing.isSetValue() : false);
  }

  /**
   * Get the PRI between two groups of pulses which both have constant but
   * different PRIs (aka, the PRI between consecutive PRI dwell groups)..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIGroupSpacing() {
    return priGroupSpacing;
  }

  /**
   * Set the PRI between two groups of pulses which both have constant but
   * different PRIs (aka, the PRI between consecutive PRI dwell groups)..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIGroupSpacing(microsecs value) {
    this.priGroupSpacing = value;
  }

  /**
   * Determine if the PRIGroupSpacing is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIGroupSpacing() {
    return (this.priGroupSpacing != null ? this.priGroupSpacing.isSetValue() : false);
  }

  /**
   * Get the average PRI value for a signal which changes PRI values on a
   * non-patterned basis..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIMean() {
    return priMean;
  }

  /**
   * Set the average PRI value for a signal which changes PRI values on a
   * non-patterned basis..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIMean(microsecs value) {
    this.priMean = value;
  }

  /**
   * Determine if the PRIMean is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIMean() {
    return (this.priMean != null ? this.priMean.isSetValue() : false);
  }

  /**
   * Get the observed PRI value that the signal most often used based on
   * statistical study of a data set..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIMedian() {
    return priMedian;
  }

  /**
   * Set the observed PRI value that the signal most often used based on
   * statistical study of a data set..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIMedian(microsecs value) {
    this.priMedian = value;
  }

  /**
   * Determine if the PRIMedian is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIMedian() {
    return (this.priMedian != null ? this.priMedian.isSetValue() : false);
  }

  /**
   * Get the observed PRI Crystal Counts used to generate the PRIs used most
   * often by the signal, based on statistical study of a data set..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getPRIMedianCountdowns() {
    return priMedianCountdowns;
  }

  /**
   * Set the observed PRI Crystal Counts used to generate the PRIs used most
   * often by the signal, based on statistical study of a data set..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setPRIMedianCountdowns(S100 value) {
    this.priMedianCountdowns = value;
  }

  /**
   * Determine if the PRIMedianCountdowns is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIMedianCountdowns() {
    return (this.priMedianCountdowns != null ? this.priMedianCountdowns.isSetValue() : false);
  }

  /**
   * Get the time duration for one complete cycle of a repeating PRI sequence..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIPatternPeriod() {
    return priPatternPeriod;
  }

  /**
   * Set the time duration for one complete cycle of a repeating PRI sequence..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIPatternPeriod(microsecs value) {
    this.priPatternPeriod = value;
  }

  /**
   * Determine if the PRIPatternPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIPatternPeriod() {
    return (this.priPatternPeriod != null ? this.priPatternPeriod.isSetValue() : false);
  }

  /**
   * Get whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive..
   * <p>
   * @return the PRIPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPRIPatternType() {
    return priPatternType;
  }

  /**
   * Set whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive..
   * <p>
   * @param value the PRIPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPRIPatternType(TString value) {
    this.priPatternType = value;
  }

  /**
   * Determine if the PRIPatternType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIPatternType() {
    return (this.priPatternType != null ? this.priPatternType.isSetValue() : false);
  }

  /**
   * Get the number of pulses in a pulse group..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getPRIPulsesPerGroup() {
    return priPulsesPerGroup;
  }

  /**
   * Set the number of pulses in a pulse group..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setPRIPulsesPerGroup(UN6 value) {
    this.priPulsesPerGroup = value;
  }

  /**
   * Determine if the PRIPulsesPerGroup is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIPulsesPerGroup() {
    return (this.priPulsesPerGroup != null ? this.priPulsesPerGroup.isSetValue() : false);
  }

  /**
   * Get a free text description of the PRI Sequence..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getPRISequenceDesc() {
    return priSequenceDesc;
  }

  /**
   * Set a free text description of the PRI Sequence..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setPRISequenceDesc(S500 value) {
    this.priSequenceDesc = value;
  }

  /**
   * Determine if the PRISequenceDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRISequenceDesc() {
    return (this.priSequenceDesc != null ? this.priSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the variation of a mean PRI value measured from one time to another
   * time.
   * <p>
   * @return a {@link US_PPM} instance
   * @since 3.1.0
   */
  public US_PPM getPRIStability() {
    return priStability;
  }

  /**
   * Set the variation of a mean PRI value measured from one time to another
   * time.
   * <p>
   * @param value a {@link US_PPM} instance
   * @since 3.1.0
   */
  public void setPRIStability(US_PPM value) {
    this.priStability = value;
  }

  /**
   * Determine if the PRIStability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIStability() {
    return (this.priStability != null ? this.priStability.isSetValue() : false);
  }

  /**
   * Get the time interval used to determine the PRI stability value..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIStabilitySamplePeriod() {
    return priStabilitySamplePeriod;
  }

  /**
   * Set the time interval used to determine the PRI stability value..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIStabilitySamplePeriod(microsecs value) {
    this.priStabilitySamplePeriod = value;
  }

  /**
   * Determine if the PRIStabilitySamplePeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIStabilitySamplePeriod() {
    return (this.priStabilitySamplePeriod != null ? this.priStabilitySamplePeriod.isSetValue() : false);
  }

  /**
   * Get the standard deviation associated with the data set used to calculate
   * the values entered in the PRI Mean fields.
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIStdDev() {
    return priStdDev;
  }

  /**
   * Set the standard deviation associated with the data set used to calculate
   * the values entered in the PRI Mean fields.
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIStdDev(microsecs value) {
    this.priStdDev = value;
  }

  /**
   * Determine if the PRIStdDev is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIStdDev() {
    return (this.priStdDev != null ? this.priStdDev.isSetValue() : false);
  }

  /**
   * Get the delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRIStep() {
    return priStep;
  }

  /**
   * Set the delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRIStep(microsecs value) {
    this.priStep = value;
  }

  /**
   * Determine if the PRIStep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIStep() {
    return (this.priStep != null ? this.priStep.isSetValue() : false);
  }

  /**
   * Get the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRISubframePeriod() {
    return priSubframePeriod;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRISubframePeriod(microsecs value) {
    this.priSubframePeriod = value;
  }

  /**
   * Determine if the PRISubframePeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRISubframePeriod() {
    return (this.priSubframePeriod != null ? this.priSubframePeriod.isSetValue() : false);
  }

  /**
   * Get the number of subframes detected during each PRI Subframe period..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getPRISubframeRate() {
    return priSubframeRate;
  }

  /**
   * Set the number of subframes detected during each PRI Subframe period..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setPRISubframeRate(FreqM value) {
    this.priSubframeRate = value;
  }

  /**
   * Determine if the PRISubframeRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRISubframeRate() {
    return (this.priSubframeRate != null ? this.priSubframeRate.isSetValue() : false);
  }

  /**
   * Get the PRI timing shift value, on Emitters with repeated timing shifts of
   * a predictable magnitude, but not predictable timing..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRITimingShift() {
    return priTimingShift;
  }

  /**
   * Set the PRI timing shift value, on Emitters with repeated timing shifts of
   * a predictable magnitude, but not predictable timing..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRITimingShift(microsecs value) {
    this.priTimingShift = value;
  }

  /**
   * Determine if the PRITimingShift is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRITimingShift() {
    return (this.priTimingShift != null ? this.priTimingShift.isSetValue() : false);
  }

  /**
   * Get the upper end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than
   * US:PRITypicalMin..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRITypicalMax() {
    return priTypicalMax;
  }

  /**
   * Set the upper end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than
   * US:PRITypicalMin..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRITypicalMax(microsecs value) {
    this.priTypicalMax = value;
  }

  /**
   * Determine if the PRITypicalMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRITypicalMax() {
    return (this.priTypicalMax != null ? this.priTypicalMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getPRITypicalMin() {
    return priTypicalMin;
  }

  /**
   * Set the lower end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setPRITypicalMin(microsecs value) {
    this.priTypicalMin = value;
  }

  /**
   * Determine if the PRITypicalMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRITypicalMin() {
    return (this.priTypicalMin != null ? this.priTypicalMin.isSetValue() : false);
  }

  /**
   * Get the time required for a pulse to rise from 10% to 90 percent of the
   * mean peak amplitude of the voltage pattern..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getRiseTime() {
    return riseTime;
  }

  /**
   * Set the time required for a pulse to rise from 10% to 90 percent of the
   * mean peak amplitude of the voltage pattern..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setRiseTime(microsecs value) {
    this.riseTime = value;
  }

  /**
   * Determine if the RiseTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRiseTime() {
    return (this.riseTime != null ? this.riseTime.isSetValue() : false);
  }

  /**
   * Get the US:ObservedPulseValues
   * <p>
   * Complex element ObservedPulseValues (US) contains data describing the
   * distinct Pulse values related to the Modulation Type..
   * <p>
   * @return a {@link ObservedPulseValues} instance
   * @since 3.1.0
   */
  public Set<ObservedPulseValues> getObservedPulseValues() {
    if (observedPulseValues == null) {
      observedPulseValues = new HashSet<>();
    }
    return this.observedPulseValues;
  }

  /**
   * Determine if the ObservedPulseValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPulseValues() {
    return ((this.observedPulseValues != null) && (!this.observedPulseValues.isEmpty()));
  }

  /**
   * Clear the ObservedPulseValues field. This sets the field to null.
   */
  public void unsetObservedPulseValues() {
    this.observedPulseValues = null;
  }

  /**
   * Set the time required for a pulse to fall from 90% to 10 percent of the
   * mean peak amplitude of its voltage waveform/envelope.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withFallTime(Double value) {
    setFallTime(new microsecs(value));
    return this;
  }

  /**
   * Set the number of pulses (i.e., positions) in a repeating sequence of
   * pulses which has multiple (2 or more) PD values.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withNumPDPositions(Integer value) {
    setNumPDPositions(new UN6(value));
    return this;
  }

  /**
   * Set the number of discrete PD values (i.e., elements) in a repeating
   * sequence of pulses which has multiple (2 or more) PD values.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withNumPDValues(Integer value) {
    setNumPDValues(new UN6(value));
    return this;
  }

  /**
   * Set the number of discrete PRI values in a repeating sequence of discrete
   * PRIs.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withNumPRIElements(Integer value) {
    setNumPRIElements(new UN6(value));
    return this;
  }

  /**
   * Set the number of time intervals between pulses or pulse groups, or the
   * number of PRI dwell groups, in a repeating PRI sequence which uses discrete
   * PRI values.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withNumPRIPositions(Integer value) {
    setNumPRIPositions(new UN6(value));
    return this;
  }

  /**
   * Set the rule which describes the signal PD variations (aka. modulation).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDAdaptiveRuleDesc(String value) {
    setPDAdaptiveRuleDesc(new S500(value));
    return this;
  }

  /**
   * Set In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDContinuous(ListCBO value) {
    setPDContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set the maximum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * [XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than
   * US:PDDwellMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDDwellMax(Double value) {
    setPDDwellMax(new microsecs(value));
    return this;
  }

  /**
   * Set the minimum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDDwellMin(Double value) {
    setPDDwellMin(new microsecs(value));
    return this;
  }

  /**
   * Set the maximum PD value that represents 100% of observed values.
   * <p>
   * [XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than
   * US:PDExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDExtremeMax(Double value) {
    setPDExtremeMax(new microsecs(value));
    return this;
  }

  /**
   * Set the minimum PD value that represents 100% of observed values.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDExtremeMin(Double value) {
    setPDExtremeMin(new microsecs(value));
    return this;
  }

  /**
   * Set the highest discrete PD value in a repeating sequence of pulses which
   * has multiple PD values
   * <p>
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDMax(Double value) {
    setPDMax(new microsecs(value));
    return this;
  }

  /**
   * Set the average PD of a signal which changes PD values on a non-patterned
   * basis.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDMean(Double value) {
    setPDMean(new microsecs(value));
    return this;
  }

  /**
   * Set the PD value that the signal most often used, based on a statistical
   * study.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDMedian(Double value) {
    setPDMedian(new microsecs(value));
    return this;
  }

  /**
   * Set the delta lowest discrete PD value in a repeating sequence of pulses
   * which has multiple PD values
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDMin(Double value) {
    setPDMin(new microsecs(value));
    return this;
  }

  /**
   * Set the time duration for one complete cycle of a repeating sequence of
   * pulses which has multiple (2 or more) PD values; the time duration shall go
   * from a point in one cycle to a like point in the next cycle.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDPatternPeriod(Double value) {
    setPDPatternPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item PDPatternType (US), Indicate whether PD is unmodulated or
   * pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDPatternType(ListUS7 value) {
    setPDPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set a freetext description of the PD Sequence.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDSequenceDesc(String value) {
    setPDSequenceDesc(new S500(value));
    return this;
  }

  /**
   * Set the standard deviation of the data sample used to calculate PD Mean.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDStdDev(Double value) {
    setPDStdDev(new microsecs(value));
    return this;
  }

  /**
   * Set the Step between adjacent PD values; pertains to discrete PD
   * variations.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDStep(Double value) {
    setPDStep(new microsecs(value));
    return this;
  }

  /**
   * Set the upper end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than
   * US:PDTypicalMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDTypicalMax(Double value) {
    setPDTypicalMax(new microsecs(value));
    return this;
  }

  /**
   * Set the lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPDTypicalMin(Double value) {
    setPDTypicalMin(new microsecs(value));
    return this;
  }

  /**
   * Set the rate of change for PD variations expressed as PD change per unit of
   * time.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRFChangeRate(Double value) {
    setPRFChangeRate(new US_PRIChgRate(value));
    return this;
  }

  /**
   * Set the minimum Observed PRF in the signal sample.
   * <p>
   * [XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than
   * US:PRFExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRFExtremeMax(Double value) {
    setPRFExtremeMax(new US_PPS(value));
    return this;
  }

  /**
   * Set the minimum Observed PRF in the signal sample.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRFExtremeMin(Double value) {
    setPRFExtremeMin(new US_PPS(value));
    return this;
  }

  /**
   * Set the highest discrete PRI value (convert PRI to PRF) which are found in
   * a single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRFMax(Double value) {
    setPRFMax(new US_PPS(value));
    return this;
  }

  /**
   * Set the lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRFMin(Double value) {
    setPRFMin(new US_PPS(value));
    return this;
  }

  /**
   * Set the upper end of the range of PRF values that represents 95% of
   * observed values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than
   * US:PRFTypicalMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRFTypicalMax(Double value) {
    setPRFTypicalMax(new US_PPS(value));
    return this;
  }

  /**
   * Set the lower end of the range of PRF values that represents 95% of
   * observed values, from a statistical study
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRFTypicalMin(Double value) {
    setPRFTypicalMin(new US_PPS(value));
    return this;
  }

  /**
   * Set the condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIAdaptiveDriverDesc(String value) {
    setPRIAdaptiveDriverDesc(new S500(value));
    return this;
  }

  /**
   * Set the rule which describes the signal PRI variations (aka, interpulse
   * modulation changes)
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIAdaptiveRuleDesc(String value) {
    setPRIAdaptiveRuleDesc(new S500(value));
    return this;
  }

  /**
   * Set any regularly occurring signal values which do not fit in any of the
   * other PRI related fields. For example Minimum Scheduling Interval (MSI)
   * values, or Engagement Group Duration values can be documented in this
   * field.. When used, the data shall be clearly described, so all users
   * understand the meaning of the values.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIAnomalousValues(String value) {
    setPRIAnomalousValues(new S500(value));
    return this;
  }

  /**
   * Set the fundamental period of the emitter clock which is used to generate
   * the subject signal PRIs
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIBasicClockPeriod(Double value) {
    setPRIBasicClockPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set the PRI change per unit of time, measured over a significant portion of
   * the waveform. This applies to Continuous PRI variations.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIChangeRate(Double value) {
    setPRIChangeRate(new US_PRIChgRate(value));
    return this;
  }

  /**
   * Set In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI
   * variations are Discrete or Continuous. Discrete uses a finite number of
   * fixed values separated by ranges of unused values. Continuous potentially
   * uses an infinite number of values within one or more ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIContinuous(ListCBO value) {
    setPRIContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set the integer (aka, count or countdown) associated with the PRI Crystal
   * value to provide the Pattern Period.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRICountdown(Integer value) {
    setPRICountdown(new UN6(value));
    return this;
  }

  /**
   * Set the integer (aka, count or countdown) used to generate the PRI from the
   * PRI Crystal value.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRICountdownKey(Integer value) {
    setPRICountdownKey(new UN9(value));
    return this;
  }

  /**
   * Set the maximum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than
   * US:PRIExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIExtremeMax(Double value) {
    setPRIExtremeMax(new microsecs(value));
    return this;
  }

  /**
   * Set the minimum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIExtremeMin(Double value) {
    setPRIExtremeMin(new microsecs(value));
    return this;
  }

  /**
   * Set the time difference between a point on the leading edge of the frame
   * marker (or an alternate pulse in the frame), to the similar point on the
   * leading edge of the frame marker (or the alternate pulse) in the
   * next/consecutive frame.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIFramePeriod(Double value) {
    setPRIFramePeriod(new microsecs(value));
    return this;
  }

  /**
   * Set the rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIFrameRate(Double value) {
    setPRIFrameRate(new FreqM(value));
    return this;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIGroupPulseSpacing(Double value) {
    setPRIGroupPulseSpacing(new microsecs(value));
    return this;
  }

  /**
   * Set the PRI between two groups of pulses which both have constant but
   * different PRIs (aka, the PRI between consecutive PRI dwell groups).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIGroupSpacing(Double value) {
    setPRIGroupSpacing(new microsecs(value));
    return this;
  }

  /**
   * Set the average PRI value for a signal which changes PRI values on a
   * non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIMean(Double value) {
    setPRIMean(new microsecs(value));
    return this;
  }

  /**
   * Set the observed PRI value that the signal most often used based on
   * statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIMedian(Double value) {
    setPRIMedian(new microsecs(value));
    return this;
  }

  /**
   * Set the observed PRI Crystal Counts used to generate the PRIs used most
   * often by the signal, based on statistical study of a data set.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIMedianCountdowns(String value) {
    setPRIMedianCountdowns(new S100(value));
    return this;
  }

  /**
   * Set the time duration for one complete cycle of a repeating PRI sequence.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIPatternPeriod(Double value) {
    setPRIPatternPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIPatternType(ListUS7 value) {
    setPRIPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set the number of pulses in a pulse group.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIPulsesPerGroup(Integer value) {
    setPRIPulsesPerGroup(new UN6(value));
    return this;
  }

  /**
   * Set a free text description of the PRI Sequence.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRISequenceDesc(String value) {
    setPRISequenceDesc(new S500(value));
    return this;
  }

  /**
   * Set the variation of a mean PRI value measured from one time to another
   * time
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIStability(Double value) {
    setPRIStability(new US_PPM(value));
    return this;
  }

  /**
   * Set the time interval used to determine the PRI stability value.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIStabilitySamplePeriod(Double value) {
    setPRIStabilitySamplePeriod(new microsecs(value));
    return this;
  }

  /**
   * Set the standard deviation associated with the data set used to calculate
   * the values entered in the PRI Mean fields
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIStdDev(Double value) {
    setPRIStdDev(new microsecs(value));
    return this;
  }

  /**
   * Set the delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRIStep(Double value) {
    setPRIStep(new microsecs(value));
    return this;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRISubframePeriod(Double value) {
    setPRISubframePeriod(new microsecs(value));
    return this;
  }

  /**
   * Set the number of subframes detected during each PRI Subframe period.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRISubframeRate(Double value) {
    setPRISubframeRate(new FreqM(value));
    return this;
  }

  /**
   * Set the PRI timing shift value, on Emitters with repeated timing shifts of
   * a predictable magnitude, but not predictable timing.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRITimingShift(Double value) {
    setPRITimingShift(new microsecs(value));
    return this;
  }

  /**
   * Set the upper end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than
   * US:PRITypicalMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRITypicalMax(Double value) {
    setPRITypicalMax(new microsecs(value));
    return this;
  }

  /**
   * Set the lower end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withPRITypicalMin(Double value) {
    setPRITypicalMin(new microsecs(value));
    return this;
  }

  /**
   * Set the time required for a pulse to rise from 10% to 90 percent of the
   * mean peak amplitude of the voltage pattern.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withRiseTime(Double value) {
    setRiseTime(new microsecs(value));
    return this;
  }

  /**
   * Set the US:ObservedPulseValues
   * <p>
   * Complex element ObservedPulseValues (US) contains data describing the
   * distinct Pulse values related to the Modulation Type.
   * <p>
   * @param values One or more instances of type {@link ObservedPulseValues}.
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withObservedPulseValues(ObservedPulseValues... values) {
    if (values != null) {
      getObservedPulseValues().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedPulseValues
   * <p>
   * Complex element ObservedPulseValues (US) contains data describing the
   * distinct Pulse values related to the Modulation Type.
   * <p>
   * @param values A collection of {@link ObservedPulseValues} instances
   * @return The current ObservedPulseAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPulseAnalysis withObservedPulseValues(Collection<ObservedPulseValues> values) {
    if (values != null) {
      getObservedPulseValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedPulseAnalysis instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  ObservedPulseAnalysis {"
           + (fallTime != null ? " fallTime [" + fallTime + "]" : "")
           + (numPDPositions != null ? " numPDPositions [" + numPDPositions + "]" : "")
           + (numPDValues != null ? " numPDValues [" + numPDValues + "]" : "")
           + (numPRIElements != null ? " numPRIElements [" + numPRIElements + "]" : "")
           + (numPRIPositions != null ? " numPRIPositions [" + numPRIPositions + "]" : "")
           + (observedPulseValues != null ? " observedPulseValues [" + observedPulseValues + "]" : "")
           + (pdAdaptiveRuleDesc != null ? " pdAdaptiveRuleDesc [" + pdAdaptiveRuleDesc + "]" : "")
           + (pdContinuous != null ? " pdContinuous [" + pdContinuous + "]" : "")
           + (pdDwellMax != null ? " pdDwellMax [" + pdDwellMax + "]" : "")
           + (pdDwellMin != null ? " pdDwellMin [" + pdDwellMin + "]" : "")
           + (pdExtremeMax != null ? " pdExtremeMax [" + pdExtremeMax + "]" : "")
           + (pdExtremeMin != null ? " pdExtremeMin [" + pdExtremeMin + "]" : "")
           + (pdMax != null ? " pdMax [" + pdMax + "]" : "")
           + (pdMean != null ? " pdMean [" + pdMean + "]" : "")
           + (pdMedian != null ? " pdMedian [" + pdMedian + "]" : "")
           + (pdMin != null ? " pdMin [" + pdMin + "]" : "")
           + (pdPatternPeriod != null ? " pdPatternPeriod [" + pdPatternPeriod + "]" : "")
           + (pdPatternType != null ? " pdPatternType [" + pdPatternType + "]" : "")
           + (pdSequenceDesc != null ? " pdSequenceDesc [" + pdSequenceDesc + "]" : "")
           + (pdStdDev != null ? " pdStdDev [" + pdStdDev + "]" : "")
           + (pdStep != null ? " pdStep [" + pdStep + "]" : "")
           + (pdTypicalMax != null ? " pdTypicalMax [" + pdTypicalMax + "]" : "")
           + (pdTypicalMin != null ? " pdTypicalMin [" + pdTypicalMin + "]" : "")
           + (prfChangeRate != null ? " prfChangeRate [" + prfChangeRate + "]" : "")
           + (prfExtremeMax != null ? " prfExtremeMax [" + prfExtremeMax + "]" : "")
           + (prfExtremeMin != null ? " prfExtremeMin [" + prfExtremeMin + "]" : "")
           + (prfMax != null ? " prfMax [" + prfMax + "]" : "")
           + (prfMin != null ? " prfMin [" + prfMin + "]" : "")
           + (prfTypicalMax != null ? " prfTypicalMax [" + prfTypicalMax + "]" : "")
           + (prfTypicalMin != null ? " prfTypicalMin [" + prfTypicalMin + "]" : "")
           + (priAdaptiveDriverDesc != null ? " priAdaptiveDriverDesc [" + priAdaptiveDriverDesc + "]" : "")
           + (priAdaptiveRuleDesc != null ? " priAdaptiveRuleDesc [" + priAdaptiveRuleDesc + "]" : "")
           + (priAnomalousValues != null ? " priAnomalousValues [" + priAnomalousValues + "]" : "")
           + (priBasicClockPeriod != null ? " priBasicClockPeriod [" + priBasicClockPeriod + "]" : "")
           + (priChangeRate != null ? " priChangeRate [" + priChangeRate + "]" : "")
           + (priContinuous != null ? " priContinuous [" + priContinuous + "]" : "")
           + (priCountdown != null ? " priCountdown [" + priCountdown + "]" : "")
           + (priCountdownKey != null ? " priCountdownKey [" + priCountdownKey + "]" : "")
           + (priExtremeMax != null ? " priExtremeMax [" + priExtremeMax + "]" : "")
           + (priExtremeMin != null ? " priExtremeMin [" + priExtremeMin + "]" : "")
           + (priFramePeriod != null ? " priFramePeriod [" + priFramePeriod + "]" : "")
           + (priFrameRate != null ? " priFrameRate [" + priFrameRate + "]" : "")
           + (priGroupPulseSpacing != null ? " priGroupPulseSpacing [" + priGroupPulseSpacing + "]" : "")
           + (priGroupSpacing != null ? " priGroupSpacing [" + priGroupSpacing + "]" : "")
           + (priMean != null ? " priMean [" + priMean + "]" : "")
           + (priMedian != null ? " priMedian [" + priMedian + "]" : "")
           + (priMedianCountdowns != null ? " priMedianCountdowns [" + priMedianCountdowns + "]" : "")
           + (priPatternPeriod != null ? " priPatternPeriod [" + priPatternPeriod + "]" : "")
           + (priPatternType != null ? " priPatternType [" + priPatternType + "]" : "")
           + (priPulsesPerGroup != null ? " priPulsesPerGroup [" + priPulsesPerGroup + "]" : "")
           + (priSequenceDesc != null ? " priSequenceDesc [" + priSequenceDesc + "]" : "")
           + (priStability != null ? " priStability [" + priStability + "]" : "")
           + (priStabilitySamplePeriod != null ? " priStabilitySamplePeriod [" + priStabilitySamplePeriod + "]" : "")
           + (priStdDev != null ? " priStdDev [" + priStdDev + "]" : "")
           + (priStep != null ? " priStep [" + priStep + "]" : "")
           + (priSubframePeriod != null ? " priSubframePeriod [" + priSubframePeriod + "]" : "")
           + (priSubframeRate != null ? " priSubframeRate [" + priSubframeRate + "]" : "")
           + (priTimingShift != null ? " priTimingShift [" + priTimingShift + "]" : "")
           + (priTypicalMax != null ? " priTypicalMax [" + priTypicalMax + "]" : "")
           + (priTypicalMin != null ? " priTypicalMin [" + priTypicalMin + "]" : "")
           + (riseTime != null ? " riseTime [" + riseTime + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPulseAnalysis} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
