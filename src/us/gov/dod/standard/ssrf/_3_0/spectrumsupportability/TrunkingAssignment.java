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
package us.gov.dod.standard.ssrf._3_0.spectrumsupportability;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * <p>
 * Java class for TrunkingAssignment complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TrunkingAssignment"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;element name="IsRelinquished"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO"/> &lt;element
 * name="AgencySerialNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS12"
 * minOccurs="0"/> &lt;element name="FreqMax"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/> &lt;element
 * name="FreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM"
 * minOccurs="0"/> &lt;element name="RelinquishmentDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;/sequence>
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrunkingAssignment", propOrder = {
  "isRelinquished",
  "agencySerialNum",
  "freqMax",
  "freqMin",
  "relinquishmentDate"
})
public class TrunkingAssignment {

  @XmlElement(name = "IsRelinquished", required = true)
  private TString isRelinquished;
  @XmlElement(name = "AgencySerialNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS12.class)
  private TString agencySerialNum;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "FreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "RelinquishmentDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar relinquishmentDate;

  /**
   * Gets the value of the isRelinquished property.
   * <p>
   * @return
   */
  public TString getIsRelinquished() {
    return isRelinquished;
  }

  /**
   * Sets the value of the isRelinquished property.
   * <p>
   * @param value
   */
  public void setIsRelinquished(TString value) {
    this.isRelinquished = value;
  }

  public boolean isSetIsRelinquished() {
    return (this.isRelinquished != null);
  }

  /**
   * Gets the value of the agencySerialNum property.
   * <p>
   * @return 
   */
  public TString getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Sets the value of the agencySerialNum property.
   * <p>
   * @param value 
   */
  public void setAgencySerialNum(TString value) {
    this.agencySerialNum = value;
  }

  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null);
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return 
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value 
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return 
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value 
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  public boolean isSetFreqMin() {
    return (this.freqMin != null);
  }

  /**
   * Gets the value of the relinquishmentDate property.
   * <p>
   * @return 
   */
  public TCalendar getRelinquishmentDate() {
    return relinquishmentDate;
  }

  /**
   * Sets the value of the relinquishmentDate property.
   * <p>
   * @param value 
   */
  public void setRelinquishmentDate(TCalendar value) {
    this.relinquishmentDate = value;
  }

  public boolean isSetRelinquishmentDate() {
    return (this.relinquishmentDate != null);
  }

  public TrunkingAssignment withIsRelinquished(ListCBO value) {
    setIsRelinquished(new TString(value.value()));
    return this;
  }

  public TrunkingAssignment withAgencySerialNum(String value) {
    setAgencySerialNum(new TString(value));
    return this;
  }

  public TrunkingAssignment withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public TrunkingAssignment withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public TrunkingAssignment withRelinquishmentDate(Calendar value) {
    setRelinquishmentDate(new TCalendar(value));
    return this;
  }

}
