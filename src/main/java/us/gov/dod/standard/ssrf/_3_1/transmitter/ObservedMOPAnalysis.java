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
ObservedMOPAnalysis (US) contains data describing the characteristic and pattern information for the Modulation impressed On the Pulse (MOP).

Element of {@link TxMode}

Sub-Element is {@link ObservedMOPSweep}

Example: <pre>
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
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
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
US:MOPAdaptiveDriverDesc - MOP Adaptive Driver Description (Optional) 

The condition which controls, or can be associated with, the signal MOP variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "MOPAdaptiveDriverDesc", required = false)
    private S500 mopAdaptiveDriverDesc;
/**
US:MOPAdaptiveDriverRuleDesc - MOP Adaptive Driver Rule Description (Optional) 

The rule which describes the signal MOP variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "MOPAdaptiveDriverRuleDesc", required = false)
    private S500 mopAdaptiveDriverRuleDesc;
/**
US:MOPAMPercentModulation - MOP AM Percent Modulation (Optional) 

The AM Percent Modulation is the ratio (expressed as a percentage) between the amplitude variation and the maximum amplitude

Format is UN(2,1) (%)
@since 3.1.0
*/
    @XmlElement(name = "MOPAMPercentModulation", required = false)
    private US_Percent2 mopamPercentModulation;
/**
In Data Item US:MOPChangeRateAM (US), enter the change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPChangeRateAM", required = false)
    private US_MOPChgAm mopChangeRateAM;
/**
In Data Item US:MOPChangeRateCW (US), enter the change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPChangeRateCW", required = false)
    private US_MOPChgFm mopChangeRateCW;
/**
In Data Item US:MOPChangeRateFM (US), enter the change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPChangeRateFM", required = false)
    private US_MOPChgFm mopChangeRateFM;
/**
In Data Item US:MOPChangeRatePM (US), enter the change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPChangeRatePM", required = false)
    private US_PhaseAngleRate mopChangeRatePM;
/**
In Data Item US:MOPContinuous (US), indicate whether MOP or CW modulation is Discrete or Continuous.
@since 3.1.0
*/
    @XmlElement(name = "MOPContinuous", required = false)
    private TString mopContinuous;
/**
In Data Item US:MOPID (US), enter a unique identifier (within the TxMode) for the MOP data.
@since 3.1.0
*/
    @XmlElement(name = "MOPID", required = false)
    private S10 mopid;
/**
In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPMeanValueAM", required = false)
    private Signed_dB_5_2 mopMeanValueAM;
/**
In Data Item US:MOPMeanValueCW (US), enter the average continuous wave frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPMeanValueCW", required = false)
    private US_MOPFm mopMeanValueCW;
/**
In Data Item US:MOPMeanValue (US), enter the average frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPMeanValueFM", required = false)
    private US_MOPFm mopMeanValueFM;
/**
In Data Item US:MOPMeanValue (US), enter the average phase angle for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPMeanValuePM", required = false)
    private US_PhaseAngle mopMeanValuePM;
/**
In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)
@since 3.1.0
*/
    @XmlElement(name = "MOPNumElements", required = false)
    private UN6 mopNumElements;
/**
In Data Item US:MOPOffTime (US), enter the duration of the state of the modulated waveform with the absence of energy.
@since 3.1.0
*/
    @XmlElement(name = "MOPOffTime", required = false)
    private microsecs mopOffTime;
/**
In Data Item US:MOPOnTime (US), enter the duration of the one on-time related to the binary form of amplitude modulation called on-off keying.
@since 3.1.0
*/
    @XmlElement(name = "MOPOnTime", required = false)
    private microsecs mopOnTime;
/**
In Data Item MOPPatternName  (US),  enter a freeform text name for the pattern (e.g., Phase Alpha).
@since 3.1.0
*/
    @XmlElement(name = "MOPPatternName", required = false)
    private S50 mopPatternName;
/**
In Data Item US:MOPPatternPeriod (US), enter the duration of one complete cycle of Frequency, Phase or Amplitude variations for a signal which changes on a patterned basis, within a pulse, for pulsed signals.
@since 3.1.0
*/
    @XmlElement(name = "MOPPatternPeriod", required = false)
    private microsecs mopPatternPeriod;
/**
In Data Item US:MOPPatternType (US), indicate whether MOP or CW characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.
@since 3.1.0
*/
    @XmlElement(name = "MOPPatternType", required = false)
    private TString mopPatternType;
/**
In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value which is associated with the selected MOP name (i.e., the name in the MOP Pattern List).
@since 3.1.0
*/
    @XmlElement(name = "MOPPulseDurationLink", required = false)
    private microsecs mopPulseDurationLink;
/**
In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product of the waveform (actual PD times instantaneous bandwidth).
@since 3.1.0
*/
    @XmlElement(name = "MOPTimeBWProduct", required = false)
    private US_UN16_9 mopTimeBWProduct;
/**
In Data Item MOPType (US), indicate if the information imprinted on the pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a continuous wave (CW).
@since 3.1.0
*/
    @XmlElement(name = "MOPType", required = false)
    private TString mopType;
/**
In Data Item US:MOPValueMaxAM (US), enter the maximum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMaxAM", required = false)
    private Signed_dB_5_2 mopValueMaxAM;
/**
In Data Item US:MOPValueMaxCW (US), enter the maximum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMaxCW", required = false)
    private US_MOPFm mopValueMaxCW;
/**
In Data Item US:MOPValueMaxFM (US), enter the maximum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMaxFM", required = false)
    private US_MOPFm mopValueMaxFM;
/**
In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMaxPM", required = false)
    private US_PhaseAngle mopValueMaxPM;
/**
In Data Item US:MOPValueMinAM (US), enter the minimum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMinAM", required = false)
    private Signed_dB_5_2 mopValueMinAM;
/**
In Data Item US:MOPValueMinCW (US), enter the minimum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMinCW", required = false)
    private US_MOPFm mopValueMinCW;
/**
In Data Item US:MOPValueMinFM (US), enter the minimum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMinFM", required = false)
    private US_MOPFm mopValueMinFM;
/**
In Data Item US:MOPValueMinPM (US), enter the minimum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.
@since 3.1.0
*/
    @XmlElement(name = "MOPValueMinPM", required = false)
    private US_PhaseAngle mopValueMinPM;
/**
In Data Item SignalType (US), indicate the specific type of modulation used/detected.
@since 3.1.0
*/
    @XmlElement(name = "SignalType", required = false)
    private TString signalType;
/**
US:ObservedMOPSweep (Optional)

ObservedMOPSweep (US) contains data describing the parametric information for the period of the Modulation on the Pulse sweep.
@since 3.1.0
*/
    @XmlElement(name = "ObservedMOPSweep")
      private  Set<ObservedMOPSweep> observedMOPSweep;

/**
Get the condition which controls, or can be associated with, the signal MOP variations.

@return the MOPAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getMOPAdaptiveDriverDesc() {
        return mopAdaptiveDriverDesc;
    }

/**
Set the condition which controls, or can be associated with, the signal MOP variations.

@param value the MOPAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setMOPAdaptiveDriverDesc(S500 value) {
        this.mopAdaptiveDriverDesc = value;
    }

/**
Determine if the MOPAdaptiveDriverDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPAdaptiveDriverDesc() {
        return (this.mopAdaptiveDriverDesc!= null);
    }

/**
Get the rule which describes the signal MOP variations.

@return the MOPAdaptiveDriverRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getMOPAdaptiveDriverRuleDesc() {
        return mopAdaptiveDriverRuleDesc;
    }

/**
Set the rule which describes the signal MOP variations.

@param value the MOPAdaptiveDriverRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setMOPAdaptiveDriverRuleDesc(S500 value) {
        this.mopAdaptiveDriverRuleDesc = value;
    }

/**
Determine if the MOPAdaptiveDriverRuleDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPAdaptiveDriverRuleDesc() {
        return (this.mopAdaptiveDriverRuleDesc!= null);
    }

/**
Get the AM Percent Modulation is the ratio (expressed as a percentage) between the amplitude variation and the maximum amplitude

@return the MOPAMPercentModulation value in a {@link TUS_Percent2} data type
@since 3.1.0
*/
public US_Percent2 getMOPAMPercentModulation() {
        return mopamPercentModulation;
    }

/**
Set the AM Percent Modulation is the ratio (expressed as a percentage) between the amplitude variation and the maximum amplitude

@param value the MOPAMPercentModulation value in a {@link TUS_Percent2} data type
@since 3.1.0
*/
public void setMOPAMPercentModulation(US_Percent2 value) {
        this.mopamPercentModulation = value;
    }

/**
Determine if the MOPAMPercentModulation is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPAMPercentModulation() {
        return (this.mopamPercentModulation!= null);
    }

/**
Get In Data Item US:MOPChangeRateAM (US), enter the change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPChangeRateAM value in a {@link TUS_MOPChgAm} data type
@since 3.1.0
*/
public US_MOPChgAm getMOPChangeRateAM() {
        return mopChangeRateAM;
    }

/**
Set In Data Item US:MOPChangeRateAM (US), enter the change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPChangeRateAM value in a {@link TUS_MOPChgAm} data type
@since 3.1.0
*/
public void setMOPChangeRateAM(US_MOPChgAm value) {
        this.mopChangeRateAM = value;
    }

/**
Determine if the MOPChangeRateAM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPChangeRateAM() {
        return (this.mopChangeRateAM!= null);
    }

/**
Get In Data Item US:MOPChangeRateCW (US), enter the change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPChangeRateCW value in a {@link TUS_MOPChgFm} data type
@since 3.1.0
*/
public US_MOPChgFm getMOPChangeRateCW() {
        return mopChangeRateCW;
    }

/**
Set In Data Item US:MOPChangeRateCW (US), enter the change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPChangeRateCW value in a {@link TUS_MOPChgFm} data type
@since 3.1.0
*/
public void setMOPChangeRateCW(US_MOPChgFm value) {
        this.mopChangeRateCW = value;
    }

/**
Determine if the MOPChangeRateCW is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPChangeRateCW() {
        return (this.mopChangeRateCW!= null);
    }

/**
Get In Data Item US:MOPChangeRateFM (US), enter the change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPChangeRateFM value in a {@link TUS_MOPChgFm} data type
@since 3.1.0
*/
public US_MOPChgFm getMOPChangeRateFM() {
        return mopChangeRateFM;
    }

/**
Set In Data Item US:MOPChangeRateFM (US), enter the change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPChangeRateFM value in a {@link TUS_MOPChgFm} data type
@since 3.1.0
*/
public void setMOPChangeRateFM(US_MOPChgFm value) {
        this.mopChangeRateFM = value;
    }

/**
Determine if the MOPChangeRateFM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPChangeRateFM() {
        return (this.mopChangeRateFM!= null);
    }

/**
Get In Data Item US:MOPChangeRatePM (US), enter the change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPChangeRatePM value in a {@link TUS_PhaseAngleRate} data type
@since 3.1.0
*/
public US_PhaseAngleRate getMOPChangeRatePM() {
        return mopChangeRatePM;
    }

/**
Set In Data Item US:MOPChangeRatePM (US), enter the change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPChangeRatePM value in a {@link TUS_PhaseAngleRate} data type
@since 3.1.0
*/
public void setMOPChangeRatePM(US_PhaseAngleRate value) {
        this.mopChangeRatePM = value;
    }

/**
Determine if the MOPChangeRatePM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPChangeRatePM() {
        return (this.mopChangeRatePM!= null);
    }

/**
Get In Data Item US:MOPContinuous (US), indicate whether MOP or CW modulation is Discrete or Continuous.

@return the MOPContinuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getMOPContinuous() {
        return mopContinuous;
    }

/**
Set In Data Item US:MOPContinuous (US), indicate whether MOP or CW modulation is Discrete or Continuous.

@param value the MOPContinuous value in a {@link TString} data type
@since 3.1.0
*/
public void setMOPContinuous(TString value) {
        this.mopContinuous = value;
    }

/**
Determine if the MOPContinuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPContinuous() {
return (this.mopContinuous!= null ? this.mopContinuous.isSetValue() : false);
    }

/**
Get In Data Item US:MOPID (US), enter a unique identifier (within the TxMode) for the MOP data.

@return the MOPID value in a {@link TS10} data type
@since 3.1.0
*/
public S10 getMOPID() {
        return mopid;
    }

/**
Set In Data Item US:MOPID (US), enter a unique identifier (within the TxMode) for the MOP data.

@param value the MOPID value in a {@link TS10} data type
@since 3.1.0
*/
public void setMOPID(S10 value) {
        this.mopid = value;
    }

/**
Determine if the MOPID is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPID() {
        return (this.mopid!= null);
    }

/**
Get In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPMeanValueAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public Signed_dB_5_2 getMOPMeanValueAM() {
        return mopMeanValueAM;
    }

/**
Set In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPMeanValueAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public void setMOPMeanValueAM(Signed_dB_5_2 value) {
        this.mopMeanValueAM = value;
    }

/**
Determine if the MOPMeanValueAM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPMeanValueAM() {
        return (this.mopMeanValueAM!= null);
    }

/**
Get In Data Item US:MOPMeanValueCW (US), enter the average continuous wave frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPMeanValueCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPMeanValueCW() {
        return mopMeanValueCW;
    }

/**
Set In Data Item US:MOPMeanValueCW (US), enter the average continuous wave frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPMeanValueCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPMeanValueCW(US_MOPFm value) {
        this.mopMeanValueCW = value;
    }

/**
Determine if the MOPMeanValueCW is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPMeanValueCW() {
        return (this.mopMeanValueCW!= null);
    }

/**
Get In Data Item US:MOPMeanValue (US), enter the average frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPMeanValueFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPMeanValueFM() {
        return mopMeanValueFM;
    }

/**
Set In Data Item US:MOPMeanValue (US), enter the average frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPMeanValueFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPMeanValueFM(US_MOPFm value) {
        this.mopMeanValueFM = value;
    }

/**
Determine if the MOPMeanValueFM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPMeanValueFM() {
        return (this.mopMeanValueFM!= null);
    }

/**
Get In Data Item US:MOPMeanValue (US), enter the average phase angle for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPMeanValuePM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public US_PhaseAngle getMOPMeanValuePM() {
        return mopMeanValuePM;
    }

/**
Set In Data Item US:MOPMeanValue (US), enter the average phase angle for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPMeanValuePM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public void setMOPMeanValuePM(US_PhaseAngle value) {
        this.mopMeanValuePM = value;
    }

/**
Determine if the MOPMeanValuePM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPMeanValuePM() {
        return (this.mopMeanValuePM!= null);
    }

/**
Get In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)

@return the MOPNumElements value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getMOPNumElements() {
        return mopNumElements;
    }

/**
Set In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)

@param value the MOPNumElements value in a {@link TUN6} data type
@since 3.1.0
*/
public void setMOPNumElements(UN6 value) {
        this.mopNumElements = value;
    }

/**
Determine if the MOPNumElements is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPNumElements() {
        return (this.mopNumElements!= null);
    }

/**
Get In Data Item US:MOPOffTime (US), enter the duration of the state of the modulated waveform with the absence of energy.

@return the MOPOffTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getMOPOffTime() {
        return mopOffTime;
    }

/**
Set In Data Item US:MOPOffTime (US), enter the duration of the state of the modulated waveform with the absence of energy.

@param value the MOPOffTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setMOPOffTime(microsecs value) {
        this.mopOffTime = value;
    }

/**
Determine if the MOPOffTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPOffTime() {
        return (this.mopOffTime!= null);
    }

/**
Get In Data Item US:MOPOnTime (US), enter the duration of the one on-time related to the binary form of amplitude modulation called on-off keying.

@return the MOPOnTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getMOPOnTime() {
        return mopOnTime;
    }

/**
Set In Data Item US:MOPOnTime (US), enter the duration of the one on-time related to the binary form of amplitude modulation called on-off keying.

@param value the MOPOnTime value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setMOPOnTime(microsecs value) {
        this.mopOnTime = value;
    }

/**
Determine if the MOPOnTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPOnTime() {
        return (this.mopOnTime!= null);
    }

/**
Get In Data Item MOPPatternName  (US),  enter a freeform text name for the pattern (e.g., Phase Alpha).

@return the MOPPatternName value in a {@link TS50} data type
@since 3.1.0
*/
public S50 getMOPPatternName() {
        return mopPatternName;
    }

/**
Set In Data Item MOPPatternName  (US),  enter a freeform text name for the pattern (e.g., Phase Alpha).

@param value the MOPPatternName value in a {@link TS50} data type
@since 3.1.0
*/
public void setMOPPatternName(S50 value) {
        this.mopPatternName = value;
    }

/**
Determine if the MOPPatternName is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPPatternName() {
        return (this.mopPatternName!= null);
    }

/**
Get In Data Item US:MOPPatternPeriod (US), enter the duration of one complete cycle of Frequency, Phase or Amplitude variations for a signal which changes on a patterned basis, within a pulse, for pulsed signals.

@return the MOPPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getMOPPatternPeriod() {
        return mopPatternPeriod;
    }

/**
Set In Data Item US:MOPPatternPeriod (US), enter the duration of one complete cycle of Frequency, Phase or Amplitude variations for a signal which changes on a patterned basis, within a pulse, for pulsed signals.

@param value the MOPPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setMOPPatternPeriod(microsecs value) {
        this.mopPatternPeriod = value;
    }

/**
Determine if the MOPPatternPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPPatternPeriod() {
        return (this.mopPatternPeriod!= null);
    }

/**
Get In Data Item US:MOPPatternType (US), indicate whether MOP or CW characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.

@return the MOPPatternType value in a {@link TString} data type
@since 3.1.0
*/
public TString getMOPPatternType() {
        return mopPatternType;
    }

/**
Set In Data Item US:MOPPatternType (US), indicate whether MOP or CW characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.

@param value the MOPPatternType value in a {@link TString} data type
@since 3.1.0
*/
public void setMOPPatternType(TString value) {
        this.mopPatternType = value;
    }

/**
Determine if the MOPPatternType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPPatternType() {
return (this.mopPatternType!= null ? this.mopPatternType.isSetValue() : false);
    }

/**
Get In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value which is associated with the selected MOP name (i.e., the name in the MOP Pattern List).

@return the MOPPulseDurationLink value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getMOPPulseDurationLink() {
        return mopPulseDurationLink;
    }

/**
Set In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value which is associated with the selected MOP name (i.e., the name in the MOP Pattern List).

@param value the MOPPulseDurationLink value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setMOPPulseDurationLink(microsecs value) {
        this.mopPulseDurationLink = value;
    }

/**
Determine if the MOPPulseDurationLink is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPPulseDurationLink() {
        return (this.mopPulseDurationLink!= null);
    }

/**
Get In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product of the waveform (actual PD times instantaneous bandwidth).

@return the MOPTimeBWProduct value in a {@link TUS_UN16_9} data type
@since 3.1.0
*/
public US_UN16_9 getMOPTimeBWProduct() {
        return mopTimeBWProduct;
    }

/**
Set In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product of the waveform (actual PD times instantaneous bandwidth).

@param value the MOPTimeBWProduct value in a {@link TUS_UN16_9} data type
@since 3.1.0
*/
public void setMOPTimeBWProduct(US_UN16_9 value) {
        this.mopTimeBWProduct = value;
    }

/**
Determine if the MOPTimeBWProduct is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPTimeBWProduct() {
        return (this.mopTimeBWProduct!= null);
    }

/**
Get In Data Item MOPType (US), indicate if the information imprinted on the pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a continuous wave (CW).

@return the MOPType value in a {@link TString} data type
@since 3.1.0
*/
public TString getMOPType() {
        return mopType;
    }

/**
Set In Data Item MOPType (US), indicate if the information imprinted on the pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a continuous wave (CW).

@param value the MOPType value in a {@link TString} data type
@since 3.1.0
*/
public void setMOPType(TString value) {
        this.mopType = value;
    }

/**
Determine if the MOPType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPType() {
return (this.mopType!= null ? this.mopType.isSetValue() : false);
    }

/**
Get In Data Item US:MOPValueMaxAM (US), enter the maximum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMaxAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public Signed_dB_5_2 getMOPValueMaxAM() {
        return mopValueMaxAM;
    }

/**
Set In Data Item US:MOPValueMaxAM (US), enter the maximum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMaxAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public void setMOPValueMaxAM(Signed_dB_5_2 value) {
        this.mopValueMaxAM = value;
    }

/**
Determine if the MOPValueMaxAM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMaxAM() {
        return (this.mopValueMaxAM!= null);
    }

/**
Get In Data Item US:MOPValueMaxCW (US), enter the maximum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMaxCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPValueMaxCW() {
        return mopValueMaxCW;
    }

/**
Set In Data Item US:MOPValueMaxCW (US), enter the maximum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMaxCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPValueMaxCW(US_MOPFm value) {
        this.mopValueMaxCW = value;
    }

/**
Determine if the MOPValueMaxCW is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMaxCW() {
        return (this.mopValueMaxCW!= null);
    }

/**
Get In Data Item US:MOPValueMaxFM (US), enter the maximum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMaxFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPValueMaxFM() {
        return mopValueMaxFM;
    }

/**
Set In Data Item US:MOPValueMaxFM (US), enter the maximum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMaxFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPValueMaxFM(US_MOPFm value) {
        this.mopValueMaxFM = value;
    }

/**
Determine if the MOPValueMaxFM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMaxFM() {
        return (this.mopValueMaxFM!= null);
    }

/**
Get In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMaxPM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public US_PhaseAngle getMOPValueMaxPM() {
        return mopValueMaxPM;
    }

/**
Set In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMaxPM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public void setMOPValueMaxPM(US_PhaseAngle value) {
        this.mopValueMaxPM = value;
    }

/**
Determine if the MOPValueMaxPM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMaxPM() {
        return (this.mopValueMaxPM!= null);
    }

/**
Get In Data Item US:MOPValueMinAM (US), enter the minimum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMinAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public Signed_dB_5_2 getMOPValueMinAM() {
        return mopValueMinAM;
    }

/**
Set In Data Item US:MOPValueMinAM (US), enter the minimum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMinAM value in a {@link TSigned_DB_5_2} data type
@since 3.1.0
*/
public void setMOPValueMinAM(Signed_dB_5_2 value) {
        this.mopValueMinAM = value;
    }

/**
Determine if the MOPValueMinAM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMinAM() {
        return (this.mopValueMinAM!= null);
    }

/**
Get In Data Item US:MOPValueMinCW (US), enter the minimum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMinCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPValueMinCW() {
        return mopValueMinCW;
    }

/**
Set In Data Item US:MOPValueMinCW (US), enter the minimum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMinCW value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPValueMinCW(US_MOPFm value) {
        this.mopValueMinCW = value;
    }

/**
Determine if the MOPValueMinCW is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMinCW() {
        return (this.mopValueMinCW!= null);
    }

/**
Get In Data Item US:MOPValueMinFM (US), enter the minimum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMinFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public US_MOPFm getMOPValueMinFM() {
        return mopValueMinFM;
    }

/**
Set In Data Item US:MOPValueMinFM (US), enter the minimum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMinFM value in a {@link TUS_MOPFm} data type
@since 3.1.0
*/
public void setMOPValueMinFM(US_MOPFm value) {
        this.mopValueMinFM = value;
    }

/**
Determine if the MOPValueMinFM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMinFM() {
        return (this.mopValueMinFM!= null);
    }

/**
Get In Data Item US:MOPValueMinPM (US), enter the minimum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@return the MOPValueMinPM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public US_PhaseAngle getMOPValueMinPM() {
        return mopValueMinPM;
    }

/**
Set In Data Item US:MOPValueMinPM (US), enter the minimum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value the MOPValueMinPM value in a {@link TUS_PhaseAngle} data type
@since 3.1.0
*/
public void setMOPValueMinPM(US_PhaseAngle value) {
        this.mopValueMinPM = value;
    }

/**
Determine if the MOPValueMinPM is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetMOPValueMinPM() {
        return (this.mopValueMinPM!= null);
    }

/**
Get In Data Item SignalType (US), indicate the specific type of modulation used/detected.

@return the SignalType value in a {@link TString} data type
@since 3.1.0
*/
public TString getSignalType() {
        return signalType;
    }

/**
Set In Data Item SignalType (US), indicate the specific type of modulation used/detected.

@param value the SignalType value in a {@link TString} data type
@since 3.1.0
*/
public void setSignalType(TString value) {
        this.signalType = value;
    }

/**
Determine if the SignalType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetSignalType() {
return (this.signalType!= null ? this.signalType.isSetValue() : false);
    }

/**
Get the US:ObservedMOPSweep

Complex element ObservedMOPSweep (US) contains data describing the parametric information for the period of the Modulation on the Pulse sweep.

@return  a {@link ObservedMOPSweep} instance
@since 3.1.0
*/
    public Set<ObservedMOPSweep> getObservedMOPSweep() {
        if (observedMOPSweep == null) {
            observedMOPSweep = new HashSet<ObservedMOPSweep>();
        }
        return this.observedMOPSweep;
    }

/**
Determine if the ObservedMOPSweep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedMOPSweep() {
        return ((this.observedMOPSweep!= null)&&(!this.observedMOPSweep.isEmpty()));
    }

/**
  Clear the ObservedMOPSweep field. This sets the field to null.
 */
    public void unsetObservedMOPSweep() {
        this.observedMOPSweep = null;
    }

/**
Set the condition which controls, or can be associated with, the signal MOP variations.

@param value  An instances of type {@link String}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPAdaptiveDriverDesc(String value) {
           setMOPAdaptiveDriverDesc(new S500(value));
        return this;
    }

/**
Set the rule which describes the signal MOP variations.

@param value  An instances of type {@link String}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPAdaptiveDriverRuleDesc(String value) {
           setMOPAdaptiveDriverRuleDesc(new S500(value));
        return this;
    }

/**
Set the AM Percent Modulation is the ratio (expressed as a percentage) between the amplitude variation and the maximum amplitude

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPAMPercentModulation(Double value) {
           setMOPAMPercentModulation(new US_Percent2(value));
        return this;
    }

/**
Set In Data Item US:MOPChangeRateAM (US), enter the change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPChangeRateAM(Double value) {
           setMOPChangeRateAM(new US_MOPChgAm(value));
        return this;
    }

/**
Set In Data Item US:MOPChangeRateCW (US), enter the change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPChangeRateCW(Double value) {
           setMOPChangeRateCW(new US_MOPChgFm(value));
        return this;
    }

/**
Set In Data Item US:MOPChangeRateFM (US), enter the change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPChangeRateFM(Double value) {
           setMOPChangeRateFM(new US_MOPChgFm(value));
        return this;
    }

/**
Set In Data Item US:MOPChangeRatePM (US), enter the change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPChangeRatePM(Double value) {
           setMOPChangeRatePM(new US_PhaseAngleRate(value));
        return this;
    }

/**
Set In Data Item US:MOPContinuous (US), indicate whether MOP or CW modulation is Discrete or Continuous.

@param value  An instances of type {@link ListCBO}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPContinuous(ListCBO value) {
           setMOPContinuous(new TString(value.value()));
        return this;
    }

/**
Set In Data Item US:MOPID (US), enter a unique identifier (within the TxMode) for the MOP data.

@param value  An instances of type {@link String}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPID(String value) {
           setMOPID(new S10(value));
        return this;
    }

/**
Set In Data Item US:MOPMeanValueAM (US), enter the average amplitude for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPMeanValueAM(Double value) {
           setMOPMeanValueAM(new Signed_dB_5_2(value));
        return this;
    }

/**
Set In Data Item US:MOPMeanValueCW (US), enter the average continuous wave frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPMeanValueCW(Double value) {
           setMOPMeanValueCW(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPMeanValue (US), enter the average frequency for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPMeanValueFM(Double value) {
           setMOPMeanValueFM(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPMeanValue (US), enter the average phase angle for a signal which changes on a non-patterned basis within a pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPMeanValuePM(Double value) {
           setMOPMeanValuePM(new US_PhaseAngle(value));
        return this;
    }

/**
Set In Data Item US:MOPNumElements (US), enter the number of discrete FREQ/PHASE/AMP values transmitted in a patterned sequence (i.e., any repeated values are counted each time)

@param value  An instances of type {@link Integer}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPNumElements(Integer value) {
           setMOPNumElements(new UN6(value));
        return this;
    }

/**
Set In Data Item US:MOPOffTime (US), enter the duration of the state of the modulated waveform with the absence of energy.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPOffTime(Double value) {
           setMOPOffTime(new microsecs(value));
        return this;
    }

/**
Set In Data Item US:MOPOnTime (US), enter the duration of the one on-time related to the binary form of amplitude modulation called on-off keying.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPOnTime(Double value) {
           setMOPOnTime(new microsecs(value));
        return this;
    }

/**
Set In Data Item MOPPatternName  (US),  enter a freeform text name for the pattern (e.g., Phase Alpha).

@param value  An instances of type {@link String}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPPatternName(String value) {
           setMOPPatternName(new S50(value));
        return this;
    }

/**
Set In Data Item US:MOPPatternPeriod (US), enter the duration of one complete cycle of Frequency, Phase or Amplitude variations for a signal which changes on a patterned basis, within a pulse, for pulsed signals.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPPatternPeriod(Double value) {
           setMOPPatternPeriod(new microsecs(value));
        return this;
    }

/**
Set In Data Item US:MOPPatternType (US), indicate whether MOP or CW characteristics are Patterned, Non-Patterned, Adaptive, or Unmodulated.

@param value  An instances of type {@link ListUS7}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPPatternType(ListUS7 value) {
           setMOPPatternType(new TString(value.value()));
        return this;
    }

/**
Set In Data Item US:MOPPulseDurationLink (US), enter the Discrete PD value which is associated with the selected MOP name (i.e., the name in the MOP Pattern List).

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPPulseDurationLink(Double value) {
           setMOPPulseDurationLink(new microsecs(value));
        return this;
    }

/**
Set In Data Item US:MOPTimeBWProduct (US), enter the time-bandwidth product of the waveform (actual PD times instantaneous bandwidth).

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPTimeBWProduct(Double value) {
           setMOPTimeBWProduct(new US_UN16_9(value));
        return this;
    }

/**
Set In Data Item MOPType (US), indicate if the information imprinted on the pulse is modulated by amplitude (AM), frequency (FM), phase (PM), or is a continuous wave (CW).

@param value  An instances of type {@link ListUSX}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPType(ListUSX value) {
           setMOPType(new TString(value.value()));
        return this;
    }

/**
Set In Data Item US:MOPValueMaxAM (US), enter the maximum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMaxAM(Double value) {
           setMOPValueMaxAM(new Signed_dB_5_2(value));
        return this;
    }

/**
Set In Data Item US:MOPValueMaxCW (US), enter the maximum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMaxCW(Double value) {
           setMOPValueMaxCW(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPValueMaxFM (US), enter the maximum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMaxFM(Double value) {
           setMOPValueMaxFM(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPValueMaxPM (US), enter the maximum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMaxPM(Double value) {
           setMOPValueMaxPM(new US_PhaseAngle(value));
        return this;
    }

/**
Set In Data Item US:MOPValueMinAM (US), enter the minimum change in amplitude within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMinAM(Double value) {
           setMOPValueMinAM(new Signed_dB_5_2(value));
        return this;
    }

/**
Set In Data Item US:MOPValueMinCW (US), enter the minimum change in continuous wave frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMinCW(Double value) {
           setMOPValueMinCW(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPValueMinFM (US), enter the minimum change in frequency within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMinFM(Double value) {
           setMOPValueMinFM(new US_MOPFm(value));
        return this;
    }

/**
Set In Data Item US:MOPValueMinPM (US), enter the minimum change in phase angle within the pulse.  Use of this element should agree with the selection made in US:ObservedMOPAnalysis.MOPType.

@param value  An instances of type {@link Double}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withMOPValueMinPM(Double value) {
           setMOPValueMinPM(new US_PhaseAngle(value));
        return this;
    }

/**
Set In Data Item SignalType (US), indicate the specific type of modulation used/detected.

@param value  An instances of type {@link ListCMO}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withSignalType(ListCMO value) {
           setSignalType(new TString(value.value()));
        return this;
    }

/**
Set the US:ObservedMOPSweep

Complex element ObservedMOPSweep (US) contains data describing the parametric information for the period of the Modulation on the Pulse sweep.

@param values  One or more instances of type {@link ObservedMOPSweep...}
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withObservedMOPSweep(ObservedMOPSweep... values) {
        if (values!= null) {
            for (ObservedMOPSweep value: values) {
                getObservedMOPSweep().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedMOPSweep

Complex element ObservedMOPSweep (US) contains data describing the parametric information for the period of the Modulation on the Pulse sweep.

@param values  A collection of {@link ObservedMOPSweep} instances
@return The current ObservedMOPAnalysis object instance
@since 3.1.0
*/
    public ObservedMOPAnalysis withObservedMOPSweep(Collection<ObservedMOPSweep> values) {
        if (values!= null) {
            getObservedMOPSweep().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this ObservedMOPAnalysis instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedMOPAnalysis {"
 + (mopAdaptiveDriverDesc !=null? " mopAdaptiveDriverDesc [" + mopAdaptiveDriverDesc +"]" : "") 
 + (mopAdaptiveDriverRuleDesc !=null? " mopAdaptiveDriverRuleDesc [" + mopAdaptiveDriverRuleDesc +"]" : "") 
 + (mopChangeRateAM !=null? " mopChangeRateAM [" + mopChangeRateAM +"]" : "") 
 + (mopChangeRateCW !=null? " mopChangeRateCW [" + mopChangeRateCW +"]" : "") 
 + (mopChangeRateFM !=null? " mopChangeRateFM [" + mopChangeRateFM +"]" : "") 
 + (mopChangeRatePM !=null? " mopChangeRatePM [" + mopChangeRatePM +"]" : "") 
 + (mopContinuous !=null? " mopContinuous [" + mopContinuous +"]" : "") 
 + (mopMeanValueAM !=null? " mopMeanValueAM [" + mopMeanValueAM +"]" : "") 
 + (mopMeanValueCW !=null? " mopMeanValueCW [" + mopMeanValueCW +"]" : "") 
 + (mopMeanValueFM !=null? " mopMeanValueFM [" + mopMeanValueFM +"]" : "") 
 + (mopMeanValuePM !=null? " mopMeanValuePM [" + mopMeanValuePM +"]" : "") 
 + (mopNumElements !=null? " mopNumElements [" + mopNumElements +"]" : "") 
 + (mopOffTime !=null? " mopOffTime [" + mopOffTime +"]" : "") 
 + (mopOnTime !=null? " mopOnTime [" + mopOnTime +"]" : "") 
 + (mopPatternName !=null? " mopPatternName [" + mopPatternName +"]" : "") 
 + (mopPatternPeriod !=null? " mopPatternPeriod [" + mopPatternPeriod +"]" : "") 
 + (mopPatternType !=null? " mopPatternType [" + mopPatternType +"]" : "") 
 + (mopPulseDurationLink !=null? " mopPulseDurationLink [" + mopPulseDurationLink +"]" : "") 
 + (mopTimeBWProduct !=null? " mopTimeBWProduct [" + mopTimeBWProduct +"]" : "") 
 + (mopType !=null? " mopType [" + mopType +"]" : "") 
 + (mopValueMaxAM !=null? " mopValueMaxAM [" + mopValueMaxAM +"]" : "") 
 + (mopValueMaxCW !=null? " mopValueMaxCW [" + mopValueMaxCW +"]" : "") 
 + (mopValueMaxFM !=null? " mopValueMaxFM [" + mopValueMaxFM +"]" : "") 
 + (mopValueMaxPM !=null? " mopValueMaxPM [" + mopValueMaxPM +"]" : "") 
 + (mopValueMinAM !=null? " mopValueMinAM [" + mopValueMinAM +"]" : "") 
 + (mopValueMinCW !=null? " mopValueMinCW [" + mopValueMinCW +"]" : "") 
 + (mopValueMinFM !=null? " mopValueMinFM [" + mopValueMinFM +"]" : "") 
 + (mopValueMinPM !=null? " mopValueMinPM [" + mopValueMinPM +"]" : "") 
 + (mopamPercentModulation !=null? " mopamPercentModulation [" + mopamPercentModulation +"]" : "") 
 + (mopid !=null? " mopid [" + mopid +"]" : "") 
 + (observedMOPSweep !=null? " observedMOPSweep [" + observedMOPSweep +"]" : "") 
 + (signalType !=null? " signalType [" + signalType +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedMOPAnalysis} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
