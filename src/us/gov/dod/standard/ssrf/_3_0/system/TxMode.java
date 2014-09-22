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
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TInteger;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCFO;

/**
 * Java class for TxMode complex type.
 * <p>
 * This element and its sub-elements define all the technical parameters for a
 * mode of operation of the Transmitter. A mode can be defined as a set of
 * parameters or settings for a radio or radar, allowing the equipment to
 * perform a given function (e.g. voice, data, seek, tracking, etc).
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

  /**
   * ModeID: Enter a short name for the mode; this name should be a meaningful
   * identification of the mode, but it can also be automatically generated in
   * some systems. The Name MUST be unique within the dataset and SHOULD NOT be
   * modified during the entire lifetime of the dataset.
   * <p>
   * [XSD ERR UNIQUE] Each value of this data item MUST be unique within the
   * parent element.
   */
  @XmlElement(name = "ModeID", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString modeID;
  /**
   * Description: Enter a description of the operational mode; this description
   * should be a meaningful explanation of the mode main characteristics.
   */
  @XmlElement(name = "Description", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString description;
  /**
   * NecessaryBw: Enter the necessary bandwidth which is defined as the value in
   * MHz, for a given class of emission, the width of the frequency band which
   * is just sufficient to ensure the transmission of information at the rate
   * and with the quality required under specified conditions. This is
   * approximately at the -20 dB level on an emission curve.
   */
  @XmlElement(name = "NecessaryBw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal necessaryBw;
  /**
   * Tunability: Enter the tuning capability.
   * <p>
   * Recommend values from Code List CTU
   */
  @XmlElement(name = "Tunability", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString tunability;
  /**
   * TuningMethod: Enter the device or process used to tune the equipment
   * through the RF spectrum.
   * <p>
   * Recommend values from Code List CTN
   */
  @XmlElement(name = "TuningMethod", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString tuningMethod;
  /**
   * NumSubCarriers: Enter the number of subcarrier frequencies for the
   * subcarriers modulating the carrier individually.
   */
  @XmlElement(name = "NumSubCarriers", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSubCarriers;
  /**
   * NumSideTones: Enter the number of side tone frequencies for the sidetones
   * modulating the carrier individually.
   */
  @XmlElement(name = "NumSideTones", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numSideTones;
  /**
   * This group describes the distortion that is the result of two or more
   * signals mixing together that are not harmonic frequencies. These signals
   * mix to create additional non-harmonic frequencies that are undesirable.
   * <p>
   * IntermodPct: Enter the percentage of the total signal either transmitted or
   * received affected by the distortion products
   */
  @XmlElement(name = "IntermodPct", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterPERCENT.class)
  private TDecimal intermodPct;
  /**
   * IntermodEffect: Enter the effect on circuit operation caused by the level
   * of intermodulation distortion.
   */
  @XmlElement(name = "IntermodEffect", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString intermodEffect;
  /**
   * BurstRate: Enter the number of pulse bursts per second.
   */
  @XmlElement(name = "BurstRate", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN12_3.class)
  private TDecimal burstRate;
  /**
   * BurstDuration: Enter the pulse burst duration in microseconds.
   */
  @XmlElement(name = "BurstDuration", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstDuration;
  /**
   * BurstNumPulses: Enter the number of pulses in a single pulse burst.
   */
  @XmlElement(name = "BurstNumPulses", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN8.class)
  private TInteger burstNumPulses;
  /**
   * BurstOffTime: Enter the pulse burst off time in microseconds (duration of
   * time between the end of one pulse burst to the start of the next pulse
   * burst).
   */
  @XmlElement(name = "BurstOffTime", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal burstOffTime;
  /**
   * This group contains the Occupied Bandwidth which is defined as the
   * bandwidth that contains 99% of the spectral power under the emission curve.
   * <p>
   * <p>
   * OccBw: Enter the occupied bandwidth in MHz, without unit symbol.
   */
  @XmlElement(name = "OccBw")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal occBw;
  /**
   * OccBwCalculated: Enter Yes to indicate that the data was calculated, or
   * "No" if the data is issued from measurement. Leave blank if the origin of
   * the data is not known.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "OccBwCalculated", required = false)
  private TString occBwCalculated;
  /**
   * This group contains levels of emissions on a frequency or frequencies that
   * are outside the necessary bandwidth and the level of which may be reduced
   * without affecting the corresponding transmission of information. Spurious
   * emissions include harmonic emissions, parasitic emissions, intermodulation
   * products and frequency conversion products, but exclude out-of-band
   * emissions.
   * <p>
   * SecondHarmonicLevel: Enter the out-of-band emission level at the frequency
   * that is two times the fundamental frequency. The value is expressed as the
   * power level in decibels relative to the peak output power of the carrier
   * signal.
   */
  @XmlElement(name = "SecondHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal secondHarmonicLevel;
  /**
   * ThirdHarmonicLevel: Enter the out-of-band emission level at the frequency
   * that is three times the fundamental frequency. The value is expressed as
   * the power level in decibels relative to the peak output power of the
   * carrier signal.
   */
  @XmlElement(name = "ThirdHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal thirdHarmonicLevel;
  /**
   * OtherHarmonicLevel: Enter the greatest out-of-band emission level at
   * harmonic frequencies greater than three times the fundamental frequency.
   * The value is expressed as the power level in decibels relative to the peak
   * output power of the carrier signal.
   */
  @XmlElement(name = "OtherHarmonicLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal otherHarmonicLevel;
  /**
   * SpuriousLevel: Enter the maximum of all emission levels which occur outside
   * the -60 dB bandwidth of the fundamental and not at a harmonic frequency.
   * The value is expressed as the power level in decibels relative to the peak
   * output power of the carrier signal.
   */
  @XmlElement(name = "SpuriousLevel", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDB.class)
  private TDecimal spuriousLevel;
  /**
   * The maximum drift from an equipment's center frequency after normal warm-up
   * time has been allowed.
   * <p>
   * FreqTolerance: Enter the drift in Hz or in ppm using the formula: Frequency
   * tolerance (ppm) = Maximum drift (Hz) / Center frequency (MHz). Enter the
   * units (Hz or ppm) in FreqToleranceUnit.
   */
  @XmlElement(name = "FreqTolerance")
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUN18_6.class)
  private TDecimal freqTolerance;
  /**
   * FreqToleranceUnit: Enter the units in which the Frequency Tolerance is
   * expressed.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CFO: Hz Hertz, ppm parts per million
   */
  @XmlElement(name = "FreqToleranceUnit")
  private TString freqToleranceUnit;
  /**
   * RadarType: Enter the type of radar.
   * <p>
   * Recommend values from Code List CRA
   */
  @XmlElement(name = "RadarType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
  private TString radarType;
  /**
   * GpsNBL1Level (US): Enter the narrowband levels emitted by this system in
   * the Navstar Global Positioning System (GPS) 1164-1240 MHz band. (dBW)
   */
  @XmlElement(name = "GpsNBL1Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL1Level;
  /**
   * GpsNBL2Level (US): Enter the narrowband levels emitted by this system in
   * the Navstar Global Positioning System (GPS) 1559-1610 MHz band. (dBW)
   */
  @XmlElement(name = "GpsNBL2Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBW.class)
  private TDecimal gpsNBL2Level;
  /**
   * GpsWBL1Level (US): Enter the wideband levels emitted by this system in the
   * Navstar Global Positioning System (GPS) 1164-1240 MHz band.
   */
  @XmlElement(name = "GpsWBL1Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL1Level;
  /**
   * GpsWBL2Level (US): Enter the wideband levels emitted by this system in the
   * Navstar Global Positioning System (GPS) 1559-1610 MHz band.
   */
  @XmlElement(name = "GpsWBL2Level", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterUS_DBWHZ.class)
  private TDecimal gpsWBL2Level;
  /**
   * ModulationType (US): Enter the type of modulation used by a non-radar
   * (communications) transmitter, indicating whether it is analog, digital, or
   * pulse. If the 1st symbol of the Emission Designator is "B", "C", "H", "J",
   * or "R", then the Modulation Type should be A - Analog. If the 1st symbol is
   * "W" or "X", it should be D - Digital.
   * <p>
   * Recommend values from Code List UMD: Code Pulse Digital Analog
   */
  @XmlElement(name = "ModulationType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString modulationType;
  /**
   * ModeName (US): Enter a short name for the mode.
   */
  @XmlElement(name = "ModeName", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS40.class)
  private TString modeName;

  /**
   * This data element identifies the emission classification symbols that
   * define the baseband modulating characteristics of the emission designator.
   * The emission classification consists of the three required symbols and the
   * two optional symbols shown in the table below.
   */
  @XmlElement(name = "EmsClass", nillable = true)
  private List<EmsClass> emsClass;
  /**
   * Data element Power identifies the transmitter power.
   */
  @XmlElement(name = "Power")
  private List<Power> power;
  /**
   * Data element TxSignalTuning indicates the tuning capabilities, the specific
   * frequency or range of frequencies within which the equipment may tune, and
   * the tuning increments of the equipment.
   */
  @XmlElement(name = "TxSignalTuning")
  private List<TxSignalTuning> txSignalTuning;
  /**
   * This element inherits attributes and sub-elements from element
   * RxModulation.
   * <p>
   * This data element contains the detailed characteristics of the modulation
   * on the transmitter side.
   */
  @XmlElement(name = "TxModulation")
  private List<TxModulation> txModulation;
  /**
   * This element defines the parameters of the modulating or received signal.
   */
  @XmlElement(name = "Baseband")
  private List<Baseband> baseband;
  /**
   * Data element Pulse contains the pulse characteristics for all equipment
   * using a pulsed emission. It includes the parameters of the pulse time cycle
   * the pulse shape.
   */
  @XmlElement(name = "Pulse")
  private List<Pulse> pulse;
  /**
   * Data element SubcarrierFreq contains a frequency for the subcarrier. A
   * subcarrier is a secondary channel that resides within the main channel (a
   * carrier within a carrier). A type of multiplexing, the subcarrier is a
   * modulated carrier signal at a lower frequency that is combined with the
   * main carrier signal operating at a higher frequency.
   */
  @XmlElement(name = "SubCarrierFreq", nillable = true)
  private List<SubCarrierFreq> subCarrierFreq;
  /**
   * Data element SubcarrierTone contains the sidetone frequency used to
   * modulate the subcarrier.
   */
  @XmlElement(name = "SubCarrierTone", nillable = true)
  private List<SubCarrierTone> subCarrierTone;
  /**
   * Data element SpreadSpectrum contains characteristics of systems using
   * spread spectrum techniques.
   */
  @XmlElement(name = "SpreadSpectrum")
  protected SpreadSpectrum spreadSpectrum;
  /**
   * curves (Attribute): Enter the list of indices referring to a Curve index
   * applicable to the current data item.
   * <p>
   * Data element Curve defines the type of curve. It contains an indication as
   * to whether the values were measured or calculated, the numeric factor to be
   * applied to the carrier frequency to find the abscissa of the curve, a
   * frequency to be added to the carrier frequency to obtain the origin of the
   * curve, and the measurement bandwidth. The absolute frequency of the point
   * on the curve will be indicated by: <code>Freq = Freqcarrier * X + Freqconst +
   * Freqoffset</code> where:
   * <ul>
   * <li>Freqcarrier = assigned or tuned frequency for which the curve will
   * apply</li>
   * <li>X = value of freqFactor</li>
   * <li>Freqconst = value of freqConst</li>
   * <li>Freqoffset = value of offset in each CurvePoint</li></ul>
   */
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
   * Gets the value of the necessaryBw property.
   * <p>
   * @return
   */
  public TDecimal getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Sets the value of the necessaryBw property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getTunability() {
    return tunability;
  }

  /**
   * Sets the value of the tunability property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getTuningMethod() {
    return tuningMethod;
  }

  /**
   * Sets the value of the tuningMethod property.
   * <p>
   * @param value
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
   * @return
   */
  public TInteger getNumSubCarriers() {
    return numSubCarriers;
  }

  /**
   * Sets the value of the numSubCarriers property.
   * <p>
   * @param value
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
   * @return
   */
  public TInteger getNumSideTones() {
    return numSideTones;
  }

  /**
   * Sets the value of the numSideTones property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getIntermodPct() {
    return intermodPct;
  }

  /**
   * Sets the value of the intermodPct property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getIntermodEffect() {
    return intermodEffect;
  }

  /**
   * Sets the value of the intermodEffect property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getBurstRate() {
    return burstRate;
  }

  /**
   * Sets the value of the burstRate property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getBurstDuration() {
    return burstDuration;
  }

  /**
   * Sets the value of the burstDuration property.
   * <p>
   * @param value
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
   * @return
   */
  public TInteger getBurstNumPulses() {
    return burstNumPulses;
  }

  /**
   * Sets the value of the burstNumPulses property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getBurstOffTime() {
    return burstOffTime;
  }

  /**
   * Sets the value of the burstOffTime property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getOccBw() {
    return occBw;
  }

  /**
   * Sets the value of the occBw property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getOccBwCalculated() {
    return occBwCalculated;
  }

  /**
   * Sets the value of the occBwCalculated property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getSecondHarmonicLevel() {
    return secondHarmonicLevel;
  }

  /**
   * Sets the value of the secondHarmonicLevel property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getThirdHarmonicLevel() {
    return thirdHarmonicLevel;
  }

  /**
   * Sets the value of the thirdHarmonicLevel property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getOtherHarmonicLevel() {
    return otherHarmonicLevel;
  }

  /**
   * Sets the value of the otherHarmonicLevel property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getSpuriousLevel() {
    return spuriousLevel;
  }

  /**
   * Sets the value of the spuriousLevel property.
   * <p>
   * @param value
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
   * Gets the value of the radarType property.
   * <p>
   * @return
   */
  public TString getRadarType() {
    return radarType;
  }

  /**
   * Sets the value of the radarType property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getGpsNBL1Level() {
    return gpsNBL1Level;
  }

  /**
   * Sets the value of the gpsNBL1Level property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getGpsNBL2Level() {
    return gpsNBL2Level;
  }

  /**
   * Sets the value of the gpsNBL2Level property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getGpsWBL1Level() {
    return gpsWBL1Level;
  }

  /**
   * Sets the value of the gpsWBL1Level property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getGpsWBL2Level() {
    return gpsWBL2Level;
  }

  /**
   * Sets the value of the gpsWBL2Level property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getModulationType() {
    return modulationType;
  }

  /**
   * Sets the value of the modulationType property.
   * <p>
   * @param value
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
   * @return
   */
  public TString getModeName() {
    return modeName;
  }

  /**
   * Sets the value of the modeName property.
   * <p>
   * @param value
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the emsClass property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEmsClass().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the power property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPower().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txSignalTuning property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxSignalTuning().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the txModulation property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTxModulation().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the baseband property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBaseband().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the pulse property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPulse().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the subCarrierFreq property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSubCarrierFreq().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the subCarrierTone property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSubCarrierTone().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the curves property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurves().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
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
