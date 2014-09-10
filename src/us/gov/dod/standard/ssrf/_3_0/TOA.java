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
 * Java class for TOA complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TOA"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="Administration" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 * &lt;element name="EffectiveDate"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="ExpirationDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"
 * minOccurs="0"/> &lt;element name="Title"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/> &lt;element
 * name="Footnote" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Footnote"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="ChannelPlanRef"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}ChannelPlanRef"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="BandApplication"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}BandApplication"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="BandUser"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}BandUser" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="Country"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}Country" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element name="FreqBand"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqBand" maxOccurs="unbounded"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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
public class TOA extends Common {

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

  /**
   * Gets the value of the administration property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Sets the value of the administration property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the footnote property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFootnote().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Footnote }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the channelPlanRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getChannelPlanRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ChannelPlanRef }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the bandApplication property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBandApplication().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link BandApplication }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the bandUser property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBandUser().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link BandUser }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the country property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCountry().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Country }
   * <p>
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the freqBand property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFreqBand().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link FreqBand }
   * <p>
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
