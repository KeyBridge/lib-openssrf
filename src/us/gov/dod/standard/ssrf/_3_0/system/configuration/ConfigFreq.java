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
package us.gov.dod.standard.ssrf._3_0.system.configuration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * <p>
 * Java class for ConfigFreq complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="ConfigFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp"/>
 *         &lt;element name="InBand" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Priority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigFreq", propOrder = {
  "freqMin",
  "freqMax",
  "inBand",
  "priority"
})
public class ConfigFreq {

  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "InBand", required = false)
  private TString inBand;
  @XmlElement(name = "Priority", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString priority;

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
   * Gets the value of the inBand property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getInBand() {
    return inBand;
  }

  /**
   * Sets the value of the inBand property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setInBand(TString value) {
    this.inBand = value;
  }

  public boolean isSetInBand() {
    return (this.inBand != null);
  }

  /**
   * Gets the value of the priority property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  public boolean isSetPriority() {
    return (this.priority != null);
  }

  public ConfigFreq withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public ConfigFreq withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public ConfigFreq withInBand(ListCBO value) {
    setInBand(new TString(value.value()));
    return this;
  }

  public ConfigFreq withPriority(String value) {
    setPriority(new TString(value));
    return this;
  }

}
