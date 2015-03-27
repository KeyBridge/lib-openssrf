/* 
 * Copyright 2014 Key Bridge LLC.
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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * Message describes the receipt and disposition of a group of Datasets in a
 * single transmittal. The receiving system SHOULD verify the correct datasets
 * were received. If a dataset fails validation, a separate Administrative
 * dataset SHOULD be returned to the sender informing them of the error.
 * <p>
 * Sub-Element is
 * <p>
 * Example:
 * <pre>
 * &lt;Message cls="U"&gt;
 *   &lt;Serial cls="U"&gt;TUR::MS:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;Results of Your 2012-01-05 Data Request&lt;/Name&gt;
 *   &lt;SecondaryDatasets cls="U"&gt;No&lt;/SecondaryDatasets&gt;
 *   &lt;DatasetRef cls="U"&gt;POL::AN:456&lt;DatasetRef&gt;
 *   &lt;DatasetRef cls="U"&gt;DEU::AL:456&lt;DatasetRef&gt;
 *   &lt;DatasetRef cls="U"&gt;NED::TX:456&lt;DatasetRef&gt;
 *   &lt;DatasetRef cls="U"&gt;USA::RX:456&lt;DatasetRef&gt;
 * &lt;/Message&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "Name", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS40.class)
  private TString name;
  /**
   * SecondaryDatasets, indicate if datasets referenced by the primary dataset
   * are included.
   */
  @XmlElement(name = "SecondaryDatasets", required = false)
  private TString secondaryDatasets;
  /**
   * DatasetRefs (Required)
   * <p>
   * DatasetRefs lists the SERIAL for each primary Dataset included in a single
   * Message.
   */
  @XmlElement(name = "DatasetRef", required = true, nillable = true)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private Set<TSerial> datasetRef;

  /**
   * Get a human-readable name for the message.
   * <p>
   * @return the Name value in a {@link TString} data type
   */
  public TString getName() {
    return name;
  }

  /**
   * Set a human-readable name for the message.
   * <p>
   * @param value the Name value in a {@link TString} data type
   */
  public void setName(TString value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Get SecondaryDatasets, indicate if datasets referenced by the primary
   * dataset are included.
   * <p>
   * @return the SecondaryDatasets value in a {@link TString} data type
   */
  public TString getSecondaryDatasets() {
    return secondaryDatasets;
  }

  /**
   * Set SecondaryDatasets, indicate if datasets referenced by the primary
   * dataset are included.
   * <p>
   * @param value the SecondaryDatasets value in a {@link TString} data type
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
   * Get the DatasetRefs
   * <p>
   * Complex element DatasetRefs lists the serial for each primary Dataset
   * included in a single Message.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getData()} instead.
   */
  @Deprecated
  public Set<TSerial> getDatasetRef() {
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
   * @param value An instances of type {@link String}
   * @return The current Message object instance
   */
  public Message withName(String value) {
    setName(new TString(value));
    return this;
  }

  /**
   * Set SecondaryDatasets, indicate if datasets referenced by the primary
   * dataset are included.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Message object instance
   */
  public Message withSecondaryDatasets(ListCBO value) {
    setSecondaryDatasets(new TString(value.value()));
    return this;
  }

  /**
   * Set the DatasetRefs
   * <p>
   * Complex element DatasetRefs lists the serial for each primary Dataset
   * included in a single Message.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current Message object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withData(Common...)} instead.
   */
  @Deprecated
  public Message withDatasetRef(TSerial... values) {
    if (values != null) {
      getDatasetRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the DatasetRefs
   * <p>
   * Complex element DatasetRefs lists the serial for each primary Dataset
   * included in a single Message.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current Message object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withData(Common...)} instead.
   */
  @Deprecated
  public Message withDatasetRef(Set<TSerial> values) {
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
    return "Message {"
      + (name != null ? " name [" + name + "]" : "")
      + (secondaryDatasets != null ? " secondaryDatasets [" + secondaryDatasets + "]" : "")
      + (datasetRef != null ? " datasetRef [" + datasetRef + "]" : "")
      + "\n  Message." + super.toString() + "\n"
      + "}";
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
    return super.isSet();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  @XmlTransient
  private Set<Common<?>> data;

  /**
   * Get
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
   * @param values An instances of type {@link Common}
   * @return The current Message object instance
   * @since 3.1.0
   */
  public Message withData(Common<?>... values) {
    return withData(new HashSet<>(Arrays.asList(values)));
  }

  /**
   * Set
   * <p>
   * @param values An instances of type {@link Common}
   * @return The current Message object instance
   * @since 3.1.0
   */
  public Message withData(Set<Common<?>> values) {
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
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    super.postLoad(root);
    if (datasetRef == null || datasetRef.isEmpty()) {
      return;
    }
    /**
     * @TODO: Check ALL SSRF lists.
     */
//    for (Common<?> instance : root.getCommon < ?  > ()) {
//      if (datasetRef.contains(instance.getSerial())) {
//        data.add(instance);
//      }
//    }
  }//</editor-fold>

}
