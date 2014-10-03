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
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCRD;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS7;

/**
 * ObservedPolarisationAnalysis (US) contains data describing the parametric
 * information for the polarization and tilt angle information.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Sub-Element is {@link ObservedPolarisationValues}
 * <p>
 * Example:
 * <pre>
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
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * US:AxialRatio - Axial Ratio (Optional)
   * <p>
   * The ratio of the polarisation ellipse major axis to its minor axis
   * expressed in decibels.
   * <p>
   * Format is UN(5,2) (dB)
   */
  @XmlElement(name = "AxialRatio", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUNSIGNED_DB_5_2.class)
  private TDecimal axialRatio;
  /**
   * US:NumTiltAngleElements - Num Tilt Angle Elements (Optional)
   * <p>
   * The number of unique discrete tilt angle values.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumTiltAngleElements", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numTiltAngleElements;
  /**
   * US:NumTiltAnglePositions - Num Tilt Angle Positions (Optional)
   * <p>
   * The number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumTiltAnglePositions", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numTiltAnglePositions;
  /**
   * US:PolarisationRotationRate - Polarisation Rotation Rate (Optional)
   * <p>
   * The number of times per second that the polarisation ellipse mechanically
   * rotates through the same major axis tilt angle.
   * <p>
   * Format is UN(7,2) (scans/min)
   */
  @XmlElement(name = "PolarisationRotationRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_SCANRATE.class)
  private TDecimal polarisationRotationRate;
  /**
   * US:PolarisationType - Polarisation Type (Optional)
   * <p>
   * The polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * Format is L:CPO
   */
  @XmlElement(name = "PolarisationType", required = false)
  private TString polarisationType;
  /**
   * US:PolarisationDirection - Polarization Direction (Optional)
   * <p>
   * The direction in which the polarisation ellipse is mechanically rotating.
   * The direction is relative to an observer standing behind the radiator and
   * looking toward the direction of mainbeam propagation.
   * <p>
   * Format is L:CRD
   */
  @XmlElement(name = "PolarisationDirection", required = false)
  private TString polarisationDirection;
  /**
   * US:PolarisationSense - Polarization Sense (Optional)
   * <p>
   * The rotation direction of the radiated electromagnetic wave electric field
   * (E-field) vector (E) relative to the direction of propagation. This is
   * typically the opposite of Polarisation Direction.
   * <p>
   * Format is L:CRD
   */
  @XmlElement(name = "PolarisationSense", required = false)
  private TString polarisationSense;
  /**
   * US:TiltAngleAdaptiveDriverDesc - Tilt Angle Adaptive Driver Description
   * (Optional)
   * <p>
   * The condition which controls, or can be associated with, the signals Tilt
   * Angle variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "TiltAngleAdaptiveDriverDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString tiltAngleAdaptiveDriverDesc;
  /**
   * US:TiltAngleAdaptiveRuleDesc - Tilt Angle Adaptive Rule Description
   * (Optional)
   * <p>
   * The rule which describes the signal Polarisation Tilt Angle variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "TiltAngleAdaptiveRuleDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString tiltAngleAdaptiveRuleDesc;
  /**
   * US:TiltAngleContinuous - Tilt Angle Continuous (Optional)
   * <p>
   * Whether the tilt angle variations are Discrete or Continuous. Discrete uses
   * a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "TiltAngleContinuous", required = false)
  private TString tiltAngleContinuous;
  /**
   * US:TiltAngleDuration - Tilt Angle Duration (Optional)
   * <p>
   * The time duration for a complete dwell/group of pulses which all have the
   * same discrete Polarisation Tilt Angle value, or for a continuous wave at a
   * constant Polarisation Tilt Angle value.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "TiltAngleDuration", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal tiltAngleDuration;
  /**
   * US:TiltAngleExtremeMax - Maximum Tilt Angle Extreme (Optional)
   * <p>
   * The upper end of the range of Polarisation Tilt Angle values that represent
   * 100% of observed Tilt Angle values, from a statistical study of the data
   * set.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than
   * US:TiltAngleExtremeMin.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleExtremeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleExtremeMax;
  /**
   * US:TiltAngleExtremeMin - Minimum Tilt Angle Extreme (Optional)
   * <p>
   * The lower end of the range of Polarisation Tilt Angle values that represent
   * 100% of observed Tilt Angle values, from a statistical study of the data
   * set.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleExtremeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleExtremeMin;
  /**
   * US:TiltAngleMean - Average Tilt Angle (Optional)
   * <p>
   * The average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleMean", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleMean;
  /**
   * US:TiltAngleMedian - Most Probable Tilt Angle (Optional)
   * <p>
   * The observed Polarisation Tilt Angle value that the signal most often used,
   * based on statistical study of the data set.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleMedian", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleMedian;
  /**
   * US:TiltAnglePatternPeriod - Tilt Angle Pattern Period (Optional)
   * <p>
   * The time duration for one complete cycle of a repeating Polarisation Tilt
   * Angle sequence
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "TiltAnglePatternPeriod", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal tiltAnglePatternPeriod;
  /**
   * In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive.
   */
  @XmlElement(name = "TiltAnglePatternType", required = false)
  private TString tiltAnglePatternType;
  /**
   * US:TiltAngleRangeMax - Tilt Angle Range Max (Optional)
   * <p>
   * The highest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than
   * US:TiltAngleRangeMin.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleRangeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleRangeMax;
  /**
   * US:TiltAngleRangeMin - Tilt Angle Range Min (Optional)
   * <p>
   * The lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleRangeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleRangeMin;
  /**
   * US:TiltAngleRate - TiltAngle Rate (Optional)
   * <p>
   * The rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time.
   * <p>
   * Format is SN(5,2) (deg/sec)
   */
  @XmlElement(name = "TiltAngleRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_TILTANGRATE.class)
  private TDecimal tiltAngleRate;
  /**
   * US:TiltAngleSequenceDesc - Tilt Angle Sequence Description (Optional)
   * <p>
   * A free text description of the sequence of Polarisation Tilt Angle values.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "TiltAngleSequenceDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString tiltAngleSequenceDesc;
  /**
   * US:TiltAngleStdDev - Tilt Angle Standard Deviation (Optional)
   * <p>
   * The standard deviation of the data set used to calculate Polarisation Tilt
   * Angle Mean fields.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleStdDev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleStdDev;
  /**
   * US:TiltAngleStep - Tilt Angle Step (Optional)
   * <p>
   * The delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values.
   * <p>
   * Format is SN(5,2) (deg)
   */
  @XmlElement(name = "TiltAngleStep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DEG_SIGNED.class)
  private TDecimal tiltAngleStep;
  /**
   * US:ObservedPolarisationValues (Optional)
   * <p>
   * ObservedPolarisationValues (US) contains data describing the parametric
   * information for the polarization tilt angle specific values.
   */
  @XmlElement(name = "ObservedPolarisationValues")
  private List<ObservedPolarisationValues> observedPolarisationValues;

  /**
   * Get the ratio of the polarisation ellipse major axis to its minor axis
   * expressed in decibels.
   * <p>
   * @return the AxialRatio value in a {@link TDecimal} data type
   */
  public TDecimal getAxialRatio() {
    return axialRatio;
  }

  /**
   * Set the ratio of the polarisation ellipse major axis to its minor axis
   * expressed in decibels.
   * <p>
   * @param value the AxialRatio value in a {@link TDecimal} data type
   */
  public void setAxialRatio(TDecimal value) {
    this.axialRatio = value;
  }

  /**
   * Determine if the AxialRatio is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAxialRatio() {
    return (this.axialRatio != null ? this.axialRatio.isSetValue() : false);
  }

  /**
   * Get the number of unique discrete tilt angle values.
   * <p>
   * @return the NumTiltAngleElements value in a {@link TInteger} data type
   */
  public TInteger getNumTiltAngleElements() {
    return numTiltAngleElements;
  }

  /**
   * Set the number of unique discrete tilt angle values.
   * <p>
   * @param value the NumTiltAngleElements value in a {@link TInteger} data type
   */
  public void setNumTiltAngleElements(TInteger value) {
    this.numTiltAngleElements = value;
  }

  /**
   * Determine if the NumTiltAngleElements is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumTiltAngleElements() {
    return (this.numTiltAngleElements != null ? this.numTiltAngleElements.isSetValue() : false);
  }

  /**
   * Get the number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence.
   * <p>
   * @return the NumTiltAnglePositions value in a {@link TInteger} data type
   */
  public TInteger getNumTiltAnglePositions() {
    return numTiltAnglePositions;
  }

  /**
   * Set the number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence.
   * <p>
   * @param value the NumTiltAnglePositions value in a {@link TInteger} data
   *              type
   */
  public void setNumTiltAnglePositions(TInteger value) {
    this.numTiltAnglePositions = value;
  }

  /**
   * Determine if the NumTiltAnglePositions is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumTiltAnglePositions() {
    return (this.numTiltAnglePositions != null ? this.numTiltAnglePositions.isSetValue() : false);
  }

  /**
   * Get the number of times per second that the polarisation ellipse
   * mechanically rotates through the same major axis tilt angle.
   * <p>
   * @return the PolarisationRotationRate value in a {@link TDecimal} data type
   */
  public TDecimal getPolarisationRotationRate() {
    return polarisationRotationRate;
  }

  /**
   * Set the number of times per second that the polarisation ellipse
   * mechanically rotates through the same major axis tilt angle.
   * <p>
   * @param value the PolarisationRotationRate value in a {@link TDecimal} data
   *              type
   */
  public void setPolarisationRotationRate(TDecimal value) {
    this.polarisationRotationRate = value;
  }

  /**
   * Determine if the PolarisationRotationRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationRotationRate() {
    return (this.polarisationRotationRate != null ? this.polarisationRotationRate.isSetValue() : false);
  }

  /**
   * Get the polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * @return the PolarisationType value in a {@link TString} data type
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Set the polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * @param value the PolarisationType value in a {@link TString} data type
   */
  public void setPolarisationType(TString value) {
    this.polarisationType = value;
  }

  /**
   * Determine if the PolarisationType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationType() {
    return (this.polarisationType != null ? this.polarisationType.isSetValue() : false);
  }

  /**
   * Get the direction in which the polarisation ellipse is mechanically
   * rotating. The direction is relative to an observer standing behind the
   * radiator and looking toward the direction of mainbeam propagation.
   * <p>
   * @return the PolarisationDirection value in a {@link TString} data type
   */
  public TString getPolarisationDirection() {
    return polarisationDirection;
  }

  /**
   * Set the direction in which the polarisation ellipse is mechanically
   * rotating. The direction is relative to an observer standing behind the
   * radiator and looking toward the direction of mainbeam propagation.
   * <p>
   * @param value the PolarisationDirection value in a {@link TString} data type
   */
  public void setPolarisationDirection(TString value) {
    this.polarisationDirection = value;
  }

  /**
   * Determine if the PolarisationDirection is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationDirection() {
    return (this.polarisationDirection != null ? this.polarisationDirection.isSetValue() : false);
  }

  /**
   * Get the rotation direction of the radiated electromagnetic wave electric
   * field (E-field) vector (E) relative to the direction of propagation. This
   * is typically the opposite of Polarisation Direction.
   * <p>
   * @return the PolarisationSense value in a {@link TString} data type
   */
  public TString getPolarisationSense() {
    return polarisationSense;
  }

  /**
   * Set the rotation direction of the radiated electromagnetic wave electric
   * field (E-field) vector (E) relative to the direction of propagation. This
   * is typically the opposite of Polarisation Direction.
   * <p>
   * @param value the PolarisationSense value in a {@link TString} data type
   */
  public void setPolarisationSense(TString value) {
    this.polarisationSense = value;
  }

  /**
   * Determine if the PolarisationSense is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationSense() {
    return (this.polarisationSense != null ? this.polarisationSense.isSetValue() : false);
  }

  /**
   * Get the condition which controls, or can be associated with, the signals
   * Tilt Angle variations.
   * <p>
   * @return the TiltAngleAdaptiveDriverDesc value in a {@link TString} data
   *         type
   */
  public TString getTiltAngleAdaptiveDriverDesc() {
    return tiltAngleAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls, or can be associated with, the signals
   * Tilt Angle variations.
   * <p>
   * @param value the TiltAngleAdaptiveDriverDesc value in a {@link TString}
   *              data type
   */
  public void setTiltAngleAdaptiveDriverDesc(TString value) {
    this.tiltAngleAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the TiltAngleAdaptiveDriverDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleAdaptiveDriverDesc() {
    return (this.tiltAngleAdaptiveDriverDesc != null ? this.tiltAngleAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal Polarisation Tilt Angle variations.
   * <p>
   * @return the TiltAngleAdaptiveRuleDesc value in a {@link TString} data type
   */
  public TString getTiltAngleAdaptiveRuleDesc() {
    return tiltAngleAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal Polarisation Tilt Angle variations.
   * <p>
   * @param value the TiltAngleAdaptiveRuleDesc value in a {@link TString} data
   *              type
   */
  public void setTiltAngleAdaptiveRuleDesc(TString value) {
    this.tiltAngleAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the TiltAngleAdaptiveRuleDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleAdaptiveRuleDesc() {
    return (this.tiltAngleAdaptiveRuleDesc != null ? this.tiltAngleAdaptiveRuleDesc.isSetValue() : false);
  }

  /**
   * Get whether the tilt angle variations are Discrete or Continuous. Discrete
   * uses a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges.
   * <p>
   * @return the TiltAngleContinuous value in a {@link TString} data type
   */
  public TString getTiltAngleContinuous() {
    return tiltAngleContinuous;
  }

  /**
   * Set whether the tilt angle variations are Discrete or Continuous. Discrete
   * uses a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges.
   * <p>
   * @param value the TiltAngleContinuous value in a {@link TString} data type
   */
  public void setTiltAngleContinuous(TString value) {
    this.tiltAngleContinuous = value;
  }

  /**
   * Determine if the TiltAngleContinuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleContinuous() {
    return (this.tiltAngleContinuous != null ? this.tiltAngleContinuous.isSetValue() : false);
  }

  /**
   * Get the time duration for a complete dwell/group of pulses which all have
   * the same discrete Polarisation Tilt Angle value, or for a continuous wave
   * at a constant Polarisation Tilt Angle value.
   * <p>
   * @return the TiltAngleDuration value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleDuration() {
    return tiltAngleDuration;
  }

  /**
   * Set the time duration for a complete dwell/group of pulses which all have
   * the same discrete Polarisation Tilt Angle value, or for a continuous wave
   * at a constant Polarisation Tilt Angle value.
   * <p>
   * @param value the TiltAngleDuration value in a {@link TDecimal} data type
   */
  public void setTiltAngleDuration(TDecimal value) {
    this.tiltAngleDuration = value;
  }

  /**
   * Determine if the TiltAngleDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleDuration() {
    return (this.tiltAngleDuration != null ? this.tiltAngleDuration.isSetValue() : false);
  }

  /**
   * Get the upper end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than
   * US:TiltAngleExtremeMin.
   * <p>
   * @return the TiltAngleExtremeMax value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleExtremeMax() {
    return tiltAngleExtremeMax;
  }

  /**
   * Set the upper end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than
   * US:TiltAngleExtremeMin.
   * <p>
   * @param value the TiltAngleExtremeMax value in a {@link TDecimal} data type
   */
  public void setTiltAngleExtremeMax(TDecimal value) {
    this.tiltAngleExtremeMax = value;
  }

  /**
   * Determine if the TiltAngleExtremeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleExtremeMax() {
    return (this.tiltAngleExtremeMax != null ? this.tiltAngleExtremeMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * @return the TiltAngleExtremeMin value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleExtremeMin() {
    return tiltAngleExtremeMin;
  }

  /**
   * Set the lower end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * @param value the TiltAngleExtremeMin value in a {@link TDecimal} data type
   */
  public void setTiltAngleExtremeMin(TDecimal value) {
    this.tiltAngleExtremeMin = value;
  }

  /**
   * Determine if the TiltAngleExtremeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleExtremeMin() {
    return (this.tiltAngleExtremeMin != null ? this.tiltAngleExtremeMin.isSetValue() : false);
  }

  /**
   * Get the average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis.
   * <p>
   * @return the TiltAngleMean value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleMean() {
    return tiltAngleMean;
  }

  /**
   * Set the average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis.
   * <p>
   * @param value the TiltAngleMean value in a {@link TDecimal} data type
   */
  public void setTiltAngleMean(TDecimal value) {
    this.tiltAngleMean = value;
  }

  /**
   * Determine if the TiltAngleMean is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleMean() {
    return (this.tiltAngleMean != null ? this.tiltAngleMean.isSetValue() : false);
  }

  /**
   * Get the observed Polarisation Tilt Angle value that the signal most often
   * used, based on statistical study of the data set.
   * <p>
   * @return the TiltAngleMedian value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleMedian() {
    return tiltAngleMedian;
  }

  /**
   * Set the observed Polarisation Tilt Angle value that the signal most often
   * used, based on statistical study of the data set.
   * <p>
   * @param value the TiltAngleMedian value in a {@link TDecimal} data type
   */
  public void setTiltAngleMedian(TDecimal value) {
    this.tiltAngleMedian = value;
  }

  /**
   * Determine if the TiltAngleMedian is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleMedian() {
    return (this.tiltAngleMedian != null ? this.tiltAngleMedian.isSetValue() : false);
  }

  /**
   * Get the time duration for one complete cycle of a repeating Polarisation
   * Tilt Angle sequence
   * <p>
   * @return the TiltAnglePatternPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAnglePatternPeriod() {
    return tiltAnglePatternPeriod;
  }

  /**
   * Set the time duration for one complete cycle of a repeating Polarisation
   * Tilt Angle sequence
   * <p>
   * @param value the TiltAnglePatternPeriod value in a {@link TDecimal} data
   *              type
   */
  public void setTiltAnglePatternPeriod(TDecimal value) {
    this.tiltAnglePatternPeriod = value;
  }

  /**
   * Determine if the TiltAnglePatternPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAnglePatternPeriod() {
    return (this.tiltAnglePatternPeriod != null ? this.tiltAnglePatternPeriod.isSetValue() : false);
  }

  /**
   * Get In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive.
   * <p>
   * @return the TiltAnglePatternType value in a {@link TString} data type
   */
  public TString getTiltAnglePatternType() {
    return tiltAnglePatternType;
  }

  /**
   * Set In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive.
   * <p>
   * @param value the TiltAnglePatternType value in a {@link TString} data type
   */
  public void setTiltAnglePatternType(TString value) {
    this.tiltAnglePatternType = value;
  }

  /**
   * Determine if the TiltAnglePatternType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAnglePatternType() {
    return (this.tiltAnglePatternType != null ? this.tiltAnglePatternType.isSetValue() : false);
  }

  /**
   * Get the highest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than
   * US:TiltAngleRangeMin.
   * <p>
   * @return the TiltAngleRangeMax value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleRangeMax() {
    return tiltAngleRangeMax;
  }

  /**
   * Set the highest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than
   * US:TiltAngleRangeMin.
   * <p>
   * @param value the TiltAngleRangeMax value in a {@link TDecimal} data type
   */
  public void setTiltAngleRangeMax(TDecimal value) {
    this.tiltAngleRangeMax = value;
  }

  /**
   * Determine if the TiltAngleRangeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleRangeMax() {
    return (this.tiltAngleRangeMax != null ? this.tiltAngleRangeMax.isSetValue() : false);
  }

  /**
   * Get the lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics
   * <p>
   * @return the TiltAngleRangeMin value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleRangeMin() {
    return tiltAngleRangeMin;
  }

  /**
   * Set the lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics
   * <p>
   * @param value the TiltAngleRangeMin value in a {@link TDecimal} data type
   */
  public void setTiltAngleRangeMin(TDecimal value) {
    this.tiltAngleRangeMin = value;
  }

  /**
   * Determine if the TiltAngleRangeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleRangeMin() {
    return (this.tiltAngleRangeMin != null ? this.tiltAngleRangeMin.isSetValue() : false);
  }

  /**
   * Get the rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time.
   * <p>
   * @return the TiltAngleRate value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleRate() {
    return tiltAngleRate;
  }

  /**
   * Set the rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time.
   * <p>
   * @param value the TiltAngleRate value in a {@link TDecimal} data type
   */
  public void setTiltAngleRate(TDecimal value) {
    this.tiltAngleRate = value;
  }

  /**
   * Determine if the TiltAngleRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleRate() {
    return (this.tiltAngleRate != null ? this.tiltAngleRate.isSetValue() : false);
  }

  /**
   * Get a free text description of the sequence of Polarisation Tilt Angle
   * values.
   * <p>
   * @return the TiltAngleSequenceDesc value in a {@link TString} data type
   */
  public TString getTiltAngleSequenceDesc() {
    return tiltAngleSequenceDesc;
  }

  /**
   * Set a free text description of the sequence of Polarisation Tilt Angle
   * values.
   * <p>
   * @param value the TiltAngleSequenceDesc value in a {@link TString} data type
   */
  public void setTiltAngleSequenceDesc(TString value) {
    this.tiltAngleSequenceDesc = value;
  }

  /**
   * Determine if the TiltAngleSequenceDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleSequenceDesc() {
    return (this.tiltAngleSequenceDesc != null ? this.tiltAngleSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the standard deviation of the data set used to calculate Polarisation
   * Tilt Angle Mean fields.
   * <p>
   * @return the TiltAngleStdDev value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleStdDev() {
    return tiltAngleStdDev;
  }

  /**
   * Set the standard deviation of the data set used to calculate Polarisation
   * Tilt Angle Mean fields.
   * <p>
   * @param value the TiltAngleStdDev value in a {@link TDecimal} data type
   */
  public void setTiltAngleStdDev(TDecimal value) {
    this.tiltAngleStdDev = value;
  }

  /**
   * Determine if the TiltAngleStdDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleStdDev() {
    return (this.tiltAngleStdDev != null ? this.tiltAngleStdDev.isSetValue() : false);
  }

  /**
   * Get the delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values.
   * <p>
   * @return the TiltAngleStep value in a {@link TDecimal} data type
   */
  public TDecimal getTiltAngleStep() {
    return tiltAngleStep;
  }

  /**
   * Set the delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values.
   * <p>
   * @param value the TiltAngleStep value in a {@link TDecimal} data type
   */
  public void setTiltAngleStep(TDecimal value) {
    this.tiltAngleStep = value;
  }

  /**
   * Determine if the TiltAngleStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleStep() {
    return (this.tiltAngleStep != null ? this.tiltAngleStep.isSetValue() : false);
  }

  /**
   * Get the US:ObservedPolarisationValues
   * <p>
   * Complex element ObservedPolarisationValues (US) contains data describing
   * the parametric information for the polarization tilt angle specific values.
   * <p>
   * @return a non-null but possibly empty list of
   *         {@link ObservedPolarisationValues} instances
   */
  public List<ObservedPolarisationValues> getObservedPolarisationValues() {
    if (observedPolarisationValues == null) {
      observedPolarisationValues = new ArrayList<>();
    }
    return this.observedPolarisationValues;
  }

  /**
   * Determine if the ObservedPolarisationValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPolarisationValues() {
    return ((this.observedPolarisationValues != null) && (!this.observedPolarisationValues.isEmpty()));
  }

  /**
   * Clear the ObservedPolarisationValues field. This sets the field to null.
   */
  public void unsetObservedPolarisationValues() {
    this.observedPolarisationValues = null;
  }

  /**
   * Set the ratio of the polarisation ellipse major axis to its minor axis
   * expressed in decibels.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withAxialRatio(Double value) {
    setAxialRatio(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of unique discrete tilt angle values.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withNumTiltAngleElements(Integer value) {
    setNumTiltAngleElements(new TInteger(value));
    return this;
  }

  /**
   * Set the number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withNumTiltAnglePositions(Integer value) {
    setNumTiltAnglePositions(new TInteger(value));
    return this;
  }

  /**
   * Set the number of times per second that the polarisation ellipse
   * mechanically rotates through the same major axis tilt angle.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withPolarisationRotationRate(Double value) {
    setPolarisationRotationRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * @param value An instances of type {@link ListCPO}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withPolarisationType(ListCPO value) {
    setPolarisationType(new TString(value.value()));
    return this;
  }

  /**
   * Set the direction in which the polarisation ellipse is mechanically
   * rotating. The direction is relative to an observer standing behind the
   * radiator and looking toward the direction of mainbeam propagation.
   * <p>
   * @param value An instances of type {@link ListCRD}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withPolarisationDirection(ListCRD value) {
    setPolarisationDirection(new TString(value.value()));
    return this;
  }

  /**
   * Set the rotation direction of the radiated electromagnetic wave electric
   * field (E-field) vector (E) relative to the direction of propagation. This
   * is typically the opposite of Polarisation Direction.
   * <p>
   * @param value An instances of type {@link ListCRD}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withPolarisationSense(ListCRD value) {
    setPolarisationSense(new TString(value.value()));
    return this;
  }

  /**
   * Set the condition which controls, or can be associated with, the signals
   * Tilt Angle variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleAdaptiveDriverDesc(String value) {
    setTiltAngleAdaptiveDriverDesc(new TString(value));
    return this;
  }

  /**
   * Set the rule which describes the signal Polarisation Tilt Angle variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleAdaptiveRuleDesc(String value) {
    setTiltAngleAdaptiveRuleDesc(new TString(value));
    return this;
  }

  /**
   * Set whether the tilt angle variations are Discrete or Continuous. Discrete
   * uses a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleContinuous(ListCBO value) {
    setTiltAngleContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set the time duration for a complete dwell/group of pulses which all have
   * the same discrete Polarisation Tilt Angle value, or for a continuous wave
   * at a constant Polarisation Tilt Angle value.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleDuration(Double value) {
    setTiltAngleDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set the upper end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than
   * US:TiltAngleExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleExtremeMax(Double value) {
    setTiltAngleExtremeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lower end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleExtremeMin(Double value) {
    setTiltAngleExtremeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleMean(Double value) {
    setTiltAngleMean(new TDecimal(value));
    return this;
  }

  /**
   * Set the observed Polarisation Tilt Angle value that the signal most often
   * used, based on statistical study of the data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleMedian(Double value) {
    setTiltAngleMedian(new TDecimal(value));
    return this;
  }

  /**
   * Set the time duration for one complete cycle of a repeating Polarisation
   * Tilt Angle sequence
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAnglePatternPeriod(Double value) {
    setTiltAnglePatternPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAnglePatternType(ListUS7 value) {
    setTiltAnglePatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set the highest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than
   * US:TiltAngleRangeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleRangeMax(Double value) {
    setTiltAngleRangeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleRangeMin(Double value) {
    setTiltAngleRangeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleRate(Double value) {
    setTiltAngleRate(new TDecimal(value));
    return this;
  }

  /**
   * Set a free text description of the sequence of Polarisation Tilt Angle
   * values.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleSequenceDesc(String value) {
    setTiltAngleSequenceDesc(new TString(value));
    return this;
  }

  /**
   * Set the standard deviation of the data set used to calculate Polarisation
   * Tilt Angle Mean fields.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleStdDev(Double value) {
    setTiltAngleStdDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withTiltAngleStep(Double value) {
    setTiltAngleStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the US:ObservedPolarisationValues
   * <p>
   * Complex element ObservedPolarisationValues (US) contains data describing
   * the parametric information for the polarization tilt angle specific values.
   * <p>
   * @param values One or more instances of type
   *               {@link ObservedPolarisationValues}
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withObservedPolarisationValues(ObservedPolarisationValues... values) {
    if (values != null) {
      getObservedPolarisationValues().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedPolarisationValues
   * <p>
   * Complex element ObservedPolarisationValues (US) contains data describing
   * the parametric information for the polarization tilt angle specific values.
   * <p>
   * @param values A collection of {@link ObservedPolarisationValues} instances
   * @return The current ObservedPolarisationAnalysis object instance
   */
  public ObservedPolarisationAnalysis withObservedPolarisationValues(Collection<ObservedPolarisationValues> values) {
    if (values != null) {
      getObservedPolarisationValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedPolarisationAnalysis instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedPolarisationAnalysis {"
      + (numTiltAngleElements != null ? " numTiltAngleElements [" + numTiltAngleElements + "]" : "")
      + (polarisationType != null ? " polarisationType [" + polarisationType + "]" : "")
      + (polarisationRotationRate != null ? " polarisationRotationRate [" + polarisationRotationRate + "]" : "")
      + (tiltAngleAdaptiveRuleDesc != null ? " tiltAngleAdaptiveRuleDesc [" + tiltAngleAdaptiveRuleDesc + "]" : "")
      + (numTiltAnglePositions != null ? " numTiltAnglePositions [" + numTiltAnglePositions + "]" : "")
      + (tiltAngleDuration != null ? " tiltAngleDuration [" + tiltAngleDuration + "]" : "")
      + (tiltAngleContinuous != null ? " tiltAngleContinuous [" + tiltAngleContinuous + "]" : "")
      + (axialRatio != null ? " axialRatio [" + axialRatio + "]" : "")
      + (tiltAngleExtremeMax != null ? " tiltAngleExtremeMax [" + tiltAngleExtremeMax + "]" : "")
      + (tiltAngleExtremeMin != null ? " tiltAngleExtremeMin [" + tiltAngleExtremeMin + "]" : "")
      + (tiltAngleSequenceDesc != null ? " tiltAngleSequenceDesc [" + tiltAngleSequenceDesc + "]" : "")
      + (tiltAngleMedian != null ? " tiltAngleMedian [" + tiltAngleMedian + "]" : "")
      + (tiltAngleMean != null ? " tiltAngleMean [" + tiltAngleMean + "]" : "")
      + (polarisationDirection != null ? " polarisationDirection [" + polarisationDirection + "]" : "")
      + (tiltAnglePatternType != null ? " tiltAnglePatternType [" + tiltAnglePatternType + "]" : "")
      + (tiltAngleAdaptiveDriverDesc != null ? " tiltAngleAdaptiveDriverDesc [" + tiltAngleAdaptiveDriverDesc + "]" : "")
      + (tiltAnglePatternPeriod != null ? " tiltAnglePatternPeriod [" + tiltAnglePatternPeriod + "]" : "")
      + (tiltAngleStep != null ? " tiltAngleStep [" + tiltAngleStep + "]" : "")
      + (tiltAngleStdDev != null ? " tiltAngleStdDev [" + tiltAngleStdDev + "]" : "")
      + (observedPolarisationValues != null ? " observedPolarisationValues [" + observedPolarisationValues + "]" : "")
      + (tiltAngleRate != null ? " tiltAngleRate [" + tiltAngleRate + "]" : "")
      + (polarisationSense != null ? " polarisationSense [" + polarisationSense + "]" : "")
      + (tiltAngleRangeMax != null ? " tiltAngleRangeMax [" + tiltAngleRangeMax + "]" : "")
      + (tiltAngleRangeMin != null ? " tiltAngleRangeMin [" + tiltAngleRangeMin + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPolarisationAnalysis} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
