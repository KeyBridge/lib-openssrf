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
 * Java class for EMail complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="EMail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Preferred" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="MaxCls" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCL" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMail", propOrder = {
  "preferred",
  "type",
  "maxCls",
  "address"
})
public class EMail {

  @XmlElementRef(name = "Preferred", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> preferred;
  @XmlElementRef(name = "Type", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> type;
  @XmlElementRef(name = "MaxCls", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCCL> maxCls;
  @XmlElement(name = "Address", required = true)
  protected TS255 address;

  /**
   * Gets the value of the preferred property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getPreferred() {
    return preferred;
  }

  /**
   * Sets the value of the preferred property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setPreferred(JAXBElement<TListCBO> value) {
    this.preferred = value;
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
   * Gets the value of the maxCls property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCCL }{@code >}
   * <p>
   */
  public JAXBElement<TListCCL> getMaxCls() {
    return maxCls;
  }

  /**
   * Sets the value of the maxCls property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCCL }{@code >}
   * <p>
   */
  public void setMaxCls(JAXBElement<TListCCL> value) {
    this.maxCls = value;
  }

  /**
   * Gets the value of the address property.
   * <p>
   * @return possible object is {@link TS255 }
   * <p>
   */
  public TS255 getAddress() {
    return address;
  }

  /**
   * Sets the value of the address property.
   * <p>
   * @param value allowed object is {@link TS255 }
   * <p>
   */
  public void setAddress(TS255 value) {
    this.address = value;
  }

}
