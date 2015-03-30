package us.gov.dod.standard.ssrf._3_1.receiver;

import javax.xml.bind.annotation.*;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
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
   * DigitalModType - Digital Modulaton Type (Optional)    * <p>
   * The type of digital modulation.
   * <p>
   * Format is L:CMO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DigitalModType", required = false)
  private TString digitalModType;
  /**
   * MaxBitRate - Maximum Bit Rate (Optional)    * <p>
   * The maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * Format is UN(10,3) (kbit/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MaxBitRate", required = false)
  private BitRate maxBitRate;
  /**
   * NumStates - Number of Digital States (Optional)    * <p>
   * The total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64 for 64
   * level Quadrature AM.
   * <p>
   * Format is UN(5)
   * <p>
   * Attribute group DigitalFormat (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "NumStates", required = false)
  private UN5 numStates;
  /**
   * LineCoding - Line Coding (Optional)    * <p>
   * The format used to represent binary digit sequencing when digital
   * modulation is used.
   * <p>
   * Format is L:CDF
   * <p>
   * Attribute group DigitalFormat (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "LineCoding", required = false)
  private TString lineCoding;
  /**
   * CodeRate - Pseudorandom Code Rate (Optional)    * <p>
   * The pseudorandom code rate.
   * <p>
   * Format is UN(10,3) (kbit/sec)
   * <p>
   * Attribute group DigitalFormat (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CodeRate", required = false)
  private BitRate codeRate;
  /**
   * CodePeriod - Pseudorandom Code Repetition Period (Optional)    * <p>
   * The length of time of the pseudorandom code repetition period.
   * <p>
   * Format is UN(12,6) (μsec)
   * <p>
   * Attribute group DigitalFormat (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "CodePeriod", required = false)
  private microsecs codePeriod;

  /**
   * Get the type of digital modulation..
   * <p>
   * @return the DigitalModType value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getDigitalModType() {
    return digitalModType;
  }

  /**
   * Set the type of digital modulation..
   * <p>
   * @param value the DigitalModType value in a {@link TString} data type
   * @since 3.1.0
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
   * clock or chip rate..
   * <p>
   * @return a {@link BitRate} instance
   * @since 3.1.0
   */
  public BitRate getMaxBitRate() {
    return maxBitRate;
  }

  /**
   * Set the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate..
   * <p>
   * @param value a {@link BitRate} instance
   * @since 3.1.0
   */
  public void setMaxBitRate(BitRate value) {
    this.maxBitRate = value;
  }

  /**
   * Determine if the MaxBitRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetMaxBitRate() {
    return (this.maxBitRate != null ? this.maxBitRate.isSetValue() : false);
  }

  /**
   * Get the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64
   * for 64 level Quadrature AM..
   * <p>
   * @return a {@link UN5} instance
   * @since 3.1.0
   */
  public UN5 getNumStates() {
    return numStates;
  }

  /**
   * Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64
   * for 64 level Quadrature AM..
   * <p>
   * @param value a {@link UN5} instance
   * @since 3.1.0
   */
  public void setNumStates(UN5 value) {
    this.numStates = value;
  }

  /**
   * Determine if the NumStates is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetNumStates() {
    return (this.numStates != null ? this.numStates.isSetValue() : false);
  }

  /**
   * Get the format used to represent binary digit sequencing when digital
   * modulation is used..
   * <p>
   * @return the LineCoding value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getLineCoding() {
    return lineCoding;
  }

  /**
   * Set the format used to represent binary digit sequencing when digital
   * modulation is used..
   * <p>
   * @param value the LineCoding value in a {@link TString} data type
   * @since 3.1.0
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
   * Get the pseudorandom code rate..
   * <p>
   * @return a {@link BitRate} instance
   * @since 3.1.0
   */
  public BitRate getCodeRate() {
    return codeRate;
  }

  /**
   * Set the pseudorandom code rate..
   * <p>
   * @param value a {@link BitRate} instance
   * @since 3.1.0
   */
  public void setCodeRate(BitRate value) {
    this.codeRate = value;
  }

  /**
   * Determine if the CodeRate is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodeRate() {
    return (this.codeRate != null ? this.codeRate.isSetValue() : false);
  }

  /**
   * Get the length of time of the pseudorandom code repetition period..
   * <p>
   * @return a {@link microsecs} instance
   * @since 3.1.0
   */
  public microsecs getCodePeriod() {
    return codePeriod;
  }

  /**
   * Set the length of time of the pseudorandom code repetition period..
   * <p>
   * @param value a {@link microsecs} instance
   * @since 3.1.0
   */
  public void setCodePeriod(microsecs value) {
    this.codePeriod = value;
  }

  /**
   * Determine if the CodePeriod is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCodePeriod() {
    return (this.codePeriod != null ? this.codePeriod.isSetValue() : false);
  }

  /**
   * Set the type of digital modulation.
   * <p>
   * @param value An instances of type {@link ListCMO}.
   * @return The current RxModulation object instance.
   * @since 3.1.0
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
   * @param value An instances of type {@link Double}.
   * @return The current RxModulation object instance.
   * @since 3.1.0
   */
  public RxModulation withMaxBitRate(Double value) {
    setMaxBitRate(new BitRate(value));
    return this;
  }

  /**
   * Set the total number of states, e.g., 4 for 4-ary Phase Shift-Keying, 64
   * for 64 level Quadrature AM.
   * <p>
   * @param value An instances of type {@link Integer}.
   * @return The current RxModulation object instance.
   * @since 3.1.0
   */
  public RxModulation withNumStates(Integer value) {
    setNumStates(new UN5(value));
    return this;
  }

  /**
   * Set the format used to represent binary digit sequencing when digital
   * modulation is used.
   * <p>
   * @param value An instances of type {@link ListCDF}.
   * @return The current RxModulation object instance.
   * @since 3.1.0
   */
  public RxModulation withLineCoding(ListCDF value) {
    setLineCoding(new TString(value.value()));
    return this;
  }

  /**
   * Set the pseudorandom code rate.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxModulation object instance.
   * @since 3.1.0
   */
  public RxModulation withCodeRate(Double value) {
    setCodeRate(new BitRate(value));
    return this;
  }

  /**
   * Set the length of time of the pseudorandom code repetition period.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current RxModulation object instance.
   * @since 3.1.0
   */
  public RxModulation withCodePeriod(Double value) {
    setCodePeriod(new microsecs(value));
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
           + (codePeriod != null ? " codePeriod [" + codePeriod + "]" : "")
           + (codeRate != null ? " codeRate [" + codeRate + "]" : "")
           + (digitalModType != null ? " digitalModType [" + digitalModType + "]" : "")
           + (lineCoding != null ? " lineCoding [" + lineCoding + "]" : "")
           + (maxBitRate != null ? " maxBitRate [" + maxBitRate + "]" : "")
           + (numStates != null ? " numStates [" + numStates + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxModulation} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
