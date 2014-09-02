/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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

import us.gov.dod.standard.ssrf._3_0.datatype.TListCAU;
import us.gov.dod.standard.ssrf._3_0.datatype.TS100;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBO;
import us.gov.dod.standard.ssrf._3_0.datatype.TAz;
import us.gov.dod.standard.ssrf._3_0.datatype.TdBW;
import us.gov.dod.standard.ssrf._3_0.datatype.TS40;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import us.gov.dod.standard.ssrf._3_0.datatype.TS20;
import us.gov.dod.standard.ssrf._3_0.datatype.TScanRate;
import us.gov.dod.standard.ssrf._3_0.datatype.TElev;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCRD;
import us.gov.dod.standard.ssrf._3_0.datatype.TdB;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN7_2;
import us.gov.dod.standard.ssrf._3_0.datatype.TScanSpeed;
import us.gov.dod.standard.ssrf._3_0.datatype.TS25;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for AntMode complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
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
  protected TS20 modeID;
  @XmlElementRef(name = "Description", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> description;
  @XmlElementRef(name = "ModeUse", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCAU> modeUse;
  @XmlElementRef(name = "MotionType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> motionType;
  @XmlElementRef(name = "SectBlanking", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> sectBlanking;
  @XmlElement(name = "PolarisationType")
  protected TS50 polarisationType;
  @XmlElementRef(name = "PolarisationAngle", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> polarisationAngle;
  @XmlElementRef(name = "HorzScanSpeed", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TScanSpeed> horzScanSpeed;
  @XmlElementRef(name = "HorzScanRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TScanRate> horzScanRate;
  @XmlElementRef(name = "HorzScanType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> horzScanType;
  @XmlElementRef(name = "HorzScanSector", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> horzScanSector;
  @XmlElementRef(name = "VertScanSpeed", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TScanSpeed> vertScanSpeed;
  @XmlElementRef(name = "VertScanRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TScanRate> vertScanRate;
  @XmlElementRef(name = "VertScanType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> vertScanType;
  @XmlElementRef(name = "VertScanAngleMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev> vertScanAngleMin;
  @XmlElementRef(name = "VertScanAngleMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev> vertScanAngleMax;
  @XmlElementRef(name = "RotationDirection", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCRD> rotationDirection;
  @XmlElement(name = "RotationRateMin")
  protected TUN7_2 rotationRateMin;
  @XmlElementRef(name = "RotationRateMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN7_2> rotationRateMax;
  @XmlElementRef(name = "HorzBwMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> horzBwMin;
  @XmlElementRef(name = "HorzBwMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> horzBwMax;
  @XmlElementRef(name = "VertBwMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> vertBwMin;
  @XmlElementRef(name = "VertBwMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> vertBwMax;
  @XmlElementRef(name = "BeamType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> beamType;
  @XmlElementRef(name = "MaxPower", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> maxPower;
  @XmlElementRef(name = "PortIsolation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> portIsolation;
  @XmlElementRef(name = "ModeName", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS40> modeName;
  @XmlElement(name = "AntGain")
  protected List<AntGain> antGain;
  @XmlElement(name = "AntFreqs")
  protected List<AntFreqs> antFreqs;
  @XmlElement(name = "AntPattern")
  protected List<AntPattern> antPattern;
  @XmlElement(name = "AntEfficiency")
  protected List<AntEfficiency> antEfficiency;
  @XmlElement(name = "VSWR")
  protected List<VSWR> vswr;

  /**
   * Gets the value of the modeID property.
   * <p>
   * @return possible object is {@link TS20 }
   * <p>
   */
  public TS20 getModeID() {
    return modeID;
  }

  /**
   * Sets the value of the modeID property.
   * <p>
   * @param value allowed object is {@link TS20 }
   * <p>
   */
  public void setModeID(TS20 value) {
    this.modeID = value;
  }

  /**
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setDescription(JAXBElement<TS100> value) {
    this.description = value;
  }

  /**
   * Gets the value of the modeUse property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
   * <p>
   */
  public JAXBElement<TListCAU> getModeUse() {
    return modeUse;
  }

  /**
   * Sets the value of the modeUse property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
   * <p>
   */
  public void setModeUse(JAXBElement<TListCAU> value) {
    this.modeUse = value;
  }

  /**
   * Gets the value of the motionType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getMotionType() {
    return motionType;
  }

  /**
   * Sets the value of the motionType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setMotionType(JAXBElement<TS25> value) {
    this.motionType = value;
  }

  /**
   * Gets the value of the sectBlanking property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getSectBlanking() {
    return sectBlanking;
  }

  /**
   * Sets the value of the sectBlanking property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setSectBlanking(JAXBElement<TListCBO> value) {
    this.sectBlanking = value;
  }

  /**
   * Gets the value of the polarisationType property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TS50 getPolarisationType() {
    return polarisationType;
  }

  /**
   * Sets the value of the polarisationType property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setPolarisationType(TS50 value) {
    this.polarisationType = value;
  }

  /**
   * Gets the value of the polarisationAngle property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getPolarisationAngle() {
    return polarisationAngle;
  }

  /**
   * Sets the value of the polarisationAngle property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setPolarisationAngle(JAXBElement<TAz> value) {
    this.polarisationAngle = value;
  }

  /**
   * Gets the value of the horzScanSpeed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
   * <p>
   */
  public JAXBElement<TScanSpeed> getHorzScanSpeed() {
    return horzScanSpeed;
  }

  /**
   * Sets the value of the horzScanSpeed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
   * <p>
   */
  public void setHorzScanSpeed(JAXBElement<TScanSpeed> value) {
    this.horzScanSpeed = value;
  }

  /**
   * Gets the value of the horzScanRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
   * <p>
   */
  public JAXBElement<TScanRate> getHorzScanRate() {
    return horzScanRate;
  }

  /**
   * Sets the value of the horzScanRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
   * <p>
   */
  public void setHorzScanRate(JAXBElement<TScanRate> value) {
    this.horzScanRate = value;
  }

  /**
   * Gets the value of the horzScanType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getHorzScanType() {
    return horzScanType;
  }

  /**
   * Sets the value of the horzScanType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setHorzScanType(JAXBElement<TS50> value) {
    this.horzScanType = value;
  }

  /**
   * Gets the value of the horzScanSector property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getHorzScanSector() {
    return horzScanSector;
  }

  /**
   * Sets the value of the horzScanSector property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setHorzScanSector(JAXBElement<TAz> value) {
    this.horzScanSector = value;
  }

  /**
   * Gets the value of the vertScanSpeed property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
   * <p>
   */
  public JAXBElement<TScanSpeed> getVertScanSpeed() {
    return vertScanSpeed;
  }

  /**
   * Sets the value of the vertScanSpeed property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanSpeed }{@code >}
   * <p>
   */
  public void setVertScanSpeed(JAXBElement<TScanSpeed> value) {
    this.vertScanSpeed = value;
  }

  /**
   * Gets the value of the vertScanRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
   * <p>
   */
  public JAXBElement<TScanRate> getVertScanRate() {
    return vertScanRate;
  }

  /**
   * Sets the value of the vertScanRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TScanRate }{@code >}
   * <p>
   */
  public void setVertScanRate(JAXBElement<TScanRate> value) {
    this.vertScanRate = value;
  }

  /**
   * Gets the value of the vertScanType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getVertScanType() {
    return vertScanType;
  }

  /**
   * Sets the value of the vertScanType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setVertScanType(JAXBElement<TS50> value) {
    this.vertScanType = value;
  }

  /**
   * Gets the value of the vertScanAngleMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public JAXBElement<TElev> getVertScanAngleMin() {
    return vertScanAngleMin;
  }

  /**
   * Sets the value of the vertScanAngleMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setVertScanAngleMin(JAXBElement<TElev> value) {
    this.vertScanAngleMin = value;
  }

  /**
   * Gets the value of the vertScanAngleMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public JAXBElement<TElev> getVertScanAngleMax() {
    return vertScanAngleMax;
  }

  /**
   * Sets the value of the vertScanAngleMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setVertScanAngleMax(JAXBElement<TElev> value) {
    this.vertScanAngleMax = value;
  }

  /**
   * Gets the value of the rotationDirection property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCRD }{@code >}
   * <p>
   */
  public JAXBElement<TListCRD> getRotationDirection() {
    return rotationDirection;
  }

  /**
   * Sets the value of the rotationDirection property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCRD }{@code >}
   * <p>
   */
  public void setRotationDirection(JAXBElement<TListCRD> value) {
    this.rotationDirection = value;
  }

  /**
   * Gets the value of the rotationRateMin property.
   * <p>
   * @return possible object is {@link TUN7_2 }
   * <p>
   */
  public TUN7_2 getRotationRateMin() {
    return rotationRateMin;
  }

  /**
   * Sets the value of the rotationRateMin property.
   * <p>
   * @param value allowed object is {@link TUN7_2 }
   * <p>
   */
  public void setRotationRateMin(TUN7_2 value) {
    this.rotationRateMin = value;
  }

  /**
   * Gets the value of the rotationRateMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN7_2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN7_2> getRotationRateMax() {
    return rotationRateMax;
  }

  /**
   * Sets the value of the rotationRateMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN7_2 }{@code >}
   * <p>
   */
  public void setRotationRateMax(JAXBElement<TUN7_2> value) {
    this.rotationRateMax = value;
  }

  /**
   * Gets the value of the horzBwMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getHorzBwMin() {
    return horzBwMin;
  }

  /**
   * Sets the value of the horzBwMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setHorzBwMin(JAXBElement<TAz> value) {
    this.horzBwMin = value;
  }

  /**
   * Gets the value of the horzBwMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getHorzBwMax() {
    return horzBwMax;
  }

  /**
   * Sets the value of the horzBwMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setHorzBwMax(JAXBElement<TAz> value) {
    this.horzBwMax = value;
  }

  /**
   * Gets the value of the vertBwMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getVertBwMin() {
    return vertBwMin;
  }

  /**
   * Sets the value of the vertBwMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setVertBwMin(JAXBElement<TAz> value) {
    this.vertBwMin = value;
  }

  /**
   * Gets the value of the vertBwMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getVertBwMax() {
    return vertBwMax;
  }

  /**
   * Sets the value of the vertBwMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setVertBwMax(JAXBElement<TAz> value) {
    this.vertBwMax = value;
  }

  /**
   * Gets the value of the beamType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getBeamType() {
    return beamType;
  }

  /**
   * Sets the value of the beamType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setBeamType(JAXBElement<TS25> value) {
    this.beamType = value;
  }

  /**
   * Gets the value of the maxPower property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getMaxPower() {
    return maxPower;
  }

  /**
   * Sets the value of the maxPower property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setMaxPower(JAXBElement<TdBW> value) {
    this.maxPower = value;
  }

  /**
   * Gets the value of the portIsolation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getPortIsolation() {
    return portIsolation;
  }

  /**
   * Sets the value of the portIsolation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setPortIsolation(JAXBElement<TdB> value) {
    this.portIsolation = value;
  }

  /**
   * Gets the value of the modeName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public JAXBElement<TS40> getModeName() {
    return modeName;
  }

  /**
   * Sets the value of the modeName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public void setModeName(JAXBElement<TS40> value) {
    this.modeName = value;
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
   */
  public List<AntGain> getAntGain() {
    if (antGain == null) {
      antGain = new ArrayList<>();
    }
    return this.antGain;
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
   */
  public List<AntFreqs> getAntFreqs() {
    if (antFreqs == null) {
      antFreqs = new ArrayList<>();
    }
    return this.antFreqs;
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
   */
  public List<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new ArrayList<>();
    }
    return this.antPattern;
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
   */
  public List<AntEfficiency> getAntEfficiency() {
    if (antEfficiency == null) {
      antEfficiency = new ArrayList<>();
    }
    return this.antEfficiency;
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
   */
  public List<VSWR> getVSWR() {
    if (vswr == null) {
      vswr = new ArrayList<>();
    }
    return this.vswr;
  }

}
