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
package us.gov.dod.standard.ssrf._3_1.allotment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Allotment;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Emission defines the limits of the authorized bandwidth and power within the
 * allotment.
 * <p>
 * Element of {@link Allotment}
 * <p>
 * Example: See {@link Allotment}.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emission", propOrder = {
  "emsClass",
  "necessaryBw",
  "power"
})
public class Emission {

  /**
   * EmsClass - Class Of Emission (Optional)
   * <p>
   * A three to five characters code, derived from the table below, representing
   * the emission classification. If an "X" is used in any of the symbols,
   * Remarks SHOULD be used to explain the nature of the signal. First Symbol -
   * Designates Type of Modulation of the Main Carrier
   * <pre>Unmodulated
   * N - Emission of unmodulated carrier
   * Amplitude Modulated
   * A - Double sideband
   * H - Single sideband, full carrier
   * R - Single sideband, reduced or variable level carrier
   * J - Single sideband, suppressed carrier
   * B - Independent sidebands
   * C - Vestigial sidebands
   * Angle-Modulated
   * F - Frequency modulation
   * G - Phase modulation
   * Amplitude and Angle-Modulated
   * D - Main carrier is amplitude-modulated and angle-modulated simultaneously or in a preestablished sequence Pulse
   * P - Sequence of unmodulated pulses
   * K - Modulated in amplitude
   * L - Modulated in width/duration
   * M - Modulated in position phase
   * Q - Carrier is angle-modulated during the period of the pulse
   * V - Combination of the foregoing or is produced by other means
   * Combination
   * W - Cases not covered above in which an emission consists of the main carrier being modulated, either simultaneously or in a preestablished sequence, in a combination of two or more of the following modes: amplitude, angle, pulse
   * Other
   * X - Cases not otherwise covered
   * - : Unknown (to be used only by legacy data)
   * Second Symbol - Designates the Nature of Signal(s) Modulating the Main Carrier
   * 0 - No modulating signal
   * 1 - A single channel containing quantised or digital information, not using a modulating subcarrier. (Excludes time-division multiplex)
   * 2 - A single channel containing quantised or digital information, using a modulating subcarrier
   * 3 - A single channel containing analogue information
   * 7 - Two or more channels containing quantised or digital information
   * 8 - Two or more channels containing analogue information
   * 9 - Composite system with one or more channels containing quantised or digital information, together with one or more channels containing analogue information
   * X - Cases not otherwise covered
   * - : Unknown (to be used only by legacy data)
   * Third Symbol - Type of Information to be Transmitted a
   * N - No information transmitted
   * A - Telegraphy - for aural reception
   * B - Telegraphy - for automatic reception
   * C - Facsimile
   * D - Data transmission, telemetry, telecommand
   * E - Telephony (including sound broadcasting)
   * F - Television (video)
   * W - Combination of the above
   * X - Cases not otherwise covered
   * - : Unknown (to be used only by legacy data)
   * a In Data Item this context, the word "information" does not include information of a constant, unvarying, nature such as that provided by standard frequency emissions, continuous wave, pulse radars, etc.
   * b A full explanation for the selection of the letter X shall be provided in Information unless the application is for a non-directional beacon in the bands 190-435 and 510-535 kHz.
   * Fourth Symbol - Designates the Details of Signal(s)
   * A - Two-condition code with elements of differing numbers and/or durations
   * B - Two-condition code with elements of the same number and duration without error correction
   * C - Two-condition code with elements of the same number and duration with error correction
   * D - Four-condition code in which each condition represents a signal element of one or more bits
   * E - Multi-condition code in which each condition represents a signal element of one or more bits
   * F - Multi-condition code in which each condition or combination of conditions represents a character
   * G - Sound of broadcasting quality (monophonic)
   * H - Sound of broadcasting quality (stereophonic or quadraphonic)
   * J - Sound of commercial quality (excluding categories defined for symbol K and L below)
   * K - Sound of commercial quality with the use of frequency inversion or band splitting
   * L - Sound of commercial quality with separate frequency modulated signals to control the level of demodulated signal
   * M - Monochrome
   * N - Color
   * W - Combination of the above
   * X - Cases not otherwise covered
   * Fifth Symbol - Designates the Nature of Multiplexing
   * N - None
   * C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex
   * T - Time-division multiplex
   * W - Combination of frequency-division multiplex and time-division multiplex
   * X - Other types of multiplexing
   * </pre>
   * <p>
   * Format is pattern (S5)
   */
  @XmlElement(name = "EmsClass", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterEMSDES.class)
  private TString emsClass;
  /**
   * NecessaryBw - Necessary Bandwidth (Optional)
   * <p>
   * The necessary bandwidth which is defined as the value in MHz, for a given
   * class of emission, the width of the frequency band which is just sufficient
   * to ensure the transmission of information at the rate and with the quality
   * required under specified conditions. This is approximately at the -20 dB
   * level on an emission curve.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "NecessaryBw", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal necessaryBw;
  /**
   * Power - Maximum Power (Optional)
   * <p>
   * The maximum authorised power in dBW, for the given class of emission.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "Power", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal power;

  /**
   * Set a three to five characters code representing the emission
   * classification. If an "X" is used in any of the symbols, Remarks SHOULD be
   * used to explain the nature of the signal.
   * <p>
   * @return the EmsClass value in a {@link TString} data type
   */
  public TString getEmsClass() {
    return emsClass;
  }

  /**
   * Set a three to five characters code representing the emission
   * classification. If an "X" is used in any of the symbols, Remarks SHOULD be
   * used to explain the nature of the signal.
   * <p>
   * @param value the EmsClass value in a {@link TString} data type
   */
  public void setEmsClass(TString value) {
    this.emsClass = value;
  }

  /**
   * Determine if the EmsClass is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEmsClass() {
    return (this.emsClass != null ? this.emsClass.isSetValue() : false);
  }

  /**
   * Get the necessary bandwidth which is defined as the value in MHz, for a
   * given class of emission, the width of the frequency band which is just
   * sufficient to ensure the transmission of information at the rate and with
   * the quality required under specified conditions. This is approximately at
   * the -20 dB level on an emission curve.
   * <p>
   * @return the NecessaryBw value in a {@link TDecimal} data type
   */
  public TDecimal getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Set the necessary bandwidth which is defined as the value in MHz, for a
   * given class of emission, the width of the frequency band which is just
   * sufficient to ensure the transmission of information at the rate and with
   * the quality required under specified conditions. This is approximately at
   * the -20 dB level on an emission curve.
   * <p>
   * @param value the NecessaryBw value in a {@link TDecimal} data type
   */
  public void setNecessaryBw(TDecimal value) {
    this.necessaryBw = value;
  }

  /**
   * Determine if the NecessaryBw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNecessaryBw() {
    return (this.necessaryBw != null ? this.necessaryBw.isSetValue() : false);
  }

  /**
   * Get the maximum authorised power in dBW, for the given class of emission.
   * <p>
   * @return the Power value in a {@link TDecimal} data type
   */
  public TDecimal getPower() {
    return power;
  }

  /**
   * Set the maximum authorised power in dBW, for the given class of emission.
   * <p>
   * @param value the Power value in a {@link TDecimal} data type
   */
  public void setPower(TDecimal value) {
    this.power = value;
  }

  /**
   * Determine if the Power is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPower() {
    return (this.power != null ? this.power.isSetValue() : false);
  }

  /**
   * Set a three to five characters code representing the emission
   * classification. If an "X" is used in any of the symbols, Remarks SHOULD be
   * used to explain the nature of the signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Emission object instance
   */
  public Emission withEmsClass(String value) {
    setEmsClass(new TString(value));
    return this;
  }

  /**
   * Set the necessary bandwidth which is defined as the value in MHz, for a
   * given class of emission, the width of the frequency band which is just
   * sufficient to ensure the transmission of information at the rate and with
   * the quality required under specified conditions. This is approximately at
   * the -20 dB level on an emission curve.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Emission object instance
   */
  public Emission withNecessaryBw(Double value) {
    setNecessaryBw(new TDecimal(value));
    return this;
  }

  /**
   * Set the maximum authorised power in dBW, for the given class of emission.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Emission object instance
   */
  public Emission withPower(Double value) {
    setPower(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this Emission instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Emission {"
      + " necessaryBw [" + necessaryBw + "]"
      + " emsClass [" + emsClass + "]"
      + " power [" + power + "]"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Emission} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
