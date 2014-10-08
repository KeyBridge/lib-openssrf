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
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.receiver.Deployment;

/**
 * Enumerated values for fields using the ListCSU type.
 * <p>
 * Used in
 * {@link Administrative}, {@link Allotment}, {@link Antenna}, {@link Assignment}, {@link ChannelPlan}, {@link Common}, {@link Contact}, {@link Deployment}, {@link ExternalReference}, {@link FEDeployment}, {@link ForceElement}, {@link IntfReport}, {@link JRFL}, {@link Loadset}, {@link Location}, {@link Message}, {@link Note}, {@link Organisation}, {@link RFSystem}, {@link RadiationPlan}, {@link Receiver}, {@link Role}, {@link SSReply}, {@link SSRequest}, {@link Satellite}, {@link TOA}, {@link Transmitter}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCSU")
@XmlEnum
public enum ListCSU {

  @XmlEnumValue("Active")
  ACTIVE("Active"),
  @XmlEnumValue("Inactive")
  INACTIVE("Inactive"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCSU(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCSU fromValue(String v) {
    for (ListCSU c : ListCSU.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
