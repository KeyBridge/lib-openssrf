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
package us.gov.dod.standard.ssrf._3_0.common;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for SecurityClass complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="SecurityClass"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="ClsAuthority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30"
 * minOccurs="0"/> &lt;element name="SourceClsDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="ClsOrg" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30" minOccurs="0"/>
 * &lt;element name="ClsReason" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS15"
 * minOccurs="0"/> &lt;element name="DeclsType"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/> &lt;element
 * name="DeclsDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;element name="DeclsEvent"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS200" minOccurs="0"/> &lt;element
 * name="Downgrade" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Downgrade"
 * maxOccurs="3" minOccurs="0"/> &lt;element name="ClsDerived"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}ClsDerived" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
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

  @XmlElement(name = "ClsAuthority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString clsAuthority;
  @XmlElement(name = "SourceClsDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar sourceClsDate;
  @XmlElement(name = "ClsOrg", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString clsOrg;
  @XmlElement(name = "ClsReason", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS15.class)
  private TString clsReason;
  @XmlElement(name = "DeclsType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString declsType;
  @XmlElement(name = "DeclsDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar declsDate;
  @XmlElement(name = "DeclsEvent", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS200.class)
  private TString declsEvent;
  @XmlElement(name = "Downgrade")
  private List<Downgrade> downgrade;
  @XmlElement(name = "ClsDerived")
  private List<ClsDerived> clsDerived;

  /**
   * Gets the value of the clsAuthority property.
   * <p>
   * @return 
   */
  public TString getClsAuthority() {
    return clsAuthority;
  }

  /**
   * Sets the value of the clsAuthority property.
   * <p>
   * @param value 
   */
  public void setClsAuthority(TString value) {
    this.clsAuthority = value;
  }

  public boolean isSetClsAuthority() {
    return (this.clsAuthority != null);
  }

  /**
   * Gets the value of the sourceClsDate property.
   * <p>
   * @return 
   */
  public TCalendar getSourceClsDate() {
    return sourceClsDate;
  }

  /**
   * Sets the value of the sourceClsDate property.
   * <p>
   * @param value 
   */
  public void setSourceClsDate(TCalendar value) {
    this.sourceClsDate = value;
  }

  public boolean isSetSourceClsDate() {
    return (this.sourceClsDate != null);
  }

  /**
   * Gets the value of the clsOrg property.
   * <p>
   * @return 
   */
  public TString getClsOrg() {
    return clsOrg;
  }

  /**
   * Sets the value of the clsOrg property.
   * <p>
   * @param value 
   */
  public void setClsOrg(TString value) {
    this.clsOrg = value;
  }

  public boolean isSetClsOrg() {
    return (this.clsOrg != null);
  }

  /**
   * Gets the value of the clsReason property.
   * <p>
   * @return 
   */
  public TString getClsReason() {
    return clsReason;
  }

  /**
   * Sets the value of the clsReason property.
   * <p>
   * @param value 
   */
  public void setClsReason(TString value) {
    this.clsReason = value;
  }

  public boolean isSetClsReason() {
    return (this.clsReason != null);
  }

  /**
   * Gets the value of the declsType property.
   * <p>
   * @return 
   */
  public TString getDeclsType() {
    return declsType;
  }

  /**
   * Sets the value of the declsType property.
   * <p>
   * @param value 
   */
  public void setDeclsType(TString value) {
    this.declsType = value;
  }

  public boolean isSetDeclsType() {
    return (this.declsType != null);
  }

  /**
   * Gets the value of the declsDate property.
   * <p>
   * @return 
   */
  public TCalendar getDeclsDate() {
    return declsDate;
  }

  /**
   * Sets the value of the declsDate property.
   * <p>
   * @param value 
   */
  public void setDeclsDate(TCalendar value) {
    this.declsDate = value;
  }

  public boolean isSetDeclsDate() {
    return (this.declsDate != null);
  }

  /**
   * Gets the value of the declsEvent property.
   * <p>
   * @return 
   */
  public TString getDeclsEvent() {
    return declsEvent;
  }

  /**
   * Sets the value of the declsEvent property.
   * <p>
   * @param value 
   */
  public void setDeclsEvent(TString value) {
    this.declsEvent = value;
  }

  public boolean isSetDeclsEvent() {
    return (this.declsEvent != null);
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
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Downgrade> getDowngrade() {
    if (downgrade == null) {
      downgrade = new ArrayList<>();
    }
    return this.downgrade;
  }

  public boolean isSetDowngrade() {
    return ((this.downgrade != null) && (!this.downgrade.isEmpty()));
  }

  public void unsetDowngrade() {
    this.downgrade = null;
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
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<ClsDerived> getClsDerived() {
    if (clsDerived == null) {
      clsDerived = new ArrayList<>();
    }
    return this.clsDerived;
  }

  public boolean isSetClsDerived() {
    return ((this.clsDerived != null) && (!this.clsDerived.isEmpty()));
  }

  public void unsetClsDerived() {
    this.clsDerived = null;
  }

  public SecurityClass withClsAuthority(String value) {
    setClsAuthority(new TString(value));
    return this;
  }

  public SecurityClass withSourceClsDate(Calendar value) {
    setSourceClsDate(new TCalendar(value));
    return this;
  }

  public SecurityClass withClsOrg(String value) {
    setClsOrg(new TString(value));
    return this;
  }

  public SecurityClass withClsReason(String value) {
    setClsReason(new TString(value));
    return this;
  }

  public SecurityClass withDeclsType(String value) {
    setDeclsType(new TString(value));
    return this;
  }

  public SecurityClass withDeclsDate(Calendar value) {
    setDeclsDate(new TCalendar(value));
    return this;
  }

  public SecurityClass withDeclsEvent(String value) {
    setDeclsEvent(new TString(value));
    return this;
  }

  public SecurityClass withDowngrade(Downgrade... values) {
    if (values != null) {
      getDowngrade().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SecurityClass withDowngrade(Collection<Downgrade> values) {
    if (values != null) {
      getDowngrade().addAll(values);
    }
    return this;
  }

  public SecurityClass withClsDerived(ClsDerived... values) {
    if (values != null) {
      getClsDerived().addAll(Arrays.asList(values));
    }
    return this;
  }

  public SecurityClass withClsDerived(Collection<ClsDerived> values) {
    if (values != null) {
      getClsDerived().addAll(values);
    }
    return this;
  }

}
