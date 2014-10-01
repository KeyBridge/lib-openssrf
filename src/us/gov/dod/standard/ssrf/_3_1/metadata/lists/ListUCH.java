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
import us.gov.dod.standard.ssrf._3_1.IntfReport;

/**
 * Enumerated values for fields using the ListUCH type.
 * <p>
 * Used in {@link IntfReport}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListUCH")
@XmlEnum
public enum ListUCH {

  NOISE("NOISE"),
  PULSED("PULSED"),
  @XmlEnumValue("VOICE ENGLISH")
  VOICE_ENGLISH("VOICE ENGLISH"),
  @XmlEnumValue("VOICE FOREIGN")
  VOICE_FOREIGN("VOICE FOREIGN"),
  @XmlEnumValue("OTHERS NEARBY AFFECTED")
  OTHERS_NEARBY_AFFECTED("OTHERS NEARBY AFFECTED"),
  @XmlEnumValue("OTHERS FAR AWAY AFFECTED")
  OTHERS_FAR_AWAY_AFFECTED("OTHERS FAR AWAY AFFECTED"),
  @XmlEnumValue("INTERFERENCE FOLLOWS WHEN I CHANGE")
  INTERFERENCE_FOLLOWS_WHEN_I_CHANGE("INTERFERENCE FOLLOWS WHEN I CHANGE"),
  GARBLED("GARBLED"),
  @XmlEnumValue("FRAME LOSS")
  FRAME_LOSS("FRAME LOSS"),
  @XmlEnumValue("STEADY RECEIVE INDICATION (SRI)")
  STEADY_RECEIVE_INDICATION__SRI__("STEADY RECEIVE INDICATION (SRI)"),
  @XmlEnumValue("REDUCED RANGE")
  REDUCED_RANGE("REDUCED RANGE"),
  @XmlEnumValue("FALSE TARGETS")
  FALSE_TARGETS("FALSE TARGETS"),
  @XmlEnumValue("REDUCED INTELLIGIBILITY (VOICE)")
  REDUCED_INTELLIGIBILITY__VOICE__("REDUCED INTELLIGIBILITY (VOICE)"),
  @XmlEnumValue("DATA ERRORS")
  DATA_ERRORS("DATA ERRORS"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUCH(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUCH fromValue(String v) {
    for (ListUCH c : ListUCH.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
