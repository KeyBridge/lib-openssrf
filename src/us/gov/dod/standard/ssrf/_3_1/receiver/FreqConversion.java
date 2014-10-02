/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * StageNum - Conversion Stage Number (Optional)
   * <p>
   * The position of the IF stage being described.
   * <p>
   * Format is UN(1) [1..5]
   */
  @XmlElement(name = "StageNum", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterIFNUM.class)
  private TInteger stageNum;
  /**
   * OscillatorTuning - Oscillator Tuning (Optional)
   * <p>
   * The relationship between the local oscillator frequency and the RF centre
   * frequency.
   * <p>
   * Format is L:CLO
   */
  @XmlElement(name = "OscillatorTuning", required = false)
  private TString oscillatorTuning;
  /**
   * LOFreqMin - Minimum or Nominal LO Frequency (Optional)
   * <p>
   * The nominal LO frequency or minimum value of the LO frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "LOFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal loFreqMin;
  /**
   * LOFreqMax - Maximum LO Frequency (Optional)
   * <p>
   * The maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "LOFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal loFreqMax;
  /**
   * IFMin - Nominal/Minimum Intermediate Frequency (Optional)
   * <p>
   * The nominal intermediate frequency or minimum value of the intermediate
   * frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "IFMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal ifMin;
  /**
   * IFMax - Maximum Intermediate Frequency (Optional)
   * <p>
   * The maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "IFMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal ifMax;

  /**
   * Get the position of the IF stage being described.
   * <p>
   * @return the StageNum value in a {@link TInteger} data type
   */
  public TInteger getStageNum() {
    return stageNum;
  }

  /**
   * Set the position of the IF stage being described.
   * <p>
   * @param value the StageNum value in a {@link TInteger} data type
   */
  public void setStageNum(TInteger value) {
    this.stageNum = value;
  }

  /**
   * Determine if the StageNum is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStageNum() {
    return (this.stageNum != null ? this.stageNum.isSetValue() : false);
  }

  /**
   * Get the relationship between the local oscillator frequency and the RF
   * centre frequency.
   * <p>
   * @return the OscillatorTuning value in a {@link TString} data type
   */
  public TString getOscillatorTuning() {
    return oscillatorTuning;
  }

  /**
   * Set the relationship between the local oscillator frequency and the RF
   * centre frequency.
   * <p>
   * @param value the OscillatorTuning value in a {@link TString} data type
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
   * Get the nominal LO frequency or minimum value of the LO frequency range.
   * <p>
   * @return the LOFreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getLOFreqMin() {
    return loFreqMin;
  }

  /**
   * Set the nominal LO frequency or minimum value of the LO frequency range.
   * <p>
   * @param value the LOFreqMin value in a {@link TDecimal} data type
   */
  public void setLOFreqMin(TDecimal value) {
    this.loFreqMin = value;
  }

  /**
   * Determine if the LOFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLOFreqMin() {
    return (this.loFreqMin != null ? this.loFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.
   * <p>
   * @return the LOFreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getLOFreqMax() {
    return loFreqMax;
  }

  /**
   * Set the maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.
   * <p>
   * @param value the LOFreqMax value in a {@link TDecimal} data type
   */
  public void setLOFreqMax(TDecimal value) {
    this.loFreqMax = value;
  }

  /**
   * Determine if the LOFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLOFreqMax() {
    return (this.loFreqMax != null ? this.loFreqMax.isSetValue() : false);
  }

  /**
   * Get the nominal intermediate frequency or minimum value of the intermediate
   * frequency range.
   * <p>
   * @return the IFMin value in a {@link TDecimal} data type
   */
  public TDecimal getIFMin() {
    return ifMin;
  }

  /**
   * Set the nominal intermediate frequency or minimum value of the intermediate
   * frequency range.
   * <p>
   * @param value the IFMin value in a {@link TDecimal} data type
   */
  public void setIFMin(TDecimal value) {
    this.ifMin = value;
  }

  /**
   * Determine if the IFMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIFMin() {
    return (this.ifMin != null ? this.ifMin.isSetValue() : false);
  }

  /**
   * Get the maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.
   * <p>
   * @return the IFMax value in a {@link TDecimal} data type
   */
  public TDecimal getIFMax() {
    return ifMax;
  }

  /**
   * Set the maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.
   * <p>
   * @param value the IFMax value in a {@link TDecimal} data type
   */
  public void setIFMax(TDecimal value) {
    this.ifMax = value;
  }

  /**
   * Determine if the IFMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIFMax() {
    return (this.ifMax != null ? this.ifMax.isSetValue() : false);
  }

  /**
   * Set the position of the IF stage being described.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current FreqConversion object instance
   */
  public FreqConversion withStageNum(Integer value) {
    setStageNum(new TInteger(value));
    return this;
  }

  /**
   * Set the relationship between the local oscillator frequency and the RF
   * centre frequency.
   * <p>
   * @param value An instances of type {@link ListCLO}
   * @return The current FreqConversion object instance
   */
  public FreqConversion withOscillatorTuning(ListCLO value) {
    setOscillatorTuning(new TString(value.value()));
    return this;
  }

  /**
   * Set the nominal LO frequency or minimum value of the LO frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current FreqConversion object instance
   */
  public FreqConversion withLOFreqMin(Double value) {
    setLOFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the LO frequencies.
   * <p>
   * [XSL ERR MINMAX] If LOFreqMax is used, it MUST be greater than LOFreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current FreqConversion object instance
   */
  public FreqConversion withLOFreqMax(Double value) {
    setLOFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the nominal intermediate frequency or minimum value of the intermediate
   * frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current FreqConversion object instance
   */
  public FreqConversion withIFMin(Double value) {
    setIFMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum value of the intermediate frequencies.
   * <p>
   * [XSL ERR MINMAX] If IFMax is used, it MUST be greater than IFMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current FreqConversion object instance
   */
  public FreqConversion withIFMax(Double value) {
    setIFMax(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this FreqConversion instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FreqConversion {"
      + " loFreqMin [" + loFreqMin + "]"
      + " ifMin [" + ifMin + "]"
      + " ifMax [" + ifMax + "]"
      + " loFreqMax [" + loFreqMax + "]"
      + " oscillatorTuning [" + oscillatorTuning + "]"
      + " stageNum [" + stageNum + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqConversion} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}