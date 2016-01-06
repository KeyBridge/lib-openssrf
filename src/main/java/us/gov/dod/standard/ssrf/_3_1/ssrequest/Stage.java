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
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.D;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.MEMO;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.UN9;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSG;
import us.gov.dod.standard.ssrf._3_1.ssreply.StageLocation;

/**
 * Stage contains information about the life-cycle management of the system.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * Sub-Element is {@link StageLocation}
 * <p>
 * Example:
 * <pre>
 * &lt;Stage&gt;
 *   &lt;Type cls="U"&gt;Experimental&lt;/Type&gt;
 *   &lt;StartDate cls="U"&gt;2004-01-01&lt;/StartDate&gt;
 *   &lt;TargetDate cls="U"&gt;2005-01-01&lt;/TargetDate&gt;
 *   &lt;DateApprovalRequired cls="U"&gt;2003-01-01&lt;/DateApprovalRequired&gt;
 *   &lt;TerminationDate cls="U"&gt;2009-01-01&lt;/TerminationDate&gt;
 *   &lt;NumEquip cls="U"&gt;2000&lt;/NumEquip&gt;
 * &lt;/Stage&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stage", propOrder = {
  "type",
  "startDate",
  "targetDate",
  "dateApprovalRequired",
  "terminationDate",
  "numEquip",
  "geoDescription",
  "stageLocation"
})
public class Stage {

  /**
   * Type - Stage (Required)
   * <p>
   * The stage.
   * <p>
   * Format is L:CSG
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * StartDate - Start Date (Optional)
   * <p>
   * The date upon which work will commence on this stage.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StartDate", required = false)
  private D startDate;
  /**
   * TargetDate - Target Date (Optional)
   * <p>
   * The date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TargetDate", required = false)
  private D targetDate;
  /**
   * DateApprovalRequired - Desired Approval Date (Optional)
   * <p>
   * The date by which the approval of the application is desired
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DateApprovalRequired", required = false)
  private D dateApprovalRequired;
  /**
   * TerminationDate - Termination Date (Optional)
   * <p>
   * The date this stage is expected to terminate. For a stage 2 application the
   * date entered is the date when the system is expected to enter stage 3. The
   * date may be an estimate.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TerminationDate", required = false)
  private D terminationDate;
  /**
   * NumEquip - Number of Equipment (Optional)
   * <p>
   * The total number of units to be built, procured or used during this stage.
   * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumEquip", required = false)
  private UN9 numEquip;
  /**
   * US:GeoDescription - Geographic Description (Optional)
   * <p>
   * A textual description of the geographic locations where this equipment will
   * be used during this stage.
   * <p>
   * Format is Memo
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "GeoDescription", required = false)
  private MEMO geoDescription;
  /**
   * StageLocation (Optional)
   * <p>
   * StageLocation defines locations where the equipment or system is allowed or
   * forbidden from use.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StageLocation")
  private Set<StageLocation> stageLocation;

  /**
   * Get the stage..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the stage..
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
   * Get the date upon which work will commence on this stage..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getStartDate() {
    return startDate;
  }

  /**
   * Set the date upon which work will commence on this stage..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setStartDate(D value) {
    this.startDate = value;
  }

  /**
   * Determine if the StartDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStartDate() {
    return (this.startDate != null ? this.startDate.isSetValue() : false);
  }

  /**
   * Get the date by which a usable version of the system is expected to be
   * available for testing or deployment..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getTargetDate() {
    return targetDate;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setTargetDate(D value) {
    this.targetDate = value;
  }

  /**
   * Determine if the TargetDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTargetDate() {
    return (this.targetDate != null ? this.targetDate.isSetValue() : false);
  }

  /**
   * Get the date by which the approval of the application is desired.
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getDateApprovalRequired() {
    return dateApprovalRequired;
  }

  /**
   * Set the date by which the approval of the application is desired.
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setDateApprovalRequired(D value) {
    this.dateApprovalRequired = value;
  }

  /**
   * Determine if the DateApprovalRequired is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateApprovalRequired() {
    return (this.dateApprovalRequired != null ? this.dateApprovalRequired.isSetValue() : false);
  }

  /**
   * Get the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getTerminationDate() {
    return terminationDate;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setTerminationDate(D value) {
    this.terminationDate = value;
  }

  /**
   * Determine if the TerminationDate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTerminationDate() {
    return (this.terminationDate != null ? this.terminationDate.isSetValue() : false);
  }

  /**
   * Get the total number of units to be built, procured or used during this
   * stage..
   * <p>
   * @return a {@link UN9} instance
   * @since 3.1.0
   */
  public UN9 getNumEquip() {
    return numEquip;
  }

  /**
   * Set the total number of units to be built, procured or used during this
   * stage..
   * <p>
   * @param value a {@link UN9} instance
   * @since 3.1.0
   */
  public void setNumEquip(UN9 value) {
    this.numEquip = value;
  }

  /**
   * Determine if the NumEquip is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumEquip() {
    return (this.numEquip != null ? this.numEquip.isSetValue() : false);
  }

  /**
   * Get a textual description of the geographic locations where this equipment
   * will be used during this stage..
   * <p>
   * @return a {@link MEMO} instance
   * @since 3.1.0
   */
  public MEMO getGeoDescription() {
    return geoDescription;
  }

  /**
   * Set a textual description of the geographic locations where this equipment
   * will be used during this stage..
   * <p>
   * @param value a {@link MEMO} instance
   * @since 3.1.0
   */
  public void setGeoDescription(MEMO value) {
    this.geoDescription = value;
  }

  /**
   * Determine if the GeoDescription is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetGeoDescription() {
    return (this.geoDescription != null ? this.geoDescription.isSetValue() : false);
  }

  /**
   * Get the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use..
   * <p>
   * @return a {@link StageLocation} instance
   * @since 3.1.0
   */
  public Set<StageLocation> getStageLocation() {
    if (stageLocation == null) {
      stageLocation = new HashSet<>();
    }
    return this.stageLocation;
  }

  /**
   * Determine if the StageLocation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStageLocation() {
    return ((this.stageLocation != null) && (!this.stageLocation.isEmpty()));
  }

  /**
   * Clear the StageLocation field. This sets the field to null.
   */
  public void unsetStageLocation() {
    this.stageLocation = null;
  }

  /**
   * Set the stage.
   * <p>
   * @param value An instances of type {@link ListCSG}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withType(ListCSG value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the date upon which work will commence on this stage.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withStartDate(Calendar value) {
    setStartDate(new D(value));
    return this;
  }

  /**
   * Set the date upon which work will commence on this stage.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withStartDate(Date value) {
    setStartDate(new D(value));
    return this;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withTargetDate(Calendar value) {
    setTargetDate(new D(value));
    return this;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withTargetDate(Date value) {
    setTargetDate(new D(value));
    return this;
  }

  /**
   * Set the date by which the approval of the application is desired
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withDateApprovalRequired(Calendar value) {
    setDateApprovalRequired(new D(value));
    return this;
  }

  /**
   * Set the date by which the approval of the application is desired
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withDateApprovalRequired(Date value) {
    setDateApprovalRequired(new D(value));
    return this;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withTerminationDate(Calendar value) {
    setTerminationDate(new D(value));
    return this;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withTerminationDate(Date value) {
    setTerminationDate(new D(value));
    return this;
  }

  /**
   * Set the total number of units to be built, procured or used during this
   * stage.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withNumEquip(Integer value) {
    setNumEquip(new UN9(value));
    return this;
  }

  /**
   * Set a textual description of the geographic locations where this equipment
   * will be used during this stage.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withGeoDescription(String value) {
    setGeoDescription(new MEMO(value));
    return this;
  }

  /**
   * Set the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @param values One or more instances of type {@link StageLocation...}.
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withStageLocation(StageLocation... values) {
    if (values != null) {
      getStageLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @param values A collection of {@link StageLocation} instances
   * @return The current Stage object instance.
   * @since 3.1.0
   */
  public Stage withStageLocation(Collection<StageLocation> values) {
    if (values != null) {
      getStageLocation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this Stage instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  Stage {"
           + (dateApprovalRequired != null ? " dateApprovalRequired [" + dateApprovalRequired + "]" : "")
           + (geoDescription != null ? " geoDescription [" + geoDescription + "]" : "")
           + (numEquip != null ? " numEquip [" + numEquip + "]" : "")
           + (stageLocation != null ? " stageLocation [" + stageLocation + "]" : "")
           + (startDate != null ? " startDate [" + startDate + "]" : "")
           + (targetDate != null ? " targetDate [" + targetDate + "]" : "")
           + (terminationDate != null ? " terminationDate [" + terminationDate + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Stage} requires {@link TString Type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetType();
  }

}
