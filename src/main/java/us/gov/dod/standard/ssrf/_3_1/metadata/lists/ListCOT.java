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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
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
