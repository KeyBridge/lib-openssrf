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
import us.gov.dod.standard.ssrf._3_1.administrative.CodeList;

/**
 * Enumerated values for fields using the ListCAC type.
 * <p>
 * Used in {@link CodeList}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAC")
@XmlEnum
public enum ListCAC {

  @XmlEnumValue("Add Code")
  ADD_CODE("Add Code"),
  @XmlEnumValue("Add List")
  ADD_LIST("Add List"),
  @XmlEnumValue("Delete Code")
  DELETE_CODE("Delete Code"),
  @XmlEnumValue("Delete List")
  DELETE_LIST("Delete List");
  private final String value;

  ListCAC(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAC fromValue(String v) {
    for (ListCAC c : ListCAC.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
