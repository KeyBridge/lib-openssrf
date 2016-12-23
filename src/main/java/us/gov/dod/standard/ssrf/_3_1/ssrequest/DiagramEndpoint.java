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

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.SSRequest;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCIC;

/**
 * DiagramEndpoint defines an instance of an icon on the diagram.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * Sub-Element is {@link EndpointLocation}
 * <p>
 * @author Key Bridge LLC &lt;developer@keybridge.ch&gt;
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagramEndpoint", propOrder = {
  "iconType",
  "endpointID",
  "description",
  "name",
  "iconPosLeft",
  "iconPosTop",
  "pointToMultiPoint",
  "endpointLocation"
})
public class DiagramEndpoint {

  /**
   * IconType - Icon Type (Required)
   * <p>
   * The type of icon for the diagram endpoint.
   * <p>
   * Format is L:CIC
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "IconType", required = false)
  private TString iconType;
  /**
   * EndpointID - Endpoint ID (Required)
   * <p>
   * An identifier for each icon on the diagram. Within a diagram, all
   * EndPointIDs must be unique.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EndpointID", required = true)
  private S20 endpointID;
  /**
   * Description - Endpoint Description (Optional)
   * <p>
   * A human-readable description of a diagram endpoint.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Description", required = false)
  private S100 description;
  @XmlElement(name = "Name", required = false)
  private S15 name;
  @XmlElement(name = "IconPosLeft", required = false)
  private US_Twips iconPosLeft;
  @XmlElement(name = "IconPosTop", required = false)
  private US_Twips iconPosTop;
  /**
   * PointToMultiPoint - Point to Multipoint Indicator (Optional)
   * <p>
   * "Yes" if the diagram endpoint participates in point-to-multipoint links.
   * enter "No" if it participates in point-to-point links. Note for the USA:
   * Required when operating between 932 and 935 MHz or 941 and 944 MHz.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PointToMultiPoint", required = false)
  private TString pointToMultiPoint;
  /**
   * EndpointLocation (Optional)
   * <p>
   * EndpointLocation defines locations where the diagram endpoint is allowed or
   * forbidden from use.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "EndpointLocation")
  private Set<EndpointLocation> endpointLocation;

  /**
   * Get the type of icon for the diagram endpoint..
   * <p>
   * @return the IconType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getIconType() {
    return iconType;
  }

  /**
   * Set the type of icon for the diagram endpoint..
   * <p>
   * @param value the IconType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setIconType(TString value) {
    this.iconType = value;
  }

  /**
   * Determine if the IconType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIconType() {
    return (this.iconType != null ? this.iconType.isSetValue() : false);
  }

  /**
   * Get an identifier for each icon on the diagram. Within a diagram, all
   * EndPointIDs must be unique..
   * <p>
   * @return a {@link S20} instance
   * @since 3.1.0
   */
  public S20 getEndpointID() {
    return endpointID;
  }

  /**
   * Set an identifier for each icon on the diagram. Within a diagram, all
   * EndPointIDs must be unique..
   * <p>
   * @param value a {@link S20} instance
   * @since 3.1.0
   */
  public void setEndpointID(S20 value) {
    this.endpointID = value;
  }

  /**
   * Determine if the EndpointID is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEndpointID() {
    return (this.endpointID != null ? this.endpointID.isSetValue() : false);
  }

  /**
   * Get a human-readable description of a diagram endpoint..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getDescription() {
    return description;
  }

  /**
   * Set a human-readable description of a diagram endpoint..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setDescription(S100 value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get a human-readable name of a diagram endpoint, or Station..
   * <p>
   * @return a {@link S15} instance
   * @since 3.1.0
   */
  public S15 getName() {
    return name;
  }

  /**
   * Set a human-readable name of a diagram endpoint, or Station..
   * <p>
   * @param value a {@link S15} instance
   * @since 3.1.0
   */
  public void setName(S15 value) {
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
   * Get the X coordinate of the icon in twips. Twips are screen-independent
   * units to ensure that the proportion of screen elements is the same on all
   * display systems. A twip is defined as being 1/1440 of an inch, or
   * 17.639µm..
   * <p>
   * @return a {@link US_Twips} instance
   * @since 3.1.0
   */
  public US_Twips getIconPosLeft() {
    return iconPosLeft;
  }

  /**
   * Set the X coordinate of the icon in twips. Twips are screen-independent
   * units to ensure that the proportion of screen elements is the same on all
   * display systems. A twip is defined as being 1/1440 of an inch, or
   * 17.639µm..
   * <p>
   * @param value a {@link US_Twips} instance
   * @since 3.1.0
   */
  public void setIconPosLeft(US_Twips value) {
    this.iconPosLeft = value;
  }

  /**
   * Determine if the IconPosLeft is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIconPosLeft() {
    return (this.iconPosLeft != null ? this.iconPosLeft.isSetValue() : false);
  }

  /**
   * Get the Y coordinate of the icon in twips." to read, "In Data Item
   * IconPosTop, enter the Y coordinate of the icon in twips. Twips are
   * screen-independent units to ensure that the proportion of screen elements
   * is the same on all display systems. A twip is defined as being 1/1440 of an
   * inch, or 17.639µm..
   * <p>
   * @return a {@link US_Twips} instance
   * @since 3.1.0
   */
  public US_Twips getIconPosTop() {
    return iconPosTop;
  }

  /**
   * Set the Y coordinate of the icon in twips." to read, "In Data Item
   * IconPosTop, enter the Y coordinate of the icon in twips. Twips are
   * screen-independent units to ensure that the proportion of screen elements
   * is the same on all display systems. A twip is defined as being 1/1440 of an
   * inch, or 17.639µm..
   * <p>
   * @param value a {@link US_Twips} instance
   * @since 3.1.0
   */
  public void setIconPosTop(US_Twips value) {
    this.iconPosTop = value;
  }

  /**
   * Determine if the IconPosTop is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIconPosTop() {
    return (this.iconPosTop != null ? this.iconPosTop.isSetValue() : false);
  }

  /**
   * Get "Yes" if the diagram endpoint participates in point-to-multipoint
   * links. enter "No" if it participates in point-to-point links. Note for the
   * USA: Required when operating between 932 and 935 MHz or 941 and 944 MHz..
   * <p>
   * @return the PointToMultiPoint value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getPointToMultiPoint() {
    return pointToMultiPoint;
  }

  /**
   * Set "Yes" if the diagram endpoint participates in point-to-multipoint
   * links. enter "No" if it participates in point-to-point links. Note for the
   * USA: Required when operating between 932 and 935 MHz or 941 and 944 MHz..
   * <p>
   * @param value the PointToMultiPoint value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setPointToMultiPoint(TString value) {
    this.pointToMultiPoint = value;
  }

  /**
   * Determine if the PointToMultiPoint is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPointToMultiPoint() {
    return (this.pointToMultiPoint != null ? this.pointToMultiPoint.isSetValue() : false);
  }

  /**
   * Get the EndpointLocation
   * <p>
   * Complex element EndpointLocation defines locations where the diagram
   * endpoint is allowed or forbidden from use..
   * <p>
   * @return a {@link EndpointLocation} instance
   * @since 3.1.0
   */
  public Set<EndpointLocation> getEndpointLocation() {
    if (endpointLocation == null) {
      endpointLocation = new HashSet<>();
    }
    return this.endpointLocation;
  }

  /**
   * Determine if the EndpointLocation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEndpointLocation() {
    return ((this.endpointLocation != null) && (!this.endpointLocation.isEmpty()));
  }

  /**
   * Clear the EndpointLocation field. This sets the field to null.
   */
  public void unsetEndpointLocation() {
    this.endpointLocation = null;
  }

  /**
   * Set the type of icon for the diagram endpoint.
   * <p>
   * @param value An instances of type {@link ListCIC}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withIconType(ListCIC value) {
    setIconType(new TString(value.value()));
    return this;
  }

  /**
   * Set an identifier for each icon on the diagram. Within a diagram, all
   * EndPointIDs must be unique.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withEndpointID(String value) {
    setEndpointID(new S20(value));
    return this;
  }

  /**
   * Set a human-readable description of a diagram endpoint.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withDescription(String value) {
    setDescription(new S100(value));
    return this;
  }

  /**
   * Set a human-readable name of a diagram endpoint, or Station.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withName(String value) {
    setName(new S15(value));
    return this;
  }

  /**
   * Set the X coordinate of the icon in twips. Twips are screen-independent
   * units to ensure that the proportion of screen elements is the same on all
   * display systems. A twip is defined as being 1/1440 of an inch, or 17.639µm.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withIconPosLeft(Integer value) {
    setIconPosLeft(new US_Twips(value));
    return this;
  }

  /**
   * Set the Y coordinate of the icon in twips." to read, "In Data Item
   * IconPosTop, enter the Y coordinate of the icon in twips. Twips are
   * screen-independent units to ensure that the proportion of screen elements
   * is the same on all display systems. A twip is defined as being 1/1440 of an
   * inch, or 17.639µm.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withIconPosTop(Integer value) {
    setIconPosTop(new US_Twips(value));
    return this;
  }

  /**
   * Set "Yes" if the diagram endpoint participates in point-to-multipoint
   * links. enter "No" if it participates in point-to-point links. Note for the
   * USA: Required when operating between 932 and 935 MHz or 941 and 944 MHz.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withPointToMultiPoint(ListCBO value) {
    setPointToMultiPoint(new TString(value.value()));
    return this;
  }

  /**
   * Set the EndpointLocation
   * <p>
   * Complex element EndpointLocation defines locations where the diagram
   * endpoint is allowed or forbidden from use.
   * <p>
   * @param values One or more instances of type {@link EndpointLocation}.
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withEndpointLocation(EndpointLocation... values) {
    if (values != null) {
      getEndpointLocation().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the EndpointLocation
   * <p>
   * Complex element EndpointLocation defines locations where the diagram
   * endpoint is allowed or forbidden from use.
   * <p>
   * @param values A collection of {@link EndpointLocation} instances
   * @return The current DiagramEndpoint object instance.
   * @since 3.1.0
   */
  public DiagramEndpoint withEndpointLocation(Collection<EndpointLocation> values) {
    if (values != null) {
      getEndpointLocation().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this DiagramEndpoint instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  DiagramEndpoint {"
           + (description != null ? " description [" + description + "]" : "")
           + (endpointID != null ? " endpointID [" + endpointID + "]" : "")
           + (endpointLocation != null ? " endpointLocation [" + endpointLocation + "]" : "")
           + (iconPosLeft != null ? " iconPosLeft [" + iconPosLeft + "]" : "")
           + (iconPosTop != null ? " iconPosTop [" + iconPosTop + "]" : "")
           + (iconType != null ? " iconType [" + iconType + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + (pointToMultiPoint != null ? " pointToMultiPoint [" + pointToMultiPoint + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DiagramEndpoint} requires {@link S20 EndpointID}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEndpointID();
  }

}
