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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.allocation.Footnote;
import us.gov.dod.standard.ssrf._3_0.allocation.FreqBand;
import us.gov.dod.standard.ssrf._3_0.metadata.BandApplication;
import us.gov.dod.standard.ssrf._3_0.metadata.BandUser;
import us.gov.dod.standard.ssrf._3_0.metadata.ChannelPlanRef;
import us.gov.dod.standard.ssrf._3_0.metadata.Country;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCY;

/**
 * Java class for TOA complex type.
 * <p>
 * Table of Allocation
 * <p>
 * A Table of Allocation (TOA) describes the national frequency allocation plan
 * and degree of conformity with the ITU Radio Regulations. A TOA contains the
 * division of the radio frequency spectrum into bands and details for the usage
 * of these bands by different types of services, applications, and users. For
 * example, a band of spectrum might be allocated for mobile radio systems used
 * by other than national governmental users, within specified power limits and
 * bandwidth restrictions. A TOA is considered reference data because the
 * national rules for use of spectrum must be known in order to develop/procure
 * equipment that is likely to be permitted to transmit, and to properly plan
 * detailed spectrum use for training and cooperative operations.
 * <p>
 * The Table of Allocation provided by the Host Nation should be imported and
 * stored in the respective spectrum management systems.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOA", propOrder = {
  "administration",
  "effectiveDate",
  "expirationDate",
  "title",
  "footnote",
  "channelPlanRef",
  "bandApplication",
  "bandUser",
  "country",
  "freqBand"
})
public class TOA extends Common<TOA> {

  @XmlElement(name = "Administration", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString administration;
  @XmlElement(name = "EffectiveDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar effectiveDate;
  @XmlElement(name = "ExpirationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar expirationDate;
  @XmlElement(name = "Title", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  @XmlElement(name = "Footnote")
  private List<Footnote> footnote;
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  private List<ChannelPlanRef> channelPlanRef;
  @XmlElement(name = "BandApplication", nillable = true)
  private List<BandApplication> bandApplication;
  @XmlElement(name = "BandUser", nillable = true)
  private List<BandUser> bandUser;
  @XmlElement(name = "Country", nillable = true)
  private List<Country> country;
  @XmlElement(name = "FreqBand", required = true)
  private List<FreqBand> freqBand;

  public TOA(ListCCY snCountry, String snOrganization, String snSerial, Calendar entryDateTime) {
    super(snCountry, snOrganization, snSerial, entryDateTime);
  }

  public TOA(ListCCY snCountry, String snOrganization, String snSerial, Date entryDateTime) {
    super(snCountry, snOrganization, snSerial, entryDateTime);
  }

  public TOA() {
  }

  /**
   * Gets the value of the administration property.
   * <p>
   * @return
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Sets the value of the administration property.
   * <p>
   * @param value
   */
  public void setAdministration(TString value) {
    this.administration = value;
  }

  public boolean isSetAdministration() {
    return (this.administration != null);
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value
   */
  public void setEffectiveDate(TCalendar value) {
    this.effectiveDate = value;
  }

  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null);
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value
   */
  public void setExpirationDate(TCalendar value) {
    this.expirationDate = value;
  }

  public boolean isSetExpirationDate() {
    return (this.expirationDate != null);
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
   * Gets the value of the footnote property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the footnote property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFootnote().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Footnote> getFootnote() {
    if (footnote == null) {
      footnote = new ArrayList<>();
    }
    return this.footnote;
  }

  public boolean isSetFootnote() {
    return ((this.footnote != null) && (!this.footnote.isEmpty()));
  }

  public void unsetFootnote() {
    this.footnote = null;
  }

  /**
   * Gets the value of the channelPlanRef property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the channelPlanRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getChannelPlanRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<ChannelPlanRef> getChannelPlanRef() {
    if (channelPlanRef == null) {
      channelPlanRef = new ArrayList<>();
    }
    return this.channelPlanRef;
  }

  public boolean isSetChannelPlanRef() {
    return ((this.channelPlanRef != null) && (!this.channelPlanRef.isEmpty()));
  }

  public void unsetChannelPlanRef() {
    this.channelPlanRef = null;
  }

  /**
   * Gets the value of the bandApplication property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the bandApplication property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBandApplication().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<BandApplication> getBandApplication() {
    if (bandApplication == null) {
      bandApplication = new ArrayList<>();
    }
    return this.bandApplication;
  }

  public boolean isSetBandApplication() {
    return ((this.bandApplication != null) && (!this.bandApplication.isEmpty()));
  }

  public void unsetBandApplication() {
    this.bandApplication = null;
  }

  /**
   * Gets the value of the bandUser property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the bandUser property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBandUser().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<BandUser> getBandUser() {
    if (bandUser == null) {
      bandUser = new ArrayList<>();
    }
    return this.bandUser;
  }

  public boolean isSetBandUser() {
    return ((this.bandUser != null) && (!this.bandUser.isEmpty()));
  }

  public void unsetBandUser() {
    this.bandUser = null;
  }

  /**
   * Gets the value of the country property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the country property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCountry().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Country> getCountry() {
    if (country == null) {
      country = new ArrayList<>();
    }
    return this.country;
  }

  public boolean isSetCountry() {
    return ((this.country != null) && (!this.country.isEmpty()));
  }

  public void unsetCountry() {
    this.country = null;
  }

  /**
   * Gets the value of the freqBand property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the freqBand property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFreqBand().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<FreqBand> getFreqBand() {
    if (freqBand == null) {
      freqBand = new ArrayList<>();
    }
    return this.freqBand;
  }

  public boolean isSetFreqBand() {
    return ((this.freqBand != null) && (!this.freqBand.isEmpty()));
  }

  public void unsetFreqBand() {
    this.freqBand = null;
  }

  public TOA withAdministration(String value) {
    setAdministration(new TString(value));
    return this;
  }

  public TOA withEffectiveDate(Calendar value) {
    setEffectiveDate(new TCalendar(value));
    return this;
  }

  public TOA withExpirationDate(Calendar value) {
    setExpirationDate(new TCalendar(value));
    return this;
  }

  public TOA withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  public TOA withFootnote(Footnote... values) {
    if (values != null) {
      getFootnote().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TOA withFootnote(Collection<Footnote> values) {
    if (values != null) {
      getFootnote().addAll(values);
    }
    return this;
  }

  public TOA withChannelPlanRef(ChannelPlanRef... values) {
    if (values != null) {
      getChannelPlanRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TOA withChannelPlanRef(Collection<ChannelPlanRef> values) {
    if (values != null) {
      getChannelPlanRef().addAll(values);
    }
    return this;
  }

  public TOA withBandApplication(BandApplication... values) {
    if (values != null) {
      getBandApplication().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TOA withBandApplication(Collection<BandApplication> values) {
    if (values != null) {
      getBandApplication().addAll(values);
    }
    return this;
  }

  public TOA withBandUser(BandUser... values) {
    if (values != null) {
      getBandUser().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TOA withBandUser(Collection<BandUser> values) {
    if (values != null) {
      getBandUser().addAll(values);
    }
    return this;
  }

  public TOA withCountry(Country... values) {
    if (values != null) {
      getCountry().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TOA withCountry(Collection<Country> values) {
    if (values != null) {
      getCountry().addAll(values);
    }
    return this;
  }

  public TOA withFreqBand(FreqBand... values) {
    if (values != null) {
      getFreqBand().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TOA withFreqBand(Collection<FreqBand> values) {
    if (values != null) {
      getFreqBand().addAll(values);
    }
    return this;
  }

}
