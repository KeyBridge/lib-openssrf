/*
 * Copyright 2015 Key Bridge LLC.
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
import us.gov.dod.standard.ssrf._3_1.contact.Address;
import us.gov.dod.standard.ssrf._3_1.contact.EMail;
import us.gov.dod.standard.ssrf._3_1.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTO;
import us.gov.dod.standard.ssrf._3_1.organisation.RelatedOrganisation;

/**
 * Organisation is the XML root for all parameters of an Organisation (service,
 * agency, manufacturer, etc).
 * <p>
 * Sub-Elements are
 * {@link Address}, {@link EMail}, {@link RelatedOrganisation}, {@link TelephoneFax}
 * <p>
 * Example:
 * <pre>
 * &lt;Organisation cls="U"&gt;
 *   &lt;Serial cls="U"&gt;DEU:AF:OR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-12T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;LUFTWAFFE&lt;/Name&gt;
 *   &lt;Address&gt;
 *     &lt;CityArea cls="U"&gt;Berlin&lt;/CityArea&gt;
 *     &lt;Country cls="U"&gt;DEU&lt;/Country&gt;
 *   &lt;/Address&gt;
 * &lt;/Organisation&gt;
 * </pre>
 *
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation", propOrder = {
  "effectiveDate",
  "expirationDate",
  "reviewDate",
  "name",
  "alternateName",
  "type",
  "uic",
  "address",
  "telephoneFax",
  "eMail",
  "roleRef",
  "relatedOrganisation"
})
public class Organisation extends Common<Organisation> {

  /**
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   *
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
   *
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
   *
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  private D reviewDate;
  /**
   * AlternateName - Alternate Name (Optional)
   * <p>
   * An alternate name or nickname for the organisation.
   * <p>
   * Format is S100
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = false)
  private S100 name;
  /**
   * AlternateName - Alternate Name (Optional)
   * <p>
   * An alternate name or nickname for the organisation.
   * <p>
   * Format is S100
   *
   * @since 3.1.0
   */
  @XmlElement(name = "AlternateName", required = false)
  private S100 alternateName;
  /**
   * Type - Type (Optional)
   * <p>
   * The type of relationship.
   * <p>
   * Format is L:CFT
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * US:UIC - Unit Identification Code (Optional)
   * <p>
   * An organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems.
   * <p>
   * Format is S20
   *
   * @since 3.1.0
   */
  @XmlElement(name = "UIC", required = false)
  private S20 uic;
  /**
   * Address (Optional)
   * <p>
   * Address contains the address of a Contact, Organisation or Role.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Address")
  private Set<Address> address;
  /**
   * TelephoneFax (Optional)
   * <p>
   * TelephoneFax reflects the telephone and/or telefax number(s) of the
   * Contact, Organisation or Role.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "TelephoneFax")
  private Set<TelephoneFax> telephoneFax;
  /**
   * Email (Optional)
   * <p>
   * Email contains the email address of a Contact or Role.
   * <p>
   * Notes: Will add Organisation to text in next release
   *
   * @since 3.1.0
   */
  @XmlElement(name = "EMail")
  private Set<EMail> eMail;
  /**
   * RoleRef (Optional)
   * <p>
   * RoleRef contains the serial of a referenced Role.
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RoleRef", nillable = true)
  private Set<Serial> roleRef;
  /**
   * RelatedOrganisation (Optional)
   * <p>
   * RelatedOrganisation identifies an Organisation linked to the current
   * Organisation, the type of relation (reporting, budget, etc) and the
   * relation (parent, child, sibling).
   *
   * @since 3.1.0
   */
  @XmlElement(name = "RelatedOrganisation")
  private Set<RelatedOrganisation> relatedOrganisation;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public Organisation() {
    super();
  }

  /**
   * Get the date by which the dataset is to be operational or effective..
   *
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective..
   *
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setEffectiveDate(D value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   *
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   *
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setExpirationDate(D value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   *
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
   *
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
   *
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setReviewDate(D value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get an alternate name or nickname for the organisation..
   *
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getName() {
    return name;
  }

  /**
   * Set an alternate name or nickname for the organisation..
   *
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setName(S100 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get an alternate name or nickname for the organisation..
   *
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getAlternateName() {
    return alternateName;
  }

  /**
   * Set an alternate name or nickname for the organisation..
   *
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setAlternateName(S100 value) {
    this.alternateName = value;
  }

  /**
   * Determine if the AlternateName is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAlternateName() {
    return (this.alternateName != null ? this.alternateName.isSetValue() : false);
  }

  /**
   * Get the type of relationship..
   *
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of relationship..
   *
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems..
   *
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getUIC() {
    return uic;
  }

  /**
   * Set an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems..
   *
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setUIC(S20 value) {
    this.uic = value;
  }

  /**
   * Determine if the UIC is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUIC() {
    return (this.uic != null ? this.uic.isSetValue() : false);
  }

  /**
   * Get the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role..
   *
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
   *
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
   *
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
   *
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
   * Complex element Email contains the email address of a Contact or Role..
   *
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
   *
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
   * Get the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role..
   *
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getRole()} instead.
   */
  @Deprecated
  public Set<Serial> getRoleRef() {
    if (roleRef == null) {
      roleRef = new HashSet<>();
    }
    return this.roleRef;
  }

  /**
   * Determine if the RoleRef is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRoleRef() {
    return ((this.roleRef != null) && (!this.roleRef.isEmpty()));
  }

  /**
   * Clear the RoleRef field. This sets the field to null.
   */
  public void unsetRoleRef() {
    this.roleRef = null;
  }

  /**
   * Get the RelatedOrganisation
   * <p>
   * Complex element RelatedOrganisation identifies an Organisation linked to
   * the current Organisation, the type of relation (reporting, budget, etc) and
   * the relation (parent, child, sibling)..
   *
   * @return a {@link RelatedOrganisation} instance
   * @since 3.1.0
   */
  public Set<RelatedOrganisation> getRelatedOrganisation() {
    if (relatedOrganisation == null) {
      relatedOrganisation = new HashSet<>();
    }
    return this.relatedOrganisation;
  }

  /**
   * Determine if the RelatedOrganisation is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRelatedOrganisation() {
    return ((this.relatedOrganisation != null) && (!this.relatedOrganisation.isEmpty()));
  }

  /**
   * Clear the RelatedOrganisation field. This sets the field to null.
   */
  public void unsetRelatedOrganisation() {
    this.relatedOrganisation = null;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   *
   * @param value An instances of type {@link Calendar}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   *
   * @param value An instances of type {@link Date}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   *
   * @param value An instances of type {@link Calendar}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withExpirationDate(Calendar value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   *
   * @param value An instances of type {@link Date}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withExpirationDate(Date value) {
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
   *
   * @param value An instances of type {@link Calendar}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withReviewDate(Calendar value) {
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
   *
   * @param value An instances of type {@link Date}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withReviewDate(Date value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set an alternate name or nickname for the organisation.
   *
   * @param value An instances of type {@link String}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withName(String value) {
    setName(new S100(value));
    return this;
  }

  /**
   * Set an alternate name or nickname for the organisation.
   *
   * @param value An instances of type {@link String}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withAlternateName(String value) {
    setAlternateName(new S100(value));
    return this;
  }

  /**
   * Set the type of relationship.
   *
   * @param value An instances of type {@link ListCTO}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withType(ListCTO value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems.
   *
   * @param value An instances of type {@link String}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withUIC(String value) {
    setUIC(new S20(value));
    return this;
  }

  /**
   * Set the Address.
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   *
   * @param values One or more instances of type {@link Address}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withAddress(Address... values) {
    if (values != null) {
      getAddress().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Address.
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   *
   * @param values A collection of {@link Address} instances
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withAddress(Collection<Address> values) {
    if (values != null) {
      getAddress().addAll(values);
    }
    return this;
  }

  /**
   * Set the TelephoneFax.
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   *
   * @param values One or more instances of type {@link TelephoneFax}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withTelephoneFax(TelephoneFax... values) {
    if (values != null) {
      getTelephoneFax().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TelephoneFax.
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   *
   * @param values A collection of {@link TelephoneFax} instances
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withTelephoneFax(Collection<TelephoneFax> values) {
    if (values != null) {
      getTelephoneFax().addAll(values);
    }
    return this;
  }

  /**
   * Set the Email.
   * <p>
   * Complex element Email contains the email address of a Contact or Role.
   *
   * @param values One or more instances of type {@link EMail}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withEMail(EMail... values) {
    if (values != null) {
      getEMail().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Email.
   * <p>
   * Complex element Email contains the email address of a Contact or Role.
   *
   * @param values A collection of {@link EMail} instances
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withEMail(Collection<EMail> values) {
    if (values != null) {
      getEMail().addAll(values);
    }
    return this;
  }

  /**
   * Set the RoleRef.
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   *
   * @param values One or more instances of type {@link Serial}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRole(Role...)} instead.
   */
  @Deprecated
  public Organisation withRoleRef(Serial... values) {
    if (values != null) {
      getRoleRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RoleRef.
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   *
   * @param values A collection of {@link Serial} instances
   * @return The current Organisation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRole(Role...)} instead.
   */
  @Deprecated
  public Organisation withRoleRef(Collection<Serial> values) {
    if (values != null) {
      getRoleRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the RelatedOrganisation.
   * <p>
   * Complex element RelatedOrganisation identifies an Organisation linked to
   * the current Organisation, the type of relation (reporting, budget, etc) and
   * the relation (parent, child, sibling).
   *
   * @param values One or more instances of type {@link RelatedOrganisation}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withRelatedOrganisation(RelatedOrganisation... values) {
    if (values != null) {
      getRelatedOrganisation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RelatedOrganisation
   * <p>
   * Complex element RelatedOrganisation identifies an Organisation linked to
   * the current Organisation, the type of relation (reporting, budget, etc) and
   * the relation (parent, child, sibling).
   *
   * @param values A collection of {@link RelatedOrganisation} instances
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withRelatedOrganisation(Collection<RelatedOrganisation> values) {
    if (values != null) {
      getRelatedOrganisation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Organisation instance configuration.
   *
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Organisation {"
           + (address != null ? " address [" + address + "]" : "")
           + (alternateName != null ? " alternateName [" + alternateName + "]" : "")
           + (eMail != null ? " eMail [" + eMail + "]" : "")
           + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
           + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (relatedOrganisation != null ? " relatedOrganisation [" + relatedOrganisation + "]" : "")
           + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
           + (roleRef != null ? " roleRef [" + roleRef + "]" : "")
           + (telephoneFax != null ? " telephoneFax [" + telephoneFax + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + (uic != null ? " uic [" + uic + "]" : "")
           + super.toString();
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Organisation} requires
   * {@link ListCCL cls}, {@link Serial serial}, {@link DT entryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   *
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * RoleRef (Optional)
   * <p>
   * RoleRef contains the serial of a referenced Role.
   *
   * @since 3.1.0
   */
  @XmlTransient
  private Set<Role> role;

  /**
   * Get the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role..
   *
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Set<Role> getRole() {
    if (role == null) {
      role = new HashSet<>();
    }
    return role;
  }

  /**
   * Determine if the role field is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRole() {
    return this.role != null && !this.role.isEmpty();
  }

  /**
   * Set the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   *
   * @param values An instances of type {@link Role}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withRole(Role... values) {
    return withRole(Arrays.asList(values));
  }

  /**
   * Set the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   *
   * @param values An instances of type {@link Role}.
   * @return The current Organisation object instance.
   * @since 3.1.0
   */
  public Organisation withRole(Collection<Role> values) {
    getRole().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Organisation record.
   * <p>
   * This method builds the exported {@link #roleRef} field with values from the
   * transient {@link #role} field. This method should typically be called after
   * the Organisation is configured and (optionally) before exporting an SSRF
   * message.
   *
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.roleRef = new HashSet<>();
    for (Role instance : getRole()) {
      this.roleRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Organisation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #role} with values from the
   * imported {@link #roleRef} field. This method should typically be called
   * after the Organisation is imported from XML.
   *
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (roleRef == null || roleRef.isEmpty()) {
      return;
    }
    for (Role instance : root.getRole()) {
      if (roleRef.contains(instance.getSerial())) {
        getRole().add(instance);
      }
    }
  }//</editor-fold>

}
