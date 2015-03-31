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
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * Point contains the coordinates (WGS 84) of point(s) that represent a fixed
 * site. It contains also the terrain elevation, in metres above mean sea level
 * (MSL) of this point. If the antenna installed at this point is located on a
 * structure such as a tower or a building, the site elevation is specified as
 * the ground elevation at the base of the structure.
 * <p>
 * Element of {@link Location}
 * <p>
 * Example:
 * <pre>
 * &lt;Point idx="1"&gt;
 *   &lt;Lon cls="U"&gt;0792823.5W&lt;/Lon&gt;
 *   &lt;Lat cls="U"&gt;394217.12N&lt;/Lat&gt;
 * &lt;/Point&gt;
 * </pre>
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
  "excluded",
  "lon",
  "lat",
  "terrainElevation",
  "altitudeMin",
  "altitudeMax"
})
public class Point {

  /**
   * Excluded - Shape is Excluded (Optional)    * <p>
   * "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  /**
   * Lon - Longitude (Required)    * <p>
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
   * Lat - Latitude (Required)    * <p>
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
   * TerrainElevation - Terrain Elevation (Optional)    * <p>
   * The elevation of the base of the transmitting antenna structure above Mean
   * Sea Level (MSL).
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TerrainElevation", required = false)
  private Altitude terrainElevation;
  /**
   * AltitudeMin - Minimum Altitude Above Ground Level (Optional)    * <p>
   * The minimum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group Altitude (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AltitudeMin", required = false)
  private Altitude altitudeMin;
  /**
   * AltitudeMax - Maximum Altitude Above Ground Level (Optional)    * <p>
   * The minimum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group Altitude (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AltitudeMax", required = false)
  private Altitude altitudeMax;
  /**
   * WayPointIdx - Waypoint Index (Required)    * <p>
   * The sequential index of a Point within the referenced Location. Some points
   * of the Location may be omitted, and are not necessarily visited in the
   * order they are defined in the Location. For example a Location might have
   * 10 Points; however, a Force Element may use a route passing successively by
   * points 3, 1, 10, and 7.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default..
   * <p>
   * @return the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default..
   * <p>
   * @param value the Excluded value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setExcluded(TString value) {
    this.excluded = value;
  }

  /**
   * Determine if the Excluded is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExcluded() {
    return (this.excluded != null ? this.excluded.isSetValue() : false);
  }

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
   * Get the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL)..
   * <p>
   * @return a {@link Altitude} instance
   * @since 3.1.0
   */
  public Altitude getTerrainElevation() {
    return terrainElevation;
  }

  /**
   * Set the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL)..
   * <p>
   * @param value a {@link Altitude} instance
   * @since 3.1.0
   */
  public void setTerrainElevation(Altitude value) {
    this.terrainElevation = value;
  }

  /**
   * Determine if the TerrainElevation is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTerrainElevation() {
    return (this.terrainElevation != null ? this.terrainElevation.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL)..
   * <p>
   * @return a {@link Altitude} instance
   * @since 3.1.0
   */
  public Altitude getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL)..
   * <p>
   * @param value a {@link Altitude} instance
   * @since 3.1.0
   */
  public void setAltitudeMin(Altitude value) {
    this.altitudeMin = value;
  }

  /**
   * Determine if the AltitudeMin is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAltitudeMin() {
    return (this.altitudeMin != null ? this.altitudeMin.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin..
   * <p>
   * @return a {@link Altitude} instance
   * @since 3.1.0
   */
  public Altitude getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin..
   * <p>
   * @param value a {@link Altitude} instance
   * @since 3.1.0
   */
  public void setAltitudeMax(Altitude value) {
    this.altitudeMax = value;
  }

  /**
   * Determine if the AltitudeMax is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAltitudeMax() {
    return (this.altitudeMax != null ? this.altitudeMax.isSetValue() : false);
  }

  /**
   * Get the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7..
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7..
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setIdx(BigInteger value) {
    this.idx = value;
  }

  /**
   * Determine if the Idx is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdx() {
    return (this.idx != null);
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @param value An instances of type {@link ListCBO}.
   * @return The current Point object instance.
   * @since 3.1.0
   */
  public Point withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
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
   * @return The current Point object instance.
   * @since 3.1.0
   */
  public Point withLon(String value) {
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
   * @return The current Point object instance.
   * @since 3.1.0
   */
  public Point withLat(String value) {
    setLat(new Lat(value));
    return this;
  }

  /**
   * Set the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Point object instance.
   * @since 3.1.0
   */
  public Point withTerrainElevation(Double value) {
    setTerrainElevation(new Altitude(value));
    return this;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Point object instance.
   * @since 3.1.0
   */
  public Point withAltitudeMin(Double value) {
    setAltitudeMin(new Altitude(value));
    return this;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Point object instance.
   * @since 3.1.0
   */
  public Point withAltitudeMax(Double value) {
    setAltitudeMax(new Altitude(value));
    return this;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @param value An instances of type {@link BigInteger}.
   * @return The current Point object instance.
   * @since 3.1.0
   */
  public Point withIdx(BigInteger value) {
    return this;
  }

  /**
   * Get a string representation of this Point instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Point {"
           + (altitudeMax != null ? "\n altitudeMax [" + altitudeMax + "]" : "")
           + (altitudeMin != null ? "\n altitudeMin [" + altitudeMin + "]" : "")
           + (excluded != null ? "\n excluded [" + excluded + "]" : "")
           + (idx != null ? "\n idx [" + idx + "]" : "")
           + (lat != null ? "\n lat [" + lat + "]" : "")
           + (lon != null ? "\n lon [" + lon + "]" : "")
           + (terrainElevation != null ? "\n terrainElevation [" + terrainElevation + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Point} requires
   * {@link Lat Lat}, {@link Lon Lon}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLat() && isSetLon() && isSetIdx();
  }

}
