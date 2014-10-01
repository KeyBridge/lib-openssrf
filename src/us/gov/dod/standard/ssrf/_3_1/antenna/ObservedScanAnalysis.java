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
package us.gov.dod.standard.ssrf._3_1.antenna;

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
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS7;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS8;

/**
 * ObservedScanAnalysis (US) contains data describing the collected Horizontal
 * and Vertical Scan parameters as well as the Adaptive Driver information.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Sub-Element is {@link ObservedScanValues}
 * <p>
 * Example:
 * <pre>
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
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth
   * progression is a continuous sweep.
   */
  @XmlElement(name = "ScansHorzContinuous", required = false)
  private TString scansHorzContinuous;
  /**
   * US:AzBoresightAngle - Azimuth Boresight Angle (Optional)
   * <p>
   * The position of the emitter Mainbeam (aka, Mainlobe) boresight referenced
   * from true north for ground based fixed emitters, and the emitter defined
   * centerline for other platforms (e.g., mobile, airborne, shipborne).
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "AzBoresightAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal azBoresightAngle;
  /**
   * US:AzScanChangeRate - Azimuth Scan Change Rate (Optional)
   * <p>
   * The rate of change for horizontal Scan Period variations expressed in Scan
   * Period change per unit of time
   * <p>
   * Format is UN(12,6) (μsec/sec)
   */
  @XmlElement(name = "AzScanChangeRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PRICHGRATE.class)
  private TDecimal azScanChangeRate;
  /**
   * US:AzScanRateExtremeMax - Extreme Horizontal Scan Rate Max (Optional)
   * <p>
   * The range of horizontal scan rate values that represent 100% of the signal
   * observed Scan values obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater
   * than US:AzScanRateExtremeMin.
   * <p>
   * Format is UN(7,2) (scans/min)
   */
  @XmlElement(name = "AzScanRateExtremeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal azScanRateExtremeMax;
  /**
   * US:AzScanRateExtremeMin - Extreme Horizontal Scan Rate Min (Optional)
   * <p>
   * The range of horizontal scan rate values that represent 100% of the signal
   * observed Scan values obtained from a statistical study of a data set.
   * <p>
   * Format is UN(7,2) (scans/min)
   */
  @XmlElement(name = "AzScanRateExtremeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal azScanRateExtremeMin;
  /**
   * US:AzScanRateMean - Mean Horizontal Scan Rate (Optional)
   * <p>
   * The average horizontal scan rate value for a signal that changes horizontal
   * scan rates on a non-patterned basis.
   * <p>
   * Format is UN(7,2) (scans/min)
   */
  @XmlElement(name = "AzScanRateMean", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal azScanRateMean;
  /**
   * US:AzScanRateMedian - Most Probable Horizontal Scan Rate (Optional)
   * <p>
   * The horizontal scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * Format is UN(7,2) (scans/min)
   */
  @XmlElement(name = "AzScanRateMedian", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal azScanRateMedian;
  /**
   * US:AzScanSector - Azimuth ScanSector (Optional)
   * <p>
   * The total angular width in the horizontal plane (aka, azimuth) the subject
   * emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "AzScanSector", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal azScanSector;
  /**
   * US:AzScanSectorMax - Azimuth ScanSectorMax (Optional)
   * <p>
   * The total angular width in the horizontal plane (aka, azimuth) the subject
   * emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "AzScanSectorMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal azScanSectorMax;
  /**
   * US:AzScanVelocity - Azimuth ScanVelocity (Optional)
   * <p>
   * The horizontal angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * Format is UN(6,2) (deg/sec)
   */
  @XmlElement(name = "AzScanVelocity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANSPEED.class)
  private TDecimal azScanVelocity;
  /**
   * In Data Item Vertical Scan Change Rate (US), enter the rate of change for
   * vertical Scan Period variations expressed in Scan Period change per unit of
   * time
   */
  @XmlElement(name = "ElevScanChangeRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PRICHGRATE.class)
  private TDecimal elevScanChangeRate;
  /**
   * In Data Item Extreme Vertical Scan Rate Max (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater
   * than US:ElevScanRateExtremeMin.
   */
  @XmlElement(name = "ElevScanRateExtremeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal elevScanRateExtremeMax;
  /**
   * In Data Item Extreme Vertical Scan Rate Min (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   */
  @XmlElement(name = "ElevScanRateExtremeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal elevScanRateExtremeMin;
  /**
   * US:ElevScanRateMean - Mean Vertical Scan Rate (Optional)
   * <p>
   * The average vertical scan rate value for a signal that changes vertical
   * scan rates on a non-patterned basis.
   * <p>
   * Format is UN(7,2) (scans/min)
   */
  @XmlElement(name = "ElevScanRateMean", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal elevScanRateMean;
  /**
   * US:ElevScanRateMedian - Most Probable Vertical Scan Rate (Optional)
   * <p>
   * The vertical scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * Format is UN(7,2) (scans/min)
   */
  @XmlElement(name = "ElevScanRateMedian", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal elevScanRateMedian;
  /**
   * US:ElevScanSector - Vertical Scan Sector (Optional)
   * <p>
   * The total angular width in the vertical plane (aka, elevation) the subject
   * emitter antenna mainbeam (aka, mainlobe) scans/covers in one complete scan.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "ElevScanSector", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal elevScanSector;
  /**
   * US:ElevScanSectorMax - Vertical Scan Sector Max (Optional)
   * <p>
   * The total angular width in the vertical plane (aka, elevation) the subject
   * emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * Format is UN(5,2) (deg)
   */
  @XmlElement(name = "ElevScanSectorMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEGREES.class)
  private TDecimal elevScanSectorMax;
  /**
   * US:ElevScanVelocity - Vertical Scan Velocity (Optional)
   * <p>
   * The vertical angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * Format is UN(6,2) (deg/sec)
   */
  @XmlElement(name = "ElevScanVelocity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANSPEED.class)
  private TDecimal elevScanVelocity;
  /**
   * US:NumBeamPositionsPerScan - Num Beam Positions Per Scan (Optional)
   * <p>
   * The number of beam positions (aka., dwells) per scan cycle
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumBeamPositionsPerScan", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numBeamPositionsPerScan;
  /**
   * US:NumBeamPositionsTotal - Total Number of Beam Positions (Optional)
   * <p>
   * The total number of unique array beam positions resulting from the
   * frequency steps of a frequency scanning, phase changes, in phase scanning,
   * or discrete time delays in time delay steering.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumBeamPositionsTotal", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numBeamPositionsTotal;
  /**
   * US:NumBeamsPerRaster - Num Beams Per Raster (Optional)
   * <p>
   * The number of beam positions necessary to complete one bar of the raster
   * scan.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumBeamsPerRaster", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numBeamsPerRaster;
  /**
   * US:NumRastersPerCycle - Num Rasters Per Cycle (Optional)
   * <p>
   * The number of 360 degree scans (aka, turns) a component of a scan makes in
   * the time it takes the Primary Scan to complete one complete cycle/scan.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumRastersPerCycle", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numRastersPerCycle;
  /**
   * US:NumScanPositions - Number of Scan Positions (Optional)
   * <p>
   * The number of discrete values observed in a single repeating scan period
   * sequence.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumScanPositions", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numScanPositions;
  /**
   * US:NumScanValues - Number of Scan Values (Optional)
   * <p>
   * The number of discrete values observed in multiple repeating scan period
   * sequences.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumScanValues", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numScanValues;
  /**
   * US:ScanAdaptiveDriverDesc - Scan Adaptive Driver Description (Optional)
   * <p>
   * The condition which controls or can be associated with the signal Scan
   * Period variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "ScanAdaptiveDriverDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString scanAdaptiveDriverDesc;
  /**
   * US:ScanAdaptiveRuleDesc - Scan Adaptive Rule Description (Optional)
   * <p>
   * The rule which describes the signal Scan Period variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "ScanAdaptiveRuleDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString scanAdaptiveRuleDesc;
  /**
   * US:ScanAngleAzStart - Scan Angle Azimuth Start (Optional)
   * <p>
   * The maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "ScanAngleAzStart", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal scanAngleAzStart;
  /**
   * US:ScanAngleAzStop - Scan Angle Azimuth Stop (Optional)
   * <p>
   * The minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "ScanAngleAzStop", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal scanAngleAzStop;
  /**
   * US:ScanAngleElevStart - Scan Angle Elevation Start (Optional)
   * <p>
   * The maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., elevation).
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "ScanAngleElevStart", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal scanAngleElevStart;
  /**
   * US:ScanAngleElevStop - Scan Angle Elevation Stop (Optional)
   * <p>
   * The minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., azimuth).
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "ScanAngleElevStop", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal scanAngleElevStop;
  /**
   * US:ScanDwell - Scan Dwell (Optional)
   * <p>
   * The scan duration
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "ScanDwell", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal scanDwell;
  /**
   * US:ScanDwellSequence - Scan Dwell Sequence (Optional)
   * <p>
   * The Sequence of dwell durations, with elevation and azimuth. Example: 20
   * deg hor, 15 deg elev, 5 second dwell, etc.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "ScanDwellSequence", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString scanDwellSequence;
  /**
   * US:ScanDwellTime - Scan Dwell Time (Optional)
   * <p>
   * The time duration for a complete dwell/group of scan cycles which all have
   * the same Scan Period Discrete value before changing to a different one.
   * <p>
   * Format is UN(12,6) (μsec/sec)
   */
  @XmlElement(name = "ScanDwellTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_PRICHGRATE.class)
  private TDecimal scanDwellTime;
  /**
   * In Data Item ScanElevContinuous (US), indicate the if the scan elevation
   * progression is a continuous sweep.
   */
  @XmlElement(name = "ScanElevContinuous", required = false)
  private TString scanElevContinuous;
  /**
   * In Data Item ScanPatternType (US), indicate whether the Scan Period is
   * unmodulated, Patterned, Non-Patterned, or Adaptive.
   */
  @XmlElement(name = "ScanPatternType", required = false)
  private TString scanPatternType;
  /**
   * In Data Item ScanType (US), indicate if the observed data was detected via
   * a primary or secondary scan.
   */
  @XmlElement(name = "ScanType", required = false)
  private TString scanType;
  /**
   * US:ObservedScanValues (Optional)
   * <p>
   * ObservedScanValues (US) contains data describing the discrete scan rate
   * values and supporting statistical information.
   */
  @XmlElement(name = "ObservedScanValues")
  private List<ObservedScanValues> observedScanValues;

  /**
   * Get In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth
   * progression is a continuous sweep.
   * <p>
   * @return the ScansHorzContinuous value in a {@link TString} data type
   */
  public TString getScansHorzContinuous() {
    return scansHorzContinuous;
  }

  /**
   * Set In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth
   * progression is a continuous sweep.
   * <p>
   * @param value the ScansHorzContinuous value in a {@link TString} data type
   */
  public void setScansHorzContinuous(TString value) {
    this.scansHorzContinuous = value;
  }

  /**
   * Determine if the ScansHorzContinuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScansHorzContinuous() {
    return (this.scansHorzContinuous != null ? this.scansHorzContinuous.isSetValue() : false);
  }

  /**
   * Get the position of the emitter Mainbeam (aka, Mainlobe) boresight
   * referenced from true north for ground based fixed emitters, and the emitter
   * defined centerline for other platforms (e.g., mobile, airborne, shipborne).
   * <p>
   * @return the AzBoresightAngle value in a {@link TDecimal} data type
   */
  public TDecimal getAzBoresightAngle() {
    return azBoresightAngle;
  }

  /**
   * Set the position of the emitter Mainbeam (aka, Mainlobe) boresight
   * referenced from true north for ground based fixed emitters, and the emitter
   * defined centerline for other platforms (e.g., mobile, airborne, shipborne).
   * <p>
   * @param value the AzBoresightAngle value in a {@link TDecimal} data type
   */
  public void setAzBoresightAngle(TDecimal value) {
    this.azBoresightAngle = value;
  }

  /**
   * Determine if the AzBoresightAngle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzBoresightAngle() {
    return (this.azBoresightAngle != null ? this.azBoresightAngle.isSetValue() : false);
  }

  /**
   * Get the rate of change for horizontal Scan Period variations expressed in
   * Scan Period change per unit of time
   * <p>
   * @return the AzScanChangeRate value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanChangeRate() {
    return azScanChangeRate;
  }

  /**
   * Set the rate of change for horizontal Scan Period variations expressed in
   * Scan Period change per unit of time
   * <p>
   * @param value the AzScanChangeRate value in a {@link TDecimal} data type
   */
  public void setAzScanChangeRate(TDecimal value) {
    this.azScanChangeRate = value;
  }

  /**
   * Determine if the AzScanChangeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanChangeRate() {
    return (this.azScanChangeRate != null ? this.azScanChangeRate.isSetValue() : false);
  }

  /**
   * Get the range of horizontal scan rate values that represent 100% of the
   * signal observed Scan values obtained from a statistical study of a data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater
   * than US:AzScanRateExtremeMin.
   * <p>
   * @return the AzScanRateExtremeMax value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanRateExtremeMax() {
    return azScanRateExtremeMax;
  }

  /**
   * Set the range of horizontal scan rate values that represent 100% of the
   * signal observed Scan values obtained from a statistical study of a data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater
   * than US:AzScanRateExtremeMin.
   * <p>
   * @param value the AzScanRateExtremeMax value in a {@link TDecimal} data type
   */
  public void setAzScanRateExtremeMax(TDecimal value) {
    this.azScanRateExtremeMax = value;
  }

  /**
   * Determine if the AzScanRateExtremeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanRateExtremeMax() {
    return (this.azScanRateExtremeMax != null ? this.azScanRateExtremeMax.isSetValue() : false);
  }

  /**
   * Get the range of horizontal scan rate values that represent 100% of the
   * signal observed Scan values obtained from a statistical study of a data
   * set.
   * <p>
   * @return the AzScanRateExtremeMin value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanRateExtremeMin() {
    return azScanRateExtremeMin;
  }

  /**
   * Set the range of horizontal scan rate values that represent 100% of the
   * signal observed Scan values obtained from a statistical study of a data
   * set.
   * <p>
   * @param value the AzScanRateExtremeMin value in a {@link TDecimal} data type
   */
  public void setAzScanRateExtremeMin(TDecimal value) {
    this.azScanRateExtremeMin = value;
  }

  /**
   * Determine if the AzScanRateExtremeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanRateExtremeMin() {
    return (this.azScanRateExtremeMin != null ? this.azScanRateExtremeMin.isSetValue() : false);
  }

  /**
   * Get the average horizontal scan rate value for a signal that changes
   * horizontal scan rates on a non-patterned basis.
   * <p>
   * @return the AzScanRateMean value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanRateMean() {
    return azScanRateMean;
  }

  /**
   * Set the average horizontal scan rate value for a signal that changes
   * horizontal scan rates on a non-patterned basis.
   * <p>
   * @param value the AzScanRateMean value in a {@link TDecimal} data type
   */
  public void setAzScanRateMean(TDecimal value) {
    this.azScanRateMean = value;
  }

  /**
   * Determine if the AzScanRateMean is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanRateMean() {
    return (this.azScanRateMean != null ? this.azScanRateMean.isSetValue() : false);
  }

  /**
   * Get the horizontal scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * @return the AzScanRateMedian value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanRateMedian() {
    return azScanRateMedian;
  }

  /**
   * Set the horizontal scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * @param value the AzScanRateMedian value in a {@link TDecimal} data type
   */
  public void setAzScanRateMedian(TDecimal value) {
    this.azScanRateMedian = value;
  }

  /**
   * Determine if the AzScanRateMedian is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanRateMedian() {
    return (this.azScanRateMedian != null ? this.azScanRateMedian.isSetValue() : false);
  }

  /**
   * Get the total angular width in the horizontal plane (aka, azimuth) the
   * subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one
   * complete scan.
   * <p>
   * @return the AzScanSector value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanSector() {
    return azScanSector;
  }

  /**
   * Set the total angular width in the horizontal plane (aka, azimuth) the
   * subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one
   * complete scan.
   * <p>
   * @param value the AzScanSector value in a {@link TDecimal} data type
   */
  public void setAzScanSector(TDecimal value) {
    this.azScanSector = value;
  }

  /**
   * Determine if the AzScanSector is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanSector() {
    return (this.azScanSector != null ? this.azScanSector.isSetValue() : false);
  }

  /**
   * Get the total angular width in the horizontal plane (aka, azimuth) the
   * subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * @return the AzScanSectorMax value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanSectorMax() {
    return azScanSectorMax;
  }

  /**
   * Set the total angular width in the horizontal plane (aka, azimuth) the
   * subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * @param value the AzScanSectorMax value in a {@link TDecimal} data type
   */
  public void setAzScanSectorMax(TDecimal value) {
    this.azScanSectorMax = value;
  }

  /**
   * Determine if the AzScanSectorMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanSectorMax() {
    return (this.azScanSectorMax != null ? this.azScanSectorMax.isSetValue() : false);
  }

  /**
   * Get the horizontal angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * @return the AzScanVelocity value in a {@link TDecimal} data type
   */
  public TDecimal getAzScanVelocity() {
    return azScanVelocity;
  }

  /**
   * Set the horizontal angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * @param value the AzScanVelocity value in a {@link TDecimal} data type
   */
  public void setAzScanVelocity(TDecimal value) {
    this.azScanVelocity = value;
  }

  /**
   * Determine if the AzScanVelocity is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzScanVelocity() {
    return (this.azScanVelocity != null ? this.azScanVelocity.isSetValue() : false);
  }

  /**
   * Get In Data Item Vertical Scan Change Rate (US), enter the rate of change
   * for vertical Scan Period variations expressed in Scan Period change per
   * unit of time
   * <p>
   * @return the ElevScanChangeRate value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanChangeRate() {
    return elevScanChangeRate;
  }

  /**
   * Set In Data Item Vertical Scan Change Rate (US), enter the rate of change
   * for vertical Scan Period variations expressed in Scan Period change per
   * unit of time
   * <p>
   * @param value the ElevScanChangeRate value in a {@link TDecimal} data type
   */
  public void setElevScanChangeRate(TDecimal value) {
    this.elevScanChangeRate = value;
  }

  /**
   * Determine if the ElevScanChangeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanChangeRate() {
    return (this.elevScanChangeRate != null ? this.elevScanChangeRate.isSetValue() : false);
  }

  /**
   * Get In Data Item Extreme Vertical Scan Rate Max (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater
   * than US:ElevScanRateExtremeMin.
   * <p>
   * @return the ElevScanRateExtremeMax value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanRateExtremeMax() {
    return elevScanRateExtremeMax;
  }

  /**
   * Set In Data Item Extreme Vertical Scan Rate Max (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater
   * than US:ElevScanRateExtremeMin.
   * <p>
   * @param value the ElevScanRateExtremeMax value in a {@link TDecimal} data
   *              type
   */
  public void setElevScanRateExtremeMax(TDecimal value) {
    this.elevScanRateExtremeMax = value;
  }

  /**
   * Determine if the ElevScanRateExtremeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanRateExtremeMax() {
    return (this.elevScanRateExtremeMax != null ? this.elevScanRateExtremeMax.isSetValue() : false);
  }

  /**
   * Get In Data Item Extreme Vertical Scan Rate Min (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   * <p>
   * @return the ElevScanRateExtremeMin value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanRateExtremeMin() {
    return elevScanRateExtremeMin;
  }

  /**
   * Set In Data Item Extreme Vertical Scan Rate Min (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   * <p>
   * @param value the ElevScanRateExtremeMin value in a {@link TDecimal} data
   *              type
   */
  public void setElevScanRateExtremeMin(TDecimal value) {
    this.elevScanRateExtremeMin = value;
  }

  /**
   * Determine if the ElevScanRateExtremeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanRateExtremeMin() {
    return (this.elevScanRateExtremeMin != null ? this.elevScanRateExtremeMin.isSetValue() : false);
  }

  /**
   * Get the average vertical scan rate value for a signal that changes vertical
   * scan rates on a non-patterned basis.
   * <p>
   * @return the ElevScanRateMean value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanRateMean() {
    return elevScanRateMean;
  }

  /**
   * Set the average vertical scan rate value for a signal that changes vertical
   * scan rates on a non-patterned basis.
   * <p>
   * @param value the ElevScanRateMean value in a {@link TDecimal} data type
   */
  public void setElevScanRateMean(TDecimal value) {
    this.elevScanRateMean = value;
  }

  /**
   * Determine if the ElevScanRateMean is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanRateMean() {
    return (this.elevScanRateMean != null ? this.elevScanRateMean.isSetValue() : false);
  }

  /**
   * Get the vertical scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * @return the ElevScanRateMedian value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanRateMedian() {
    return elevScanRateMedian;
  }

  /**
   * Set the vertical scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * @param value the ElevScanRateMedian value in a {@link TDecimal} data type
   */
  public void setElevScanRateMedian(TDecimal value) {
    this.elevScanRateMedian = value;
  }

  /**
   * Determine if the ElevScanRateMedian is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanRateMedian() {
    return (this.elevScanRateMedian != null ? this.elevScanRateMedian.isSetValue() : false);
  }

  /**
   * Get the total angular width in the vertical plane (aka, elevation) the
   * subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one
   * complete scan.
   * <p>
   * @return the ElevScanSector value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanSector() {
    return elevScanSector;
  }

  /**
   * Set the total angular width in the vertical plane (aka, elevation) the
   * subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one
   * complete scan.
   * <p>
   * @param value the ElevScanSector value in a {@link TDecimal} data type
   */
  public void setElevScanSector(TDecimal value) {
    this.elevScanSector = value;
  }

  /**
   * Determine if the ElevScanSector is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanSector() {
    return (this.elevScanSector != null ? this.elevScanSector.isSetValue() : false);
  }

  /**
   * Get the total angular width in the vertical plane (aka, elevation) the
   * subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * @return the ElevScanSectorMax value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanSectorMax() {
    return elevScanSectorMax;
  }

  /**
   * Set the total angular width in the vertical plane (aka, elevation) the
   * subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * @param value the ElevScanSectorMax value in a {@link TDecimal} data type
   */
  public void setElevScanSectorMax(TDecimal value) {
    this.elevScanSectorMax = value;
  }

  /**
   * Determine if the ElevScanSectorMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanSectorMax() {
    return (this.elevScanSectorMax != null ? this.elevScanSectorMax.isSetValue() : false);
  }

  /**
   * Get the vertical angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * @return the ElevScanVelocity value in a {@link TDecimal} data type
   */
  public TDecimal getElevScanVelocity() {
    return elevScanVelocity;
  }

  /**
   * Set the vertical angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * @param value the ElevScanVelocity value in a {@link TDecimal} data type
   */
  public void setElevScanVelocity(TDecimal value) {
    this.elevScanVelocity = value;
  }

  /**
   * Determine if the ElevScanVelocity is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetElevScanVelocity() {
    return (this.elevScanVelocity != null ? this.elevScanVelocity.isSetValue() : false);
  }

  /**
   * Get the number of beam positions (aka., dwells) per scan cycle
   * <p>
   * @return the NumBeamPositionsPerScan value in a {@link TInteger} data type
   */
  public TInteger getNumBeamPositionsPerScan() {
    return numBeamPositionsPerScan;
  }

  /**
   * Set the number of beam positions (aka., dwells) per scan cycle
   * <p>
   * @param value the NumBeamPositionsPerScan value in a {@link TInteger} data
   *              type
   */
  public void setNumBeamPositionsPerScan(TInteger value) {
    this.numBeamPositionsPerScan = value;
  }

  /**
   * Determine if the NumBeamPositionsPerScan is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumBeamPositionsPerScan() {
    return (this.numBeamPositionsPerScan != null ? this.numBeamPositionsPerScan.isSetValue() : false);
  }

  /**
   * Get the total number of unique array beam positions resulting from the
   * frequency steps of a frequency scanning, phase changes, in phase scanning,
   * or discrete time delays in time delay steering.
   * <p>
   * @return the NumBeamPositionsTotal value in a {@link TInteger} data type
   */
  public TInteger getNumBeamPositionsTotal() {
    return numBeamPositionsTotal;
  }

  /**
   * Set the total number of unique array beam positions resulting from the
   * frequency steps of a frequency scanning, phase changes, in phase scanning,
   * or discrete time delays in time delay steering.
   * <p>
   * @param value the NumBeamPositionsTotal value in a {@link TInteger} data
   *              type
   */
  public void setNumBeamPositionsTotal(TInteger value) {
    this.numBeamPositionsTotal = value;
  }

  /**
   * Determine if the NumBeamPositionsTotal is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumBeamPositionsTotal() {
    return (this.numBeamPositionsTotal != null ? this.numBeamPositionsTotal.isSetValue() : false);
  }

  /**
   * Get the number of beam positions necessary to complete one bar of the
   * raster scan.
   * <p>
   * @return the NumBeamsPerRaster value in a {@link TInteger} data type
   */
  public TInteger getNumBeamsPerRaster() {
    return numBeamsPerRaster;
  }

  /**
   * Set the number of beam positions necessary to complete one bar of the
   * raster scan.
   * <p>
   * @param value the NumBeamsPerRaster value in a {@link TInteger} data type
   */
  public void setNumBeamsPerRaster(TInteger value) {
    this.numBeamsPerRaster = value;
  }

  /**
   * Determine if the NumBeamsPerRaster is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumBeamsPerRaster() {
    return (this.numBeamsPerRaster != null ? this.numBeamsPerRaster.isSetValue() : false);
  }

  /**
   * Get the number of 360 degree scans (aka, turns) a component of a scan makes
   * in the time it takes the Primary Scan to complete one complete cycle/scan.
   * <p>
   * @return the NumRastersPerCycle value in a {@link TInteger} data type
   */
  public TInteger getNumRastersPerCycle() {
    return numRastersPerCycle;
  }

  /**
   * Set the number of 360 degree scans (aka, turns) a component of a scan makes
   * in the time it takes the Primary Scan to complete one complete cycle/scan.
   * <p>
   * @param value the NumRastersPerCycle value in a {@link TInteger} data type
   */
  public void setNumRastersPerCycle(TInteger value) {
    this.numRastersPerCycle = value;
  }

  /**
   * Determine if the NumRastersPerCycle is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumRastersPerCycle() {
    return (this.numRastersPerCycle != null ? this.numRastersPerCycle.isSetValue() : false);
  }

  /**
   * Get the number of discrete values observed in a single repeating scan
   * period sequence.
   * <p>
   * @return the NumScanPositions value in a {@link TInteger} data type
   */
  public TInteger getNumScanPositions() {
    return numScanPositions;
  }

  /**
   * Set the number of discrete values observed in a single repeating scan
   * period sequence.
   * <p>
   * @param value the NumScanPositions value in a {@link TInteger} data type
   */
  public void setNumScanPositions(TInteger value) {
    this.numScanPositions = value;
  }

  /**
   * Determine if the NumScanPositions is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumScanPositions() {
    return (this.numScanPositions != null ? this.numScanPositions.isSetValue() : false);
  }

  /**
   * Get the number of discrete values observed in multiple repeating scan
   * period sequences.
   * <p>
   * @return the NumScanValues value in a {@link TInteger} data type
   */
  public TInteger getNumScanValues() {
    return numScanValues;
  }

  /**
   * Set the number of discrete values observed in multiple repeating scan
   * period sequences.
   * <p>
   * @param value the NumScanValues value in a {@link TInteger} data type
   */
  public void setNumScanValues(TInteger value) {
    this.numScanValues = value;
  }

  /**
   * Determine if the NumScanValues is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumScanValues() {
    return (this.numScanValues != null ? this.numScanValues.isSetValue() : false);
  }

  /**
   * Get the condition which controls or can be associated with the signal Scan
   * Period variations.
   * <p>
   * @return the ScanAdaptiveDriverDesc value in a {@link TString} data type
   */
  public TString getScanAdaptiveDriverDesc() {
    return scanAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls or can be associated with the signal Scan
   * Period variations.
   * <p>
   * @param value the ScanAdaptiveDriverDesc value in a {@link TString} data
   *              type
   */
  public void setScanAdaptiveDriverDesc(TString value) {
    this.scanAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the ScanAdaptiveDriverDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanAdaptiveDriverDesc() {
    return (this.scanAdaptiveDriverDesc != null ? this.scanAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal Scan Period variations.
   * <p>
   * @return the ScanAdaptiveRuleDesc value in a {@link TString} data type
   */
  public TString getScanAdaptiveRuleDesc() {
    return scanAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal Scan Period variations.
   * <p>
   * @param value the ScanAdaptiveRuleDesc value in a {@link TString} data type
   */
  public void setScanAdaptiveRuleDesc(TString value) {
    this.scanAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the ScanAdaptiveRuleDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanAdaptiveRuleDesc() {
    return (this.scanAdaptiveRuleDesc != null ? this.scanAdaptiveRuleDesc.isSetValue() : false);
  }

  /**
   * Get the maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * @return the ScanAngleAzStart value in a {@link TDecimal} data type
   */
  public TDecimal getScanAngleAzStart() {
    return scanAngleAzStart;
  }

  /**
   * Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * @param value the ScanAngleAzStart value in a {@link TDecimal} data type
   */
  public void setScanAngleAzStart(TDecimal value) {
    this.scanAngleAzStart = value;
  }

  /**
   * Determine if the ScanAngleAzStart is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanAngleAzStart() {
    return (this.scanAngleAzStart != null ? this.scanAngleAzStart.isSetValue() : false);
  }

  /**
   * Get the minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * @return the ScanAngleAzStop value in a {@link TDecimal} data type
   */
  public TDecimal getScanAngleAzStop() {
    return scanAngleAzStop;
  }

  /**
   * Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * @param value the ScanAngleAzStop value in a {@link TDecimal} data type
   */
  public void setScanAngleAzStop(TDecimal value) {
    this.scanAngleAzStop = value;
  }

  /**
   * Determine if the ScanAngleAzStop is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanAngleAzStop() {
    return (this.scanAngleAzStop != null ? this.scanAngleAzStop.isSetValue() : false);
  }

  /**
   * Get the maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., elevation).
   * <p>
   * @return the ScanAngleElevStart value in a {@link TDecimal} data type
   */
  public TDecimal getScanAngleElevStart() {
    return scanAngleElevStart;
  }

  /**
   * Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., elevation).
   * <p>
   * @param value the ScanAngleElevStart value in a {@link TDecimal} data type
   */
  public void setScanAngleElevStart(TDecimal value) {
    this.scanAngleElevStart = value;
  }

  /**
   * Determine if the ScanAngleElevStart is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanAngleElevStart() {
    return (this.scanAngleElevStart != null ? this.scanAngleElevStart.isSetValue() : false);
  }

  /**
   * Get the minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., azimuth).
   * <p>
   * @return the ScanAngleElevStop value in a {@link TDecimal} data type
   */
  public TDecimal getScanAngleElevStop() {
    return scanAngleElevStop;
  }

  /**
   * Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., azimuth).
   * <p>
   * @param value the ScanAngleElevStop value in a {@link TDecimal} data type
   */
  public void setScanAngleElevStop(TDecimal value) {
    this.scanAngleElevStop = value;
  }

  /**
   * Determine if the ScanAngleElevStop is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanAngleElevStop() {
    return (this.scanAngleElevStop != null ? this.scanAngleElevStop.isSetValue() : false);
  }

  /**
   * Get the scan duration
   * <p>
   * @return the ScanDwell value in a {@link TDecimal} data type
   */
  public TDecimal getScanDwell() {
    return scanDwell;
  }

  /**
   * Set the scan duration
   * <p>
   * @param value the ScanDwell value in a {@link TDecimal} data type
   */
  public void setScanDwell(TDecimal value) {
    this.scanDwell = value;
  }

  /**
   * Determine if the ScanDwell is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanDwell() {
    return (this.scanDwell != null ? this.scanDwell.isSetValue() : false);
  }

  /**
   * Get the Sequence of dwell durations, with elevation and azimuth. Example:
   * 20 deg hor, 15 deg elev, 5 second dwell, etc.
   * <p>
   * @return the ScanDwellSequence value in a {@link TString} data type
   */
  public TString getScanDwellSequence() {
    return scanDwellSequence;
  }

  /**
   * Set the Sequence of dwell durations, with elevation and azimuth. Example:
   * 20 deg hor, 15 deg elev, 5 second dwell, etc.
   * <p>
   * @param value the ScanDwellSequence value in a {@link TString} data type
   */
  public void setScanDwellSequence(TString value) {
    this.scanDwellSequence = value;
  }

  /**
   * Determine if the ScanDwellSequence is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanDwellSequence() {
    return (this.scanDwellSequence != null ? this.scanDwellSequence.isSetValue() : false);
  }

  /**
   * Get the time duration for a complete dwell/group of scan cycles which all
   * have the same Scan Period Discrete value before changing to a different
   * one.
   * <p>
   * @return the ScanDwellTime value in a {@link TDecimal} data type
   */
  public TDecimal getScanDwellTime() {
    return scanDwellTime;
  }

  /**
   * Set the time duration for a complete dwell/group of scan cycles which all
   * have the same Scan Period Discrete value before changing to a different
   * one.
   * <p>
   * @param value the ScanDwellTime value in a {@link TDecimal} data type
   */
  public void setScanDwellTime(TDecimal value) {
    this.scanDwellTime = value;
  }

  /**
   * Determine if the ScanDwellTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanDwellTime() {
    return (this.scanDwellTime != null ? this.scanDwellTime.isSetValue() : false);
  }

  /**
   * Get In Data Item ScanElevContinuous (US), indicate the if the scan
   * elevation progression is a continuous sweep.
   * <p>
   * @return the ScanElevContinuous value in a {@link TString} data type
   */
  public TString getScanElevContinuous() {
    return scanElevContinuous;
  }

  /**
   * Set In Data Item ScanElevContinuous (US), indicate the if the scan
   * elevation progression is a continuous sweep.
   * <p>
   * @param value the ScanElevContinuous value in a {@link TString} data type
   */
  public void setScanElevContinuous(TString value) {
    this.scanElevContinuous = value;
  }

  /**
   * Determine if the ScanElevContinuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanElevContinuous() {
    return (this.scanElevContinuous != null ? this.scanElevContinuous.isSetValue() : false);
  }

  /**
   * Get In Data Item ScanPatternType (US), indicate whether the Scan Period is
   * unmodulated, Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @return the ScanPatternType value in a {@link TString} data type
   */
  public TString getScanPatternType() {
    return scanPatternType;
  }

  /**
   * Set In Data Item ScanPatternType (US), indicate whether the Scan Period is
   * unmodulated, Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value the ScanPatternType value in a {@link TString} data type
   */
  public void setScanPatternType(TString value) {
    this.scanPatternType = value;
  }

  /**
   * Determine if the ScanPatternType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanPatternType() {
    return (this.scanPatternType != null ? this.scanPatternType.isSetValue() : false);
  }

  /**
   * Get In Data Item ScanType (US), indicate if the observed data was detected
   * via a primary or secondary scan.
   * <p>
   * @return the ScanType value in a {@link TString} data type
   */
  public TString getScanType() {
    return scanType;
  }

  /**
   * Set In Data Item ScanType (US), indicate if the observed data was detected
   * via a primary or secondary scan.
   * <p>
   * @param value the ScanType value in a {@link TString} data type
   */
  public void setScanType(TString value) {
    this.scanType = value;
  }

  /**
   * Determine if the ScanType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetScanType() {
    return (this.scanType != null ? this.scanType.isSetValue() : false);
  }

  /**
   * Get the US:ObservedScanValues
   * <p>
   * Complex element ObservedScanValues (US) contains data describing the
   * discrete scan rate values and supporting statistical information.
   * <p>
   * @return a {@link List<ObservedScanValues>} instance
   */
  public List<ObservedScanValues> getObservedScanValues() {
    if (observedScanValues == null) {
      observedScanValues = new ArrayList<>();
    }
    return this.observedScanValues;
  }

  /**
   * Determine if the ObservedScanValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedScanValues() {
    return ((this.observedScanValues != null) && (!this.observedScanValues.isEmpty()));
  }

  /**
   * Clear the ObservedScanValues field. This sets the field to null.
   */
  public void unsetObservedScanValues() {
    this.observedScanValues = null;
  }

  /**
   * Set In Data Item ScanHorzContinuous (US), indicate the if the scan azimuth
   * progression is a continuous sweep.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScansHorzContinuous(ListCBO value) {
    setScansHorzContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set the position of the emitter Mainbeam (aka, Mainlobe) boresight
   * referenced from true north for ground based fixed emitters, and the emitter
   * defined centerline for other platforms (e.g., mobile, airborne, shipborne).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzBoresightAngle(Double value) {
    setAzBoresightAngle(new TDecimal(value));
    return this;
  }

  /**
   * Set the rate of change for horizontal Scan Period variations expressed in
   * Scan Period change per unit of time
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanChangeRate(Double value) {
    setAzScanChangeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the range of horizontal scan rate values that represent 100% of the
   * signal observed Scan values obtained from a statistical study of a data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:AzScanRateExtremeMax is used, it MUST be greater
   * than US:AzScanRateExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanRateExtremeMax(Double value) {
    setAzScanRateExtremeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the range of horizontal scan rate values that represent 100% of the
   * signal observed Scan values obtained from a statistical study of a data
   * set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanRateExtremeMin(Double value) {
    setAzScanRateExtremeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the average horizontal scan rate value for a signal that changes
   * horizontal scan rates on a non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanRateMean(Double value) {
    setAzScanRateMean(new TDecimal(value));
    return this;
  }

  /**
   * Set the horizontal scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanRateMedian(Double value) {
    setAzScanRateMedian(new TDecimal(value));
    return this;
  }

  /**
   * Set the total angular width in the horizontal plane (aka, azimuth) the
   * subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one
   * complete scan.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanSector(Double value) {
    setAzScanSector(new TDecimal(value));
    return this;
  }

  /**
   * Set the total angular width in the horizontal plane (aka, azimuth) the
   * subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanSectorMax(Double value) {
    setAzScanSectorMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the horizontal angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withAzScanVelocity(Double value) {
    setAzScanVelocity(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item Vertical Scan Change Rate (US), enter the rate of change
   * for vertical Scan Period variations expressed in Scan Period change per
   * unit of time
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanChangeRate(Double value) {
    setElevScanChangeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item Extreme Vertical Scan Rate Max (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ElevScanRateExtremeMax is used, it MUST be greater
   * than US:ElevScanRateExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanRateExtremeMax(Double value) {
    setElevScanRateExtremeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item Extreme Vertical Scan Rate Min (US), enter the range of
   * vertical scan rate values that represent 100% of the signal observed Scan
   * values obtained from a statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanRateExtremeMin(Double value) {
    setElevScanRateExtremeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the average vertical scan rate value for a signal that changes vertical
   * scan rates on a non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanRateMean(Double value) {
    setElevScanRateMean(new TDecimal(value));
    return this;
  }

  /**
   * Set the vertical scan rate that the signal most often used, based on a
   * statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanRateMedian(Double value) {
    setElevScanRateMedian(new TDecimal(value));
    return this;
  }

  /**
   * Set the total angular width in the vertical plane (aka, elevation) the
   * subject emitter antenna mainbeam (aka, mainlobe) scans/covers in one
   * complete scan.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanSector(Double value) {
    setElevScanSector(new TDecimal(value));
    return this;
  }

  /**
   * Set the total angular width in the vertical plane (aka, elevation) the
   * subject emitter antenna mainbeam (aka, mainlobe) is capable of scanning.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanSectorMax(Double value) {
    setElevScanSectorMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the vertical angular speed (i.e., degrees per second) of the subject
   * emitter Mainbeam (aka., mainlobe) scan referenced to a fixed point.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withElevScanVelocity(Double value) {
    setElevScanVelocity(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of beam positions (aka., dwells) per scan cycle
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withNumBeamPositionsPerScan(Integer value) {
    setNumBeamPositionsPerScan(new TInteger(value));
    return this;
  }

  /**
   * Set the total number of unique array beam positions resulting from the
   * frequency steps of a frequency scanning, phase changes, in phase scanning,
   * or discrete time delays in time delay steering.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withNumBeamPositionsTotal(Integer value) {
    setNumBeamPositionsTotal(new TInteger(value));
    return this;
  }

  /**
   * Set the number of beam positions necessary to complete one bar of the
   * raster scan.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withNumBeamsPerRaster(Integer value) {
    setNumBeamsPerRaster(new TInteger(value));
    return this;
  }

  /**
   * Set the number of 360 degree scans (aka, turns) a component of a scan makes
   * in the time it takes the Primary Scan to complete one complete cycle/scan.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withNumRastersPerCycle(Integer value) {
    setNumRastersPerCycle(new TInteger(value));
    return this;
  }

  /**
   * Set the number of discrete values observed in a single repeating scan
   * period sequence.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withNumScanPositions(Integer value) {
    setNumScanPositions(new TInteger(value));
    return this;
  }

  /**
   * Set the number of discrete values observed in multiple repeating scan
   * period sequences.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withNumScanValues(Integer value) {
    setNumScanValues(new TInteger(value));
    return this;
  }

  /**
   * Set the condition which controls or can be associated with the signal Scan
   * Period variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanAdaptiveDriverDesc(String value) {
    setScanAdaptiveDriverDesc(new TString(value));
    return this;
  }

  /**
   * Set the rule which describes the signal Scan Period variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanAdaptiveRuleDesc(String value) {
    setScanAdaptiveRuleDesc(new TString(value));
    return this;
  }

  /**
   * Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanAngleAzStart(Double value) {
    setScanAngleAzStart(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the horizontal plane (aka., azimuth).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanAngleAzStop(Double value) {
    setScanAngleAzStop(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., elevation).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanAngleElevStart(Double value) {
    setScanAngleElevStart(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum angle the subject emitter antenna mainbeam (aka., mainlobe)
   * reaches in the vertical plane (aka., azimuth).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanAngleElevStop(Double value) {
    setScanAngleElevStop(new TDecimal(value));
    return this;
  }

  /**
   * Set the scan duration
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanDwell(Double value) {
    setScanDwell(new TDecimal(value));
    return this;
  }

  /**
   * Set the Sequence of dwell durations, with elevation and azimuth. Example:
   * 20 deg hor, 15 deg elev, 5 second dwell, etc.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanDwellSequence(String value) {
    setScanDwellSequence(new TString(value));
    return this;
  }

  /**
   * Set the time duration for a complete dwell/group of scan cycles which all
   * have the same Scan Period Discrete value before changing to a different
   * one.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanDwellTime(Double value) {
    setScanDwellTime(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item ScanElevContinuous (US), indicate the if the scan
   * elevation progression is a continuous sweep.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanElevContinuous(ListCBO value) {
    setScanElevContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item ScanPatternType (US), indicate whether the Scan Period is
   * unmodulated, Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanPatternType(ListUS7 value) {
    setScanPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set In Data Item ScanType (US), indicate if the observed data was detected
   * via a primary or secondary scan.
   * <p>
   * @param value An instances of type {@link ListUS8}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withScanType(ListUS8 value) {
    setScanType(new TString(value.value()));
    return this;
  }

  /**
   * Set the US:ObservedScanValues
   * <p>
   * Complex element ObservedScanValues (US) contains data describing the
   * discrete scan rate values and supporting statistical information.
   * <p>
   * @param values One or more instances of type {@link ObservedScanValues...}
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withObservedScanValues(ObservedScanValues... values) {
    if (values != null) {
      getObservedScanValues().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedScanValues
   * <p>
   * Complex element ObservedScanValues (US) contains data describing the
   * discrete scan rate values and supporting statistical information.
   * <p>
   * @param values A collection of {@link ObservedScanValues} instances
   * @return The current ObservedScanAnalysis object instance
   */
  public ObservedScanAnalysis withObservedScanValues(Collection<ObservedScanValues> values) {
    if (values != null) {
      getObservedScanValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedScanAnalysis instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedScanAnalysis {"
      + " scanPatternType [" + scanPatternType + "]"
      + " azScanSector [" + azScanSector + "]"
      + " azScanRateExtremeMax [" + azScanRateExtremeMax + "]"
      + " scanElevContinuous [" + scanElevContinuous + "]"
      + " scanDwellSequence [" + scanDwellSequence + "]"
      + " scanAdaptiveRuleDesc [" + scanAdaptiveRuleDesc + "]"
      + " scansHorzContinuous [" + scansHorzContinuous + "]"
      + " observedScanValues [" + observedScanValues + "]"
      + " scanAdaptiveDriverDesc [" + scanAdaptiveDriverDesc + "]"
      + " azScanChangeRate [" + azScanChangeRate + "]"
      + " scanAngleAzStart [" + scanAngleAzStart + "]"
      + " azScanSectorMax [" + azScanSectorMax + "]"
      + " azScanRateMean [" + azScanRateMean + "]"
      + " numBeamPositionsPerScan [" + numBeamPositionsPerScan + "]"
      + " elevScanVelocity [" + elevScanVelocity + "]"
      + " numBeamsPerRaster [" + numBeamsPerRaster + "]"
      + " elevScanChangeRate [" + elevScanChangeRate + "]"
      + " azScanVelocity [" + azScanVelocity + "]"
      + " numBeamPositionsTotal [" + numBeamPositionsTotal + "]"
      + " numScanValues [" + numScanValues + "]"
      + " scanDwellTime [" + scanDwellTime + "]"
      + " numScanPositions [" + numScanPositions + "]"
      + " elevScanRateExtremeMin [" + elevScanRateExtremeMin + "]"
      + " scanType [" + scanType + "]"
      + " scanDwell [" + scanDwell + "]"
      + " scanAngleElevStop [" + scanAngleElevStop + "]"
      + " elevScanSectorMax [" + elevScanSectorMax + "]"
      + " elevScanRateExtremeMax [" + elevScanRateExtremeMax + "]"
      + " elevScanSector [" + elevScanSector + "]"
      + " azBoresightAngle [" + azBoresightAngle + "]"
      + " scanAngleElevStart [" + scanAngleElevStart + "]"
      + " elevScanRateMedian [" + elevScanRateMedian + "]"
      + " azScanRateExtremeMin [" + azScanRateExtremeMin + "]"
      + " elevScanRateMean [" + elevScanRateMean + "]"
      + " scanAngleAzStop [" + scanAngleAzStop + "]"
      + " azScanRateMedian [" + azScanRateMedian + "]"
      + " numRastersPerCycle [" + numRastersPerCycle + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedScanAnalysis} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
