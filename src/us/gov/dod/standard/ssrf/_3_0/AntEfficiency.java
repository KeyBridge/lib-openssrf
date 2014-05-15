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
 * Java class for AntEfficiency complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="AntEfficiency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp" minOccurs="0"/>
 *         &lt;element name="Efficiency" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TPercent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntEfficiency", propOrder = {
  "freqMin",
  "freqMax",
  "efficiency"
})
public class AntEfficiency {

  @XmlElement(name = "FreqMin")
  protected TFreqM freqMin;
  @XmlElementRef(name = "FreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freqMax;
  @XmlElement(name = "Efficiency", required = true)
  protected TPercent efficiency;

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setFreqMin(TFreqM value) {
    this.freqMin = value;
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreqMax(JAXBElement<TFreqM> value) {
    this.freqMax = value;
  }

  /**
   * Gets the value of the efficiency property.
   * <p>
   * @return possible object is {@link TPercent }
   * <p>
   */
  public TPercent getEfficiency() {
    return efficiency;
  }

  /**
   * Sets the value of the efficiency property.
   * <p>
   * @param value allowed object is {@link TPercent }
   * <p>
   */
  public void setEfficiency(TPercent value) {
    this.efficiency = value;
  }

}
