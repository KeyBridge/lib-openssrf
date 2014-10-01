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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.receiver.Baseband;
import us.gov.dod.standard.ssrf._3_1.receiver.RxModulation;
import us.gov.dod.standard.ssrf._3_1.transmitter.ObservedMOPAnalysis;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxModulation;

/**
 * Enumerated values for fields using the ListCMO type.
 * <p>
 * Used in
 * {@link Baseband}, {@link ObservedMOPAnalysis}, {@link RxModulation}, {@link TxModulation}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCMO")
@XmlEnum
public enum ListCMO {

  @XmlEnumValue("8-Tone")
  EIGHT__TONE("8-Tone"),
  @XmlEnumValue("16-Tone")
  TONE_16("16-Tone"),
  @XmlEnumValue("32-Tone")
  TONE_32("32-Tone"),
  @XmlEnumValue("AM Clear Voice")
  AM_CLEAR_VOICE("AM Clear Voice"),
  @XmlEnumValue("AM Secure Voice")
  AM_SECURE_VOICE("AM Secure Voice"),
  @XmlEnumValue("ASK/OOK")
  ASKOOK("ASK/OOK"),
  @XmlEnumValue("Audio FSK")
  AUDIO_FSK("Audio FSK"),
  @XmlEnumValue("Binary FSK")
  BINARY_FSK("Binary FSK"),
  @XmlEnumValue("Binary Phase Shift Key")
  BINARY_PHASE_SHIFT_KEY("Binary Phase Shift Key"),
  @XmlEnumValue("Code Division Multiplex")
  CODE_DIVISION_MULTIPLEX("Code Division Multiplex"),
  @XmlEnumValue("COFDM")
  COFDM("COFDM"),
  @XmlEnumValue("Coherent FSK")
  COHERENT_FSK("Coherent FSK"),
  @XmlEnumValue("Coherent MSK")
  COHERENT_MSK("Coherent MSK"),
  @XmlEnumValue("Coherent Quadrature PSK")
  COHERENT_QUADRATURE_PSK("Coherent Quadrature PSK"),
  @XmlEnumValue("Continuous Wave")
  CONTINUOUS_WAVE("Continuous Wave"),
  @XmlEnumValue("CPFSK")
  CPFSK("CPFSK"),
  @XmlEnumValue("Data")
  DATA("Data"),
  @XmlEnumValue("Differential Binary PSK")
  DIFFERENTIAL_BINARY_PSK("Differential Binary PSK"),
  @XmlEnumValue("Differential Gaussian MSK")
  DIFFERENTIAL_GAUSSIAN_MSK("Differential Gaussian MSK"),
  @XmlEnumValue("Differential PSK")
  DIFFERENTIAL_PSK("Differential PSK"),
  @XmlEnumValue("Differential Quadrature PSK")
  DIFFERENTIAL_QUADRATURE_PSK("Differential Quadrature PSK"),
  @XmlEnumValue("Differential Raised Cosine MSK")
  DIFFERENTIAL_RAISED_COSINE_MSK("Differential Raised Cosine MSK"),
  @XmlEnumValue("Direct Sequence Binary FSK")
  DIRECT_SEQUENCE_BINARY_FSK("Direct Sequence Binary FSK"),
  @XmlEnumValue("Direct Sequence Binary PSK")
  DIRECT_SEQUENCE_BINARY_PSK("Direct Sequence Binary PSK"),
  @XmlEnumValue("Direct Sequence Complementary Code Keying")
  DIRECT_SEQUENCE_COMPLEMENTARY_CODE_KEYING("Direct Sequence Complementary Code Keying"),
  @XmlEnumValue("Direct Sequence FSK")
  DIRECT_SEQUENCE_FSK("Direct Sequence FSK"),
  @XmlEnumValue("Direct Sequence MSK")
  DIRECT_SEQUENCE_MSK("Direct Sequence MSK"),
  @XmlEnumValue("Direct Sequence Offset Quadrature PSK")
  DIRECT_SEQUENCE_OFFSET_QUADRATURE_PSK("Direct Sequence Offset Quadrature PSK"),
  @XmlEnumValue("Direct Sequence PSK")
  DIRECT_SEQUENCE_PSK("Direct Sequence PSK"),
  @XmlEnumValue("Direct Sequence Quadrature PSK")
  DIRECT_SEQUENCE_QUADRATURE_PSK("Direct Sequence Quadrature PSK"),
  @XmlEnumValue("Doppler Frequency-Shift")
  DOPPLER_FREQUENCY_SHIFT("Doppler Frequency-Shift"),
  @XmlEnumValue("DTMF")
  DTMF("DTMF"),
  @XmlEnumValue("Electronic Attack")
  ELECTRONIC_ATTACK("Electronic Attack"),
  @XmlEnumValue("Feher QPSK-B")
  FEHER_QPSK_B("Feher QPSK-B"),
  @XmlEnumValue("Feher QPSK-JR")
  FEHER_QPSK_JR("Feher QPSK-JR"),
  @XmlEnumValue("FM Clear Voice")
  FM_CLEAR_VOICE("FM Clear Voice"),
  @XmlEnumValue("FM Secure Voice")
  FM_SECURE_VOICE("FM Secure Voice"),
  @XmlEnumValue("Frequency Division Multiplex")
  FREQUENCY_DIVISION_MULTIPLEX("Frequency Division Multiplex"),
  @XmlEnumValue("FSK")
  FSK("FSK"),
  @XmlEnumValue("Gaussian FSK")
  GAUSSIAN_FSK("Gaussian FSK"),
  @XmlEnumValue("Gaussian MSK")
  GAUSSIAN_MSK("Gaussian MSK"),
  @XmlEnumValue("Minimum Shift Keying")
  MINIMUM_SHIFT_KEYING("Minimum Shift Keying"),
  @XmlEnumValue("Multichannel")
  MULTICHANNEL("Multichannel"),
  @XmlEnumValue("Multichannel Data")
  MULTICHANNEL_DATA("Multichannel Data"),
  @XmlEnumValue("Multichannel PCM Voice")
  MULTICHANNEL_PCM_VOICE("Multichannel PCM Voice"),
  @XmlEnumValue("Multi-channel PCM Voice")
  MULTI_CHANNEL_PCM_VOICE("Multi-channel PCM Voice"),
  @XmlEnumValue("Multichannel Voice")
  MULTICHANNEL_VOICE("Multichannel Voice"),
  @XmlEnumValue("Multichannel Voice/Data")
  MULTICHANNEL_VOICEDATA("Multichannel Voice/Data"),
  @XmlEnumValue("Multi-index Continuous Phase Modulation")
  MULTI_INDEX_CONTINUOUS_PHASE_MODULATION("Multi-index Continuous Phase Modulation"),
  @XmlEnumValue("NOISE")
  NOISE("NOISE"),
  @XmlEnumValue("OFDM")
  OFDM("OFDM"),
  @XmlEnumValue("Offset Quadrature PSK")
  OFFSET_QUADRATURE_PSK("Offset Quadrature PSK"),
  @XmlEnumValue("PSK")
  PSK("PSK"),
  @XmlEnumValue("Pulsed")
  PULSED("Pulsed"),
  @XmlEnumValue("QAM")
  QAM("QAM"),
  @XmlEnumValue("Quad Tone")
  QUAD_TONE("Quad Tone"),
  @XmlEnumValue("Quadrature FSK")
  QUADRATURE_FSK("Quadrature FSK"),
  @XmlEnumValue("Quadrature Partial Response Signaling")
  QUADRATURE_PARTIAL_RESPONSE_SIGNALING("Quadrature Partial Response Signaling"),
  @XmlEnumValue("Quadrature PSK")
  QUADRATURE_PSK("Quadrature PSK"),
  @XmlEnumValue("Secure Data")
  SECURE_DATA("Secure Data"),
  @XmlEnumValue("Shaped Binary PSK")
  SHAPED_BINARY_PSK("Shaped Binary PSK"),
  @XmlEnumValue("Shaped FSK")
  SHAPED_FSK("Shaped FSK"),
  @XmlEnumValue("Shaped MSK")
  SHAPED_MSK("Shaped MSK"),
  @XmlEnumValue("Shaped Offset Quadrature PSK")
  SHAPED_OFFSET_QUADRATURE_PSK("Shaped Offset Quadrature PSK"),
  @XmlEnumValue("Single Channel")
  SINGLE_CHANNEL("Single Channel"),
  @XmlEnumValue("Single Secure Voice Channel")
  SINGLE_SECURE_VOICE_CHANNEL("Single Secure Voice Channel"),
  @XmlEnumValue("Single Voice Channel")
  SINGLE_VOICE_CHANNEL("Single Voice Channel"),
  @XmlEnumValue("Time Division Multiplex")
  TIME_DIVISION_MULTIPLEX("Time Division Multiplex"),
  @XmlEnumValue("Tuned Frequency Modulation")
  TUNED_FREQUENCY_MODULATION("Tuned Frequency Modulation"),
  @XmlEnumValue("Video")
  VIDEO("Video"),
  /**
   * If selected, a clarifying remark SHOULD be entered
   */
  @XmlEnumValue("Other")
  OTHER("Other");

  private final String value;

  ListCMO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCMO fromValue(String v) {
    for (ListCMO c : ListCMO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
