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
package us.gov.dod.standard.ssrf._3_1.adapter;

import java.text.SimpleDateFormat;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TCalendar;

/**
 * Abstract Calendar type XmlAdapter. This supports Date and DataTime string
 * conversion via a simple data formatter.
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 */
public abstract class AXmlAdapterTCalendar extends XmlAdapter<String, TCalendar> {

  /**
   * The date or dateTime conversion pattern.
   */
  private final String PATTERN;

  public AXmlAdapterTCalendar(String PATTERN) {
    this.PATTERN = PATTERN;
  }

  /**
   * Convert a bound type to a value type.
   * <p>
   * @param v The value to be converted. Can be null.
   * @return the converted value
   */
  @Override
  public String marshal(TCalendar v) {
    if (v == null) {
      return null;
    }
    SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
    sdf.setTimeZone(v.getValue().getTimeZone());
    return sdf.format(v.getValue().getTime());
  }

  /**
   * Convert a value type to a bound type.
   * <p>
   * @param v The value to be converted. Must be non-null.
   * @return the converted value
   */
  @Override
  public TCalendar unmarshal(String v) {
    return new TCalendar(javax.xml.bind.DatatypeConverter.parseDate(v));
  }

}
