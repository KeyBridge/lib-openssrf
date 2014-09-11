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
package us.gov.dod.standard.ssrf._3_0;

import us.gov.dod.standard.ssrf._3_0.domains.TDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;

/**
 * <p>
 * Java class for AllotFreq complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="AllotFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us:gov:dod:standard:ssrf:3.0.0}FreqRangeGrp"/>
 *         &lt;element name="PairedFreqMin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="TuningStep" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *         &lt;element name="LocationRestriction" type="{urn:us:gov:dod:standard:ssrf:3.0.0}LocationRestriction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
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

  @XmlElement(name = "FreqMin", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  @XmlElement(name = "FreqMax", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  @XmlElement(name = "PairedFreqMin", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal pairedFreqMin;
  @XmlElement(name = "TuningStep", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal tuningStep;
  @XmlElement(name = "LocationRestriction", nillable = true)
  private List<LocationRestriction> locationRestriction;

  /**
   * Gets the value of the freqMin property.
   * <p>
   * @return possible object is {@link TFreqM }
   * <p>
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Sets the value of the freqMin property.
   * <p>
   * @param value allowed object is {@link TFreqM }
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Sets the value of the freqMax property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getPairedFreqMin() {
    return pairedFreqMin;
  }

  /**
   * Sets the value of the pairedFreqMin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
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
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
   */
  public TDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Sets the value of the tuningStep property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TFreqM }{@code >}
   * <p>
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
     * {@link LocationRestriction }
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
