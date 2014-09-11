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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for DiagramLine complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="DiagramLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxEndpointName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="RxEndpointName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="ConfigID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramLine", propOrder = {
  "txEndpointName",
  "rxEndpointName",
  "configID"
})
public class DiagramLine {

  @XmlElement(name = "TxEndpointName", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString txEndpointName;
  @XmlElement(name = "RxEndpointName", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString rxEndpointName;
  @XmlElement(name = "ConfigID", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;

  /**
   * Gets the value of the txEndpointName property.
   * <p>
   * @return 
   */
  public TString getTxEndpointName() {
    return txEndpointName;
  }

  /**
   * Sets the value of the txEndpointName property.
   * <p>
   * @param value 
   */
  public void setTxEndpointName(TString value) {
    this.txEndpointName = value;
  }

  public boolean isSetTxEndpointName() {
    return (this.txEndpointName != null);
  }

  /**
   * Gets the value of the rxEndpointName property.
   * <p>
   * @return 
   */
  public TString getRxEndpointName() {
    return rxEndpointName;
  }

  /**
   * Sets the value of the rxEndpointName property.
   * <p>
   * @param value 
   */
  public void setRxEndpointName(TString value) {
    this.rxEndpointName = value;
  }

  public boolean isSetRxEndpointName() {
    return (this.rxEndpointName != null);
  }

  /**
   * Gets the value of the configID property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getConfigID() {
    return configID;
  }

  /**
   * Sets the value of the configID property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setConfigID(TString value) {
    this.configID = value;
  }

  public boolean isSetConfigID() {
    return (this.configID != null);
  }

  public DiagramLine withTxEndpointName(String value) {
    setTxEndpointName(new TString(value));
    return this;
  }

  public DiagramLine withRxEndpointName(String value) {
    setRxEndpointName(new TString(value));
    return this;
  }

  public DiagramLine withConfigID(String value) {
    setConfigID(new TString(value));
    return this;
  }

}
