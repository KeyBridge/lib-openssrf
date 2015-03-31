package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.contact.Address;
import us.gov.dod.standard.ssrf._3_1.contact.EMail;
import us.gov.dod.standard.ssrf._3_1.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Contact is the XML root for all parameters of a Contact.
 * <p>
 * Sub-Elements are {@link Address}, {@link Email}, {@link TelephoneFax}
 * <p>
 * Example:
 * <pre>
 * &lt;Contact cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA:AF:CN:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2004-05-20T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;FirstName cls="U"&gt;John&lt;/FirstName&gt;
 *   &lt;LastName cls="U"&gt;Doe&lt;/LastName&gt;
 *   &lt;TelephoneFax&gt;
 *     &lt;Number cls="U"&gt;(123)456.789&lt;/Number&gt;
 *   &lt;/TelephoneFax&gt;
 * &lt;/Contact&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "titleRank",
  "firstName",
  "lastName",
  "address",
  "telephoneFax",
  "eMail"
})
public class Contact extends Common<Contact> {

  /**
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = false)
  private D effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  private D expirationDate;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  private D reviewDate;
  /**
   * TitleRank - Title or Rank (Optional)
   * <p>
   * The contact title or rank e.g., Ms, Col, etc.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TitleRank", required = false)
  private S10 titleRank;
  /**
   * FirstName - First Name (Optional)
   * <p>
   * The first name of the contact individual.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FirstName", required = false)
  private S30 firstName;
  /**
   * LastName - Last Name (Optional)
   * <p>
   * The last name of the contact individual.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LastName", required = false)
  private S30 lastName;
  /**
   * Address (Optional)
   * <p>
   * Address contains the address of a Contact, Organisation or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Address")
  private Set<Address> address;
  /**
   * TelephoneFax (Optional)
   * <p>
   * TelephoneFax reflects the telephone and/or telefax number(s) of the
   * Contact, Organisation or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TelephoneFax")
  private Set<TelephoneFax> telephoneFax;
  /**
   * Email (Optional)
   * <p>
   * Email contains the email address of the Contact or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EMail")
  private Set<EMail> eMail;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public Contact() {
    super();
  }

  /**
   * Get the date by which the dataset is to be operational or effective..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setEffectiveDate(D value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setExpirationDate(D value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setReviewDate(D value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get the contact title or rank e.g., Ms, Col, etc..
   * <p>
   * @return a {@link S10} instance
   * @since 3.1.0
   */
  public S10 getTitleRank() {
    return titleRank;
  }

  /**
   * Set the contact title or rank e.g., Ms, Col, etc..
   * <p>
   * @param value a {@link S10} instance
   * @since 3.1.0
   */
  public void setTitleRank(S10 value) {
    this.titleRank = value;
  }

  /**
   * Determine if the TitleRank is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitleRank() {
    return (this.titleRank != null ? this.titleRank.isSetValue() : false);
  }

  /**
   * Get the first name of the contact individual..
   * <p>
   * @return a {@link S30} instance
   * @since 3.1.0
   */
  public S30 getFirstName() {
    return firstName;
  }

  /**
   * Set the first name of the contact individual..
   * <p>
   * @param value a {@link S30} instance
   * @since 3.1.0
   */
  public void setFirstName(S30 value) {
    this.firstName = value;
  }

  /**
   * Determine if the FirstName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFirstName() {
    return (this.firstName != null ? this.firstName.isSetValue() : false);
  }

  /**
   * Get the last name of the contact individual..
   * <p>
   * @return a {@link S30} instance
   * @since 3.1.0
   */
  public S30 getLastName() {
    return lastName;
  }

  /**
   * Set the last name of the contact individual..
   * <p>
   * @param value a {@link S30} instance
   * @since 3.1.0
   */
  public void setLastName(S30 value) {
    this.lastName = value;
  }

  /**
   * Determine if the LastName is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastName() {
    return (this.lastName != null ? this.lastName.isSetValue() : false);
  }

  /**
   * Get the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role..
   * <p>
   * @return a {@link Address} instance
   * @since 3.1.0
   */
  public Set<Address> getAddress() {
    if (address == null) {
      address = new HashSet<>();
    }
    return this.address;
  }

  /**
   * Determine if the Address is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAddress() {
    return ((this.address != null) && (!this.address.isEmpty()));
  }

  /**
   * Clear the Address field. This sets the field to null.
   */
  public void unsetAddress() {
    this.address = null;
  }

  /**
   * Get the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role..
   * <p>
   * @return a {@link TelephoneFax} instance
   * @since 3.1.0
   */
  public Set<TelephoneFax> getTelephoneFax() {
    if (telephoneFax == null) {
      telephoneFax = new HashSet<>();
    }
    return this.telephoneFax;
  }

  /**
   * Determine if the TelephoneFax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTelephoneFax() {
    return ((this.telephoneFax != null) && (!this.telephoneFax.isEmpty()));
  }

  /**
   * Clear the TelephoneFax field. This sets the field to null.
   */
  public void unsetTelephoneFax() {
    this.telephoneFax = null;
  }

  /**
   * Get the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role..
   * <p>
   * @return a {@link EMail} instance
   * @since 3.1.0
   */
  public Set<EMail> getEMail() {
    if (eMail == null) {
      eMail = new HashSet<>();
    }
    return this.eMail;
  }

  /**
   * Determine if the EMail is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEMail() {
    return ((this.eMail != null) && (!this.eMail.isEmpty()));
  }

  /**
   * Clear the EMail field. This sets the field to null.
   */
  public void unsetEMail() {
    this.eMail = null;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withExpirationDate(Calendar value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withExpirationDate(Date value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withReviewDate(Calendar value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withReviewDate(Date value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set the contact title or rank e.g., Ms, Col, etc.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withTitleRank(String value) {
    setTitleRank(new S10(value));
    return this;
  }

  /**
   * Set the first name of the contact individual.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withFirstName(String value) {
    setFirstName(new S30(value));
    return this;
  }

  /**
   * Set the last name of the contact individual.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withLastName(String value) {
    setLastName(new S30(value));
    return this;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param values One or more instances of type {@link Address...}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withAddress(Address... values) {
    if (values != null) {
      getAddress().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param values A collection of {@link Address} instances
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withAddress(Collection<Address> values) {
    if (values != null) {
      getAddress().addAll(values);
    }
    return this;
  }

  /**
   * Set the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @param values One or more instances of type {@link TelephoneFax...}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withTelephoneFax(TelephoneFax... values) {
    if (values != null) {
      getTelephoneFax().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @param values A collection of {@link TelephoneFax} instances
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withTelephoneFax(Collection<TelephoneFax> values) {
    if (values != null) {
      getTelephoneFax().addAll(values);
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @param values One or more instances of type {@link EMail...}.
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withEMail(EMail... values) {
    if (values != null) {
      getEMail().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @param values A collection of {@link EMail} instances
   * @return The current Contact object instance.
   * @since 3.1.0
   */
  public Contact withEMail(Collection<EMail> values) {
    if (values != null) {
      getEMail().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Contact instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Contact {"
           + (address != null ? "\n address [" + address + "]" : "")
           + (eMail != null ? "\n eMail [" + eMail + "]" : "")
           + (effectiveDate != null ? "\n effectiveDate [" + effectiveDate + "]" : "")
           + (expirationDate != null ? "\n expirationDate [" + expirationDate + "]" : "")
           + (firstName != null ? "\n firstName [" + firstName + "]" : "")
           + (lastName != null ? "\n lastName [" + lastName + "]" : "")
           + (reviewDate != null ? "\n reviewDate [" + reviewDate + "]" : "")
           + (telephoneFax != null ? "\n telephoneFax [" + telephoneFax + "]" : "")
           + (titleRank != null ? "\n titleRank [" + titleRank + "]" : "")
           + "}\n  Contact." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Contact} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
