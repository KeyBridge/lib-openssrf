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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ListCTN.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCTN"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Cavity"/> &lt;enumeration value="Cavity Mechanically Tuned"/>
 * &lt;enumeration value="Cavity Resonant"/> &lt;enumeration value="Cavity
 * Tunable"/> &lt;enumeration value="Continuous"/> &lt;enumeration
 * value="Continuous VCO"/> &lt;enumeration value="Crystal Controlled"/>
 * &lt;enumeration value="Crystal Fixed"/> &lt;enumeration value="Crystal
 * Interchangeable"/> &lt;enumeration value="Crystal SAW"/> &lt;enumeration
 * value="Crystal Varactor/Phase lock"/> &lt;enumeration value="Crystals
 * Manually Switch"/> &lt;enumeration value="Dielectric Resonant Oscillator"/>
 * &lt;enumeration value="Electro Mechanical"/> &lt;enumeration value="Factory
 * Fixed Phase Locked Gunn"/> &lt;enumeration value="Factory Fixed PLL"/>
 * &lt;enumeration value="Factory Tuned"/> &lt;enumeration value="Fixed"/>
 * &lt;enumeration value="Gunn VCO"/> &lt;enumeration value="Klystron
 * Mechanically Tuned"/> &lt;enumeration value="Magnetron Fixed"/>
 * &lt;enumeration value="Magnetron Tunable"/> &lt;enumeration value="Manual"/>
 * &lt;enumeration value="Oscillator Manually Adjustable Gunn"/> &lt;enumeration
 * value="Oscillator Non-Adjustable Gunn Diode"/> &lt;enumeration
 * value="Oscillator Tunable Cavity"/> &lt;enumeration value="Oscillator Voltage
 * Controlled"/> &lt;enumeration value="Oscillator Yig"/> &lt;enumeration
 * value="Phase-Locked Loop"/> &lt;enumeration value="SAW Resonator"/>
 * &lt;enumeration value="Synthesizer"/> &lt;enumeration value="Synthesizer
 * Crystal Controlled"/> &lt;enumeration value="Synthesizer Crystal Controlled
 * PLL"/> &lt;enumeration value="Synthesizer Digital"/> &lt;enumeration
 * value="Synthesizer Direct Digital"/> &lt;enumeration value="Synthesizer
 * Manually Adjustable"/> &lt;enumeration value="Synthesizer Microprocessor
 * Controlled"/> &lt;enumeration value="Synthesizer Non-Adjustable Crystal"/>
 * &lt;enumeration value="Synthesizer PLL"/> &lt;enumeration value="Synthesizer
 * Programmable Frequency"/> &lt;enumeration value="Synthesizer VCO"/>
 * &lt;enumeration value="Tunable PLL"/> &lt;enumeration value="Varactor
 * Tuned"/> &lt;enumeration value="Voltage Tuned Yig"/> &lt;enumeration
 * value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCTN")
@XmlEnum
public enum ListCTN {

  @XmlEnumValue("Cavity")
  CAVITY("Cavity"),
  @XmlEnumValue("Cavity Mechanically Tuned")
  CAVITY___MECHANICALLY___TUNED("Cavity Mechanically Tuned"),
  @XmlEnumValue("Cavity Resonant")
  CAVITY___RESONANT("Cavity Resonant"),
  @XmlEnumValue("Cavity Tunable")
  CAVITY___TUNABLE("Cavity Tunable"),
  @XmlEnumValue("Continuous")
  CONTINUOUS("Continuous"),
  @XmlEnumValue("Continuous VCO")
  CONTINUOUS___VCO("Continuous VCO"),
  @XmlEnumValue("Crystal Controlled")
  CRYSTAL___CONTROLLED("Crystal Controlled"),
  @XmlEnumValue("Crystal Fixed")
  CRYSTAL___FIXED("Crystal Fixed"),
  @XmlEnumValue("Crystal Interchangeable")
  CRYSTAL___INTERCHANGEABLE("Crystal Interchangeable"),
  @XmlEnumValue("Crystal SAW")
  CRYSTAL___SAW("Crystal SAW"),
  @XmlEnumValue("Crystal Varactor/Phase lock")
  CRYSTAL___VARACTOR___PHASE___LOCK("Crystal Varactor/Phase lock"),
  @XmlEnumValue("Crystals Manually Switch")
  CRYSTALS___MANUALLY___SWITCH("Crystals Manually Switch"),
  @XmlEnumValue("Dielectric Resonant Oscillator")
  DIELECTRIC___RESONANT___OSCILLATOR("Dielectric Resonant Oscillator"),
  @XmlEnumValue("Electro Mechanical")
  ELECTRO___MECHANICAL("Electro Mechanical"),
  @XmlEnumValue("Factory Fixed Phase Locked Gunn")
  FACTORY___FIXED___PHASE___LOCKED___GUNN("Factory Fixed Phase Locked Gunn"),
  @XmlEnumValue("Factory Fixed PLL")
  FACTORY___FIXED___PLL("Factory Fixed PLL"),
  @XmlEnumValue("Factory Tuned")
  FACTORY___TUNED("Factory Tuned"),
  @XmlEnumValue("Fixed")
  FIXED("Fixed"),
  @XmlEnumValue("Gunn VCO")
  GUNN___VCO("Gunn VCO"),
  @XmlEnumValue("Klystron Mechanically Tuned")
  KLYSTRON___MECHANICALLY___TUNED("Klystron Mechanically Tuned"),
  @XmlEnumValue("Magnetron Fixed")
  MAGNETRON___FIXED("Magnetron Fixed"),
  @XmlEnumValue("Magnetron Tunable")
  MAGNETRON___TUNABLE("Magnetron Tunable"),
  @XmlEnumValue("Manual")
  MANUAL("Manual"),
  @XmlEnumValue("Oscillator Manually Adjustable Gunn")
  OSCILLATOR___MANUALLY___ADJUSTABLE___GUNN("Oscillator Manually Adjustable Gunn"),
  @XmlEnumValue("Oscillator Non-Adjustable Gunn Diode")
  OSCILLATOR___NON___ADJUSTABLE___GUNN___DIODE("Oscillator Non-Adjustable Gunn Diode"),
  @XmlEnumValue("Oscillator Tunable Cavity")
  OSCILLATOR___TUNABLE___CAVITY("Oscillator Tunable Cavity"),
  @XmlEnumValue("Oscillator Voltage Controlled")
  OSCILLATOR___VOLTAGE___CONTROLLED("Oscillator Voltage Controlled"),
  @XmlEnumValue("Oscillator Yig")
  OSCILLATOR___YIG("Oscillator Yig"),
  @XmlEnumValue("Phase-Locked Loop")
  PHASE___LOCKED___LOOP("Phase-Locked Loop"),
  @XmlEnumValue("SAW Resonator")
  SAW___RESONATOR("SAW Resonator"),
  @XmlEnumValue("Synthesizer")
  SYNTHESIZER("Synthesizer"),
  @XmlEnumValue("Synthesizer Crystal Controlled")
  SYNTHESIZER___CRYSTAL___CONTROLLED("Synthesizer Crystal Controlled"),
  @XmlEnumValue("Synthesizer Crystal Controlled PLL")
  SYNTHESIZER___CRYSTAL___CONTROLLED___PLL("Synthesizer Crystal Controlled PLL"),
  @XmlEnumValue("Synthesizer Digital")
  SYNTHESIZER___DIGITAL("Synthesizer Digital"),
  @XmlEnumValue("Synthesizer Direct Digital")
  SYNTHESIZER___DIRECT___DIGITAL("Synthesizer Direct Digital"),
  @XmlEnumValue("Synthesizer Manually Adjustable")
  SYNTHESIZER___MANUALLY___ADJUSTABLE("Synthesizer Manually Adjustable"),
  @XmlEnumValue("Synthesizer Microprocessor Controlled")
  SYNTHESIZER___MICROPROCESSOR___CONTROLLED("Synthesizer Microprocessor Controlled"),
  @XmlEnumValue("Synthesizer Non-Adjustable Crystal")
  SYNTHESIZER___NON___ADJUSTABLE___CRYSTAL("Synthesizer Non-Adjustable Crystal"),
  @XmlEnumValue("Synthesizer PLL")
  SYNTHESIZER___PLL("Synthesizer PLL"),
  @XmlEnumValue("Synthesizer Programmable Frequency")
  SYNTHESIZER___PROGRAMMABLE___FREQUENCY("Synthesizer Programmable Frequency"),
  @XmlEnumValue("Synthesizer VCO")
  SYNTHESIZER___VCO("Synthesizer VCO"),
  @XmlEnumValue("Tunable PLL")
  TUNABLE___PLL("Tunable PLL"),
  @XmlEnumValue("Varactor Tuned")
  VARACTOR___TUNED("Varactor Tuned"),
  @XmlEnumValue("Voltage Tuned Yig")
  VOLTAGE___TUNED___YIG("Voltage Tuned Yig"),
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
