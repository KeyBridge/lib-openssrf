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
import us.gov.dod.standard.ssrf._3_1.FEDeployment;

/**
 * Enumerated values for fields using the ListCFD type.
 * <p>
 * Used in {@link FEDeployment}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCFD")
@XmlEnum
public enum ListCFD {

  @XmlEnumValue("Location-Home")
  LOCATION_HOME("Location-Home"),
  @XmlEnumValue("Location-Current")
  LOCATION_CURRENT("Location-Current"),
  @XmlEnumValue("Location-Planned")
  LOCATION_PLANNED("Location-Planned"),
  @XmlEnumValue("Operating Area-Current")
  OPERATING_AREA_CURRENT("Operating Area-Current"),
  @XmlEnumValue("Operating Area-Planned")
  OPERATING_AREA_PLANNED("Operating Area-Planned"),
  @XmlEnumValue("Route-Current")
  ROUTE_CURRENT("Route-Current"),
  @XmlEnumValue("Route-Planned")
  ROUTE_PLANNED("Route-Planned"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCFD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCFD fromValue(String v) {
    for (ListCFD c : ListCFD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
