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
package us.gov.dod.standard.ssrf._3_1;

import java.lang.reflect.Field;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Message describes the receipt and disposition of a group of Datasets in a
 * single transmittal. The receiving system SHOULD verify the correct datasets
 * were received. If a dataset fails validation, a separate Administrative
 * dataset SHOULD be returned to the sender informing them of the error.
 * <p>
 * Sub-Element is {@link DatasetRefs}
 * <p>
 * Example:
 * <pre>
 * &lt;Message cls="U"&gt;
 *   &lt;Serial cls="U"&gt;TUR::MS:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;Results of Your 2012-01-05 Data Request&lt;/Name&gt;
 *   &lt;SecondaryDatasets cls="U"&gt;No&lt;/SecondaryDatasets&gt;
 *   &lt;DatasetRef cls="U"&gt;POL::AN:456&lt;DatasetRef&gt;
 *     &lt;DatasetRef cls="U"&gt;DEU::AL:456&lt;DatasetRef&gt;
 *       &lt;DatasetRef cls="U"&gt;NED::TX:456&lt;DatasetRef&gt;
 *         &lt;DatasetRef cls="U"&gt;USA::RX:456&lt;DatasetRef&gt;
 *         &lt;/Message&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
  "name",
  "secondaryDatasets",
  "datasetRef"
})
public class Message extends Common<Message> {

  /**
   * Name - Message Name (Optional)
   * <p>
   * A human-readable name for the message.
   * <p>
   * Format is S40
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = false)
  private S40 name;
  /**
   * In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "SecondaryDatasets", required = false)
  private TString secondaryDatasets;

  @XmlElement(name = "DatasetRef", required = true, nillable = true)
  private Set<Serial> datasetRef;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public Message() {
    super();
  }

  /**
   * Get a human-readable name for the message..
   * <p>
   * @return a {@link S40} instance
   * @since 3.1.0
   */
  public S40 getName() {
    return name;
  }

  /**
   * Set a human-readable name for the message..
   * <p>
   * @param value a {@link S40} instance
   * @since 3.1.0
   */
  public void setName(S40 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included..
   * <p>
   * @return the SecondaryDatasets value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getSecondaryDatasets() {
    return secondaryDatasets;
  }

  /**
   * Set In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included..
   * <p>
   * @param value the SecondaryDatasets value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setSecondaryDatasets(TString value) {
    this.secondaryDatasets = value;
  }

  /**
   * Determine if the SecondaryDatasets is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecondaryDatasets() {
    return (this.secondaryDatasets != null ? this.secondaryDatasets.isSetValue() : false);
  }

  /**
   * Get .
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getData()} instead.
   */
  @Deprecated
  public Set<Serial> getDatasetRef() {
    if (datasetRef == null) {
      datasetRef = new HashSet<>();
    }
    return this.datasetRef;
  }

  /**
   * Determine if the DatasetRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDatasetRef() {
    return ((this.datasetRef != null) && (!this.datasetRef.isEmpty()));
  }

  /**
   * Clear the DatasetRef field. This sets the field to null.
   */
  public void unsetDatasetRef() {
    this.datasetRef = null;
  }

  /**
   * Set a human-readable name for the message.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Message object instance.
   * @since 3.1.0
   */
  public Message withName(String value) {
    setName(new S40(value));
    return this;
  }

  /**
   * Set In Data Item SecondaryDatasets, indicate if datasets referenced by the
   * primary dataset are included.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current Message object instance.
   * @since 3.1.0
   */
  public Message withSecondaryDatasets(ListCBO value) {
    setSecondaryDatasets(new TString(value.value()));
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link DatasetRef...}.
   * @return The current Message object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withData(Common...)} instead.
   */
  @Deprecated
  public Message withDatasetRef(Serial... values) {
    if (values != null) {
      getDatasetRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Serial} instances
   * @return The current Message object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withData(Common...)} instead.
   */
  @Deprecated
  public Message withDatasetRef(Collection<Serial> values) {
    if (values != null) {
      getDatasetRef().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Message instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Message {"
           + (datasetRef != null ? " datasetRef [" + datasetRef + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (secondaryDatasets != null ? " secondaryDatasets [" + secondaryDatasets + "]" : "")
           + super.toString();
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Message} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return true;
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  @XmlTransient
  private Set<Common<?>> data;

  /**
   * Get .
   * <p>
   * @return a {@link Common} instance
   * @since 3.1.0
   */
  public Set<Common<?>> getData() {
    if (data == null) {
      data = new HashSet<>();
    }
    return data;
  }

  /**
   * Determine if the data field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetData() {
    return this.data != null && !this.data.isEmpty();
  }

  /**
   * Set
   * <p>
   * @param values An instances of type {@link Common<?>}.
   * @return The current Message object instance.
   * @since 3.1.0
   */
  public Message withData(Common<?>... values) {
    return withData(Arrays.asList(values));
  }

  /**
   * Set
   * <p>
   * @param values An instances of type {@link Common<?>}.
   * @return The current Message object instance.
   * @since 3.1.0
   */
  public Message withData(Collection<Common<?>> values) {
    getData().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Message record.
   * <p>
   * This method builds the exported {@link #datasetRef} field with values from
   * the transient {@link #data} field. This method should typically be called
   * after the Message is configured and (optionally) before exporting an SSRF
   * message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.datasetRef = new HashSet<>();
    for (Common<?> instance : getData()) {
      this.datasetRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Message record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #data} with values from the
   * imported {@link #datasetRef} field. This method should typically be called
   * after the Message is imported from XML.
   * <p>
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (datasetRef == null || datasetRef.isEmpty()) {
      return;
    }
    /**
     * Scan ALL the data lists in the SSRF (SchemaRoot) object.
     */
    for (Field field : SSRFUtility.findDeclaredAndInheritedFields(root.getClass())) {
      try {
        field.setAccessible(true);
        /**
         * Ignore fields that are NOT.
         */
        Object fieldValue = field.get(root);
        if (fieldValue == null) {
          continue;
        }
        System.out.println("field type " + field.getType().getSimpleName());
        if (field.getType().getSuperclass().equals(Collection.class)) {
          System.out.println("  superclass is a collection");
        }
        /**
         * Only process field values that are instance of a collection.
         */
        if (fieldValue instanceof Collection) {
          for (Object entry : (Iterable<? extends Object>) fieldValue) {
            if (entry != null) {
              if (datasetRef.contains(((Common<?>) entry).getSerial())) {
                data.add((Common<?>) entry);
              }
            }
          }
        }
      } catch (SecurityException | IllegalArgumentException | IllegalAccessException securityException) {
      }
    }
  }//</editor-fold>

}
