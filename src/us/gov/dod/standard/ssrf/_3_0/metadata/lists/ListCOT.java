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
 * Java class for ListCOT.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCOT"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Amplitron"/> &lt;enumeration value="Backward Wave Oscillator"/>
 * &lt;enumeration value="Carcinatron"/> &lt;enumeration value="Cross Field
 * Amplifier"/> &lt;enumeration value="Diode"/> &lt;enumeration value="FET"/>
 * &lt;enumeration value="FET Push-Pull"/> &lt;enumeration value="Fixed
 * Magnetron"/> &lt;enumeration value="Gallium Arsinide FET"/> &lt;enumeration
 * value="Gunn Diode"/> &lt;enumeration value="Gyrotron"/> &lt;enumeration
 * value="Impatt Diode"/> &lt;enumeration value="Integrated Circuit"/>
 * &lt;enumeration value="Klystron"/> &lt;enumeration value="Lighthouse"/>
 * &lt;enumeration value="Magnetron"/> &lt;enumeration value="Pentode"/>
 * &lt;enumeration value="Reactance Tube"/> &lt;enumeration value="Solid
 * State"/> &lt;enumeration value="Stabilotron"/> &lt;enumeration value="Step
 * Recovery Diode"/> &lt;enumeration value="Tetrode"/> &lt;enumeration
 * value="Transformer"/> &lt;enumeration value="Transistor"/> &lt;enumeration
 * value="Traveling-Wave Tube"/> &lt;enumeration value="Triode"/>
 * &lt;enumeration value="Tunable Magnetron"/> &lt;enumeration
 * value="Twystron"/> &lt;enumeration value="Voltage Controlled Oscillator"/>
 * &lt;enumeration value="Yttrium Iron Garnet"/> &lt;enumeration value="Other"/>
 * &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCOT")
@XmlEnum
public enum ListCOT {

  @XmlEnumValue("Amplitron")
  AMPLITRON("Amplitron"),
  @XmlEnumValue("Backward Wave Oscillator")
  BACKWARD___WAVE___OSCILLATOR("Backward Wave Oscillator"),
  @XmlEnumValue("Carcinatron")
  CARCINATRON("Carcinatron"),
  @XmlEnumValue("Cross Field Amplifier")
  CROSS___FIELD___AMPLIFIER("Cross Field Amplifier"),
  @XmlEnumValue("Diode")
  DIODE("Diode"),
  FET("FET"),
  @XmlEnumValue("FET Push-Pull")
  FET___PUSH___PULL("FET Push-Pull"),
  @XmlEnumValue("Fixed Magnetron")
  FIXED___MAGNETRON("Fixed Magnetron"),
  @XmlEnumValue("Gallium Arsinide FET")
  GALLIUM___ARSINIDE___FET("Gallium Arsinide FET"),
  @XmlEnumValue("Gunn Diode")
  GUNN___DIODE("Gunn Diode"),
  @XmlEnumValue("Gyrotron")
  GYROTRON("Gyrotron"),
  @XmlEnumValue("Impatt Diode")
  IMPATT___DIODE("Impatt Diode"),
  @XmlEnumValue("Integrated Circuit")
  INTEGRATED___CIRCUIT("Integrated Circuit"),
  @XmlEnumValue("Klystron")
  KLYSTRON("Klystron"),
  @XmlEnumValue("Lighthouse")
  LIGHTHOUSE("Lighthouse"),
  @XmlEnumValue("Magnetron")
  MAGNETRON("Magnetron"),
  @XmlEnumValue("Pentode")
  PENTODE("Pentode"),
  @XmlEnumValue("Reactance Tube")
  REACTANCE___TUBE("Reactance Tube"),
  @XmlEnumValue("Solid State")
  SOLID___STATE("Solid State"),
  @XmlEnumValue("Stabilotron")
  STABILOTRON("Stabilotron"),
  @XmlEnumValue("Step Recovery Diode")
  STEP___RECOVERY___DIODE("Step Recovery Diode"),
  @XmlEnumValue("Tetrode")
  TETRODE("Tetrode"),
  @XmlEnumValue("Transformer")
  TRANSFORMER("Transformer"),
  @XmlEnumValue("Transistor")
  TRANSISTOR("Transistor"),
  @XmlEnumValue("Traveling-Wave Tube")
  TRAVELING___WAVE___TUBE("Traveling-Wave Tube"),
  @XmlEnumValue("Triode")
  TRIODE("Triode"),
  @XmlEnumValue("Tunable Magnetron")
  TUNABLE___MAGNETRON("Tunable Magnetron"),
  @XmlEnumValue("Twystron")
  TWYSTRON("Twystron"),
  @XmlEnumValue("Voltage Controlled Oscillator")
  VOLTAGE___CONTROLLED___OSCILLATOR("Voltage Controlled Oscillator"),
  @XmlEnumValue("Yttrium Iron Garnet")
  YTTRIUM___IRON___GARNET("Yttrium Iron Garnet"),
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
