package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.math.BigDecimal;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterMINUTES;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;

/**
 * The SSRF minutes data type.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/28/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "minutes", propOrder = {"value"})
public class minutes extends AMetadata<minutes> implements Comparable<minutes> {

  /**
   * The value property.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterMINUTES.class)
  protected BigDecimal value;

  /**
   * Construct a new, empty minutes instance.
   */
  public minutes() {
  }

  /**
   * Construct a new minutes instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public minutes(BigDecimal value) {
    this.value = value;
  }

  /**
   * Get the value of the value property.
   * <p>
   * @return the value of the value property
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Set the value of the value property.
   * <p>
   * @param the value
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Determine if the value property is configured.
   * <p>
   * @return TRUE if the value is set, FALSE if the value is null
   */
  public boolean isSetValue() {
    return this.value != null;
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

  /**
   * Get a string representation of this data wrapper value.
   * <p>
   * @return The current data value.
   */
  @Override
  public String toString() {
    return this.value != null ? this.value.toString() : null;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the value.
   * <p>
   * @return a unique hash code from the value.
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the value.
   * <p>
   * @param obj the other object to compare.
   * @return TRUE if the values match exactly.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((minutes) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(minutes obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>
}
