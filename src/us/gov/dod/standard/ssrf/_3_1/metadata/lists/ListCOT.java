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
import us.gov.dod.standard.ssrf._3_1.Transmitter;

/**
 * Enumerated values for fields using the ListCOT type.
 * <p>
 * Used in {@link Transmitter}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCOT")
@XmlEnum
public enum ListCOT {

  @XmlEnumValue("Amplitron")
  AMPLITRON("Amplitron"),
  @XmlEnumValue("Backward Wave Oscillator")
  BACKWARD_WAVE_OSCILLATOR("Backward Wave Oscillator"),
  @XmlEnumValue("Carcinatron")
  CARCINATRON("Carcinatron"),
  @XmlEnumValue("Cross Field Amplifier")
  CROSS_FIELD_AMPLIFIER("Cross Field Amplifier"),
  @XmlEnumValue("Diode")
  DIODE("Diode"),
  FET("FET"),
  @XmlEnumValue("FET Push-Pull")
  FET_PUSH_PULL("FET Push-Pull"),
  @XmlEnumValue("Fixed Magnetron")
  FIXED_MAGNETRON("Fixed Magnetron"),
  @XmlEnumValue("Gallium Arsinide FET")
  GALLIUM_ARSINIDE_FET("Gallium Arsinide FET"),
  @XmlEnumValue("Gunn Diode")
  GUNN_DIODE("Gunn Diode"),
  @XmlEnumValue("Gyrotron")
  GYROTRON("Gyrotron"),
  @XmlEnumValue("Impatt Diode")
  IMPATT_DIODE("Impatt Diode"),
  @XmlEnumValue("Integrated Circuit")
  INTEGRATED_CIRCUIT("Integrated Circuit"),
  @XmlEnumValue("Klystron")
  KLYSTRON("Klystron"),
  @XmlEnumValue("Lighthouse")
  LIGHTHOUSE("Lighthouse"),
  @XmlEnumValue("Magnetron")
  MAGNETRON("Magnetron"),
  @XmlEnumValue("Pentode")
  PENTODE("Pentode"),
  @XmlEnumValue("Reactance Tube")
  REACTANCE_TUBE("Reactance Tube"),
  @XmlEnumValue("Solid State")
  SOLID_STATE("Solid State"),
  @XmlEnumValue("Stabilotron")
  STABILOTRON("Stabilotron"),
  @XmlEnumValue("Step Recovery Diode")
  STEP_RECOVERY_DIODE("Step Recovery Diode"),
  @XmlEnumValue("Tetrode")
  TETRODE("Tetrode"),
  @XmlEnumValue("Transformer")
  TRANSFORMER("Transformer"),
  @XmlEnumValue("Transistor")
  TRANSISTOR("Transistor"),
  @XmlEnumValue("Traveling-Wave Tube")
  TRAVELING_WAVE_TUBE("Traveling-Wave Tube"),
  @XmlEnumValue("Triode")
  TRIODE("Triode"),
  @XmlEnumValue("Tunable Magnetron")
  TUNABLE_MAGNETRON("Tunable Magnetron"),
  @XmlEnumValue("Twystron")
  TWYSTRON("Twystron"),
  @XmlEnumValue("Voltage Controlled Oscillator")
  VOLTAGE_CONTROLLED_OSCILLATOR("Voltage Controlled Oscillator"),
  @XmlEnumValue("Yttrium Iron Garnet")
  YTTRIUM_IRON_GARNET("Yttrium Iron Garnet"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCOT(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCOT fromValue(String v) {
    for (ListCOT c : ListCOT.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
