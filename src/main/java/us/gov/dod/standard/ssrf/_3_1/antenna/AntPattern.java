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
package us.gov.dod.standard.ssrf._3_1.antenna;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Az180;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAP;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCTP;

/**
 * AntPattern contains an antenna pattern diagram on a specific plane. General
 * pattern cuts can be defined by a spherical coordinate system with the
 * electrical boresite of the antenna oriented in the direction of the Z-axis.
 * At different values of phi, pattern cuts can be taken with theta as the
 * dependent variable. These will be great circle cuts through the main-beam
 * peak.
 * <p>
 * Element of {@link AntMode}
 * <p>
 * Sub-Element is {@link AntPatternPoint}
 * <p>
 * Example:
 * <pre>
 * &lt;AntPattern&gt;
 *   &lt;Type cls="U"&gt;Azimuth&lt;/Type&gt;
 *   &lt;Calculated cls="U"&gt;Yes&lt;/Calculated&gt;
 *   &lt;AntPatternPoint&gt;
 *     &lt;Dir cls="U"&gt;180&lt;/Dir&gt;
 *     &lt;Gain cls="U"&gt;40.1&lt;/Gain&gt;
 *   &lt;/AntPatternPoint&gt;
 *   &lt;AntPatternPoint/&gt;
 *   &lt;/AntPattern&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntPattern", propOrder = {
  "type",
  "calculated",
  "cutType",
  "cutAngle",
  "antPatternPoint"
})
public class AntPattern {

  /**
   * CutType - Pattern Cut Type (Optional)
   * <p>
   * The type of the pattern cut. A Theta cut holds Phi constant while varying
   * Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the
   * angle off the boresight and Phi is the rotation angle about the boresight.
   * <p>
   * Format is L:CTP
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private TString type;
  /**
   * Calculated - Calculated Data Indicator (Optional)
   * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement. Leave blank if the origin of the data is not known.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  /**
   * CutType - Pattern Cut Type (Optional)
   * <p>
   * The type of the pattern cut. A Theta cut holds Phi constant while varying
   * Theta. A Phi cut holds Theta constant while varying Phi, where Theta is the
   * angle off the boresight and Phi is the rotation angle about the boresight.
   * <p>
   * Format is L:CTP
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CutType", required = false)
  private TString cutType;
  /**
   * CutAngle - Pattern Cut Angle (Optional)
   * <p>
   * The angle of the pattern cut. It is the value of Phi for a Theta cut and
   * the value of Theta for a Phi cut.
   * <p>
   * Format is UN(5,2) [0..180] (deg)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CutAngle", required = false)
  private Az180 cutAngle;
  /**
   * AntPatternPoint (Required)
   * <p>
   * AntPatternPoint contains a single point of the antenna radiation pattern,
   * defined by a direction and gain.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntPatternPoint", required = true)
  private Set<AntPatternPoint> antPatternPoint;

  /**
   * Get the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight..
   * <p>
   * @return the Type value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight..
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
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known..
   * <p>
   * @return the Calculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known..
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  /**
   * Determine if the Calculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCalculated() {
    return (this.calculated != null ? this.calculated.isSetValue() : false);
  }

  /**
   * Get the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight..
   * <p>
   * @return the CutType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCutType() {
    return cutType;
  }

  /**
   * Set the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight..
   * <p>
   * @param value the CutType value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCutType(TString value) {
    this.cutType = value;
  }

  /**
   * Determine if the CutType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCutType() {
    return (this.cutType != null ? this.cutType.isSetValue() : false);
  }

  /**
   * Get the angle of the pattern cut. It is the value of Phi for a Theta cut
   * and the value of Theta for a Phi cut..
   * <p>
   * @return a {@link Az180} instance
   * @since 3.1.0
   */
  public Az180 getCutAngle() {
    return cutAngle;
  }

  /**
   * Set the angle of the pattern cut. It is the value of Phi for a Theta cut
   * and the value of Theta for a Phi cut..
   * <p>
   * @param value a {@link Az180} instance
   * @since 3.1.0
   */
  public void setCutAngle(Az180 value) {
    this.cutAngle = value;
  }

  /**
   * Determine if the CutAngle is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCutAngle() {
    return (this.cutAngle != null ? this.cutAngle.isSetValue() : false);
  }

  /**
   * Get the AntPatternPoint
   * <p>
   * Complex element AntPatternPoint contains a single point of the antenna
   * radiation pattern, defined by a direction and gain..
   * <p>
   * @return a {@link AntPatternPoint} instance
   * @since 3.1.0
   */
  public Set<AntPatternPoint> getAntPatternPoint() {
    if (antPatternPoint == null) {
      antPatternPoint = new HashSet<>();
    }
    return this.antPatternPoint;
  }

  /**
   * Determine if the AntPatternPoint is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAntPatternPoint() {
    return ((this.antPatternPoint != null) && (!this.antPatternPoint.isEmpty()));
  }

  /**
   * Clear the AntPatternPoint field. This sets the field to null.
   */
  public void unsetAntPatternPoint() {
    this.antPatternPoint = null;
  }

  /**
   * Set the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight.
   * <p>
   * @param value An instances of type {@link ListCAP}.
   * @return The current AntPattern object instance.
   * @since 3.1.0
   */
  public AntPattern withType(ListCAP value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current AntPattern object instance.
   * @since 3.1.0
   */
  public AntPattern withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Set the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight.
   * <p>
   * @param value An instances of type {@link ListCTP}.
   * @return The current AntPattern object instance.
   * @since 3.1.0
   */
  public AntPattern withCutType(ListCTP value) {
    setCutType(new TString(value.value()));
    return this;
  }

  /**
   * Set the angle of the pattern cut. It is the value of Phi for a Theta cut
   * and the value of Theta for a Phi cut.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current AntPattern object instance.
   * @since 3.1.0
   */
  public AntPattern withCutAngle(Double value) {
    setCutAngle(new Az180(value));
    return this;
  }

  /**
   * Set the AntPatternPoint
   * <p>
   * Complex element AntPatternPoint contains a single point of the antenna
   * radiation pattern, defined by a direction and gain.
   * <p>
   * @param values One or more instances of type {@link AntPatternPoint...}.
   * @return The current AntPattern object instance.
   * @since 3.1.0
   */
  public AntPattern withAntPatternPoint(AntPatternPoint... values) {
    if (values != null) {
      getAntPatternPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntPatternPoint
   * <p>
   * Complex element AntPatternPoint contains a single point of the antenna
   * radiation pattern, defined by a direction and gain.
   * <p>
   * @param values A collection of {@link AntPatternPoint} instances
   * @return The current AntPattern object instance.
   * @since 3.1.0
   */
  public AntPattern withAntPatternPoint(Collection<AntPatternPoint> values) {
    if (values != null) {
      getAntPatternPoint().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this AntPattern instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "\n  AntPattern {"
           + (antPatternPoint != null ? " antPatternPoint [" + antPatternPoint + "]" : "")
           + (calculated != null ? " calculated [" + calculated + "]" : "")
           + (cutAngle != null ? " cutAngle [" + cutAngle + "]" : "")
           + (cutType != null ? " cutType [" + cutType + "]" : "")
           + (type != null ? " type [" + type + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntPattern} requires {@link Set<AntPatternPoint> AntPatternPoint}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAntPatternPoint();
  }

}
