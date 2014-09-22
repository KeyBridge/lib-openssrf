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
 * Java class for ListUNS.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListUNS"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S25"> &lt;enumeration value="Agency
 * Tracking ID"/> &lt;enumeration value="Commercial P/N"/> &lt;enumeration
 * value="Drawing Number"/> &lt;enumeration value="Line Item Number"/>
 * &lt;enumeration value="National Stock Number"/> &lt;enumeration value="NATO
 * Stock Number"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUNS")
@XmlEnum
public enum ListUNS {

  @XmlEnumValue("Agency Tracking ID")
  AGENCY_TRACKING_ID("Agency Tracking ID"),
  @XmlEnumValue("Commercial P/N")
  COMMERCIAL_P_N("Commercial P/N"),
  @XmlEnumValue("Drawing Number")
  DRAWING_NUMBER("Drawing Number"),
  @XmlEnumValue("Line Item Number")
  LINE_ITEM_NUMBER("Line Item Number"),
  @XmlEnumValue("National Stock Number")
  NATIONAL_STOCK_NUMBER("National Stock Number"),
  @XmlEnumValue("NATO  Stock Number")
  NATO_STOCK_NUMBER("NATO  Stock Number");
  private final String value;

  ListUNS(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUNS fromValue(String v) {
    for (ListUNS c : ListUNS.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
