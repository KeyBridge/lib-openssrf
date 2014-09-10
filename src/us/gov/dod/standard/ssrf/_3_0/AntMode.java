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
package us.gov.dod.standard.ssrf._3_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

/**
 * <p>
 * Java class for AntMode complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="AntMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ModeInfo"/>
 *         &lt;element name="ModeUse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAU" minOccurs="0"/>
 *         &lt;element name="MotionType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="SectBlanking" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Pol" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}HorzScan" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}VertScan" minOccurs="0"/>
 *         &lt;element name="RotationDirection" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCRD" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}RotationRate" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Beamwidth" minOccurs="0"/>
 *         &lt;element name="MaxPower" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdBW" minOccurs="0"/>
 *         &lt;element name="PortIsolation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="ModeName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS40" minOccurs="0"/>
 *         &lt;element name="AntGain" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntGain" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AntFreqs" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntFreqs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AntPattern" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntPattern" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AntEfficiency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntEfficiency" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VSWR" type="{urn:us:gov:dod:standard:ssrf:3.0.0}VSWR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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

  @XmlElement(name = "ModeID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  @XmlElement(name = "ModeUse", required = false)
  private TString modeUse;
  @XmlElement(name = "MotionType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString motionType;
  @XmlElement(name = "SectBlanking", required = false)
  private TString sectBlanking;
  @XmlElement(name = "PolarisationType")
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString polarisationType;
  @XmlElement(name = "PolarisationAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal polarisationAngle;
  @XmlElement(name = "HorzScanSpeed", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal horzScanSpeed;
  @XmlElement(name = "HorzScanRate", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger horzScanRate;
  @XmlElement(name = "HorzScanType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString horzScanType;
  @XmlElement(name = "HorzScanSector", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzScanSector;
  @XmlElement(name = "VertScanSpeed", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSCANSPEED.class)
  private TDecimal vertScanSpeed;
  @XmlElement(name = "VertScanRate", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterSCANRATE.class)
  private TInteger vertScanRate;
  @XmlElement(name = "VertScanType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString vertScanType;
  @XmlElement(name = "VertScanAngleMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMin;
  @XmlElement(name = "VertScanAngleMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal vertScanAngleMax;
  @XmlElement(name = "RotationDirection", required = false)
  private TString rotationDirection;
  @XmlElement(name = "RotationRateMin")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_2.class)
  private TDecimal rotationRateMin;
  @XmlElement(name = "RotationRateMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_2.class)
  private TDecimal rotationRateMax;
  @XmlElement(name = "HorzBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMin;
  @XmlElement(name = "HorzBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal horzBwMax;
  @XmlElement(name = "VertBwMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMin;
  @XmlElement(name = "VertBwMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal vertBwMax;
  @XmlElement(name = "BeamType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString beamType;
  @XmlElement(name = "MaxPower", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal maxPower;
  @XmlElement(name = "PortIsolation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal portIsolation;
  @XmlElement(name = "ModeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;
  @XmlElement(name = "AntGain")
  private List<AntGain> antGain;
  @XmlElement(name = "AntFreqs")
  private List<AntFreqs> antFreqs;
  @XmlElement(name = "AntPattern")
  private List<AntPattern> antPattern;
  @XmlElement(name = "AntEfficiency")
  private List<AntEfficiency> antEfficiency;
  @XmlElement(name = "VSWR")
  private List<VSWR> vswr;

  /**
   * Gets the value of the modeID property.
   * <p>
   * @return possible object is {@link TS20 }
   * <p>
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Sets the value of the modeID property.
   * <p>
   * @param value allowed object is {@link TS20 }
   * <p>
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
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
   * <p>
   */
  public TString getModeUse() {
    return modeUse;
  }

  /**
   * Sets the value of the modeUse property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public TString getMotionType() {
    return motionType;
  }

  /**
   * Sets the value of the motionType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getSectBlanking() {
    return sectBlanking;
  }

  /**
   * Sets the value of the sectBlanking property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
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
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TString getPolarisationType() {
    return polarisationType;
  }

  /**
   * Sets the value of the polarisationType property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
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
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public TDecimal getPolarisationAngle() {
    return polarisationAngle;
  }

  /**
   * Sets the value of the polarisationAngle property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
   * <p>
   */
  public TDecimal getHorzScanSpeed() {
    return horzScanSpeed;
  }

  /**
   * Sets the value of the horzScanSpeed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
   * <p>
   */
  public TInteger getHorzScanRate() {
    return horzScanRate;
  }

  /**
   * Sets the value of the horzScanRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getHorzScanType() {
    return horzScanType;
  }

  /**
   * Sets the value of the horzScanType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public TDecimal getHorzScanSector() {
    return horzScanSector;
  }

  /**
   * Sets the value of the horzScanSector property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
   * <p>
   */
  public TDecimal getVertScanSpeed() {
    return vertScanSpeed;
  }

  /**
   * Sets the value of the vertScanSpeed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
   * <p>
   */
  public TInteger getVertScanRate() {
    return vertScanRate;
  }

  /**
   * Sets the value of the vertScanRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getVertScanType() {
    return vertScanType;
  }

  /**
   * Sets the value of the vertScanType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public TDecimal getVertScanAngleMin() {
    return vertScanAngleMin;
  }

  /**
   * Sets the value of the vertScanAngleMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public TDecimal getVertScanAngleMax() {
    return vertScanAngleMax;
  }

  /**
   * Sets the value of the vertScanAngleMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TListCRD }{@code >}
   * <p>
   */
  public TString getRotationDirection() {
    return rotationDirection;
  }

  /**
   * Sets the value of the rotationDirection property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCRD }{@code >}
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
   * @return possible object is {@link TUN7_2 }
   * <p>
   */
  public TDecimal getRotationRateMin() {
    return rotationRateMin;
  }

  /**
   * Sets the value of the rotationRateMin property.
   * <p>
   * @param value allowed object is {@link TUN7_2 }
   * <p>
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
   *         {@link JAXBElement }{@code <}{@link TUN7_2 }{@code >}
   * <p>
   */
  public TDecimal getRotationRateMax() {
    return rotationRateMax;
  }

  /**
   * Sets the value of the rotationRateMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN7_2 }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public TDecimal getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Sets the value of the horzBwMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public TDecimal getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Sets the value of the horzBwMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public TDecimal getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Sets the value of the vertBwMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public TDecimal getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Sets the value of the vertBwMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public TString getBeamType() {
    return beamType;
  }

  /**
   * Sets the value of the beamType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public TDecimal getMaxPower() {
    return maxPower;
  }

  /**
   * Sets the value of the maxPower property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public TDecimal getPortIsolation() {
    return portIsolation;
  }

  /**
   * Sets the value of the portIsolation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Sets the value of the modeName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS40 }{@code >}
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
   * Objects of the following type(s) are allowed in the list {@link AntGain }
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
   * Objects of the following type(s) are allowed in the list {@link AntFreqs }
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
     * {@link AntPattern }
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
     * {@link AntEfficiency }
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
   * Objects of the following type(s) are allowed in the list {@link VSWR }
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
