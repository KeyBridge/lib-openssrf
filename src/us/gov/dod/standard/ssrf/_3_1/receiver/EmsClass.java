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
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterStringS5;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxMode;

/**
 * EmsClass identifies the emission classification symbols that define the
 * baseband modulating characteristics of the emission designator. The emission
 * classification consists of the three required symbols and the two optional
 * symbols.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example: Within an equipment mode:
 * <pre>
 * &lt;EmsClass&gt;J3E&lt;/EmsClass&gt;
 * &lt;EmsClass&gt;P0NAN&lt;/EmsClass&gt;
 * Within an interference Report:* &lt;SourceEmsClass&gt;A3E&lt;/SourceEmsClass&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmsClass", propOrder = {
  "value"
})
public class EmsClass extends AMetadata<EmsClass> {

  /**
   * A three to five characters Emission code representing the emission
   * classification.
   * <pre>
   * First Symbol - Designates Type of Modulation of the Main Carrier
   *   Unmodulated
   *     N - Emission of unmodulated carrier
   *   Amplitude Modulated
   *     A - Double sideband
   *     H - Single sideband, full carrier
   *     R - Single sideband, reduced or variable level carrier
   *     J - Single sideband, suppressed carrier
   *     B - Independent sidebands
   *     C - Vestigial sidebands
   *   Angle-Modulated
   *     F - Frequency modulation
   *     G - Phase modulation
   *   Amplitude and Angle-Modulated
   *     D - Main carrier is amplitude-modulated and angle-modulated simultaneously
   *         or in a preestablished sequence
   *   Pulse
   *     P - Sequence of unmodulated pulses
   *     K - Modulated in amplitude
   *     L - Modulated in width/duration
   *     M - Modulated in position phase
   *     Q - Carrier is angle-modulated during the period of the pulse
   *     V - Combination of the foregoing or is produced by other means
   *   Combination
   *     W - Cases not covered above in which an emission consists of the main
   *         carrier being modulated, either simultaneously or in a preestablished
   *         sequence, in a combination of two or more of the following modes:*
   *         [amplitude, angle, pulse]
   *   Other
   *     X - Cases not otherwise covered
   *     - : Unknown (to be used only by legacy data)
   * <p>
   * Second Symbol - Designates the Nature of Signal(s) Modulating the Main Carrier
   *   0 - No modulating signal
   *   1 - A single channel containing quantised or digital information, not using
   *       a modulating subcarrier. (Excludes time-division multiplex)
   *   2 - A single channel containing quantised or digital information, using a
   *       modulating subcarrier
   *   3 - A single channel containing analogue information
   *   7 - Two or more channels containing quantised or digital information
   *   8 - Two or more channels containing analogue information
   *   9 - Composite system with one or more channels containing quantised or digital
   *       information, together with one or more channels containing analogue information
   *   X - Cases not otherwise covered
   *   - : Unknown (to be used only by legacy data)
   * <p>
   * Third Symbol - Type of Information to be Transmitted
   *   N - No information transmitted
   *   A - Telegraphy - for aural reception
   *   B - Telegraphy - for automatic reception
   *   C - Facsimile
   *   D - Data transmission, telemetry, telecommand
   *   E - Telephony (including sound broadcasting)
   *   F - Television (video)
   *   W - Combination of the above
   *   X - Cases not otherwise covered
   *   - : Unknown (to be used only by legacy data)
   * <p>
   *   In this context, the word "information" does not include information of a
   *   constant, unvarying, nature such as that provided by standard frequency
   *   emissions, continuous wave, pulse radars, etc.
   *
   *   A full explanation for the selection of the letter X shall be provided in
   *   Information unless the application is for a non-directional beacon in the bands
   *   190-435 and 510-535 kHz.
   * <p>
   * Fourth Symbol - Designates the Details of Signal(s)
   *   A - Two-condition code with elements of differing numbers and/or durations
   *   B - Two-condition code with elements of the same number and duration without
   *       error correction
   *   C - Two-condition code with elements of the same number and duration with
   *       error correction
   *   D - Four-condition code in which each condition represents a signal element
   *       of one or more bits
   *   E - Multi-condition code in which each condition represents a signal element
   *       of one or more bits
   *   F - Multi-condition code in which each condition or combination of conditions
   *       represents a character
   *   G - Sound of broadcasting quality (monophonic)
   *   H - Sound of broadcasting quality (stereophonic or quadraphonic)
   *   J - Sound of commercial quality (excluding categories defined for symbol K
   *       and L below)
   *   K - Sound of commercial quality with the use of frequency inversion or band
   *       splitting
   *   L - Sound of commercial quality with separate frequency modulated signals to
   *       control the level of demodulated signal
   *   M - Monochrome
   *   N - Color
   *   W - Combination of the above
   *   X - Cases not otherwise covered
   * <p>
   * Fifth Symbol - Designates the Nature of Multiplexing
   *   N - None
   *   C - Code-division multiplex (includes bandwidth expansion techniques)
   *   F - Frequency-division multiplex
   *   T - Time-division multiplex
   *   W - Combination of frequency-division multiplex and time-division multiplex
   *   X - Other types of multiplexing
   * </pre> Format is S5
   */
  @XmlValue
  @XmlJavaTypeAdapter(type = String.class, value = XmlAdapterStringS5.class)
  private String value;
  /**
   * US:explainInformationTypeX - Explain Information Type X (Optional)
   * <p>
   * A reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "explainInformationTypeX")
  private String explainInformationTypeX;
  /**
   * US:explainModulationTypeX - Explain Modulation Type X (Optional)
   * <p>
   * A reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "explainModulationTypeX")
  private String explainModulationTypeX;
  /**
   * US:explainNatureOfSignalX - Explain Nature Of Signal X (Optional)
   * <p>
   * A reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "explainNatureOfSignalX")
  private String explainNatureOfSignalX;

  /**
   * Get the Emission code.
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the Emission code.
   * <p>
   * @param value a {@link String} instance
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Get a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @return a {@link String} instance
   */
  public String getExplainInformationTypeX() {
    return explainInformationTypeX;
  }

  /**
   * Set a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value a {@link String} instance
   */
  public void setExplainInformationTypeX(String value) {
    this.explainInformationTypeX = value;
  }

  /**
   * Determine if the ExplainInformationTypeX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainInformationTypeX() {
    return (this.explainInformationTypeX != null);
  }

  /**
   * Get a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * @return a {@link String} instance
   */
  public String getExplainModulationTypeX() {
    return explainModulationTypeX;
  }

  /**
   * Set a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value a {@link String} instance
   */
  public void setExplainModulationTypeX(String value) {
    this.explainModulationTypeX = value;
  }

  /**
   * Determine if the ExplainModulationTypeX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainModulationTypeX() {
    return (this.explainModulationTypeX != null);
  }

  /**
   * Get a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @return a {@link String} instance
   */
  public String getExplainNatureOfSignalX() {
    return explainNatureOfSignalX;
  }

  /**
   * Set a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value a {@link String} instance
   */
  public void setExplainNatureOfSignalX(String value) {
    this.explainNatureOfSignalX = value;
  }

  /**
   * Determine if the ExplainNatureOfSignalX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainNatureOfSignalX() {
    return (this.explainNatureOfSignalX != null);
  }

  /**
   * Set the Emission code.
   * <p>
   * Format is S5.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withExplainInformationTypeX(String value) {
    setExplainInformationTypeX(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withExplainModulationTypeX(String value) {
    setExplainModulationTypeX(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current EmsClass object instance
   */
  public EmsClass withExplainNatureOfSignalX(String value) {
    setExplainNatureOfSignalX(value);
    return this;
  }

  /**
   * Get a string representation of this EmsClass instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "EmsClass {"
      + (availability != null ? " availability [" + availability + "]" : "")
      + (cls != null ? " cls [" + cls + "]" : "")
      + (explainInformationTypeX != null ? " explainInformationTypeX [" + explainInformationTypeX + "]" : "")
      + (explainModulationTypeX != null ? " explainModulationTypeX [" + explainModulationTypeX + "]" : "")
      + (explainNatureOfSignalX != null ? " explainNatureOfSignalX [" + explainNatureOfSignalX + "]" : "")
      + (extReferences != null ? " extReferences [" + extReferences + "]" : "")
      + (idref != null ? " idref [" + idref + "]" : "")
      + (legacyReleasability != null ? " legacyReleasability [" + legacyReleasability + "]" : "")
      + (quality != null ? " quality [" + quality + "]" : "")
      + (recommendedValue != null ? " recommendedValue [" + recommendedValue + "]" : "")
      + (remarkRef != null ? " remarkRef [" + remarkRef + "]" : "")
      + (value != null ? " value [" + value + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EmsClass} requires {@link ListCCL cls} and {@link String value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

}
