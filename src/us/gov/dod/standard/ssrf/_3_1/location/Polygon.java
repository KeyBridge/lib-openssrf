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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.Location;
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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polygon", propOrder = {
  "excluded",
  "altitudeMin",
  "altitudeMax",
  "polygonPoint"
})
public class Polygon {

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
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
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
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterALTITUDE.class)
  private TDecimal altitudeMax;
  /**
   * PolygonPoint (Optional)
   * <p>
   * PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a
   * vertex of the polygon. Polygon points are described in a clockwise
   * direction. If the last point is different from the first point, it is
   * assumed that they are connected to complete the boundary of the polygon.
   */
  @XmlElement(name = "PolygonPoint", required = true)
  private List<PolygonPoint> polygonPoint;
  /**
   * idx - Index (Required)
   * <p>
   * A unique integer index for the current ellipse within the Location.
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
   * @return a non-null but possibly empty list of {@link PolygonPoint} instances
   */
  public List<PolygonPoint> getPolygonPoint() {
    if (polygonPoint == null) {
      polygonPoint = new ArrayList<>();
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
      getPolygonPoint().addAll(Arrays.asList(values));
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
  public Polygon withPolygonPoint(Collection<PolygonPoint> values) {
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
  public Polygon withIdx(BigInteger value) {
    setIdx(value);
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
      + " altitudeMax [" + altitudeMax + "]"
      + " idx [" + idx + "]"
      + " excluded [" + excluded + "]"
      + " polygonPoint [" + polygonPoint + "]"
      + " altitudeMin [" + altitudeMin + "]"
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

}
