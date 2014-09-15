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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for Usage complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Usage"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="EqpFnct" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"
 * minOccurs="0"/> &lt;element name="StnClass"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS5" minOccurs="0"/> &lt;element
 * name="RadioService" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"
 * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usage", propOrder = {
  "eqpFnct",
  "stnClass",
  "radioService"
})
public class Usage {

  @XmlElement(name = "EqpFnct", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString eqpFnct;
  @XmlElement(name = "StnClass", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS5.class)
  private TString stnClass;
  @XmlElement(name = "RadioService", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString radioService;

  /**
   * Gets the value of the eqpFnct property.
   * <p>
   * @return 
   */
  public TString getEqpFnct() {
    return eqpFnct;
  }

  /**
   * Sets the value of the eqpFnct property.
   * <p>
   * @param value 
   */
  public void setEqpFnct(TString value) {
    this.eqpFnct = value;
  }

  public boolean isSetEqpFnct() {
    return (this.eqpFnct != null);
  }

  /**
   * Gets the value of the stnClass property.
   * <p>
   * @return 
   */
  public TString getStnClass() {
    return stnClass;
  }

  /**
   * Sets the value of the stnClass property.
   * <p>
   * @param value 
   */
  public void setStnClass(TString value) {
    this.stnClass = value;
  }

  public boolean isSetStnClass() {
    return (this.stnClass != null);
  }

  /**
   * Gets the value of the radioService property.
   * <p>
   * @return 
   */
  public TString getRadioService() {
    return radioService;
  }

  /**
   * Sets the value of the radioService property.
   * <p>
   * @param value 
   */
  public void setRadioService(TString value) {
    this.radioService = value;
  }

  public boolean isSetRadioService() {
    return (this.radioService != null);
  }

  public Usage withEqpFnct(String value) {
    setEqpFnct(new TString(value));
    return this;
  }

  public Usage withStnClass(String value) {
    setStnClass(new TString(value));
    return this;
  }

  public Usage withRadioService(String value) {
    setRadioService(new TString(value));
    return this;
  }

}
