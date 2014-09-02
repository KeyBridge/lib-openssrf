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
package us.gov.dod.standard.ssrf._3_0.enumerated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCMO.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCMO"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration value="AM
 * Clear Voice"/> &lt;enumeration value="AM Secure Voice"/> &lt;enumeration
 * value="ASK/OOK"/> &lt;enumeration value="Audio FSK"/> &lt;enumeration
 * value="Binary Phase Shift Key"/> &lt;enumeration value="Code Division
 * Multiplex"/> &lt;enumeration value="COFDM"/> &lt;enumeration value="CPFSK"/>
 * &lt;enumeration value="Data"/> &lt;enumeration value="Differential PSK"/>
 * &lt;enumeration value="Doppler Frequency-Shift"/> &lt;enumeration value="FM
 * Clear Voice"/> &lt;enumeration value="FM Secure Voice"/> &lt;enumeration
 * value="Frequency Division Multiplex"/> &lt;enumeration value="FSK"/>
 * &lt;enumeration value="Gaussian MSK"/> &lt;enumeration value="Minimum Shift
 * Keying"/> &lt;enumeration value="Multichannel "/> &lt;enumeration
 * value="Multichannel Data"/> &lt;enumeration value="Multichannel PCM Voice"/>
 * &lt;enumeration value="Multi-channel PCM Voice"/> &lt;enumeration
 * value="Multichannel Voice"/> &lt;enumeration value="Multichannel
 * Voice/Data"/> &lt;enumeration value="NOISE"/> &lt;enumeration value="OFDM"/>
 * &lt;enumeration value="PSK"/> &lt;enumeration value="QAM"/> &lt;enumeration
 * value="Quadrature Partial Response Signaling"/> &lt;enumeration
 * value="Quadrature PSK"/> &lt;enumeration value="Secure Data"/>
 * &lt;enumeration value="Single Channel"/> &lt;enumeration value="Single Secure
 * Voice Channel"/> &lt;enumeration value="Single Voice Channel"/>
 * &lt;enumeration value="Time Division Multiplex"/> &lt;enumeration
 * value="Tuned Frequency Modulation"/> &lt;enumeration value="Video"/>
 * &lt;enumeration value="Binary FSK"/> &lt;enumeration value="Coherent FSK"/>
 * &lt;enumeration value="Coherent MSK"/> &lt;enumeration value="Coherent
 * Quadrature PSK"/> &lt;enumeration value="Differential Binary PSK"/>
 * &lt;enumeration value="Differential Gaussian MSK"/> &lt;enumeration
 * value="Differential Quadrature PSK"/> &lt;enumeration value="Differential
 * Raised Cosine MSK"/> &lt;enumeration value="Direct Sequence Binary FSK"/>
 * &lt;enumeration value="Direct Sequence Binary PSK"/> &lt;enumeration
 * value="Direct Sequence Complementary Code Keying"/> &lt;enumeration
 * value="Direct Sequence FSK"/> &lt;enumeration value="Direct Sequence MSK"/>
 * &lt;enumeration value="Direct Sequence Offset Quadrature PSK"/>
 * &lt;enumeration value="Direct Sequence PSK"/> &lt;enumeration value="Direct
 * Sequence Quadrature PSK"/> &lt;enumeration value="Feher QPSK-B"/>
 * &lt;enumeration value="Feher QPSK-JR"/> &lt;enumeration value="Gaussian
 * FSK"/> &lt;enumeration value="Multi-index Continuous Phase Modulation"/>
 * &lt;enumeration value="Offset Quadrature PSK"/> &lt;enumeration
 * value="Quadrature FSK"/> &lt;enumeration value="Shaped Binary PSK"/>
 * &lt;enumeration value="Shaped FSK"/> &lt;enumeration value="Shaped MSK"/>
 * &lt;enumeration value="Shaped Offset Quadrature PSK"/> &lt;enumeration
 * value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCMO")
@XmlEnum
public enum ListCMO {

  @XmlEnumValue("AM Clear Voice")
  AM___CLEAR___VOICE("AM Clear Voice"),
  @XmlEnumValue("AM Secure Voice")
  AM___SECURE___VOICE("AM Secure Voice"),
  @XmlEnumValue("ASK/OOK")
  ASK___OOK("ASK/OOK"),
  @XmlEnumValue("Audio FSK")
  AUDIO___FSK("Audio FSK"),
  @XmlEnumValue("Binary Phase Shift Key")
  BINARY___PHASE___SHIFT___KEY("Binary Phase Shift Key"),
  @XmlEnumValue("Code Division Multiplex")
  CODE___DIVISION___MULTIPLEX("Code Division Multiplex"),
  COFDM("COFDM"),
  CPFSK("CPFSK"),
  @XmlEnumValue("Data")
  DATA("Data"),
  @XmlEnumValue("Differential PSK")
  DIFFERENTIAL___PSK("Differential PSK"),
  @XmlEnumValue("Doppler Frequency-Shift")
  DOPPLER___FREQUENCY___SHIFT("Doppler Frequency-Shift"),
  @XmlEnumValue("FM Clear Voice")
  FM___CLEAR___VOICE("FM Clear Voice"),
  @XmlEnumValue("FM Secure Voice")
  FM___SECURE___VOICE("FM Secure Voice"),
  @XmlEnumValue("Frequency Division Multiplex")
  FREQUENCY___DIVISION___MULTIPLEX("Frequency Division Multiplex"),
  FSK("FSK"),
  @XmlEnumValue("Gaussian MSK")
  GAUSSIAN___MSK("Gaussian MSK"),
  @XmlEnumValue("Minimum Shift Keying")
  MINIMUM___SHIFT___KEYING("Minimum Shift Keying"),
  @XmlEnumValue("Multichannel ")
  MULTICHANNEL__("Multichannel "),
  @XmlEnumValue("Multichannel Data")
  MULTICHANNEL___DATA("Multichannel Data"),
  @XmlEnumValue("Multichannel PCM Voice")
  MULTICHANNEL___PCM___VOICE("Multichannel PCM Voice"),
  @XmlEnumValue("Multi-channel PCM Voice")
  MULTI___CHANNEL___PCM___VOICE("Multi-channel PCM Voice"),
  @XmlEnumValue("Multichannel Voice")
  MULTICHANNEL___VOICE("Multichannel Voice"),
  @XmlEnumValue("Multichannel Voice/Data")
  MULTICHANNEL___VOICE___DATA("Multichannel Voice/Data"),
  NOISE("NOISE"),
  OFDM("OFDM"),
  PSK("PSK"),
  QAM("QAM"),
  @XmlEnumValue("Quadrature Partial Response Signaling")
  QUADRATURE___PARTIAL___RESPONSE___SIGNALING("Quadrature Partial Response Signaling"),
  @XmlEnumValue("Quadrature PSK")
  QUADRATURE___PSK("Quadrature PSK"),
  @XmlEnumValue("Secure Data")
  SECURE___DATA("Secure Data"),
  @XmlEnumValue("Single Channel")
  SINGLE___CHANNEL("Single Channel"),
  @XmlEnumValue("Single Secure Voice Channel")
  SINGLE___SECURE___VOICE___CHANNEL("Single Secure Voice Channel"),
  @XmlEnumValue("Single Voice Channel")
  SINGLE___VOICE___CHANNEL("Single Voice Channel"),
  @XmlEnumValue("Time Division Multiplex")
  TIME___DIVISION___MULTIPLEX("Time Division Multiplex"),
  @XmlEnumValue("Tuned Frequency Modulation")
  TUNED___FREQUENCY___MODULATION("Tuned Frequency Modulation"),
  @XmlEnumValue("Video")
  VIDEO("Video"),
  @XmlEnumValue("Binary FSK")
  BINARY___FSK("Binary FSK"),
  @XmlEnumValue("Coherent FSK")
  COHERENT___FSK("Coherent FSK"),
  @XmlEnumValue("Coherent MSK")
  COHERENT___MSK("Coherent MSK"),
  @XmlEnumValue("Coherent Quadrature PSK")
  COHERENT___QUADRATURE___PSK("Coherent Quadrature PSK"),
  @XmlEnumValue("Differential Binary PSK")
  DIFFERENTIAL___BINARY___PSK("Differential Binary PSK"),
  @XmlEnumValue("Differential Gaussian MSK")
  DIFFERENTIAL___GAUSSIAN___MSK("Differential Gaussian MSK"),
  @XmlEnumValue("Differential Quadrature PSK")
  DIFFERENTIAL___QUADRATURE___PSK("Differential Quadrature PSK"),
  @XmlEnumValue("Differential Raised Cosine MSK")
  DIFFERENTIAL___RAISED___COSINE___MSK("Differential Raised Cosine MSK"),
  @XmlEnumValue("Direct Sequence Binary FSK")
  DIRECT___SEQUENCE___BINARY___FSK("Direct Sequence Binary FSK"),
  @XmlEnumValue("Direct Sequence Binary PSK")
  DIRECT___SEQUENCE___BINARY___PSK("Direct Sequence Binary PSK"),
  @XmlEnumValue("Direct Sequence Complementary Code Keying")
  DIRECT___SEQUENCE___COMPLEMENTARY___CODE___KEYING("Direct Sequence Complementary Code Keying"),
  @XmlEnumValue("Direct Sequence FSK")
  DIRECT___SEQUENCE___FSK("Direct Sequence FSK"),
  @XmlEnumValue("Direct Sequence MSK")
  DIRECT___SEQUENCE___MSK("Direct Sequence MSK"),
  @XmlEnumValue("Direct Sequence Offset Quadrature PSK")
  DIRECT___SEQUENCE___OFFSET___QUADRATURE___PSK("Direct Sequence Offset Quadrature PSK"),
  @XmlEnumValue("Direct Sequence PSK")
  DIRECT___SEQUENCE___PSK("Direct Sequence PSK"),
  @XmlEnumValue("Direct Sequence Quadrature PSK")
  DIRECT___SEQUENCE___QUADRATURE___PSK("Direct Sequence Quadrature PSK"),
  @XmlEnumValue("Feher QPSK-B")
  FEHER___QPSK___B("Feher QPSK-B"),
  @XmlEnumValue("Feher QPSK-JR")
  FEHER___QPSK___JR("Feher QPSK-JR"),
  @XmlEnumValue("Gaussian FSK")
  GAUSSIAN___FSK("Gaussian FSK"),
  @XmlEnumValue("Multi-index Continuous Phase Modulation")
  MULTI___INDEX___CONTINUOUS___PHASE___MODULATION("Multi-index Continuous Phase Modulation"),
  @XmlEnumValue("Offset Quadrature PSK")
  OFFSET___QUADRATURE___PSK("Offset Quadrature PSK"),
  @XmlEnumValue("Quadrature FSK")
  QUADRATURE___FSK("Quadrature FSK"),
  @XmlEnumValue("Shaped Binary PSK")
  SHAPED___BINARY___PSK("Shaped Binary PSK"),
  @XmlEnumValue("Shaped FSK")
  SHAPED___FSK("Shaped FSK"),
  @XmlEnumValue("Shaped MSK")
  SHAPED___MSK("Shaped MSK"),
  @XmlEnumValue("Shaped Offset Quadrature PSK")
  SHAPED___OFFSET___QUADRATURE___PSK("Shaped Offset Quadrature PSK"),
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
