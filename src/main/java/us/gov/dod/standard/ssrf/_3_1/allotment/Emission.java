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
package us.gov.dod.standard.ssrf._3_1.allotment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Allotment;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.EmsDes;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.FreqM;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.dBW;

/**
 * Emission defines the limits of the authorized bandwidth and power within the
 * allotment.
 * <p>
 * Element of {@link Allotment}
 * <p>
 * Example: See {@link Allotment}.
 *
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emission", propOrder = {
  "emsClass",
  "necessaryBw",
  "power"
})
public class Emission {

  /**
   * EmsClass - Class Of Emission (Optional) * A three to five characters code,
   * derived from the table below, representing the emission classification. If
   * an "X" is used in any of the symbols, Remarks SHOULD be used to explain the
   * nature of the signal. First Symbol - Designates Type of Modulation of the
   * Main Carrier Unmodulated N - Emission of unmodulated carrier Amplitude
   * Modulated A - Double sideband H - Single sideband, full carrier R - Single
   * sideband, reduced or variable level carrier J - Single sideband, suppressed
   * carrier B - Independent sidebands C - Vestigial sidebands Angle-Modulated F
   * - Frequency modulation G - Phase modulation Amplitude and Angle-Modulated D
   * - Main carrier is amplitude-modulated and angle-modulated simultaneously or
   * in a preestablished sequence Pulse P - Sequence of unmodulated pulses K -
   * Modulated in amplitude L - Modulated in width/duration M - Modulated in
   * position phase Q - Carrier is angle-modulated during the period of the
   * pulse V - Combination of the foregoing or is produced by other means
   * Combination W - Cases not covered above in which an emission consists of
   * the main carrier being modulated, either simultaneously or in a
   * preestablished sequence, in a combination of two or more of the following
   * modes: amplitude, angle, pulse Other X - Cases not otherwise covered - :
   * Unknown (to be used only by legacy data) Second Symbol - Designates the
   * Nature of Signal(s) Modulating the Main Carrier 0 - No modulating signal 1
   * - A single channel containing quantised or digital information, not using a
   * modulating subcarrier. (Excludes time-division multiplex) 2 - A single
   * channel containing quantised or digital information, using a modulating
   * subcarrier 3 - A single channel containing analogue information 7 - Two or
   * more channels containing quantised or digital information 8 - Two or more
   * channels containing analogue information 9 - Composite system with one or
   * more channels containing quantised or digital information, together with
   * one or more channels containing analogue information X - Cases not
   * otherwise covered - : Unknown (to be used only by legacy data) Third Symbol
   * - Type of Information to be Transmitted a N - No information transmitted A
   * - Telegraphy - for aural reception B - Telegraphy - for automatic reception
   * C - Facsimile D - Data transmission, telemetry, telecommand E - Telephony
   * (including sound broadcasting) F - Television (video) W - Combination of
   * the above X - Cases not otherwise covered - : Unknown (to be used only by
   * legacy data) a In Data Item this context, the word "information" does not
   * include information of a constant, unvarying, nature such as that provided
   * by standard frequency emissions, continuous wave, pulse radars, etc. b A
   * full explanation for the selection of the letter X shall be provided in
   * Information unless the application is for a non-directional beacon in the
   * bands 190-435 and 510-535 kHz. Fourth Symbol - Designates the Details of
   * Signal(s) A - Two-condition code with elements of differing numbers and/or
   * durations B - Two-condition code with elements of the same number and
   * duration without error correction C - Two-condition code with elements of
   * the same number and duration with error correction D - Four-condition code
   * in which each condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing
   * <p>
   * Format is pattern (S5)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "EmsClass", required = false)
  private EmsDes emsClass;
  /**
   * NecessaryBw - Necessary Bandwidth (Optional) * The necessary bandwidth
   * which is defined as the value in MHz, for a given class of emission, the
   * width of the frequency band which is just sufficient to ensure the
   * transmission of information at the rate and with the quality required under
   * specified conditions. This is approximately at the -20 dB level on an
   * emission curve.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "NecessaryBw", required = false)
  private FreqM necessaryBw;
  /**
   * Power - Maximum Power (Optional) * The maximum authorised power in dBW, for
   * the given class of emission.
   * <p>
   * Format is SN(10,7) (dBW)
   *
   * @since 3.1.0
   */
  @XmlElement(name = "Power", required = false)
  private dBW power;

  /**
   * Get a three to five characters code, derived from the table below,
   * representing the emission classification. If an "X" is used in any of the
   * symbols, Remarks SHOULD be used to explain the nature of the signal. First
   * Symbol - Designates Type of Modulation of the Main Carrier Unmodulated N -
   * Emission of unmodulated carrier Amplitude Modulated A - Double sideband H -
   * Single sideband, full carrier R - Single sideband, reduced or variable
   * level carrier J - Single sideband, suppressed carrier B - Independent
   * sidebands C - Vestigial sidebands Angle-Modulated F - Frequency modulation
   * G - Phase modulation Amplitude and Angle-Modulated D - Main carrier is
   * amplitude-modulated and angle-modulated simultaneously or in a
   * preestablished sequence Pulse P - Sequence of unmodulated pulses K -
   * Modulated in amplitude L - Modulated in width/duration M - Modulated in
   * position phase Q - Carrier is angle-modulated during the period of the
   * pulse V - Combination of the foregoing or is produced by other means
   * Combination W - Cases not covered above in which an emission consists of
   * the main carrier being modulated, either simultaneously or in a
   * preestablished sequence, in a combination of two or more of the following
   * modes: amplitude, angle, pulse Other X - Cases not otherwise covered - :
   * Unknown (to be used only by legacy data) Second Symbol - Designates the
   * Nature of Signal(s) Modulating the Main Carrier 0 - No modulating signal 1
   * - A single channel containing quantised or digital information, not using a
   * modulating subcarrier. (Excludes time-division multiplex) 2 - A single
   * channel containing quantised or digital information, using a modulating
   * subcarrier 3 - A single channel containing analogue information 7 - Two or
   * more channels containing quantised or digital information 8 - Two or more
   * channels containing analogue information 9 - Composite system with one or
   * more channels containing quantised or digital information, together with
   * one or more channels containing analogue information X - Cases not
   * otherwise covered - : Unknown (to be used only by legacy data) Third Symbol
   * - Type of Information to be Transmitted a N - No information transmitted A
   * - Telegraphy - for aural reception B - Telegraphy - for automatic reception
   * C - Facsimile D - Data transmission, telemetry, telecommand E - Telephony
   * (including sound broadcasting) F - Television (video) W - Combination of
   * the above X - Cases not otherwise covered - : Unknown (to be used only by
   * legacy data) a In Data Item this context, the word "information" does not
   * include information of a constant, unvarying, nature such as that provided
   * by standard frequency emissions, continuous wave, pulse radars, etc. b A
   * full explanation for the selection of the letter X shall be provided in
   * Information unless the application is for a non-directional beacon in the
   * bands 190-435 and 510-535 kHz. Fourth Symbol - Designates the Details of
   * Signal(s) A - Two-condition code with elements of differing numbers and/or
   * durations B - Two-condition code with elements of the same number and
   * duration without error correction C - Two-condition code with elements of
   * the same number and duration with error correction D - Four-condition code
   * in which each condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing .
   *
   * @return a {@link EmsDes} instance
   * @since 3.1.0
   */
  public EmsDes getEmsClass() {
    return emsClass;
  }

  /**
   * Set a three to five characters code, derived from the table below,
   * representing the emission classification. If an "X" is used in any of the
   * symbols, Remarks SHOULD be used to explain the nature of the signal. First
   * Symbol - Designates Type of Modulation of the Main Carrier Unmodulated N -
   * Emission of unmodulated carrier Amplitude Modulated A - Double sideband H -
   * Single sideband, full carrier R - Single sideband, reduced or variable
   * level carrier J - Single sideband, suppressed carrier B - Independent
   * sidebands C - Vestigial sidebands Angle-Modulated F - Frequency modulation
   * G - Phase modulation Amplitude and Angle-Modulated D - Main carrier is
   * amplitude-modulated and angle-modulated simultaneously or in a
   * preestablished sequence Pulse P - Sequence of unmodulated pulses K -
   * Modulated in amplitude L - Modulated in width/duration M - Modulated in
   * position phase Q - Carrier is angle-modulated during the period of the
   * pulse V - Combination of the foregoing or is produced by other means
   * Combination W - Cases not covered above in which an emission consists of
   * the main carrier being modulated, either simultaneously or in a
   * preestablished sequence, in a combination of two or more of the following
   * modes: amplitude, angle, pulse Other X - Cases not otherwise covered - :
   * Unknown (to be used only by legacy data) Second Symbol - Designates the
   * Nature of Signal(s) Modulating the Main Carrier 0 - No modulating signal 1
   * - A single channel containing quantised or digital information, not using a
   * modulating subcarrier. (Excludes time-division multiplex) 2 - A single
   * channel containing quantised or digital information, using a modulating
   * subcarrier 3 - A single channel containing analogue information 7 - Two or
   * more channels containing quantised or digital information 8 - Two or more
   * channels containing analogue information 9 - Composite system with one or
   * more channels containing quantised or digital information, together with
   * one or more channels containing analogue information X - Cases not
   * otherwise covered - : Unknown (to be used only by legacy data) Third Symbol
   * - Type of Information to be Transmitted a N - No information transmitted A
   * - Telegraphy - for aural reception B - Telegraphy - for automatic reception
   * C - Facsimile D - Data transmission, telemetry, telecommand E - Telephony
   * (including sound broadcasting) F - Television (video) W - Combination of
   * the above X - Cases not otherwise covered - : Unknown (to be used only by
   * legacy data) a In Data Item this context, the word "information" does not
   * include information of a constant, unvarying, nature such as that provided
   * by standard frequency emissions, continuous wave, pulse radars, etc. b A
   * full explanation for the selection of the letter X shall be provided in
   * Information unless the application is for a non-directional beacon in the
   * bands 190-435 and 510-535 kHz. Fourth Symbol - Designates the Details of
   * Signal(s) A - Two-condition code with elements of differing numbers and/or
   * durations B - Two-condition code with elements of the same number and
   * duration without error correction C - Two-condition code with elements of
   * the same number and duration with error correction D - Four-condition code
   * in which each condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing .
   *
   * @param value a {@link EmsDes} instance
   * @since 3.1.0
   */
  public void setEmsClass(EmsDes value) {
    this.emsClass = value;
  }

  /**
   * Determine if the EmsClass is configured.
   *
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
   * the -20 dB level on an emission curve..
   *
   * @return a {@link FreqM} instance
   * @since 3.1.0
   */
  public FreqM getNecessaryBw() {
    return necessaryBw;
  }

  /**
   * Set the necessary bandwidth which is defined as the value in MHz, for a
   * given class of emission, the width of the frequency band which is just
   * sufficient to ensure the transmission of information at the rate and with
   * the quality required under specified conditions. This is approximately at
   * the -20 dB level on an emission curve..
   *
   * @param value a {@link FreqM} instance
   * @since 3.1.0
   */
  public void setNecessaryBw(FreqM value) {
    this.necessaryBw = value;
  }

  /**
   * Determine if the NecessaryBw is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNecessaryBw() {
    return (this.necessaryBw != null ? this.necessaryBw.isSetValue() : false);
  }

  /**
   * Get the maximum authorised power in dBW, for the given class of emission..
   *
   * @return a {@link dBW} instance
   * @since 3.1.0
   */
  public dBW getPower() {
    return power;
  }

  /**
   * Set the maximum authorised power in dBW, for the given class of emission..
   *
   * @param value a {@link dBW} instance
   * @since 3.1.0
   */
  public void setPower(dBW value) {
    this.power = value;
  }

  /**
   * Determine if the Power is configured.
   *
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPower() {
    return (this.power != null ? this.power.isSetValue() : false);
  }

  /**
   * Set a three to five characters code, derived from the table below,
   * representing the emission classification. If an "X" is used in any of the
   * symbols, Remarks SHOULD be used to explain the nature of the signal. First
   * Symbol - Designates Type of Modulation of the Main Carrier Unmodulated N -
   * Emission of unmodulated carrier Amplitude Modulated A - Double sideband H -
   * Single sideband, full carrier R - Single sideband, reduced or variable
   * level carrier J - Single sideband, suppressed carrier B - Independent
   * sidebands C - Vestigial sidebands Angle-Modulated F - Frequency modulation
   * G - Phase modulation Amplitude and Angle-Modulated D - Main carrier is
   * amplitude-modulated and angle-modulated simultaneously or in a
   * preestablished sequence Pulse P - Sequence of unmodulated pulses K -
   * Modulated in amplitude L - Modulated in width/duration M - Modulated in
   * position phase Q - Carrier is angle-modulated during the period of the
   * pulse V - Combination of the foregoing or is produced by other means
   * Combination W - Cases not covered above in which an emission consists of
   * the main carrier being modulated, either simultaneously or in a
   * preestablished sequence, in a combination of two or more of the following
   * modes: amplitude, angle, pulse Other X - Cases not otherwise covered - :
   * Unknown (to be used only by legacy data) Second Symbol - Designates the
   * Nature of Signal(s) Modulating the Main Carrier 0 - No modulating signal 1
   * - A single channel containing quantised or digital information, not using a
   * modulating subcarrier. (Excludes time-division multiplex) 2 - A single
   * channel containing quantised or digital information, using a modulating
   * subcarrier 3 - A single channel containing analogue information 7 - Two or
   * more channels containing quantised or digital information 8 - Two or more
   * channels containing analogue information 9 - Composite system with one or
   * more channels containing quantised or digital information, together with
   * one or more channels containing analogue information X - Cases not
   * otherwise covered - : Unknown (to be used only by legacy data) Third Symbol
   * - Type of Information to be Transmitted a N - No information transmitted A
   * - Telegraphy - for aural reception B - Telegraphy - for automatic reception
   * C - Facsimile D - Data transmission, telemetry, telecommand E - Telephony
   * (including sound broadcasting) F - Television (video) W - Combination of
   * the above X - Cases not otherwise covered - : Unknown (to be used only by
   * legacy data) a In Data Item this context, the word "information" does not
   * include information of a constant, unvarying, nature such as that provided
   * by standard frequency emissions, continuous wave, pulse radars, etc. b A
   * full explanation for the selection of the letter X shall be provided in
   * Information unless the application is for a non-directional beacon in the
   * bands 190-435 and 510-535 kHz. Fourth Symbol - Designates the Details of
   * Signal(s) A - Two-condition code with elements of differing numbers and/or
   * durations B - Two-condition code with elements of the same number and
   * duration without error correction C - Two-condition code with elements of
   * the same number and duration with error correction D - Four-condition code
   * in which each condition represents a signal element of one or more bits E -
   * Multi-condition code in which each condition represents a signal element of
   * one or more bits F - Multi-condition code in which each condition or
   * combination of conditions represents a character G - Sound of broadcasting
   * quality (monophonic) H - Sound of broadcasting quality (stereophonic or
   * quadraphonic) J - Sound of commercial quality (excluding categories defined
   * for symbol K and L below) K - Sound of commercial quality with the use of
   * frequency inversion or band splitting L - Sound of commercial quality with
   * separate frequency modulated signals to control the level of demodulated
   * signal M - Monochrome N - Color W - Combination of the above X - Cases not
   * otherwise covered Fifth Symbol - Designates the Nature of Multiplexing N -
   * None C - Code-division multiplex (includes bandwidth expansion techniques)
   * F - Frequency-division multiplex T - Time-division multiplex W -
   * Combination of frequency-division multiplex and time-division multiplex X -
   * Other types of multiplexing
   *
   * @param value An instances of type {@link String}.
   * @return The current Emission object instance.
   * @since 3.1.0
   */
  public Emission withEmsClass(String value) {
    setEmsClass(new EmsDes(value));
    return this;
  }

  /**
   * Set the necessary bandwidth which is defined as the value in MHz, for a
   * given class of emission, the width of the frequency band which is just
   * sufficient to ensure the transmission of information at the rate and with
   * the quality required under specified conditions. This is approximately at
   * the -20 dB level on an emission curve.
   *
   * @param value An instances of type {@link Double}.
   * @return The current Emission object instance.
   * @since 3.1.0
   */
  public Emission withNecessaryBw(Double value) {
    setNecessaryBw(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum authorised power in dBW, for the given class of emission.
   *
   * @param value An instances of type {@link Double}.
   * @return The current Emission object instance.
   * @since 3.1.0
   */
  public Emission withPower(Double value) {
    setPower(new dBW(value));
    return this;
  }

  /**
   * Get a string representation of this Emission instance configuration.
   *
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Emission {"
           + (emsClass != null ? " emsClass [" + emsClass + "]" : "")
           + (necessaryBw != null ? " necessaryBw [" + necessaryBw + "]" : "")
           + (power != null ? " power [" + power + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Emission} has no configuration requirements.
   *
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
