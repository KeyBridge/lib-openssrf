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
import us.gov.dod.standard.ssrf._3_1.Administrative;

/**
 * Enumerated values for fields using the ListCDR type.
 * <p>
 * Used in {@link Administrative}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCDR")
@XmlEnum
public enum ListCDR {

  @XmlEnumValue("Code List Change")
  CODE_LIST_CHANGE("Code List Change"),
  @XmlEnumValue("Data Invalid")
  DATA_INVALID("Data Invalid"),
  @XmlEnumValue("Data Not Supported")
  DATA_NOT_SUPPORTED("Data Not Supported"),
  @XmlEnumValue("Data Recall")
  DATA_RECALL("Data Recall"),
  @XmlEnumValue("Data Rejected")
  DATA_REJECTED("Data Rejected"),
  @XmlEnumValue("Data Deleted")
  DATA_DELETED("Data Deleted"),
  @XmlEnumValue("Missing Refs")
  MISSING_REFS("Missing Refs"),
  @XmlEnumValue("Data Retired")
  DATA_RETIRED("Data Retired");
  private final String value;

  ListCDR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCDR fromValue(String v) {
    for (ListCDR c : ListCDR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
