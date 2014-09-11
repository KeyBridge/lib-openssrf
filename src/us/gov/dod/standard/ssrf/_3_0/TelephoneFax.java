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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.lists.ListCCL;

/**
 * <p>
 * Java class for TelephoneFax complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TelephoneFax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Preferred" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="Fax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="MaxCls" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCL" minOccurs="0"/>
 *         &lt;element name="Number" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneFax", propOrder = {
  "preferred",
  "type",
  "fax",
  "maxCls",
  "number"
})
public class TelephoneFax {

  @XmlElement(name = "Preferred", required = false)
  private TString preferred;
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString type;
  @XmlElement(name = "Fax", required = false)
  private TString fax;
  @XmlElement(name = "MaxCls", required = false)
  private TString maxCls;
  @XmlElement(name = "Number", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString number;

  /**
   * Gets the value of the preferred property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPreferred() {
    return preferred;
  }

  /**
   * Sets the value of the preferred property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPreferred(TString value) {
    this.preferred = value;
  }

  public boolean isSetPreferred() {
    return (this.preferred != null);
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the fax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getFax() {
    return fax;
  }

  /**
   * Sets the value of the fax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setFax(TString value) {
    this.fax = value;
  }

  public boolean isSetFax() {
    return (this.fax != null);
  }

  /**
   * Gets the value of the maxCls property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getMaxCls() {
    return maxCls;
  }

  /**
   * Sets the value of the maxCls property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setMaxCls(TString value) {
    this.maxCls = value;
  }

  public boolean isSetMaxCls() {
    return (this.maxCls != null);
  }

  /**
   * Gets the value of the number property.
   * <p>
   * @return 
   */
  public TString getNumber() {
    return number;
  }

  /**
   * Sets the value of the number property.
   * <p>
   * @param value 
   */
  public void setNumber(TString value) {
    this.number = value;
  }

  public boolean isSetNumber() {
    return (this.number != null);
  }

  public TelephoneFax withPreferred(ListCBO value) {
    setPreferred(new TString(value.value()));
    return this;
  }

  public TelephoneFax withType(String value) {
    setType(new TString(value));
    return this;
  }

  public TelephoneFax withFax(ListCBO value) {
    setFax(new TString(value.value()));
    return this;
  }

  public TelephoneFax withMaxCls(ListCCL value) {
    setMaxCls(new TString(value.value()));
    return this;
  }

  public TelephoneFax withNumber(String value) {
    setNumber(new TString(value));
    return this;
  }

}
