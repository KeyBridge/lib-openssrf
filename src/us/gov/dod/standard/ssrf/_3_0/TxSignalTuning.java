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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;

/**
 * <p>
 * Java class for TxSignalTuning complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TxSignalTuning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp"/>
 *         &lt;element name="TuningStep" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="NumPresetChannels" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN8" minOccurs="0"/>
 *         &lt;element name="LowestUsableChannel" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="MinSeparation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxSignalTuning", propOrder = {
  "freqMin",
  "freqMax",
  "tuningStep",
  "numPresetChannels",
  "lowestUsableChannel",
  "minSeparation"
})
public class TxSignalTuning {

  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "TuningStep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  @XmlElement(name = "NumPresetChannels", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN8.class)
  private TInteger numPresetChannels;
  @XmlElement(name = "LowestUsableChannel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal lowestUsableChannel;
  @XmlElement(name = "MinSeparation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal minSeparation;

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
   * Gets the value of the tuningStep property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Sets the value of the tuningStep property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  public boolean isSetTuningStep() {
    return (this.tuningStep != null);
  }

  /**
   * Gets the value of the numPresetChannels property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN8 }{@code >}
   * <p>
   */
  public TInteger getNumPresetChannels() {
    return numPresetChannels;
  }

  /**
   * Sets the value of the numPresetChannels property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN8 }{@code >}
   * <p>
   */
  public void setNumPresetChannels(TInteger value) {
    this.numPresetChannels = value;
  }

  public boolean isSetNumPresetChannels() {
    return (this.numPresetChannels != null);
  }

  /**
   * Gets the value of the lowestUsableChannel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getLowestUsableChannel() {
    return lowestUsableChannel;
  }

  /**
   * Sets the value of the lowestUsableChannel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setLowestUsableChannel(TDecimal value) {
    this.lowestUsableChannel = value;
  }

  public boolean isSetLowestUsableChannel() {
    return (this.lowestUsableChannel != null);
  }

  /**
   * Gets the value of the minSeparation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getMinSeparation() {
    return minSeparation;
  }

  /**
   * Sets the value of the minSeparation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setMinSeparation(TDecimal value) {
    this.minSeparation = value;
  }

  public boolean isSetMinSeparation() {
    return (this.minSeparation != null);
  }

  public TxSignalTuning withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public TxSignalTuning withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public TxSignalTuning withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  public TxSignalTuning withNumPresetChannels(Integer value) {
    setNumPresetChannels(new TInteger(value));
    return this;
  }

  public TxSignalTuning withLowestUsableChannel(Double value) {
    setLowestUsableChannel(new TDecimal(value));
    return this;
  }

  public TxSignalTuning withMinSeparation(Double value) {
    setMinSeparation(new TDecimal(value));
    return this;
  }

}
