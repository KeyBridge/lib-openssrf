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
import us.gov.dod.standard.ssrf._3_1.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_1.antenna.AntFreqs;
import us.gov.dod.standard.ssrf._3_1.antenna.AntMode;
import us.gov.dod.standard.ssrf._3_1.assignment.Freq;
import us.gov.dod.standard.ssrf._3_1.assignment.FreqOld;
import us.gov.dod.standard.ssrf._3_1.assignment.StationConfig;
import us.gov.dod.standard.ssrf._3_1.jrfl.JRFLEntry;

/**
 * Enumerated values for fields using the ListCAU type.
 * <p>
 * Used in
 * {@link AntFreqs}, {@link AntMode}, {@link AsgnFreqBase}, {@link Freq}, {@link FreqOld}, {@link JRFLEntry}, {@link StationConfig}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAU")
@XmlEnum
public enum ListCAU {

  @XmlEnumValue("Transmit Only")
  TRANSMIT_ONLY("Transmit Only"),
  @XmlEnumValue("Receive Only")
  RECEIVE_ONLY("Receive Only"),
  @XmlEnumValue("Transmit-Receive")
  TRANSMIT_RECEIVE("Transmit-Receive");
  private final String value;

  ListCAU(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAU fromValue(String v) {
    for (ListCAU c : ListCAU.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
