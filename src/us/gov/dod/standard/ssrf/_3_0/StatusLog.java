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

import us.gov.dod.standard.ssrf._3_0.datatype.TDT;
import us.gov.dod.standard.ssrf._3_0.datatype.TSerial;
import us.gov.dod.standard.ssrf._3_0.datatype.TS80;
import us.gov.dod.standard.ssrf._3_0.datatype.TS255;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for StatusLog complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="StatusLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT"/>
 *         &lt;element name="State" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="AgencyCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS80" minOccurs="0"/>
 *         &lt;element name="Comment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *         &lt;element name="POCRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLog", propOrder = {
  "dateTime",
  "state",
  "agencyCode",
  "comment",
  "pocRef"
})
public class StatusLog {

  @XmlElement(name = "DateTime", required = true)
  protected TDT dateTime;
  @XmlElement(name = "State", required = true)
  protected TS50 state;
  @XmlElementRef(name = "AgencyCode", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS80> agencyCode;
  @XmlElementRef(name = "Comment", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS255> comment;
  @XmlElementRef(name = "POCRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> pocRef;

  /**
   * Gets the value of the dateTime property.
   * <p>
   * @return possible object is {@link TDT }
   * <p>
   */
  public TDT getDateTime() {
    return dateTime;
  }

  /**
   * Sets the value of the dateTime property.
   * <p>
   * @param value allowed object is {@link TDT }
   * <p>
   */
  public void setDateTime(TDT value) {
    this.dateTime = value;
  }

  /**
   * Gets the value of the state property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TS50 getState() {
    return state;
  }

  /**
   * Sets the value of the state property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setState(TS50 value) {
    this.state = value;
  }

  /**
   * Gets the value of the agencyCode property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS80 }{@code >}
   * <p>
   */
  public JAXBElement<TS80> getAgencyCode() {
    return agencyCode;
  }

  /**
   * Sets the value of the agencyCode property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS80 }{@code >}
   * <p>
   */
  public void setAgencyCode(JAXBElement<TS80> value) {
    this.agencyCode = value;
  }

  /**
   * Gets the value of the comment property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public JAXBElement<TS255> getComment() {
    return comment;
  }

  /**
   * Sets the value of the comment property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS255 }{@code >}
   * <p>
   */
  public void setComment(JAXBElement<TS255> value) {
    this.comment = value;
  }

  /**
   * Gets the value of the pocRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getPOCRef() {
    return pocRef;
  }

  /**
   * Sets the value of the pocRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setPOCRef(JAXBElement<TSerial> value) {
    this.pocRef = value;
  }

}
