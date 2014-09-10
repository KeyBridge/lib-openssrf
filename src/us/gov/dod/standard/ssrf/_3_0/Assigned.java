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
 * Java class for Assigned complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Assigned"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Quality" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN1"
 * minOccurs="0"/> &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Colour"
 * minOccurs="0"/> &lt;group
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ITURegistration" minOccurs="0"/>
 * &lt;element name="NavAidsChannel"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TNavAidChnl" minOccurs="0"/>
 * &lt;element name="NetNum"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TNetNumber" minOccurs="0"/>
 * &lt;element name="ITURegComments"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/> &lt;element
 * name="Freq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Freq"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element name="FreqOld"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqOld" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assigned", propOrder = {
  "quality",
  "colourWord",
  "colourNum",
  "ituRegStatus",
  "ituRegDate",
  "ituRegNum",
  "navAidsChannel",
  "netNum",
  "ituRegComments",
  "freq",
  "freqOld"
})
public class Assigned {

  @XmlElement(name = "Quality", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN1.class)
  private TInteger quality;
  @XmlElement(name = "ColourWord", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString colourWord;
  @XmlElement(name = "ColourNum", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN2.class)
  private TInteger colourNum;
  @XmlElement(name = "ITURegStatus", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString ituRegStatus;
  @XmlElement(name = "ITURegDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar ituRegDate;
  @XmlElement(name = "ITURegNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterUS10.class)
  private TString ituRegNum;
  @XmlElement(name = "NavAidsChannel", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterNAVAIDCHNL.class)
  private TString navAidsChannel;
  @XmlElement(name = "NetNum", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterNETNUMBER.class)
  private TString netNum;
  @XmlElement(name = "ITURegComments", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString ituRegComments;
  @XmlElement(name = "Freq")
  private List<Freq> freq;
  @XmlElement(name = "FreqOld", nillable = true)
  private List<FreqOld> freqOld;

  /**
   * Gets the value of the quality property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN1 }{@code >}
   * <p>
   */
  public TInteger getQuality() {
    return quality;
  }

  /**
   * Sets the value of the quality property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN1 }{@code >}
   * <p>
   */
  public void setQuality(TInteger value) {
    this.quality = value;
  }

  public boolean isSetQuality() {
    return (this.quality != null);
  }

  /**
   * Gets the value of the colourWord property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public TString getColourWord() {
    return colourWord;
  }

  /**
   * Sets the value of the colourWord property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setColourWord(TString value) {
    this.colourWord = value;
  }

  public boolean isSetColourWord() {
    return (this.colourWord != null);
  }

  /**
   * Gets the value of the colourNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN2 }{@code >}
   * <p>
   */
  public TInteger getColourNum() {
    return colourNum;
  }

  /**
   * Sets the value of the colourNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN2 }{@code >}
   * <p>
   */
  public void setColourNum(TInteger value) {
    this.colourNum = value;
  }

  public boolean isSetColourNum() {
    return (this.colourNum != null);
  }

  /**
   * Gets the value of the ituRegStatus property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getITURegStatus() {
    return ituRegStatus;
  }

  /**
   * Sets the value of the ituRegStatus property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setITURegStatus(TString value) {
    this.ituRegStatus = value;
  }

  public boolean isSetITURegStatus() {
    return (this.ituRegStatus != null);
  }

  /**
   * Gets the value of the ituRegDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public TCalendar getITURegDate() {
    return ituRegDate;
  }

  /**
   * Sets the value of the ituRegDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setITURegDate(TCalendar value) {
    this.ituRegDate = value;
  }

  public boolean isSetITURegDate() {
    return (this.ituRegDate != null);
  }

  /**
   * Gets the value of the ituRegNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS10 }{@code >}
   * <p>
   */
  public TString getITURegNum() {
    return ituRegNum;
  }

  /**
   * Sets the value of the ituRegNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS10 }{@code >}
   * <p>
   */
  public void setITURegNum(TString value) {
    this.ituRegNum = value;
  }

  public boolean isSetITURegNum() {
    return (this.ituRegNum != null);
  }

  /**
   * Gets the value of the navAidsChannel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TNavAidChnl }{@code >}
   * <p>
   */
  public TString getNavAidsChannel() {
    return navAidsChannel;
  }

  /**
   * Sets the value of the navAidsChannel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TNavAidChnl }{@code >}
   * <p>
   */
  public void setNavAidsChannel(TString value) {
    this.navAidsChannel = value;
  }

  public boolean isSetNavAidsChannel() {
    return (this.navAidsChannel != null);
  }

  /**
   * Gets the value of the netNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TNetNumber }{@code >}
   * <p>
   */
  public TString getNetNum() {
    return netNum;
  }

  /**
   * Sets the value of the netNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TNetNumber }{@code >}
   * <p>
   */
  public void setNetNum(TString value) {
    this.netNum = value;
  }

  public boolean isSetNetNum() {
    return (this.netNum != null);
  }

  /**
   * Gets the value of the ituRegComments property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getITURegComments() {
    return ituRegComments;
  }

  /**
   * Sets the value of the ituRegComments property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setITURegComments(TString value) {
    this.ituRegComments = value;
  }

  public boolean isSetITURegComments() {
    return (this.ituRegComments != null);
  }

  /**
   * Gets the value of the freq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the freq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Freq }
   * <p>
   * <p>
   * @return
   */
  public List<Freq> getFreq() {
    if (freq == null) {
      freq = new ArrayList<>();
    }
    return this.freq;
  }

  public boolean isSetFreq() {
    return ((this.freq != null) && (!this.freq.isEmpty()));
  }

  public void unsetFreq() {
    this.freq = null;
  }

  /**
   * Gets the value of the freqOld property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the freqOld property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFreqOld().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link FreqOld }
   * <p>
   * <p>
   * @return
   */
  public List<FreqOld> getFreqOld() {
    if (freqOld == null) {
      freqOld = new ArrayList<>();
    }
    return this.freqOld;
  }

  public boolean isSetFreqOld() {
    return ((this.freqOld != null) && (!this.freqOld.isEmpty()));
  }

  public void unsetFreqOld() {
    this.freqOld = null;
  }

  public Assigned withQuality(Integer value) {
    setQuality(new TInteger(value));
    return this;
  }

  public Assigned withColourWord(String value) {
    setColourWord(new TString(value));
    return this;
  }

  public Assigned withColourNum(Integer value) {
    setColourNum(new TInteger(value));
    return this;
  }

  public Assigned withITURegStatus(String value) {
    setITURegStatus(new TString(value));
    return this;
  }

  public Assigned withITURegDate(Calendar value) {
    setITURegDate(new TCalendar(value));
    return this;
  }

  public Assigned withITURegNum(String value) {
    setITURegNum(new TString(value));
    return this;
  }

  public Assigned withNavAidsChannel(String value) {
    setNavAidsChannel(new TString(value));
    return this;
  }

  public Assigned withNetNum(String value) {
    setNetNum(new TString(value));
    return this;
  }

  public Assigned withITURegComments(String value) {
    setITURegComments(new TString(value));
    return this;
  }

  public Assigned withFreq(Freq... values) {
    if (values != null) {
      getFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assigned withFreq(Collection<Freq> values) {
    if (values != null) {
      getFreq().addAll(values);
    }
    return this;
  }

  public Assigned withFreqOld(FreqOld... values) {
    if (values != null) {
      getFreqOld().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Assigned withFreqOld(Collection<FreqOld> values) {
    if (values != null) {
      getFreqOld().addAll(values);
    }
    return this;
  }

}
