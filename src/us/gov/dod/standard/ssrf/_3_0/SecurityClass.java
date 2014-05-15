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
 * Java class for SecurityClass complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="SecurityClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsAuthority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30" minOccurs="0"/>
 *         &lt;element name="SourceClsDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="ClsOrg" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30" minOccurs="0"/>
 *         &lt;element name="ClsReason" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15" minOccurs="0"/>
 *         &lt;element name="DeclsType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="DeclsDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="DeclsEvent" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS200" minOccurs="0"/>
 *         &lt;element name="Downgrade" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Downgrade" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="ClsDerived" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ClsDerived" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityClass", propOrder = {
  "clsAuthority",
  "sourceClsDate",
  "clsOrg",
  "clsReason",
  "declsType",
  "declsDate",
  "declsEvent",
  "downgrade",
  "clsDerived"
})
public class SecurityClass {

  @XmlElementRef(name = "ClsAuthority", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS30> clsAuthority;
  @XmlElementRef(name = "SourceClsDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> sourceClsDate;
  @XmlElementRef(name = "ClsOrg", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS30> clsOrg;
  @XmlElementRef(name = "ClsReason", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS15> clsReason;
  @XmlElementRef(name = "DeclsType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> declsType;
  @XmlElementRef(name = "DeclsDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> declsDate;
  @XmlElementRef(name = "DeclsEvent", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS200> declsEvent;
  @XmlElement(name = "Downgrade")
  protected List<Downgrade> downgrade;
  @XmlElement(name = "ClsDerived")
  protected List<ClsDerived> clsDerived;

  /**
   * Gets the value of the clsAuthority property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS30 }{@code >}
   * <p>
   */
  public JAXBElement<TS30> getClsAuthority() {
    return clsAuthority;
  }

  /**
   * Sets the value of the clsAuthority property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS30 }{@code >}
   * <p>
   */
  public void setClsAuthority(JAXBElement<TS30> value) {
    this.clsAuthority = value;
  }

  /**
   * Gets the value of the sourceClsDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getSourceClsDate() {
    return sourceClsDate;
  }

  /**
   * Sets the value of the sourceClsDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setSourceClsDate(JAXBElement<TD> value) {
    this.sourceClsDate = value;
  }

  /**
   * Gets the value of the clsOrg property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS30 }{@code >}
   * <p>
   */
  public JAXBElement<TS30> getClsOrg() {
    return clsOrg;
  }

  /**
   * Sets the value of the clsOrg property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS30 }{@code >}
   * <p>
   */
  public void setClsOrg(JAXBElement<TS30> value) {
    this.clsOrg = value;
  }

  /**
   * Gets the value of the clsReason property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public JAXBElement<TS15> getClsReason() {
    return clsReason;
  }

  /**
   * Sets the value of the clsReason property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS15 }{@code >}
   * <p>
   */
  public void setClsReason(JAXBElement<TS15> value) {
    this.clsReason = value;
  }

  /**
   * Gets the value of the declsType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getDeclsType() {
    return declsType;
  }

  /**
   * Sets the value of the declsType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setDeclsType(JAXBElement<TS10> value) {
    this.declsType = value;
  }

  /**
   * Gets the value of the declsDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getDeclsDate() {
    return declsDate;
  }

  /**
   * Sets the value of the declsDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setDeclsDate(JAXBElement<TD> value) {
    this.declsDate = value;
  }

  /**
   * Gets the value of the declsEvent property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS200 }{@code >}
   * <p>
   */
  public JAXBElement<TS200> getDeclsEvent() {
    return declsEvent;
  }

  /**
   * Sets the value of the declsEvent property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS200 }{@code >}
   * <p>
   */
  public void setDeclsEvent(JAXBElement<TS200> value) {
    this.declsEvent = value;
  }

  /**
   * Gets the value of the downgrade property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the downgrade property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDowngrade().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Downgrade }
   * <p>
   * <p>
   */
  public List<Downgrade> getDowngrade() {
    if (downgrade == null) {
      downgrade = new ArrayList<>();
    }
    return this.downgrade;
  }

  /**
   * Gets the value of the clsDerived property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the clsDerived property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getClsDerived().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ClsDerived }
   * <p>
   * <p>
   */
  public List<ClsDerived> getClsDerived() {
    if (clsDerived == null) {
      clsDerived = new ArrayList<>();
    }
    return this.clsDerived;
  }

}
