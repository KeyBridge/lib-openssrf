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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Abstract Number type XmlAdapter; converts BigDecimal and BigInteger number
 * types.
 * <p>
 * The maximum and minimum digit lengths plus inclusive values are identified in
 * the constructor.
 * <ul>
 * <li>
 * UN(x) is an unsigned (positive) integer number of maximum x digits
 * </li><li>
 * SN(x) is an integer number of maximum x digits (excluding minus sign)
 * </li><li>
 * UN(x.y) is a unsigned (positive) decimal number of maximum x digits
 * (excluding decimal point as applicable) and with a maximum of y decimal
 * digits.
 * </li><li>
 * SN(x.y) is a decimal number of maximum x digits (excluding minus sign and
 * decimal point as applicable) and with a maximum of y decimal digits.
 * </li><li>
 * double is a number expressing either in floating point (e.g. 0.015) or
 * scientific notation or using scientific notation (decimal number followed by
 * an optional "E" for the power of 10, e.g. 1.5E-2 representing the same value
 * 0.015).
 * </li>
 * </ul>
 * <p>
 * Where applicable, the types UN and SN may be followed by an additional range
 * constraint in the form [a .. b] meaning that the value is restricted to be
 * between a and b inclusive. They may also be followed by an additional unit in
 * parenthesis. Example: Sensitivity value: SN(5.2) [-140.00 .. -30.00] (dBm)
 * <p>
 * @author Jesse Caulfield
 */
public class AXmlAdapterNumber extends XmlAdapter<String, Number> {

  /**
   * "XmlAdapter". The standard adapter name prefix. This is used when
   * constructing an error message.
   */
  private static final String NAME_PREFIX = "XmlAdapter";

  /**
   * The maximum number of total digits in the number, inclusive of fraction
   * digits. e.g. 123.456 contains 6 digits.
   */
  private final Integer totalDigits;
  /**
   * The maximum number of fraction digits - number of digits to the right of
   * the decimal. e.g. 123.456 contains 3 fraction digits.
   */
  private final Integer fractionDigits;

  /**
   * The minimum inclusive value. If NULL then the integer is signed (may take a
   * positive or negative value). If zero then the integer is unsigned (must be
   * greater than zero).
   */
  private final Integer minInclusive;
  /**
   * The maximum inclusive value. If NULL then the integer upper bound is not
   * defined.
   */
  private final Integer maxInclusive;

  /**
   * Construct a new Number adapter. The minimum and maximum inclusive values
   * are not set, supporting unsigned, unbound numbers within the digit count.
   * <p>
   * @param totalDigits    The maximum number of total digits in the number,
   *                       inclusive of fraction digits. e.g. 123.456 contains 6
   *                       digits.
   * @param fractionDigits The maximum number of fraction digits - number of
   *                       digits to the right of the decimal. e.g. 123.456
   *                       contains 3 fraction digits.
   */
  public AXmlAdapterNumber(Integer totalDigits, Integer fractionDigits) {
    this(totalDigits, fractionDigits, null, null);
  }

  /**
   * Construct a new Number adapter.
   * <p>
   * @param totalDigits    The maximum number of total digits in the number,
   *                       inclusive of fraction digits. e.g. 123.456 contains 6
   *                       digits.
   * @param fractionDigits The maximum number of fraction digits - number of
   *                       digits to the right of the decimal. e.g. 123.456
   *                       contains 3 fraction digits.
   * @param minInclusive   The minimum inclusive value.
   * @param maxInclusive   The maximum inclusive value.
   */
  public AXmlAdapterNumber(Integer totalDigits, Integer fractionDigits, Integer minInclusive, Integer maxInclusive) {
    this.totalDigits = totalDigits;
    this.fractionDigits = fractionDigits;
    this.minInclusive = minInclusive;
    this.maxInclusive = maxInclusive;
  }

  /**
   * Internal method to build a Decimal Format based upon the total available
   * digits and the input value. Produces a decimal format pattern defined by
   * the total and fraction digit count.
   * <p>
   * @param v the input value to marshal
   * @return a decimal format pattern
   */
  private DecimalFormat buildDecimalFormat(Number v) {
    if (totalDigits == null || fractionDigits == null) {
      return new DecimalFormat("#");
    }
    int digitCount = getDigitCount(new BigInteger(String.valueOf(v.intValue())));
    int totalCount = digitCount + fractionDigits > totalDigits
                     ? totalDigits
                     : digitCount + fractionDigits;
    int fractionCount = digitCount > (totalDigits - fractionDigits)
                        ? totalDigits - digitCount
                        : fractionDigits;
    /**
     * Require zeros on either side of the decimal point.
     */
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < totalCount; i++) {
      sb.append("#");
      if (i == (totalCount - fractionCount - 1)) {
        sb.append(".");
      }
    }
    return new DecimalFormat(sb.toString().replace("#.#", "0.0"));
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
  public String marshal(Number v) throws Exception {
    /**
     * If there is no configured decimal format then print a plain, normal (non
     * scientific notation) number.
     */
    return buildDecimalFormat(convert(v)).format(v);
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
  public Number unmarshal(String v) throws Exception {
    return convert(fractionDigits != null
                   ? new BigDecimal(v)
                   : new BigInteger(v));
  }

  /**
   * Internal method to perform the validation.
   * <p>
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  protected Number convert(Number v) throws Exception {
    /**
     * Validate the max/min values.
     */
    if (minInclusive != null && v.doubleValue() < minInclusive) {
      throw new Exception("Minimum value violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + ": min " + minInclusive + " exceeded by " + v + ".");
    }
    if (maxInclusive != null && v.doubleValue() > maxInclusive) {
      throw new Exception("Maximum value violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + ": max " + maxInclusive + " exceeded by " + v + ".");
    }
    if (maxInclusive == null && v.doubleValue() > getMaxInclusive().doubleValue()) {
      throw new Exception("Maximum value violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "")
                          + " pattern "
                          + buildDecimalFormat(v).toPattern()
                          + " exceeded.");
    }
    /**
     * Validate the digit count.
     */
    if (v instanceof BigInteger) {
      if (totalDigits != null && totalDigits < getDigitCount((BigInteger) v)) {
        throw new Exception("Maximum digits violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " " + totalDigits + " digits exceeded by \"" + v + "\".");
      }
    } else if (v instanceof BigDecimal || v instanceof Double) {
      if (totalDigits != null && totalDigits < getDigitCount(BigInteger.valueOf(v.intValue()))) {
        throw new Exception("Maximum digits violation " + this.getClass().getSimpleName().replace(NAME_PREFIX, "") + " " + totalDigits + " digits exceeded by \"" + v + "\".");
      }
      /**
       * Set the number precision to ensure it matches the required XML style
       * pattern.
       */
      return new BigDecimal(v.doubleValue()).setScale((fractionDigits != null ? fractionDigits : 0), RoundingMode.HALF_UP);
    }
    /**
     * Default fall through with whatever Number type was presented.
     */
    return v;
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
   * Get the maximum (inclusive) value allowed by this adapter.
   * <p>
   * If the inclusive maximum value is not specifically declared then it is
   * calculated from the total and fraction digits declaration (if present).
   * <p>
   * @return the maximum allowed value. Integer.MAX_VALUE if not set.
   */
  public Number getMaxInclusive() {
    /**
     * Calculate the maximum value from digits by calculating the exponent - 1 .
     * For example: a three digit allowance will be calculated as 10 ^ 3 minus 1
     * = 999.
     */
    if (maxInclusive != null) {
      return maxInclusive;
    } else if (totalDigits != null) {
      return maxInclusive != null
             ? maxInclusive
             : Math.pow(10, (totalDigits - (fractionDigits != null ? fractionDigits : 0))) - 1;
    } else {
      return Integer.MAX_VALUE;
    }
  }

  /**
   * Get the minimum (inclusive) value allowed by this adapter.
   * <p>
   * If the inclusive minimum value is not specifically declared then it is
   * calculated from the total and fraction digits declaration (if present).
   * <p>
   * @return the minimum allowed value. Integer.MIN_VALUE if not set.
   */
  public Number getMinInclusive() {
    if (minInclusive != null) {
      return minInclusive;
    } else if (totalDigits != null) {
      return minInclusive != null
             ? minInclusive
             : -Math.pow(10, (totalDigits - (fractionDigits != null ? fractionDigits : 0))) - 1;
    } else {
      return Integer.MIN_VALUE;
    }
  }
}
