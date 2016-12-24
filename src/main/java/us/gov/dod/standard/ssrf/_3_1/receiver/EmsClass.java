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
package us.gov.dod.standard.ssrf._3_1.receiver;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterEMSDES;
import us.gov.dod.standard.ssrf._3_1.common.Remarks;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxMode;

/**
 * EmsClass identifies the emission classification symbols that define the
 * baseband modulating characteristics of the emission designator. The emission
 * classification consists of the three required symbols and the two optional
 * symbols.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example: Within an equipment mode:
 * <pre>
 * &lt;EmsClass&gt;J3E&lt;/EmsClass&gt;
 * &lt;EmsClass&gt;P0NAN&lt;/EmsClass&gt;
 * Within an interference Report:* &lt;SourceEmsClass&gt;A3E&lt;/SourceEmsClass&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmsClass", propOrder = {
  "value"
})
public class EmsClass {

  /**
   * EmsClass identifies the emission classification symbols that define the
   * baseband modulating characteristics of the emission designator. The
   * emission classification consists of the three required symbols and the two
   * optional symbols.
   * <p>
   * A three to five characters code, derived from the table, representing the
   * emission classification. If an "X" is used in any of the symbols, Remarks
   * SHOULD be used to explain the nature of the signal.
   * <p>
   * Format is pattern (S5)
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "(A|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|V|W|
   * X|-)(0|1|2|3|7|8|9|X|-)(A|B|C|D|E|F|N|W|X|-)(A|B|C|D|E|F|G|H|J|K|L|M|N|W|X)?(C|F|N|T|W|X)?"
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterEMSDES.class)
  private String value;
  /**
   * US:explainInformationTypeX - Explain Information Type X (Optional)
   * <p>
   * A reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "explainInformationTypeX")
  private String explainInformationTypeX;
  /**
   * US:explainModulationTypeX - Explain Modulation Type X (Optional)
   * <p>
   * A reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "explainModulationTypeX")
  private String explainModulationTypeX;
  /**
   * US:explainNatureOfSignalX - Explain Nature Of Signal X (Optional)
   * <p>
   * A reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "explainNatureOfSignalX")
  private String explainNatureOfSignalX;
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
   * remarks - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "remarks")
  private Set<BigInteger> remarks;
  /**
   * extReferences - Links to External References (Optional)
   * <p>
   * A list of  Common/ExternalReferenceRef index values applicable to the current data
   * item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "extReferences")
  private Set<BigInteger> extReferences;
  /**
   * US:legacyReleasability - Legacy Releasability (Optional)
   * <p>
   * One or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "legacyReleasability")
  private String legacyReleasability;
  /**
   * US:quality - Data Quality (Optional)
   * <p>
   * One or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * Format is S255
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "quality")
  private String quality;
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "recommendedValue")
  private String recommendedValue;
  /**
   * idref - Data Item ID (Optional)
   * <p>
   * A unique identifier for each Data Item in the Dataset. Within each Dataset,
   * the idref value must be unique for every occurrence. If a received Dataset
   * uses idrefs and it is expected that the Dataset will be exchanged, the
   * idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idref")
  private String idref;
  /**
   * In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "availability")
  private String availability;

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
   * Get a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other)..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getExplainInformationTypeX() {
    return explainInformationTypeX;
  }

  /**
   * Set a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other)..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setExplainInformationTypeX(String value) {
    this.explainInformationTypeX = value;
  }

  /**
   * Determine if the ExplainInformationTypeX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainInformationTypeX() {
    return (this.explainInformationTypeX != null);
  }

  /**
   * Get a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other)..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getExplainModulationTypeX() {
    return explainModulationTypeX;
  }

  /**
   * Set a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other)..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setExplainModulationTypeX(String value) {
    this.explainModulationTypeX = value;
  }

  /**
   * Determine if the ExplainModulationTypeX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainModulationTypeX() {
    return (this.explainModulationTypeX != null);
  }

  /**
   * Get a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other)..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getExplainNatureOfSignalX() {
    return explainNatureOfSignalX;
  }

  /**
   * Set a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other)..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setExplainNatureOfSignalX(String value) {
    this.explainNatureOfSignalX = value;
  }

  /**
   * Determine if the ExplainNatureOfSignalX is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExplainNatureOfSignalX() {
    return (this.explainNatureOfSignalX != null);
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
   * Get a list of Common/Remarks idx values applicable to the current data
   * item..
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public Set<BigInteger> getRemarks() {
    if (remarks == null) {
      remarks = new HashSet<>();
    }
    return this.remarks;
  }

  /**
   * Determine if the Remarks is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  /**
   * Clear the Remarks field. This sets the field to null.
   */
  public void unsetRemarks() {
    this.remarks = null;
  }

  /**
   * Get a list of  Common/ExternalReferenceRef index values applicable to the current
   * data item..
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public Set<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new HashSet<>();
    }
    return this.extReferences;
  }

  /**
   * Determine if the ExtReferences is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExtReferences() {
    return ((this.extReferences != null) && (!this.extReferences.isEmpty()));
  }

  /**
   * Clear the ExtReferences field. This sets the field to null.
   */
  public void unsetExtReferences() {
    this.extReferences = null;
  }

  /**
   * Get one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124)..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124)..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setLegacyReleasability(String value) {
    this.legacyReleasability = value;
  }

  /**
   * Determine if the LegacyReleasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLegacyReleasability() {
    return (this.legacyReleasability != null);
  }

  /**
   * Get one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList"..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getQuality() {
    return quality;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList"..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setQuality(String value) {
    this.quality = value;
  }

  /**
   * Determine if the Quality is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetQuality() {
    return (this.quality != null);
  }

  /**
   * Get a value that is most probably correct..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Set a value that is most probably correct..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRecommendedValue(String value) {
    this.recommendedValue = value;
  }

  /**
   * Determine if the RecommendedValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRecommendedValue() {
    return (this.recommendedValue != null);
  }

  /**
   * Get a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional. .
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getIdref() {
    return idref;
  }

  /**
   * Set a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional. .
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setIdref(String value) {
    this.idref = value;
  }

  /**
   * Determine if the Idref is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdref() {
    return (this.idref != null);
  }

  /**
   * Get In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available..
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAvailability() {
    return availability;
  }

  /**
   * Set In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available..
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAvailability(String value) {
    this.availability = value;
  }

  /**
   * Determine if the Availability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAvailability() {
    return (this.availability != null);
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Type of Information. This is
   * required only when the 3rd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withExplainInformationTypeX(String value) {
    setExplainInformationTypeX(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Type of Modulation. This is
   * required only when the 1st symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withExplainModulationTypeX(String value) {
    setExplainModulationTypeX(value);
    return this;
  }

  /**
   * Set a reference to a Remark that describes the Nature of Signal. This is
   * required only when the 2nd symbol of the EmsClass is an "X" (Other).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withExplainNatureOfSignalX(String value) {
    setExplainNatureOfSignalX(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withCls(ListCCL value) {
    setCls(value);
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link BigInteger}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withRemarks(BigInteger... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link Remarks} instances
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withRemarks(Collection<BigInteger> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of  Common/ExternalReferenceRef index values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list of  Common/ExternalReferenceRef index values applicable to the current
   * data item.
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withExtReferences(Collection<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return this;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withLegacyReleasability(String value) {
    setLegacyReleasability(value);
    return this;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withQuality(String value) {
    setQuality(value);
    return this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withRecommendedValue(String value) {
    setRecommendedValue(value);
    return this;
  }

  /**
   * Set a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withIdref(String value) {
    setIdref(value);
    return this;
  }

  /**
   * Set In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current EmsClass object instance.
   * @since 3.1.0
   */
  public EmsClass withAvailability(String value) {
    setAvailability(value);
    return this;
  }

  /**
   * Get a string representation of this EmsClass instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  EmsClass {"
           + (availability != null ? " availability [" + availability + "]" : "")
           + (cls != null ? " cls [" + cls + "]" : "")
           + (explainInformationTypeX != null ? " explainInformationTypeX [" + explainInformationTypeX + "]" : "")
           + (explainModulationTypeX != null ? " explainModulationTypeX [" + explainModulationTypeX + "]" : "")
           + (explainNatureOfSignalX != null ? " explainNatureOfSignalX [" + explainNatureOfSignalX + "]" : "")
           + (extReferences != null ? " extReferences [" + extReferences + "]" : "")
           + (idref != null ? " idref [" + idref + "]" : "")
           + (legacyReleasability != null ? " legacyReleasability [" + legacyReleasability + "]" : "")
           + (quality != null ? " quality [" + quality + "]" : "")
           + (recommendedValue != null ? " recommendedValue [" + recommendedValue + "]" : "")
           + (remarks != null ? " remarks [" + remarks + "]" : "")
           + (value != null ? " value [" + value + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link EmsClass} requires {@link ListCCL cls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCls();
  }

}
