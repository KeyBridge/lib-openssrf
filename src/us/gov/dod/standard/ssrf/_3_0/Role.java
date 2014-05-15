/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReview" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="Country" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCY" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneFax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TelephoneFax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EMail" type="{urn:us:gov:dod:standard:ssrf:3.0.0}EMail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ContactRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
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
public class Role
  extends Common {

  @XmlElementRef(name = "EffectiveDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> effectiveDate;
  @XmlElementRef(name = "ExpirationDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> expirationDate;
  @XmlElementRef(name = "ReviewDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> reviewDate;
  @XmlElement(name = "Name", required = true)
  protected TS50 name;
  @XmlElementRef(name = "Country", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCCY> country;
  @XmlElement(name = "Address")
  protected List<Address> address;
  @XmlElement(name = "TelephoneFax")
  protected List<TelephoneFax> telephoneFax;
  @XmlElement(name = "EMail")
  protected List<EMail> eMail;
  @XmlElement(name = "ContactRef", nillable = true)
  protected List<ContactRef> contactRef;

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setEffectiveDate(JAXBElement<TD> value) {
    this.effectiveDate = value;
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpirationDate(JAXBElement<TD> value) {
    this.expirationDate = value;
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(JAXBElement<TD> value) {
    this.reviewDate = value;
  }

  /**
   * Gets the value of the name property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TS50 getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setName(TS50 value) {
    this.name = value;
  }

  /**
   * Gets the value of the country property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCCY }{@code >}
   * <p>
   */
  public JAXBElement<TListCCY> getCountry() {
    return country;
  }

  /**
   * Sets the value of the country property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCCY }{@code >}
   * <p>
   */
  public void setCountry(JAXBElement<TListCCY> value) {
    this.country = value;
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
   */
  public List<Address> getAddress() {
    if (address == null) {
      address = new ArrayList<>();
    }
    return this.address;
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
   */
  public List<TelephoneFax> getTelephoneFax() {
    if (telephoneFax == null) {
      telephoneFax = new ArrayList<>();
    }
    return this.telephoneFax;
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
   */
  public List<EMail> getEMail() {
    if (eMail == null) {
      eMail = new ArrayList<>();
    }
    return this.eMail;
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
   */
  public List<ContactRef> getContactRef() {
    if (contactRef == null) {
      contactRef = new ArrayList<>();
    }
    return this.contactRef;
  }

}
