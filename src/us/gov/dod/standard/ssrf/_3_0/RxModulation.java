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

import us.gov.dod.standard.ssrf._3_0.datatype.Tmicrosecs;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for RxModulation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="RxModulation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigitalModType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="MaxBitRate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10_3" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}DigitalFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxModulation", propOrder = {
  "digitalModType",
  "maxBitRate",
  "numStates",
  "lineCoding",
  "codeRate",
  "codePeriod"
})
@XmlSeeAlso({
  TxModulation.class
})
public class RxModulation {

  @XmlElementRef(name = "DigitalModType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> digitalModType;
  @XmlElementRef(name = "MaxBitRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN10_3> maxBitRate;
  @XmlElementRef(name = "NumStates", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5> numStates;
  @XmlElementRef(name = "LineCoding", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> lineCoding;
  @XmlElementRef(name = "CodeRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN10_3> codeRate;
  @XmlElementRef(name = "CodePeriod", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> codePeriod;

  /**
   * Gets the value of the digitalModType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getDigitalModType() {
    return digitalModType;
  }

  /**
   * Sets the value of the digitalModType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setDigitalModType(JAXBElement<TS50> value) {
    this.digitalModType = value;
  }

  /**
   * Gets the value of the maxBitRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN10_3> getMaxBitRate() {
    return maxBitRate;
  }

  /**
   * Sets the value of the maxBitRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}
   * <p>
   */
  public void setMaxBitRate(JAXBElement<TUN10_3> value) {
    this.maxBitRate = value;
  }

  /**
   * Gets the value of the numStates property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5> getNumStates() {
    return numStates;
  }

  /**
   * Sets the value of the numStates property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setNumStates(JAXBElement<TUN5> value) {
    this.numStates = value;
  }

  /**
   * Gets the value of the lineCoding property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getLineCoding() {
    return lineCoding;
  }

  /**
   * Sets the value of the lineCoding property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setLineCoding(JAXBElement<TS50> value) {
    this.lineCoding = value;
  }

  /**
   * Gets the value of the codeRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN10_3> getCodeRate() {
    return codeRate;
  }

  /**
   * Sets the value of the codeRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}
   * <p>
   */
  public void setCodeRate(JAXBElement<TUN10_3> value) {
    this.codeRate = value;
  }

  /**
   * Gets the value of the codePeriod property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getCodePeriod() {
    return codePeriod;
  }

  /**
   * Sets the value of the codePeriod property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setCodePeriod(JAXBElement<Tmicrosecs> value) {
    this.codePeriod = value;
  }

}
