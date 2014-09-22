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

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.AStandardMetadataAttributes;
import us.gov.dod.standard.ssrf.SSRFFactory;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.common.CaseNum;
import us.gov.dod.standard.ssrf._3_0.common.SecurityClass;
import us.gov.dod.standard.ssrf._3_0.metadata.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_0.metadata.Remarks;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCY;

/**
 * This is an abstract element used as a basis for all core datasets.
 * <p>
 * Common includes all SSRF Standard Metadata Attributes plus a "Initial" and
 * "LastChange" group of parameters and several other external reference and
 * remark configurations.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org> 08/15/2014
 * @param <T> The type of class extending this Common abstract class
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Common", propOrder = {
  "serial",
  "entryDateTime",
  "entryBy",
  "owner",
  "lastChangeDateTime",
  "lastChangeBy",
  "state",
  "securityClass",
  "caseNum",
  "extReferenceRef",
  "remarks"
})
@XmlSeeAlso({
  Receiver.class,
  Organisation.class,
  Role.class,
  Satellite.class,
  ChannelPlan.class,
  Administrative.class,
  Antenna.class,
  Allotment.class,
  JRFL.class,
  Location.class,
  ExternalReference.class,
  Note.class,
  IntfReport.class,
  RFSystem.class,
  FEDeployment.class,
  SSRequest.class,
  ForceElement.class,
  SSReply.class,
  Transmitter.class,
  Assignment.class,
  Contact.class,
  TOA.class
})
@SuppressWarnings("unchecked")
public abstract class Common<T> extends AStandardMetadataAttributes {

  /**
   * Serial: The attribute serial is composed of four parts separated by colons
   * (":"). The maximum total length is 29 characters (5+1+4+1+2+1+15).
   * <p>
   * Part 1 is the Country and is always REQUIRED. It contains one to five
   * alphabetic uppercase characters representing either the ITU country code or
   * the NATO Command code identifying the originator or organisation
   * responsible for maintaining the dataset, as listed in Code List CCY.
   * <p>
   * Part 2 is the orgCode and is OPTIONAL. It may contain one to four
   * alphanumeric characters (no spaces nor special characters) representing a
   * code for an Organisation within the country or command. It will normally
   * indicate the organisation responsible for maintaining the dataset. Domain
   * naming is left at the discretion of each country, but should be managed by
   * a central authority in the country to allow deconfliction and uniqueness.
   * It should enable the location in the data repository where this dataset
   * information is stored.
   * <p>
   * Part 3 is the Dataset Type and MUST contain a two-character code from the
   * table in the Introduction section identifying the type of dataset (LO for a
   * Location, etc).
   * <p>
   * Part 4 is a Serial Identifier and is always REQUIRED. It contains one to
   * fifteen alphanumeric characters (including spaces and special characters),
   * whose meaning is left at the discretion of each domain manager.
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   * <p>
   * Examples of serial values: <br/>
   * USA:AR:AS:200600001 An assignment from USA Army<br/>
   * BEL:AF:TR:123 A Belgian Air Force equipment<br/>
   * <p>
   * Usage: Attribute serial is part of data element Common. This data item is a
   * globally unique dataset identifier for the dataset inherited from Common
   * (e.g. Location, Asgn, SSRequest, etc).
   * <p>
   * As SSRF is meant to exchange information (datasets) between different data
   * repositories, a dataset identifier may only apply to the data in the
   * current message and in the data repository from which the data is
   * extracted. For example, an assignment request may refer to a Location
   * record which is known in the local (requester) data repository, therefore
   * the request contains a valid Location identifier with respect to this data
   * repository, however not being known on the addressee side. This message
   * would be valid at the sending side but invalid at the receive side, since
   * the record identified by this serial would not exist.
   * <p>
   * The following codes MUST be used as the third part of the Serial of each
   * dataset:
   * <table border="0>>
   * <tr><th>Code</th><th>Type of dataset</th></tr>
   * <tr><td>AD</td><td>Administrative</td></tr>
   * <tr><td>AL</td><td>Allotment</td></tr>
   * <tr><td>AN</td><td>Antenna</td></tr>
   * <tr><td>AS</td><td>Assignment</td></tr>
   * <tr><td>CN</td><td>Contact</td></tr>
   * <tr><td>CP</td><td>Channel Plan</td></tr>
   * <tr><td>EX</td><td>External Reference</td></tr>
   * <tr><td>FD</td><td>Force Element Deployment</td></tr>
   * <tr><td>FE</td><td>Force Element</td></tr>
   * <tr><td>HD</td><td>Spectrum Supportability Reply (Host Nation
   * Declaration)</td></tr>
   * <tr><td>IF</td><td>Interference Report</td></tr>
   * <tr><td>JA</td><td>Role</td></tr>
   * <tr><td>JR</td><td>JRFL</td></tr>
   * <tr><td>LO</td><td>Location</td></tr>
   * <tr><td>NT</td><td>Note</td></tr>
   * <tr><td>OR</td><td>Organisation</td></tr>
   * <tr><td>RX</td><td>Receiver</td></tr>
   * <tr><td>SA</td><td>Satellite</td></tr>
   * <tr><td>SR</td><td>Spectrum Supportability Request</td></tr>
   * <tr><td>TA</td><td>Table of Allocations</td></tr>
   * <tr><td>TR</td><td>RF System</td></tr>
   * <tr><td>TX</td><td>Transmitter</td></tr>
   * </table>
   */
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  protected TString serial;
  /**
   * EntryDateTime: Enter the date the dataset was initially entered into the
   * data repository (e.g. FRRS for USA, SMIR for NATO).
   */
  @XmlElement(name = "EntryDateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  protected TCalendar entryDateTime;
  /**
   * EntryBy: Enter the serial of the Role which is creating the current
   * dataset.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "JA". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   */
  @XmlElement(name = "EntryBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  protected TString entryBy;
  /**
   * Owner: Enter the serial of the Role which is responsible for the accuracy
   * of the data content.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "JA". [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   */
  @XmlElement(name = "Owner", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  protected TString owner;
  /**
   * LastChangeDateTime: Enter the date/time the dataset was last modified.
   */
  @XmlElement(name = "LastChangeDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  protected TCalendar lastChangeDateTime;
  /**
   * LastChangeBy: Enter the serial of the Role which last modified the current
   * dataset.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be
   * "JA".
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   */
  @XmlElement(name = "LastChangeBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  protected TString lastChangeBy;
  /**
   * State: Enter the state of the dataset. Recommend values from Code List CSU:
   * <p>
   * Active Inactive
   */
  @XmlElement(name = "State", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  protected TString state;
  /**
   * Data element SecurityClass ...
   */
  @XmlElement(name = "SecurityClass")
  protected SecurityClass securityClass;
  /**
   * Data element CaseNum allows to store a case number associated to the
   * dataset.
   */
  @XmlElement(name = "CaseNum")
  protected List<CaseNum> caseNum;
  /**
   * This element refers to an external reference defined in a dataset
   * ExternalReference.
   * <p>
   * ExternalReference: This element inherits attributes and sub-elements from
   * element Common.
   * <p>
   * Data element ExternalReference contains bibliographic or any other
   * references applicable to the dataset except those placed in Derivative
   * Classification Authority (Data element ClsDerived). It may be used to
   * indicate the file name for an external reference (e.g. a line diagram as a
   * graphic file). It may also contain the Uniform Resource Identifier to a
   * network resource containing the external reference. The references may be
   * message date-time- groups (DTG), E-mails, documents, or letter references.
   * <p>
   * This element SHOULD be used to store identifiers when importing datasets
   * coming from Multilateral Interoperability Programme (MIP) / Joint C3
   * Information Exchange Data Model (JC3IEDM) applications, using type="MIPI".
   */
  @XmlElement(name = "ExtReferenceRef", nillable = true)
  protected List<ExtReferenceRef> extReferenceRef;
  /**
   * Enter any additional data pertinent to the level where this element appears
   * that cannot be adequately represented in an established data element. In
   * certain situations, technical data must be included in free text in order
   * to clearly explain a technical or operational consideration; in these
   * instances, the data must also be entered in the data element(s)
   * specifically established for it.
   */
  @XmlElement(name = "Remarks", nillable = true)
  protected List<Remarks> remarks;

  /**
   * Construct an EMPTY Common instance type.
   * <p>
   * Developer note: The following two fields MUST be set to create a valid
   * Common instance: serial and entryDateTime.
   */
  public Common() {
  }

  /**
   * Common constructor with the bare minimum required elements for a valid SSRF
   * instance.
   * <p>
   * @param snCountry      The Serial number Country part (REQUIRED). It
   *                       contains one to five alphabetic uppercase characters
   *                       representing either the ITU country code or the NATO
   *                       Command code identifying the originator or
   *                       organisation responsible for maintaining the dataset,
   *                       as listed in Code List CCY.
   * @param snOrganization The serial number Organization code (OPTIONAL). It
   *                       may contain one to four alphanumeric characters (no
   *                       spaces nor special characters) representing a code
   *                       for an Organisation within the country or command. It
   *                       will normally indicate the organisation responsible
   *                       for maintaining the dataset. Domain naming is left at
   *                       the discretion of each country, but should be managed
   *                       by a central authority in the country to allow
   *                       deconfliction and uniqueness. It should enable the
   *                       location in the data repository where this dataset
   *                       information is stored.
   * @param snSerial       The serial number Serial identifier (REQUIRED). It
   *                       contains one to fifteen alphanumeric characters
   *                       (including spaces and special characters), whose
   *                       meaning is left at the discretion of each domain
   *                       manager. <em>Developer note</em>: If the snSerial is
   *                       set to NULL then a random serial number is assigned.
   * @param entryDateTime  Enter the date the dataset was initially entered into
   *                       the data repository (e.g. FRRS for USA, SMIR for
   *                       NATO).
   */
  public Common(ListCCY snCountry, String snOrganization, String snSerial, Calendar entryDateTime) {
    setSerial(snCountry, snOrganization, snSerial);
    this.entryDateTime = new TCalendar(entryDateTime);
  }

  /**
   * Common constructor with the bare minimum required elements for a valid SSRF
   * instance.
   * <p>
   * @param snCountry      The Serial number Country part (REQUIRED). It
   *                       contains one to five alphabetic uppercase characters
   *                       representing either the ITU country code or the NATO
   *                       Command code identifying the originator or
   *                       organisation responsible for maintaining the dataset,
   *                       as listed in Code List CCY.
   * @param snOrganization The serial number Organization code (OPTIONAL). It
   *                       may contain one to four alphanumeric characters (no
   *                       spaces nor special characters) representing a code
   *                       for an Organisation within the country or command. It
   *                       will normally indicate the organisation responsible
   *                       for maintaining the dataset. Domain naming is left at
   *                       the discretion of each country, but should be managed
   *                       by a central authority in the country to allow
   *                       deconfliction and uniqueness. It should enable the
   *                       location in the data repository where this dataset
   *                       information is stored.
   * @param snSerial       The serial number Serial identifier (REQUIRED). It
   *                       contains one to fifteen alphanumeric characters
   *                       (including spaces and special characters), whose
   *                       meaning is left at the discretion of each domain
   *                       manager. <em>Developer note</em>: If the snSerial is
   *                       set to NULL then a random serial number is assigned.
   * @param entryDateTime  Enter the date the dataset was initially entered into
   *                       the data repository (e.g. FRRS for USA, SMIR for
   *                       NATO).
   */
  public Common(ListCCY snCountry, String snOrganization, String snSerial, Date entryDateTime) {
    setSerial(snCountry, snOrganization, snSerial);
    this.entryDateTime = new TCalendar(entryDateTime);
  }

  /**
   * Gets the value of the serial property.
   * <p>
   * @return
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  /**
   * Set the serial number for this SSRF Common class instance.
   * <p>
   * @param snCountry      The Serial number Country part (REQUIRED). It
   *                       contains one to five alphabetic uppercase characters
   *                       representing either the ITU country code or the NATO
   *                       Command code identifying the originator or
   *                       organisation responsible for maintaining the dataset,
   *                       as listed in Code List CCY.
   * @param snOrganization The serial number Organization code (OPTIONAL). It
   *                       may contain one to four alphanumeric characters (no
   *                       spaces nor special characters) representing a code
   *                       for an Organisation within the country or command. It
   *                       will normally indicate the organisation responsible
   *                       for maintaining the dataset. Domain naming is left at
   *                       the discretion of each country, but should be managed
   *                       by a central authority in the country to allow
   *                       deconfliction and uniqueness. It should enable the
   *                       location in the data repository where this dataset
   *                       information is stored.
   * @param snSerial       The serial number Serial identifier (REQUIRED). It
   *                       contains one to fifteen alphanumeric characters
   *                       (including spaces and special characters), whose
   *                       meaning is left at the discretion of each domain
   *                       manager. <em>Developer note</em>: If the snSerial is
   *                       set to NULL then a random serial number is assigned.
   */
  @SuppressWarnings("AssignmentToMethodParameter")
  public final void setSerial(ListCCY snCountry, String snOrganization, String snSerial) {
    this.serial = SSRFFactory.serial(this, snCountry, snOrganization, snSerial);
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Gets the value of the entryDateTime property.
   * <p>
   * @return
   */
  public TCalendar getEntryDateTime() {
    return entryDateTime;
  }

  /**
   * Sets the value of the entryDateTime property.
   * <p>
   * @param value
   */
  public void setEntryDateTime(TCalendar value) {
    this.entryDateTime = value;
  }

  public boolean isSetEntryDateTime() {
    return (this.entryDateTime != null);
  }

  /**
   * Gets the value of the entryBy property.
   * <p>
   * @return
   */
  public TString getEntryBy() {
    return entryBy;
  }

  /**
   * Sets the value of the entryBy property.
   * <p>
   * @param value
   */
  public void setEntryBy(TString value) {
    this.entryBy = value;
  }

  public boolean isSetEntryBy() {
    return (this.entryBy != null);
  }

  /**
   * Gets the value of the owner property.
   * <p>
   * @return
   */
  public TString getOwner() {
    return owner;
  }

  /**
   * Sets the value of the owner property.
   * <p>
   * @param value
   */
  public void setOwner(TString value) {
    this.owner = value;
  }

  public boolean isSetOwner() {
    return (this.owner != null);
  }

  /**
   * Gets the value of the lastChangeDateTime property.
   * <p>
   * @return
   */
  public TCalendar getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  /**
   * Sets the value of the lastChangeDateTime property.
   * <p>
   * @param value
   */
  public void setLastChangeDateTime(TCalendar value) {
    this.lastChangeDateTime = value;
  }

  public boolean isSetLastChangeDateTime() {
    return (this.lastChangeDateTime != null);
  }

  /**
   * Gets the value of the lastChangeBy property.
   * <p>
   * @return
   */
  public TString getLastChangeBy() {
    return lastChangeBy;
  }

  /**
   * Sets the value of the lastChangeBy property.
   * <p>
   * @param value
   */
  public void setLastChangeBy(TString value) {
    this.lastChangeBy = value;
  }

  public boolean isSetLastChangeBy() {
    return (this.lastChangeBy != null);
  }

  /**
   * Gets the value of the state property.
   * <p>
   * @return
   */
  public TString getState() {
    return state;
  }

  /**
   * Sets the value of the state property.
   * <p>
   * @param value
   */
  public void setState(TString value) {
    this.state = value;
  }

  public boolean isSetState() {
    return (this.state != null);
  }

  /**
   * Gets the value of the securityClass property.
   * <p>
   * @return
   */
  public SecurityClass getSecurityClass() {
    return securityClass;
  }

  /**
   * Sets the value of the securityClass property.
   * <p>
   * @param value
   */
  public void setSecurityClass(SecurityClass value) {
    this.securityClass = value;
  }

  public boolean isSetSecurityClass() {
    return (this.securityClass != null);
  }

  /**
   * Gets the value of the caseNum property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the caseNum property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCaseNum().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new ArrayList<>();
    }
    return this.caseNum;
  }

  public boolean isSetCaseNum() {
    return ((this.caseNum != null) && (!this.caseNum.isEmpty()));
  }

  public void unsetCaseNum() {
    this.caseNum = null;
  }

  /**
   * Gets the value of the extReferenceRef property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the extReferenceRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExtReferenceRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<ExtReferenceRef> getExtReferenceRef() {
    if (extReferenceRef == null) {
      extReferenceRef = new ArrayList<>();
    }
    return this.extReferenceRef;
  }

  public boolean isSetExtReferenceRef() {
    return ((this.extReferenceRef != null) && (!this.extReferenceRef.isEmpty()));
  }

  public void unsetExtReferenceRef() {
    this.extReferenceRef = null;
  }

  /**
   * Gets the value of the remarks property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the remarks property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRemarks().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
    }
    return this.remarks;
  }

  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  public void unsetRemarks() {
    this.remarks = null;
  }

  /**
   * Set the serial number for this SSRF Common class instance.
   * <p>
   * @param value The attribute serial is composed of four parts separated by
   *              colons (":"). The maximum total length is 29 characters
   *              (5+1+4+1+2+1+15).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
   * @return the current instance
   */
  public T withSerial(String value) {
    setSerial(new TString(value));
    return (T) this;
  }

  public T withSerial(TString value) {
    setSerial(value);
    return (T) this;
  }

  /**
   * Set the serial number for this SSRF Common class instance.
   * <p>
   * @param snCountry      The Serial number Country part (REQUIRED). It
   *                       contains one to five alphabetic uppercase characters
   *                       representing either the ITU country code or the NATO
   *                       Command code identifying the originator or
   *                       organisation responsible for maintaining the dataset,
   *                       as listed in Code List CCY.
   * @param snOrganization The serial number Organization code (OPTIONAL). It
   *                       may contain one to four alphanumeric characters (no
   *                       spaces nor special characters) representing a code
   *                       for an Organisation within the country or command. It
   *                       will normally indicate the organisation responsible
   *                       for maintaining the dataset. Domain naming is left at
   *                       the discretion of each country, but should be managed
   *                       by a central authority in the country to allow
   *                       deconfliction and uniqueness. It should enable the
   *                       location in the data repository where this dataset
   *                       information is stored.
   * @param snSerial       The serial number Serial identifier (REQUIRED). It
   *                       contains one to fifteen alphanumeric characters
   *                       (including spaces and special characters), whose
   *                       meaning is left at the discretion of each domain
   *                       manager.
   * @return the current instance
   */
  public T withSerial(ListCCY snCountry, String snOrganization, String snSerial) {
    setSerial(snCountry, snOrganization, snSerial);
    return (T) this;
  }

  public T withEntryDateTime(Calendar value) {
    setEntryDateTime(new TCalendar(value));
    return (T) this;
  }

  public T withEntryDateTime(Date value) {
    setEntryDateTime(new TCalendar(value));
    return (T) this;
  }

  public T withEntryBy(String value) {
    setEntryBy(new TString(value));
    return (T) this;
  }

  public T withOwner(String value) {
    setOwner(new TString(value));
    return (T) this;
  }

  public T withLastChangeDateTime(Calendar value) {
    setLastChangeDateTime(new TCalendar(value));
    return (T) this;
  }

  public T withLastChangeDateTime(Date value) {
    setLastChangeDateTime(new TCalendar(value));
    return (T) this;
  }

  public T withLastChangeBy(String value) {
    setLastChangeBy(new TString(value));
    return (T) this;
  }

  public T withState(String value) {
    setState(new TString(value));
    return (T) this;
  }

  public T withSecurityClass(SecurityClass value) {
    setSecurityClass(value);
    return (T) this;
  }

  public T withCaseNum(CaseNum... values) {
    if (values != null) {
      getCaseNum().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  public T withCaseNum(Collection<CaseNum> values) {
    if (values != null) {
      getCaseNum().addAll(values);
    }
    return (T) this;
  }

  public T withExtReferenceRef(ExtReferenceRef... values) {
    if (values != null) {
      getExtReferenceRef().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  public T withExtReferenceRef(Collection<ExtReferenceRef> values) {
    if (values != null) {
      getExtReferenceRef().addAll(values);
    }
    return (T) this;
  }

  public T withRemarks(Remarks... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  public T withRemarks(Collection<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return (T) this;
  }
}
