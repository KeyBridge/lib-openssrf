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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for CaseNum complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="CaseNum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseNum", propOrder = {
  "country",
  "type",
  "identifier"
})
public class CaseNum {

  @XmlElementRef(name = "Country", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCAO> country;
  @XmlElementRef(name = "Type", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> type;
  @XmlElement(name = "Identifier", required = true)
  protected TS20 identifier;

  /**
   * Gets the value of the country property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCAO }{@code >}
   * <p>
   */
  public JAXBElement<TListCAO> getCountry() {
    return country;
  }

  /**
   * Sets the value of the country property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCAO }{@code >}
   * <p>
   */
  public void setCountry(JAXBElement<TListCAO> value) {
    this.country = value;
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setType(JAXBElement<TS20> value) {
    this.type = value;
  }

  /**
   * Gets the value of the identifier property.
   * <p>
   * @return possible object is {@link TS20 }
   * <p>
   */
  public TS20 getIdentifier() {
    return identifier;
  }

  /**
   * Sets the value of the identifier property.
   * <p>
   * @param value allowed object is {@link TS20 }
   * <p>
   */
  public void setIdentifier(TS20 value) {
    this.identifier = value;
  }

}
