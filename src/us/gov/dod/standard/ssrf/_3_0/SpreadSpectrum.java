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
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;

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

  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString type;
  @XmlElement(name = "FreqMin")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "MaxGain", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal maxGain;
  @XmlElement(name = "PulseFreqDev", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pulseFreqDev;
  @XmlElement(name = "InfoDataRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN10_3.class)
  private TDecimal infoDataRate;
  @XmlElement(name = "ChipRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMCHIPS.class)
  private TDecimal chipRate;
  @XmlElement(name = "CodeRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN10_3.class)
  private TDecimal codeRate;
  @XmlElement(name = "PulseChirpRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN9_6.class)
  private TDecimal pulseChirpRate;
  @XmlElement(name = "PulseChirpFreqShift", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pulseChirpFreqShift;
  @XmlElement(name = "PulseChirpDurationMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pulseChirpDurationMin;
  @XmlElement(name = "TimeHopNumSlots", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger timeHopNumSlots;
  @XmlElement(name = "TimeHopPulsesPerDwell", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN12.class)
  private TInteger timeHopPulsesPerDwell;
  @XmlElement(name = "HopRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterHOPS.class)
  private TDecimal hopRate;
  @XmlElement(name = "HopDwell", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal hopDwell;
  @XmlElement(name = "NumFreqsPerHopset", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger numFreqsPerHopset;
  @XmlElement(name = "NumHopsets", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger numHopsets;
  @XmlElement(name = "FreqBlocking", required = false)
  private TString freqBlocking;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return 
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value 
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
   *         
   * <p>
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the maxGain property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getMaxGain() {
    return maxGain;
  }

  /**
   * Sets the value of the maxGain property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setMaxGain(TDecimal value) {
    this.maxGain = value;
  }

  public boolean isSetMaxGain() {
    return (this.maxGain != null);
  }

  /**
   * Gets the value of the pulseFreqDev property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPulseFreqDev() {
    return pulseFreqDev;
  }

  /**
   * Sets the value of the pulseFreqDev property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPulseFreqDev(TDecimal value) {
    this.pulseFreqDev = value;
  }

  public boolean isSetPulseFreqDev() {
    return (this.pulseFreqDev != null);
  }

  /**
   * Gets the value of the infoDataRate property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getInfoDataRate() {
    return infoDataRate;
  }

  /**
   * Sets the value of the infoDataRate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setInfoDataRate(TDecimal value) {
    this.infoDataRate = value;
  }

  public boolean isSetInfoDataRate() {
    return (this.infoDataRate != null);
  }

  /**
   * Gets the value of the chipRate property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getChipRate() {
    return chipRate;
  }

  /**
   * Sets the value of the chipRate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setChipRate(TDecimal value) {
    this.chipRate = value;
  }

  public boolean isSetChipRate() {
    return (this.chipRate != null);
  }

  /**
   * Gets the value of the codeRate property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getCodeRate() {
    return codeRate;
  }

  /**
   * Sets the value of the codeRate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setCodeRate(TDecimal value) {
    this.codeRate = value;
  }

  public boolean isSetCodeRate() {
    return (this.codeRate != null);
  }

  /**
   * Gets the value of the pulseChirpRate property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPulseChirpRate() {
    return pulseChirpRate;
  }

  /**
   * Sets the value of the pulseChirpRate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPulseChirpRate(TDecimal value) {
    this.pulseChirpRate = value;
  }

  public boolean isSetPulseChirpRate() {
    return (this.pulseChirpRate != null);
  }

  /**
   * Gets the value of the pulseChirpFreqShift property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPulseChirpFreqShift() {
    return pulseChirpFreqShift;
  }

  /**
   * Sets the value of the pulseChirpFreqShift property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPulseChirpFreqShift(TDecimal value) {
    this.pulseChirpFreqShift = value;
  }

  public boolean isSetPulseChirpFreqShift() {
    return (this.pulseChirpFreqShift != null);
  }

  /**
   * Gets the value of the pulseChirpDurationMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPulseChirpDurationMin() {
    return pulseChirpDurationMin;
  }

  /**
   * Sets the value of the pulseChirpDurationMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPulseChirpDurationMin(TDecimal value) {
    this.pulseChirpDurationMin = value;
  }

  public boolean isSetPulseChirpDurationMin() {
    return (this.pulseChirpDurationMin != null);
  }

  /**
   * Gets the value of the timeHopNumSlots property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getTimeHopNumSlots() {
    return timeHopNumSlots;
  }

  /**
   * Sets the value of the timeHopNumSlots property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setTimeHopNumSlots(TInteger value) {
    this.timeHopNumSlots = value;
  }

  public boolean isSetTimeHopNumSlots() {
    return (this.timeHopNumSlots != null);
  }

  /**
   * Gets the value of the timeHopPulsesPerDwell property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getTimeHopPulsesPerDwell() {
    return timeHopPulsesPerDwell;
  }

  /**
   * Sets the value of the timeHopPulsesPerDwell property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setTimeHopPulsesPerDwell(TInteger value) {
    this.timeHopPulsesPerDwell = value;
  }

  public boolean isSetTimeHopPulsesPerDwell() {
    return (this.timeHopPulsesPerDwell != null);
  }

  /**
   * Gets the value of the hopRate property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getHopRate() {
    return hopRate;
  }

  /**
   * Sets the value of the hopRate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setHopRate(TDecimal value) {
    this.hopRate = value;
  }

  public boolean isSetHopRate() {
    return (this.hopRate != null);
  }

  /**
   * Gets the value of the hopDwell property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getHopDwell() {
    return hopDwell;
  }

  /**
   * Sets the value of the hopDwell property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setHopDwell(TDecimal value) {
    this.hopDwell = value;
  }

  public boolean isSetHopDwell() {
    return (this.hopDwell != null);
  }

  /**
   * Gets the value of the numFreqsPerHopset property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getNumFreqsPerHopset() {
    return numFreqsPerHopset;
  }

  /**
   * Sets the value of the numFreqsPerHopset property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNumFreqsPerHopset(TInteger value) {
    this.numFreqsPerHopset = value;
  }

  public boolean isSetNumFreqsPerHopset() {
    return (this.numFreqsPerHopset != null);
  }

  /**
   * Gets the value of the numHopsets property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getNumHopsets() {
    return numHopsets;
  }

  /**
   * Sets the value of the numHopsets property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNumHopsets(TInteger value) {
    this.numHopsets = value;
  }

  public boolean isSetNumHopsets() {
    return (this.numHopsets != null);
  }

  /**
   * Gets the value of the freqBlocking property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getFreqBlocking() {
    return freqBlocking;
  }

  /**
   * Sets the value of the freqBlocking property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setFreqBlocking(TString value) {
    this.freqBlocking = value;
  }

  public boolean isSetFreqBlocking() {
    return (this.freqBlocking != null);
  }

  public SpreadSpectrum withType(String value) {
    setType(new TString(value));
    return this;
  }

  public SpreadSpectrum withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withMaxGain(Double value) {
    setMaxGain(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withPulseFreqDev(Double value) {
    setPulseFreqDev(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withInfoDataRate(Double value) {
    setInfoDataRate(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withChipRate(Double value) {
    setChipRate(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withCodeRate(Double value) {
    setCodeRate(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withPulseChirpRate(Double value) {
    setPulseChirpRate(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withPulseChirpFreqShift(Double value) {
    setPulseChirpFreqShift(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withPulseChirpDurationMin(Double value) {
    setPulseChirpDurationMin(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withTimeHopNumSlots(Integer value) {
    setTimeHopNumSlots(new TInteger(value));
    return this;
  }

  public SpreadSpectrum withTimeHopPulsesPerDwell(Integer value) {
    setTimeHopPulsesPerDwell(new TInteger(value));
    return this;
  }

  public SpreadSpectrum withHopRate(Double value) {
    setHopRate(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withHopDwell(Double value) {
    setHopDwell(new TDecimal(value));
    return this;
  }

  public SpreadSpectrum withNumFreqsPerHopset(Integer value) {
    setNumFreqsPerHopset(new TInteger(value));
    return this;
  }

  public SpreadSpectrum withNumHopsets(Integer value) {
    setNumHopsets(new TInteger(value));
    return this;
  }

  public SpreadSpectrum withFreqBlocking(ListCBO value) {
    setFreqBlocking(new TString(value.value()));
    return this;
  }

}
