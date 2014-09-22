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
package us.gov.dod.standard.ssrf._3_0.metadata.domains;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import us.gov.dod.standard.ssrf.AStandardMetadataAttributes;

/**
 * A Calendar instance with SSRF Standard Metadata Attributes. This corresponds
 * to the "xs:date" and "xs:dateTime" types.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCalendar")
public class TCalendar extends AStandardMetadataAttributes implements IMetadataType {

  private static final TimeZone TIMEZONE = TimeZone.getTimeZone("UTC");

  /**
   * The value to which the metadata attributes are associated. Expected Class
   * types are String, BigDecimal and BigInteger.
   */
  @XmlValue
  protected Calendar value;

  public TCalendar(Calendar value) {
    setValue(value);
  }

  public TCalendar(Date value) {
    setValue(value);
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return
   */
  @Override
  public Calendar getValue() {
    return (value != null ? (Calendar) value.clone() : null);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Calendar value) {
    this.value = (value != null ? (Calendar) value.clone() : null);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Date value) {
    if (value != null) {
      this.value = Calendar.getInstance(TIMEZONE);
      this.value.setTime(value);
    } else {
      this.value = null;
    }
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  @Override
  public String toString() {
    return value != null ? value.getTime().toString() : null;
  }

}
