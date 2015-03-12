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
package us.gov.dod.standard.ssrf._3_1.receiver;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.Receiver;
import us.gov.dod.standard.ssrf._3_1.Transmitter;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterNumberUN6;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCT;

/**
 * Curve defines the type of curve. It contains an indication as to whether the
 * values were measured or calculated, the numeric factor to be applied to the
 * carrier frequency to find the abscissa of the curve, a frequency to be added
 * to the carrier frequency to obtain the origin of the curve, and the
 * measurement bandwidth.
 * <p>
 * Element of {@link Receiver}, {@link Transmitter}
 * <p>
 * Sub-Element is {@link CurvePoint}
 * <p>
 * Example:
 * <pre>
 * &lt;Curve idx="1"&gt;
 *   &lt;Type cls="U"&gt;Tx RF Spectrum&lt;/Type&gt;
 *   &lt;Calculated cls="U"&gt;No&lt;/Calculated&gt;
 *   &lt;FreqFactor cls="U"&gt;1&lt;/FreqFactor&gt;
 *   &lt;FreqConst cls="U"&gt;0&lt;/FreqConst&gt;
 *   &lt;Bw cls="U"&gt;0.001&lt;/Bw&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.025&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-3&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.05&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-20&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;0.1&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-40&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 *   &lt;CurvePoint&gt;
 *     &lt;Offset cls="U"&gt;1&lt;/Offset&gt;
 *     &lt;Level cls="U"&gt;-60&lt;/Level&gt;
 *   &lt;/CurvePoint&gt;
 * &lt;/Curve&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Curve", propOrder = {
  "type",
  "calculated",
  "freqFactor",
  "freqConst",
  "bw",
  "freqMin",
  "freqMax",
  "curvePoint"
})
public class Curve implements Comparable<Curve> {

  /**
   * Type - Curve Type (Required)
   * <p>
   * A code defining the type of curve.
   * <p>
   * Format is L:CCT
   */
  @XmlElement(name = "Type", required = true)
  private TString type;
  /**
   * Calculated - Calculated Data Indicator (Optional)
   * <p>
   * Yes to indicate that the data was calculated, or "No" if the data is issued
   * from measurement. Leave blank if the origin of the data is not known.
   * <p>
   * Format is L:CBO
   */
  @XmlElement(name = "Calculated", required = false)
  private TString calculated;
  /**
   * FreqFactor - Curve Frequency Factor (Required)
   * <p>
   * A positive numeric multiplier of the carrier frequency. For example, enter
   * 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * Format is UN(3,1)
   */
  @XmlElement(name = "FreqFactor", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUN3_1.class)
  private TDecimal freqFactor;
  /**
   * FreqConst - Curve Frequency Constant (Required)
   * <p>
   * A frequency offset (positive or negative).
   * <p>
   * Format is SN(16,9) (MHz)
   */
  @XmlElement(name = "FreqConst", required = true)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQOFFSET.class)
  private TDecimal freqConst;
  /**
   * Bw - Curve Measurement Bandwidth (Optional)
   * <p>
   * The bandwidth measurement of the curve values.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "Bw", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal bw;
  /**
   * FreqMin - Lowest Frequency of the Curve (Optional)
   * <p>
   * The lowest value of the curve frequency range.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMin;
  /**
   * FreqMax - Highest Frequency (Optional)
   * <p>
   * The highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   */
  @XmlElement(name = "FreqMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal freqMax;
  /**
   * CurvePoint (Required)
   * <p>
   * CurvePoint contains the relative frequency to add to the curve origin to
   * obtain the absolute frequency point on the curve, and the value in dB
   * (relative to the carrier for a Tx characteristic, or relative to
   * sensitivity for a Rx characteristic).
   */
  @XmlElement(name = "CurvePoint", required = true)
  private Set<CurvePoint> curvePoint;
  /**
   * idx - Index (Required)
   * <p>
   * A unique index for each Curve used by this Dataset. Once an idx is used it
   * SHOULD NOT be modified during the lifetime of the Dataset; e.g., an element
   * with idx=2 will keep idx=2 even if the first occurrence (idx=1) is deleted.
   * <p>
   * Format is UN(6)
   */
  @XmlAttribute(name = "idx", required = true)
  @XmlTypeValidator(type = String.class, value = XmlAdapterNumberUN6.class)
  private BigInteger idx;

  /**
   * Curve constructor. Automatically sets the {@link #idx} value.
   */
  public Curve() {
    this.idx = SSRFUtility.nextIndex();
  }

  /**
   * Get a code defining the type of curve.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set a code defining the type of curve.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Get Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @return the Calculated value in a {@link TString} data type
   */
  public TString getCalculated() {
    return calculated;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value the Calculated value in a {@link TString} data type
   */
  public void setCalculated(TString value) {
    this.calculated = value;
  }

  /**
   * Determine if the Calculated is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCalculated() {
    return (this.calculated != null ? this.calculated.isSetValue() : false);
  }

  /**
   * Get a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @return the FreqFactor value in a {@link TDecimal} data type
   */
  public TDecimal getFreqFactor() {
    return freqFactor;
  }

  /**
   * Set a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @param value the FreqFactor value in a {@link TDecimal} data type
   */
  public void setFreqFactor(TDecimal value) {
    this.freqFactor = value;
  }

  /**
   * Determine if the FreqFactor is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqFactor() {
    return (this.freqFactor != null ? this.freqFactor.isSetValue() : false);
  }

  /**
   * Get a frequency offset (positive or negative).
   * <p>
   * @return the FreqConst value in a {@link TDecimal} data type
   */
  public TDecimal getFreqConst() {
    return freqConst;
  }

  /**
   * Set a frequency offset (positive or negative).
   * <p>
   * @param value the FreqConst value in a {@link TDecimal} data type
   */
  public void setFreqConst(TDecimal value) {
    this.freqConst = value;
  }

  /**
   * Determine if the FreqConst is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqConst() {
    return (this.freqConst != null ? this.freqConst.isSetValue() : false);
  }

  /**
   * Get the bandwidth measurement of the curve values.
   * <p>
   * @return the Bw value in a {@link TDecimal} data type
   */
  public TDecimal getBw() {
    return bw;
  }

  /**
   * Set the bandwidth measurement of the curve values.
   * <p>
   * @param value the Bw value in a {@link TDecimal} data type
   */
  public void setBw(TDecimal value) {
    this.bw = value;
  }

  /**
   * Determine if the Bw is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetBw() {
    return (this.bw != null ? this.bw.isSetValue() : false);
  }

  /**
   * Get the lowest value of the curve frequency range.
   * <p>
   * @return the FreqMin value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMin() {
    return freqMin;
  }

  /**
   * Set the lowest value of the curve frequency range.
   * <p>
   * @param value the FreqMin value in a {@link TDecimal} data type
   */
  public void setFreqMin(TDecimal value) {
    this.freqMin = value;
  }

  /**
   * Determine if the FreqMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMin() {
    return (this.freqMin != null ? this.freqMin.isSetValue() : false);
  }

  /**
   * Get the highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @return the FreqMax value in a {@link TDecimal} data type
   */
  public TDecimal getFreqMax() {
    return freqMax;
  }

  /**
   * Set the highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value the FreqMax value in a {@link TDecimal} data type
   */
  public void setFreqMax(TDecimal value) {
    this.freqMax = value;
  }

  /**
   * Determine if the FreqMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetFreqMax() {
    return (this.freqMax != null ? this.freqMax.isSetValue() : false);
  }

  /**
   * Get the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @return a non-null but possibly empty list of {@link CurvePoint} instances
   */
  public Set<CurvePoint> getCurvePoint() {
    if (curvePoint == null) {
      curvePoint = new HashSet<>();
    }
    return this.curvePoint;
  }

  /**
   * Determine if the CurvePoint is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCurvePoint() {
    return ((this.curvePoint != null) && (!this.curvePoint.isEmpty()));
  }

  /**
   * Clear the CurvePoint field. This sets the field to null.
   */
  public void unsetCurvePoint() {
    this.curvePoint = null;
  }

  /**
   * Get a unique index for each Curve used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @return a {@link BigInteger} instance
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set a unique index for each Curve used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
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
   * Set a code defining the type of curve.
   * <p>
   * @param value An instances of type {@link ListCCT}
   * @return The current Curve object instance
   */
  public Curve withType(ListCCT value) {
    setType(new TString(value.value()));
    return this;
  }

  /**
   * Set Yes to indicate that the data was calculated, or "No" if the data is
   * issued from measurement. Leave blank if the origin of the data is not
   * known.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Curve object instance
   */
  public Curve withCalculated(ListCBO value) {
    setCalculated(new TString(value.value()));
    return this;
  }

  /**
   * Set a positive numeric multiplier of the carrier frequency. For example,
   * enter 0 to define a curve around the IF, or 1 to define a curve around the
   * carrier frequency.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqFactor(Double value) {
    setFreqFactor(new TDecimal(value));
    return this;
  }

  /**
   * Set a frequency offset (positive or negative).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqConst(Double value) {
    setFreqConst(new TDecimal(value));
    return this;
  }

  /**
   * Set the bandwidth measurement of the curve values.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withBw(Double value) {
    setBw(new TDecimal(value));
    return this;
  }

  /**
   * Set the lowest value of the curve frequency range.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqMin(Double value) {
    setFreqMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the highest value of the curve frequency range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current Curve object instance
   */
  public Curve withFreqMax(Double value) {
    setFreqMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @param values One or more instances of type {@link CurvePoint}
   * @return The current Curve object instance
   */
  public Curve withCurvePoint(CurvePoint... values) {
    if (values != null) {
      getCurvePoint().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the CurvePoint
   * <p>
   * Complex element CurvePoint contains the relative frequency to add to the
   * curve origin to obtain the absolute frequency point on the curve, and the
   * value in dB (relative to the carrier for a Tx characteristic, or relative
   * to sensitivity for a Rx characteristic).
   * <p>
   * @param values A collection of {@link CurvePoint} instances
   * @return The current Curve object instance
   */
  public Curve withCurvePoint(Set<CurvePoint> values) {
    if (values != null) {
      getCurvePoint().addAll(values);
    }
    return this;
  }

  /**
   * Set a unique index for each Curve used by this Dataset. Once an idx is used
   * it SHOULD NOT be modified during the lifetime of the Dataset; e.g., an
   * element with idx=2 will keep idx=2 even if the first occurrence (idx=1) is
   * deleted.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Curve object instance
   */
  public Curve withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  /**
   * Get a string representation of this Curve instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Curve {"
      + (curvePoint != null ? " curvePoint [" + curvePoint + "]" : "")
      + (idx != null ? " idx [" + idx + "]" : "")
      + (freqConst != null ? " freqConst [" + freqConst + "]" : "")
      + (freqMin != null ? " freqMin [" + freqMin + "]" : "")
      + (bw != null ? " bw [" + bw + "]" : "")
      + (freqMax != null ? " freqMax [" + freqMax + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + (freqFactor != null ? " freqFactor [" + freqFactor + "]" : "")
      + (calculated != null ? " calculated [" + calculated + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Curve} requires
   * {@link CurvePoint CurvePoint}, {@link TDecimal FreqConst}, {@link TDecimal FreqFactor}, {@link TString Type}, {@link BigInteger idx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCurvePoint() && isSetFreqConst() && isSetFreqFactor() && isSetType() && isSetIdx();
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
    return Objects.equals(this.idx, ((Curve) obj).getIdx());
  }

  /**
   * Comparison and sorting are based upon the index "idx" number.
   * <p>
   * @param o the other object
   * @return the object order
   */
  @Override
  public int compareTo(Curve o) {
    return idx.compareTo(o.getIdx());
  }//</editor-fold>

}
