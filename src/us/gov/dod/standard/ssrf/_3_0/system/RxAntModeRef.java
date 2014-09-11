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

import us.gov.dod.standard.ssrf._3_0.system.TxAntModeRef;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for RxAntModeRef complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="RxAntModeRef"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Serial" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial"/>
 * &lt;element name="ModeID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20"
 * minOccurs="0"/> &lt;element name="CouplingLoss"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/> &lt;/sequence>
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxAntModeRef", propOrder = {
  "serial",
  "modeID",
  "couplingLoss"
})
@XmlSeeAlso({
  TxAntModeRef.class
})
public class RxAntModeRef {

  @XmlElement(name = "Serial", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString serial;
  @XmlElement(name = "ModeID", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  @XmlElement(name = "CouplingLoss", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal couplingLoss;

  /**
   * Gets the value of the serial property.
   * <p>
   * @return 
   */
  public TString getSerial() {
    return serial;
  }

  /**
   * Sets the value of the serial property.
   * <p>
   * @param value 
   */
  public void setSerial(TString value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Gets the value of the modeID property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Sets the value of the modeID property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  public boolean isSetModeID() {
    return (this.modeID != null);
  }

  /**
   * Gets the value of the couplingLoss property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getCouplingLoss() {
    return couplingLoss;
  }

  /**
   * Sets the value of the couplingLoss property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setCouplingLoss(TDecimal value) {
    this.couplingLoss = value;
  }

  public boolean isSetCouplingLoss() {
    return (this.couplingLoss != null);
  }

  public RxAntModeRef withSerial(String value) {
    setSerial(new TString(value));
    return this;
  }

  public RxAntModeRef withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  public RxAntModeRef withCouplingLoss(Double value) {
    setCouplingLoss(new TDecimal(value));
    return this;
  }

}
