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
 * Java class for RxMode complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="RxMode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}ModeInfo"/>
 *         &lt;element name="RxType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS50" minOccurs="0"/>
 *         &lt;element name="NecessaryBw" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Tunability" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Intermodulation" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Sensitivity" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}PostDetection" minOccurs="0"/>
 *         &lt;element name="ProcessingGain" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="SpuriousRejection" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="ImageRejection" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="IntermodRejection" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;element name="AdjacentChannelSelectivity" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TdB" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqTolerance" minOccurs="0"/>
 *         &lt;element name="ModeName" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS40" minOccurs="0"/>
 *         &lt;element name="EmsClass" type="{urn:us:gov:dod:standard:ssrf:3.0.0}EmsClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RxSignalTuning" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RxSignalTuning" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RxModulation" type="{urn:us:gov:dod:standard:ssrf:3.0.0}RxModulation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Baseband" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Baseband" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreqConversion" type="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqConversion" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RxMode", propOrder = {
  "modeID",
  "description",
  "rxType",
  "necessaryBw",
  "tunability",
  "tuningMethod",
  "intermodPct",
  "intermodEffect",
  "sensitivityLevel",
  "noiseFigure",
  "noiseTemp",
  "sensitivityCriteriaType",
  "sensitivityCriteriaLevel",
  "sensitivityCriteriaText",
  "postDetectionFreqMin",
  "postDetectionFreqMax",
  "processingGain",
  "spuriousRejection",
  "imageRejection",
  "intermodRejection",
  "adjacentChannelSelectivity",
  "freqTolerance",
  "freqToleranceUnit",
  "modeName",
  "emsClass",
  "rxSignalTuning",
  "rxModulation",
  "baseband",
  "freqConversion",
  "spreadSpectrum"
})
public class RxMode {

  @XmlElement(name = "ModeID", required = true)
  protected TS20 modeID;
  @XmlElementRef(name = "Description", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS100> description;
  @XmlElementRef(name = "RxType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> rxType;
  @XmlElementRef(name = "NecessaryBw", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> necessaryBw;
  @XmlElementRef(name = "Tunability", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS25> tunability;
  @XmlElementRef(name = "TuningMethod", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> tuningMethod;
  @XmlElementRef(name = "IntermodPct", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TPercent> intermodPct;
  @XmlElementRef(name = "IntermodEffect", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> intermodEffect;
  @XmlElementRef(name = "SensitivityLevel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdBm> sensitivityLevel;
  @XmlElementRef(name = "NoiseFigure", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> noiseFigure;
  @XmlElementRef(name = "NoiseTemp", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TUN7_1> noiseTemp;
  @XmlElementRef(name = "SensitivityCriteriaType", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> sensitivityCriteriaType;
  @XmlElementRef(name = "SensitivityCriteriaLevel", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TSN16_15> sensitivityCriteriaLevel;
  @XmlElementRef(name = "SensitivityCriteriaText", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS50> sensitivityCriteriaText;
  @XmlElementRef(name = "PostDetectionFreqMin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> postDetectionFreqMin;
  @XmlElementRef(name = "PostDetectionFreqMax", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TFreqM> postDetectionFreqMax;
  @XmlElementRef(name = "ProcessingGain", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> processingGain;
  @XmlElementRef(name = "SpuriousRejection", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> spuriousRejection;
  @XmlElementRef(name = "ImageRejection", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> imageRejection;
  @XmlElementRef(name = "IntermodRejection", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> intermodRejection;
  @XmlElementRef(name = "AdjacentChannelSelectivity", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TdB> adjacentChannelSelectivity;
  @XmlElement(name = "FreqTolerance")
  protected TUN18_6 freqTolerance;
  @XmlElement(name = "FreqToleranceUnit")
  protected TListCFO freqToleranceUnit;
  @XmlElementRef(name = "ModeName", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TS40> modeName;
  @XmlElement(name = "EmsClass", nillable = true)
  protected List<EmsClass> emsClass;
  @XmlElement(name = "RxSignalTuning")
  protected List<RxSignalTuning> rxSignalTuning;
  @XmlElement(name = "RxModulation")
  protected List<RxModulation> rxModulation;
  @XmlElement(name = "Baseband")
  protected List<Baseband> baseband;
  @XmlElement(name = "FreqConversion")
  protected List<FreqConversion> freqConversion;
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
   * Gets the value of the rxType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getRxType() {
    return rxType;
  }

  /**
   * Sets the value of the rxType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setRxType(JAXBElement<TS50> value) {
    this.rxType = value;
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
   * Gets the value of the sensitivityLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdBm }{@code >}
   * <p>
   */
  public JAXBElement<TdBm> getSensitivityLevel() {
    return sensitivityLevel;
  }

  /**
   * Sets the value of the sensitivityLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdBm }{@code >}
   * <p>
   */
  public void setSensitivityLevel(JAXBElement<TdBm> value) {
    this.sensitivityLevel = value;
  }

  /**
   * Gets the value of the noiseFigure property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getNoiseFigure() {
    return noiseFigure;
  }

  /**
   * Sets the value of the noiseFigure property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setNoiseFigure(JAXBElement<TdB> value) {
    this.noiseFigure = value;
  }

  /**
   * Gets the value of the noiseTemp property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TUN7_1 }{@code >}
   * <p>
   */
  public JAXBElement<TUN7_1> getNoiseTemp() {
    return noiseTemp;
  }

  /**
   * Sets the value of the noiseTemp property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TUN7_1 }{@code >}
   * <p>
   */
  public void setNoiseTemp(JAXBElement<TUN7_1> value) {
    this.noiseTemp = value;
  }

  /**
   * Gets the value of the sensitivityCriteriaType property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSensitivityCriteriaType() {
    return sensitivityCriteriaType;
  }

  /**
   * Sets the value of the sensitivityCriteriaType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSensitivityCriteriaType(JAXBElement<TS50> value) {
    this.sensitivityCriteriaType = value;
  }

  /**
   * Gets the value of the sensitivityCriteriaLevel property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TSN16_15 }{@code >}
   * <p>
   */
  public JAXBElement<TSN16_15> getSensitivityCriteriaLevel() {
    return sensitivityCriteriaLevel;
  }

  /**
   * Sets the value of the sensitivityCriteriaLevel property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TSN16_15 }{@code >}
   * <p>
   */
  public void setSensitivityCriteriaLevel(JAXBElement<TSN16_15> value) {
    this.sensitivityCriteriaLevel = value;
  }

  /**
   * Gets the value of the sensitivityCriteriaText property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public JAXBElement<TS50> getSensitivityCriteriaText() {
    return sensitivityCriteriaText;
  }

  /**
   * Sets the value of the sensitivityCriteriaText property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS50 }{@code >}
   * <p>
   */
  public void setSensitivityCriteriaText(JAXBElement<TS50> value) {
    this.sensitivityCriteriaText = value;
  }

  /**
   * Gets the value of the postDetectionFreqMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getPostDetectionFreqMin() {
    return postDetectionFreqMin;
  }

  /**
   * Sets the value of the postDetectionFreqMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setPostDetectionFreqMin(JAXBElement<TFreqM> value) {
    this.postDetectionFreqMin = value;
  }

  /**
   * Gets the value of the postDetectionFreqMax property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public JAXBElement<TFreqM> getPostDetectionFreqMax() {
    return postDetectionFreqMax;
  }

  /**
   * Sets the value of the postDetectionFreqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public void setPostDetectionFreqMax(JAXBElement<TFreqM> value) {
    this.postDetectionFreqMax = value;
  }

  /**
   * Gets the value of the processingGain property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getProcessingGain() {
    return processingGain;
  }

  /**
   * Sets the value of the processingGain property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setProcessingGain(JAXBElement<TdB> value) {
    this.processingGain = value;
  }

  /**
   * Gets the value of the spuriousRejection property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getSpuriousRejection() {
    return spuriousRejection;
  }

  /**
   * Sets the value of the spuriousRejection property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setSpuriousRejection(JAXBElement<TdB> value) {
    this.spuriousRejection = value;
  }

  /**
   * Gets the value of the imageRejection property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getImageRejection() {
    return imageRejection;
  }

  /**
   * Sets the value of the imageRejection property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setImageRejection(JAXBElement<TdB> value) {
    this.imageRejection = value;
  }

  /**
   * Gets the value of the intermodRejection property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getIntermodRejection() {
    return intermodRejection;
  }

  /**
   * Sets the value of the intermodRejection property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setIntermodRejection(JAXBElement<TdB> value) {
    this.intermodRejection = value;
  }

  /**
   * Gets the value of the adjacentChannelSelectivity property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public JAXBElement<TdB> getAdjacentChannelSelectivity() {
    return adjacentChannelSelectivity;
  }

  /**
   * Sets the value of the adjacentChannelSelectivity property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TdB }{@code >}
   * <p>
   */
  public void setAdjacentChannelSelectivity(JAXBElement<TdB> value) {
    this.adjacentChannelSelectivity = value;
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
   * Gets the value of the rxSignalTuning property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rxSignalTuning property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRxSignalTuning().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link RxSignalTuning }
   * <p>
   * <p>
   */
  public List<RxSignalTuning> getRxSignalTuning() {
    if (rxSignalTuning == null) {
      rxSignalTuning = new ArrayList<>();
    }
    return this.rxSignalTuning;
  }

  /**
   * Gets the value of the rxModulation property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the rxModulation property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRxModulation().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link RxModulation }
   * <p>
   * <p>
   */
  public List<RxModulation> getRxModulation() {
    if (rxModulation == null) {
      rxModulation = new ArrayList<>();
    }
    return this.rxModulation;
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
   * Gets the value of the freqConversion property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the freqConversion property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFreqConversion().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link FreqConversion }
   * <p>
   * <p>
   */
  public List<FreqConversion> getFreqConversion() {
    if (freqConversion == null) {
      freqConversion = new ArrayList<>();
    }
    return this.freqConversion;
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
