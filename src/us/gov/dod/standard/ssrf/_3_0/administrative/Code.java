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
package us.gov.dod.standard.ssrf._3_0.administrative;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for Code complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Code">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="Description" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code", propOrder = {
  "value",
  "description"
})
public class Code {

  @XmlElement(name = "Value", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString value;
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString description;

  /**
   * Gets the value of the value property.
   * <p>
   * @return 
   */
  public TString getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value 
   */
  public void setValue(TString value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
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

  public Code withValue(String value) {
    setValue(new TString(value));
    return this;
  }

  public Code withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

}
