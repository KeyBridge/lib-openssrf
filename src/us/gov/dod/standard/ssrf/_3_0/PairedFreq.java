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
 * Java class for PairedFreq complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="PairedFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Freq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 *         &lt;element name="AssignmentRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="PairedASN" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS12" minOccurs="0"/>
 *         &lt;element name="PairedType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairedFreq", propOrder = {
  "freq",
  "assignmentRef",
  "pairedASN",
  "pairedType"
})
public class PairedFreq {

  @XmlElement(name = "Freq", required = true)
  protected TFreqM freq;
  @XmlElementRef(name = "AssignmentRef", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSerial> assignmentRef;
  @XmlElementRef(name = "PairedASN", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS12> pairedASN;
  @XmlElementRef(name = "PairedType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> pairedType;

  /**
   * Gets the value of the freq property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getFreq() {
    return freq;
  }

  /**
   * Sets the value of the freq property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setFreq(TFreqM value) {
    this.freq = value;
  }

  /**
   * Gets the value of the assignmentRef property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public JAXBElement<TSerial> getAssignmentRef() {
    return assignmentRef;
  }

  /**
   * Sets the value of the assignmentRef property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSerial }{@code >}
   * <p>
   */
  public void setAssignmentRef(JAXBElement<TSerial> value) {
    this.assignmentRef = value;
  }

  /**
   * Gets the value of the pairedASN property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS12 }{@code >}
   * <p>
   */
  public JAXBElement<TUS12> getPairedASN() {
    return pairedASN;
  }

  /**
   * Sets the value of the pairedASN property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS12 }{@code >}
   * <p>
   */
  public void setPairedASN(JAXBElement<TUS12> value) {
    this.pairedASN = value;
  }

  /**
   * Gets the value of the pairedType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getPairedType() {
    return pairedType;
  }

  /**
   * Sets the value of the pairedType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setPairedType(JAXBElement<TS20> value) {
    this.pairedType = value;
  }

}
