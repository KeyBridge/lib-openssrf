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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.AMetadata;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterS6;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * OffTheShelfEquipment (US) defines the function of readily available
 * equipment. It is often commercial equipment that provides a compatible
 * function to DoD or government equipment.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffTheShelfEquipment", propOrder = {
  "value"
})
public class OffTheShelfEquipment extends AMetadata<OffTheShelfEquipment> {

  /**
   * A specialized type of system/equipment used in the frequency assignment, as
   * defined by the following choices: LMS, VOR1A, VOR1B, VOR2A, VOR2B, ILSLOC,
   * or ILSGS.
   * <p>
   * Format is S6
   */
  @XmlValue
  @XmlJavaTypeAdapter(type = String.class, value = XmlAdapterS6.class)
  private String value;

  /**
   * Get a specialized type of system/equipment
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a specialized type of system/equipment.
   * <p>
   * Required choices are [LMS, VOR1A, VOR1B, VOR2A, VOR2B, ILSLOC, ILSGS]
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
   * Set a specialized type of system/equipment.
   * <p>
   * Required choices are [LMS, VOR1A, VOR1B, VOR2A, VOR2B, ILSLOC, ILSGS]
   * <p>
   * @param value An instances of type {@link String}
   * @return The current LocationRestriction object instance
   */
  public OffTheShelfEquipment withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this OffTheShelfEquipment instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "OffTheShelfEquipment {"
      + (extReferences != null ? " extReferences [" + extReferences + "]" : "")
      + (cls != null ? " cls [" + cls + "]" : "")
      + (recommendedValue != null ? " recommendedValue [" + recommendedValue + "]" : "")
      + (quality != null ? " quality [" + quality + "]" : "")
      + (legacyReleasability != null ? " legacyReleasability [" + legacyReleasability + "]" : "")
      + (value != null ? " value [" + value + "]" : "")
      + (remarkRef != null ? " remarkRef [" + remarkRef + "]" : "")
      + (idref != null ? " idref [" + idref + "]" : "")
      + (availability != null ? " availability [" + availability + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link OffTheShelfEquipment} requires {@link ListCCL cls} and
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
