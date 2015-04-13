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
import us.gov.dod.standard.ssrf._3_1.receiver.RxModulation;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxModulation;

/**
 * Enumerated values for fields using the ListCDF type.
 * <p>
 * Used in {@link RxModulation}, {@link TxModulation}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCDF")
@XmlEnum
public enum ListCDF {

  @XmlEnumValue("Bi-Phase-Level")
  BI_PHASE_LEVEL("Bi-Phase-Level"),
  @XmlEnumValue("Bi-Phase-Mark")
  BI_PHASE_MARK("Bi-Phase-Mark"),
  @XmlEnumValue("Bi-Phase-Space")
  BI_PHASE_SPACE("Bi-Phase-Space"),
  @XmlEnumValue("Differential Bi-Phase-Level")
  DIFFERENTIAL_BI_PHASE_LEVEL("Differential Bi-Phase-Level"),
  @XmlEnumValue("Differential Bi-Phase-Mark")
  DIFFERENTIAL_BI_PHASE_MARK("Differential Bi-Phase-Mark"),
  @XmlEnumValue("Differential Bi-Phase-Space")
  DIFFERENTIAL_BI_PHASE_SPACE("Differential Bi-Phase-Space"),
  NRZ("NRZ"),
  @XmlEnumValue("NRZ-Mark")
  NRZ_MARK("NRZ-Mark"),
  @XmlEnumValue("NRZ-Space")
  NRZ_SPACE("NRZ-Space"),
  @XmlEnumValue("Return to Zero")
  RETURN_TO_ZERO("Return to Zero"),
  @XmlEnumValue("Split Phase (Manchester)")
  SPLIT_PHASE_MANCHESTER("Split Phase (Manchester)"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCDF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCDF fromValue(String v) {
    for (ListCDF c : ListCDF.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
