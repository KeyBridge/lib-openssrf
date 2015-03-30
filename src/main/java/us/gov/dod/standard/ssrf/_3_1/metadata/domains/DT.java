package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterDATETIME;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * The SSRF DT data type.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT", propOrder = {"value"})
public class DT extends AMetadata<DT> implements Comparable<DT> {

  /**
   * UTC. The default time zone.
   */
  private static final TimeZone TIMEZONE = TimeZone.getTimeZone("UTC");
  /**
   * "yyyy-MM-dd'T'HH:mm:ss.SSSZ". The DateTime pattern.
   * <p>
   * DT is a date / time value formatted in 20 to 24 characters as
   * YYYY-MM-DDThh:mm:ss[.ddd]Z (year-
   * month-day"T"hours:minutes:seconds.milliseconds"Z"), where the milliseconds
   * part is optional. This format is compliant with the W3C Recommendation on
   * XML Schema.
   */
  private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

  /**
   * The value property.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterDATETIME.class)
  protected Calendar value;

  /**
   * Construct a new, empty DT instance.
   */
  public DT() {
  }

  /**
   * Construct a new DT instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public DT(Calendar value) {
    setValue(value);
  }

  /**
   * Construct a new DT instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public DT(Date value) {
    setValue(value);
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return the value of the value property.
   */
  public Calendar getValue() {
    return (value != null ? (Calendar) value.clone() : null);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Calendar value) {
    this.value = (value != null ? (Calendar) value.clone() : null);
    this.value.setTimeZone(TIMEZONE);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public final void setValue(Date value) {
    if (value != null) {
      this.value = Calendar.getInstance(TIMEZONE);
      this.value.setTime(value);
    } else {
      this.value = null;
    }
  }

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TCalendar} requires {@link ListCCL cls} and {@link Calendar value}
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
   * Get the configured value.
   * <p>
   * @return the value.
   */
  @Override
  public String toString() {
    if (value != null) {
      SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
      sdf.setCalendar(value);
      return sdf.format(value.getTime());
    }
    return null;
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
    return Objects.equals(this.value, ((DT) obj).getValue());
  }

  /**
   * Comparison and sorting is in REVERSE chronological order (Newest to Oldest)
   * <p>
   * @param obj the other object to compare
   * @return the reverse chronological order
   */
  @Override
  public int compareTo(DT obj) {
    if (obj == null) {
      return 1;
    }
    if (this.value == null) {
      return -1;
    }
    return -1 * this.value.compareTo(obj.getValue());
  }//</editor-fold>
}
