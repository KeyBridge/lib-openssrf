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
 * Java class for PreviousAuthorization complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="PreviousAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocketNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS8"/>
 *         &lt;element name="Date " type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="AgencySerialNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousAuthorization", propOrder = {
  "docketNum",
  "date0020",
  "agencySerialNum"
})
public class PreviousAuthorization {

  @XmlElement(name = "DocketNum", required = true)
  protected TS8 docketNum;
  @XmlElementRef(name = "Date ", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> date0020;
  @XmlElementRef(name = "AgencySerialNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS12> agencySerialNum;

  /**
   * Gets the value of the docketNum property.
   * <p>
   * @return possible object is {@link TS8 }
   * <p>
   */
  public TS8 getDocketNum() {
    return docketNum;
  }

  /**
   * Sets the value of the docketNum property.
   * <p>
   * @param value allowed object is {@link TS8 }
   * <p>
   */
  public void setDocketNum(TS8 value) {
    this.docketNum = value;
  }

  /**
   * Gets the value of the date_0020 property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getDate_0020() {
    return date0020;
  }

  /**
   * Sets the value of the date_0020 property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setDate_0020(JAXBElement<TD> value) {
    this.date0020 = value;
  }

  /**
   * Gets the value of the agencySerialNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public JAXBElement<TS12> getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Sets the value of the agencySerialNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public void setAgencySerialNum(JAXBElement<TS12> value) {
    this.agencySerialNum = value;
  }

}
