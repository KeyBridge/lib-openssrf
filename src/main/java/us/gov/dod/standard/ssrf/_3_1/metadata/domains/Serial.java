/*
 * Copyright 2015 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf.EDatasetType;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlAdapterSERIAL;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCY;

/**
 * A SSRF SERIAL number container with SSRF Standard Metadata Attributes.
 * <p>
 * This data type handles SSRF serial number generation.
 * <p>
 * Serial is composed of four parts separated by colons (":"). The maximum total
 * length is 29 characters (5+1+4+1+2+1+15).
 * <ol>
 * <li>Part 1 is the Country and is always REQUIRED. It contains one to five
 * alphabetic uppercase characters representing either the ITU country code or
 * the NATO Command code identifying the originator or organisation responsible
 * for maintaining the dataset, as listed in Code List CCY. </li>
 * <li>Part 2 is the orgCode and is OPTIONAL. It may contain one to four
 * alphanumeric characters (no spaces nor special characters) representing a
 * code for an Organisation within the country or command. It will normally
 * indicate the organisation responsible for maintaining the dataset. Domain
 * naming is left at the discretion of each country, but should be managed by a
 * central authority in the country to allow deconfliction and uniqueness. It
 * should enable the location in the data repository where this dataset
 * information is stored. </li>
 * <li>Part 3 is the Dataset Type and MUST contain a two-character code from the
 * table in the Introduction section identifying the type of dataset (LO for a
 * Location, etc). </li>
 * <li>Part 4 is a Serial Identifier and is always REQUIRED. It contains one to
 * fifteen alphanumeric characters (including spaces and special characters),
 * whose meaning is left at the discretion of each domain manager.</li>
 * </ol>
 * <p>
 * Format is pattern (S29) with validation type SERIAL
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
 * <p>
 * @author Jesse Caulfield
 * @version 3.1.0, 03/28/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Serial", propOrder = {"value"})
public class Serial extends AMetadata<Serial> implements Comparable<Serial> {

  /**
   * The SERIAL number string pattern.
   */
  private static final String PATTERN = "^([A-Z0-9-]{1,5}):(\\w{0,4}):([A-Z]{2}):(\\S{1,15})$";

  /**
   * The value property.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterSERIAL.class)
  protected String value;

  /**
   * The Serial number Country part (REQUIRED).
   * <p>
   * Format is S5
   * <p>
   * It contains one to five alphabetic uppercase characters representing either
   * the ITU country code or the NATO Command code identifying the originator or
   * organisation responsible for maintaining the dataset, as listed in Code
   * List CCY.
   */
  @XmlTransient
  private ListCCY country;
  /**
   * The instantiating class type (REQUIRED)
   * <p>
   * Format is S2
   * <p>
   * This determines the third part of the serial number
   */
  @XmlTransient
  private EDatasetType datasetType;
  /**
   * The serial number Organization code (OPTIONAL).
   * <p>
   * It may contain one to four alphanumeric characters (no spaces nor special
   * characters) representing a code for an Organisation within the country or
   * command. It will normally indicate the organisation responsible for
   * maintaining the dataset. Domain naming is left at the discretion of each
   * country, but should be managed by a central authority in the country to
   * allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored.
   * <p>
   * Format is S4
   */
  @XmlTransient
  private String organisation;
  /**
   * The serial number Serial identifier (REQUIRED).
   * <p>
   * It contains one to fifteen alphanumeric characters (including spaces and
   * special characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * Format is S15
   * <p>
   * <em>Developer note</em>: If the serial is set to NULL then a random serial
   * number is assigned.
   */
  @XmlTransient
  private String serial;

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param ssrfSerial a valid SSRF SERIAL string. Format is pattern (S29) with
   *                   validation type SERIAL: "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}:
   *                   \S{1,15}"
   * @throws IllegalArgumentException if the value does not conform to the
   *                                  SERIAL format
   */
  public Serial(String ssrfSerial) throws IllegalArgumentException {
    this.value = ssrfSerial;
    parse();
  }

  /**
   * Default no-arg constructor.
   */
  private Serial() {
  }

  /**
   * Get a Serial instance for the indicated class instance.
   * <p>
   * The local is set to the current system default. The serial is
   * programmatically set to a time-sequenced, UUID-based 15-character snippet.
   * The organisation is left blank and may be set by th user.
   * <p>
   * @param clazz a SSRF class type that extends Common
   * @return a Serial instance
   * @throws IllegalArgumentException if the object instance does not extend
   *                                  Common
   */
  public static Serial getInstance(Class<? extends Common<?>> clazz) {
    return new Serial()
            .withLocale(Locale.getDefault())
            .withDatasetType(clazz)
            .withSerial(uuidSnippet());
  }

  /**
   * Internal helper method to generate a 15-character UUID-based alphanumeric
   * snippet.
   * <p>
   * @return a 15-character UUID-based alphanumeric String
   */
  private static String uuidSnippet() {
    /**
     * The following sequence generates a (almost) guaranteed unique text
     * snippet.
     */
    return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 14);
  }

  /**
   * Internal method to build the internal SERIAL number value.
   */
  private void format() {
    StringBuilder sb = new StringBuilder();
    sb.append(country != null ? country.name() : "")
            .append(":")
            .append(organisation != null ? organisation : "")
            .append(":")
            .append(datasetType != null ? datasetType.name() : "")
            .append(":")
            .append(serial != null ? serial : uuidSnippet());
    this.value = sb.toString();
  }

  /**
   * Internal method to parse a SERIAL number value and set the internal
   * components.
   * <p>
   * @throws IllegalArgumentException if the value does not conform to the
   *                                  SERIAL format
   */
  private void parse() throws IllegalArgumentException {
    if (value != null && !value.isEmpty()) {
      Matcher m = Pattern.compile(PATTERN).matcher(value);
      if (m.find()) {
        setCountry(ListCCY.valueOf(m.group(1)));
        setOrganisation(m.group(2));
        setDatasetType(EDatasetType.valueOf(m.group(3)));
        setSerial(m.group(4));
      } else {
        throw new IllegalArgumentException("SERIAL format error " + PATTERN + " for \"" + value + "\"");
      }
    }
  }

  /**
   * Update the serial number with the component configurations.
   * <p>
   * This method should typically be called after the serial number fields are
   * configured and (optionally) before exporting an SSRF message.
   * <p>
   * @since 3.1.0
   */
  public void prepare() {
    format();
  }

  /**
   * Update the serial number to write the component configurations.
   * <p>
   * This method should typically be called after the Common is imported from
   * XML.
   * <p>
   * @since 3.1.0
   */
  public void postLoad() {
    parse();
  }

  /**
   * Set the data set class type. (Private)
   * <p>
   * Developer note: The datasetType field is REQUIRED and MUST be set upon
   * Serial object instantiation.
   * <p>
   * @param datasetType an enumerated dataset class type
   */
  private void setDatasetType(EDatasetType datasetType) {
    this.datasetType = datasetType;
    format();
  }

  /**
   * Set the Serial number Country part (REQUIRED).
   * <p>
   * @param country the data source country
   */
  public void setCountry(ListCCY country) {
    this.country = country;
    format();
  }

  /**
   * Set the Serial number Country part (REQUIRED).
   * <p>
   * @param locale the data source country
   */
  public void setLocale(Locale locale) {
    this.country = ListCCY.valueOf(locale.getISO3Country());
    format();
  }

  /**
   * Set the serial number Organisation code (OPTIONAL).
   * <p>
   * @param organisation the organisation to set
   */
  public void setOrganisation(String organisation) {
    if (organisation.length() > 4) {
      throw new IllegalArgumentException("String length violation S4 [0, 4]. Length is " + value.length() + " for \"" + value + "\"");
    }
    this.organisation = organisation;
    format();
  }

  /**
   * Set the serial number Serial identifier component. This returns part 4 of
   * the SSRF SERIAL number.
   * <p>
   * It contains one to fifteen alphanumeric characters (including spaces and
   * special characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @return serial the serial number Serial identifier.
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Set the serial number Serial identifier component. This returns part 4 of
   * the SSRF SERIAL number.
   * <p>
   * It contains one to fifteen alphanumeric characters (including spaces and
   * special characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @return serial the serial number Serial identifier converted to a Long.
   *         NULL if not set.
   */
  public Long getSerialAsNumber() {
    return serial != null ? new BigInteger(serial).longValue() : null;
  }

  /**
   * Set the serial number Serial identifier.
   * <p>
   * It contains one to fifteen alphanumeric characters (including spaces and
   * special characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @param serial the serial number Serial identifier.
   */
  public void setSerial(String serial) {
    if (serial.length() > 15) {
      throw new IllegalArgumentException("String length violation S15 [1, 15]. Length is " + value.length() + " for \"" + value + "\"");
    }
    this.serial = serial;
    format();
  }

  /**
   * Set the serial number Serial identifier as a Long Number instance.
   * <p>
   * It contains one to fifteen alphanumeric characters (including spaces and
   * special characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * Developer note: The maximum number value is 15 digits (1E15). This should
   * accommodate most everyday instances including millisecond time stamps (12
   * digits).
   * <p>
   * @param number the serial number Serial identifier as an unsigned number up
   *               to 1E15.
   */
  public void setSerial(Long number) {
    BigInteger bi = new BigInteger(String.valueOf(number));
    if (getDigitCount(bi) > 15) {
      throw new IllegalArgumentException("Serial value violation. Maximum " + value.length() + " digits for \"" + value + "\"");
    } else if (number < 0) {
      throw new IllegalArgumentException("Serial value violation S15 [1, 15]. Numeric serial numbers must be unsigned.");
    }
    this.serial = bi.toString();
    format();
  }

  /**
   * Gets the SSRF SERIAL number value.
   * <p>
   * Calls {@link #format()} first to ensure the returned value reflects the
   * most recent changes to the serial components.
   * <p>
   * @return the value of the value property.
   */
  public String getValue() {
    format();
    return value;
  }

  /**
   * Sets the SSRF SERIAL number value.
   * <p>
   * If the input value is not null this method attempts to parse the serial
   * number into its component parts and set the internal fields accordingly.
   * <p>
   * @param value a valid SSRF SERIAL string. Format is pattern (S29) with
   *              validation type SERIAL: "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}:
   *              \S{1,15}"
   * @throws IllegalArgumentException if the value does not conform to the
   *                                  SERIAL format
   */
  public void setValue(String value) {
    this.value = value;
    parse();
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
   * Sets the SSRF SERIAL number value.
   * <p>
   * @param value a valid SSRF SERIAL string. Format is pattern (S29) with
   *              validation type SERIAL: "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}:
   *              \S{1,15}"
   * @return this Serial instance
   */
  public Serial withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Set the Serial number Country part (REQUIRED).
   * <p>
   * Format is S5
   * <p>
   * @param value the data source country
   * @return The current Serial object instance
   */
  public Serial withCountry(ListCCY value) {
    setCountry(value);
    return this;
  }

  /**
   * Set the Serial number Country part (REQUIRED).
   * <p>
   * Format is S5
   * <p>
   * @param value the data source country
   * @return The current Serial object instance
   */
  public Serial withLocale(Locale value) {
    setLocale(value);
    return this;
  }

  /**
   * Set the class type. (Private)
   * <p>
   * Developer note: The datasetType field is REQUIRED and MUST be set upon
   * Serial object instantiation.
   * <p>
   * @param value a SSRF class type or instance
   * @return the current serial instance
   */
  private Serial withDatasetType(Class<? extends Common<?>> value) {
    setDatasetType(EDatasetType.fromInstance(value));
    return this;
  }

  /**
   * Set the serial number Organization code (OPTIONAL).
   * <p>
   * Format is S4
   * <p>
   * @param value the serial number Organization
   * @return The current Serial object instance
   */
  public Serial withOrganisation(String value) {
    setOrganisation(value != null ? value.toUpperCase(Locale.getDefault()) : "");
    return this;
  }

  /**
   * Set the serial number Serial identifier (REQUIRED).
   * <p>
   * Format is S15
   * <p>
   * @param value the serial number Serial identifier
   * @return The current Serial object instance
   * @throws IllegalArgumentException if the input value is too long (&gt; 15
   *                                  characters)
   */
  public Serial withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the serial number Serial identifier (REQUIRED) as a Long Number
   * instance.
   * <p>
   * @param value the serial number Serial identifier
   * @return The current Serial object instance
   */
  public Serial withSerial(Long value) {
    setSerial(value);
    return this;
  }

  /**
   * Internal helper method to get the number of digits from a BigInteger
   * instance.
   * <p>
   * @param number a BigInteger number instance.
   * @return the total number of digits in the number.
   */
  private int getDigitCount(BigInteger number) {
    double factor = Math.log(2) / Math.log(10);
    int digitCount = (int) (factor * number.bitLength() + 1);
    if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
      return digitCount - 1;
    }
    return digitCount;
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * Requires {@link ListCCL cls} and {@link String value}
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
   * Gets the SSRF SERIAL number value.
   * <p>
   * Calls {@link #format()} first to ensure the returned value reflects the
   * most recent changes to the serial components.
   * <p>
   * This is a shortcut to {@link #getValue()}.
   * <p>
   * @return the formatted SSRF SERIAL number value.
   */
  @Override
  public String toString() {
    return getValue();
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the user-configured serial number portion of the
   * value.
   * <p>
   * @return a hash code of the user-configured serial number portion
   */
  @Override
  public int hashCode() {
    if (this.serial == null) {
      return super.hashCode();
    }
    int hash = 5;
    hash = 47 * hash + Objects.hashCode(this.value);
    hash = 47 * hash + Objects.hashCode(this.serial);
    return hash;
  }

  /**
   * Equality is based upon the user-configured serial number portion of the
   * value.
   * <p>
   * @param obj the other object to compare
   * @return TRUE if the serial number components are equal
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    /**
     * If the whole value matches then confirm equality. This is triggered when
     * unmarshaling from XML.
     */
    if (Objects.equals(this.value, ((Serial) obj).getValue())) {
      return true;
    }
    /**
     * If the serial-component matches then also confirm equality. This is
     * triggered when marshaling TO xml AND also accommodates resetting the
     * country code.
     */
    return Objects.equals(this.serial, ((Serial) obj).getSerial());
  }

  /**
   * Comparison and sorting is alphabetical based upon the String value.
   * <p>
   * @param o the other TString value
   * @return alphabetical sort order
   */
  @Override
  public int compareTo(Serial o) {
    if (o == null) {
      return 1;
    }
    if (value == null) {
      return -1;
    }
    return value.compareTo(o.getValue());
  }//</editor-fold>
}
