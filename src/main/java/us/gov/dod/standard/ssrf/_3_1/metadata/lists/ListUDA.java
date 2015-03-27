/* 
 * Copyright 2014 Key Bridge LLC.
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
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListUDA type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUDA")
@XmlEnum
public enum ListUDA {

  @XmlEnumValue("FMSC/MRFL data from NATO")
  FMSC_MRFL_DATA_FROM_NATO("FMSC/MRFL data from NATO"),
  @XmlEnumValue("Industry Canada")
  INDUSTRY_CANADA("Industry Canada"),
  @XmlEnumValue("Federal Communications Commission")
  FEDERAL_COMMUNICATIONS_COMMISSION("Federal Communications Commission"),
  @XmlEnumValue("Frequency Resource Record System")
  FREQUENCY_RESOURCE_RECORD_SYSTEM("Frequency Resource Record System"),
  @XmlEnumValue("Government Master File")
  GOVERNMENT_MASTER_FILE("Government Master File"),
  @XmlEnumValue("International Telecommunication Union")
  INTERNATIONAL_TELECOMMUNICATION_UNION("International Telecommunication Union"),
  @XmlEnumValue("Radio Astronomy data from the National Research Council")
  RADIO_ASTRONOMY_DATA_FROM_THE_NATIONAL_RESEARCH_COUNCIL("Radio Astronomy data from the National Research Council"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUDA(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUDA fromValue(String v) {
    for (ListUDA c : ListUDA.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
