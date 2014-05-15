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
 * Java class for FreqConversion complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="FreqConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StageNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TIFNum" minOccurs="0"/>
 *         &lt;element name="OscillatorTuning" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCLO" minOccurs="0"/>
 *         &lt;element name="LOFreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="LOFreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="IFMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="IFMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqConversion", propOrder = {
  "stageNum",
  "oscillatorTuning",
  "loFreqMin",
  "loFreqMax",
  "ifMin",
  "ifMax"
})
public class FreqConversion {

  @XmlElementRef(name = "StageNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TIFNum> stageNum;
  @XmlElementRef(name = "OscillatorTuning", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCLO> oscillatorTuning;
  @XmlElementRef(name = "LOFreqMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> loFreqMin;
  @XmlElementRef(name = "LOFreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> loFreqMax;
  @XmlElementRef(name = "IFMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> ifMin;
  @XmlElementRef(name = "IFMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> ifMax;

  /**
   * Gets the value of the stageNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TIFNum }{@code >}
   * <p>
   */
  public JAXBElement<TIFNum> getStageNum() {
    return stageNum;
  }

  /**
   * Sets the value of the stageNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TIFNum }{@code >}
   * <p>
   */
  public void setStageNum(JAXBElement<TIFNum> value) {
    this.stageNum = value;
  }

  /**
   * Gets the value of the oscillatorTuning property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCLO }{@code >}
   * <p>
   */
  public JAXBElement<TListCLO> getOscillatorTuning() {
    return oscillatorTuning;
  }

  /**
   * Sets the value of the oscillatorTuning property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCLO }{@code >}
   * <p>
   */
  public void setOscillatorTuning(JAXBElement<TListCLO> value) {
    this.oscillatorTuning = value;
  }

  /**
   * Gets the value of the loFreqMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getLOFreqMin() {
    return loFreqMin;
  }

  /**
   * Sets the value of the loFreqMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setLOFreqMin(JAXBElement<TFreqM> value) {
    this.loFreqMin = value;
  }

  /**
   * Gets the value of the loFreqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getLOFreqMax() {
    return loFreqMax;
  }

  /**
   * Sets the value of the loFreqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setLOFreqMax(JAXBElement<TFreqM> value) {
    this.loFreqMax = value;
  }

  /**
   * Gets the value of the ifMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getIFMin() {
    return ifMin;
  }

  /**
   * Sets the value of the ifMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setIFMin(JAXBElement<TFreqM> value) {
    this.ifMin = value;
  }

  /**
   * Gets the value of the ifMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getIFMax() {
    return ifMax;
  }

  /**
   * Sets the value of the ifMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setIFMax(JAXBElement<TFreqM> value) {
    this.ifMax = value;
  }

}
