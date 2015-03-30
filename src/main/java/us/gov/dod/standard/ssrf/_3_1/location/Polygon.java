package us.gov.dod.standard.ssrf._3_1.location;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.Location;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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

  @XmlElement(name = "AltitudeMin", required = false)
  private Altitude altitudeMin;

  @XmlElement(name = "AltitudeMax", required = false)
  private Altitude altitudeMax;
  /**
   * PolygonPoint (Optional)
   * <p>
   * PolygonPoint contains the coordinates (WGS 84) of point(s) that represent a
   * vertex of the polygon. Polygon points are described in a clockwise
   * direction. If the last point is different from the first point, it is
   * assumed that they are connected to complete the boundary of the polygon.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PolygonPoint", required = true)
  private Set<PolygonPoint> polygonPoint;
  /**
   * idx - Index (Required)    * <p>
   * A unique integer index for the current ellipse within the Location.
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
   * Get .
   * <p>
   * @return a {@link Altitude} instance
   * @since 3.1.0
   */
  public Altitude getAltitudeMin() {
    return altitudeMin;
  }

  /**
   * Set .
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
   * Get .
   * <p>
   * @return a {@link Altitude} instance
   * @since 3.1.0
   */
  public Altitude getAltitudeMax() {
    return altitudeMax;
  }

  /**
   * Set .
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
   * Get the PolygonPoint
   * <p>
   * Complex element PolygonPoint contains the coordinates (WGS 84) of point(s)
   * that represent a vertex of the polygon. Polygon points are described in a
   * clockwise direction. If the last point is different from the first point,
   * it is assumed that they are connected to complete the boundary of the
   * polygon..
   * <p>
   * @return a {@link PolygonPoint} instance
   * @since 3.1.0
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
   * Get a unique integer index for the current ellipse within the Location..
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique integer index for the current ellipse within the Location..
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
   * @return The current Polygon object instance.
   * @since 3.1.0
   */
  public Polygon withExcluded(ListCBO value) {
    setExcluded(new TString(value.value()));
    return this;
  }

  /**
   * Set    * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Polygon object instance.
   * @since 3.1.0
   */
  public Polygon withAltitudeMin(Double value) {
    setAltitudeMin(new Altitude(value));
    return this;
  }

  /**
   * Set    * <p>
   * @param value An instances of type {@link Double}.
   * @return The current Polygon object instance.
   * @since 3.1.0
   */
  public Polygon withAltitudeMax(Double value) {
    setAltitudeMax(new Altitude(value));
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
   * @param values One or more instances of type {@link PolygonPoint...}.
   * @return The current Polygon object instance.
   * @since 3.1.0
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
   * @return The current Polygon object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link BigInteger}.
   * @return The current Polygon object instance.
   * @since 3.1.0
   */
  public Polygon withIdx(BigInteger value) {
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
           + (altitudeMin != null ? " altitudeMin [" + altitudeMin + "]" : "")
           + (excluded != null ? " excluded [" + excluded + "]" : "")
           + (idx != null ? " idx [" + idx + "]" : "")
           + (polygonPoint != null ? " polygonPoint [" + polygonPoint + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Polygon} requires {@link Set<PolygonPoint> PolygonPoint},
   * {@link BigInteger idx}.
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
