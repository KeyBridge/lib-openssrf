package us.gov.dod.standard.ssrf._3_1;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOA", propOrder = {
  "administration",
  "effectiveDate",
  "expirationDate",
  "title",
  "footnote",
  "channelPlanRef",
  "country",
  "freqBand"
})
public class TOA extends Common<TOA> {

  /**
   * Administration - Administration (Required)
   * <p>
   * The nation or regulatory body that administers this Table of Allocations.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Administration", required = true)
  private S50 administration;
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
   * Title - Title (Optional)
   * <p>
   * An identifying name for this Table of Allocations.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = false)
  private S100 title;
  /**
   * Footnote (Optional)
   * <p>
   * Footnote contains the text and identifier of a Footnote, FCC Rule Part
   * Number, Band User (e.g., "Military", "Civil Support Team"). or Band
   * Application (e.g., "Wind Profiler").
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Footnote")
  private Set<Footnote> footnote;
  /**
   * ChannelPlanRef (Optional)
   * <p>
   * ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ChannelPlanRef", nillable = true)
  private Set<Serial> channelPlanRef;
  /**
   * Country (Optional)
   * <p>
   * Country indicates the country or area for which this Table of Allocations
   * is in force.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Country", nillable = true)
  private Set<Country> country;
  /**
   * FreqBand (Required)
   * <p>
   * FreqBand contains the allocation of a specific frequency band to
   * radiocommunication services. It may also provide additional information
   * such as the specification of the rights and responsibilities of a user.
   * <p>
   * @since 3.1.0
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
   * Allocations..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getAdministration() {
    return administration;
  }

  /**
   * Set the nation or regulatory body that administers this Table of
   * Allocations..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setAdministration(S50 value) {
    this.administration = value;
  }

  /**
   * Determine if the Administration is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAdministration() {
    return (this.administration != null ? this.administration.isSetValue() : false);
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
   * Get an identifying name for this Table of Allocations..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getTitle() {
    return title;
  }

  /**
   * Set an identifying name for this Table of Allocations..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setTitle(S100 value) {
    this.title = value;
  }

  /**
   * Determine if the Title is configured.
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
   * or Band Application (e.g., "Wind Profiler")..
   * <p>
   * @return a {@link Footnote} instance
   * @since 3.1.0
   */
  public Set<Footnote> getFootnote() {
    if (footnote == null) {
      footnote = new HashSet<>();
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
   * Complex element ChannelPlanRef refers to a ChannelPlan..
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
   * Get the Country
   * <p>
   * Complex element Country indicates the country or area for which this Table
   * of Allocations is in force..
   * <p>
   * @return a {@link Country} instance
   * @since 3.1.0
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
   * a user..
   * <p>
   * @return a {@link FreqBand} instance
   * @since 3.1.0
   */
  public Set<FreqBand> getFreqBand() {
    if (freqBand == null) {
      freqBand = new HashSet<>();
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
   * @param value An instances of type {@link String}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withAdministration(String value) {
    setAdministration(new S50(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withEffectiveDate(Calendar value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be operational or effective.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withEffectiveDate(Date value) {
    setEffectiveDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withExpirationDate(Calendar value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set the date at which the dataset will expire. The Expiration date should
   * be less than five years from current date.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withExpirationDate(Date value) {
    setExpirationDate(new D(value));
    return this;
  }

  /**
   * Set an identifying name for this Table of Allocations.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withTitle(String value) {
    setTitle(new S100(value));
    return this;
  }

  /**
   * Set the Footnote
   * <p>
   * Complex element Footnote contains the text and identifier of a Footnote,
   * FCC Rule Part Number, Band User (e.g., "Military", "Civil Support Team").
   * or Band Application (e.g., "Wind Profiler").
   * <p>
   * @param values One or more instances of type {@link Footnote...}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withFootnote(Footnote... values) {
    if (values != null) {
      getFootnote().addAll(Arrays.asList(values));
    }
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
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withFootnote(Collection<Footnote> values) {
    if (values != null) {
      getFootnote().addAll(values);
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values One or more instances of type {@link ChannelPlanRef...}.
   * @return The current TOA object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public TOA withChannelPlanRef(Serial... values) {
    if (values != null) {
      getChannelPlanRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values A collection of {@link Serial} instances
   * @return The current TOA object instance.
   * @since 3.1.0
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withChannelPlan(ChannelPlan...)} instead.
   */
  @Deprecated
  public TOA withChannelPlanRef(Collection<Serial> values) {
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
   * @param values One or more instances of type {@link Country...}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withCountry(Country... values) {
    if (values != null) {
      getCountry().addAll(Arrays.asList(values));
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
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withCountry(Collection<Country> values) {
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
   * @param values One or more instances of type {@link FreqBand...}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withFreqBand(FreqBand... values) {
    if (values != null) {
      getFreqBand().addAll(Arrays.asList(values));
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
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withFreqBand(Collection<FreqBand> values) {
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
           + (administration != null ? " administration [" + administration + "]" : "")
           + (channelPlanRef != null ? " channelPlanRef [" + channelPlanRef + "]" : "")
           + (country != null ? " country [" + country + "]" : "")
           + (effectiveDate != null ? " effectiveDate [" + effectiveDate + "]" : "")
           + (expirationDate != null ? " expirationDate [" + expirationDate + "]" : "")
           + (footnote != null ? " footnote [" + footnote + "]" : "")
           + (freqBand != null ? " freqBand [" + freqBand + "]" : "")
           + (title != null ? " title [" + title + "]" : "")
           + "}\n  TOA." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TOA} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link S50 Administration}, {@link Set<FreqBand> FreqBand}.
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
   * Complex element ChannelPlanRef refers to a ChannelPlan..
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
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withChannelPlan(ChannelPlan... values) {
    return withChannelPlan(Arrays.asList(values));
  }

  /**
   * Set the ChannelPlanRef
   * <p>
   * Complex element ChannelPlanRef refers to a ChannelPlan.
   * <p>
   * @param values An instances of type {@link ChannelPlan}.
   * @return The current TOA object instance.
   * @since 3.1.0
   */
  public TOA withChannelPlan(Collection<ChannelPlan> values) {
    getChannelPlan().addAll(values);
    return this;
  }

  /**
   * Update the SSRF data type references in this TOA record.
   * <p>
   * This method builds the exported {@link #channelPlanRef} field with values
   * from the transient {@link #channelPlan} field. This method should typically
   * be called after the TOA is configured and (optionally) before exporting an
   * SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.channelPlanRef = new HashSet<>();
    for (ChannelPlan instance : getChannelPlan()) {
      this.channelPlanRef.add(instance.getSerial());
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
   * @param root the SSRF root instance.
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
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
