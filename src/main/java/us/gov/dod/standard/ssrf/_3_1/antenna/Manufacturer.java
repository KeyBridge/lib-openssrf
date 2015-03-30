package us.gov.dod.standard.ssrf._3_1.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCAO;

/**
 * Manufacturer contains the manufacturer name of the equipment listed in the
 * corresponding data entry in data element Nomenclature. Additionally the
 * country in which the equipment is manufactured may be included.
 * <p>
 * Element of {@link Nomenclature}
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manufacturer", propOrder = {
  "country",
  "name"
})
public class Manufacturer {

  /**
   * Country - Country/Area (Optional)    * <p>
   * The country or area in which the Manufacturer has its Headquarters.
   * <p>
   * Format is L:CAO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Country", required = false)
  private TString country;
  /**
   * Name - Manufacturer Name (Required)    * <p>
   * The name of the company that manufactured the equipment.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Name", required = true)
  private S100 name;

  /**
   * Get the country or area in which the Manufacturer has its Headquarters..
   * <p>
   * @return the Country value in a {@link TString} data type
   * @since 3.1.0
   */
  public TString getCountry() {
    return country;
  }

  /**
   * Set the country or area in which the Manufacturer has its Headquarters..
   * <p>
   * @param value the Country value in a {@link TString} data type
   * @since 3.1.0
   */
  public void setCountry(TString value) {
    this.country = value;
  }

  /**
   * Determine if the Country is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCountry() {
    return (this.country != null ? this.country.isSetValue() : false);
  }

  /**
   * Get the name of the company that manufactured the equipment..
   * <p>
   * @return a {@link S100} instance
   * @since 3.1.0
   */
  public S100 getName() {
    return name;
  }

  /**
   * Set the name of the company that manufactured the equipment..
   * <p>
   * @param value a {@link S100} instance
   * @since 3.1.0
   */
  public void setName(S100 value) {
    this.name = value;
  }

  /**
   * Determine if the Name is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetName() {
    return (this.name != null ? this.name.isSetValue() : false);
  }

  /**
   * Set the country or area in which the Manufacturer has its Headquarters.
   * <p>
   * @param value An instances of type {@link ListCAO}.
   * @return The current Manufacturer object instance.
   * @since 3.1.0
   */
  public Manufacturer withCountry(ListCAO value) {
    setCountry(new TString(value.value()));
    return this;
  }

  /**
   * Set the name of the company that manufactured the equipment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current Manufacturer object instance.
   * @since 3.1.0
   */
  public Manufacturer withName(String value) {
    setName(new S100(value));
    return this;
  }

  /**
   * Get a string representation of this Manufacturer instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Manufacturer {"
           + (country != null ? " country [" + country + "]" : "")
           + (name != null ? " name [" + name + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Manufacturer} requires {@link S100 Name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetName();
  }

}
