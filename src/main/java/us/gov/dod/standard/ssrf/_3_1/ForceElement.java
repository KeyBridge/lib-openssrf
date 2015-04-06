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

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.allotment.POCInformation;
import us.gov.dod.standard.ssrf._3_1.antenna.Nomenclature;
import us.gov.dod.standard.ssrf._3_1.forceelement.Assets;
import us.gov.dod.standard.ssrf._3_1.forceelement.StockNum;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.*;

/**
 * ForceElement is used to describe any Unit or Platform that has the ability to
 * transmit or receive RF signals.
 * <p>
 * Sub-Elements are
 * {@link Assets}, {@link Nomenclature}, {@link POCInformation}, {@link StockNum}
 * <p>
 * Example:
 * <pre>
 * &lt;ForceElement&gt;
 *   &lt;Serial cls="U"&gt;USA:NA:FE:123&lt;/Serial&gt;
 *   &lt;Type cls="U"&gt;PLatform&lt;/Type&gt;
 *   &lt;OwningCountry cls="U"&gt;USA&lt;/OwningCountry&gt;
 *   &lt;Identifier&gt;
 *     &lt;Level cls="U"&gt;Primary&lt;/Level&gt;
 *     &lt;Name cls="U"&gt;USS Nimitz&lt;/Name&gt;
 *   &lt;/Identifier&gt;
 *   &lt;Assets_etc/&gt;
 *   &lt;/ForceElement&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForceElement", propOrder = {
  "reviewDate",
  "type",
  "uic",
  "owningCountry",
  "owningOrganisationRef",
  "role",
  "platform",
  "missionCode",
  "cmdLevel",
  "pocInformation",
  "assets",
  "nomenclature",
  "stockNum"
})
public class ForceElement extends Common<ForceElement> {

  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ReviewDate", required = false)
  private D reviewDate;
  /**
   * Type - Type (Required)
   * <p>
   * If the Force Element is a Unit or a Platform.
   * <p>
   * Format is L:CFE
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * UIC - Unit Identification Code (Optional)
   * <p>
   * An organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "UIC", required = false)
  private S20 uic;
  /**
   * OwningCountry - Owning Country/Body (Optional)
   * <p>
   * The owning country or body of the ForceElement.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OwningCountry", required = false)
  private TString owningCountry;
  /**
   * OwningOrganisation - Owning Organisation (Optional)
   * <p>
   * A reference to the organisation that owns the ForceElement.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "OwningOrganisation", required = false)
  private Serial owningOrganisationRef;
  /**
   * Role - Role (Optional)
   * <p>
   * The code used to document the main role of the Force Element. This role may
   * be used to derive what equipment (i.e., weapons systems, signal, platforms,
   * etc.) the Force Element is authorised. Also referred to as the Table of
   * Organisation and Equipment (TOE).
   * <p>
   * Format is L:CSR
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Role", required = false)
  private TString role;
  /**
   * Platform - Platform Type (Optional)
   * <p>
   * The type of platform.
   * <p>
   * Format is L:CET
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Platform", required = false)
  private TString platform;
  /**
   * MissionCode - Mission Code (Optional)
   * <p>
   * The mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc).
   * <p>
   * Format is L:CMC
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MissionCode", required = false)
  private TString missionCode;
  /**
   * CmdLevel - Command Level (Optional)
   * <p>
   * The organisational level of the force element according to stratum, echelon
   * or point at which authority or control is maintained.
   * <p>
   * Format is L:CLC
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CmdLevel", required = false)
  private TString cmdLevel;
  /**
   * POCInformation (Optional)
   * <p>
   * POCInformation contains a reference to a Contact, Organisation or Role
   * dataset.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "POCInformation")
  private Set<POCInformation> pocInformation;
  /**
   * Assets (Optional)
   * <p>
   * Assets indicates the authorised and available quantity of the equipment, RF
   * systems, or other Force Elements used or owned by the Force Element.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Assets")
  private Set<Assets> assets;
  /**
   * Nomenclature (Required)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Nomenclature", required = true)
  private Set<Nomenclature> nomenclature;
  /**
   * US:StockNum (Optional)
   * <p>
   * StockNum (US) provides the equipment stock number and indicates the type of
   * stock number.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StockNum")
  private Set<StockNum> stockNum;

  /**
   * No arg constructor. Initializes the Common required fields.
   */
  public ForceElement() {
    super();
  }

  /**
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getReviewDate() {
    return reviewDate;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setReviewDate(D value) {
    this.reviewDate = value;
  }

  /**
   * Determine if the ReviewDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReviewDate() {
    return (this.reviewDate != null ? this.reviewDate.isSetValue() : false);
  }

  /**
   * Get if the Force Element is a Unit or a Platform..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set if the Force Element is a Unit or a Platform..
   * <p>
   * @param value the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getUIC() {
    return uic;
  }

  /**
   * Set an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setUIC(S20 value) {
    this.uic = value;
  }

  /**
   * Determine if the UIC is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetUIC() {
    return (this.uic != null ? this.uic.isSetValue() : false);
  }

  /**
   * Get the owning country or body of the ForceElement..
   * <p>
   * @return the OwningCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getOwningCountry() {
    return owningCountry;
  }

  /**
   * Set the owning country or body of the ForceElement..
   * <p>
   * @param value the OwningCountry value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setOwningCountry(TString value) {
    this.owningCountry = value;
  }

  /**
   * Determine if the OwningCountry is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwningCountry() {
    return (this.owningCountry != null ? this.owningCountry.isSetValue() : false);
  }

  /**
   * Get a reference to the organisation that owns the ForceElement..
   * <p>
   * @return a {@link Serial} instance
   * @since 3.1.0
   */
  public Serial getOwningOrganisationRef() {
    return owningOrganisationRef;
  }

  /**
   * Set a reference to the organisation that owns the ForceElement..
   * <p>
   * @param value a {@link Serial} instance
   * @since 3.1.0
   */
  public void setOwningOrganisationRef(Serial value) {
    this.owningOrganisationRef = value;
  }

  /**
   * Determine if the OwningOrganisation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwningOrganisationRef() {
    return (this.owningOrganisationRef != null ? this.owningOrganisationRef.isSetValue() : false);
  }

  /**
   * Get the code used to document the main role of the Force Element. This role
   * may be used to derive what equipment (i.e., weapons systems, signal,
   * platforms, etc.) the Force Element is authorised. Also referred to as the
   * Table of Organisation and Equipment (TOE)..
   * <p>
   * @return the Role value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getRole() {
    return role;
  }

  /**
   * Set the code used to document the main role of the Force Element. This role
   * may be used to derive what equipment (i.e., weapons systems, signal,
   * platforms, etc.) the Force Element is authorised. Also referred to as the
   * Table of Organisation and Equipment (TOE)..
   * <p>
   * @param value the Role value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setRole(TString value) {
    this.role = value;
  }

  /**
   * Determine if the Role is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRole() {
    return (this.role != null ? this.role.isSetValue() : false);
  }

  /**
   * Get the type of platform..
   * <p>
   * @return the Platform value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPlatform() {
    return platform;
  }

  /**
   * Set the type of platform..
   * <p>
   * @param value the Platform value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPlatform(TString value) {
    this.platform = value;
  }

  /**
   * Determine if the Platform is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPlatform() {
    return (this.platform != null ? this.platform.isSetValue() : false);
  }

  /**
   * Get the mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc)..
   * <p>
   * @return the MissionCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getMissionCode() {
    return missionCode;
  }

  /**
   * Set the mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc)..
   * <p>
   * @param value the MissionCode value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setMissionCode(TString value) {
    this.missionCode = value;
  }

  /**
   * Determine if the MissionCode is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMissionCode() {
    return (this.missionCode != null ? this.missionCode.isSetValue() : false);
  }

  /**
   * Get the organisational level of the force element according to stratum,
   * echelon or point at which authority or control is maintained..
   * <p>
   * @return the CmdLevel value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCmdLevel() {
    return cmdLevel;
  }

  /**
   * Set the organisational level of the force element according to stratum,
   * echelon or point at which authority or control is maintained..
   * <p>
   * @param value the CmdLevel value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCmdLevel(TString value) {
    this.cmdLevel = value;
  }

  /**
   * Determine if the CmdLevel is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCmdLevel() {
    return (this.cmdLevel != null ? this.cmdLevel.isSetValue() : false);
  }

  /**
   * Get the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset..
   * <p>
   * @return a {@link POCInformation} instance
   * @since 3.1.0
   */
  public Set<POCInformation> getPOCInformation() {
    if (pocInformation == null) {
      pocInformation = new HashSet<>();
    }
    return this.pocInformation;
  }

  /**
   * Determine if the POCInformation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPOCInformation() {
    return ((this.pocInformation != null) && (!this.pocInformation.isEmpty()));
  }

  /**
   * Clear the POCInformation field. This sets the field to null.
   */
  public void unsetPOCInformation() {
    this.pocInformation = null;
  }

  /**
   * Get the Assets
   * <p>
   * Complex element Assets indicates the authorised and available quantity of
   * the equipment, RF systems, or other Force Elements used or owned by the
   * Force Element..
   * <p>
   * @return a {@link Assets} instance
   * @since 3.1.0
   */
  public Set<Assets> getAssets() {
    if (assets == null) {
      assets = new HashSet<>();
    }
    return this.assets;
  }

  /**
   * Determine if the Assets is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAssets() {
    return ((this.assets != null) && (!this.assets.isEmpty()));
  }

  /**
   * Clear the Assets field. This sets the field to null.
   */
  public void unsetAssets() {
    this.assets = null;
  }

  /**
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number..
   * <p>
   * @return a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public Set<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new HashSet<>();
    }
    return this.nomenclature;
  }

  /**
   * Determine if the Nomenclature is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Get the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number..
   * <p>
   * @return a {@link StockNum} instance
   * @since 3.1.0
   */
  public Set<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new HashSet<>();
    }
    return this.stockNum;
  }

  /**
   * Determine if the StockNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStockNum() {
    return ((this.stockNum != null) && (!this.stockNum.isEmpty()));
  }

  /**
   * Clear the StockNum field. This sets the field to null.
   */
  public void unsetStockNum() {
    this.stockNum = null;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withReviewDate(Calendar value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withReviewDate(Date value) {
    setReviewDate(new D(value));
    return this;
  }

  /**
   * Set if the Force Element is a Unit or a Platform.
   * <p>
   * @param value An instances of type {@link ListCFE}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withType(ListCFE value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set an organisational identifier that may be used to uniquely identify an
   * organisation in operational planning systems and other non-spectrum
   * information systems.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withUIC(String value) {
    setUIC(new S20(value));
    return this;
  }

  /**
   * Set the owning country or body of the ForceElement.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withOwningCountry(ListCAO value) {
    setOwningCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set a reference to the organisation that owns the ForceElement.
   * <p>
   * @param value An instances of type {@link Serial}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withOwningOrganisationRef(Serial value) {
    setOwningOrganisationRef(value);
    return this;
  }

  /**
   * Set the code used to document the main role of the Force Element. This role
   * may be used to derive what equipment (i.e., weapons systems, signal,
   * platforms, etc.) the Force Element is authorised. Also referred to as the
   * Table of Organisation and Equipment (TOE).
   * <p>
   * @param value An instances of type {@link ListCSR}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withRole(ListCSR value) {
    setRole(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of platform.
   * <p>
   * @param value An instances of type {@link ListCET}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withPlatform(ListCET value) {
    setPlatform(new TString(value.value()));
    return this;
  }

  /**
   * Set the mission code representing the primary mission of the Force Element
   * (e.g.,Training, Finance, etc).
   * <p>
   * @param value An instances of type {@link ListCMC}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withMissionCode(ListCMC value) {
    setMissionCode(new TString(value.value()));
    return this;
  }

  /**
   * Set the organisational level of the force element according to stratum,
   * echelon or point at which authority or control is maintained.
   * <p>
   * @param value An instances of type {@link ListCLC}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withCmdLevel(ListCLC value) {
    setCmdLevel(new TString(value.value()));
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values One or more instances of type {@link POCInformation...}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withPOCInformation(POCInformation... values) {
    if (values != null) {
      getPOCInformation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the POCInformation
   * <p>
   * Complex element POCInformation contains a reference to a Contact,
   * Organisation or Role dataset.
   * <p>
   * @param values A collection of {@link POCInformation} instances
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withPOCInformation(Collection<POCInformation> values) {
    if (values != null) {
      getPOCInformation().addAll(values);
    }
    return this;
  }

  /**
   * Set the Assets
   * <p>
   * Complex element Assets indicates the authorised and available quantity of
   * the equipment, RF systems, or other Force Elements used or owned by the
   * Force Element.
   * <p>
   * @param values One or more instances of type {@link Assets...}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withAssets(Assets... values) {
    if (values != null) {
      getAssets().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Assets
   * <p>
   * Complex element Assets indicates the authorised and available quantity of
   * the equipment, RF systems, or other Force Elements used or owned by the
   * Force Element.
   * <p>
   * @param values A collection of {@link Assets} instances
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withAssets(Collection<Assets> values) {
    if (values != null) {
      getAssets().addAll(values);
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values One or more instances of type {@link Nomenclature...}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @param values One or more instances of type {@link StockNum...}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the US:StockNum
   * <p>
   * Complex element StockNum (US) provides the equipment stock number and
   * indicates the type of stock number.
   * <p>
   * @param values A collection of {@link StockNum} instances
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ForceElement instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ForceElement {"
           + (assets != null ? " assets [" + assets + "]" : "")
           + (cmdLevel != null ? " cmdLevel [" + cmdLevel + "]" : "")
           + (missionCode != null ? " missionCode [" + missionCode + "]" : "")
           + (nomenclature != null ? " nomenclature [" + nomenclature + "]" : "")
           + (owningCountry != null ? " owningCountry [" + owningCountry + "]" : "")
           + (owningOrganisation != null ? " owningOrganisation [" + owningOrganisation + "]" : "")
           + (platform != null ? " platform [" + platform + "]" : "")
           + (pocInformation != null ? " pocInformation [" + pocInformation + "]" : "")
           + (reviewDate != null ? " reviewDate [" + reviewDate + "]" : "")
           + (role != null ? " role [" + role + "]" : "")
           + (stockNum != null ? " stockNum [" + stockNum + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + (uic != null ? " uic [" + uic + "]" : "")
           + "}\n  ForceElement." + super.toString() + "\n";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ForceElement} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link Set<Nomenclature> Nomenclature}, {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetNomenclature() && isSetType();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  @XmlTransient
  private Organisation owningOrganisation;

  /**
   * Get .
   * <p>
   * @return a {@link Organisation} instance
   * @since 3.1.0
   */
  public Organisation getOwningOrganisation() {
    return owningOrganisation;
  }

  /**
   * Determine if the owningOrganisation field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwningOrganisation() {
    return this.owningOrganisation != null;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Organisation}.
   * @return The current ForceElement object instance.
   * @since 3.1.0
   */
  public ForceElement withOwningOrganisation(Organisation value) {
    this.owningOrganisation = value;
    return this;
  }

  /**
   * Update the SSRF data type references in this ForceElement record.
   * <p>
   * This method builds the exported {@link #owningOrganisationRef} field with
   * values from the transient {@link #owningOrganisation} field. This method
   * should typically be called after the ForceElement is configured and
   * (optionally) before exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void prepare() {
    super.prepare();
    this.owningOrganisationRef = owningOrganisation != null ? owningOrganisation.getSerial() : this.owningOrganisationRef;
  }

  /**
   * Update the SSRF data type references in this ForceElement record after
   * loading from XML.
   * <p>
   * This method builds the transient {@link #owningOrganisation} with values
   * from the imported {@link #owningOrganisationRef} field. This method should
   * typically be called after the ForceElement is imported from XML. * @param
   * root the SSRF root instance.
   * <p>
   * @since 3.1.0
   */
  @Override
  public void postLoad(SSRF root) {
    if (owningOrganisationRef == null || !owningOrganisationRef.isSetValue()) {
      return;
    }
    for (Organisation instance : root.getOrganisation()) {
      if (owningOrganisationRef.equals(instance.getSerial())) {
        owningOrganisation = instance;
        return;
      }
    }
  }//</editor-fold>

}
