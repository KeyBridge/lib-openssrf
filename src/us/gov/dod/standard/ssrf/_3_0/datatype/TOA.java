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
package us.gov.dod.standard.ssrf._3_0.datatype;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_0.BandApplication;
import us.gov.dod.standard.ssrf._3_0.BandUser;
import us.gov.dod.standard.ssrf._3_0.ChannelPlanRef;
import us.gov.dod.standard.ssrf._3_0.Common;
import us.gov.dod.standard.ssrf._3_0.Country;
import us.gov.dod.standard.ssrf._3_0.Footnote;
import us.gov.dod.standard.ssrf._3_0.FreqBand;

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
 * &lt;complexType name="TOA">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Administration" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50"/>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="Footnote" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Footnote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChannelPlanRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ChannelPlanRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BandApplication" type="{urn:us:gov:dod:standard:ssrf:3.0.0}BandApplication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BandUser" type="{urn:us:gov:dod:standard:ssrf:3.0.0}BandUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Country" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreqBand" type="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqBand" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
public class TOA
  extends Common {

  @XmlElement(name = "Administration", required = true)
  protected TS50 administration;
  @XmlElementRef(name = "EffectiveDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> effectiveDate;
  @XmlElementRef(name = "ExpirationDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> expirationDate;
  @XmlElementRef(name = "Title", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> title;
  @XmlElement(name = "Footnote")
  protected List<Footnote> footnote;
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  protected List<ChannelPlanRef> channelPlanRef;
  @XmlElement(name = "BandApplication", nillable = true)
  protected List<BandApplication> bandApplication;
  @XmlElement(name = "BandUser", nillable = true)
  protected List<BandUser> bandUser;
  @XmlElement(name = "Country", nillable = true)
  protected List<Country> country;
  @XmlElement(name = "FreqBand", required = true)
  protected List<FreqBand> freqBand;

  /**
   * Gets the value of the administration property.
   * <p>
   * @return possible object is {@link TS50 }
   * <p>
   */
  public TS50 getAdministration() {
    return administration;
  }

  /**
   * Sets the value of the administration property.
   * <p>
   * @param value allowed object is {@link TS50 }
   * <p>
   */
  public void setAdministration(TS50 value) {
    this.administration = value;
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setEffectiveDate(JAXBElement<TD> value) {
    this.effectiveDate = value;
  }

  /**
   * Gets the value of the expirationDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getExpirationDate() {
    return expirationDate;
  }

  /**
   * Sets the value of the expirationDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setExpirationDate(JAXBElement<TD> value) {
    this.expirationDate = value;
  }

  /**
   * Gets the value of the title property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setTitle(JAXBElement<TS100> value) {
    this.title = value;
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
   */
  public List<Footnote> getFootnote() {
    if (footnote == null) {
      footnote = new ArrayList<>();
    }
    return this.footnote;
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
   */
  public List<ChannelPlanRef> getChannelPlanRef() {
    if (channelPlanRef == null) {
      channelPlanRef = new ArrayList<>();
    }
    return this.channelPlanRef;
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
   */
  public List<BandApplication> getBandApplication() {
    if (bandApplication == null) {
      bandApplication = new ArrayList<>();
    }
    return this.bandApplication;
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
   */
  public List<BandUser> getBandUser() {
    if (bandUser == null) {
      bandUser = new ArrayList<>();
    }
    return this.bandUser;
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
   */
  public List<Country> getCountry() {
    if (country == null) {
      country = new ArrayList<>();
    }
    return this.country;
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
   */
  public List<FreqBand> getFreqBand() {
    if (freqBand == null) {
      freqBand = new ArrayList<>();
    }
    return this.freqBand;
  }

}
