package us.gov.dod.standard.ssrf._3_1.assignment;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.Assignment;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * Previous Authorization (US) refers to the frequency assignment's previous
 * Government Master File (GMF) authorization agency serial number.
 * <p>
 * Element of {@link Assignment}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousAuthorization", propOrder = {
  "docketNum",
  "date",
  "agencySerialNum"
})
public class PreviousAuthorization {

  /**
   * US:DocketNum - Docket Number (Required)    * <p>
   * The previous frequency assignment Government Master File (GMF)
   * authorization docket number.
   * <p>
   * Format is S8
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "DocketNum", required = true)
  private S8 docketNum;
  @XmlElement(name = "Date ", required = false)
  private D date;
  /**
   * US:AgencySerialNum - Agency Serial Number (Optional)    * <p>
   * The externally-assigned unique identifier of a frequency assignment.
   * <p>
   * Format is S12
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AgencySerialNum", required = false)
  private S12 agencySerialNum;

  /**
   * Get the previous frequency assignment Government Master File (GMF)
   * authorization docket number..
   * <p>
   * @return a {@link S8} instance
   * @since 3.1.0
   */
  public S8 getDocketNum() {
    return docketNum;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization docket number..
   * <p>
   * @param value a {@link S8} instance
   * @since 3.1.0
   */
  public void setDocketNum(S8 value) {
    this.docketNum = value;
  }

  /**
   * Determine if the DocketNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDocketNum() {
    return (this.docketNum != null ? this.docketNum.isSetValue() : false);
  }

  /**
   * Get the previous frequency assignment Government Master File (GMF)
   * authorization date..
   * <p>
   * @return a {@link D} instance
   * @since 3.1.0
   */
  public D getDate() {
    return date;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization date..
   * <p>
   * @param value a {@link D} instance
   * @since 3.1.0
   */
  public void setDate(D value) {
    this.date = value;
  }

  /**
   * Determine if the Date is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDate() {
    return (this.date != null ? this.date.isSetValue() : false);
  }

  /**
   * Get the externally-assigned unique identifier of a frequency assignment..
   * <p>
   * @return a {@link S12} instance
   * @since 3.1.0
   */
  public S12 getAgencySerialNum() {
    return agencySerialNum;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment..
   * <p>
   * @param value a {@link S12} instance
   * @since 3.1.0
   */
  public void setAgencySerialNum(S12 value) {
    this.agencySerialNum = value;
  }

  /**
   * Determine if the AgencySerialNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetAgencySerialNum() {
    return (this.agencySerialNum != null ? this.agencySerialNum.isSetValue() : false);
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization docket number.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current PreviousAuthorization object instance.
   * @since 3.1.0
   */
  public PreviousAuthorization withDocketNum(String value) {
    setDocketNum(new S8(value));
    return this;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization date.
   * <p>
   * @param value An instances of type {@link Calendar}.
   * @return The current PreviousAuthorization object instance.
   * @since 3.1.0
   */
  public PreviousAuthorization withDate(Calendar value) {
    setDate(new D(value));
    return this;
  }

  /**
   * Set the previous frequency assignment Government Master File (GMF)
   * authorization date.
   * <p>
   * @param value An instances of type {@link Date}.
   * @return The current PreviousAuthorization object instance.
   * @since 3.1.0
   */
  public PreviousAuthorization withDate(Date value) {
    setDate(new D(value));
    return this;
  }

  /**
   * Set the externally-assigned unique identifier of a frequency assignment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current PreviousAuthorization object instance.
   * @since 3.1.0
   */
  public PreviousAuthorization withAgencySerialNum(String value) {
    setAgencySerialNum(new S12(value));
    return this;
  }

  /**
   * Get a string representation of this PreviousAuthorization instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PreviousAuthorization {"
           + (agencySerialNum != null ? " agencySerialNum [" + agencySerialNum + "]" : "")
           + (date != null ? " date [" + date + "]" : "")
           + (docketNum != null ? " docketNum [" + docketNum + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PreviousAuthorization} requires {@link S8 DocketNum}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDocketNum();
  }

}
