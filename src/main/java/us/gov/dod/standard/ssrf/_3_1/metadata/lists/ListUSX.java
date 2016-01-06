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
import us.gov.dod.standard.ssrf._3_1.transmitter.ObservedMOPAnalysis;

/**
 * Enumerated values for fields using the ListUSX type.
 * <p>
 * Used in {@link ObservedMOPAnalysis}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUSX")
@XmlEnum
public enum ListUSX {

  @XmlEnumValue("Amplitude Modulation (AM)")
  AMPLITUDE_MODULATION_AM("Amplitude Modulation (AM)"),
  @XmlEnumValue("Continuous Wave (CW)")
  CONTINUOUS_WAVE_CW("Continuous Wave (CW)"),
  @XmlEnumValue("Frequency Modulation (FM)")
  FREQUENCY_MODULATION_FM("Frequency Modulation (FM)"),
  @XmlEnumValue("Phase Modulation (PM)")
  PHASE_MODULATION_PM("Phase Modulation (PM)");
  private final String value;

  ListUSX(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUSX fromValue(String v) {
    for (ListUSX c : ListUSX.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
