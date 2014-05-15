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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

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
  protected TS20 modeID;
  @XmlElementRef(name = "Description", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> description;
  @XmlElementRef(name = "NecessaryBw", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> necessaryBw;
  @XmlElementRef(name = "Tunability", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> tunability;
  @XmlElementRef(name = "TuningMethod", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> tuningMethod;
  @XmlElementRef(name = "NumSubCarriers", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5> numSubCarriers;
  @XmlElementRef(name = "NumSideTones", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN5> numSideTones;
  @XmlElementRef(name = "IntermodPct", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TPercent> intermodPct;
  @XmlElementRef(name = "IntermodEffect", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> intermodEffect;
  @XmlElementRef(name = "BurstRate", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN12_3> burstRate;
  @XmlElementRef(name = "BurstDuration", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> burstDuration;
  @XmlElementRef(name = "BurstNumPulses", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN8> burstNumPulses;
  @XmlElementRef(name = "BurstOffTime", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<Tmicrosecs> burstOffTime;
  @XmlElement(name = "OccBw")
  protected TFreqM occBw;
  @XmlElementRef(name = "OccBwCalculated", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCBO> occBwCalculated;
  @XmlElementRef(name = "SecondHarmonicLevel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> secondHarmonicLevel;
  @XmlElementRef(name = "ThirdHarmonicLevel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> thirdHarmonicLevel;
  @XmlElementRef(name = "OtherHarmonicLevel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> otherHarmonicLevel;
  @XmlElementRef(name = "SpuriousLevel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> spuriousLevel;
  @XmlElement(name = "FreqTolerance")
  protected TUN18_6 freqTolerance;
  @XmlElement(name = "FreqToleranceUnit")
  protected TListCFO freqToleranceUnit;
  @XmlElementRef(name = "RadarType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> radarType;
  @XmlElementRef(name = "GpsNBL1Level", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS_DBW> gpsNBL1Level;
  @XmlElementRef(name = "GpsNBL2Level", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS_DBW> gpsNBL2Level;
  @XmlElementRef(name = "GpsWBL1Level", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS_DBWHz> gpsWBL1Level;
  @XmlElementRef(name = "GpsWBL2Level", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUS_DBWHz> gpsWBL2Level;
  @XmlElementRef(name = "ModulationType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS10> modulationType;
  @XmlElementRef(name = "ModeName", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS40> modeName;
  @XmlElement(name = "EmsClass", nillable = true)
  protected List<EmsClass> emsClass;
  @XmlElement(name = "Power")
  protected List<Power> power;
  @XmlElement(name = "TxSignalTuning")
  protected List<TxSignalTuning> txSignalTuning;
  @XmlElement(name = "TxModulation")
  protected List<TxModulation> txModulation;
  @XmlElement(name = "Baseband")
  protected List<Baseband> baseband;
  @XmlElement(name = "Pulse")
  protected List<Pulse> pulse;
  @XmlElement(name = "SubCarrierFreq", nillable = true)
  protected List<SubCarrierFreq> subCarrierFreq;
  @XmlElement(name = "SubCarrierTone", nillable = true)
  protected List<SubCarrierTone> subCarrierTone;
  @XmlElement(name = "SpreadSpectrum")
  protected SpreadSpectrum spreadSpectrum;
  @XmlAttribute(name = "curves")
  protected List<BigInteger> curves;

  /**
   * Gets the value of the modeID property.
   * <p>
   * @return possible object is {@link TS20 }
   * <p>
   */
  public TS20 getModeID() {
    return modeID;
  }

  /**
   * Sets the value of the modeID property.
   * <p>
   * @param value allowed object is {@link TS20 }
   * <p>
   */
  public void setModeID(TS20 value) {
    this.modeID = value;
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
   * Gets the value of the necessaryBw property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Sets the value of the necessaryBw property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setNecessaryBw(JAXBElement<TFreqM> value) {
    this.necessaryBw = value;
  }

  /**
   * Gets the value of the tunability property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getTunability() {
    return tunability;
  }

  /**
   * Sets the value of the tunability property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setTunability(JAXBElement<TS25> value) {
    this.tunability = value;
  }

  /**
   * Gets the value of the tuningMethod property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Sets the value of the tuningMethod property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setTuningMethod(JAXBElement<TS50> value) {
    this.tuningMethod = value;
  }

  /**
   * Gets the value of the numSubCarriers property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5> getNumSubCarriers() {
    return numSubCarriers;
  }

  /**
   * Sets the value of the numSubCarriers property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setNumSubCarriers(JAXBElement<TUN5> value) {
    this.numSubCarriers = value;
  }

  /**
   * Gets the value of the numSideTones property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public JAXBElement<TUN5> getNumSideTones() {
    return numSideTones;
  }

  /**
   * Sets the value of the numSideTones property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN5 }{@code >}
   * <p>
   */
  public void setNumSideTones(JAXBElement<TUN5> value) {
    this.numSideTones = value;
  }

  /**
   * Gets the value of the intermodPct property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public JAXBElement<TPercent> getIntermodPct() {
    return intermodPct;
  }

  /**
   * Sets the value of the intermodPct property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TPercent }{@code >}
   * <p>
   */
  public void setIntermodPct(JAXBElement<TPercent> value) {
    this.intermodPct = value;
  }

  /**
   * Gets the value of the intermodEffect property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Sets the value of the intermodEffect property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setIntermodEffect(JAXBElement<TMEMO> value) {
    this.intermodEffect = value;
  }

  /**
   * Gets the value of the burstRate property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN12_3 }{@code >}
   * <p>
   */
  public JAXBElement<TUN12_3> getBurstRate() {
    return burstRate;
  }

  /**
   * Sets the value of the burstRate property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN12_3 }{@code >}
   * <p>
   */
  public void setBurstRate(JAXBElement<TUN12_3> value) {
    this.burstRate = value;
  }

  /**
   * Gets the value of the burstDuration property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getBurstDuration() {
    return burstDuration;
  }

  /**
   * Sets the value of the burstDuration property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setBurstDuration(JAXBElement<Tmicrosecs> value) {
    this.burstDuration = value;
  }

  /**
   * Gets the value of the burstNumPulses property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN8 }{@code >}
   * <p>
   */
  public JAXBElement<TUN8> getBurstNumPulses() {
    return burstNumPulses;
  }

  /**
   * Sets the value of the burstNumPulses property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN8 }{@code >}
   * <p>
   */
  public void setBurstNumPulses(JAXBElement<TUN8> value) {
    this.burstNumPulses = value;
  }

  /**
   * Gets the value of the burstOffTime property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public JAXBElement<Tmicrosecs> getBurstOffTime() {
    return burstOffTime;
  }

  /**
   * Sets the value of the burstOffTime property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Tmicrosecs }{@code >}
   * <p>
   */
  public void setBurstOffTime(JAXBElement<Tmicrosecs> value) {
    this.burstOffTime = value;
  }

  /**
   * Gets the value of the occBw property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TFreqM getOccBw() {
    return occBw;
  }

  /**
   * Sets the value of the occBw property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
   */
  public void setOccBw(TFreqM value) {
    this.occBw = value;
  }

  /**
   * Gets the value of the occBwCalculated property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public JAXBElement<TListCBO> getOccBwCalculated() {
    return occBwCalculated;
  }

  /**
   * Sets the value of the occBwCalculated property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setOccBwCalculated(JAXBElement<TListCBO> value) {
    this.occBwCalculated = value;
  }

  /**
   * Gets the value of the secondHarmonicLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getSecondHarmonicLevel() {
    return secondHarmonicLevel;
  }

  /**
   * Sets the value of the secondHarmonicLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setSecondHarmonicLevel(JAXBElement<TdB> value) {
    this.secondHarmonicLevel = value;
  }

  /**
   * Gets the value of the thirdHarmonicLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getThirdHarmonicLevel() {
    return thirdHarmonicLevel;
  }

  /**
   * Sets the value of the thirdHarmonicLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setThirdHarmonicLevel(JAXBElement<TdB> value) {
    this.thirdHarmonicLevel = value;
  }

  /**
   * Gets the value of the otherHarmonicLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getOtherHarmonicLevel() {
    return otherHarmonicLevel;
  }

  /**
   * Sets the value of the otherHarmonicLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setOtherHarmonicLevel(JAXBElement<TdB> value) {
    this.otherHarmonicLevel = value;
  }

  /**
   * Gets the value of the spuriousLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getSpuriousLevel() {
    return spuriousLevel;
  }

  /**
   * Sets the value of the spuriousLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setSpuriousLevel(JAXBElement<TdB> value) {
    this.spuriousLevel = value;
  }

  /**
   * Gets the value of the freqTolerance property.
   * <p>
   * @return possible object is {@link TUN18_6 }
   * <p>
   */
  public TUN18_6 getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Sets the value of the freqTolerance property.
   * <p>
   * @param value allowed object is {@link TUN18_6 }
   * <p>
   */
  public void setFreqTolerance(TUN18_6 value) {
    this.freqTolerance = value;
  }

  /**
   * Gets the value of the freqToleranceUnit property.
   * <p>
   * @return possible object is {@link TListCFO }
   * <p>
   */
  public TListCFO getFreqToleranceUnit() {
    return freqToleranceUnit;
  }

  /**
   * Sets the value of the freqToleranceUnit property.
   * <p>
   * @param value allowed object is {@link TListCFO }
   * <p>
   */
  public void setFreqToleranceUnit(TListCFO value) {
    this.freqToleranceUnit = value;
  }

  /**
   * Gets the value of the radarType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public JAXBElement<TS25> getRadarType() {
    return radarType;
  }

  /**
   * Sets the value of the radarType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS25 }{@code >}
   * <p>
   */
  public void setRadarType(JAXBElement<TS25> value) {
    this.radarType = value;
  }

  /**
   * Gets the value of the gpsNBL1Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public JAXBElement<TUS_DBW> getGpsNBL1Level() {
    return gpsNBL1Level;
  }

  /**
   * Sets the value of the gpsNBL1Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public void setGpsNBL1Level(JAXBElement<TUS_DBW> value) {
    this.gpsNBL1Level = value;
  }

  /**
   * Gets the value of the gpsNBL2Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public JAXBElement<TUS_DBW> getGpsNBL2Level() {
    return gpsNBL2Level;
  }

  /**
   * Sets the value of the gpsNBL2Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBW }{@code >}
   * <p>
   */
  public void setGpsNBL2Level(JAXBElement<TUS_DBW> value) {
    this.gpsNBL2Level = value;
  }

  /**
   * Gets the value of the gpsWBL1Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public JAXBElement<TUS_DBWHz> getGpsWBL1Level() {
    return gpsWBL1Level;
  }

  /**
   * Sets the value of the gpsWBL1Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public void setGpsWBL1Level(JAXBElement<TUS_DBWHz> value) {
    this.gpsWBL1Level = value;
  }

  /**
   * Gets the value of the gpsWBL2Level property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public JAXBElement<TUS_DBWHz> getGpsWBL2Level() {
    return gpsWBL2Level;
  }

  /**
   * Sets the value of the gpsWBL2Level property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUS_DBWHz }{@code >}
   * <p>
   */
  public void setGpsWBL2Level(JAXBElement<TUS_DBWHz> value) {
    this.gpsWBL2Level = value;
  }

  /**
   * Gets the value of the modulationType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public JAXBElement<TS10> getModulationType() {
    return modulationType;
  }

  /**
   * Sets the value of the modulationType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public void setModulationType(JAXBElement<TS10> value) {
    this.modulationType = value;
  }

  /**
   * Gets the value of the modeName property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public JAXBElement<TS40> getModeName() {
    return modeName;
  }

  /**
   * Sets the value of the modeName property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS40 }{@code >}
   * <p>
   */
  public void setModeName(JAXBElement<TS40> value) {
    this.modeName = value;
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
   */
  public List<EmsClass> getEmsClass() {
    if (emsClass == null) {
      emsClass = new ArrayList<>();
    }
    return this.emsClass;
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
   */
  public List<Power> getPower() {
    if (power == null) {
      power = new ArrayList<>();
    }
    return this.power;
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
   */
  public List<TxSignalTuning> getTxSignalTuning() {
    if (txSignalTuning == null) {
      txSignalTuning = new ArrayList<>();
    }
    return this.txSignalTuning;
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
   */
  public List<TxModulation> getTxModulation() {
    if (txModulation == null) {
      txModulation = new ArrayList<>();
    }
    return this.txModulation;
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
   */
  public List<Baseband> getBaseband() {
    if (baseband == null) {
      baseband = new ArrayList<>();
    }
    return this.baseband;
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
   */
  public List<Pulse> getPulse() {
    if (pulse == null) {
      pulse = new ArrayList<>();
    }
    return this.pulse;
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
   */
  public List<SubCarrierFreq> getSubCarrierFreq() {
    if (subCarrierFreq == null) {
      subCarrierFreq = new ArrayList<>();
    }
    return this.subCarrierFreq;
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
   */
  public List<SubCarrierTone> getSubCarrierTone() {
    if (subCarrierTone == null) {
      subCarrierTone = new ArrayList<>();
    }
    return this.subCarrierTone;
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
   */
  public List<BigInteger> getCurves() {
    if (curves == null) {
      curves = new ArrayList<>();
    }
    return this.curves;
  }

}
