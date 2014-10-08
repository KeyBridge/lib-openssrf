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
package us.gov.dod.standard.ssrf._3_1.toa;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUSC;

/**
 * StnClass contains the station class associated with the TOA frequency usage.
 * <p>
 * Element of {@link Allocation}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StnClass", propOrder = {
  "value"
})
public class StnClass extends AMetadata<StnClass> {

  /**
   * The station class, as defined by the appropriate Administration. When
   * exchanging with NATO, only include ITU entries.
   * <p>
   * Format is L:USC.
   */
  @XmlValue
  private ListUSC value;

  /**
   * Get the station class.
   * <p>
   * @return a {@link ListUSC} instance
   */
  public ListUSC getValue() {
    return value;
  }

  /**
   * Set the station class.
   * <p>
   * @param value a {@link ListUSC} instance
   */
  public void setValue(ListUSC value) {
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
   * Set the station class.
   * <p>
   * @param value An instances of type {@link ListUSC}
   * @return The current StnClass object instance
   */
  public StnClass withValue(ListUSC value) {
    setValue(value);
    return this;
  }

  /**
   * Get the string representation of this StnClass instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "StnClass {"
      + value + super.toString()
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StnClass} requires {@link ListCCL cls} and {@link ListUSC value}.
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
