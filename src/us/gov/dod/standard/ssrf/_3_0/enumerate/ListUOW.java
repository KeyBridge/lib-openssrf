/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.enumerate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListUOW.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListUOW"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Agency"/> &lt;enumeration value="Unified Command"/> &lt;enumeration
 * value="Unified Command Service"/> &lt;enumeration value="Bureau"/>
 * &lt;enumeration value="Major Command"/> &lt;enumeration value="Subcommand"/>
 * &lt;enumeration value="Installation Frequency Manager"/> &lt;enumeration
 * value="Operating Unit"/> &lt;enumeration value="Area AFC/DoD AFC/Other
 * Organizations"/> &lt;enumeration value="Requestor"/> &lt;enumeration
 * value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUOW")
@XmlEnum
public enum ListUOW {

  @XmlEnumValue("Agency")
  AGENCY("Agency"),
  @XmlEnumValue("Unified Command")
  UNIFIED___COMMAND("Unified Command"),
  @XmlEnumValue("Unified Command Service")
  UNIFIED___COMMAND___SERVICE("Unified Command Service"),
  @XmlEnumValue("Bureau")
  BUREAU("Bureau"),
  @XmlEnumValue("Major Command")
  MAJOR___COMMAND("Major Command"),
  @XmlEnumValue("Subcommand")
  SUBCOMMAND("Subcommand"),
  @XmlEnumValue("Installation Frequency Manager")
  INSTALLATION___FREQUENCY___MANAGER("Installation Frequency Manager"),
  @XmlEnumValue("Operating Unit")
  OPERATING___UNIT("Operating Unit"),
  @XmlEnumValue("Area AFC/DoD AFC/Other Organizations")
  AREA___AFC___DO_D___AFC___OTHER___ORGANIZATIONS("Area AFC/DoD AFC/Other Organizations"),
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
