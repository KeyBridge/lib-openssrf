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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Emission complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="Emission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmsClass" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TEmsDes" minOccurs="0"/>
 *         &lt;element name="NecessaryBw" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="Power" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdBW" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emission", propOrder = {
  "emsClass",
  "necessaryBw",
  "power"
})
public class Emission {

  @XmlElementRef(name = "EmsClass", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TEmsDes> emsClass;
  @XmlElementRef(name = "NecessaryBw", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> necessaryBw;
  @XmlElementRef(name = "Power", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> power;

  /**
   * Gets the value of the emsClass property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TEmsDes }{@code >}
   * <p>
   */
  public JAXBElement<TEmsDes> getEmsClass() {
    return emsClass;
  }

  /**
   * Sets the value of the emsClass property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TEmsDes }{@code >}
   * <p>
   */
  public void setEmsClass(JAXBElement<TEmsDes> value) {
    this.emsClass = value;
  }

  /**
   * Gets the value of the necessaryBw property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Sets the value of the necessaryBw property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setNecessaryBw(JAXBElement<TFreqM> value) {
    this.necessaryBw = value;
  }

  /**
   * Gets the value of the power property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getPower() {
    return power;
  }

  /**
   * Sets the value of the power property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setPower(JAXBElement<TdBW> value) {
    this.power = value;
  }

}
