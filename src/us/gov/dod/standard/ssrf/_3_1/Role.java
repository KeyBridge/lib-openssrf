/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.contact.Address;
import us.gov.dod.standard.ssrf._3_1.contact.EMail;
import us.gov.dod.standard.ssrf._3_1.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCY;

/**
 * Role is the XML root for all parameters of a Role (position or role
 * representing an organisational user of the system; also known as Job Account
 * in the USA).
 * <p>
 * Sub-Elements are {@link Address}, {@link EMail Email}, {@link TelephoneFax}
 * <p>
 * Example:
 * <pre>
 * &lt;Role cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA::JA:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-12T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;EUCOM FMFO&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;USA&lt;/Country&gt;
 *   &lt;ContactRef cls="U"&gt;USA:EU:CN:1&lt;/ContactRef&gt;
 * &lt;/Role&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "name",
  "country",
  "address",
  "telephoneFax",
  "eMail",
  "contactRef"
})
public class Role extends Common<Role> {

  /**
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   */
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * Name - Role Name (Required)
   * <p>
   * The name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "Name", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString name;
  /**
   * Country - Country (Optional)
   * <p>
   * The country to which the Role belongs. IMPORTANT NOTE: The Country is
   * Optional in order to accommodate legacy data; however it SHOULD be filled
   * in. The release of datasets to Roles is based upon matching nationalities;
   * therefore a Role without a Country will not be able to receive datasets
   * having a releasability caveat.
   * <p>
   * Format is L:CCY
   */
  @XmlElement(name = "Country", required = false)
  private TString country;
  /**
   * Address (Optional)
   * <p>
   * Address contains the address of a Contact, Organisation or Role.
   */
  @XmlElement(name = "Address")
  private Set<Address> address;
  /**
   * TelephoneFax (Optional)
   * <p>
   * TelephoneFax reflects the telephone and/or telefax number(s) of the
   * Contact, Organisation or Role.
   */
  @XmlElement(name = "TelephoneFax")
  private Set<TelephoneFax> telephoneFax;
  /**
   * Email (Optional)
   * <p>
   * Email contains the email address of the Contact or Role.
   */
  @XmlElement(name = "EMail")
  private Set<EMail> eMail;
  /**
   * ContactRef (Optional)
   * <p>
   * ContactRef references a Contact.
   */
  @XmlElement(name = "ContactRef", nillable = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterSERIAL.class)
  private Set<TString> contactRef;

  /**
   * Get the date by which the dataset is to be operational or effective.
   * <p>
   * @return the EffectiveDate value in a {@link TCalendar} data type
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value the EffectiveDate value in a {@link TCalendar} data type
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @return the ExpirationDate value in a {@link TCalendar} data type
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value the ExpirationDate value in a {@link TCalendar} data type
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @return the ReviewDate value in a {@link TCalendar} data type
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value the ReviewDate value in a {@link TCalendar} data type
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get the name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set the name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get the country to which the Role belongs. IMPORTANT NOTE: The Country is
   * Optional in order to accommodate legacy data; however it SHOULD be filled
   * in. The release of datasets to Roles is based upon matching nationalities;
   * therefore a Role without a Country will not be able to receive datasets
   * having a releasability caveat.
   * <p>
   * @return the Country value in a {@link TString} data type
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Set the country to which the Role belongs. IMPORTANT NOTE: The Country is
   * Optional in order to accommodate legacy data; however it SHOULD be filled
   * in. The release of datasets to Roles is based upon matching nationalities;
   * therefore a Role without a Country will not be able to receive datasets
   * having a releasability caveat.
   * <p>
   * @param value the Country value in a {@link TString} data type
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  /**
   * Determine if the Country is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCountry() {
    return (this.country != null ? this.country.isSetValue() : false);
  }

  /**
   * Get the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @return a non-null but possibly empty list of {@link Address} instances
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
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @return a non-null but possibly empty list of {@link TelephoneFax}
   *         instances
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
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @return a non-null but possibly empty list of {@link EMail} instances
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
   * Get the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getContact()} instead.
   */
  @Deprecated
  public Set<TString> getContactRef() {
    if (contactRef == null) {
      contactRef = new HashSet<>();
    }
    return this.contactRef;
  }

  /**
   * Determine if the ContactRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetContactRef() {
    return ((this.contactRef != null) && (!this.contactRef.isEmpty()));
  }

  /**
   * Clear the ContactRef field. This sets the field to null.
   */
  public void unsetContactRef() {
    this.contactRef = null;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Role object instance
   */
  public Role withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Role object instance
   */
  public Role withEffectiveDate(Date value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Role object instance
   */
  public Role withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Role object instance
   */
  public Role withExpirationDate(Date value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Role object instance
   */
  public Role withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Role object instance
   */
  public Role withReviewDate(Date value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Role object instance
   */
  public Role withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set the country to which the Role belongs. IMPORTANT NOTE: The Country is
   * Optional in order to accommodate legacy data; however it SHOULD be filled
   * in. The release of datasets to Roles is based upon matching nationalities;
   * therefore a Role without a Country will not be able to receive datasets
   * having a releasability caveat.
   * <p>
   * @param value An instances of type {@link ListCCY}
   * @return The current Role object instance
   */
  public Role withCountry(ListCCY value) {
    setCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param values One or more instances of type {@link Address}
   * @return The current Role object instance
   */
  public Role withAddress(Address... values) {
    if (values != null) {
      getAddress().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current Role object instance
   */
  public Role withAddress(Set<Address> values) {
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
   * @param values One or more instances of type {@link TelephoneFax}
   * @return The current Role object instance
   */
  public Role withTelephoneFax(TelephoneFax... values) {
    if (values != null) {
      getTelephoneFax().addAll(new HashSet<>(Arrays.asList(values)));
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
   * @return The current Role object instance
   */
  public Role withTelephoneFax(Set<TelephoneFax> values) {
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
   * @param values One or more instances of type {@link EMail}
   * @return The current Role object instance
   */
  public Role withEMail(EMail... values) {
    if (values != null) {
      getEMail().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @param values A collection of {@link EMail Email} instances
   * @return The current Role object instance
   */
  public Role withEMail(Set<EMail> values) {
    if (values != null) {
      getEMail().addAll(values);
    }
    return this;
  }

  /**
   * Set the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current Role object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withContact(Contact...)} instead.
   */
  @Deprecated
  public Role withContactRef(TString... values) {
    if (values != null) {
      getContactRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Role object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withContact(Contact...)} instead.
   */
  @Deprecated
  public Role withContactRef(Set<TString> values) {
    if (values != null) {
      getContactRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Role instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Role {"
      + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
      + (contactRef != null ? " contactRef [" + contactRef + "]" : "")
      + (address != null ? " address [" + address + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (eMail != null ? " eMail [" + eMail + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (telephoneFax != null ? " telephoneFax [" + telephoneFax + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + (country != null ? " country [" + country + "]" : "")
      + "\n  Role." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Role} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link TString Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetName();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * ContactRef (Optional)
   * <p>
   * ContactRef references a Contact.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Set<Contact> contact;

  /**
   * Get the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @return a {@link Contact} instance
   * @since 3.1.0
   */
  public Set<Contact> getContact() {
    if (contact == null) {
      contact = new HashSet<>();
    }
    return contact;
  }

  /**
   * Determine if the contact field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetContact() {
    return this.contact != null && !this.contact.isEmpty();
  }

  /**
   * Set the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @param values An instances of type {@link Contact}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withContact(Contact... values) {
    return withContact(new HashSet<>(Arrays.asList(values)));
  }

  /**
   * Set the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @param values An instances of type {@link Contact}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withContact(Set<Contact> values) {
    getContact().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Role record.
   * <p>
   * This method builds the exported {@link #contactRef} field with values from
   * the transient {@link #contact} field. This method should typically be
   * called after the Role is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.contactRef = new HashSet<>();
    for (Contact instance : getContact()) {
      this.contactRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Role record after loading from
   * XML.
   * <p>
   * This method builds the transient {@link #contact} with values from the
   * imported {@link #contactRef} field. This method should typically be called
   * after the Role is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (contactRef == null || contactRef.isEmpty()) {
      return;
    }
    for (Contact instance : root.getContact()) {
      if (contactRef.contains(instance.getSerial())) {
        contact.add(instance);
      }
    }
  }//</editor-fold>

}
