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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * <p>
 * Java class for Tuning complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Tuning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TuningStep" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 *         &lt;element name="NumFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN4"/>
 *         &lt;element name="Priority" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN1" minOccurs="0"/>
 *         &lt;element name="Exclusive" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqSep" minOccurs="0"/>
 *         &lt;element name="RequestedFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AsgnFreqBase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tuning", propOrder = {
  "tuningStep",
  "numFreq",
  "priority",
  "exclusive",
  "freqSep",
  "freqSepType",
  "requestedFreq"
})
public class Tuning {

  @XmlElement(name = "TuningStep", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  @XmlElement(name = "NumFreq", required = true)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger numFreq;
  @XmlElement(name = "Priority", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN1.class)
  private TInteger priority;
  @XmlElement(name = "Exclusive", required = false)
  private TString exclusive;
  @XmlElement(name = "FreqSep")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqSep;
  @XmlElement(name = "FreqSepType")
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString freqSepType;
  @XmlElement(name = "RequestedFreq")
  private List<AsgnFreqBase> requestedFreq;

  /**
   * Gets the value of the tuningStep property.
   * <p>
   * @return 
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Sets the value of the tuningStep property.
   * <p>
   * @param value 
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  public boolean isSetTuningStep() {
    return (this.tuningStep != null);
  }

  /**
   * Gets the value of the numFreq property.
   * <p>
   * @return 
   */
  public TInteger getNumFreq() {
    return numFreq;
  }

  /**
   * Sets the value of the numFreq property.
   * <p>
   * @param value 
   */
  public void setNumFreq(TInteger value) {
    this.numFreq = value;
  }

  public boolean isSetNumFreq() {
    return (this.numFreq != null);
  }

  /**
   * Gets the value of the priority property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPriority(TInteger value) {
    this.priority = value;
  }

  public boolean isSetPriority() {
    return (this.priority != null);
  }

  /**
   * Gets the value of the exclusive property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getExclusive() {
    return exclusive;
  }

  /**
   * Sets the value of the exclusive property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setExclusive(TString value) {
    this.exclusive = value;
  }

  public boolean isSetExclusive() {
    return (this.exclusive != null);
  }

  /**
   * Gets the value of the freqSep property.
   * <p>
   * @return 
   */
  public TDecimal getFreqSep() {
    return freqSep;
  }

  /**
   * Sets the value of the freqSep property.
   * <p>
   * @param value 
   */
  public void setFreqSep(TDecimal value) {
    this.freqSep = value;
  }

  public boolean isSetFreqSep() {
    return (this.freqSep != null);
  }

  /**
   * Gets the value of the freqSepType property.
   * <p>
   * @return 
   */
  public TString getFreqSepType() {
    return freqSepType;
  }

  /**
   * Sets the value of the freqSepType property.
   * <p>
   * @param value 
   */
  public void setFreqSepType(TString value) {
    this.freqSepType = value;
  }

  public boolean isSetFreqSepType() {
    return (this.freqSepType != null);
  }

  /**
   * Gets the value of the requestedFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the requestedFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRequestedFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * 
   * <p>
   * <p>
   * @return
   */
  public List<AsgnFreqBase> getRequestedFreq() {
    if (requestedFreq == null) {
      requestedFreq = new ArrayList<>();
    }
    return this.requestedFreq;
  }

  public boolean isSetRequestedFreq() {
    return ((this.requestedFreq != null) && (!this.requestedFreq.isEmpty()));
  }

  public void unsetRequestedFreq() {
    this.requestedFreq = null;
  }

  public Tuning withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  public Tuning withNumFreq(Integer value) {
    setNumFreq(new TInteger(value));
    return this;
  }

  public Tuning withPriority(Integer value) {
    setPriority(new TInteger(value));
    return this;
  }

  public Tuning withExclusive(ListCBO value) {
    setExclusive(new TString(value.value()));
    return this;
  }

  public Tuning withFreqSep(Double value) {
    setFreqSep(new TDecimal(value));
    return this;
  }

  public Tuning withFreqSepType(String value) {
    setFreqSepType(new TString(value));
    return this;
  }

  public Tuning withRequestedFreq(AsgnFreqBase... values) {
    if (values != null) {
      getRequestedFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Tuning withRequestedFreq(Collection<AsgnFreqBase> values) {
    if (values != null) {
      getRequestedFreq().addAll(values);
    }
    return this;
  }

}
