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
import us.gov.dod.standard.ssrf._3_1.Assignment;

/**
 * Enumerated values for fields using the ListUDA type.
 * <p>
 * Used in {@link Assignment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUDA")
@XmlEnum
public enum ListUDA {

  @XmlEnumValue("FMSC/MRFL data from NATO")
  FMSC_MRFL_DATA_FROM_NATO("FMSC/MRFL data from NATO"),
  @XmlEnumValue("Industry Canada")
  INDUSTRY_CANADA("Industry Canada"),
  @XmlEnumValue("Federal Communications Commission")
  FEDERAL_COMMUNICATIONS_COMMISSION("Federal Communications Commission"),
  @XmlEnumValue("Frequency Resource Record System")
  FREQUENCY_RESOURCE_RECORD_SYSTEM("Frequency Resource Record System"),
  @XmlEnumValue("Government Master File")
  GOVERNMENT_MASTER_FILE("Government Master File"),
  @XmlEnumValue("International Telecommunication Union")
  INTERNATIONAL_TELECOMMUNICATION_UNION("International Telecommunication Union"),
  @XmlEnumValue("Radio Astronomy data from the National Research Council")
  RADIO_ASTRONOMY_DATA_FROM_THE_NATIONAL_RESEARCH_COUNCIL("Radio Astronomy data from the National Research Council"),
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
