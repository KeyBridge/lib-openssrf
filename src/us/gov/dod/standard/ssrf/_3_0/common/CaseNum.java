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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCAO;

/**
 * Java class for CaseNum complex type.
 * <p>
 * Data element CaseNum allows to store a case number associated to the dataset.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseNum", propOrder = {
  "country",
  "type",
  "identifier"
})
public class CaseNum {

  /**
   * Country: Enter the nation or body who provided or assigned the case number.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CAO
   */
  @XmlElement(name = "Country", required = false)
  private TString country;
  /**
   * Type: Enter a text identifying the type of case number (national file,
   * exercise name, etc).
   */
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString type;
  /**
   * Identifier: Enter the case number.
   */
  @XmlElement(name = "Identifier", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString identifier;

  /**
   * Gets the value of the country property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Sets the value of the country property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   * <p>
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   * <p>
   * <p>
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the identifier property.
   * <p>
   * @return
   */
  public TString getIdentifier() {
    return identifier;
  }

  /**
   * Sets the value of the identifier property.
   * <p>
   * @param value
   */
  public void setIdentifier(TString value) {
    this.identifier = value;
  }

  public boolean isSetIdentifier() {
    return (this.identifier != null);
  }

  public CaseNum withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  public CaseNum withType(String value) {
    setType(new TString(value));
    return this;
  }

  public CaseNum withIdentifier(String value) {
    setIdentifier(new TString(value));
    return this;
  }

}
