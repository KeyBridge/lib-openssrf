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
package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCDF;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCMO;
import us.gov.dod.standard.ssrf._3_1.transmitter.TxModulation;

/**
 * RxModulation contains the detailed characteristics of the modulation on the
 * receiver side.
 * <p>
 * Element of {@link RxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;RxModulation&gt;
 *   &lt;DigitalModType cls="U"&gt;ASK/OOK&lt;/DigitalModType&gt;
 *   &lt;MaxBitRate cls="U"&gt;27000000&lt;/MaxBitRate&gt;
 * &lt;/RxModulation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxModulation", propOrder = {
  "digitalModType",
  "maxBitRate",
  "numStates",
  "lineCoding",
  "codeRate",
  "codePeriod"
})
@XmlSeeAlso({
  TxModulation.class
})
public class RxModulation {

  /**
   * DigitalModType - Digital Modulaton Type (Optional)
   * <p>
   * The type of digital modulation.
   * <p>
   * Format is L:CMO
   */
  @XmlElement(name = "DigitalModType", required = false)
  private TString digitalModType;
  /**
   * MaxBitRate - Maximum Bit Rate (Optional)
   * <p>
   * The maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * Format is UN(10,3) (kbit/sec)
   */
  @XmlElement(name = "MaxBitRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterBITRATE.class)
  private TDecimal maxBitRate;
  /**
   * NumStates - Number of Digital States (Optional)
   * <p>
   * The total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64 for 64
   * level Quadrature AM.
   * <p>
   * Format is UN(5)
   * <p>
   * Attribute group DigitalFormat (Optional)
   */
  @XmlElement(name = "NumStates", required = false)
  @XmlTypeValidator(type = TInteger.class, value = XmlAdapterUN5.class)
  private TInteger numStates;
  /**
   * LineCoding - Line Coding (Optional)
   * <p>
   * The format used to represent binary digit sequencing when digital
   * modulation is used.
   * <p>
   * Format is L:CDF
   * <p>
   * Attribute group DigitalFormat (Optional)
   */
  @XmlElement(name = "LineCoding", required = false)
  private TString lineCoding;
  /**
   * CodeRate - Pseudorandom Code Rate (Optional)
   * <p>
   * The pseudorandom code rate.
   * <p>
   * Format is UN(10,3) (kbit/sec)
   * <p>
   * Attribute group DigitalFormat (Optional)
   */
  @XmlElement(name = "CodeRate", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterBITRATE.class)
  private TDecimal codeRate;
  /**
   * CodePeriod - Pseudorandom Code Repetition Period (Optional)
   * <p>
   * The length of time of the pseudorandom code repetition period.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group DigitalFormat (Optional)
   */
  @XmlElement(name = "CodePeriod", required = false)
  @XmlTypeValidator(type = TDecimal.class, value = XmlAdapterMICROSECS.class)
  private TDecimal codePeriod;

  /**
   * Get the type of digital modulation.
   * <p>
   * @return the DigitalModType value in a {@link TString} data type
   */
  public TString getDigitalModType() {
    return digitalModType;
  }

  /**
   * Set the type of digital modulation.
   * <p>
   * @param value the DigitalModType value in a {@link TString} data type
   */
  public void setDigitalModType(TString value) {
    this.digitalModType = value;
  }

  /**
   * Determine if the DigitalModType is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDigitalModType() {
    return (this.digitalModType != null ? this.digitalModType.isSetValue() : false);
  }

  /**
   * Get the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * @return the MaxBitRate value in a {@link TDecimal} data type
   */
  public TDecimal getMaxBitRate() {
    return maxBitRate;
  }

  /**
   * Set the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * @param value the MaxBitRate value in a {@link TDecimal} data type
   */
  public void setMaxBitRate(TDecimal value) {
    this.maxBitRate = value;
  }

  /**
   * Determine if the MaxBitRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxBitRate() {
    return (this.maxBitRate != null ? this.maxBitRate.isSetValue() : false);
  }

  /**
   * Get the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64
   * for 64 level Quadrature AM.
   * <p>
   * @return the NumStates value in a {@link TInteger} data type
   */
  public TInteger getNumStates() {
    return numStates;
  }

  /**
   * Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64
   * for 64 level Quadrature AM.
   * <p>
   * @param value the NumStates value in a {@link TInteger} data type
   */
  public void setNumStates(TInteger value) {
    this.numStates = value;
  }

  /**
   * Determine if the NumStates is configured.
   * <p>
   * If configured this method also inspects the {@link TInteger} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumStates() {
    return (this.numStates != null ? this.numStates.isSetValue() : false);
  }

  /**
   * Get the format used to represent binary digit sequencing when digital
   * modulation is used.
   * <p>
   * @return the LineCoding value in a {@link TString} data type
   */
  public TString getLineCoding() {
    return lineCoding;
  }

  /**
   * Set the format used to represent binary digit sequencing when digital
   * modulation is used.
   * <p>
   * @param value the LineCoding value in a {@link TString} data type
   */
  public void setLineCoding(TString value) {
    this.lineCoding = value;
  }

  /**
   * Determine if the LineCoding is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLineCoding() {
    return (this.lineCoding != null ? this.lineCoding.isSetValue() : false);
  }

  /**
   * Get the pseudorandom code rate.
   * <p>
   * @return the CodeRate value in a {@link TDecimal} data type
   */
  public TDecimal getCodeRate() {
    return codeRate;
  }

  /**
   * Set the pseudorandom code rate.
   * <p>
   * @param value the CodeRate value in a {@link TDecimal} data type
   */
  public void setCodeRate(TDecimal value) {
    this.codeRate = value;
  }

  /**
   * Determine if the CodeRate is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeRate() {
    return (this.codeRate != null ? this.codeRate.isSetValue() : false);
  }

  /**
   * Get the length of time of the pseudorandom code repetition period.
   * <p>
   * @return the CodePeriod value in a {@link TDecimal} data type
   */
  public TDecimal getCodePeriod() {
    return codePeriod;
  }

  /**
   * Set the length of time of the pseudorandom code repetition period.
   * <p>
   * @param value the CodePeriod value in a {@link TDecimal} data type
   */
  public void setCodePeriod(TDecimal value) {
    this.codePeriod = value;
  }

  /**
   * Determine if the CodePeriod is configured.
   * <p>
   * If configured this method also inspects the {@link TDecimal} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodePeriod() {
    return (this.codePeriod != null ? this.codePeriod.isSetValue() : false);
  }

  /**
   * Set the type of digital modulation.
   * <p>
   * @param value An instances of type {@link ListCMO}
   * @return The current RxModulation object instance
   */
  public RxModulation withDigitalModType(ListCMO value) {
    setDigitalModType(new TString(value.value()));
    return this;
  }

  /**
   * Set the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxModulation object instance
   */
  public RxModulation withMaxBitRate(Double value) {
    setMaxBitRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64
   * for 64 level Quadrature AM.
   * <p>
   * @param value An instances of type {@link Integer}
   * @return The current RxModulation object instance
   */
  public RxModulation withNumStates(Integer value) {
    setNumStates(new TInteger(value));
    return this;
  }

  /**
   * Set the format used to represent binary digit sequencing when digital
   * modulation is used.
   * <p>
   * @param value An instances of type {@link ListCDF}
   * @return The current RxModulation object instance
   */
  public RxModulation withLineCoding(ListCDF value) {
    setLineCoding(new TString(value.value()));
    return this;
  }

  /**
   * Set the pseudorandom code rate.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxModulation object instance
   */
  public RxModulation withCodeRate(Double value) {
    setCodeRate(new TDecimal(value));
    return this;
  }

  /**
   * Set the length of time of the pseudorandom code repetition period.
   * <p>
   * @param value An instances of type {@link Double}
   * @return The current RxModulation object instance
   */
  public RxModulation withCodePeriod(Double value) {
    setCodePeriod(new TDecimal(value));
    return this;
  }

  /**
   * Get a string representation of this RxModulation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxModulation {"
      + (maxBitRate != null ? " maxBitRate [" + maxBitRate + "]" : "")
      + (codePeriod != null ? " codePeriod [" + codePeriod + "]" : "")
      + (numStates != null ? " numStates [" + numStates + "]" : "")
      + (lineCoding != null ? " lineCoding [" + lineCoding + "]" : "")
      + (codeRate != null ? " codeRate [" + codeRate + "]" : "")
      + (digitalModType != null ? " digitalModType [" + digitalModType + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxModulation} has no configuration requirement.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
