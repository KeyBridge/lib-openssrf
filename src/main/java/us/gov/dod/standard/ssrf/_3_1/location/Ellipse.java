/*
 * Copyright 2014 Key Bridge Global LLC.
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
import java.util.Objects;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterNumberUN6;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * Ellipse on the horizontal plane, defined by its semi-major and semi-minor
 * axis, and by the orientation (azimuth) of the semi-major axis. This element
 * SHALL NOT be used to describe a satellite orbit.
 * <p>
 * Element of {@link Location}
 * <p>
 * Example:
 * <pre>
 * &lt;Ellipse&gt;
 *   &lt;AltitudeMax  cls="U"&gt;20000&lt;/AltitudeMax &gt;
 *   &lt;AltitudeMin  cls="U"&gt;3896.45&lt;/AltitudeMin &gt;
 *   &lt;Azimuth  cls="U"&gt;357.8&lt;/Azimuth &gt;
 *   &lt;Excluded  cls="U"&gt;No&lt;/Excluded &gt;
 *   &lt;idx cls="U"&gt;23&lt;/idx&gt;
 *   &lt;Lat  cls="U"&gt;394217.12N&lt;/Lat &gt;
 *   &lt;Lon  cls="U"&gt;792823.5W&lt;/Lon &gt;
 *   &lt;SemiMajorAxis  cls="U"&gt;87.87&lt;/SemiMajorAxis &gt;
 *   &lt;SemiMinorAxis  cls="U"&gt;67.89&lt;/SemiMinorAxis &gt;
 * &lt;/Ellipse&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
public class Ellipse implements Comparable<Ellipse> {

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
   * SemiMajorAxis - Semi Major Axis (Required)
   * <p>
   * The length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * Format is UN(9,4) [0..10000] (km)
   */
  @XmlElement(name = "SemiMajorAxis", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDISTEARTH.class)
  private TDecimal semiMajorAxis;
  /**
   * SemiMinorAxis - Semi Minor Axis (Required)
   * <p>
   * The length of the semi-minor axis of the ellipse.
   * <p>
   * Format is UN(9,4) [0..10000] (km)
   */
  @XmlElement(name = "SemiMinorAxis", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDISTEARTH.class)
  private TDecimal semiMinorAxis;
  /**
   * Azimuth - Azimuth of the Major Axis (Required)
   * <p>
   * The angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * Format is UN(5,2) [0..360] (deg)
   */
  @XmlElement(name = "Azimuth", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterAZ.class)
  private TDecimal azimuth;
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
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
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
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  /**
   * idx - Index (Required)
   * <p>
   * A unique integer index for the current ellipse within the geometric shape.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlTypeValidator(type = BigInteger.class, value = XmlAdapterNumberUN6.class)
  private BigInteger idx;

  /**
   * Ellipse constructor. Automatically sets the {@link #idx} value.
   */
  public Ellipse() {
    this.idx = SSRFUtility.nextIndex();
  }

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
   * Get the length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * @return the SemiMajorAxis value in a {@link TDecimal} data type
   */
  public TDecimal getSemiMajorAxis() {
    return semiMajorAxis;
  }

  /**
   * Set the length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * @param value the SemiMajorAxis value in a {@link TDecimal} data type
   */
  public void setSemiMajorAxis(TDecimal value) {
    this.semiMajorAxis = value;
  }

  /**
   * Determine if the SemiMajorAxis is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSemiMajorAxis() {
    return (this.semiMajorAxis != null ? this.semiMajorAxis.isSetValue() : false);
  }

  /**
   * Get the length of the semi-minor axis of the ellipse.
   * <p>
   * @return the SemiMinorAxis value in a {@link TDecimal} data type
   */
  public TDecimal getSemiMinorAxis() {
    return semiMinorAxis;
  }

  /**
   * Set the length of the semi-minor axis of the ellipse.
   * <p>
   * @param value the SemiMinorAxis value in a {@link TDecimal} data type
   */
  public void setSemiMinorAxis(TDecimal value) {
    this.semiMinorAxis = value;
  }

  /**
   * Determine if the SemiMinorAxis is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSemiMinorAxis() {
    return (this.semiMinorAxis != null ? this.semiMinorAxis.isSetValue() : false);
  }

  /**
   * Get the angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * @return the Azimuth value in a {@link TDecimal} data type
   */
  public TDecimal getAzimuth() {
    return azimuth;
  }

  /**
   * Set the angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * @param value the Azimuth value in a {@link TDecimal} data type
   */
  public void setAzimuth(TDecimal value) {
    this.azimuth = value;
  }

  /**
   * Determine if the Azimuth is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAzimuth() {
    return (this.azimuth != null ? this.azimuth.isSetValue() : false);
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
   * Get a unique integer index for the current ellipse within the geometric
   * shape.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique integer index for the current ellipse within the geometric
   * shape.
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
   * Set "Yes" to indicate that the shape is to be excluded from the set. If
   * omitted, a "No" SHOULD be assumed by processing applications, meaning that
   * the shape is included by default.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Ellipse object instance
   */
  public Ellipse withExcluded(ListCBO value) {
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
   * @param value An instances of type {@link String}
   * @return The current Ellipse object instance
   */
  public Ellipse withLon(String value) {
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
   * @return The current Ellipse object instance
   */
  public Ellipse withLat(String value) {
    setLat(new TString(value));
    return this;
  }

  /**
   * Set the length of the semi-major axis of the ellipse.
   * <p>
   * [XSL ERR MINMAX] SemiMajorAxis it MUST be greater than or equal to
   * SemiMinorAxis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Ellipse object instance
   */
  public Ellipse withSemiMajorAxis(Double value) {
    setSemiMajorAxis(new TDecimal(value));
    return this;
  }

  /**
   * Set the length of the semi-minor axis of the ellipse.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Ellipse object instance
   */
  public Ellipse withSemiMinorAxis(Double value) {
    setSemiMinorAxis(new TDecimal(value));
    return this;
  }

  /**
   * Set the angle of the semi-major axis in the horizontal plane, measured from
   * true North.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Ellipse object instance
   */
  public Ellipse withAzimuth(Double value) {
    setAzimuth(new TDecimal(value));
    return this;
  }

  /**
   * Set the minimum or nominal height of the point above the terrain (also
   * known as "above ground level" AGL).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Ellipse object instance
   */
  public Ellipse withAltitudeMin(Double value) {
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
   * @return The current Ellipse object instance
   */
  public Ellipse withAltitudeMax(Double value) {
    setAltitudeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set a unique integer index for the current ellipse within the geometric
   * shape.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Ellipse object instance
   */
  public Ellipse withIdx(Number value) {
    setIdx(new BigInteger(value.toString()));
    return this;
  }

  /**
   * Get a string representation of this Ellipse instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Ellipse {"
           + (semiMinorAxis != null ? " semiMinorAxis [" + semiMinorAxis + "]" : "")
           + (altitudeMax != null ? " altitudeMax [" + altitudeMax + "]" : "")
           + (lon != null ? " lon [" + lon + "]" : "")
           + (idx != null ? " idx [" + idx + "]" : "")
           + (excluded != null ? " excluded [" + excluded + "]" : "")
           + (semiMajorAxis != null ? " semiMajorAxis [" + semiMajorAxis + "]" : "")
           + (azimuth != null ? " azimuth [" + azimuth + "]" : "")
           + (altitudeMin != null ? " altitudeMin [" + altitudeMin + "]" : "")
           + (lat != null ? " lat [" + lat + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Ellipse} requires
   * {@link TDecimal Azimuth}, {@link TString Lat}, {@link TString Lon}, {@link TDecimal SemiMajorAxis}, {@link TDecimal SemiMinorAxis}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAzimuth() && isSetLat() && isSetLon() && isSetSemiMajorAxis() && isSetSemiMinorAxis() && isSetIdx();
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the index "idx" number.
   * <p>
   * @return an object hash code value
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 83 * hash + Objects.hashCode(this.idx);
    return hash;
  }

  /**
   * Equality is based upon the index "idx" number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are the same class and have a matching index
   *         value
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.idx, ((Ellipse) obj).getIdx());
  }

  /**
   * Comparison and sorting are based upon the index "idx" number.
   * <p>
   * @param o the other object
   * @return the object order
   */
  @Override
  public int compareTo(Ellipse o) {
    return idx.compareTo(o.getIdx());
  }//</editor-fold>

}
