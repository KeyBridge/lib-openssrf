/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0.enumerated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListUUF.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListUUF"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Regular, not limited to workweek"/> &lt;enumeration value="Regular,
 * workweek"/> &lt;enumeration value="Occasional, not limited to workweek"/>
 * &lt;enumeration value="Occasional, workweek"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUUF")
@XmlEnum
public enum ListUUF {

  @XmlEnumValue("Regular, not limited to workweek")
  REGULAR____NOT___LIMITED___TO___WORKWEEK("Regular, not limited to workweek"),
  @XmlEnumValue("Regular, workweek")
  REGULAR____WORKWEEK("Regular, workweek"),
  @XmlEnumValue("Occasional, not limited to workweek")
  OCCASIONAL____NOT___LIMITED___TO___WORKWEEK("Occasional, not limited to workweek"),
  @XmlEnumValue("Occasional, workweek")
  OCCASIONAL____WORKWEEK("Occasional, workweek");
  private final String value;

  ListUUF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUUF fromValue(String v) {
    for (ListUUF c : ListUUF.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
