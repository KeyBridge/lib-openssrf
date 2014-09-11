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

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.domains.TString;

/**
 * <p>
 * Java class for PreviousAuthorization complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="PreviousAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocketNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS8"/>
 *         &lt;element name="Date " type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="AgencySerialNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousAuthorization", propOrder = {
  "docketNum",
  "date_0020",
  "agencySerialNum"
})
public class PreviousAuthorization {

  @XmlElement(name = "DocketNum", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS8.class)
  private TString docketNum;
  @XmlElement(name = "Date ", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date_0020;
  @XmlElement(name = "AgencySerialNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString agencySerialNum;

  /**
   * Gets the value of the docketNum property.
   * <p>
   * @return 
   */
  public TString getDocketNum() {
    return docketNum;
  }

  /**
   * Sets the value of the docketNum property.
   * <p>
   * @param value 
   */
  public void setDocketNum(TString value) {
    this.docketNum = value;
  }

  public boolean isSetDocketNum() {
    return (this.docketNum != null);
  }

  /**
   * Gets the value of the date_0020 property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TCalendar getDate_0020() {
    return date_0020;
  }

  /**
   * Sets the value of the date_0020 property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDate_0020(TCalendar value) {
    this.date_0020 = value;
  }

  public boolean isSetDate_0020() {
    return (this.date_0020 != null);
  }

  /**
   * Gets the value of the agencySerialNum property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Sets the value of the agencySerialNum property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAgencySerialNum(TString value) {
    this.agencySerialNum = value;
  }

  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null);
  }

  public PreviousAuthorization withDocketNum(String value) {
    setDocketNum(new TString(value));
    return this;
  }

  public PreviousAuthorization withDate_0020(Calendar value) {
    setDate_0020(new TCalendar(value));
    return this;
  }

  public PreviousAuthorization withAgencySerialNum(String value) {
    setAgencySerialNum(new TString(value));
    return this;
  }

}
