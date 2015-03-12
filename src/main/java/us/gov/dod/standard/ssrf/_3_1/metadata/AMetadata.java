/*
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.metadata;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCY;

/**
 * Abstract class representing the SSRF Standard Metadata Attributes complement.
 * <p>
 * Metadata fields are defined in the SSRF XSD as the "metadata" attribute
 * group. These attributes apply to all data items, to all leaf elements
 * wihthout sub-elements (but with content), and to the Common element. All SSRF
 * field types extend this abstract class to support these optional metadata
 * fields.
 * <p>
 * Example: (Dummy classification for demonstration only). In this case, the
 * power value is Unclassified, but the associated remarks (index 12) is
 * Confidential releasable to three nations only.
 * <pre>
 * &lt;Transmitter cls="C"&gt;
 *   &lt;Serial cls="U"&gt;USA::TX:2011-00001&lt;/Serial&gt;
 *   &lt;ExtReferenceRef cls="U" idx="1"&gt;USA::EX:12&lt;/ExtReferenceRef&gt;
 *   &lt;ExtReferenceRef cls="U" idx="2"&gt;FRA::EX:34&lt;/ExtReferenceRef&gt;
 *   &lt;Remarks cls="U" idx="1"&gt;This is a JTIDS Class 2H terminal&lt;/Remarks&gt;
 *   &lt;...Ten Other Remarks...&gt;
 *   &lt;Remarks cls="C" release="USA GBR CAN" idx="12"&gt;All modes are limited to 200W&lt;/Remarks&gt;
 *   &lt;Other_Transmitter_Elements/&gt;
 *   &lt;Power cls="U" <strong>extReferences="1 2"</strong> <strong>remarksarkReferences="1 12"</strong>&gt;23&lt;/Power&gt;
 * &lt;/Transmitter&gt;</pre>
 * <p>
 * This abstract class is extended by classes in the SSRF
 * <em>metadata</em> attribute group.
 * <p>
 * Developer note: This abstract class is not part of the SSRF specification and
 * therefore must be annotated as XmlTransient to successfully marshal SSRF
 * instances.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 * @param <T> The class type implementation
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMetadata", propOrder = {"cls"})
@SuppressWarnings("unchecked")
public abstract class AMetadata<T> {

  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   */
  @XmlAttribute(name = "cls", required = true)
  protected ListCCL cls;

  /**
   * releasability - Releasability Markings (Optional)
   * <p>
   * A list of country codes for which the current data item is releasable. For
   * NATO, if this element is omitted, there is no releasability restriction for
   * the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * Format is List of L:CCY
   */
  @XmlAttribute(name = "releasability")
  protected Set<ListCCY> releasability;
  /**
   * remark References - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   */
  @XmlAttribute(name = "remarks")
  protected Set<BigInteger> remarkRef;
  /**
   * extReferences - Links to External References (Optional)
   * <p>
   * A list of Conmmon/ExtReferenceRef idx values applicable to the current data
   * item.
   * <p>
   * Format is List of UN6
   */
  @XmlAttribute(name = "extReferences")
  protected Set<BigInteger> extReferences;
  /**
   * US:legacyReleasability - Legacy Releasability (Optional)
   * <p>
   * One or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "legacyReleasability")
  protected String legacyReleasability;
  /**
   * US:quality - Data Quality (Optional)
   * <p>
   * One or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * Format is S255
   */
  @XmlAttribute(name = "quality")
  protected String quality;
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "recommendedValue")
  protected String recommendedValue;
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
   */
  @XmlAttribute(name = "idref")
  protected String idref;
  /**
   * US:availability - data supporting legacy equipment certification business
   * practice.
   * <p>
   * Values should be selected from one of "Unknown", "N/A", "Not Available" or
   * "Not Applicable", when data is not available.
   */
  @XmlAttribute(name = "availability")
  protected String availability;

  /**
   * Metadata types require a zero argument constructor.
   */
  public AMetadata() {
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
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a non-null list of {@link BigInteger} instances
   */
  public Set<BigInteger> getRemarkRef() {
    if (remarkRef == null) {
      remarkRef = new HashSet<>();
    }
    return this.remarkRef;
  }

  /**
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a non-null list of {@link BigInteger} instances
   */
  public boolean isSetRemarkRef() {
    return ((this.remarkRef != null) && (!this.remarkRef.isEmpty()));
  }

  /**
   * Clear the RemarkIndex field. This sets the field to null.
   */
  public void unsetRemarkRef() {
    this.remarkRef = null;
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
   * Get a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @return a non-null list of {@link ListCCY} instances
   */
  public Set<ListCCY> getReleasability() {
    if (releasability == null) {
      releasability = new HashSet<>();
    }
    return this.releasability;
  }

  /**
   * Determine if the Releasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReleasability() {
    return ((this.releasability != null) && (!this.releasability.isEmpty()));
  }

  /**
   * Clear the Releasability field. This sets the field to null.
   */
  public void unsetReleasability() {
    this.releasability = null;
  }

  /**
   * Get a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @return a {@link String} instance
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
   * optional.
   * <p>
   * @param value a {@link String} instance
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
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @return a {@link String} instance
   */
  public String getAvailability() {
    return availability;
  }

  /**
   * Set In attribute availability (US), enter data supporting legacy equipment
   * certification business practice of entering "Unknown", "N/A", "Not
   * Available" or "Not Applicable", when data is not available.
   * <p>
   * @param value a {@link String} instance
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
   * Get a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @return a non-null list of {@link BigInteger} instances
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
   * (i.e., ASCII character #124).
   * <p>
   * @return a {@link String} instance
   */
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value a {@link String} instance
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
   * "Outlier" | "Non-CodeList".
   * <p>
   * @return a {@link String} instance
   */
  public String getQuality() {
    return quality;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value a {@link String} instance
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
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
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
   * Get a string representation of this Common instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return (cls != null ? " cls [" + cls + "]" : "")
           + (extReferences != null ? " extReferences [" + extReferences + "]" : "")
           + (legacyReleasability != null ? " legacyReleasability [" + legacyReleasability + "]" : "")
           + (quality != null ? " quality [" + quality + "]" : "")
           + (recommendedValue != null ? " recommendedValue [" + recommendedValue + "]" : "")
           + (releasability != null ? " releasability [" + releasability + "]" : "")
           + (remarkRef != null ? " rem [" + remarkRef + "]" : "");
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current Common object instance
   */
  public T withCls(ListCCL value) {
    setCls(value);
    return (T) this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger}
   * @return The current Common object instance
   */
  public T withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current Common object instance
   */
  public T withExtReferences(Set<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withLegacyReleasability(String value) {
    setLegacyReleasability(value);
    return (T) this;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withQuality(String value) {
    setQuality(value);
    return (T) this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withRecommendedValue(String value) {
    setRecommendedValue(value);
    return (T) this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values One or more instances of type {@link ListCCY}
   * @return The current Common object instance
   */
  public T withReleasability(ListCCY... values) {
    if (values != null) {
      getReleasability().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values A collection of {@link ListCCY} instances
   * @return The current Common object instance
   */
  public T withReleasability(Set<ListCCY> values) {
    if (values != null) {
      getReleasability().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link BigInteger}
   * @return The current Common object instance
   */
  public T withRemarkRef(BigInteger... values) {
    if (values != null) {
      getRemarkRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current Common object instance
   */
  public T withRemarkRef(Set<BigInteger> values) {
    if (values != null) {
      getRemarkRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DCSTrunk object instance
   */
  public T withIdref(String value) {
    setIdref(value);
    return (T) this;
  }

  /**
   * Set the availability (US) data supporting legacy equipment certification
   * business practice of entering "Unknown", "N/A", "Not Available" or "Not
   * Applicable", when data is not available.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DCSTrunk object instance
   */
  public T withAvailability(String value) {
    setAvailability(value);
    return (T) this;
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AMetadata} requires {@link ListCCL cls}
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
