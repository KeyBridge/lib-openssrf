/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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

import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for AntGain complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="AntGain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Calculated" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Gain" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSN5_2"/>
 *         &lt;element name="Freq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="FrontToBackRatio" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5_2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntGain", propOrder = {
  "calculated",
  "gain",
  "freq",
  "frontToBackRatio"
})
public class AntGain {

  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  @XmlElement(name = "Gain", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSN5_2.class)
  private TDecimal gain;
  @XmlElement(name = "Freq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  @XmlElement(name = "FrontToBackRatio", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN5_2.class)
  private TDecimal frontToBackRatio;

  /**
   * Gets the value of the calculated property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  public boolean isSetCalculated() {
    return (this.calculated != null);
  }

  /**
   * Gets the value of the gain property.
   * <p>
   * @return possible object is {@link TSN5_2 }
   * <p>
   */
  public TDecimal getGain() {
    return gain;
  }

  /**
   * Sets the value of the gain property.
   * <p>
   * @param value allowed object is {@link TSN5_2 }
   * <p>
   */
  public void setGain(TDecimal value) {
    this.gain = value;
  }

  public boolean isSetGain() {
    return (this.gain != null);
  }

  /**
   * Gets the value of the freq property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Sets the value of the freq property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreq(TDecimal value) {
    this.freq = value;
  }

  public boolean isSetFreq() {
    return (this.freq != null);
  }

  /**
   * Gets the value of the frontToBackRatio property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public TDecimal getFrontToBackRatio() {
    return frontToBackRatio;
  }

  /**
   * Sets the value of the frontToBackRatio property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5_2 }{@code >}
   * <p>
   */
  public void setFrontToBackRatio(TDecimal value) {
    this.frontToBackRatio = value;
  }

  public boolean isSetFrontToBackRatio() {
    return (this.frontToBackRatio != null);
  }

  public AntGain withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  public AntGain withGain(Double value) {
    setGain(new TDecimal(value));
    return this;
  }

  public AntGain withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  public AntGain withFrontToBackRatio(Double value) {
    setFrontToBackRatio(new TDecimal(value));
    return this;
  }

}
