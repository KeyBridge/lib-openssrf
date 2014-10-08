/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.assignment.AsgnAllotOwner;

/**
 * Enumerated values for fields using the ListUOW type.
 * <p>
 * Used in {@link AsgnAllotOwner}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUOW")
@XmlEnum
public enum ListUOW {

  @XmlEnumValue("Agency")
  AGENCY("Agency"),
  @XmlEnumValue("Unified Command")
  UNIFIED_COMMAND("Unified Command"),
  @XmlEnumValue("Unified Command Service")
  UNIFIED_COMMAND_SERVICE("Unified Command Service"),
  @XmlEnumValue("Bureau")
  BUREAU("Bureau"),
  @XmlEnumValue("Major Command")
  MAJOR_COMMAND("Major Command"),
  @XmlEnumValue("Subcommand")
  SUBCOMMAND("Subcommand"),
  @XmlEnumValue("Installation Frequency Manager")
  INSTALLATION_FREQUENCY_MANAGER("Installation Frequency Manager"),
  @XmlEnumValue("Operating Unit")
  OPERATING_UNIT("Operating Unit"),
  @XmlEnumValue("Area AFC/DoD AFC/Other Organizations")
  AREA_AFC_DO_D_AFC_OTHER_ORGANIZATIONS("Area AFC/DoD AFC/Other Organizations"),
  @XmlEnumValue("Requestor")
  REQUESTOR("Requestor"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUOW(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUOW fromValue(String v) {
    for (ListUOW c : ListUOW.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
