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
 * Java class for ClsDerived complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="ClsDerived">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 *         &lt;element name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30"/>
 *         &lt;element name="Org" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsDerived", propOrder = {
  "date",
  "title",
  "org"
})
public class ClsDerived {

  @XmlElement(name = "Date", required = true)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  @XmlElement(name = "Title", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString title;
  @XmlElement(name = "Org", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS30.class)
  private TString org;

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
   * Gets the value of the title property.
   * <p>
   * @return 
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value 
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the org property.
   * <p>
   * @return 
   */
  public TString getOrg() {
    return org;
  }

  /**
   * Sets the value of the org property.
   * <p>
   * @param value 
   */
  public void setOrg(TString value) {
    this.org = value;
  }

  public boolean isSetOrg() {
    return (this.org != null);
  }

  public ClsDerived withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  public ClsDerived withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  public ClsDerived withOrg(String value) {
    setOrg(new TString(value));
    return this;
  }

}
