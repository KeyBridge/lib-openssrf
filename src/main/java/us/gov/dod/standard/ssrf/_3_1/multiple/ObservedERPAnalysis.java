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
package us.gov.dod.standard.ssrf._3_1.multiple;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.assignment.Configuration;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListUS7;

/**
 * ObservedERPAnalysis (US) contains data describing Effective Radiated Power
 * (ERP) associated with an emitter or Notation.
 * <p>
 * Element of {@link Configuration}
 * <p>
 * Sub-Element is {@link ObservedERPValues}
 * <p>
 * Example:
 * <pre>
 * &lt;ObservedERPAnalysis &gt;
 *   &lt;Continuous cls="U"&gt;Yes&lt;/Continuous&gt;
 *   &lt;ERPAdaptiveDriverDesc cls="U"&gt;Target Motion Tracking&lt;/ERPAdaptiveDriverDesc&gt;
 *   &lt;ERPAdaptiveRuleDesc cls="U"&gt;Required Pattern Collection&lt;/ERPAdaptiveRuleDesc&gt;
 *   &lt;ERPPatternPeriod cls="U"&gt;55&lt;/ERPPatternPeriod&gt;
 *   &lt;ERPPatternType cls="U"&gt;Non-Patterned&lt;/ERPPatternType&gt;
 *   &lt;ERPActualMax cls="U"&gt;99.54&lt;/ERPActualMax&gt;
 *   &lt;ERPActualMin cls="U"&gt;67.99&lt;/ERPActualMin&gt;
 *   &lt;ERPChangeRate cls="U"&gt;13&lt;/ERPChangeRate&gt;
 *   &lt;ERPExtremeMax cls="U"&gt;125.7&lt;/ERPExtremeMax&gt;
 *   &lt;ERPExtremeMin cls="U"&gt;55.88&lt;/ERPExtremeMin&gt;
 *   &lt;ERPMean cls="U"&gt;111.57&lt;/ERPMean&gt;
 *   &lt;ERPMedian cls="U"&gt;44.88&lt;/ERPMedian&gt;
 *   &lt;ERPSequenceDesc cls="U"&gt;Required Pattern Collection set A34&lt;/ERPSequenceDesc&gt;
 *   &lt;ERPStdDev cls="U"&gt;17&lt;/ERPStdDev&gt;
 *   &lt;ERPStep cls="U"&gt;1.666&lt;/ERPStep&gt;
 *   &lt;NumObsPositions cls="U"&gt;60&lt;/NumObsPositions&gt;
 *   &lt;NumObsValues cls="U"&gt;23&lt;/NumObsValues&gt;
 *   &lt;ObservedERPValues&gt;
 *     &lt;ERPDwell cls="U"&gt;589&lt;/ERPDwell&gt;
 *     &lt;ERPValue cls="U"&gt;128.55&lt;/ERPValue&gt;
 *     &lt;StatisticalIndicator cls="U"&gt;98&lt;/StatisticalIndicator&gt;
 *   &lt;/ObservedERPValues&gt;
 * &lt;/ObservedERPAnalysis &gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedERPAnalysis", propOrder = {
  "continuous",
  "erpAdaptiveDriverDesc",
  "erpAdaptiveRuleDesc",
  "erpPatternPeriod",
  "erpPatternType",
  "erpActualMax",
  "erpActualMin",
  "erpChangeRate",
  "erpExtremeMax",
  "erpExtremeMin",
  "erpMean",
  "erpMedian",
  "erpSequenceDesc",
  "erpStdDev",
  "erpStep",
  "numObsPositions",
  "numObsValues",
  "observedERPValues"
})
public class ObservedERPAnalysis {

  /**
   * Continuous (US), indicate whether pulse-to-pulse ERP variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   */
  @XmlElement(name = "Continuous", required = false)
  private TString continuous;
  /**
   * US:ERPAdaptiveDriverDesc - ERP Driver Description (Optional)
   * <p>
   * The condition which controls, or can be associated with, the signal ERP
   * variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "ERPAdaptiveDriverDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString erpAdaptiveDriverDesc;
  /**
   * US:ERPAdaptiveRuleDesc - ERP Driver Rule Description (Optional)
   * <p>
   * The rule which describes the signal ERP variations.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "ERPAdaptiveRuleDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString erpAdaptiveRuleDesc;
  /**
   * US:ERPPatternPeriod - ERP Pattern Period (Optional)
   * <p>
   * The time duration for one complete cycle of a repeating ERP sequence.
   * <p>
   * Format is UN(12,6) (μsec)
   */
  @XmlElement(name = "ERPPatternPeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal erpPatternPeriod;
  /**
   * ERPPatternType (US), indicate whether ERP is unmodulated ERP variations are
   * Patterned, Non-Patterned, or Adaptive.
   */
  @XmlElement(name = "ERPPatternType", required = false)
  private TString erpPatternType;
  /**
   * US:ERPActualMax - ERP Actual Max Value (Optional)
   * <p>
   * The highest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * [XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than
   * US:ERPActualMin.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPActualMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpActualMax;
  /**
   * US:ERPActualMin - ERP Actual Min Value (Optional)
   * <p>
   * The lowest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPActualMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpActualMin;
  /**
   * US:ERPChangeRate - ERP Change Rate (Optional)
   * <p>
   * The rate of change for ERP variations expressed in ERP change per unit of
   * time.
   * <p>
   * Format is UN(6,4) (dBW/sec)
   */
  @XmlElement(name = "ERPChangeRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterUS_DBWS.class)
  private TDecimal erpChangeRate;
  /**
   * US:ERPExtremeMax - ERP Extreme Max Value (Optional)
   * <p>
   * The upper ERP value that represent 100% of the signal observed ERP values
   * which were obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than
   * US:ERPExtremeMin.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPExtremeMax", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpExtremeMax;
  /**
   * US:ERPExtremeMin - ERP Extreme Min Value (Optional)
   * <p>
   * The lower ERP value that represent 100% of the signal observed ERP values
   * which were obtained from a statistical study of a data set.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPExtremeMin", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpExtremeMin;
  /**
   * US:ERPMean - ERP Mean Value (Optional)
   * <p>
   * The mean ERP value for a signal which changes ERP values on a non-patterned
   * basis.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPMean", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpMean;
  /**
   * US:ERPMedian - ERP Most Probable Value (Optional)
   * <p>
   * The observed ERP value, or the observed ERP values in the case of a signal
   * with multiple discrete/individual ERP values, that the signal most often
   * used based on a statistical study of a dataset.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPMedian", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpMedian;
  /**
   * ERP SequenceDesc (US) - The textual description of the observed algorithm
   * for the sequence of variation for the ERP.
   */
  @XmlElement(name = "ERPSequenceDesc", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString erpSequenceDesc;
  /**
   * US:ERPStdDev - ERP Standard Deviation (Optional)
   * <p>
   * The standard deviation associated with the ERP Value data set that was used
   * to calculate ERPMean.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPStdDev", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpStdDev;
  /**
   * US:ERPStep - ERP Step (Optional)
   * <p>
   * The delta between the Most Probable observed ERP values of adjacent and
   * discrete ERPs.
   * <p>
   * Format is SN(10,7) (dBW)
   */
  @XmlElement(name = "ERPStep", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterDBW.class)
  private TDecimal erpStep;
  /**
   * US:NumObsPositions - Observed Position Count (Optional)
   * <p>
   * The number of discrete ERP dwell/pulse groups, for a pulsed signal, or ERP
   * values at a constant ERP value, for a continuous wave (CW) signal, observed
   * in a signal which contains multiple and discrete ERP values that change in
   * a repeating ERP sequence.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumObsPositions", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numObsPositions;
  /**
   * US:NumObsValues - Observed Value Count (Optional)
   * <p>
   * The number of discrete ERP values observed for a signal which contains
   * multiple and discrete ERP values.
   * <p>
   * Format is UN(6)
   */
  @XmlElement(name = "NumObsValues", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN6.class)
  private TInteger numObsValues;
  /**
   * US:ObservedERPValues (Optional)
   * <p>
   * ObservedERPValues (US) contains specific data artifacts that describe the
   * Effective Radiated Power (ERP) associated with an emitter or Notation.
   */
  @XmlElement(name = "ObservedERPValues")
  private Set<ObservedERPValues> observedERPValues;

  /**
   * Get Continuous (US), indicate whether pulse-to-pulse ERP variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @return the Continuous value in a {@link TString} data type
   */
  public TString getContinuous() {
    return continuous;
  }

  /**
   * Set Continuous (US), indicate whether pulse-to-pulse ERP variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @param value the Continuous value in a {@link TString} data type
   */
  public void setContinuous(TString value) {
    this.continuous = value;
  }

  /**
   * Determine if the Continuous is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetContinuous() {
    return (this.continuous != null ? this.continuous.isSetValue() : false);
  }

  /**
   * Get the condition which controls, or can be associated with, the signal ERP
   * variations.
   * <p>
   * @return the ERPAdaptiveDriverDesc value in a {@link TString} data type
   */
  public TString getERPAdaptiveDriverDesc() {
    return erpAdaptiveDriverDesc;
  }

  /**
   * Set the condition which controls, or can be associated with, the signal ERP
   * variations.
   * <p>
   * @param value the ERPAdaptiveDriverDesc value in a {@link TString} data type
   */
  public void setERPAdaptiveDriverDesc(TString value) {
    this.erpAdaptiveDriverDesc = value;
  }

  /**
   * Determine if the ERPAdaptiveDriverDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPAdaptiveDriverDesc() {
    return (this.erpAdaptiveDriverDesc != null ? this.erpAdaptiveDriverDesc.isSetValue() : false);
  }

  /**
   * Get the rule which describes the signal ERP variations.
   * <p>
   * @return the ERPAdaptiveRuleDesc value in a {@link TString} data type
   */
  public TString getERPAdaptiveRuleDesc() {
    return erpAdaptiveRuleDesc;
  }

  /**
   * Set the rule which describes the signal ERP variations.
   * <p>
   * @param value the ERPAdaptiveRuleDesc value in a {@link TString} data type
   */
  public void setERPAdaptiveRuleDesc(TString value) {
    this.erpAdaptiveRuleDesc = value;
  }

  /**
   * Determine if the ERPAdaptiveRuleDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPAdaptiveRuleDesc() {
    return (this.erpAdaptiveRuleDesc != null ? this.erpAdaptiveRuleDesc.isSetValue() : false);
  }

  /**
   * Get the time duration for one complete cycle of a repeating ERP sequence.
   * <p>
   * @return the ERPPatternPeriod value in a {@link TDecimal} data type
   */
  public TDecimal getERPPatternPeriod() {
    return erpPatternPeriod;
  }

  /**
   * Set the time duration for one complete cycle of a repeating ERP sequence.
   * <p>
   * @param value the ERPPatternPeriod value in a {@link TDecimal} data type
   */
  public void setERPPatternPeriod(TDecimal value) {
    this.erpPatternPeriod = value;
  }

  /**
   * Determine if the ERPPatternPeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPPatternPeriod() {
    return (this.erpPatternPeriod != null ? this.erpPatternPeriod.isSetValue() : false);
  }

  /**
   * Get ERPPatternType (US), indicate whether ERP is unmodulated ERP variations
   * are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @return the ERPPatternType value in a {@link TString} data type
   */
  public TString getERPPatternType() {
    return erpPatternType;
  }

  /**
   * Set ERPPatternType (US), indicate whether ERP is unmodulated ERP variations
   * are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value the ERPPatternType value in a {@link TString} data type
   */
  public void setERPPatternType(TString value) {
    this.erpPatternType = value;
  }

  /**
   * Determine if the ERPPatternType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPPatternType() {
    return (this.erpPatternType != null ? this.erpPatternType.isSetValue() : false);
  }

  /**
   * Get the highest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * [XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than
   * US:ERPActualMin.
   * <p>
   * @return the ERPActualMax value in a {@link TDecimal} data type
   */
  public TDecimal getERPActualMax() {
    return erpActualMax;
  }

  /**
   * Set the highest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * [XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than
   * US:ERPActualMin.
   * <p>
   * @param value the ERPActualMax value in a {@link TDecimal} data type
   */
  public void setERPActualMax(TDecimal value) {
    this.erpActualMax = value;
  }

  /**
   * Determine if the ERPActualMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPActualMax() {
    return (this.erpActualMax != null ? this.erpActualMax.isSetValue() : false);
  }

  /**
   * Get the lowest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * @return the ERPActualMin value in a {@link TDecimal} data type
   */
  public TDecimal getERPActualMin() {
    return erpActualMin;
  }

  /**
   * Set the lowest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * @param value the ERPActualMin value in a {@link TDecimal} data type
   */
  public void setERPActualMin(TDecimal value) {
    this.erpActualMin = value;
  }

  /**
   * Determine if the ERPActualMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPActualMin() {
    return (this.erpActualMin != null ? this.erpActualMin.isSetValue() : false);
  }

  /**
   * Get the rate of change for ERP variations expressed in ERP change per unit
   * of time.
   * <p>
   * @return the ERPChangeRate value in a {@link TDecimal} data type
   */
  public TDecimal getERPChangeRate() {
    return erpChangeRate;
  }

  /**
   * Set the rate of change for ERP variations expressed in ERP change per unit
   * of time.
   * <p>
   * @param value the ERPChangeRate value in a {@link TDecimal} data type
   */
  public void setERPChangeRate(TDecimal value) {
    this.erpChangeRate = value;
  }

  /**
   * Determine if the ERPChangeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPChangeRate() {
    return (this.erpChangeRate != null ? this.erpChangeRate.isSetValue() : false);
  }

  /**
   * Get the upper ERP value that represent 100% of the signal observed ERP
   * values which were obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than
   * US:ERPExtremeMin.
   * <p>
   * @return the ERPExtremeMax value in a {@link TDecimal} data type
   */
  public TDecimal getERPExtremeMax() {
    return erpExtremeMax;
  }

  /**
   * Set the upper ERP value that represent 100% of the signal observed ERP
   * values which were obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than
   * US:ERPExtremeMin.
   * <p>
   * @param value the ERPExtremeMax value in a {@link TDecimal} data type
   */
  public void setERPExtremeMax(TDecimal value) {
    this.erpExtremeMax = value;
  }

  /**
   * Determine if the ERPExtremeMax is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPExtremeMax() {
    return (this.erpExtremeMax != null ? this.erpExtremeMax.isSetValue() : false);
  }

  /**
   * Get the lower ERP value that represent 100% of the signal observed ERP
   * values which were obtained from a statistical study of a data set.
   * <p>
   * @return the ERPExtremeMin value in a {@link TDecimal} data type
   */
  public TDecimal getERPExtremeMin() {
    return erpExtremeMin;
  }

  /**
   * Set the lower ERP value that represent 100% of the signal observed ERP
   * values which were obtained from a statistical study of a data set.
   * <p>
   * @param value the ERPExtremeMin value in a {@link TDecimal} data type
   */
  public void setERPExtremeMin(TDecimal value) {
    this.erpExtremeMin = value;
  }

  /**
   * Determine if the ERPExtremeMin is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPExtremeMin() {
    return (this.erpExtremeMin != null ? this.erpExtremeMin.isSetValue() : false);
  }

  /**
   * Get the mean ERP value for a signal which changes ERP values on a
   * non-patterned basis.
   * <p>
   * @return the ERPMean value in a {@link TDecimal} data type
   */
  public TDecimal getERPMean() {
    return erpMean;
  }

  /**
   * Set the mean ERP value for a signal which changes ERP values on a
   * non-patterned basis.
   * <p>
   * @param value the ERPMean value in a {@link TDecimal} data type
   */
  public void setERPMean(TDecimal value) {
    this.erpMean = value;
  }

  /**
   * Determine if the ERPMean is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPMean() {
    return (this.erpMean != null ? this.erpMean.isSetValue() : false);
  }

  /**
   * Get the observed ERP value, or the observed ERP values in the case of a
   * signal with multiple discrete/individual ERP values, that the signal most
   * often used based on a statistical study of a dataset.
   * <p>
   * @return the ERPMedian value in a {@link TDecimal} data type
   */
  public TDecimal getERPMedian() {
    return erpMedian;
  }

  /**
   * Set the observed ERP value, or the observed ERP values in the case of a
   * signal with multiple discrete/individual ERP values, that the signal most
   * often used based on a statistical study of a dataset.
   * <p>
   * @param value the ERPMedian value in a {@link TDecimal} data type
   */
  public void setERPMedian(TDecimal value) {
    this.erpMedian = value;
  }

  /**
   * Determine if the ERPMedian is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPMedian() {
    return (this.erpMedian != null ? this.erpMedian.isSetValue() : false);
  }

  /**
   * Get ERP SequenceDesc (US) - The textual description of the observed
   * algorithm for the sequence of variation for the ERP.
   * <p>
   * @return the ERPSequenceDesc value in a {@link TString} data type
   */
  public TString getERPSequenceDesc() {
    return erpSequenceDesc;
  }

  /**
   * Set ERP SequenceDesc (US) - The textual description of the observed
   * algorithm for the sequence of variation for the ERP.
   * <p>
   * @param value the ERPSequenceDesc value in a {@link TString} data type
   */
  public void setERPSequenceDesc(TString value) {
    this.erpSequenceDesc = value;
  }

  /**
   * Determine if the ERPSequenceDesc is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPSequenceDesc() {
    return (this.erpSequenceDesc != null ? this.erpSequenceDesc.isSetValue() : false);
  }

  /**
   * Get the standard deviation associated with the ERP Value data set that was
   * used to calculate ERPMean.
   * <p>
   * @return the ERPStdDev value in a {@link TDecimal} data type
   */
  public TDecimal getERPStdDev() {
    return erpStdDev;
  }

  /**
   * Set the standard deviation associated with the ERP Value data set that was
   * used to calculate ERPMean.
   * <p>
   * @param value the ERPStdDev value in a {@link TDecimal} data type
   */
  public void setERPStdDev(TDecimal value) {
    this.erpStdDev = value;
  }

  /**
   * Determine if the ERPStdDev is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPStdDev() {
    return (this.erpStdDev != null ? this.erpStdDev.isSetValue() : false);
  }

  /**
   * Get the delta between the Most Probable observed ERP values of adjacent and
   * discrete ERPs.
   * <p>
   * @return the ERPStep value in a {@link TDecimal} data type
   */
  public TDecimal getERPStep() {
    return erpStep;
  }

  /**
   * Set the delta between the Most Probable observed ERP values of adjacent and
   * discrete ERPs.
   * <p>
   * @param value the ERPStep value in a {@link TDecimal} data type
   */
  public void setERPStep(TDecimal value) {
    this.erpStep = value;
  }

  /**
   * Determine if the ERPStep is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetERPStep() {
    return (this.erpStep != null ? this.erpStep.isSetValue() : false);
  }

  /**
   * Get the number of discrete ERP dwell/pulse groups, for a pulsed signal, or
   * ERP values at a constant ERP value, for a continuous wave (CW) signal,
   * observed in a signal which contains multiple and discrete ERP values that
   * change in a repeating ERP sequence.
   * <p>
   * @return the NumObsPositions value in a {@link TInteger} data type
   */
  public TInteger getNumObsPositions() {
    return numObsPositions;
  }

  /**
   * Set the number of discrete ERP dwell/pulse groups, for a pulsed signal, or
   * ERP values at a constant ERP value, for a continuous wave (CW) signal,
   * observed in a signal which contains multiple and discrete ERP values that
   * change in a repeating ERP sequence.
   * <p>
   * @param value the NumObsPositions value in a {@link TInteger} data type
   */
  public void setNumObsPositions(TInteger value) {
    this.numObsPositions = value;
  }

  /**
   * Determine if the NumObsPositions is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumObsPositions() {
    return (this.numObsPositions != null ? this.numObsPositions.isSetValue() : false);
  }

  /**
   * Get the number of discrete ERP values observed for a signal which contains
   * multiple and discrete ERP values.
   * <p>
   * @return the NumObsValues value in a {@link TInteger} data type
   */
  public TInteger getNumObsValues() {
    return numObsValues;
  }

  /**
   * Set the number of discrete ERP values observed for a signal which contains
   * multiple and discrete ERP values.
   * <p>
   * @param value the NumObsValues value in a {@link TInteger} data type
   */
  public void setNumObsValues(TInteger value) {
    this.numObsValues = value;
  }

  /**
   * Determine if the NumObsValues is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumObsValues() {
    return (this.numObsValues != null ? this.numObsValues.isSetValue() : false);
  }

  /**
   * Get the US:ObservedERPValues
   * <p>
   * Complex element ObservedERPValues (US) contains specific data artifacts
   * that describe the Effective Radiated Power (ERP) associated with an emitter
   * or Notation.
   * <p>
   * @return a non-null but possibly empty list of {@link ObservedERPValues}
   *         instances
   */
  public Set<ObservedERPValues> getObservedERPValues() {
    if (observedERPValues == null) {
      observedERPValues = new HashSet<>();
    }
    return this.observedERPValues;
  }

  /**
   * Determine if the ObservedERPValues is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedERPValues() {
    return ((this.observedERPValues != null) && (!this.observedERPValues.isEmpty()));
  }

  /**
   * Clear the ObservedERPValues field. This sets the field to null.
   */
  public void unsetObservedERPValues() {
    this.observedERPValues = null;
  }

  /**
   * Set Continuous (US), indicate whether pulse-to-pulse ERP variations are
   * Discrete or Continuous. Discrete uses a finite number of fixed values
   * separated by ranges of unused values. Continuous potentially uses an
   * infinite number of values within one or more ranges.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withContinuous(ListCBO value) {
    setContinuous(new TString(value.value()));
    return this;
  }

  /**
   * Set the condition which controls, or can be associated with, the signal ERP
   * variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPAdaptiveDriverDesc(String value) {
    setERPAdaptiveDriverDesc(new TString(value));
    return this;
  }

  /**
   * Set the rule which describes the signal ERP variations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPAdaptiveRuleDesc(String value) {
    setERPAdaptiveRuleDesc(new TString(value));
    return this;
  }

  /**
   * Set the time duration for one complete cycle of a repeating ERP sequence.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPPatternPeriod(Double value) {
    setERPPatternPeriod(new TDecimal(value));
    return this;
  }

  /**
   * Set ERPPatternType (US), indicate whether ERP is unmodulated ERP variations
   * are Patterned, Non-Patterned, or Adaptive.
   * <p>
   * @param value An instances of type {@link ListUS7}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPPatternType(ListUS7 value) {
    setERPPatternType(new TString(value.value()));
    return this;
  }

  /**
   * Set the highest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * [XSL ERR MINMAX] If US:ERPActualMax is used, it MUST be greater than
   * US:ERPActualMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPActualMax(Double value) {
    setERPActualMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lowest discrete ERP value which is found in a single piece of a
   * complete data (e.g., in a single intercept that contains the complete ERP
   * characteristics of the signal).
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPActualMin(Double value) {
    setERPActualMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the rate of change for ERP variations expressed in ERP change per unit
   * of time.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPChangeRate(Double value) {
    setERPChangeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the upper ERP value that represent 100% of the signal observed ERP
   * values which were obtained from a statistical study of a data set.
   * <p>
   * [XSL ERR MINMAX] If US:ERPExtremeMax is used, it MUST be greater than
   * US:ERPExtremeMin.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPExtremeMax(Double value) {
    setERPExtremeMax(new TDecimal(value));
    return this;
  }

  /**
   * Set the lower ERP value that represent 100% of the signal observed ERP
   * values which were obtained from a statistical study of a data set.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPExtremeMin(Double value) {
    setERPExtremeMin(new TDecimal(value));
    return this;
  }

  /**
   * Set the mean ERP value for a signal which changes ERP values on a
   * non-patterned basis.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPMean(Double value) {
    setERPMean(new TDecimal(value));
    return this;
  }

  /**
   * Set the observed ERP value, or the observed ERP values in the case of a
   * signal with multiple discrete/individual ERP values, that the signal most
   * often used based on a statistical study of a dataset.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPMedian(Double value) {
    setERPMedian(new TDecimal(value));
    return this;
  }

  /**
   * Set ERP SequenceDesc (US) - The textual description of the observed
   * algorithm for the sequence of variation for the ERP.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPSequenceDesc(String value) {
    setERPSequenceDesc(new TString(value));
    return this;
  }

  /**
   * Set the standard deviation associated with the ERP Value data set that was
   * used to calculate ERPMean.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPStdDev(Double value) {
    setERPStdDev(new TDecimal(value));
    return this;
  }

  /**
   * Set the delta between the Most Probable observed ERP values of adjacent and
   * discrete ERPs.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withERPStep(Double value) {
    setERPStep(new TDecimal(value));
    return this;
  }

  /**
   * Set the number of discrete ERP dwell/pulse groups, for a pulsed signal, or
   * ERP values at a constant ERP value, for a continuous wave (CW) signal,
   * observed in a signal which contains multiple and discrete ERP values that
   * change in a repeating ERP sequence.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withNumObsPositions(Integer value) {
    setNumObsPositions(new TInteger(value));
    return this;
  }

  /**
   * Set the number of discrete ERP values observed for a signal which contains
   * multiple and discrete ERP values.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withNumObsValues(Integer value) {
    setNumObsValues(new TInteger(value));
    return this;
  }

  /**
   * Set the US:ObservedERPValues
   * <p>
   * Complex element ObservedERPValues (US) contains specific data artifacts
   * that describe the Effective Radiated Power (ERP) associated with an emitter
   * or Notation.
   * <p>
   * @param values One or more instances of type {@link ObservedERPValues}
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withObservedERPValues(ObservedERPValues... values) {
    if (values != null) {
      getObservedERPValues().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return this;
  }

  /**
   * Set the US:ObservedERPValues
   * <p>
   * Complex element ObservedERPValues (US) contains specific data artifacts
   * that describe the Effective Radiated Power (ERP) associated with an emitter
   * or Notation.
   * <p>
   * @param values A collection of {@link ObservedERPValues} instances
   * @return The current ObservedERPAnalysis object instance
   */
  public ObservedERPAnalysis withObservedERPValues(Set<ObservedERPValues> values) {
    if (values != null) {
      getObservedERPValues().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this ObservedERPAnalysis instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "ObservedERPAnalysis {"
      + (erpMean != null ? " erpMean [" + erpMean + "]" : "")
      + (continuous != null ? " continuous [" + continuous + "]" : "")
      + (erpPatternPeriod != null ? " erpPatternPeriod [" + erpPatternPeriod + "]" : "")
      + (numObsValues != null ? " numObsValues [" + numObsValues + "]" : "")
      + (observedERPValues != null ? " observedERPValues [" + observedERPValues + "]" : "")
      + (erpStdDev != null ? " erpStdDev [" + erpStdDev + "]" : "")
      + (erpSequenceDesc != null ? " erpSequenceDesc [" + erpSequenceDesc + "]" : "")
      + (erpActualMax != null ? " erpActualMax [" + erpActualMax + "]" : "")
      + (erpActualMin != null ? " erpActualMin [" + erpActualMin + "]" : "")
      + (erpExtremeMax != null ? " erpExtremeMax [" + erpExtremeMax + "]" : "")
      + (erpExtremeMin != null ? " erpExtremeMin [" + erpExtremeMin + "]" : "")
      + (erpMedian != null ? " erpMedian [" + erpMedian + "]" : "")
      + (erpAdaptiveDriverDesc != null ? " erpAdaptiveDriverDesc [" + erpAdaptiveDriverDesc + "]" : "")
      + (numObsPositions != null ? " numObsPositions [" + numObsPositions + "]" : "")
      + (erpChangeRate != null ? " erpChangeRate [" + erpChangeRate + "]" : "")
      + (erpStep != null ? " erpStep [" + erpStep + "]" : "")
      + (erpAdaptiveRuleDesc != null ? " erpAdaptiveRuleDesc [" + erpAdaptiveRuleDesc + "]" : "")
      + (erpPatternType != null ? " erpPatternType [" + erpPatternType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link ObservedERPAnalysis} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}