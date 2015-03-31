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
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * ExtReferenceRef refers to an external reference defined in a dataset
 * ExternalReference.
 * <p>
 * Element of {@link Common}
 * <p>
 * Example:
 * <pre>
 * &lt;ExtReferenceRef idx="1" cls="U"&gt;USA::EX:12&lt;/ExtReferenceRef&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtReferenceRef", propOrder = {"value"})
public class ExtReferenceRef {

  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterSERIAL.class)
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
   * A unique index for each External Reference used by this Dataset. Once an
   * idx is used it SHOULD NOT be modified during the lifetime of the Dataset;
   * e.g., an element with idx=2 will keep idx=2 even if the first occurrence
   * (idx=1) is deleted.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get a value that is most probably correct..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getExternalReference()} instead.
   */
  @Deprecated
  public String getValue() {
    return value;
  }

  /**
   * Set a value that is most probably correct..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setExternalReference(ExternalReference)} instead.
   */
  @Deprecated
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
   * Get a unique index for each External Reference used by this Dataset. Once
   * an idx is used it SHOULD NOT be modified during the lifetime of the
   * Dataset; e.g., an element with idx=2 will keep idx=2 even if the first
   * occurrence (idx=1) is deleted. .
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each External Reference used by this Dataset. Once
   * an idx is used it SHOULD NOT be modified during the lifetime of the
   * Dataset; e.g., an element with idx=2 will keep idx=2 even if the first
   * occurrence (idx=1) is deleted. .
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
   * @return The current ExtReferenceRef object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withExternalReference(ExternalReference)} instead.
   */
  @Deprecated
  public ExtReferenceRef withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}.
   * @return The current ExtReferenceRef object instance.
   * @since 3.1.0
   */
  public ExtReferenceRef withCls(ListCCL value) {
    setCls(value);
    return this;
  }

  /**
   * Set a unique index for each External Reference used by this Dataset. Once
   * an idx is used it SHOULD NOT be modified during the lifetime of the
   * Dataset; e.g., an element with idx=2 will keep idx=2 even if the first
   * occurrence (idx=1) is deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}.
   * @return The current ExtReferenceRef object instance.
   * @since 3.1.0
   */
  public ExtReferenceRef withIdx(Integer value) {
    setIdx(BigInteger.valueOf(value));
    return this;
  }

  /**
   * Get a string representation of this ExtReferenceRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ExtReferenceRef {"
           + (cls != null ? "\n cls [" + cls + "]" : "")
           + (idx != null ? "\n idx [" + idx + "]" : "")
           + (value != null ? "\n value [" + value + "]" : " NULL VALUE ")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ExtReferenceRef} requires
   * {@link ListCCL cls}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCls() && isSetIdx();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private ExternalReference externalReference;

  /**
   * Get a value that is most probably correct..
   * <p>
   * @return a {@link ExternalReference} instance
   * @since 3.1.0
   */
  public ExternalReference getExternalReference() {
    return externalReference;
  }

  /**
   * Determine if the externalReference field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExternalReference() {
    return this.externalReference != null;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link ExternalReference}.
   * @return The current ExtReferenceRef object instance.
   * @since 3.1.0
   */
  public ExtReferenceRef withExternalReference(ExternalReference value) {
    this.externalReference = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this ExtReferenceRef record.
   * <p>
   * This method builds the exported {@link #value} field with values from the
   * transient {@link #externalReference} field. This method should typically be
   * called after the ExtReferenceRef is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.value = externalReference != null ? externalReference.getSerial().toString() : this.value;
  }

  /**
   * Update the SSRF data type references in this ExtReferenceRef record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #externalReference} with values
   * from the imported {@link #value} field. This method should typically be
   * called after the ExtReferenceRef is imported from XML. * @param root the
   * SSRF root instance.
   * <p>
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (value == null) {
      return;
    }
    for (ExternalReference instance : root.getExternalReference()) {
      if (value.equals(instance.getSerial().toString())) {
        externalReference = instance;
        return;
      }
    }
  }//</editor-fold>
}
