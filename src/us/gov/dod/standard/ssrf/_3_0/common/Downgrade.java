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
package us.gov.dod.standard.ssrf._3_0.common;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * <p>
 * Java class for Downgrade complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Downgrade"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Downcls" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCL"/>
 * &lt;element name="Date" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 * &lt;element name="DowngradeInfo"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS200" minOccurs="0"/>
 * &lt;/sequence> &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Downgrade", propOrder = {
  "downcls",
  "date",
  "downgradeInfo"
})
public class Downgrade {

  @XmlElement(name = "Downcls", required = true)
  private TString downcls;
  @XmlElement(name = "Date", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  @XmlElement(name = "DowngradeInfo", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS200.class)
  private TString downgradeInfo;

  /**
   * Gets the value of the downcls property.
   * <p>
   * @return
   */
  public TString getDowncls() {
    return downcls;
  }

  /**
   * Sets the value of the downcls property.
   * <p>
   * @param value
   */
  public void setDowncls(TString value) {
    this.downcls = value;
  }

  public boolean isSetDowncls() {
    return (this.downcls != null);
  }

  /**
   * Gets the value of the date property.
   * <p>
   * @return
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Sets the value of the date property.
   * <p>
   * @param value
   */
  public void setDate(TCalendar value) {
    this.date = value;
  }

  public boolean isSetDate() {
    return (this.date != null);
  }

  /**
   * Gets the value of the downgradeInfo property.
   * <p>
   * @return 
   */
  public TString getDowngradeInfo() {
    return downgradeInfo;
  }

  /**
   * Sets the value of the downgradeInfo property.
   * <p>
   * @param value 
   */
  public void setDowngradeInfo(TString value) {
    this.downgradeInfo = value;
  }

  public boolean isSetDowngradeInfo() {
    return (this.downgradeInfo != null);
  }

  public Downgrade withDowncls(ListCCL value) {
    setDowncls(new TString(value.value()));
    return this;
  }

  public Downgrade withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  public Downgrade withDowngradeInfo(String value) {
    setDowngradeInfo(new TString(value));
    return this;
  }

}
