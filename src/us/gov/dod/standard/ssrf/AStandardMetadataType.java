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
package us.gov.dod.standard.ssrf;

import javax.xml.bind.annotation.*;

/**
 * Abstract class representing common SSRF data types incorporating Standard
 * Metadata Attributes.
 * <p>
 * This abstract class associates the standard metadata package with a value.
 * The value type is declared by the implementing class.
 * <p>
 * Metadata fields are defined in the SSRF XSD as the "metadata" attribute
 * group. These attributes apply to all data items, to all leaf elements
 * wihthout sub-elements (but with content), and to the Common element. All SSRF
 * field types extend this abstract class to support these optional metadata
 * fields.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 * @param <T> The class type instance to which the metadata attributes are
 *            associated.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AStandardMetadataAttributes", propOrder = {
  "value"
})
public abstract class AStandardMetadataType<T> extends AStandardMetadataAttributes {

  /**
   * The value to which the metadata attributes are associated. Expected Class
   * types are String, BigDecimal and BigInteger.
   */
  @XmlValue
  protected T value;

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public AStandardMetadataType(T value) {
    this.value = value;
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return 
   */
  public T getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value 
   */
  public void setValue(T value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }
}
