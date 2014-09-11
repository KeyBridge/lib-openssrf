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
package us.gov.dod.standard.ssrf._3_0.location;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * <p>
 * Java class for Polygon complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Polygon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Excluded" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Altitude" minOccurs="0"/>
 *         &lt;element name="PolygonPoint" type="{urn:us:gov:dod:standard:ssrf:3.0.0}PolygonPoint" maxOccurs="unbounded" minOccurs="3"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idx" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}UN6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polygon", propOrder = {
  "excluded",
  "altitudeMin",
  "altitudeMax",
  "polygonPoint"
})
public class Polygon {

  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  @XmlElement(name = "AltitudeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMin;
  @XmlElement(name = "AltitudeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  @XmlElement(name = "PolygonPoint", required = true)
  private List<PolygonPoint> polygonPoint;
  @XmlAttribute(name = "idx", required = true)
  protected BigInteger idx;

  /**
   * Gets the value of the excluded property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Sets the value of the excluded property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  public boolean isSetExcluded() {
    return (this.excluded != null);
  }

  /**
   * Gets the value of the altitudeMin property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Sets the value of the altitudeMin property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAltitudeMin(TDecimal value) {
    this.altitudeMin = value;
  }

  public boolean isSetAltitudeMin() {
    return (this.altitudeMin != null);
  }

  /**
   * Gets the value of the altitudeMax property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Sets the value of the altitudeMax property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setAltitudeMax(TDecimal value) {
    this.altitudeMax = value;
  }

  public boolean isSetAltitudeMax() {
    return (this.altitudeMax != null);
  }

  /**
   * Gets the value of the polygonPoint property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the polygonPoint property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPolygonPoint().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * 
   * <p>
   * <p>
   * @return
   */
  public List<PolygonPoint> getPolygonPoint() {
    if (polygonPoint == null) {
      polygonPoint = new ArrayList<>();
    }
    return this.polygonPoint;
  }

  public boolean isSetPolygonPoint() {
    return ((this.polygonPoint != null) && (!this.polygonPoint.isEmpty()));
  }

  public void unsetPolygonPoint() {
    this.polygonPoint = null;
  }

  /**
   * Gets the value of the idx property.
   * <p>
   * @return 
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Sets the value of the idx property.
   * <p>
   * @param value 
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  public boolean isSetIdx() {
    return (this.idx != null);
  }

  public Polygon withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  public Polygon withAltitudeMin(Double value) {
    setAltitudeMin(new TDecimal(value));
    return this;
  }

  public Polygon withAltitudeMax(Double value) {
    setAltitudeMax(new TDecimal(value));
    return this;
  }

  public Polygon withPolygonPoint(PolygonPoint... values) {
    if (values != null) {
      getPolygonPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Polygon withPolygonPoint(Collection<PolygonPoint> values) {
    if (values != null) {
      getPolygonPoint().addAll(values);
    }
    return this;
  }

  public Polygon withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

}
