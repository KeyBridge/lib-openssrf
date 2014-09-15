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
package us.gov.dod.standard.ssrf._3_0.allotment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.LocationRestriction;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;

/**
 * Java class for AllotFreq complex type.
 * <p>
 * This data element defines a frequency or range of frequencies belonging to
 * the Allotment. In the case of an allotment for a duplex frequency range, the
 * pairs of frequencies are derived from FreqMin, FreqMax, TuningStep and
 * PairedFreqMin as follows: (FreqMin + n * TuningStep, PairedFreqMin + n *
 * TuningStep) with n varying from 0 until FreqMin + n * TuningStep = FreqMax.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllotFreq", propOrder = {
  "freqMin",
  "freqMax",
  "pairedFreqMin",
  "tuningStep",
  "locationRestriction"
})
public class AllotFreq {

  /**
   * FreqMin: Enter the nominal frequency or minimum value of the frequency
   * range.
   */
  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax: Enter the maximum value of the frequencies in the range.
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * PairedFreqMin: Enter the nominal frequency or minimum value of the
   * frequency range, for the paired frequency or frequency range when the
   * allotment is for a duplex system.
   */
  @XmlElement(name = "PairedFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pairedFreqMin;
  /**
   * TuningStep: Enter the tuning increment expressed in MHz (do not insert any
   * unit).
   */
  @XmlElement(name = "TuningStep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;

  /**
   * This element indicates a Location where the Allotment usage is forbidden.
   * <p>
   * Location contains the parameters of a Location used to describe a
   * geographical location, polygonal or ellipse area, or a set of those. It
   * inherits attributes and sub-elements from element Common. To be meaningful,
   * a Location SHOULD contain at least one of the sub-elements Point, Polygon,
   * Ellipse or LocationRef.
   */
  @XmlElement(name = "LocationRestriction", nillable = true)
  private List<LocationRestriction> locationRestriction;

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  public boolean isSetFreqMin() {
    return (this.freqMin != null);
  }

  /**
   * Gets the value of the freqMax property.
   * <p>
   * @return
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  public boolean isSetFreqMax() {
    return (this.freqMax != null);
  }

  /**
   * Gets the value of the pairedFreqMin property.
   * <p>
   * @return
   */
  public TDecimal getPairedFreqMin() {
    return pairedFreqMin;
  }

  /**
   * Sets the value of the pairedFreqMin property.
   * <p>
   * @param value
   */
  public void setPairedFreqMin(TDecimal value) {
    this.pairedFreqMin = value;
  }

  public boolean isSetPairedFreqMin() {
    return (this.pairedFreqMin != null);
  }

  /**
   * Gets the value of the tuningStep property.
   * <p>
   * @return
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Sets the value of the tuningStep property.
   * <p>
   * @param value
   */
  public void setTuningStep(TDecimal value) {
    this.tuningStep = value;
  }

  public boolean isSetTuningStep() {
    return (this.tuningStep != null);
  }

  /**
   * Gets the value of the locationRestriction property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the locationRestriction property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocationRestriction().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * <p>
   * @return
   */
  public List<LocationRestriction> getLocationRestriction() {
    if (locationRestriction == null) {
      locationRestriction = new ArrayList<>();
    }
    return this.locationRestriction;
  }

  public boolean isSetLocationRestriction() {
    return ((this.locationRestriction != null) && (!this.locationRestriction.isEmpty()));
  }

  public void unsetLocationRestriction() {
    this.locationRestriction = null;
  }

  public AllotFreq withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  public AllotFreq withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  public AllotFreq withPairedFreqMin(Double value) {
    setPairedFreqMin(new TDecimal(value));
    return this;
  }

  public AllotFreq withTuningStep(Double value) {
    setTuningStep(new TDecimal(value));
    return this;
  }

  public AllotFreq withLocationRestriction(LocationRestriction... values) {
    if (values != null) {
      getLocationRestriction().addAll(Arrays.asList(values));
    }
    return this;
  }

  public AllotFreq withLocationRestriction(Collection<LocationRestriction> values) {
    if (values != null) {
      getLocationRestriction().addAll(values);
    }
    return this;
  }

}
