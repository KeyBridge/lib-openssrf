/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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

import us.gov.dod.standard.ssrf._3_0.datatype.TUN4;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfMonth;
import us.gov.dod.standard.ssrf._3_0.datatype.TDT;
import us.gov.dod.standard.ssrf._3_0.datatype.TMinSec;
import us.gov.dod.standard.ssrf._3_0.datatype.TYears;
import us.gov.dod.standard.ssrf._3_0.datatype.TD;
import us.gov.dod.standard.ssrf._3_0.datatype.TDaysOfWeek;
import us.gov.dod.standard.ssrf._3_0.datatype.TMonths;
import us.gov.dod.standard.ssrf._3_0.datatype.THours;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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
public class JRFL
  extends Common {

  @XmlElementRef(name = "EffectiveDateTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDT> effectiveDateTime;
  @XmlElementRef(name = "ExpirationDateTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDT> expirationDateTime;
  @XmlElementRef(name = "ReviewDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> reviewDate;
  @XmlElementRef(name = "Seconds", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> seconds;
  @XmlElementRef(name = "Minutes", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMinSec> minutes;
  @XmlElementRef(name = "Hours", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<THours> hours;
  @XmlElementRef(name = "DaysOfMonth", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfMonth> daysOfMonth;
  @XmlElementRef(name = "Months", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMonths> months;
  @XmlElementRef(name = "DaysOfWeek", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TDaysOfWeek> daysOfWeek;
  @XmlElementRef(name = "Years", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TYears> years;
  @XmlElementRef(name = "Duration", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN4> duration;
  @XmlElement(name = "JRFLEntry", required = true)
  protected List<JRFLEntry> jrflEntry;

  /**
   * Gets the value of the effectiveDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public JAXBElement<TDT> getEffectiveDateTime() {
    return effectiveDateTime;
  }

  /**
   * Sets the value of the effectiveDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setEffectiveDateTime(JAXBElement<TDT> value) {
    this.effectiveDateTime = value;
  }

  /**
   * Gets the value of the expirationDateTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public JAXBElement<TDT> getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * Sets the value of the expirationDateTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDT }{@code >}
   * <p>
   */
  public void setExpirationDateTime(JAXBElement<TDT> value) {
    this.expirationDateTime = value;
  }

  /**
   * Gets the value of the reviewDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getReviewDate() {
    return reviewDate;
  }

  /**
   * Sets the value of the reviewDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setReviewDate(JAXBElement<TD> value) {
    this.reviewDate = value;
  }

  /**
   * Gets the value of the seconds property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setSeconds(JAXBElement<TMinSec> value) {
    this.seconds = value;
  }

  /**
   * Gets the value of the minutes property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public JAXBElement<TMinSec> getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMinSec }{@code >}
   * <p>
   */
  public void setMinutes(JAXBElement<TMinSec> value) {
    this.minutes = value;
  }

  /**
   * Gets the value of the hours property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public JAXBElement<THours> getHours() {
    return hours;
  }

  /**
   * Sets the value of the hours property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link THours }{@code >}
   * <p>
   */
  public void setHours(JAXBElement<THours> value) {
    this.hours = value;
  }

  /**
   * Gets the value of the daysOfMonth property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfMonth> getDaysOfMonth() {
    return daysOfMonth;
  }

  /**
   * Sets the value of the daysOfMonth property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfMonth }{@code >}
   * <p>
   */
  public void setDaysOfMonth(JAXBElement<TDaysOfMonth> value) {
    this.daysOfMonth = value;
  }

  /**
   * Gets the value of the months property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public JAXBElement<TMonths> getMonths() {
    return months;
  }

  /**
   * Sets the value of the months property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMonths }{@code >}
   * <p>
   */
  public void setMonths(JAXBElement<TMonths> value) {
    this.months = value;
  }

  /**
   * Gets the value of the daysOfWeek property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public JAXBElement<TDaysOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }

  /**
   * Sets the value of the daysOfWeek property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TDaysOfWeek }{@code >}
   * <p>
   */
  public void setDaysOfWeek(JAXBElement<TDaysOfWeek> value) {
    this.daysOfWeek = value;
  }

  /**
   * Gets the value of the years property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public JAXBElement<TYears> getYears() {
    return years;
  }

  /**
   * Sets the value of the years property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TYears }{@code >}
   * <p>
   */
  public void setYears(JAXBElement<TYears> value) {
    this.years = value;
  }

  /**
   * Gets the value of the duration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public JAXBElement<TUN4> getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN4 }{@code >}
   * <p>
   */
  public void setDuration(JAXBElement<TUN4> value) {
    this.duration = value;
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
   */
  public List<JRFLEntry> getJRFLEntry() {
    if (jrflEntry == null) {
      jrflEntry = new ArrayList<>();
    }
    return this.jrflEntry;
  }

}
