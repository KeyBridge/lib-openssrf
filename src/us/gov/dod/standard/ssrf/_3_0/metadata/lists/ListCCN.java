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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ListCCN.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListCCN"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration value="MC"/>
 * &lt;enumeration value="Micro-coaxial"/> &lt;enumeration
 * value="Micro-miniature coaxial"/> &lt;enumeration value="MMX"/>
 * &lt;enumeration value="Neill-Concelman Bayonet"/> &lt;enumeration
 * value="Neill-Concelman Threaded"/> &lt;enumeration value="Sub-Miniature
 * version A"/> &lt;enumeration value="Sub-Miniature version B"/>
 * &lt;enumeration value="Sub-Miniature version C"/> &lt;enumeration value="Type
 * N"/> &lt;enumeration value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCCN")
@XmlEnum
public enum ListCCN {

  MC("MC"),
  @XmlEnumValue("Micro-coaxial")
  MICRO___COAXIAL("Micro-coaxial"),
  @XmlEnumValue("Micro-miniature coaxial")
  MICRO___MINIATURE___COAXIAL("Micro-miniature coaxial"),
  MMX("MMX"),
  @XmlEnumValue("Neill-Concelman Bayonet")
  NEILL___CONCELMAN___BAYONET("Neill-Concelman Bayonet"),
  @XmlEnumValue("Neill-Concelman Threaded")
  NEILL___CONCELMAN___THREADED("Neill-Concelman Threaded"),
  @XmlEnumValue("Sub-Miniature version A")
  SUB___MINIATURE___VERSION___A("Sub-Miniature version A"),
  @XmlEnumValue("Sub-Miniature version B")
  SUB___MINIATURE___VERSION___B("Sub-Miniature version B"),
  @XmlEnumValue("Sub-Miniature version C")
  SUB___MINIATURE___VERSION___C("Sub-Miniature version C"),
  @XmlEnumValue("Type N")
  TYPE___N("Type N"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCCN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCN fromValue(String v) {
    for (ListCCN c : ListCCN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
