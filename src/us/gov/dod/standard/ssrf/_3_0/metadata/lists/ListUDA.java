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
 * <p>
 * Java class for ListUDA.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListUDA"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S60"> &lt;enumeration
 * value="FMSC/MRFL data from NATO"/> &lt;enumeration value="Industry Canada"/>
 * &lt;enumeration value="Federal Communications Commission"/> &lt;enumeration
 * value="Frequency Resource Record System"/> &lt;enumeration value="Government
 * Master File"/> &lt;enumeration value="International Telecommunication
 * Union"/> &lt;enumeration value="Radio Astronomy data from the National
 * Research Council"/> &lt;enumeration value="Other"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUDA")
@XmlEnum
public enum ListUDA {

  @XmlEnumValue("FMSC/MRFL data from NATO")
  FMSC___MRFL___DATA___FROM___NATO("FMSC/MRFL data from NATO"),
  @XmlEnumValue("Industry Canada")
  INDUSTRY___CANADA("Industry Canada"),
  @XmlEnumValue("Federal Communications Commission")
  FEDERAL___COMMUNICATIONS___COMMISSION("Federal Communications Commission"),
  @XmlEnumValue("Frequency Resource Record System")
  FREQUENCY___RESOURCE___RECORD___SYSTEM("Frequency Resource Record System"),
  @XmlEnumValue("Government Master File")
  GOVERNMENT___MASTER___FILE("Government Master File"),
  @XmlEnumValue("International Telecommunication Union")
  INTERNATIONAL___TELECOMMUNICATION___UNION("International Telecommunication Union"),
  @XmlEnumValue("Radio Astronomy data from the National Research Council")
  RADIO___ASTRONOMY___DATA___FROM___THE___NATIONAL___RESEARCH___COUNCIL("Radio Astronomy data from the National Research Council"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUDA(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUDA fromValue(String v) {
    for (ListUDA c : ListUDA.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
