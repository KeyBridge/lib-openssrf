package us.gov.dod.standard.ssrf._3_1.multiple;

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
ObservedERPAnalysis (US) contains data describing Effective Radiated Power (ERP) associated with an emitter or Notation.

Element of {@link Configuration}

Sub-Element is {@link ObservedERPValues}

Example: <pre>
* &lt;ObservedERPAnalysis &gt;
*   &lt;Continuous cls="U"&gt;Yes&lt;/Continuous&gt;
*   &lt;ERPAdaptiveDriverDesc cls="U"&gt;Target Motion Tracking&lt;/ERPAdaptiveDriverDesc&gt;
*   &lt;ERPAdaptiveRuleDesc cls="U"&gt;Required Pattern Collection&lt;/ERPAdaptiveRuleDesc&gt;
*   &lt;ERPPatternPeriod cls="U"&gt;55&lt;/ERPPatternPeriod&gt;
*   &lt;ERPPatternType cls="U"&gt;Non-Patterned&lt;/ERPPatternType&gt;
*   &lt;ERPActualMax cls="U"&gt;99.54&lt;/ERPActualMax&gt;
*   &lt;ERPActualMin cls="U"&gt;67.99&lt;/ERPActualMin&gt;
*   &lt;ERPChangeRate cls="U"&gt;13&lt;/ERPChangeRate&gt;
*   &lt;ERPExtremeMax cls="U"&gt;125.7&lt;/ERPExtremeMax&gt;
*   &lt;ERPExtremeMin cls="U"&gt;55.88&lt;/ERPExtremeMin&gt;
*   &lt;ERPMean cls="U"&gt;111.57&lt;/ERPMean&gt;
*   &lt;ERPMedian cls="U"&gt;44.88&lt;/ERPMedian&gt;
*   &lt;ERPSequenceDesc cls="U"&gt;Required Pattern Collection set A34&lt;/ERPSequenceDesc&gt;
*   &lt;ERPStdDev cls="U"&gt;17&lt;/ERPStdDev&gt;
*   &lt;ERPStep cls="U"&gt;1.666&lt;/ERPStep&gt;
*   &lt;NumObsPositions cls="U"&gt;60&lt;/NumObsPositions&gt;
*   &lt;NumObsValues cls="U"&gt;23&lt;/NumObsValues&gt;
*   &lt;ObservedERPValues&gt;
*     &lt;ERPDwell cls="U"&gt;589&lt;/ERPDwell&gt;
*     &lt;ERPValue cls="U"&gt;128.55&lt;/ERPValue&gt;
*     &lt;StatisticalIndicator cls="U"&gt;98&lt;/StatisticalIndicator&gt;
*   &lt;/ObservedERPValues&gt;
* &lt;/ObservedERPAnalysis &gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedERPAnalysis", propOrder = {
    "continuous",
    "erpAdaptiveDriverDesc",
    "erpAdaptiveRuleDesc",
    "erpPatternPeriod",
    "erpPatternType",
    "erpActualMax",
    "erpActualMin",
    "erpChangeRate",
    "erpExtremeMax",
    "erpExtremeMin",
    "erpMean",
    "erpMedian",
    "erpSequenceDesc",
    "erpStdDev",
    "erpStep",
    "numObsPositions",
    "numObsValues",
    "observedERPValues"
})
public class ObservedERPAnalysis {

/**
In Data Item Continuous (US), indicate whether pulse-to-pulse ERP variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.
@since 3.1.0
*/
    @XmlElement(name = "Continuous", required = false)
    private TString continuous;
/**
US:ERPAdaptiveDriverDesc - ERP Driver Description (Optional) 

The condition which controls, or can be associated with, the signal ERP variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "ERPAdaptiveDriverDesc", required = false)
    private S500 erpAdaptiveDriverDesc;
/**
US:ERPAdaptiveRuleDesc - ERP Driver Rule Description (Optional) 

The rule which describes the signal ERP variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "ERPAdaptiveRuleDesc", required = false)
    private S500 erpAdaptiveRuleDesc;
/**
US:ERPPatternPeriod - ERP Pattern Period (Optional) 

The time duration for one complete cycle of a repeating ERP sequence.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "ERPPatternPeriod", required = false)
    private microsecs erpPatternPeriod;
/**
In Data Item ERPPatternType (US), indicate whether ERP is unmodulated ERP variations are Patterned, Non-Patterned, or Adaptive.
@since 3.1.0
*/
    @XmlElement(name = "ERPPatternType", required = false)
    private TString erpPatternType;
/**
US:ERPActualMax - ERP Actual Max Value (Optional) 

The highest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

[XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than US:ERPActualMin.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPActualMax", required = false)
    private dBW erpActualMax;
/**
US:ERPActualMin - ERP Actual Min Value (Optional) 

The lowest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPActualMin", required = false)
    private dBW erpActualMin;
/**
US:ERPChangeRate - ERP Change Rate (Optional) 

The rate of change for ERP variations expressed in ERP change per unit of time.

Format is UN(6,4) (dBW/sec)
@since 3.1.0
*/
    @XmlElement(name = "ERPChangeRate", required = false)
    private US_dBWS erpChangeRate;
/**
US:ERPExtremeMax - ERP Extreme Max Value (Optional) 

The upper ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

[XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than US:ERPExtremeMin.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPExtremeMax", required = false)
    private dBW erpExtremeMax;
/**
US:ERPExtremeMin - ERP Extreme Min Value (Optional) 

The lower ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPExtremeMin", required = false)
    private dBW erpExtremeMin;
/**
US:ERPMean - ERP Mean Value  (Optional) 

The mean ERP value for a signal which changes ERP values on a non-patterned basis.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPMean", required = false)
    private dBW erpMean;
/**
US:ERPMedian - ERP Most Probable Value  (Optional) 

The observed ERP value, or the observed ERP values in the case of a signal with multiple discrete/individual ERP values, that the signal most often used based on a statistical study of a dataset. 

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPMedian", required = false)
    private dBW erpMedian;
/**
In Data Item ERP SequenceDesc (US), enter the textual description of the observed algorithm for the sequence of variation for the ERP.
@since 3.1.0
*/
    @XmlElement(name = "ERPSequenceDesc", required = false)
    private S500 erpSequenceDesc;
/**
US:ERPStdDev - ERP Standard Deviation (Optional) 

The standard deviation associated with the ERP Value data set that was used to calculate ERPMean.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPStdDev", required = false)
    private dBW erpStdDev;
/**
US:ERPStep - ERP Step (Optional) 

The delta between the Most Probable observed ERP values of adjacent and discrete ERPs.

Format is SN(10,7) (dBW)
@since 3.1.0
*/
    @XmlElement(name = "ERPStep", required = false)
    private dBW erpStep;
/**
US:NumObsPositions - Observed Position Count (Optional) 

The number of discrete ERP dwell/pulse groups, for a pulsed signal, or ERP values at a constant ERP value, for a continuous wave (CW) signal, observed in a signal which contains multiple and discrete ERP values that change in a repeating ERP sequence.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumObsPositions", required = false)
    private UN6 numObsPositions;
/**
US:NumObsValues - Observed Value Count (Optional) 

The number of discrete ERP values observed for a signal which contains multiple and discrete ERP values.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumObsValues", required = false)
    private UN6 numObsValues;
/**
US:ObservedERPValues (Optional)

ObservedERPValues (US) contains specific data artifacts that describe the Effective Radiated Power (ERP) associated with an emitter or Notation.
@since 3.1.0
*/
    @XmlElement(name = "ObservedERPValues")
      private  Set<ObservedERPValues> observedERPValues;

/**
Get In Data Item Continuous (US), indicate whether pulse-to-pulse ERP variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@return the Continuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getContinuous() {
        return continuous;
    }

/**
Set In Data Item Continuous (US), indicate whether pulse-to-pulse ERP variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value the Continuous value in a {@link TString} data type
@since 3.1.0
*/
public void setContinuous(TString value) {
        this.continuous = value;
    }

/**
Determine if the Continuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetContinuous() {
return (this.continuous!= null ? this.continuous.isSetValue() : false);
    }

/**
Get the condition which controls, or can be associated with, the signal ERP variations.

@return the ERPAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getERPAdaptiveDriverDesc() {
        return erpAdaptiveDriverDesc;
    }

/**
Set the condition which controls, or can be associated with, the signal ERP variations.

@param value the ERPAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setERPAdaptiveDriverDesc(S500 value) {
        this.erpAdaptiveDriverDesc = value;
    }

/**
Determine if the ERPAdaptiveDriverDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPAdaptiveDriverDesc() {
        return (this.erpAdaptiveDriverDesc!= null);
    }

/**
Get the rule which describes the signal ERP variations.

@return the ERPAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getERPAdaptiveRuleDesc() {
        return erpAdaptiveRuleDesc;
    }

/**
Set the rule which describes the signal ERP variations.

@param value the ERPAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setERPAdaptiveRuleDesc(S500 value) {
        this.erpAdaptiveRuleDesc = value;
    }

/**
Determine if the ERPAdaptiveRuleDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPAdaptiveRuleDesc() {
        return (this.erpAdaptiveRuleDesc!= null);
    }

/**
Get the time duration for one complete cycle of a repeating ERP sequence.

@return the ERPPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getERPPatternPeriod() {
        return erpPatternPeriod;
    }

/**
Set the time duration for one complete cycle of a repeating ERP sequence.

@param value the ERPPatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setERPPatternPeriod(microsecs value) {
        this.erpPatternPeriod = value;
    }

/**
Determine if the ERPPatternPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPPatternPeriod() {
        return (this.erpPatternPeriod!= null);
    }

/**
Get In Data Item ERPPatternType (US), indicate whether ERP is unmodulated ERP variations are Patterned, Non-Patterned, or Adaptive.

@return the ERPPatternType value in a {@link TString} data type
@since 3.1.0
*/
public TString getERPPatternType() {
        return erpPatternType;
    }

/**
Set In Data Item ERPPatternType (US), indicate whether ERP is unmodulated ERP variations are Patterned, Non-Patterned, or Adaptive.

@param value the ERPPatternType value in a {@link TString} data type
@since 3.1.0
*/
public void setERPPatternType(TString value) {
        this.erpPatternType = value;
    }

/**
Determine if the ERPPatternType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPPatternType() {
return (this.erpPatternType!= null ? this.erpPatternType.isSetValue() : false);
    }

/**
Get the highest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

[XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than US:ERPActualMin.

@return the ERPActualMax value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPActualMax() {
        return erpActualMax;
    }

/**
Set the highest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

[XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than US:ERPActualMin.

@param value the ERPActualMax value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPActualMax(dBW value) {
        this.erpActualMax = value;
    }

/**
Determine if the ERPActualMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPActualMax() {
        return (this.erpActualMax!= null);
    }

/**
Get the lowest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

@return the ERPActualMin value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPActualMin() {
        return erpActualMin;
    }

/**
Set the lowest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

@param value the ERPActualMin value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPActualMin(dBW value) {
        this.erpActualMin = value;
    }

/**
Determine if the ERPActualMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPActualMin() {
        return (this.erpActualMin!= null);
    }

/**
Get the rate of change for ERP variations expressed in ERP change per unit of time.

@return the ERPChangeRate value in a {@link TUS_DBWS} data type
@since 3.1.0
*/
public US_dBWS getERPChangeRate() {
        return erpChangeRate;
    }

/**
Set the rate of change for ERP variations expressed in ERP change per unit of time.

@param value the ERPChangeRate value in a {@link TUS_DBWS} data type
@since 3.1.0
*/
public void setERPChangeRate(US_dBWS value) {
        this.erpChangeRate = value;
    }

/**
Determine if the ERPChangeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPChangeRate() {
        return (this.erpChangeRate!= null);
    }

/**
Get the upper ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

[XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than US:ERPExtremeMin.

@return the ERPExtremeMax value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPExtremeMax() {
        return erpExtremeMax;
    }

/**
Set the upper ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

[XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than US:ERPExtremeMin.

@param value the ERPExtremeMax value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPExtremeMax(dBW value) {
        this.erpExtremeMax = value;
    }

/**
Determine if the ERPExtremeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPExtremeMax() {
        return (this.erpExtremeMax!= null);
    }

/**
Get the lower ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

@return the ERPExtremeMin value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPExtremeMin() {
        return erpExtremeMin;
    }

/**
Set the lower ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

@param value the ERPExtremeMin value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPExtremeMin(dBW value) {
        this.erpExtremeMin = value;
    }

/**
Determine if the ERPExtremeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPExtremeMin() {
        return (this.erpExtremeMin!= null);
    }

/**
Get the mean ERP value for a signal which changes ERP values on a non-patterned basis.

@return the ERPMean value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPMean() {
        return erpMean;
    }

/**
Set the mean ERP value for a signal which changes ERP values on a non-patterned basis.

@param value the ERPMean value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPMean(dBW value) {
        this.erpMean = value;
    }

/**
Determine if the ERPMean is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPMean() {
        return (this.erpMean!= null);
    }

/**
Get the observed ERP value, or the observed ERP values in the case of a signal with multiple discrete/individual ERP values, that the signal most often used based on a statistical study of a dataset. 

@return the ERPMedian value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPMedian() {
        return erpMedian;
    }

/**
Set the observed ERP value, or the observed ERP values in the case of a signal with multiple discrete/individual ERP values, that the signal most often used based on a statistical study of a dataset. 

@param value the ERPMedian value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPMedian(dBW value) {
        this.erpMedian = value;
    }

/**
Determine if the ERPMedian is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPMedian() {
        return (this.erpMedian!= null);
    }

/**
Get In Data Item ERP SequenceDesc (US), enter the textual description of the observed algorithm for the sequence of variation for the ERP.

@return the ERPSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getERPSequenceDesc() {
        return erpSequenceDesc;
    }

/**
Set In Data Item ERP SequenceDesc (US), enter the textual description of the observed algorithm for the sequence of variation for the ERP.

@param value the ERPSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setERPSequenceDesc(S500 value) {
        this.erpSequenceDesc = value;
    }

/**
Determine if the ERPSequenceDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPSequenceDesc() {
        return (this.erpSequenceDesc!= null);
    }

/**
Get the standard deviation associated with the ERP Value data set that was used to calculate ERPMean.

@return the ERPStdDev value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPStdDev() {
        return erpStdDev;
    }

/**
Set the standard deviation associated with the ERP Value data set that was used to calculate ERPMean.

@param value the ERPStdDev value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPStdDev(dBW value) {
        this.erpStdDev = value;
    }

/**
Determine if the ERPStdDev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPStdDev() {
        return (this.erpStdDev!= null);
    }

/**
Get the delta between the Most Probable observed ERP values of adjacent and discrete ERPs.

@return the ERPStep value in a {@link TdBW} data type
@since 3.1.0
*/
public dBW getERPStep() {
        return erpStep;
    }

/**
Set the delta between the Most Probable observed ERP values of adjacent and discrete ERPs.

@param value the ERPStep value in a {@link TdBW} data type
@since 3.1.0
*/
public void setERPStep(dBW value) {
        this.erpStep = value;
    }

/**
Determine if the ERPStep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetERPStep() {
        return (this.erpStep!= null);
    }

/**
Get the number of discrete ERP dwell/pulse groups, for a pulsed signal, or ERP values at a constant ERP value, for a continuous wave (CW) signal, observed in a signal which contains multiple and discrete ERP values that change in a repeating ERP sequence.

@return the NumObsPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumObsPositions() {
        return numObsPositions;
    }

/**
Set the number of discrete ERP dwell/pulse groups, for a pulsed signal, or ERP values at a constant ERP value, for a continuous wave (CW) signal, observed in a signal which contains multiple and discrete ERP values that change in a repeating ERP sequence.

@param value the NumObsPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumObsPositions(UN6 value) {
        this.numObsPositions = value;
    }

/**
Determine if the NumObsPositions is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumObsPositions() {
        return (this.numObsPositions!= null);
    }

/**
Get the number of discrete ERP values observed for a signal which contains multiple and discrete ERP values.

@return the NumObsValues value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumObsValues() {
        return numObsValues;
    }

/**
Set the number of discrete ERP values observed for a signal which contains multiple and discrete ERP values.

@param value the NumObsValues value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumObsValues(UN6 value) {
        this.numObsValues = value;
    }

/**
Determine if the NumObsValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumObsValues() {
        return (this.numObsValues!= null);
    }

/**
Get the US:ObservedERPValues

Complex element ObservedERPValues (US) contains specific data artifacts that describe the Effective Radiated Power (ERP) associated with an emitter or Notation.

@return  a {@link ObservedERPValues} instance
@since 3.1.0
*/
    public Set<ObservedERPValues> getObservedERPValues() {
        if (observedERPValues == null) {
            observedERPValues = new HashSet<ObservedERPValues>();
        }
        return this.observedERPValues;
    }

/**
Determine if the ObservedERPValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedERPValues() {
        return ((this.observedERPValues!= null)&&(!this.observedERPValues.isEmpty()));
    }

/**
  Clear the ObservedERPValues field. This sets the field to null.
 */
    public void unsetObservedERPValues() {
        this.observedERPValues = null;
    }

/**
Set In Data Item Continuous (US), indicate whether pulse-to-pulse ERP variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value  An instances of type {@link ListCBO}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withContinuous(ListCBO value) {
           setContinuous(new TString(value.value()));
        return this;
    }

/**
Set the condition which controls, or can be associated with, the signal ERP variations.

@param value  An instances of type {@link String}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPAdaptiveDriverDesc(String value) {
           setERPAdaptiveDriverDesc(new S500(value));
        return this;
    }

/**
Set the rule which describes the signal ERP variations.

@param value  An instances of type {@link String}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPAdaptiveRuleDesc(String value) {
           setERPAdaptiveRuleDesc(new S500(value));
        return this;
    }

/**
Set the time duration for one complete cycle of a repeating ERP sequence.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPPatternPeriod(Double value) {
           setERPPatternPeriod(new microsecs(value));
        return this;
    }

/**
Set In Data Item ERPPatternType (US), indicate whether ERP is unmodulated ERP variations are Patterned, Non-Patterned, or Adaptive.

@param value  An instances of type {@link ListUS7}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPPatternType(ListUS7 value) {
           setERPPatternType(new TString(value.value()));
        return this;
    }

/**
Set the highest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

[XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than US:ERPActualMin.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPActualMax(Double value) {
           setERPActualMax(new dBW(value));
        return this;
    }

/**
Set the lowest discrete ERP value which is found in a single piece of a complete data (e.g., in a single intercept that contains the complete ERP characteristics of the signal).

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPActualMin(Double value) {
           setERPActualMin(new dBW(value));
        return this;
    }

/**
Set the rate of change for ERP variations expressed in ERP change per unit of time.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPChangeRate(Double value) {
           setERPChangeRate(new US_dBWS(value));
        return this;
    }

/**
Set the upper ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

[XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than US:ERPExtremeMin.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPExtremeMax(Double value) {
           setERPExtremeMax(new dBW(value));
        return this;
    }

/**
Set the lower ERP value that represent 100% of the signal observed ERP values which were obtained from a statistical study of a data set.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPExtremeMin(Double value) {
           setERPExtremeMin(new dBW(value));
        return this;
    }

/**
Set the mean ERP value for a signal which changes ERP values on a non-patterned basis.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPMean(Double value) {
           setERPMean(new dBW(value));
        return this;
    }

/**
Set the observed ERP value, or the observed ERP values in the case of a signal with multiple discrete/individual ERP values, that the signal most often used based on a statistical study of a dataset. 

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPMedian(Double value) {
           setERPMedian(new dBW(value));
        return this;
    }

/**
Set In Data Item ERP SequenceDesc (US), enter the textual description of the observed algorithm for the sequence of variation for the ERP.

@param value  An instances of type {@link String}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPSequenceDesc(String value) {
           setERPSequenceDesc(new S500(value));
        return this;
    }

/**
Set the standard deviation associated with the ERP Value data set that was used to calculate ERPMean.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPStdDev(Double value) {
           setERPStdDev(new dBW(value));
        return this;
    }

/**
Set the delta between the Most Probable observed ERP values of adjacent and discrete ERPs.

@param value  An instances of type {@link Double}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withERPStep(Double value) {
           setERPStep(new dBW(value));
        return this;
    }

/**
Set the number of discrete ERP dwell/pulse groups, for a pulsed signal, or ERP values at a constant ERP value, for a continuous wave (CW) signal, observed in a signal which contains multiple and discrete ERP values that change in a repeating ERP sequence.

@param value  An instances of type {@link Integer}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withNumObsPositions(Integer value) {
           setNumObsPositions(new UN6(value));
        return this;
    }

/**
Set the number of discrete ERP values observed for a signal which contains multiple and discrete ERP values.

@param value  An instances of type {@link Integer}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withNumObsValues(Integer value) {
           setNumObsValues(new UN6(value));
        return this;
    }

/**
Set the US:ObservedERPValues

Complex element ObservedERPValues (US) contains specific data artifacts that describe the Effective Radiated Power (ERP) associated with an emitter or Notation.

@param values  One or more instances of type {@link ObservedERPValues...}
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withObservedERPValues(ObservedERPValues... values) {
        if (values!= null) {
            for (ObservedERPValues value: values) {
                getObservedERPValues().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedERPValues

Complex element ObservedERPValues (US) contains specific data artifacts that describe the Effective Radiated Power (ERP) associated with an emitter or Notation.

@param values  A collection of {@link ObservedERPValues} instances
@return The current ObservedERPAnalysis object instance
@since 3.1.0
*/
    public ObservedERPAnalysis withObservedERPValues(Collection<ObservedERPValues> values) {
        if (values!= null) {
            getObservedERPValues().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this ObservedERPAnalysis instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedERPAnalysis {"
 + (continuous !=null? " continuous [" + continuous +"]" : "") 
 + (erpActualMax !=null? " erpActualMax [" + erpActualMax +"]" : "") 
 + (erpActualMin !=null? " erpActualMin [" + erpActualMin +"]" : "") 
 + (erpAdaptiveDriverDesc !=null? " erpAdaptiveDriverDesc [" + erpAdaptiveDriverDesc +"]" : "") 
 + (erpAdaptiveRuleDesc !=null? " erpAdaptiveRuleDesc [" + erpAdaptiveRuleDesc +"]" : "") 
 + (erpChangeRate !=null? " erpChangeRate [" + erpChangeRate +"]" : "") 
 + (erpExtremeMax !=null? " erpExtremeMax [" + erpExtremeMax +"]" : "") 
 + (erpExtremeMin !=null? " erpExtremeMin [" + erpExtremeMin +"]" : "") 
 + (erpMean !=null? " erpMean [" + erpMean +"]" : "") 
 + (erpMedian !=null? " erpMedian [" + erpMedian +"]" : "") 
 + (erpPatternPeriod !=null? " erpPatternPeriod [" + erpPatternPeriod +"]" : "") 
 + (erpPatternType !=null? " erpPatternType [" + erpPatternType +"]" : "") 
 + (erpSequenceDesc !=null? " erpSequenceDesc [" + erpSequenceDesc +"]" : "") 
 + (erpStdDev !=null? " erpStdDev [" + erpStdDev +"]" : "") 
 + (erpStep !=null? " erpStep [" + erpStep +"]" : "") 
 + (numObsPositions !=null? " numObsPositions [" + numObsPositions +"]" : "") 
 + (numObsValues !=null? " numObsValues [" + numObsValues +"]" : "") 
 + (observedERPValues !=null? " observedERPValues [" + observedERPValues +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedERPAnalysis} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
