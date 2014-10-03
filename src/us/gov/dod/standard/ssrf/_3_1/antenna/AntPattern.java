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
package us.gov.dod.standard.ssrf._3_1.antenna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   */
  @XmlElement(name = "CutAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal cutAngle;
  /**
   * AntPatternPoint (Required)
   * <p>
   * AntPatternPoint contains a single point of the antenna radiation pattern,
   * defined by a direction and gain.
   */
  @XmlElement(name = "AntPatternPoint", required = true)
  private List<AntPatternPoint> antPatternPoint;

  /**
   * Get the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight.
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
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @return the Calculated value in a {@link TString} data type
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value the Calculated value in a {@link TString} data type
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
   * the boresight.
   * <p>
   * @return the CutType value in a {@link TString} data type
   */
  public TString getCutType() {
    return cutType;
  }

  /**
   * Set the type of the pattern cut. A Theta cut holds Phi constant while
   * varying Theta. A Phi cut holds Theta constant while varying Phi, where
   * Theta is the angle off the boresight and Phi is the rotation angle about
   * the boresight.
   * <p>
   * @param value the CutType value in a {@link TString} data type
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
   * and the value of Theta for a Phi cut.
   * <p>
   * @return the CutAngle value in a {@link TDecimal} data type
   */
  public TDecimal getCutAngle() {
    return cutAngle;
  }

  /**
   * Set the angle of the pattern cut. It is the value of Phi for a Theta cut
   * and the value of Theta for a Phi cut.
   * <p>
   * @param value the CutAngle value in a {@link TDecimal} data type
   */
  public void setCutAngle(TDecimal value) {
    this.cutAngle = value;
  }

  /**
   * Determine if the CutAngle is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * radiation pattern, defined by a direction and gain.
   * <p>
   * @return a non-null but possibly empty list of {@link AntPatternPoint}
   *         instances
   */
  public List<AntPatternPoint> getAntPatternPoint() {
    if (antPatternPoint == null) {
      antPatternPoint = new ArrayList<>();
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
   * @param value An instances of type {@link ListCAP}
   * @return The current AntPattern object instance
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
   * @param value An instances of type {@link ListCBO}
   * @return The current AntPattern object instance
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
   * @param value An instances of type {@link ListCTP}
   * @return The current AntPattern object instance
   */
  public AntPattern withCutType(ListCTP value) {
    setCutType(new TString(value.value()));
    return this;
  }

  /**
   * Set the angle of the pattern cut. It is the value of Phi for a Theta cut
   * and the value of Theta for a Phi cut.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current AntPattern object instance
   */
  public AntPattern withCutAngle(Double value) {
    setCutAngle(new TDecimal(value));
    return this;
  }

  /**
   * Set the AntPatternPoint
   * <p>
   * Complex element AntPatternPoint contains a single point of the antenna
   * radiation pattern, defined by a direction and gain.
   * <p>
   * @param values One or more instances of type {@link AntPatternPoint}
   * @return The current AntPattern object instance
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
   * @return The current AntPattern object instance
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
    return "AntPattern {"
      + (cutType != null ? " cutType [" + cutType + "]" : "")
      + (cutAngle != null ? " cutAngle [" + cutAngle + "]" : "")
      + (antPatternPoint != null ? " antPatternPoint [" + antPatternPoint + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (calculated != null ? " calculated [" + calculated + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntPattern} requires {@link AntPatternPoint AntPatternPoint}.
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
