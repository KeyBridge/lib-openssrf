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

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCMO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS7;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUSX;

/**
 * ObservedMOPAnalysis (US) contains data describing the characteristic and
 * pattern information for the Modulation impressed On the Pulse (MOP).
 * <p>
 * Element of {@link TxMode}
 * <p>
 * Sub-Element is {@link ObservedMOPSweep}
 * <p>
 * Example:
 * <pre>
 * &lt;ObservedMOPAnalysis&gt;
 *   &lt;MOPAdaptiveDriverDesc cls="U"&gt;Target Motion Tracking&lt;/MOPAdaptiveDriverDesc&gt;
 *   &lt;MOPAdaptiveDriverRuleDesc cls="U"&gt;Target Motion Tracking&lt;/MOPAdaptiveDriverRuleDesc&gt;
 *   &lt;MOPAMPercentModulation cls="U"&gt;46.8&lt;/MOPAMPercentModulation&gt;
 *   &lt;MOPChangeRate cls="U"&gt;.034&lt;/MOPChangeRate&gt;
 *   &lt;MOPContinuous cls="U"&gt;Yes&lt;/MOPContinuous&gt;
 *   &lt;MOPID cls="U"&gt;67990&lt;/MOPID&gt;
 *   &lt;MOPMeanValue cls="U"&gt;23&lt;/MOPMeanValue&gt;
 *   &lt;MOPNumElements cls="U"&gt;672&lt;/MOPNumElements&gt;
 *   &lt;MOPNumElements cls="U"&gt;743&lt;/MOPNumElements&gt;
 *   &lt;MOPOffTime cls="U"&gt;590&lt;/MOPOffTime&gt;
 *   &lt;MOPOnTime cls="U"&gt;357&lt;/MOPOnTime&gt;
 *   &lt;MOPPatternName cls="U"&gt;Big View Sample 00067&lt;/MOPPatternName&gt;
 *   &lt;MOPPatternPeriod cls="U"&gt;0.0001&lt;/MOPPatternPeriod&gt;
 *   &lt;MOPPatternType cls="U"&gt;Non-Patterned&lt;/MOPPatternType&gt;
 *   &lt;MOPPulseDurationLink cls="U"&gt;0.001&lt;/MOPPulseDurationLink&gt;
 *   &lt;MOPTimeBWProduct cls="U"&gt;72.69&lt;/MOPTimeBWProduct&gt;
 *   &lt;MOPType cls="U"&gt;PM&lt;/MOPType&gt;
 *   &lt;MOPValueMax cls="U"&gt;16&lt;/MOPValueMax&gt;
 *   &lt;MOPValueMin cls="U"&gt;11&lt;/MOPValueMin&gt;
 *   &lt;SignalType cls="U"&gt;Doppler Frequency-Shift&lt;/SignalType&gt;
 *   &lt;ObservedMOPSweep&gt;
 *     &lt;MOPDutyCycle cls="U"&gt;99.2&lt;/MOPDutyCycle&gt;
 *     &lt;MOPFlyBackInterval cls="U"&gt;23678.23&lt;/MOPFlyBackInterval&gt;
 *     &lt;MOPNumElements cls="U"&gt;500&lt;/MOPNumElements&gt;
 *     &lt;MOPRepetionInterval cls="U"&gt;23693.23&lt;/MOPRepetionInterval&gt;
 *     &lt;MOPStep cls="U"&gt;32&lt;/MOPStep&gt;
 *     &lt;MOPSweepPeriod cls="U"&gt;0.04&lt;/MOPSweepPeriod&gt;
 *     &lt;ObservedMOPSequence cls="U"&gt;&lt;/ObservedMOPSequence&gt;
 *     &lt;MOPDutyCycle cls="U"&gt;12.5&lt;/MOPDutyCycle&gt;
 *     &lt;MOPNumElements cls="U"&gt;500&lt;/MOPNumElements&gt;
 *     &lt;MOPRepetionInterval cls="U"&gt;23691.23&lt;/MOPRepetionInterval&gt;
 *     &lt;MOPSequenceDesc cls="U"&gt;Required Pattern Collection set A34&lt;/MOPSequenceDesc&gt;
 *     &lt;MOPStep cls="U"&gt;34&lt;/MOPStep&gt;
 *     &lt;SequenceBitLength cls="U"&gt;432&lt;/SequenceBitLength&gt;
 *     &lt;ObservedMOPBits&gt;
 *       &lt;BitDuration cls="U"&gt;34.67&lt;/BitDuration&gt;
 *       &lt;BitRate cls="U"&gt;372&lt;/BitRate&gt;
 *       &lt;MOPDutyCycle cls="U"&gt;12.4&lt;/MOPDutyCycle&gt;
 *       &lt;MOPNumElements cls="U"&gt;492&lt;/MOPNumElements&gt;
 *       &lt;MOPRepetionInterval cls="U"&gt;23690.23&lt;/MOPRepetionInterval&gt;
 *       &lt;MOPStep cls="U"&gt;36&lt;/MOPStep&gt;
 *       &lt;ObservedMOPValues&gt;
 *         &lt;StatisticalIndicator cls="U"&gt;97&lt;/StatisticalIndicator&gt;
 *         &lt;MOPValueAM cls="U"&gt;35&lt;/MOPValueAM&gt;
 *         &lt;MOPValueCW cls="U"&gt;3024&lt;/MOPValueCW&gt;
 *         &lt;MOPValueFM cls="U"&gt;3096&lt;/MOPValueFM&gt;
 *         &lt;MOPValuePM cls="U"&gt;27&lt;/MOPValuePM&gt;
 *       &lt;/ObservedMOPValues&gt;
 *     &lt;/ObservedMOPBits&gt;
 *   &lt;/ObservedMOPSequence&gt;
 * &lt;/ObservedMOPSweep&gt;
 * &lt;/ObservedMOPAnalysis&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedMOPAnalysis", propOrder = {
  "mopAdaptiveDriverDesc",
  "mopAdaptiveDriverRuleDesc",
  "mopamPercentModulation",
  "mopChangeRateAM",
  "mopChangeRateCW",
  "mopChangeRateFM",
  "mopChangeRatePM",
  "mopContinuous",
  "mopid",
  "mopMeanValueAM",
  "mopMeanValueCW",
  "mopMeanValueFM",
  "mopMeanValuePM",
  "mopNumElements",
  "mopOffTime",
  "mopOnTime",
  "mopPatternName",
  "mopPatternPeriod",
  "mopPatternType",
  "mopPulseDurationLink",
  "mopTimeBWProduct",
  "mopType",
  "mopValueMaxAM",
  "mopValueMaxCW",
  "mopValueMaxFM",
  "mopValueMaxPM",
  "mopValueMinAM",
  "mopValueMinCW",
  "mopValueMinFM",
  "mopValueMinPM",
  "signalType",
  "observedMOPSweep"
})
public class ObservedMOPAnalysis {

  /**
   * US:MOPAdaptiveDriverDesc - MOP Adaptive Driver Description (Optional)    * <p>
   * The condition which controls, or can be associated with, the signal MOP
   * variations.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPAdaptiveDriverDesc", required = false)
  private S500 mopAdaptiveDriverDesc;
  /**
   * US:MOPAdaptiveDriverRuleDesc - MOP Adaptive Driver Rule Description
   * (Optional)    * <p>
   * The rule which describes the signal MOP variations.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPAdaptiveDriverRuleDesc", required = false)
  private S500 mopAdaptiveDriverRuleDesc;
  /**
   * US:MOPAMPercentModulation - MOP AM Percent Modulation (Optional)    * <p>
   * The AM Percent Modulation is the ratio (expressed as a percentage) between
   * the amplitude variation and the maximum amplitude
   * <p>
   * Format is UN(2,1) (%)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPAMPercentModulation", required = false)
  private US_Percent2 mopamPercentModulation;
  /**
   * In Data Item US:MOPChangeRateAM (US), enter the change in amplitude within
   * the pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPChangeRateAM", required = false)
  private US_MOPChgAm mopChangeRateAM;
  /**
   * In Data Item US:MOPChangeRateCW (US), enter the change in continuous wave
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPChangeRateCW", required = false)
  private US_MOPChgFm mopChangeRateCW;
  /**
   * In Data Item US:MOPChangeRateFM (US), enter the change in frequency within
   * the pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPChangeRateFM", required = false)
  private US_MOPChgFm mopChangeRateFM;
  /**
   * In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPChangeRatePM", required = false)
  private US_PhaseAngleRate mopChangeRatePM;
  /**
   * In Data Item US:MOPContinuous (US), indicate whether MOP or CW modulation
   * is Discrete or Continuous.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPContinuous", required = false)
  private TString mopContinuous;
  /**
   * In Data Item US:MOPID (US), enter a unique identifier (within the TxMode)
   * for the MOP data.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPID", required = false)
  private S10 mopid;
  /**
   * In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPMeanValueAM", required = false)
  private Signed_DB_5_2 mopMeanValueAM;
  /**
   * In Data Item US:MOPMeanValueCW (US), enter the average continuous wave
   * frequency for a signal which changes on a non-patterned basis within a
   * pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPMeanValueCW", required = false)
  private US_MOPFm mopMeanValueCW;
  /**
   * In Data Item US:MOPMeanValue (US), enter the average frequency for a signal
   * which changes on a non-patterned basis within a pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPMeanValueFM", required = false)
  private US_MOPFm mopMeanValueFM;
  /**
   * In Data Item US:MOPMeanValue (US), enter the average phase angle for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPMeanValuePM", required = false)
  private US_PhaseAngle mopMeanValuePM;
  /**
   * In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPNumElements", required = false)
  private UN6 mopNumElements;
  /**
   * In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPOffTime", required = false)
  private microsecs mopOffTime;
  /**
   * In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPOnTime", required = false)
  private microsecs mopOnTime;
  /**
   * In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPPatternName", required = false)
  private S50 mopPatternName;
  /**
   * In Data Item US:MOPPatternPeriod (US), enter the duration of one complete
   * cycle of Frequency, Phase or Amplitude variations for a signal which
   * changes on a patterned basis, within a pulse, for pulsed signals.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPPatternPeriod", required = false)
  private microsecs mopPatternPeriod;
  /**
   * In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPPatternType", required = false)
  private TString mopPatternType;
  /**
   * In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value
   * which is associated with the selected MOP name (i.e., the name in the MOP
   * Pattern List).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPPulseDurationLink", required = false)
  private microsecs mopPulseDurationLink;
  /**
   * In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product of
   * the waveform (actual PD times instantaneous bandwidth).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPTimeBWProduct", required = false)
  private US_UN16_9 mopTimeBWProduct;
  /**
   * In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPType", required = false)
  private TString mopType;
  /**
   * In Data Item US:MOPValueMaxAM (US), enter the maximum change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMaxAM", required = false)
  private Signed_DB_5_2 mopValueMaxAM;
  /**
   * In Data Item US:MOPValueMaxCW (US), enter the maximum change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMaxCW", required = false)
  private US_MOPFm mopValueMaxCW;
  /**
   * In Data Item US:MOPValueMaxFM (US), enter the maximum change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMaxFM", required = false)
  private US_MOPFm mopValueMaxFM;
  /**
   * In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMaxPM", required = false)
  private US_PhaseAngle mopValueMaxPM;
  /**
   * In Data Item US:MOPValueMinAM (US), enter the minimum change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMinAM", required = false)
  private Signed_DB_5_2 mopValueMinAM;
  /**
   * In Data Item US:MOPValueMinCW (US), enter the minimum change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMinCW", required = false)
  private US_MOPFm mopValueMinCW;
  /**
   * In Data Item US:MOPValueMinFM (US), enter the minimum change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMinFM", required = false)
  private US_MOPFm mopValueMinFM;
  /**
   * In Data Item US:MOPValueMinPM (US), enter the minimum change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MOPValueMinPM", required = false)
  private US_PhaseAngle mopValueMinPM;
  /**
   * In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SignalType", required = false)
  private TString signalType;
  /**
   * US:ObservedMOPSweep (Optional)
   * <p>
   * ObservedMOPSweep (US) contains data describing the parametric information
   * for the period of the Modulation on the Pulse sweep.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedMOPSweep")
  private Set<ObservedMOPSweep> observedMOPSweep;

  /**
   * Get the condition which controls, or can be associated with, the signal MOP
   * variations..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getMOPAdaptiveDriverDesc() {
    return mopAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls, or can be associated with, the signal MOP
   * variations..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setMOPAdaptiveDriverDesc(S500 value) {
    this.mopAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the MOPAdaptiveDriverDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPAdaptiveDriverDesc() {
    return (this.mopAdaptiveDriverDesc != null ? this.mopAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal MOP variations..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getMOPAdaptiveDriverRuleDesc() {
    return mopAdaptiveDriverRuleDesc;
  }

  /**
   * Set the rule which describes the signal MOP variations..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setMOPAdaptiveDriverRuleDesc(S500 value) {
    this.mopAdaptiveDriverRuleDesc = value;
  }

  /**
   * Determine if the MOPAdaptiveDriverRuleDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPAdaptiveDriverRuleDesc() {
    return (this.mopAdaptiveDriverRuleDesc != null ? this.mopAdaptiveDriverRuleDesc.isSetValue() : false);
  }

  /**
   * Get the AM Percent Modulation is the ratio (expressed as a percentage)
   * between the amplitude variation and the maximum amplitude.
   * <p>
   * @return a {@link US_Percent2} instance
   * @since 3.1.0
   */
  public US_Percent2 getMOPAMPercentModulation() {
    return mopamPercentModulation;
  }

  /**
   * Set the AM Percent Modulation is the ratio (expressed as a percentage)
   * between the amplitude variation and the maximum amplitude.
   * <p>
   * @param value a {@link US_Percent2} instance
   * @since 3.1.0
   */
  public void setMOPAMPercentModulation(US_Percent2 value) {
    this.mopamPercentModulation = value;
  }

  /**
   * Determine if the MOPAMPercentModulation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPAMPercentModulation() {
    return (this.mopamPercentModulation != null ? this.mopamPercentModulation.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRateAM (US), enter the change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPChgAm} instance
   * @since 3.1.0
   */
  public US_MOPChgAm getMOPChangeRateAM() {
    return mopChangeRateAM;
  }

  /**
   * Set In Data Item US:MOPChangeRateAM (US), enter the change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPChgAm} instance
   * @since 3.1.0
   */
  public void setMOPChangeRateAM(US_MOPChgAm value) {
    this.mopChangeRateAM = value;
  }

  /**
   * Determine if the MOPChangeRateAM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRateAM() {
    return (this.mopChangeRateAM != null ? this.mopChangeRateAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRateCW (US), enter the change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPChgFm} instance
   * @since 3.1.0
   */
  public US_MOPChgFm getMOPChangeRateCW() {
    return mopChangeRateCW;
  }

  /**
   * Set In Data Item US:MOPChangeRateCW (US), enter the change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPChgFm} instance
   * @since 3.1.0
   */
  public void setMOPChangeRateCW(US_MOPChgFm value) {
    this.mopChangeRateCW = value;
  }

  /**
   * Determine if the MOPChangeRateCW is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRateCW() {
    return (this.mopChangeRateCW != null ? this.mopChangeRateCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRateFM (US), enter the change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPChgFm} instance
   * @since 3.1.0
   */
  public US_MOPChgFm getMOPChangeRateFM() {
    return mopChangeRateFM;
  }

  /**
   * Set In Data Item US:MOPChangeRateFM (US), enter the change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPChgFm} instance
   * @since 3.1.0
   */
  public void setMOPChangeRateFM(US_MOPChgFm value) {
    this.mopChangeRateFM = value;
  }

  /**
   * Determine if the MOPChangeRateFM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRateFM() {
    return (this.mopChangeRateFM != null ? this.mopChangeRateFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_PhaseAngleRate} instance
   * @since 3.1.0
   */
  public US_PhaseAngleRate getMOPChangeRatePM() {
    return mopChangeRatePM;
  }

  /**
   * Set In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_PhaseAngleRate} instance
   * @since 3.1.0
   */
  public void setMOPChangeRatePM(US_PhaseAngleRate value) {
    this.mopChangeRatePM = value;
  }

  /**
   * Determine if the MOPChangeRatePM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRatePM() {
    return (this.mopChangeRatePM != null ? this.mopChangeRatePM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPContinuous (US), indicate whether MOP or CW
   * modulation is Discrete or Continuous..
   * <p>
   * @return the MOPContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMOPContinuous() {
    return mopContinuous;
  }

  /**
   * Set In Data Item US:MOPContinuous (US), indicate whether MOP or CW
   * modulation is Discrete or Continuous..
   * <p>
   * @param value the MOPContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setMOPContinuous(TString value) {
    this.mopContinuous = value;
  }

  /**
   * Determine if the MOPContinuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPContinuous() {
    return (this.mopContinuous != null ? this.mopContinuous.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPID (US), enter a unique identifier (within the
   * TxMode) for the MOP data..
   * <p>
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getMOPID() {
    return mopid;
  }

  /**
   * Set In Data Item US:MOPID (US), enter a unique identifier (within the
   * TxMode) for the MOP data..
   * <p>
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setMOPID(S10 value) {
    this.mopid = value;
  }

  /**
   * Determine if the MOPID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPID() {
    return (this.mopid != null ? this.mopid.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public Signed_DB_5_2 getMOPMeanValueAM() {
    return mopMeanValueAM;
  }

  /**
   * Set In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public void setMOPMeanValueAM(Signed_DB_5_2 value) {
    this.mopMeanValueAM = value;
  }

  /**
   * Determine if the MOPMeanValueAM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPMeanValueAM() {
    return (this.mopMeanValueAM != null ? this.mopMeanValueAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPMeanValueCW (US), enter the average continuous wave
   * frequency for a signal which changes on a non-patterned basis within a
   * pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPMeanValueCW() {
    return mopMeanValueCW;
  }

  /**
   * Set In Data Item US:MOPMeanValueCW (US), enter the average continuous wave
   * frequency for a signal which changes on a non-patterned basis within a
   * pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPMeanValueCW(US_MOPFm value) {
    this.mopMeanValueCW = value;
  }

  /**
   * Determine if the MOPMeanValueCW is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPMeanValueCW() {
    return (this.mopMeanValueCW != null ? this.mopMeanValueCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPMeanValue (US), enter the average frequency for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPMeanValueFM() {
    return mopMeanValueFM;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average frequency for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPMeanValueFM(US_MOPFm value) {
    this.mopMeanValueFM = value;
  }

  /**
   * Determine if the MOPMeanValueFM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPMeanValueFM() {
    return (this.mopMeanValueFM != null ? this.mopMeanValueFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPMeanValue (US), enter the average phase angle for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public US_PhaseAngle getMOPMeanValuePM() {
    return mopMeanValuePM;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average phase angle for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public void setMOPMeanValuePM(US_PhaseAngle value) {
    this.mopMeanValuePM = value;
  }

  /**
   * Determine if the MOPMeanValuePM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPMeanValuePM() {
    return (this.mopMeanValuePM != null ? this.mopMeanValuePM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time).
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getMOPNumElements() {
    return mopNumElements;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time).
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setMOPNumElements(UN6 value) {
    this.mopNumElements = value;
  }

  /**
   * Determine if the MOPNumElements is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPNumElements() {
    return (this.mopNumElements != null ? this.mopNumElements.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getMOPOffTime() {
    return mopOffTime;
  }

  /**
   * Set In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setMOPOffTime(microsecs value) {
    this.mopOffTime = value;
  }

  /**
   * Determine if the MOPOffTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPOffTime() {
    return (this.mopOffTime != null ? this.mopOffTime.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getMOPOnTime() {
    return mopOnTime;
  }

  /**
   * Set In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setMOPOnTime(microsecs value) {
    this.mopOnTime = value;
  }

  /**
   * Determine if the MOPOnTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPOnTime() {
    return (this.mopOnTime != null ? this.mopOnTime.isSetValue() : false);
  }

  /**
   * Get In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha)..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getMOPPatternName() {
    return mopPatternName;
  }

  /**
   * Set In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha)..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setMOPPatternName(S50 value) {
    this.mopPatternName = value;
  }

  /**
   * Determine if the MOPPatternName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPPatternName() {
    return (this.mopPatternName != null ? this.mopPatternName.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPPatternPeriod (US), enter the duration of one
   * complete cycle of Frequency, Phase or Amplitude variations for a signal
   * which changes on a patterned basis, within a pulse, for pulsed signals..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getMOPPatternPeriod() {
    return mopPatternPeriod;
  }

  /**
   * Set In Data Item US:MOPPatternPeriod (US), enter the duration of one
   * complete cycle of Frequency, Phase or Amplitude variations for a signal
   * which changes on a patterned basis, within a pulse, for pulsed signals..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setMOPPatternPeriod(microsecs value) {
    this.mopPatternPeriod = value;
  }

  /**
   * Determine if the MOPPatternPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPPatternPeriod() {
    return (this.mopPatternPeriod != null ? this.mopPatternPeriod.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated..
   * <p>
   * @return the MOPPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMOPPatternType() {
    return mopPatternType;
  }

  /**
   * Set In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated..
   * <p>
   * @param value the MOPPatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setMOPPatternType(TString value) {
    this.mopPatternType = value;
  }

  /**
   * Determine if the MOPPatternType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPPatternType() {
    return (this.mopPatternType != null ? this.mopPatternType.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value
   * which is associated with the selected MOP name (i.e., the name in the MOP
   * Pattern List)..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getMOPPulseDurationLink() {
    return mopPulseDurationLink;
  }

  /**
   * Set In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value
   * which is associated with the selected MOP name (i.e., the name in the MOP
   * Pattern List)..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setMOPPulseDurationLink(microsecs value) {
    this.mopPulseDurationLink = value;
  }

  /**
   * Determine if the MOPPulseDurationLink is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPPulseDurationLink() {
    return (this.mopPulseDurationLink != null ? this.mopPulseDurationLink.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product
   * of the waveform (actual PD times instantaneous bandwidth)..
   * <p>
   * @return a {@link US_UN16_9} instance
   * @since 3.1.0
   */
  public US_UN16_9 getMOPTimeBWProduct() {
    return mopTimeBWProduct;
  }

  /**
   * Set In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product
   * of the waveform (actual PD times instantaneous bandwidth)..
   * <p>
   * @param value a {@link US_UN16_9} instance
   * @since 3.1.0
   */
  public void setMOPTimeBWProduct(US_UN16_9 value) {
    this.mopTimeBWProduct = value;
  }

  /**
   * Determine if the MOPTimeBWProduct is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPTimeBWProduct() {
    return (this.mopTimeBWProduct != null ? this.mopTimeBWProduct.isSetValue() : false);
  }

  /**
   * Get In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW)..
   * <p>
   * @return the MOPType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMOPType() {
    return mopType;
  }

  /**
   * Set In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW)..
   * <p>
   * @param value the MOPType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setMOPType(TString value) {
    this.mopType = value;
  }

  /**
   * Determine if the MOPType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPType() {
    return (this.mopType != null ? this.mopType.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMaxAM (US), enter the maximum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public Signed_DB_5_2 getMOPValueMaxAM() {
    return mopValueMaxAM;
  }

  /**
   * Set In Data Item US:MOPValueMaxAM (US), enter the maximum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public void setMOPValueMaxAM(Signed_DB_5_2 value) {
    this.mopValueMaxAM = value;
  }

  /**
   * Determine if the MOPValueMaxAM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxAM() {
    return (this.mopValueMaxAM != null ? this.mopValueMaxAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMaxCW (US), enter the maximum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPValueMaxCW() {
    return mopValueMaxCW;
  }

  /**
   * Set In Data Item US:MOPValueMaxCW (US), enter the maximum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPValueMaxCW(US_MOPFm value) {
    this.mopValueMaxCW = value;
  }

  /**
   * Determine if the MOPValueMaxCW is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxCW() {
    return (this.mopValueMaxCW != null ? this.mopValueMaxCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMaxFM (US), enter the maximum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPValueMaxFM() {
    return mopValueMaxFM;
  }

  /**
   * Set In Data Item US:MOPValueMaxFM (US), enter the maximum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPValueMaxFM(US_MOPFm value) {
    this.mopValueMaxFM = value;
  }

  /**
   * Determine if the MOPValueMaxFM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxFM() {
    return (this.mopValueMaxFM != null ? this.mopValueMaxFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public US_PhaseAngle getMOPValueMaxPM() {
    return mopValueMaxPM;
  }

  /**
   * Set In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public void setMOPValueMaxPM(US_PhaseAngle value) {
    this.mopValueMaxPM = value;
  }

  /**
   * Determine if the MOPValueMaxPM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxPM() {
    return (this.mopValueMaxPM != null ? this.mopValueMaxPM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinAM (US), enter the minimum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public Signed_DB_5_2 getMOPValueMinAM() {
    return mopValueMinAM;
  }

  /**
   * Set In Data Item US:MOPValueMinAM (US), enter the minimum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link Signed_DB_5_2} instance
   * @since 3.1.0
   */
  public void setMOPValueMinAM(Signed_DB_5_2 value) {
    this.mopValueMinAM = value;
  }

  /**
   * Determine if the MOPValueMinAM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinAM() {
    return (this.mopValueMinAM != null ? this.mopValueMinAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinCW (US), enter the minimum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPValueMinCW() {
    return mopValueMinCW;
  }

  /**
   * Set In Data Item US:MOPValueMinCW (US), enter the minimum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPValueMinCW(US_MOPFm value) {
    this.mopValueMinCW = value;
  }

  /**
   * Determine if the MOPValueMinCW is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinCW() {
    return (this.mopValueMinCW != null ? this.mopValueMinCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinFM (US), enter the minimum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public US_MOPFm getMOPValueMinFM() {
    return mopValueMinFM;
  }

  /**
   * Set In Data Item US:MOPValueMinFM (US), enter the minimum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_MOPFm} instance
   * @since 3.1.0
   */
  public void setMOPValueMinFM(US_MOPFm value) {
    this.mopValueMinFM = value;
  }

  /**
   * Determine if the MOPValueMinFM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinFM() {
    return (this.mopValueMinFM != null ? this.mopValueMinFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinPM (US), enter the minimum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @return a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public US_PhaseAngle getMOPValueMinPM() {
    return mopValueMinPM;
  }

  /**
   * Set In Data Item US:MOPValueMinPM (US), enter the minimum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType..
   * <p>
   * @param value a {@link US_PhaseAngle} instance
   * @since 3.1.0
   */
  public void setMOPValueMinPM(US_PhaseAngle value) {
    this.mopValueMinPM = value;
  }

  /**
   * Determine if the MOPValueMinPM is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinPM() {
    return (this.mopValueMinPM != null ? this.mopValueMinPM.isSetValue() : false);
  }

  /**
   * Get In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected..
   * <p>
   * @return the SignalType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSignalType() {
    return signalType;
  }

  /**
   * Set In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected..
   * <p>
   * @param value the SignalType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSignalType(TString value) {
    this.signalType = value;
  }

  /**
   * Determine if the SignalType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignalType() {
    return (this.signalType != null ? this.signalType.isSetValue() : false);
  }

  /**
   * Get the US:ObservedMOPSweep
   * <p>
   * Complex element ObservedMOPSweep (US) contains data describing the
   * parametric information for the period of the Modulation on the Pulse
   * sweep..
   * <p>
   * @return a {@link ObservedMOPSweep} instance
   * @since 3.1.0
   */
  public Set<ObservedMOPSweep> getObservedMOPSweep() {
    if (observedMOPSweep == null) {
      observedMOPSweep = new HashSet<>();
    }
    return this.observedMOPSweep;
  }

  /**
   * Determine if the ObservedMOPSweep is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedMOPSweep() {
    return ((this.observedMOPSweep != null) && (!this.observedMOPSweep.isEmpty()));
  }

  /**
   * Clear the ObservedMOPSweep field. This sets the field to null.
   */
  public void unsetObservedMOPSweep() {
    this.observedMOPSweep = null;
  }

  /**
   * Set the condition which controls, or can be associated with, the signal MOP
   * variations.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPAdaptiveDriverDesc(String value) {
    setMOPAdaptiveDriverDesc(new S500(value));
    return this;
  }

  /**
   * Set the rule which describes the signal MOP variations.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPAdaptiveDriverRuleDesc(String value) {
    setMOPAdaptiveDriverRuleDesc(new S500(value));
    return this;
  }

  /**
   * Set the AM Percent Modulation is the ratio (expressed as a percentage)
   * between the amplitude variation and the maximum amplitude
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPAMPercentModulation(Double value) {
    setMOPAMPercentModulation(new US_Percent2(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRateAM (US), enter the change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPChangeRateAM(Double value) {
    setMOPChangeRateAM(new US_MOPChgAm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRateCW (US), enter the change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPChangeRateCW(Double value) {
    setMOPChangeRateCW(new US_MOPChgFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRateFM (US), enter the change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPChangeRateFM(Double value) {
    setMOPChangeRateFM(new US_MOPChgFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPChangeRatePM(Double value) {
    setMOPChangeRatePM(new US_PhaseAngleRate(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPContinuous (US), indicate whether MOP or CW
   * modulation is Discrete or Continuous.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPContinuous(ListCBO value) {
    setMOPContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item US:MOPID (US), enter a unique identifier (within the
   * TxMode) for the MOP data.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPID(String value) {
    setMOPID(new S10(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPMeanValueAM(Double value) {
    setMOPMeanValueAM(new Signed_DB_5_2(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValueCW (US), enter the average continuous wave
   * frequency for a signal which changes on a non-patterned basis within a
   * pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPMeanValueCW(Double value) {
    setMOPMeanValueCW(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average frequency for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPMeanValueFM(Double value) {
    setMOPMeanValueFM(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average phase angle for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPMeanValuePM(Double value) {
    setMOPMeanValuePM(new US_PhaseAngle(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPNumElements(Integer value) {
    setMOPNumElements(new UN6(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPOffTime(Double value) {
    setMOPOffTime(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPOnTime(Double value) {
    setMOPOnTime(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPPatternName(String value) {
    setMOPPatternName(new S50(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPPatternPeriod (US), enter the duration of one
   * complete cycle of Frequency, Phase or Amplitude variations for a signal
   * which changes on a patterned basis, within a pulse, for pulsed signals.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPPatternPeriod(Double value) {
    setMOPPatternPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.
   * <p>
   * @param value An instances of type {@link ListUS7}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPPatternType(ListUS7 value) {
    setMOPPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value
   * which is associated with the selected MOP name (i.e., the name in the MOP
   * Pattern List).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPPulseDurationLink(Double value) {
    setMOPPulseDurationLink(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product
   * of the waveform (actual PD times instantaneous bandwidth).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPTimeBWProduct(Double value) {
    setMOPTimeBWProduct(new US_UN16_9(value));
    return this;
  }

  /**
   * Set In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW).
   * <p>
   * @param value An instances of type {@link ListUSX}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPType(ListUSX value) {
    setMOPType(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMaxAM (US), enter the maximum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMaxAM(Double value) {
    setMOPValueMaxAM(new Signed_DB_5_2(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMaxCW (US), enter the maximum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMaxCW(Double value) {
    setMOPValueMaxCW(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMaxFM (US), enter the maximum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMaxFM(Double value) {
    setMOPValueMaxFM(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMaxPM(Double value) {
    setMOPValueMaxPM(new US_PhaseAngle(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinAM (US), enter the minimum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMinAM(Double value) {
    setMOPValueMinAM(new Signed_DB_5_2(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinCW (US), enter the minimum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMinCW(Double value) {
    setMOPValueMinCW(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinFM (US), enter the minimum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMinFM(Double value) {
    setMOPValueMinFM(new US_MOPFm(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinPM (US), enter the minimum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withMOPValueMinPM(Double value) {
    setMOPValueMinPM(new US_PhaseAngle(value));
    return this;
  }

  /**
   * Set In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected.
   * <p>
   * @param value An instances of type {@link ListCMO}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withSignalType(ListCMO value) {
    setSignalType(new TString(value.value()));
    return this;
  }

  /**
   * Set the US:ObservedMOPSweep
   * <p>
   * Complex element ObservedMOPSweep (US) contains data describing the
   * parametric information for the period of the Modulation on the Pulse sweep.
   * <p>
   * @param values One or more instances of type {@link ObservedMOPSweep...}.
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withObservedMOPSweep(ObservedMOPSweep... values) {
    if (values != null) {
      getObservedMOPSweep().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedMOPSweep
   * <p>
   * Complex element ObservedMOPSweep (US) contains data describing the
   * parametric information for the period of the Modulation on the Pulse sweep.
   * <p>
   * @param values A collection of {@link ObservedMOPSweep} instances
   * @return The current ObservedMOPAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedMOPAnalysis withObservedMOPSweep(Collection<ObservedMOPSweep> values) {
    if (values != null) {
      getObservedMOPSweep().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedMOPAnalysis instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedMOPAnalysis {"
           + (mopAdaptiveDriverDesc != null ? "\n mopAdaptiveDriverDesc [" + mopAdaptiveDriverDesc + "]" : "")
           + (mopAdaptiveDriverRuleDesc != null ? "\n mopAdaptiveDriverRuleDesc [" + mopAdaptiveDriverRuleDesc + "]" : "")
           + (mopChangeRateAM != null ? "\n mopChangeRateAM [" + mopChangeRateAM + "]" : "")
           + (mopChangeRateCW != null ? "\n mopChangeRateCW [" + mopChangeRateCW + "]" : "")
           + (mopChangeRateFM != null ? "\n mopChangeRateFM [" + mopChangeRateFM + "]" : "")
           + (mopChangeRatePM != null ? "\n mopChangeRatePM [" + mopChangeRatePM + "]" : "")
           + (mopContinuous != null ? "\n mopContinuous [" + mopContinuous + "]" : "")
           + (mopMeanValueAM != null ? "\n mopMeanValueAM [" + mopMeanValueAM + "]" : "")
           + (mopMeanValueCW != null ? "\n mopMeanValueCW [" + mopMeanValueCW + "]" : "")
           + (mopMeanValueFM != null ? "\n mopMeanValueFM [" + mopMeanValueFM + "]" : "")
           + (mopMeanValuePM != null ? "\n mopMeanValuePM [" + mopMeanValuePM + "]" : "")
           + (mopNumElements != null ? "\n mopNumElements [" + mopNumElements + "]" : "")
           + (mopOffTime != null ? "\n mopOffTime [" + mopOffTime + "]" : "")
           + (mopOnTime != null ? "\n mopOnTime [" + mopOnTime + "]" : "")
           + (mopPatternName != null ? "\n mopPatternName [" + mopPatternName + "]" : "")
           + (mopPatternPeriod != null ? "\n mopPatternPeriod [" + mopPatternPeriod + "]" : "")
           + (mopPatternType != null ? "\n mopPatternType [" + mopPatternType + "]" : "")
           + (mopPulseDurationLink != null ? "\n mopPulseDurationLink [" + mopPulseDurationLink + "]" : "")
           + (mopTimeBWProduct != null ? "\n mopTimeBWProduct [" + mopTimeBWProduct + "]" : "")
           + (mopType != null ? "\n mopType [" + mopType + "]" : "")
           + (mopValueMaxAM != null ? "\n mopValueMaxAM [" + mopValueMaxAM + "]" : "")
           + (mopValueMaxCW != null ? "\n mopValueMaxCW [" + mopValueMaxCW + "]" : "")
           + (mopValueMaxFM != null ? "\n mopValueMaxFM [" + mopValueMaxFM + "]" : "")
           + (mopValueMaxPM != null ? "\n mopValueMaxPM [" + mopValueMaxPM + "]" : "")
           + (mopValueMinAM != null ? "\n mopValueMinAM [" + mopValueMinAM + "]" : "")
           + (mopValueMinCW != null ? "\n mopValueMinCW [" + mopValueMinCW + "]" : "")
           + (mopValueMinFM != null ? "\n mopValueMinFM [" + mopValueMinFM + "]" : "")
           + (mopValueMinPM != null ? "\n mopValueMinPM [" + mopValueMinPM + "]" : "")
           + (mopamPercentModulation != null ? "\n mopamPercentModulation [" + mopamPercentModulation + "]" : "")
           + (mopid != null ? "\n mopid [" + mopid + "]" : "")
           + (observedMOPSweep != null ? "\n observedMOPSweep [" + observedMOPSweep + "]" : "")
           + (signalType != null ? "\n signalType [" + signalType + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPAnalysis} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
