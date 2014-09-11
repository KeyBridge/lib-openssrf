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

import us.gov.dod.standard.ssrf._3_0.contact.POCInformation;
import us.gov.dod.standard.ssrf._3_0.allotment.Emission;
import us.gov.dod.standard.ssrf._3_0.allotment.AllotFreq;
import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.Common;
import us.gov.dod.standard.ssrf._3_0.forceelement.Project;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.allotment.AllotFreq;
import us.gov.dod.standard.ssrf._3_0.allotment.Emission;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.LocationRef;

/**
 * Java class for Allotment complex type.
 * <p>
 * An allotment is a group of frequencies given to a subordinate organization
 * for local management, for specific types of emissions, at a certain location,
 * and for a specified period of time.
 * <p>
 * [XSL ERR DSTYPE] Part 3 of the Serial reference (dataset type) MUST be "AL".
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allotment", propOrder = {
  "title",
  "usageType",
  "dateResponseRequired",
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "requirement",
  "project",
  "pocInformation",
  "locationRef",
  "emission",
  "allotFreq"
})
public class Allotment extends Common {

  /**
   * Title: Enter an identifying name for this Allotment or Assignment.
   */
  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  /**
   * UsageType: Enter the type of assignment request or approved
   * assignment/allotment. In case of a rejected or cancelled
   * assignment/allotment, use an associated Remarks to indicate the reason.
   * <p>
   * Recommend values from Code List CUT
   */
  @XmlElement(name = "UsageType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString usageType;
  /**
   * DateResponseRequired: Enter the date by which the frequency assignment or
   * Spectrum Supportability Reply is required by the user in order to complete
   * necessary advanced operation coordination.
   */
  @XmlElement(name = "DateResponseRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateResponseRequired;
  /**
   * EffectiveDate: This data element indicates the date/time by which the
   * dataset is to be operational or effective, formatted as yyyy-mm-dd
   * (year-month-day).
   */
  @XmlElement(name = "EffectiveDate", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate: Enter the date at which the dataset will expire, formatted
   * as yyyy-mm-dd (year-month- day). The Expiration date should be less than
   * five years from current date.
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * ReviewDate: Enter the date by which the dataset is to be reviewed,
   * formatted as yyyy-mm-dd (year-month- day). The Review date should be less
   * than five years from the effective date. In Spectrum Supportability
   * datasets, this date indicate when the organisation responsible for
   * re-initiating host coordination plans to resubmit a Spectrum Supportability
   * request to the host nation for continued use of the equipment.
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Requirement: Enter any amplifying information on the requirement.
   */
  @XmlElement(name = "Requirement", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString requirement;

  /**
   * Data element Project provides the Project, OPLAN, COMPLAN or Exercise name,
   * or any other project name associated to the dataset.
   */
  @XmlElement(name = "Project")
  private List<Project> project;
  /**
   * Data element POC contains a reference to a Contact, Organisation or Role
   * dataset.
   */
  @XmlElement(name = "POCInformation")
  private List<POCInformation> pocInformation;
  /**
   * This element references a Location dataset.
   */
  @XmlElement(name = "LocationRef", required = true, nillable = true)
  private List<LocationRef> locationRef;
  /**
   * This data element defines the limits of the authorized bandwidth and power
   * within this allotment.
   */
  @XmlElement(name = "Emission")
  private List<Emission> emission;
  /**
   * This data element defines a frequency or range of frequencies belonging to
   * the Allotment. In the case of an allotment for a duplex frequency range,
   * the pairs of frequencies are derived from FreqMin, FreqMax, TuningStep and
   * PairedFreqMin as follows: (FreqMin + n * TuningStep, PairedFreqMin + n *
   * TuningStep) with n varying from 0 until FreqMin + n * TuningStep = FreqMax.
   */
  @XmlElement(name = "AllotFreq", required = true)
  private List<AllotFreq> allotFreq;

  /**
   * Gets the value of the title property.
   * <p>
   * @return
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value   */
  public void setTitle(TString value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the usageType property.
   * <p>
   * @return
   */
  public TString getUsageType() {
    return usageType;
  }

  /**
   * Sets the value of the usageType property.
   * <p>
   * @param value   */
  public void setUsageType(TString value) {
    this.usageType = value;
  }

  public boolean isSetUsageType() {
    return (this.usageType != null);
  }

  /**
   * Gets the value of the dateResponseRequired property.
   * <p>
   * @return
   */
  public TCalendar getDateResponseRequired() {
    return dateResponseRequired;
  }

  /**
   * Sets the value of the dateResponseRequired property.
   * <p>
   * @param value   */
  public void setDateResponseRequired(TCalendar value) {
    this.dateResponseRequired = value;
  }

  public boolean isSetDateResponseRequired() {
    return (this.dateResponseRequired != null);
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null);
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  public boolean isSetExpirationDate() {
    return (this.expirationDate != null);
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

  /**
   * Gets the value of the requirement property.
   * <p>
   * @return
   */
  public TString getRequirement() {
    return requirement;
  }

  /**
   * Sets the value of the requirement property.
   * <p>
   * @param value   */
  public void setRequirement(TString value) {
    this.requirement = value;
  }

  public boolean isSetRequirement() {
    return (this.requirement != null);
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
   * Objects of the following type(s) are allowed in the list
   * <p>
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
   * <p>
   * <p>
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
   * Gets the value of the locationRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the locationRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocationRef().add(newItem);
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
  public List<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new ArrayList<>();
    }
    return this.locationRef;
  }

  public boolean isSetLocationRef() {
    return ((this.locationRef != null) && (!this.locationRef.isEmpty()));
  }

  public void unsetLocationRef() {
    this.locationRef = null;
  }

  /**
   * Gets the value of the emission property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the emission property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEmission().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Emission> getEmission() {
    if (emission == null) {
      emission = new ArrayList<>();
    }
    return this.emission;
  }

  public boolean isSetEmission() {
    return ((this.emission != null) && (!this.emission.isEmpty()));
  }

  public void unsetEmission() {
    this.emission = null;
  }

  /**
   * Gets the value of the allotFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the allotFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAllotFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<AllotFreq> getAllotFreq() {
    if (allotFreq == null) {
      allotFreq = new ArrayList<>();
    }
    return this.allotFreq;
  }

  public boolean isSetAllotFreq() {
    return ((this.allotFreq != null) && (!this.allotFreq.isEmpty()));
  }

  public void unsetAllotFreq() {
    this.allotFreq = null;
  }

  public Allotment withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  public Allotment withUsageType(String value) {
    setUsageType(new TString(value));
    return this;
  }

  public Allotment withDateResponseRequired(Calendar value) {
    setDateResponseRequired(new TCalendar(value));
    return this;
  }

  public Allotment withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public Allotment withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  public Allotment withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public Allotment withRequirement(String value) {
    setRequirement(new TString(value));
    return this;
  }

  public Allotment withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allotment withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  public Allotment withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allotment withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  public Allotment withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allotment withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  public Allotment withEmission(Emission... values) {
    if (values != null) {
      getEmission().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allotment withEmission(Collection<Emission> values) {
    if (values != null) {
      getEmission().addAll(values);
    }
    return this;
  }

  public Allotment withAllotFreq(AllotFreq... values) {
    if (values != null) {
      getAllotFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Allotment withAllotFreq(Collection<AllotFreq> values) {
    if (values != null) {
      getAllotFreq().addAll(values);
    }
    return this;
  }

}
