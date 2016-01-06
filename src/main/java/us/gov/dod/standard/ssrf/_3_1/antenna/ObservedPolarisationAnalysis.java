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
package us.gov.dod.standard.ssrf._3_1.antenna;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AxialRatio", required = false)
  private Unsigned_DB_5_2 axialRatio;
  /**
   * US:NumTiltAngleElements - Num Tilt Angle Elements (Optional)
   * <p>
   * The number of unique discrete tilt angle values.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumTiltAngleElements", required = false)
  private UN6 numTiltAngleElements;
  /**
   * US:NumTiltAnglePositions - Num Tilt Angle Positions (Optional)
   * <p>
   * The number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumTiltAnglePositions", required = false)
  private UN6 numTiltAnglePositions;
  /**
   * US:PolarisationRotationRate - Polarisation Rotation Rate (Optional)
   * <p>
   * The number of times per second that the polarisation ellipse mechanically
   * rotates through the same major axis tilt angle.
   * <p>
   * Format is UN(7,2) (scans/min)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PolarisationRotationRate", required = false)
  private US_ScanRate polarisationRotationRate;
  /**
   * US:PolarisationType - Polarisation Type (Optional)
   * <p>
   * The polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * Format is L:CPO
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleAdaptiveDriverDesc", required = false)
  private S500 tiltAngleAdaptiveDriverDesc;
  /**
   * US:TiltAngleAdaptiveRuleDesc - Tilt Angle Adaptive Rule Description
   * (Optional)
   * <p>
   * The rule which describes the signal Polarisation Tilt Angle variations.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleAdaptiveRuleDesc", required = false)
  private S500 tiltAngleAdaptiveRuleDesc;
  /**
   * US:TiltAngleContinuous - Tilt Angle Continuous (Optional)
   * <p>
   * Whether the tilt angle variations are Discrete or Continuous. Discrete uses
   * a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleDuration", required = false)
  private microsecs tiltAngleDuration;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleExtremeMax", required = false)
  private US_Deg_Signed tiltAngleExtremeMax;
  /**
   * US:TiltAngleExtremeMin - Minimum Tilt Angle Extreme (Optional)
   * <p>
   * The lower end of the range of Polarisation Tilt Angle values that represent
   * 100% of observed Tilt Angle values, from a statistical study of the data
   * set.
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleExtremeMin", required = false)
  private US_Deg_Signed tiltAngleExtremeMin;
  /**
   * US:TiltAngleMean - Average Tilt Angle (Optional)
   * <p>
   * The average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis.
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleMean", required = false)
  private US_Deg_Signed tiltAngleMean;
  /**
   * US:TiltAngleMedian - Most Probable Tilt Angle (Optional)
   * <p>
   * The observed Polarisation Tilt Angle value that the signal most often used,
   * based on statistical study of the data set.
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleMedian", required = false)
  private US_Deg_Signed tiltAngleMedian;
  /**
   * US:TiltAnglePatternPeriod - Tilt Angle Pattern Period (Optional)
   * <p>
   * The time duration for one complete cycle of a repeating Polarisation Tilt
   * Angle sequence
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAnglePatternPeriod", required = false)
  private microsecs tiltAnglePatternPeriod;
  /**
   * In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive.
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleRangeMax", required = false)
  private US_Deg_Signed tiltAngleRangeMax;
  /**
   * US:TiltAngleRangeMin - Tilt Angle Range Min (Optional)
   * <p>
   * The lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleRangeMin", required = false)
  private US_Deg_Signed tiltAngleRangeMin;
  /**
   * US:TiltAngleRate - TiltAngle Rate (Optional)
   * <p>
   * The rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time.
   * <p>
   * Format is SN(5,2) (deg/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleRate", required = false)
  private US_TiltAngRate tiltAngleRate;
  /**
   * US:TiltAngleSequenceDesc - Tilt Angle Sequence Description (Optional)
   * <p>
   * A free text description of the sequence of Polarisation Tilt Angle values.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleSequenceDesc", required = false)
  private S500 tiltAngleSequenceDesc;
  /**
   * US:TiltAngleStdDev - Tilt Angle Standard Deviation (Optional)
   * <p>
   * The standard deviation of the data set used to calculate Polarisation Tilt
   * Angle Mean fields.
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleStdDev", required = false)
  private US_Deg_Signed tiltAngleStdDev;
  /**
   * US:TiltAngleStep - Tilt Angle Step (Optional)
   * <p>
   * The delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values.
   * <p>
   * Format is SN(5,2) (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TiltAngleStep", required = false)
  private US_Deg_Signed tiltAngleStep;
  /**
   * US:ObservedPolarisationValues (Optional)
   * <p>
   * ObservedPolarisationValues (US) contains data describing the parametric
   * information for the polarization tilt angle specific values.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedPolarisationValues")
  private Set<ObservedPolarisationValues> observedPolarisationValues;

  /**
   * Get the ratio of the polarisation ellipse major axis to its minor axis
   * expressed in decibels..
   * <p>
   * @return a {@link Unsigned_DB_5_2} instance
   * @since 3.1.0
   */
  public Unsigned_DB_5_2 getAxialRatio() {
    return axialRatio;
  }

  /**
   * Set the ratio of the polarisation ellipse major axis to its minor axis
   * expressed in decibels..
   * <p>
   * @param value a {@link Unsigned_DB_5_2} instance
   * @since 3.1.0
   */
  public void setAxialRatio(Unsigned_DB_5_2 value) {
    this.axialRatio = value;
  }

  /**
   * Determine if the AxialRatio is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAxialRatio() {
    return (this.axialRatio != null ? this.axialRatio.isSetValue() : false);
  }

  /**
   * Get the number of unique discrete tilt angle values..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumTiltAngleElements() {
    return numTiltAngleElements;
  }

  /**
   * Set the number of unique discrete tilt angle values..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumTiltAngleElements(UN6 value) {
    this.numTiltAngleElements = value;
  }

  /**
   * Determine if the NumTiltAngleElements is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumTiltAngleElements() {
    return (this.numTiltAngleElements != null ? this.numTiltAngleElements.isSetValue() : false);
  }

  /**
   * Get the number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence..
   * <p>
   * @return a {@link UN6} instance
   * @since 3.1.0
   */
  public UN6 getNumTiltAnglePositions() {
    return numTiltAnglePositions;
  }

  /**
   * Set the number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence..
   * <p>
   * @param value a {@link UN6} instance
   * @since 3.1.0
   */
  public void setNumTiltAnglePositions(UN6 value) {
    this.numTiltAnglePositions = value;
  }

  /**
   * Determine if the NumTiltAnglePositions is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumTiltAnglePositions() {
    return (this.numTiltAnglePositions != null ? this.numTiltAnglePositions.isSetValue() : false);
  }

  /**
   * Get the number of times per second that the polarisation ellipse
   * mechanically rotates through the same major axis tilt angle..
   * <p>
   * @return a {@link US_ScanRate} instance
   * @since 3.1.0
   */
  public US_ScanRate getPolarisationRotationRate() {
    return polarisationRotationRate;
  }

  /**
   * Set the number of times per second that the polarisation ellipse
   * mechanically rotates through the same major axis tilt angle..
   * <p>
   * @param value a {@link US_ScanRate} instance
   * @since 3.1.0
   */
  public void setPolarisationRotationRate(US_ScanRate value) {
    this.polarisationRotationRate = value;
  }

  /**
   * Determine if the PolarisationRotationRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationRotationRate() {
    return (this.polarisationRotationRate != null ? this.polarisationRotationRate.isSetValue() : false);
  }

  /**
   * Get the polarisation of the radio wave referenced to the direction of
   * propagation..
   * <p>
   * @return the PolarisationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Set the polarisation of the radio wave referenced to the direction of
   * propagation..
   * <p>
   * @param value the PolarisationType value in a {@link TString} data type
   * @since 3.1.0
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
   * radiator and looking toward the direction of mainbeam propagation..
   * <p>
   * @return the PolarisationDirection value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPolarisationDirection() {
    return polarisationDirection;
  }

  /**
   * Set the direction in which the polarisation ellipse is mechanically
   * rotating. The direction is relative to an observer standing behind the
   * radiator and looking toward the direction of mainbeam propagation..
   * <p>
   * @param value the PolarisationDirection value in a {@link TString} data type
   * @since 3.1.0
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
   * is typically the opposite of Polarisation Direction..
   * <p>
   * @return the PolarisationSense value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPolarisationSense() {
    return polarisationSense;
  }

  /**
   * Set the rotation direction of the radiated electromagnetic wave electric
   * field (E-field) vector (E) relative to the direction of propagation. This
   * is typically the opposite of Polarisation Direction..
   * <p>
   * @param value the PolarisationSense value in a {@link TString} data type
   * @since 3.1.0
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
   * Tilt Angle variations..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getTiltAngleAdaptiveDriverDesc() {
    return tiltAngleAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls, or can be associated with, the signals
   * Tilt Angle variations..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setTiltAngleAdaptiveDriverDesc(S500 value) {
    this.tiltAngleAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the TiltAngleAdaptiveDriverDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleAdaptiveDriverDesc() {
    return (this.tiltAngleAdaptiveDriverDesc != null ? this.tiltAngleAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal Polarisation Tilt Angle
   * variations..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getTiltAngleAdaptiveRuleDesc() {
    return tiltAngleAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal Polarisation Tilt Angle
   * variations..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setTiltAngleAdaptiveRuleDesc(S500 value) {
    this.tiltAngleAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the TiltAngleAdaptiveRuleDesc is configured.
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
   * ranges..
   * <p>
   * @return the TiltAngleContinuous value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTiltAngleContinuous() {
    return tiltAngleContinuous;
  }

  /**
   * Set whether the tilt angle variations are Discrete or Continuous. Discrete
   * uses a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges..
   * <p>
   * @param value the TiltAngleContinuous value in a {@link TString} data type
   * @since 3.1.0
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
   * at a constant Polarisation Tilt Angle value..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getTiltAngleDuration() {
    return tiltAngleDuration;
  }

  /**
   * Set the time duration for a complete dwell/group of pulses which all have
   * the same discrete Polarisation Tilt Angle value, or for a continuous wave
   * at a constant Polarisation Tilt Angle value..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setTiltAngleDuration(microsecs value) {
    this.tiltAngleDuration = value;
  }

  /**
   * Determine if the TiltAngleDuration is configured.
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
   * US:TiltAngleExtremeMin..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleExtremeMax() {
    return tiltAngleExtremeMax;
  }

  /**
   * Set the upper end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleExtremeMax is used, it MUST be greater than
   * US:TiltAngleExtremeMin..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleExtremeMax(US_Deg_Signed value) {
    this.tiltAngleExtremeMax = value;
  }

  /**
   * Determine if the TiltAngleExtremeMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleExtremeMax() {
    return (this.tiltAngleExtremeMax != null ? this.tiltAngleExtremeMax.isSetValue() : false);
  }

  /**
   * Get the lower end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleExtremeMin() {
    return tiltAngleExtremeMin;
  }

  /**
   * Set the lower end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleExtremeMin(US_Deg_Signed value) {
    this.tiltAngleExtremeMin = value;
  }

  /**
   * Determine if the TiltAngleExtremeMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleExtremeMin() {
    return (this.tiltAngleExtremeMin != null ? this.tiltAngleExtremeMin.isSetValue() : false);
  }

  /**
   * Get the average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleMean() {
    return tiltAngleMean;
  }

  /**
   * Set the average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleMean(US_Deg_Signed value) {
    this.tiltAngleMean = value;
  }

  /**
   * Determine if the TiltAngleMean is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleMean() {
    return (this.tiltAngleMean != null ? this.tiltAngleMean.isSetValue() : false);
  }

  /**
   * Get the observed Polarisation Tilt Angle value that the signal most often
   * used, based on statistical study of the data set..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleMedian() {
    return tiltAngleMedian;
  }

  /**
   * Set the observed Polarisation Tilt Angle value that the signal most often
   * used, based on statistical study of the data set..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleMedian(US_Deg_Signed value) {
    this.tiltAngleMedian = value;
  }

  /**
   * Determine if the TiltAngleMedian is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleMedian() {
    return (this.tiltAngleMedian != null ? this.tiltAngleMedian.isSetValue() : false);
  }

  /**
   * Get the time duration for one complete cycle of a repeating Polarisation
   * Tilt Angle sequence.
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getTiltAnglePatternPeriod() {
    return tiltAnglePatternPeriod;
  }

  /**
   * Set the time duration for one complete cycle of a repeating Polarisation
   * Tilt Angle sequence.
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setTiltAnglePatternPeriod(microsecs value) {
    this.tiltAnglePatternPeriod = value;
  }

  /**
   * Determine if the TiltAnglePatternPeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAnglePatternPeriod() {
    return (this.tiltAnglePatternPeriod != null ? this.tiltAnglePatternPeriod.isSetValue() : false);
  }

  /**
   * Get In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive..
   * <p>
   * @return the TiltAnglePatternType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getTiltAnglePatternType() {
    return tiltAnglePatternType;
  }

  /**
   * Set In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive..
   * <p>
   * @param value the TiltAnglePatternType value in a {@link TString} data type
   * @since 3.1.0
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
   * US:TiltAngleRangeMin..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleRangeMax() {
    return tiltAngleRangeMax;
  }

  /**
   * Set the highest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics.
   * <p>
   * [XSL ERR MINMAX] If US:TiltAngleRangeMax is used, it MUST be greater than
   * US:TiltAngleRangeMin..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleRangeMax(US_Deg_Signed value) {
    this.tiltAngleRangeMax = value;
  }

  /**
   * Determine if the TiltAngleRangeMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleRangeMax() {
    return (this.tiltAngleRangeMax != null ? this.tiltAngleRangeMax.isSetValue() : false);
  }

  /**
   * Get the lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics.
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleRangeMin() {
    return tiltAngleRangeMin;
  }

  /**
   * Set the lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics.
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleRangeMin(US_Deg_Signed value) {
    this.tiltAngleRangeMin = value;
  }

  /**
   * Determine if the TiltAngleRangeMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleRangeMin() {
    return (this.tiltAngleRangeMin != null ? this.tiltAngleRangeMin.isSetValue() : false);
  }

  /**
   * Get the rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time..
   * <p>
   * @return a {@link US_TiltAngRate} instance
   * @since 3.1.0
   */
  public US_TiltAngRate getTiltAngleRate() {
    return tiltAngleRate;
  }

  /**
   * Set the rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time..
   * <p>
   * @param value a {@link US_TiltAngRate} instance
   * @since 3.1.0
   */
  public void setTiltAngleRate(US_TiltAngRate value) {
    this.tiltAngleRate = value;
  }

  /**
   * Determine if the TiltAngleRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleRate() {
    return (this.tiltAngleRate != null ? this.tiltAngleRate.isSetValue() : false);
  }

  /**
   * Get a free text description of the sequence of Polarisation Tilt Angle
   * values..
   * <p>
   * @return a {@link S500} instance
   * @since 3.1.0
   */
  public S500 getTiltAngleSequenceDesc() {
    return tiltAngleSequenceDesc;
  }

  /**
   * Set a free text description of the sequence of Polarisation Tilt Angle
   * values..
   * <p>
   * @param value a {@link S500} instance
   * @since 3.1.0
   */
  public void setTiltAngleSequenceDesc(S500 value) {
    this.tiltAngleSequenceDesc = value;
  }

  /**
   * Determine if the TiltAngleSequenceDesc is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleSequenceDesc() {
    return (this.tiltAngleSequenceDesc != null ? this.tiltAngleSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the standard deviation of the data set used to calculate Polarisation
   * Tilt Angle Mean fields..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleStdDev() {
    return tiltAngleStdDev;
  }

  /**
   * Set the standard deviation of the data set used to calculate Polarisation
   * Tilt Angle Mean fields..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleStdDev(US_Deg_Signed value) {
    this.tiltAngleStdDev = value;
  }

  /**
   * Determine if the TiltAngleStdDev is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTiltAngleStdDev() {
    return (this.tiltAngleStdDev != null ? this.tiltAngleStdDev.isSetValue() : false);
  }

  /**
   * Get the delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values..
   * <p>
   * @return a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public US_Deg_Signed getTiltAngleStep() {
    return tiltAngleStep;
  }

  /**
   * Set the delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values..
   * <p>
   * @param value a {@link US_Deg_Signed} instance
   * @since 3.1.0
   */
  public void setTiltAngleStep(US_Deg_Signed value) {
    this.tiltAngleStep = value;
  }

  /**
   * Determine if the TiltAngleStep is configured.
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
   * the parametric information for the polarization tilt angle specific
   * values..
   * <p>
   * @return a {@link ObservedPolarisationValues} instance
   * @since 3.1.0
   */
  public Set<ObservedPolarisationValues> getObservedPolarisationValues() {
    if (observedPolarisationValues == null) {
      observedPolarisationValues = new HashSet<>();
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
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withAxialRatio(Double value) {
    setAxialRatio(new Unsigned_DB_5_2(value));
    return this;
  }

  /**
   * Set the number of unique discrete tilt angle values.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withNumTiltAngleElements(Integer value) {
    setNumTiltAngleElements(new UN6(value));
    return this;
  }

  /**
   * Set the number of discrete Polarisation Tilt Angles used in a repeating
   * Polarisation Tilt Angle sequence.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withNumTiltAnglePositions(Integer value) {
    setNumTiltAnglePositions(new UN6(value));
    return this;
  }

  /**
   * Set the number of times per second that the polarisation ellipse
   * mechanically rotates through the same major axis tilt angle.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withPolarisationRotationRate(Double value) {
    setPolarisationRotationRate(new US_ScanRate(value));
    return this;
  }

  /**
   * Set the polarisation of the radio wave referenced to the direction of
   * propagation.
   * <p>
   * @param value An instances of type {@link ListCPO}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link ListCRD}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link ListCRD}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withPolarisationSense(ListCRD value) {
    setPolarisationSense(new TString(value.value()));
    return this;
  }

  /**
   * Set the condition which controls, or can be associated with, the signals
   * Tilt Angle variations.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleAdaptiveDriverDesc(String value) {
    setTiltAngleAdaptiveDriverDesc(new S500(value));
    return this;
  }

  /**
   * Set the rule which describes the signal Polarisation Tilt Angle variations.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleAdaptiveRuleDesc(String value) {
    setTiltAngleAdaptiveRuleDesc(new S500(value));
    return this;
  }

  /**
   * Set whether the tilt angle variations are Discrete or Continuous. Discrete
   * uses a finite number of fixed values separated by ranges of unused values.
   * Continuous potentially uses an infinite number of values within one or more
   * ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleDuration(Double value) {
    setTiltAngleDuration(new microsecs(value));
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
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleExtremeMax(Double value) {
    setTiltAngleExtremeMax(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the lower end of the range of Polarisation Tilt Angle values that
   * represent 100% of observed Tilt Angle values, from a statistical study of
   * the data set.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleExtremeMin(Double value) {
    setTiltAngleExtremeMin(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the average Polarisation Tilt Angle value for a signal which changes
   * Polarisation Tilt Angle values on a non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleMean(Double value) {
    setTiltAngleMean(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the observed Polarisation Tilt Angle value that the signal most often
   * used, based on statistical study of the data set.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleMedian(Double value) {
    setTiltAngleMedian(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the time duration for one complete cycle of a repeating Polarisation
   * Tilt Angle sequence
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAnglePatternPeriod(Double value) {
    setTiltAnglePatternPeriod(new microsecs(value));
    return this;
  }

  /**
   * Set In Data Item TiltAnglePatternType (US), indicate whether Tilt Angle is
   * unmodulated or Tilt Angle variations are Patterned, Non-Patterned, or
   * Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleRangeMax(Double value) {
    setTiltAngleRangeMax(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the lowest discrete Polarisation Tilt Angle value found in a single
   * intercept that contains the complete Polarisation Tilt Angle
   * characteristics
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleRangeMin(Double value) {
    setTiltAngleRangeMin(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the rate of change for Polarisation Tilt Angle variations expressed in
   * Polarisation Tilt Angle changes per unit of time.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleRate(Double value) {
    setTiltAngleRate(new US_TiltAngRate(value));
    return this;
  }

  /**
   * Set a free text description of the sequence of Polarisation Tilt Angle
   * values.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleSequenceDesc(String value) {
    setTiltAngleSequenceDesc(new S500(value));
    return this;
  }

  /**
   * Set the standard deviation of the data set used to calculate Polarisation
   * Tilt Angle Mean fields.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleStdDev(Double value) {
    setTiltAngleStdDev(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the delta between the Most Probable Polarisation Tilt Angle values of
   * adjacent and discrete Polarisation Tilt Angle values.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
   */
  public ObservedPolarisationAnalysis withTiltAngleStep(Double value) {
    setTiltAngleStep(new US_Deg_Signed(value));
    return this;
  }

  /**
   * Set the US:ObservedPolarisationValues
   * <p>
   * Complex element ObservedPolarisationValues (US) contains data describing
   * the parametric information for the polarization tilt angle specific values.
   * <p>
   * @param values One or more instances of type
   *               {@link ObservedPolarisationValues...}.
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
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
   * @return The current ObservedPolarisationAnalysis object instance.
   * @since 3.1.0
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
    return "\n  ObservedPolarisationAnalysis {"
           + (axialRatio != null ? " axialRatio [" + axialRatio + "]" : "")
           + (numTiltAngleElements != null ? " numTiltAngleElements [" + numTiltAngleElements + "]" : "")
           + (numTiltAnglePositions != null ? " numTiltAnglePositions [" + numTiltAnglePositions + "]" : "")
           + (observedPolarisationValues != null ? " observedPolarisationValues [" + observedPolarisationValues + "]" : "")
           + (polarisationDirection != null ? " polarisationDirection [" + polarisationDirection + "]" : "")
           + (polarisationRotationRate != null ? " polarisationRotationRate [" + polarisationRotationRate + "]" : "")
           + (polarisationSense != null ? " polarisationSense [" + polarisationSense + "]" : "")
           + (polarisationType != null ? " polarisationType [" + polarisationType + "]" : "")
           + (tiltAngleAdaptiveDriverDesc != null ? " tiltAngleAdaptiveDriverDesc [" + tiltAngleAdaptiveDriverDesc + "]" : "")
           + (tiltAngleAdaptiveRuleDesc != null ? " tiltAngleAdaptiveRuleDesc [" + tiltAngleAdaptiveRuleDesc + "]" : "")
           + (tiltAngleContinuous != null ? " tiltAngleContinuous [" + tiltAngleContinuous + "]" : "")
           + (tiltAngleDuration != null ? " tiltAngleDuration [" + tiltAngleDuration + "]" : "")
           + (tiltAngleExtremeMax != null ? " tiltAngleExtremeMax [" + tiltAngleExtremeMax + "]" : "")
           + (tiltAngleExtremeMin != null ? " tiltAngleExtremeMin [" + tiltAngleExtremeMin + "]" : "")
           + (tiltAngleMean != null ? " tiltAngleMean [" + tiltAngleMean + "]" : "")
           + (tiltAngleMedian != null ? " tiltAngleMedian [" + tiltAngleMedian + "]" : "")
           + (tiltAnglePatternPeriod != null ? " tiltAnglePatternPeriod [" + tiltAnglePatternPeriod + "]" : "")
           + (tiltAnglePatternType != null ? " tiltAnglePatternType [" + tiltAnglePatternType + "]" : "")
           + (tiltAngleRangeMax != null ? " tiltAngleRangeMax [" + tiltAngleRangeMax + "]" : "")
           + (tiltAngleRangeMin != null ? " tiltAngleRangeMin [" + tiltAngleRangeMin + "]" : "")
           + (tiltAngleRate != null ? " tiltAngleRate [" + tiltAngleRate + "]" : "")
           + (tiltAngleSequenceDesc != null ? " tiltAngleSequenceDesc [" + tiltAngleSequenceDesc + "]" : "")
           + (tiltAngleStdDev != null ? " tiltAngleStdDev [" + tiltAngleStdDev + "]" : "")
           + (tiltAngleStep != null ? " tiltAngleStep [" + tiltAngleStep + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedPolarisationAnalysis} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
