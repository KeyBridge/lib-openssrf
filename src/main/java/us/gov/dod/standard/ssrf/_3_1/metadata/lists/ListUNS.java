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

/**
 * Enumerated values for fields using the ListUNS type.
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListUNS")
@XmlEnum
public enum ListUNS {

  @XmlEnumValue("Agency Tracking ID")
  AGENCY_TRACKING_ID("Agency Tracking ID"),
  @XmlEnumValue("Commercial P/N")
  COMMERCIAL_P_N("Commercial P/N"),
  @XmlEnumValue("Drawing Number")
  DRAWING_NUMBER("Drawing Number"),
  @XmlEnumValue("Line Item Number")
  LINE_ITEM_NUMBER("Line Item Number"),
  @XmlEnumValue("National Stock Number")
  NATIONAL_STOCK_NUMBER("National Stock Number"),
  @XmlEnumValue("NATO  Stock Number")
  NATO_STOCK_NUMBER("NATO  Stock Number"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUNS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUNS fromValue(String v) {
    for (ListUNS c : ListUNS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
