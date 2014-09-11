/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAU;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCRD;

/**
 * Java class for AntMode complex type.
 * <p>
 * This element contains the technical characteristics of one antenna mode.
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
  "vswr"
})
public class AntMode {

  /**
   * ModeID: Enter a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset. [XSD ERR UNIQUE] Each
   * value of this data item MUST be unique within the parent element.
   */
  @XmlElement(name = "ModeID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * Description: Enter a description of the operational mode; this description
   * should be a meaningful explanation of the mode main characteristics.
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * ModeUse: [XSD ERR CODELIST] This data item MUST use one of the codes from
   * Code List CAU: Code Transmit Only Receive Only Transmit-Receive
   */
  @XmlElement(name = "ModeUse", required = false)
  private TString modeUse;
  /**
   * MotionType: Recommend values from Code List CAD
   */
  @XmlElement(name = "MotionType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString motionType;
  /**
   * SectBlanking: ("Yes" if sector blanking is possible and "No" if it is not
   * possible) [XSD ERR CODELIST] This data item MUST use one of the codes from
   * Code List CBO: Code Yes No
   */
  @XmlElement(name = "SectBlanking", required = false)
  private TString sectBlanking;
  /**
   * PolarisationType: Recommend values from Code List CPO
   */
  @XmlElement(name = "PolarisationType")
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString polarisationType;
  /**
   * PolarisationAngle: Enter the angle of the electric field vector measured
   * counter-clockwise from the equatorial plane as referenced from the
   * boresight or typical static positioning of the antenna.
   */
  @XmlElement(name = "PolarisationAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal polarisationAngle;

  /**
   * HorzScan: This group is OPTIONAL.
   * <p>
   * This group contains the method about how the antenna beam is steerable in
   * the horizontal axis, the portion of a circle that can be scanned by the
   * antenna, the horizontal scan rate and the number of horizontal scans per
   * minute.
   */
  /**
   * HorzScanSpeed: Enter the number of degrees per second the antenna is
   * capable of scanning. It is not necessarily the "Sector Scanned" figure
   * times the degrees per second. If a significant portion of time is spent
   * vertically scanning in between horizontal sweeps, the horizontal scan rate
   * will be lower than if the antenna were horizontally scanning all the time.
   */
  @XmlElement(name = "HorzScanSpeed", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal horzScanSpeed;
  /**
   * HorzScanRate: Enter the number of complete scans the antenna is capable of
   * making each minute.
   */
  @XmlElement(name = "HorzScanRate", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger horzScanRate;
  /**
   * HorzScanType: Enter the antenna horizontal scanning capability.
   * <p>
   * Recommend values from Code List CAS (extract only): Code 360 Degrees
   * Rotating Bi-Directional Sector Conical Electronic Scan (360 Degrees)
   * Electronic Scan (Sector) Fixed Fixed-3 Axis Stabilised Helical Horizontal
   * Lobing ...
   */
  @XmlElement(name = "HorzScanType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString horzScanType;
  /**
   * HorzScanSector: Enter the maximum horizontal sector the antenna can scan
   * (enter 360 for a full rotation). Example:<HorzScanSpeed
   * cls="U">90</HorzScanSpeed> <HorzScanRate cls="U">15</HorzScanRate>
   * <HorzScanType cls="U">Horizontal</HorzScanType>
   */
  @XmlElement(name = "HorzScanSector", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzScanSector;

  /**
   * Vertical Scan: This group is OPTIONAL.
   * <p>
   * <p>
   * This group contains the method about how the antenna beam is steerable in
   * the vertical axis, the minimum and maximum limits of the vertical sector
   * scanned in degrees referenced to the horizon, the vertical scan speed and
   * the number of vertical scans per minute.
   */
  /**
   * VertScanSpeed: Enter the number of degrees of vertical scan per second. If
   * an antenna does a horizontal scan per second as part of a raster scan and
   * drops down one degree after each sweep, it is scanning vertically at one
   * degree per second. If the same antenna completed a scan in 30 seconds the
   * vertical scan speed would be 2 degrees per minute.
   */
  @XmlElement(name = "VertScanSpeed", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal vertScanSpeed;
  /**
   * VertScanRate: Enter the number of complete vertical scans per minute. If
   * the antenna does a horizontal scan per second as part of a raster scan and
   * drops down one degree after each sweep, it is scanning vertically at one
   * degree per second. If the same antenna completed a scan in 30 seconds the
   * vertical scan rate would be 2 scans per minute.
   */
  @XmlElement(name = "VertScanRate", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger vertScanRate;
  /**
   * VertScanType: Enter the antenna vertical scanning capability.
   * <p>
   * Recommend values from Code List CAS (extract only): Code 360 Degrees
   * Rotating Bi-Directional Sector Conical Electronic Scan (360 Degrees)
   * Electronic Scan (Sector) Fixed Fixed-3 Axis Stabilised Helical Horizontal
   * Lobing ...
   */
  @XmlElement(name = "VertScanType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString vertScanType;
  /**
   * VertScanAngleMin: Enter the minimum limit of the vertical arc scanned
   * relative to the horizontal.
   */
  @XmlElement(name = "VertScanAngleMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMin;
  /**
   * VertScanAngleMax: Enter the maximum limit of the vertical arc scanned
   * relative to the horizontal.
   */
  @XmlElement(name = "VertScanAngleMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMax;

  /**
   * RotationDirection:
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CRD: Code Clockwise Counter-Clockwise
   */
  @XmlElement(name = "RotationDirection", required = false)
  private TString rotationDirection;
  /**
   * RotationRateMin: Enter the nominal or minimum antenna rotation rate in
   * degrees per second.
   */
  @XmlElement(name = "RotationRateMin")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_2.class)
  private TDecimal rotationRateMin;
  /**
   * RotationRateMax: Enter if applicable, the maximum antenna rotation rate in
   * degrees per second.
   * <p>
   * [XSL ERR MINMAX] If RotationRateMax is used, it MUST be greater than
   * RotationRateMin.
   */
  @XmlElement(name = "RotationRateMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_2.class)
  private TDecimal rotationRateMax;

  /**
   * HorzBwMin: Enter the minimum or nominal horizontal beamwidth.
   */
  @XmlElement(name = "HorzBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMin;
  /**
   * HorzBwMax: Enter the maximum horizontal beamwidth for beamwidths which vary
   * with the frequency.
   * <p>
   * [XSL ERR MINMAX] If HorzBwMax is used, it MUST be greater than HorzBwMin.
   */
  @XmlElement(name = "HorzBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMax;
  /**
   * VertBwMin: Enter the minimum or nominal vertical beamwidth.
   */
  @XmlElement(name = "VertBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMin;
  /**
   * VertBwMax: Enter the maximum vertical beamwidth for beamwidths which vary
   * with the frequency. [XSL ERR MINMAX] If VertBwMax is used, it MUST be
   * greater than VertBwMin.
   */
  @XmlElement(name = "VertBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMax;
  /**
   * BeamType: Enter one of the codes describing the shape or type of the
   * antenna main beam .
   * <p>
   * Recommend values from Code List CBD: Code Cardioid Cosecant Squared
   * Elliptical Fan Hyperbolic Omni Pencil Shaped Beam Single Symmetrical Lobe
   * Other
   */
  @XmlElement(name = "BeamType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString beamType;
  /**
   * MaxPower: Enter the maximum level of input power in dBW.
   */
  @XmlElement(name = "MaxPower", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal maxPower;
  /**
   * PortIsolation: Enter the power ratio between the signal injected into one
   * port and the power returned by the other port in dB.
   */
  @XmlElement(name = "PortIsolation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal portIsolation;
  /**
   * ModeName (US): Enter a short name for the mode.
   */
  @XmlElement(name = "ModeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;

  /**
   * This element indicates the antenna gain, in decibels with reference to an
   * isotropic source (dBi), in the direction of maximum radiation. It can also
   * contain the gain measured 180 degrees from the direction of maximum main
   * beam gain.
   */
  @XmlElement(name = "AntGain")
  private List<AntGain> antGain;
  /**
   * This element contains the antenna's designed tuning range, or the discrete
   * operating frequency.
   */
  @XmlElement(name = "AntFreqs")
  private List<AntFreqs> antFreqs;
  /**
   * Data element AntPattern contains an antenna pattern diagram on a specific
   * plane. General pattern cuts can be defined by a spherical coordinate system
   * with the electrical boresite of the antenna oriented in the direction of
   * the Z-axis. At different values of phi ( # ), pattern cuts can be taken
   * with theta ( # ) as the dependent variable. These will be great circle cuts
   * through the main-beam peak. An additional measurement relating the
   * mechanical and electrical boresite must be made to fully characterize the
   * antenna. Also the orientation of the antenna to the spherical coordinate
   * system must be defined. (example: top of the antenna oriented in the +x
   * direction).
   */
  @XmlElement(name = "AntPattern")
  private List<AntPattern> antPattern;
  /**
   * AntEfficiency describes the antenna efficiency at various frequencies
   * within the frequency range of the antenna.
   */
  @XmlElement(name = "AntEfficiency")
  private List<AntEfficiency> antEfficiency;
  /**
   * Element VSWR stores the Voltage Standing Wave Ratio information for an
   * Antenna Mode; it may be used to describe the VSWR curve as a function of
   * frequency.
   * <p>
   * VSWR is a measure of how efficiently radio-frequency power is transmitted
   * from a power source, through a transmission line, into a load (for example,
   * from a power amplifier through a transmission line, to an antenna). In an
   * ideal system, 100% of the energy is transmitted. This requires an exact
   * match between the source impedance, the characteristic impedance of the
   * transmission line and all its connectors, and the load's impedance. The
   * signal's AC voltage will be the same from end to end since it runs through
   * without interference. In real systems, mismatched impedances cause some of
   * the power to be reflected back toward the source (like an echo).
   * Reflections cause destructive interference, leading to peaks and valleys in
   * the voltage at various times and distances along the line. VSWR measures
   * these voltage variances. It is the ratio of the highest voltage anywhere
   * along the transmission line to the lowest. Since the voltage doesn't vary
   * in an ideal system, its VSWR is 1:1. When reflections occur, the voltages
   * vary and VSWR is higher (1.2:1 or 2:1, for instance).
   * <p>
   */
  @XmlElement(name = "VSWR")
  private List<VSWR> vswr;

  /**
   * Gets the value of the modeID property.
   * <p>
   * @return
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Sets the value of the modeID property.
   * <p>
   * @param value
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  public boolean isSetModeID() {
    return (this.modeID != null);
  }

  /**
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Gets the value of the modeUse property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getModeUse() {
    return modeUse;
  }

  /**
   * Sets the value of the modeUse property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setModeUse(TString value) {
    this.modeUse = value;
  }

  public boolean isSetModeUse() {
    return (this.modeUse != null);
  }

  /**
   * Gets the value of the motionType property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getMotionType() {
    return motionType;
  }

  /**
   * Sets the value of the motionType property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setMotionType(TString value) {
    this.motionType = value;
  }

  public boolean isSetMotionType() {
    return (this.motionType != null);
  }

  /**
   * Gets the value of the sectBlanking property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getSectBlanking() {
    return sectBlanking;
  }

  /**
   * Sets the value of the sectBlanking property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setSectBlanking(TString value) {
    this.sectBlanking = value;
  }

  public boolean isSetSectBlanking() {
    return (this.sectBlanking != null);
  }

  /**
   * Gets the value of the polarisationType property.
   * <p>
   * @return
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Sets the value of the polarisationType property.
   * <p>
   * @param value
   */
  public void setPolarisationType(TString value) {
    this.polarisationType = value;
  }

  public boolean isSetPolarisationType() {
    return (this.polarisationType != null);
  }

  /**
   * Gets the value of the polarisationAngle property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getPolarisationAngle() {
    return polarisationAngle;
  }

  /**
   * Sets the value of the polarisationAngle property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setPolarisationAngle(TDecimal value) {
    this.polarisationAngle = value;
  }

  public boolean isSetPolarisationAngle() {
    return (this.polarisationAngle != null);
  }

  /**
   * Gets the value of the horzScanSpeed property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzScanSpeed() {
    return horzScanSpeed;
  }

  /**
   * Sets the value of the horzScanSpeed property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzScanSpeed(TDecimal value) {
    this.horzScanSpeed = value;
  }

  public boolean isSetHorzScanSpeed() {
    return (this.horzScanSpeed != null);
  }

  /**
   * Gets the value of the horzScanRate property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TInteger getHorzScanRate() {
    return horzScanRate;
  }

  /**
   * Sets the value of the horzScanRate property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzScanRate(TInteger value) {
    this.horzScanRate = value;
  }

  public boolean isSetHorzScanRate() {
    return (this.horzScanRate != null);
  }

  /**
   * Gets the value of the horzScanType property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getHorzScanType() {
    return horzScanType;
  }

  /**
   * Sets the value of the horzScanType property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzScanType(TString value) {
    this.horzScanType = value;
  }

  public boolean isSetHorzScanType() {
    return (this.horzScanType != null);
  }

  /**
   * Gets the value of the horzScanSector property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzScanSector() {
    return horzScanSector;
  }

  /**
   * Sets the value of the horzScanSector property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzScanSector(TDecimal value) {
    this.horzScanSector = value;
  }

  public boolean isSetHorzScanSector() {
    return (this.horzScanSector != null);
  }

  /**
   * Gets the value of the vertScanSpeed property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertScanSpeed() {
    return vertScanSpeed;
  }

  /**
   * Sets the value of the vertScanSpeed property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertScanSpeed(TDecimal value) {
    this.vertScanSpeed = value;
  }

  public boolean isSetVertScanSpeed() {
    return (this.vertScanSpeed != null);
  }

  /**
   * Gets the value of the vertScanRate property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TInteger getVertScanRate() {
    return vertScanRate;
  }

  /**
   * Sets the value of the vertScanRate property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertScanRate(TInteger value) {
    this.vertScanRate = value;
  }

  public boolean isSetVertScanRate() {
    return (this.vertScanRate != null);
  }

  /**
   * Gets the value of the vertScanType property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getVertScanType() {
    return vertScanType;
  }

  /**
   * Sets the value of the vertScanType property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertScanType(TString value) {
    this.vertScanType = value;
  }

  public boolean isSetVertScanType() {
    return (this.vertScanType != null);
  }

  /**
   * Gets the value of the vertScanAngleMin property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertScanAngleMin() {
    return vertScanAngleMin;
  }

  /**
   * Sets the value of the vertScanAngleMin property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertScanAngleMin(TDecimal value) {
    this.vertScanAngleMin = value;
  }

  public boolean isSetVertScanAngleMin() {
    return (this.vertScanAngleMin != null);
  }

  /**
   * Gets the value of the vertScanAngleMax property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertScanAngleMax() {
    return vertScanAngleMax;
  }

  /**
   * Sets the value of the vertScanAngleMax property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertScanAngleMax(TDecimal value) {
    this.vertScanAngleMax = value;
  }

  public boolean isSetVertScanAngleMax() {
    return (this.vertScanAngleMax != null);
  }

  /**
   * Gets the value of the rotationDirection property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getRotationDirection() {
    return rotationDirection;
  }

  /**
   * Sets the value of the rotationDirection property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setRotationDirection(TString value) {
    this.rotationDirection = value;
  }

  public boolean isSetRotationDirection() {
    return (this.rotationDirection != null);
  }

  /**
   * Gets the value of the rotationRateMin property.
   * <p>
   * @return
   */
  public TDecimal getRotationRateMin() {
    return rotationRateMin;
  }

  /**
   * Sets the value of the rotationRateMin property.
   * <p>
   * @param value
   */
  public void setRotationRateMin(TDecimal value) {
    this.rotationRateMin = value;
  }

  public boolean isSetRotationRateMin() {
    return (this.rotationRateMin != null);
  }

  /**
   * Gets the value of the rotationRateMax property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getRotationRateMax() {
    return rotationRateMax;
  }

  /**
   * Sets the value of the rotationRateMax property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setRotationRateMax(TDecimal value) {
    this.rotationRateMax = value;
  }

  public boolean isSetRotationRateMax() {
    return (this.rotationRateMax != null);
  }

  /**
   * Gets the value of the horzBwMin property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Sets the value of the horzBwMin property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzBwMin(TDecimal value) {
    this.horzBwMin = value;
  }

  public boolean isSetHorzBwMin() {
    return (this.horzBwMin != null);
  }

  /**
   * Gets the value of the horzBwMax property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Sets the value of the horzBwMax property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setHorzBwMax(TDecimal value) {
    this.horzBwMax = value;
  }

  public boolean isSetHorzBwMax() {
    return (this.horzBwMax != null);
  }

  /**
   * Gets the value of the vertBwMin property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Sets the value of the vertBwMin property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertBwMin(TDecimal value) {
    this.vertBwMin = value;
  }

  public boolean isSetVertBwMin() {
    return (this.vertBwMin != null);
  }

  /**
   * Gets the value of the vertBwMax property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Sets the value of the vertBwMax property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setVertBwMax(TDecimal value) {
    this.vertBwMax = value;
  }

  public boolean isSetVertBwMax() {
    return (this.vertBwMax != null);
  }

  /**
   * Gets the value of the beamType property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getBeamType() {
    return beamType;
  }

  /**
   * Sets the value of the beamType property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setBeamType(TString value) {
    this.beamType = value;
  }

  public boolean isSetBeamType() {
    return (this.beamType != null);
  }

  /**
   * Gets the value of the maxPower property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getMaxPower() {
    return maxPower;
  }

  /**
   * Sets the value of the maxPower property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setMaxPower(TDecimal value) {
    this.maxPower = value;
  }

  public boolean isSetMaxPower() {
    return (this.maxPower != null);
  }

  /**
   * Gets the value of the portIsolation property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TDecimal getPortIsolation() {
    return portIsolation;
  }

  /**
   * Sets the value of the portIsolation property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setPortIsolation(TDecimal value) {
    this.portIsolation = value;
  }

  public boolean isSetPortIsolation() {
    return (this.portIsolation != null);
  }

  /**
   * Gets the value of the modeName property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Sets the value of the modeName property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setModeName(TString value) {
    this.modeName = value;
  }

  public boolean isSetModeName() {
    return (this.modeName != null);
  }

  /**
   * Gets the value of the antGain property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antGain property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntGain().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<AntGain> getAntGain() {
    if (antGain == null) {
      antGain = new ArrayList<>();
    }
    return this.antGain;
  }

  public boolean isSetAntGain() {
    return ((this.antGain != null) && (!this.antGain.isEmpty()));
  }

  public void unsetAntGain() {
    this.antGain = null;
  }

  /**
   * Gets the value of the antFreqs property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antFreqs property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntFreqs().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<AntFreqs> getAntFreqs() {
    if (antFreqs == null) {
      antFreqs = new ArrayList<>();
    }
    return this.antFreqs;
  }

  public boolean isSetAntFreqs() {
    return ((this.antFreqs != null) && (!this.antFreqs.isEmpty()));
  }

  public void unsetAntFreqs() {
    this.antFreqs = null;
  }

  /**
   * Gets the value of the antPattern property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antPattern property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntPattern().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new ArrayList<>();
    }
    return this.antPattern;
  }

  public boolean isSetAntPattern() {
    return ((this.antPattern != null) && (!this.antPattern.isEmpty()));
  }

  public void unsetAntPattern() {
    this.antPattern = null;
  }

  /**
   * Gets the value of the antEfficiency property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antEfficiency property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntEfficiency().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<AntEfficiency> getAntEfficiency() {
    if (antEfficiency == null) {
      antEfficiency = new ArrayList<>();
    }
    return this.antEfficiency;
  }

  public boolean isSetAntEfficiency() {
    return ((this.antEfficiency != null) && (!this.antEfficiency.isEmpty()));
  }

  public void unsetAntEfficiency() {
    this.antEfficiency = null;
  }

  /**
   * Gets the value of the vswr property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the vswr property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getVSWR().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<VSWR> getVSWR() {
    if (vswr == null) {
      vswr = new ArrayList<>();
    }
    return this.vswr;
  }

  public boolean isSetVSWR() {
    return ((this.vswr != null) && (!this.vswr.isEmpty()));
  }

  public void unsetVSWR() {
    this.vswr = null;
  }

  public AntMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  public AntMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  public AntMode withModeUse(ListCAU value) {
    setModeUse(new TString(value.value()));
    return this;
  }

  public AntMode withMotionType(String value) {
    setMotionType(new TString(value));
    return this;
  }

  public AntMode withSectBlanking(ListCBO value) {
    setSectBlanking(new TString(value.value()));
    return this;
  }

  public AntMode withPolarisationType(String value) {
    setPolarisationType(new TString(value));
    return this;
  }

  public AntMode withPolarisationAngle(Double value) {
    setPolarisationAngle(new TDecimal(value));
    return this;
  }

  public AntMode withHorzScanSpeed(Double value) {
    setHorzScanSpeed(new TDecimal(value));
    return this;
  }

  public AntMode withHorzScanRate(Integer value) {
    setHorzScanRate(new TInteger(value));
    return this;
  }

  public AntMode withHorzScanType(String value) {
    setHorzScanType(new TString(value));
    return this;
  }

  public AntMode withHorzScanSector(Double value) {
    setHorzScanSector(new TDecimal(value));
    return this;
  }

  public AntMode withVertScanSpeed(Double value) {
    setVertScanSpeed(new TDecimal(value));
    return this;
  }

  public AntMode withVertScanRate(Integer value) {
    setVertScanRate(new TInteger(value));
    return this;
  }

  public AntMode withVertScanType(String value) {
    setVertScanType(new TString(value));
    return this;
  }

  public AntMode withVertScanAngleMin(Double value) {
    setVertScanAngleMin(new TDecimal(value));
    return this;
  }

  public AntMode withVertScanAngleMax(Double value) {
    setVertScanAngleMax(new TDecimal(value));
    return this;
  }

  public AntMode withRotationDirection(ListCRD value) {
    setRotationDirection(new TString(value.value()));
    return this;
  }

  public AntMode withRotationRateMin(Double value) {
    setRotationRateMin(new TDecimal(value));
    return this;
  }

  public AntMode withRotationRateMax(Double value) {
    setRotationRateMax(new TDecimal(value));
    return this;
  }

  public AntMode withHorzBwMin(Double value) {
    setHorzBwMin(new TDecimal(value));
    return this;
  }

  public AntMode withHorzBwMax(Double value) {
    setHorzBwMax(new TDecimal(value));
    return this;
  }

  public AntMode withVertBwMin(Double value) {
    setVertBwMin(new TDecimal(value));
    return this;
  }

  public AntMode withVertBwMax(Double value) {
    setVertBwMax(new TDecimal(value));
    return this;
  }

  public AntMode withBeamType(String value) {
    setBeamType(new TString(value));
    return this;
  }

  public AntMode withMaxPower(Double value) {
    setMaxPower(new TDecimal(value));
    return this;
  }

  public AntMode withPortIsolation(Double value) {
    setPortIsolation(new TDecimal(value));
    return this;
  }

  public AntMode withModeName(String value) {
    setModeName(new TString(value));
    return this;
  }

  public AntMode withAntGain(AntGain... values) {
    if (values != null) {
      getAntGain().addAll(Arrays.asList(values));
    }
    return this;
  }

  public AntMode withAntGain(Collection<AntGain> values) {
    if (values != null) {
      getAntGain().addAll(values);
    }
    return this;
  }

  public AntMode withAntFreqs(AntFreqs... values) {
    if (values != null) {
      getAntFreqs().addAll(Arrays.asList(values));
    }
    return this;
  }

  public AntMode withAntFreqs(Collection<AntFreqs> values) {
    if (values != null) {
      getAntFreqs().addAll(values);
    }
    return this;
  }

  public AntMode withAntPattern(AntPattern... values) {
    if (values != null) {
      getAntPattern().addAll(Arrays.asList(values));
    }
    return this;
  }

  public AntMode withAntPattern(Collection<AntPattern> values) {
    if (values != null) {
      getAntPattern().addAll(values);
    }
    return this;
  }

  public AntMode withAntEfficiency(AntEfficiency... values) {
    if (values != null) {
      getAntEfficiency().addAll(Arrays.asList(values));
    }
    return this;
  }

  public AntMode withAntEfficiency(Collection<AntEfficiency> values) {
    if (values != null) {
      getAntEfficiency().addAll(values);
    }
    return this;
  }

  public AntMode withVSWR(VSWR... values) {
    if (values != null) {
      getVSWR().addAll(Arrays.asList(values));
    }
    return this;
  }

  public AntMode withVSWR(Collection<VSWR> values) {
    if (values != null) {
      getVSWR().addAll(values);
    }
    return this;
  }

}
