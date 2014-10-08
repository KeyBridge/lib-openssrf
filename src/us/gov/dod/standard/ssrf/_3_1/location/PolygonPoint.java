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
package us.gov.dod.standard.ssrf._3_1.location;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a
 * vertex of the polygon. Polygon points are described in a clockwise direction.
 * If the last point is different from the first point, it is assumed that they
 * are connected to complete the boundary of the polygon.
 * <p>
 * Element of {@link Polygon}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonPoint", propOrder = {
  "lon",
  "lat"
})
public class PolygonPoint {

  /**
   * Lon - Longitude (Required)
   * <p>
   * The geographical longitude (degrees, minutes, seconds, and hemisphere E or
   * W) of the Point or center of the Ellipse. If the seconds are not known, use
   * 00, except in the case of navigation aid systems, geostationary satellites,
   * and microwave facilities where seconds are required. Use leading zeros as
   * appropriate for degrees, minutes, or seconds. Degrees longitude require
   * three digits. Seconds may have a decimal point followed by up to two
   * decimals. enter E or W immediately following the seconds. The format is:
   * dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * Format is pattern (S11) (deg)
   * <p>
   * Attribute group Coord (Optional)
   */
  @XmlElement(name = "Lon", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLON.class)
  private TString lon;
  /**
   * Lat - Latitude (Required)
   * <p>
   * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
   * of the Point or center of the Ellipse. Same remarks for seconds and leading
   * zeros. enter N or S immediately following the seconds. The format is:
   * ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * Format is pattern (S10) (deg)
   * <p>
   * Attribute group Coord (Optional)
   */
  @XmlElement(name = "Lat", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterLAT.class)
  private TString lat;
  /**
   * sequence - Sequence index (Required)
   * <p>
   * A unique, sequenced, index for each point describing the current polygon.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "sequence", required = true)
  private BigInteger sequence;

  /**
   * Get the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @return the Lon value in a {@link TString} data type
   */
  public TString getLon() {
    return lon;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @param value the Lon value in a {@link TString} data type
   */
  public void setLon(TString value) {
    this.lon = value;
  }

  /**
   * Determine if the Lon is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLon() {
    return (this.lon != null ? this.lon.isSetValue() : false);
  }

  /**
   * Get the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @return the Lat value in a {@link TString} data type
   */
  public TString getLat() {
    return lat;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param value the Lat value in a {@link TString} data type
   */
  public void setLat(TString value) {
    this.lat = value;
  }

  /**
   * Determine if the Lat is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLat() {
    return (this.lat != null ? this.lat.isSetValue() : false);
  }

  /**
   * Get a unique, sequenced, index for each point describing the current
   * polygon.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getSequence() {
    return sequence;
  }

  /**
   * Set a unique, sequenced, index for each point describing the current
   * polygon.
   * <p>
   * @param value a {@link BigInteger} instance
   */
  public void setSequence(BigInteger value) {
    this.sequence = value;
  }

  /**
   * Determine if the Sequence is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSequence() {
    return (this.sequence != null);
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PolygonPoint object instance
   */
  public PolygonPoint withLon(String value) {
    setLon(new TString(value));
    return this;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PolygonPoint object instance
   */
  public PolygonPoint withLat(String value) {
    setLat(new TString(value));
    return this;
  }

  /**
   * Set a unique, sequenced, index for each point describing the current
   * polygon.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current PolygonPoint object instance
   */
  public PolygonPoint withSequence(BigInteger value) {
    setSequence(value);
    return this;
  }

  /**
   * Get a string representation of this PolygonPoint instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PolygonPoint {"
      + (lon != null ? " lon [" + lon + "]" : "")
      + (sequence != null ? " sequence [" + sequence + "]" : "")
      + (lat != null ? " lat [" + lat + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PolygonPoint} requires
   * {@link TString Lat}, {@link TString Lon}, {@link BigInteger sequence}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLat() && isSetLon() && isSetSequence();
  }

}
