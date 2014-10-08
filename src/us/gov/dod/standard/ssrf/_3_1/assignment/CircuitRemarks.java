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
package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterStringS40;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * CircuitRemarks (US) contains general information about the network and
 * equipment used to support a specific frequency assignment or assignments.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircuitRemarks", propOrder = {
  "value"
})
public class CircuitRemarks extends AMetadata<CircuitRemarks> {

  /**
   * Any additional data to be submitted by the applicant that cannot be
   * accommodated in any of the other data items in the Government Master File
   * (GMF).
   * <p>
   * Format is S40
   */
  @XmlValue
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringS40.class)
  private String value;

  /**
   * Get the remark.
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the remark.
   * <p>
   * @param value a {@link String} instance
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Set the remark.
   * <p>
   * Format is S40
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LocationRestriction object instance
   */
  public CircuitRemarks withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this CircuitRemarks instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CircuitRemarks {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CircuitRemarks} requires {@link ListCCL cls} and
   * {@link String value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

}
