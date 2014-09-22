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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCPS;

/**
 * Java class for ConfigFreq complex type.
 * <p>
 * This element indicates the set of frequencies that a configuration uses,
 * which may be a subset of the frequencies that the linked components
 * (Transmitter, Receiver, Antenna) are capable of.
 * <p>
 * Sub-Element Of: Configuration
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigFreq", propOrder = {
  "freqMin",
  "freqMax",
  "inBand",
  "priority"
})
public class ConfigFreq {

  /**
   * FreqMin: Enter the nominal frequency or minimum value of the frequency
   * range.
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax: Enter the maximum value of the frequencies in the range.
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * InBand: Enter "Yes" if this frequency range is in compliance with the
   * applicable Frequency Allocation Table. Enter “No” if any portion of the
   * frequency range is not in compliance.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "InBand", required = false)
  private TString inBand;
  /**
   * Priority: Indicator if this spectrum use is Primary, Secondary or
   * Permitted, as defined by the system use and the appropriate
   * Administration's Frequency Allocation Table/guidance.
   * <p>
   * Recommend values from Code List CPS: Code Primary Secondary Permitted Other
   */
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
   * @return
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getInBand() {
    return inBand;
  }

  /**
   * Sets the value of the inBand property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value
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

  public ConfigFreq withPriority(ListCPS value) {
    setPriority(new TString(value.value()));
    return this;
  }

}
