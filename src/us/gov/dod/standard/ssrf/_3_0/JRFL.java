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

import java.util.*;
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
 * Java class for JRFL complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="JRFL">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="EffectiveDateTime" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDT" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ExpireReviewDT"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}TimeFrame" minOccurs="0"/>
 *         &lt;element name="JRFLEntry" type="{urn:us:gov:dod:standard:ssrf:3.0.0}JRFLEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JRFL", propOrder = {
  "effectiveDateTime",
  "expirationDateTime",
  "reviewDate",
  "seconds",
  "minutes",
  "hours",
  "daysOfMonth",
  "months",
  "daysOfWeek",
  "years",
  "duration",
  "jrflEntry"
})
public class JRFL extends Common {

  @XmlElement(name = "EffectiveDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar effectiveDateTime;
  @XmlElement(name = "ExpirationDateTime", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATETIME.class)
  private TCalendar expirationDateTime;
  @XmlElement(name = "ReviewDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar reviewDate;
  @XmlElement(name = "Seconds", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString seconds;
  @XmlElement(name = "Minutes", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMINSEC.class)
  private TString minutes;
  @XmlElement(name = "Hours", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterHOURS.class)
  private TString hours;
  @XmlElement(name = "DaysOfMonth", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFMONTH.class)
  private TString daysOfMonth;
  @XmlElement(name = "Months", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMONTHS.class)
  private TString months;
  @XmlElement(name = "DaysOfWeek", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterDAYSOFWEEK.class)
  private TString daysOfWeek;
  @XmlElement(name = "Years", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterYEARS.class)
  private TString years;
  @XmlElement(name = "Duration", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN4.class)
  private TInteger duration;
  @XmlElement(name = "JRFLEntry", required = true)
  private List<JRFLEntry> jrflEntry;

  /**
   * Gets the value of the effectiveDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public TCalendar getEffectiveDateTime() {
    return effectiveDateTime;
  }

  /**
   * Sets the value of the effectiveDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setEffectiveDateTime(TCalendar value) {
    this.effectiveDateTime = value;
  }

  public boolean isSetEffectiveDateTime() {
    return (this.effectiveDateTime != null);
  }

  /**
   * Gets the value of the expirationDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public TCalendar getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * Sets the value of the expirationDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setExpirationDateTime(TCalendar value) {
    this.expirationDateTime = value;
  }

  public boolean isSetExpirationDateTime() {
    return (this.expirationDateTime != null);
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(TCalendar value) {
    this.reviewDate = value;
  }

  public boolean isSetReviewDate() {
    return (this.reviewDate != null);
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public TString getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setSeconds(TString value) {
    this.seconds = value;
  }

  public boolean isSetSeconds() {
    return (this.seconds != null);
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public TString getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setMinutes(TString value) {
    this.minutes = value;
  }

  public boolean isSetMinutes() {
    return (this.minutes != null);
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public TString getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public void setHours(TString value) {
    this.hours = value;
  }

  public boolean isSetHours() {
    return (this.hours != null);
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public TString getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public void setDaysOfMonth(TString value) {
    this.daysOfMonth = value;
  }

  public boolean isSetDaysOfMonth() {
    return (this.daysOfMonth != null);
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public TString getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public void setMonths(TString value) {
    this.months = value;
  }

  public boolean isSetMonths() {
    return (this.months != null);
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public TString getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public void setDaysOfWeek(TString value) {
    this.daysOfWeek = value;
  }

  public boolean isSetDaysOfWeek() {
    return (this.daysOfWeek != null);
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public TString getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public void setYears(TString value) {
    this.years = value;
  }

  public boolean isSetYears() {
    return (this.years != null);
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public TInteger getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setDuration(TInteger value) {
    this.duration = value;
  }

  public boolean isSetDuration() {
    return (this.duration != null);
  }

  /**
   * Gets the value of the jrflEntry property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the jrflEntry property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getJRFLEntry().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link JRFLEntry }
   * <p>
   * <p>
   * @return
   */
  public List<JRFLEntry> getJRFLEntry() {
    if (jrflEntry == null) {
      jrflEntry = new ArrayList<>();
    }
    return this.jrflEntry;
  }

  public boolean isSetJRFLEntry() {
    return ((this.jrflEntry != null) && (!this.jrflEntry.isEmpty()));
  }

  public void unsetJRFLEntry() {
    this.jrflEntry = null;
  }

  public JRFL withEffectiveDateTime(Calendar value) {
    setEffectiveDateTime(new TCalendar(value));
    return this;
  }

  public JRFL withExpirationDateTime(Calendar value) {
    setExpirationDateTime(new TCalendar(value));
    return this;
  }

  public JRFL withReviewDate(Calendar value) {
    setReviewDate(new TCalendar(value));
    return this;
  }

  public JRFL withSeconds(String value) {
    setSeconds(new TString(value));
    return this;
  }

  public JRFL withMinutes(String value) {
    setMinutes(new TString(value));
    return this;
  }

  public JRFL withHours(String value) {
    setHours(new TString(value));
    return this;
  }

  public JRFL withDaysOfMonth(String value) {
    setDaysOfMonth(new TString(value));
    return this;
  }

  public JRFL withMonths(String value) {
    setMonths(new TString(value));
    return this;
  }

  public JRFL withDaysOfWeek(String value) {
    setDaysOfWeek(new TString(value));
    return this;
  }

  public JRFL withYears(String value) {
    setYears(new TString(value));
    return this;
  }

  public JRFL withDuration(Integer value) {
    setDuration(new TInteger(value));
    return this;
  }

  public JRFL withJRFLEntry(JRFLEntry... values) {
    if (values != null) {
      getJRFLEntry().addAll(Arrays.asList(values));
    }
    return this;
  }

  public JRFL withJRFLEntry(Collection<JRFLEntry> values) {
    if (values != null) {
      getJRFLEntry().addAll(values);
    }
    return this;
  }

}
