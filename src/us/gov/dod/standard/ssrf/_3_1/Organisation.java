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

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * {@link Address}, {@link EMail Email}, {@link RelatedOrganisation}, {@link TelephoneFax}
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
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
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
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
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
   */
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  /**
   * AlternateName - Alternate Name (Optional)
   * <p>
   * An alternate name or nickname for the organisation.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  /**
   * AlternateName - Alternate Name (Optional)
   * <p>
   * An alternate name or nickname for the organisation.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "AlternateName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString alternateName;
  /**
   * Type - Type (Optional)
   * <p>
   * The type of relationship.
   * <p>
   * Format is L:CFT
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
   */
  @XmlElement(name = "UIC", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString uic;
  /**
   * Address (Optional)
   * <p>
   * Address contains the address of a Contact, Organisation or Role.
   */
  @XmlElement(name = "Address")
  private List<Address> address;
  /**
   * TelephoneFax (Optional)
   * <p>
   * TelephoneFax reflects the telephone and/or telefax number(s) of the
   * Contact, Organisation or Role.
   */
  @XmlElement(name = "TelephoneFax")
  private List<TelephoneFax> telephoneFax;
  /**
   * Email (Optional)
   * <p>
   * Email contains the email address of a Contact or Role.
   * <p>
   * Notes: Will add Organisation to text in next release
   */
  @XmlElement(name = "EMail")
  private List<EMail> eMail;
  /**
   * RoleRef (Optional)
   * <p>
   * RoleRef contains the serial of a referenced Role.
   */
  @XmlElement(name = "RoleRef", nillable = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private List<TString> roleRef;
  /**
   * RelatedOrganisation (Optional)
   * <p>
   * RelatedOrganisation identifies an Organisation linked to the current
   * Organisation, the type of relation (reporting, budget, etc) and the
   * relation (parent, child, sibling).
   */
  @XmlElement(name = "RelatedOrganisation")
  private List<RelatedOrganisation> relatedOrganisation;

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
   * Supportability datasets, this date indicate when the organisation
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
   * Supportability datasets, this date indicate when the organisation
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
   * Get an alternate name or nickname for the organisation.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set an alternate name or nickname for the organisation.
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
   * Get an alternate name or nickname for the organisation.
   * <p>
   * @return the AlternateName value in a {@link TString} data type
   */
  public TString getAlternateName() {
    return alternateName;
  }

  /**
   * Set an alternate name or nickname for the organisation.
   * <p>
   * @param value the AlternateName value in a {@link TString} data type
   */
  public void setAlternateName(TString value) {
    this.alternateName = value;
  }

  /**
   * Determine if the AlternateName is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAlternateName() {
    return (this.alternateName != null ? this.alternateName.isSetValue() : false);
  }

  /**
   * Get the type of relationship.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of relationship.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems.
   * <p>
   * @return the UIC value in a {@link TString} data type
   */
  public TString getUIC() {
    return uic;
  }

  /**
   * Set an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems.
   * <p>
   * @param value the UIC value in a {@link TString} data type
   */
  public void setUIC(TString value) {
    this.uic = value;
  }

  /**
   * Determine if the UIC is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUIC() {
    return (this.uic != null ? this.uic.isSetValue() : false);
  }

  /**
   * Get the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @return a non-null but possibly empty list of {@link Address} instances
   */
  public List<Address> getAddress() {
    if (address == null) {
      address = new ArrayList<>();
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
  public List<TelephoneFax> getTelephoneFax() {
    if (telephoneFax == null) {
      telephoneFax = new ArrayList<>();
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
   * Complex element Email contains the email address of a Contact or Role.
   * <p>
   * @return a non-null but possibly empty list of {@link EMail} instances
   */
  public List<EMail> getEMail() {
    if (eMail == null) {
      eMail = new ArrayList<>();
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
   * Get the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getRole()} instead.
   */
  @Deprecated
  public List<TString> getRoleRef() {
    if (roleRef == null) {
      roleRef = new ArrayList<>();
    }
    return this.roleRef;
  }

  /**
   * Determine if the RoleRef is configured.
   * <p>
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
   * the relation (parent, child, sibling).
   * <p>
   * @return a non-null but possibly empty list of {@link RelatedOrganisation}
   *         instances
   */
  public List<RelatedOrganisation> getRelatedOrganisation() {
    if (relatedOrganisation == null) {
      relatedOrganisation = new ArrayList<>();
    }
    return this.relatedOrganisation;
  }

  /**
   * Determine if the RelatedOrganisation is configured.
   * <p>
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
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Organisation object instance
   */
  public Organisation withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Organisation object instance
   */
  public Organisation withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
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
   * @param value An instances of type {@link Calendar}
   * @return The current Organisation object instance
   */
  public Organisation withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  /**
   * Set an alternate name or nickname for the organisation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Organisation object instance
   */
  public Organisation withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set an alternate name or nickname for the organisation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Organisation object instance
   */
  public Organisation withAlternateName(String value) {
    setAlternateName(new TString(value));
    return this;
  }

  /**
   * Set the type of relationship.
   * <p>
   * @param value An instances of type {@link ListCTO}
   * @return The current Organisation object instance
   */
  public Organisation withType(ListCTO value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Organisation object instance
   */
  public Organisation withUIC(String value) {
    setUIC(new TString(value));
    return this;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param values One or more instances of type {@link Address}
   * @return The current Organisation object instance
   */
  public Organisation withAddress(Address... values) {
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
   * @return The current Organisation object instance
   */
  public Organisation withAddress(Collection<Address> values) {
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
   * @return The current Organisation object instance
   */
  public Organisation withTelephoneFax(TelephoneFax... values) {
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
   * @return The current Organisation object instance
   */
  public Organisation withTelephoneFax(Collection<TelephoneFax> values) {
    if (values != null) {
      getTelephoneFax().addAll(values);
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of a Contact or Role.
   * <p>
   * @param values One or more instances of type {@link EMail}
   * @return The current Organisation object instance
   */
  public Organisation withEMail(EMail... values) {
    if (values != null) {
      getEMail().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of a Contact or Role.
   * <p>
   * @param values A collection of {@link EMail Email} instances
   * @return The current Organisation object instance
   */
  public Organisation withEMail(Collection<EMail> values) {
    if (values != null) {
      getEMail().addAll(values);
    }
    return this;
  }

  /**
   * Set the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current Organisation object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRole(Role...)} instead.
   */
  @Deprecated
  public Organisation withRoleRef(TString... values) {
    if (values != null) {
      getRoleRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Organisation object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withRole(Role...)} instead.
   */
  @Deprecated
  public Organisation withRoleRef(Collection<TString> values) {
    if (values != null) {
      getRoleRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the RelatedOrganisation
   * <p>
   * Complex element RelatedOrganisation identifies an Organisation linked to
   * the current Organisation, the type of relation (reporting, budget, etc) and
   * the relation (parent, child, sibling).
   * <p>
   * @param values One or more instances of type {@link RelatedOrganisation}
   * @return The current Organisation object instance
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
   * <p>
   * @param values A collection of {@link RelatedOrganisation} instances
   * @return The current Organisation object instance
   */
  public Organisation withRelatedOrganisation(Collection<RelatedOrganisation> values) {
    if (values != null) {
      getRelatedOrganisation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Organisation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Organisation {"
      + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
      + (address != null ? " address [" + address + "]" : "")
      + (name != null ? " name [" + name + "]" : "")
      + (eMail != null ? " eMail [" + eMail + "]" : "")
      + (relatedOrganisation != null ? " relatedOrganisation [" + relatedOrganisation + "]" : "")
      + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
      + (roleRef != null ? " roleRef [" + roleRef + "]" : "")
      + (telephoneFax != null ? " telephoneFax [" + telephoneFax + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
      + (uic != null ? " uic [" + uic + "]" : "")
      + (alternateName != null ? " alternateName [" + alternateName + "]" : "")
      + "\n  Organisation." + super.toString() + "\n"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Organisation} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * RoleRef (Optional)
   * <p>
   * RoleRef contains the serial of a referenced Role.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private List<Role> role;

  /**
   * Get the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public List<Role> getRole() {
    if (role == null) {
      role = new ArrayList<>();
    }
    return role;
  }

  /**
   * Determine if the role field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRole() {
    return this.role != null && !this.role.isEmpty();
  }

  /**
   * Set the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   * <p>
   * @param values An instances of type {@link Role}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withRole(Role... values) {
    return withRole(Arrays.asList(values));
  }

  /**
   * Set the RoleRef
   * <p>
   * Complex element RoleRef contains the serial of a referenced Role.
   * <p>
   * @param values An instances of type {@link Role}
   * @return The current Organisation object instance
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
   * <p>
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation build() {
    this.roleRef = new ArrayList<>();
    for (Role instance : getRole()) {
      this.roleRef.add(instance.getSerial());
    }
    return this;
  }//</editor-fold>

}
