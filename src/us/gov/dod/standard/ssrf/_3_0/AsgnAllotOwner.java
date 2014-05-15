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
 * Java class for AsgnAllotOwner complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="AsgnAllotOwner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description " type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS18" minOccurs="0"/>
 *         &lt;element name="OwnerType " type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnAllotOwner", propOrder = {
  "description0020",
  "ownerType0020"
})
public class AsgnAllotOwner {

  @XmlElementRef(name = "Description ", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS18> description0020;
  @XmlElement(name = "OwnerType ", required = true)
  protected TS50 ownerType0020;

  /**
   * Gets the value of the description_0020 property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS18 }{@code >}
   * <p>
   */
  public JAXBElement<TS18> getDescription_0020() {
    return description0020;
  }

  /**
   * Sets the value of the description_0020 property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS18 }{@code >}
   * <p>
   */
  public void setDescription_0020(JAXBElement<TS18> value) {
    this.description0020 = value;
  }

  /**
   * Gets the value of the ownerType_0020 property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TS50 getOwnerType_0020() {
    return ownerType0020;
  }

  /**
   * Sets the value of the ownerType_0020 property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setOwnerType_0020(TS50 value) {
    this.ownerType0020 = value;
  }

}
