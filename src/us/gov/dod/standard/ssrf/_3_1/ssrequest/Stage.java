/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.ssrequest;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * StartDate - Start Date (Optional)
   * <p>
   * The date upon which work will commence on this stage.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "StartDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar startDate;
  /**
   * TargetDate - Target Date (Optional)
   * <p>
   * The date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "TargetDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar targetDate;
  /**
   * DateApprovalRequired - Desired Approval Date (Optional)
   * <p>
   * The date by which the approval of the application is desired
   * <p>
   * Format is Date
   */
  @XmlElement(name = "DateApprovalRequired", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar dateApprovalRequired;
  /**
   * TerminationDate - Termination Date (Optional)
   * <p>
   * The date this stage is expected to terminate. For a stage 2 application the
   * date entered is the date when the system is expected to enter stage 3. The
   * date may be an estimate.
   * <p>
   * Format is Date
   */
  @XmlElement(name = "TerminationDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar terminationDate;
  /**
   * NumEquip - Number of Equipment (Optional)
   * <p>
   * The total number of units to be built, procured or used during this stage.
   * <p>
   * Format is UN(9)
   */
  @XmlElement(name = "NumEquip", required = false)
  @XmlJavaTypeAdapter(type = TInteger.class, value = XmlAdapterUN9.class)
  private TInteger numEquip;
  /**
   * US:GeoDescription - Geographic Description (Optional)
   * <p>
   * A textual description of the geographic locations where this equipment will
   * be used during this stage.
   * <p>
   * Format is Memo
   */
  @XmlElement(name = "GeoDescription", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterMEMO.class)
  private TString geoDescription;
  /**
   * StageLocation (Optional)
   * <p>
   * StageLocation defines locations where the equipment or system is allowed or
   * forbidden from use.
   */
  @XmlElement(name = "StageLocation")
  private List<StageLocation> stageLocation;

  /**
   * Get the stage.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the stage.
   * <p>
   * @param value the Type value in a {@link TString} data type
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
   * Get the date upon which work will commence on this stage.
   * <p>
   * @return the StartDate value in a {@link TCalendar} data type
   */
  public TCalendar getStartDate() {
    return startDate;
  }

  /**
   * Set the date upon which work will commence on this stage.
   * <p>
   * @param value the StartDate value in a {@link TCalendar} data type
   */
  public void setStartDate(TCalendar value) {
    this.startDate = value;
  }

  /**
   * Determine if the StartDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStartDate() {
    return (this.startDate != null ? this.startDate.isSetValue() : false);
  }

  /**
   * Get the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @return the TargetDate value in a {@link TCalendar} data type
   */
  public TCalendar getTargetDate() {
    return targetDate;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @param value the TargetDate value in a {@link TCalendar} data type
   */
  public void setTargetDate(TCalendar value) {
    this.targetDate = value;
  }

  /**
   * Determine if the TargetDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTargetDate() {
    return (this.targetDate != null ? this.targetDate.isSetValue() : false);
  }

  /**
   * Get the date by which the approval of the application is desired
   * <p>
   * @return the DateApprovalRequired value in a {@link TCalendar} data type
   */
  public TCalendar getDateApprovalRequired() {
    return dateApprovalRequired;
  }

  /**
   * Set the date by which the approval of the application is desired
   * <p>
   * @param value the DateApprovalRequired value in a {@link TCalendar} data
   *              type
   */
  public void setDateApprovalRequired(TCalendar value) {
    this.dateApprovalRequired = value;
  }

  /**
   * Determine if the DateApprovalRequired is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDateApprovalRequired() {
    return (this.dateApprovalRequired != null ? this.dateApprovalRequired.isSetValue() : false);
  }

  /**
   * Get the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @return the TerminationDate value in a {@link TCalendar} data type
   */
  public TCalendar getTerminationDate() {
    return terminationDate;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @param value the TerminationDate value in a {@link TCalendar} data type
   */
  public void setTerminationDate(TCalendar value) {
    this.terminationDate = value;
  }

  /**
   * Determine if the TerminationDate is configured.
   * <p>
   * If configured this method also inspects the {@link TCalendar} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTerminationDate() {
    return (this.terminationDate != null ? this.terminationDate.isSetValue() : false);
  }

  /**
   * Get the total number of units to be built, procured or used during this
   * stage.
   * <p>
   * @return the NumEquip value in a {@link TInteger} data type
   */
  public TInteger getNumEquip() {
    return numEquip;
  }

  /**
   * Set the total number of units to be built, procured or used during this
   * stage.
   * <p>
   * @param value the NumEquip value in a {@link TInteger} data type
   */
  public void setNumEquip(TInteger value) {
    this.numEquip = value;
  }

  /**
   * Determine if the NumEquip is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumEquip() {
    return (this.numEquip != null ? this.numEquip.isSetValue() : false);
  }

  /**
   * Get a textual description of the geographic locations where this equipment
   * will be used during this stage.
   * <p>
   * @return the GeoDescription value in a {@link TString} data type
   */
  public TString getGeoDescription() {
    return geoDescription;
  }

  /**
   * Set a textual description of the geographic locations where this equipment
   * will be used during this stage.
   * <p>
   * @param value the GeoDescription value in a {@link TString} data type
   */
  public void setGeoDescription(TString value) {
    this.geoDescription = value;
  }

  /**
   * Determine if the GeoDescription is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
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
   * system is allowed or forbidden from use.
   * <p>
   * @return a non-null but possibly empty list of {@link StageLocation} instances
   */
  public List<StageLocation> getStageLocation() {
    if (stageLocation == null) {
      stageLocation = new ArrayList<>();
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
   * @param value An instances of type {@link ListCSG}
   * @return The current Stage object instance
   */
  public Stage withType(ListCSG value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set the date upon which work will commence on this stage.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   */
  public Stage withStartDate(Calendar value) {
    setStartDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   */
  public Stage withTargetDate(Calendar value) {
    setTargetDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the date by which the approval of the application is desired
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   */
  public Stage withDateApprovalRequired(Calendar value) {
    setDateApprovalRequired(new TCalendar(value));
    return this;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   */
  public Stage withTerminationDate(Calendar value) {
    setTerminationDate(new TCalendar(value));
    return this;
  }

  /**
   * Set the total number of units to be built, procured or used during this
   * stage.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current Stage object instance
   */
  public Stage withNumEquip(Integer value) {
    setNumEquip(new TInteger(value));
    return this;
  }

  /**
   * Set a textual description of the geographic locations where this equipment
   * will be used during this stage.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Stage object instance
   */
  public Stage withGeoDescription(String value) {
    setGeoDescription(new TString(value));
    return this;
  }

  /**
   * Set the StageLocation
   * <p>
   * Complex element StageLocation defines locations where the equipment or
   * system is allowed or forbidden from use.
   * <p>
   * @param values One or more instances of type {@link StageLocation}
   * @return The current Stage object instance
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
   * @return The current Stage object instance
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
    return "Stage {"
      + " startDate [" + startDate + "]"
      + " terminationDate [" + terminationDate + "]"
      + " stageLocation [" + stageLocation + "]"
      + " dateApprovalRequired [" + dateApprovalRequired + "]"
      + " targetDate [" + targetDate + "]"
      + " type [" + type + "]"
      + " geoDescription [" + geoDescription + "]"
      + " numEquip [" + numEquip + "]"
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
