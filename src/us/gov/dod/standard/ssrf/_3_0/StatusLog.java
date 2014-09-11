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
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for StatusLog complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="StatusLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT"/>
 *         &lt;element name="State" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="AgencyCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS80" minOccurs="0"/>
 *         &lt;element name="Comment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255" minOccurs="0"/>
 *         &lt;element name="POCRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TSerial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLog", propOrder = {
  "dateTime",
  "state",
  "agencyCode",
  "comment",
  "pocRef"
})
public class StatusLog {

  @XmlElement(name = "DateTime", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar dateTime;
  @XmlElement(name = "State", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString state;
  @XmlElement(name = "AgencyCode", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS80.class)
  private TString agencyCode;
  @XmlElement(name = "Comment", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString comment;
  @XmlElement(name = "POCRef", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterSERIAL.class)
  private TString pocRef;

  /**
   * Gets the value of the dateTime property.
   * <p>
   * @return 
   */
  public TCalendar getDateTime() {
    return dateTime;
  }

  /**
   * Sets the value of the dateTime property.
   * <p>
   * @param value 
   */
  public void setDateTime(TCalendar value) {
    this.dateTime = value;
  }

  public boolean isSetDateTime() {
    return (this.dateTime != null);
  }

  /**
   * Gets the value of the state property.
   * <p>
   * @return 
   */
  public TString getState() {
    return state;
  }

  /**
   * Sets the value of the state property.
   * <p>
   * @param value 
   */
  public void setState(TString value) {
    this.state = value;
  }

  public boolean isSetState() {
    return (this.state != null);
  }

  /**
   * Gets the value of the agencyCode property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getAgencyCode() {
    return agencyCode;
  }

  /**
   * Sets the value of the agencyCode property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAgencyCode(TString value) {
    this.agencyCode = value;
  }

  public boolean isSetAgencyCode() {
    return (this.agencyCode != null);
  }

  /**
   * Gets the value of the comment property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getComment() {
    return comment;
  }

  /**
   * Sets the value of the comment property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setComment(TString value) {
    this.comment = value;
  }

  public boolean isSetComment() {
    return (this.comment != null);
  }

  /**
   * Gets the value of the pocRef property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPOCRef() {
    return pocRef;
  }

  /**
   * Sets the value of the pocRef property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPOCRef(TString value) {
    this.pocRef = value;
  }

  public boolean isSetPOCRef() {
    return (this.pocRef != null);
  }

  public StatusLog withDateTime(Calendar value) {
    setDateTime(new TCalendar(value));
    return this;
  }

  public StatusLog withState(String value) {
    setState(new TString(value));
    return this;
  }

  public StatusLog withAgencyCode(String value) {
    setAgencyCode(new TString(value));
    return this;
  }

  public StatusLog withComment(String value) {
    setComment(new TString(value));
    return this;
  }

  public StatusLog withPOCRef(String value) {
    setPOCRef(new TString(value));
    return this;
  }

}
