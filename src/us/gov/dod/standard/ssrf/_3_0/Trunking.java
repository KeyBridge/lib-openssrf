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

import us.gov.dod.standard.ssrf._3_0.datatype.TS70;
import us.gov.dod.standard.ssrf._3_0.datatype.TFreqM;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN7;
import us.gov.dod.standard.ssrf._3_0.datatype.TMEMO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCBO;
import us.gov.dod.standard.ssrf._3_0.datatype.TS1;
import us.gov.dod.standard.ssrf._3_0.datatype.TUN10;
import us.gov.dod.standard.ssrf._3_0.datatype.TS12;
import us.gov.dod.standard.ssrf._3_0.datatype.TD;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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

  @XmlElementRef(name = "AdditionalChannelsRationale", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> additionalChannelsRationale;
  @XmlElementRef(name = "Dispatcher", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS1> dispatcher;
  @XmlElementRef(name = "DispatcherExplanation", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> dispatcherExplanation;
  @XmlElementRef(name = "EstimatedExpansionCost", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS70> estimatedExpansionCost;
  @XmlElementRef(name = "ExpansionTargetDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> expansionTargetDate;
  @XmlElementRef(name = "FreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freqMax;
  @XmlElementRef(name = "NSEPUse", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> nsepUse;
  @XmlElementRef(name = "NumFreqsRequired", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN10> numFreqsRequired;
  @XmlElementRef(name = "NumRepeaters", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN7> numRepeaters;
  @XmlElementRef(name = "NumUsers", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN10> numUsers;
  @XmlElementRef(name = "PreviousSPSDocketNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS12> previousSPSDocketNum;
  @XmlElementRef(name = "RequestForExpansion", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> requestForExpansion;
  @XmlElementRef(name = "SeparateSystemJustification", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> separateSystemJustification;
  @XmlElementRef(name = "FreqMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> freqMin;
  @XmlElement(name = "TrunkingAssignment")
  protected List<TrunkingAssignment> trunkingAssignment;

  /**
   * Gets the value of the additionalChannelsRationale property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getAdditionalChannelsRationale() {
    return additionalChannelsRationale;
  }

  /**
   * Sets the value of the additionalChannelsRationale property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setAdditionalChannelsRationale(JAXBElement<TMEMO> value) {
    this.additionalChannelsRationale = value;
  }

  /**
   * Gets the value of the dispatcher property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS1 }{@code >}
   * <p>
   */
  public JAXBElement<TS1> getDispatcher() {
    return dispatcher;
  }

  /**
   * Sets the value of the dispatcher property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS1 }{@code >}
   * <p>
   */
  public void setDispatcher(JAXBElement<TS1> value) {
    this.dispatcher = value;
  }

  /**
   * Gets the value of the dispatcherExplanation property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getDispatcherExplanation() {
    return dispatcherExplanation;
  }

  /**
   * Sets the value of the dispatcherExplanation property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setDispatcherExplanation(JAXBElement<TMEMO> value) {
    this.dispatcherExplanation = value;
  }

  /**
   * Gets the value of the estimatedExpansionCost property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS70 }{@code >}
   * <p>
   */
  public JAXBElement<TS70> getEstimatedExpansionCost() {
    return estimatedExpansionCost;
  }

  /**
   * Sets the value of the estimatedExpansionCost property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS70 }{@code >}
   * <p>
   */
  public void setEstimatedExpansionCost(JAXBElement<TS70> value) {
    this.estimatedExpansionCost = value;
  }

  /**
   * Gets the value of the expansionTargetDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getExpansionTargetDate() {
    return expansionTargetDate;
  }

  /**
   * Sets the value of the expansionTargetDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpansionTargetDate(JAXBElement<TD> value) {
    this.expansionTargetDate = value;
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
   * Gets the value of the nsepUse property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getNSEPUse() {
    return nsepUse;
  }

  /**
   * Sets the value of the nsepUse property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setNSEPUse(JAXBElement<TMEMO> value) {
    this.nsepUse = value;
  }

  /**
   * Gets the value of the numFreqsRequired property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public JAXBElement<TUN10> getNumFreqsRequired() {
    return numFreqsRequired;
  }

  /**
   * Sets the value of the numFreqsRequired property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public void setNumFreqsRequired(JAXBElement<TUN10> value) {
    this.numFreqsRequired = value;
  }

  /**
   * Gets the value of the numRepeaters property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN7 }{@code >}
   * <p>
   */
  public JAXBElement<TUN7> getNumRepeaters() {
    return numRepeaters;
  }

  /**
   * Sets the value of the numRepeaters property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN7 }{@code >}
   * <p>
   */
  public void setNumRepeaters(JAXBElement<TUN7> value) {
    this.numRepeaters = value;
  }

  /**
   * Gets the value of the numUsers property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public JAXBElement<TUN10> getNumUsers() {
    return numUsers;
  }

  /**
   * Sets the value of the numUsers property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN10 }{@code >}
   * <p>
   */
  public void setNumUsers(JAXBElement<TUN10> value) {
    this.numUsers = value;
  }

  /**
   * Gets the value of the previousSPSDocketNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public JAXBElement<TS12> getPreviousSPSDocketNum() {
    return previousSPSDocketNum;
  }

  /**
   * Sets the value of the previousSPSDocketNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS12 }{@code >}
   * <p>
   */
  public void setPreviousSPSDocketNum(JAXBElement<TS12> value) {
    this.previousSPSDocketNum = value;
  }

  /**
   * Gets the value of the requestForExpansion property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getRequestForExpansion() {
    return requestForExpansion;
  }

  /**
   * Sets the value of the requestForExpansion property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setRequestForExpansion(JAXBElement<TListCBO> value) {
    this.requestForExpansion = value;
  }

  /**
   * Gets the value of the separateSystemJustification property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getSeparateSystemJustification() {
    return separateSystemJustification;
  }

  /**
   * Sets the value of the separateSystemJustification property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setSeparateSystemJustification(JAXBElement<TMEMO> value) {
    this.separateSystemJustification = value;
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setFreqMin(JAXBElement<TFreqM> value) {
    this.freqMin = value;
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
   */
  public List<TrunkingAssignment> getTrunkingAssignment() {
    if (trunkingAssignment == null) {
      trunkingAssignment = new ArrayList<>();
    }
    return this.trunkingAssignment;
  }

}
