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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.contact.Address;
import us.gov.dod.standard.ssrf._3_0.contact.EMail;
import us.gov.dod.standard.ssrf._3_0.contact.RelatedOrganisation;
import us.gov.dod.standard.ssrf._3_0.contact.TelephoneFax;
import us.gov.dod.standard.ssrf._3_0.metadata.RoleRef;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCY;

/**
 * Java class for Organisation complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="Organisation"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview" minOccurs="0"/>
 * &lt;element name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"
 * minOccurs="0"/> &lt;element name="AlternateName"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/> &lt;element
 * name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 * &lt;element name="UIC" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20"
 * minOccurs="0"/> &lt;element name="Address"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Address" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="TelephoneFax"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TelephoneFax" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="EMail"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}EMail" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="RoleRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RoleRef" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="RelatedOrganisation"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}RelatedOrganisation"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/extension>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
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

  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "Name", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  @XmlElement(name = "AlternateName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString alternateName;
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString type;
  @XmlElement(name = "UIC", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString uic;
  @XmlElement(name = "Address")
  private List<Address> address;
  @XmlElement(name = "TelephoneFax")
  private List<TelephoneFax> telephoneFax;
  @XmlElement(name = "EMail")
  private List<EMail> eMail;
  @XmlElement(name = "RoleRef", nillable = true)
  private List<RoleRef> roleRef;
  @XmlElement(name = "RelatedOrganisation")
  private List<RelatedOrganisation> relatedOrganisation;

  public Organisation(ListCCY snCountry, String snOrganization, String snSerial, Calendar entryDateTime) {
    super(snCountry, snOrganization, snSerial, entryDateTime);
  }

  public Organisation(ListCCY snCountry, String snOrganization, String snSerial, Date entryDateTime) {
    super(snCountry, snOrganization, snSerial, entryDateTime);
  }

  public Organisation() {
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
   * @param value
   */
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
   * @param value
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

  /**
   * Gets the value of the name property.
   * <p>
   * @return
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the alternateName property.
   * <p>
   * @return
   */
  public TString getAlternateName() {
    return alternateName;
  }

  /**
   * Sets the value of the alternateName property.
   * <p>
   * @param value
   */
  public void setAlternateName(TString value) {
    this.alternateName = value;
  }

  public boolean isSetAlternateName() {
    return (this.alternateName != null);
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the uic property.
   * <p>
   * @return
   */
  public TString getUIC() {
    return uic;
  }

  /**
   * Sets the value of the uic property.
   * <p>
   * @param value
   */
  public void setUIC(TString value) {
    this.uic = value;
  }

  public boolean isSetUIC() {
    return (this.uic != null);
  }

  /**
   * Gets the value of the address property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the address property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAddress().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Address> getAddress() {
    if (address == null) {
      address = new ArrayList<>();
    }
    return this.address;
  }

  public boolean isSetAddress() {
    return ((this.address != null) && (!this.address.isEmpty()));
  }

  public void unsetAddress() {
    this.address = null;
  }

  /**
   * Gets the value of the telephoneFax property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the telephoneFax property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTelephoneFax().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<TelephoneFax> getTelephoneFax() {
    if (telephoneFax == null) {
      telephoneFax = new ArrayList<>();
    }
    return this.telephoneFax;
  }

  public boolean isSetTelephoneFax() {
    return ((this.telephoneFax != null) && (!this.telephoneFax.isEmpty()));
  }

  public void unsetTelephoneFax() {
    this.telephoneFax = null;
  }

  /**
   * Gets the value of the eMail property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the eMail property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEMail().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<EMail> getEMail() {
    if (eMail == null) {
      eMail = new ArrayList<>();
    }
    return this.eMail;
  }

  public boolean isSetEMail() {
    return ((this.eMail != null) && (!this.eMail.isEmpty()));
  }

  public void unsetEMail() {
    this.eMail = null;
  }

  /**
   * Gets the value of the roleRef property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the roleRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRoleRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<RoleRef> getRoleRef() {
    if (roleRef == null) {
      roleRef = new ArrayList<>();
    }
    return this.roleRef;
  }

  public boolean isSetRoleRef() {
    return ((this.roleRef != null) && (!this.roleRef.isEmpty()));
  }

  public void unsetRoleRef() {
    this.roleRef = null;
  }

  /**
   * Gets the value of the relatedOrganisation property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the relatedOrganisation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRelatedOrganisation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<RelatedOrganisation> getRelatedOrganisation() {
    if (relatedOrganisation == null) {
      relatedOrganisation = new ArrayList<>();
    }
    return this.relatedOrganisation;
  }

  public boolean isSetRelatedOrganisation() {
    return ((this.relatedOrganisation != null) && (!this.relatedOrganisation.isEmpty()));
  }

  public void unsetRelatedOrganisation() {
    this.relatedOrganisation = null;
  }

  public Organisation withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public Organisation withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  public Organisation withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public Organisation withName(String value) {
    setName(new TString(value));
    return this;
  }

  public Organisation withAlternateName(String value) {
    setAlternateName(new TString(value));
    return this;
  }

  public Organisation withType(String value) {
    setType(new TString(value));
    return this;
  }

  public Organisation withUIC(String value) {
    setUIC(new TString(value));
    return this;
  }

  public Organisation withAddress(Address... values) {
    if (values != null) {
      getAddress().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Organisation withAddress(Collection<Address> values) {
    if (values != null) {
      getAddress().addAll(values);
    }
    return this;
  }

  public Organisation withTelephoneFax(TelephoneFax... values) {
    if (values != null) {
      getTelephoneFax().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Organisation withTelephoneFax(Collection<TelephoneFax> values) {
    if (values != null) {
      getTelephoneFax().addAll(values);
    }
    return this;
  }

  public Organisation withEMail(EMail... values) {
    if (values != null) {
      getEMail().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Organisation withEMail(Collection<EMail> values) {
    if (values != null) {
      getEMail().addAll(values);
    }
    return this;
  }

  public Organisation withRoleRef(RoleRef... values) {
    if (values != null) {
      getRoleRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Organisation withRoleRef(Collection<RoleRef> values) {
    if (values != null) {
      getRoleRef().addAll(values);
    }
    return this;
  }

  public Organisation withRelatedOrganisation(RelatedOrganisation... values) {
    if (values != null) {
      getRelatedOrganisation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Organisation withRelatedOrganisation(Collection<RelatedOrganisation> values) {
    if (values != null) {
      getRelatedOrganisation().addAll(values);
    }
    return this;
  }

}
