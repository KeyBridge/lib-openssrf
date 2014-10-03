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
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
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
   * Excluded - Shape is Excluded (Optional)
   * <p>
   * "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  /**
   * Lon - Longitude (Required)
   * <p>
   * The geographical longitude (degrees, minutes, seconds, and hemisphere E or
   * W) of the Point or center of the Ellipse. If the seconds are not known, use
   * 00, except in the case of navigation aid systems, geostationary satellites,
   * and microwave facilities where seconds are required. Use leading zeros as
   * appropriate for degrees, minutes, or seconds.
   * <p>
   * Degrees longitude require * three digits. Seconds may have a decimal point
   * followed by up to two decimals. enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * Format is pattern (S11) (deg)
   * <p>
   * Attribute group Coord (Optional)
   */
  @XmlElement(name = "Lon", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString lat;
  /**
   * TerrainElevation - Terrain Elevation (Optional)
   * <p>
   * The elevation of the base of the transmitting antenna structure above Mean
   * Sea Level (MSL).
   * <p>
   * Format is SN(7,2) (m)
   */
  @XmlElement(name = "TerrainElevation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal terrainElevation;
  /**
   * AltitudeMin - Minimum Altitude Above Ground Level (Optional)
   * <p>
   * The minimum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group Altitude (Optional)
   */
  @XmlElement(name = "AltitudeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMin;
  /**
   * AltitudeMax - Maximum Altitude Above Ground Level (Optional)
   * <p>
   * The minimum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * Attribute group Altitude (Optional)
   */
  @XmlElement(name = "AltitudeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  /**
   * WayPointIdx - Waypoint Index (Required)
   * <p>
   * The sequential index of a Point within the referenced Location. Some points
   * of the Location may be omitted, and are not necessarily visited in the
   * order they are defined in the Location. For example a Location might have
   * 10 Points; however, a Force Element may use a route passing successively by
   * points 3, 1, 10, and 7.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  private BigInteger idx;

  /**
   * Get "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @return the Excluded value in a {@link TString} data type
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @param value the Excluded value in a {@link TString} data type
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
   * Get the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL).
   * <p>
   * @return the TerrainElevation value in a {@link TDecimal} data type
   */
  public TDecimal getTerrainElevation() {
    return terrainElevation;
  }

  /**
   * Set the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL).
   * <p>
   * @param value the TerrainElevation value in a {@link TDecimal} data type
   */
  public void setTerrainElevation(TDecimal value) {
    this.terrainElevation = value;
  }

  /**
   * Determine if the TerrainElevation is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetTerrainElevation() {
    return (this.terrainElevation != null ? this.terrainElevation.isSetValue() : false);
  }

  /**
   * Get the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @return the AltitudeMin value in a {@link TDecimal} data type
   */
  public TDecimal getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @param value the AltitudeMin value in a {@link TDecimal} data type
   */
  public void setAltitudeMin(TDecimal value) {
    this.altitudeMin = value;
  }

  /**
   * Determine if the AltitudeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * AltitudeMin.
   * <p>
   * @return the AltitudeMax value in a {@link TDecimal} data type
   */
  public TDecimal getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * @param value the AltitudeMax value in a {@link TDecimal} data type
   */
  public void setAltitudeMax(TDecimal value) {
    this.altitudeMax = value;
  }

  /**
   * Determine if the AltitudeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
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
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @param value a {@link BigInteger} instance
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
   * Helper method to get the Longitude value as a double
   * <p>
   * @return the Longitude as a double
   */
  public Double getLongitude() {
    if (lon != null) {
      if ("X".equals(lon.getValue())) {
        return 0d;
      }
      Pattern pattern = Pattern.compile("(\\d\\d\\d)(\\d\\d)(\\d\\d\\.?\\d?\\d?)([EW])");
      Matcher matcher = pattern.matcher(lon.getValue());
      if (matcher.matches()) {
        Double decimalDegree = Double.valueOf(matcher.group(1)) + (Double.valueOf(matcher.group(2)) + (Double.valueOf(matcher.group(3)) / 60)) / 60;
        double directionMultiplier = 1;
        if ("W".equalsIgnoreCase(matcher.group(4))) {
          directionMultiplier = -1;
        }
        return directionMultiplier * decimalDegree;
      }
    }
    return null;
  }

  /**
   * Helper method to set the Longitude value as a double.
   * <p>
   * The geographical longitude (degrees, minutes, seconds, and hemisphere E or
   * W) of the Point or center of the Ellipse. If the seconds are not known, use
   * 00, except in the case of navigation aid systems, geostationary satellites,
   * and microwave facilities where seconds are required. Use leading zeros as
   * appropriate for degrees, minutes, or seconds.
   * <p>
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * @param longitude the Longitude value as a double
   */
  public void setLongitude(Double longitude) {
    if (longitude != null) {
      DecimalFormat dfD = new DecimalFormat("000");
      DecimalFormat dfM = new DecimalFormat("00");
      DecimalFormat dfS = new DecimalFormat("00.00");
      StringBuilder sb = new StringBuilder();
      sb.append(dfD.format(Math.abs(longitude)))
        .append(dfM.format(Math.floor(Math.abs(longitude) * 60 % 60)))
        .append(dfS.format(Math.abs(longitude) * 3600 % 60))
        .append(longitude > 0 ? "E" : "W");
      this.lon = new TString(sb.toString());
    } else {
      this.lon = null;
    }
  }

  /**
   * Helper method to get the Latitude value as a double
   * <p>
   * @return the Latitude as a double
   */
  public Double getLatitude() {
    if (lat != null) {
      if ("X".equals(lat.getValue())) {
        return 0d;
      }
      Pattern pattern = Pattern.compile("(\\d\\d)(\\d\\d)(\\d\\d\\.?\\d?\\d?)([NS])");
      Matcher matcher = pattern.matcher(lat.getValue());
      if (matcher.matches()) {
        Double decimalDegree = Double.valueOf(matcher.group(1)) + (Double.valueOf(matcher.group(2)) + (Double.valueOf(matcher.group(3)) / 60)) / 60;
        double directionMultiplier = 1;
        if ("S".equalsIgnoreCase(matcher.group(4)) || "W".equalsIgnoreCase(matcher.group(4))) {
          directionMultiplier = -1;
        }
        return directionMultiplier * decimalDegree;
      }
    }
    return null;
  }

  /**
   * Helper method to set the Latitude value as a double.
   * <p>
   * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
   * of the Point or center of the Ellipse. Same remarks as longitude for
   * seconds and leading zeros. Enter N or S immediately following the seconds.
   * <p>
   * The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param latitude the Latitude value as a double
   */
  public void setLatitude(Double latitude) {
    if (latitude != null) {
      DecimalFormat dfDM = new DecimalFormat("00");
      DecimalFormat dfS = new DecimalFormat("00.00");
      StringBuilder sb = new StringBuilder();
      sb.append(dfDM.format(Math.abs(latitude)))
        .append(dfDM.format(Math.floor(Math.abs(latitude) * 60 % 60)))
        .append(dfS.format(Math.abs(latitude) * 3600 % 60))
        .append(latitude > 0 ? "N" : "S");
      this.lat = new TString(sb.toString());
    } else {
      this.lat = null;
    }
  }

  /**
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Point object instance
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
   * @param value An instances of type {@link String} formatted as: dddmmss.hhH
   * @return The current Point object instance
   */
  public Point withLon(String value) {
    setLon(new TString(value));
    return this;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param value An instances of type {@link String} formatted as:ddmmss.hhH
   * @return The current Point object instance
   */
  public Point withLat(String value) {
    setLat(new TString(value));
    return this;
  }

  /**
   * Set the geographical longitude value as a double.
   * <p>
   * @param value the Longitude value as a double.
   * @return The current Point object instance
   */
  public Point withLon(Double value) {
    setLongitude(value);
    return this;
  }

  /**
   * Set the geographical latitude value as a double.
   * <p>
   * @param value the Latitude value as a double.
   * @return The current Point object instance
   */
  public Point withLat(Double value) {
    setLatitude(value);
    return this;
  }

  /**
   * Set the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Point object instance
   */
  public Point withTerrainElevation(Double value) {
    setTerrainElevation(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Point object instance
   */
  public Point withAltitudeMin(Double value) {
    setAltitudeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * [XSL ERR MINMAX] If AltitudeMax is used, it MUST be greater than
   * AltitudeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Point object instance
   */
  public Point withAltitudeMax(Double value) {
    setAltitudeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Point object instance
   */
  public Point withIdx(BigInteger value) {
    setIdx(value);
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
      + (idx != null ? " idx [" + idx + "]" : "")
      + (lon != null ? " lon [" + lon + "]" : "")
      + (lat != null ? " lat [" + lat + "]" : "")
      + (terrainElevation != null ? " terrainElevation [" + terrainElevation + "]" : "")
      + (altitudeMax != null ? " altitudeMax [" + altitudeMax + "]" : "")
      + (altitudeMin != null ? " altitudeMin [" + altitudeMin + "]" : "")
      + (excluded != null ? " excluded [" + excluded + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Point} requires
   * {@link TString Lat}, {@link TString Lon}, {@link BigInteger idx}.
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
