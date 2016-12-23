/*
 * Copyright 2015 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterMEMO;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterUN6;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Remarks is a free text field that provides a place to add additional
 * additional information applicable to a data item.
 * <p>
 * In certain situations, technical data must be included in free text in order
 * to clearly explain a technical or operational consideration; in these
 * instances, the data must also be entered in the data element(s) specifically
 * established for it.
 * <p>
 * Element of {@link Common}
 * <p>
 * Example:
 * <pre>
 * &lt;Remarks cls="C" idx="1"&gt;This is a JTIDS Class 2H terminal&lt;/Remarks&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remarks", propOrder = {"value"})
public class Remarks {

  /**
   * A free text field that provides a place to add additional additional
   * information applicable to a data item.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterMEMO.class)
  private String value;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
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
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlJavaTypeAdapter(XmlAdapterUN6.class)
  private BigInteger idx;

  /**
   * Get a value that is most probably correct..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
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
   * on each data item, even if the classification is "U"..
   * <p>
   * @return a {@link ListCCL} instance
   * @since 3.1.0
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U"..
   * <p>
   * @param value a {@link ListCCL} instance
   * @since 3.1.0
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
   * deleted. .
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each Remark used by this Dataset. Once an idx is
   * used it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted. .
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
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
   * @param value An instances of type {@link String}.
   * @return The current Remarks object instance.
   * @since 3.1.0
   */
  public Remarks withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}.
   * @return The current Remarks object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link BigInteger}.
   * @return The current Remarks object instance.
   * @since 3.1.0
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
    return "\n  Remarks {"
           + (cls != null ? " cls [" + cls + "]" : "")
           + (idx != null ? " idx [" + idx + "]" : "")
           + (value != null ? " value [" + value + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Remarks} requires {@link ListCCL cls}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCls() && isSetIdx();
  }

}
