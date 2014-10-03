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
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCMO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUSS;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxMode;

/**
 * Baseband defines the parameters of the modulating or received signal.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Baseband&gt;
 *   &lt;ModFreqMin cls="U"&gt;0.0003&lt;/ModFreqMin&gt;
 *   &lt;ModFreqMax cls="U"&gt;0.0034&lt;/ModFreqMax&gt;
 *   &lt;SignalType cls="U"&gt;FM Clear Voice&lt;/SignalType&gt;
 * &lt;/Baseband&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baseband", propOrder = {
  "modFreqMin",
  "modFreqMax",
  "signalType",
  "bitDuration",
  "ookPattern",
  "signalDurationMax",
  "signalDurationMin",
  "signalSequenceDesc",
  "signalShape"
})
public class Baseband {

  /**
   * ModFreqMin - Minimum Modulating Frequency (Optional)
   * <p>
   * The minimum modulating frequency measured: - for a transmitter, on the low
   * side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "ModFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal modFreqMin;
  /**
   * ModFreqMax - Maximum Modulating Frequency (Optional)
   * <p>
   * The maximum modulating frequency: - for a transmitter, measured on the high
   * side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "ModFreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal modFreqMax;
  /**
   * SignalType - Signal Type (Optional)
   * <p>
   * The type of modulation.
   * <p>
   * Format is L:CMO
   */
  @XmlElement(name = "SignalType", required = false)
  private TString signalType;
  /**
   * BitDuration - Bit Duration (Optional)
   * <p>
   * The period of elapsed time, per bit instance, before change of states.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "BitDuration", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal bitDuration;
  /**
   * OOKPattern - On-Off Key Pattern (Optional)
   * <p>
   * A text description of the on-off keying (OOK) pattern. Example: (3 on, 3
   * off, 3 on, 4 off,...)
   * <p>
   * Format is S100
   */
  @XmlElement(name = "OOKPattern", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString ookPattern;
  /**
   * US:SignalDurationMax - Maximum Signal Duration (Optional)
   * <p>
   * The maximum time value for how long the tone persists in the baseband.
   * <p>
   * [XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than
   * US:SignalDurationMin.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "SignalDurationMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal signalDurationMax;
  /**
   * US:SignalDurationMin - Minimum Signal Duration (Optional)
   * <p>
   * The minimum time value for how long the tone persists in the baseband.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "SignalDurationMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal signalDurationMin;
  /**
   * US:SignalSequenceDesc - Signal Sequence Description (Optional)
   * <p>
   * The pattern of occurrence of sub-signals. (Example: beep, beep, pause, bip,
   * pause...) If using SignalDuration, entries in ToneName MUST match the
   * descriptive names used here.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "SignalSequenceDesc", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString signalSequenceDesc;
  /**
   * US:SignalShape - Signal Shape (Optional)
   * <p>
   * The basic shape of the signal.
   * <p>
   * Format is L:USS
   */
  @XmlElement(name = "SignalShape", required = false)
  private TString signalShape;

  /**
   * Get the minimum modulating frequency measured: - for a transmitter, on the
   * low side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * @return the ModFreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getModFreqMin() {
    return modFreqMin;
  }

  /**
   * Set the minimum modulating frequency measured: - for a transmitter, on the
   * low side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * @param value the ModFreqMin value in a {@link TDecimal} data type
   */
  public void setModFreqMin(TDecimal value) {
    this.modFreqMin = value;
  }

  /**
   * Determine if the ModFreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModFreqMin() {
    return (this.modFreqMin != null ? this.modFreqMin.isSetValue() : false);
  }

  /**
   * Get the maximum modulating frequency: - for a transmitter, measured on the
   * high side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * @return the ModFreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getModFreqMax() {
    return modFreqMax;
  }

  /**
   * Set the maximum modulating frequency: - for a transmitter, measured on the
   * high side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * @param value the ModFreqMax value in a {@link TDecimal} data type
   */
  public void setModFreqMax(TDecimal value) {
    this.modFreqMax = value;
  }

  /**
   * Determine if the ModFreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModFreqMax() {
    return (this.modFreqMax != null ? this.modFreqMax.isSetValue() : false);
  }

  /**
   * Get the type of modulation.
   * <p>
   * @return the SignalType value in a {@link TString} data type
   */
  public TString getSignalType() {
    return signalType;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value the SignalType value in a {@link TString} data type
   */
  public void setSignalType(TString value) {
    this.signalType = value;
  }

  /**
   * Determine if the SignalType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignalType() {
    return (this.signalType != null ? this.signalType.isSetValue() : false);
  }

  /**
   * Get the period of elapsed time, per bit instance, before change of states.
   * <p>
   * @return the BitDuration value in a {@link TDecimal} data type
   */
  public TDecimal getBitDuration() {
    return bitDuration;
  }

  /**
   * Set the period of elapsed time, per bit instance, before change of states.
   * <p>
   * @param value the BitDuration value in a {@link TDecimal} data type
   */
  public void setBitDuration(TDecimal value) {
    this.bitDuration = value;
  }

  /**
   * Determine if the BitDuration is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBitDuration() {
    return (this.bitDuration != null ? this.bitDuration.isSetValue() : false);
  }

  /**
   * Get a text description of the on-off keying (OOK) pattern. Example: (3 on,
   * 3 off, 3 on, 4 off,...)
   * <p>
   * @return the OOKPattern value in a {@link TString} data type
   */
  public TString getOOKPattern() {
    return ookPattern;
  }

  /**
   * Set a text description of the on-off keying (OOK) pattern. Example: (3 on,
   * 3 off, 3 on, 4 off,...)
   * <p>
   * @param value the OOKPattern value in a {@link TString} data type
   */
  public void setOOKPattern(TString value) {
    this.ookPattern = value;
  }

  /**
   * Determine if the OOKPattern is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOOKPattern() {
    return (this.ookPattern != null ? this.ookPattern.isSetValue() : false);
  }

  /**
   * Get the maximum time value for how long the tone persists in the baseband.
   * <p>
   * [XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than
   * US:SignalDurationMin.
   * <p>
   * @return the SignalDurationMax value in a {@link TDecimal} data type
   */
  public TDecimal getSignalDurationMax() {
    return signalDurationMax;
  }

  /**
   * Set the maximum time value for how long the tone persists in the baseband.
   * <p>
   * [XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than
   * US:SignalDurationMin.
   * <p>
   * @param value the SignalDurationMax value in a {@link TDecimal} data type
   */
  public void setSignalDurationMax(TDecimal value) {
    this.signalDurationMax = value;
  }

  /**
   * Determine if the SignalDurationMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignalDurationMax() {
    return (this.signalDurationMax != null ? this.signalDurationMax.isSetValue() : false);
  }

  /**
   * Get the minimum time value for how long the tone persists in the baseband.
   * <p>
   * @return the SignalDurationMin value in a {@link TDecimal} data type
   */
  public TDecimal getSignalDurationMin() {
    return signalDurationMin;
  }

  /**
   * Set the minimum time value for how long the tone persists in the baseband.
   * <p>
   * @param value the SignalDurationMin value in a {@link TDecimal} data type
   */
  public void setSignalDurationMin(TDecimal value) {
    this.signalDurationMin = value;
  }

  /**
   * Determine if the SignalDurationMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignalDurationMin() {
    return (this.signalDurationMin != null ? this.signalDurationMin.isSetValue() : false);
  }

  /**
   * Get the pattern of occurrence of sub-signals. (Example: beep, beep, pause,
   * bip, pause...) If using SignalDuration, entries in ToneName MUST match the
   * descriptive names used here.
   * <p>
   * @return the SignalSequenceDesc value in a {@link TString} data type
   */
  public TString getSignalSequenceDesc() {
    return signalSequenceDesc;
  }

  /**
   * Set the pattern of occurrence of sub-signals. (Example: beep, beep, pause,
   * bip, pause...) If using SignalDuration, entries in ToneName MUST match the
   * descriptive names used here.
   * <p>
   * @param value the SignalSequenceDesc value in a {@link TString} data type
   */
  public void setSignalSequenceDesc(TString value) {
    this.signalSequenceDesc = value;
  }

  /**
   * Determine if the SignalSequenceDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignalSequenceDesc() {
    return (this.signalSequenceDesc != null ? this.signalSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the basic shape of the signal.
   * <p>
   * @return the SignalShape value in a {@link TString} data type
   */
  public TString getSignalShape() {
    return signalShape;
  }

  /**
   * Set the basic shape of the signal.
   * <p>
   * @param value the SignalShape value in a {@link TString} data type
   */
  public void setSignalShape(TString value) {
    this.signalShape = value;
  }

  /**
   * Determine if the SignalShape is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSignalShape() {
    return (this.signalShape != null ? this.signalShape.isSetValue() : false);
  }

  /**
   * Set the minimum modulating frequency measured: - for a transmitter, on the
   * low side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, at the -3 dB
   * point on the low frequency side of the receiver baseband, after detection
   * but prior to de-multiplexing or demodulation.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Baseband object instance
   */
  public Baseband withModFreqMin(Double value) {
    setModFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum modulating frequency: - for a transmitter, measured on the
   * high side of the spectrum signature at the -3 dB point before the baseband
   * signal begins the up-conversion process; - for a receiver, frequency that
   * can be recovered and demodulated by the receiver. Typically, this frequency
   * should have 3-dB attenuation relative to the least attenuated demodulated
   * or multiplexed signal.
   * <p>
   * [XSL ERR MINMAX] If ModFreqMax is used, it MUST be greater than ModFreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Baseband object instance
   */
  public Baseband withModFreqMax(Double value) {
    setModFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value An instances of type {@link ListCMO}
   * @return The current Baseband object instance
   */
  public Baseband withSignalType(ListCMO value) {
    setSignalType(new TString(value.value()));
    return this;
  }

  /**
   * Set the period of elapsed time, per bit instance, before change of states.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Baseband object instance
   */
  public Baseband withBitDuration(Double value) {
    setBitDuration(new TDecimal(value));
    return this;
  }

  /**
   * Set a text description of the on-off keying (OOK) pattern. Example: (3 on,
   * 3 off, 3 on, 4 off,...)
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Baseband object instance
   */
  public Baseband withOOKPattern(String value) {
    setOOKPattern(new TString(value));
    return this;
  }

  /**
   * Set the maximum time value for how long the tone persists in the baseband.
   * <p>
   * [XSL ERR MINMAX] If US:SignalDurationMax is used, it MUST be greater than
   * US:SignalDurationMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Baseband object instance
   */
  public Baseband withSignalDurationMax(Double value) {
    setSignalDurationMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum time value for how long the tone persists in the baseband.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Baseband object instance
   */
  public Baseband withSignalDurationMin(Double value) {
    setSignalDurationMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the pattern of occurrence of sub-signals. (Example: beep, beep, pause,
   * bip, pause...) If using SignalDuration, entries in ToneName MUST match the
   * descriptive names used here.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Baseband object instance
   */
  public Baseband withSignalSequenceDesc(String value) {
    setSignalSequenceDesc(new TString(value));
    return this;
  }

  /**
   * Set the basic shape of the signal.
   * <p>
   * @param value An instances of type {@link ListUSS}
   * @return The current Baseband object instance
   */
  public Baseband withSignalShape(ListUSS value) {
    setSignalShape(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this Baseband instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Baseband {"
      + (modFreqMax != null ? " modFreqMax [" + modFreqMax + "]" : "")
      + (modFreqMin != null ? " modFreqMin [" + modFreqMin + "]" : "")
      + (signalSequenceDesc != null ? " signalSequenceDesc [" + signalSequenceDesc + "]" : "")
      + (bitDuration != null ? " bitDuration [" + bitDuration + "]" : "")
      + (signalType != null ? " signalType [" + signalType + "]" : "")
      + (signalShape != null ? " signalShape [" + signalShape + "]" : "")
      + (signalDurationMax != null ? " signalDurationMax [" + signalDurationMax + "]" : "")
      + (signalDurationMin != null ? " signalDurationMin [" + signalDurationMin + "]" : "")
      + (ookPattern != null ? " ookPattern [" + ookPattern + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Baseband} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
