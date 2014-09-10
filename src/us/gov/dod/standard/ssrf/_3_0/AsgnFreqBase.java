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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

/**
 * <p>
 * Java class for AsgnFreqBase complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="AsgnFreqBase"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp"/> &lt;element
 * name="RefFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"
 * minOccurs="0"/> &lt;element name="FreqUse"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAU" minOccurs="0"/>
 * &lt;/sequence> &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsgnFreqBase", propOrder = {
  "freqMin",
  "freqMax",
  "refFreq",
  "freqUse"
})
@XmlSeeAlso({
  FreqOld.class,
  Freq.class
})
public abstract class AsgnFreqBase {

  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "RefFreq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal refFreq;
  @XmlElement(name = "FreqUse", required = false)
  private TString freqUse;

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  public boolean isSetFreqMin() {
    return (this.freqMin != null);
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the refFreq property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getRefFreq() {
    return refFreq;
  }

  /**
   * Sets the value of the refFreq property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setRefFreq(TDecimal value) {
    this.refFreq = value;
  }

  public boolean isSetRefFreq() {
    return (this.refFreq != null);
  }

  /**
   * Gets the value of the freqUse property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
   * <p>
   */
  public TString getFreqUse() {
    return freqUse;
  }

  /**
   * Sets the value of the freqUse property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCAU }{@code >}
   * <p>
   */
  public void setFreqUse(TString value) {
    this.freqUse = value;
  }

  public boolean isSetFreqUse() {
    return (this.freqUse != null);
  }

  public AsgnFreqBase withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public AsgnFreqBase withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public AsgnFreqBase withRefFreq(Double value) {
    setRefFreq(new TDecimal(value));
    return this;
  }

  public AsgnFreqBase withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

}
