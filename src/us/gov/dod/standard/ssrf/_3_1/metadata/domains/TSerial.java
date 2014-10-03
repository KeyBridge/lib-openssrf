/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.EDatasetType;
import us.gov.dod.standard.ssrf._3_1.Common;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCY;

/**
 * A SSRF SERIAL number container with SSRF Standard Metadata Attributes.
 * <p>
 * This data type handles SSRF serial number generation.
 * <p>
 * Serial is composed of four parts separated by colons (":"). The maximum total
 * length is 29 characters (5+1+4+1+2+1+15).
 * <ul>
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
 * </ul>
 * Format is pattern (S29) with validation type SERIAL
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "[A-Z0-9-]{1,5}:\w{0,4}:[A-Z]{2}: \S{1,15}"
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/02/14
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSerial", propOrder = {"value"})
public class TSerial extends TString {

  /**
   * The SERIAL number string pattern.
   */
  private static final String PATTERN = "^([A-Z0-9-]{1,5}):(\\w{0,4}):([A-Z]{2}):(\\S{1,15})$";

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
  private String organization;
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
   * @param value a valid SSRF SERIAL string
   * @throws Exception if the value does not conform to the SERIAL format
   */
  private TSerial(String value) throws Exception {
    this.value = value;
    parse();
  }

  /**
   * Default no-arg constructor.
   */
  private TSerial() {
  }

  /**
   * Get a TSerial instance for the indicated class instance.
   * <p>
   * The local is set to the current system default. The serial is
   * programmatically set to a time-sequenced, UUID-based 15-character snippet.
   * The organization is left blank and may be set by th user.
   * <p>
   * @param clazz a SSRF class type that extends Common
   * @return a TSerial instance
   * @throws IllegalArgumentException if the object instance does not extend
   *                                  Common
   */
  public static TSerial getInstance(Class<? extends Common<?>> clazz) {
    return new TSerial()
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
    return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 14);
  }

  /**
   * Internal method to build the internal SERIAL number value.
   */
  private void format() {
    StringBuilder sb = new StringBuilder();
    sb.append(country != null ? country.name() : "")
      .append(":")
      .append(organization != null ? organization : "")
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
   * @throws Exception if the value does not conform to the SERIAL format
   */
  private void parse() {
    if (value != null && !value.isEmpty()) {
      Matcher m = Pattern.compile(PATTERN).matcher(value);
      if (m.find()) {
        setCountry(ListCCY.valueOf(m.group(1)));
        setDatasetType(EDatasetType.valueOf(m.group(2)));
        setOrganization(m.group(3));
        setSerial(m.group(4));
      }
//      else {        new XmlAdapterSERIAL().unmarshal(value);      }
    }
  }

  /**
   * Set the data set class type. (Private)
   * <p>
   * Developer note: The datasetType field is REQUIRED and MUST be set upon
   * TSerial object instantiation.
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
   * Set the serial number Organization code (OPTIONAL).
   * <p>
   * @param organization
   */
  public void setOrganization(String organization) {
    if (organization.length() > 4) {
      throw new IllegalArgumentException("String length violation S4 [0, 4]. Length is " + value.length() + " for \"" + value + "\"");
    }
    this.organization = organization;
    format();
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
   * Gets the value of the value property.
   * <p>
   * @return the value of the value property.
   */
  @Override
  public String getValue() {
    format();
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p>
   * If the input value is not null this method attempts to parse the serial
   * number into its component parts and set the internal fields accordingly.
   * <p>
   * @param value a formatted SERIAL number String
   * @throws Exception if the value does not conform to the SERIAL format
   */
  @Override
  public void setValue(String value) {
    this.value = value;
    parse();
  }

  /**
   * Set the Serial number Country part (REQUIRED).
   * <p>
   * Format is S5
   * <p>
   * @param value the data source country
   * @return The current TSerial object instance
   */
  public TSerial withCountry(ListCCY value) {
    setCountry(value);
    return this;
  }

  /**
   * Set the Serial number Country part (REQUIRED).
   * <p>
   * Format is S5
   * <p>
   * @param value the data source country
   * @return The current TSerial object instance
   */
  public TSerial withLocale(Locale value) {
    setLocale(value);
    return this;
  }

  /**
   * Set the class type. (Private)
   * <p>
   * Developer note: The datasetType field is REQUIRED and MUST be set upon
   * TSerial object instantiation.
   * <p>
   * @param value a SSRF class type or instance
   * @return the current serial instance
   */
  private TSerial withDatasetType(Class<? extends Common<?>> value) {
    setDatasetType(EDatasetType.fromInstance(value));
    return this;
  }

  /**
   * Set the serial number Organization code (OPTIONAL).
   * <p>
   * Format is S4
   * <p>
   * @param value the serial number Organization
   * @return The current TSerial object instance
   */
  public TSerial withOrganization(String value) {
    setOrganization(value != null ? value.toUpperCase(Locale.getDefault()) : "");
    return this;
  }

  /**
   * Set the serial number Serial identifier (REQUIRED).
   * <p>
   * Format is S15
   * <p>
   * @param value the serial number Serial identifier
   * @return The current TSerial object instance
   * @throws Exception if the input value is too long (&gt; 15 characters)
   */
  public TSerial withSerial(String value) {
    setSerial(value);
    return this;
  }

}
