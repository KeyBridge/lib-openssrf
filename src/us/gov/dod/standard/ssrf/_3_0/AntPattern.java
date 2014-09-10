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
package us.gov.dod.standard.ssrf._3_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

/**
 * <p>
 * Java class for AntPattern complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="AntPattern">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="Calculated" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="CutType" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS10" minOccurs="0"/>
 *         &lt;element name="CutAngle" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz180" minOccurs="0"/>
 *         &lt;element name="AntPatternPoint" type="{urn:us:gov:dod:standard:ssrf:3.0.0}AntPatternPoint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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

  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString type;
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  @XmlElement(name = "CutType", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS10.class)
  private TString cutType;
  @XmlElement(name = "CutAngle", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ180.class)
  private TDecimal cutAngle;
  @XmlElement(name = "AntPatternPoint", required = true)
  private List<AntPatternPoint> antPatternPoint;

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Sets the value of the calculated property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
   */
  public TString getCutType() {
    return cutType;
  }

  /**
   * Sets the value of the cutType property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TS10 }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
   */
  public TDecimal getCutAngle() {
    return cutAngle;
  }

  /**
   * Sets the value of the cutAngle property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAz180 }{@code >}
   * <p>
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
     * {@link AntPatternPoint }
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
