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
import us.gov.dod.standard.ssrf._3_0.datatype.TUN4;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqM;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfMonth;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCPC;
import us.gov.dod.standard.ssrf._3_0.datatype.TMinSec;
import us.gov.dod.standard.ssrf._3_0.datatype.TYears;
import us.gov.dod.standard.ssrf._3_0.datatype.TSerial;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS2;
import us.gov.dod.standard.ssrf._3_0.datatype.TS255;
import us.gov.dod.standard.ssrf._3_0.datatype.TS10;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfWeek;
import us.gov.dod.standard.ssrf._3_0.datatype.TMonths;
import us.gov.dod.standard.ssrf._3_0.datatype.THours;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for JRFLEntry complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="JRFLEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProtectionCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCPC"/>
 *         &lt;element name="Priority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS2" minOccurs="0"/>
 *         &lt;element name="Justification" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255"/>
 *         &lt;element name="ApprovalLevel" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}TimeFrame" minOccurs="0"/>
 *         &lt;element name="AsgnAllotRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp" minOccurs="0"/>
 *         &lt;element name="Bandwidth" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="FreqUse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAU" minOccurs="0"/>
 *         &lt;element name="Project" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="POCInformation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JRFLEntryLocation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}JRFLEntryLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFLEntry", propOrder = {
  "protectionCode",
  "priority",
  "justification",
  "approvalLevel",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "asgnAllotRef",
  "freqMin",
  "freqMax",
  "bandwidth",
  "freqUse",
  "project",
  "pocInformation",
  "jrflEntryLocation"
})
public class JRFLEntry {

  @XmlElement(name = "ProtectionCode", required = true)
  protected TListCPC protectionCode;
  @XmlElementRef(name = "Priority", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS2> priority;
  @XmlElement(name = "Justification", required = true)
  protected TS255 justification;
  @XmlElementRef(name = "ApprovalLevel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> approvalLevel;
  @XmlElementRef(name = "Seconds", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> seconds;
  @XmlElementRef(name = "Minutes", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> minutes;
  @XmlElementRef(name = "Hours", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<THours> hours;
  @XmlElementRef(name = "DaysOfMonth", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfMonth> daysOfMonth;
  @XmlElementRef(name = "Months", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMonths> months;
  @XmlElementRef(name = "DaysOfWeek", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfWeek> daysOfWeek;
  @XmlElementRef(name = "Years", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TYears> years;
  @XmlElementRef(name = "Duration", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> duration;
  @XmlElementRef(name = "AsgnAllotRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> asgnAllotRef;
  @XmlElement(name = "FreqMin")
  protected TFreqM freqMin;
  @XmlElementRef(name = "FreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freqMax;
  @XmlElementRef(name = "Bandwidth", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> bandwidth;
  @XmlElementRef(name = "FreqUse", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCAU> freqUse;
  @XmlElement(name = "Project")
  protected List<Project> project;
  @XmlElement(name = "POCInformation")
  protected List<POCInformation> pocInformation;
  @XmlElement(name = "JRFLEntryLocation")
  protected List<JRFLEntryLocation> jrflEntryLocation;

  /**
   * Gets the value of the protectionCode property.
   * <p>
   * @return possible object is {@link TListCPC }
   * <p>
   */
  public TListCPC getProtectionCode() {
    return protectionCode;
  }

  /**
   * Sets the value of the protectionCode property.
   * <p>
   * @param value allowed object is {@link TListCPC }
   * <p>
   */
  public void setProtectionCode(TListCPC value) {
    this.protectionCode = value;
  }

  /**
   * Gets the value of the priority property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS2 }{@code >}
   * <p>
   */
  public JAXBElement<TUS2> getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS2 }{@code >}
   * <p>
   */
  public void setPriority(JAXBElement<TUS2> value) {
    this.priority = value;
  }

  /**
   * Gets the value of the justification property.
   * <p>
   * @return possible object is {@link TS255 }
   * <p>
   */
  public TS255 getJustification() {
    return justification;
  }

  /**
   * Sets the value of the justification property.
   * <p>
   * @param value allowed object is {@link TS255 }
   * <p>
   */
  public void setJustification(TS255 value) {
    this.justification = value;
  }

  /**
   * Gets the value of the approvalLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getApprovalLevel() {
    return approvalLevel;
  }

  /**
   * Sets the value of the approvalLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setApprovalLevel(JAXBElement<TS10> value) {
    this.approvalLevel = value;
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setSeconds(JAXBElement<TMinSec> value) {
    this.seconds = value;
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setMinutes(JAXBElement<TMinSec> value) {
    this.minutes = value;
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public JAXBElement<THours> getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public void setHours(JAXBElement<THours> value) {
    this.hours = value;
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfMonth> getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public void setDaysOfMonth(JAXBElement<TDaysOfMonth> value) {
    this.daysOfMonth = value;
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public JAXBElement<TMonths> getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public void setMonths(JAXBElement<TMonths> value) {
    this.months = value;
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public void setDaysOfWeek(JAXBElement<TDaysOfWeek> value) {
    this.daysOfWeek = value;
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public JAXBElement<TYears> getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public void setYears(JAXBElement<TYears> value) {
    this.years = value;
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setDuration(JAXBElement<TUN4> value) {
    this.duration = value;
  }

  /**
   * Gets the value of the asgnAllotRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getAsgnAllotRef() {
    return asgnAllotRef;
  }

  /**
   * Sets the value of the asgnAllotRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setAsgnAllotRef(JAXBElement<TSerial> value) {
    this.asgnAllotRef = value;
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setFreqMin(TFreqM value) {
    this.freqMin = value;
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreqMax(JAXBElement<TFreqM> value) {
    this.freqMax = value;
  }

  /**
   * Gets the value of the bandwidth property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getBandwidth() {
    return bandwidth;
  }

  /**
   * Sets the value of the bandwidth property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setBandwidth(JAXBElement<TFreqM> value) {
    this.bandwidth = value;
  }

  /**
   * Gets the value of the freqUse property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
   * <p>
   */
  public JAXBElement<TListCAU> getFreqUse() {
    return freqUse;
  }

  /**
   * Sets the value of the freqUse property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
   * <p>
   */
  public void setFreqUse(JAXBElement<TListCAU> value) {
    this.freqUse = value;
  }

  /**
   * Gets the value of the project property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the project property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProject().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Project }
   * <p>
   * <p>
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link POCInformation }
   * <p>
   * <p>
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  /**
   * Gets the value of the jrflEntryLocation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the jrflEntryLocation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getJRFLEntryLocation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link JRFLEntryLocation }
   * <p>
   * <p>
   */
  public List<JRFLEntryLocation> getJRFLEntryLocation() {
    if (jrflEntryLocation == null) {
      jrflEntryLocation = new ArrayList<>();
    }
    return this.jrflEntryLocation;
  }

}
