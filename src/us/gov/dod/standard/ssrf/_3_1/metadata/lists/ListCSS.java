/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import us.gov.dod.standard.ssrf._3_1.receiver.SpreadSpectrum;

/**
 * Enumerated values for fields using the ListCSS type.
 * <p>
 * Used in {@link SpreadSpectrum}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCSS")
@XmlEnum
public enum ListCSS {

  @XmlEnumValue("Automatic Channel Selection")
  AUTOMATIC_CHANNEL_SELECTION("Automatic Channel Selection"),
  @XmlEnumValue("Chirp")
  CHIRP("Chirp"),
  @XmlEnumValue("Direct sequence")
  DIRECT_SEQUENCE("Direct sequence"),
  @XmlEnumValue("Direct sequence + Frequency hopped")
  DIRECT_SEQUENCE___FREQUENCY_HOPPED("Direct sequence + Frequency hopped"),
  @XmlEnumValue("Direct sequence + Time hopped")
  DIRECT_SEQUENCE___TIME_HOPPED("Direct sequence + Time hopped"),
  @XmlEnumValue("Diversity")
  DIVERSITY("Diversity"),
  @XmlEnumValue("Free Channel Search")
  FREE_CHANNEL_SEARCH("Free Channel Search"),
  @XmlEnumValue("Frequency + Time hopped")
  FREQUENCY___TIME_HOPPED("Frequency + Time hopped"),
  @XmlEnumValue("Frequency hopped")
  FREQUENCY_HOPPED("Frequency hopped"),
  @XmlEnumValue("Time hopped")
  TIME_HOPPED("Time hopped"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCSS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSS fromValue(String v) {
    for (ListCSS c : ListCSS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
