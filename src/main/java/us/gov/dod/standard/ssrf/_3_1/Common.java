package us.gov.dod.standard.ssrf._3_1;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/27/2015
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
public abstract class Common<T> implements Comparable<T> {

  /**
   * US:LastObservedBy - Last Observed By (Optional)
   * <p>
   * The identifier of the person or entity who last observed this Dataset.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastObservedBy", required = false)
  private S50 lastObservedBy;
  /**
   * US:ObservedFirstDateTime - Initial Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was first collected.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedFirstDateTime", required = false)
  private DT observedFirstDateTime;
  /**
   * US:ObservedLastDateTime - Last Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was last collected.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ObservedLastDateTime", required = false)
  private DT observedLastDateTime;
  /**
   * US:ApprovedBy - Last Approval Person (Optional)
   * <p>
   * The identifier of the designated expert who last approved or accepted the
   * dataset.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ApprovedBy", required = false)
  private S50 approvedBy;
  /**
   * US:ApprovedDateTime - Last Approval Timestamp (Optional)
   * <p>
   * The last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ApprovedDateTime", required = false)
  private DT approvedDateTime;
  /**
   * In Data Item Redacted (US), indicate if any original, or authoritative,
   * data was omitted. Supports datasets which have some data withheld by the
   * submitting agency.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Redacted", required = false)
  private TString redacted;
  /**
   * Serial - Serial (Required)
   * <p>
   * A unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Serial", required = true)
  private Serial serial;
  /**
   * EntryDateTime - Entry Date/Time (Required)
   * <p>
   * The date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EntryDateTime", required = true)
  private DT entryDateTime;
  /**
   * EntryBy - Creator Role (Optional)
   * <p>
   * The serial of the Role which is creating the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EntryBy", required = false)
  private Serial entryBy;
  /**
   * Owner - Role which Owns the Dataset (Optional)
   * <p>
   * The serial of the Role which is responsible for the accuracy of the data
   * content.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Owner", required = false)
  private Serial owner;
  /**
   * LastChangeDateTime - Latest Modification Date/Time (Optional)
   * <p>
   * The date and UTC Time the dataset was last modified.
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group LastChange (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastChangeDateTime", required = false)
  private DT lastChangeDateTime;
  /**
   * LastChangeBy - Last Modifier Role (Optional)
   * <p>
   * The serial of the Role which last modified the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastChange (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastChangeBy", required = false)
  private Serial lastChangeBy;
  /**
   * LastReviewDate - Last Review Date (Optional)
   * <p>
   * The last date that the dataset was reviewed.
   * <p>
   * Format is Date
   * <p>
   * Attribute group LastReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastReviewDate", required = false)
  private D lastReviewDate;
  /**
   * LastReviewBy - Last Review Person RoleRef (Optional)
   * <p>
   * The Role reference serial of the person who last reviewed the dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastReviewBy", required = false)
  private Serial lastReviewBy;
  /**
   * ModAllowedBy - Role Allowed to Modify (Optional)
   * <p>
   * The serial of the Role which is authorised to modify the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Divergence from SMADEF: Automated changes using ModAllowedBy are not
   * permitted for use by USA systems.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ModAllowedBy", required = false)
  private Serial modAllowedBy;
  /**
   * State - Dataset Status (Optional)
   * <p>
   * The state of the dataset.
   * <p>
   * Format is L:CSU
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "State", required = false)
  private TString state;
  /**
   * Description - General Dataset Description (Optional)
   * <p>
   * A general description of the Dataset that is inheriting Common.
   * <p>
   * Format is S500
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private S500 description;
  /**
   * US:SecurityClass (Optional)
   * <p>
   * SecurityClass (US) contains the security classification from one or more
   * data information sources.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SecurityClass")
  private SecurityClass securityClass;
  /**
   * CaseNum (Optional)
   * <p>
   * CaseNum provides the capability to store multiple identifiers for a
   * Dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CaseNum")
  private Set<CaseNum> caseNum;
  /**
   * ExtReferenceRef (Optional)
   * <p>
   * ExtReferenceRef refers to an external reference defined in a dataset
   * ExternalReference.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExtReferenceRef", nillable = true)
  private Set<ExtReferenceRef> extReferenceRef;
  /**
   * remarks - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Remarks", nillable = true)
  private Set<Remarks> remarks;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlList
  @XmlAttribute(name = "releasability")
  private Set<ListCCY> releasability;
  /**
   * remarks - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlList
  @XmlAttribute(name = "remarks")
  private Set<BigInteger> remarkRef;
  /**
   * extReferences - Links to External References (Optional)
   * <p>
   * A list of Conmmon/ExtReferenceRef idx values applicable to the current data
   * item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlList
  @XmlAttribute(name = "extReferences")
  private Set<BigInteger> extReferences;
  /**
   * US:legacyReleasability - Legacy Releasability (Optional)
   * <p>
   * One or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "quality")
  private String quality;
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idref")
  private String idref;

  /**
   * Get the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @return the LastObservedBy value in a {@link TS50} data type
   * @since 3.1.0
   */
  public S50 getLastObservedBy() {
    return lastObservedBy;
  }

  /**
   * Set the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @param value the LastObservedBy value in a {@link TS50} data type
   * @since 3.1.0
   */
  public void setLastObservedBy(S50 value) {
    this.lastObservedBy = value;
  }

  /**
   * Determine if the LastObservedBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastObservedBy() {
    return (this.lastObservedBy != null);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @return the ObservedFirstDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public DT getObservedFirstDateTime() {
    return observedFirstDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value the ObservedFirstDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public void setObservedFirstDateTime(DT value) {
    this.observedFirstDateTime = value;
  }

  /**
   * Determine if the ObservedFirstDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedFirstDateTime() {
    return (this.observedFirstDateTime != null);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @return the ObservedLastDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public DT getObservedLastDateTime() {
    return observedLastDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value the ObservedLastDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public void setObservedLastDateTime(DT value) {
    this.observedLastDateTime = value;
  }

  /**
   * Determine if the ObservedLastDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedLastDateTime() {
    return (this.observedLastDateTime != null);
  }

  /**
   * Get the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @return the ApprovedBy value in a {@link TS50} data type
   * @since 3.1.0
   */
  public S50 getApprovedBy() {
    return approvedBy;
  }

  /**
   * Set the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @param value the ApprovedBy value in a {@link TS50} data type
   * @since 3.1.0
   */
  public void setApprovedBy(S50 value) {
    this.approvedBy = value;
  }

  /**
   * Determine if the ApprovedBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovedBy() {
    return (this.approvedBy != null);
  }

  /**
   * Get the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @return the ApprovedDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public DT getApprovedDateTime() {
    return approvedDateTime;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value the ApprovedDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public void setApprovedDateTime(DT value) {
    this.approvedDateTime = value;
  }

  /**
   * Determine if the ApprovedDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovedDateTime() {
    return (this.approvedDateTime != null);
  }

  /**
   * Get In Data Item Redacted (US), indicate if any original, or authoritative,
   * data was omitted. Supports datasets which have some data withheld by the
   * submitting agency.
   * <p>
   * @return the Redacted value in a {@link TString} data type
   * @since 3.1.0
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
   * @since 3.1.0
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
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @return the Serial value in a {@link Serial} data type
   * @since 3.1.0
   */
  public Serial getSerial() {
    return serial;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @param value the Serial value in a {@link Serial} data type
   * @since 3.1.0
   */
  public void setSerial(Serial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Get the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @return the EntryDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public DT getEntryDateTime() {
    return entryDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value the EntryDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public void setEntryDateTime(DT value) {
    this.entryDateTime = value;
  }

  /**
   * Determine if the EntryDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryDateTime() {
    return (this.entryDateTime != null);
  }

  /**
   * Get the serial of the Role which is creating the current dataset.
   * <p>
   * @return the EntryBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getEntryByRole()} instead.
   */
  @Deprecated
  public Serial getEntryBy() {
    return entryBy;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value the EntryBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setEntryByRole(Role)} instead.
   */
  @Deprecated
  public void setEntryBy(Serial value) {
    this.entryBy = value;
  }

  /**
   * Determine if the EntryBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryBy() {
    return (this.entryBy != null);
  }

  /**
   * Get the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @return the Owner value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getOwnerRole()} instead.
   */
  @Deprecated
  public Serial getOwner() {
    return owner;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value the Owner value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setOwnerRole(Role)} instead.
   */
  @Deprecated
  public void setOwner(Serial value) {
    this.owner = value;
  }

  /**
   * Determine if the Owner is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwner() {
    return (this.owner != null);
  }

  /**
   * Get the date and UTC Time the dataset was last modified.
   * <p>
   * @return the LastChangeDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public DT getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value the LastChangeDateTime value in a {@link DT} data type
   * @since 3.1.0
   */
  public void setLastChangeDateTime(DT value) {
    this.lastChangeDateTime = value;
  }

  /**
   * Determine if the LastChangeDateTime is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeDateTime() {
    return (this.lastChangeDateTime != null);
  }

  /**
   * Get the serial of the Role which last modified the current dataset.
   * <p>
   * @return the LastChangeBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLastChangeByRole()} instead.
   */
  @Deprecated
  public Serial getLastChangeBy() {
    return lastChangeBy;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value the LastChangeBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLastChangeByRole(Role)} instead.
   */
  @Deprecated
  public void setLastChangeBy(Serial value) {
    this.lastChangeBy = value;
  }

  /**
   * Determine if the LastChangeBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeBy() {
    return (this.lastChangeBy != null);
  }

  /**
   * Get the last date that the dataset was reviewed.
   * <p>
   * @return the LastReviewDate value in a {@link D} data type
   * @since 3.1.0
   */
  public D getLastReviewDate() {
    return lastReviewDate;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value the LastReviewDate value in a {@link D} data type
   * @since 3.1.0
   */
  public void setLastReviewDate(D value) {
    this.lastReviewDate = value;
  }

  /**
   * Determine if the LastReviewDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewDate() {
    return (this.lastReviewDate != null);
  }

  /**
   * Get the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @return the LastReviewBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLastReviewByRole()} instead.
   */
  @Deprecated
  public Serial getLastReviewBy() {
    return lastReviewBy;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value the LastReviewBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLastReviewByRole(Role)} instead.
   */
  @Deprecated
  public void setLastReviewBy(Serial value) {
    this.lastReviewBy = value;
  }

  /**
   * Determine if the LastReviewBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewBy() {
    return (this.lastReviewBy != null);
  }

  /**
   * Get the serial of the Role which is authorised to modify the current
   * dataset.
   * <p>
   * @return the ModAllowedBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getModAllowedByRole()} instead.
   */
  @Deprecated
  public Serial getModAllowedBy() {
    return modAllowedBy;
  }

  /**
   * Set the serial of the Role which is authorised to modify the current
   * dataset.
   * <p>
   * @param value the ModAllowedBy value in a {@link Serial} data type
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setModAllowedByRole(Role)} instead.
   */
  @Deprecated
  public void setModAllowedBy(Serial value) {
    this.modAllowedBy = value;
  }

  /**
   * Determine if the ModAllowedBy is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModAllowedBy() {
    return (this.modAllowedBy != null);
  }

  /**
   * Get the state of the dataset.
   * <p>
   * @return the State value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getState() {
    return state;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value the State value in a {@link TString} data type
   * @since 3.1.0
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
   * @return the Description value in a {@link TS500} data type
   * @since 3.1.0
   */
  public S500 getDescription() {
    return description;
  }

  /**
   * Set a general description of the Dataset that is inheriting Common.
   * <p>
   * @param value the Description value in a {@link TS500} data type
   * @since 3.1.0
   */
  public void setDescription(S500 value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Get the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @return a {@link SecurityClass} instance
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @return a {@link CaseNum} instance
   * @since 3.1.0
   */
  public Set<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new HashSet<CaseNum>();
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
   * @return a {@link ExtReferenceRef} instance
   * @since 3.1.0
   */
  public Set<ExtReferenceRef> getExtReferenceRef() {
    if (extReferenceRef == null) {
      extReferenceRef = new HashSet<ExtReferenceRef>();
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
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a {@link Remarks} instance
   * @since 3.1.0
   */
  public Set<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new HashSet<Remarks>();
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
   * @since 3.1.0
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link ListCCL} instance
   * @since 3.1.0
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
   * @return a {@link ListCCY} instance
   * @since 3.1.0
   */
  public Set<ListCCY> getReleasability() {
    if (releasability == null) {
      releasability = new HashSet<ListCCY>();
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
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public Set<BigInteger> getRemarkRef() {
    if (remarkRef == null) {
      remarkRef = new HashSet<BigInteger>();
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
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public Set<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new HashSet<BigInteger>();
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
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withLastObservedBy(String value) {
    setLastObservedBy(new S50(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withObservedFirstDateTime(Calendar value) {
    setObservedFirstDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withObservedFirstDateTime(Date value) {
    setObservedFirstDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withObservedLastDateTime(Calendar value) {
    setObservedLastDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withObservedLastDateTime(Date value) {
    setObservedLastDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withApprovedBy(String value) {
    setApprovedBy(new S50(value));
    return (T) this;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withApprovedDateTime(Calendar value) {
    setApprovedDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withApprovedDateTime(Date value) {
    setApprovedDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set In Data Item Redacted (US), indicate if any original, or authoritative,
   * data was omitted. Supports datasets which have some data withheld by the
   * submitting agency.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withRedacted(ListCBO value) {
    setRedacted(new TString(value.value()));
    return (T) this;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @param value An instances of type {@link Serial}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withSerial(Serial value) {
    setSerial(value);
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link DT}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withEntryDateTime(DT value) {
    return (T) this;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value An instances of type {@link Serial}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withEntryByRole(Role)} instead.
   */
  @Deprecated
  public T withEntryBy(Serial value) {
    setEntryBy(value);
    return (T) this;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value An instances of type {@link Serial}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withOwnerRole(Role)} instead.
   */
  @Deprecated
  public T withOwner(Serial value) {
    setOwner(value);
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastChangeDateTime(Calendar value) {
    setLastChangeDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastChangeDateTime(Date value) {
    setLastChangeDateTime(new DT(value));
    return (T) this;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value An instances of type {@link Serial}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLastChangeByRole(Role)} instead.
   */
  @Deprecated
  public T withLastChangeBy(Serial value) {
    setLastChangeBy(value);
    return (T) this;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastReviewDate(Calendar value) {
    setLastReviewDate(new D(value));
    return (T) this;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastReviewDate(Date value) {
    setLastReviewDate(new D(value));
    return (T) this;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value An instances of type {@link Serial}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLastReviewByRole(Role)} instead.
   */
  @Deprecated
  public T withLastReviewBy(Serial value) {
    setLastReviewBy(value);
    return (T) this;
  }

  /**
   * Set the serial of the Role which is authorised to modify the current
   * dataset.
   * <p>
   * @param value An instances of type {@link Serial}
   * @return The current Common object instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withModAllowedByRole(Role)} instead.
   */
  @Deprecated
  public T withModAllowedBy(Serial value) {
    setModAllowedBy(value);
    return (T) this;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value An instances of type {@link ListCSU}
   * @return The current Common object instance
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withDescription(String value) {
    setDescription(new S500(value));
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withCaseNum(CaseNum... values) {
    if (values != null) {
      for (CaseNum value : values) {
        getCaseNum().add(value);
      }
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withExtReferenceRef(ExtReferenceRef... values) {
    if (values != null) {
      for (ExtReferenceRef value : values) {
        getExtReferenceRef().add(value);
      }
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withRemarks(Remarks... values) {
    if (values != null) {
      for (Remarks value : values) {
        getRemarks().add(value);
      }
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link Remarks} instances
   * @return The current Common object instance
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withReleasability(ListCCY... values) {
    if (values != null) {
      for (ListCCY value : values) {
        getReleasability().add(value);
      }
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withRemarkRef(BigInteger... values) {
    if (values != null) {
      for (BigInteger value : values) {
        getRemarkRef().add(value);
      }
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RemarkRef} instances
   * @return The current Common object instance
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
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
   * @since 3.1.0
   */
  public T withLegacyReleasability(String value) {
    setLegacyReleasability(value);
    return (T) this;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withQuality(String value) {
    setQuality(value);
    return (T) this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withRecommendedValue(String value) {
    setRecommendedValue(value);
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
   * @since 3.1.0
   */
  public T withIdref(String value) {
    setIdref(value);
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
           + (approvedBy != null ? " approvedBy [" + approvedBy + "]" : "")
           + (approvedDateTime != null ? " approvedDateTime [" + approvedDateTime + "]" : "")
           + (caseNum != null ? " caseNum [" + caseNum + "]" : "")
           + (cls != null ? " cls [" + cls + "]" : "")
           + (description != null ? " description [" + description + "]" : "")
           + (entryBy != null ? " entryBy [" + entryBy + "]" : "")
           + (entryDateTime != null ? " entryDateTime [" + entryDateTime + "]" : "")
           + (extReferenceRef != null ? " extReferenceRef [" + extReferenceRef + "]" : "")
           + (extReferences != null ? " extReferences [" + extReferences + "]" : "")
           + (idref != null ? " idref [" + idref + "]" : "")
           + (lastChangeBy != null ? " lastChangeBy [" + lastChangeBy + "]" : "")
           + (lastChangeDateTime != null ? " lastChangeDateTime [" + lastChangeDateTime + "]" : "")
           + (lastObservedBy != null ? " lastObservedBy [" + lastObservedBy + "]" : "")
           + (lastReviewBy != null ? " lastReviewBy [" + lastReviewBy + "]" : "")
           + (lastReviewDate != null ? " lastReviewDate [" + lastReviewDate + "]" : "")
           + (legacyReleasability != null ? " legacyReleasability [" + legacyReleasability + "]" : "")
           + (modAllowedBy != null ? " modAllowedBy [" + modAllowedBy + "]" : "")
           + (observedFirstDateTime != null ? " observedFirstDateTime [" + observedFirstDateTime + "]" : "")
           + (observedLastDateTime != null ? " observedLastDateTime [" + observedLastDateTime + "]" : "")
           + (owner != null ? " owner [" + owner + "]" : "")
           + (quality != null ? " quality [" + quality + "]" : "")
           + (recommendedValue != null ? " recommendedValue [" + recommendedValue + "]" : "")
           + (redacted != null ? " redacted [" + redacted + "]" : "")
           + (releasability != null ? " releasability [" + releasability + "]" : "")
           + (remarkRef != null ? " remarkRef [" + remarkRef + "]" : "")
           + (remarks != null ? " remarks [" + remarks + "]" : "")
           + (securityClass != null ? " securityClass [" + securityClass + "]" : "")
           + (serial != null ? " serial [" + serial + "]" : "")
           + (state != null ? " state [" + state + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Common} requires
   * {@link TDateTime EntryDateTime}, {@link TString Serial}, {@link ListCCL cls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEntryDateTime() && isSetSerial() && isSetCls();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * EntryBy - Creator Role (Optional)
   * <p>
   * The serial of the Role which is creating the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role entryByRole;
  /**
   * Owner - Role which Owns the Dataset (Optional)
   * <p>
   * The serial of the Role which is responsible for the accuracy of the data
   * content.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role ownerRole;
  /**
   * LastChangeBy - Last Modifier Role (Optional)
   * <p>
   * The serial of the Role which last modified the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastChange (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role lastChangeByRole;
  /**
   * LastReviewBy - Last Review Person RoleRef (Optional)
   * <p>
   * The Role reference serial of the person who last reviewed the dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role lastReviewByRole;

  /**
   * ModAllowedBy - Role Allowed to Modify (Optional)
   * <p>
   * The serial of the Role which is authorized to modify the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Divergence from SMADEF: Automated changes using ModAllowedBy are not
   * permitted for use by USA systems.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role modAllowedByRole;

  /**
   * Get the serial of the Role which is creating the current dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getEntryByRole() {
    return entryByRole;
  }

  /**
   * Determine if the entryByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryByRole() {
    return this.entryByRole != null;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withEntryByRole(Role value) {
    this.entryByRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getOwnerRole() {
    return ownerRole;
  }

  /**
   * Determine if the ownerRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwnerRole() {
    return this.ownerRole != null;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withOwnerRole(Role value) {
    this.ownerRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which last modified the current dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getLastChangeByRole() {
    return lastChangeByRole;
  }

  /**
   * Determine if the lastChangeByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeByRole() {
    return this.lastChangeByRole != null;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastChangeByRole(Role value) {
    this.lastChangeByRole = value;
    return (T) this;
  }

  /**
   * Get the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getLastReviewByRole() {
    return lastReviewByRole;
  }

  /**
   * Determine if the lastReviewByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewByRole() {
    return this.lastReviewByRole != null;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastReviewByRole(Role value) {
    this.lastReviewByRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which is authorized to modify the current
   * dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getModAllowedByRole() {
    return modAllowedByRole;
  }

  /**
   * Determine if the modAllowedByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModAllowedByRole() {
    return this.modAllowedByRole != null;
  }

  /**
   * Set the serial of the Role which is authorized to modify the current
   * dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withModAllowedByRole(Role value) {
    this.modAllowedByRole = value;
    return (T) this;
  }

  /**
   * Update the SSRF data type references in this Common record.
   * <p>
   * This method builds Common exported fields with values from their respective
   * transient object instance fields.:<br/> {@link #entryBy} from
   * {@link #entryByRole} <br/> {@link #owner} from {@link #ownerRole} <br/>
   * {@link #lastChangeBy} from {@link #lastChangeByRole} <br/>
   * {@link #lastReviewBy} from {@link #lastReviewByRole} <br/>
   * {@link #modAllowedBy} from {@link #modAllowedByRole}
   * <p>
   * This method should typically be called after the Common is configured and
   * (optionally) before exporting an SSRF message.
   */
  public void prepare() {
    this.entryBy = entryByRole != null ? entryByRole.getSerial() : null;
    this.owner = ownerRole != null ? ownerRole.getSerial() : null;
    this.lastChangeBy = lastChangeByRole != null ? lastChangeByRole.getSerial() : null;
    this.lastReviewBy = lastReviewByRole != null ? lastReviewByRole.getSerial() : null;
    this.modAllowedBy = modAllowedByRole != null ? modAllowedByRole.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this Common record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #entryByRole} with values from the
   * imported {@link #entryBy} field. This method should typically be called
   * after the Common is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (entryBy != null && entryBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (entryBy.equals(instance.getSerial())) {
          entryByRole = instance;
          return;
        }
      }
    }
    if (owner != null && owner.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (owner.equals(instance.getSerial())) {
          ownerRole = instance;
          return;
        }
      }
    }
    if (lastChangeBy != null && lastChangeBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (lastChangeBy.equals(instance.getSerial())) {
          lastChangeByRole = instance;
          return;
        }
      }
    }
    if (lastReviewBy != null && lastReviewBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (lastReviewBy.equals(instance.getSerial())) {
          lastReviewByRole = instance;
          return;
        }
      }
    }
    if (modAllowedBy != null && modAllowedBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (modAllowedBy.equals(instance.getSerial())) {
          modAllowedByRole = instance;
          return;
        }
      }
    }
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the object serial number.
   * <p>
   * @return A unique hash code for this object instance.
   */
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 67 * hash + Objects.hashCode(this.serial);
    return hash;
  }

  /**
   * Equality is based upon the object serial number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are of the same class and their serial numbers
   *         match
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.serial, ((Common<?>) obj).getSerial());
  }

  /**
   * Comparison is based alphabetically by class type, reverse chronologically
   * by entry date/time, then finally by alphabetically by the (semi-random)
   * serial number.
   * <p>
   * @param o the other object instance to sort
   * @return alphabetical sort order
   */
  @Override
  public int compareTo(Object o) {
    if (o == null) {
      return 1;
    }
    if (this.getClass().equals(o.getClass())) {
      if (this.getEntryDateTime().equals(((Common<T>) o).getEntryDateTime())) {
        /**
         * If the classes are equal and have the same time stamp then sort by
         * serial number. Note that this is semi-random.
         */
        return this.serial.compareTo(((Common<T>) o).getSerial());
      }
      /**
       * Sort reverse chronologically.
       */
      return this.getEntryDateTime().compareTo(((Common<T>) o).getEntryDateTime());
    }
    /**
     * Sort based upon the class name.
     */
    return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
  }//</editor-fold>
}
