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
package us.gov.dod.standard.ssrf._3_1.location;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Lat;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.Lon;

/**
 * PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a
 * vertex of the polygon. Polygon points are described in a clockwise direction.
 * If the last point is different from the first point, it is assumed that they
 * are connected to complete the boundary of the polygon.
 * <p>
 * Element of {@link Polygon}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Lon", required = true)
  private Lon lon;
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
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Lat", required = true)
  private Lat lat;
  /**
   * sequence - Sequence index (Required)
   * <p>
   * A unique, sequenced, index for each point describing the current polygon.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
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
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W)..
   * <p>
   * @return a {@link Lon} instance
   * @since 3.1.0
   */
  public Lon getLon() {
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
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W)..
   * <p>
   * @param value a {@link Lon} instance
   * @since 3.1.0
   */
  public void setLon(Lon value) {
    this.lon = value;
  }

  /**
   * Determine if the Lon is configured.
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
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S)..
   * <p>
   * @return a {@link Lat} instance
   * @since 3.1.0
   */
  public Lat getLat() {
    return lat;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S)..
   * <p>
   * @param value a {@link Lat} instance
   * @since 3.1.0
   */
  public void setLat(Lat value) {
    this.lat = value;
  }

  /**
   * Determine if the Lat is configured.
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
   * @since 3.1.0
   */
  public BigInteger getSequence() {
    return sequence;
  }

  /**
   * Set a unique, sequenced, index for each point describing the current
   * polygon.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
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
   * @param value An instances of type {@link String}.
   * @return The current PolygonPoint object instance.
   * @since 3.1.0
   */
  public PolygonPoint withLon(String value) throws Exception {
    setLon(new Lon(value));
    return this;
  }

  /**
   * Set the geographical longitude in decimal degrees.
   * <p>
   * @param value The coordinate value in decimal degrees
   * @return The current PolygonPoint object instance.
   * @since 3.1.0
   */
  public PolygonPoint withLon(Double value) {
    setLon(new Lon(value));
    return this;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current PolygonPoint object instance.
   * @since 3.1.0
   */
  public PolygonPoint withLat(String value) throws Exception {
    setLat(new Lat(value));
    return this;
  }

  /**
   * Set the geographical latitude in decimal degrees.
   * <p>
   * @param value The coordinate value in decimal degrees
   * @return The current PolygonPoint object instance.
   * @since 3.1.0
   */
  public PolygonPoint withLat(Double value) {
    setLat(new Lat(value));
    return this;
  }

  /**
   * Set a unique, sequenced, index for each point describing the current
   * polygon.
   * <p>
   * @param value An instances of type {@link BigInteger}.
   * @return The current PolygonPoint object instance.
   * @since 3.1.0
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
    return "\n  PolygonPoint {"
           + (lat != null ? " lat [" + lat + "]" : "")
           + (lon != null ? " lon [" + lon + "]" : "")
           + (sequence != null ? " sequence [" + sequence + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PolygonPoint} requires
   * {@link Lat Lat}, {@link Lon Lon}, {@link BigInteger sequence}.
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
