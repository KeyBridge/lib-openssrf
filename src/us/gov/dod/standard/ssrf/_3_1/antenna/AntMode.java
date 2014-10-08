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
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * ModeID - Mode Identifier (Required)
   * <p>
   * A short name for the mode; this name should be a meaningful identification
   * of the mode, but it can also be automatically generated in some systems.
   * The Name MUST be unique within the dataset and SHOULD NOT be modified
   * during the entire lifetime of the dataset.
   * <p>
   * Format is S20
   * <p>
   * Attribute group ModeInfo (Required)
   */
  @XmlElement(name = "ModeID", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * Description - Mode Description (Optional)
   * <p>
   * A description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * Format is S100
   * <p>
   * Attribute group ModeInfo (Required)
   */
  @XmlElement(name = "Description", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * ModeUse, indicate if the mode is used for transmit, receive, or both
   * transmit and receive.
   */
  @XmlElement(name = "ModeUse", required = false)
  private TString modeUse;
  /**
   * MotionType - Antenna Motion Type (Optional)
   * <p>
   * The general category for the movement of a scanning or tracking antenna.
   * <p>
   * Format is L:CAD
   */
  @XmlElement(name = "MotionType", required = false)
  private TString motionType;
  /**
   * SectBlanking - Sector Blanking (Optional)
   * <p>
   * "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "SectBlanking", required = false)
  private TString sectBlanking;
  /**
   * PolarisationType - Type of Polarisation (Required)
   * <p>
   * The principal orientation of the electric field of the electromagnetic wave
   * for an antenna.
   * <p>
   * Format is L:CPO
   * <p>
   * Attribute group Pol (Optional)
   */
  @XmlElement(name = "PolarisationType")
  private TString polarisationType;
  /**
   * PolarisationAngle - Polarisation Angle (Optional)
   * <p>
   * The angle of the electric field vector measured counter-clockwise from the
   * equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Pol (Optional)
   */
  @XmlElement(name = "PolarisationAngle", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal polarisationAngle;
  /**
   * HorzScanSpeed - Horizontal Scan Speed (Optional)
   * <p>
   * The number of degrees per second the antenna is capable of scanning. It is
   * not necessarily the "Sector Scanned" figure times the degrees per second.
   * If a significant portion of time is spent vertically scanning in between
   * horizontal sweeps, the horizontal scan rate will be lower than if the
   * antenna were horizontally scanning all the time.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group HorzScan (Optional)
   */
  @XmlElement(name = "HorzScanSpeed", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal horzScanSpeed;
  /**
   * HorzScanRate - Horizontal Scan Rate (Optional)
   * <p>
   * The number of complete scans the antenna is capable of making each minute.
   * <p>
   * Format is UN(4) (scans/min)
   * <p>
   * Attribute group HorzScan (Optional)
   */
  @XmlElement(name = "HorzScanRate", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger horzScanRate;
  /**
   * HorzScanType - Horizontal Scan Type (Optional)
   * <p>
   * The antenna horizontal scanning capability.
   * <p>
   * Format is L:CAS
   * <p>
   * Attribute group HorzScan (Optional)
   */
  @XmlElement(name = "HorzScanType", required = false)
  private TString horzScanType;
  /**
   * HorzScanSector - Horizontal Scan Sector (Optional)
   * <p>
   * The maximum horizontal sector the antenna can scan (enter 360 for a full
   * rotation).
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group HorzScan (Optional)
   */
  @XmlElement(name = "HorzScanSector", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzScanSector;
  /**
   * VertScanSpeed - Vertical Scan Speed (Optional)
   * <p>
   * The number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group VertScan (Optional)
   */
  @XmlElement(name = "VertScanSpeed", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal vertScanSpeed;
  /**
   * VertScanRate - Vertical Scan Rate (Optional)
   * <p>
   * The number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   * <p>
   * Format is UN(4) (scans/min)
   * <p>
   * Attribute group VertScan (Optional)
   */
  @XmlElement(name = "VertScanRate", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger vertScanRate;
  /**
   * VertScanType - Vertical Scan Type (Optional)
   * <p>
   * The antenna vertical scanning capability.
   * <p>
   * Format is L:CAS
   * <p>
   * Attribute group VertScan (Optional)
   */
  @XmlElement(name = "VertScanType", required = false)
  private TString vertScanType;
  /**
   * VertScanAngleMin - Vertical Scan Minimum Angle (Optional)
   * <p>
   * The minimum limit of the vertical arc scanned relative to the horizontal.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * Attribute group VertScan (Optional)
   */
  @XmlElement(name = "VertScanAngleMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMin;
  /**
   * VertScanAngleMax - Vertical Scan Maximum Angle (Optional)
   * <p>
   * The maximum limit of the vertical arc scanned relative to the horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * Format is SN(4,2) [-90..90] (deg)
   * <p>
   * Attribute group VertScan (Optional)
   */
  @XmlElement(name = "VertScanAngleMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMax;
  /**
   * RotationDirection - Rotation Direction (Optional)
   * <p>
   * The antenna direction of rotation or motion.
   * <p>
   * Format is L:CRD
   */
  @XmlElement(name = "RotationDirection", required = false)
  private TString rotationDirection;
  /**
   * RotationRateMin - Minimum or Nominal Rotation Rate (Required)
   * <p>
   * The nominal or minimum antenna rotation rate.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group RotationRate (Optional)
   */
  @XmlElement(name = "RotationRateMin")
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterROTATIONRATE.class)
  private TDecimal rotationRateMin;
  /**
   * RotationRateMax - Maximum Rotation Rate (Optional)
   * <p>
   * If applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * Format is UN(7,2) (deg/sec)
   * <p>
   * Attribute group RotationRate (Optional)
   */
  @XmlElement(name = "RotationRateMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterROTATIONRATE.class)
  private TDecimal rotationRateMax;
  /**
   * HorzBwMin - Minimum or Nominal Horizontal Beamwidth (Optional)
   * <p>
   * The minimum or nominal horizontal beamwidth.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   */
  @XmlElement(name = "HorzBwMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMin;
  /**
   * HorzBwMax - Maximum Horizontal Beamwidth (Optional)
   * <p>
   * The maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   */
  @XmlElement(name = "HorzBwMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMax;
  /**
   * VertBwMin - Minimum or Nominal Vertical Beamwidth (Optional)
   * <p>
   * The minimum or nominal vertical beamwidth.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   */
  @XmlElement(name = "VertBwMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMin;
  /**
   * VertBwMax - Maximum Vertical Beamwidth (Optional)
   * <p>
   * The maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   * <p>
   * Attribute group Beamwidth (Optional)
   */
  @XmlElement(name = "VertBwMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMax;
  /**
   * BeamType - Beam Type (Optional)
   * <p>
   * One of the codes describing the shape or type of the antenna main beam.
   * <p>
   * Format is L:CBD
   * <p>
   * Attribute group Beamwidth (Optional)
   */
  @XmlElement(name = "BeamType", required = false)
  private TString beamType;
  /**
   * MaxPower - Maximum Allowed Power (Optional)
   * <p>
   * The maximum level of input power.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "MaxPower", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal maxPower;
  /**
   * PortIsolation - Port Isolation (Optional)
   * <p>
   * The power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * Format is SN(6,3) (dB)
   */
  @XmlElement(name = "PortIsolation", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal portIsolation;

  @XmlElement(name = "ModeName", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;
  /**
   * AntGain (Optional)
   * <p>
   * AntGain indicates the antenna gain, in decibels with reference to an
   * isotropic source (dBi), in the direction of maximum radiation.
   */
  @XmlElement(name = "AntGain")
  private List<AntGain> antGain;
  /**
   * AntFreqs (Optional)
   * <p>
   * AntFreqs contains the antenna's designed tuning range, or the discrete
   * operating frequency.
   */
  @XmlElement(name = "AntFreqs")
  private List<AntFreqs> antFreqs;
  /**
   * AntPattern (Optional)
   * <p>
   * AntPattern contains an antenna pattern diagram on a specific plane. General
   * pattern cuts can be defined by a spherical coordinate system with the
   * electrical boresite of the antenna oriented in the direction of the Z-axis.
   * At different values of phi, pattern cuts can be taken with theta as the
   * dependent variable. These will be great circle cuts through the main-beam
   * peak.
   */
  @XmlElement(name = "AntPattern")
  private List<AntPattern> antPattern;
  /**
   * AntEfficiency (Optional)
   * <p>
   * AntEfficiency describes the antenna efficiency at various frequencies
   * within the frequency range of the antenna.
   */
  @XmlElement(name = "AntEfficiency")
  private List<AntEfficiency> antEfficiency;
  /**
   * Complex Element VSWR stores the Voltage Standing Wave Ratio information for
   * an Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   */
  @XmlElement(name = "VSWR")
  private List<VSWR> vswr;
  /**
   * US:ObservedLobeAnalysis (Optional)
   * <p>
   * ObservedLobeAnalysis (US) contains general data associated with observed
   * Antenna sidelobes and backlobes.
   */
  @XmlElement(name = "ObservedLobeAnalysis")
  private List<ObservedLobeAnalysis> observedLobeAnalysis;
  /**
   * US:ObservedPolarisationAnalysis (Optional)
   * <p>
   * ObservedPolarisationAnalysis (US) contains data describing the parametric
   * information for the polarization and tilt angle information.
   */
  @XmlElement(name = "ObservedPolarisationAnalysis")
  private List<ObservedPolarisationAnalysis> observedPolarisationAnalysis;
  /**
   * US:ObservedScanAnalysis (Optional)
   * <p>
   * ObservedScanAnalysis (US) contains data describing the collected Horizontal
   * and Vertical Scan parameters as well as the Adaptive Driver information.
   */
  @XmlElement(name = "ObservedScanAnalysis")
  private List<ObservedScanAnalysis> observedScanAnalysis;

  /**
   * Get a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset.
   * <p>
   * @return the ModeID value in a {@link TString} data type
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Set a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset.
   * <p>
   * @param value the ModeID value in a {@link TString} data type
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  /**
   * Determine if the ModeID is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeID() {
    return (this.modeID != null ? this.modeID.isSetValue() : false);
  }

  /**
   * Get a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value the Description value in a {@link TString} data type
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get ModeUse, indicate if the mode is used for transmit, receive, or both
   * transmit and receive.
   * <p>
   * @return the ModeUse value in a {@link TString} data type
   */
  public TString getModeUse() {
    return modeUse;
  }

  /**
   * Set ModeUse, indicate if the mode is used for transmit, receive, or both
   * transmit and receive.
   * <p>
   * @param value the ModeUse value in a {@link TString} data type
   */
  public void setModeUse(TString value) {
    this.modeUse = value;
  }

  /**
   * Determine if the ModeUse is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModeUse() {
    return (this.modeUse != null ? this.modeUse.isSetValue() : false);
  }

  /**
   * Get the general category for the movement of a scanning or tracking
   * antenna.
   * <p>
   * @return the MotionType value in a {@link TString} data type
   */
  public TString getMotionType() {
    return motionType;
  }

  /**
   * Set the general category for the movement of a scanning or tracking
   * antenna.
   * <p>
   * @param value the MotionType value in a {@link TString} data type
   */
  public void setMotionType(TString value) {
    this.motionType = value;
  }

  /**
   * Determine if the MotionType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMotionType() {
    return (this.motionType != null ? this.motionType.isSetValue() : false);
  }

  /**
   * Get "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * @return the SectBlanking value in a {@link TString} data type
   */
  public TString getSectBlanking() {
    return sectBlanking;
  }

  /**
   * Set "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * @param value the SectBlanking value in a {@link TString} data type
   */
  public void setSectBlanking(TString value) {
    this.sectBlanking = value;
  }

  /**
   * Determine if the SectBlanking is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSectBlanking() {
    return (this.sectBlanking != null ? this.sectBlanking.isSetValue() : false);
  }

  /**
   * Get the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @return the PolarisationType value in a {@link TString} data type
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
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
   * Get the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * @return the PolarisationAngle value in a {@link TDecimal} data type
   */
  public TDecimal getPolarisationAngle() {
    return polarisationAngle;
  }

  /**
   * Set the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * @param value the PolarisationAngle value in a {@link TDecimal} data type
   */
  public void setPolarisationAngle(TDecimal value) {
    this.polarisationAngle = value;
  }

  /**
   * Determine if the PolarisationAngle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
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
   * the antenna were horizontally scanning all the time.
   * <p>
   * @return the HorzScanSpeed value in a {@link TDecimal} data type
   */
  public TDecimal getHorzScanSpeed() {
    return horzScanSpeed;
  }

  /**
   * Set the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time.
   * <p>
   * @param value the HorzScanSpeed value in a {@link TDecimal} data type
   */
  public void setHorzScanSpeed(TDecimal value) {
    this.horzScanSpeed = value;
  }

  /**
   * Determine if the HorzScanSpeed is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanSpeed() {
    return (this.horzScanSpeed != null ? this.horzScanSpeed.isSetValue() : false);
  }

  /**
   * Get the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @return the HorzScanRate value in a {@link TInteger} data type
   */
  public TInteger getHorzScanRate() {
    return horzScanRate;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @param value the HorzScanRate value in a {@link TInteger} data type
   */
  public void setHorzScanRate(TInteger value) {
    this.horzScanRate = value;
  }

  /**
   * Determine if the HorzScanRate is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanRate() {
    return (this.horzScanRate != null ? this.horzScanRate.isSetValue() : false);
  }

  /**
   * Get the antenna horizontal scanning capability.
   * <p>
   * @return the HorzScanType value in a {@link TString} data type
   */
  public TString getHorzScanType() {
    return horzScanType;
  }

  /**
   * Set the antenna horizontal scanning capability.
   * <p>
   * @param value the HorzScanType value in a {@link TString} data type
   */
  public void setHorzScanType(TString value) {
    this.horzScanType = value;
  }

  /**
   * Determine if the HorzScanType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzScanType() {
    return (this.horzScanType != null ? this.horzScanType.isSetValue() : false);
  }

  /**
   * Get the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation).
   * <p>
   * @return the HorzScanSector value in a {@link TDecimal} data type
   */
  public TDecimal getHorzScanSector() {
    return horzScanSector;
  }

  /**
   * Set the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation).
   * <p>
   * @param value the HorzScanSector value in a {@link TDecimal} data type
   */
  public void setHorzScanSector(TDecimal value) {
    this.horzScanSector = value;
  }

  /**
   * Determine if the HorzScanSector is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
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
   * scan speed would be 2 degrees per minute.
   * <p>
   * @return the VertScanSpeed value in a {@link TDecimal} data type
   */
  public TDecimal getVertScanSpeed() {
    return vertScanSpeed;
  }

  /**
   * Set the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   * <p>
   * @param value the VertScanSpeed value in a {@link TDecimal} data type
   */
  public void setVertScanSpeed(TDecimal value) {
    this.vertScanSpeed = value;
  }

  /**
   * Determine if the VertScanSpeed is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
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
   * scan rate would be 2 scans per minute.
   * <p>
   * @return the VertScanRate value in a {@link TInteger} data type
   */
  public TInteger getVertScanRate() {
    return vertScanRate;
  }

  /**
   * Set the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   * <p>
   * @param value the VertScanRate value in a {@link TInteger} data type
   */
  public void setVertScanRate(TInteger value) {
    this.vertScanRate = value;
  }

  /**
   * Determine if the VertScanRate is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanRate() {
    return (this.vertScanRate != null ? this.vertScanRate.isSetValue() : false);
  }

  /**
   * Get the antenna vertical scanning capability.
   * <p>
   * @return the VertScanType value in a {@link TString} data type
   */
  public TString getVertScanType() {
    return vertScanType;
  }

  /**
   * Set the antenna vertical scanning capability.
   * <p>
   * @param value the VertScanType value in a {@link TString} data type
   */
  public void setVertScanType(TString value) {
    this.vertScanType = value;
  }

  /**
   * Determine if the VertScanType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanType() {
    return (this.vertScanType != null ? this.vertScanType.isSetValue() : false);
  }

  /**
   * Get the minimum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * @return the VertScanAngleMin value in a {@link TDecimal} data type
   */
  public TDecimal getVertScanAngleMin() {
    return vertScanAngleMin;
  }

  /**
   * Set the minimum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * @param value the VertScanAngleMin value in a {@link TDecimal} data type
   */
  public void setVertScanAngleMin(TDecimal value) {
    this.vertScanAngleMin = value;
  }

  /**
   * Determine if the VertScanAngleMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
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
   * VertScanAngleMin.
   * <p>
   * @return the VertScanAngleMax value in a {@link TDecimal} data type
   */
  public TDecimal getVertScanAngleMax() {
    return vertScanAngleMax;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @param value the VertScanAngleMax value in a {@link TDecimal} data type
   */
  public void setVertScanAngleMax(TDecimal value) {
    this.vertScanAngleMax = value;
  }

  /**
   * Determine if the VertScanAngleMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertScanAngleMax() {
    return (this.vertScanAngleMax != null ? this.vertScanAngleMax.isSetValue() : false);
  }

  /**
   * Get the antenna direction of rotation or motion.
   * <p>
   * @return the RotationDirection value in a {@link TString} data type
   */
  public TString getRotationDirection() {
    return rotationDirection;
  }

  /**
   * Set the antenna direction of rotation or motion.
   * <p>
   * @param value the RotationDirection value in a {@link TString} data type
   */
  public void setRotationDirection(TString value) {
    this.rotationDirection = value;
  }

  /**
   * Determine if the RotationDirection is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationDirection() {
    return (this.rotationDirection != null ? this.rotationDirection.isSetValue() : false);
  }

  /**
   * Get the nominal or minimum antenna rotation rate.
   * <p>
   * @return the RotationRateMin value in a {@link TDecimal} data type
   */
  public TDecimal getRotationRateMin() {
    return rotationRateMin;
  }

  /**
   * Set the nominal or minimum antenna rotation rate.
   * <p>
   * @param value the RotationRateMin value in a {@link TDecimal} data type
   */
  public void setRotationRateMin(TDecimal value) {
    this.rotationRateMin = value;
  }

  /**
   * Determine if the RotationRateMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationRateMin() {
    return (this.rotationRateMin != null ? this.rotationRateMin.isSetValue() : false);
  }

  /**
   * Get if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * @return the RotationRateMax value in a {@link TDecimal} data type
   */
  public TDecimal getRotationRateMax() {
    return rotationRateMax;
  }

  /**
   * Set if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * @param value the RotationRateMax value in a {@link TDecimal} data type
   */
  public void setRotationRateMax(TDecimal value) {
    this.rotationRateMax = value;
  }

  /**
   * Determine if the RotationRateMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRotationRateMax() {
    return (this.rotationRateMax != null ? this.rotationRateMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal horizontal beamwidth.
   * <p>
   * @return the HorzBwMin value in a {@link TDecimal} data type
   */
  public TDecimal getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Set the minimum or nominal horizontal beamwidth.
   * <p>
   * @param value the HorzBwMin value in a {@link TDecimal} data type
   */
  public void setHorzBwMin(TDecimal value) {
    this.horzBwMin = value;
  }

  /**
   * Determine if the HorzBwMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMin() {
    return (this.horzBwMin != null ? this.horzBwMin.isSetValue() : false);
  }

  /**
   * Get the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * @return the HorzBwMax value in a {@link TDecimal} data type
   */
  public TDecimal getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Set the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * @param value the HorzBwMax value in a {@link TDecimal} data type
   */
  public void setHorzBwMax(TDecimal value) {
    this.horzBwMax = value;
  }

  /**
   * Determine if the HorzBwMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetHorzBwMax() {
    return (this.horzBwMax != null ? this.horzBwMax.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal vertical beamwidth.
   * <p>
   * @return the VertBwMin value in a {@link TDecimal} data type
   */
  public TDecimal getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Set the minimum or nominal vertical beamwidth.
   * <p>
   * @param value the VertBwMin value in a {@link TDecimal} data type
   */
  public void setVertBwMin(TDecimal value) {
    this.vertBwMin = value;
  }

  /**
   * Determine if the VertBwMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMin() {
    return (this.vertBwMin != null ? this.vertBwMin.isSetValue() : false);
  }

  /**
   * Get the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * @return the VertBwMax value in a {@link TDecimal} data type
   */
  public TDecimal getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Set the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * @param value the VertBwMax value in a {@link TDecimal} data type
   */
  public void setVertBwMax(TDecimal value) {
    this.vertBwMax = value;
  }

  /**
   * Determine if the VertBwMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVertBwMax() {
    return (this.vertBwMax != null ? this.vertBwMax.isSetValue() : false);
  }

  /**
   * Get one of the codes describing the shape or type of the antenna main beam.
   * <p>
   * @return the BeamType value in a {@link TString} data type
   */
  public TString getBeamType() {
    return beamType;
  }

  /**
   * Set one of the codes describing the shape or type of the antenna main beam.
   * <p>
   * @param value the BeamType value in a {@link TString} data type
   */
  public void setBeamType(TString value) {
    this.beamType = value;
  }

  /**
   * Determine if the BeamType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBeamType() {
    return (this.beamType != null ? this.beamType.isSetValue() : false);
  }

  /**
   * Get the maximum level of input power.
   * <p>
   * @return the MaxPower value in a {@link TDecimal} data type
   */
  public TDecimal getMaxPower() {
    return maxPower;
  }

  /**
   * Set the maximum level of input power.
   * <p>
   * @param value the MaxPower value in a {@link TDecimal} data type
   */
  public void setMaxPower(TDecimal value) {
    this.maxPower = value;
  }

  /**
   * Determine if the MaxPower is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxPower() {
    return (this.maxPower != null ? this.maxPower.isSetValue() : false);
  }

  /**
   * Get the power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * @return the PortIsolation value in a {@link TDecimal} data type
   */
  public TDecimal getPortIsolation() {
    return portIsolation;
  }

  /**
   * Set the power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * @param value the PortIsolation value in a {@link TDecimal} data type
   */
  public void setPortIsolation(TDecimal value) {
    this.portIsolation = value;
  }

  /**
   * Determine if the PortIsolation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPortIsolation() {
    return (this.portIsolation != null ? this.portIsolation.isSetValue() : false);
  }

  /**
   * Get
   * <p>
   * @return the ModeName value in a {@link TString} data type
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Set
   * <p>
   * @param value the ModeName value in a {@link TString} data type
   */
  public void setModeName(TString value) {
    this.modeName = value;
  }

  /**
   * Determine if the ModeName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
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
   * radiation.
   * <p>
   * @return a non-null but possibly empty list of {@link AntGain} instances
   */
  public List<AntGain> getAntGain() {
    if (antGain == null) {
      antGain = new ArrayList<>();
    }
    return this.antGain;
  }

  /**
   * Determine if the AntGain is configured.
   * <p>
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
   * the discrete operating frequency.
   * <p>
   * @return a non-null but possibly empty list of {@link AntFreqs} instances
   */
  public List<AntFreqs> getAntFreqs() {
    if (antFreqs == null) {
      antFreqs = new ArrayList<>();
    }
    return this.antFreqs;
  }

  /**
   * Determine if the AntFreqs is configured.
   * <p>
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
   * cuts through the main-beam peak.
   * <p>
   * @return a non-null but possibly empty list of {@link AntPattern} instances
   */
  public List<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new ArrayList<>();
    }
    return this.antPattern;
  }

  /**
   * Determine if the AntPattern is configured.
   * <p>
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
   * frequencies within the frequency range of the antenna.
   * <p>
   * @return a non-null but possibly empty list of {@link AntEfficiency}
   *         instances
   */
  public List<AntEfficiency> getAntEfficiency() {
    if (antEfficiency == null) {
      antEfficiency = new ArrayList<>();
    }
    return this.antEfficiency;
  }

  /**
   * Determine if the AntEfficiency is configured.
   * <p>
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
   * frequency.
   * <p>
   * @return a non-null but possibly empty list of {@link VSWR} instances
   */
  public List<VSWR> getVSWR() {
    if (vswr == null) {
      vswr = new ArrayList<>();
    }
    return this.vswr;
  }

  /**
   * Determine if the VSWR is configured.
   * <p>
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
   * with observed Antenna sidelobes and backlobes.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedLobeAnalysis}
   *         instances
   */
  public List<ObservedLobeAnalysis> getObservedLobeAnalysis() {
    if (observedLobeAnalysis == null) {
      observedLobeAnalysis = new ArrayList<>();
    }
    return this.observedLobeAnalysis;
  }

  /**
   * Determine if the ObservedLobeAnalysis is configured.
   * <p>
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
   * the parametric information for the polarization and tilt angle information.
   * <p>
   * @return a non-null but possibly empty list of
   *         {@link ObservedPolarisationAnalysis} instances
   */
  public List<ObservedPolarisationAnalysis> getObservedPolarisationAnalysis() {
    if (observedPolarisationAnalysis == null) {
      observedPolarisationAnalysis = new ArrayList<>();
    }
    return this.observedPolarisationAnalysis;
  }

  /**
   * Determine if the ObservedPolarisationAnalysis is configured.
   * <p>
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
   * Driver information.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedScanAnalysis}
   *         instances
   */
  public List<ObservedScanAnalysis> getObservedScanAnalysis() {
    if (observedScanAnalysis == null) {
      observedScanAnalysis = new ArrayList<>();
    }
    return this.observedScanAnalysis;
  }

  /**
   * Determine if the ObservedScanAnalysis is configured.
   * <p>
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
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   */
  public AntMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   */
  public AntMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  /**
   * Set ModeUse, indicate if the mode is used for transmit, receive, or both
   * transmit and receive.
   * <p>
   * @param value An instances of type {@link ListCAU}
   * @return The current AntMode object instance
   */
  public AntMode withModeUse(ListCAU value) {
    setModeUse(new TString(value.value()));
    return this;
  }

  /**
   * Set the general category for the movement of a scanning or tracking
   * antenna.
   * <p>
   * @param value An instances of type {@link ListCAD}
   * @return The current AntMode object instance
   */
  public AntMode withMotionType(ListCAD value) {
    setMotionType(new TString(value.value()));
    return this;
  }

  /**
   * Set "Yes" if sector blanking is possible and "No" if it is not possible.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current AntMode object instance
   */
  public AntMode withSectBlanking(ListCBO value) {
    setSectBlanking(new TString(value.value()));
    return this;
  }

  /**
   * Set the principal orientation of the electric field of the electromagnetic
   * wave for an antenna.
   * <p>
   * @param value An instances of type {@link ListCPO}
   * @return The current AntMode object instance
   */
  public AntMode withPolarisationType(ListCPO value) {
    setPolarisationType(new TString(value.value()));
    return this;
  }

  /**
   * Set the angle of the electric field vector measured counter-clockwise from
   * the equatorial plane as referenced from the boresight or typical static
   * positioning of the antenna.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withPolarisationAngle(Double value) {
    setPolarisationAngle(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of degrees per second the antenna is capable of scanning. It
   * is not necessarily the "Sector Scanned" figure times the degrees per
   * second. If a significant portion of time is spent vertically scanning in
   * between horizontal sweeps, the horizontal scan rate will be lower than if
   * the antenna were horizontally scanning all the time.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withHorzScanSpeed(Double value) {
    setHorzScanSpeed(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of complete scans the antenna is capable of making each
   * minute.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current AntMode object instance
   */
  public AntMode withHorzScanRate(Integer value) {
    setHorzScanRate(new TInteger(value));
    return this;
  }

  /**
   * Set the antenna horizontal scanning capability.
   * <p>
   * @param value An instances of type {@link ListCAS}
   * @return The current AntMode object instance
   */
  public AntMode withHorzScanType(ListCAS value) {
    setHorzScanType(new TString(value.value()));
    return this;
  }

  /**
   * Set the maximum horizontal sector the antenna can scan (enter 360 for a
   * full rotation).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withHorzScanSector(Double value) {
    setHorzScanSector(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of degrees of vertical scan per second. If an antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan speed would be 2 degrees per minute.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withVertScanSpeed(Double value) {
    setVertScanSpeed(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of complete vertical scans per minute. If the antenna does a
   * horizontal scan per second as part of a raster scan and drops down one
   * degree after each sweep, it is scanning vertically at one degree per
   * second. If the same antenna completed a scan in 30 seconds the vertical
   * scan rate would be 2 scans per minute.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current AntMode object instance
   */
  public AntMode withVertScanRate(Integer value) {
    setVertScanRate(new TInteger(value));
    return this;
  }

  /**
   * Set the antenna vertical scanning capability.
   * <p>
   * @param value An instances of type {@link ListCAS}
   * @return The current AntMode object instance
   */
  public AntMode withVertScanType(ListCAS value) {
    setVertScanType(new TString(value.value()));
    return this;
  }

  /**
   * Set the minimum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withVertScanAngleMin(Double value) {
    setVertScanAngleMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum limit of the vertical arc scanned relative to the
   * horizontal.
   * <p>
   * [XSL ERR MINMAX] If VertScanAngleMax is used, it MUST be greater than
   * VertScanAngleMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withVertScanAngleMax(Double value) {
    setVertScanAngleMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the antenna direction of rotation or motion.
   * <p>
   * @param value An instances of type {@link ListCRD}
   * @return The current AntMode object instance
   */
  public AntMode withRotationDirection(ListCRD value) {
    setRotationDirection(new TString(value.value()));
    return this;
  }

  /**
   * Set the nominal or minimum antenna rotation rate.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withRotationRateMin(Double value) {
    setRotationRateMin(new TDecimal(value));
    return this;
  }

  /**
   * Set if applicable, the maximum antenna rotation rate.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withRotationRateMax(Double value) {
    setRotationRateMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal horizontal beamwidth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withHorzBwMin(Double value) {
    setHorzBwMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum horizontal beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withHorzBwMax(Double value) {
    setHorzBwMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal vertical beamwidth.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withVertBwMin(Double value) {
    setVertBwMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum vertical beamwidth for beamwidths which vary with the
   * frequency.
   * <p>
   * [XSL ERR MINMAX] If VertBwMax is used, it MUST be greater than VertBwMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withVertBwMax(Double value) {
    setVertBwMax(new TDecimal(value));
    return this;
  }

  /**
   * Set one of the codes describing the shape or type of the antenna main beam.
   * <p>
   * @param value An instances of type {@link ListCBD}
   * @return The current AntMode object instance
   */
  public AntMode withBeamType(ListCBD value) {
    setBeamType(new TString(value.value()));
    return this;
  }

  /**
   * Set the maximum level of input power.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withMaxPower(Double value) {
    setMaxPower(new TDecimal(value));
    return this;
  }

  /**
   * Set the power ratio between the signal injected into one port and the power
   * returned by the other port .
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntMode object instance
   */
  public AntMode withPortIsolation(Double value) {
    setPortIsolation(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AntMode object instance
   */
  public AntMode withModeName(String value) {
    setModeName(new TString(value));
    return this;
  }

  /**
   * Set the AntGain
   * <p>
   * Complex element AntGain indicates the antenna gain, in decibels with
   * reference to an isotropic source (dBi), in the direction of maximum
   * radiation.
   * <p>
   * @param values One or more instances of type {@link AntGain}
   * @return The current AntMode object instance
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
   * <p>
   * @param values A collection of {@link AntGain} instances
   * @return The current AntMode object instance
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
   * @param values One or more instances of type {@link AntFreqs}
   * @return The current AntMode object instance
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
   * @return The current AntMode object instance
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
   * @param values One or more instances of type {@link AntPattern}
   * @return The current AntMode object instance
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
   * @return The current AntMode object instance
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
   * @param values One or more instances of type {@link AntEfficiency}
   * @return The current AntMode object instance
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
   * @return The current AntMode object instance
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
   * @param values One or more instances of type {@link VSWR}
   * @return The current AntMode object instance
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
   * @return The current AntMode object instance
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
   * @param values One or more instances of type {@link ObservedLobeAnalysis}
   * @return The current AntMode object instance
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
   * @return The current AntMode object instance
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
   *               {@link ObservedPolarisationAnalysis}
   * @return The current AntMode object instance
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
   * @return The current AntMode object instance
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
   * @param values One or more instances of type {@link ObservedScanAnalysis}
   * @return The current AntMode object instance
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
   * @return The current AntMode object instance
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
    return "AntMode {"
      + (polarisationType != null ? " polarisationType [" + polarisationType + "]" : "")
      + (horzBwMin != null ? " horzBwMin [" + horzBwMin + "]" : "")
      + (modeID != null ? " modeID [" + modeID + "]" : "")
      + (vertScanType != null ? " vertScanType [" + vertScanType + "]" : "")
      + (observedScanAnalysis != null ? " observedScanAnalysis [" + observedScanAnalysis + "]" : "")
      + (modeName != null ? " modeName [" + modeName + "]" : "")
      + (observedLobeAnalysis != null ? " observedLobeAnalysis [" + observedLobeAnalysis + "]" : "")
      + (vertScanAngleMin != null ? " vertScanAngleMin [" + vertScanAngleMin + "]" : "")
      + (vertScanAngleMax != null ? " vertScanAngleMax [" + vertScanAngleMax + "]" : "")
      + (horzScanType != null ? " horzScanType [" + horzScanType + "]" : "")
      + (horzScanRate != null ? " horzScanRate [" + horzScanRate + "]" : "")
      + (description != null ? " description [" + description + "]" : "")
      + (rotationRateMax != null ? " rotationRateMax [" + rotationRateMax + "]" : "")
      + (beamType != null ? " beamType [" + beamType + "]" : "")
      + (antEfficiency != null ? " antEfficiency [" + antEfficiency + "]" : "")
      + (antPattern != null ? " antPattern [" + antPattern + "]" : "")
      + (horzScanSpeed != null ? " horzScanSpeed [" + horzScanSpeed + "]" : "")
      + (vertScanSpeed != null ? " vertScanSpeed [" + vertScanSpeed + "]" : "")
      + (portIsolation != null ? " portIsolation [" + portIsolation + "]" : "")
      + (sectBlanking != null ? " sectBlanking [" + sectBlanking + "]" : "")
      + (observedPolarisationAnalysis != null ? " observedPolarisationAnalysis [" + observedPolarisationAnalysis + "]" : "")
      + (vertScanRate != null ? " vertScanRate [" + vertScanRate + "]" : "")
      + (polarisationAngle != null ? " polarisationAngle [" + polarisationAngle + "]" : "")
      + (motionType != null ? " motionType [" + motionType + "]" : "")
      + (rotationRateMin != null ? " rotationRateMin [" + rotationRateMin + "]" : "")
      + (maxPower != null ? " maxPower [" + maxPower + "]" : "")
      + (horzBwMax != null ? " horzBwMax [" + horzBwMax + "]" : "")
      + (vertBwMax != null ? " vertBwMax [" + vertBwMax + "]" : "")
      + (antFreqs != null ? " antFreqs [" + antFreqs + "]" : "")
      + (horzScanSector != null ? " horzScanSector [" + horzScanSector + "]" : "")
      + (vertBwMin != null ? " vertBwMin [" + vertBwMin + "]" : "")
      + (antGain != null ? " antGain [" + antGain + "]" : "")
      + (modeUse != null ? " modeUse [" + modeUse + "]" : "")
      + (vswr != null ? " vswr [" + vswr + "]" : "")
      + (rotationDirection != null ? " rotationDirection [" + rotationDirection + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntMode} requires {@link TString ModeID}.
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
