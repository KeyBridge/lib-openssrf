package us.gov.dod.standard.ssrf._3_1.antenna;

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
ObservedPolarisationAnalysis (US) contains data describing the parametric information for the polarization and tilt angle information.

Element of {@link AntMode}

Sub-Element is {@link ObservedPolarisationValues}

Example: <pre>
* &lt;ObservedPolarisationAnalysis&gt;
*   &lt;AxialRatio cls="U"&gt;15&lt;/AxialRatio&gt;
*   &lt;NumTiltAngleElements cls="U"&gt;16&lt;/NumTiltAngleElements&gt;
*   &lt;NumTiltAnglePositions cls="U"&gt;24&lt;/NumTiltAnglePositions&gt;
*   &lt;PolarisationRotationRate cls="U"&gt;345&lt;/PolarisationRotationRate&gt;
*   &lt;PolarisationType cls="U"&gt;Oblique, angled, crossed&lt;/PolarisationType&gt;
*   &lt;PolarizationDirection cls="U"&gt;Counter-Clockwise&lt;/PolarizationDirection&gt;
*   &lt;PolarizationSense cls="U"&gt;Counter-Clockwise&lt;/PolarizationSense&gt;
*   &lt;TiltAngleAdaptiveDriverDesc cls="U"&gt;Target Motion Tracking&lt;/TiltAngleAdaptiveDriverDesc&gt;
*   &lt;TiltAngleAdaptiveRuleDesc cls="U"&gt;Required Pattern Collection&lt;/TiltAngleAdaptiveRuleDesc&gt;
*   &lt;TiltAngleContinuous cls="U"&gt;Yes&lt;/TiltAngleContinuous&gt;
*   &lt;TiltAngleDuration cls="U"&gt;87.84&lt;/TiltAngleDuration&gt;
*   &lt;TiltAngleExtremeMax cls="U"&gt;89.9&lt;/TiltAngleExtremeMax&gt;
*   &lt;TiltAngleExtremeMin cls="U"&gt;-87.2&lt;/TiltAngleExtremeMin&gt;
*   &lt;TiltAngleMean cls="U"&gt;43.7&lt;/TiltAngleMean&gt;
*   &lt;TiltAngleMedian cls="U"&gt;0.12&lt;/TiltAngleMedian&gt;
*   &lt;TiltAnglePatternPeriod cls="U"&gt;14.89&lt;/TiltAnglePatternPeriod&gt;
*   &lt;TiltAnglePatternType cls="U"&gt;Non-Patterned&lt;/TiltAnglePatternType&gt;
*   &lt;TiltAngleRangeMax cls="U"&gt;89.9&lt;/TiltAngleRangeMax&gt;
*   &lt;TiltAngleRangeMin cls="U"&gt;-87.2&lt;/TiltAngleRangeMin&gt;
*   &lt;TiltAngleRate cls="U"&gt;12&lt;/TiltAngleRate&gt;
*   &lt;TiltAngleSequenceDesc cls="U"&gt;Vector to Target&lt;/TiltAngleSequenceDesc&gt;
*   &lt;TiltAngleStdDev cls="U"&gt;0.01&lt;/TiltAngleStdDev&gt;
*   &lt;TiltAngleStep cls="U"&gt;1.1&lt;/TiltAngleStep&gt;
*   &lt;ObservedPolarisationValues&gt;
*     &lt;StatisticalIndicator cls="U"&gt;97.2&lt;/StatisticalIndicator&gt;
*     &lt;TiltAngleValue cls="U"&gt;56&lt;/TiltAngleValue&gt;
*   &lt;/ObservedPolarisationValues&gt;
* &lt;/ObservedPolarisationAnalysis&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPolarisationAnalysis", propOrder = {
    "axialRatio",
    "numTiltAngleElements",
    "numTiltAnglePositions",
    "polarisationRotationRate",
    "polarisationType",
    "polarisationDirection",
    "polarisationSense",
    "tiltAngleAdaptiveDriverDesc",
    "tiltAngleAdaptiveRuleDesc",
    "tiltAngleContinuous",
    "tiltAngleDuration",
    "tiltAngleExtremeMax",
    "tiltAngleExtremeMin",
    "tiltAngleMean",
    "tiltAngleMedian",
    "tiltAnglePatternPeriod",
    "tiltAnglePatternType",
    "tiltAngleRangeMax",
    "tiltAngleRangeMin",
    "tiltAngleRate",
    "tiltAngleSequenceDesc",
    "tiltAngleStdDev",
    "tiltAngleStep",
    "observedPolarisationValues"
})
public class ObservedPolarisationAnalysis {

/**
US:AxialRatio - Axial Ratio (Optional) 

The ratio of the polarisation ellipse major axis to its minor axis expressed in decibels.

Format is UN(5,2) (dB)
@since 3.1.0
*/
    @XmlElement(name = "AxialRatio", required = false)
    private Unsigned_dB_5_2 axialRatio;
/**
US:NumTiltAngleElements - Num Tilt Angle Elements (Optional) 

The number of unique discrete tilt angle values.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumTiltAngleElements", required = false)
    private UN6 numTiltAngleElements;
/**
US:NumTiltAnglePositions - Num Tilt Angle Positions (Optional) 

The number of discrete Polarisation Tilt Angles used in a repeating Polarisation Tilt Angle sequence.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumTiltAnglePositions", required = false)
    private UN6 numTiltAnglePositions;
/**
US:PolarisationRotationRate - Polarisation Rotation Rate (Optional) 

The number of times per second that the polarisation ellipse mechanically rotates through the same major axis tilt angle.

Format is UN(7,2) (scans/min)
@since 3.1.0
*/
    @XmlElement(name = "PolarisationRotationRate", required = false)
    private US_ScanRate polarisationRotationRate;
/**
US:PolarisationType - Polarisation Type (Optional) 

The polarisation of the radio wave referenced to the direction of propagation.

Format is L:CPO
@since 3.1.0
*/
    @XmlElement(name = "PolarisationType", required = false)
    private TString polarisationType;
/**
US:PolarisationDirection - Polarization Direction (Optional) 

The direction in which the polarisation ellipse is mechanically rotating. The direction is relative to an observer standing behind the radiator and looking toward the direction of mainbeam propagation.

Format is L:CRD
@since 3.1.0
*/
    @XmlElement(name = "PolarisationDirection", required = false)
    private TString polarisationDirection;
/**
US:PolarisationSense - Polarization Sense (Optional) 

The rotation direction of the radiated electromagnetic wave electric field (E-field) vector (E) relative to the direction of propagation. This is typically the opposite of Polarisation Direction.

Format is L:CRD
@since 3.1.0
*/
    @XmlElement(name = "PolarisationSense", required = false)
    private TString polarisationSense;
/**
US:TiltAngleAdaptiveDriverDesc - Tilt Angle Adaptive Driver Description (Optional) 

The condition which controls, or can be associated with, the signals Tilt Angle variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleAdaptiveDriverDesc", required = false)
    private S500 tiltAngleAdaptiveDriverDesc;
/**
US:TiltAngleAdaptiveRuleDesc - Tilt Angle Adaptive Rule Description (Optional) 

The rule which describes the signal Polarisation Tilt Angle variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleAdaptiveRuleDesc", required = false)
    private S500 tiltAngleAdaptiveRuleDesc;
/**
US:TiltAngleContinuous - Tilt Angle Continuous (Optional) 

Whether the tilt angle variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

Format is L:CBO
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleContinuous", required = false)
    private TString tiltAngleContinuous;
/**
US:TiltAngleDuration - Tilt Angle Duration (Optional) 

The time duration for a complete dwell/group of pulses which all have the same discrete Polarisation Tilt Angle value, or for a continuous wave at a constant Polarisation Tilt Angle value.

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleDuration", required = false)
    private microsecs tiltAngleDuration;
/**
US:TiltAngleExtremeMax - Maximum Tilt Angle Extreme (Optional) 

The upper end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

[XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than US:TiltAngleExtremeMin.

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleExtremeMax", required = false)
    private US_Deg_Signed tiltAngleExtremeMax;
/**
US:TiltAngleExtremeMin - Minimum Tilt Angle Extreme (Optional) 

The lower end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleExtremeMin", required = false)
    private US_Deg_Signed tiltAngleExtremeMin;
/**
US:TiltAngleMean - Average Tilt Angle (Optional) 

The average Polarisation Tilt Angle value for a signal which changes Polarisation Tilt Angle values on a non-patterned basis.

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleMean", required = false)
    private US_Deg_Signed tiltAngleMean;
/**
US:TiltAngleMedian - Most Probable Tilt Angle (Optional) 

The observed Polarisation Tilt Angle value that the signal most often used, based on statistical study of the data set.

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleMedian", required = false)
    private US_Deg_Signed tiltAngleMedian;
/**
US:TiltAnglePatternPeriod - Tilt Angle Pattern Period (Optional) 

The time duration for one complete cycle of a repeating Polarisation Tilt Angle sequence

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "TiltAnglePatternPeriod", required = false)
    private microsecs tiltAnglePatternPeriod;
/**
In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or Adaptive.
@since 3.1.0
*/
    @XmlElement(name = "TiltAnglePatternType", required = false)
    private TString tiltAnglePatternType;
/**
US:TiltAngleRangeMax - Tilt Angle Range Max (Optional) 

The highest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics.

[XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than US:TiltAngleRangeMin.

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleRangeMax", required = false)
    private US_Deg_Signed tiltAngleRangeMax;
/**
US:TiltAngleRangeMin - Tilt Angle Range Min (Optional) 

The lowest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleRangeMin", required = false)
    private US_Deg_Signed tiltAngleRangeMin;
/**
US:TiltAngleRate - TiltAngle Rate (Optional) 

The rate of change for Polarisation Tilt Angle variations expressed in Polarisation Tilt Angle changes per unit of time.

Format is SN(5,2) (deg/sec)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleRate", required = false)
    private US_TiltAngRate tiltAngleRate;
/**
US:TiltAngleSequenceDesc - Tilt Angle Sequence Description (Optional) 

A free text description of the sequence of Polarisation Tilt Angle values.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleSequenceDesc", required = false)
    private S500 tiltAngleSequenceDesc;
/**
US:TiltAngleStdDev - Tilt Angle Standard Deviation (Optional) 

The standard deviation of the data set used to calculate Polarisation Tilt Angle Mean fields.

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleStdDev", required = false)
    private US_Deg_Signed tiltAngleStdDev;
/**
US:TiltAngleStep - Tilt Angle Step (Optional) 

The delta between the Most Probable Polarisation Tilt Angle values of adjacent and discrete Polarisation Tilt Angle values.

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "TiltAngleStep", required = false)
    private US_Deg_Signed tiltAngleStep;
/**
US:ObservedPolarisationValues (Optional)

ObservedPolarisationValues (US) contains data describing the parametric information for the polarization tilt angle specific values.
@since 3.1.0
*/
    @XmlElement(name = "ObservedPolarisationValues")
      private  Set<ObservedPolarisationValues> observedPolarisationValues;

/**
Get the ratio of the polarisation ellipse major axis to its minor axis expressed in decibels.

@return the AxialRatio value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public Unsigned_dB_5_2 getAxialRatio() {
        return axialRatio;
    }

/**
Set the ratio of the polarisation ellipse major axis to its minor axis expressed in decibels.

@param value the AxialRatio value in a {@link TUnsigned_DB_5_2} data type
@since 3.1.0
*/
public void setAxialRatio(Unsigned_dB_5_2 value) {
        this.axialRatio = value;
    }

/**
Determine if the AxialRatio is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAxialRatio() {
        return (this.axialRatio!= null);
    }

/**
Get the number of unique discrete tilt angle values.

@return the NumTiltAngleElements value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumTiltAngleElements() {
        return numTiltAngleElements;
    }

/**
Set the number of unique discrete tilt angle values.

@param value the NumTiltAngleElements value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumTiltAngleElements(UN6 value) {
        this.numTiltAngleElements = value;
    }

/**
Determine if the NumTiltAngleElements is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumTiltAngleElements() {
        return (this.numTiltAngleElements!= null);
    }

/**
Get the number of discrete Polarisation Tilt Angles used in a repeating Polarisation Tilt Angle sequence.

@return the NumTiltAnglePositions value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumTiltAnglePositions() {
        return numTiltAnglePositions;
    }

/**
Set the number of discrete Polarisation Tilt Angles used in a repeating Polarisation Tilt Angle sequence.

@param value the NumTiltAnglePositions value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumTiltAnglePositions(UN6 value) {
        this.numTiltAnglePositions = value;
    }

/**
Determine if the NumTiltAnglePositions is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumTiltAnglePositions() {
        return (this.numTiltAnglePositions!= null);
    }

/**
Get the number of times per second that the polarisation ellipse mechanically rotates through the same major axis tilt angle.

@return the PolarisationRotationRate value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getPolarisationRotationRate() {
        return polarisationRotationRate;
    }

/**
Set the number of times per second that the polarisation ellipse mechanically rotates through the same major axis tilt angle.

@param value the PolarisationRotationRate value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setPolarisationRotationRate(US_ScanRate value) {
        this.polarisationRotationRate = value;
    }

/**
Determine if the PolarisationRotationRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPolarisationRotationRate() {
        return (this.polarisationRotationRate!= null);
    }

/**
Get the polarisation of the radio wave referenced to the direction of propagation.

@return the PolarisationType value in a {@link TString} data type
@since 3.1.0
*/
public TString getPolarisationType() {
        return polarisationType;
    }

/**
Set the polarisation of the radio wave referenced to the direction of propagation.

@param value the PolarisationType value in a {@link TString} data type
@since 3.1.0
*/
public void setPolarisationType(TString value) {
        this.polarisationType = value;
    }

/**
Determine if the PolarisationType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPolarisationType() {
return (this.polarisationType!= null ? this.polarisationType.isSetValue() : false);
    }

/**
Get the direction in which the polarisation ellipse is mechanically rotating. The direction is relative to an observer standing behind the radiator and looking toward the direction of mainbeam propagation.

@return the PolarisationDirection value in a {@link TString} data type
@since 3.1.0
*/
public TString getPolarisationDirection() {
        return polarisationDirection;
    }

/**
Set the direction in which the polarisation ellipse is mechanically rotating. The direction is relative to an observer standing behind the radiator and looking toward the direction of mainbeam propagation.

@param value the PolarisationDirection value in a {@link TString} data type
@since 3.1.0
*/
public void setPolarisationDirection(TString value) {
        this.polarisationDirection = value;
    }

/**
Determine if the PolarisationDirection is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPolarisationDirection() {
return (this.polarisationDirection!= null ? this.polarisationDirection.isSetValue() : false);
    }

/**
Get the rotation direction of the radiated electromagnetic wave electric field (E-field) vector (E) relative to the direction of propagation. This is typically the opposite of Polarisation Direction.

@return the PolarisationSense value in a {@link TString} data type
@since 3.1.0
*/
public TString getPolarisationSense() {
        return polarisationSense;
    }

/**
Set the rotation direction of the radiated electromagnetic wave electric field (E-field) vector (E) relative to the direction of propagation. This is typically the opposite of Polarisation Direction.

@param value the PolarisationSense value in a {@link TString} data type
@since 3.1.0
*/
public void setPolarisationSense(TString value) {
        this.polarisationSense = value;
    }

/**
Determine if the PolarisationSense is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetPolarisationSense() {
return (this.polarisationSense!= null ? this.polarisationSense.isSetValue() : false);
    }

/**
Get the condition which controls, or can be associated with, the signals Tilt Angle variations.

@return the TiltAngleAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getTiltAngleAdaptiveDriverDesc() {
        return tiltAngleAdaptiveDriverDesc;
    }

/**
Set the condition which controls, or can be associated with, the signals Tilt Angle variations.

@param value the TiltAngleAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setTiltAngleAdaptiveDriverDesc(S500 value) {
        this.tiltAngleAdaptiveDriverDesc = value;
    }

/**
Determine if the TiltAngleAdaptiveDriverDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleAdaptiveDriverDesc() {
        return (this.tiltAngleAdaptiveDriverDesc!= null);
    }

/**
Get the rule which describes the signal Polarisation Tilt Angle variations.

@return the TiltAngleAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getTiltAngleAdaptiveRuleDesc() {
        return tiltAngleAdaptiveRuleDesc;
    }

/**
Set the rule which describes the signal Polarisation Tilt Angle variations.

@param value the TiltAngleAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setTiltAngleAdaptiveRuleDesc(S500 value) {
        this.tiltAngleAdaptiveRuleDesc = value;
    }

/**
Determine if the TiltAngleAdaptiveRuleDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleAdaptiveRuleDesc() {
        return (this.tiltAngleAdaptiveRuleDesc!= null);
    }

/**
Get whether the tilt angle variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@return the TiltAngleContinuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getTiltAngleContinuous() {
        return tiltAngleContinuous;
    }

/**
Set whether the tilt angle variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value the TiltAngleContinuous value in a {@link TString} data type
@since 3.1.0
*/
public void setTiltAngleContinuous(TString value) {
        this.tiltAngleContinuous = value;
    }

/**
Determine if the TiltAngleContinuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleContinuous() {
return (this.tiltAngleContinuous!= null ? this.tiltAngleContinuous.isSetValue() : false);
    }

/**
Get the time duration for a complete dwell/group of pulses which all have the same discrete Polarisation Tilt Angle value, or for a continuous wave at a constant Polarisation Tilt Angle value.

@return the TiltAngleDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getTiltAngleDuration() {
        return tiltAngleDuration;
    }

/**
Set the time duration for a complete dwell/group of pulses which all have the same discrete Polarisation Tilt Angle value, or for a continuous wave at a constant Polarisation Tilt Angle value.

@param value the TiltAngleDuration value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setTiltAngleDuration(microsecs value) {
        this.tiltAngleDuration = value;
    }

/**
Determine if the TiltAngleDuration is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleDuration() {
        return (this.tiltAngleDuration!= null);
    }

/**
Get the upper end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

[XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than US:TiltAngleExtremeMin.

@return the TiltAngleExtremeMax value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleExtremeMax() {
        return tiltAngleExtremeMax;
    }

/**
Set the upper end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

[XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than US:TiltAngleExtremeMin.

@param value the TiltAngleExtremeMax value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleExtremeMax(US_Deg_Signed value) {
        this.tiltAngleExtremeMax = value;
    }

/**
Determine if the TiltAngleExtremeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleExtremeMax() {
        return (this.tiltAngleExtremeMax!= null);
    }

/**
Get the lower end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

@return the TiltAngleExtremeMin value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleExtremeMin() {
        return tiltAngleExtremeMin;
    }

/**
Set the lower end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

@param value the TiltAngleExtremeMin value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleExtremeMin(US_Deg_Signed value) {
        this.tiltAngleExtremeMin = value;
    }

/**
Determine if the TiltAngleExtremeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleExtremeMin() {
        return (this.tiltAngleExtremeMin!= null);
    }

/**
Get the average Polarisation Tilt Angle value for a signal which changes Polarisation Tilt Angle values on a non-patterned basis.

@return the TiltAngleMean value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleMean() {
        return tiltAngleMean;
    }

/**
Set the average Polarisation Tilt Angle value for a signal which changes Polarisation Tilt Angle values on a non-patterned basis.

@param value the TiltAngleMean value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleMean(US_Deg_Signed value) {
        this.tiltAngleMean = value;
    }

/**
Determine if the TiltAngleMean is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleMean() {
        return (this.tiltAngleMean!= null);
    }

/**
Get the observed Polarisation Tilt Angle value that the signal most often used, based on statistical study of the data set.

@return the TiltAngleMedian value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleMedian() {
        return tiltAngleMedian;
    }

/**
Set the observed Polarisation Tilt Angle value that the signal most often used, based on statistical study of the data set.

@param value the TiltAngleMedian value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleMedian(US_Deg_Signed value) {
        this.tiltAngleMedian = value;
    }

/**
Determine if the TiltAngleMedian is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleMedian() {
        return (this.tiltAngleMedian!= null);
    }

/**
Get the time duration for one complete cycle of a repeating Polarisation Tilt Angle sequence

@return the TiltAnglePatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getTiltAnglePatternPeriod() {
        return tiltAnglePatternPeriod;
    }

/**
Set the time duration for one complete cycle of a repeating Polarisation Tilt Angle sequence

@param value the TiltAnglePatternPeriod value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setTiltAnglePatternPeriod(microsecs value) {
        this.tiltAnglePatternPeriod = value;
    }

/**
Determine if the TiltAnglePatternPeriod is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAnglePatternPeriod() {
        return (this.tiltAnglePatternPeriod!= null);
    }

/**
Get In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or Adaptive.

@return the TiltAnglePatternType value in a {@link TString} data type
@since 3.1.0
*/
public TString getTiltAnglePatternType() {
        return tiltAnglePatternType;
    }

/**
Set In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or Adaptive.

@param value the TiltAnglePatternType value in a {@link TString} data type
@since 3.1.0
*/
public void setTiltAnglePatternType(TString value) {
        this.tiltAnglePatternType = value;
    }

/**
Determine if the TiltAnglePatternType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAnglePatternType() {
return (this.tiltAnglePatternType!= null ? this.tiltAnglePatternType.isSetValue() : false);
    }

/**
Get the highest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics.

[XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than US:TiltAngleRangeMin.

@return the TiltAngleRangeMax value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleRangeMax() {
        return tiltAngleRangeMax;
    }

/**
Set the highest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics.

[XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than US:TiltAngleRangeMin.

@param value the TiltAngleRangeMax value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleRangeMax(US_Deg_Signed value) {
        this.tiltAngleRangeMax = value;
    }

/**
Determine if the TiltAngleRangeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleRangeMax() {
        return (this.tiltAngleRangeMax!= null);
    }

/**
Get the lowest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics

@return the TiltAngleRangeMin value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleRangeMin() {
        return tiltAngleRangeMin;
    }

/**
Set the lowest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics

@param value the TiltAngleRangeMin value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleRangeMin(US_Deg_Signed value) {
        this.tiltAngleRangeMin = value;
    }

/**
Determine if the TiltAngleRangeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleRangeMin() {
        return (this.tiltAngleRangeMin!= null);
    }

/**
Get the rate of change for Polarisation Tilt Angle variations expressed in Polarisation Tilt Angle changes per unit of time.

@return the TiltAngleRate value in a {@link TUS_TiltAngRate} data type
@since 3.1.0
*/
public US_TiltAngRate getTiltAngleRate() {
        return tiltAngleRate;
    }

/**
Set the rate of change for Polarisation Tilt Angle variations expressed in Polarisation Tilt Angle changes per unit of time.

@param value the TiltAngleRate value in a {@link TUS_TiltAngRate} data type
@since 3.1.0
*/
public void setTiltAngleRate(US_TiltAngRate value) {
        this.tiltAngleRate = value;
    }

/**
Determine if the TiltAngleRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleRate() {
        return (this.tiltAngleRate!= null);
    }

/**
Get a free text description of the sequence of Polarisation Tilt Angle values.

@return the TiltAngleSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getTiltAngleSequenceDesc() {
        return tiltAngleSequenceDesc;
    }

/**
Set a free text description of the sequence of Polarisation Tilt Angle values.

@param value the TiltAngleSequenceDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setTiltAngleSequenceDesc(S500 value) {
        this.tiltAngleSequenceDesc = value;
    }

/**
Determine if the TiltAngleSequenceDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleSequenceDesc() {
        return (this.tiltAngleSequenceDesc!= null);
    }

/**
Get the standard deviation of the data set used to calculate Polarisation Tilt Angle Mean fields.

@return the TiltAngleStdDev value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleStdDev() {
        return tiltAngleStdDev;
    }

/**
Set the standard deviation of the data set used to calculate Polarisation Tilt Angle Mean fields.

@param value the TiltAngleStdDev value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleStdDev(US_Deg_Signed value) {
        this.tiltAngleStdDev = value;
    }

/**
Determine if the TiltAngleStdDev is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleStdDev() {
        return (this.tiltAngleStdDev!= null);
    }

/**
Get the delta between the Most Probable Polarisation Tilt Angle values of adjacent and discrete Polarisation Tilt Angle values.

@return the TiltAngleStep value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getTiltAngleStep() {
        return tiltAngleStep;
    }

/**
Set the delta between the Most Probable Polarisation Tilt Angle values of adjacent and discrete Polarisation Tilt Angle values.

@param value the TiltAngleStep value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setTiltAngleStep(US_Deg_Signed value) {
        this.tiltAngleStep = value;
    }

/**
Determine if the TiltAngleStep is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetTiltAngleStep() {
        return (this.tiltAngleStep!= null);
    }

/**
Get the US:ObservedPolarisationValues

Complex element ObservedPolarisationValues (US) contains data describing the parametric information for the polarization tilt angle specific values.

@return  a {@link ObservedPolarisationValues} instance
@since 3.1.0
*/
    public Set<ObservedPolarisationValues> getObservedPolarisationValues() {
        if (observedPolarisationValues == null) {
            observedPolarisationValues = new HashSet<ObservedPolarisationValues>();
        }
        return this.observedPolarisationValues;
    }

/**
Determine if the ObservedPolarisationValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedPolarisationValues() {
        return ((this.observedPolarisationValues!= null)&&(!this.observedPolarisationValues.isEmpty()));
    }

/**
  Clear the ObservedPolarisationValues field. This sets the field to null.
 */
    public void unsetObservedPolarisationValues() {
        this.observedPolarisationValues = null;
    }

/**
Set the ratio of the polarisation ellipse major axis to its minor axis expressed in decibels.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withAxialRatio(Double value) {
           setAxialRatio(new Unsigned_dB_5_2(value));
        return this;
    }

/**
Set the number of unique discrete tilt angle values.

@param value  An instances of type {@link Integer}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withNumTiltAngleElements(Integer value) {
           setNumTiltAngleElements(new UN6(value));
        return this;
    }

/**
Set the number of discrete Polarisation Tilt Angles used in a repeating Polarisation Tilt Angle sequence.

@param value  An instances of type {@link Integer}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withNumTiltAnglePositions(Integer value) {
           setNumTiltAnglePositions(new UN6(value));
        return this;
    }

/**
Set the number of times per second that the polarisation ellipse mechanically rotates through the same major axis tilt angle.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withPolarisationRotationRate(Double value) {
           setPolarisationRotationRate(new US_ScanRate(value));
        return this;
    }

/**
Set the polarisation of the radio wave referenced to the direction of propagation.

@param value  An instances of type {@link ListCPO}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withPolarisationType(ListCPO value) {
           setPolarisationType(new TString(value.value()));
        return this;
    }

/**
Set the direction in which the polarisation ellipse is mechanically rotating. The direction is relative to an observer standing behind the radiator and looking toward the direction of mainbeam propagation.

@param value  An instances of type {@link ListCRD}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withPolarisationDirection(ListCRD value) {
           setPolarisationDirection(new TString(value.value()));
        return this;
    }

/**
Set the rotation direction of the radiated electromagnetic wave electric field (E-field) vector (E) relative to the direction of propagation. This is typically the opposite of Polarisation Direction.

@param value  An instances of type {@link ListCRD}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withPolarisationSense(ListCRD value) {
           setPolarisationSense(new TString(value.value()));
        return this;
    }

/**
Set the condition which controls, or can be associated with, the signals Tilt Angle variations.

@param value  An instances of type {@link String}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleAdaptiveDriverDesc(String value) {
           setTiltAngleAdaptiveDriverDesc(new S500(value));
        return this;
    }

/**
Set the rule which describes the signal Polarisation Tilt Angle variations.

@param value  An instances of type {@link String}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleAdaptiveRuleDesc(String value) {
           setTiltAngleAdaptiveRuleDesc(new S500(value));
        return this;
    }

/**
Set whether the tilt angle variations are Discrete or Continuous. Discrete uses a finite number of fixed values separated by ranges of unused values. Continuous potentially uses an infinite number of values within one or more ranges.

@param value  An instances of type {@link ListCBO}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleContinuous(ListCBO value) {
           setTiltAngleContinuous(new TString(value.value()));
        return this;
    }

/**
Set the time duration for a complete dwell/group of pulses which all have the same discrete Polarisation Tilt Angle value, or for a continuous wave at a constant Polarisation Tilt Angle value.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleDuration(Double value) {
           setTiltAngleDuration(new microsecs(value));
        return this;
    }

/**
Set the upper end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

[XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than US:TiltAngleExtremeMin.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleExtremeMax(Double value) {
           setTiltAngleExtremeMax(new US_Deg_Signed(value));
        return this;
    }

/**
Set the lower end of the range of Polarisation Tilt Angle values that represent 100% of observed Tilt Angle values, from a statistical study of the data set.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleExtremeMin(Double value) {
           setTiltAngleExtremeMin(new US_Deg_Signed(value));
        return this;
    }

/**
Set the average Polarisation Tilt Angle value for a signal which changes Polarisation Tilt Angle values on a non-patterned basis.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleMean(Double value) {
           setTiltAngleMean(new US_Deg_Signed(value));
        return this;
    }

/**
Set the observed Polarisation Tilt Angle value that the signal most often used, based on statistical study of the data set.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleMedian(Double value) {
           setTiltAngleMedian(new US_Deg_Signed(value));
        return this;
    }

/**
Set the time duration for one complete cycle of a repeating Polarisation Tilt Angle sequence

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAnglePatternPeriod(Double value) {
           setTiltAnglePatternPeriod(new microsecs(value));
        return this;
    }

/**
Set In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or Adaptive.

@param value  An instances of type {@link ListUS7}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAnglePatternType(ListUS7 value) {
           setTiltAnglePatternType(new TString(value.value()));
        return this;
    }

/**
Set the highest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics.

[XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than US:TiltAngleRangeMin.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleRangeMax(Double value) {
           setTiltAngleRangeMax(new US_Deg_Signed(value));
        return this;
    }

/**
Set the lowest discrete Polarisation Tilt Angle value found in a single intercept that contains the complete Polarisation Tilt Angle characteristics

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleRangeMin(Double value) {
           setTiltAngleRangeMin(new US_Deg_Signed(value));
        return this;
    }

/**
Set the rate of change for Polarisation Tilt Angle variations expressed in Polarisation Tilt Angle changes per unit of time.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleRate(Double value) {
           setTiltAngleRate(new US_TiltAngRate(value));
        return this;
    }

/**
Set a free text description of the sequence of Polarisation Tilt Angle values.

@param value  An instances of type {@link String}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleSequenceDesc(String value) {
           setTiltAngleSequenceDesc(new S500(value));
        return this;
    }

/**
Set the standard deviation of the data set used to calculate Polarisation Tilt Angle Mean fields.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleStdDev(Double value) {
           setTiltAngleStdDev(new US_Deg_Signed(value));
        return this;
    }

/**
Set the delta between the Most Probable Polarisation Tilt Angle values of adjacent and discrete Polarisation Tilt Angle values.

@param value  An instances of type {@link Double}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withTiltAngleStep(Double value) {
           setTiltAngleStep(new US_Deg_Signed(value));
        return this;
    }

/**
Set the US:ObservedPolarisationValues

Complex element ObservedPolarisationValues (US) contains data describing the parametric information for the polarization tilt angle specific values.

@param values  One or more instances of type {@link ObservedPolarisationValues...}
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withObservedPolarisationValues(ObservedPolarisationValues... values) {
        if (values!= null) {
            for (ObservedPolarisationValues value: values) {
                getObservedPolarisationValues().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedPolarisationValues

Complex element ObservedPolarisationValues (US) contains data describing the parametric information for the polarization tilt angle specific values.

@param values  A collection of {@link ObservedPolarisationValues} instances
@return The current ObservedPolarisationAnalysis object instance
@since 3.1.0
*/
    public ObservedPolarisationAnalysis withObservedPolarisationValues(Collection<ObservedPolarisationValues> values) {
        if (values!= null) {
            getObservedPolarisationValues().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this ObservedPolarisationAnalysis instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedPolarisationAnalysis {"
 + (axialRatio !=null? " axialRatio [" + axialRatio +"]" : "") 
 + (numTiltAngleElements !=null? " numTiltAngleElements [" + numTiltAngleElements +"]" : "") 
 + (numTiltAnglePositions !=null? " numTiltAnglePositions [" + numTiltAnglePositions +"]" : "") 
 + (observedPolarisationValues !=null? " observedPolarisationValues [" + observedPolarisationValues +"]" : "") 
 + (polarisationDirection !=null? " polarisationDirection [" + polarisationDirection +"]" : "") 
 + (polarisationRotationRate !=null? " polarisationRotationRate [" + polarisationRotationRate +"]" : "") 
 + (polarisationSense !=null? " polarisationSense [" + polarisationSense +"]" : "") 
 + (polarisationType !=null? " polarisationType [" + polarisationType +"]" : "") 
 + (tiltAngleAdaptiveDriverDesc !=null? " tiltAngleAdaptiveDriverDesc [" + tiltAngleAdaptiveDriverDesc +"]" : "") 
 + (tiltAngleAdaptiveRuleDesc !=null? " tiltAngleAdaptiveRuleDesc [" + tiltAngleAdaptiveRuleDesc +"]" : "") 
 + (tiltAngleContinuous !=null? " tiltAngleContinuous [" + tiltAngleContinuous +"]" : "") 
 + (tiltAngleDuration !=null? " tiltAngleDuration [" + tiltAngleDuration +"]" : "") 
 + (tiltAngleExtremeMax !=null? " tiltAngleExtremeMax [" + tiltAngleExtremeMax +"]" : "") 
 + (tiltAngleExtremeMin !=null? " tiltAngleExtremeMin [" + tiltAngleExtremeMin +"]" : "") 
 + (tiltAngleMean !=null? " tiltAngleMean [" + tiltAngleMean +"]" : "") 
 + (tiltAngleMedian !=null? " tiltAngleMedian [" + tiltAngleMedian +"]" : "") 
 + (tiltAnglePatternPeriod !=null? " tiltAnglePatternPeriod [" + tiltAnglePatternPeriod +"]" : "") 
 + (tiltAnglePatternType !=null? " tiltAnglePatternType [" + tiltAnglePatternType +"]" : "") 
 + (tiltAngleRangeMax !=null? " tiltAngleRangeMax [" + tiltAngleRangeMax +"]" : "") 
 + (tiltAngleRangeMin !=null? " tiltAngleRangeMin [" + tiltAngleRangeMin +"]" : "") 
 + (tiltAngleRate !=null? " tiltAngleRate [" + tiltAngleRate +"]" : "") 
 + (tiltAngleSequenceDesc !=null? " tiltAngleSequenceDesc [" + tiltAngleSequenceDesc +"]" : "") 
 + (tiltAngleStdDev !=null? " tiltAngleStdDev [" + tiltAngleStdDev +"]" : "") 
 + (tiltAngleStep !=null? " tiltAngleStep [" + tiltAngleStep +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedPolarisationAnalysis} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
