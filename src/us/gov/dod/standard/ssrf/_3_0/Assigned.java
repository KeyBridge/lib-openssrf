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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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
 * &lt;complexType name="Assigned">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Quality" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN1" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Colour" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ITURegistration" minOccurs="0"/>
 *         &lt;element name="NavAidsChannel" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TNavAidChnl" minOccurs="0"/>
 *         &lt;element name="NetNum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TNetNumber" minOccurs="0"/>
 *         &lt;element name="ITURegComments" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Freq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Freq" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreqOld" type="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqOld" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
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

  @XmlElementRef(name = "Quality", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN1> quality;
  @XmlElementRef(name = "ColourWord", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS20> colourWord;
  @XmlElementRef(name = "ColourNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN2> colourNum;
  @XmlElementRef(name = "ITURegStatus", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> ituRegStatus;
  @XmlElementRef(name = "ITURegDate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TD> ituRegDate;
  @XmlElementRef(name = "ITURegNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS10> ituRegNum;
  @XmlElementRef(name = "NavAidsChannel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TNavAidChnl> navAidsChannel;
  @XmlElementRef(name = "NetNum", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TNetNumber> netNum;
  @XmlElementRef(name = "ITURegComments", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> ituRegComments;
  @XmlElement(name = "Freq")
  protected List<Freq> freq;
  @XmlElement(name = "FreqOld", nillable = true)
  protected List<FreqOld> freqOld;

  /**
   * Gets the value of the quality property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN1 }{@code >}
   * <p>
   */
  public JAXBElement<TUN1> getQuality() {
    return quality;
  }

  /**
   * Sets the value of the quality property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN1 }{@code >}
   * <p>
   */
  public void setQuality(JAXBElement<TUN1> value) {
    this.quality = value;
  }

  /**
   * Gets the value of the colourWord property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public JAXBElement<TS20> getColourWord() {
    return colourWord;
  }

  /**
   * Sets the value of the colourWord property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS20 }{@code >}
   * <p>
   */
  public void setColourWord(JAXBElement<TS20> value) {
    this.colourWord = value;
  }

  /**
   * Gets the value of the colourNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN2 }{@code >}
   * <p>
   */
  public JAXBElement<TUN2> getColourNum() {
    return colourNum;
  }

  /**
   * Sets the value of the colourNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN2 }{@code >}
   * <p>
   */
  public void setColourNum(JAXBElement<TUN2> value) {
    this.colourNum = value;
  }

  /**
   * Gets the value of the ituRegStatus property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getITURegStatus() {
    return ituRegStatus;
  }

  /**
   * Sets the value of the ituRegStatus property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setITURegStatus(JAXBElement<TS50> value) {
    this.ituRegStatus = value;
  }

  /**
   * Gets the value of the ituRegDate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public JAXBElement<TD> getITURegDate() {
    return ituRegDate;
  }

  /**
   * Sets the value of the ituRegDate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TD }{@code >}
   * <p>
   */
  public void setITURegDate(JAXBElement<TD> value) {
    this.ituRegDate = value;
  }

  /**
   * Gets the value of the ituRegNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS10 }{@code >}
   * <p>
   */
  public JAXBElement<TUS10> getITURegNum() {
    return ituRegNum;
  }

  /**
   * Sets the value of the ituRegNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS10 }{@code >}
   * <p>
   */
  public void setITURegNum(JAXBElement<TUS10> value) {
    this.ituRegNum = value;
  }

  /**
   * Gets the value of the navAidsChannel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TNavAidChnl }{@code >}
   * <p>
   */
  public JAXBElement<TNavAidChnl> getNavAidsChannel() {
    return navAidsChannel;
  }

  /**
   * Sets the value of the navAidsChannel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TNavAidChnl }{@code >}
   * <p>
   */
  public void setNavAidsChannel(JAXBElement<TNavAidChnl> value) {
    this.navAidsChannel = value;
  }

  /**
   * Gets the value of the netNum property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TNetNumber }{@code >}
   * <p>
   */
  public JAXBElement<TNetNumber> getNetNum() {
    return netNum;
  }

  /**
   * Sets the value of the netNum property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TNetNumber }{@code >}
   * <p>
   */
  public void setNetNum(JAXBElement<TNetNumber> value) {
    this.netNum = value;
  }

  /**
   * Gets the value of the ituRegComments property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getITURegComments() {
    return ituRegComments;
  }

  /**
   * Sets the value of the ituRegComments property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setITURegComments(JAXBElement<TMEMO> value) {
    this.ituRegComments = value;
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
   */
  public List<Freq> getFreq() {
    if (freq == null) {
      freq = new ArrayList<>();
    }
    return this.freq;
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
   */
  public List<FreqOld> getFreqOld() {
    if (freqOld == null) {
      freqOld = new ArrayList<>();
    }
    return this.freqOld;
  }

}
