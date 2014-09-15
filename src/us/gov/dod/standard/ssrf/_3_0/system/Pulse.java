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
package us.gov.dod.standard.ssrf._3_0.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

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
 * &lt;complexType name="Pulse"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseCycle" minOccurs="0"/>
 * &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseAvgCycle"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseComp"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PulseForm"
 * minOccurs="0"/> &lt;element name="RadarProcessingGainMax"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/> &lt;element
 * name="NumSubpulses" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10"
 * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
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

  @XmlElement(name = "PRRMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN9_3.class)
  private TDecimal prrMin;
  @XmlElement(name = "PRRMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN9_3.class)
  private TDecimal prrMax;
  @XmlElement(name = "PDMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMin;
  @XmlElement(name = "PDMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal pdMax;
  @XmlElement(name = "DutyCycleMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal dutyCycleMin;
  @XmlElement(name = "DutyCycleMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal dutyCycleMax;
  @XmlElement(name = "AvgPowerMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal avgPowerMin;
  @XmlElement(name = "AvgPowerMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal avgPowerMax;
  @XmlElement(name = "CompRatio", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN8_4.class)
  private TDecimal compRatio;
  @XmlElement(name = "CompMethod", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString compMethod;
  @XmlElement(name = "RiseTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal riseTime;
  @XmlElement(name = "FallTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal fallTime;
  @XmlElement(name = "JustifyShortRiseTime", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString justifyShortRiseTime;
  @XmlElement(name = "RadarProcessingGainMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal radarProcessingGainMax;
  @XmlElement(name = "NumSubpulses", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN10.class)
  private TInteger numSubpulses;

  /**
   * Gets the value of the prrMin property.
   * <p>
   * @return 
   */
  public TDecimal getPRRMin() {
    return prrMin;
  }

  /**
   * Sets the value of the prrMin property.
   * <p>
   * @param value 
   */
  public void setPRRMin(TDecimal value) {
    this.prrMin = value;
  }

  public boolean isSetPRRMin() {
    return (this.prrMin != null);
  }

  /**
   * Gets the value of the prrMax property.
   * <p>
   * @return 
   */
  public TDecimal getPRRMax() {
    return prrMax;
  }

  /**
   * Sets the value of the prrMax property.
   * <p>
   * @param value 
   */
  public void setPRRMax(TDecimal value) {
    this.prrMax = value;
  }

  public boolean isSetPRRMax() {
    return (this.prrMax != null);
  }

  /**
   * Gets the value of the pdMin property.
   * <p>
   * @return 
   */
  public TDecimal getPDMin() {
    return pdMin;
  }

  /**
   * Sets the value of the pdMin property.
   * <p>
   * @param value 
   */
  public void setPDMin(TDecimal value) {
    this.pdMin = value;
  }

  public boolean isSetPDMin() {
    return (this.pdMin != null);
  }

  /**
   * Gets the value of the pdMax property.
   * <p>
   * @return 
   */
  public TDecimal getPDMax() {
    return pdMax;
  }

  /**
   * Sets the value of the pdMax property.
   * <p>
   * @param value 
   */
  public void setPDMax(TDecimal value) {
    this.pdMax = value;
  }

  public boolean isSetPDMax() {
    return (this.pdMax != null);
  }

  /**
   * Gets the value of the dutyCycleMin property.
   * <p>
   * @return 
   */
  public TDecimal getDutyCycleMin() {
    return dutyCycleMin;
  }

  /**
   * Sets the value of the dutyCycleMin property.
   * <p>
   * @param value 
   */
  public void setDutyCycleMin(TDecimal value) {
    this.dutyCycleMin = value;
  }

  public boolean isSetDutyCycleMin() {
    return (this.dutyCycleMin != null);
  }

  /**
   * Gets the value of the dutyCycleMax property.
   * <p>
   * @return 
   */
  public TDecimal getDutyCycleMax() {
    return dutyCycleMax;
  }

  /**
   * Sets the value of the dutyCycleMax property.
   * <p>
   * @param value 
   */
  public void setDutyCycleMax(TDecimal value) {
    this.dutyCycleMax = value;
  }

  public boolean isSetDutyCycleMax() {
    return (this.dutyCycleMax != null);
  }

  /**
   * Gets the value of the avgPowerMin property.
   * <p>
   * @return 
   */
  public TDecimal getAvgPowerMin() {
    return avgPowerMin;
  }

  /**
   * Sets the value of the avgPowerMin property.
   * <p>
   * @param value 
   */
  public void setAvgPowerMin(TDecimal value) {
    this.avgPowerMin = value;
  }

  public boolean isSetAvgPowerMin() {
    return (this.avgPowerMin != null);
  }

  /**
   * Gets the value of the avgPowerMax property.
   * <p>
   * @return 
   */
  public TDecimal getAvgPowerMax() {
    return avgPowerMax;
  }

  /**
   * Sets the value of the avgPowerMax property.
   * <p>
   * @param value 
   */
  public void setAvgPowerMax(TDecimal value) {
    this.avgPowerMax = value;
  }

  public boolean isSetAvgPowerMax() {
    return (this.avgPowerMax != null);
  }

  /**
   * Gets the value of the compRatio property.
   * <p>
   * @return 
   */
  public TDecimal getCompRatio() {
    return compRatio;
  }

  /**
   * Sets the value of the compRatio property.
   * <p>
   * @param value 
   */
  public void setCompRatio(TDecimal value) {
    this.compRatio = value;
  }

  public boolean isSetCompRatio() {
    return (this.compRatio != null);
  }

  /**
   * Gets the value of the compMethod property.
   * <p>
   * @return 
   */
  public TString getCompMethod() {
    return compMethod;
  }

  /**
   * Sets the value of the compMethod property.
   * <p>
   * @param value 
   */
  public void setCompMethod(TString value) {
    this.compMethod = value;
  }

  public boolean isSetCompMethod() {
    return (this.compMethod != null);
  }

  /**
   * Gets the value of the riseTime property.
   * <p>
   * @return 
   */
  public TDecimal getRiseTime() {
    return riseTime;
  }

  /**
   * Sets the value of the riseTime property.
   * <p>
   * @param value 
   */
  public void setRiseTime(TDecimal value) {
    this.riseTime = value;
  }

  public boolean isSetRiseTime() {
    return (this.riseTime != null);
  }

  /**
   * Gets the value of the fallTime property.
   * <p>
   * @return 
   */
  public TDecimal getFallTime() {
    return fallTime;
  }

  /**
   * Sets the value of the fallTime property.
   * <p>
   * @param value 
   */
  public void setFallTime(TDecimal value) {
    this.fallTime = value;
  }

  public boolean isSetFallTime() {
    return (this.fallTime != null);
  }

  /**
   * Gets the value of the justifyShortRiseTime property.
   * <p>
   * @return 
   */
  public TString getJustifyShortRiseTime() {
    return justifyShortRiseTime;
  }

  /**
   * Sets the value of the justifyShortRiseTime property.
   * <p>
   * @param value 
   */
  public void setJustifyShortRiseTime(TString value) {
    this.justifyShortRiseTime = value;
  }

  public boolean isSetJustifyShortRiseTime() {
    return (this.justifyShortRiseTime != null);
  }

  /**
   * Gets the value of the radarProcessingGainMax property.
   * <p>
   * @return 
   */
  public TDecimal getRadarProcessingGainMax() {
    return radarProcessingGainMax;
  }

  /**
   * Sets the value of the radarProcessingGainMax property.
   * <p>
   * @param value 
   */
  public void setRadarProcessingGainMax(TDecimal value) {
    this.radarProcessingGainMax = value;
  }

  public boolean isSetRadarProcessingGainMax() {
    return (this.radarProcessingGainMax != null);
  }

  /**
   * Gets the value of the numSubpulses property.
   * <p>
   * @return 
   */
  public TInteger getNumSubpulses() {
    return numSubpulses;
  }

  /**
   * Sets the value of the numSubpulses property.
   * <p>
   * @param value 
   */
  public void setNumSubpulses(TInteger value) {
    this.numSubpulses = value;
  }

  public boolean isSetNumSubpulses() {
    return (this.numSubpulses != null);
  }

  public Pulse withPRRMin(Double value) {
    setPRRMin(new TDecimal(value));
    return this;
  }

  public Pulse withPRRMax(Double value) {
    setPRRMax(new TDecimal(value));
    return this;
  }

  public Pulse withPDMin(Double value) {
    setPDMin(new TDecimal(value));
    return this;
  }

  public Pulse withPDMax(Double value) {
    setPDMax(new TDecimal(value));
    return this;
  }

  public Pulse withDutyCycleMin(Double value) {
    setDutyCycleMin(new TDecimal(value));
    return this;
  }

  public Pulse withDutyCycleMax(Double value) {
    setDutyCycleMax(new TDecimal(value));
    return this;
  }

  public Pulse withAvgPowerMin(Double value) {
    setAvgPowerMin(new TDecimal(value));
    return this;
  }

  public Pulse withAvgPowerMax(Double value) {
    setAvgPowerMax(new TDecimal(value));
    return this;
  }

  public Pulse withCompRatio(Double value) {
    setCompRatio(new TDecimal(value));
    return this;
  }

  public Pulse withCompMethod(String value) {
    setCompMethod(new TString(value));
    return this;
  }

  public Pulse withRiseTime(Double value) {
    setRiseTime(new TDecimal(value));
    return this;
  }

  public Pulse withFallTime(Double value) {
    setFallTime(new TDecimal(value));
    return this;
  }

  public Pulse withJustifyShortRiseTime(String value) {
    setJustifyShortRiseTime(new TString(value));
    return this;
  }

  public Pulse withRadarProcessingGainMax(Double value) {
    setRadarProcessingGainMax(new TDecimal(value));
    return this;
  }

  public Pulse withNumSubpulses(Integer value) {
    setNumSubpulses(new TInteger(value));
    return this;
  }

}
