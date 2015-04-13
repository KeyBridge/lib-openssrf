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
package us.gov.dod.standard.ssrf._3_1.adapter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * XML data type adapter for the SSRF Latitude data type.
 * <p>
 * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
 * of the Point or center of the Ellipse. Same remarks for seconds and leading
 * zeros. enter N or S immediately following the seconds. The format is:
 * <code>ddmmss.hhH</code> (where ".hh" is optional and H = N or S).
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "(((((([0-8][0-9]))([0-5][0-9]){2})(. [0-9]{1,2})?)|900000)(N|S))|X"
 * <p>
 * Developer note: This <code>Lat</code> is an extension and replacement
 * implementation of the default <code>Lat</code> using a BigDecimal value in
 * Decimal degrees (instead of DMS-encoded string) and relying upon the
 * XmlJavaTypeAdapter for DMS translation.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 04/04/2015
 */
public class XmlAdapterLAT extends AXmlAdapterNumber {

  /**
   * "XmlAdapter". The standard adapter name prefix. This is used when
   * constructing an error message.
   */
  private static final String NAME_PREFIX = "XmlAdapter";

  /**
   * The XML validation pattern.
   */
  private static final String PATTERN = "(((((([0-8][0-9]))([0-5][0-9]){2})(.[0-9]{1,2})?)|900000)(N|S))|X";
  /**
   * The REGEX pattern used to extract values from input strings. This is an
   * expanded version of the validation pattern.
   */
  private static final String REGEX = "([0-8][0-9])([0-5][0-9])([0-5][0-9]\\.?([0-9]{1,2})?)(N|S)";

  /**
   * Construct a new adapter instance.
   * <p>
   * Latitude ranges from -90 to +90 degrees.
   * <p>
   * Allow 9 decimal places; centimeter precision.
   */
  public XmlAdapterLAT() {
    super(11, 9, -90, 90);
  }

  /**
   * Convert a bound type to a value type.
   * <p>
   * This is called when converting an object to XML.
   * <p>
   * @param v The value to be convereted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public Number unmarshal(String v) throws Exception {
    /**
     * Assume "X" is a null placeholder.
     */
    if ("X".equals(v)) {
      return null;
    }
    /**
     * Extract the DMS-encoded value. If the REGEX matches then validate the
     * number value.
     */
    Matcher m = Pattern.compile(REGEX).matcher(v);
    if (m.find()) {
      return super.convert(DMStoDEC(Integer.valueOf(m.group(1)),
                                    Integer.valueOf(m.group(2)),
                                    Double.valueOf(m.group(3)),
                                    m.group(5)));

    }
    throw new Exception("String pattern violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " requires " + PATTERN + " received \"" + v + "\"");
  }

  /**
   * Convert a value type to a bound type.
   * <p>
   * This is called with converting XML to an object.
   * <p>
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public String marshal(Number v) throws Exception {
    /**
     * Convert the number to run value checks, then format the output.
     */
    v = super.convert(v);
    NumberFormat df = new DecimalFormat("00.##");
    return new StringBuilder()
            .append(df.format(getDegrees(v)))
            .append(df.format(getMinutes(v)))
            .append(df.format(getSeconds(v)))
            .append(getLatHemisphere(v))
            .toString();
  }

  /**
   * Convert a coordinate Degree/Minute/Second/Dir values to decimal degrees.
   * <p>
   * @param deg       the degree
   * @param min       the minute
   * @param sec       the second
   * @param direction the direction [N,S,E,W] (not case sensitive)
   * @return the coordinate in decimal degrees
   */
  private Double DMStoDEC(int deg, int min, double sec, String direction) {
    double decimalDegree = deg + (min + (sec / 60)) / 60;
    double directionMultiplier = 1;
    if ("S".equalsIgnoreCase(direction) || "W".equalsIgnoreCase(direction)) {
      directionMultiplier = -1;
    }
    return directionMultiplier * decimalDegree;
  }

  /**
   * Calculate the degrees component from a decimal degree coordinate
   * <p>
   * @return the degrees component
   */
  private int getDegrees(Number latitude) {
    return (int) Math.floor(Math.abs(latitude.doubleValue()));
  }

  /**
   * Calculate the minutes component from a decimal degree coordinate
   * <p>
   * @return the latitude minutes component
   */
  private int getMinutes(Number latitude) {
    return (int) Math.floor(Math.abs(latitude.doubleValue()) * 60 % 60);
  }

  /**
   * Calculate the seconds component from a decimal degree coordinate
   * <p>
   * @return the latitude seconds component
   */
  private double getSeconds(Number latitude) {
    return Math.abs(latitude.doubleValue()) * 3600 % 60;
  }

  /**
   * Get the latitude hemisphere from a latitude in decimal degrees.
   * <p>
   * @return the latitude hemisphere: [N]orth or [S]outh
   */
  protected String getLatHemisphere(Number latitude) {
    return latitude.doubleValue() < 0 ? "S" : "N";
  }

}
