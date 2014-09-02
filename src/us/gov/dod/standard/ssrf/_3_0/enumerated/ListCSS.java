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
 * Java class for ListCSS.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;simpleType name="ListCSS"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Automatic Channel Selection"/> &lt;enumeration value="Chirp"/>
 * &lt;enumeration value="Direct sequence"/> &lt;enumeration value="Direct
 * sequence + Frequency hopped"/> &lt;enumeration value="Direct sequence + Time
 * hopped"/> &lt;enumeration value="Diversity"/> &lt;enumeration value="Free
 * Channel Search"/> &lt;enumeration value="Frequency + Time hopped"/>
 * &lt;enumeration value="Frequency hopped"/> &lt;enumeration value="Time
 * hopped"/> &lt;enumeration value="Other"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListCSS")
@XmlEnum
public enum ListCSS {

  @XmlEnumValue("Automatic Channel Selection")
  AUTOMATIC___CHANNEL___SELECTION("Automatic Channel Selection"),
  @XmlEnumValue("Chirp")
  CHIRP("Chirp"),
  @XmlEnumValue("Direct sequence")
  DIRECT___SEQUENCE("Direct sequence"),
  @XmlEnumValue("Direct sequence + Frequency hopped")
  DIRECT___SEQUENCE_____FREQUENCY___HOPPED("Direct sequence + Frequency hopped"),
  @XmlEnumValue("Direct sequence + Time hopped")
  DIRECT___SEQUENCE_____TIME___HOPPED("Direct sequence + Time hopped"),
  @XmlEnumValue("Diversity")
  DIVERSITY("Diversity"),
  @XmlEnumValue("Free Channel Search")
  FREE___CHANNEL___SEARCH("Free Channel Search"),
  @XmlEnumValue("Frequency + Time hopped")
  FREQUENCY_____TIME___HOPPED("Frequency + Time hopped"),
  @XmlEnumValue("Frequency hopped")
  FREQUENCY___HOPPED("Frequency hopped"),
  @XmlEnumValue("Time hopped")
  TIME___HOPPED("Time hopped"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCSS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSS fromValue(String v) {
    for (ListCSS c : ListCSS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
