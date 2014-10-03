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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * US:MOPAdaptiveDriverDesc - MOP Adaptive Driver Description (Optional)
   * <p>
   * The condition which controls, or can be associated with, the signal MOP
   * variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "MOPAdaptiveDriverDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString mopAdaptiveDriverDesc;
  /**
   * US:MOPAdaptiveDriverRuleDesc - MOP Adaptive Driver Rule Description
   * (Optional)
   * <p>
   * The rule which describes the signal MOP variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "MOPAdaptiveDriverRuleDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString mopAdaptiveDriverRuleDesc;
  /**
   * US:MOPAMPercentModulation - MOP AM Percent Modulation (Optional)
   * <p>
   * The AM Percent Modulation is the ratio (expressed as a percentage) between
   * the amplitude variation and the maximum amplitude
   * <p>
   * Format is UN(2,1) (%)
   */
  @XmlElement(name = "MOPAMPercentModulation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PERCENT2.class)
  private TDecimal mopamPercentModulation;
  /**
   * In Data Item US:MOPChangeRateAM (US), enter the change in amplitude within
   * the pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPChangeRateAM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPCHGAM.class)
  private TDecimal mopChangeRateAM;
  /**
   * In Data Item US:MOPChangeRateCW (US), enter the change in continuous wave
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPChangeRateCW", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPCHGFM.class)
  private TDecimal mopChangeRateCW;
  /**
   * In Data Item US:MOPChangeRateFM (US), enter the change in frequency within
   * the pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPChangeRateFM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPCHGFM.class)
  private TDecimal mopChangeRateFM;
  /**
   * In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPChangeRatePM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PHASEANGLERATE.class)
  private TDecimal mopChangeRatePM;
  /**
   * In Data Item US:MOPContinuous (US), indicate whether MOP or CW modulation
   * is Discrete or Continuous.
   */
  @XmlElement(name = "MOPContinuous", required = false)
  private TString mopContinuous;
  /**
   * In Data Item US:MOPID (US), enter a unique identifier (within the TxMode)
   * for the MOP data.
   */
  @XmlElement(name = "MOPID", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString mopid;
  /**
   * In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPMeanValueAM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSIGNED_DB_5_2.class)
  private TDecimal mopMeanValueAM;
  /**
   * In Data Item US:MOPMeanValueCW (US), enter the average continuous wave
   * frequency for a signal which changes on a non-patterned basis within a
   * pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPMeanValueCW", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopMeanValueCW;
  /**
   * In Data Item US:MOPMeanValue (US), enter the average frequency for a signal
   * which changes on a non-patterned basis within a pulse. Use of this element
   * should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPMeanValueFM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopMeanValueFM;
  /**
   * In Data Item US:MOPMeanValue (US), enter the average phase angle for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPMeanValuePM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PHASEANGLE.class)
  private TDecimal mopMeanValuePM;
  /**
   * In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   */
  @XmlElement(name = "MOPNumElements", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger mopNumElements;
  /**
   * In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy.
   */
  @XmlElement(name = "MOPOffTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopOffTime;
  /**
   * In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying.
   */
  @XmlElement(name = "MOPOnTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopOnTime;
  /**
   * In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha).
   */
  @XmlElement(name = "MOPPatternName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString mopPatternName;
  /**
   * In Data Item US:MOPPatternPeriod (US), enter the duration of one complete
   * cycle of Frequency, Phase or Amplitude variations for a signal which
   * changes on a patterned basis, within a pulse, for pulsed signals.
   */
  @XmlElement(name = "MOPPatternPeriod", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopPatternPeriod;
  /**
   * In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.
   */
  @XmlElement(name = "MOPPatternType", required = false)
  private TString mopPatternType;
  /**
   * In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value
   * which is associated with the selected MOP name (i.e., the name in the MOP
   * Pattern List).
   */
  @XmlElement(name = "MOPPulseDurationLink", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal mopPulseDurationLink;
  /**
   * In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product of
   * the waveform (actual PD times instantaneous bandwidth).
   */
  @XmlElement(name = "MOPTimeBWProduct", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_UN16_9.class)
  private TDecimal mopTimeBWProduct;
  /**
   * In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW).
   */
  @XmlElement(name = "MOPType", required = false)
  private TString mopType;
  /**
   * In Data Item US:MOPValueMaxAM (US), enter the maximum change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMaxAM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSIGNED_DB_5_2.class)
  private TDecimal mopValueMaxAM;
  /**
   * In Data Item US:MOPValueMaxCW (US), enter the maximum change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMaxCW", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopValueMaxCW;
  /**
   * In Data Item US:MOPValueMaxFM (US), enter the maximum change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMaxFM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopValueMaxFM;
  /**
   * In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMaxPM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PHASEANGLE.class)
  private TDecimal mopValueMaxPM;
  /**
   * In Data Item US:MOPValueMinAM (US), enter the minimum change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMinAM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSIGNED_DB_5_2.class)
  private TDecimal mopValueMinAM;
  /**
   * In Data Item US:MOPValueMinCW (US), enter the minimum change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMinCW", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopValueMinCW;
  /**
   * In Data Item US:MOPValueMinFM (US), enter the minimum change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMinFM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_MOPFM.class)
  private TDecimal mopValueMinFM;
  /**
   * In Data Item US:MOPValueMinPM (US), enter the minimum change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   */
  @XmlElement(name = "MOPValueMinPM", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PHASEANGLE.class)
  private TDecimal mopValueMinPM;
  /**
   * In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected.
   */
  @XmlElement(name = "SignalType", required = false)
  private TString signalType;
  /**
   * US:ObservedMOPSweep (Optional)
   * <p>
   * ObservedMOPSweep (US) contains data describing the parametric information
   * for the period of the Modulation on the Pulse sweep.
   */
  @XmlElement(name = "ObservedMOPSweep")
  private List<ObservedMOPSweep> observedMOPSweep;

  /**
   * Get the condition which controls, or can be associated with, the signal MOP
   * variations.
   * <p>
   * @return the MOPAdaptiveDriverDesc value in a {@link TString} data type
   */
  public TString getMOPAdaptiveDriverDesc() {
    return mopAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls, or can be associated with, the signal MOP
   * variations.
   * <p>
   * @param value the MOPAdaptiveDriverDesc value in a {@link TString} data type
   */
  public void setMOPAdaptiveDriverDesc(TString value) {
    this.mopAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the MOPAdaptiveDriverDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPAdaptiveDriverDesc() {
    return (this.mopAdaptiveDriverDesc != null ? this.mopAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal MOP variations.
   * <p>
   * @return the MOPAdaptiveDriverRuleDesc value in a {@link TString} data type
   */
  public TString getMOPAdaptiveDriverRuleDesc() {
    return mopAdaptiveDriverRuleDesc;
  }

  /**
   * Set the rule which describes the signal MOP variations.
   * <p>
   * @param value the MOPAdaptiveDriverRuleDesc value in a {@link TString} data
   *              type
   */
  public void setMOPAdaptiveDriverRuleDesc(TString value) {
    this.mopAdaptiveDriverRuleDesc = value;
  }

  /**
   * Determine if the MOPAdaptiveDriverRuleDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPAdaptiveDriverRuleDesc() {
    return (this.mopAdaptiveDriverRuleDesc != null ? this.mopAdaptiveDriverRuleDesc.isSetValue() : false);
  }

  /**
   * Get the AM Percent Modulation is the ratio (expressed as a percentage)
   * between the amplitude variation and the maximum amplitude
   * <p>
   * @return the MOPAMPercentModulation value in a {@link TDecimal} data type
   */
  public TDecimal getMOPAMPercentModulation() {
    return mopamPercentModulation;
  }

  /**
   * Set the AM Percent Modulation is the ratio (expressed as a percentage)
   * between the amplitude variation and the maximum amplitude
   * <p>
   * @param value the MOPAMPercentModulation value in a {@link TDecimal} data
   *              type
   */
  public void setMOPAMPercentModulation(TDecimal value) {
    this.mopamPercentModulation = value;
  }

  /**
   * Determine if the MOPAMPercentModulation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPAMPercentModulation() {
    return (this.mopamPercentModulation != null ? this.mopamPercentModulation.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRateAM (US), enter the change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPChangeRateAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPChangeRateAM() {
    return mopChangeRateAM;
  }

  /**
   * Set In Data Item US:MOPChangeRateAM (US), enter the change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPChangeRateAM value in a {@link TDecimal} data type
   */
  public void setMOPChangeRateAM(TDecimal value) {
    this.mopChangeRateAM = value;
  }

  /**
   * Determine if the MOPChangeRateAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRateAM() {
    return (this.mopChangeRateAM != null ? this.mopChangeRateAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRateCW (US), enter the change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPChangeRateCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPChangeRateCW() {
    return mopChangeRateCW;
  }

  /**
   * Set In Data Item US:MOPChangeRateCW (US), enter the change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPChangeRateCW value in a {@link TDecimal} data type
   */
  public void setMOPChangeRateCW(TDecimal value) {
    this.mopChangeRateCW = value;
  }

  /**
   * Determine if the MOPChangeRateCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRateCW() {
    return (this.mopChangeRateCW != null ? this.mopChangeRateCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRateFM (US), enter the change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPChangeRateFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPChangeRateFM() {
    return mopChangeRateFM;
  }

  /**
   * Set In Data Item US:MOPChangeRateFM (US), enter the change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPChangeRateFM value in a {@link TDecimal} data type
   */
  public void setMOPChangeRateFM(TDecimal value) {
    this.mopChangeRateFM = value;
  }

  /**
   * Determine if the MOPChangeRateFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRateFM() {
    return (this.mopChangeRateFM != null ? this.mopChangeRateFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPChangeRatePM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPChangeRatePM() {
    return mopChangeRatePM;
  }

  /**
   * Set In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPChangeRatePM value in a {@link TDecimal} data type
   */
  public void setMOPChangeRatePM(TDecimal value) {
    this.mopChangeRatePM = value;
  }

  /**
   * Determine if the MOPChangeRatePM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPChangeRatePM() {
    return (this.mopChangeRatePM != null ? this.mopChangeRatePM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPContinuous (US), indicate whether MOP or CW
   * modulation is Discrete or Continuous.
   * <p>
   * @return the MOPContinuous value in a {@link TString} data type
   */
  public TString getMOPContinuous() {
    return mopContinuous;
  }

  /**
   * Set In Data Item US:MOPContinuous (US), indicate whether MOP or CW
   * modulation is Discrete or Continuous.
   * <p>
   * @param value the MOPContinuous value in a {@link TString} data type
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
   * TxMode) for the MOP data.
   * <p>
   * @return the MOPID value in a {@link TString} data type
   */
  public TString getMOPID() {
    return mopid;
  }

  /**
   * Set In Data Item US:MOPID (US), enter a unique identifier (within the
   * TxMode) for the MOP data.
   * <p>
   * @param value the MOPID value in a {@link TString} data type
   */
  public void setMOPID(TString value) {
    this.mopid = value;
  }

  /**
   * Determine if the MOPID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPMeanValueAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPMeanValueAM() {
    return mopMeanValueAM;
  }

  /**
   * Set In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPMeanValueAM value in a {@link TDecimal} data type
   */
  public void setMOPMeanValueAM(TDecimal value) {
    this.mopMeanValueAM = value;
  }

  /**
   * Determine if the MOPMeanValueAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPMeanValueCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPMeanValueCW() {
    return mopMeanValueCW;
  }

  /**
   * Set In Data Item US:MOPMeanValueCW (US), enter the average continuous wave
   * frequency for a signal which changes on a non-patterned basis within a
   * pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPMeanValueCW value in a {@link TDecimal} data type
   */
  public void setMOPMeanValueCW(TDecimal value) {
    this.mopMeanValueCW = value;
  }

  /**
   * Determine if the MOPMeanValueCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPMeanValueFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPMeanValueFM() {
    return mopMeanValueFM;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average frequency for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPMeanValueFM value in a {@link TDecimal} data type
   */
  public void setMOPMeanValueFM(TDecimal value) {
    this.mopMeanValueFM = value;
  }

  /**
   * Determine if the MOPMeanValueFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPMeanValuePM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPMeanValuePM() {
    return mopMeanValuePM;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average phase angle for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPMeanValuePM value in a {@link TDecimal} data type
   */
  public void setMOPMeanValuePM(TDecimal value) {
    this.mopMeanValuePM = value;
  }

  /**
   * Determine if the MOPMeanValuePM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPMeanValuePM() {
    return (this.mopMeanValuePM != null ? this.mopMeanValuePM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @return the MOPNumElements value in a {@link TInteger} data type
   */
  public TInteger getMOPNumElements() {
    return mopNumElements;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @param value the MOPNumElements value in a {@link TInteger} data type
   */
  public void setMOPNumElements(TInteger value) {
    this.mopNumElements = value;
  }

  /**
   * Determine if the MOPNumElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPNumElements() {
    return (this.mopNumElements != null ? this.mopNumElements.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy.
   * <p>
   * @return the MOPOffTime value in a {@link TDecimal} data type
   */
  public TDecimal getMOPOffTime() {
    return mopOffTime;
  }

  /**
   * Set In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy.
   * <p>
   * @param value the MOPOffTime value in a {@link TDecimal} data type
   */
  public void setMOPOffTime(TDecimal value) {
    this.mopOffTime = value;
  }

  /**
   * Determine if the MOPOffTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPOffTime() {
    return (this.mopOffTime != null ? this.mopOffTime.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying.
   * <p>
   * @return the MOPOnTime value in a {@link TDecimal} data type
   */
  public TDecimal getMOPOnTime() {
    return mopOnTime;
  }

  /**
   * Set In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying.
   * <p>
   * @param value the MOPOnTime value in a {@link TDecimal} data type
   */
  public void setMOPOnTime(TDecimal value) {
    this.mopOnTime = value;
  }

  /**
   * Determine if the MOPOnTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPOnTime() {
    return (this.mopOnTime != null ? this.mopOnTime.isSetValue() : false);
  }

  /**
   * Get In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha).
   * <p>
   * @return the MOPPatternName value in a {@link TString} data type
   */
  public TString getMOPPatternName() {
    return mopPatternName;
  }

  /**
   * Set In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha).
   * <p>
   * @param value the MOPPatternName value in a {@link TString} data type
   */
  public void setMOPPatternName(TString value) {
    this.mopPatternName = value;
  }

  /**
   * Determine if the MOPPatternName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPPatternName() {
    return (this.mopPatternName != null ? this.mopPatternName.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPPatternPeriod (US), enter the duration of one
   * complete cycle of Frequency, Phase or Amplitude variations for a signal
   * which changes on a patterned basis, within a pulse, for pulsed signals.
   * <p>
   * @return the MOPPatternPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getMOPPatternPeriod() {
    return mopPatternPeriod;
  }

  /**
   * Set In Data Item US:MOPPatternPeriod (US), enter the duration of one
   * complete cycle of Frequency, Phase or Amplitude variations for a signal
   * which changes on a patterned basis, within a pulse, for pulsed signals.
   * <p>
   * @param value the MOPPatternPeriod value in a {@link TDecimal} data type
   */
  public void setMOPPatternPeriod(TDecimal value) {
    this.mopPatternPeriod = value;
  }

  /**
   * Determine if the MOPPatternPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPPatternPeriod() {
    return (this.mopPatternPeriod != null ? this.mopPatternPeriod.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.
   * <p>
   * @return the MOPPatternType value in a {@link TString} data type
   */
  public TString getMOPPatternType() {
    return mopPatternType;
  }

  /**
   * Set In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.
   * <p>
   * @param value the MOPPatternType value in a {@link TString} data type
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
   * Pattern List).
   * <p>
   * @return the MOPPulseDurationLink value in a {@link TDecimal} data type
   */
  public TDecimal getMOPPulseDurationLink() {
    return mopPulseDurationLink;
  }

  /**
   * Set In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value
   * which is associated with the selected MOP name (i.e., the name in the MOP
   * Pattern List).
   * <p>
   * @param value the MOPPulseDurationLink value in a {@link TDecimal} data type
   */
  public void setMOPPulseDurationLink(TDecimal value) {
    this.mopPulseDurationLink = value;
  }

  /**
   * Determine if the MOPPulseDurationLink is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPPulseDurationLink() {
    return (this.mopPulseDurationLink != null ? this.mopPulseDurationLink.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product
   * of the waveform (actual PD times instantaneous bandwidth).
   * <p>
   * @return the MOPTimeBWProduct value in a {@link TDecimal} data type
   */
  public TDecimal getMOPTimeBWProduct() {
    return mopTimeBWProduct;
  }

  /**
   * Set In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product
   * of the waveform (actual PD times instantaneous bandwidth).
   * <p>
   * @param value the MOPTimeBWProduct value in a {@link TDecimal} data type
   */
  public void setMOPTimeBWProduct(TDecimal value) {
    this.mopTimeBWProduct = value;
  }

  /**
   * Determine if the MOPTimeBWProduct is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPTimeBWProduct() {
    return (this.mopTimeBWProduct != null ? this.mopTimeBWProduct.isSetValue() : false);
  }

  /**
   * Get In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW).
   * <p>
   * @return the MOPType value in a {@link TString} data type
   */
  public TString getMOPType() {
    return mopType;
  }

  /**
   * Set In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW).
   * <p>
   * @param value the MOPType value in a {@link TString} data type
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
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMaxAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMaxAM() {
    return mopValueMaxAM;
  }

  /**
   * Set In Data Item US:MOPValueMaxAM (US), enter the maximum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMaxAM value in a {@link TDecimal} data type
   */
  public void setMOPValueMaxAM(TDecimal value) {
    this.mopValueMaxAM = value;
  }

  /**
   * Determine if the MOPValueMaxAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxAM() {
    return (this.mopValueMaxAM != null ? this.mopValueMaxAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMaxCW (US), enter the maximum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMaxCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMaxCW() {
    return mopValueMaxCW;
  }

  /**
   * Set In Data Item US:MOPValueMaxCW (US), enter the maximum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMaxCW value in a {@link TDecimal} data type
   */
  public void setMOPValueMaxCW(TDecimal value) {
    this.mopValueMaxCW = value;
  }

  /**
   * Determine if the MOPValueMaxCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxCW() {
    return (this.mopValueMaxCW != null ? this.mopValueMaxCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMaxFM (US), enter the maximum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMaxFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMaxFM() {
    return mopValueMaxFM;
  }

  /**
   * Set In Data Item US:MOPValueMaxFM (US), enter the maximum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMaxFM value in a {@link TDecimal} data type
   */
  public void setMOPValueMaxFM(TDecimal value) {
    this.mopValueMaxFM = value;
  }

  /**
   * Determine if the MOPValueMaxFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxFM() {
    return (this.mopValueMaxFM != null ? this.mopValueMaxFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMaxPM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMaxPM() {
    return mopValueMaxPM;
  }

  /**
   * Set In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMaxPM value in a {@link TDecimal} data type
   */
  public void setMOPValueMaxPM(TDecimal value) {
    this.mopValueMaxPM = value;
  }

  /**
   * Determine if the MOPValueMaxPM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMaxPM() {
    return (this.mopValueMaxPM != null ? this.mopValueMaxPM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinAM (US), enter the minimum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMinAM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMinAM() {
    return mopValueMinAM;
  }

  /**
   * Set In Data Item US:MOPValueMinAM (US), enter the minimum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMinAM value in a {@link TDecimal} data type
   */
  public void setMOPValueMinAM(TDecimal value) {
    this.mopValueMinAM = value;
  }

  /**
   * Determine if the MOPValueMinAM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinAM() {
    return (this.mopValueMinAM != null ? this.mopValueMinAM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinCW (US), enter the minimum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMinCW value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMinCW() {
    return mopValueMinCW;
  }

  /**
   * Set In Data Item US:MOPValueMinCW (US), enter the minimum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMinCW value in a {@link TDecimal} data type
   */
  public void setMOPValueMinCW(TDecimal value) {
    this.mopValueMinCW = value;
  }

  /**
   * Determine if the MOPValueMinCW is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinCW() {
    return (this.mopValueMinCW != null ? this.mopValueMinCW.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinFM (US), enter the minimum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMinFM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMinFM() {
    return mopValueMinFM;
  }

  /**
   * Set In Data Item US:MOPValueMinFM (US), enter the minimum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMinFM value in a {@link TDecimal} data type
   */
  public void setMOPValueMinFM(TDecimal value) {
    this.mopValueMinFM = value;
  }

  /**
   * Determine if the MOPValueMinFM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinFM() {
    return (this.mopValueMinFM != null ? this.mopValueMinFM.isSetValue() : false);
  }

  /**
   * Get In Data Item US:MOPValueMinPM (US), enter the minimum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @return the MOPValueMinPM value in a {@link TDecimal} data type
   */
  public TDecimal getMOPValueMinPM() {
    return mopValueMinPM;
  }

  /**
   * Set In Data Item US:MOPValueMinPM (US), enter the minimum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value the MOPValueMinPM value in a {@link TDecimal} data type
   */
  public void setMOPValueMinPM(TDecimal value) {
    this.mopValueMinPM = value;
  }

  /**
   * Determine if the MOPValueMinPM is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMOPValueMinPM() {
    return (this.mopValueMinPM != null ? this.mopValueMinPM.isSetValue() : false);
  }

  /**
   * Get In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected.
   * <p>
   * @return the SignalType value in a {@link TString} data type
   */
  public TString getSignalType() {
    return signalType;
  }

  /**
   * Set In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected.
   * <p>
   * @param value the SignalType value in a {@link TString} data type
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
   * parametric information for the period of the Modulation on the Pulse sweep.
   * <p>
   * @return a {@link List<ObservedMOPSweep>} instance
   */
  public List<ObservedMOPSweep> getObservedMOPSweep() {
    if (observedMOPSweep == null) {
      observedMOPSweep = new ArrayList<>();
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
   * @param value An instances of type {@link String}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPAdaptiveDriverDesc(String value) {
    setMOPAdaptiveDriverDesc(new TString(value));
    return this;
  }

  /**
   * Set the rule which describes the signal MOP variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPAdaptiveDriverRuleDesc(String value) {
    setMOPAdaptiveDriverRuleDesc(new TString(value));
    return this;
  }

  /**
   * Set the AM Percent Modulation is the ratio (expressed as a percentage)
   * between the amplitude variation and the maximum amplitude
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPAMPercentModulation(Double value) {
    setMOPAMPercentModulation(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRateAM (US), enter the change in amplitude
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPChangeRateAM(Double value) {
    setMOPChangeRateAM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRateCW (US), enter the change in continuous
   * wave frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPChangeRateCW(Double value) {
    setMOPChangeRateCW(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRateFM (US), enter the change in frequency
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPChangeRateFM(Double value) {
    setMOPChangeRateFM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPChangeRatePM (US), enter the change in phase angle
   * within the pulse. Use of this element should agree with the selection made
   * in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPChangeRatePM(Double value) {
    setMOPChangeRatePM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPContinuous (US), indicate whether MOP or CW
   * modulation is Discrete or Continuous.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPContinuous(ListCBO value) {
    setMOPContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item US:MOPID (US), enter a unique identifier (within the
   * TxMode) for the MOP data.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPID(String value) {
    setMOPID(new TString(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPMeanValueAM(Double value) {
    setMOPMeanValueAM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValueCW (US), enter the average continuous wave
   * frequency for a signal which changes on a non-patterned basis within a
   * pulse. Use of this element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPMeanValueCW(Double value) {
    setMOPMeanValueCW(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average frequency for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPMeanValueFM(Double value) {
    setMOPMeanValueFM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPMeanValue (US), enter the average phase angle for a
   * signal which changes on a non-patterned basis within a pulse. Use of this
   * element should agree with the selection made in
   * US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPMeanValuePM(Double value) {
    setMOPMeanValuePM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPNumElements (US), enter the number of discrete
   * FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any
   * repeated values are counted each time)
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPNumElements(Integer value) {
    setMOPNumElements(new TInteger(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPOffTime (US), enter the duration of the state of the
   * modulated waveform with the absence of energy.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPOffTime(Double value) {
    setMOPOffTime(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPOnTime (US), enter the duration of the one on-time
   * related to the binary form of amplitude modulation called on-off keying.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPOnTime(Double value) {
    setMOPOnTime(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item MOPPatternName (US), enter a freeform text name for the
   * pattern (e.g., Phase Alpha).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPPatternName(String value) {
    setMOPPatternName(new TString(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPPatternPeriod (US), enter the duration of one
   * complete cycle of Frequency, Phase or Amplitude variations for a signal
   * which changes on a patterned basis, within a pulse, for pulsed signals.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPPatternPeriod(Double value) {
    setMOPPatternPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPPatternType (US), indicate whether MOP or CW
   * characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.
   * <p>
   * @param value An instances of type {@link ListUS7}
   * @return The current ObservedMOPAnalysis object instance
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
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPPulseDurationLink(Double value) {
    setMOPPulseDurationLink(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product
   * of the waveform (actual PD times instantaneous bandwidth).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPTimeBWProduct(Double value) {
    setMOPTimeBWProduct(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item MOPType (US), indicate if the information imprinted on the
   * pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a
   * continuous wave (CW).
   * <p>
   * @param value An instances of type {@link ListUSX}
   * @return The current ObservedMOPAnalysis object instance
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
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMaxAM(Double value) {
    setMOPValueMaxAM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMaxCW (US), enter the maximum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMaxCW(Double value) {
    setMOPValueMaxCW(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMaxFM (US), enter the maximum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMaxFM(Double value) {
    setMOPValueMaxFM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMaxPM(Double value) {
    setMOPValueMaxPM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinAM (US), enter the minimum change in
   * amplitude within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMinAM(Double value) {
    setMOPValueMinAM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinCW (US), enter the minimum change in
   * continuous wave frequency within the pulse. Use of this element should
   * agree with the selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMinCW(Double value) {
    setMOPValueMinCW(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinFM (US), enter the minimum change in
   * frequency within the pulse. Use of this element should agree with the
   * selection made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMinFM(Double value) {
    setMOPValueMinFM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item US:MOPValueMinPM (US), enter the minimum change in phase
   * angle within the pulse. Use of this element should agree with the selection
   * made in US:ObservedMOPAnalysis.MOPType.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedMOPAnalysis object instance
   */
  public ObservedMOPAnalysis withMOPValueMinPM(Double value) {
    setMOPValueMinPM(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item SignalType (US), indicate the specific type of modulation
   * used/detected.
   * <p>
   * @param value An instances of type {@link ListCMO}
   * @return The current ObservedMOPAnalysis object instance
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
   * @param values One or more instances of type {@link ObservedMOPSweep...}
   * @return The current ObservedMOPAnalysis object instance
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
   * @return The current ObservedMOPAnalysis object instance
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
      + " mopNumElements [" + mopNumElements + "]"
      + " mopValueMinCW [" + mopValueMinCW + "]"
      + " mopValueMaxPM [" + mopValueMaxPM + "]"
      + " mopPatternName [" + mopPatternName + "]"
      + " mopChangeRateAM [" + mopChangeRateAM + "]"
      + " signalType [" + signalType + "]"
      + " mopOffTime [" + mopOffTime + "]"
      + " mopTimeBWProduct [" + mopTimeBWProduct + "]"
      + " mopMeanValuePM [" + mopMeanValuePM + "]"
      + " mopValueMinFM [" + mopValueMinFM + "]"
      + " mopValueMaxFM [" + mopValueMaxFM + "]"
      + " mopChangeRateCW [" + mopChangeRateCW + "]"
      + " mopChangeRatePM [" + mopChangeRatePM + "]"
      + " mopAdaptiveDriverDesc [" + mopAdaptiveDriverDesc + "]"
      + " mopMeanValueCW [" + mopMeanValueCW + "]"
      + " mopMeanValueFM [" + mopMeanValueFM + "]"
      + " mopValueMinAM [" + mopValueMinAM + "]"
      + " mopPulseDurationLink [" + mopPulseDurationLink + "]"
      + " mopamPercentModulation [" + mopamPercentModulation + "]"
      + " mopid [" + mopid + "]"
      + " mopType [" + mopType + "]"
      + " observedMOPSweep [" + observedMOPSweep + "]"
      + " mopContinuous [" + mopContinuous + "]"
      + " mopValueMaxCW [" + mopValueMaxCW + "]"
      + " mopPatternType [" + mopPatternType + "]"
      + " mopChangeRateFM [" + mopChangeRateFM + "]"
      + " mopOnTime [" + mopOnTime + "]"
      + " mopValueMinPM [" + mopValueMinPM + "]"
      + " mopValueMaxAM [" + mopValueMaxAM + "]"
      + " mopPatternPeriod [" + mopPatternPeriod + "]"
      + " mopAdaptiveDriverRuleDesc [" + mopAdaptiveDriverRuleDesc + "]"
      + " mopMeanValueAM [" + mopMeanValueAM + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedMOPAnalysis} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
