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
 * Java class for ListUTY.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListUTY"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="Simplex"/> &lt;enumeration value="Duplex"/> &lt;enumeration
 * value="Semiduplex"/> &lt;enumeration value="Simplex Net"/> &lt;enumeration
 * value="One Directional Transmission"/> &lt;enumeration value="Broadcast"/>
 * &lt;enumeration value="Simultaneous Broadcast"/> &lt;enumeration
 * value="Radionavigation"/> &lt;enumeration value="Radiolocation"/>
 * &lt;enumeration value="Reception Only"/> &lt;enumeration value="Radio
 * Determination"/> &lt;enumeration value="Other"/> &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUTY")
@XmlEnum
public enum ListUTY {

  @XmlEnumValue("Simplex")
  SIMPLEX("Simplex"),
  @XmlEnumValue("Duplex")
  DUPLEX("Duplex"),
  @XmlEnumValue("Semiduplex")
  SEMIDUPLEX("Semiduplex"),
  @XmlEnumValue("Simplex Net")
  SIMPLEX___NET("Simplex Net"),
  @XmlEnumValue("One Directional Transmission")
  ONE___DIRECTIONAL___TRANSMISSION("One Directional Transmission"),
  @XmlEnumValue("Broadcast")
  BROADCAST("Broadcast"),
  @XmlEnumValue("Simultaneous Broadcast")
  SIMULTANEOUS___BROADCAST("Simultaneous Broadcast"),
  @XmlEnumValue("Radionavigation")
  RADIONAVIGATION("Radionavigation"),
  @XmlEnumValue("Radiolocation")
  RADIOLOCATION("Radiolocation"),
  @XmlEnumValue("Reception Only")
  RECEPTION___ONLY("Reception Only"),
  @XmlEnumValue("Radio Determination")
  RADIO___DETERMINATION("Radio Determination"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListUTY(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUTY fromValue(String v) {
    for (ListUTY c : ListUTY.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
