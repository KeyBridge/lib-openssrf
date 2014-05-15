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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for StationConfig complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="StationConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAU"/>
 *         &lt;element name="ConfigID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="StationID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}EIRP" minOccurs="0"/>
 *         &lt;element name="AntFeedpointHeight" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 *         &lt;element name="FeedlineLength" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 *         &lt;element name="FeedlineLoss" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="EarthCoverage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="PointingAzMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz" minOccurs="0"/>
 *         &lt;element name="PointingAzMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz" minOccurs="0"/>
 *         &lt;element name="PointingElevMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev" minOccurs="0"/>
 *         &lt;element name="PointingElevMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev" minOccurs="0"/>
 *         &lt;element name="CoordinationNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/>
 *         &lt;element name="Blanking" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Blanking" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationConfig", propOrder = {
  "type",
  "configID",
  "stationID",
  "eirpMin",
  "eirpMax",
  "antFeedpointHeight",
  "feedlineLength",
  "feedlineLoss",
  "earthCoverage",
  "pointingAzMin",
  "pointingAzMax",
  "pointingElevMin",
  "pointingElevMax",
  "coordinationNum",
  "blanking"
})
public class StationConfig {

  @XmlElement(name = "Type", required = true)
  protected TListCAU type;
  @XmlElement(name = "ConfigID", required = true)
  protected TS100 configID;
  @XmlElement(name = "StationID", required = true)
  protected TS100 stationID;
  @XmlElementRef(name = "EIRPMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> eirpMin;
  @XmlElementRef(name = "EIRPMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> eirpMax;
  @XmlElementRef(name = "AntFeedpointHeight", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> antFeedpointHeight;
  @XmlElementRef(name = "FeedlineLength", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAltitude> feedlineLength;
  @XmlElementRef(name = "FeedlineLoss", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> feedlineLoss;
  @XmlElementRef(name = "EarthCoverage", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> earthCoverage;
  @XmlElementRef(name = "PointingAzMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> pointingAzMin;
  @XmlElementRef(name = "PointingAzMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TAz> pointingAzMax;
  @XmlElementRef(name = "PointingElevMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev> pointingElevMin;
  @XmlElementRef(name = "PointingElevMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TElev> pointingElevMax;
  @XmlElementRef(name = "CoordinationNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS15> coordinationNum;
  @XmlElement(name = "Blanking")
  protected List<Blanking> blanking;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is {@link TListCAU }
   * <p>
   */
  public TListCAU getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is {@link TListCAU }
   * <p>
   */
  public void setType(TListCAU value) {
    this.type = value;
  }

  /**
   * Gets the value of the configID property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getConfigID() {
    return configID;
  }

  /**
   * Sets the value of the configID property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setConfigID(TS100 value) {
    this.configID = value;
  }

  /**
   * Gets the value of the stationID property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getStationID() {
    return stationID;
  }

  /**
   * Sets the value of the stationID property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setStationID(TS100 value) {
    this.stationID = value;
  }

  /**
   * Gets the value of the eirpMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getEIRPMin() {
    return eirpMin;
  }

  /**
   * Sets the value of the eirpMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setEIRPMin(JAXBElement<TdBW> value) {
    this.eirpMin = value;
  }

  /**
   * Gets the value of the eirpMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getEIRPMax() {
    return eirpMax;
  }

  /**
   * Sets the value of the eirpMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setEIRPMax(JAXBElement<TdBW> value) {
    this.eirpMax = value;
  }

  /**
   * Gets the value of the antFeedpointHeight property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getAntFeedpointHeight() {
    return antFeedpointHeight;
  }

  /**
   * Sets the value of the antFeedpointHeight property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setAntFeedpointHeight(JAXBElement<TAltitude> value) {
    this.antFeedpointHeight = value;
  }

  /**
   * Gets the value of the feedlineLength property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public JAXBElement<TAltitude> getFeedlineLength() {
    return feedlineLength;
  }

  /**
   * Sets the value of the feedlineLength property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setFeedlineLength(JAXBElement<TAltitude> value) {
    this.feedlineLength = value;
  }

  /**
   * Gets the value of the feedlineLoss property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getFeedlineLoss() {
    return feedlineLoss;
  }

  /**
   * Sets the value of the feedlineLoss property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setFeedlineLoss(JAXBElement<TdB> value) {
    this.feedlineLoss = value;
  }

  /**
   * Gets the value of the earthCoverage property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getEarthCoverage() {
    return earthCoverage;
  }

  /**
   * Sets the value of the earthCoverage property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setEarthCoverage(JAXBElement<TS50> value) {
    this.earthCoverage = value;
  }

  /**
   * Gets the value of the pointingAzMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getPointingAzMin() {
    return pointingAzMin;
  }

  /**
   * Sets the value of the pointingAzMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setPointingAzMin(JAXBElement<TAz> value) {
    this.pointingAzMin = value;
  }

  /**
   * Gets the value of the pointingAzMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public JAXBElement<TAz> getPointingAzMax() {
    return pointingAzMax;
  }

  /**
   * Sets the value of the pointingAzMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz }{@code >}
   * <p>
   */
  public void setPointingAzMax(JAXBElement<TAz> value) {
    this.pointingAzMax = value;
  }

  /**
   * Gets the value of the pointingElevMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public JAXBElement<TElev> getPointingElevMin() {
    return pointingElevMin;
  }

  /**
   * Sets the value of the pointingElevMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setPointingElevMin(JAXBElement<TElev> value) {
    this.pointingElevMin = value;
  }

  /**
   * Gets the value of the pointingElevMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public JAXBElement<TElev> getPointingElevMax() {
    return pointingElevMax;
  }

  /**
   * Sets the value of the pointingElevMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TElev }{@code >}
   * <p>
   */
  public void setPointingElevMax(JAXBElement<TElev> value) {
    this.pointingElevMax = value;
  }

  /**
   * Gets the value of the coordinationNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public JAXBElement<TS15> getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Sets the value of the coordinationNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public void setCoordinationNum(JAXBElement<TS15> value) {
    this.coordinationNum = value;
  }

  /**
   * Gets the value of the blanking property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the blanking property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBlanking().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Blanking }
   * <p>
   * <p>
   */
  public List<Blanking> getBlanking() {
    if (blanking == null) {
      blanking = new ArrayList<>();
    }
    return this.blanking;
  }

}
