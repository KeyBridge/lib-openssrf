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
package us.gov.dod.standard.ssrf._3_0.system.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  @XmlElement(name = "Repeater", required = false)
  private TString repeater;
  @XmlElement(name = "NumUsers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numUsers;
  @XmlElement(name = "EIRPMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMin;
  @XmlElement(name = "EIRPMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMax;
  @XmlElement(name = "OOBJustification", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString oobJustification;
  @XmlElement(name = "PowerLimit", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerLimit;
  @XmlElement(name = "PowerType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString powerType;
  @XmlElement(name = "SpectrumLink", required = false)
  private TString spectrumLink;
  @XmlElement(name = "Notation")
  private List<Notation> notation;
  @XmlElement(name = "Usage")
  private List<Usage> usage;
  @XmlElement(name = "ConfigFreq")
  private List<ConfigFreq> configFreq;
  @XmlElement(name = "TxRef")
  private List<TxRef> txRef;
  @XmlElement(name = "RxRef")
  private List<RxRef> rxRef;
  @XmlElement(name = "ConfigEmission")
  private List<ConfigEmission> configEmission;

  /**
   * Gets the value of the configID property.
   * <p>
   * @return 
   */
  public TString getConfigID() {
    return configID;
  }

  /**
   * Sets the value of the configID property.
   * <p>
   * @param value 
   */
  public void setConfigID(TString value) {
    this.configID = value;
  }

  public boolean isSetConfigID() {
    return (this.configID != null);
  }

  /**
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Gets the value of the repeater property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getRepeater() {
    return repeater;
  }

  /**
   * Sets the value of the repeater property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setRepeater(TString value) {
    this.repeater = value;
  }

  public boolean isSetRepeater() {
    return (this.repeater != null);
  }

  /**
   * Gets the value of the numUsers property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TInteger getNumUsers() {
    return numUsers;
  }

  /**
   * Sets the value of the numUsers property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNumUsers(TInteger value) {
    this.numUsers = value;
  }

  public boolean isSetNumUsers() {
    return (this.numUsers != null);
  }

  /**
   * Gets the value of the eirpMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getEIRPMin() {
    return eirpMin;
  }

  /**
   * Sets the value of the eirpMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setEIRPMin(TDecimal value) {
    this.eirpMin = value;
  }

  public boolean isSetEIRPMin() {
    return (this.eirpMin != null);
  }

  /**
   * Gets the value of the eirpMax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getEIRPMax() {
    return eirpMax;
  }

  /**
   * Sets the value of the eirpMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setEIRPMax(TDecimal value) {
    this.eirpMax = value;
  }

  public boolean isSetEIRPMax() {
    return (this.eirpMax != null);
  }

  /**
   * Gets the value of the oobJustification property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getOOBJustification() {
    return oobJustification;
  }

  /**
   * Sets the value of the oobJustification property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setOOBJustification(TString value) {
    this.oobJustification = value;
  }

  public boolean isSetOOBJustification() {
    return (this.oobJustification != null);
  }

  /**
   * Gets the value of the powerLimit property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPowerLimit() {
    return powerLimit;
  }

  /**
   * Sets the value of the powerLimit property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPowerLimit(TDecimal value) {
    this.powerLimit = value;
  }

  public boolean isSetPowerLimit() {
    return (this.powerLimit != null);
  }

  /**
   * Gets the value of the powerType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Sets the value of the powerType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPowerType(TString value) {
    this.powerType = value;
  }

  public boolean isSetPowerType() {
    return (this.powerType != null);
  }

  /**
   * Gets the value of the spectrumLink property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getSpectrumLink() {
    return spectrumLink;
  }

  /**
   * Sets the value of the spectrumLink property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSpectrumLink(TString value) {
    this.spectrumLink = value;
  }

  public boolean isSetSpectrumLink() {
    return (this.spectrumLink != null);
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
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<Notation> getNotation() {
    if (notation == null) {
      notation = new ArrayList<>();
    }
    return this.notation;
  }

  public boolean isSetNotation() {
    return ((this.notation != null) && (!this.notation.isEmpty()));
  }

  public void unsetNotation() {
    this.notation = null;
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
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<Usage> getUsage() {
    if (usage == null) {
      usage = new ArrayList<>();
    }
    return this.usage;
  }

  public boolean isSetUsage() {
    return ((this.usage != null) && (!this.usage.isEmpty()));
  }

  public void unsetUsage() {
    this.usage = null;
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
     * 
   * <p>
   * <p>
   * @return
   */
  public List<ConfigFreq> getConfigFreq() {
    if (configFreq == null) {
      configFreq = new ArrayList<>();
    }
    return this.configFreq;
  }

  public boolean isSetConfigFreq() {
    return ((this.configFreq != null) && (!this.configFreq.isEmpty()));
  }

  public void unsetConfigFreq() {
    this.configFreq = null;
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
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<TxRef> getTxRef() {
    if (txRef == null) {
      txRef = new ArrayList<>();
    }
    return this.txRef;
  }

  public boolean isSetTxRef() {
    return ((this.txRef != null) && (!this.txRef.isEmpty()));
  }

  public void unsetTxRef() {
    this.txRef = null;
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
   * Objects of the following type(s) are allowed in the list 
   * <p>
   * <p>
   * @return
   */
  public List<RxRef> getRxRef() {
    if (rxRef == null) {
      rxRef = new ArrayList<>();
    }
    return this.rxRef;
  }

  public boolean isSetRxRef() {
    return ((this.rxRef != null) && (!this.rxRef.isEmpty()));
  }

  public void unsetRxRef() {
    this.rxRef = null;
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
     * 
   * <p>
   * <p>
   * @return
   */
  public List<ConfigEmission> getConfigEmission() {
    if (configEmission == null) {
      configEmission = new ArrayList<>();
    }
    return this.configEmission;
  }

  public boolean isSetConfigEmission() {
    return ((this.configEmission != null) && (!this.configEmission.isEmpty()));
  }

  public void unsetConfigEmission() {
    this.configEmission = null;
  }

  public Configuration withConfigID(String value) {
    setConfigID(new TString(value));
    return this;
  }

  public Configuration withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  public Configuration withRepeater(ListCBO value) {
    setRepeater(new TString(value.value()));
    return this;
  }

  public Configuration withNumUsers(Integer value) {
    setNumUsers(new TInteger(value));
    return this;
  }

  public Configuration withEIRPMin(Double value) {
    setEIRPMin(new TDecimal(value));
    return this;
  }

  public Configuration withEIRPMax(Double value) {
    setEIRPMax(new TDecimal(value));
    return this;
  }

  public Configuration withOOBJustification(String value) {
    setOOBJustification(new TString(value));
    return this;
  }

  public Configuration withPowerLimit(Double value) {
    setPowerLimit(new TDecimal(value));
    return this;
  }

  public Configuration withPowerType(String value) {
    setPowerType(new TString(value));
    return this;
  }

  public Configuration withSpectrumLink(ListCBO value) {
    setSpectrumLink(new TString(value.value()));
    return this;
  }

  public Configuration withNotation(Notation... values) {
    if (values != null) {
      getNotation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Configuration withNotation(Collection<Notation> values) {
    if (values != null) {
      getNotation().addAll(values);
    }
    return this;
  }

  public Configuration withUsage(Usage... values) {
    if (values != null) {
      getUsage().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Configuration withUsage(Collection<Usage> values) {
    if (values != null) {
      getUsage().addAll(values);
    }
    return this;
  }

  public Configuration withConfigFreq(ConfigFreq... values) {
    if (values != null) {
      getConfigFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Configuration withConfigFreq(Collection<ConfigFreq> values) {
    if (values != null) {
      getConfigFreq().addAll(values);
    }
    return this;
  }

  public Configuration withTxRef(TxRef... values) {
    if (values != null) {
      getTxRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Configuration withTxRef(Collection<TxRef> values) {
    if (values != null) {
      getTxRef().addAll(values);
    }
    return this;
  }

  public Configuration withRxRef(RxRef... values) {
    if (values != null) {
      getRxRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Configuration withRxRef(Collection<RxRef> values) {
    if (values != null) {
      getRxRef().addAll(values);
    }
    return this;
  }

  public Configuration withConfigEmission(ConfigEmission... values) {
    if (values != null) {
      getConfigEmission().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Configuration withConfigEmission(Collection<ConfigEmission> values) {
    if (values != null) {
      getConfigEmission().addAll(values);
    }
    return this;
  }

}
