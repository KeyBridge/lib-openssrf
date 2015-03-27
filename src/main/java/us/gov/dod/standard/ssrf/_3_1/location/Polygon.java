/*
 * Copyright 2014 Key Bridge LLC.
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
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.Location;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterNumberUN6;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;

/**
 * Polygon is a closed geometric shape on the surface of the Earth, defined by
 * at least three points, used to describe an operational area or an excluded
 * area.
 * <p>
 * Element of {@link Location}
 * <p>
 * Sub-Element is {@link PolygonPoint}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polygon", propOrder = {
  "excluded",
  "altitudeMin",
  "altitudeMax",
  "polygonPoint"
})
public class Polygon implements Comparable<Polygon> {

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
   * AltitudeMin - Minimum or nominal height of the point (Optional)
   * <p>
   * The minimum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   */
  @XmlElement(name = "AltitudeMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMin;
  /**
   * AltitudeMax - Maximum or nominal height of the point (Optional)
   * <p>
   * The maximum or nominal height of the point above the terrain (also known as
   * "above ground level" AGL).
   * <p>
   * If AltitudeMax is used, it MUST be greater than AltitudeMin.
   */
  @XmlElement(name = "AltitudeMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  /**
   * PolygonPoint (Optional)
   * <p>
   * PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a
   * vertex of the polygon. Polygon points are described in a clockwise
   * direction. If the last point is different from the first point, it is
   * assumed that they are connected to complete the boundary of the polygon.
   * <p>
   * Requires at minimum three points: [3..n].
   */
  @XmlElement(name = "PolygonPoint", required = true)
  private Set<PolygonPoint> polygonPoint;
  /**
   * idx - Index (Required)
   * <p>
   * A unique integer index for the current ellipse within the Location.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlTypeValidator(type = BigInteger.class, value = XmlAdapterNumberUN6.class)
  private BigInteger idx;

  /**
   * Polygon constructor. Automatically sets the {@link #idx} value.
   */
  public Polygon() {
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
   * Get
   * <p>
   * @return the AltitudeMin value in a {@link TDecimal} data type
   */
  public TDecimal getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Set
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
   * Get
   * <p>
   * @return the AltitudeMax value in a {@link TDecimal} data type
   */
  public TDecimal getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Set
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
   * Get the PolygonPoint
   * <p>
   * Complex element PolygonPoint contains the coordinates (WGS 84) of point(s)
   * that represent a vertex of the polygon. Polygon points are described in a
   * clockwise direction. If the last point is different from the first point,
   * it is assumed that they are connected to complete the boundary of the
   * polygon.
   * <p>
   * @return a non-null but possibly empty list of {@link PolygonPoint}
   *         instances
   */
  public Set<PolygonPoint> getPolygonPoint() {
    if (polygonPoint == null) {
      polygonPoint = new HashSet<>();
    }
    return this.polygonPoint;
  }

  /**
   * Determine if the PolygonPoint is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetPolygonPoint() {
    return ((this.polygonPoint != null) && (!this.polygonPoint.isEmpty()));
  }

  /**
   * Clear the PolygonPoint field. This sets the field to null.
   */
  public void unsetPolygonPoint() {
    this.polygonPoint = null;
  }

  /**
   * Get a unique integer index for the current ellipse within the Location.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique integer index for the current ellipse within the Location.
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
   * @return The current Polygon object instance
   */
  public Polygon withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Polygon object instance
   */
  public Polygon withAltitudeMin(Double value) {
    setAltitudeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Polygon object instance
   */
  public Polygon withAltitudeMax(Double value) {
    setAltitudeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the PolygonPoint
   * <p>
   * Complex element PolygonPoint contains the coordinates (WGS 84) of point(s)
   * that represent a vertex of the polygon. Polygon points are described in a
   * clockwise direction. If the last point is different from the first point,
   * it is assumed that they are connected to complete the boundary of the
   * polygon.
   * <p>
   * @param values One or more instances of type {@link PolygonPoint}
   * @return The current Polygon object instance
   */
  public Polygon withPolygonPoint(PolygonPoint... values) {
    if (values != null) {
      getPolygonPoint().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the PolygonPoint
   * <p>
   * Complex element PolygonPoint contains the coordinates (WGS 84) of point(s)
   * that represent a vertex of the polygon. Polygon points are described in a
   * clockwise direction. If the last point is different from the first point,
   * it is assumed that they are connected to complete the boundary of the
   * polygon.
   * <p>
   * @param values A collection of {@link PolygonPoint} instances
   * @return The current Polygon object instance
   */
  public Polygon withPolygonPoint(Set<PolygonPoint> values) {
    if (values != null) {
      getPolygonPoint().addAll(values);
    }
    return this;
  }

  /**
   * Set a unique integer index for the current ellipse within the Location.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Polygon object instance
   */
  public Polygon withIdx(Number value) {
    setIdx(new BigInteger(value.toString()));
    return this;
  }

  /**
   * Get a string representation of this Polygon instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Polygon {"
           + (altitudeMax != null ? " altitudeMax [" + altitudeMax + "]" : "")
           + (idx != null ? " idx [" + idx + "]" : "")
           + (excluded != null ? " excluded [" + excluded + "]" : "")
           + (polygonPoint != null ? " polygonPoint [" + polygonPoint + "]" : "")
           + (altitudeMin != null ? " altitudeMin [" + altitudeMin + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Polygon} requires
   * {@link PolygonPoint PolygonPoint}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetPolygonPoint() && isSetIdx();
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
    return Objects.equals(this.idx, ((Polygon) obj).getIdx());
  }

  /**
   * Comparison and sorting are based upon the index "idx" number.
   * <p>
   * @param o the other object
   * @return the object order
   */
  @Override
  public int compareTo(Polygon o) {
    return idx.compareTo(o.getIdx());
  }//</editor-fold>

}
