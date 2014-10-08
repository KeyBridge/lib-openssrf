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
package us.gov.dod.standard.ssrf._3_1.common;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterNumberUN6;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterStringMEMO;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Remarks is a free text field that provides a place to add additional. In
 * certain situations, technical data must be included in free text in order to
 * clearly explain a technical or operational consideration; in these instances,
 * the data must also be entered in the data element(s) specifically established
 * for it.
 * <p>
 * Element of {@link Common}
 * <p>
 * Example:
 * <pre>
 * &lt;Remarks cls="C" idx="1"&gt;This is a JTIDS Class 2H terminal&lt;/Remarks&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remarks", propOrder = {
  "value"
})
public class Remarks implements Comparable<Remarks> {

  @XmlValue
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringMEMO.class)
  private String value;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   */
  @XmlAttribute(name = "cls", required = true)
  private ListCCL cls;
  /**
   * idx - Index (Required)
   * <p>
   * A unique index for each Remark used by this Dataset. Once an idx is used it
   * SHOULD NOT be modified during the lifetime of the Dataset; e.g., an element
   * with idx=2 will keep idx=2 even if the first occurrence (idx=1) is deleted.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlTypeValidator(type = String.class, value = XmlAdapterNumberUN6.class)
  private BigInteger idx;

  /**
   * Remarks constructor. Automatically sets the {@link #idx} value.
   */
  public Remarks() {
    this.idx = SSRFUtility.nextIndex();
  }

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct.
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
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link ListCCL} instance
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link ListCCL} instance
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

  /**
   * Determine if the Cls is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get a unique index for each Remark used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each Remark used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value a {@link BigInteger} instance
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Remarks object instance
   */
  public Remarks withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current Remarks object instance
   */
  public Remarks withCls(ListCCL value) {
    setCls(value);
    return this;
  }

  /**
   * Set a unique index for each Remark used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Remarks object instance
   */
  public Remarks withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  /**
   * Get a string representation of this Remarks instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Remarks {"
      + (idx != null ? " idx [" + idx + "]" : "")
      + (cls != null ? " cls [" + cls + "]" : "")
      + (value != null ? " value [" + value + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Remarks} requires {@link ListCCL cls}, {@link BigInteger idx} and
   * {@link String value}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCls() && isSetIdx() && isSetValue();
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the index "idx" number.
   * <p>
   * @return an object hash code value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + Objects.hashCode(this.idx);
    return hash;
  }

  /**
   * Equality is based upon the index "idx" number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are the same class and have a matching index
   *         value
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.idx, ((Remarks) obj).getIdx());
  }

  /**
   * Comparison and sorting are based upon the index "idx" number.
   * <p>
   * @param o the other object
   * @return the object order
   */
  @Override
  public int compareTo(Remarks o) {
    return idx.compareTo(o.getIdx());
  }//</editor-fold>

}
