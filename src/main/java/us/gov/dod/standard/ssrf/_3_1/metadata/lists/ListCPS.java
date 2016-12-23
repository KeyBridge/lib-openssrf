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

import java.util.StringTokenizer;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.multiple.ConfigFreq;
import us.gov.dod.standard.ssrf._3_1.toa.Allocation;
import us.gov.dod.standard.ssrf._3_1.toa.Variance;

/**
 * Enumerated values for fields using the ListCPS type.
 * <p>
 * This is an Allocated Service PRIMARY/SECONDARY use type identifier.
 * <p>
 * Used in {@link Allocation}, {@link ConfigFreq}, {@link Variance}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 04/02/2015
 */
@XmlType(name = "ListCPS")
@XmlEnum
public enum ListCPS {

  @XmlEnumValue("Primary")
  PRIMARY("Primary"),
  @XmlEnumValue("Secondary")
  SECONDARY("Secondary"),
  @XmlEnumValue("Permitted")
  PERMITTED("Permitted"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCPS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCPS fromValue(String v) {
    for (ListCPS c : ListCPS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  /**
   * Get a priority by analyzing the allocated service line. This method only
   * examines the service case.
   * <p>
   * @param allocatedService an allocated service name.
   * @return whether the allocated service name is primary or secondary
   */
  public static ListCPS fromName(String allocatedService) {
    /**
     * If the service name contains "except" then only parse the left portion of
     * the string.
     */
    if (allocatedService.contains("except")) {
      return fromName(allocatedService.split("except")[0]);
    }
    /**
     * Tokenize the service on parentheses and analyze each entry. If a service
     * type is found then analyze the name to look for upper/lower case
     * characters.
     */
    StringTokenizer st = new StringTokenizer(allocatedService, "[()]", false);
    while (st.hasMoreTokens()) {
      String token = st.nextToken();
      try {
        if (ListCSN.fromValue(token) != null) {
          return token.trim().matches("[A-Z\\W\\s&&[^a-z]]+") ? ListCPS.PRIMARY : ListCPS.SECONDARY;
        }
      } catch (Exception e) {
      }
    }
    throw new IllegalArgumentException(allocatedService);
  }

}
