/* 
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCLO;

/**
 * FreqConversion contains the characteristics of a frequency conversion stage:
 * intermediate frequency (IF) and local oscillator (LO) parameters.
 * <p>
 * Element of {@link RxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;FreqConversion&gt;
 *   &lt;StageNum cls="U"&gt;3&lt;/StageNum&gt;
 *   &lt;OscillatorTuning cls="U"&gt;LO below RF&lt;/OscillatorTuning&gt;
 *   &lt;LOFreqMin cls="U"&gt;20&lt;/LOFreqMin&gt;
 *   &lt;IFMin cls="U"&gt;21.4&lt;/IFMin&gt;
 *   &lt;IFMax cls="U"&gt;70&lt;/IFMax&gt;
 * &lt;/FreqConversion&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqConversion", propOrder = {
  "stageNum",
  "oscillatorTuning",
  "loFreqMin",
  "loFreqMax",
  "ifMin",
  "ifMax"
})
public class FreqConversion {

  /**
   * StageNum - Conversion Stage Number (Optional)    * <p>
   * The position of the IF stage being described.
   * <p>
   * Format is UN(1) [1..5]
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StageNum", required = false)
  private IFNum stageNum;
  /**
   * OscillatorTuning - Oscillator Tuning (Optional)    * <p>
   * The relationship between the local oscillator frequency and the RF centre
   * frequency.
   * <p>
   * Format is L:CLO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OscillatorTuning", required = false)
  private TString oscillatorTuning;
  /**
   * LOFreqMin - Minimum or Nominal LO Frequency (Optional)    * <p>
   * The nominal LO frequency or minimum value of the LO frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LOFreqMin", required = false)
  private FreqM loFreqMin;
  /**
   * LOFreqMax - Maximum LO Frequency (Optional)    * <p>
   * The maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LOFreqMax", required = false)
  private FreqM loFreqMax;
  /**
   * IFMin - Nominal/Minimum Intermediate Frequency (Optional)    * <p>
   * The nominal intermediate frequency or minimum value of the intermediate
   * frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IFMin", required = false)
  private FreqM ifMin;
  /**
   * IFMax - Maximum Intermediate Frequency (Optional)    * <p>
   * The maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IFMax", required = false)
  private FreqM ifMax;

  /**
   * Get the position of the IF stage being described..
   * <p>
   * @return a {@link IFNum} instance
   * @since 3.1.0
   */
  public IFNum getStageNum() {
    return stageNum;
  }

  /**
   * Set the position of the IF stage being described..
   * <p>
   * @param value a {@link IFNum} instance
   * @since 3.1.0
   */
  public void setStageNum(IFNum value) {
    this.stageNum = value;
  }

  /**
   * Determine if the StageNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStageNum() {
    return (this.stageNum != null ? this.stageNum.isSetValue() : false);
  }

  /**
   * Get the relationship between the local oscillator frequency and the RF
   * centre frequency..
   * <p>
   * @return the OscillatorTuning value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOscillatorTuning() {
    return oscillatorTuning;
  }

  /**
   * Set the relationship between the local oscillator frequency and the RF
   * centre frequency..
   * <p>
   * @param value the OscillatorTuning value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOscillatorTuning(TString value) {
    this.oscillatorTuning = value;
  }

  /**
   * Determine if the OscillatorTuning is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOscillatorTuning() {
    return (this.oscillatorTuning != null ? this.oscillatorTuning.isSetValue() : false);
  }

  /**
   * Get the nominal LO frequency or minimum value of the LO frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getLOFreqMin() {
    return loFreqMin;
  }

  /**
   * Set the nominal LO frequency or minimum value of the LO frequency range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setLOFreqMin(FreqM value) {
    this.loFreqMin = value;
  }

  /**
   * Determine if the LOFreqMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLOFreqMin() {
    return (this.loFreqMin != null ? this.loFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getLOFreqMax() {
    return loFreqMax;
  }

  /**
   * Set the maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setLOFreqMax(FreqM value) {
    this.loFreqMax = value;
  }

  /**
   * Determine if the LOFreqMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLOFreqMax() {
    return (this.loFreqMax != null ? this.loFreqMax.isSetValue() : false);
  }

  /**
   * Get the nominal intermediate frequency or minimum value of the intermediate
   * frequency range..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getIFMin() {
    return ifMin;
  }

  /**
   * Set the nominal intermediate frequency or minimum value of the intermediate
   * frequency range..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setIFMin(FreqM value) {
    this.ifMin = value;
  }

  /**
   * Determine if the IFMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIFMin() {
    return (this.ifMin != null ? this.ifMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin..
   * <p>
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getIFMax() {
    return ifMax;
  }

  /**
   * Set the maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin..
   * <p>
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setIFMax(FreqM value) {
    this.ifMax = value;
  }

  /**
   * Determine if the IFMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIFMax() {
    return (this.ifMax != null ? this.ifMax.isSetValue() : false);
  }

  /**
   * Set the position of the IF stage being described.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current FreqConversion object instance.
   * @since 3.1.0
   */
  public FreqConversion withStageNum(Integer value) {
    setStageNum(new IFNum(value));
    return this;
  }

  /**
   * Set the relationship between the local oscillator frequency and the RF
   * centre frequency.
   * <p>
   * @param value An instances of type {@link ListCLO}.
   * @return The current FreqConversion object instance.
   * @since 3.1.0
   */
  public FreqConversion withOscillatorTuning(ListCLO value) {
    setOscillatorTuning(new TString(value.value()));
    return this;
  }

  /**
   * Set the nominal LO frequency or minimum value of the LO frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqConversion object instance.
   * @since 3.1.0
   */
  public FreqConversion withLOFreqMin(Double value) {
    setLOFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqConversion object instance.
   * @since 3.1.0
   */
  public FreqConversion withLOFreqMax(Double value) {
    setLOFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the nominal intermediate frequency or minimum value of the intermediate
   * frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqConversion object instance.
   * @since 3.1.0
   */
  public FreqConversion withIFMin(Double value) {
    setIFMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqConversion object instance.
   * @since 3.1.0
   */
  public FreqConversion withIFMax(Double value) {
    setIFMax(new FreqM(value));
    return this;
  }

  /**
   * Get a string representation of this FreqConversion instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  FreqConversion {"
           + (ifMax != null ? " ifMax [" + ifMax + "]" : "")
           + (ifMin != null ? " ifMin [" + ifMin + "]" : "")
           + (loFreqMax != null ? " loFreqMax [" + loFreqMax + "]" : "")
           + (loFreqMin != null ? " loFreqMin [" + loFreqMin + "]" : "")
           + (oscillatorTuning != null ? " oscillatorTuning [" + oscillatorTuning + "]" : "")
           + (stageNum != null ? " stageNum [" + stageNum + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqConversion} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
