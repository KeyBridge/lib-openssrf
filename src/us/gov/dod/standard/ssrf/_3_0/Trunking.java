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

import java.util.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

/**
 * <p>
 * Java class for Trunking complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Trunking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalChannelsRationale" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Dispatcher" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS1" minOccurs="0"/>
 *         &lt;element name="DispatcherExplanation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="EstimatedExpansionCost" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS70" minOccurs="0"/>
 *         &lt;element name="ExpansionTargetDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="FreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="NSEPUse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="NumFreqsRequired" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10" minOccurs="0"/>
 *         &lt;element name="NumRepeaters" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN7" minOccurs="0"/>
 *         &lt;element name="NumUsers" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10" minOccurs="0"/>
 *         &lt;element name="PreviousSPSDocketNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12" minOccurs="0"/>
 *         &lt;element name="RequestForExpansion" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="SeparateSystemJustification" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="FreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="TrunkingAssignment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TrunkingAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trunking", propOrder = {
  "additionalChannelsRationale",
  "dispatcher",
  "dispatcherExplanation",
  "estimatedExpansionCost",
  "expansionTargetDate",
  "freqMax",
  "nsepUse",
  "numFreqsRequired",
  "numRepeaters",
  "numUsers",
  "previousSPSDocketNum",
  "requestForExpansion",
  "separateSystemJustification",
  "freqMin",
  "trunkingAssignment"
})
public class Trunking {

  @XmlElement(name = "AdditionalChannelsRationale", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString additionalChannelsRationale;
  @XmlElement(name = "Dispatcher", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS1.class)
  private TString dispatcher;
  @XmlElement(name = "DispatcherExplanation", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString dispatcherExplanation;
  @XmlElement(name = "EstimatedExpansionCost", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS70.class)
  private TString estimatedExpansionCost;
  @XmlElement(name = "ExpansionTargetDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expansionTargetDate;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "NSEPUse", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString nsepUse;
  @XmlElement(name = "NumFreqsRequired", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN10.class)
  private TInteger numFreqsRequired;
  @XmlElement(name = "NumRepeaters", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN7.class)
  private TInteger numRepeaters;
  @XmlElement(name = "NumUsers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN10.class)
  private TInteger numUsers;
  @XmlElement(name = "PreviousSPSDocketNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString previousSPSDocketNum;
  @XmlElement(name = "RequestForExpansion", required = false)
  private TString requestForExpansion;
  @XmlElement(name = "SeparateSystemJustification", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString separateSystemJustification;
  @XmlElement(name = "FreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "TrunkingAssignment")
  private List<TrunkingAssignment> trunkingAssignment;

  /**
   * Gets the value of the additionalChannelsRationale property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getAdditionalChannelsRationale() {
    return additionalChannelsRationale;
  }

  /**
   * Sets the value of the additionalChannelsRationale property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setAdditionalChannelsRationale(TString value) {
    this.additionalChannelsRationale = value;
  }

  public boolean isSetAdditionalChannelsRationale() {
    return (this.additionalChannelsRationale != null);
  }

  /**
   * Gets the value of the dispatcher property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS1 }{@code >}
   * <p>
   */
  public TString getDispatcher() {
    return dispatcher;
  }

  /**
   * Sets the value of the dispatcher property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS1 }{@code >}
   * <p>
   */
  public void setDispatcher(TString value) {
    this.dispatcher = value;
  }

  public boolean isSetDispatcher() {
    return (this.dispatcher != null);
  }

  /**
   * Gets the value of the dispatcherExplanation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getDispatcherExplanation() {
    return dispatcherExplanation;
  }

  /**
   * Sets the value of the dispatcherExplanation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setDispatcherExplanation(TString value) {
    this.dispatcherExplanation = value;
  }

  public boolean isSetDispatcherExplanation() {
    return (this.dispatcherExplanation != null);
  }

  /**
   * Gets the value of the estimatedExpansionCost property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS70 }{@code >}
   * <p>
   */
  public TString getEstimatedExpansionCost() {
    return estimatedExpansionCost;
  }

  /**
   * Sets the value of the estimatedExpansionCost property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS70 }{@code >}
   * <p>
   */
  public void setEstimatedExpansionCost(TString value) {
    this.estimatedExpansionCost = value;
  }

  public boolean isSetEstimatedExpansionCost() {
    return (this.estimatedExpansionCost != null);
  }

  /**
   * Gets the value of the expansionTargetDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getExpansionTargetDate() {
    return expansionTargetDate;
  }

  /**
   * Sets the value of the expansionTargetDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpansionTargetDate(TCalendar value) {
    this.expansionTargetDate = value;
  }

  public boolean isSetExpansionTargetDate() {
    return (this.expansionTargetDate != null);
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
   * Gets the value of the nsepUse property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getNSEPUse() {
    return nsepUse;
  }

  /**
   * Sets the value of the nsepUse property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setNSEPUse(TString value) {
    this.nsepUse = value;
  }

  public boolean isSetNSEPUse() {
    return (this.nsepUse != null);
  }

  /**
   * Gets the value of the numFreqsRequired property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public TInteger getNumFreqsRequired() {
    return numFreqsRequired;
  }

  /**
   * Sets the value of the numFreqsRequired property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public void setNumFreqsRequired(TInteger value) {
    this.numFreqsRequired = value;
  }

  public boolean isSetNumFreqsRequired() {
    return (this.numFreqsRequired != null);
  }

  /**
   * Gets the value of the numRepeaters property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN7 }{@code >}
   * <p>
   */
  public TInteger getNumRepeaters() {
    return numRepeaters;
  }

  /**
   * Sets the value of the numRepeaters property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN7 }{@code >}
   * <p>
   */
  public void setNumRepeaters(TInteger value) {
    this.numRepeaters = value;
  }

  public boolean isSetNumRepeaters() {
    return (this.numRepeaters != null);
  }

  /**
   * Gets the value of the numUsers property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public TInteger getNumUsers() {
    return numUsers;
  }

  /**
   * Sets the value of the numUsers property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public void setNumUsers(TInteger value) {
    this.numUsers = value;
  }

  public boolean isSetNumUsers() {
    return (this.numUsers != null);
  }

  /**
   * Gets the value of the previousSPSDocketNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public TString getPreviousSPSDocketNum() {
    return previousSPSDocketNum;
  }

  /**
   * Sets the value of the previousSPSDocketNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public void setPreviousSPSDocketNum(TString value) {
    this.previousSPSDocketNum = value;
  }

  public boolean isSetPreviousSPSDocketNum() {
    return (this.previousSPSDocketNum != null);
  }

  /**
   * Gets the value of the requestForExpansion property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getRequestForExpansion() {
    return requestForExpansion;
  }

  /**
   * Sets the value of the requestForExpansion property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setRequestForExpansion(TString value) {
    this.requestForExpansion = value;
  }

  public boolean isSetRequestForExpansion() {
    return (this.requestForExpansion != null);
  }

  /**
   * Gets the value of the separateSystemJustification property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getSeparateSystemJustification() {
    return separateSystemJustification;
  }

  /**
   * Sets the value of the separateSystemJustification property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setSeparateSystemJustification(TString value) {
    this.separateSystemJustification = value;
  }

  public boolean isSetSeparateSystemJustification() {
    return (this.separateSystemJustification != null);
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  public boolean isSetFreqMin() {
    return (this.freqMin != null);
  }

  /**
   * Gets the value of the trunkingAssignment property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the trunkingAssignment property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTrunkingAssignment().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link TrunkingAssignment }
   * <p>
   * <p>
   * @return
   */
  public List<TrunkingAssignment> getTrunkingAssignment() {
    if (trunkingAssignment == null) {
      trunkingAssignment = new ArrayList<>();
    }
    return this.trunkingAssignment;
  }

  public boolean isSetTrunkingAssignment() {
    return ((this.trunkingAssignment != null) && (!this.trunkingAssignment.isEmpty()));
  }

  public void unsetTrunkingAssignment() {
    this.trunkingAssignment = null;
  }

  public Trunking withAdditionalChannelsRationale(String value) {
    setAdditionalChannelsRationale(new TString(value));
    return this;
  }

  public Trunking withDispatcher(String value) {
    setDispatcher(new TString(value));
    return this;
  }

  public Trunking withDispatcherExplanation(String value) {
    setDispatcherExplanation(new TString(value));
    return this;
  }

  public Trunking withEstimatedExpansionCost(String value) {
    setEstimatedExpansionCost(new TString(value));
    return this;
  }

  public Trunking withExpansionTargetDate(Calendar value) {
    setExpansionTargetDate(new TCalendar(value));
    return this;
  }

  public Trunking withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public Trunking withNSEPUse(String value) {
    setNSEPUse(new TString(value));
    return this;
  }

  public Trunking withNumFreqsRequired(Integer value) {
    setNumFreqsRequired(new TInteger(value));
    return this;
  }

  public Trunking withNumRepeaters(Integer value) {
    setNumRepeaters(new TInteger(value));
    return this;
  }

  public Trunking withNumUsers(Integer value) {
    setNumUsers(new TInteger(value));
    return this;
  }

  public Trunking withPreviousSPSDocketNum(String value) {
    setPreviousSPSDocketNum(new TString(value));
    return this;
  }

  public Trunking withRequestForExpansion(ListCBO value) {
    setRequestForExpansion(new TString(value.value()));
    return this;
  }

  public Trunking withSeparateSystemJustification(String value) {
    setSeparateSystemJustification(new TString(value));
    return this;
  }

  public Trunking withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public Trunking withTrunkingAssignment(TrunkingAssignment... values) {
    if (values != null) {
      getTrunkingAssignment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Trunking withTrunkingAssignment(Collection<TrunkingAssignment> values) {
    if (values != null) {
      getTrunkingAssignment().addAll(values);
    }
    return this;
  }

}
