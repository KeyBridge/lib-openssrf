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
 * Java class for Configuration complex type.
 * <p>
 * Data element Configuration identifies each operational configuration that is
 * required in a SSRequest, granted by a Host Nation in a SSReply, or authorised
 * in a frequency Assignment or Allotment dataset. It also identifies the
 * functional use of the assigned frequency at a particular transmitting
 * station. Finally, it may indicate if the receiver station is used primarily
 * as a repeater. A direct coupling between the station's receiver and the
 * station's transmitter allows the incoming signal to be retransmitted exactly
 * as received.
 * <p>
 * This element is OPTIONAL and repeatable under HostNationConstraints element.
 * If omitted, the SSReply is assumed to agree with every Configuration in the
 * corresponding SSRequest. In case some configurations in SSRequest are not
 * acceptable, use Configuration in HostNationConstraints to describe the
 * accepted configurations (if necessary, modifying the information from the
 * SSRequest).
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

  /**
   * ConfigID: Enter a short name for the configuration; this name should be a
   * meaningful identification of the configuration, but it can also be
   * automatically generated in some systems. The identifier MUST be unique
   * within the dataset and SHOULD NOT be modified during the entire lifetime of
   * the dataset.
   * <p>
   * [XSD ERR UNIQUE] Each value of this data item MUST be unique within the
   * parent element.
   */
  @XmlElement(name = "ConfigID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString configID;
  /**
   * Description: Enter a description of the operational mode; this description
   * should be a meaningful explanation of the mode main characteristics.
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * Repeater: Enter "Yes" for each receiver location when a station in the
   * fixed or mobile service is used primarily as a repeater.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "Repeater", required = false)
  private TString repeater;
  /**
   * NumUsers: Enter the number of users supported by the configuration. This
   * data may be used to analyse spectrum usage.
   */
  @XmlElement(name = "NumUsers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numUsers;
  /**
   * Group EIRP contains the Effective Isotropic Radiated Power (EIRP) radiated
   * from the transmitter antenna. The EIRP is the sum of the power supplied to
   * the antenna and the gain of the antenna, less the line loss, expressed in
   * dBW.
   * <p>
   * EIRPMin: Enter the minimum or nominal EIRP radiated from the transmitter
   * antenna.
   */
  @XmlElement(name = "EIRPMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMin;
  /**
   * EIRPMax: Enter the maximum EIRP, in the case of a range of values; in the
   * case of a SSReply, use the EIRPMax to specify the maximum authorised power
   * in your Nation for the specified Configuration.
   */
  @XmlElement(name = "EIRPMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal eirpMax;
  /**
   * OOBJustification: Enter the justification for out-of-band frequency use.
   */
  @XmlElement(name = "OOBJustification", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString oobJustification;
  /**
   * PowerLimit (US): Enter the power limit of the transmissions in this
   * configuration.
   */
  @XmlElement(name = "PowerLimit", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal powerLimit;
  /**
   * PowerType (US): Enter the power type code for carrier, mean, or peak
   * envelope power emitted. The power type code will depend on the type of
   * emission of the transmitter equipment.
   * <p>
   * Recommend values from Code List CPT
   */
  @XmlElement(name = "PowerType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString powerType;
  /**
   * SpectrumLink (US): Indicate whether the transmitter(s) communicate or
   * interact with the receiver(s) in this Configuration, i.e. indicates a link
   * versus a box.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "SpectrumLink", required = false)
  private TString spectrumLink;
  /**
   * This element contains the electronic identification for a pulsed or
   * non-pulsed electromagnetic emission. It includes but is not limited to
   * Communications Emitter Notation (CENOT) and Electronic Intelligence
   * Notation (ELNOT). It is not nomenclature specific, but based on the
   * emission signature. Therefore, equipment's that have the same or near same
   * emission signature may have the same Notation.
   */
  @XmlElement(name = "Notation")
  private List<Notation> notation;
  /**
   * This element identifies how an operational configuration can be used or
   * will be used.
   */
  @XmlElement(name = "Usage")
  private List<Usage> usage;
  /**
   * This element indicates the set of frequencies that a configuration uses,
   * which may be a subset of the frequencies that the linked components
   * (Transmitter, Receiver, Antenna) are capable of.
   */
  @XmlElement(name = "ConfigFreq")
  private List<ConfigFreq> configFreq;
  /**
   * This element contains the reference of a Transmitter, and optionally some
   * of its TxModes and the associated Antennas and AntMode.
   */
  @XmlElement(name = "TxRef")
  private List<TxRef> txRef;
  /**
   * This element contains the reference of a Receiver, and optionally some of
   * its RxModes and the associated Antennas and AntMode.
   */
  @XmlElement(name = "RxRef")
  private List<RxRef> rxRef;
  /**
   * This element and its sub-elements define the emission bandwidths and
   * classification symbols that a Configuration uses, which may be a subset of
   * the linked components' capabilities.
   */
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
   * @return
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getRepeater() {
    return repeater;
  }

  /**
   * Sets the value of the repeater property.
   * <p>
   * @param value
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
   * @return
   */
  public TInteger getNumUsers() {
    return numUsers;
  }

  /**
   * Sets the value of the numUsers property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getEIRPMin() {
    return eirpMin;
  }

  /**
   * Sets the value of the eirpMin property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getEIRPMax() {
    return eirpMax;
  }

  /**
   * Sets the value of the eirpMax property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getOOBJustification() {
    return oobJustification;
  }

  /**
   * Sets the value of the oobJustification property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getPowerLimit() {
    return powerLimit;
  }

  /**
   * Sets the value of the powerLimit property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getPowerType() {
    return powerType;
  }

  /**
   * Sets the value of the powerType property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getSpectrumLink() {
    return spectrumLink;
  }

  /**
   * Sets the value of the spectrumLink property.
   * <p>
   * @param value
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the notation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNotation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the usage property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUsage().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configFreq property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfigFreq().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rxRef property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRxRef().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the configEmission property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getConfigEmission().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
