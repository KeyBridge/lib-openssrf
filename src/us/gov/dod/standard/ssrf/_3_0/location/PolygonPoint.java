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
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for PolygonPoint complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="PolygonPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}Coord"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" use="required" type="{urn:us:gov:dod:standard:ssrf:3.0.0}UN6" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonPoint", propOrder = {
  "lon",
  "lat"
})
public class PolygonPoint {

  @XmlElement(name = "Lon", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString lon;
  @XmlElement(name = "Lat", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString lat;
  @XmlAttribute(name = "sequence", required = true)
  protected BigInteger sequence;

  /**
   * Gets the value of the lon property.
   * <p>
   * @return 
   */
  public TString getLon() {
    return lon;
  }

  /**
   * Sets the value of the lon property.
   * <p>
   * @param value 
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
   * @return 
   */
  public TString getLat() {
    return lat;
  }

  /**
   * Sets the value of the lat property.
   * <p>
   * @param value 
   */
  public void setLat(TString value) {
    this.lat = value;
  }

  public boolean isSetLat() {
    return (this.lat != null);
  }

  /**
   * Gets the value of the sequence property.
   * <p>
   * @return 
   */
  public BigInteger getSequence() {
    return sequence;
  }

  /**
   * Sets the value of the sequence property.
   * <p>
   * @param value 
   */
  public void setSequence(BigInteger value) {
    this.sequence = value;
  }

  public boolean isSetSequence() {
    return (this.sequence != null);
  }

  public PolygonPoint withLon(String value) {
    setLon(new TString(value));
    return this;
  }

  public PolygonPoint withLat(String value) {
    setLat(new TString(value));
    return this;
  }

  public PolygonPoint withSequence(BigInteger value) {
    setSequence(value);
    return this;
  }

}
