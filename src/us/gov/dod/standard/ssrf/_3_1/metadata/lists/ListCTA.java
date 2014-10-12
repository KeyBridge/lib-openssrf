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
import us.gov.dod.standard.ssrf._3_1.toa.Footnote;

/**
 * Enumerated values for fields using the ListCTA type.
 * <p>
 * Used in {@link Footnote}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCTA")
@XmlEnum
public enum ListCTA {

  @XmlEnumValue("Band Application")
  BAND_APPLICATION("Band Application"),
  @XmlEnumValue("Band User")
  BAND_USER("Band User"),
  @XmlEnumValue("FCC Part")
  FCC_PART("FCC Part"),
  @XmlEnumValue("Footnote-ITU")
  FOOTNOTE_ITU("Footnote-ITU"),
  @XmlEnumValue("Footnote-National")
  FOOTNOTE_NATIONAL("Footnote-National"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCTA(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCTA fromValue(String v) {
    for (ListCTA c : ListCTA.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
