package us.gov.dod.standard.ssrf._3_1.assignment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.AsgnFreqBase;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAU;

/**
 * FreqOld indicates a previously assigned single frequency or range of
 * frequencies.
 * <p>
 * Element of {@link Assigned}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqOld")
public class FreqOld extends AsgnFreqBase {

  /**
   * Set the nominal frequency or minimum value of the frequency range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqOld object instance.
   * @since 3.1.0
   */
  @Override
  public FreqOld withFreqMin(Double value) {
    setFreqMin(new FreqM(value));
    return this;
  }

  /**
   * Set the maximum value of the frequencies in the range.
   * <p>
   * [XSL ERR MINMAX] If FreqMax is used, it MUST be greater than FreqMin.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqOld object instance.
   * @since 3.1.0
   */
  @Override
  public FreqOld withFreqMax(Double value) {
    setFreqMax(new FreqM(value));
    return this;
  }

  /**
   * Set the reference frequency of a suppressed or reduced carrier sideband.
   * This item only applies to a single frequency and should not be used with a
   * range.
   * <p>
   * @param value An instances of type {@link Double}.
   * @return The current FreqOld object instance.
   * @since 3.1.0
   */
  @Override
  public FreqOld withRefFreq(Double value) {
    setRefFreq(new FreqM(value));
    return this;
  }

  /**
   * Set the intended usage of the frequency: transmit, receive or both.
   * <p>
   * @param value An instances of type {@link ListCAU}.
   * @return The current FreqOld object instance.
   * @since 3.1.0
   */
  @Override
  public FreqOld withFreqUse(ListCAU value) {
    setFreqUse(new TString(value.value()));
    return this;
  }

  /**
   * Get a string representation of this FreqOld instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FreqOld {" + super.toString() + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqOld} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
