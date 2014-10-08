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
import us.gov.dod.standard.ssrf._3_1.receiver.RxMode;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxMode;

/**
 * Enumerated values for fields using the ListCTN type.
 * <p>
 * Used in {@link RxMode}, {@link TxMode}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCTN")
@XmlEnum
public enum ListCTN {

  @XmlEnumValue("Cavity")
  CAVITY("Cavity"),
  @XmlEnumValue("Cavity Mechanically Tuned")
  CAVITY_MECHANICALLY_TUNED("Cavity Mechanically Tuned"),
  @XmlEnumValue("Cavity Resonant")
  CAVITY_RESONANT("Cavity Resonant"),
  @XmlEnumValue("Cavity Tunable")
  CAVITY_TUNABLE("Cavity Tunable"),
  @XmlEnumValue("Continuous")
  CONTINUOUS("Continuous"),
  @XmlEnumValue("Continuous VCO")
  CONTINUOUS_VCO("Continuous VCO"),
  @XmlEnumValue("Crystal Controlled")
  CRYSTAL_CONTROLLED("Crystal Controlled"),
  @XmlEnumValue("Crystal Fixed")
  CRYSTAL_FIXED("Crystal Fixed"),
  @XmlEnumValue("Crystal Interchangeable")
  CRYSTAL_INTERCHANGEABLE("Crystal Interchangeable"),
  @XmlEnumValue("Crystal SAW")
  CRYSTAL_SAW("Crystal SAW"),
  @XmlEnumValue("Crystal Varactor/Phase lock")
  CRYSTAL_VARACTOR_PHASE_LOCK("Crystal Varactor/Phase lock"),
  @XmlEnumValue("Crystals Manually Switch")
  CRYSTALS_MANUALLY_SWITCH("Crystals Manually Switch"),
  @XmlEnumValue("Dielectric Resonant Oscillator")
  DIELECTRIC_RESONANT_OSCILLATOR("Dielectric Resonant Oscillator"),
  @XmlEnumValue("Electro Mechanical")
  ELECTRO_MECHANICAL("Electro Mechanical"),
  @XmlEnumValue("Factory Fixed Phase Locked Gunn")
  FACTORY_FIXED_PHASE_LOCKED_GUNN("Factory Fixed Phase Locked Gunn"),
  @XmlEnumValue("Factory Fixed PLL")
  FACTORY_FIXED_PLL("Factory Fixed PLL"),
  @XmlEnumValue("Factory Tuned")
  FACTORY_TUNED("Factory Tuned"),
  @XmlEnumValue("Fixed")
  FIXED("Fixed"),
  @XmlEnumValue("Gunn VCO")
  GUNN_VCO("Gunn VCO"),
  @XmlEnumValue("Klystron Mechanically Tuned")
  KLYSTRON_MECHANICALLY_TUNED("Klystron Mechanically Tuned"),
  @XmlEnumValue("Magnetron Fixed")
  MAGNETRON_FIXED("Magnetron Fixed"),
  @XmlEnumValue("Magnetron Tunable")
  MAGNETRON_TUNABLE("Magnetron Tunable"),
  @XmlEnumValue("Manual")
  MANUAL("Manual"),
  @XmlEnumValue("Oscillator Manually Adjustable Gunn")
  OSCILLATOR_MANUALLY_ADJUSTABLE_GUNN("Oscillator Manually Adjustable Gunn"),
  @XmlEnumValue("Oscillator Non-Adjustable Gunn Diode")
  OSCILLATOR_NON_ADJUSTABLE_GUNN_DIODE("Oscillator Non-Adjustable Gunn Diode"),
  @XmlEnumValue("Oscillator Tunable Cavity")
  OSCILLATOR_TUNABLE_CAVITY("Oscillator Tunable Cavity"),
  @XmlEnumValue("Oscillator Voltage Controlled")
  OSCILLATOR_VOLTAGE_CONTROLLED("Oscillator Voltage Controlled"),
  @XmlEnumValue("Oscillator Yig")
  OSCILLATOR_YIG("Oscillator Yig"),
  @XmlEnumValue("Phase-Locked Loop")
  PHASE_LOCKED_LOOP("Phase-Locked Loop"),
  @XmlEnumValue("SAW Resonator")
  SAW_RESONATOR("SAW Resonator"),
  @XmlEnumValue("Synthesizer")
  SYNTHESIZER("Synthesizer"),
  @XmlEnumValue("Synthesizer Crystal Controlled")
  SYNTHESIZER_CRYSTAL_CONTROLLED("Synthesizer Crystal Controlled"),
  @XmlEnumValue("Synthesizer Crystal Controlled PLL")
  SYNTHESIZER_CRYSTAL_CONTROLLED_PLL("Synthesizer Crystal Controlled PLL"),
  @XmlEnumValue("Synthesizer Digital")
  SYNTHESIZER_DIGITAL("Synthesizer Digital"),
  @XmlEnumValue("Synthesizer Direct Digital")
  SYNTHESIZER_DIRECT_DIGITAL("Synthesizer Direct Digital"),
  @XmlEnumValue("Synthesizer Manually Adjustable")
  SYNTHESIZER_MANUALLY_ADJUSTABLE("Synthesizer Manually Adjustable"),
  @XmlEnumValue("Synthesizer Microprocessor Controlled")
  SYNTHESIZER_MICROPROCESSOR_CONTROLLED("Synthesizer Microprocessor Controlled"),
  @XmlEnumValue("Synthesizer Non-Adjustable Crystal")
  SYNTHESIZER_NON_ADJUSTABLE_CRYSTAL("Synthesizer Non-Adjustable Crystal"),
  @XmlEnumValue("Synthesizer PLL")
  SYNTHESIZER_PLL("Synthesizer PLL"),
  @XmlEnumValue("Synthesizer Programmable Frequency")
  SYNTHESIZER_PROGRAMMABLE_FREQUENCY("Synthesizer Programmable Frequency"),
  @XmlEnumValue("Synthesizer VCO")
  SYNTHESIZER_VCO("Synthesizer VCO"),
  @XmlEnumValue("Tunable PLL")
  TUNABLE_PLL("Tunable PLL"),
  @XmlEnumValue("Varactor Tuned")
  VARACTOR_TUNED("Varactor Tuned"),
  @XmlEnumValue("Voltage Tuned Yig")
  VOLTAGE_TUNED_YIG("Voltage Tuned Yig"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCTN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCTN fromValue(String v) {
    for (ListCTN c : ListCTN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
