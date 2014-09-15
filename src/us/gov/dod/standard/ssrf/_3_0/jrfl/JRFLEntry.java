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
package us.gov.dod.standard.ssrf._3_0.jrfl;

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
import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.forceelement.Project;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAU;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCPC;

/**
 * Java class for JRFLEntry complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="JRFLEntry"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="ProtectionCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCPC"/>
 * &lt;element name="Priority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS2"
 * minOccurs="0"/> &lt;element name="Justification"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255"/> &lt;element
 * name="ApprovalLevel" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}TimeFrame"
 * minOccurs="0"/> &lt;element name="AsgnAllotRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp" minOccurs="0"/>
 * &lt;element name="Bandwidth"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/> &lt;element
 * name="FreqUse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAU"
 * minOccurs="0"/> &lt;element name="Project"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Project" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="POCInformation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}POCInformation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="JRFLEntryLocation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}JRFLEntryLocation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
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
  private TString protectionCode;
  @XmlElement(name = "Priority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS2.class)
  private TString priority;
  @XmlElement(name = "Justification", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString justification;
  @XmlElement(name = "ApprovalLevel", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString approvalLevel;
  @XmlElement(name = "Seconds", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString seconds;
  @XmlElement(name = "Minutes", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString minutes;
  @XmlElement(name = "Hours", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterHOURS.class)
  private TString hours;
  @XmlElement(name = "DaysOfMonth", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFMONTH.class)
  private TString daysOfMonth;
  @XmlElement(name = "Months", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMONTHS.class)
  private TString months;
  @XmlElement(name = "DaysOfWeek", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFWEEK.class)
  private TString daysOfWeek;
  @XmlElement(name = "Years", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterYEARS.class)
  private TString years;
  @XmlElement(name = "Duration", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger duration;
  @XmlElement(name = "AsgnAllotRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString asgnAllotRef;
  @XmlElement(name = "FreqMin")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "Bandwidth", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal bandwidth;
  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;
  @XmlElement(name = "Project")
  private List<Project> project;
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  @XmlElement(name = "JRFLEntryLocation")
  private List<JRFLEntryLocation> jrflEntryLocation;

  /**
   * Gets the value of the protectionCode property.
   * <p>
   * @return
   */
  public TString getProtectionCode() {
    return protectionCode;
  }

  /**
   * Sets the value of the protectionCode property.
   * <p>
   * @param value
   */
  public void setProtectionCode(TString value) {
    this.protectionCode = value;
  }

  public boolean isSetProtectionCode() {
    return (this.protectionCode != null);
  }

  /**
   * Gets the value of the priority property.
   * <p>
   * @return 
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value 
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  public boolean isSetPriority() {
    return (this.priority != null);
  }

  /**
   * Gets the value of the justification property.
   * <p>
   * @return
   */
  public TString getJustification() {
    return justification;
  }

  /**
   * Sets the value of the justification property.
   * <p>
   * @param value
   */
  public void setJustification(TString value) {
    this.justification = value;
  }

  public boolean isSetJustification() {
    return (this.justification != null);
  }

  /**
   * Gets the value of the approvalLevel property.
   * <p>
   * @return 
   */
  public TString getApprovalLevel() {
    return approvalLevel;
  }

  /**
   * Sets the value of the approvalLevel property.
   * <p>
   * @param value 
   */
  public void setApprovalLevel(TString value) {
    this.approvalLevel = value;
  }

  public boolean isSetApprovalLevel() {
    return (this.approvalLevel != null);
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return 
   */
  public TString getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value 
   */
  public void setSeconds(TString value) {
    this.seconds = value;
  }

  public boolean isSetSeconds() {
    return (this.seconds != null);
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return 
   */
  public TString getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value 
   */
  public void setMinutes(TString value) {
    this.minutes = value;
  }

  public boolean isSetMinutes() {
    return (this.minutes != null);
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return 
   */
  public TString getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value 
   */
  public void setHours(TString value) {
    this.hours = value;
  }

  public boolean isSetHours() {
    return (this.hours != null);
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return 
   */
  public TString getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value 
   */
  public void setDaysOfMonth(TString value) {
    this.daysOfMonth = value;
  }

  public boolean isSetDaysOfMonth() {
    return (this.daysOfMonth != null);
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return 
   */
  public TString getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value 
   */
  public void setMonths(TString value) {
    this.months = value;
  }

  public boolean isSetMonths() {
    return (this.months != null);
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return 
   */
  public TString getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value 
   */
  public void setDaysOfWeek(TString value) {
    this.daysOfWeek = value;
  }

  public boolean isSetDaysOfWeek() {
    return (this.daysOfWeek != null);
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return 
   */
  public TString getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value 
   */
  public void setYears(TString value) {
    this.years = value;
  }

  public boolean isSetYears() {
    return (this.years != null);
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return 
   */
  public TInteger getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value 
   */
  public void setDuration(TInteger value) {
    this.duration = value;
  }

  public boolean isSetDuration() {
    return (this.duration != null);
  }

  /**
   * Gets the value of the asgnAllotRef property.
   * <p>
   * @return 
   */
  public TString getAsgnAllotRef() {
    return asgnAllotRef;
  }

  /**
   * Sets the value of the asgnAllotRef property.
   * <p>
   * @param value 
   */
  public void setAsgnAllotRef(TString value) {
    this.asgnAllotRef = value;
  }

  public boolean isSetAsgnAllotRef() {
    return (this.asgnAllotRef != null);
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  public boolean isSetFreqMin() {
    return (this.freqMin != null);
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return 
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value 
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the bandwidth property.
   * <p>
   * @return 
   */
  public TDecimal getBandwidth() {
    return bandwidth;
  }

  /**
   * Sets the value of the bandwidth property.
   * <p>
   * @param value 
   */
  public void setBandwidth(TDecimal value) {
    this.bandwidth = value;
  }

  public boolean isSetBandwidth() {
    return (this.bandwidth != null);
  }

  /**
   * Gets the value of the freqUse property.
   * <p>
   * @return 
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Sets the value of the freqUse property.
   * <p>
   * @param value 
   */
  public void setFreqUse(TString value) {
    this.freqUse = value;
  }

  public boolean isSetFreqUse() {
    return (this.freqUse != null);
  }

  /**
   * Gets the value of the project property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the project property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getProject().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
    }
    return this.project;
  }

  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  public void unsetProject() {
    this.project = null;
  }

  /**
   * Gets the value of the pocInformation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pocInformation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPOCInformation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new ArrayList<>();
    }
    return this.pocInformation;
  }

  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Gets the value of the jrflEntryLocation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the jrflEntryLocation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getJRFLEntryLocation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<JRFLEntryLocation> getJRFLEntryLocation() {
    if (jrflEntryLocation == null) {
      jrflEntryLocation = new ArrayList<>();
    }
    return this.jrflEntryLocation;
  }

  public boolean isSetJRFLEntryLocation() {
    return ((this.jrflEntryLocation != null) && (!this.jrflEntryLocation.isEmpty()));
  }

  public void unsetJRFLEntryLocation() {
    this.jrflEntryLocation = null;
  }

  public JRFLEntry withProtectionCode(ListCPC value) {
    setProtectionCode(new TString(value.value()));
    return this;
  }

  public JRFLEntry withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

  public JRFLEntry withJustification(String value) {
    setJustification(new TString(value));
    return this;
  }

  public JRFLEntry withApprovalLevel(String value) {
    setApprovalLevel(new TString(value));
    return this;
  }

  public JRFLEntry withSeconds(String value) {
    setSeconds(new TString(value));
    return this;
  }

  public JRFLEntry withMinutes(String value) {
    setMinutes(new TString(value));
    return this;
  }

  public JRFLEntry withHours(String value) {
    setHours(new TString(value));
    return this;
  }

  public JRFLEntry withDaysOfMonth(String value) {
    setDaysOfMonth(new TString(value));
    return this;
  }

  public JRFLEntry withMonths(String value) {
    setMonths(new TString(value));
    return this;
  }

  public JRFLEntry withDaysOfWeek(String value) {
    setDaysOfWeek(new TString(value));
    return this;
  }

  public JRFLEntry withYears(String value) {
    setYears(new TString(value));
    return this;
  }

  public JRFLEntry withDuration(Integer value) {
    setDuration(new TInteger(value));
    return this;
  }

  public JRFLEntry withAsgnAllotRef(String value) {
    setAsgnAllotRef(new TString(value));
    return this;
  }

  public JRFLEntry withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public JRFLEntry withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public JRFLEntry withBandwidth(Double value) {
    setBandwidth(new TDecimal(value));
    return this;
  }

  public JRFLEntry withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  public JRFLEntry withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  public JRFLEntry withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  public JRFLEntry withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public JRFLEntry withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public JRFLEntry withJRFLEntryLocation(JRFLEntryLocation... values) {
    if (values != null) {
      getJRFLEntryLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public JRFLEntry withJRFLEntryLocation(Collection<JRFLEntryLocation> values) {
    if (values != null) {
      getJRFLEntryLocation().addAll(values);
    }
    return this;
  }

}
