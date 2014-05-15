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
 * Java class for Downgrade complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Downgrade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Downcls" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCL"/>
 *         &lt;element name="Date" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 *         &lt;element name="DowngradeInfo" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS200" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Downgrade", propOrder = {
  "downcls",
  "date",
  "downgradeInfo"
})
public class Downgrade {

  @XmlElement(name = "Downcls", required = true)
  protected TListCCL downcls;
  @XmlElement(name = "Date", required = true)
  protected TD date;
  @XmlElementRef(name = "DowngradeInfo", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS200> downgradeInfo;

  /**
   * Gets the value of the downcls property.
   * <p>
   * @return possible object is {@link TListCCL }
   * <p>
   */
  public TListCCL getDowncls() {
    return downcls;
  }

  /**
   * Sets the value of the downcls property.
   * <p>
   * @param value allowed object is {@link TListCCL }
   * <p>
   */
  public void setDowncls(TListCCL value) {
    this.downcls = value;
  }

  /**
   * Gets the value of the date property.
   * <p>
   * @return possible object is {@link TD }
   * <p>
   */
  public TD getDate() {
    return date;
  }

  /**
   * Sets the value of the date property.
   * <p>
   * @param value allowed object is {@link TD }
   * <p>
   */
  public void setDate(TD value) {
    this.date = value;
  }

  /**
   * Gets the value of the downgradeInfo property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS200 }{@code >}
   * <p>
   */
  public JAXBElement<TS200> getDowngradeInfo() {
    return downgradeInfo;
  }

  /**
   * Sets the value of the downgradeInfo property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS200 }{@code >}
   * <p>
   */
  public void setDowngradeInfo(JAXBElement<TS200> value) {
    this.downgradeInfo = value;
  }

}
