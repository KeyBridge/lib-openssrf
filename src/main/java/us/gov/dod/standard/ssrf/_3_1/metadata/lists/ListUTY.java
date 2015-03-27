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
 * Enumerated values for fields using the ListUTY type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUTY")
@XmlEnum
public enum ListUTY {

  @XmlEnumValue("Simplex")
  SIMPLEX("Simplex"),
  @XmlEnumValue("Duplex")
  DUPLEX("Duplex"),
  @XmlEnumValue("Semiduplex")
  SEMIDUPLEX("Semiduplex"),
  @XmlEnumValue("Simplex Net")
  SIMPLEX_NET("Simplex Net"),
  @XmlEnumValue("One Directional Transmission")
  ONE_DIRECTIONAL_TRANSMISSION("One Directional Transmission"),
  @XmlEnumValue("Broadcast")
  BROADCAST("Broadcast"),
  @XmlEnumValue("Simultaneous Broadcast")
  SIMULTANEOUS_BROADCAST("Simultaneous Broadcast"),
  @XmlEnumValue("Radionavigation")
  RADIONAVIGATION("Radionavigation"),
  @XmlEnumValue("Radiolocation")
  RADIOLOCATION("Radiolocation"),
  @XmlEnumValue("Reception Only")
  RECEPTION_ONLY("Reception Only"),
  @XmlEnumValue("Radio Determination")
  RADIO_DETERMINATION("Radio Determination"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUTY(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUTY fromValue(String v) {
    for (ListUTY c : ListUTY.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
