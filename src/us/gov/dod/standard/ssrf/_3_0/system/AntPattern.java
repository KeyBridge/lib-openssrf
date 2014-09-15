/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf._3_0.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Java class for AntPattern complex type.
 * <p>
 * Data element AntPattern contains an antenna pattern diagram on a specific
 * plane. General pattern cuts can be defined by a spherical coordinate system
 * with the electrical boresite of the antenna oriented in the direction of the
 * Z-axis. At different values of phi ( # ), pattern cuts can be taken with
 * theta ( # ) as the dependent variable. These will be great circle cuts
 * through the main-beam peak. An additional measurement relating the mechanical
 * and electrical boresite must be made to fully characterize the antenna. Also
 * the orientation of the antenna to the spherical coordinate system must be
 * defined. (example: top of the antenna oriented in the +x direction).
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
   * Type: Enter the polarisation code for the antenna pattern.
   * <p>
   * Recommend values from Code List CAP: <br/>
   * Azimuth Pattern in the horizontal plane <br/>
   * Elevation Pattern in the vertical plane
   */
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  /**
   * Calculated: Enter Yes to indicate that the data was calculated, or "No" if
   * the data is issued from measurement. Leave blank if the origin of the data
   * is not known.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  /**
   * CutType: These codes indicate the type of the pattern cut. A Theta cut
   * holds Phi constant while varying Theta. A Phi cut holds Theta constant
   * while varying Phi, where Theta is the angle off the boresight and Phi is
   * the rotation angle about the boresight.
   * <p>
   * Recommend values from Code List CTP: <br/>
   * PHI Rotation angle about the boresight <br/>
   * THETA Angle off the boresight
   */
  @XmlElement(name = "CutType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString cutType;
  /**
   * CutAngle: Enter the angle of the pattern cut. It is the value of Phi for a
   * Theta cut and the value of Theta for a Phi cut.
   */
  @XmlElement(name = "CutAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal cutAngle;
  /**
   * Data element AntPatternPoint contains one point of the antenna radiation
   * pattern, defined by a direction and gain.
   */
  @XmlElement(name = "AntPatternPoint", required = true)
  private List<AntPatternPoint> antPatternPoint;

  /**
   * Gets the value of the type property.
   * <p>
   * @return 
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value 
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the calculated property.
   * <p>
   * @return 
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value 
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  public boolean isSetCalculated() {
    return (this.calculated != null);
  }

  /**
   * Gets the value of the cutType property.
   * <p>
   * @return 
   */
  public TString getCutType() {
    return cutType;
  }

  /**
   * Sets the value of the cutType property.
   * <p>
   * @param value 
   */
  public void setCutType(TString value) {
    this.cutType = value;
  }

  public boolean isSetCutType() {
    return (this.cutType != null);
  }

  /**
   * Gets the value of the cutAngle property.
   * <p>
   * @return 
   */
  public TDecimal getCutAngle() {
    return cutAngle;
  }

  /**
   * Sets the value of the cutAngle property.
   * <p>
   * @param value 
   */
  public void setCutAngle(TDecimal value) {
    this.cutAngle = value;
  }

  public boolean isSetCutAngle() {
    return (this.cutAngle != null);
  }

  /**
   * Gets the value of the antPatternPoint property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the antPatternPoint property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAntPatternPoint().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<AntPatternPoint> getAntPatternPoint() {
    if (antPatternPoint == null) {
      antPatternPoint = new ArrayList<>();
    }
    return this.antPatternPoint;
  }

  public boolean isSetAntPatternPoint() {
    return ((this.antPatternPoint != null) && (!this.antPatternPoint.isEmpty()));
  }

  public void unsetAntPatternPoint() {
    this.antPatternPoint = null;
  }

  public AntPattern withType(String value) {
    setType(new TString(value));
    return this;
  }

  public AntPattern withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  public AntPattern withCutType(String value) {
    setCutType(new TString(value));
    return this;
  }

  public AntPattern withCutAngle(Double value) {
    setCutAngle(new TDecimal(value));
    return this;
  }

  public AntPattern withAntPatternPoint(AntPatternPoint... values) {
    if (values != null) {
      getAntPatternPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  public AntPattern withAntPatternPoint(Collection<AntPatternPoint> values) {
    if (values != null) {
      getAntPatternPoint().addAll(values);
    }
    return this;
  }

}
