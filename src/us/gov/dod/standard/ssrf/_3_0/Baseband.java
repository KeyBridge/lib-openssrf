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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for Baseband complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Baseband">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModFreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="ModFreqMax" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="SignalType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baseband", propOrder = {
  "modFreqMin",
  "modFreqMax",
  "signalType"
})
public class Baseband {

  @XmlElement(name = "ModFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal modFreqMin;
  @XmlElement(name = "ModFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal modFreqMax;
  @XmlElement(name = "SignalType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString signalType;

  /**
   * Gets the value of the modFreqMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getModFreqMin() {
    return modFreqMin;
  }

  /**
   * Sets the value of the modFreqMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setModFreqMin(TDecimal value) {
    this.modFreqMin = value;
  }

  public boolean isSetModFreqMin() {
    return (this.modFreqMin != null);
  }

  /**
   * Gets the value of the modFreqMax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getModFreqMax() {
    return modFreqMax;
  }

  /**
   * Sets the value of the modFreqMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setModFreqMax(TDecimal value) {
    this.modFreqMax = value;
  }

  public boolean isSetModFreqMax() {
    return (this.modFreqMax != null);
  }

  /**
   * Gets the value of the signalType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getSignalType() {
    return signalType;
  }

  /**
   * Sets the value of the signalType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSignalType(TString value) {
    this.signalType = value;
  }

  public boolean isSetSignalType() {
    return (this.signalType != null);
  }

  public Baseband withModFreqMin(Double value) {
    setModFreqMin(new TDecimal(value));
    return this;
  }

  public Baseband withModFreqMax(Double value) {
    setModFreqMax(new TDecimal(value));
    return this;
  }

  public Baseband withSignalType(String value) {
    setSignalType(new TString(value));
    return this;
  }

}
