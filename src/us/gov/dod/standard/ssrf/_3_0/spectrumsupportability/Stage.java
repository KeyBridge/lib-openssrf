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
package us.gov.dod.standard.ssrf._3_0.spectrumsupportability;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCSG;

/**
 * <p>
 * Java class for Stage complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Stage"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCSG"/> &lt;element
 * name="StartDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;element name="TargetDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="DateApprovalRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;element name="TerminationDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="NumEquip" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9"
 * minOccurs="0"/> &lt;element name="GeoDescription"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="StageLocation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}StageLocation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stage", propOrder = {
  "type",
  "startDate",
  "targetDate",
  "dateApprovalRequired",
  "terminationDate",
  "numEquip",
  "geoDescription",
  "stageLocation"
})
public class Stage {

  @XmlElement(name = "Type", required = true)
  private TString type;
  @XmlElement(name = "StartDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar startDate;
  @XmlElement(name = "TargetDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar targetDate;
  @XmlElement(name = "DateApprovalRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateApprovalRequired;
  @XmlElement(name = "TerminationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar terminationDate;
  @XmlElement(name = "NumEquip", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numEquip;
  @XmlElement(name = "GeoDescription", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString geoDescription;
  @XmlElement(name = "StageLocation")
  private List<StageLocation> stageLocation;

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
   * Gets the value of the startDate property.
   * <p>
   * @return 
   */
  public TCalendar getStartDate() {
    return startDate;
  }

  /**
   * Sets the value of the startDate property.
   * <p>
   * @param value 
   */
  public void setStartDate(TCalendar value) {
    this.startDate = value;
  }

  public boolean isSetStartDate() {
    return (this.startDate != null);
  }

  /**
   * Gets the value of the targetDate property.
   * <p>
   * @return 
   */
  public TCalendar getTargetDate() {
    return targetDate;
  }

  /**
   * Sets the value of the targetDate property.
   * <p>
   * @param value 
   */
  public void setTargetDate(TCalendar value) {
    this.targetDate = value;
  }

  public boolean isSetTargetDate() {
    return (this.targetDate != null);
  }

  /**
   * Gets the value of the dateApprovalRequired property.
   * <p>
   * @return 
   */
  public TCalendar getDateApprovalRequired() {
    return dateApprovalRequired;
  }

  /**
   * Sets the value of the dateApprovalRequired property.
   * <p>
   * @param value 
   */
  public void setDateApprovalRequired(TCalendar value) {
    this.dateApprovalRequired = value;
  }

  public boolean isSetDateApprovalRequired() {
    return (this.dateApprovalRequired != null);
  }

  /**
   * Gets the value of the terminationDate property.
   * <p>
   * @return 
   */
  public TCalendar getTerminationDate() {
    return terminationDate;
  }

  /**
   * Sets the value of the terminationDate property.
   * <p>
   * @param value 
   */
  public void setTerminationDate(TCalendar value) {
    this.terminationDate = value;
  }

  public boolean isSetTerminationDate() {
    return (this.terminationDate != null);
  }

  /**
   * Gets the value of the numEquip property.
   * <p>
   * @return 
   */
  public TInteger getNumEquip() {
    return numEquip;
  }

  /**
   * Sets the value of the numEquip property.
   * <p>
   * @param value 
   */
  public void setNumEquip(TInteger value) {
    this.numEquip = value;
  }

  public boolean isSetNumEquip() {
    return (this.numEquip != null);
  }

  /**
   * Gets the value of the geoDescription property.
   * <p>
   * @return 
   */
  public TString getGeoDescription() {
    return geoDescription;
  }

  /**
   * Sets the value of the geoDescription property.
   * <p>
   * @param value 
   */
  public void setGeoDescription(TString value) {
    this.geoDescription = value;
  }

  public boolean isSetGeoDescription() {
    return (this.geoDescription != null);
  }

  /**
   * Gets the value of the stageLocation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the stageLocation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStageLocation().add(newItem);
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
  public List<StageLocation> getStageLocation() {
    if (stageLocation == null) {
      stageLocation = new ArrayList<>();
    }
    return this.stageLocation;
  }

  public boolean isSetStageLocation() {
    return ((this.stageLocation != null) && (!this.stageLocation.isEmpty()));
  }

  public void unsetStageLocation() {
    this.stageLocation = null;
  }

  public Stage withType(ListCSG value) {
    setType(new TString(value.value()));
    return this;
  }

  public Stage withStartDate(Calendar value) {
    setStartDate(new TCalendar(value));
    return this;
  }

  public Stage withTargetDate(Calendar value) {
    setTargetDate(new TCalendar(value));
    return this;
  }

  public Stage withDateApprovalRequired(Calendar value) {
    setDateApprovalRequired(new TCalendar(value));
    return this;
  }

  public Stage withTerminationDate(Calendar value) {
    setTerminationDate(new TCalendar(value));
    return this;
  }

  public Stage withNumEquip(Integer value) {
    setNumEquip(new TInteger(value));
    return this;
  }

  public Stage withGeoDescription(String value) {
    setGeoDescription(new TString(value));
    return this;
  }

  public Stage withStageLocation(StageLocation... values) {
    if (values != null) {
      getStageLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Stage withStageLocation(Collection<StageLocation> values) {
    if (values != null) {
      getStageLocation().addAll(values);
    }
    return this;
  }

}
