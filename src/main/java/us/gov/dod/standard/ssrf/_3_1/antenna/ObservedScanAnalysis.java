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
ObservedScanAnalysis (US) contains data describing the collected Horizontal and Vertical Scan parameters as well as the Adaptive Driver information.

Element of {@link AntMode}

Sub-Element is {@link ObservedScanValues}

Example: <pre>
* &lt;ObservedScanAnalysis&gt;
*   &lt;:ScansHorzContinuous cls="U"&gt;Yes&lt;/:ScansHorzContinuous&gt;
*   &lt;AzBoresightAngle cls="U"&gt;0.02&lt;/AzBoresightAngle&gt;
*   &lt;AzScanChangeRate cls="U"&gt;14&lt;/AzScanChangeRate&gt;
*   &lt;AzScanRateExtremeMax cls="U"&gt;500&lt;/AzScanRateExtremeMax&gt;
*   &lt;AzScanRateExtremeMin cls="U"&gt;0.01&lt;/AzScanRateExtremeMin&gt;
*   &lt;AzScanRateMean cls="U"&gt;34&lt;/AzScanRateMean&gt;
*   &lt;AzScanRateMedian cls="U"&gt;12&lt;/AzScanRateMedian&gt;
*   &lt;AzScanSector cls="U"&gt;47&lt;/AzScanSector&gt;
*   &lt;AzScanSectorMax cls="U"&gt;23.9&lt;/AzScanSectorMax&gt;
*   &lt;AzScanVelocity cls="U"&gt;41.3&lt;/AzScanVelocity&gt;
*   &lt;ElevScanChangeRate cls="U"&gt;0.002&lt;/ElevScanChangeRate&gt;
*   &lt;ElevScanRateExtremeMax cls="U"&gt;500&lt;/ElevScanRateExtremeMax&gt;
*   &lt;ElevScanRateExtremeMin cls="U"&gt;0.01&lt;/ElevScanRateExtremeMin&gt;
*   &lt;ElevScanRateMean cls="U"&gt;34&lt;/ElevScanRateMean&gt;
*   &lt;ElevScanRateMedian cls="U"&gt;12&lt;/ElevScanRateMedian&gt;
*   &lt;ElevScanSector cls="U"&gt;80&lt;/ElevScanSector&gt;
*   &lt;ElevScanSectorMax cls="U"&gt;87&lt;/ElevScanSectorMax&gt;
*   &lt;ElevScanVelocity cls="U"&gt;41.3&lt;/ElevScanVelocity&gt;
*   &lt;NumBeamPositionsPerScan cls="U"&gt;567&lt;/NumBeamPositionsPerScan&gt;
*   &lt;NumBeamPositionsTotal cls="U"&gt;98651&lt;/NumBeamPositionsTotal&gt;
*   &lt;NumBeamsPerRaster cls="U"&gt;5956&lt;/NumBeamsPerRaster&gt;
*   &lt;NumRastersPerCycle cls="U"&gt;3032&lt;/NumRastersPerCycle&gt;
*   &lt;NumScanPositions cls="U"&gt;567&lt;/NumScanPositions&gt;
*   &lt;NumScanValues cls="U"&gt;346&lt;/NumScanValues&gt;
*   &lt;ScanAdaptiveDriverDesc cls="U"&gt;Target Motion Tracking&lt;/ScanAdaptiveDriverDesc&gt;
*   &lt;ScanAdaptiveRuleDesc cls="U"&gt;Required Pattern Collection&lt;/ScanAdaptiveRuleDesc&gt;
*   &lt;ScanAngleAzStart cls="U"&gt;0.01&lt;/ScanAngleAzStart&gt;
*   &lt;ScanAngleAzStop cls="U"&gt;359.99&lt;/ScanAngleAzStop&gt;
*   &lt;ScanAngleElevStart cls="U"&gt;-89.9&lt;/ScanAngleElevStart&gt;
*   &lt;ScanAngleElevStop cls="U"&gt;89.9&lt;/ScanAngleElevStop&gt;
*   &lt;ScanDwell cls="U"&gt;23.781&lt;/ScanDwell&gt;
*   &lt;ScanDwellSequence cls="U"&gt;Scan Sample Repeat&lt;/ScanDwellSequence&gt;
*   &lt;ScanDwellTime cls="U"&gt;3.45&lt;/ScanDwellTime&gt;
*   &lt;ScanElevContinuous cls="U"&gt;Yes&lt;/ScanElevContinuous&gt;
*   &lt;ScanPatternType cls="U"&gt;Non-Patterned&lt;/ScanPatternType&gt;
*   &lt;ScanType cls="U"&gt;Primary&lt;/ScanType&gt;
*   &lt;ObservedScanValues&gt;
*     &lt;ScanValue cls="U"&gt;34.89&lt;/ScanValue&gt;
*     &lt;StatisticalIndicator cls="U"&gt;97.2&lt;/StatisticalIndicator&gt;
*   &lt;/ObservedScanValues&gt;
* &lt;/ObservedScanAnalysis&gt;
</pre>
@author Key Bridge LLC <developer@keybridge.ch>
@version 3.1.0, 03/27/2015
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedScanAnalysis", propOrder = {
    "scansHorzContinuous",
    "azBoresightAngle",
    "azScanChangeRate",
    "azScanRateExtremeMax",
    "azScanRateExtremeMin",
    "azScanRateMean",
    "azScanRateMedian",
    "azScanSector",
    "azScanSectorMax",
    "azScanVelocity",
    "elevScanChangeRate",
    "elevScanRateExtremeMax",
    "elevScanRateExtremeMin",
    "elevScanRateMean",
    "elevScanRateMedian",
    "elevScanSector",
    "elevScanSectorMax",
    "elevScanVelocity",
    "numBeamPositionsPerScan",
    "numBeamPositionsTotal",
    "numBeamsPerRaster",
    "numRastersPerCycle",
    "numScanPositions",
    "numScanValues",
    "scanAdaptiveDriverDesc",
    "scanAdaptiveRuleDesc",
    "scanAngleAzStart",
    "scanAngleAzStop",
    "scanAngleElevStart",
    "scanAngleElevStop",
    "scanDwell",
    "scanDwellSequence",
    "scanDwellTime",
    "scanElevContinuous",
    "scanPatternType",
    "scanType",
    "observedScanValues"
})
public class ObservedScanAnalysis {

/**
In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth progression is a continuous sweep.
@since 3.1.0
*/
    @XmlElement(name = "ScansHorzContinuous", required = false)
    private TString scansHorzContinuous;
/**
US:AzBoresightAngle - Azimuth Boresight Angle (Optional) 

The position of the emitter Mainbeam (aka, Mainlobe) boresight referenced from true north for ground based fixed emitters, and the emitter defined centerline for other platforms (e.g., mobile, airborne, shipborne).

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "AzBoresightAngle", required = false)
    private US_Deg_Signed azBoresightAngle;
/**
US:AzScanChangeRate - Azimuth Scan Change Rate  (Optional) 

The rate of change for horizontal Scan Period variations expressed in Scan Period change per unit of time

Format is UN(12,6) (μsec/sec)
@since 3.1.0
*/
    @XmlElement(name = "AzScanChangeRate", required = false)
    private US_PRIChgRate azScanChangeRate;
/**
US:AzScanRateExtremeMax - Extreme Horizontal Scan Rate Max (Optional) 

The range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater than US:AzScanRateExtremeMin.

Format is UN(7,2) (scans/min)
@since 3.1.0
*/
    @XmlElement(name = "AzScanRateExtremeMax", required = false)
    private US_ScanRate azScanRateExtremeMax;
/**
US:AzScanRateExtremeMin - Extreme Horizontal Scan Rate Min (Optional) 

The range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

Format is UN(7,2) (scans/min)
@since 3.1.0
*/
    @XmlElement(name = "AzScanRateExtremeMin", required = false)
    private US_ScanRate azScanRateExtremeMin;
/**
US:AzScanRateMean - Mean Horizontal Scan Rate (Optional) 

The average horizontal scan rate value for a signal that changes horizontal scan rates on a non-patterned basis.

Format is UN(7,2) (scans/min)
@since 3.1.0
*/
    @XmlElement(name = "AzScanRateMean", required = false)
    private US_ScanRate azScanRateMean;
/**
US:AzScanRateMedian - Most Probable Horizontal Scan Rate (Optional) 

The horizontal scan rate that the signal most often used, based on a statistical study of a data set.

Format is UN(7,2) (scans/min)
@since 3.1.0
*/
    @XmlElement(name = "AzScanRateMedian", required = false)
    private US_ScanRate azScanRateMedian;
/**
US:AzScanSector - Azimuth ScanSector (Optional) 

The total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "AzScanSector", required = false)
    private US_Degrees azScanSector;
/**
US:AzScanSectorMax - Azimuth ScanSectorMax (Optional) 

The total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "AzScanSectorMax", required = false)
    private US_Degrees azScanSectorMax;
/**
US:AzScanVelocity - Azimuth ScanVelocity (Optional) 

The horizontal angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

Format is UN(6,2) (deg/sec)
@since 3.1.0
*/
    @XmlElement(name = "AzScanVelocity", required = false)
    private US_ScanSpeed azScanVelocity;
/**
In Data Item Vertical Scan Change Rate (US), enter the rate of change for vertical Scan Period variations expressed in Scan Period change per unit of time
@since 3.1.0
*/
    @XmlElement(name = "ElevScanChangeRate", required = false)
    private US_PRIChgRate elevScanChangeRate;
/**
In Data Item Extreme Vertical Scan Rate Max (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater than US:ElevScanRateExtremeMin.
@since 3.1.0
*/
    @XmlElement(name = "ElevScanRateExtremeMax", required = false)
    private US_ScanRate elevScanRateExtremeMax;
/**
In Data Item Extreme Vertical Scan Rate Min (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 
@since 3.1.0
*/
    @XmlElement(name = "ElevScanRateExtremeMin", required = false)
    private US_ScanRate elevScanRateExtremeMin;
/**
US:ElevScanRateMean - Mean Vertical Scan Rate (Optional) 

The average vertical scan rate value for a signal that changes vertical scan rates on a non-patterned basis.

Format is UN(7,2) (scans/min)
@since 3.1.0
*/
    @XmlElement(name = "ElevScanRateMean", required = false)
    private US_ScanRate elevScanRateMean;
/**
US:ElevScanRateMedian - Most Probable Vertical Scan Rate (Optional) 

The vertical scan rate that the signal most often used, based on a statistical study of a data set.

Format is UN(7,2) (scans/min)
@since 3.1.0
*/
    @XmlElement(name = "ElevScanRateMedian", required = false)
    private US_ScanRate elevScanRateMedian;
/**
US:ElevScanSector - Vertical Scan Sector (Optional) 

The total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "ElevScanSector", required = false)
    private US_Degrees elevScanSector;
/**
US:ElevScanSectorMax - Vertical Scan Sector Max (Optional) 

The total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

Format is UN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "ElevScanSectorMax", required = false)
    private US_Degrees elevScanSectorMax;
/**
US:ElevScanVelocity - Vertical Scan Velocity (Optional) 

The vertical angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

Format is UN(6,2) (deg/sec)
@since 3.1.0
*/
    @XmlElement(name = "ElevScanVelocity", required = false)
    private US_ScanSpeed elevScanVelocity;
/**
US:NumBeamPositionsPerScan - Num Beam Positions Per Scan (Optional) 

The number of beam positions (aka., dwells) per scan cycle

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumBeamPositionsPerScan", required = false)
    private UN6 numBeamPositionsPerScan;
/**
US:NumBeamPositionsTotal - Total Number of Beam Positions (Optional) 

The total number of unique array beam positions resulting from the frequency steps of a frequency scanning, phase changes, in phase scanning, or discrete time delays in time delay steering.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumBeamPositionsTotal", required = false)
    private UN6 numBeamPositionsTotal;
/**
US:NumBeamsPerRaster - Num Beams Per Raster (Optional) 

The number of beam positions necessary to complete one bar of the raster scan.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumBeamsPerRaster", required = false)
    private UN6 numBeamsPerRaster;
/**
US:NumRastersPerCycle - Num Rasters Per Cycle (Optional) 

The number of 360 degree scans (aka, turns) a component of a scan makes in the time it takes the Primary Scan to complete one complete cycle/scan.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumRastersPerCycle", required = false)
    private UN6 numRastersPerCycle;
/**
US:NumScanPositions - Number of Scan Positions (Optional) 

The number of discrete values observed in a single repeating scan period sequence.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumScanPositions", required = false)
    private UN6 numScanPositions;
/**
US:NumScanValues - Number of Scan Values (Optional) 

The number of discrete values observed in multiple repeating scan period sequences.

Format is UN(6)
@since 3.1.0
*/
    @XmlElement(name = "NumScanValues", required = false)
    private UN6 numScanValues;
/**
US:ScanAdaptiveDriverDesc - Scan Adaptive Driver Description (Optional) 

The condition which controls or can be associated with the signal Scan Period variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "ScanAdaptiveDriverDesc", required = false)
    private S500 scanAdaptiveDriverDesc;
/**
US:ScanAdaptiveRuleDesc - Scan Adaptive Rule Description (Optional) 

The rule which describes the signal Scan Period variations.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "ScanAdaptiveRuleDesc", required = false)
    private S500 scanAdaptiveRuleDesc;
/**
US:ScanAngleAzStart - Scan Angle Azimuth Start (Optional) 

The maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "ScanAngleAzStart", required = false)
    private US_Deg_Signed scanAngleAzStart;
/**
US:ScanAngleAzStop - Scan Angle Azimuth Stop (Optional) 

The minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "ScanAngleAzStop", required = false)
    private US_Deg_Signed scanAngleAzStop;
/**
US:ScanAngleElevStart - Scan Angle Elevation Start (Optional) 

The maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., elevation).

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "ScanAngleElevStart", required = false)
    private US_Deg_Signed scanAngleElevStart;
/**
US:ScanAngleElevStop - Scan Angle Elevation Stop (Optional) 

The minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., azimuth).

Format is SN(5,2) (deg)
@since 3.1.0
*/
    @XmlElement(name = "ScanAngleElevStop", required = false)
    private US_Deg_Signed scanAngleElevStop;
/**
US:ScanDwell - Scan Dwell (Optional) 

The scan duration

Format is UN(12,6) (μsec)
@since 3.1.0
*/
    @XmlElement(name = "ScanDwell", required = false)
    private microsecs scanDwell;
/**
US:ScanDwellSequence - Scan Dwell Sequence  (Optional) 

The Sequence of dwell durations, with elevation and azimuth. Example: 20 deg hor, 15 deg elev, 5 second dwell, etc.

Format is S500
@since 3.1.0
*/
    @XmlElement(name = "ScanDwellSequence", required = false)
    private S500 scanDwellSequence;
/**
US:ScanDwellTime - Scan Dwell Time (Optional) 

The time duration for a complete dwell/group of scan cycles which all have the same Scan Period Discrete value before changing to a different one.

Format is UN(12,6) (μsec/sec)
@since 3.1.0
*/
    @XmlElement(name = "ScanDwellTime", required = false)
    private US_PRIChgRate scanDwellTime;
/**
In Data Item ScanElevContinuous (US), indicate the if the scan elevation progression is a continuous sweep.
@since 3.1.0
*/
    @XmlElement(name = "ScanElevContinuous", required = false)
    private TString scanElevContinuous;
/**
In Data Item ScanPatternType (US), indicate whether the Scan Period is unmodulated, Patterned, Non-Patterned, or Adaptive.
@since 3.1.0
*/
    @XmlElement(name = "ScanPatternType", required = false)
    private TString scanPatternType;
/**
In Data Item ScanType (US), indicate if the observed data was detected via a primary or secondary scan.
@since 3.1.0
*/
    @XmlElement(name = "ScanType", required = false)
    private TString scanType;
/**
US:ObservedScanValues (Optional)

ObservedScanValues (US) contains data describing the discrete scan rate values and supporting statistical information.
@since 3.1.0
*/
    @XmlElement(name = "ObservedScanValues")
      private  Set<ObservedScanValues> observedScanValues;

/**
Get In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth progression is a continuous sweep.

@return the ScansHorzContinuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getScansHorzContinuous() {
        return scansHorzContinuous;
    }

/**
Set In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth progression is a continuous sweep.

@param value the ScansHorzContinuous value in a {@link TString} data type
@since 3.1.0
*/
public void setScansHorzContinuous(TString value) {
        this.scansHorzContinuous = value;
    }

/**
Determine if the ScansHorzContinuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScansHorzContinuous() {
return (this.scansHorzContinuous!= null ? this.scansHorzContinuous.isSetValue() : false);
    }

/**
Get the position of the emitter Mainbeam (aka, Mainlobe) boresight referenced from true north for ground based fixed emitters, and the emitter defined centerline for other platforms (e.g., mobile, airborne, shipborne).

@return the AzBoresightAngle value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getAzBoresightAngle() {
        return azBoresightAngle;
    }

/**
Set the position of the emitter Mainbeam (aka, Mainlobe) boresight referenced from true north for ground based fixed emitters, and the emitter defined centerline for other platforms (e.g., mobile, airborne, shipborne).

@param value the AzBoresightAngle value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setAzBoresightAngle(US_Deg_Signed value) {
        this.azBoresightAngle = value;
    }

/**
Determine if the AzBoresightAngle is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzBoresightAngle() {
        return (this.azBoresightAngle!= null);
    }

/**
Get the rate of change for horizontal Scan Period variations expressed in Scan Period change per unit of time

@return the AzScanChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public US_PRIChgRate getAzScanChangeRate() {
        return azScanChangeRate;
    }

/**
Set the rate of change for horizontal Scan Period variations expressed in Scan Period change per unit of time

@param value the AzScanChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public void setAzScanChangeRate(US_PRIChgRate value) {
        this.azScanChangeRate = value;
    }

/**
Determine if the AzScanChangeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanChangeRate() {
        return (this.azScanChangeRate!= null);
    }

/**
Get the range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater than US:AzScanRateExtremeMin.

@return the AzScanRateExtremeMax value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getAzScanRateExtremeMax() {
        return azScanRateExtremeMax;
    }

/**
Set the range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater than US:AzScanRateExtremeMin.

@param value the AzScanRateExtremeMax value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setAzScanRateExtremeMax(US_ScanRate value) {
        this.azScanRateExtremeMax = value;
    }

/**
Determine if the AzScanRateExtremeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanRateExtremeMax() {
        return (this.azScanRateExtremeMax!= null);
    }

/**
Get the range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

@return the AzScanRateExtremeMin value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getAzScanRateExtremeMin() {
        return azScanRateExtremeMin;
    }

/**
Set the range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

@param value the AzScanRateExtremeMin value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setAzScanRateExtremeMin(US_ScanRate value) {
        this.azScanRateExtremeMin = value;
    }

/**
Determine if the AzScanRateExtremeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanRateExtremeMin() {
        return (this.azScanRateExtremeMin!= null);
    }

/**
Get the average horizontal scan rate value for a signal that changes horizontal scan rates on a non-patterned basis.

@return the AzScanRateMean value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getAzScanRateMean() {
        return azScanRateMean;
    }

/**
Set the average horizontal scan rate value for a signal that changes horizontal scan rates on a non-patterned basis.

@param value the AzScanRateMean value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setAzScanRateMean(US_ScanRate value) {
        this.azScanRateMean = value;
    }

/**
Determine if the AzScanRateMean is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanRateMean() {
        return (this.azScanRateMean!= null);
    }

/**
Get the horizontal scan rate that the signal most often used, based on a statistical study of a data set.

@return the AzScanRateMedian value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getAzScanRateMedian() {
        return azScanRateMedian;
    }

/**
Set the horizontal scan rate that the signal most often used, based on a statistical study of a data set.

@param value the AzScanRateMedian value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setAzScanRateMedian(US_ScanRate value) {
        this.azScanRateMedian = value;
    }

/**
Determine if the AzScanRateMedian is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanRateMedian() {
        return (this.azScanRateMedian!= null);
    }

/**
Get the total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

@return the AzScanSector value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getAzScanSector() {
        return azScanSector;
    }

/**
Set the total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

@param value the AzScanSector value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setAzScanSector(US_Degrees value) {
        this.azScanSector = value;
    }

/**
Determine if the AzScanSector is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanSector() {
        return (this.azScanSector!= null);
    }

/**
Get the total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

@return the AzScanSectorMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getAzScanSectorMax() {
        return azScanSectorMax;
    }

/**
Set the total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

@param value the AzScanSectorMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setAzScanSectorMax(US_Degrees value) {
        this.azScanSectorMax = value;
    }

/**
Determine if the AzScanSectorMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanSectorMax() {
        return (this.azScanSectorMax!= null);
    }

/**
Get the horizontal angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

@return the AzScanVelocity value in a {@link TUS_ScanSpeed} data type
@since 3.1.0
*/
public US_ScanSpeed getAzScanVelocity() {
        return azScanVelocity;
    }

/**
Set the horizontal angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

@param value the AzScanVelocity value in a {@link TUS_ScanSpeed} data type
@since 3.1.0
*/
public void setAzScanVelocity(US_ScanSpeed value) {
        this.azScanVelocity = value;
    }

/**
Determine if the AzScanVelocity is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetAzScanVelocity() {
        return (this.azScanVelocity!= null);
    }

/**
Get In Data Item Vertical Scan Change Rate (US), enter the rate of change for vertical Scan Period variations expressed in Scan Period change per unit of time

@return the ElevScanChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public US_PRIChgRate getElevScanChangeRate() {
        return elevScanChangeRate;
    }

/**
Set In Data Item Vertical Scan Change Rate (US), enter the rate of change for vertical Scan Period variations expressed in Scan Period change per unit of time

@param value the ElevScanChangeRate value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public void setElevScanChangeRate(US_PRIChgRate value) {
        this.elevScanChangeRate = value;
    }

/**
Determine if the ElevScanChangeRate is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanChangeRate() {
        return (this.elevScanChangeRate!= null);
    }

/**
Get In Data Item Extreme Vertical Scan Rate Max (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater than US:ElevScanRateExtremeMin.

@return the ElevScanRateExtremeMax value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getElevScanRateExtremeMax() {
        return elevScanRateExtremeMax;
    }

/**
Set In Data Item Extreme Vertical Scan Rate Max (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater than US:ElevScanRateExtremeMin.

@param value the ElevScanRateExtremeMax value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setElevScanRateExtremeMax(US_ScanRate value) {
        this.elevScanRateExtremeMax = value;
    }

/**
Determine if the ElevScanRateExtremeMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanRateExtremeMax() {
        return (this.elevScanRateExtremeMax!= null);
    }

/**
Get In Data Item Extreme Vertical Scan Rate Min (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

@return the ElevScanRateExtremeMin value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getElevScanRateExtremeMin() {
        return elevScanRateExtremeMin;
    }

/**
Set In Data Item Extreme Vertical Scan Rate Min (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

@param value the ElevScanRateExtremeMin value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setElevScanRateExtremeMin(US_ScanRate value) {
        this.elevScanRateExtremeMin = value;
    }

/**
Determine if the ElevScanRateExtremeMin is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanRateExtremeMin() {
        return (this.elevScanRateExtremeMin!= null);
    }

/**
Get the average vertical scan rate value for a signal that changes vertical scan rates on a non-patterned basis.

@return the ElevScanRateMean value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getElevScanRateMean() {
        return elevScanRateMean;
    }

/**
Set the average vertical scan rate value for a signal that changes vertical scan rates on a non-patterned basis.

@param value the ElevScanRateMean value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setElevScanRateMean(US_ScanRate value) {
        this.elevScanRateMean = value;
    }

/**
Determine if the ElevScanRateMean is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanRateMean() {
        return (this.elevScanRateMean!= null);
    }

/**
Get the vertical scan rate that the signal most often used, based on a statistical study of a data set.

@return the ElevScanRateMedian value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public US_ScanRate getElevScanRateMedian() {
        return elevScanRateMedian;
    }

/**
Set the vertical scan rate that the signal most often used, based on a statistical study of a data set.

@param value the ElevScanRateMedian value in a {@link TUS_ScanRate} data type
@since 3.1.0
*/
public void setElevScanRateMedian(US_ScanRate value) {
        this.elevScanRateMedian = value;
    }

/**
Determine if the ElevScanRateMedian is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanRateMedian() {
        return (this.elevScanRateMedian!= null);
    }

/**
Get the total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

@return the ElevScanSector value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getElevScanSector() {
        return elevScanSector;
    }

/**
Set the total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

@param value the ElevScanSector value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setElevScanSector(US_Degrees value) {
        this.elevScanSector = value;
    }

/**
Determine if the ElevScanSector is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanSector() {
        return (this.elevScanSector!= null);
    }

/**
Get the total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

@return the ElevScanSectorMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public US_Degrees getElevScanSectorMax() {
        return elevScanSectorMax;
    }

/**
Set the total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

@param value the ElevScanSectorMax value in a {@link TUS_Degrees} data type
@since 3.1.0
*/
public void setElevScanSectorMax(US_Degrees value) {
        this.elevScanSectorMax = value;
    }

/**
Determine if the ElevScanSectorMax is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanSectorMax() {
        return (this.elevScanSectorMax!= null);
    }

/**
Get the vertical angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

@return the ElevScanVelocity value in a {@link TUS_ScanSpeed} data type
@since 3.1.0
*/
public US_ScanSpeed getElevScanVelocity() {
        return elevScanVelocity;
    }

/**
Set the vertical angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

@param value the ElevScanVelocity value in a {@link TUS_ScanSpeed} data type
@since 3.1.0
*/
public void setElevScanVelocity(US_ScanSpeed value) {
        this.elevScanVelocity = value;
    }

/**
Determine if the ElevScanVelocity is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetElevScanVelocity() {
        return (this.elevScanVelocity!= null);
    }

/**
Get the number of beam positions (aka., dwells) per scan cycle

@return the NumBeamPositionsPerScan value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumBeamPositionsPerScan() {
        return numBeamPositionsPerScan;
    }

/**
Set the number of beam positions (aka., dwells) per scan cycle

@param value the NumBeamPositionsPerScan value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumBeamPositionsPerScan(UN6 value) {
        this.numBeamPositionsPerScan = value;
    }

/**
Determine if the NumBeamPositionsPerScan is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumBeamPositionsPerScan() {
        return (this.numBeamPositionsPerScan!= null);
    }

/**
Get the total number of unique array beam positions resulting from the frequency steps of a frequency scanning, phase changes, in phase scanning, or discrete time delays in time delay steering.

@return the NumBeamPositionsTotal value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumBeamPositionsTotal() {
        return numBeamPositionsTotal;
    }

/**
Set the total number of unique array beam positions resulting from the frequency steps of a frequency scanning, phase changes, in phase scanning, or discrete time delays in time delay steering.

@param value the NumBeamPositionsTotal value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumBeamPositionsTotal(UN6 value) {
        this.numBeamPositionsTotal = value;
    }

/**
Determine if the NumBeamPositionsTotal is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumBeamPositionsTotal() {
        return (this.numBeamPositionsTotal!= null);
    }

/**
Get the number of beam positions necessary to complete one bar of the raster scan.

@return the NumBeamsPerRaster value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumBeamsPerRaster() {
        return numBeamsPerRaster;
    }

/**
Set the number of beam positions necessary to complete one bar of the raster scan.

@param value the NumBeamsPerRaster value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumBeamsPerRaster(UN6 value) {
        this.numBeamsPerRaster = value;
    }

/**
Determine if the NumBeamsPerRaster is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumBeamsPerRaster() {
        return (this.numBeamsPerRaster!= null);
    }

/**
Get the number of 360 degree scans (aka, turns) a component of a scan makes in the time it takes the Primary Scan to complete one complete cycle/scan.

@return the NumRastersPerCycle value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumRastersPerCycle() {
        return numRastersPerCycle;
    }

/**
Set the number of 360 degree scans (aka, turns) a component of a scan makes in the time it takes the Primary Scan to complete one complete cycle/scan.

@param value the NumRastersPerCycle value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumRastersPerCycle(UN6 value) {
        this.numRastersPerCycle = value;
    }

/**
Determine if the NumRastersPerCycle is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumRastersPerCycle() {
        return (this.numRastersPerCycle!= null);
    }

/**
Get the number of discrete values observed in a single repeating scan period sequence.

@return the NumScanPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumScanPositions() {
        return numScanPositions;
    }

/**
Set the number of discrete values observed in a single repeating scan period sequence.

@param value the NumScanPositions value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumScanPositions(UN6 value) {
        this.numScanPositions = value;
    }

/**
Determine if the NumScanPositions is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumScanPositions() {
        return (this.numScanPositions!= null);
    }

/**
Get the number of discrete values observed in multiple repeating scan period sequences.

@return the NumScanValues value in a {@link TUN6} data type
@since 3.1.0
*/
public UN6 getNumScanValues() {
        return numScanValues;
    }

/**
Set the number of discrete values observed in multiple repeating scan period sequences.

@param value the NumScanValues value in a {@link TUN6} data type
@since 3.1.0
*/
public void setNumScanValues(UN6 value) {
        this.numScanValues = value;
    }

/**
Determine if the NumScanValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetNumScanValues() {
        return (this.numScanValues!= null);
    }

/**
Get the condition which controls or can be associated with the signal Scan Period variations.

@return the ScanAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getScanAdaptiveDriverDesc() {
        return scanAdaptiveDriverDesc;
    }

/**
Set the condition which controls or can be associated with the signal Scan Period variations.

@param value the ScanAdaptiveDriverDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setScanAdaptiveDriverDesc(S500 value) {
        this.scanAdaptiveDriverDesc = value;
    }

/**
Determine if the ScanAdaptiveDriverDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanAdaptiveDriverDesc() {
        return (this.scanAdaptiveDriverDesc!= null);
    }

/**
Get the rule which describes the signal Scan Period variations.

@return the ScanAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getScanAdaptiveRuleDesc() {
        return scanAdaptiveRuleDesc;
    }

/**
Set the rule which describes the signal Scan Period variations.

@param value the ScanAdaptiveRuleDesc value in a {@link TS500} data type
@since 3.1.0
*/
public void setScanAdaptiveRuleDesc(S500 value) {
        this.scanAdaptiveRuleDesc = value;
    }

/**
Determine if the ScanAdaptiveRuleDesc is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanAdaptiveRuleDesc() {
        return (this.scanAdaptiveRuleDesc!= null);
    }

/**
Get the maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

@return the ScanAngleAzStart value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getScanAngleAzStart() {
        return scanAngleAzStart;
    }

/**
Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

@param value the ScanAngleAzStart value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setScanAngleAzStart(US_Deg_Signed value) {
        this.scanAngleAzStart = value;
    }

/**
Determine if the ScanAngleAzStart is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanAngleAzStart() {
        return (this.scanAngleAzStart!= null);
    }

/**
Get the minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

@return the ScanAngleAzStop value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getScanAngleAzStop() {
        return scanAngleAzStop;
    }

/**
Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

@param value the ScanAngleAzStop value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setScanAngleAzStop(US_Deg_Signed value) {
        this.scanAngleAzStop = value;
    }

/**
Determine if the ScanAngleAzStop is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanAngleAzStop() {
        return (this.scanAngleAzStop!= null);
    }

/**
Get the maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., elevation).

@return the ScanAngleElevStart value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getScanAngleElevStart() {
        return scanAngleElevStart;
    }

/**
Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., elevation).

@param value the ScanAngleElevStart value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setScanAngleElevStart(US_Deg_Signed value) {
        this.scanAngleElevStart = value;
    }

/**
Determine if the ScanAngleElevStart is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanAngleElevStart() {
        return (this.scanAngleElevStart!= null);
    }

/**
Get the minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., azimuth).

@return the ScanAngleElevStop value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public US_Deg_Signed getScanAngleElevStop() {
        return scanAngleElevStop;
    }

/**
Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., azimuth).

@param value the ScanAngleElevStop value in a {@link TUS_Deg_Signed} data type
@since 3.1.0
*/
public void setScanAngleElevStop(US_Deg_Signed value) {
        this.scanAngleElevStop = value;
    }

/**
Determine if the ScanAngleElevStop is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanAngleElevStop() {
        return (this.scanAngleElevStop!= null);
    }

/**
Get the scan duration

@return the ScanDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public microsecs getScanDwell() {
        return scanDwell;
    }

/**
Set the scan duration

@param value the ScanDwell value in a {@link Tmicrosecs} data type
@since 3.1.0
*/
public void setScanDwell(microsecs value) {
        this.scanDwell = value;
    }

/**
Determine if the ScanDwell is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanDwell() {
        return (this.scanDwell!= null);
    }

/**
Get the Sequence of dwell durations, with elevation and azimuth. Example: 20 deg hor, 15 deg elev, 5 second dwell, etc.

@return the ScanDwellSequence value in a {@link TS500} data type
@since 3.1.0
*/
public S500 getScanDwellSequence() {
        return scanDwellSequence;
    }

/**
Set the Sequence of dwell durations, with elevation and azimuth. Example: 20 deg hor, 15 deg elev, 5 second dwell, etc.

@param value the ScanDwellSequence value in a {@link TS500} data type
@since 3.1.0
*/
public void setScanDwellSequence(S500 value) {
        this.scanDwellSequence = value;
    }

/**
Determine if the ScanDwellSequence is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanDwellSequence() {
        return (this.scanDwellSequence!= null);
    }

/**
Get the time duration for a complete dwell/group of scan cycles which all have the same Scan Period Discrete value before changing to a different one.

@return the ScanDwellTime value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public US_PRIChgRate getScanDwellTime() {
        return scanDwellTime;
    }

/**
Set the time duration for a complete dwell/group of scan cycles which all have the same Scan Period Discrete value before changing to a different one.

@param value the ScanDwellTime value in a {@link TUS_PRIChgRate} data type
@since 3.1.0
*/
public void setScanDwellTime(US_PRIChgRate value) {
        this.scanDwellTime = value;
    }

/**
Determine if the ScanDwellTime is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanDwellTime() {
        return (this.scanDwellTime!= null);
    }

/**
Get In Data Item ScanElevContinuous (US), indicate the if the scan elevation progression is a continuous sweep.

@return the ScanElevContinuous value in a {@link TString} data type
@since 3.1.0
*/
public TString getScanElevContinuous() {
        return scanElevContinuous;
    }

/**
Set In Data Item ScanElevContinuous (US), indicate the if the scan elevation progression is a continuous sweep.

@param value the ScanElevContinuous value in a {@link TString} data type
@since 3.1.0
*/
public void setScanElevContinuous(TString value) {
        this.scanElevContinuous = value;
    }

/**
Determine if the ScanElevContinuous is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanElevContinuous() {
return (this.scanElevContinuous!= null ? this.scanElevContinuous.isSetValue() : false);
    }

/**
Get In Data Item ScanPatternType (US), indicate whether the Scan Period is unmodulated, Patterned, Non-Patterned, or Adaptive.

@return the ScanPatternType value in a {@link TString} data type
@since 3.1.0
*/
public TString getScanPatternType() {
        return scanPatternType;
    }

/**
Set In Data Item ScanPatternType (US), indicate whether the Scan Period is unmodulated, Patterned, Non-Patterned, or Adaptive.

@param value the ScanPatternType value in a {@link TString} data type
@since 3.1.0
*/
public void setScanPatternType(TString value) {
        this.scanPatternType = value;
    }

/**
Determine if the ScanPatternType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanPatternType() {
return (this.scanPatternType!= null ? this.scanPatternType.isSetValue() : false);
    }

/**
Get In Data Item ScanType (US), indicate if the observed data was detected via a primary or secondary scan.

@return the ScanType value in a {@link TString} data type
@since 3.1.0
*/
public TString getScanType() {
        return scanType;
    }

/**
Set In Data Item ScanType (US), indicate if the observed data was detected via a primary or secondary scan.

@param value the ScanType value in a {@link TString} data type
@since 3.1.0
*/
public void setScanType(TString value) {
        this.scanType = value;
    }

/**
Determine if the ScanType is configured.

If configured this method also inspects the {@link TString} wrapped value.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetScanType() {
return (this.scanType!= null ? this.scanType.isSetValue() : false);
    }

/**
Get the US:ObservedScanValues

Complex element ObservedScanValues (US) contains data describing the discrete scan rate values and supporting statistical information.

@return  a {@link ObservedScanValues} instance
@since 3.1.0
*/
    public Set<ObservedScanValues> getObservedScanValues() {
        if (observedScanValues == null) {
            observedScanValues = new HashSet<ObservedScanValues>();
        }
        return this.observedScanValues;
    }

/**
Determine if the ObservedScanValues is configured.

@return TRUE if the field is set, FALSE if the field is null
*/
    public boolean isSetObservedScanValues() {
        return ((this.observedScanValues!= null)&&(!this.observedScanValues.isEmpty()));
    }

/**
  Clear the ObservedScanValues field. This sets the field to null.
 */
    public void unsetObservedScanValues() {
        this.observedScanValues = null;
    }

/**
Set In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth progression is a continuous sweep.

@param value  An instances of type {@link ListCBO}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScansHorzContinuous(ListCBO value) {
           setScansHorzContinuous(new TString(value.value()));
        return this;
    }

/**
Set the position of the emitter Mainbeam (aka, Mainlobe) boresight referenced from true north for ground based fixed emitters, and the emitter defined centerline for other platforms (e.g., mobile, airborne, shipborne).

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzBoresightAngle(Double value) {
           setAzBoresightAngle(new US_Deg_Signed(value));
        return this;
    }

/**
Set the rate of change for horizontal Scan Period variations expressed in Scan Period change per unit of time

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanChangeRate(Double value) {
           setAzScanChangeRate(new US_PRIChgRate(value));
        return this;
    }

/**
Set the range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater than US:AzScanRateExtremeMin.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanRateExtremeMax(Double value) {
           setAzScanRateExtremeMax(new US_ScanRate(value));
        return this;
    }

/**
Set the range of horizontal scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanRateExtremeMin(Double value) {
           setAzScanRateExtremeMin(new US_ScanRate(value));
        return this;
    }

/**
Set the average horizontal scan rate value for a signal that changes horizontal scan rates on a non-patterned basis.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanRateMean(Double value) {
           setAzScanRateMean(new US_ScanRate(value));
        return this;
    }

/**
Set the horizontal scan rate that the signal most often used, based on a statistical study of a data set.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanRateMedian(Double value) {
           setAzScanRateMedian(new US_ScanRate(value));
        return this;
    }

/**
Set the total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanSector(Double value) {
           setAzScanSector(new US_Degrees(value));
        return this;
    }

/**
Set the total angular width in the horizontal plane (aka, azimuth) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanSectorMax(Double value) {
           setAzScanSectorMax(new US_Degrees(value));
        return this;
    }

/**
Set the horizontal angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withAzScanVelocity(Double value) {
           setAzScanVelocity(new US_ScanSpeed(value));
        return this;
    }

/**
Set In Data Item Vertical Scan Change Rate (US), enter the rate of change for vertical Scan Period variations expressed in Scan Period change per unit of time

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanChangeRate(Double value) {
           setElevScanChangeRate(new US_PRIChgRate(value));
        return this;
    }

/**
Set In Data Item Extreme Vertical Scan Rate Max (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

[XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater than US:ElevScanRateExtremeMin.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanRateExtremeMax(Double value) {
           setElevScanRateExtremeMax(new US_ScanRate(value));
        return this;
    }

/**
Set In Data Item Extreme Vertical Scan Rate Min (US), enter the range of vertical scan rate values that represent 100% of the signal observed Scan values obtained from a statistical study of a data set. 

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanRateExtremeMin(Double value) {
           setElevScanRateExtremeMin(new US_ScanRate(value));
        return this;
    }

/**
Set the average vertical scan rate value for a signal that changes vertical scan rates on a non-patterned basis.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanRateMean(Double value) {
           setElevScanRateMean(new US_ScanRate(value));
        return this;
    }

/**
Set the vertical scan rate that the signal most often used, based on a statistical study of a data set.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanRateMedian(Double value) {
           setElevScanRateMedian(new US_ScanRate(value));
        return this;
    }

/**
Set the total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan. 

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanSector(Double value) {
           setElevScanSector(new US_Degrees(value));
        return this;
    }

/**
Set the total angular width in the vertical plane (aka, elevation) the subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanSectorMax(Double value) {
           setElevScanSectorMax(new US_Degrees(value));
        return this;
    }

/**
Set the vertical angular speed (i.e., degrees per second) of the subject emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withElevScanVelocity(Double value) {
           setElevScanVelocity(new US_ScanSpeed(value));
        return this;
    }

/**
Set the number of beam positions (aka., dwells) per scan cycle

@param value  An instances of type {@link Integer}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withNumBeamPositionsPerScan(Integer value) {
           setNumBeamPositionsPerScan(new UN6(value));
        return this;
    }

/**
Set the total number of unique array beam positions resulting from the frequency steps of a frequency scanning, phase changes, in phase scanning, or discrete time delays in time delay steering.

@param value  An instances of type {@link Integer}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withNumBeamPositionsTotal(Integer value) {
           setNumBeamPositionsTotal(new UN6(value));
        return this;
    }

/**
Set the number of beam positions necessary to complete one bar of the raster scan.

@param value  An instances of type {@link Integer}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withNumBeamsPerRaster(Integer value) {
           setNumBeamsPerRaster(new UN6(value));
        return this;
    }

/**
Set the number of 360 degree scans (aka, turns) a component of a scan makes in the time it takes the Primary Scan to complete one complete cycle/scan.

@param value  An instances of type {@link Integer}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withNumRastersPerCycle(Integer value) {
           setNumRastersPerCycle(new UN6(value));
        return this;
    }

/**
Set the number of discrete values observed in a single repeating scan period sequence.

@param value  An instances of type {@link Integer}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withNumScanPositions(Integer value) {
           setNumScanPositions(new UN6(value));
        return this;
    }

/**
Set the number of discrete values observed in multiple repeating scan period sequences.

@param value  An instances of type {@link Integer}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withNumScanValues(Integer value) {
           setNumScanValues(new UN6(value));
        return this;
    }

/**
Set the condition which controls or can be associated with the signal Scan Period variations.

@param value  An instances of type {@link String}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanAdaptiveDriverDesc(String value) {
           setScanAdaptiveDriverDesc(new S500(value));
        return this;
    }

/**
Set the rule which describes the signal Scan Period variations.

@param value  An instances of type {@link String}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanAdaptiveRuleDesc(String value) {
           setScanAdaptiveRuleDesc(new S500(value));
        return this;
    }

/**
Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanAngleAzStart(Double value) {
           setScanAngleAzStart(new US_Deg_Signed(value));
        return this;
    }

/**
Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the horizontal plane (aka., azimuth).

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanAngleAzStop(Double value) {
           setScanAngleAzStop(new US_Deg_Signed(value));
        return this;
    }

/**
Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., elevation).

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanAngleElevStart(Double value) {
           setScanAngleElevStart(new US_Deg_Signed(value));
        return this;
    }

/**
Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe) reaches in the vertical plane (aka., azimuth).

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanAngleElevStop(Double value) {
           setScanAngleElevStop(new US_Deg_Signed(value));
        return this;
    }

/**
Set the scan duration

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanDwell(Double value) {
           setScanDwell(new microsecs(value));
        return this;
    }

/**
Set the Sequence of dwell durations, with elevation and azimuth. Example: 20 deg hor, 15 deg elev, 5 second dwell, etc.

@param value  An instances of type {@link String}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanDwellSequence(String value) {
           setScanDwellSequence(new S500(value));
        return this;
    }

/**
Set the time duration for a complete dwell/group of scan cycles which all have the same Scan Period Discrete value before changing to a different one.

@param value  An instances of type {@link Double}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanDwellTime(Double value) {
           setScanDwellTime(new US_PRIChgRate(value));
        return this;
    }

/**
Set In Data Item ScanElevContinuous (US), indicate the if the scan elevation progression is a continuous sweep.

@param value  An instances of type {@link ListCBO}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanElevContinuous(ListCBO value) {
           setScanElevContinuous(new TString(value.value()));
        return this;
    }

/**
Set In Data Item ScanPatternType (US), indicate whether the Scan Period is unmodulated, Patterned, Non-Patterned, or Adaptive.

@param value  An instances of type {@link ListUS7}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanPatternType(ListUS7 value) {
           setScanPatternType(new TString(value.value()));
        return this;
    }

/**
Set In Data Item ScanType (US), indicate if the observed data was detected via a primary or secondary scan.

@param value  An instances of type {@link ListUS8}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withScanType(ListUS8 value) {
           setScanType(new TString(value.value()));
        return this;
    }

/**
Set the US:ObservedScanValues

Complex element ObservedScanValues (US) contains data describing the discrete scan rate values and supporting statistical information.

@param values  One or more instances of type {@link ObservedScanValues...}
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withObservedScanValues(ObservedScanValues... values) {
        if (values!= null) {
            for (ObservedScanValues value: values) {
                getObservedScanValues().add(value);
            }
        }
        return this;
    }

/**
Set the US:ObservedScanValues

Complex element ObservedScanValues (US) contains data describing the discrete scan rate values and supporting statistical information.

@param values  A collection of {@link ObservedScanValues} instances
@return The current ObservedScanAnalysis object instance
@since 3.1.0
*/
    public ObservedScanAnalysis withObservedScanValues(Collection<ObservedScanValues> values) {
        if (values!= null) {
            getObservedScanValues().addAll(values);
        }
        return this;
    }

/**
 Get a string representation of this ObservedScanAnalysis instance configuration.

@return The current object instance configuration as a non-null String
*/
@Override
 public String toString() {
 return "ObservedScanAnalysis {"
 + (azBoresightAngle !=null? " azBoresightAngle [" + azBoresightAngle +"]" : "") 
 + (azScanChangeRate !=null? " azScanChangeRate [" + azScanChangeRate +"]" : "") 
 + (azScanRateExtremeMax !=null? " azScanRateExtremeMax [" + azScanRateExtremeMax +"]" : "") 
 + (azScanRateExtremeMin !=null? " azScanRateExtremeMin [" + azScanRateExtremeMin +"]" : "") 
 + (azScanRateMean !=null? " azScanRateMean [" + azScanRateMean +"]" : "") 
 + (azScanRateMedian !=null? " azScanRateMedian [" + azScanRateMedian +"]" : "") 
 + (azScanSector !=null? " azScanSector [" + azScanSector +"]" : "") 
 + (azScanSectorMax !=null? " azScanSectorMax [" + azScanSectorMax +"]" : "") 
 + (azScanVelocity !=null? " azScanVelocity [" + azScanVelocity +"]" : "") 
 + (elevScanChangeRate !=null? " elevScanChangeRate [" + elevScanChangeRate +"]" : "") 
 + (elevScanRateExtremeMax !=null? " elevScanRateExtremeMax [" + elevScanRateExtremeMax +"]" : "") 
 + (elevScanRateExtremeMin !=null? " elevScanRateExtremeMin [" + elevScanRateExtremeMin +"]" : "") 
 + (elevScanRateMean !=null? " elevScanRateMean [" + elevScanRateMean +"]" : "") 
 + (elevScanRateMedian !=null? " elevScanRateMedian [" + elevScanRateMedian +"]" : "") 
 + (elevScanSector !=null? " elevScanSector [" + elevScanSector +"]" : "") 
 + (elevScanSectorMax !=null? " elevScanSectorMax [" + elevScanSectorMax +"]" : "") 
 + (elevScanVelocity !=null? " elevScanVelocity [" + elevScanVelocity +"]" : "") 
 + (numBeamPositionsPerScan !=null? " numBeamPositionsPerScan [" + numBeamPositionsPerScan +"]" : "") 
 + (numBeamPositionsTotal !=null? " numBeamPositionsTotal [" + numBeamPositionsTotal +"]" : "") 
 + (numBeamsPerRaster !=null? " numBeamsPerRaster [" + numBeamsPerRaster +"]" : "") 
 + (numRastersPerCycle !=null? " numRastersPerCycle [" + numRastersPerCycle +"]" : "") 
 + (numScanPositions !=null? " numScanPositions [" + numScanPositions +"]" : "") 
 + (numScanValues !=null? " numScanValues [" + numScanValues +"]" : "") 
 + (observedScanValues !=null? " observedScanValues [" + observedScanValues +"]" : "") 
 + (scanAdaptiveDriverDesc !=null? " scanAdaptiveDriverDesc [" + scanAdaptiveDriverDesc +"]" : "") 
 + (scanAdaptiveRuleDesc !=null? " scanAdaptiveRuleDesc [" + scanAdaptiveRuleDesc +"]" : "") 
 + (scanAngleAzStart !=null? " scanAngleAzStart [" + scanAngleAzStart +"]" : "") 
 + (scanAngleAzStop !=null? " scanAngleAzStop [" + scanAngleAzStop +"]" : "") 
 + (scanAngleElevStart !=null? " scanAngleElevStart [" + scanAngleElevStart +"]" : "") 
 + (scanAngleElevStop !=null? " scanAngleElevStop [" + scanAngleElevStop +"]" : "") 
 + (scanDwell !=null? " scanDwell [" + scanDwell +"]" : "") 
 + (scanDwellSequence !=null? " scanDwellSequence [" + scanDwellSequence +"]" : "") 
 + (scanDwellTime !=null? " scanDwellTime [" + scanDwellTime +"]" : "") 
 + (scanElevContinuous !=null? " scanElevContinuous [" + scanElevContinuous +"]" : "") 
 + (scanPatternType !=null? " scanPatternType [" + scanPatternType +"]" : "") 
 + (scanType !=null? " scanType [" + scanType +"]" : "") 
 + (scansHorzContinuous !=null? " scansHorzContinuous [" + scansHorzContinuous +"]" : "") +
"}";
  }

/**
Determine if the required fields in this SSRF data type instance are set.

{@link ObservedScanAnalysis} has no configuration requirements.
@return TRUE
*/
public boolean isSet(){
return true;
}

}
