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

import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCCY;
import java.util.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for Role complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Role"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview" minOccurs="0"/>
 * &lt;element name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 * &lt;element name="Country"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCY" minOccurs="0"/>
 * &lt;element name="Address" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Address"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="TelephoneFax"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TelephoneFax" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="EMail"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}EMail" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="ContactRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}ContactRef" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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
public class Role extends Common {

  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString name;
  @XmlElement(name = "Country", required = false)
  private TString country;
  @XmlElement(name = "Address")
  private List<Address> address;
  @XmlElement(name = "TelephoneFax")
  private List<TelephoneFax> telephoneFax;
  @XmlElement(name = "EMail")
  private List<EMail> eMail;
  @XmlElement(name = "ContactRef", nillable = true)
  private List<ContactRef> contactRef;

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
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
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the country property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCCY }{@code >}
   * <p>
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Sets the value of the country property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCCY }{@code >}
   * <p>
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
  }

  /**
   * Gets the value of the address property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the address property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAddress().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Address }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the telephoneFax property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTelephoneFax().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link TelephoneFax }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the eMail property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEMail().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link EMail }
   * <p>
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
   * Gets the value of the contactRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the contactRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContactRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ContactRef }
   * <p>
   * <p>
   * @return
   */
  public List<ContactRef> getContactRef() {
    if (contactRef == null) {
      contactRef = new ArrayList<>();
    }
    return this.contactRef;
  }

  public boolean isSetContactRef() {
    return ((this.contactRef != null) && (!this.contactRef.isEmpty()));
  }

  public void unsetContactRef() {
    this.contactRef = null;
  }

  public Role withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public Role withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  public Role withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public Role withName(String value) {
    setName(new TString(value));
    return this;
  }

  public Role withCountry(ListCCY value) {
    setCountry(new TString(value.value()));
    return this;
  }

  public Role withAddress(Address... values) {
    if (values != null) {
      getAddress().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Role withAddress(Collection<Address> values) {
    if (values != null) {
      getAddress().addAll(values);
    }
    return this;
  }

  public Role withTelephoneFax(TelephoneFax... values) {
    if (values != null) {
      getTelephoneFax().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Role withTelephoneFax(Collection<TelephoneFax> values) {
    if (values != null) {
      getTelephoneFax().addAll(values);
    }
    return this;
  }

  public Role withEMail(EMail... values) {
    if (values != null) {
      getEMail().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Role withEMail(Collection<EMail> values) {
    if (values != null) {
      getEMail().addAll(values);
    }
    return this;
  }

  public Role withContactRef(ContactRef... values) {
    if (values != null) {
      getContactRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Role withContactRef(Collection<ContactRef> values) {
    if (values != null) {
      getContactRef().addAll(values);
    }
    return this;
  }

}
