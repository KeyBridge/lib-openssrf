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
package us.gov.dod.standard.ssrf._3_0.assignment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for PairedFreq complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="PairedFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Freq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"/>
 *         &lt;element name="AssignmentRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *         &lt;element name="PairedASN" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS12" minOccurs="0"/>
 *         &lt;element name="PairedType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairedFreq", propOrder = {
  "freq",
  "assignmentRef",
  "pairedASN",
  "pairedType"
})
public class PairedFreq {

  @XmlElement(name = "Freq", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freq;
  @XmlElement(name = "AssignmentRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString assignmentRef;
  @XmlElement(name = "PairedASN", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS12.class)
  private TString pairedASN;
  @XmlElement(name = "PairedType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString pairedType;

  /**
   * Gets the value of the freq property.
   * <p>
   * @return 
   */
  public TDecimal getFreq() {
    return freq;
  }

  /**
   * Sets the value of the freq property.
   * <p>
   * @param value 
   */
  public void setFreq(TDecimal value) {
    this.freq = value;
  }

  public boolean isSetFreq() {
    return (this.freq != null);
  }

  /**
   * Gets the value of the assignmentRef property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getAssignmentRef() {
    return assignmentRef;
  }

  /**
   * Sets the value of the assignmentRef property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAssignmentRef(TString value) {
    this.assignmentRef = value;
  }

  public boolean isSetAssignmentRef() {
    return (this.assignmentRef != null);
  }

  /**
   * Gets the value of the pairedASN property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPairedASN() {
    return pairedASN;
  }

  /**
   * Sets the value of the pairedASN property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPairedASN(TString value) {
    this.pairedASN = value;
  }

  public boolean isSetPairedASN() {
    return (this.pairedASN != null);
  }

  /**
   * Gets the value of the pairedType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPairedType() {
    return pairedType;
  }

  /**
   * Sets the value of the pairedType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPairedType(TString value) {
    this.pairedType = value;
  }

  public boolean isSetPairedType() {
    return (this.pairedType != null);
  }

  public PairedFreq withFreq(Double value) {
    setFreq(new TDecimal(value));
    return this;
  }

  public PairedFreq withAssignmentRef(String value) {
    setAssignmentRef(new TString(value));
    return this;
  }

  public PairedFreq withPairedASN(String value) {
    setPairedASN(new TString(value));
    return this;
  }

  public PairedFreq withPairedType(String value) {
    setPairedType(new TString(value));
    return this;
  }

}
