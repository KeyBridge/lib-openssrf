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
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCBO;

/**
 * Java class for Point complex type.
 * <p>
 * Data element Point contains the coordinates (WGS 84) of point(s) that
 * represent a fixed site. It contains also the terrain elevation, in metres
 * above mean sea level (MSL) of this point.
 * <p>
 * If the antenna installed at this point is located on a structure such as a
 * tower or a building, the site elevation is specified as the ground elevation
 * at the base of the structure.
 * <p>
 * Notes In order to be able to accommodate legacy data, a value of "X" MAY be
 * used in attributes lon and lat as a gap filler, but only for legacy data
 * which do not contain this information. The real value SHOULD always be used
 * for new datasets and during the review of old datasets. Datasets containing
 * this value SHOULD NOT be exchanged internationally.
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
   * Excluded: Enter "Yes" to indicate that the shape is to be excluded from the
   * set. If omitted, a "No" SHOULD be assumed by processing applications,
   * meaning that the shape is included by default.
   * <p>
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CBO: Code Yes No
   */
  @XmlElement(name = "Excluded", required = false)
  private TString excluded;
  /**
   * Lon: Enter the geographical longitude (degrees, minutes, seconds, and
   * hemisphere E or W) of the Point or center of the Ellipse. If the seconds
   * are not known, use 00, except in the case of navigation aid systems,
   * geostationary satellites, and microwave facilities where seconds are
   * required. Use leading zeros as appropriate for degrees, minutes, or
   * seconds.
   * <p>
   * Degrees longitude require three digits. Seconds may have a decimal point
   * followed by up to two decimals. Enter E or W immediately following the
   * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or
   * W).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "([0-9]{7}(.[0-9]{1,2})?(E|W))|X"
   */
  @XmlElement(name = "Lon", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLON.class)
  private TString lon;
  /**
   * Lat: Enter the geographical latitude (degrees, minutes, seconds and
   * hemisphere N or S) of the Point or center of the Ellipse. Same remarks for
   * seconds and leading zeros. Enter N or S immediately following the seconds.
   * The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * [XSD ERR REGEX] This data item MUST comply to the regular expression:
   * "([0-9]{6}(.[0-9]{1,2})?(N|S))|X"
   */
  @XmlElement(name = "Lat", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterLAT.class)
  private TString lat;
  /**
   * TerrainElevation: Altitude is required for fixed stations except for
   * applications for radio frequencies below 30 MHz or for terrestrial stations
   * operating at 30 MHz and above if for experimental and mobile stations.
   * Enter the site (terrain) elevation (at the base of the transmitting antenna
   * structure) in metres above MSL. This information is not required for the
   * ITU notification of a typical earth station.
   */
  @XmlElement(name = "TerrainElevation", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal terrainElevation;
  /**
   * AltitudeMin: Enter the minimum or nominal height of the point above the
   * terrain (also known as "above ground level" AGL).
   */
  @XmlElement(name = "AltitudeMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMin;
  /**
   * AltitudeMax: Enter the maximum height of the point above the terrain, in
   * case of a ranged altitude value.
   */
  @XmlElement(name = "AltitudeMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  /**
   * idx (Attribute): Enter the sequence index of the current Point within the
   * Location, starting at 1.
   * <p>
   * [XSD ERR UNIQUE] Each value of this data item MUST be unique within the
   * parent element.
   */
  @XmlAttribute(name = "idx", required = true)
  protected BigInteger idx;

  /**
   * Gets the value of the excluded property.
   * <p>
   * @return
   */
  public TString getExcluded() {
    return excluded;
  }

  /**
   * Sets the value of the excluded property.
   * <p>
   * @param value
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
   * Gets the value of the terrainElevation property.
   * <p>
   * @return
   */
  public TDecimal getTerrainElevation() {
    return terrainElevation;
  }

  /**
   * Sets the value of the terrainElevation property.
   * <p>
   * @param value
   */
  public void setTerrainElevation(TDecimal value) {
    this.terrainElevation = value;
  }

  public boolean isSetTerrainElevation() {
    return (this.terrainElevation != null);
  }

  /**
   * Gets the value of the altitudeMin property.
   * <p>
   * @return
   */
  public TDecimal getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Sets the value of the altitudeMin property.
   * <p>
   * @param value
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
   * @return
   */
  public TDecimal getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Sets the value of the altitudeMax property.
   * <p>
   * @param value
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

  public Point withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  public Point withLon(Double value) {
    setLongitude(value);
    return this;
  }

  public Point withLat(Double value) {
    setLatitude(value);
    return this;
  }

  public Point withTerrainElevation(Double value) {
    setTerrainElevation(new TDecimal(value));
    return this;
  }

  public Point withAltitudeMin(Double value) {
    setAltitudeMin(new TDecimal(value));
    return this;
  }

  public Point withAltitudeMax(Double value) {
    setAltitudeMax(new TDecimal(value));
    return this;
  }

  public Point withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.lon);
    hash = 97 * hash + Objects.hashCode(this.lat);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Point other = (Point) obj;
    if (!Objects.equals(this.lon, other.lon)) {
      return false;
    }
    if (!Objects.equals(this.lat, other.lat)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Point {" + "lon=" + lon + ", lat=" + lat + '}';
  }
}
