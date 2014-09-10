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
import us.gov.dod.standard.ssrf._3_0.datatype.*;

/**
 * <p>
 * Java class for Time complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="UsageDescription " type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Time", propOrder = {
  "period",
  "usageDescription_0020"
})
public class Time {

  @XmlElement(name = "Period", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString period;
  @XmlElement(name = "UsageDescription ", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString usageDescription_0020;

  /**
   * Gets the value of the period property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getPeriod() {
    return period;
  }

  /**
   * Sets the value of the period property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setPeriod(TString value) {
    this.period = value;
  }

  public boolean isSetPeriod() {
    return (this.period != null);
  }

  /**
   * Gets the value of the usageDescription_0020 property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getUsageDescription_0020() {
    return usageDescription_0020;
  }

  /**
   * Sets the value of the usageDescription_0020 property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setUsageDescription_0020(TString value) {
    this.usageDescription_0020 = value;
  }

  public boolean isSetUsageDescription_0020() {
    return (this.usageDescription_0020 != null);
  }

  public Time withPeriod(String value) {
    setPeriod(new TString(value));
    return this;
  }

  public Time withUsageDescription_0020(String value) {
    setUsageDescription_0020(new TString(value));
    return this;
  }

}
