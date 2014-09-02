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
import us.gov.dod.standard.ssrf._3_0.datatype.TUN4;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqM;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10_3;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN9_6;
import us.gov.dod.standard.ssrf._3_0.datatype.TdB;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBO;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN5;
import us.gov.dod.standard.ssrf._3_0.datatype.TS50;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN12;
import us.gov.dod.standard.ssrf._3_0.datatype.TMChips;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for SpreadSpectrum complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="SpreadSpectrum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp" minOccurs="0"/>
 *         &lt;element name="MaxGain" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="PulseFreqDev" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="InfoDataRate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10_3" minOccurs="0"/>
 *         &lt;element name="ChipRate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMChips" minOccurs="0"/>
 *         &lt;element name="CodeRate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10_3" minOccurs="0"/>
 *         &lt;element name="PulseChirpRate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9_6" minOccurs="0"/>
 *         &lt;element name="PulseChirpFreqShift" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="PulseChirpDurationMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Tmicrosecs" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}TimeHop" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Hopset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpreadSpectrum", propOrder = {
  "type",
  "freqMin",
  "freqMax",
  "maxGain",
  "pulseFreqDev",
  "infoDataRate",
  "chipRate",
  "codeRate",
  "pulseChirpRate",
  "pulseChirpFreqShift",
  "pulseChirpDurationMin",
  "timeHopNumSlots",
  "timeHopPulsesPerDwell",
  "hopRate",
  "hopDwell",
  "numFreqsPerHopset",
  "numHopsets",
  "freqBlocking"
})
public class SpreadSpectrum {

  @XmlElementRef(name = "Type", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> type;
  @XmlElement(name = "FreqMin")
  protected TFreqM freqMin;
  @XmlElementRef(name = "FreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freqMax;
  @XmlElementRef(name = "MaxGain", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> maxGain;
  @XmlElementRef(name = "PulseFreqDev", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> pulseFreqDev;
  @XmlElementRef(name = "InfoDataRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN10_3> infoDataRate;
  @XmlElementRef(name = "ChipRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMChips> chipRate;
  @XmlElementRef(name = "CodeRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN10_3> codeRate;
  @XmlElementRef(name = "PulseChirpRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9_6> pulseChirpRate;
  @XmlElementRef(name = "PulseChirpFreqShift", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> pulseChirpFreqShift;
  @XmlElementRef(name = "PulseChirpDurationMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> pulseChirpDurationMin;
  @XmlElementRef(name = "TimeHopNumSlots", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5> timeHopNumSlots;
  @XmlElementRef(name = "TimeHopPulsesPerDwell", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN12> timeHopPulsesPerDwell;
  @XmlElementRef(name = "HopRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Thops> hopRate;
  @XmlElementRef(name = "HopDwell", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> hopDwell;
  @XmlElementRef(name = "NumFreqsPerHopset", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> numFreqsPerHopset;
  @XmlElementRef(name = "NumHopsets", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> numHopsets;
  @XmlElementRef(name = "FreqBlocking", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> freqBlocking;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setType(JAXBElement<TS50> value) {
    this.type = value;
  }

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
   * Gets the value of the maxGain property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getMaxGain() {
    return maxGain;
  }

  /**
   * Sets the value of the maxGain property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setMaxGain(JAXBElement<TdB> value) {
    this.maxGain = value;
  }

  /**
   * Gets the value of the pulseFreqDev property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getPulseFreqDev() {
    return pulseFreqDev;
  }

  /**
   * Sets the value of the pulseFreqDev property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setPulseFreqDev(JAXBElement<TFreqM> value) {
    this.pulseFreqDev = value;
  }

  /**
   * Gets the value of the infoDataRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN10_3> getInfoDataRate() {
    return infoDataRate;
  }

  /**
   * Sets the value of the infoDataRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10_3 }{@code >}
   * <p>
   */
  public void setInfoDataRate(JAXBElement<TUN10_3> value) {
    this.infoDataRate = value;
  }

  /**
   * Gets the value of the chipRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMChips }{@code >}
   * <p>
   */
  public JAXBElement<TMChips> getChipRate() {
    return chipRate;
  }

  /**
   * Sets the value of the chipRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMChips }{@code >}
   * <p>
   */
  public void setChipRate(JAXBElement<TMChips> value) {
    this.chipRate = value;
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
   * Gets the value of the pulseChirpRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9_6 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9_6> getPulseChirpRate() {
    return pulseChirpRate;
  }

  /**
   * Sets the value of the pulseChirpRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9_6 }{@code >}
   * <p>
   */
  public void setPulseChirpRate(JAXBElement<TUN9_6> value) {
    this.pulseChirpRate = value;
  }

  /**
   * Gets the value of the pulseChirpFreqShift property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getPulseChirpFreqShift() {
    return pulseChirpFreqShift;
  }

  /**
   * Sets the value of the pulseChirpFreqShift property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setPulseChirpFreqShift(JAXBElement<TFreqM> value) {
    this.pulseChirpFreqShift = value;
  }

  /**
   * Gets the value of the pulseChirpDurationMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getPulseChirpDurationMin() {
    return pulseChirpDurationMin;
  }

  /**
   * Sets the value of the pulseChirpDurationMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setPulseChirpDurationMin(JAXBElement<Tmicrosecs> value) {
    this.pulseChirpDurationMin = value;
  }

  /**
   * Gets the value of the timeHopNumSlots property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5> getTimeHopNumSlots() {
    return timeHopNumSlots;
  }

  /**
   * Sets the value of the timeHopNumSlots property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setTimeHopNumSlots(JAXBElement<TUN5> value) {
    this.timeHopNumSlots = value;
  }

  /**
   * Gets the value of the timeHopPulsesPerDwell property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN12 }{@code >}
   * <p>
   */
  public JAXBElement<TUN12> getTimeHopPulsesPerDwell() {
    return timeHopPulsesPerDwell;
  }

  /**
   * Sets the value of the timeHopPulsesPerDwell property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN12 }{@code >}
   * <p>
   */
  public void setTimeHopPulsesPerDwell(JAXBElement<TUN12> value) {
    this.timeHopPulsesPerDwell = value;
  }

  /**
   * Gets the value of the hopRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Thops }{@code >}
   * <p>
   */
  public JAXBElement<Thops> getHopRate() {
    return hopRate;
  }

  /**
   * Sets the value of the hopRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Thops }{@code >}
   * <p>
   */
  public void setHopRate(JAXBElement<Thops> value) {
    this.hopRate = value;
  }

  /**
   * Gets the value of the hopDwell property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getHopDwell() {
    return hopDwell;
  }

  /**
   * Sets the value of the hopDwell property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setHopDwell(JAXBElement<Tmicrosecs> value) {
    this.hopDwell = value;
  }

  /**
   * Gets the value of the numFreqsPerHopset property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getNumFreqsPerHopset() {
    return numFreqsPerHopset;
  }

  /**
   * Sets the value of the numFreqsPerHopset property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setNumFreqsPerHopset(JAXBElement<TUN4> value) {
    this.numFreqsPerHopset = value;
  }

  /**
   * Gets the value of the numHopsets property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getNumHopsets() {
    return numHopsets;
  }

  /**
   * Sets the value of the numHopsets property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setNumHopsets(JAXBElement<TUN4> value) {
    this.numHopsets = value;
  }

  /**
   * Gets the value of the freqBlocking property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getFreqBlocking() {
    return freqBlocking;
  }

  /**
   * Sets the value of the freqBlocking property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setFreqBlocking(JAXBElement<TListCBO> value) {
    this.freqBlocking = value;
  }

}
