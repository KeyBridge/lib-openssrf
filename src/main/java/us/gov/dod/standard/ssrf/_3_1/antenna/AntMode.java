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
import us.gov.dod.standard.ssrf._3_1.Antenna;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;

/**
 * AntMode contains the technical characteristics of one antenna mode.
 * <p>
 * Element of {@link Antenna}
 * <p>
 * Sub-Elements are
 * {@link AntEfficiency}, {@link AntFreqs}, {@link AntGain}, {@link AntPattern}, {@link ObservedLobeAnalysis}, {@link ObservedPolarisationAnalysis}, {@link ObservedScanAnalysis}, {@link VSWR}
 * <p>
 * Example:
 * <pre>
 * &lt;AntMode&gt;
 *   &lt;ModeID cls="U"&gt;SURVEILLANCE&lt;/ModeID&gt;
 *   &lt;MotionType cls="U"&gt;Rotating&lt;/MotionType&gt;
 *   &lt;PolarisationType cls="U"&gt;Vertical linear&lt;/PolarisationType&gt;
 *   &lt;RotationRateMin cls="U"&gt;30&lt;/RotationRateMin&gt;
 *   &lt;other_AntMode_elements/&gt;
 *   &lt;/AntMode&gt;
 * </pre>
 *
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntMode", propOrder = {
  "modeID",
  "description",
  "modeUse",
  "motionType",
  "sectBlanking",
  "polarisationType",
  "polarisationAngle",
  "horzScanSpeed",
  "horzScanRate",
  "horzScanType",
  "horzScanSector",
  "vertScanSpeed",
  "vertScanRate",
  "vertScanType",
  "vertScanAngleMin",
  "vertScanAngleMax",
  "rotationDirection",
  "rotationRateMin",
  "rotationRateMax",
  "horzBwMin",
  "horzBwMax",
  "vertBwMin",
  "vertBwMax",
  "beamType",
  "maxPower",
  "portIsolation",
  "modeName",
  "antGain",
  "antFreqs",
  "antPattern",
  "antEfficiency",
  "vswr",
  "observedLobeAnalysis",
  "observedPolarisationAnalysis",
  "observedScanAnalysis"
})
public class AntMode {

  /**
   * ModeID - Mode Identifier (Required) * A short name for the mode; this name
   * should be a meaningful identification of the mode, but it can also be
   * automatically generated in some systems. The Name MUST be unique within the
   * dataset and SHOULD NOT be modified during the entire lifetime of the
   * dataset.
   * <p>
   * Format is S20
   * <p>
   * Attribute group ModeInfo (Required)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ModeID", required = true)
  private S20 modeID;
  /**
   * Description - Mode Description (Optional) * A description of the
   * operational mode; this description should be a meaningful explanation of
   * the mode main characteristics.
   * <p>
   * Format is S100
   * <p>
   * Attribute group ModeInfo (Required)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private S100 description;
  /**
   * In Data Item ModeUse, indicate if the mode is used for transmit, receive,
   * or both transmit and receive.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ModeUse", required = false)
  private TString modeUse;
  /**
   * MotionType - Antenna Motion Type (Optional) * The general category for the
   * movement of a scanning or tracking antenna.
   * <p>
   * Format is L:CAD
   *
   * @since 3.1.0
   */
  @XmlElement(name = "MotionType", required = false)
  private TString motionType;
  /**
   * SectBlanking - Sector Blanking (Optional) * "Yes" if sector blanking is
   * possible and "No" if it is not possible.
   * <p>
   * Format is L:CBO
   *
   * @since 3.1.0
   */
  @XmlElement(name = "SectBlanking", required = false)
  private TString sectBlanking;
  /**
   * PolarisationType - Type of Polarisation (Required) * The principal
   * orientation of the electric field of the electromagnetic wave for an
   * antenna.
   * <p>
   * Format is L:CPO
   * <p>
   * Attribute group Pol (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "PolarisationType")
  private TString polarisationType;
  /**
   * PolarisationAngle - Polarisation Angle (Optional) * The angle of the
   * electric field vector measured counter-clockwise from the equatorial plane
   * as referenced from the boresight or typical static positioning of the
   * antenna.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Pol (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "PolarisationAngle", required = false)
  private Az polarisationAngle;
  /**
   * HorzScanSpeed - Horizontal Scan Speed (Optional) * The number of degrees
   * per second the antenna is capable of scanning. It is not necessarily the
   * "Sector Scanned" figure times the degrees per second. If a significant
   * portion of time is spent vertically scanning in between horizontal sweeps,
   * the horizontal scan rate will be lower than if the antenna were
   * horizontally scanning all the time.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group HorzScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanSpeed", required = false)
  private ScanSpeed horzScanSpeed;
  /**
   * HorzScanRate - Horizontal Scan Rate (Optional) * The number of complete
   * scans the antenna is capable of making each minute.
   * <p>
   * Format is UN(4) (scans/min)
   * <p>
   * Attribute group HorzScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanRate", required = false)
  private ScanRate horzScanRate;
  /**
   * HorzScanType - Horizontal Scan Type (Optional) * The antenna horizontal
   * scanning capability.
   * <p>
   * Format is L:CAS
   * <p>
   * Attribute group HorzScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanType", required = false)
  private TString horzScanType;
  /**
   * HorzScanSector - Horizontal Scan Sector (Optional) * The maximum horizontal
   * sector the antenna can scan (enter 360 for a full rotation).
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group HorzScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "HorzScanSector", required = false)
  private Az horzScanSector;
  /**
   * VertScanSpeed - Vertical Scan Speed (Optional) * The number of degrees of
   * vertical scan per second. If an antenna does a horizontal scan per second
   * as part of a raster scan and drops down one degree after each sweep, it is
   * scanning vertically at one degree per second. If the same antenna completed
   * a scan in 30 seconds the vertical scan speed would be 2 degrees per minute.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group VertScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanSpeed", required = false)
  private ScanSpeed vertScanSpeed;
  /**
   * VertScanRate - Vertical Scan Rate (Optional) * The number of complete
   * vertical scans per minute. If the antenna does a horizontal scan per second
   * as part of a raster scan and drops down one degree after each sweep, it is
   * scanning vertically at one degree per second. If the same antenna completed
   * a scan in 30 seconds the vertical scan rate would be 2 scans per minute.
   * <p>
   * Format is UN(4) (scans/min)
   * <p>
   * Attribute group VertScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanRate", required = false)
  private ScanRate vertScanRate;
  /**
   * VertScanType - Vertical Scan Type (Optional) * The antenna vertical
   * scanning capability.
   * <p>
   * Format is L:CAS
   * <p>
   * Attribute group VertScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanType", required = false)
  private TString vertScanType;
  /**
   * VertScanAngleMin - Vertical Scan Minimum Angle (Optional) * The minimum
   * limit of the vertical arc scanned relative to the horizontal.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * Attribute group VertScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanAngleMin", required = false)
  private Elev vertScanAngleMin;
  /**
   * VertScanAngleMax - Vertical Scan Maximum Angle (Optional) * The maximum
   * limit of the vertical arc scanned relative to the horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * Attribute group VertScan (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VertScanAngleMax", required = false)
  private Elev vertScanAngleMax;
  /**
   * RotationDirection - Rotation Direction (Optional) * The antenna direction
   * of rotation or motion.
   * <p>
   * Format is L:CRD
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RotationDirection", required = false)
  private TString rotationDirection;
  /**
   * RotationRateMin - Minimum or Nominal Rotation Rate (Required) * The nominal
   * or minimum antenna rotation rate.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group RotationRate (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RotationRateMin")
  private RotationRate rotationRateMin;
  /**
   * RotationRateMax - Maximum Rotation Rate (Optional) * If applicable, the
   * maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group RotationRate (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RotationRateMax", required = false)
  private RotationRate rotationRateMax;
  /**
   * HorzBwMin - Minimum or Nominal Horizontal Beamwidth (Optional) * The
   * minimum or nominal horizontal beamwidth.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "HorzBwMin", required = false)
  private Az horzBwMin;
  /**
   * HorzBwMax - Maximum Horizontal Beamwidth (Optional) * The maximum
   * horizontal beamwidth for beamwidths which vary with the frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "HorzBwMax", required = false)
  private Az horzBwMax;
  /**
   * VertBwMin - Minimum or Nominal Vertical Beamwidth (Optional) * The minimum
   * or nominal vertical beamwidth.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VertBwMin", required = false)
  private Az vertBwMin;
  /**
   * VertBwMax - Maximum Vertical Beamwidth (Optional) * The maximum vertical
   * beamwidth for beamwidths which vary with the frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VertBwMax", required = false)
  private Az vertBwMax;
  /**
   * BeamType - Beam Type (Optional) * One of the codes describing the shape or
   * type of the antenna main beam.
   * <p>
   * Format is L:CBD
   * <p>
   * Attribute group Beamwidth (Optional)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "BeamType", required = false)
  private TString beamType;
  /**
   * MaxPower - Maximum Allowed Power (Optional) * The maximum level of input
   * power.
   * <p>
   * Format is SN(10,7) (dBW)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "MaxPower", required = false)
  private dBW maxPower;
  /**
   * PortIsolation - Port Isolation (Optional) * The power ratio between the
   * signal injected into one port and the power returned by the other port .
   * <p>
   * Format is SN(6,3) (dB)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "PortIsolation", required = false)
  private dB portIsolation;

  @XmlElement(name = "ModeName", required = false)
  private S40 modeName;
  /**
   * AntGain (Optional)
   * <p>
   * AntGain indicates the antenna gain, in decibels with reference to an
   * isotropic source (dBi), in the direction of maximum radiation.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "AntGain")
  private Set<AntGain> antGain;
  /**
   * AntFreqs (Optional)
   * <p>
   * AntFreqs contains the antenna's designed tuning range, or the discrete
   * operating frequency.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "AntFreqs")
  private Set<AntFreqs> antFreqs;
  /**
   * AntPattern (Optional)
   * <p>
   * AntPattern contains an antenna pattern diagram on a specific plane. General
   * pattern cuts can be defined by a spherical coordinate system with the
   * electrical boresite of the antenna oriented in the direction of the Z-axis.
   * At different values of phi, pattern cuts can be taken with theta as the
   * dependent variable. These will be great circle cuts through the main-beam
   * peak.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "AntPattern")
  private Set<AntPattern> antPattern;
  /**
   * AntEfficiency (Optional)
   * <p>
   * AntEfficiency describes the antenna efficiency at various frequencies
   * within the frequency range of the antenna.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "AntEfficiency")
  private Set<AntEfficiency> antEfficiency;
  /**
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "VSWR")
  private Set<VSWR> vswr;
  /**
   * US:ObservedLobeAnalysis (Optional)
   * <p>
   * ObservedLobeAnalysis (US) contains general data associated with observed
   * Antenna sidelobes and backlobes.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedLobeAnalysis")
  private Set<ObservedLobeAnalysis> observedLobeAnalysis;
  /**
   * US:ObservedPolarisationAnalysis (Optional)
   * <p>
   * ObservedPolarisationAnalysis (US) contains data describing the parametric
   * information for the polarization and tilt angle information.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedPolarisationAnalysis")
  private Set<ObservedPolarisationAnalysis> observedPolarisationAnalysis;
  /**
   * US:ObservedScanAnalysis (Optional)
   * <p>
   * ObservedScanAnalysis (US) contains data describing the collected Horizontal
   * and Vertical Scan parameters as well as the Adaptive Driver information.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedScanAnalysis")
  private Set<ObservedScanAnalysis> observedScanAnalysis;

  /**
   * Get a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset..
   *
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getModeID() {
    return modeID;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset..
   *
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setModeID(S20 value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics..
   *
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getDescription() {
    return description;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics..
   *
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setDescription(S100 value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get In Data Item ModeUse, indicate if the mode is used for transmit,
   * receive, or both transmit and receive..
   *
   * @return the ModeUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getModeUse() {
    return modeUse;
  }

  /**
   * Set In Data Item ModeUse, indicate if the mode is used for transmit,
   * receive, or both transmit and receive..
   *
   * @param value the ModeUse value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setModeUse(TString value) {
    this.modeUse = value;
  }

  /**
   * Determine if the ModeUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeUse() {
    return (this.modeUse != null ? this.modeUse.isSetValue() : false);
  }

  /**
   * Get the general category for the movement of a scanning or tracking
   * antenna..
   *
   * @return the MotionType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMotionType() {
    return motionType;
  }

  /**
   * Set the general category for the movement of a scanning or tracking
   * antenna..
   *
   * @param value the MotionType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setMotionType(TString value) {
    this.motionType = value;
  }

  /**
   * Determine if the MotionType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMotionType() {
    return (this.motionType != null ? this.motionType.isSetValue() : false);
  }

  /**
   * Get "Yes" if sector blanking is possible and "No" if it is not possible..
   *
   * @return the SectBlanking value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSectBlanking() {
    return sectBlanking;
  }

  /**
   * Set "Yes" if sector blanking is possible and "No" if it is not possible..
   *
   * @param value the SectBlanking value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSectBlanking(TString value) {
    this.sectBlanking = value;
  }

  /**
   * Determine if the SectBlanking is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSectBlanking() {
    return (this.sectBlanking != null ? this.sectBlanking.isSetValue() : false);
  }

  /**
   * Get the principal orientation of the electric field of the electromagnetic
   * wave for an antenna..
   *
   * @return the PolarisationType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna..
   *
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
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationType() {
    return (this.polarisationType != null ? this.polarisationType.isSetValue() : false);
  }

  /**
   * Get the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna..
   *
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getPolarisationAngle() {
    return polarisationAngle;
  }

  /**
   * Set the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna..
   *
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setPolarisationAngle(Az value) {
    this.polarisationAngle = value;
  }

  /**
   * Determine if the PolarisationAngle is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolarisationAngle() {
    return (this.polarisationAngle != null ? this.polarisationAngle.isSetValue() : false);
  }

  /**
   * Get the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time..
   *
   * @return a {@link ScanSpeed} instance
   * @since 3.1.0
   */
  public ScanSpeed getHorzScanSpeed() {
    return horzScanSpeed;
  }

  /**
   * Set the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time..
   *
   * @param value a {@link ScanSpeed} instance
   * @since 3.1.0
   */
  public void setHorzScanSpeed(ScanSpeed value) {
    this.horzScanSpeed = value;
  }

  /**
   * Determine if the HorzScanSpeed is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanSpeed() {
    return (this.horzScanSpeed != null ? this.horzScanSpeed.isSetValue() : false);
  }

  /**
   * Get the number of complete scans the antenna is capable of making each
   * minute..
   *
   * @return a {@link ScanRate} instance
   * @since 3.1.0
   */
  public ScanRate getHorzScanRate() {
    return horzScanRate;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute..
   *
   * @param value a {@link ScanRate} instance
   * @since 3.1.0
   */
  public void setHorzScanRate(ScanRate value) {
    this.horzScanRate = value;
  }

  /**
   * Determine if the HorzScanRate is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanRate() {
    return (this.horzScanRate != null ? this.horzScanRate.isSetValue() : false);
  }

  /**
   * Get the antenna horizontal scanning capability..
   *
   * @return the HorzScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getHorzScanType() {
    return horzScanType;
  }

  /**
   * Set the antenna horizontal scanning capability..
   *
   * @param value the HorzScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setHorzScanType(TString value) {
    this.horzScanType = value;
  }

  /**
   * Determine if the HorzScanType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanType() {
    return (this.horzScanType != null ? this.horzScanType.isSetValue() : false);
  }

  /**
   * Get the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation)..
   *
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getHorzScanSector() {
    return horzScanSector;
  }

  /**
   * Set the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation)..
   *
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setHorzScanSector(Az value) {
    this.horzScanSector = value;
  }

  /**
   * Determine if the HorzScanSector is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanSector() {
    return (this.horzScanSector != null ? this.horzScanSector.isSetValue() : false);
  }

  /**
   * Get the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute..
   *
   * @return a {@link ScanSpeed} instance
   * @since 3.1.0
   */
  public ScanSpeed getVertScanSpeed() {
    return vertScanSpeed;
  }

  /**
   * Set the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute..
   *
   * @param value a {@link ScanSpeed} instance
   * @since 3.1.0
   */
  public void setVertScanSpeed(ScanSpeed value) {
    this.vertScanSpeed = value;
  }

  /**
   * Determine if the VertScanSpeed is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanSpeed() {
    return (this.vertScanSpeed != null ? this.vertScanSpeed.isSetValue() : false);
  }

  /**
   * Get the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute..
   *
   * @return a {@link ScanRate} instance
   * @since 3.1.0
   */
  public ScanRate getVertScanRate() {
    return vertScanRate;
  }

  /**
   * Set the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute..
   *
   * @param value a {@link ScanRate} instance
   * @since 3.1.0
   */
  public void setVertScanRate(ScanRate value) {
    this.vertScanRate = value;
  }

  /**
   * Determine if the VertScanRate is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanRate() {
    return (this.vertScanRate != null ? this.vertScanRate.isSetValue() : false);
  }

  /**
   * Get the antenna vertical scanning capability..
   *
   * @return the VertScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getVertScanType() {
    return vertScanType;
  }

  /**
   * Set the antenna vertical scanning capability..
   *
   * @param value the VertScanType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setVertScanType(TString value) {
    this.vertScanType = value;
  }

  /**
   * Determine if the VertScanType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanType() {
    return (this.vertScanType != null ? this.vertScanType.isSetValue() : false);
  }

  /**
   * Get the minimum limit of the vertical arc scanned relative to the
   * horizontal..
   *
   * @return a {@link Elev} instance
   * @since 3.1.0
   */
  public Elev getVertScanAngleMin() {
    return vertScanAngleMin;
  }

  /**
   * Set the minimum limit of the vertical arc scanned relative to the
   * horizontal..
   *
   * @param value a {@link Elev} instance
   * @since 3.1.0
   */
  public void setVertScanAngleMin(Elev value) {
    this.vertScanAngleMin = value;
  }

  /**
   * Determine if the VertScanAngleMin is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanAngleMin() {
    return (this.vertScanAngleMin != null ? this.vertScanAngleMin.isSetValue() : false);
  }

  /**
   * Get the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin..
   *
   * @return a {@link Elev} instance
   * @since 3.1.0
   */
  public Elev getVertScanAngleMax() {
    return vertScanAngleMax;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin..
   *
   * @param value a {@link Elev} instance
   * @since 3.1.0
   */
  public void setVertScanAngleMax(Elev value) {
    this.vertScanAngleMax = value;
  }

  /**
   * Determine if the VertScanAngleMax is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanAngleMax() {
    return (this.vertScanAngleMax != null ? this.vertScanAngleMax.isSetValue() : false);
  }

  /**
   * Get the antenna direction of rotation or motion..
   *
   * @return the RotationDirection value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRotationDirection() {
    return rotationDirection;
  }

  /**
   * Set the antenna direction of rotation or motion..
   *
   * @param value the RotationDirection value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRotationDirection(TString value) {
    this.rotationDirection = value;
  }

  /**
   * Determine if the RotationDirection is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationDirection() {
    return (this.rotationDirection != null ? this.rotationDirection.isSetValue() : false);
  }

  /**
   * Get the nominal or minimum antenna rotation rate..
   *
   * @return a {@link RotationRate} instance
   * @since 3.1.0
   */
  public RotationRate getRotationRateMin() {
    return rotationRateMin;
  }

  /**
   * Set the nominal or minimum antenna rotation rate..
   *
   * @param value a {@link RotationRate} instance
   * @since 3.1.0
   */
  public void setRotationRateMin(RotationRate value) {
    this.rotationRateMin = value;
  }

  /**
   * Determine if the RotationRateMin is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationRateMin() {
    return (this.rotationRateMin != null ? this.rotationRateMin.isSetValue() : false);
  }

  /**
   * Get if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin..
   *
   * @return a {@link RotationRate} instance
   * @since 3.1.0
   */
  public RotationRate getRotationRateMax() {
    return rotationRateMax;
  }

  /**
   * Set if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin..
   *
   * @param value a {@link RotationRate} instance
   * @since 3.1.0
   */
  public void setRotationRateMax(RotationRate value) {
    this.rotationRateMax = value;
  }

  /**
   * Determine if the RotationRateMax is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationRateMax() {
    return (this.rotationRateMax != null ? this.rotationRateMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal horizontal beamwidth..
   *
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Set the minimum or nominal horizontal beamwidth..
   *
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setHorzBwMin(Az value) {
    this.horzBwMin = value;
  }

  /**
   * Determine if the HorzBwMin is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMin() {
    return (this.horzBwMin != null ? this.horzBwMin.isSetValue() : false);
  }

  /**
   * Get the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin..
   *
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Set the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin..
   *
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setHorzBwMax(Az value) {
    this.horzBwMax = value;
  }

  /**
   * Determine if the HorzBwMax is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMax() {
    return (this.horzBwMax != null ? this.horzBwMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal vertical beamwidth..
   *
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Set the minimum or nominal vertical beamwidth..
   *
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setVertBwMin(Az value) {
    this.vertBwMin = value;
  }

  /**
   * Determine if the VertBwMin is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMin() {
    return (this.vertBwMin != null ? this.vertBwMin.isSetValue() : false);
  }

  /**
   * Get the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin..
   *
   * @return a {@link Az} instance
   * @since 3.1.0
   */
  public Az getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Set the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin..
   *
   * @param value a {@link Az} instance
   * @since 3.1.0
   */
  public void setVertBwMax(Az value) {
    this.vertBwMax = value;
  }

  /**
   * Determine if the VertBwMax is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMax() {
    return (this.vertBwMax != null ? this.vertBwMax.isSetValue() : false);
  }

  /**
   * Get one of the codes describing the shape or type of the antenna main
   * beam..
   *
   * @return the BeamType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getBeamType() {
    return beamType;
  }

  /**
   * Set one of the codes describing the shape or type of the antenna main
   * beam..
   *
   * @param value the BeamType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setBeamType(TString value) {
    this.beamType = value;
  }

  /**
   * Determine if the BeamType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBeamType() {
    return (this.beamType != null ? this.beamType.isSetValue() : false);
  }

  /**
   * Get the maximum level of input power..
   *
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getMaxPower() {
    return maxPower;
  }

  /**
   * Set the maximum level of input power..
   *
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setMaxPower(dBW value) {
    this.maxPower = value;
  }

  /**
   * Determine if the MaxPower is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxPower() {
    return (this.maxPower != null ? this.maxPower.isSetValue() : false);
  }

  /**
   * Get the power ratio between the signal injected into one port and the power
   * returned by the other port ..
   *
   * @return a {@link dB} instance
   * @since 3.1.0
   */
  public dB getPortIsolation() {
    return portIsolation;
  }

  /**
   * Set the power ratio between the signal injected into one port and the power
   * returned by the other port ..
   *
   * @param value a {@link dB} instance
   * @since 3.1.0
   */
  public void setPortIsolation(dB value) {
    this.portIsolation = value;
  }

  /**
   * Determine if the PortIsolation is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPortIsolation() {
    return (this.portIsolation != null ? this.portIsolation.isSetValue() : false);
  }

  /**
   * Get .
   *
   * @return a {@link S40} instance
   * @since 3.1.0
   */
  public S40 getModeName() {
    return modeName;
  }

  /**
   * Set .
   *
   * @param value a {@link S40} instance
   * @since 3.1.0
   */
  public void setModeName(S40 value) {
    this.modeName = value;
  }

  /**
   * Determine if the ModeName is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeName() {
    return (this.modeName != null ? this.modeName.isSetValue() : false);
  }

  /**
   * Get the AntGain
   * <p>
   * Complex element AntGain indicates the antenna gain, in decibels with
   * reference to an isotropic source (dBi), in the direction of maximum
   * radiation..
   *
   * @return a {@link AntGain} instance
   * @since 3.1.0
   */
  public Set<AntGain> getAntGain() {
    if (antGain == null) {
      antGain = new HashSet<>();
    }
    return this.antGain;
  }

  /**
   * Determine if the AntGain is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntGain() {
    return ((this.antGain != null) && (!this.antGain.isEmpty()));
  }

  /**
   * Clear the AntGain field. This sets the field to null.
   */
  public void unsetAntGain() {
    this.antGain = null;
  }

  /**
   * Get the AntFreqs
   * <p>
   * Complex element AntFreqs contains the antenna's designed tuning range, or
   * the discrete operating frequency..
   *
   * @return a {@link AntFreqs} instance
   * @since 3.1.0
   */
  public Set<AntFreqs> getAntFreqs() {
    if (antFreqs == null) {
      antFreqs = new HashSet<>();
    }
    return this.antFreqs;
  }

  /**
   * Determine if the AntFreqs is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntFreqs() {
    return ((this.antFreqs != null) && (!this.antFreqs.isEmpty()));
  }

  /**
   * Clear the AntFreqs field. This sets the field to null.
   */
  public void unsetAntFreqs() {
    this.antFreqs = null;
  }

  /**
   * Get the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak..
   *
   * @return a {@link AntPattern} instance
   * @since 3.1.0
   */
  public Set<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new HashSet<>();
    }
    return this.antPattern;
  }

  /**
   * Determine if the AntPattern is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntPattern() {
    return ((this.antPattern != null) && (!this.antPattern.isEmpty()));
  }

  /**
   * Clear the AntPattern field. This sets the field to null.
   */
  public void unsetAntPattern() {
    this.antPattern = null;
  }

  /**
   * Get the AntEfficiency
   * <p>
   * Complex element AntEfficiency describes the antenna efficiency at various
   * frequencies within the frequency range of the antenna..
   *
   * @return a {@link AntEfficiency} instance
   * @since 3.1.0
   */
  public Set<AntEfficiency> getAntEfficiency() {
    if (antEfficiency == null) {
      antEfficiency = new HashSet<>();
    }
    return this.antEfficiency;
  }

  /**
   * Determine if the AntEfficiency is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntEfficiency() {
    return ((this.antEfficiency != null) && (!this.antEfficiency.isEmpty()));
  }

  /**
   * Clear the AntEfficiency field. This sets the field to null.
   */
  public void unsetAntEfficiency() {
    this.antEfficiency = null;
  }

  /**
   * Get the VSWR
   * <p>
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency..
   *
   * @return a {@link VSWR} instance
   * @since 3.1.0
   */
  public Set<VSWR> getVSWR() {
    if (vswr == null) {
      vswr = new HashSet<>();
    }
    return this.vswr;
  }

  /**
   * Determine if the VSWR is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVSWR() {
    return ((this.vswr != null) && (!this.vswr.isEmpty()));
  }

  /**
   * Clear the VSWR field. This sets the field to null.
   */
  public void unsetVSWR() {
    this.vswr = null;
  }

  /**
   * Get the US:ObservedLobeAnalysis
   * <p>
   * Complex element ObservedLobeAnalysis (US) contains general data associated
   * with observed Antenna sidelobes and backlobes..
   *
   * @return a {@link ObservedLobeAnalysis} instance
   * @since 3.1.0
   */
  public Set<ObservedLobeAnalysis> getObservedLobeAnalysis() {
    if (observedLobeAnalysis == null) {
      observedLobeAnalysis = new HashSet<>();
    }
    return this.observedLobeAnalysis;
  }

  /**
   * Determine if the ObservedLobeAnalysis is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedLobeAnalysis() {
    return ((this.observedLobeAnalysis != null) && (!this.observedLobeAnalysis.isEmpty()));
  }

  /**
   * Clear the ObservedLobeAnalysis field. This sets the field to null.
   */
  public void unsetObservedLobeAnalysis() {
    this.observedLobeAnalysis = null;
  }

  /**
   * Get the US:ObservedPolarisationAnalysis
   * <p>
   * Complex element ObservedPolarisationAnalysis (US) contains data describing
   * the parametric information for the polarization and tilt angle
   * information..
   *
   * @return a {@link ObservedPolarisationAnalysis} instance
   * @since 3.1.0
   */
  public Set<ObservedPolarisationAnalysis> getObservedPolarisationAnalysis() {
    if (observedPolarisationAnalysis == null) {
      observedPolarisationAnalysis = new HashSet<>();
    }
    return this.observedPolarisationAnalysis;
  }

  /**
   * Determine if the ObservedPolarisationAnalysis is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedPolarisationAnalysis() {
    return ((this.observedPolarisationAnalysis != null) && (!this.observedPolarisationAnalysis.isEmpty()));
  }

  /**
   * Clear the ObservedPolarisationAnalysis field. This sets the field to null.
   */
  public void unsetObservedPolarisationAnalysis() {
    this.observedPolarisationAnalysis = null;
  }

  /**
   * Get the US:ObservedScanAnalysis
   * <p>
   * Complex element ObservedScanAnalysis (US) contains data describing the
   * collected Horizontal and Vertical Scan parameters as well as the Adaptive
   * Driver information..
   *
   * @return a {@link ObservedScanAnalysis} instance
   * @since 3.1.0
   */
  public Set<ObservedScanAnalysis> getObservedScanAnalysis() {
    if (observedScanAnalysis == null) {
      observedScanAnalysis = new HashSet<>();
    }
    return this.observedScanAnalysis;
  }

  /**
   * Determine if the ObservedScanAnalysis is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedScanAnalysis() {
    return ((this.observedScanAnalysis != null) && (!this.observedScanAnalysis.isEmpty()));
  }

  /**
   * Clear the ObservedScanAnalysis field. This sets the field to null.
   */
  public void unsetObservedScanAnalysis() {
    this.observedScanAnalysis = null;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset.
   *
   * @param value An instances of type {@link String}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withModeID(String value) {
    setModeID(new S20(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   *
   * @param value An instances of type {@link String}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withDescription(String value) {
    setDescription(new S100(value));
    return this;
  }

  /**
   * Set In Data Item ModeUse, indicate if the mode is used for transmit,
   * receive, or both transmit and receive.
   *
   * @param value An instances of type {@link ListCAU}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withModeUse(ListCAU value) {
    setModeUse(new TString(value.value()));
    return this;
  }

  /**
   * Set the general category for the movement of a scanning or tracking
   * antenna.
   *
   * @param value An instances of type {@link ListCAD}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withMotionType(ListCAD value) {
    setMotionType(new TString(value.value()));
    return this;
  }

  /**
   * Set "Yes" if sector blanking is possible and "No" if it is not possible.
   *
   * @param value An instances of type {@link ListCBO}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withSectBlanking(ListCBO value) {
    setSectBlanking(new TString(value.value()));
    return this;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   *
   * @param value An instances of type {@link ListCPO}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withPolarisationType(ListCPO value) {
    setPolarisationType(new TString(value.value()));
    return this;
  }

  /**
   * Set the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withPolarisationAngle(Double value) {
    setPolarisationAngle(new Az(value));
    return this;
  }

  /**
   * Set the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withHorzScanSpeed(Double value) {
    setHorzScanSpeed(new ScanSpeed(value));
    return this;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute.
   *
   * @param value An instances of type {@link Integer}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withHorzScanRate(Integer value) {
    setHorzScanRate(new ScanRate(value));
    return this;
  }

  /**
   * Set the antenna horizontal scanning capability.
   *
   * @param value An instances of type {@link ListCAS}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withHorzScanType(ListCAS value) {
    setHorzScanType(new TString(value.value()));
    return this;
  }

  /**
   * Set the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation).
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withHorzScanSector(Double value) {
    setHorzScanSector(new Az(value));
    return this;
  }

  /**
   * Set the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVertScanSpeed(Double value) {
    setVertScanSpeed(new ScanSpeed(value));
    return this;
  }

  /**
   * Set the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   *
   * @param value An instances of type {@link Integer}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVertScanRate(Integer value) {
    setVertScanRate(new ScanRate(value));
    return this;
  }

  /**
   * Set the antenna vertical scanning capability.
   *
   * @param value An instances of type {@link ListCAS}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVertScanType(ListCAS value) {
    setVertScanType(new TString(value.value()));
    return this;
  }

  /**
   * Set the minimum limit of the vertical arc scanned relative to the
   * horizontal.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVertScanAngleMin(Double value) {
    setVertScanAngleMin(new Elev(value));
    return this;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVertScanAngleMax(Double value) {
    setVertScanAngleMax(new Elev(value));
    return this;
  }

  /**
   * Set the antenna direction of rotation or motion.
   *
   * @param value An instances of type {@link ListCRD}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withRotationDirection(ListCRD value) {
    setRotationDirection(new TString(value.value()));
    return this;
  }

  /**
   * Set the nominal or minimum antenna rotation rate.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withRotationRateMin(Double value) {
    setRotationRateMin(new RotationRate(value));
    return this;
  }

  /**
   * Set if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withRotationRateMax(Double value) {
    setRotationRateMax(new RotationRate(value));
    return this;
  }

  /**
   * Set the minimum or nominal horizontal beamwidth.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withHorzBwMin(Double value) {
    setHorzBwMin(new Az(value));
    return this;
  }

  /**
   * Set the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withHorzBwMax(Double value) {
    setHorzBwMax(new Az(value));
    return this;
  }

  /**
   * Set the minimum or nominal vertical beamwidth.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVertBwMin(Double value) {
    setVertBwMin(new Az(value));
    return this;
  }

  /**
   * Set the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVertBwMax(Double value) {
    setVertBwMax(new Az(value));
    return this;
  }

  /**
   * Set one of the codes describing the shape or type of the antenna main beam.
   *
   * @param value An instances of type {@link ListCBD}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withBeamType(ListCBD value) {
    setBeamType(new TString(value.value()));
    return this;
  }

  /**
   * Set the maximum level of input power.
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withMaxPower(Double value) {
    setMaxPower(new dBW(value));
    return this;
  }

  /**
   * Set the power ratio between the signal injected into one port and the power
   * returned by the other port .
   *
   * @param value An instances of type {@link Double}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withPortIsolation(Double value) {
    setPortIsolation(new dB(value));
    return this;
  }

  /**
   * Set
   *
   *
   * @param value An instances of type {@link String}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withModeName(String value) {
    setModeName(new S40(value));
    return this;
  }

  /**
   * Set the AntGain
   * <p>
   * Complex element AntGain indicates the antenna gain, in decibels with
   * reference to an isotropic source (dBi), in the direction of maximum
   * radiation.
   *
   * @param values One or more instances of type {@link AntGain}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntGain(AntGain... values) {
    if (values != null) {
      getAntGain().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntGain
   * <p>
   * Complex element AntGain indicates the antenna gain, in decibels with
   * reference to an isotropic source (dBi), in the direction of maximum
   * radiation.
   *
   * @param values A collection of {@link AntGain} instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntGain(Collection<AntGain> values) {
    if (values != null) {
      getAntGain().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntFreqs
   * <p>
   * Complex element AntFreqs contains the antenna's designed tuning range, or
   * the discrete operating frequency.
   * <p>
   * @param values One or more instances of type {@link AntFreqs}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntFreqs(AntFreqs... values) {
    if (values != null) {
      getAntFreqs().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntFreqs
   * <p>
   * Complex element AntFreqs contains the antenna's designed tuning range, or
   * the discrete operating frequency.
   * <p>
   * @param values A collection of {@link AntFreqs} instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntFreqs(Collection<AntFreqs> values) {
    if (values != null) {
      getAntFreqs().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @param values One or more instances of type {@link AntPattern}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntPattern(AntPattern... values) {
    if (values != null) {
      getAntPattern().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntPattern
   * <p>
   * Complex element AntPattern contains an antenna pattern diagram on a
   * specific plane. General pattern cuts can be defined by a spherical
   * coordinate system with the electrical boresite of the antenna oriented in
   * the direction of the Z-axis. At different values of phi, pattern cuts can
   * be taken with theta as the dependent variable. These will be great circle
   * cuts through the main-beam peak.
   * <p>
   * @param values A collection of {@link AntPattern} instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntPattern(Collection<AntPattern> values) {
    if (values != null) {
      getAntPattern().addAll(values);
    }
    return this;
  }

  /**
   * Set the AntEfficiency
   * <p>
   * Complex element AntEfficiency describes the antenna efficiency at various
   * frequencies within the frequency range of the antenna.
   * <p>
   * @param values One or more instances of type {@link AntEfficiency}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntEfficiency(AntEfficiency... values) {
    if (values != null) {
      getAntEfficiency().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntEfficiency
   * <p>
   * Complex element AntEfficiency describes the antenna efficiency at various
   * frequencies within the frequency range of the antenna.
   * <p>
   * @param values A collection of {@link AntEfficiency} instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withAntEfficiency(Collection<AntEfficiency> values) {
    if (values != null) {
      getAntEfficiency().addAll(values);
    }
    return this;
  }

  /**
   * Set the VSWR
   * <p>
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   * <p>
   * @param values One or more instances of type {@link VSWR}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVSWR(VSWR... values) {
    if (values != null) {
      getVSWR().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the VSWR
   * <p>
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   * <p>
   * @param values A collection of {@link VSWR} instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withVSWR(Collection<VSWR> values) {
    if (values != null) {
      getVSWR().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ObservedLobeAnalysis
   * <p>
   * Complex element ObservedLobeAnalysis (US) contains general data associated
   * with observed Antenna sidelobes and backlobes.
   * <p>
   * @param values One or more instances of type
   *               {@link ObservedLobeAnalysis}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withObservedLobeAnalysis(ObservedLobeAnalysis... values) {
    if (values != null) {
      getObservedLobeAnalysis().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedLobeAnalysis
   * <p>
   * Complex element ObservedLobeAnalysis (US) contains general data associated
   * with observed Antenna sidelobes and backlobes.
   * <p>
   * @param values A collection of {@link ObservedLobeAnalysis} instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withObservedLobeAnalysis(Collection<ObservedLobeAnalysis> values) {
    if (values != null) {
      getObservedLobeAnalysis().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ObservedPolarisationAnalysis
   * <p>
   * Complex element ObservedPolarisationAnalysis (US) contains data describing
   * the parametric information for the polarization and tilt angle information.
   * <p>
   * @param values One or more instances of type
   *               {@link ObservedPolarisationAnalysis}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withObservedPolarisationAnalysis(ObservedPolarisationAnalysis... values) {
    if (values != null) {
      getObservedPolarisationAnalysis().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedPolarisationAnalysis
   * <p>
   * Complex element ObservedPolarisationAnalysis (US) contains data describing
   * the parametric information for the polarization and tilt angle information.
   * <p>
   * @param values A collection of {@link ObservedPolarisationAnalysis}
   *               instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withObservedPolarisationAnalysis(Collection<ObservedPolarisationAnalysis> values) {
    if (values != null) {
      getObservedPolarisationAnalysis().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:ObservedScanAnalysis
   * <p>
   * Complex element ObservedScanAnalysis (US) contains data describing the
   * collected Horizontal and Vertical Scan parameters as well as the Adaptive
   * Driver information.
   * <p>
   * @param values One or more instances of type
   *               {@link ObservedScanAnalysis}.
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withObservedScanAnalysis(ObservedScanAnalysis... values) {
    if (values != null) {
      getObservedScanAnalysis().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:ObservedScanAnalysis
   * <p>
   * Complex element ObservedScanAnalysis (US) contains data describing the
   * collected Horizontal and Vertical Scan parameters as well as the Adaptive
   * Driver information.
   * <p>
   * @param values A collection of {@link ObservedScanAnalysis} instances
   * @return The current AntMode object instance.
   * @since 3.1.0
   */
  public AntMode withObservedScanAnalysis(Collection<ObservedScanAnalysis> values) {
    if (values != null) {
      getObservedScanAnalysis().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this AntMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  AntMode {"
           + (antEfficiency != null ? " antEfficiency [" + antEfficiency + "]" : "")
           + (antFreqs != null ? " antFreqs [" + antFreqs + "]" : "")
           + (antGain != null ? " antGain [" + antGain + "]" : "")
           + (antPattern != null ? " antPattern [" + antPattern + "]" : "")
           + (beamType != null ? " beamType [" + beamType + "]" : "")
           + (description != null ? " description [" + description + "]" : "")
           + (horzBwMax != null ? " horzBwMax [" + horzBwMax + "]" : "")
           + (horzBwMin != null ? " horzBwMin [" + horzBwMin + "]" : "")
           + (horzScanRate != null ? " horzScanRate [" + horzScanRate + "]" : "")
           + (horzScanSector != null ? " horzScanSector [" + horzScanSector + "]" : "")
           + (horzScanSpeed != null ? " horzScanSpeed [" + horzScanSpeed + "]" : "")
           + (horzScanType != null ? " horzScanType [" + horzScanType + "]" : "")
           + (maxPower != null ? " maxPower [" + maxPower + "]" : "")
           + (modeID != null ? " modeID [" + modeID + "]" : "")
           + (modeName != null ? " modeName [" + modeName + "]" : "")
           + (modeUse != null ? " modeUse [" + modeUse + "]" : "")
           + (motionType != null ? " motionType [" + motionType + "]" : "")
           + (observedLobeAnalysis != null ? " observedLobeAnalysis [" + observedLobeAnalysis + "]" : "")
           + (observedPolarisationAnalysis != null ? " observedPolarisationAnalysis [" + observedPolarisationAnalysis + "]" : "")
           + (observedScanAnalysis != null ? " observedScanAnalysis [" + observedScanAnalysis + "]" : "")
           + (polarisationAngle != null ? " polarisationAngle [" + polarisationAngle + "]" : "")
           + (polarisationType != null ? " polarisationType [" + polarisationType + "]" : "")
           + (portIsolation != null ? " portIsolation [" + portIsolation + "]" : "")
           + (rotationDirection != null ? " rotationDirection [" + rotationDirection + "]" : "")
           + (rotationRateMax != null ? " rotationRateMax [" + rotationRateMax + "]" : "")
           + (rotationRateMin != null ? " rotationRateMin [" + rotationRateMin + "]" : "")
           + (sectBlanking != null ? " sectBlanking [" + sectBlanking + "]" : "")
           + (vertBwMax != null ? " vertBwMax [" + vertBwMax + "]" : "")
           + (vertBwMin != null ? " vertBwMin [" + vertBwMin + "]" : "")
           + (vertScanAngleMax != null ? " vertScanAngleMax [" + vertScanAngleMax + "]" : "")
           + (vertScanAngleMin != null ? " vertScanAngleMin [" + vertScanAngleMin + "]" : "")
           + (vertScanRate != null ? " vertScanRate [" + vertScanRate + "]" : "")
           + (vertScanSpeed != null ? " vertScanSpeed [" + vertScanSpeed + "]" : "")
           + (vertScanType != null ? " vertScanType [" + vertScanType + "]" : "")
           + (vswr != null ? " vswr [" + vswr + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntMode} requires {@link S20 ModeID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetModeID();
  }

}
