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

import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for Ellipse complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="Ellipse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Excluded" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Coord"/>
 *         &lt;element name="SemiMajorAxis" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance"/>
 *         &lt;element name="SemiMinorAxis" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TDistance"/>
 *         &lt;element name="Azimuth" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TAz"/>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Altitude" minOccurs="0"/>
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
@XmlType(name = "Ellipse", propOrder = {
  "excluded",
  "lon",
  "lat",
  "semiMajorAxis",
  "semiMinorAxis",
  "azimuth",
  "altitudeMin",
  "altitudeMax"
})
public class Ellipse {

  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  @XmlElement(name = "Lon", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString lon;
  @XmlElement(name = "Lat", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString lat;
  @XmlElement(name = "SemiMajorAxis", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal semiMajorAxis;
  @XmlElement(name = "SemiMinorAxis", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterDISTANCE.class)
  private TDecimal semiMinorAxis;
  @XmlElement(name = "Azimuth", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal azimuth;
  @XmlElement(name = "AltitudeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMin;
  @XmlElement(name = "AltitudeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  @XmlAttribute(name = "idx", required = true)
  protected BigInteger idx;

  /**
   * Gets the value of the excluded property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Sets the value of the excluded property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCBO }{@code >}
   * <p>
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  public boolean isSetExcluded() {
    return (this.excluded != null);
  }

  /**
   * Gets the value of the lon property.
   * <p>
   * @return possible object is {@link TLon }
   * <p>
   */
  public TString getLon() {
    return lon;
  }

  /**
   * Sets the value of the lon property.
   * <p>
   * @param value allowed object is {@link TLon }
   * <p>
   */
  public void setLon(TString value) {
    this.lon = value;
  }

  public boolean isSetLon() {
    return (this.lon != null);
  }

  /**
   * Gets the value of the lat property.
   * <p>
   * @return possible object is {@link TLat }
   * <p>
   */
  public TString getLat() {
    return lat;
  }

  /**
   * Sets the value of the lat property.
   * <p>
   * @param value allowed object is {@link TLat }
   * <p>
   */
  public void setLat(TString value) {
    this.lat = value;
  }

  public boolean isSetLat() {
    return (this.lat != null);
  }

  /**
   * Gets the value of the semiMajorAxis property.
   * <p>
   * @return possible object is {@link TDistance }
   * <p>
   */
  public TDecimal getSemiMajorAxis() {
    return semiMajorAxis;
  }

  /**
   * Sets the value of the semiMajorAxis property.
   * <p>
   * @param value allowed object is {@link TDistance }
   * <p>
   */
  public void setSemiMajorAxis(TDecimal value) {
    this.semiMajorAxis = value;
  }

  public boolean isSetSemiMajorAxis() {
    return (this.semiMajorAxis != null);
  }

  /**
   * Gets the value of the semiMinorAxis property.
   * <p>
   * @return possible object is {@link TDistance }
   * <p>
   */
  public TDecimal getSemiMinorAxis() {
    return semiMinorAxis;
  }

  /**
   * Sets the value of the semiMinorAxis property.
   * <p>
   * @param value allowed object is {@link TDistance }
   * <p>
   */
  public void setSemiMinorAxis(TDecimal value) {
    this.semiMinorAxis = value;
  }

  public boolean isSetSemiMinorAxis() {
    return (this.semiMinorAxis != null);
  }

  /**
   * Gets the value of the azimuth property.
   * <p>
   * @return possible object is {@link TAz }
   * <p>
   */
  public TDecimal getAzimuth() {
    return azimuth;
  }

  /**
   * Sets the value of the azimuth property.
   * <p>
   * @param value allowed object is {@link TAz }
   * <p>
   */
  public void setAzimuth(TDecimal value) {
    this.azimuth = value;
  }

  public boolean isSetAzimuth() {
    return (this.azimuth != null);
  }

  /**
   * Gets the value of the altitudeMin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public TDecimal getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Sets the value of the altitudeMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
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
   *         {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public TDecimal getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Sets the value of the altitudeMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TAltitude }{@code >}
   * <p>
   */
  public void setAltitudeMax(TDecimal value) {
    this.altitudeMax = value;
  }

  public boolean isSetAltitudeMax() {
    return (this.altitudeMax != null);
  }

  /**
   * Gets the value of the idx property.
   * <p>
   * @return possible object is {@link BigInteger }
   * <p>
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Sets the value of the idx property.
   * <p>
   * @param value allowed object is {@link BigInteger }
   * <p>
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  public boolean isSetIdx() {
    return (this.idx != null);
  }

  public Ellipse withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  public Ellipse withLon(String value) {
    setLon(new TString(value));
    return this;
  }

  public Ellipse withLat(String value) {
    setLat(new TString(value));
    return this;
  }

  public Ellipse withSemiMajorAxis(Double value) {
    setSemiMajorAxis(new TDecimal(value));
    return this;
  }

  public Ellipse withSemiMinorAxis(Double value) {
    setSemiMinorAxis(new TDecimal(value));
    return this;
  }

  public Ellipse withAzimuth(Double value) {
    setAzimuth(new TDecimal(value));
    return this;
  }

  public Ellipse withAltitudeMin(Double value) {
    setAltitudeMin(new TDecimal(value));
    return this;
  }

  public Ellipse withAltitudeMax(Double value) {
    setAltitudeMax(new TDecimal(value));
    return this;
  }

  public Ellipse withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

}
