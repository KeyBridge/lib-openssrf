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
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterS6;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * DCSTrunk (US) is the Defense Communications System (DCS) trunk identifier for
 * a specific "trunked" system. The identifier is assigned by the Defense
 * Information Systems Agency (DISA).
 * <p>
 * Element of {@link Link}
 * <p>
 * Example:
 * <pre>
 * &lt;DCSTrunk cls="U"&gt;56789&lt;/DCSTrunk&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCSTrunk", propOrder = {
  "value"
})
public class DCSTrunk extends AMetadata<DCSTrunk> {

  /**
   * The Defense Communications System (DCS) trunk identifier assigned by the
   * Defense Information Systems Agency (DISA).
   * <p>
   * Format is S6
   */
  @XmlValue
  @XmlJavaTypeAdapter(type = String.class, value = XmlAdapterS6.class)
  private String value;

  /**
   * Get a Defense Communications System (DCS) trunk identifier
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a Defense Communications System (DCS) trunk identifier
   * <p>
   * Format is S6
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
   * Set a Defense Communications System (DCS) trunk identifier
   * <p>
   * Format is S6
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DCSTrunk object instance
   */
  public DCSTrunk withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Get a string representation of this DCSTrunk instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DCSTrunk {"
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
   * {@link DCSTrunk} requires {@link ListCCL cls} and {@link String value}.
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
