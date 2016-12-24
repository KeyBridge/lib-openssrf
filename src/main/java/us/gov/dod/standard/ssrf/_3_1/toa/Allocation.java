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
package us.gov.dod.standard.ssrf._3_1.toa;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.ChannelPlan;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.D;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Serial;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCPS;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSN;

/**
 * Allocation contains the allocation of a specific frequency band to a specific
 * radiocommunication service.
 * <p>
 * Element of {@link FreqBand}
 * <p>
 * Sub-Elements are {@link StnClass}, {@link Variance}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allocation", propOrder = {
  "allocatedService",
  "priority",
  "effectiveDate",
  "expirationDate",
  "allocatedByFootnote",
  "variance",
  "stnClass",
  "channelPlanRef"
})
public class Allocation {

  /**
   * AllocatedService - Allocated Service (Required)
   * <p>
   * A radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * Format is L:CSN
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AllocatedService", required = true)
  private TString allocatedService;
  /**
   * Priority - Priority (Required)
   * <p>
   * If this service is a primary or secondary use of this band. ("Permitted"
   * SHOULD only be used if the priority is unknown.)
   * <p>
   * Format is L:CPS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Priority", required = true)
  private TString priority;
  /**
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EffectiveDate", required = false)
  private D effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExpirationDate", required = false)
  private D expirationDate;
  /**
   * AllocatedByFootnote - Allocated By Footnote (Optional)
   * <p>
   * "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s).
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AllocatedByFootnote", required = false)
  private TString allocatedByFootnote;
  /**
   * Variance (Optional)
   * <p>
   * Variance indicates if the local allocation deviates from an upper level
   * allocation (e.g. a national allocation not aligned with the ITU RR).
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Variance")
  private Set<Variance> variance;
  /**
   * StnClass (Optional)
   * <p>
   * StnClass contains the station class associated with the TOA frequency
   * usage.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StnClass", nillable = true)
  private Set<StnClass> stnClass;
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef references the ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  private Set<Serial> channelPlanRef;
  /**
   * footnotes - Link to allocation usage notes (Optional)
   * <p>
   * A list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * Format is List of UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "footnotes")
  private Set<BigInteger> footnotes;

  /**
   * Get a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service")..
   * <p>
   * @return the AllocatedService value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAllocatedService() {
    return allocatedService;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service")..
   * <p>
   * @param value the AllocatedService value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAllocatedService(TString value) {
    this.allocatedService = value;
  }

  /**
   * Determine if the AllocatedService is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllocatedService() {
    return (this.allocatedService != null ? this.allocatedService.isSetValue() : false);
  }

  /**
   * Get if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.).
   * <p>
   * @return the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPriority() {
    return priority;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.).
   * <p>
   * @param value the Priority value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPriority(TString value) {
    this.priority = value;
  }

  /**
   * Determine if the Priority is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPriority() {
    return (this.priority != null ? this.priority.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be operational or effective..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setEffectiveDate(D value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setExpirationDate(D value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s)..
   * <p>
   * @return the AllocatedByFootnote value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getAllocatedByFootnote() {
    return allocatedByFootnote;
  }

  /**
   * Set "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s)..
   * <p>
   * @param value the AllocatedByFootnote value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setAllocatedByFootnote(TString value) {
    this.allocatedByFootnote = value;
  }

  /**
   * Determine if the AllocatedByFootnote is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAllocatedByFootnote() {
    return (this.allocatedByFootnote != null ? this.allocatedByFootnote.isSetValue() : false);
  }

  /**
   * Get the Variance
   * <p>
   * Complex element Variance indicates if the local allocation deviates from an
   * upper level allocation (e.g. a national allocation not aligned with the ITU
   * RR)..
   * <p>
   * @return a {@link Variance} instance
   * @since 3.1.0
   */
  public Set<Variance> getVariance() {
    if (variance == null) {
      variance = new HashSet<>();
    }
    return this.variance;
  }

  /**
   * Determine if the Variance is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetVariance() {
    return ((this.variance != null) && (!this.variance.isEmpty()));
  }

  /**
   * Clear the Variance field. This sets the field to null.
   */
  public void unsetVariance() {
    this.variance = null;
  }

  /**
   * Get the StnClass
   * <p>
   * Complex element StnClass contains the station class associated with the TOA
   * frequency usage..
   * <p>
   * @return a {@link StnClass} instance
   * @since 3.1.0
   */
  public Set<StnClass> getStnClass() {
    if (stnClass == null) {
      stnClass = new HashSet<>();
    }
    return this.stnClass;
  }

  /**
   * Determine if the StnClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStnClass() {
    return ((this.stnClass != null) && (!this.stnClass.isEmpty()));
  }

  /**
   * Clear the StnClass field. This sets the field to null.
   */
  public void unsetStnClass() {
    this.stnClass = null;
  }

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getChannelPlan()} instead.
   */
  @Deprecated
  public Set<Serial> getChannelPlanRef() {
    if (channelPlanRef == null) {
      channelPlanRef = new HashSet<>();
    }
    return this.channelPlanRef;
  }

  /**
   * Determine if the ChannelPlanRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelPlanRef() {
    return ((this.channelPlanRef != null) && (!this.channelPlanRef.isEmpty()));
  }

  /**
   * Clear the ChannelPlanRef field. This sets the field to null.
   */
  public void unsetChannelPlanRef() {
    this.channelPlanRef = null;
  }

  /**
   * Get a list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space..
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public Set<BigInteger> getFootnotes() {
    if (footnotes == null) {
      footnotes = new HashSet<>();
    }
    return this.footnotes;
  }

  /**
   * Determine if the Footnotes is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFootnotes() {
    return ((this.footnotes != null) && (!this.footnotes.isEmpty()));
  }

  /**
   * Clear the Footnotes field. This sets the field to null.
   */
  public void unsetFootnotes() {
    this.footnotes = null;
  }

  /**
   * Set a radiocommunication service recognized by an administration that is
   * allocated to this frequency band (e.g., "Fixed Service").
   * <p>
   * @param value An instances of type {@link ListCSN}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withAllocatedService(ListCSN value) {
    setAllocatedService(new TString(value.value()));
    return this;
  }

  /**
   * Set if this service is a primary or secondary use of this band.
   * ("Permitted" SHOULD only be used if the priority is unknown.)
   * <p>
   * @param value An instances of type {@link ListCPS}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withPriority(ListCPS value) {
    setPriority(new TString(value.value()));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withExpirationDate(Calendar value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withExpirationDate(Date value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set "Yes" if this service is allocated to this frequency band by footnote
   * (i.e., the only indication this service is allowed in this band is a
   * footnote). Additional restrictions might exist in the footnote(s).
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withAllocatedByFootnote(ListCBO value) {
    setAllocatedByFootnote(new TString(value.value()));
    return this;
  }

  /**
   * Set the Variance
   * <p>
   * Complex element Variance indicates if the local allocation deviates from an
   * upper level allocation (e.g. a national allocation not aligned with the ITU
   * RR).
   * <p>
   * @param values One or more instances of type {@link Variance}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withVariance(Variance... values) {
    if (values != null) {
      getVariance().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Variance
   * <p>
   * Complex element Variance indicates if the local allocation deviates from an
   * upper level allocation (e.g. a national allocation not aligned with the ITU
   * RR).
   * <p>
   * @param values A collection of {@link Variance} instances
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withVariance(Collection<Variance> values) {
    if (values != null) {
      getVariance().addAll(values);
    }
    return this;
  }

  /**
   * Set the StnClass
   * <p>
   * Complex element StnClass contains the station class associated with the TOA
   * frequency usage.
   * <p>
   * @param values One or more instances of type {@link StnClass}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withStnClass(StnClass... values) {
    if (values != null) {
      getStnClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the StnClass
   * <p>
   * Complex element StnClass contains the station class associated with the TOA
   * frequency usage.
   * <p>
   * @param values A collection of {@link StnClass} instances
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withStnClass(Collection<StnClass> values) {
    if (values != null) {
      getStnClass().addAll(values);
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef.
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link Serial}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public Allocation withChannelPlanRef(Serial... values) {
    if (values != null) {
      getChannelPlanRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef.
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values A collection of {@link Serial} instances
   * @return The current Allocation object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public Allocation withChannelPlanRef(Collection<Serial> values) {
    if (values != null) {
      getChannelPlanRef().addAll(values);
    }
    return this;
  }

  /**
   * Set a list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @param values One or more instances of type {@link BigInteger}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withFootnotes(BigInteger... values) {
    if (values != null) {
      getFootnotes().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list containing each Footnote index that is applicable to the current
   * band Allocation. Each entry in the list should be separated by a blank
   * space.
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withFootnotes(Collection<BigInteger> values) {
    if (values != null) {
      getFootnotes().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Allocation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Allocation {"
           + (allocatedByFootnote != null ? " allocatedByFootnote [" + allocatedByFootnote + "]" : "")
           + (allocatedService != null ? " allocatedService [" + allocatedService + "]" : "")
           + (channelPlanRef != null ? " channelPlanRef [" + channelPlanRef + "]" : "")
           + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
           + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
           + (footnotes != null ? " footnotes [" + footnotes + "]" : "")
           + (priority != null ? " priority [" + priority + "]" : "")
           + (stnClass != null ? " stnClass [" + stnClass + "]" : "")
           + (variance != null ? " variance [" + variance + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Allocation} requires
   * {@link TString AllocatedService}, {@link TString Priority}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAllocatedService() && isSetPriority();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef references the ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Set<ChannelPlan> channelPlan;

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan..
   * <p>
   * @return a {@link ChannelPlan} instance
   * @since 3.1.0
   */
  public Set<ChannelPlan> getChannelPlan() {
    if (channelPlan == null) {
      channelPlan = new HashSet<>();
    }
    return channelPlan;
  }

  /**
   * Determine if the channelPlan field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetChannelPlan() {
    return this.channelPlan != null && !this.channelPlan.isEmpty();
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withChannelPlan(ChannelPlan... values) {
    return withChannelPlan(Arrays.asList(values));
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef references the ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}.
   * @return The current Allocation object instance.
   * @since 3.1.0
   */
  public Allocation withChannelPlan(Collection<ChannelPlan> values) {
    getChannelPlan().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this Allocation record.
   * <p>
   * This method builds the exported {@link #channelPlanRef} field with values
   * from the transient {@link #channelPlan} field. This method should typically
   * be called after the Allocation is configured and (optionally) before
   * exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    this.channelPlanRef = new HashSet<>();
    for (ChannelPlan instance : getChannelPlan()) {
      this.channelPlanRef.add(instance.getSerial());
    }
  }

  /**
   * Update the SSRF data type references in this Allocation record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #channelPlan} with values from the
   * imported {@link #channelPlanRef} field. This method should typically be
   * called after the Allocation is imported from XML.
   * <p>
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (channelPlanRef == null || channelPlanRef.isEmpty()) {
      return;
    }
    for (ChannelPlan instance : root.getChannelPlan()) {
      if (channelPlanRef.contains(instance.getSerial())) {
        getChannelPlan().add(instance);
      }
    }
  }//</editor-fold>

}
