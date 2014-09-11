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
package us.gov.dod.standard.ssrf._3_0.system;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCFO;
import us.gov.dod.standard.ssrf._3_0.metadata.EmsClass;

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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  @XmlElement(name = "RxType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString rxType;
  @XmlElement(name = "NecessaryBw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal necessaryBw;
  @XmlElement(name = "Tunability", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString tunability;
  @XmlElement(name = "TuningMethod", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString tuningMethod;
  @XmlElement(name = "IntermodPct", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal intermodPct;
  @XmlElement(name = "IntermodEffect", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intermodEffect;
  @XmlElement(name = "SensitivityLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBM.class)
  private TDecimal sensitivityLevel;
  @XmlElement(name = "NoiseFigure", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal noiseFigure;
  @XmlElement(name = "NoiseTemp", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN7_1.class)
  private TDecimal noiseTemp;
  @XmlElement(name = "SensitivityCriteriaType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString sensitivityCriteriaType;
  @XmlElement(name = "SensitivityCriteriaLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterSN16_15.class)
  private TDecimal sensitivityCriteriaLevel;
  @XmlElement(name = "SensitivityCriteriaText", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString sensitivityCriteriaText;
  @XmlElement(name = "PostDetectionFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal postDetectionFreqMin;
  @XmlElement(name = "PostDetectionFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal postDetectionFreqMax;
  @XmlElement(name = "ProcessingGain", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal processingGain;
  @XmlElement(name = "SpuriousRejection", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal spuriousRejection;
  @XmlElement(name = "ImageRejection", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal imageRejection;
  @XmlElement(name = "IntermodRejection", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal intermodRejection;
  @XmlElement(name = "AdjacentChannelSelectivity", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal adjacentChannelSelectivity;
  @XmlElement(name = "FreqTolerance")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN18_6.class)
  private TDecimal freqTolerance;
  @XmlElement(name = "FreqToleranceUnit")
  private TString freqToleranceUnit;
  @XmlElement(name = "ModeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;
  @XmlElement(name = "EmsClass", nillable = true)
  private List<EmsClass> emsClass;
  @XmlElement(name = "RxSignalTuning")
  private List<RxSignalTuning> rxSignalTuning;
  @XmlElement(name = "RxModulation")
  private List<RxModulation> rxModulation;
  @XmlElement(name = "Baseband")
  private List<Baseband> baseband;
  @XmlElement(name = "FreqConversion")
  private List<FreqConversion> freqConversion;
  @XmlElement(name = "SpreadSpectrum")
  protected SpreadSpectrum spreadSpectrum;
  @XmlAttribute(name = "curves")
  private List<BigInteger> curves;

  /**
   * Gets the value of the modeID property.
   * <p>
   * @return 
   */
  public TString getModeID() {
    return modeID;
  }

  /**
   * Sets the value of the modeID property.
   * <p>
   * @param value 
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
   * Gets the value of the rxType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getRxType() {
    return rxType;
  }

  /**
   * Sets the value of the rxType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setRxType(TString value) {
    this.rxType = value;
  }

  public boolean isSetRxType() {
    return (this.rxType != null);
  }

  /**
   * Gets the value of the necessaryBw property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Sets the value of the necessaryBw property.
   * <p>
   * @param value allowed object is
   *              
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
   *         
   * <p>
   */
  public TString getTunability() {
    return tunability;
  }

  /**
   * Sets the value of the tunability property.
   * <p>
   * @param value allowed object is
   *              
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
   *         
   * <p>
   */
  public TString getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Sets the value of the tuningMethod property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setTuningMethod(TString value) {
    this.tuningMethod = value;
  }

  public boolean isSetTuningMethod() {
    return (this.tuningMethod != null);
  }

  /**
   * Gets the value of the intermodPct property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getIntermodPct() {
    return intermodPct;
  }

  /**
   * Sets the value of the intermodPct property.
   * <p>
   * @param value allowed object is
   *              
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
   *         
   * <p>
   */
  public TString getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Sets the value of the intermodEffect property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setIntermodEffect(TString value) {
    this.intermodEffect = value;
  }

  public boolean isSetIntermodEffect() {
    return (this.intermodEffect != null);
  }

  /**
   * Gets the value of the sensitivityLevel property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getSensitivityLevel() {
    return sensitivityLevel;
  }

  /**
   * Sets the value of the sensitivityLevel property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSensitivityLevel(TDecimal value) {
    this.sensitivityLevel = value;
  }

  public boolean isSetSensitivityLevel() {
    return (this.sensitivityLevel != null);
  }

  /**
   * Gets the value of the noiseFigure property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getNoiseFigure() {
    return noiseFigure;
  }

  /**
   * Sets the value of the noiseFigure property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNoiseFigure(TDecimal value) {
    this.noiseFigure = value;
  }

  public boolean isSetNoiseFigure() {
    return (this.noiseFigure != null);
  }

  /**
   * Gets the value of the noiseTemp property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getNoiseTemp() {
    return noiseTemp;
  }

  /**
   * Sets the value of the noiseTemp property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNoiseTemp(TDecimal value) {
    this.noiseTemp = value;
  }

  public boolean isSetNoiseTemp() {
    return (this.noiseTemp != null);
  }

  /**
   * Gets the value of the sensitivityCriteriaType property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getSensitivityCriteriaType() {
    return sensitivityCriteriaType;
  }

  /**
   * Sets the value of the sensitivityCriteriaType property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSensitivityCriteriaType(TString value) {
    this.sensitivityCriteriaType = value;
  }

  public boolean isSetSensitivityCriteriaType() {
    return (this.sensitivityCriteriaType != null);
  }

  /**
   * Gets the value of the sensitivityCriteriaLevel property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getSensitivityCriteriaLevel() {
    return sensitivityCriteriaLevel;
  }

  /**
   * Sets the value of the sensitivityCriteriaLevel property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSensitivityCriteriaLevel(TDecimal value) {
    this.sensitivityCriteriaLevel = value;
  }

  public boolean isSetSensitivityCriteriaLevel() {
    return (this.sensitivityCriteriaLevel != null);
  }

  /**
   * Gets the value of the sensitivityCriteriaText property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getSensitivityCriteriaText() {
    return sensitivityCriteriaText;
  }

  /**
   * Sets the value of the sensitivityCriteriaText property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSensitivityCriteriaText(TString value) {
    this.sensitivityCriteriaText = value;
  }

  public boolean isSetSensitivityCriteriaText() {
    return (this.sensitivityCriteriaText != null);
  }

  /**
   * Gets the value of the postDetectionFreqMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPostDetectionFreqMin() {
    return postDetectionFreqMin;
  }

  /**
   * Sets the value of the postDetectionFreqMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPostDetectionFreqMin(TDecimal value) {
    this.postDetectionFreqMin = value;
  }

  public boolean isSetPostDetectionFreqMin() {
    return (this.postDetectionFreqMin != null);
  }

  /**
   * Gets the value of the postDetectionFreqMax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getPostDetectionFreqMax() {
    return postDetectionFreqMax;
  }

  /**
   * Sets the value of the postDetectionFreqMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPostDetectionFreqMax(TDecimal value) {
    this.postDetectionFreqMax = value;
  }

  public boolean isSetPostDetectionFreqMax() {
    return (this.postDetectionFreqMax != null);
  }

  /**
   * Gets the value of the processingGain property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getProcessingGain() {
    return processingGain;
  }

  /**
   * Sets the value of the processingGain property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setProcessingGain(TDecimal value) {
    this.processingGain = value;
  }

  public boolean isSetProcessingGain() {
    return (this.processingGain != null);
  }

  /**
   * Gets the value of the spuriousRejection property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getSpuriousRejection() {
    return spuriousRejection;
  }

  /**
   * Sets the value of the spuriousRejection property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setSpuriousRejection(TDecimal value) {
    this.spuriousRejection = value;
  }

  public boolean isSetSpuriousRejection() {
    return (this.spuriousRejection != null);
  }

  /**
   * Gets the value of the imageRejection property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getImageRejection() {
    return imageRejection;
  }

  /**
   * Sets the value of the imageRejection property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setImageRejection(TDecimal value) {
    this.imageRejection = value;
  }

  public boolean isSetImageRejection() {
    return (this.imageRejection != null);
  }

  /**
   * Gets the value of the intermodRejection property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getIntermodRejection() {
    return intermodRejection;
  }

  /**
   * Sets the value of the intermodRejection property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setIntermodRejection(TDecimal value) {
    this.intermodRejection = value;
  }

  public boolean isSetIntermodRejection() {
    return (this.intermodRejection != null);
  }

  /**
   * Gets the value of the adjacentChannelSelectivity property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getAdjacentChannelSelectivity() {
    return adjacentChannelSelectivity;
  }

  /**
   * Sets the value of the adjacentChannelSelectivity property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAdjacentChannelSelectivity(TDecimal value) {
    this.adjacentChannelSelectivity = value;
  }

  public boolean isSetAdjacentChannelSelectivity() {
    return (this.adjacentChannelSelectivity != null);
  }

  /**
   * Gets the value of the freqTolerance property.
   * <p>
   * @return 
   */
  public TDecimal getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Sets the value of the freqTolerance property.
   * <p>
   * @param value 
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
   * @return 
   */
  public TString getFreqToleranceUnit() {
    return freqToleranceUnit;
  }

  /**
   * Sets the value of the freqToleranceUnit property.
   * <p>
   * @param value 
   */
  public void setFreqToleranceUnit(TString value) {
    this.freqToleranceUnit = value;
  }

  public boolean isSetFreqToleranceUnit() {
    return (this.freqToleranceUnit != null);
  }

  /**
   * Gets the value of the modeName property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Sets the value of the modeName property.
   * <p>
   * @param value allowed object is
   *              
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
   * Objects of the following type(s) are allowed in the list 
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
     * 
   * <p>
   * <p>
   * @return
   */
  public List<RxSignalTuning> getRxSignalTuning() {
    if (rxSignalTuning == null) {
      rxSignalTuning = new ArrayList<>();
    }
    return this.rxSignalTuning;
  }

  public boolean isSetRxSignalTuning() {
    return ((this.rxSignalTuning != null) && (!this.rxSignalTuning.isEmpty()));
  }

  public void unsetRxSignalTuning() {
    this.rxSignalTuning = null;
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
     * 
   * <p>
   * <p>
   * @return
   */
  public List<RxModulation> getRxModulation() {
    if (rxModulation == null) {
      rxModulation = new ArrayList<>();
    }
    return this.rxModulation;
  }

  public boolean isSetRxModulation() {
    return ((this.rxModulation != null) && (!this.rxModulation.isEmpty()));
  }

  public void unsetRxModulation() {
    this.rxModulation = null;
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
   * Objects of the following type(s) are allowed in the list 
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
     * 
   * <p>
   * <p>
   * @return
   */
  public List<FreqConversion> getFreqConversion() {
    if (freqConversion == null) {
      freqConversion = new ArrayList<>();
    }
    return this.freqConversion;
  }

  public boolean isSetFreqConversion() {
    return ((this.freqConversion != null) && (!this.freqConversion.isEmpty()));
  }

  public void unsetFreqConversion() {
    this.freqConversion = null;
  }

  /**
   * Gets the value of the spreadSpectrum property.
   * <p>
   * @return 
   */
  public SpreadSpectrum getSpreadSpectrum() {
    return spreadSpectrum;
  }

  /**
   * Sets the value of the spreadSpectrum property.
   * <p>
   * @param value 
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
     * 
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

  public RxMode withModeID(String value) {
    setModeID(new TString(value));
    return this;
  }

  public RxMode withDescription(String value) {
    setDescription(new TString(value));
    return this;
  }

  public RxMode withRxType(String value) {
    setRxType(new TString(value));
    return this;
  }

  public RxMode withNecessaryBw(Double value) {
    setNecessaryBw(new TDecimal(value));
    return this;
  }

  public RxMode withTunability(String value) {
    setTunability(new TString(value));
    return this;
  }

  public RxMode withTuningMethod(String value) {
    setTuningMethod(new TString(value));
    return this;
  }

  public RxMode withIntermodPct(Double value) {
    setIntermodPct(new TDecimal(value));
    return this;
  }

  public RxMode withIntermodEffect(String value) {
    setIntermodEffect(new TString(value));
    return this;
  }

  public RxMode withSensitivityLevel(Double value) {
    setSensitivityLevel(new TDecimal(value));
    return this;
  }

  public RxMode withNoiseFigure(Double value) {
    setNoiseFigure(new TDecimal(value));
    return this;
  }

  public RxMode withNoiseTemp(Double value) {
    setNoiseTemp(new TDecimal(value));
    return this;
  }

  public RxMode withSensitivityCriteriaType(String value) {
    setSensitivityCriteriaType(new TString(value));
    return this;
  }

  public RxMode withSensitivityCriteriaLevel(Double value) {
    setSensitivityCriteriaLevel(new TDecimal(value));
    return this;
  }

  public RxMode withSensitivityCriteriaText(String value) {
    setSensitivityCriteriaText(new TString(value));
    return this;
  }

  public RxMode withPostDetectionFreqMin(Double value) {
    setPostDetectionFreqMin(new TDecimal(value));
    return this;
  }

  public RxMode withPostDetectionFreqMax(Double value) {
    setPostDetectionFreqMax(new TDecimal(value));
    return this;
  }

  public RxMode withProcessingGain(Double value) {
    setProcessingGain(new TDecimal(value));
    return this;
  }

  public RxMode withSpuriousRejection(Double value) {
    setSpuriousRejection(new TDecimal(value));
    return this;
  }

  public RxMode withImageRejection(Double value) {
    setImageRejection(new TDecimal(value));
    return this;
  }

  public RxMode withIntermodRejection(Double value) {
    setIntermodRejection(new TDecimal(value));
    return this;
  }

  public RxMode withAdjacentChannelSelectivity(Double value) {
    setAdjacentChannelSelectivity(new TDecimal(value));
    return this;
  }

  public RxMode withFreqTolerance(Double value) {
    setFreqTolerance(new TDecimal(value));
    return this;
  }

  public RxMode withFreqToleranceUnit(ListCFO value) {
    setFreqToleranceUnit(new TString(value.value()));
    return this;
  }

  public RxMode withModeName(String value) {
    setModeName(new TString(value));
    return this;
  }

  public RxMode withEmsClass(EmsClass... values) {
    if (values != null) {
      getEmsClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxMode withEmsClass(Collection<EmsClass> values) {
    if (values != null) {
      getEmsClass().addAll(values);
    }
    return this;
  }

  public RxMode withRxSignalTuning(RxSignalTuning... values) {
    if (values != null) {
      getRxSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxMode withRxSignalTuning(Collection<RxSignalTuning> values) {
    if (values != null) {
      getRxSignalTuning().addAll(values);
    }
    return this;
  }

  public RxMode withRxModulation(RxModulation... values) {
    if (values != null) {
      getRxModulation().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxMode withRxModulation(Collection<RxModulation> values) {
    if (values != null) {
      getRxModulation().addAll(values);
    }
    return this;
  }

  public RxMode withBaseband(Baseband... values) {
    if (values != null) {
      getBaseband().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxMode withBaseband(Collection<Baseband> values) {
    if (values != null) {
      getBaseband().addAll(values);
    }
    return this;
  }

  public RxMode withFreqConversion(FreqConversion... values) {
    if (values != null) {
      getFreqConversion().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxMode withFreqConversion(Collection<FreqConversion> values) {
    if (values != null) {
      getFreqConversion().addAll(values);
    }
    return this;
  }

  public RxMode withSpreadSpectrum(SpreadSpectrum value) {
    setSpreadSpectrum(value);
    return this;
  }

  public RxMode withCurves(BigInteger... values) {
    if (values != null) {
      getCurves().addAll(Arrays.asList(values));
    }
    return this;
  }

  public RxMode withCurves(Collection<BigInteger> values) {
    if (values != null) {
      getCurves().addAll(values);
    }
    return this;
  }

}
