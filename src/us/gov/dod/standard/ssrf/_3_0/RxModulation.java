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
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.domains.TString;

/**
 * <p>
 * Java class for RxModulation complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="RxModulation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigitalModType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="MaxBitRate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN10_3" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}DigitalFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxModulation", propOrder = {
  "digitalModType",
  "maxBitRate",
  "numStates",
  "lineCoding",
  "codeRate",
  "codePeriod"
})
@XmlSeeAlso({
  TxModulation.class
})
public class RxModulation {

  @XmlElement(name = "DigitalModType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString digitalModType;
  @XmlElement(name = "MaxBitRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN10_3.class)
  private TDecimal maxBitRate;
  @XmlElement(name = "NumStates", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numStates;
  @XmlElement(name = "LineCoding", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString lineCoding;
  @XmlElement(name = "CodeRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN10_3.class)
  private TDecimal codeRate;
  @XmlElement(name = "CodePeriod", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal codePeriod;

  /**
   * Gets the value of the digitalModType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getDigitalModType() {
    return digitalModType;
  }

  /**
   * Sets the value of the digitalModType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDigitalModType(TString value) {
    this.digitalModType = value;
  }

  public boolean isSetDigitalModType() {
    return (this.digitalModType != null);
  }

  /**
   * Gets the value of the maxBitRate property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getMaxBitRate() {
    return maxBitRate;
  }

  /**
   * Sets the value of the maxBitRate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setMaxBitRate(TDecimal value) {
    this.maxBitRate = value;
  }

  public boolean isSetMaxBitRate() {
    return (this.maxBitRate != null);
  }

  /**
   * Gets the value of the numStates property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getNumStates() {
    return numStates;
  }

  /**
   * Sets the value of the numStates property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNumStates(TInteger value) {
    this.numStates = value;
  }

  public boolean isSetNumStates() {
    return (this.numStates != null);
  }

  /**
   * Gets the value of the lineCoding property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getLineCoding() {
    return lineCoding;
  }

  /**
   * Sets the value of the lineCoding property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setLineCoding(TString value) {
    this.lineCoding = value;
  }

  public boolean isSetLineCoding() {
    return (this.lineCoding != null);
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
   * Gets the value of the codePeriod property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getCodePeriod() {
    return codePeriod;
  }

  /**
   * Sets the value of the codePeriod property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setCodePeriod(TDecimal value) {
    this.codePeriod = value;
  }

  public boolean isSetCodePeriod() {
    return (this.codePeriod != null);
  }

  public RxModulation withDigitalModType(String value) {
    setDigitalModType(new TString(value));
    return this;
  }

  public RxModulation withMaxBitRate(Double value) {
    setMaxBitRate(new TDecimal(value));
    return this;
  }

  public RxModulation withNumStates(Integer value) {
    setNumStates(new TInteger(value));
    return this;
  }

  public RxModulation withLineCoding(String value) {
    setLineCoding(new TString(value));
    return this;
  }

  public RxModulation withCodeRate(Double value) {
    setCodeRate(new TDecimal(value));
    return this;
  }

  public RxModulation withCodePeriod(Double value) {
    setCodePeriod(new TDecimal(value));
    return this;
  }

}
