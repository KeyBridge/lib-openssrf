/*
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
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
package us.gov.dod.standard.ssrf;

import java.util.Date;
import java.util.UUID;
import us.gov.dod.standard.ssrf._3_0.Administrative;
import us.gov.dod.standard.ssrf._3_0.Assignment;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCY;

/**
 *
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
/**
 * SSRF Serial number generator.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public class SSRFFactory {

  private static final ListCCY COUNTRY_DEFAULT = ListCCY.USA;

  /**
   * Generate a SSRF-compliant SERIAL number.
   * <p>
   * This method programmatically generates a serial number that complies with
   * the SSRF serial number pattern constraints.
   * <p>
   * @param clazz          the instantiating class type - this determines the
   *                       third part of the serial number
   * @param snCountry      The Serial number Country part (REQUIRED). It
   *                       contains one to five alphabetic uppercase characters
   *                       representing either the ITU country code or the NATO
   *                       Command code identifying the originator or
   *                       organisation responsible for maintaining the dataset,
   *                       as listed in Code List CCY.
   * @param snOrganization The serial number Organization code (OPTIONAL). It
   *                       may contain one to four alphanumeric characters (no
   *                       spaces nor special characters) representing a code
   *                       for an Organisation within the country or command. It
   *                       will normally indicate the organisation responsible
   *                       for maintaining the dataset. Domain naming is left at
   *                       the discretion of each country, but should be managed
   *                       by a central authority in the country to allow
   *                       deconfliction and uniqueness. It should enable the
   *                       location in the data repository where this dataset
   *                       information is stored.
   * @param snSerial       The serial number Serial identifier (REQUIRED). It
   *                       contains one to fifteen alphanumeric characters
   *                       (including spaces and special characters), whose
   *                       meaning is left at the discretion of each domain
   *                       manager. <em>Developer note</em>: If the snSerial is
   *                       set to NULL then a random serial number is assigned.
   * @return a SSRF-compliant Serial number instance
   */
  @SuppressWarnings("AssignmentToMethodParameter")
  public final static TString serial(Class clazz,
                                     ListCCY snCountry,
                                     String snOrganization,
                                     String snSerial) {
    if (snOrganization != null && snOrganization.length() > 4) {
      throw new IllegalArgumentException(clazz.getSimpleName() + " illegal organization format: max 4 characters [" + snOrganization + "]");
    }

    if (snSerial == null) {
      String uuid = UUID.randomUUID().toString().replaceAll("-", "");
      snSerial = uuid.substring(0, Math.min(uuid.length(), 15));
    } else if (snSerial.length() > 15) {
      throw new IllegalArgumentException(clazz.getSimpleName() + " illegal serial format: max 15 characters [" + snSerial + "]");
    }
    /**
     * Build a SSRF serial number.
     */
    StringBuilder sb = new StringBuilder();
    /**
     * If the country is null then use the default.
     */
    sb.append(snCountry != null
      ? snCountry.name()
      : COUNTRY_DEFAULT.name()
    ).append(":");
    if (snOrganization != null) {
      sb.append(snOrganization).append(":");
    }
    sb.append(ESerialType.fromInstance(clazz)).append(":");
    sb.append(snSerial);

    return new TString(sb.toString());
  }

  /**
   * A convenience shortcut to
   * {@link #serial(java.lang.Class, us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCY, java.lang.String, java.lang.String)}
   * but allowing for an instantiated class instead of the class type.
   * <p>
   * @param instance       the instantiated class
   * @param snCountry      The Serial number Country part (REQUIRED). It
   *                       contains one to five alphabetic uppercase characters
   *                       representing either the ITU country code or the NATO
   *                       Command code identifying the originator or
   *                       organisation responsible for maintaining the dataset,
   *                       as listed in Code List CCY.
   * @param snOrganization The serial number Organization code (OPTIONAL). It
   *                       may contain one to four alphanumeric characters (no
   *                       spaces nor special characters) representing a code
   *                       for an Organisation within the country or command. It
   *                       will normally indicate the organisation responsible
   *                       for maintaining the dataset. Domain naming is left at
   *                       the discretion of each country, but should be managed
   *                       by a central authority in the country to allow
   *                       deconfliction and uniqueness. It should enable the
   *                       location in the data repository where this dataset
   *                       information is stored.
   * @param snSerial       The serial number Serial identifier (REQUIRED). It
   *                       contains one to fifteen alphanumeric characters
   *                       (including spaces and special characters), whose
   *                       meaning is left at the discretion of each domain
   *                       manager. <em>Developer note</em>: If the snSerial is
   *                       set to NULL then a random serial number is assigned.
   * @return a SSRF-compliant Serial number instance
   */
  public final static TString serial(Object instance,
                                     ListCCY snCountry,
                                     String snOrganization,
                                     String snSerial) {
    return serial(instance.getClass(), snCountry, snOrganization, snSerial);
  }

  /**
   * This factory only contains static methods. Do not allow the class to be
   * instantiated.
   */
  private SSRFFactory() {
  }

  public static Assignment assignment(ListCCY snCountry, String snOrganization, String snSerial, Date entryDateTime) {
    return new Assignment(snCountry, snOrganization, snSerial, entryDateTime);
  }

  public static Administrative administrative(ListCCY snCountry, String snOrganization, String snSerial, Date entryDateTime) {
    return new Administrative(snCountry, snOrganization, snSerial, entryDateTime);
  }

}
