package us.gov.dod.standard.ssrf._3_1.transmitter;

import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
ObservedPulseAnalysis (US) contains data describing the specific characteristics of the pulse group, pulse sequence, and distinct pulse information.

Element of {@link TxMode}

Sub-Element is {@link ObservedPulseValues}

Example: <pre>
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
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
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
US:FallTime - Fall Time (Optional) 

The time required for a pulse to fall from 90% to 10 percent of the mean peak amplitude of its voltage waveform/envelope.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "FallTime", required = false)
    private microsecs fallTime;
/**
US:NumPDPositions - Num PD Positions (Optional) 

The number of pulses (i.e., positions) in a repeating sequence of pulses which has multiple (2 or more) PD values.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumPDPositions", required = false)
    private UN6 numPDPositions;
/**
US:NumPDValues - Num PD Values (Optional) 

The number of discrete PD values (i.e., elements) in a repeating sequence of pulses which has multiple (2 or more) PD values.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumPDValues", required = false)
    private UN6 numPDValues;
/**
US:NumPRIElements - Num PRI Elements (Optional) 

The number of discrete PRI values in a repeating sequence of discrete PRIs.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumPRIElements", required = false)
    private UN6 numPRIElements;
/**
US:NumPRIPositions - Num PRI Positions (Optional) 

The number of time intervals between pulses or pulse groups, or the number of PRI dwell groups, in a repeating PRI sequence which uses discrete PRI values.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumPRIPositions", required = false)
    private UN6 numPRIPositions;
/**
US:PDAdaptiveRuleDesc - PD Adaptive Rule Description (Optional) 

The rule which describes the signal PD variations (aka. modulation).

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "PDAdaptiveRuleDesc", required = false)
    private S500 pdAdaptiveRuleDesc;
/**
In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.
@since 3.1.0
*/
    @XmlElement(name = "PDContinuous", required = false)
    private TString pdContinuous;
/**
US:PDDwellMax - PD Dwell Max  (Optional) 

The maximum time duration for a complete dwell/group of pulses which all have the same PD value.

[XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than US:PDDwellMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDDwellMax", required = false)
    private microsecs pdDwellMax;
/**
US:PDDwellMin - PD Dwell Min (Optional) 

The minimum time duration for a complete dwell/group of pulses which all have the same PD value.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDDwellMin", required = false)
    private microsecs pdDwellMin;
/**
US:PDExtremeMax - Maximum PD Extreme (Optional) 

The maximum PD value that represents 100% of observed values.

[XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than US:PDExtremeMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDExtremeMax", required = false)
    private microsecs pdExtremeMax;
/**
US:PDExtremeMin - Minimum PD Extreme (Optional) 

The minimum PD value that represents 100% of observed values.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDExtremeMin", required = false)
    private microsecs pdExtremeMin;
/**
US:PDMax - Maximum PD (Optional) 

The highest discrete PD value in a repeating sequence of pulses which has multiple PD values

[XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDMax", required = false)
    private microsecs pdMax;
/**
US:PDMean - Average PD (Optional) 

The average PD of a signal which changes PD values on a non-patterned basis.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDMean", required = false)
    private microsecs pdMean;
/**
US:PDMedian - PD Median (Optional) 

The PD value that the signal most often used, based on a statistical study.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDMedian", required = false)
    private microsecs pdMedian;
/**
US:PDMin - Minimum PD (Optional) 

The delta lowest discrete PD value in a repeating sequence of pulses which has multiple PD values

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDMin", required = false)
    private microsecs pdMin;
/**
US:PDPatternPeriod - PD Pattern Period (Optional) 

The time duration for one complete cycle of a repeating sequence of pulses which has multiple (2 or more) PD values; the time duration shall go from a point in one cycle to a like point in the next cycle.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDPatternPeriod", required = false)
    private microsecs pdPatternPeriod;
/**
In Data Item PDPatternType (US), Indicate whether PD is unmodulated or pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.
@since 3.1.0
*/
    @XmlElement(name = "PDPatternType", required = false)
    private TString pdPatternType;
/**
US:PDSequenceDesc - PD Sequence Description (Optional) 

A freetext description of the PD Sequence.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "PDSequenceDesc", required = false)
    private S500 pdSequenceDesc;
/**
US:PDStdDev - PD Standard Deviation (Optional) 

The standard deviation of the data sample used to calculate PD Mean.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDStdDev", required = false)
    private microsecs pdStdDev;
/**
US:PDStep - PD Step (Optional) 

The Step between adjacent PD values; pertains to discrete PD variations.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDStep", required = false)
    private microsecs pdStep;
/**
US:PDTypicalMax - Maximum PD Typical  (Optional) 

The upper end of the range of PD values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than US:PDTypicalMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDTypicalMax", required = false)
    private microsecs pdTypicalMax;
/**
US:PDTypicalMin - Minimum PD Typical  (Optional) 

The lower end of the range of PD values that represents 95% of observed values, from a statistical study

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PDTypicalMin", required = false)
    private microsecs pdTypicalMin;
/**
US:PRFChangeRate - PRF Change Rate (Optional) 

The rate of change for PD variations expressed as PD change per unit of time.

Format is UN(12,6) (μsec/sec)
@since 3.1.0
*/
    @XmlElement(name = "PRFChangeRate", required = false)
    private US_PRIChgRate prfChangeRate;
/**
US:PRFExtremeMax - Maximum PRF Extreme (Optional) 

The minimum Observed PRF in the signal sample.

[XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than US:PRFExtremeMin.

Format is UN(7,2) (pps)
@since 3.1.0
*/
    @XmlElement(name = "PRFExtremeMax", required = false)
    private US_PPS prfExtremeMax;
/**
US:PRFExtremeMin - Minimum PRF Extreme (Optional) 

The minimum Observed PRF in the signal sample.

Format is UN(7,2) (pps)
@since 3.1.0
*/
    @XmlElement(name = "PRFExtremeMin", required = false)
    private US_PPS prfExtremeMin;
/**
US:PRFMax - PRF Max (Optional) 

The highest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set.

[XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.

Format is UN(7,2) (pps)
@since 3.1.0
*/
    @XmlElement(name = "PRFMax", required = false)
    private US_PPS prfMax;
/**
US:PRFMin - PRF Min (Optional) 

The lowest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set. 

Format is UN(7,2) (pps)
@since 3.1.0
*/
    @XmlElement(name = "PRFMin", required = false)
    private US_PPS prfMin;
/**
US:PRFTypicalMax - Maximum PRF Typical (Optional) 

The upper end of the range of PRF values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than US:PRFTypicalMin.

Format is UN(7,2) (pps)
@since 3.1.0
*/
    @XmlElement(name = "PRFTypicalMax", required = false)
    private US_PPS prfTypicalMax;
/**
US:PRFTypicalMin - Minimum PRF Typical (Optional) 

The lower end of the range of PRF values that represents 95% of observed values, from a statistical study

Format is UN(7,2) (pps)
@since 3.1.0
*/
    @XmlElement(name = "PRFTypicalMin", required = false)
    private US_PPS prfTypicalMin;
/**
US:PRIAdaptiveDriverDesc - PRI Adaptive Driver Description (Optional) 

The condition which controls or can be associated with the signal PRI variations (aka, interpulse modulation changes).

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "PRIAdaptiveDriverDesc", required = false)
    private S500 priAdaptiveDriverDesc;
/**
US:PRIAdaptiveRuleDesc - PRI Adaptive Rule Description (Optional) 

The rule which describes the signal PRI variations (aka, interpulse modulation changes)

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "PRIAdaptiveRuleDesc", required = false)
    private S500 priAdaptiveRuleDesc;
/**
US:PRIAnomalousValues - PRI Anomalous Values (Optional) 

Any regularly occurring signal values which do not fit in any of the other PRI related fields. For example Minimum Scheduling Interval (MSI) values, or Engagement Group Duration values can be documented in this field.. When used, the data shall be clearly described, so all users understand the meaning of the values.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "PRIAnomalousValues", required = false)
    private S500 priAnomalousValues;
/**
US:PRIBasicClockPeriod - PRI Basic Clock Period (Optional) 

The fundamental period of the emitter clock which is used to generate the subject signal PRIs

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIBasicClockPeriod", required = false)
    private microsecs priBasicClockPeriod;
/**
US:PRIChangeRate - PRI Change Rate (Optional) 

The PRI change per unit of time, measured over a significant portion of the waveform. This applies to Continuous PRI variations.

Format is UN(12,6) (μsec/sec)
@since 3.1.0
*/
    @XmlElement(name = "PRIChangeRate", required = false)
    private US_PRIChgRate priChangeRate;
/**
In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.
@since 3.1.0
*/
    @XmlElement(name = "PRIContinuous", required = false)
    private TString priContinuous;
/**
US:PRICountdown - PRI Countdown (Optional) 

The integer (aka, count or countdown) associated with the PRI Crystal value to provide the Pattern Period.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "PRICountdown", required = false)
    private UN6 priCountdown;
/**
US:PRICountdownKey - PRI Countdown Key (Optional) 

The integer (aka, count or countdown) used to generate the PRI from the PRI Crystal value.

Format is UN(9)
@since 3.1.0
*/
    @XmlElement(name = "PRICountdownKey", required = false)
    private UN9 priCountdownKey;
/**
US:PRIExtremeMax - PRI Extreme Max (Optional) 

The maximum observed PRI value, from a statistical study of a 100% data set.

[XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than US:PRIExtremeMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIExtremeMax", required = false)
    private microsecs priExtremeMax;
/**
US:PRIExtremeMin - PRI Extreme Min (Optional) 

The minimum observed PRI value, from a statistical study of a 100% data set.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIExtremeMin", required = false)
    private microsecs priExtremeMin;
/**
US:PRIFramePeriod - PRI Frame Period (Optional) 

The time difference between a point on the leading edge of the frame marker (or an alternate pulse in the frame), to the similar point on the leading edge of the frame marker (or the alternate pulse) in the next/consecutive frame.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIFramePeriod", required = false)
    private microsecs priFramePeriod;
/**
US:PRIFrameRate - PRI Frame Rate (Optional) 

The rate of frame generation during the Pulse Repetition Interval. For example, 10 frames generated during a PRI of 1 us yields a PRI frame rate of 10 MHz.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "PRIFrameRate", required = false)
    private FreqM priFrameRate;
/**
US:PRIGroupPulseSpacing - PRI Group Pulse Spacing (Optional) 

The time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIGroupPulseSpacing", required = false)
    private microsecs priGroupPulseSpacing;
/**
US:PRIGroupSpacing - PRI Group Spacing (Optional) 

The PRI between two groups of pulses which both have constant but different PRIs (aka, the PRI between consecutive PRI dwell groups).

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIGroupSpacing", required = false)
    private microsecs priGroupSpacing;
/**
US:PRIMean - Average PRI (Optional) 

The average PRI value for a signal which changes PRI values on a non-patterned basis.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIMean", required = false)
    private microsecs priMean;
/**
US:PRIMedian - PRI Median (Optional) 

The observed PRI value that the signal most often used based on statistical study of a data set.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIMedian", required = false)
    private microsecs priMedian;
/**
US:PRIMedianCountdowns - PRI Median Countdowns (Optional) 

The observed PRI Crystal Counts used to generate the PRIs used most often by the signal, based on statistical study of a data set.

Format is S100
@since 3.1.0
*/
    @XmlElement(name = "PRIMedianCountdowns", required = false)
    private S100 priMedianCountdowns;
/**
US:PRIPatternPeriod - PRI Pattern Period (Optional) 

The time duration for one complete cycle of a repeating PRI sequence.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIPatternPeriod", required = false)
    private microsecs priPatternPeriod;
/**
US:PRIPatternType - PRI Pattern Type  (Optional) 

Whether the PRI is unmodulated or pulse-to-pulse PRI variations are Patterned, Non-Patterned, or Adaptive.

Format is L:US7
@since 3.1.0
*/
    @XmlElement(name = "PRIPatternType", required = false)
    private TString priPatternType;
/**
US:PRIPulsesPerGroup - PRI Pulses Per Group (Optional) 

The number of pulses in a pulse group.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "PRIPulsesPerGroup", required = false)
    private UN6 priPulsesPerGroup;
/**
US:PRISequenceDesc - PRI Sequence Description (Optional) 

A free text description of the PRI Sequence.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "PRISequenceDesc", required = false)
    private S500 priSequenceDesc;
/**
US:PRIStability - PRI Stability (Optional) 

The variation of a mean PRI value measured from one time to another time

Format is UN(18,6) (ppm)
@since 3.1.0
*/
    @XmlElement(name = "PRIStability", required = false)
    private US_PPM priStability;
/**
US:PRIStabilitySamplePeriod - PRI Stability Sample Period (Optional) 

The time interval used to determine the PRI stability value.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIStabilitySamplePeriod", required = false)
    private microsecs priStabilitySamplePeriod;
/**
US:PRIStdDev - PRI Standard Deviation (Optional) 

The standard deviation associated with the data set used to calculate the values entered in the PRI Mean fields

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIStdDev", required = false)
    private microsecs priStdDev;
/**
US:PRIStep - PRI Step (Optional) 

The delta between the Most Probable observed PRI values of adjacent and discrete PRI.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRIStep", required = false)
    private microsecs priStep;
/**
US:PRISubframePeriod - PRI Subframe Period (Optional) 

The time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRISubframePeriod", required = false)
    private microsecs priSubframePeriod;
/**
US:PRISubframeRate - PRI Subframe Rate (Optional) 

The number of subframes detected during each PRI Subframe period.

Format is UN(16,9) [0..1E9] (MHz)
@since 3.1.0
*/
    @XmlElement(name = "PRISubframeRate", required = false)
    private FreqM priSubframeRate;
/**
US:PRITimingShift - PRI Timing Shift (Optional) 

The PRI timing shift value, on Emitters with repeated timing shifts of a predictable magnitude, but not predictable timing.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRITimingShift", required = false)
    private microsecs priTimingShift;
/**
US:PRITypicalMax - PRI Typical Max (Optional) 

The upper end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

[XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than US:PRITypicalMin.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRITypicalMax", required = false)
    private microsecs priTypicalMax;
/**
US:PRITypicalMin - PRI Typical Min (Optional) 

The lower end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "PRITypicalMin", required = false)
    private microsecs priTypicalMin;
/**
US:RiseTime - RiseTime (Optional) 

The time required for a pulse to rise from 10% to 90 percent of the mean peak amplitude of the voltage pattern.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "RiseTime", required = false)
    private microsecs riseTime;
/**
US:ObservedPulseValues (Optional)

ObservedPulseValues (US) contains data describing the distinct Pulse values related to the Modulation Type.
@since 3.1.0
*/
    @XmlElement(name = "ObservedPulseValues")
      private  Set<ObservedPulseValues> observedPulseValues;

/**
Get the time required for a pulse to fall from 90% to 10 percent of the mean peak amplitude of its voltage waveform/envelope.

@return the FallTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getFallTime() {
        return fallTime;
    }

/**
Set the time required for a pulse to fall from 90% to 10 percent of the mean peak amplitude of its voltage waveform/envelope.

@param value the FallTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setFallTime(microsecs value) {
        this.fallTime = value;
    }

/**
Determine if the FallTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetFallTime() {
        return (this.fallTime!= null);
    }

/**
Get the number of pulses (i.e., positions) in a repeating sequence of pulses which has multiple (2 or more) PD values.

@return the NumPDPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumPDPositions() {
        return numPDPositions;
    }

/**
Set the number of pulses (i.e., positions) in a repeating sequence of pulses which has multiple (2 or more) PD values.

@param value the NumPDPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumPDPositions(UN6 value) {
        this.numPDPositions = value;
    }

/**
Determine if the NumPDPositions is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumPDPositions() {
        return (this.numPDPositions!= null);
    }

/**
Get the number of discrete PD values (i.e., elements) in a repeating sequence of pulses which has multiple (2 or more) PD values.

@return the NumPDValues value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumPDValues() {
        return numPDValues;
    }

/**
Set the number of discrete PD values (i.e., elements) in a repeating sequence of pulses which has multiple (2 or more) PD values.

@param value the NumPDValues value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumPDValues(UN6 value) {
        this.numPDValues = value;
    }

/**
Determine if the NumPDValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumPDValues() {
        return (this.numPDValues!= null);
    }

/**
Get the number of discrete PRI values in a repeating sequence of discrete PRIs.

@return the NumPRIElements value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumPRIElements() {
        return numPRIElements;
    }

/**
Set the number of discrete PRI values in a repeating sequence of discrete PRIs.

@param value the NumPRIElements value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumPRIElements(UN6 value) {
        this.numPRIElements = value;
    }

/**
Determine if the NumPRIElements is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumPRIElements() {
        return (this.numPRIElements!= null);
    }

/**
Get the number of time intervals between pulses or pulse groups, or the number of PRI dwell groups, in a repeating PRI sequence which uses discrete PRI values.

@return the NumPRIPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumPRIPositions() {
        return numPRIPositions;
    }

/**
Set the number of time intervals between pulses or pulse groups, or the number of PRI dwell groups, in a repeating PRI sequence which uses discrete PRI values.

@param value the NumPRIPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumPRIPositions(UN6 value) {
        this.numPRIPositions = value;
    }

/**
Determine if the NumPRIPositions is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumPRIPositions() {
        return (this.numPRIPositions!= null);
    }

/**
Get the rule which describes the signal PD variations (aka. modulation).

@return the PDAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getPDAdaptiveRuleDesc() {
        return pdAdaptiveRuleDesc;
    }

/**
Set the rule which describes the signal PD variations (aka. modulation).

@param value the PDAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setPDAdaptiveRuleDesc(S500 value) {
        this.pdAdaptiveRuleDesc = value;
    }

/**
Determine if the PDAdaptiveRuleDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDAdaptiveRuleDesc() {
        return (this.pdAdaptiveRuleDesc!= null);
    }

/**
Get In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@return the PDContinuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getPDContinuous() {
        return pdContinuous;
    }

/**
Set In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value the PDContinuous value in a {@link TString} data type
@since 3.1.0
*/
public void setPDContinuous(TString value) {
        this.pdContinuous = value;
    }

/**
Determine if the PDContinuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDContinuous() {
return (this.pdContinuous!= null ? this.pdContinuous.isSetValue() : false);
    }

/**
Get the maximum time duration for a complete dwell/group of pulses which all have the same PD value.

[XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than US:PDDwellMin.

@return the PDDwellMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDDwellMax() {
        return pdDwellMax;
    }

/**
Set the maximum time duration for a complete dwell/group of pulses which all have the same PD value.

[XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than US:PDDwellMin.

@param value the PDDwellMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDDwellMax(microsecs value) {
        this.pdDwellMax = value;
    }

/**
Determine if the PDDwellMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDDwellMax() {
        return (this.pdDwellMax!= null);
    }

/**
Get the minimum time duration for a complete dwell/group of pulses which all have the same PD value.

@return the PDDwellMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDDwellMin() {
        return pdDwellMin;
    }

/**
Set the minimum time duration for a complete dwell/group of pulses which all have the same PD value.

@param value the PDDwellMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDDwellMin(microsecs value) {
        this.pdDwellMin = value;
    }

/**
Determine if the PDDwellMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDDwellMin() {
        return (this.pdDwellMin!= null);
    }

/**
Get the maximum PD value that represents 100% of observed values.

[XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than US:PDExtremeMin.

@return the PDExtremeMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDExtremeMax() {
        return pdExtremeMax;
    }

/**
Set the maximum PD value that represents 100% of observed values.

[XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than US:PDExtremeMin.

@param value the PDExtremeMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDExtremeMax(microsecs value) {
        this.pdExtremeMax = value;
    }

/**
Determine if the PDExtremeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDExtremeMax() {
        return (this.pdExtremeMax!= null);
    }

/**
Get the minimum PD value that represents 100% of observed values.

@return the PDExtremeMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDExtremeMin() {
        return pdExtremeMin;
    }

/**
Set the minimum PD value that represents 100% of observed values.

@param value the PDExtremeMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDExtremeMin(microsecs value) {
        this.pdExtremeMin = value;
    }

/**
Determine if the PDExtremeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDExtremeMin() {
        return (this.pdExtremeMin!= null);
    }

/**
Get the highest discrete PD value in a repeating sequence of pulses which has multiple PD values

[XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.

@return the PDMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDMax() {
        return pdMax;
    }

/**
Set the highest discrete PD value in a repeating sequence of pulses which has multiple PD values

[XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.

@param value the PDMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDMax(microsecs value) {
        this.pdMax = value;
    }

/**
Determine if the PDMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDMax() {
        return (this.pdMax!= null);
    }

/**
Get the average PD of a signal which changes PD values on a non-patterned basis.

@return the PDMean value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDMean() {
        return pdMean;
    }

/**
Set the average PD of a signal which changes PD values on a non-patterned basis.

@param value the PDMean value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDMean(microsecs value) {
        this.pdMean = value;
    }

/**
Determine if the PDMean is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDMean() {
        return (this.pdMean!= null);
    }

/**
Get the PD value that the signal most often used, based on a statistical study.

@return the PDMedian value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDMedian() {
        return pdMedian;
    }

/**
Set the PD value that the signal most often used, based on a statistical study.

@param value the PDMedian value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDMedian(microsecs value) {
        this.pdMedian = value;
    }

/**
Determine if the PDMedian is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDMedian() {
        return (this.pdMedian!= null);
    }

/**
Get the delta lowest discrete PD value in a repeating sequence of pulses which has multiple PD values

@return the PDMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDMin() {
        return pdMin;
    }

/**
Set the delta lowest discrete PD value in a repeating sequence of pulses which has multiple PD values

@param value the PDMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDMin(microsecs value) {
        this.pdMin = value;
    }

/**
Determine if the PDMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDMin() {
        return (this.pdMin!= null);
    }

/**
Get the time duration for one complete cycle of a repeating sequence of pulses which has multiple (2 or more) PD values; the time duration shall go from a point in one cycle to a like point in the next cycle.

@return the PDPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDPatternPeriod() {
        return pdPatternPeriod;
    }

/**
Set the time duration for one complete cycle of a repeating sequence of pulses which has multiple (2 or more) PD values; the time duration shall go from a point in one cycle to a like point in the next cycle.

@param value the PDPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDPatternPeriod(microsecs value) {
        this.pdPatternPeriod = value;
    }

/**
Determine if the PDPatternPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDPatternPeriod() {
        return (this.pdPatternPeriod!= null);
    }

/**
Get In Data Item PDPatternType (US), Indicate whether PD is unmodulated or pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.

@return the PDPatternType value in a {@link TString} data type
@since 3.1.0
*/
public TString getPDPatternType() {
        return pdPatternType;
    }

/**
Set In Data Item PDPatternType (US), Indicate whether PD is unmodulated or pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.

@param value the PDPatternType value in a {@link TString} data type
@since 3.1.0
*/
public void setPDPatternType(TString value) {
        this.pdPatternType = value;
    }

/**
Determine if the PDPatternType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDPatternType() {
return (this.pdPatternType!= null ? this.pdPatternType.isSetValue() : false);
    }

/**
Get a freetext description of the PD Sequence.

@return the PDSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getPDSequenceDesc() {
        return pdSequenceDesc;
    }

/**
Set a freetext description of the PD Sequence.

@param value the PDSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setPDSequenceDesc(S500 value) {
        this.pdSequenceDesc = value;
    }

/**
Determine if the PDSequenceDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDSequenceDesc() {
        return (this.pdSequenceDesc!= null);
    }

/**
Get the standard deviation of the data sample used to calculate PD Mean.

@return the PDStdDev value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDStdDev() {
        return pdStdDev;
    }

/**
Set the standard deviation of the data sample used to calculate PD Mean.

@param value the PDStdDev value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDStdDev(microsecs value) {
        this.pdStdDev = value;
    }

/**
Determine if the PDStdDev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDStdDev() {
        return (this.pdStdDev!= null);
    }

/**
Get the Step between adjacent PD values; pertains to discrete PD variations.

@return the PDStep value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDStep() {
        return pdStep;
    }

/**
Set the Step between adjacent PD values; pertains to discrete PD variations.

@param value the PDStep value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDStep(microsecs value) {
        this.pdStep = value;
    }

/**
Determine if the PDStep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDStep() {
        return (this.pdStep!= null);
    }

/**
Get the upper end of the range of PD values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than US:PDTypicalMin.

@return the PDTypicalMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDTypicalMax() {
        return pdTypicalMax;
    }

/**
Set the upper end of the range of PD values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than US:PDTypicalMin.

@param value the PDTypicalMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDTypicalMax(microsecs value) {
        this.pdTypicalMax = value;
    }

/**
Determine if the PDTypicalMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDTypicalMax() {
        return (this.pdTypicalMax!= null);
    }

/**
Get the lower end of the range of PD values that represents 95% of observed values, from a statistical study

@return the PDTypicalMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPDTypicalMin() {
        return pdTypicalMin;
    }

/**
Set the lower end of the range of PD values that represents 95% of observed values, from a statistical study

@param value the PDTypicalMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPDTypicalMin(microsecs value) {
        this.pdTypicalMin = value;
    }

/**
Determine if the PDTypicalMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPDTypicalMin() {
        return (this.pdTypicalMin!= null);
    }

/**
Get the rate of change for PD variations expressed as PD change per unit of time.

@return the PRFChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public US_PRIChgRate getPRFChangeRate() {
        return prfChangeRate;
    }

/**
Set the rate of change for PD variations expressed as PD change per unit of time.

@param value the PRFChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public void setPRFChangeRate(US_PRIChgRate value) {
        this.prfChangeRate = value;
    }

/**
Determine if the PRFChangeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRFChangeRate() {
        return (this.prfChangeRate!= null);
    }

/**
Get the minimum Observed PRF in the signal sample.

[XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than US:PRFExtremeMin.

@return the PRFExtremeMax value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public US_PPS getPRFExtremeMax() {
        return prfExtremeMax;
    }

/**
Set the minimum Observed PRF in the signal sample.

[XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than US:PRFExtremeMin.

@param value the PRFExtremeMax value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public void setPRFExtremeMax(US_PPS value) {
        this.prfExtremeMax = value;
    }

/**
Determine if the PRFExtremeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRFExtremeMax() {
        return (this.prfExtremeMax!= null);
    }

/**
Get the minimum Observed PRF in the signal sample.

@return the PRFExtremeMin value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public US_PPS getPRFExtremeMin() {
        return prfExtremeMin;
    }

/**
Set the minimum Observed PRF in the signal sample.

@param value the PRFExtremeMin value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public void setPRFExtremeMin(US_PPS value) {
        this.prfExtremeMin = value;
    }

/**
Determine if the PRFExtremeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRFExtremeMin() {
        return (this.prfExtremeMin!= null);
    }

/**
Get the highest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set.

[XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.

@return the PRFMax value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public US_PPS getPRFMax() {
        return prfMax;
    }

/**
Set the highest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set.

[XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.

@param value the PRFMax value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public void setPRFMax(US_PPS value) {
        this.prfMax = value;
    }

/**
Determine if the PRFMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRFMax() {
        return (this.prfMax!= null);
    }

/**
Get the lowest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set. 

@return the PRFMin value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public US_PPS getPRFMin() {
        return prfMin;
    }

/**
Set the lowest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set. 

@param value the PRFMin value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public void setPRFMin(US_PPS value) {
        this.prfMin = value;
    }

/**
Determine if the PRFMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRFMin() {
        return (this.prfMin!= null);
    }

/**
Get the upper end of the range of PRF values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than US:PRFTypicalMin.

@return the PRFTypicalMax value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public US_PPS getPRFTypicalMax() {
        return prfTypicalMax;
    }

/**
Set the upper end of the range of PRF values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than US:PRFTypicalMin.

@param value the PRFTypicalMax value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public void setPRFTypicalMax(US_PPS value) {
        this.prfTypicalMax = value;
    }

/**
Determine if the PRFTypicalMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRFTypicalMax() {
        return (this.prfTypicalMax!= null);
    }

/**
Get the lower end of the range of PRF values that represents 95% of observed values, from a statistical study

@return the PRFTypicalMin value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public US_PPS getPRFTypicalMin() {
        return prfTypicalMin;
    }

/**
Set the lower end of the range of PRF values that represents 95% of observed values, from a statistical study

@param value the PRFTypicalMin value in a {@link TUS_PPS} data type
@since 3.1.0
*/
public void setPRFTypicalMin(US_PPS value) {
        this.prfTypicalMin = value;
    }

/**
Determine if the PRFTypicalMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRFTypicalMin() {
        return (this.prfTypicalMin!= null);
    }

/**
Get the condition which controls or can be associated with the signal PRI variations (aka, interpulse modulation changes).

@return the PRIAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getPRIAdaptiveDriverDesc() {
        return priAdaptiveDriverDesc;
    }

/**
Set the condition which controls or can be associated with the signal PRI variations (aka, interpulse modulation changes).

@param value the PRIAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setPRIAdaptiveDriverDesc(S500 value) {
        this.priAdaptiveDriverDesc = value;
    }

/**
Determine if the PRIAdaptiveDriverDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIAdaptiveDriverDesc() {
        return (this.priAdaptiveDriverDesc!= null);
    }

/**
Get the rule which describes the signal PRI variations (aka, interpulse modulation changes)

@return the PRIAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getPRIAdaptiveRuleDesc() {
        return priAdaptiveRuleDesc;
    }

/**
Set the rule which describes the signal PRI variations (aka, interpulse modulation changes)

@param value the PRIAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setPRIAdaptiveRuleDesc(S500 value) {
        this.priAdaptiveRuleDesc = value;
    }

/**
Determine if the PRIAdaptiveRuleDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIAdaptiveRuleDesc() {
        return (this.priAdaptiveRuleDesc!= null);
    }

/**
Get any regularly occurring signal values which do not fit in any of the other PRI related fields. For example Minimum Scheduling Interval (MSI) values, or Engagement Group Duration values can be documented in this field.. When used, the data shall be clearly described, so all users understand the meaning of the values.

@return the PRIAnomalousValues value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getPRIAnomalousValues() {
        return priAnomalousValues;
    }

/**
Set any regularly occurring signal values which do not fit in any of the other PRI related fields. For example Minimum Scheduling Interval (MSI) values, or Engagement Group Duration values can be documented in this field.. When used, the data shall be clearly described, so all users understand the meaning of the values.

@param value the PRIAnomalousValues value in a {@link TS500} data type
@since 3.1.0
*/
public void setPRIAnomalousValues(S500 value) {
        this.priAnomalousValues = value;
    }

/**
Determine if the PRIAnomalousValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIAnomalousValues() {
        return (this.priAnomalousValues!= null);
    }

/**
Get the fundamental period of the emitter clock which is used to generate the subject signal PRIs

@return the PRIBasicClockPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIBasicClockPeriod() {
        return priBasicClockPeriod;
    }

/**
Set the fundamental period of the emitter clock which is used to generate the subject signal PRIs

@param value the PRIBasicClockPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIBasicClockPeriod(microsecs value) {
        this.priBasicClockPeriod = value;
    }

/**
Determine if the PRIBasicClockPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIBasicClockPeriod() {
        return (this.priBasicClockPeriod!= null);
    }

/**
Get the PRI change per unit of time, measured over a significant portion of the waveform. This applies to Continuous PRI variations.

@return the PRIChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public US_PRIChgRate getPRIChangeRate() {
        return priChangeRate;
    }

/**
Set the PRI change per unit of time, measured over a significant portion of the waveform. This applies to Continuous PRI variations.

@param value the PRIChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public void setPRIChangeRate(US_PRIChgRate value) {
        this.priChangeRate = value;
    }

/**
Determine if the PRIChangeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIChangeRate() {
        return (this.priChangeRate!= null);
    }

/**
Get In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@return the PRIContinuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getPRIContinuous() {
        return priContinuous;
    }

/**
Set In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value the PRIContinuous value in a {@link TString} data type
@since 3.1.0
*/
public void setPRIContinuous(TString value) {
        this.priContinuous = value;
    }

/**
Determine if the PRIContinuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIContinuous() {
return (this.priContinuous!= null ? this.priContinuous.isSetValue() : false);
    }

/**
Get the integer (aka, count or countdown) associated with the PRI Crystal value to provide the Pattern Period.

@return the PRICountdown value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getPRICountdown() {
        return priCountdown;
    }

/**
Set the integer (aka, count or countdown) associated with the PRI Crystal value to provide the Pattern Period.

@param value the PRICountdown value in a {@link TUN6} data type
@since 3.1.0
*/
public void setPRICountdown(UN6 value) {
        this.priCountdown = value;
    }

/**
Determine if the PRICountdown is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRICountdown() {
        return (this.priCountdown!= null);
    }

/**
Get the integer (aka, count or countdown) used to generate the PRI from the PRI Crystal value.

@return the PRICountdownKey value in a {@link TUN9} data type
@since 3.1.0
*/
public UN9 getPRICountdownKey() {
        return priCountdownKey;
    }

/**
Set the integer (aka, count or countdown) used to generate the PRI from the PRI Crystal value.

@param value the PRICountdownKey value in a {@link TUN9} data type
@since 3.1.0
*/
public void setPRICountdownKey(UN9 value) {
        this.priCountdownKey = value;
    }

/**
Determine if the PRICountdownKey is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRICountdownKey() {
        return (this.priCountdownKey!= null);
    }

/**
Get the maximum observed PRI value, from a statistical study of a 100% data set.

[XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than US:PRIExtremeMin.

@return the PRIExtremeMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIExtremeMax() {
        return priExtremeMax;
    }

/**
Set the maximum observed PRI value, from a statistical study of a 100% data set.

[XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than US:PRIExtremeMin.

@param value the PRIExtremeMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIExtremeMax(microsecs value) {
        this.priExtremeMax = value;
    }

/**
Determine if the PRIExtremeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIExtremeMax() {
        return (this.priExtremeMax!= null);
    }

/**
Get the minimum observed PRI value, from a statistical study of a 100% data set.

@return the PRIExtremeMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIExtremeMin() {
        return priExtremeMin;
    }

/**
Set the minimum observed PRI value, from a statistical study of a 100% data set.

@param value the PRIExtremeMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIExtremeMin(microsecs value) {
        this.priExtremeMin = value;
    }

/**
Determine if the PRIExtremeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIExtremeMin() {
        return (this.priExtremeMin!= null);
    }

/**
Get the time difference between a point on the leading edge of the frame marker (or an alternate pulse in the frame), to the similar point on the leading edge of the frame marker (or the alternate pulse) in the next/consecutive frame.

@return the PRIFramePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIFramePeriod() {
        return priFramePeriod;
    }

/**
Set the time difference between a point on the leading edge of the frame marker (or an alternate pulse in the frame), to the similar point on the leading edge of the frame marker (or the alternate pulse) in the next/consecutive frame.

@param value the PRIFramePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIFramePeriod(microsecs value) {
        this.priFramePeriod = value;
    }

/**
Determine if the PRIFramePeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIFramePeriod() {
        return (this.priFramePeriod!= null);
    }

/**
Get the rate of frame generation during the Pulse Repetition Interval. For example, 10 frames generated during a PRI of 1 us yields a PRI frame rate of 10 MHz.

@return the PRIFrameRate value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getPRIFrameRate() {
        return priFrameRate;
    }

/**
Set the rate of frame generation during the Pulse Repetition Interval. For example, 10 frames generated during a PRI of 1 us yields a PRI frame rate of 10 MHz.

@param value the PRIFrameRate value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setPRIFrameRate(FreqM value) {
        this.priFrameRate = value;
    }

/**
Determine if the PRIFrameRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIFrameRate() {
        return (this.priFrameRate!= null);
    }

/**
Get the time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

@return the PRIGroupPulseSpacing value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIGroupPulseSpacing() {
        return priGroupPulseSpacing;
    }

/**
Set the time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

@param value the PRIGroupPulseSpacing value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIGroupPulseSpacing(microsecs value) {
        this.priGroupPulseSpacing = value;
    }

/**
Determine if the PRIGroupPulseSpacing is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIGroupPulseSpacing() {
        return (this.priGroupPulseSpacing!= null);
    }

/**
Get the PRI between two groups of pulses which both have constant but different PRIs (aka, the PRI between consecutive PRI dwell groups).

@return the PRIGroupSpacing value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIGroupSpacing() {
        return priGroupSpacing;
    }

/**
Set the PRI between two groups of pulses which both have constant but different PRIs (aka, the PRI between consecutive PRI dwell groups).

@param value the PRIGroupSpacing value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIGroupSpacing(microsecs value) {
        this.priGroupSpacing = value;
    }

/**
Determine if the PRIGroupSpacing is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIGroupSpacing() {
        return (this.priGroupSpacing!= null);
    }

/**
Get the average PRI value for a signal which changes PRI values on a non-patterned basis.

@return the PRIMean value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIMean() {
        return priMean;
    }

/**
Set the average PRI value for a signal which changes PRI values on a non-patterned basis.

@param value the PRIMean value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIMean(microsecs value) {
        this.priMean = value;
    }

/**
Determine if the PRIMean is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIMean() {
        return (this.priMean!= null);
    }

/**
Get the observed PRI value that the signal most often used based on statistical study of a data set.

@return the PRIMedian value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIMedian() {
        return priMedian;
    }

/**
Set the observed PRI value that the signal most often used based on statistical study of a data set.

@param value the PRIMedian value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIMedian(microsecs value) {
        this.priMedian = value;
    }

/**
Determine if the PRIMedian is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIMedian() {
        return (this.priMedian!= null);
    }

/**
Get the observed PRI Crystal Counts used to generate the PRIs used most often by the signal, based on statistical study of a data set.

@return the PRIMedianCountdowns value in a {@link TS100} data type
@since 3.1.0
*/
public S100 getPRIMedianCountdowns() {
        return priMedianCountdowns;
    }

/**
Set the observed PRI Crystal Counts used to generate the PRIs used most often by the signal, based on statistical study of a data set.

@param value the PRIMedianCountdowns value in a {@link TS100} data type
@since 3.1.0
*/
public void setPRIMedianCountdowns(S100 value) {
        this.priMedianCountdowns = value;
    }

/**
Determine if the PRIMedianCountdowns is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIMedianCountdowns() {
        return (this.priMedianCountdowns!= null);
    }

/**
Get the time duration for one complete cycle of a repeating PRI sequence.

@return the PRIPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIPatternPeriod() {
        return priPatternPeriod;
    }

/**
Set the time duration for one complete cycle of a repeating PRI sequence.

@param value the PRIPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIPatternPeriod(microsecs value) {
        this.priPatternPeriod = value;
    }

/**
Determine if the PRIPatternPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIPatternPeriod() {
        return (this.priPatternPeriod!= null);
    }

/**
Get whether the PRI is unmodulated or pulse-to-pulse PRI variations are Patterned, Non-Patterned, or Adaptive.

@return the PRIPatternType value in a {@link TString} data type
@since 3.1.0
*/
public TString getPRIPatternType() {
        return priPatternType;
    }

/**
Set whether the PRI is unmodulated or pulse-to-pulse PRI variations are Patterned, Non-Patterned, or Adaptive.

@param value the PRIPatternType value in a {@link TString} data type
@since 3.1.0
*/
public void setPRIPatternType(TString value) {
        this.priPatternType = value;
    }

/**
Determine if the PRIPatternType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIPatternType() {
return (this.priPatternType!= null ? this.priPatternType.isSetValue() : false);
    }

/**
Get the number of pulses in a pulse group.

@return the PRIPulsesPerGroup value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getPRIPulsesPerGroup() {
        return priPulsesPerGroup;
    }

/**
Set the number of pulses in a pulse group.

@param value the PRIPulsesPerGroup value in a {@link TUN6} data type
@since 3.1.0
*/
public void setPRIPulsesPerGroup(UN6 value) {
        this.priPulsesPerGroup = value;
    }

/**
Determine if the PRIPulsesPerGroup is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIPulsesPerGroup() {
        return (this.priPulsesPerGroup!= null);
    }

/**
Get a free text description of the PRI Sequence.

@return the PRISequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getPRISequenceDesc() {
        return priSequenceDesc;
    }

/**
Set a free text description of the PRI Sequence.

@param value the PRISequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setPRISequenceDesc(S500 value) {
        this.priSequenceDesc = value;
    }

/**
Determine if the PRISequenceDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRISequenceDesc() {
        return (this.priSequenceDesc!= null);
    }

/**
Get the variation of a mean PRI value measured from one time to another time

@return the PRIStability value in a {@link TUS_PPM} data type
@since 3.1.0
*/
public US_PPM getPRIStability() {
        return priStability;
    }

/**
Set the variation of a mean PRI value measured from one time to another time

@param value the PRIStability value in a {@link TUS_PPM} data type
@since 3.1.0
*/
public void setPRIStability(US_PPM value) {
        this.priStability = value;
    }

/**
Determine if the PRIStability is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIStability() {
        return (this.priStability!= null);
    }

/**
Get the time interval used to determine the PRI stability value.

@return the PRIStabilitySamplePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIStabilitySamplePeriod() {
        return priStabilitySamplePeriod;
    }

/**
Set the time interval used to determine the PRI stability value.

@param value the PRIStabilitySamplePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIStabilitySamplePeriod(microsecs value) {
        this.priStabilitySamplePeriod = value;
    }

/**
Determine if the PRIStabilitySamplePeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIStabilitySamplePeriod() {
        return (this.priStabilitySamplePeriod!= null);
    }

/**
Get the standard deviation associated with the data set used to calculate the values entered in the PRI Mean fields

@return the PRIStdDev value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIStdDev() {
        return priStdDev;
    }

/**
Set the standard deviation associated with the data set used to calculate the values entered in the PRI Mean fields

@param value the PRIStdDev value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIStdDev(microsecs value) {
        this.priStdDev = value;
    }

/**
Determine if the PRIStdDev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIStdDev() {
        return (this.priStdDev!= null);
    }

/**
Get the delta between the Most Probable observed PRI values of adjacent and discrete PRI.

@return the PRIStep value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRIStep() {
        return priStep;
    }

/**
Set the delta between the Most Probable observed PRI values of adjacent and discrete PRI.

@param value the PRIStep value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRIStep(microsecs value) {
        this.priStep = value;
    }

/**
Determine if the PRIStep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRIStep() {
        return (this.priStep!= null);
    }

/**
Get the time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

@return the PRISubframePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRISubframePeriod() {
        return priSubframePeriod;
    }

/**
Set the time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

@param value the PRISubframePeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRISubframePeriod(microsecs value) {
        this.priSubframePeriod = value;
    }

/**
Determine if the PRISubframePeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRISubframePeriod() {
        return (this.priSubframePeriod!= null);
    }

/**
Get the number of subframes detected during each PRI Subframe period.

@return the PRISubframeRate value in a {@link TFreqM} data type
@since 3.1.0
*/
public FreqM getPRISubframeRate() {
        return priSubframeRate;
    }

/**
Set the number of subframes detected during each PRI Subframe period.

@param value the PRISubframeRate value in a {@link TFreqM} data type
@since 3.1.0
*/
public void setPRISubframeRate(FreqM value) {
        this.priSubframeRate = value;
    }

/**
Determine if the PRISubframeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRISubframeRate() {
        return (this.priSubframeRate!= null);
    }

/**
Get the PRI timing shift value, on Emitters with repeated timing shifts of a predictable magnitude, but not predictable timing.

@return the PRITimingShift value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRITimingShift() {
        return priTimingShift;
    }

/**
Set the PRI timing shift value, on Emitters with repeated timing shifts of a predictable magnitude, but not predictable timing.

@param value the PRITimingShift value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRITimingShift(microsecs value) {
        this.priTimingShift = value;
    }

/**
Determine if the PRITimingShift is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRITimingShift() {
        return (this.priTimingShift!= null);
    }

/**
Get the upper end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

[XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than US:PRITypicalMin.

@return the PRITypicalMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRITypicalMax() {
        return priTypicalMax;
    }

/**
Set the upper end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

[XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than US:PRITypicalMin.

@param value the PRITypicalMax value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRITypicalMax(microsecs value) {
        this.priTypicalMax = value;
    }

/**
Determine if the PRITypicalMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRITypicalMax() {
        return (this.priTypicalMax!= null);
    }

/**
Get the lower end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

@return the PRITypicalMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getPRITypicalMin() {
        return priTypicalMin;
    }

/**
Set the lower end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

@param value the PRITypicalMin value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setPRITypicalMin(microsecs value) {
        this.priTypicalMin = value;
    }

/**
Determine if the PRITypicalMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPRITypicalMin() {
        return (this.priTypicalMin!= null);
    }

/**
Get the time required for a pulse to rise from 10% to 90 percent of the mean peak amplitude of the voltage pattern.

@return the RiseTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getRiseTime() {
        return riseTime;
    }

/**
Set the time required for a pulse to rise from 10% to 90 percent of the mean peak amplitude of the voltage pattern.

@param value the RiseTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setRiseTime(microsecs value) {
        this.riseTime = value;
    }

/**
Determine if the RiseTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetRiseTime() {
        return (this.riseTime!= null);
    }

/**
Get the US:ObservedPulseValues

Complex element ObservedPulseValues (US) contains data describing the distinct Pulse values related to the Modulation Type.

@return  a {@link ObservedPulseValues} instance
@since 3.1.0
*/
    public Set<ObservedPulseValues> getObservedPulseValues() {
        if (observedPulseValues == null) {
            observedPulseValues = new HashSet<ObservedPulseValues>();
        }
        return this.observedPulseValues;
    }

/**
Determine if the ObservedPulseValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedPulseValues() {
        return ((this.observedPulseValues!= null)&&(!this.observedPulseValues.isEmpty()));
    }

/**
  Clear the ObservedPulseValues field. This sets the field to null.
 */
    public void unsetObservedPulseValues() {
        this.observedPulseValues = null;
    }

/**
Set the time required for a pulse to fall from 90% to 10 percent of the mean peak amplitude of its voltage waveform/envelope.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withFallTime(Double value) {
           setFallTime(new microsecs(value));
        return this;
    }

/**
Set the number of pulses (i.e., positions) in a repeating sequence of pulses which has multiple (2 or more) PD values.

@param value  An instances of type {@link Integer}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withNumPDPositions(Integer value) {
           setNumPDPositions(new UN6(value));
        return this;
    }

/**
Set the number of discrete PD values (i.e., elements) in a repeating sequence of pulses which has multiple (2 or more) PD values.

@param value  An instances of type {@link Integer}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withNumPDValues(Integer value) {
           setNumPDValues(new UN6(value));
        return this;
    }

/**
Set the number of discrete PRI values in a repeating sequence of discrete PRIs.

@param value  An instances of type {@link Integer}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withNumPRIElements(Integer value) {
           setNumPRIElements(new UN6(value));
        return this;
    }

/**
Set the number of time intervals between pulses or pulse groups, or the number of PRI dwell groups, in a repeating PRI sequence which uses discrete PRI values.

@param value  An instances of type {@link Integer}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withNumPRIPositions(Integer value) {
           setNumPRIPositions(new UN6(value));
        return this;
    }

/**
Set the rule which describes the signal PD variations (aka. modulation).

@param value  An instances of type {@link String}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDAdaptiveRuleDesc(String value) {
           setPDAdaptiveRuleDesc(new S500(value));
        return this;
    }

/**
Set In Data Item PDContinuous (US), indicate whether pulse-to-pulse PD variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value  An instances of type {@link ListCBO}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDContinuous(ListCBO value) {
           setPDContinuous(new TString(value.value()));
        return this;
    }

/**
Set the maximum time duration for a complete dwell/group of pulses which all have the same PD value.

[XSL ERR MINMAX] If US:PDDwellMax is used, it MUST be greater than US:PDDwellMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDDwellMax(Double value) {
           setPDDwellMax(new microsecs(value));
        return this;
    }

/**
Set the minimum time duration for a complete dwell/group of pulses which all have the same PD value.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDDwellMin(Double value) {
           setPDDwellMin(new microsecs(value));
        return this;
    }

/**
Set the maximum PD value that represents 100% of observed values.

[XSL ERR MINMAX] If US:PDExtremeMax is used, it MUST be greater than US:PDExtremeMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDExtremeMax(Double value) {
           setPDExtremeMax(new microsecs(value));
        return this;
    }

/**
Set the minimum PD value that represents 100% of observed values.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDExtremeMin(Double value) {
           setPDExtremeMin(new microsecs(value));
        return this;
    }

/**
Set the highest discrete PD value in a repeating sequence of pulses which has multiple PD values

[XSL ERR MINMAX] If US:PDMax is used, it MUST be greater than US:PDMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDMax(Double value) {
           setPDMax(new microsecs(value));
        return this;
    }

/**
Set the average PD of a signal which changes PD values on a non-patterned basis.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDMean(Double value) {
           setPDMean(new microsecs(value));
        return this;
    }

/**
Set the PD value that the signal most often used, based on a statistical study.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDMedian(Double value) {
           setPDMedian(new microsecs(value));
        return this;
    }

/**
Set the delta lowest discrete PD value in a repeating sequence of pulses which has multiple PD values

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDMin(Double value) {
           setPDMin(new microsecs(value));
        return this;
    }

/**
Set the time duration for one complete cycle of a repeating sequence of pulses which has multiple (2 or more) PD values; the time duration shall go from a point in one cycle to a like point in the next cycle.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDPatternPeriod(Double value) {
           setPDPatternPeriod(new microsecs(value));
        return this;
    }

/**
Set In Data Item PDPatternType (US), Indicate whether PD is unmodulated or pulse-to-pulse PD variations are Patterned, Non-Patterned, or Adaptive.

@param value  An instances of type {@link ListUS7}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDPatternType(ListUS7 value) {
           setPDPatternType(new TString(value.value()));
        return this;
    }

/**
Set a freetext description of the PD Sequence.

@param value  An instances of type {@link String}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDSequenceDesc(String value) {
           setPDSequenceDesc(new S500(value));
        return this;
    }

/**
Set the standard deviation of the data sample used to calculate PD Mean.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDStdDev(Double value) {
           setPDStdDev(new microsecs(value));
        return this;
    }

/**
Set the Step between adjacent PD values; pertains to discrete PD variations.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDStep(Double value) {
           setPDStep(new microsecs(value));
        return this;
    }

/**
Set the upper end of the range of PD values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PDTypicalMax is used, it MUST be greater than US:PDTypicalMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDTypicalMax(Double value) {
           setPDTypicalMax(new microsecs(value));
        return this;
    }

/**
Set the lower end of the range of PD values that represents 95% of observed values, from a statistical study

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPDTypicalMin(Double value) {
           setPDTypicalMin(new microsecs(value));
        return this;
    }

/**
Set the rate of change for PD variations expressed as PD change per unit of time.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRFChangeRate(Double value) {
           setPRFChangeRate(new US_PRIChgRate(value));
        return this;
    }

/**
Set the minimum Observed PRF in the signal sample.

[XSL ERR MINMAX] If US:PRFExtremeMax is used, it MUST be greater than US:PRFExtremeMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRFExtremeMax(Double value) {
           setPRFExtremeMax(new US_PPS(value));
        return this;
    }

/**
Set the minimum Observed PRF in the signal sample.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRFExtremeMin(Double value) {
           setPRFExtremeMin(new US_PPS(value));
        return this;
    }

/**
Set the highest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set.

[XSL ERR MINMAX] If US:PRFMax is used, it MUST be greater than US:PRFMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRFMax(Double value) {
           setPRFMax(new US_PPS(value));
        return this;
    }

/**
Set the lowest discrete PRI value (convert PRI to PRF) which are found in a single intercept that contains the complete PRI characteristics for that specific data set. 

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRFMin(Double value) {
           setPRFMin(new US_PPS(value));
        return this;
    }

/**
Set the upper end of the range of PRF values that represents 95% of observed values, from a statistical study.

[XSL ERR MINMAX] If US:PRFTypicalMax is used, it MUST be greater than US:PRFTypicalMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRFTypicalMax(Double value) {
           setPRFTypicalMax(new US_PPS(value));
        return this;
    }

/**
Set the lower end of the range of PRF values that represents 95% of observed values, from a statistical study

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRFTypicalMin(Double value) {
           setPRFTypicalMin(new US_PPS(value));
        return this;
    }

/**
Set the condition which controls or can be associated with the signal PRI variations (aka, interpulse modulation changes).

@param value  An instances of type {@link String}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIAdaptiveDriverDesc(String value) {
           setPRIAdaptiveDriverDesc(new S500(value));
        return this;
    }

/**
Set the rule which describes the signal PRI variations (aka, interpulse modulation changes)

@param value  An instances of type {@link String}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIAdaptiveRuleDesc(String value) {
           setPRIAdaptiveRuleDesc(new S500(value));
        return this;
    }

/**
Set any regularly occurring signal values which do not fit in any of the other PRI related fields. For example Minimum Scheduling Interval (MSI) values, or Engagement Group Duration values can be documented in this field.. When used, the data shall be clearly described, so all users understand the meaning of the values.

@param value  An instances of type {@link String}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIAnomalousValues(String value) {
           setPRIAnomalousValues(new S500(value));
        return this;
    }

/**
Set the fundamental period of the emitter clock which is used to generate the subject signal PRIs

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIBasicClockPeriod(Double value) {
           setPRIBasicClockPeriod(new microsecs(value));
        return this;
    }

/**
Set the PRI change per unit of time, measured over a significant portion of the waveform. This applies to Continuous PRI variations.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIChangeRate(Double value) {
           setPRIChangeRate(new US_PRIChgRate(value));
        return this;
    }

/**
Set In Data Item PRIContinuous (US), Indicate whether pulse-to-pulse PRI variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value  An instances of type {@link ListCBO}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIContinuous(ListCBO value) {
           setPRIContinuous(new TString(value.value()));
        return this;
    }

/**
Set the integer (aka, count or countdown) associated with the PRI Crystal value to provide the Pattern Period.

@param value  An instances of type {@link Integer}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRICountdown(Integer value) {
           setPRICountdown(new UN6(value));
        return this;
    }

/**
Set the integer (aka, count or countdown) used to generate the PRI from the PRI Crystal value.

@param value  An instances of type {@link Integer}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRICountdownKey(Integer value) {
           setPRICountdownKey(new UN9(value));
        return this;
    }

/**
Set the maximum observed PRI value, from a statistical study of a 100% data set.

[XSL ERR MINMAX] If US:PRIExtremeMax is used, it MUST be greater than US:PRIExtremeMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIExtremeMax(Double value) {
           setPRIExtremeMax(new microsecs(value));
        return this;
    }

/**
Set the minimum observed PRI value, from a statistical study of a 100% data set.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIExtremeMin(Double value) {
           setPRIExtremeMin(new microsecs(value));
        return this;
    }

/**
Set the time difference between a point on the leading edge of the frame marker (or an alternate pulse in the frame), to the similar point on the leading edge of the frame marker (or the alternate pulse) in the next/consecutive frame.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIFramePeriod(Double value) {
           setPRIFramePeriod(new microsecs(value));
        return this;
    }

/**
Set the rate of frame generation during the Pulse Repetition Interval. For example, 10 frames generated during a PRI of 1 us yields a PRI frame rate of 10 MHz.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIFrameRate(Double value) {
           setPRIFrameRate(new FreqM(value));
        return this;
    }

/**
Set the time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIGroupPulseSpacing(Double value) {
           setPRIGroupPulseSpacing(new microsecs(value));
        return this;
    }

/**
Set the PRI between two groups of pulses which both have constant but different PRIs (aka, the PRI between consecutive PRI dwell groups).

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIGroupSpacing(Double value) {
           setPRIGroupSpacing(new microsecs(value));
        return this;
    }

/**
Set the average PRI value for a signal which changes PRI values on a non-patterned basis.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIMean(Double value) {
           setPRIMean(new microsecs(value));
        return this;
    }

/**
Set the observed PRI value that the signal most often used based on statistical study of a data set.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIMedian(Double value) {
           setPRIMedian(new microsecs(value));
        return this;
    }

/**
Set the observed PRI Crystal Counts used to generate the PRIs used most often by the signal, based on statistical study of a data set.

@param value  An instances of type {@link String}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIMedianCountdowns(String value) {
           setPRIMedianCountdowns(new S100(value));
        return this;
    }

/**
Set the time duration for one complete cycle of a repeating PRI sequence.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIPatternPeriod(Double value) {
           setPRIPatternPeriod(new microsecs(value));
        return this;
    }

/**
Set whether the PRI is unmodulated or pulse-to-pulse PRI variations are Patterned, Non-Patterned, or Adaptive.

@param value  An instances of type {@link ListUS7}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIPatternType(ListUS7 value) {
           setPRIPatternType(new TString(value.value()));
        return this;
    }

/**
Set the number of pulses in a pulse group.

@param value  An instances of type {@link Integer}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIPulsesPerGroup(Integer value) {
           setPRIPulsesPerGroup(new UN6(value));
        return this;
    }

/**
Set a free text description of the PRI Sequence.

@param value  An instances of type {@link String}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRISequenceDesc(String value) {
           setPRISequenceDesc(new S500(value));
        return this;
    }

/**
Set the variation of a mean PRI value measured from one time to another time

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIStability(Double value) {
           setPRIStability(new US_PPM(value));
        return this;
    }

/**
Set the time interval used to determine the PRI stability value.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIStabilitySamplePeriod(Double value) {
           setPRIStabilitySamplePeriod(new microsecs(value));
        return this;
    }

/**
Set the standard deviation associated with the data set used to calculate the values entered in the PRI Mean fields

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIStdDev(Double value) {
           setPRIStdDev(new microsecs(value));
        return this;
    }

/**
Set the delta between the Most Probable observed PRI values of adjacent and discrete PRI.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRIStep(Double value) {
           setPRIStep(new microsecs(value));
        return this;
    }

/**
Set the time difference between a point on the leading edge of the subframe marker (or an alternate pulse in the subframe), to the similar point on the leading edge of the subframe marker (or the alternate pulse in the subframe) in the next/consecutive frame.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRISubframePeriod(Double value) {
           setPRISubframePeriod(new microsecs(value));
        return this;
    }

/**
Set the number of subframes detected during each PRI Subframe period.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRISubframeRate(Double value) {
           setPRISubframeRate(new FreqM(value));
        return this;
    }

/**
Set the PRI timing shift value, on Emitters with repeated timing shifts of a predictable magnitude, but not predictable timing.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRITimingShift(Double value) {
           setPRITimingShift(new microsecs(value));
        return this;
    }

/**
Set the upper end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

[XSL ERR MINMAX] If US:PRITypicalMax is used, it MUST be greater than US:PRITypicalMin.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRITypicalMax(Double value) {
           setPRITypicalMax(new microsecs(value));
        return this;
    }

/**
Set the lower end of the range of PRI values that represent 95% of the signal observed PRI values, from a statistical study of a data set.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withPRITypicalMin(Double value) {
           setPRITypicalMin(new microsecs(value));
        return this;
    }

/**
Set the time required for a pulse to rise from 10% to 90 percent of the mean peak amplitude of the voltage pattern.

@param value  An instances of type {@link Double}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withRiseTime(Double value) {
           setRiseTime(new microsecs(value));
        return this;
    }

/**
Set the US:ObservedPulseValues

Complex element ObservedPulseValues (US) contains data describing the distinct Pulse values related to the Modulation Type.

@param values  One or more instances of type {@link ObservedPulseValues...}
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withObservedPulseValues(ObservedPulseValues... values) {
        if (values!= null) {
            for (ObservedPulseValues value: values) {
                getObservedPulseValues().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedPulseValues

Complex element ObservedPulseValues (US) contains data describing the distinct Pulse values related to the Modulation Type.

@param values  A collection of {@link ObservedPulseValues} instances
@return The current ObservedPulseAnalysis object instance
@since 3.1.0
*/
    public ObservedPulseAnalysis withObservedPulseValues(Collection<ObservedPulseValues> values) {
        if (values!= null) {
            getObservedPulseValues().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this ObservedPulseAnalysis instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedPulseAnalysis {"
 + (fallTime !=null? " fallTime [" + fallTime +"]" : "") 
 + (numPDPositions !=null? " numPDPositions [" + numPDPositions +"]" : "") 
 + (numPDValues !=null? " numPDValues [" + numPDValues +"]" : "") 
 + (numPRIElements !=null? " numPRIElements [" + numPRIElements +"]" : "") 
 + (numPRIPositions !=null? " numPRIPositions [" + numPRIPositions +"]" : "") 
 + (observedPulseValues !=null? " observedPulseValues [" + observedPulseValues +"]" : "") 
 + (pdAdaptiveRuleDesc !=null? " pdAdaptiveRuleDesc [" + pdAdaptiveRuleDesc +"]" : "") 
 + (pdContinuous !=null? " pdContinuous [" + pdContinuous +"]" : "") 
 + (pdDwellMax !=null? " pdDwellMax [" + pdDwellMax +"]" : "") 
 + (pdDwellMin !=null? " pdDwellMin [" + pdDwellMin +"]" : "") 
 + (pdExtremeMax !=null? " pdExtremeMax [" + pdExtremeMax +"]" : "") 
 + (pdExtremeMin !=null? " pdExtremeMin [" + pdExtremeMin +"]" : "") 
 + (pdMax !=null? " pdMax [" + pdMax +"]" : "") 
 + (pdMean !=null? " pdMean [" + pdMean +"]" : "") 
 + (pdMedian !=null? " pdMedian [" + pdMedian +"]" : "") 
 + (pdMin !=null? " pdMin [" + pdMin +"]" : "") 
 + (pdPatternPeriod !=null? " pdPatternPeriod [" + pdPatternPeriod +"]" : "") 
 + (pdPatternType !=null? " pdPatternType [" + pdPatternType +"]" : "") 
 + (pdSequenceDesc !=null? " pdSequenceDesc [" + pdSequenceDesc +"]" : "") 
 + (pdStdDev !=null? " pdStdDev [" + pdStdDev +"]" : "") 
 + (pdStep !=null? " pdStep [" + pdStep +"]" : "") 
 + (pdTypicalMax !=null? " pdTypicalMax [" + pdTypicalMax +"]" : "") 
 + (pdTypicalMin !=null? " pdTypicalMin [" + pdTypicalMin +"]" : "") 
 + (prfChangeRate !=null? " prfChangeRate [" + prfChangeRate +"]" : "") 
 + (prfExtremeMax !=null? " prfExtremeMax [" + prfExtremeMax +"]" : "") 
 + (prfExtremeMin !=null? " prfExtremeMin [" + prfExtremeMin +"]" : "") 
 + (prfMax !=null? " prfMax [" + prfMax +"]" : "") 
 + (prfMin !=null? " prfMin [" + prfMin +"]" : "") 
 + (prfTypicalMax !=null? " prfTypicalMax [" + prfTypicalMax +"]" : "") 
 + (prfTypicalMin !=null? " prfTypicalMin [" + prfTypicalMin +"]" : "") 
 + (priAdaptiveDriverDesc !=null? " priAdaptiveDriverDesc [" + priAdaptiveDriverDesc +"]" : "") 
 + (priAdaptiveRuleDesc !=null? " priAdaptiveRuleDesc [" + priAdaptiveRuleDesc +"]" : "") 
 + (priAnomalousValues !=null? " priAnomalousValues [" + priAnomalousValues +"]" : "") 
 + (priBasicClockPeriod !=null? " priBasicClockPeriod [" + priBasicClockPeriod +"]" : "") 
 + (priChangeRate !=null? " priChangeRate [" + priChangeRate +"]" : "") 
 + (priContinuous !=null? " priContinuous [" + priContinuous +"]" : "") 
 + (priCountdown !=null? " priCountdown [" + priCountdown +"]" : "") 
 + (priCountdownKey !=null? " priCountdownKey [" + priCountdownKey +"]" : "") 
 + (priExtremeMax !=null? " priExtremeMax [" + priExtremeMax +"]" : "") 
 + (priExtremeMin !=null? " priExtremeMin [" + priExtremeMin +"]" : "") 
 + (priFramePeriod !=null? " priFramePeriod [" + priFramePeriod +"]" : "") 
 + (priFrameRate !=null? " priFrameRate [" + priFrameRate +"]" : "") 
 + (priGroupPulseSpacing !=null? " priGroupPulseSpacing [" + priGroupPulseSpacing +"]" : "") 
 + (priGroupSpacing !=null? " priGroupSpacing [" + priGroupSpacing +"]" : "") 
 + (priMean !=null? " priMean [" + priMean +"]" : "") 
 + (priMedian !=null? " priMedian [" + priMedian +"]" : "") 
 + (priMedianCountdowns !=null? " priMedianCountdowns [" + priMedianCountdowns +"]" : "") 
 + (priPatternPeriod !=null? " priPatternPeriod [" + priPatternPeriod +"]" : "") 
 + (priPatternType !=null? " priPatternType [" + priPatternType +"]" : "") 
 + (priPulsesPerGroup !=null? " priPulsesPerGroup [" + priPulsesPerGroup +"]" : "") 
 + (priSequenceDesc !=null? " priSequenceDesc [" + priSequenceDesc +"]" : "") 
 + (priStability !=null? " priStability [" + priStability +"]" : "") 
 + (priStabilitySamplePeriod !=null? " priStabilitySamplePeriod [" + priStabilitySamplePeriod +"]" : "") 
 + (priStdDev !=null? " priStdDev [" + priStdDev +"]" : "") 
 + (priStep !=null? " priStep [" + priStep +"]" : "") 
 + (priSubframePeriod !=null? " priSubframePeriod [" + priSubframePeriod +"]" : "") 
 + (priSubframeRate !=null? " priSubframeRate [" + priSubframeRate +"]" : "") 
 + (priTimingShift !=null? " priTimingShift [" + priTimingShift +"]" : "") 
 + (priTypicalMax !=null? " priTypicalMax [" + priTypicalMax +"]" : "") 
 + (priTypicalMin !=null? " priTypicalMin [" + priTypicalMin +"]" : "") 
 + (riseTime !=null? " riseTime [" + riseTime +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedPulseAnalysis} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
