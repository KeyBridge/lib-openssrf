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
package us.gov.dod.standard.ssrf._3_0.assignment;

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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAU;

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
 * &lt;complexType name="StationConfig"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAU"/> &lt;element
 * name="ConfigID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 * &lt;element name="StationID"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}EIRP" minOccurs="0"/> &lt;element
 * name="AntFeedpointHeight"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 * &lt;element name="FeedlineLength"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAltitude" minOccurs="0"/>
 * &lt;element name="FeedlineLoss"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/> &lt;element
 * name="EarthCoverage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="PointingAzMin"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz" minOccurs="0"/> &lt;element
 * name="PointingAzMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz"
 * minOccurs="0"/> &lt;element name="PointingElevMin"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev" minOccurs="0"/> &lt;element
 * name="PointingElevMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TElev"
 * minOccurs="0"/> &lt;element name="CoordinationNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/> &lt;element
 * name="Blanking" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Blanking"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
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
  private TString type;
  @XmlElement(name = "ConfigID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;
  @XmlElement(name = "StationID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString stationID;
  @XmlElement(name = "EIRPMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMin;
  @XmlElement(name = "EIRPMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMax;
  @XmlElement(name = "AntFeedpointHeight", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal antFeedpointHeight;
  @XmlElement(name = "FeedlineLength", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal feedlineLength;
  @XmlElement(name = "FeedlineLoss", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal feedlineLoss;
  @XmlElement(name = "EarthCoverage", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString earthCoverage;
  @XmlElement(name = "PointingAzMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal pointingAzMin;
  @XmlElement(name = "PointingAzMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal pointingAzMax;
  @XmlElement(name = "PointingElevMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal pointingElevMin;
  @XmlElement(name = "PointingElevMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterELEV.class)
  private TDecimal pointingElevMax;
  @XmlElement(name = "CoordinationNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString coordinationNum;
  @XmlElement(name = "Blanking")
  private List<Blanking> blanking;

  /**
   * Gets the value of the type property.
   * <p>
   * @return
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the configID property.
   * <p>
   * @return
   */
  public TString getConfigID() {
    return configID;
  }

  /**
   * Sets the value of the configID property.
   * <p>
   * @param value
   */
  public void setConfigID(TString value) {
    this.configID = value;
  }

  public boolean isSetConfigID() {
    return (this.configID != null);
  }

  /**
   * Gets the value of the stationID property.
   * <p>
   * @return
   */
  public TString getStationID() {
    return stationID;
  }

  /**
   * Sets the value of the stationID property.
   * <p>
   * @param value
   */
  public void setStationID(TString value) {
    this.stationID = value;
  }

  public boolean isSetStationID() {
    return (this.stationID != null);
  }

  /**
   * Gets the value of the eirpMin property.
   * <p>
   * @return 
   */
  public TDecimal getEIRPMin() {
    return eirpMin;
  }

  /**
   * Sets the value of the eirpMin property.
   * <p>
   * @param value 
   */
  public void setEIRPMin(TDecimal value) {
    this.eirpMin = value;
  }

  public boolean isSetEIRPMin() {
    return (this.eirpMin != null);
  }

  /**
   * Gets the value of the eirpMax property.
   * <p>
   * @return 
   */
  public TDecimal getEIRPMax() {
    return eirpMax;
  }

  /**
   * Sets the value of the eirpMax property.
   * <p>
   * @param value 
   */
  public void setEIRPMax(TDecimal value) {
    this.eirpMax = value;
  }

  public boolean isSetEIRPMax() {
    return (this.eirpMax != null);
  }

  /**
   * Gets the value of the antFeedpointHeight property.
   * <p>
   * @return 
   */
  public TDecimal getAntFeedpointHeight() {
    return antFeedpointHeight;
  }

  /**
   * Sets the value of the antFeedpointHeight property.
   * <p>
   * @param value 
   */
  public void setAntFeedpointHeight(TDecimal value) {
    this.antFeedpointHeight = value;
  }

  public boolean isSetAntFeedpointHeight() {
    return (this.antFeedpointHeight != null);
  }

  /**
   * Gets the value of the feedlineLength property.
   * <p>
   * @return 
   */
  public TDecimal getFeedlineLength() {
    return feedlineLength;
  }

  /**
   * Sets the value of the feedlineLength property.
   * <p>
   * @param value 
   */
  public void setFeedlineLength(TDecimal value) {
    this.feedlineLength = value;
  }

  public boolean isSetFeedlineLength() {
    return (this.feedlineLength != null);
  }

  /**
   * Gets the value of the feedlineLoss property.
   * <p>
   * @return 
   */
  public TDecimal getFeedlineLoss() {
    return feedlineLoss;
  }

  /**
   * Sets the value of the feedlineLoss property.
   * <p>
   * @param value 
   */
  public void setFeedlineLoss(TDecimal value) {
    this.feedlineLoss = value;
  }

  public boolean isSetFeedlineLoss() {
    return (this.feedlineLoss != null);
  }

  /**
   * Gets the value of the earthCoverage property.
   * <p>
   * @return 
   */
  public TString getEarthCoverage() {
    return earthCoverage;
  }

  /**
   * Sets the value of the earthCoverage property.
   * <p>
   * @param value 
   */
  public void setEarthCoverage(TString value) {
    this.earthCoverage = value;
  }

  public boolean isSetEarthCoverage() {
    return (this.earthCoverage != null);
  }

  /**
   * Gets the value of the pointingAzMin property.
   * <p>
   * @return 
   */
  public TDecimal getPointingAzMin() {
    return pointingAzMin;
  }

  /**
   * Sets the value of the pointingAzMin property.
   * <p>
   * @param value 
   */
  public void setPointingAzMin(TDecimal value) {
    this.pointingAzMin = value;
  }

  public boolean isSetPointingAzMin() {
    return (this.pointingAzMin != null);
  }

  /**
   * Gets the value of the pointingAzMax property.
   * <p>
   * @return 
   */
  public TDecimal getPointingAzMax() {
    return pointingAzMax;
  }

  /**
   * Sets the value of the pointingAzMax property.
   * <p>
   * @param value 
   */
  public void setPointingAzMax(TDecimal value) {
    this.pointingAzMax = value;
  }

  public boolean isSetPointingAzMax() {
    return (this.pointingAzMax != null);
  }

  /**
   * Gets the value of the pointingElevMin property.
   * <p>
   * @return 
   */
  public TDecimal getPointingElevMin() {
    return pointingElevMin;
  }

  /**
   * Sets the value of the pointingElevMin property.
   * <p>
   * @param value 
   */
  public void setPointingElevMin(TDecimal value) {
    this.pointingElevMin = value;
  }

  public boolean isSetPointingElevMin() {
    return (this.pointingElevMin != null);
  }

  /**
   * Gets the value of the pointingElevMax property.
   * <p>
   * @return 
   */
  public TDecimal getPointingElevMax() {
    return pointingElevMax;
  }

  /**
   * Sets the value of the pointingElevMax property.
   * <p>
   * @param value 
   */
  public void setPointingElevMax(TDecimal value) {
    this.pointingElevMax = value;
  }

  public boolean isSetPointingElevMax() {
    return (this.pointingElevMax != null);
  }

  /**
   * Gets the value of the coordinationNum property.
   * <p>
   * @return 
   */
  public TString getCoordinationNum() {
    return coordinationNum;
  }

  /**
   * Sets the value of the coordinationNum property.
   * <p>
   * @param value 
   */
  public void setCoordinationNum(TString value) {
    this.coordinationNum = value;
  }

  public boolean isSetCoordinationNum() {
    return (this.coordinationNum != null);
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
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Blanking> getBlanking() {
    if (blanking == null) {
      blanking = new ArrayList<>();
    }
    return this.blanking;
  }

  public boolean isSetBlanking() {
    return ((this.blanking != null) && (!this.blanking.isEmpty()));
  }

  public void unsetBlanking() {
    this.blanking = null;
  }

  public StationConfig withType(ListCAU value) {
    setType(new TString(value.value()));
    return this;
  }

  public StationConfig withConfigID(String value) {
    setConfigID(new TString(value));
    return this;
  }

  public StationConfig withStationID(String value) {
    setStationID(new TString(value));
    return this;
  }

  public StationConfig withEIRPMin(Double value) {
    setEIRPMin(new TDecimal(value));
    return this;
  }

  public StationConfig withEIRPMax(Double value) {
    setEIRPMax(new TDecimal(value));
    return this;
  }

  public StationConfig withAntFeedpointHeight(Double value) {
    setAntFeedpointHeight(new TDecimal(value));
    return this;
  }

  public StationConfig withFeedlineLength(Double value) {
    setFeedlineLength(new TDecimal(value));
    return this;
  }

  public StationConfig withFeedlineLoss(Double value) {
    setFeedlineLoss(new TDecimal(value));
    return this;
  }

  public StationConfig withEarthCoverage(String value) {
    setEarthCoverage(new TString(value));
    return this;
  }

  public StationConfig withPointingAzMin(Double value) {
    setPointingAzMin(new TDecimal(value));
    return this;
  }

  public StationConfig withPointingAzMax(Double value) {
    setPointingAzMax(new TDecimal(value));
    return this;
  }

  public StationConfig withPointingElevMin(Double value) {
    setPointingElevMin(new TDecimal(value));
    return this;
  }

  public StationConfig withPointingElevMax(Double value) {
    setPointingElevMax(new TDecimal(value));
    return this;
  }

  public StationConfig withCoordinationNum(String value) {
    setCoordinationNum(new TString(value));
    return this;
  }

  public StationConfig withBlanking(Blanking... values) {
    if (values != null) {
      getBlanking().addAll(Arrays.asList(values));
    }
    return this;
  }

  public StationConfig withBlanking(Collection<Blanking> values) {
    if (values != null) {
      getBlanking().addAll(values);
    }
    return this;
  }

}
