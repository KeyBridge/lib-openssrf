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
package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCY;
import us.gov.dod.standard.ssrf._3_1.toa.Allocation;
import us.gov.dod.standard.ssrf._3_1.toa.Country;
import us.gov.dod.standard.ssrf._3_1.toa.Footnote;
import us.gov.dod.standard.ssrf._3_1.toa.FreqBand;

/**
 * TOA is the XML root for all parameters of a Table of Allocations. It inherits
 * attributes and sub-elements from element Common.
 * <p>
 * Sub-Elements are {@link Country}, {@link Footnote}, {@link FreqBand}
 * <p>
 * Example:
 * <pre>
 * &lt;TOA cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:TA:1&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Administration cls="U"&gt;NTIA&lt;/Administration&gt;
 *   &lt;FreqBand&gt;
 *     &lt;FreqMin cls="U"&gt;230&lt;/FreqMin&gt;
 *     &lt;FreqMax cls="U"&gt;400&lt;/FreqMax&gt;
 *     &lt;Allocation&gt;
 *       &lt;AllocatedService cls="U"&gt;Mobile Service&lt;/AllocatedService&gt;
 *       &lt;Priority cls="U"&gt;Primary&lt;/Priority&gt;
 *     &lt;/Allocation&gt;
 *   &lt;/FreqBand&gt;
 * &lt;/TOA&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOA", propOrder = {
  "administration",
  "channelPlanRef",
  "country",
  "effectiveDate",
  "expirationDate",
  "footnote",
  "freqBand",
  "title"
})
@XmlRootElement
public class TOA extends Common<TOA> {

  /**
   * Administration - Administration (Required)
   * <p>
   * The nation or regulatory body that administers this Table of Allocations.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "Administration", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString administration;
  /**
   * EffectiveDate - Effective Date (Optional)
   * <p>
   * The date by which the dataset is to be operational or effective.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "EffectiveDate", required = false)
  private TDate effectiveDate;
  /**
   * ExpirationDate - Expiration Date (Optional)
   * <p>
   * The date at which the dataset will expire. The Expiration date should be
   * less than five years from current date.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "ExpirationDate", required = false)
  private TDate expirationDate;
  /**
   * Title - Title (Optional)
   * <p>
   * An identifying name for this Table of Allocations.
   * <p>
   * Format is S100
   */
  @XmlElement(name = "Title", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS100.class)
  private TString title;
  /**
   * Footnote (Optional)
   * <p>
   * Footnote contains the text and identifier of a Footnote, FCC Rule Part
   * Number, Band User (e.g., "Military", "Civil Support Team"). or Band
   * Application (e.g., "Wind Profiler").
   */
  @XmlElement(name = "Footnote")
  private Set<Footnote> footnote;
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef refers to a ChannelPlan.
   */
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private Set<TSerial> channelPlanRef;
  /**
   * Country (Optional)
   * <p>
   * Country indicates the country or area for which this Table of Allocations
   * is in force.
   */
  @XmlElement(name = "Country", nillable = true)
  private Set<Country> country;
  /**
   * FreqBand (Required)
   * <p>
   * FreqBand contains the allocation of a specific frequency band to
   * radiocommunication services. It may also provide additional information
   * such as the specification of the rights and responsibilities of a user.
   */
  @XmlElement(name = "FreqBand", required = true)
  private Set<FreqBand> freqBand;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public TOA() {
    super();
  }

  /**
   * Get the nation or regulatory body that administers this Table of
   * Allocations.
   * <p>
   * @return the Administration value in a {@link TString} data type
   */
  public TString getAdministration() {
    return administration;
  }

  /**
   * Set the nation or regulatory body that administers this Table of
   * Allocations.
   * <p>
   * @param value the Administration value in a {@link TString} data type
   */
  public void setAdministration(TString value) {
    this.administration = value;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return (this.administration != null ? this.administration.isSetValue() : false);
  }

  /**
   * Get the date by which the dataset is to be operational or effective.
   * <p>
   * @return the EffectiveDate value in a {@link TDate} data type
   */
  public TDate getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value the EffectiveDate value in a {@link TDate} data type
   */
  public void setEffectiveDate(TDate value) {
    this.effectiveDate = value;
  }

  /**
   * Determine if the EffectiveDate is configured.
   * <p>
   * If configured this method also inspects the {@link TDate} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEffectiveDate() {
    return (this.effectiveDate != null ? this.effectiveDate.isSetValue() : false);
  }

  /**
   * Get the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @return the ExpirationDate value in a {@link TDate} data type
   */
  public TDate getExpirationDate() {
    return expirationDate;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value the ExpirationDate value in a {@link TDate} data type
   */
  public void setExpirationDate(TDate value) {
    this.expirationDate = value;
  }

  /**
   * Determine if the ExpirationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TDate} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExpirationDate() {
    return (this.expirationDate != null ? this.expirationDate.isSetValue() : false);
  }

  /**
   * Get an identifying name for this Table of Allocations.
   * <p>
   * @return the Title value in a {@link TString} data type
   */
  public TString getTitle() {
    return title;
  }

  /**
   * Set an identifying name for this Table of Allocations.
   * <p>
   * @param value the Title value in a {@link TString} data type
   */
  public void setTitle(TString value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTitle() {
    return (this.title != null ? this.title.isSetValue() : false);
  }

  /**
   * Get the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @return a non-null but possibly empty list of {@link Footnote} instances
   */
  public Set<Footnote> getFootnote() {
    if (footnote == null) {
      footnote = new TreeSet<>();
    }
    return this.footnote;
  }

  /**
   * Determine if the Footnote is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFootnote() {
    return ((this.footnote != null) && (!this.footnote.isEmpty()));
  }

  /**
   * Clear the Footnote field. This sets the field to null.
   */
  public void unsetFootnote() {
    this.footnote = null;
  }

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @return a non-null but possibly empty list of {@link TString} instances
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getChannelPlan()} instead.
   */
  @Deprecated
  public Set<TSerial> getChannelPlanRef() {
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
   * Get the Country
   * <p>
   * Complex element Country indicates the country or area for which this Table
   * of Allocations is in force.
   * <p>
   * @return a non-null but possibly empty list of {@link Country} instances
   */
  public Set<Country> getCountry() {
    if (country == null) {
      country = new HashSet<>();
    }
    return this.country;
  }

  /**
   * Determine if the Country is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCountry() {
    return ((this.country != null) && (!this.country.isEmpty()));
  }

  /**
   * Clear the Country field. This sets the field to null.
   */
  public void unsetCountry() {
    this.country = null;
  }

  /**
   * Get the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @return a non-null but possibly empty list of {@link FreqBand} instances
   */
  public Set<FreqBand> getFreqBand() {
    if (freqBand == null) {
      freqBand = new TreeSet<>();
    }
    return this.freqBand;
  }

  /**
   * Determine if the FreqBand is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqBand() {
    return ((this.freqBand != null) && (!this.freqBand.isEmpty()));
  }

  /**
   * Clear the FreqBand field. This sets the field to null.
   */
  public void unsetFreqBand() {
    this.freqBand = null;
  }

  /**
   * Set the nation or regulatory body that administers this Table of
   * Allocations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TOA object instance
   */
  public TOA withAdministration(String value) {
    setAdministration(new TString(value));
    return this;
  }

  /**
   * Set the nation or regulatory body that administers this Table of
   * Allocations.
   * <p>
   * @param value An instances of type {@link ListCCY}
   * @return The current TOA object instance
   */
  public TOA withAdministration(ListCCY value) {
    setAdministration(new TString(value.name()));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current TOA object instance
   */
  public TOA withEffectiveDate(Calendar value) {
    setEffectiveDate(new TDate(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current TOA object instance
   */
  public TOA withEffectiveDate(Date value) {
    setEffectiveDate(new TDate(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current TOA object instance
   */
  public TOA withExpirationDate(Calendar value) {
    setExpirationDate(new TDate(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current TOA object instance
   */
  public TOA withExpirationDate(Date value) {
    setExpirationDate(new TDate(value));
    return this;
  }

  /**
   * Set an identifying name for this Table of Allocations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TOA object instance
   */
  public TOA withTitle(String value) {
    setTitle(new TString(value));
    return this;
  }

  /**
   * Set the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @param values One or more instances of type {@link Footnote}
   * @return The current TOA object instance
   */
  public TOA withFootnote(Footnote... values) {
    withFootnote(new HashSet<>(Arrays.asList(values)));
    return this;
  }

  /**
   * Set the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @param values A collection of {@link Footnote} instances
   * @return The current TOA object instance
   */
  public TOA withFootnote(Set<Footnote> values) {
    if (values != null && !values.isEmpty()) {
      getFootnote().addAll(values);
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link TString}
   * @return The current TOA object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public TOA withChannelPlanRef(TSerial... values) {
    if (values != null) {
      getChannelPlanRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values A collection of {@link TString} instances
   * @return The current TOA object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public TOA withChannelPlanRef(Set<TSerial> values) {
    if (values != null) {
      getChannelPlanRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the Country
   * <p>
   * Complex element Country indicates the country or area for which this Table
   * of Allocations is in force.
   * <p>
   * @param values One or more instances of type {@link Country}
   * @return The current TOA object instance
   */
  public TOA withCountry(Country... values) {
    if (values != null) {
      getCountry().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the Country
   * <p>
   * Complex element Country indicates the country or area for which this Table
   * of Allocations is in force.
   * <p>
   * @param values A collection of {@link Country} instances
   * @return The current TOA object instance
   */
  public TOA withCountry(Set<Country> values) {
    if (values != null) {
      getCountry().addAll(values);
    }
    return this;
  }

  /**
   * Set the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @param values One or more instances of type {@link FreqBand}
   * @return The current TOA object instance
   */
  public TOA withFreqBand(FreqBand... values) {
    if (values != null) {
      getFreqBand().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @param values A collection of {@link FreqBand} instances
   * @return The current TOA object instance
   */
  public TOA withFreqBand(Set<FreqBand> values) {
    if (values != null) {
      getFreqBand().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this TOA instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TOA {"
           + (title != null ? "\n  title [" + title + "]" : "")
           + (expirationDate != null ? "\n  expirationDate [" + expirationDate + "]" : "")
           + (footnote != null ? "\n  footnote [" + footnote + "]" : "")
           + (channelPlanRef != null ? "\n  channelPlanRef [" + channelPlanRef + "]" : "")
           + (effectiveDate != null ? "\n  effectiveDate [" + effectiveDate + "]" : "")
           + (freqBand != null ? "\n  freqBand [" + freqBand + "]" : "")
           + (administration != null ? "\n  administration [" + administration + "]" : "")
           + (country != null ? "\n  country [" + country + "]" : "")
           + "\n  TOA." + super.toString() + "\n"
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TOA} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TDate EntryDateTime}
   * and {@link TString Administration}, {@link FreqBand FreqBand}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAdministration() && isSetFreqBand();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Set<ChannelPlan> channelPlan;

  /**
   * Get the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @return a non-null {@link HashSet} instance.
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
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withChannelPlan(ChannelPlan... values) {
    return withChannelPlan(new HashSet<>(Arrays.asList(values)));
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withChannelPlan(Set<ChannelPlan> values) {
    getChannelPlan().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this TOA record.
   * <p>
   * This method builds the exported {@link #channelPlanRef} field with values
   * from the transient {@link #channelPlan} field.
   * <p>
   * This method also copies all footnotes from the FreqBand and Allocation
   * records.
   * <p>
   * This method should typically be called after the TOA is configured and
   * (optionally) before exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    if (channelPlan != null && !channelPlan.isEmpty()) {
      this.channelPlanRef = new HashSet<>();
      for (ChannelPlan instance : getChannelPlan()) {
        this.channelPlanRef.add(instance.getSerial());
      }
    }
    for (FreqBand fb : getFreqBand()) {
      getFootnote().addAll(fb.getFootnote());
      for (Allocation allocation : fb.getAllocation()) {
        footnote.addAll(allocation.getFootnote());
      }
    }
  }

  /**
   * Update the SSRF data type references in this TOA record after loading from
   * XML.
   * <p>
   * This method builds the transient {@link #channelPlan} with values from the
   * imported {@link #channelPlanRef} field. This method should typically be
   * called after the TOA is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    super.postLoad(root);
    if (channelPlanRef == null || channelPlanRef.isEmpty()) {
      return;
    }
    for (ChannelPlan instance : root.getChannelPlan()) {
      if (channelPlanRef.contains(instance.getSerial())) {
        channelPlan.add(instance);
      }
    }
  }//</editor-fold>
}
