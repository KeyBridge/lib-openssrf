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
package us.gov.dod.standard.ssrf._3_0.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListCDD.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCDD"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S10"> &lt;enumeration
 * value="Dependant"/> &lt;enumeration value="Related"/> &lt;enumeration
 * value="Superseded"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCDD")
@XmlEnum
public enum ListCDD {

  /**
   * Dependant Dataset (e.g. in AsgnAllot or SSRequest, one system cannot
   * operate without the other)
   * <p>
   */
  @XmlEnumValue("Dependant")
  DEPENDANT("Dependant"),
  /**
   * Related Dataset (e.g. in AsgnAllot or SSRequest, each system may still
   * operate without the related system)
   * <p>
   */
  @XmlEnumValue("Related")
  RELATED("Related"),
  /**
   * Superseded Dataset
   * <p>
   */
  @XmlEnumValue("Superseded")
  SUPERSEDED("Superseded");
  private final String value;

  ListCDD(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCDD fromValue(String v) {
    for (ListCDD c : ListCDD.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
