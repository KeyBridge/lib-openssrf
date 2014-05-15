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
 * Java class for Pulse complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Pulse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseCycle" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseAvgCycle" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseComp" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseForm" minOccurs="0"/>
 *         &lt;element name="RadarProcessingGainMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="NumSubpulses" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pulse", propOrder = {
  "prrMin",
  "prrMax",
  "pdMin",
  "pdMax",
  "dutyCycleMin",
  "dutyCycleMax",
  "avgPowerMin",
  "avgPowerMax",
  "compRatio",
  "compMethod",
  "riseTime",
  "fallTime",
  "justifyShortRiseTime",
  "radarProcessingGainMax",
  "numSubpulses"
})
public class Pulse {

  @XmlElementRef(name = "PRRMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9_3> prrMin;
  @XmlElementRef(name = "PRRMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9_3> prrMax;
  @XmlElementRef(name = "PDMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> pdMin;
  @XmlElementRef(name = "PDMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> pdMax;
  @XmlElementRef(name = "DutyCycleMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TPercent> dutyCycleMin;
  @XmlElementRef(name = "DutyCycleMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TPercent> dutyCycleMax;
  @XmlElementRef(name = "AvgPowerMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> avgPowerMin;
  @XmlElementRef(name = "AvgPowerMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> avgPowerMax;
  @XmlElementRef(name = "CompRatio", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN8_4> compRatio;
  @XmlElementRef(name = "CompMethod", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS40> compMethod;
  @XmlElementRef(name = "RiseTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> riseTime;
  @XmlElementRef(name = "FallTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> fallTime;
  @XmlElementRef(name = "JustifyShortRiseTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> justifyShortRiseTime;
  @XmlElementRef(name = "RadarProcessingGainMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> radarProcessingGainMax;
  @XmlElementRef(name = "NumSubpulses", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN10> numSubpulses;

  /**
   * Gets the value of the prrMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9_3> getPRRMin() {
    return prrMin;
  }

  /**
   * Sets the value of the prrMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9_3 }{@code >}
   * <p>
   */
  public void setPRRMin(JAXBElement<TUN9_3> value) {
    this.prrMin = value;
  }

  /**
   * Gets the value of the prrMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9_3> getPRRMax() {
    return prrMax;
  }

  /**
   * Sets the value of the prrMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9_3 }{@code >}
   * <p>
   */
  public void setPRRMax(JAXBElement<TUN9_3> value) {
    this.prrMax = value;
  }

  /**
   * Gets the value of the pdMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getPDMin() {
    return pdMin;
  }

  /**
   * Sets the value of the pdMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setPDMin(JAXBElement<Tmicrosecs> value) {
    this.pdMin = value;
  }

  /**
   * Gets the value of the pdMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getPDMax() {
    return pdMax;
  }

  /**
   * Sets the value of the pdMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setPDMax(JAXBElement<Tmicrosecs> value) {
    this.pdMax = value;
  }

  /**
   * Gets the value of the dutyCycleMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public JAXBElement<TPercent> getDutyCycleMin() {
    return dutyCycleMin;
  }

  /**
   * Sets the value of the dutyCycleMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public void setDutyCycleMin(JAXBElement<TPercent> value) {
    this.dutyCycleMin = value;
  }

  /**
   * Gets the value of the dutyCycleMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public JAXBElement<TPercent> getDutyCycleMax() {
    return dutyCycleMax;
  }

  /**
   * Sets the value of the dutyCycleMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public void setDutyCycleMax(JAXBElement<TPercent> value) {
    this.dutyCycleMax = value;
  }

  /**
   * Gets the value of the avgPowerMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getAvgPowerMin() {
    return avgPowerMin;
  }

  /**
   * Sets the value of the avgPowerMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setAvgPowerMin(JAXBElement<TdBW> value) {
    this.avgPowerMin = value;
  }

  /**
   * Gets the value of the avgPowerMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getAvgPowerMax() {
    return avgPowerMax;
  }

  /**
   * Sets the value of the avgPowerMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setAvgPowerMax(JAXBElement<TdBW> value) {
    this.avgPowerMax = value;
  }

  /**
   * Gets the value of the compRatio property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN8_4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN8_4> getCompRatio() {
    return compRatio;
  }

  /**
   * Sets the value of the compRatio property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN8_4 }{@code >}
   * <p>
   */
  public void setCompRatio(JAXBElement<TUN8_4> value) {
    this.compRatio = value;
  }

  /**
   * Gets the value of the compMethod property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public JAXBElement<TS40> getCompMethod() {
    return compMethod;
  }

  /**
   * Sets the value of the compMethod property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public void setCompMethod(JAXBElement<TS40> value) {
    this.compMethod = value;
  }

  /**
   * Gets the value of the riseTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getRiseTime() {
    return riseTime;
  }

  /**
   * Sets the value of the riseTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setRiseTime(JAXBElement<Tmicrosecs> value) {
    this.riseTime = value;
  }

  /**
   * Gets the value of the fallTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getFallTime() {
    return fallTime;
  }

  /**
   * Sets the value of the fallTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setFallTime(JAXBElement<Tmicrosecs> value) {
    this.fallTime = value;
  }

  /**
   * Gets the value of the justifyShortRiseTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getJustifyShortRiseTime() {
    return justifyShortRiseTime;
  }

  /**
   * Sets the value of the justifyShortRiseTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setJustifyShortRiseTime(JAXBElement<TMEMO> value) {
    this.justifyShortRiseTime = value;
  }

  /**
   * Gets the value of the radarProcessingGainMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getRadarProcessingGainMax() {
    return radarProcessingGainMax;
  }

  /**
   * Sets the value of the radarProcessingGainMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setRadarProcessingGainMax(JAXBElement<TdB> value) {
    this.radarProcessingGainMax = value;
  }

  /**
   * Gets the value of the numSubpulses property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public JAXBElement<TUN10> getNumSubpulses() {
    return numSubpulses;
  }

  /**
   * Sets the value of the numSubpulses property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public void setNumSubpulses(JAXBElement<TUN10> value) {
    this.numSubpulses = value;
  }

}
