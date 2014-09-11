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
import us.gov.dod.standard.ssrf._3_0.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.domains.TString;

/**
 * <p>
 * Java class for Assets complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Assets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serial" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 *         &lt;element name="Authorised" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9" minOccurs="0"/>
 *         &lt;element name="Available" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assets", propOrder = {
  "serial",
  "authorised",
  "available"
})
public class Assets {

  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  @XmlElement(name = "Authorised", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger authorised;
  @XmlElement(name = "Available", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger available;

  /**
   * Gets the value of the serial property.
   * <p>
   * @return 
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value 
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Gets the value of the authorised property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getAuthorised() {
    return authorised;
  }

  /**
   * Sets the value of the authorised property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAuthorised(TInteger value) {
    this.authorised = value;
  }

  public boolean isSetAuthorised() {
    return (this.authorised != null);
  }

  /**
   * Gets the value of the available property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getAvailable() {
    return available;
  }

  /**
   * Sets the value of the available property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAvailable(TInteger value) {
    this.available = value;
  }

  public boolean isSetAvailable() {
    return (this.available != null);
  }

  public Assets withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  public Assets withAuthorised(Integer value) {
    setAuthorised(new TInteger(value));
    return this;
  }

  public Assets withAvailable(Integer value) {
    setAvailable(new TInteger(value));
    return this;
  }

}
