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

import us.gov.dod.standard.ssrf._3_0.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.lists.ListCFO;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for TxMode complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TxMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ModeInfo"/>
 *         &lt;element name="NecessaryBw" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Tunability" minOccurs="0"/>
 *         &lt;element name="NumSubCarriers" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5" minOccurs="0"/>
 *         &lt;element name="NumSideTones" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUN5" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Intermodulation" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Burst" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}OccupiedBw" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Spurious" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqTolerance" minOccurs="0"/>
 *         &lt;element name="RadarType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25" minOccurs="0"/>
 *         &lt;element name="GpsNBL1Level" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_dBW" minOccurs="0"/>
 *         &lt;element name="GpsNBL2Level" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_dBW" minOccurs="0"/>
 *         &lt;element name="GpsWBL1Level" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_dBWHz" minOccurs="0"/>
 *         &lt;element name="GpsWBL2Level" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS_dBWHz" minOccurs="0"/>
 *         &lt;element name="ModulationType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="ModeName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS40" minOccurs="0"/>
 *         &lt;element name="EmsClass" type="{urn:us:gov:dod:standard:ssrf:3.0.0}EmsClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Power" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Power" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TxSignalTuning" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TxSignalTuning" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TxModulation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TxModulation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Baseband" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Baseband" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pulse" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Pulse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubCarrierFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}SubCarrierFreq" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubCarrierTone" type="{urn:us:gov:dod:standard:ssrf:3.0.0}SubCarrierTone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpreadSpectrum" type="{urn:us:gov:dod:standard:ssrf:3.0.0}SpreadSpectrum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="curves" type="{urn:us:gov:dod:standard:ssrf:3.0.0}IdxList" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxMode", propOrder = {
  "modeID",
  "description",
  "necessaryBw",
  "tunability",
  "tuningMethod",
  "numSubCarriers",
  "numSideTones",
  "intermodPct",
  "intermodEffect",
  "burstRate",
  "burstDuration",
  "burstNumPulses",
  "burstOffTime",
  "occBw",
  "occBwCalculated",
  "secondHarmonicLevel",
  "thirdHarmonicLevel",
  "otherHarmonicLevel",
  "spuriousLevel",
  "freqTolerance",
  "freqToleranceUnit",
  "radarType",
  "gpsNBL1Level",
  "gpsNBL2Level",
  "gpsWBL1Level",
  "gpsWBL2Level",
  "modulationType",
  "modeName",
  "emsClass",
  "power",
  "txSignalTuning",
  "txModulation",
  "baseband",
  "pulse",
  "subCarrierFreq",
  "subCarrierTone",
  "spreadSpectrum"
})
public class TxMode {

  @XmlElement(name = "ModeID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  @XmlElement(name = "NecessaryBw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal necessaryBw;
  @XmlElement(name = "Tunability", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString tunability;
  @XmlElement(name = "TuningMethod", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString tuningMethod;
  @XmlElement(name = "NumSubCarriers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSubCarriers;
  @XmlElement(name = "NumSideTones", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSideTones;
  @XmlElement(name = "IntermodPct", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal intermodPct;
  @XmlElement(name = "IntermodEffect", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intermodEffect;
  @XmlElement(name = "BurstRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN12_3.class)
  private TDecimal burstRate;
  @XmlElement(name = "BurstDuration", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstDuration;
  @XmlElement(name = "BurstNumPulses", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN8.class)
  private TInteger burstNumPulses;
  @XmlElement(name = "BurstOffTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstOffTime;
  @XmlElement(name = "OccBw")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal occBw;
  @XmlElement(name = "OccBwCalculated", required = false)
  private TString occBwCalculated;
  @XmlElement(name = "SecondHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal secondHarmonicLevel;
  @XmlElement(name = "ThirdHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal thirdHarmonicLevel;
  @XmlElement(name = "OtherHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal otherHarmonicLevel;
  @XmlElement(name = "SpuriousLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal spuriousLevel;
  @XmlElement(name = "FreqTolerance")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN18_6.class)
  private TDecimal freqTolerance;
  @XmlElement(name = "FreqToleranceUnit")
  private TString freqToleranceUnit;
  @XmlElement(name = "RadarType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString radarType;
  @XmlElement(name = "GpsNBL1Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL1Level;
  @XmlElement(name = "GpsNBL2Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL2Level;
  @XmlElement(name = "GpsWBL1Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL1Level;
  @XmlElement(name = "GpsWBL2Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL2Level;
  @XmlElement(name = "ModulationType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString modulationType;
  @XmlElement(name = "ModeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;
  @XmlElement(name = "EmsClass", nillable = true)
  private List<EmsClass> emsClass;
  @XmlElement(name = "Power")
  private List<Power> power;
  @XmlElement(name = "TxSignalTuning")
  private List<TxSignalTuning> txSignalTuning;
  @XmlElement(name = "TxModulation")
  private List<TxModulation> txModulation;
  @XmlElement(name = "Baseband")
  private List<Baseband> baseband;
  @XmlElement(name = "Pulse")
  private List<Pulse> pulse;
  @XmlElement(name = "SubCarrierFreq", nillable = true)
  private List<SubCarrierFreq> subCarrierFreq;
  @XmlElement(name = "SubCarrierTone", nillable = true)
  private List<SubCarrierTone> subCarrierTone;
  @XmlElement(name = "SpreadSpectrum")
  protected SpreadSpectrum spreadSpectrum;
  @XmlAttribute(name = "curves")
  private List<BigInteger> curves;

  /**
   * Gets the value of the modeID property.
   * <p>
   * @return possible object is {@link TS20 }
   * <p>
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Sets the value of the modeID property.
   * <p>
   * @param value allowed object is {@link TS20 }
   * <p>
   */
  public void setModeID(TString value) {
    this.modeID = value;
  }

  public boolean isSetModeID() {
    return (this.modeID != null);
  }

  /**
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS100 }{@code >}
   * <p>
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Gets the value of the necessaryBw property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Sets the value of the necessaryBw property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setNecessaryBw(TDecimal value) {
    this.necessaryBw = value;
  }

  public boolean isSetNecessaryBw() {
    return (this.necessaryBw != null);
  }

  /**
   * Gets the value of the tunability property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public TString getTunability() {
    return tunability;
  }

  /**
   * Sets the value of the tunability property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setTunability(TString value) {
    this.tunability = value;
  }

  public boolean isSetTunability() {
    return (this.tunability != null);
  }

  /**
   * Gets the value of the tuningMethod property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public TString getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Sets the value of the tuningMethod property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setTuningMethod(TString value) {
    this.tuningMethod = value;
  }

  public boolean isSetTuningMethod() {
    return (this.tuningMethod != null);
  }

  /**
   * Gets the value of the numSubCarriers property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public TInteger getNumSubCarriers() {
    return numSubCarriers;
  }

  /**
   * Sets the value of the numSubCarriers property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setNumSubCarriers(TInteger value) {
    this.numSubCarriers = value;
  }

  public boolean isSetNumSubCarriers() {
    return (this.numSubCarriers != null);
  }

  /**
   * Gets the value of the numSideTones property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public TInteger getNumSideTones() {
    return numSideTones;
  }

  /**
   * Sets the value of the numSideTones property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setNumSideTones(TInteger value) {
    this.numSideTones = value;
  }

  public boolean isSetNumSideTones() {
    return (this.numSideTones != null);
  }

  /**
   * Gets the value of the intermodPct property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public TDecimal getIntermodPct() {
    return intermodPct;
  }

  /**
   * Sets the value of the intermodPct property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public void setIntermodPct(TDecimal value) {
    this.intermodPct = value;
  }

  public boolean isSetIntermodPct() {
    return (this.intermodPct != null);
  }

  /**
   * Gets the value of the intermodEffect property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public TString getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Sets the value of the intermodEffect property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setIntermodEffect(TString value) {
    this.intermodEffect = value;
  }

  public boolean isSetIntermodEffect() {
    return (this.intermodEffect != null);
  }

  /**
   * Gets the value of the burstRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN12_3 }{@code >}
   * <p>
   */
  public TDecimal getBurstRate() {
    return burstRate;
  }

  /**
   * Sets the value of the burstRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN12_3 }{@code >}
   * <p>
   */
  public void setBurstRate(TDecimal value) {
    this.burstRate = value;
  }

  public boolean isSetBurstRate() {
    return (this.burstRate != null);
  }

  /**
   * Gets the value of the burstDuration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public TDecimal getBurstDuration() {
    return burstDuration;
  }

  /**
   * Sets the value of the burstDuration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setBurstDuration(TDecimal value) {
    this.burstDuration = value;
  }

  public boolean isSetBurstDuration() {
    return (this.burstDuration != null);
  }

  /**
   * Gets the value of the burstNumPulses property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN8 }{@code >}
   * <p>
   */
  public TInteger getBurstNumPulses() {
    return burstNumPulses;
  }

  /**
   * Sets the value of the burstNumPulses property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN8 }{@code >}
   * <p>
   */
  public void setBurstNumPulses(TInteger value) {
    this.burstNumPulses = value;
  }

  public boolean isSetBurstNumPulses() {
    return (this.burstNumPulses != null);
  }

  /**
   * Gets the value of the burstOffTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public TDecimal getBurstOffTime() {
    return burstOffTime;
  }

  /**
   * Sets the value of the burstOffTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setBurstOffTime(TDecimal value) {
    this.burstOffTime = value;
  }

  public boolean isSetBurstOffTime() {
    return (this.burstOffTime != null);
  }

  /**
   * Gets the value of the occBw property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TDecimal getOccBw() {
    return occBw;
  }

  /**
   * Sets the value of the occBw property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setOccBw(TDecimal value) {
    this.occBw = value;
  }

  public boolean isSetOccBw() {
    return (this.occBw != null);
  }

  /**
   * Gets the value of the occBwCalculated property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getOccBwCalculated() {
    return occBwCalculated;
  }

  /**
   * Sets the value of the occBwCalculated property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setOccBwCalculated(TString value) {
    this.occBwCalculated = value;
  }

  public boolean isSetOccBwCalculated() {
    return (this.occBwCalculated != null);
  }

  /**
   * Gets the value of the secondHarmonicLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public TDecimal getSecondHarmonicLevel() {
    return secondHarmonicLevel;
  }

  /**
   * Sets the value of the secondHarmonicLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setSecondHarmonicLevel(TDecimal value) {
    this.secondHarmonicLevel = value;
  }

  public boolean isSetSecondHarmonicLevel() {
    return (this.secondHarmonicLevel != null);
  }

  /**
   * Gets the value of the thirdHarmonicLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public TDecimal getThirdHarmonicLevel() {
    return thirdHarmonicLevel;
  }

  /**
   * Sets the value of the thirdHarmonicLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setThirdHarmonicLevel(TDecimal value) {
    this.thirdHarmonicLevel = value;
  }

  public boolean isSetThirdHarmonicLevel() {
    return (this.thirdHarmonicLevel != null);
  }

  /**
   * Gets the value of the otherHarmonicLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public TDecimal getOtherHarmonicLevel() {
    return otherHarmonicLevel;
  }

  /**
   * Sets the value of the otherHarmonicLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setOtherHarmonicLevel(TDecimal value) {
    this.otherHarmonicLevel = value;
  }

  public boolean isSetOtherHarmonicLevel() {
    return (this.otherHarmonicLevel != null);
  }

  /**
   * Gets the value of the spuriousLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public TDecimal getSpuriousLevel() {
    return spuriousLevel;
  }

  /**
   * Sets the value of the spuriousLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setSpuriousLevel(TDecimal value) {
    this.spuriousLevel = value;
  }

  public boolean isSetSpuriousLevel() {
    return (this.spuriousLevel != null);
  }

  /**
   * Gets the value of the freqTolerance property.
   * <p>
   * @return possible object is {@link TUN18_6 }
   * <p>
   */
  public TDecimal getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Sets the value of the freqTolerance property.
   * <p>
   * @param value allowed object is {@link TUN18_6 }
   * <p>
   */
  public void setFreqTolerance(TDecimal value) {
    this.freqTolerance = value;
  }

  public boolean isSetFreqTolerance() {
    return (this.freqTolerance != null);
  }

  /**
   * Gets the value of the freqToleranceUnit property.
   * <p>
   * @return possible object is {@link TListCFO }
   * <p>
   */
  public TString getFreqToleranceUnit() {
    return freqToleranceUnit;
  }

  /**
   * Sets the value of the freqToleranceUnit property.
   * <p>
   * @param value allowed object is {@link TListCFO }
   * <p>
   */
  public void setFreqToleranceUnit(TString value) {
    this.freqToleranceUnit = value;
  }

  public boolean isSetFreqToleranceUnit() {
    return (this.freqToleranceUnit != null);
  }

  /**
   * Gets the value of the radarType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public TString getRadarType() {
    return radarType;
  }

  /**
   * Sets the value of the radarType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setRadarType(TString value) {
    this.radarType = value;
  }

  public boolean isSetRadarType() {
    return (this.radarType != null);
  }

  /**
   * Gets the value of the gpsNBL1Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public TDecimal getGpsNBL1Level() {
    return gpsNBL1Level;
  }

  /**
   * Sets the value of the gpsNBL1Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public void setGpsNBL1Level(TDecimal value) {
    this.gpsNBL1Level = value;
  }

  public boolean isSetGpsNBL1Level() {
    return (this.gpsNBL1Level != null);
  }

  /**
   * Gets the value of the gpsNBL2Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public TDecimal getGpsNBL2Level() {
    return gpsNBL2Level;
  }

  /**
   * Sets the value of the gpsNBL2Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public void setGpsNBL2Level(TDecimal value) {
    this.gpsNBL2Level = value;
  }

  public boolean isSetGpsNBL2Level() {
    return (this.gpsNBL2Level != null);
  }

  /**
   * Gets the value of the gpsWBL1Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public TDecimal getGpsWBL1Level() {
    return gpsWBL1Level;
  }

  /**
   * Sets the value of the gpsWBL1Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public void setGpsWBL1Level(TDecimal value) {
    this.gpsWBL1Level = value;
  }

  public boolean isSetGpsWBL1Level() {
    return (this.gpsWBL1Level != null);
  }

  /**
   * Gets the value of the gpsWBL2Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public TDecimal getGpsWBL2Level() {
    return gpsWBL2Level;
  }

  /**
   * Sets the value of the gpsWBL2Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public void setGpsWBL2Level(TDecimal value) {
    this.gpsWBL2Level = value;
  }

  public boolean isSetGpsWBL2Level() {
    return (this.gpsWBL2Level != null);
  }

  /**
   * Gets the value of the modulationType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public TString getModulationType() {
    return modulationType;
  }

  /**
   * Sets the value of the modulationType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setModulationType(TString value) {
    this.modulationType = value;
  }

  public boolean isSetModulationType() {
    return (this.modulationType != null);
  }

  /**
   * Gets the value of the modeName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Sets the value of the modeName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public void setModeName(TString value) {
    this.modeName = value;
  }

  public boolean isSetModeName() {
    return (this.modeName != null);
  }

  /**
   * Gets the value of the emsClass property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the emsClass property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEmsClass().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link EmsClass }
   * <p>
   * <p>
   * @return
   */
  public List<EmsClass> getEmsClass() {
    if (emsClass == null) {
      emsClass = new ArrayList<>();
    }
    return this.emsClass;
  }

  public boolean isSetEmsClass() {
    return ((this.emsClass != null) && (!this.emsClass.isEmpty()));
  }

  public void unsetEmsClass() {
    this.emsClass = null;
  }

  /**
   * Gets the value of the power property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the power property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPower().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Power }
   * <p>
   * <p>
   * @return
   */
  public List<Power> getPower() {
    if (power == null) {
      power = new ArrayList<>();
    }
    return this.power;
  }

  public boolean isSetPower() {
    return ((this.power != null) && (!this.power.isEmpty()));
  }

  public void unsetPower() {
    this.power = null;
  }

  /**
   * Gets the value of the txSignalTuning property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txSignalTuning property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxSignalTuning().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link TxSignalTuning }
   * <p>
   * <p>
   * @return
   */
  public List<TxSignalTuning> getTxSignalTuning() {
    if (txSignalTuning == null) {
      txSignalTuning = new ArrayList<>();
    }
    return this.txSignalTuning;
  }

  public boolean isSetTxSignalTuning() {
    return ((this.txSignalTuning != null) && (!this.txSignalTuning.isEmpty()));
  }

  public void unsetTxSignalTuning() {
    this.txSignalTuning = null;
  }

  /**
   * Gets the value of the txModulation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txModulation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxModulation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link TxModulation }
   * <p>
   * <p>
   * @return
   */
  public List<TxModulation> getTxModulation() {
    if (txModulation == null) {
      txModulation = new ArrayList<>();
    }
    return this.txModulation;
  }

  public boolean isSetTxModulation() {
    return ((this.txModulation != null) && (!this.txModulation.isEmpty()));
  }

  public void unsetTxModulation() {
    this.txModulation = null;
  }

  /**
   * Gets the value of the baseband property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the baseband property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBaseband().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Baseband }
   * <p>
   * <p>
   * @return
   */
  public List<Baseband> getBaseband() {
    if (baseband == null) {
      baseband = new ArrayList<>();
    }
    return this.baseband;
  }

  public boolean isSetBaseband() {
    return ((this.baseband != null) && (!this.baseband.isEmpty()));
  }

  public void unsetBaseband() {
    this.baseband = null;
  }

  /**
   * Gets the value of the pulse property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pulse property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPulse().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Pulse }
   * <p>
   * <p>
   * @return
   */
  public List<Pulse> getPulse() {
    if (pulse == null) {
      pulse = new ArrayList<>();
    }
    return this.pulse;
  }

  public boolean isSetPulse() {
    return ((this.pulse != null) && (!this.pulse.isEmpty()));
  }

  public void unsetPulse() {
    this.pulse = null;
  }

  /**
   * Gets the value of the subCarrierFreq property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the subCarrierFreq property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSubCarrierFreq().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link SubCarrierFreq }
   * <p>
   * <p>
   * @return
   */
  public List<SubCarrierFreq> getSubCarrierFreq() {
    if (subCarrierFreq == null) {
      subCarrierFreq = new ArrayList<>();
    }
    return this.subCarrierFreq;
  }

  public boolean isSetSubCarrierFreq() {
    return ((this.subCarrierFreq != null) && (!this.subCarrierFreq.isEmpty()));
  }

  public void unsetSubCarrierFreq() {
    this.subCarrierFreq = null;
  }

  /**
   * Gets the value of the subCarrierTone property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the subCarrierTone property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSubCarrierTone().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link SubCarrierTone }
   * <p>
   * <p>
   * @return
   */
  public List<SubCarrierTone> getSubCarrierTone() {
    if (subCarrierTone == null) {
      subCarrierTone = new ArrayList<>();
    }
    return this.subCarrierTone;
  }

  public boolean isSetSubCarrierTone() {
    return ((this.subCarrierTone != null) && (!this.subCarrierTone.isEmpty()));
  }

  public void unsetSubCarrierTone() {
    this.subCarrierTone = null;
  }

  /**
   * Gets the value of the spreadSpectrum property.
   * <p>
   * @return possible object is {@link SpreadSpectrum }
   * <p>
   */
  public SpreadSpectrum getSpreadSpectrum() {
    return spreadSpectrum;
  }

  /**
   * Sets the value of the spreadSpectrum property.
   * <p>
   * @param value allowed object is {@link SpreadSpectrum }
   * <p>
   */
  public void setSpreadSpectrum(SpreadSpectrum value) {
    this.spreadSpectrum = value;
  }

  public boolean isSetSpreadSpectrum() {
    return (this.spreadSpectrum != null);
  }

  /**
   * Gets the value of the curves property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the curves property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurves().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   * <p>
   * <p>
   * @return
   */
  public List<BigInteger> getCurves() {
    if (curves == null) {
      curves = new ArrayList<>();
    }
    return this.curves;
  }

  public boolean isSetCurves() {
    return ((this.curves != null) && (!this.curves.isEmpty()));
  }

  public void unsetCurves() {
    this.curves = null;
  }

  public TxMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  public TxMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  public TxMode withNecessaryBw(Double value) {
    setNecessaryBw(new TDecimal(value));
    return this;
  }

  public TxMode withTunability(String value) {
    setTunability(new TString(value));
    return this;
  }

  public TxMode withTuningMethod(String value) {
    setTuningMethod(new TString(value));
    return this;
  }

  public TxMode withNumSubCarriers(Integer value) {
    setNumSubCarriers(new TInteger(value));
    return this;
  }

  public TxMode withNumSideTones(Integer value) {
    setNumSideTones(new TInteger(value));
    return this;
  }

  public TxMode withIntermodPct(Double value) {
    setIntermodPct(new TDecimal(value));
    return this;
  }

  public TxMode withIntermodEffect(String value) {
    setIntermodEffect(new TString(value));
    return this;
  }

  public TxMode withBurstRate(Double value) {
    setBurstRate(new TDecimal(value));
    return this;
  }

  public TxMode withBurstDuration(Double value) {
    setBurstDuration(new TDecimal(value));
    return this;
  }

  public TxMode withBurstNumPulses(Integer value) {
    setBurstNumPulses(new TInteger(value));
    return this;
  }

  public TxMode withBurstOffTime(Double value) {
    setBurstOffTime(new TDecimal(value));
    return this;
  }

  public TxMode withOccBw(Double value) {
    setOccBw(new TDecimal(value));
    return this;
  }

  public TxMode withOccBwCalculated(ListCBO value) {
    setOccBwCalculated(new TString(value.value()));
    return this;
  }

  public TxMode withSecondHarmonicLevel(Double value) {
    setSecondHarmonicLevel(new TDecimal(value));
    return this;
  }

  public TxMode withThirdHarmonicLevel(Double value) {
    setThirdHarmonicLevel(new TDecimal(value));
    return this;
  }

  public TxMode withOtherHarmonicLevel(Double value) {
    setOtherHarmonicLevel(new TDecimal(value));
    return this;
  }

  public TxMode withSpuriousLevel(Double value) {
    setSpuriousLevel(new TDecimal(value));
    return this;
  }

  public TxMode withFreqTolerance(Double value) {
    setFreqTolerance(new TDecimal(value));
    return this;
  }

  public TxMode withFreqToleranceUnit(ListCFO value) {
    setFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  public TxMode withRadarType(String value) {
    setRadarType(new TString(value));
    return this;
  }

  public TxMode withGpsNBL1Level(Double value) {
    setGpsNBL1Level(new TDecimal(value));
    return this;
  }

  public TxMode withGpsNBL2Level(Double value) {
    setGpsNBL2Level(new TDecimal(value));
    return this;
  }

  public TxMode withGpsWBL1Level(Double value) {
    setGpsWBL1Level(new TDecimal(value));
    return this;
  }

  public TxMode withGpsWBL2Level(Double value) {
    setGpsWBL2Level(new TDecimal(value));
    return this;
  }

  public TxMode withModulationType(String value) {
    setModulationType(new TString(value));
    return this;
  }

  public TxMode withModeName(String value) {
    setModeName(new TString(value));
    return this;
  }

  public TxMode withEmsClass(EmsClass... values) {
    if (values != null) {
      getEmsClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withEmsClass(Collection<EmsClass> values) {
    if (values != null) {
      getEmsClass().addAll(values);
    }
    return this;
  }

  public TxMode withPower(Power... values) {
    if (values != null) {
      getPower().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withPower(Collection<Power> values) {
    if (values != null) {
      getPower().addAll(values);
    }
    return this;
  }

  public TxMode withTxSignalTuning(TxSignalTuning... values) {
    if (values != null) {
      getTxSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withTxSignalTuning(Collection<TxSignalTuning> values) {
    if (values != null) {
      getTxSignalTuning().addAll(values);
    }
    return this;
  }

  public TxMode withTxModulation(TxModulation... values) {
    if (values != null) {
      getTxModulation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withTxModulation(Collection<TxModulation> values) {
    if (values != null) {
      getTxModulation().addAll(values);
    }
    return this;
  }

  public TxMode withBaseband(Baseband... values) {
    if (values != null) {
      getBaseband().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withBaseband(Collection<Baseband> values) {
    if (values != null) {
      getBaseband().addAll(values);
    }
    return this;
  }

  public TxMode withPulse(Pulse... values) {
    if (values != null) {
      getPulse().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withPulse(Collection<Pulse> values) {
    if (values != null) {
      getPulse().addAll(values);
    }
    return this;
  }

  public TxMode withSubCarrierFreq(SubCarrierFreq... values) {
    if (values != null) {
      getSubCarrierFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withSubCarrierFreq(Collection<SubCarrierFreq> values) {
    if (values != null) {
      getSubCarrierFreq().addAll(values);
    }
    return this;
  }

  public TxMode withSubCarrierTone(SubCarrierTone... values) {
    if (values != null) {
      getSubCarrierTone().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withSubCarrierTone(Collection<SubCarrierTone> values) {
    if (values != null) {
      getSubCarrierTone().addAll(values);
    }
    return this;
  }

  public TxMode withSpreadSpectrum(SpreadSpectrum value) {
    setSpreadSpectrum(value);
    return this;
  }

  public TxMode withCurves(BigInteger... values) {
    if (values != null) {
      getCurves().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TxMode withCurves(Collection<BigInteger> values) {
    if (values != null) {
      getCurves().addAll(values);
    }
    return this;
  }

}
