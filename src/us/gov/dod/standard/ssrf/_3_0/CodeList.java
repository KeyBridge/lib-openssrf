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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCAO;

/**
 * <p>
 * Java class for CodeList complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="CodeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"/>
 *         &lt;element name="CodeListCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS3"/>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 *         &lt;element name="Description" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Origin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO" minOccurs="0"/>
 *         &lt;element name="Code" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeList", propOrder = {
  "action",
  "codeListCode",
  "effectiveDate",
  "description",
  "origin",
  "code"
})
public class CodeList {

  @XmlElement(name = "Action", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString action;
  @XmlElement(name = "CodeListCode", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS3.class)
  private TString codeListCode;
  @XmlElement(name = "EffectiveDate", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString description;
  @XmlElement(name = "Origin", required = false)
  private TString origin;
  @XmlElement(name = "Code")
  private List<Code> code;

  /**
   * Gets the value of the action property.
   * <p>
   * @return 
   */
  public TString getAction() {
    return action;
  }

  /**
   * Sets the value of the action property.
   * <p>
   * @param value 
   */
  public void setAction(TString value) {
    this.action = value;
  }

  public boolean isSetAction() {
    return (this.action != null);
  }

  /**
   * Gets the value of the codeListCode property.
   * <p>
   * @return 
   */
  public TString getCodeListCode() {
    return codeListCode;
  }

  /**
   * Sets the value of the codeListCode property.
   * <p>
   * @param value 
   */
  public void setCodeListCode(TString value) {
    this.codeListCode = value;
  }

  public boolean isSetCodeListCode() {
    return (this.codeListCode != null);
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
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Gets the value of the origin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getOrigin() {
    return origin;
  }

  /**
   * Sets the value of the origin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setOrigin(TString value) {
    this.origin = value;
  }

  public boolean isSetOrigin() {
    return (this.origin != null);
  }

  /**
   * Gets the value of the code property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the code property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCode().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<Code> getCode() {
    if (code == null) {
      code = new ArrayList<>();
    }
    return this.code;
  }

  public boolean isSetCode() {
    return ((this.code != null) && (!this.code.isEmpty()));
  }

  public void unsetCode() {
    this.code = null;
  }

  public CodeList withAction(String value) {
    setAction(new TString(value));
    return this;
  }

  public CodeList withCodeListCode(String value) {
    setCodeListCode(new TString(value));
    return this;
  }

  public CodeList withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public CodeList withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  public CodeList withOrigin(ListCAO value) {
    setOrigin(new TString(value.value()));
    return this;
  }

  public CodeList withCode(Code... values) {
    if (values != null) {
      getCode().addAll(Arrays.asList(values));
    }
    return this;
  }

  public CodeList withCode(Collection<Code> values) {
    if (values != null) {
      getCode().addAll(values);
    }
    return this;
  }

}
