/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.common.CaseNum;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.common.Remarks;
import us.gov.dod.standard.ssrf._3_1.common.SecurityClass;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCY;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSU;

/**
 * Common is the parent complex element for all Datasets.
 * <p>
 * Sub-Elements are
 * {@link CaseNum}, {@link ExtReferenceRef}, {@link Remarks}, {@link SecurityClass}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Common", propOrder = {
  "lastObservedBy",
  "observedFirstDateTime",
  "observedLastDateTime",
  "approvedBy",
  "approvedDateTime",
  "redacted",
  "serial",
  "entryDateTime",
  "entryBy",
  "owner",
  "lastChangeDateTime",
  "lastChangeBy",
  "lastReviewDate",
  "lastReviewBy",
  "modAllowedBy",
  "state",
  "description",
  "securityClass",
  "caseNum",
  "extReferenceRef",
  "remarks"
})
@XmlSeeAlso({
  Receiver.class,
  ChannelPlan.class,
  Administrative.class,
  Antenna.class,
  JRFL.class,
  Location.class,
  IntfReport.class,
  RadiationPlan.class,
  RFSystem.class,
  SSRequest.class,
  SSReply.class,
  Transmitter.class,
  TOA.class,
  Organisation.class,
  Role.class,
  Satellite.class,
  Allotment.class,
  Loadset.class,
  Message.class,
  ExternalReference.class,
  Note.class,
  FEDeployment.class,
  ForceElement.class,
  Assignment.class,
  Contact.class
})
@SuppressWarnings("unchecked")
public abstract class Common<T> {

  /**
   * US:LastObservedBy - Last Observed By (Optional)
   * <p>
   * The identifier of the person or entity who last observed this Dataset.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "LastObservedBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString lastObservedBy;
  /**
   * US:ObservedFirstDateTime - Initial Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was first collected.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "ObservedFirstDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar observedFirstDateTime;
  /**
   * US:ObservedLastDateTime - Last Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was last collected.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "ObservedLastDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar observedLastDateTime;
  /**
   * US:ApprovedBy - Last Approval Person (Optional)
   * <p>
   * The identifier of the designated expert who last approved or accepted the
   * dataset.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "ApprovedBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString approvedBy;
  /**
   * US:ApprovedDateTime - Last Approval Timestamp (Optional)
   * <p>
   * The last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "ApprovedDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar approvedDateTime;
  /**
   * In Data Item Redacted (US), indicate if any original, or authoritative,
   * data was omitted. Supports datasets which have some data withheld by the
   * submitting agency.
   */
  @XmlElement(name = "Redacted", required = false)
  private TString redacted;

  /**
   * Serial - Serial (Required)
   * <p>
   * A unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15).
   * <ul>
   * <li>Part 1 is the Country and is always REQUIRED. It contains one to five
   * alphabetic uppercase characters representing either the ITU country code or
   * the NATO Command code identifying the originator or organisation
   * responsible for maintaining the dataset, as listed in Code List CCY. </li>
   * <li>Part 2 is the orgCode and is OPTIONAL. It may contain one to four
   * alphanumeric characters (no spaces nor special characters) representing a
   * code for an Organisation within the country or command. It will normally
   * indicate the organisation responsible for maintaining the dataset. Domain
   * naming is left at the discretion of each country, but should be managed by
   * a central authority in the country to allow deconfliction and uniqueness.
   * It should enable the location in the data repository where this dataset
   * information is stored. </li>
   * <li>Part 3 is the Dataset Type and MUST contain a two-character code from
   * the table in the Introduction section identifying the type of dataset (LO
   * for a Location, etc). </li>
   * <li>Part 4 is a Serial Identifier and is always REQUIRED. It contains one
   * to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.</li>
   * </ul>
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  /**
   * EntryDateTime - Entry Date/Time (Required)
   * <p>
   * The date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "EntryDateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar entryDateTime;

  /**
   * EntryBy - Creator Role (Optional)
   * <p>
   * The serial of the Role which is creating the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "EntryBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString entryBy;
  /**
   * Owner - Role which Owns the Dataset (Optional)
   * <p>
   * The serial of the Role which is responsible for the accuracy of the data
   * content.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "Owner", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString owner;
  /**
   * LastChangeDateTime - Latest Modification Date/Time (Optional)
   * <p>
   * The date and UTC Time the dataset was last modified.
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group LastChange (Optional)
   */
  @XmlElement(name = "LastChangeDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar lastChangeDateTime;
  /**
   * LastChangeBy - Last Modifier Role (Optional)
   * <p>
   * The serial of the Role which last modified the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastChange (Optional)
   */
  @XmlElement(name = "LastChangeBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString lastChangeBy;
  /**
   * LastReviewDate - Last Review Date (Optional)
   * <p>
   * The last date that the dataset was reviewed.
   * <p>
   * Format is Date
   * <p>
   * Attribute group LastReview (Optional)
   */
  @XmlElement(name = "LastReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar lastReviewDate;
  /**
   * LastReviewBy - Last Review Person RoleRef (Optional)
   * <p>
   * The Role reference serial of the person who last reviewed the dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastReview (Optional)
   */
  @XmlElement(name = "LastReviewBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString lastReviewBy;
  /**
   * ModAllowedBy - Role Allowed to Modify (Optional)
   * <p>
   * The serial of the Role which is authorised to modify the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Divergence from SMADEF: Automated changes using ModAllowedBy are not
   * permitted for use by USA systems.
   */
  @XmlElement(name = "ModAllowedBy", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString modAllowedBy;
  /**
   * State - Dataset Status (Optional)
   * <p>
   * The state of the dataset.
   * <p>
   * Format is L:CSU
   */
  @XmlElement(name = "State", required = false)
  private TString state;
  /**
   * Description - General Dataset Description (Optional)
   * <p>
   * A general description of the Dataset that is inheriting Common.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS500.class)
  private TString description;
  /**
   * US:SecurityClass (Optional)
   * <p>
   * SecurityClass (US) contains the security classification from one or more
   * data information sources.
   */
  @XmlElement(name = "SecurityClass")
  private SecurityClass securityClass;
  /**
   * CaseNum (Optional)
   * <p>
   * CaseNum provides the capability to store multiple identifiers for a
   * Dataset.
   */
  @XmlElement(name = "CaseNum")
  private List<CaseNum> caseNum;
  /**
   * ExtReferenceRef (Optional)
   * <p>
   * ExtReferenceRef refers to an external reference defined in a dataset
   * ExternalReference.
   */
  @XmlElement(name = "ExtReferenceRef", nillable = true)
  private List<ExtReferenceRef> extReferenceRef;
  /**
   * remarks - Remarks (Optional)
   * <p>
   * Remarks is a free text field that provides a place to add additional MEMO
   * information. In certain situations, technical data must be included in free
   * text in order to clearly explain a technical or operational consideration;
   * in these instances, the data must also be entered in the data element(s)
   * specifically established for it.
   */
  @XmlElement(name = "Remarks", nillable = true)
  private List<Remarks> remarks;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   */
  @XmlAttribute(name = "cls", required = true)
  private ListCCL cls;
  /**
   * releasability - Releasability Markings (Optional)
   * <p>
   * A list of country codes for which the current data item is releasable. For
   * NATO, if this element is omitted, there is no releasability restriction for
   * the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * Format is List of L:CCY
   */
  @XmlAttribute(name = "releasability")
  private List<ListCCY> releasability;
  /**
   * remarks - Index reference to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   */
  @XmlAttribute(name = "remarks")
  private List<BigInteger> remarkRef;
  /**
   * extReferences - Links to External References (Optional)
   * <p>
   * A list of Conmmon/ExtReferenceRef idx values applicable to the current data
   * item.
   * <p>
   * Format is List of UN6
   */
  @XmlAttribute(name = "extReferences")
  private List<BigInteger> extReferences;
  /**
   * US:legacyReleasability - Legacy Releasability (Optional)
   * <p>
   * One or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "legacyReleasability")
  private String legacyReleasability;
  /**
   * US:quality - Data Quality (Optional)
   * <p>
   * One or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * Format is S255
   */
  @XmlAttribute(name = "quality")
  private String quality;
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "recommendedValue")
  private String recommendedValue;
  /**
   * idref - Data Item ID (Optional)
   * <p>
   * A unique identifier for each Data Item in the Dataset. Within each Dataset,
   * the idref value must be unique for every occurrence. If a received Dataset
   * uses idrefs and it is expected that the Dataset will be exchanged, the
   * idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * Format is S10
   */
  @XmlAttribute(name = "idref")
  private String idref;

  /**
   * Get the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @return the LastObservedBy value in a {@link TString} data type
   */
  public TString getLastObservedBy() {
    return lastObservedBy;
  }

  /**
   * Set the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @param value the LastObservedBy value in a {@link TString} data type
   */
  public void setLastObservedBy(TString value) {
    this.lastObservedBy = value;
  }

  /**
   * Determine if the LastObservedBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastObservedBy() {
    return (this.lastObservedBy != null ? this.lastObservedBy.isSetValue() : false);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @return the ObservedFirstDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getObservedFirstDateTime() {
    return observedFirstDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value the ObservedFirstDateTime value in a {@link TCalendar} data
   *              type
   */
  public void setObservedFirstDateTime(TCalendar value) {
    this.observedFirstDateTime = value;
  }

  /**
   * Determine if the ObservedFirstDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedFirstDateTime() {
    return (this.observedFirstDateTime != null ? this.observedFirstDateTime.isSetValue() : false);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @return the ObservedLastDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getObservedLastDateTime() {
    return observedLastDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value the ObservedLastDateTime value in a {@link TCalendar} data
   *              type
   */
  public void setObservedLastDateTime(TCalendar value) {
    this.observedLastDateTime = value;
  }

  /**
   * Determine if the ObservedLastDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedLastDateTime() {
    return (this.observedLastDateTime != null ? this.observedLastDateTime.isSetValue() : false);
  }

  /**
   * Get the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @return the ApprovedBy value in a {@link TString} data type
   */
  public TString getApprovedBy() {
    return approvedBy;
  }

  /**
   * Set the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @param value the ApprovedBy value in a {@link TString} data type
   */
  public void setApprovedBy(TString value) {
    this.approvedBy = value;
  }

  /**
   * Determine if the ApprovedBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovedBy() {
    return (this.approvedBy != null ? this.approvedBy.isSetValue() : false);
  }

  /**
   * Get the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @return the ApprovedDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getApprovedDateTime() {
    return approvedDateTime;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value the ApprovedDateTime value in a {@link TCalendar} data type
   */
  public void setApprovedDateTime(TCalendar value) {
    this.approvedDateTime = value;
  }

  /**
   * Determine if the ApprovedDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovedDateTime() {
    return (this.approvedDateTime != null ? this.approvedDateTime.isSetValue() : false);
  }

  /**
   * Get In Data Item Redacted (US), indicate if any original, or authoritative,
   * data was omitted. Supports datasets which have some data withheld by the
   * submitting agency.
   * <p>
   * @return the Redacted value in a {@link TString} data type
   */
  public TString getRedacted() {
    return redacted;
  }

  /**
   * Set In Data Item Redacted (US), indicate if any original, or authoritative,
   * data was omitted. Supports datasets which have some data withheld by the
   * submitting agency.
   * <p>
   * @param value the Redacted value in a {@link TString} data type
   */
  public void setRedacted(TString value) {
    this.redacted = value;
  }

  /**
   * Determine if the Redacted is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRedacted() {
    return (this.redacted != null ? this.redacted.isSetValue() : false);
  }

  /**
   * Get a unique Dataset identifier.
   * <p>
   * @return the Serial value in a {@link TString} data type
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * @param value the Serial value in a {@link TString} data type
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @return the EntryDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getEntryDateTime() {
    return entryDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value the EntryDateTime value in a {@link TCalendar} data type
   */
  public void setEntryDateTime(TCalendar value) {
    this.entryDateTime = value;
  }

  /**
   * Determine if the EntryDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryDateTime() {
    return (this.entryDateTime != null ? this.entryDateTime.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is creating the current dataset.
   * <p>
   * @return the EntryBy value in a {@link TString} data type
   */
  public TString getEntryBy() {
    return entryBy;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value the EntryBy value in a {@link TString} data type
   */
  public void setEntryBy(TString value) {
    this.entryBy = value;
  }

  /**
   * Determine if the EntryBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryBy() {
    return (this.entryBy != null ? this.entryBy.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @return the Owner value in a {@link TString} data type
   */
  public TString getOwner() {
    return owner;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value the Owner value in a {@link TString} data type
   */
  public void setOwner(TString value) {
    this.owner = value;
  }

  /**
   * Determine if the Owner is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwner() {
    return (this.owner != null ? this.owner.isSetValue() : false);
  }

  /**
   * Get the date and UTC Time the dataset was last modified.
   * <p>
   * @return the LastChangeDateTime value in a {@link TCalendar} data type
   */
  public TCalendar getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value the LastChangeDateTime value in a {@link TCalendar} data type
   */
  public void setLastChangeDateTime(TCalendar value) {
    this.lastChangeDateTime = value;
  }

  /**
   * Determine if the LastChangeDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeDateTime() {
    return (this.lastChangeDateTime != null ? this.lastChangeDateTime.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which last modified the current dataset.
   * <p>
   * @return the LastChangeBy value in a {@link TString} data type
   */
  public TString getLastChangeBy() {
    return lastChangeBy;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value the LastChangeBy value in a {@link TString} data type
   */
  public void setLastChangeBy(TString value) {
    this.lastChangeBy = value;
  }

  /**
   * Determine if the LastChangeBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeBy() {
    return (this.lastChangeBy != null ? this.lastChangeBy.isSetValue() : false);
  }

  /**
   * Get the last date that the dataset was reviewed.
   * <p>
   * @return the LastReviewDate value in a {@link TCalendar} data type
   */
  public TCalendar getLastReviewDate() {
    return lastReviewDate;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value the LastReviewDate value in a {@link TCalendar} data type
   */
  public void setLastReviewDate(TCalendar value) {
    this.lastReviewDate = value;
  }

  /**
   * Determine if the LastReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewDate() {
    return (this.lastReviewDate != null ? this.lastReviewDate.isSetValue() : false);
  }

  /**
   * Get the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @return the LastReviewBy value in a {@link TString} data type
   */
  public TString getLastReviewBy() {
    return lastReviewBy;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value the LastReviewBy value in a {@link TString} data type
   */
  public void setLastReviewBy(TString value) {
    this.lastReviewBy = value;
  }

  /**
   * Determine if the LastReviewBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewBy() {
    return (this.lastReviewBy != null ? this.lastReviewBy.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is authorised to modify the current
   * dataset.
   * <p>
   * @return the ModAllowedBy value in a {@link TString} data type
   */
  public TString getModAllowedBy() {
    return modAllowedBy;
  }

  /**
   * Set the serial of the Role which is authorised to modify the current
   * dataset.
   * <p>
   * @param value the ModAllowedBy value in a {@link TString} data type
   */
  public void setModAllowedBy(TString value) {
    this.modAllowedBy = value;
  }

  /**
   * Determine if the ModAllowedBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModAllowedBy() {
    return (this.modAllowedBy != null ? this.modAllowedBy.isSetValue() : false);
  }

  /**
   * Get the state of the dataset.
   * <p>
   * @return the State value in a {@link TString} data type
   */
  public TString getState() {
    return state;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value the State value in a {@link TString} data type
   */
  public void setState(TString value) {
    this.state = value;
  }

  /**
   * Determine if the State is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetState() {
    return (this.state != null ? this.state.isSetValue() : false);
  }

  /**
   * Get a general description of the Dataset that is inheriting Common.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a general description of the Dataset that is inheriting Common.
   * <p>
   * @param value the Description value in a {@link TString} data type
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @return a {@link SecurityClass} instance
   */
  public SecurityClass getSecurityClass() {
    return securityClass;
  }

  /**
   * Set the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @param value a {@link SecurityClass} instance
   */
  public void setSecurityClass(SecurityClass value) {
    this.securityClass = value;
  }

  /**
   * Determine if the SecurityClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecurityClass() {
    return (this.securityClass != null);
  }

  /**
   * Get the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @return a {@link List<CaseNum>} instance
   */
  public List<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new ArrayList<>();
    }
    return this.caseNum;
  }

  /**
   * Determine if the CaseNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCaseNum() {
    return ((this.caseNum != null) && (!this.caseNum.isEmpty()));
  }

  /**
   * Clear the CaseNum field. This sets the field to null.
   */
  public void unsetCaseNum() {
    this.caseNum = null;
  }

  /**
   * Get the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @return a {@link List<ExtReferenceRef>} instance
   */
  public List<ExtReferenceRef> getExtReferenceRef() {
    if (extReferenceRef == null) {
      extReferenceRef = new ArrayList<>();
    }
    return this.extReferenceRef;
  }

  /**
   * Determine if the ExtReferenceRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExtReferenceRef() {
    return ((this.extReferenceRef != null) && (!this.extReferenceRef.isEmpty()));
  }

  /**
   * Clear the ExtReferenceRef field. This sets the field to null.
   */
  public void unsetExtReferenceRef() {
    this.extReferenceRef = null;
  }

  /**
   * Get a list of Remark memo entries applicable to the current data item.
   * <p>
   * @return a {@link List<Remarks>} instance
   */
  public List<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
    }
    return this.remarks;
  }

  /**
   * Determine if the Remarks is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  /**
   * Clear the Remarks field. This sets the field to null.
   */
  public void unsetRemarks() {
    this.remarks = null;
  }

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link ListCCL} instance
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link ListCCL} instance
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

  /**
   * Determine if the Cls is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @return a {@link List<ListCCY>} instance
   */
  public List<ListCCY> getReleasability() {
    if (releasability == null) {
      releasability = new ArrayList<>();
    }
    return this.releasability;
  }

  /**
   * Determine if the Releasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReleasability() {
    return ((this.releasability != null) && (!this.releasability.isEmpty()));
  }

  /**
   * Clear the Releasability field. This sets the field to null.
   */
  public void unsetReleasability() {
    this.releasability = null;
  }

  /**
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a {@link List<BigInteger>} instance
   */
  public List<BigInteger> getRemarkRef() {
    if (remarkRef == null) {
      remarkRef = new ArrayList<>();
    }
    return this.remarkRef;
  }

  /**
   * Determine if the RemarkRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRemarkRef() {
    return ((this.remarkRef != null) && (!this.remarkRef.isEmpty()));
  }

  /**
   * Clear the RemarkRef field. This sets the field to null.
   */
  public void unsetRemarkRef() {
    this.remarkRef = null;
  }

  /**
   * Get a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @return a {@link List<BigInteger>} instance
   */
  public List<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new ArrayList<>();
    }
    return this.extReferences;
  }

  /**
   * Determine if the ExtReferences is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExtReferences() {
    return ((this.extReferences != null) && (!this.extReferences.isEmpty()));
  }

  /**
   * Clear the ExtReferences field. This sets the field to null.
   */
  public void unsetExtReferences() {
    this.extReferences = null;
  }

  /**
   * Get one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @return a {@link String} instance
   */
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value a {@link String} instance
   */
  public void setLegacyReleasability(String value) {
    this.legacyReleasability = value;
  }

  /**
   * Determine if the LegacyReleasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLegacyReleasability() {
    return (this.legacyReleasability != null);
  }

  /**
   * Get one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @return a {@link String} instance
   */
  public String getQuality() {
    return quality;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value a {@link String} instance
   */
  public void setQuality(String value) {
    this.quality = value;
  }

  /**
   * Determine if the Quality is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetQuality() {
    return (this.quality != null);
  }

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   */
  public void setRecommendedValue(String value) {
    this.recommendedValue = value;
  }

  /**
   * Determine if the RecommendedValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRecommendedValue() {
    return (this.recommendedValue != null);
  }

  /**
   * Get a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @return a {@link String} instance
   */
  public String getIdref() {
    return idref;
  }

  /**
   * Set a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @param value a {@link String} instance
   */
  public void setIdref(String value) {
    this.idref = value;
  }

  /**
   * Determine if the Idref is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdref() {
    return (this.idref != null);
  }

  /**
   * Set the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withLastObservedBy(String value) {
    setLastObservedBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withObservedFirstDateTime(Calendar value) {
    setObservedFirstDateTime(new TCalendar(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withObservedLastDateTime(Calendar value) {
    setObservedLastDateTime(new TCalendar(value));
    return (T) this;
  }

  /**
   * Set the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withApprovedBy(String value) {
    setApprovedBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withApprovedDateTime(Calendar value) {
    setApprovedDateTime(new TCalendar(value));
    return (T) this;
  }

  /**
   * Set In Data Item Redacted (US), indicate if any original, or authoritative,
   * data was omitted. Supports datasets which have some data withheld by the
   * submitting agency.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Common object instance
   */
  public T withRedacted(ListCBO value) {
    setRedacted(new TString(value.value()));
    return (T) this;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withSerial(String value) {
    setSerial(new TString(value));
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withEntryDateTime(Calendar value) {
    setEntryDateTime(new TCalendar(value));
    return (T) this;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withEntryBy(String value) {
    setEntryBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withOwner(String value) {
    setOwner(new TString(value));
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withLastChangeDateTime(Calendar value) {
    setLastChangeDateTime(new TCalendar(value));
    return (T) this;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withLastChangeBy(String value) {
    setLastChangeBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withLastReviewDate(Calendar value) {
    setLastReviewDate(new TCalendar(value));
    return (T) this;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withLastReviewBy(String value) {
    setLastReviewBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the serial of the Role which is authorised to modify the current
   * dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withModAllowedBy(String value) {
    setModAllowedBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value An instances of type {@link ListCSU}
   * @return The current Common object instance
   */
  public T withState(ListCSU value) {
    setState(new TString(value.value()));
    return (T) this;
  }

  /**
   * Set a general description of the Dataset that is inheriting Common.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withDescription(String value) {
    setDescription(new TString(value));
    return (T) this;
  }

  /**
   * Set the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @param value An instances of type {@link SecurityClass}
   * @return The current Common object instance
   */
  public T withSecurityClass(SecurityClass value) {
    return (T) this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @param values One or more instances of type {@link CaseNum...}
   * @return The current Common object instance
   */
  public T withCaseNum(CaseNum... values) {
    if (values != null) {
      getCaseNum().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @param values A collection of {@link CaseNum} instances
   * @return The current Common object instance
   */
  public T withCaseNum(Collection<CaseNum> values) {
    if (values != null) {
      getCaseNum().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @param values One or more instances of type {@link ExtReferenceRef...}
   * @return The current Common object instance
   */
  public T withExtReferenceRef(ExtReferenceRef... values) {
    if (values != null) {
      getExtReferenceRef().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @param values A collection of {@link ExtReferenceRef} instances
   * @return The current Common object instance
   */
  public T withExtReferenceRef(Collection<ExtReferenceRef> values) {
    if (values != null) {
      getExtReferenceRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Common object instance
   */
  public T withRemarks(Remarks... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link Remarks} instances
   * @return The current Common object instance
   */
  public T withRemarks(Collection<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current Common object instance
   */
  public T withCls(ListCCL value) {
    return (T) this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values One or more instances of type {@link ListCCY...}
   * @return The current Common object instance
   */
  public T withReleasability(ListCCY... values) {
    if (values != null) {
      getReleasability().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values A collection of {@link Releasability} instances
   * @return The current Common object instance
   */
  public T withReleasability(Collection<ListCCY> values) {
    if (values != null) {
      getReleasability().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current Common object instance
   */
  public T withRemarkRef(BigInteger... values) {
    if (values != null) {
      getRemarkRef().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RemarkRef} instances
   * @return The current Common object instance
   */
  public T withRemarkRef(Collection<BigInteger> values) {
    if (values != null) {
      getRemarkRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger...}
   * @return The current Common object instance
   */
  public T withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values A collection of {@link ExtReferences} instances
   * @return The current Common object instance
   */
  public T withExtReferences(Collection<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withLegacyReleasability(String value) {
    return (T) this;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withQuality(String value) {
    return (T) this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withRecommendedValue(String value) {
    return (T) this;
  }

  /**
   * Set a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withIdref(String value) {
    return (T) this;
  }

  /**
   * Get a string representation of this Common instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Common {"
      + " redacted [" + redacted + "]"
      + " legacyReleasability [" + legacyReleasability + "]"
      + " lastReviewBy [" + lastReviewBy + "]"
      + " state [" + state + "]"
      + " remarks [" + remarks + "]"
      + " approvedBy [" + approvedBy + "]"
      + " remarkRef [" + remarkRef + "]"
      + " extReferences [" + extReferences + "]"
      + " recommendedValue [" + recommendedValue + "]"
      + " description [" + description + "]"
      + " observedFirstDateTime [" + observedFirstDateTime + "]"
      + " idref [" + idref + "]"
      + " entryBy [" + entryBy + "]"
      + " lastReviewDate [" + lastReviewDate + "]"
      + " approvedDateTime [" + approvedDateTime + "]"
      + " securityClass [" + securityClass + "]"
      + " modAllowedBy [" + modAllowedBy + "]"
      + " cls [" + cls + "]"
      + " entryDateTime [" + entryDateTime + "]"
      + " lastChangeBy [" + lastChangeBy + "]"
      + " releasability [" + releasability + "]"
      + " caseNum [" + caseNum + "]"
      + " observedLastDateTime [" + observedLastDateTime + "]"
      + " quality [" + quality + "]"
      + " owner [" + owner + "]"
      + " lastObservedBy [" + lastObservedBy + "]"
      + " extReferenceRef [" + extReferenceRef + "]"
      + " serial [" + serial + "]"
      + " lastChangeDateTime [" + lastChangeDateTime + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Common} requires
   * {@link TCalendar EntryDateTime}, {@link TString Serial}, {@link ListCCL cls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEntryDateTime() && isSetSerial() && isSetCls();
  }

}
