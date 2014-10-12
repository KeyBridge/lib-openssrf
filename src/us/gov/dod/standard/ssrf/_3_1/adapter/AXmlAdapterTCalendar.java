/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.adapter;

import java.text.SimpleDateFormat;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TCalendar;

/**
 * Abstract Calendar type XmlAdapter. This supports Date and DataTime string
 * conversion via a simple data formatter.
 * <p>
 * @author Jesse Caulfield
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
