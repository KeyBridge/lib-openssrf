/* 
 * Copyright 2014 Key Bridge Global LLC.
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "FallTime", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal fallTime;
  /**
   * US:NumPDPositions - Num PD Positions (Optional)
   * <p>
   * The number of pulses (i.e., positions) in a repeating sequence of pulses
   * which has multiple (2 or more) PD values.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumPDPositions", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numPDPositions;
  /**
   * US:NumPDValues - Num PD Values (Optional)
   * <p>
   * The number of discrete PD values (i.e., elements) in a repeating sequence
   * of pulses which has multiple (2 or more) PD values.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumPDValues", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numPDValues;
  /**
   * US:NumPRIElements - Num PRI Elements (Optional)
   * <p>
   * The number of discrete PRI values in a repeating sequence of discrete PRIs.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumPRIElements", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numPRIElements;
  /**
   * US:NumPRIPositions - Num PRI Positions (Optional)
   * <p>
   * The number of time intervals between pulses or pulse groups, or the number
   * of PRI dwell groups, in a repeating PRI sequence which uses discrete PRI
   * values.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumPRIPositions", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numPRIPositions;
  /**
   * US:PDAdaptiveRuleDesc - PD Adaptive Rule Description (Optional)
   * <p>
   * The rule which describes the signal PD variations (aka. modulation).
   * <p>
   * Format is S500
   */
  @XmlElement(name = "PDAdaptiveRuleDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString pdAdaptiveRuleDesc;
  /**
   * PDContinuous (US), indicate whether pulse-to-pulse PD variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
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
   */
  @XmlElement(name = "PDDwellMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdDwellMax;
  /**
   * US:PDDwellMin - PD Dwell Min (Optional)
   * <p>
   * The minimum time duration for a complete dwell/group of pulses which all
   * have the same PD value.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDDwellMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdDwellMin;
  /**
   * US:PDExtremeMax - Maximum PD Extreme (Optional)
   * <p>
   * The maximum PD value that represents 100% of observed values.
   * <p>
   * [XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than
   * US:PDExtremeMin.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDExtremeMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdExtremeMax;
  /**
   * US:PDExtremeMin - Minimum PD Extreme (Optional)
   * <p>
   * The minimum PD value that represents 100% of observed values.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDExtremeMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdExtremeMin;
  /**
   * US:PDMax - Maximum PD (Optional)
   * <p>
   * The highest discrete PD value in a repeating sequence of pulses which has
   * multiple PD values
   * <p>
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMax;
  /**
   * US:PDMean - Average PD (Optional)
   * <p>
   * The average PD of a signal which changes PD values on a non-patterned
   * basis.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDMean", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMean;
  /**
   * US:PDMedian - PD Median (Optional)
   * <p>
   * The PD value that the signal most often used, based on a statistical study.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDMedian", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMedian;
  /**
   * US:PDMin - Minimum PD (Optional)
   * <p>
   * The delta lowest discrete PD value in a repeating sequence of pulses which
   * has multiple PD values
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMin;
  /**
   * US:PDPatternPeriod - PD Pattern Period (Optional)
   * <p>
   * The time duration for one complete cycle of a repeating sequence of pulses
   * which has multiple (2 or more) PD values; the time duration shall go from a
   * point in one cycle to a like point in the next cycle.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDPatternPeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdPatternPeriod;
  /**
   * PDPatternType (US), Indicate whether PD is unmodulated or pulse-to-pulse PD
   * variations are Patterned, Non-Patterned, or Adaptive.
   */
  @XmlElement(name = "PDPatternType", required = false)
  private TString pdPatternType;
  /**
   * US:PDSequenceDesc - PD Sequence Description (Optional)
   * <p>
   * A freetext description of the PD Sequence.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "PDSequenceDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString pdSequenceDesc;
  /**
   * US:PDStdDev - PD Standard Deviation (Optional)
   * <p>
   * The standard deviation of the data sample used to calculate PD Mean.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDStdDev", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdStdDev;
  /**
   * US:PDStep - PD Step (Optional)
   * <p>
   * The Step between adjacent PD values; pertains to discrete PD variations.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDStep", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdStep;
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
   */
  @XmlElement(name = "PDTypicalMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdTypicalMax;
  /**
   * US:PDTypicalMin - Minimum PD Typical (Optional)
   * <p>
   * The lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PDTypicalMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdTypicalMin;
  /**
   * US:PRFChangeRate - PRF Change Rate (Optional)
   * <p>
   * The rate of change for PD variations expressed as PD change per unit of
   * time.
   * <p>
   * Format is UN(12,6) (μsec/sec)
   */
  @XmlElement(name = "PRFChangeRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PRICHGRATE.class)
  private TDecimal prfChangeRate;
  /**
   * US:PRFExtremeMax - Maximum PRF Extreme (Optional)
   * <p>
   * The minimum Observed PRF in the signal sample.
   * <p>
   * [XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than
   * US:PRFExtremeMin.
   * <p>
   * Format is UN(7,2) (pps)
   */
  @XmlElement(name = "PRFExtremeMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PPS.class)
  private TDecimal prfExtremeMax;
  /**
   * US:PRFExtremeMin - Minimum PRF Extreme (Optional)
   * <p>
   * The minimum Observed PRF in the signal sample.
   * <p>
   * Format is UN(7,2) (pps)
   */
  @XmlElement(name = "PRFExtremeMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PPS.class)
  private TDecimal prfExtremeMin;
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
   */
  @XmlElement(name = "PRFMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PPS.class)
  private TDecimal prfMax;
  /**
   * US:PRFMin - PRF Min (Optional)
   * <p>
   * The lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * Format is UN(7,2) (pps)
   */
  @XmlElement(name = "PRFMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PPS.class)
  private TDecimal prfMin;
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
   */
  @XmlElement(name = "PRFTypicalMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PPS.class)
  private TDecimal prfTypicalMax;
  /**
   * US:PRFTypicalMin - Minimum PRF Typical (Optional)
   * <p>
   * The lower end of the range of PRF values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * Format is UN(7,2) (pps)
   */
  @XmlElement(name = "PRFTypicalMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PPS.class)
  private TDecimal prfTypicalMin;
  /**
   * US:PRIAdaptiveDriverDesc - PRI Adaptive Driver Description (Optional)
   * <p>
   * The condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes).
   * <p>
   * Format is S500
   */
  @XmlElement(name = "PRIAdaptiveDriverDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString priAdaptiveDriverDesc;
  /**
   * US:PRIAdaptiveRuleDesc - PRI Adaptive Rule Description (Optional)
   * <p>
   * The rule which describes the signal PRI variations (aka, interpulse
   * modulation changes)
   * <p>
   * Format is S500
   */
  @XmlElement(name = "PRIAdaptiveRuleDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString priAdaptiveRuleDesc;
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
   */
  @XmlElement(name = "PRIAnomalousValues", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString priAnomalousValues;
  /**
   * US:PRIBasicClockPeriod - PRI Basic Clock Period (Optional)
   * <p>
   * The fundamental period of the emitter clock which is used to generate the
   * subject signal PRIs
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIBasicClockPeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priBasicClockPeriod;
  /**
   * US:PRIChangeRate - PRI Change Rate (Optional)
   * <p>
   * The PRI change per unit of time, measured over a significant portion of the
   * waveform. This applies to Continuous PRI variations.
   * <p>
   * Format is UN(12,6) (μsec/sec)
   */
  @XmlElement(name = "PRIChangeRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PRICHGRATE.class)
  private TDecimal priChangeRate;
  /**
   * PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
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
   */
  @XmlElement(name = "PRICountdown", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger priCountdown;
  /**
   * US:PRICountdownKey - PRI Countdown Key (Optional)
   * <p>
   * The integer (aka, count or countdown) used to generate the PRI from the PRI
   * Crystal value.
   * <p>
   * Format is UN(9)
   */
  @XmlElement(name = "PRICountdownKey", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger priCountdownKey;
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
   */
  @XmlElement(name = "PRIExtremeMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priExtremeMax;
  /**
   * US:PRIExtremeMin - PRI Extreme Min (Optional)
   * <p>
   * The minimum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIExtremeMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priExtremeMin;
  /**
   * US:PRIFramePeriod - PRI Frame Period (Optional)
   * <p>
   * The time difference between a point on the leading edge of the frame marker
   * (or an alternate pulse in the frame), to the similar point on the leading
   * edge of the frame marker (or the alternate pulse) in the next/consecutive
   * frame.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIFramePeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priFramePeriod;
  /**
   * US:PRIFrameRate - PRI Frame Rate (Optional)
   * <p>
   * The rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "PRIFrameRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal priFrameRate;
  /**
   * US:PRIGroupPulseSpacing - PRI Group Pulse Spacing (Optional)
   * <p>
   * The time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIGroupPulseSpacing", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priGroupPulseSpacing;
  /**
   * US:PRIGroupSpacing - PRI Group Spacing (Optional)
   * <p>
   * The PRI between two groups of pulses which both have constant but different
   * PRIs (aka, the PRI between consecutive PRI dwell groups).
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIGroupSpacing", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priGroupSpacing;
  /**
   * US:PRIMean - Average PRI (Optional)
   * <p>
   * The average PRI value for a signal which changes PRI values on a
   * non-patterned basis.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIMean", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priMean;
  /**
   * US:PRIMedian - PRI Median (Optional)
   * <p>
   * The observed PRI value that the signal most often used based on statistical
   * study of a data set.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIMedian", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priMedian;
  /**
   * US:PRIMedianCountdowns - PRI Median Countdowns (Optional)
   * <p>
   * The observed PRI Crystal Counts used to generate the PRIs used most often
   * by the signal, based on statistical study of a data set.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "PRIMedianCountdowns", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString priMedianCountdowns;
  /**
   * US:PRIPatternPeriod - PRI Pattern Period (Optional)
   * <p>
   * The time duration for one complete cycle of a repeating PRI sequence.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIPatternPeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priPatternPeriod;
  /**
   * US:PRIPatternType - PRI Pattern Type (Optional)
   * <p>
   * Whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive.
   * <p>
   * Format is L:US7
   */
  @XmlElement(name = "PRIPatternType", required = false)
  private TString priPatternType;
  /**
   * US:PRIPulsesPerGroup - PRI Pulses Per Group (Optional)
   * <p>
   * The number of pulses in a pulse group.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "PRIPulsesPerGroup", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger priPulsesPerGroup;
  /**
   * US:PRISequenceDesc - PRI Sequence Description (Optional)
   * <p>
   * A free text description of the PRI Sequence.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "PRISequenceDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString priSequenceDesc;
  /**
   * US:PRIStability - PRI Stability (Optional)
   * <p>
   * The variation of a mean PRI value measured from one time to another time
   * <p>
   * Format is UN(18,6) (ppm)
   */
  @XmlElement(name = "PRIStability", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_PPM.class)
  private TDecimal priStability;
  /**
   * US:PRIStabilitySamplePeriod - PRI Stability Sample Period (Optional)
   * <p>
   * The time interval used to determine the PRI stability value.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIStabilitySamplePeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priStabilitySamplePeriod;
  /**
   * US:PRIStdDev - PRI Standard Deviation (Optional)
   * <p>
   * The standard deviation associated with the data set used to calculate the
   * values entered in the PRI Mean fields
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIStdDev", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priStdDev;
  /**
   * US:PRIStep - PRI Step (Optional)
   * <p>
   * The delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRIStep", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priStep;
  /**
   * US:PRISubframePeriod - PRI Subframe Period (Optional)
   * <p>
   * The time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRISubframePeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priSubframePeriod;
  /**
   * US:PRISubframeRate - PRI Subframe Rate (Optional)
   * <p>
   * The number of subframes detected during each PRI Subframe period.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "PRISubframeRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal priSubframeRate;
  /**
   * US:PRITimingShift - PRI Timing Shift (Optional)
   * <p>
   * The PRI timing shift value, on Emitters with repeated timing shifts of a
   * predictable magnitude, but not predictable timing.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRITimingShift", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priTimingShift;
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
   */
  @XmlElement(name = "PRITypicalMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priTypicalMax;
  /**
   * US:PRITypicalMin - PRI Typical Min (Optional)
   * <p>
   * The lower end of the range of PRI values that represent 95% of the signal
   * observed PRI values, from a statistical study of a data set.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "PRITypicalMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal priTypicalMin;
  /**
   * US:RiseTime - RiseTime (Optional)
   * <p>
   * The time required for a pulse to rise from 10% to 90 percent of the mean
   * peak amplitude of the voltage pattern.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "RiseTime", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal riseTime;
  /**
   * US:ObservedPulseValues (Optional)
   * <p>
   * ObservedPulseValues (US) contains data describing the distinct Pulse values
   * related to the Modulation Type.
   */
  @XmlElement(name = "ObservedPulseValues")
  private Set<ObservedPulseValues> observedPulseValues;

  /**
   * Get the time required for a pulse to fall from 90% to 10 percent of the
   * mean peak amplitude of its voltage waveform/envelope.
   * <p>
   * @return the FallTime value in a {@link TDecimal} data type
   */
  public TDecimal getFallTime() {
    return fallTime;
  }

  /**
   * Set the time required for a pulse to fall from 90% to 10 percent of the
   * mean peak amplitude of its voltage waveform/envelope.
   * <p>
   * @param value the FallTime value in a {@link TDecimal} data type
   */
  public void setFallTime(TDecimal value) {
    this.fallTime = value;
  }

  /**
   * Determine if the FallTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFallTime() {
    return (this.fallTime != null ? this.fallTime.isSetValue() : false);
  }

  /**
   * Get the number of pulses (i.e., positions) in a repeating sequence of
   * pulses which has multiple (2 or more) PD values.
   * <p>
   * @return the NumPDPositions value in a {@link TInteger} data type
   */
  public TInteger getNumPDPositions() {
    return numPDPositions;
  }

  /**
   * Set the number of pulses (i.e., positions) in a repeating sequence of
   * pulses which has multiple (2 or more) PD values.
   * <p>
   * @param value the NumPDPositions value in a {@link TInteger} data type
   */
  public void setNumPDPositions(TInteger value) {
    this.numPDPositions = value;
  }

  /**
   * Determine if the NumPDPositions is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPDPositions() {
    return (this.numPDPositions != null ? this.numPDPositions.isSetValue() : false);
  }

  /**
   * Get the number of discrete PD values (i.e., elements) in a repeating
   * sequence of pulses which has multiple (2 or more) PD values.
   * <p>
   * @return the NumPDValues value in a {@link TInteger} data type
   */
  public TInteger getNumPDValues() {
    return numPDValues;
  }

  /**
   * Set the number of discrete PD values (i.e., elements) in a repeating
   * sequence of pulses which has multiple (2 or more) PD values.
   * <p>
   * @param value the NumPDValues value in a {@link TInteger} data type
   */
  public void setNumPDValues(TInteger value) {
    this.numPDValues = value;
  }

  /**
   * Determine if the NumPDValues is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPDValues() {
    return (this.numPDValues != null ? this.numPDValues.isSetValue() : false);
  }

  /**
   * Get the number of discrete PRI values in a repeating sequence of discrete
   * PRIs.
   * <p>
   * @return the NumPRIElements value in a {@link TInteger} data type
   */
  public TInteger getNumPRIElements() {
    return numPRIElements;
  }

  /**
   * Set the number of discrete PRI values in a repeating sequence of discrete
   * PRIs.
   * <p>
   * @param value the NumPRIElements value in a {@link TInteger} data type
   */
  public void setNumPRIElements(TInteger value) {
    this.numPRIElements = value;
  }

  /**
   * Determine if the NumPRIElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPRIElements() {
    return (this.numPRIElements != null ? this.numPRIElements.isSetValue() : false);
  }

  /**
   * Get the number of time intervals between pulses or pulse groups, or the
   * number of PRI dwell groups, in a repeating PRI sequence which uses discrete
   * PRI values.
   * <p>
   * @return the NumPRIPositions value in a {@link TInteger} data type
   */
  public TInteger getNumPRIPositions() {
    return numPRIPositions;
  }

  /**
   * Set the number of time intervals between pulses or pulse groups, or the
   * number of PRI dwell groups, in a repeating PRI sequence which uses discrete
   * PRI values.
   * <p>
   * @param value the NumPRIPositions value in a {@link TInteger} data type
   */
  public void setNumPRIPositions(TInteger value) {
    this.numPRIPositions = value;
  }

  /**
   * Determine if the NumPRIPositions is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumPRIPositions() {
    return (this.numPRIPositions != null ? this.numPRIPositions.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal PD variations (aka. modulation).
   * <p>
   * @return the PDAdaptiveRuleDesc value in a {@link TString} data type
   */
  public TString getPDAdaptiveRuleDesc() {
    return pdAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal PD variations (aka. modulation).
   * <p>
   * @param value the PDAdaptiveRuleDesc value in a {@link TString} data type
   */
  public void setPDAdaptiveRuleDesc(TString value) {
    this.pdAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the PDAdaptiveRuleDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDAdaptiveRuleDesc() {
    return (this.pdAdaptiveRuleDesc != null ? this.pdAdaptiveRuleDesc.isSetValue() : false);
  }

  /**
   * Get PDContinuous (US), indicate whether pulse-to-pulse PD variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @return the PDContinuous value in a {@link TString} data type
   */
  public TString getPDContinuous() {
    return pdContinuous;
  }

  /**
   * Set PDContinuous (US), indicate whether pulse-to-pulse PD variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @param value the PDContinuous value in a {@link TString} data type
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
   * US:PDDwellMin.
   * <p>
   * @return the PDDwellMax value in a {@link TDecimal} data type
   */
  public TDecimal getPDDwellMax() {
    return pdDwellMax;
  }

  /**
   * Set the maximum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * [XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than
   * US:PDDwellMin.
   * <p>
   * @param value the PDDwellMax value in a {@link TDecimal} data type
   */
  public void setPDDwellMax(TDecimal value) {
    this.pdDwellMax = value;
  }

  /**
   * Determine if the PDDwellMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDDwellMax() {
    return (this.pdDwellMax != null ? this.pdDwellMax.isSetValue() : false);
  }

  /**
   * Get the minimum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * @return the PDDwellMin value in a {@link TDecimal} data type
   */
  public TDecimal getPDDwellMin() {
    return pdDwellMin;
  }

  /**
   * Set the minimum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * @param value the PDDwellMin value in a {@link TDecimal} data type
   */
  public void setPDDwellMin(TDecimal value) {
    this.pdDwellMin = value;
  }

  /**
   * Determine if the PDDwellMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:PDExtremeMin.
   * <p>
   * @return the PDExtremeMax value in a {@link TDecimal} data type
   */
  public TDecimal getPDExtremeMax() {
    return pdExtremeMax;
  }

  /**
   * Set the maximum PD value that represents 100% of observed values.
   * <p>
   * [XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than
   * US:PDExtremeMin.
   * <p>
   * @param value the PDExtremeMax value in a {@link TDecimal} data type
   */
  public void setPDExtremeMax(TDecimal value) {
    this.pdExtremeMax = value;
  }

  /**
   * Determine if the PDExtremeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDExtremeMax() {
    return (this.pdExtremeMax != null ? this.pdExtremeMax.isSetValue() : false);
  }

  /**
   * Get the minimum PD value that represents 100% of observed values.
   * <p>
   * @return the PDExtremeMin value in a {@link TDecimal} data type
   */
  public TDecimal getPDExtremeMin() {
    return pdExtremeMin;
  }

  /**
   * Set the minimum PD value that represents 100% of observed values.
   * <p>
   * @param value the PDExtremeMin value in a {@link TDecimal} data type
   */
  public void setPDExtremeMin(TDecimal value) {
    this.pdExtremeMin = value;
  }

  /**
   * Determine if the PDExtremeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.
   * <p>
   * @return the PDMax value in a {@link TDecimal} data type
   */
  public TDecimal getPDMax() {
    return pdMax;
  }

  /**
   * Set the highest discrete PD value in a repeating sequence of pulses which
   * has multiple PD values
   * <p>
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.
   * <p>
   * @param value the PDMax value in a {@link TDecimal} data type
   */
  public void setPDMax(TDecimal value) {
    this.pdMax = value;
  }

  /**
   * Determine if the PDMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMax() {
    return (this.pdMax != null ? this.pdMax.isSetValue() : false);
  }

  /**
   * Get the average PD of a signal which changes PD values on a non-patterned
   * basis.
   * <p>
   * @return the PDMean value in a {@link TDecimal} data type
   */
  public TDecimal getPDMean() {
    return pdMean;
  }

  /**
   * Set the average PD of a signal which changes PD values on a non-patterned
   * basis.
   * <p>
   * @param value the PDMean value in a {@link TDecimal} data type
   */
  public void setPDMean(TDecimal value) {
    this.pdMean = value;
  }

  /**
   * Determine if the PDMean is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMean() {
    return (this.pdMean != null ? this.pdMean.isSetValue() : false);
  }

  /**
   * Get the PD value that the signal most often used, based on a statistical
   * study.
   * <p>
   * @return the PDMedian value in a {@link TDecimal} data type
   */
  public TDecimal getPDMedian() {
    return pdMedian;
  }

  /**
   * Set the PD value that the signal most often used, based on a statistical
   * study.
   * <p>
   * @param value the PDMedian value in a {@link TDecimal} data type
   */
  public void setPDMedian(TDecimal value) {
    this.pdMedian = value;
  }

  /**
   * Determine if the PDMedian is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMedian() {
    return (this.pdMedian != null ? this.pdMedian.isSetValue() : false);
  }

  /**
   * Get the delta lowest discrete PD value in a repeating sequence of pulses
   * which has multiple PD values
   * <p>
   * @return the PDMin value in a {@link TDecimal} data type
   */
  public TDecimal getPDMin() {
    return pdMin;
  }

  /**
   * Set the delta lowest discrete PD value in a repeating sequence of pulses
   * which has multiple PD values
   * <p>
   * @param value the PDMin value in a {@link TDecimal} data type
   */
  public void setPDMin(TDecimal value) {
    this.pdMin = value;
  }

  /**
   * Determine if the PDMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDMin() {
    return (this.pdMin != null ? this.pdMin.isSetValue() : false);
  }

  /**
   * Get the time duration for one complete cycle of a repeating sequence of
   * pulses which has multiple (2 or more) PD values; the time duration shall go
   * from a point in one cycle to a like point in the next cycle.
   * <p>
   * @return the PDPatternPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getPDPatternPeriod() {
    return pdPatternPeriod;
  }

  /**
   * Set the time duration for one complete cycle of a repeating sequence of
   * pulses which has multiple (2 or more) PD values; the time duration shall go
   * from a point in one cycle to a like point in the next cycle.
   * <p>
   * @param value the PDPatternPeriod value in a {@link TDecimal} data type
   */
  public void setPDPatternPeriod(TDecimal value) {
    this.pdPatternPeriod = value;
  }

  /**
   * Determine if the PDPatternPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDPatternPeriod() {
    return (this.pdPatternPeriod != null ? this.pdPatternPeriod.isSetValue() : false);
  }

  /**
   * Get PDPatternType (US), Indicate whether PD is unmodulated or
   * pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @return the PDPatternType value in a {@link TString} data type
   */
  public TString getPDPatternType() {
    return pdPatternType;
  }

  /**
   * Set PDPatternType (US), Indicate whether PD is unmodulated or
   * pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value the PDPatternType value in a {@link TString} data type
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
   * Get a freetext description of the PD Sequence.
   * <p>
   * @return the PDSequenceDesc value in a {@link TString} data type
   */
  public TString getPDSequenceDesc() {
    return pdSequenceDesc;
  }

  /**
   * Set a freetext description of the PD Sequence.
   * <p>
   * @param value the PDSequenceDesc value in a {@link TString} data type
   */
  public void setPDSequenceDesc(TString value) {
    this.pdSequenceDesc = value;
  }

  /**
   * Determine if the PDSequenceDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDSequenceDesc() {
    return (this.pdSequenceDesc != null ? this.pdSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the standard deviation of the data sample used to calculate PD Mean.
   * <p>
   * @return the PDStdDev value in a {@link TDecimal} data type
   */
  public TDecimal getPDStdDev() {
    return pdStdDev;
  }

  /**
   * Set the standard deviation of the data sample used to calculate PD Mean.
   * <p>
   * @param value the PDStdDev value in a {@link TDecimal} data type
   */
  public void setPDStdDev(TDecimal value) {
    this.pdStdDev = value;
  }

  /**
   * Determine if the PDStdDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDStdDev() {
    return (this.pdStdDev != null ? this.pdStdDev.isSetValue() : false);
  }

  /**
   * Get the Step between adjacent PD values; pertains to discrete PD
   * variations.
   * <p>
   * @return the PDStep value in a {@link TDecimal} data type
   */
  public TDecimal getPDStep() {
    return pdStep;
  }

  /**
   * Set the Step between adjacent PD values; pertains to discrete PD
   * variations.
   * <p>
   * @param value the PDStep value in a {@link TDecimal} data type
   */
  public void setPDStep(TDecimal value) {
    this.pdStep = value;
  }

  /**
   * Determine if the PDStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:PDTypicalMin.
   * <p>
   * @return the PDTypicalMax value in a {@link TDecimal} data type
   */
  public TDecimal getPDTypicalMax() {
    return pdTypicalMax;
  }

  /**
   * Set the upper end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than
   * US:PDTypicalMin.
   * <p>
   * @param value the PDTypicalMax value in a {@link TDecimal} data type
   */
  public void setPDTypicalMax(TDecimal value) {
    this.pdTypicalMax = value;
  }

  /**
   * Determine if the PDTypicalMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDTypicalMax() {
    return (this.pdTypicalMax != null ? this.pdTypicalMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * @return the PDTypicalMin value in a {@link TDecimal} data type
   */
  public TDecimal getPDTypicalMin() {
    return pdTypicalMin;
  }

  /**
   * Set the lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * @param value the PDTypicalMin value in a {@link TDecimal} data type
   */
  public void setPDTypicalMin(TDecimal value) {
    this.pdTypicalMin = value;
  }

  /**
   * Determine if the PDTypicalMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPDTypicalMin() {
    return (this.pdTypicalMin != null ? this.pdTypicalMin.isSetValue() : false);
  }

  /**
   * Get the rate of change for PD variations expressed as PD change per unit of
   * time.
   * <p>
   * @return the PRFChangeRate value in a {@link TDecimal} data type
   */
  public TDecimal getPRFChangeRate() {
    return prfChangeRate;
  }

  /**
   * Set the rate of change for PD variations expressed as PD change per unit of
   * time.
   * <p>
   * @param value the PRFChangeRate value in a {@link TDecimal} data type
   */
  public void setPRFChangeRate(TDecimal value) {
    this.prfChangeRate = value;
  }

  /**
   * Determine if the PRFChangeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:PRFExtremeMin.
   * <p>
   * @return the PRFExtremeMax value in a {@link TDecimal} data type
   */
  public TDecimal getPRFExtremeMax() {
    return prfExtremeMax;
  }

  /**
   * Set the minimum Observed PRF in the signal sample.
   * <p>
   * [XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than
   * US:PRFExtremeMin.
   * <p>
   * @param value the PRFExtremeMax value in a {@link TDecimal} data type
   */
  public void setPRFExtremeMax(TDecimal value) {
    this.prfExtremeMax = value;
  }

  /**
   * Determine if the PRFExtremeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFExtremeMax() {
    return (this.prfExtremeMax != null ? this.prfExtremeMax.isSetValue() : false);
  }

  /**
   * Get the minimum Observed PRF in the signal sample.
   * <p>
   * @return the PRFExtremeMin value in a {@link TDecimal} data type
   */
  public TDecimal getPRFExtremeMin() {
    return prfExtremeMin;
  }

  /**
   * Set the minimum Observed PRF in the signal sample.
   * <p>
   * @param value the PRFExtremeMin value in a {@link TDecimal} data type
   */
  public void setPRFExtremeMin(TDecimal value) {
    this.prfExtremeMin = value;
  }

  /**
   * Determine if the PRFExtremeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * [XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.
   * <p>
   * @return the PRFMax value in a {@link TDecimal} data type
   */
  public TDecimal getPRFMax() {
    return prfMax;
  }

  /**
   * Set the highest discrete PRI value (convert PRI to PRF) which are found in
   * a single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.
   * <p>
   * @param value the PRFMax value in a {@link TDecimal} data type
   */
  public void setPRFMax(TDecimal value) {
    this.prfMax = value;
  }

  /**
   * Determine if the PRFMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFMax() {
    return (this.prfMax != null ? this.prfMax.isSetValue() : false);
  }

  /**
   * Get the lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * @return the PRFMin value in a {@link TDecimal} data type
   */
  public TDecimal getPRFMin() {
    return prfMin;
  }

  /**
   * Set the lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * @param value the PRFMin value in a {@link TDecimal} data type
   */
  public void setPRFMin(TDecimal value) {
    this.prfMin = value;
  }

  /**
   * Determine if the PRFMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:PRFTypicalMin.
   * <p>
   * @return the PRFTypicalMax value in a {@link TDecimal} data type
   */
  public TDecimal getPRFTypicalMax() {
    return prfTypicalMax;
  }

  /**
   * Set the upper end of the range of PRF values that represents 95% of
   * observed values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than
   * US:PRFTypicalMin.
   * <p>
   * @param value the PRFTypicalMax value in a {@link TDecimal} data type
   */
  public void setPRFTypicalMax(TDecimal value) {
    this.prfTypicalMax = value;
  }

  /**
   * Determine if the PRFTypicalMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFTypicalMax() {
    return (this.prfTypicalMax != null ? this.prfTypicalMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of PRF values that represents 95% of
   * observed values, from a statistical study
   * <p>
   * @return the PRFTypicalMin value in a {@link TDecimal} data type
   */
  public TDecimal getPRFTypicalMin() {
    return prfTypicalMin;
  }

  /**
   * Set the lower end of the range of PRF values that represents 95% of
   * observed values, from a statistical study
   * <p>
   * @param value the PRFTypicalMin value in a {@link TDecimal} data type
   */
  public void setPRFTypicalMin(TDecimal value) {
    this.prfTypicalMin = value;
  }

  /**
   * Determine if the PRFTypicalMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRFTypicalMin() {
    return (this.prfTypicalMin != null ? this.prfTypicalMin.isSetValue() : false);
  }

  /**
   * Get the condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes).
   * <p>
   * @return the PRIAdaptiveDriverDesc value in a {@link TString} data type
   */
  public TString getPRIAdaptiveDriverDesc() {
    return priAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes).
   * <p>
   * @param value the PRIAdaptiveDriverDesc value in a {@link TString} data type
   */
  public void setPRIAdaptiveDriverDesc(TString value) {
    this.priAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the PRIAdaptiveDriverDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIAdaptiveDriverDesc() {
    return (this.priAdaptiveDriverDesc != null ? this.priAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal PRI variations (aka, interpulse
   * modulation changes)
   * <p>
   * @return the PRIAdaptiveRuleDesc value in a {@link TString} data type
   */
  public TString getPRIAdaptiveRuleDesc() {
    return priAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal PRI variations (aka, interpulse
   * modulation changes)
   * <p>
   * @param value the PRIAdaptiveRuleDesc value in a {@link TString} data type
   */
  public void setPRIAdaptiveRuleDesc(TString value) {
    this.priAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the PRIAdaptiveRuleDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * understand the meaning of the values.
   * <p>
   * @return the PRIAnomalousValues value in a {@link TString} data type
   */
  public TString getPRIAnomalousValues() {
    return priAnomalousValues;
  }

  /**
   * Set any regularly occurring signal values which do not fit in any of the
   * other PRI related fields. For example Minimum Scheduling Interval (MSI)
   * values, or Engagement Group Duration values can be documented in this
   * field.. When used, the data shall be clearly described, so all users
   * understand the meaning of the values.
   * <p>
   * @param value the PRIAnomalousValues value in a {@link TString} data type
   */
  public void setPRIAnomalousValues(TString value) {
    this.priAnomalousValues = value;
  }

  /**
   * Determine if the PRIAnomalousValues is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIAnomalousValues() {
    return (this.priAnomalousValues != null ? this.priAnomalousValues.isSetValue() : false);
  }

  /**
   * Get the fundamental period of the emitter clock which is used to generate
   * the subject signal PRIs
   * <p>
   * @return the PRIBasicClockPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getPRIBasicClockPeriod() {
    return priBasicClockPeriod;
  }

  /**
   * Set the fundamental period of the emitter clock which is used to generate
   * the subject signal PRIs
   * <p>
   * @param value the PRIBasicClockPeriod value in a {@link TDecimal} data type
   */
  public void setPRIBasicClockPeriod(TDecimal value) {
    this.priBasicClockPeriod = value;
  }

  /**
   * Determine if the PRIBasicClockPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIBasicClockPeriod() {
    return (this.priBasicClockPeriod != null ? this.priBasicClockPeriod.isSetValue() : false);
  }

  /**
   * Get the PRI change per unit of time, measured over a significant portion of
   * the waveform. This applies to Continuous PRI variations.
   * <p>
   * @return the PRIChangeRate value in a {@link TDecimal} data type
   */
  public TDecimal getPRIChangeRate() {
    return priChangeRate;
  }

  /**
   * Set the PRI change per unit of time, measured over a significant portion of
   * the waveform. This applies to Continuous PRI variations.
   * <p>
   * @param value the PRIChangeRate value in a {@link TDecimal} data type
   */
  public void setPRIChangeRate(TDecimal value) {
    this.priChangeRate = value;
  }

  /**
   * Determine if the PRIChangeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIChangeRate() {
    return (this.priChangeRate != null ? this.priChangeRate.isSetValue() : false);
  }

  /**
   * Get PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @return the PRIContinuous value in a {@link TString} data type
   */
  public TString getPRIContinuous() {
    return priContinuous;
  }

  /**
   * Set PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @param value the PRIContinuous value in a {@link TString} data type
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
   * value to provide the Pattern Period.
   * <p>
   * @return the PRICountdown value in a {@link TInteger} data type
   */
  public TInteger getPRICountdown() {
    return priCountdown;
  }

  /**
   * Set the integer (aka, count or countdown) associated with the PRI Crystal
   * value to provide the Pattern Period.
   * <p>
   * @param value the PRICountdown value in a {@link TInteger} data type
   */
  public void setPRICountdown(TInteger value) {
    this.priCountdown = value;
  }

  /**
   * Determine if the PRICountdown is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRICountdown() {
    return (this.priCountdown != null ? this.priCountdown.isSetValue() : false);
  }

  /**
   * Get the integer (aka, count or countdown) used to generate the PRI from the
   * PRI Crystal value.
   * <p>
   * @return the PRICountdownKey value in a {@link TInteger} data type
   */
  public TInteger getPRICountdownKey() {
    return priCountdownKey;
  }

  /**
   * Set the integer (aka, count or countdown) used to generate the PRI from the
   * PRI Crystal value.
   * <p>
   * @param value the PRICountdownKey value in a {@link TInteger} data type
   */
  public void setPRICountdownKey(TInteger value) {
    this.priCountdownKey = value;
  }

  /**
   * Determine if the PRICountdownKey is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
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
   * US:PRIExtremeMin.
   * <p>
   * @return the PRIExtremeMax value in a {@link TDecimal} data type
   */
  public TDecimal getPRIExtremeMax() {
    return priExtremeMax;
  }

  /**
   * Set the maximum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than
   * US:PRIExtremeMin.
   * <p>
   * @param value the PRIExtremeMax value in a {@link TDecimal} data type
   */
  public void setPRIExtremeMax(TDecimal value) {
    this.priExtremeMax = value;
  }

  /**
   * Determine if the PRIExtremeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIExtremeMax() {
    return (this.priExtremeMax != null ? this.priExtremeMax.isSetValue() : false);
  }

  /**
   * Get the minimum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * @return the PRIExtremeMin value in a {@link TDecimal} data type
   */
  public TDecimal getPRIExtremeMin() {
    return priExtremeMin;
  }

  /**
   * Set the minimum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * @param value the PRIExtremeMin value in a {@link TDecimal} data type
   */
  public void setPRIExtremeMin(TDecimal value) {
    this.priExtremeMin = value;
  }

  /**
   * Determine if the PRIExtremeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * next/consecutive frame.
   * <p>
   * @return the PRIFramePeriod value in a {@link TDecimal} data type
   */
  public TDecimal getPRIFramePeriod() {
    return priFramePeriod;
  }

  /**
   * Set the time difference between a point on the leading edge of the frame
   * marker (or an alternate pulse in the frame), to the similar point on the
   * leading edge of the frame marker (or the alternate pulse) in the
   * next/consecutive frame.
   * <p>
   * @param value the PRIFramePeriod value in a {@link TDecimal} data type
   */
  public void setPRIFramePeriod(TDecimal value) {
    this.priFramePeriod = value;
  }

  /**
   * Determine if the PRIFramePeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIFramePeriod() {
    return (this.priFramePeriod != null ? this.priFramePeriod.isSetValue() : false);
  }

  /**
   * Get the rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz.
   * <p>
   * @return the PRIFrameRate value in a {@link TDecimal} data type
   */
  public TDecimal getPRIFrameRate() {
    return priFrameRate;
  }

  /**
   * Set the rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz.
   * <p>
   * @param value the PRIFrameRate value in a {@link TDecimal} data type
   */
  public void setPRIFrameRate(TDecimal value) {
    this.priFrameRate = value;
  }

  /**
   * Determine if the PRIFrameRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * subframe) in the next/consecutive frame.
   * <p>
   * @return the PRIGroupPulseSpacing value in a {@link TDecimal} data type
   */
  public TDecimal getPRIGroupPulseSpacing() {
    return priGroupPulseSpacing;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * @param value the PRIGroupPulseSpacing value in a {@link TDecimal} data type
   */
  public void setPRIGroupPulseSpacing(TDecimal value) {
    this.priGroupPulseSpacing = value;
  }

  /**
   * Determine if the PRIGroupPulseSpacing is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIGroupPulseSpacing() {
    return (this.priGroupPulseSpacing != null ? this.priGroupPulseSpacing.isSetValue() : false);
  }

  /**
   * Get the PRI between two groups of pulses which both have constant but
   * different PRIs (aka, the PRI between consecutive PRI dwell groups).
   * <p>
   * @return the PRIGroupSpacing value in a {@link TDecimal} data type
   */
  public TDecimal getPRIGroupSpacing() {
    return priGroupSpacing;
  }

  /**
   * Set the PRI between two groups of pulses which both have constant but
   * different PRIs (aka, the PRI between consecutive PRI dwell groups).
   * <p>
   * @param value the PRIGroupSpacing value in a {@link TDecimal} data type
   */
  public void setPRIGroupSpacing(TDecimal value) {
    this.priGroupSpacing = value;
  }

  /**
   * Determine if the PRIGroupSpacing is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIGroupSpacing() {
    return (this.priGroupSpacing != null ? this.priGroupSpacing.isSetValue() : false);
  }

  /**
   * Get the average PRI value for a signal which changes PRI values on a
   * non-patterned basis.
   * <p>
   * @return the PRIMean value in a {@link TDecimal} data type
   */
  public TDecimal getPRIMean() {
    return priMean;
  }

  /**
   * Set the average PRI value for a signal which changes PRI values on a
   * non-patterned basis.
   * <p>
   * @param value the PRIMean value in a {@link TDecimal} data type
   */
  public void setPRIMean(TDecimal value) {
    this.priMean = value;
  }

  /**
   * Determine if the PRIMean is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIMean() {
    return (this.priMean != null ? this.priMean.isSetValue() : false);
  }

  /**
   * Get the observed PRI value that the signal most often used based on
   * statistical study of a data set.
   * <p>
   * @return the PRIMedian value in a {@link TDecimal} data type
   */
  public TDecimal getPRIMedian() {
    return priMedian;
  }

  /**
   * Set the observed PRI value that the signal most often used based on
   * statistical study of a data set.
   * <p>
   * @param value the PRIMedian value in a {@link TDecimal} data type
   */
  public void setPRIMedian(TDecimal value) {
    this.priMedian = value;
  }

  /**
   * Determine if the PRIMedian is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIMedian() {
    return (this.priMedian != null ? this.priMedian.isSetValue() : false);
  }

  /**
   * Get the observed PRI Crystal Counts used to generate the PRIs used most
   * often by the signal, based on statistical study of a data set.
   * <p>
   * @return the PRIMedianCountdowns value in a {@link TString} data type
   */
  public TString getPRIMedianCountdowns() {
    return priMedianCountdowns;
  }

  /**
   * Set the observed PRI Crystal Counts used to generate the PRIs used most
   * often by the signal, based on statistical study of a data set.
   * <p>
   * @param value the PRIMedianCountdowns value in a {@link TString} data type
   */
  public void setPRIMedianCountdowns(TString value) {
    this.priMedianCountdowns = value;
  }

  /**
   * Determine if the PRIMedianCountdowns is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIMedianCountdowns() {
    return (this.priMedianCountdowns != null ? this.priMedianCountdowns.isSetValue() : false);
  }

  /**
   * Get the time duration for one complete cycle of a repeating PRI sequence.
   * <p>
   * @return the PRIPatternPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getPRIPatternPeriod() {
    return priPatternPeriod;
  }

  /**
   * Set the time duration for one complete cycle of a repeating PRI sequence.
   * <p>
   * @param value the PRIPatternPeriod value in a {@link TDecimal} data type
   */
  public void setPRIPatternPeriod(TDecimal value) {
    this.priPatternPeriod = value;
  }

  /**
   * Determine if the PRIPatternPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIPatternPeriod() {
    return (this.priPatternPeriod != null ? this.priPatternPeriod.isSetValue() : false);
  }

  /**
   * Get whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @return the PRIPatternType value in a {@link TString} data type
   */
  public TString getPRIPatternType() {
    return priPatternType;
  }

  /**
   * Set whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value the PRIPatternType value in a {@link TString} data type
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
   * Get the number of pulses in a pulse group.
   * <p>
   * @return the PRIPulsesPerGroup value in a {@link TInteger} data type
   */
  public TInteger getPRIPulsesPerGroup() {
    return priPulsesPerGroup;
  }

  /**
   * Set the number of pulses in a pulse group.
   * <p>
   * @param value the PRIPulsesPerGroup value in a {@link TInteger} data type
   */
  public void setPRIPulsesPerGroup(TInteger value) {
    this.priPulsesPerGroup = value;
  }

  /**
   * Determine if the PRIPulsesPerGroup is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIPulsesPerGroup() {
    return (this.priPulsesPerGroup != null ? this.priPulsesPerGroup.isSetValue() : false);
  }

  /**
   * Get a free text description of the PRI Sequence.
   * <p>
   * @return the PRISequenceDesc value in a {@link TString} data type
   */
  public TString getPRISequenceDesc() {
    return priSequenceDesc;
  }

  /**
   * Set a free text description of the PRI Sequence.
   * <p>
   * @param value the PRISequenceDesc value in a {@link TString} data type
   */
  public void setPRISequenceDesc(TString value) {
    this.priSequenceDesc = value;
  }

  /**
   * Determine if the PRISequenceDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRISequenceDesc() {
    return (this.priSequenceDesc != null ? this.priSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the variation of a mean PRI value measured from one time to another
   * time
   * <p>
   * @return the PRIStability value in a {@link TDecimal} data type
   */
  public TDecimal getPRIStability() {
    return priStability;
  }

  /**
   * Set the variation of a mean PRI value measured from one time to another
   * time
   * <p>
   * @param value the PRIStability value in a {@link TDecimal} data type
   */
  public void setPRIStability(TDecimal value) {
    this.priStability = value;
  }

  /**
   * Determine if the PRIStability is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIStability() {
    return (this.priStability != null ? this.priStability.isSetValue() : false);
  }

  /**
   * Get the time interval used to determine the PRI stability value.
   * <p>
   * @return the PRIStabilitySamplePeriod value in a {@link TDecimal} data type
   */
  public TDecimal getPRIStabilitySamplePeriod() {
    return priStabilitySamplePeriod;
  }

  /**
   * Set the time interval used to determine the PRI stability value.
   * <p>
   * @param value the PRIStabilitySamplePeriod value in a {@link TDecimal} data
   *              type
   */
  public void setPRIStabilitySamplePeriod(TDecimal value) {
    this.priStabilitySamplePeriod = value;
  }

  /**
   * Determine if the PRIStabilitySamplePeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIStabilitySamplePeriod() {
    return (this.priStabilitySamplePeriod != null ? this.priStabilitySamplePeriod.isSetValue() : false);
  }

  /**
   * Get the standard deviation associated with the data set used to calculate
   * the values entered in the PRI Mean fields
   * <p>
   * @return the PRIStdDev value in a {@link TDecimal} data type
   */
  public TDecimal getPRIStdDev() {
    return priStdDev;
  }

  /**
   * Set the standard deviation associated with the data set used to calculate
   * the values entered in the PRI Mean fields
   * <p>
   * @param value the PRIStdDev value in a {@link TDecimal} data type
   */
  public void setPRIStdDev(TDecimal value) {
    this.priStdDev = value;
  }

  /**
   * Determine if the PRIStdDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRIStdDev() {
    return (this.priStdDev != null ? this.priStdDev.isSetValue() : false);
  }

  /**
   * Get the delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI.
   * <p>
   * @return the PRIStep value in a {@link TDecimal} data type
   */
  public TDecimal getPRIStep() {
    return priStep;
  }

  /**
   * Set the delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI.
   * <p>
   * @param value the PRIStep value in a {@link TDecimal} data type
   */
  public void setPRIStep(TDecimal value) {
    this.priStep = value;
  }

  /**
   * Determine if the PRIStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * subframe) in the next/consecutive frame.
   * <p>
   * @return the PRISubframePeriod value in a {@link TDecimal} data type
   */
  public TDecimal getPRISubframePeriod() {
    return priSubframePeriod;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * @param value the PRISubframePeriod value in a {@link TDecimal} data type
   */
  public void setPRISubframePeriod(TDecimal value) {
    this.priSubframePeriod = value;
  }

  /**
   * Determine if the PRISubframePeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRISubframePeriod() {
    return (this.priSubframePeriod != null ? this.priSubframePeriod.isSetValue() : false);
  }

  /**
   * Get the number of subframes detected during each PRI Subframe period.
   * <p>
   * @return the PRISubframeRate value in a {@link TDecimal} data type
   */
  public TDecimal getPRISubframeRate() {
    return priSubframeRate;
  }

  /**
   * Set the number of subframes detected during each PRI Subframe period.
   * <p>
   * @param value the PRISubframeRate value in a {@link TDecimal} data type
   */
  public void setPRISubframeRate(TDecimal value) {
    this.priSubframeRate = value;
  }

  /**
   * Determine if the PRISubframeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRISubframeRate() {
    return (this.priSubframeRate != null ? this.priSubframeRate.isSetValue() : false);
  }

  /**
   * Get the PRI timing shift value, on Emitters with repeated timing shifts of
   * a predictable magnitude, but not predictable timing.
   * <p>
   * @return the PRITimingShift value in a {@link TDecimal} data type
   */
  public TDecimal getPRITimingShift() {
    return priTimingShift;
  }

  /**
   * Set the PRI timing shift value, on Emitters with repeated timing shifts of
   * a predictable magnitude, but not predictable timing.
   * <p>
   * @param value the PRITimingShift value in a {@link TDecimal} data type
   */
  public void setPRITimingShift(TDecimal value) {
    this.priTimingShift = value;
  }

  /**
   * Determine if the PRITimingShift is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:PRITypicalMin.
   * <p>
   * @return the PRITypicalMax value in a {@link TDecimal} data type
   */
  public TDecimal getPRITypicalMax() {
    return priTypicalMax;
  }

  /**
   * Set the upper end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than
   * US:PRITypicalMin.
   * <p>
   * @param value the PRITypicalMax value in a {@link TDecimal} data type
   */
  public void setPRITypicalMax(TDecimal value) {
    this.priTypicalMax = value;
  }

  /**
   * Determine if the PRITypicalMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRITypicalMax() {
    return (this.priTypicalMax != null ? this.priTypicalMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * @return the PRITypicalMin value in a {@link TDecimal} data type
   */
  public TDecimal getPRITypicalMin() {
    return priTypicalMin;
  }

  /**
   * Set the lower end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * @param value the PRITypicalMin value in a {@link TDecimal} data type
   */
  public void setPRITypicalMin(TDecimal value) {
    this.priTypicalMin = value;
  }

  /**
   * Determine if the PRITypicalMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPRITypicalMin() {
    return (this.priTypicalMin != null ? this.priTypicalMin.isSetValue() : false);
  }

  /**
   * Get the time required for a pulse to rise from 10% to 90 percent of the
   * mean peak amplitude of the voltage pattern.
   * <p>
   * @return the RiseTime value in a {@link TDecimal} data type
   */
  public TDecimal getRiseTime() {
    return riseTime;
  }

  /**
   * Set the time required for a pulse to rise from 10% to 90 percent of the
   * mean peak amplitude of the voltage pattern.
   * <p>
   * @param value the RiseTime value in a {@link TDecimal} data type
   */
  public void setRiseTime(TDecimal value) {
    this.riseTime = value;
  }

  /**
   * Determine if the RiseTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * distinct Pulse values related to the Modulation Type.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedPulseValues}
   *         instances
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
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withFallTime(Double value) {
    setFallTime(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of pulses (i.e., positions) in a repeating sequence of
   * pulses which has multiple (2 or more) PD values.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withNumPDPositions(Integer value) {
    setNumPDPositions(new TInteger(value));
    return this;
  }

  /**
   * Set the number of discrete PD values (i.e., elements) in a repeating
   * sequence of pulses which has multiple (2 or more) PD values.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withNumPDValues(Integer value) {
    setNumPDValues(new TInteger(value));
    return this;
  }

  /**
   * Set the number of discrete PRI values in a repeating sequence of discrete
   * PRIs.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withNumPRIElements(Integer value) {
    setNumPRIElements(new TInteger(value));
    return this;
  }

  /**
   * Set the number of time intervals between pulses or pulse groups, or the
   * number of PRI dwell groups, in a repeating PRI sequence which uses discrete
   * PRI values.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withNumPRIPositions(Integer value) {
    setNumPRIPositions(new TInteger(value));
    return this;
  }

  /**
   * Set the rule which describes the signal PD variations (aka. modulation).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDAdaptiveRuleDesc(String value) {
    setPDAdaptiveRuleDesc(new TString(value));
    return this;
  }

  /**
   * Set PDContinuous (US), indicate whether pulse-to-pulse PD variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedPulseAnalysis object instance
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
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDDwellMax(Double value) {
    setPDDwellMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum time duration for a complete dwell/group of pulses which
   * all have the same PD value.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDDwellMin(Double value) {
    setPDDwellMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum PD value that represents 100% of observed values.
   * <p>
   * [XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than
   * US:PDExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDExtremeMax(Double value) {
    setPDExtremeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum PD value that represents 100% of observed values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDExtremeMin(Double value) {
    setPDExtremeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the highest discrete PD value in a repeating sequence of pulses which
   * has multiple PD values
   * <p>
   * [XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDMax(Double value) {
    setPDMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the average PD of a signal which changes PD values on a non-patterned
   * basis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDMean(Double value) {
    setPDMean(new TDecimal(value));
    return this;
  }

  /**
   * Set the PD value that the signal most often used, based on a statistical
   * study.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDMedian(Double value) {
    setPDMedian(new TDecimal(value));
    return this;
  }

  /**
   * Set the delta lowest discrete PD value in a repeating sequence of pulses
   * which has multiple PD values
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDMin(Double value) {
    setPDMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the time duration for one complete cycle of a repeating sequence of
   * pulses which has multiple (2 or more) PD values; the time duration shall go
   * from a point in one cycle to a like point in the next cycle.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDPatternPeriod(Double value) {
    setPDPatternPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set PDPatternType (US), Indicate whether PD is unmodulated or
   * pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDPatternType(ListUS7 value) {
    setPDPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set a freetext description of the PD Sequence.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDSequenceDesc(String value) {
    setPDSequenceDesc(new TString(value));
    return this;
  }

  /**
   * Set the standard deviation of the data sample used to calculate PD Mean.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDStdDev(Double value) {
    setPDStdDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the Step between adjacent PD values; pertains to discrete PD
   * variations.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDStep(Double value) {
    setPDStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the upper end of the range of PD values that represents 95% of observed
   * values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than
   * US:PDTypicalMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDTypicalMax(Double value) {
    setPDTypicalMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lower end of the range of PD values that represents 95% of observed
   * values, from a statistical study
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPDTypicalMin(Double value) {
    setPDTypicalMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the rate of change for PD variations expressed as PD change per unit of
   * time.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRFChangeRate(Double value) {
    setPRFChangeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum Observed PRF in the signal sample.
   * <p>
   * [XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than
   * US:PRFExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRFExtremeMax(Double value) {
    setPRFExtremeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum Observed PRF in the signal sample.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRFExtremeMin(Double value) {
    setPRFExtremeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the highest discrete PRI value (convert PRI to PRF) which are found in
   * a single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRFMax(Double value) {
    setPRFMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lowest discrete PRI value (convert PRI to PRF) which are found in a
   * single intercept that contains the complete PRI characteristics for that
   * specific data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRFMin(Double value) {
    setPRFMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the upper end of the range of PRF values that represents 95% of
   * observed values, from a statistical study.
   * <p>
   * [XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than
   * US:PRFTypicalMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRFTypicalMax(Double value) {
    setPRFTypicalMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lower end of the range of PRF values that represents 95% of
   * observed values, from a statistical study
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRFTypicalMin(Double value) {
    setPRFTypicalMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the condition which controls or can be associated with the signal PRI
   * variations (aka, interpulse modulation changes).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIAdaptiveDriverDesc(String value) {
    setPRIAdaptiveDriverDesc(new TString(value));
    return this;
  }

  /**
   * Set the rule which describes the signal PRI variations (aka, interpulse
   * modulation changes)
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIAdaptiveRuleDesc(String value) {
    setPRIAdaptiveRuleDesc(new TString(value));
    return this;
  }

  /**
   * Set any regularly occurring signal values which do not fit in any of the
   * other PRI related fields. For example Minimum Scheduling Interval (MSI)
   * values, or Engagement Group Duration values can be documented in this
   * field.. When used, the data shall be clearly described, so all users
   * understand the meaning of the values.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIAnomalousValues(String value) {
    setPRIAnomalousValues(new TString(value));
    return this;
  }

  /**
   * Set the fundamental period of the emitter clock which is used to generate
   * the subject signal PRIs
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIBasicClockPeriod(Double value) {
    setPRIBasicClockPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the PRI change per unit of time, measured over a significant portion of
   * the waveform. This applies to Continuous PRI variations.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIChangeRate(Double value) {
    setPRIChangeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIContinuous(ListCBO value) {
    setPRIContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set the integer (aka, count or countdown) associated with the PRI Crystal
   * value to provide the Pattern Period.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRICountdown(Integer value) {
    setPRICountdown(new TInteger(value));
    return this;
  }

  /**
   * Set the integer (aka, count or countdown) used to generate the PRI from the
   * PRI Crystal value.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRICountdownKey(Integer value) {
    setPRICountdownKey(new TInteger(value));
    return this;
  }

  /**
   * Set the maximum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than
   * US:PRIExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIExtremeMax(Double value) {
    setPRIExtremeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum observed PRI value, from a statistical study of a 100% data
   * set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIExtremeMin(Double value) {
    setPRIExtremeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the time difference between a point on the leading edge of the frame
   * marker (or an alternate pulse in the frame), to the similar point on the
   * leading edge of the frame marker (or the alternate pulse) in the
   * next/consecutive frame.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIFramePeriod(Double value) {
    setPRIFramePeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the rate of frame generation during the Pulse Repetition Interval. For
   * example, 10 frames generated during a PRI of 1 us yields a PRI frame rate
   * of 10 MHz.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIFrameRate(Double value) {
    setPRIFrameRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIGroupPulseSpacing(Double value) {
    setPRIGroupPulseSpacing(new TDecimal(value));
    return this;
  }

  /**
   * Set the PRI between two groups of pulses which both have constant but
   * different PRIs (aka, the PRI between consecutive PRI dwell groups).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIGroupSpacing(Double value) {
    setPRIGroupSpacing(new TDecimal(value));
    return this;
  }

  /**
   * Set the average PRI value for a signal which changes PRI values on a
   * non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIMean(Double value) {
    setPRIMean(new TDecimal(value));
    return this;
  }

  /**
   * Set the observed PRI value that the signal most often used based on
   * statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIMedian(Double value) {
    setPRIMedian(new TDecimal(value));
    return this;
  }

  /**
   * Set the observed PRI Crystal Counts used to generate the PRIs used most
   * often by the signal, based on statistical study of a data set.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIMedianCountdowns(String value) {
    setPRIMedianCountdowns(new TString(value));
    return this;
  }

  /**
   * Set the time duration for one complete cycle of a repeating PRI sequence.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIPatternPeriod(Double value) {
    setPRIPatternPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set whether the PRI is unmodulated or pulse-to-pulse PRI variations are
   * Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIPatternType(ListUS7 value) {
    setPRIPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set the number of pulses in a pulse group.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIPulsesPerGroup(Integer value) {
    setPRIPulsesPerGroup(new TInteger(value));
    return this;
  }

  /**
   * Set a free text description of the PRI Sequence.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRISequenceDesc(String value) {
    setPRISequenceDesc(new TString(value));
    return this;
  }

  /**
   * Set the variation of a mean PRI value measured from one time to another
   * time
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIStability(Double value) {
    setPRIStability(new TDecimal(value));
    return this;
  }

  /**
   * Set the time interval used to determine the PRI stability value.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIStabilitySamplePeriod(Double value) {
    setPRIStabilitySamplePeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the standard deviation associated with the data set used to calculate
   * the values entered in the PRI Mean fields
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIStdDev(Double value) {
    setPRIStdDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the delta between the Most Probable observed PRI values of adjacent and
   * discrete PRI.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRIStep(Double value) {
    setPRIStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the time difference between a point on the leading edge of the subframe
   * marker (or an alternate pulse in the subframe), to the similar point on the
   * leading edge of the subframe marker (or the alternate pulse in the
   * subframe) in the next/consecutive frame.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRISubframePeriod(Double value) {
    setPRISubframePeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of subframes detected during each PRI Subframe period.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRISubframeRate(Double value) {
    setPRISubframeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the PRI timing shift value, on Emitters with repeated timing shifts of
   * a predictable magnitude, but not predictable timing.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRITimingShift(Double value) {
    setPRITimingShift(new TDecimal(value));
    return this;
  }

  /**
   * Set the upper end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than
   * US:PRITypicalMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRITypicalMax(Double value) {
    setPRITypicalMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lower end of the range of PRI values that represent 95% of the
   * signal observed PRI values, from a statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withPRITypicalMin(Double value) {
    setPRITypicalMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the time required for a pulse to rise from 10% to 90 percent of the
   * mean peak amplitude of the voltage pattern.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withRiseTime(Double value) {
    setRiseTime(new TDecimal(value));
    return this;
  }

  /**
   * Set the US:ObservedPulseValues
   * <p>
   * Complex element ObservedPulseValues (US) contains data describing the
   * distinct Pulse values related to the Modulation Type.
   * <p>
   * @param values One or more instances of type {@link ObservedPulseValues}
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withObservedPulseValues(ObservedPulseValues... values) {
    if (values != null) {
      getObservedPulseValues().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current ObservedPulseAnalysis object instance
   */
  public ObservedPulseAnalysis withObservedPulseValues(Set<ObservedPulseValues> values) {
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
    return "ObservedPulseAnalysis {"
      + (priStability != null ? " priStability [" + priStability + "]" : "")
      + (priTimingShift != null ? " priTimingShift [" + priTimingShift + "]" : "")
      + (pdStdDev != null ? " pdStdDev [" + pdStdDev + "]" : "")
      + (priMedianCountdowns != null ? " priMedianCountdowns [" + priMedianCountdowns + "]" : "")
      + (priGroupSpacing != null ? " priGroupSpacing [" + priGroupSpacing + "]" : "")
      + (pdMean != null ? " pdMean [" + pdMean + "]" : "")
      + (priStep != null ? " priStep [" + priStep + "]" : "")
      + (riseTime != null ? " riseTime [" + riseTime + "]" : "")
      + (pdTypicalMin != null ? " pdTypicalMin [" + pdTypicalMin + "]" : "")
      + (pdPatternPeriod != null ? " pdPatternPeriod [" + pdPatternPeriod + "]" : "")
      + (priChangeRate != null ? " priChangeRate [" + priChangeRate + "]" : "")
      + (priAdaptiveDriverDesc != null ? " priAdaptiveDriverDesc [" + priAdaptiveDriverDesc + "]" : "")
      + (priMean != null ? " priMean [" + priMean + "]" : "")
      + (priExtremeMin != null ? " priExtremeMin [" + priExtremeMin + "]" : "")
      + (pdMin != null ? " pdMin [" + pdMin + "]" : "")
      + (prfChangeRate != null ? " prfChangeRate [" + prfChangeRate + "]" : "")
      + (fallTime != null ? " fallTime [" + fallTime + "]" : "")
      + (pdMedian != null ? " pdMedian [" + pdMedian + "]" : "")
      + (numPRIPositions != null ? " numPRIPositions [" + numPRIPositions + "]" : "")
      + (prfExtremeMin != null ? " prfExtremeMin [" + prfExtremeMin + "]" : "")
      + (numPRIElements != null ? " numPRIElements [" + numPRIElements + "]" : "")
      + (prfExtremeMax != null ? " prfExtremeMax [" + prfExtremeMax + "]" : "")
      + (priStdDev != null ? " priStdDev [" + priStdDev + "]" : "")
      + (pdPatternType != null ? " pdPatternType [" + pdPatternType + "]" : "")
      + (pdExtremeMin != null ? " pdExtremeMin [" + pdExtremeMin + "]" : "")
      + (numPDPositions != null ? " numPDPositions [" + numPDPositions + "]" : "")
      + (priStabilitySamplePeriod != null ? " priStabilitySamplePeriod [" + priStabilitySamplePeriod + "]" : "")
      + (priExtremeMax != null ? " priExtremeMax [" + priExtremeMax + "]" : "")
      + (priMedian != null ? " priMedian [" + priMedian + "]" : "")
      + (prfTypicalMin != null ? " prfTypicalMin [" + prfTypicalMin + "]" : "")
      + (pdDwellMax != null ? " pdDwellMax [" + pdDwellMax + "]" : "")
      + (priTypicalMax != null ? " priTypicalMax [" + priTypicalMax + "]" : "")
      + (numPDValues != null ? " numPDValues [" + numPDValues + "]" : "")
      + (priFramePeriod != null ? " priFramePeriod [" + priFramePeriod + "]" : "")
      + (priAnomalousValues != null ? " priAnomalousValues [" + priAnomalousValues + "]" : "")
      + (priSubframeRate != null ? " priSubframeRate [" + priSubframeRate + "]" : "")
      + (pdMax != null ? " pdMax [" + pdMax + "]" : "")
      + (pdAdaptiveRuleDesc != null ? " pdAdaptiveRuleDesc [" + pdAdaptiveRuleDesc + "]" : "")
      + (priSubframePeriod != null ? " priSubframePeriod [" + priSubframePeriod + "]" : "")
      + (prfMax != null ? " prfMax [" + prfMax + "]" : "")
      + (priPulsesPerGroup != null ? " priPulsesPerGroup [" + priPulsesPerGroup + "]" : "")
      + (prfMin != null ? " prfMin [" + prfMin + "]" : "")
      + (pdExtremeMax != null ? " pdExtremeMax [" + pdExtremeMax + "]" : "")
      + (priBasicClockPeriod != null ? " priBasicClockPeriod [" + priBasicClockPeriod + "]" : "")
      + (priTypicalMin != null ? " priTypicalMin [" + priTypicalMin + "]" : "")
      + (pdDwellMin != null ? " pdDwellMin [" + pdDwellMin + "]" : "")
      + (priGroupPulseSpacing != null ? " priGroupPulseSpacing [" + priGroupPulseSpacing + "]" : "")
      + (pdStep != null ? " pdStep [" + pdStep + "]" : "")
      + (observedPulseValues != null ? " observedPulseValues [" + observedPulseValues + "]" : "")
      + (priCountdown != null ? " priCountdown [" + priCountdown + "]" : "")
      + (prfTypicalMax != null ? " prfTypicalMax [" + prfTypicalMax + "]" : "")
      + (pdContinuous != null ? " pdContinuous [" + pdContinuous + "]" : "")
      + (priAdaptiveRuleDesc != null ? " priAdaptiveRuleDesc [" + priAdaptiveRuleDesc + "]" : "")
      + (priPatternType != null ? " priPatternType [" + priPatternType + "]" : "")
      + (pdSequenceDesc != null ? " pdSequenceDesc [" + pdSequenceDesc + "]" : "")
      + (priFrameRate != null ? " priFrameRate [" + priFrameRate + "]" : "")
      + (priPatternPeriod != null ? " priPatternPeriod [" + priPatternPeriod + "]" : "")
      + (priContinuous != null ? " priContinuous [" + priContinuous + "]" : "")
      + (priCountdownKey != null ? " priCountdownKey [" + priCountdownKey + "]" : "")
      + (pdTypicalMax != null ? " pdTypicalMax [" + pdTypicalMax + "]" : "")
      + (priSequenceDesc != null ? " priSequenceDesc [" + priSequenceDesc + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPulseAnalysis} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
