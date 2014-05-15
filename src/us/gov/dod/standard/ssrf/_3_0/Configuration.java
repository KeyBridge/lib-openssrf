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
 * Java class for Configuration complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfigID" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/>
 *         &lt;element name="Description" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/>
 *         &lt;element name="Repeater" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="NumUsers" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN9" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}EIRP" minOccurs="0"/>
 *         &lt;element name="OOBJustification" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="PowerLimit" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdBW" minOccurs="0"/>
 *         &lt;element name="PowerType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="SpectrumLink" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Notation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Notation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Usage" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Usage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConfigFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ConfigFreq" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TxRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TxRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RxRef" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RxRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConfigEmission" type="{urn:us:gov:dod:standard:ssrf:3.0.0}ConfigEmission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
  "configID",
  "description",
  "repeater",
  "numUsers",
  "eirpMin",
  "eirpMax",
  "oobJustification",
  "powerLimit",
  "powerType",
  "spectrumLink",
  "notation",
  "usage",
  "configFreq",
  "txRef",
  "rxRef",
  "configEmission"
})
public class Configuration {

  @XmlElement(name = "ConfigID", required = true)
  protected TS100 configID;
  @XmlElementRef(name = "Description", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> description;
  @XmlElementRef(name = "Repeater", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> repeater;
  @XmlElementRef(name = "NumUsers", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN9> numUsers;
  @XmlElementRef(name = "EIRPMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> eirpMin;
  @XmlElementRef(name = "EIRPMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> eirpMax;
  @XmlElementRef(name = "OOBJustification", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> oobJustification;
  @XmlElementRef(name = "PowerLimit", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBW> powerLimit;
  @XmlElementRef(name = "PowerType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> powerType;
  @XmlElementRef(name = "SpectrumLink", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> spectrumLink;
  @XmlElement(name = "Notation")
  protected List<Notation> notation;
  @XmlElement(name = "Usage")
  protected List<Usage> usage;
  @XmlElement(name = "ConfigFreq")
  protected List<ConfigFreq> configFreq;
  @XmlElement(name = "TxRef")
  protected List<TxRef> txRef;
  @XmlElement(name = "RxRef")
  protected List<RxRef> rxRef;
  @XmlElement(name = "ConfigEmission")
  protected List<ConfigEmission> configEmission;

  /**
   * Gets the value of the configID property.
   * <p>
   * @return possible object is {@link TS100 }
   * <p>
   */
  public TS100 getConfigID() {
    return configID;
  }

  /**
   * Sets the value of the configID property.
   * <p>
   * @param value allowed object is {@link TS100 }
   * <p>
   */
  public void setConfigID(TS100 value) {
    this.configID = value;
  }

  /**
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public JAXBElement<TS100> getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setDescription(JAXBElement<TS100> value) {
    this.description = value;
  }

  /**
   * Gets the value of the repeater property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getRepeater() {
    return repeater;
  }

  /**
   * Sets the value of the repeater property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setRepeater(JAXBElement<TListCBO> value) {
    this.repeater = value;
  }

  /**
   * Gets the value of the numUsers property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public JAXBElement<TUN9> getNumUsers() {
    return numUsers;
  }

  /**
   * Sets the value of the numUsers property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN9 }{@code >}
   * <p>
   */
  public void setNumUsers(JAXBElement<TUN9> value) {
    this.numUsers = value;
  }

  /**
   * Gets the value of the eirpMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getEIRPMin() {
    return eirpMin;
  }

  /**
   * Sets the value of the eirpMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setEIRPMin(JAXBElement<TdBW> value) {
    this.eirpMin = value;
  }

  /**
   * Gets the value of the eirpMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getEIRPMax() {
    return eirpMax;
  }

  /**
   * Sets the value of the eirpMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setEIRPMax(JAXBElement<TdBW> value) {
    this.eirpMax = value;
  }

  /**
   * Gets the value of the oobJustification property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getOOBJustification() {
    return oobJustification;
  }

  /**
   * Sets the value of the oobJustification property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setOOBJustification(JAXBElement<TMEMO> value) {
    this.oobJustification = value;
  }

  /**
   * Gets the value of the powerLimit property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public JAXBElement<TdBW> getPowerLimit() {
    return powerLimit;
  }

  /**
   * Sets the value of the powerLimit property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBW }{@code >}
   * <p>
   */
  public void setPowerLimit(JAXBElement<TdBW> value) {
    this.powerLimit = value;
  }

  /**
   * Gets the value of the powerType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getPowerType() {
    return powerType;
  }

  /**
   * Sets the value of the powerType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setPowerType(JAXBElement<TS10> value) {
    this.powerType = value;
  }

  /**
   * Gets the value of the spectrumLink property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getSpectrumLink() {
    return spectrumLink;
  }

  /**
   * Sets the value of the spectrumLink property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setSpectrumLink(JAXBElement<TListCBO> value) {
    this.spectrumLink = value;
  }

  /**
   * Gets the value of the notation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the notation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNotation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Notation }
   * <p>
   * <p>
   */
  public List<Notation> getNotation() {
    if (notation == null) {
      notation = new ArrayList<>();
    }
    return this.notation;
  }

  /**
   * Gets the value of the usage property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the usage property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUsage().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Usage }
   * <p>
   * <p>
   */
  public List<Usage> getUsage() {
    if (usage == null) {
      usage = new ArrayList<>();
    }
    return this.usage;
  }

  /**
   * Gets the value of the configFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfigFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ConfigFreq }
   * <p>
   * <p>
   */
  public List<ConfigFreq> getConfigFreq() {
    if (configFreq == null) {
      configFreq = new ArrayList<>();
    }
    return this.configFreq;
  }

  /**
   * Gets the value of the txRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link TxRef }
   * <p>
   * <p>
   */
  public List<TxRef> getTxRef() {
    if (txRef == null) {
      txRef = new ArrayList<>();
    }
    return this.txRef;
  }

  /**
   * Gets the value of the rxRef property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rxRef property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRxRef().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link RxRef }
   * <p>
   * <p>
   */
  public List<RxRef> getRxRef() {
    if (rxRef == null) {
      rxRef = new ArrayList<>();
    }
    return this.rxRef;
  }

  /**
   * Gets the value of the configEmission property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configEmission property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfigEmission().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link ConfigEmission }
   * <p>
   * <p>
   */
  public List<ConfigEmission> getConfigEmission() {
    if (configEmission == null) {
      configEmission = new ArrayList<>();
    }
    return this.configEmission;
  }

}
