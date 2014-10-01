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
package us.gov.dod.standard.ssrf._3_1.adapter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.IMetadataType;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TDecimal;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TDouble;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.TInteger;

/**
 * Abstract Number type XmlAdapter.
 * <p>
 * The maximum and minimum digit lengths plus inclusive values are identified in
 * the constructor.
 * <p>
 * UN(x) is an unsigned (positive) integer number of maximum x digits
 * <p>
 * SN(x) is an integer number of maximum x digits (excluding minus sign)
 * <p>
 * UN(x.y) is a unsigned (positive) decimal number of maximum x digits
 * (excluding decimal point as applicable) and with a maximum of y decimal
 * digits.
 * <p>
 * SN(x.y) is a decimal number of maximum x digits (excluding minus sign and
 * decimal point as applicable) and with a maximum of y decimal digits.
 * <p>
 * double is a number expressing either in floating point (e.g. 0.015) or
 * scientific notation or using scientific notation (decimal number followed by
 * an optional "E" for the power of 10, e.g. 1.5E-2 representing the same value
 * 0.015).
 * <p>
 * Where applicable, the types UN and SN may be followed by an additional range
 * constraint in the form [a .. b] meaning that the value is restricted to be
 * between a and b inclusive. They may also be followed by an additional unit in
 * parenthesis. Example: Sensitivity value: SN(5.2) [-140.00 .. -30.00] (dBm)
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 */
public class AXmlAdapterNumber extends XmlAdapter<String, IMetadataType> {

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
    this.totalDigits = totalDigits;
    this.fractionDigits = fractionDigits;
    this.minInclusive = null;
    this.maxInclusive = null;
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
   * Convert a bound type to a value type.
   * <p>
   * @param v The value to be convereted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public String marshal(IMetadataType v) throws Exception {
    return convert((Number) v.getValue()).toString();
  }

  /**
   * Convert a value type to a bound type.
   * <p>
   * @param v The value to be converted. Can be null.
   * @return the converted value
   * @throws Exception if there's an error during the conversion. The caller is
   *                   responsible for reporting the error to the user through
   *                   ValidationEventHandler.
   */
  @Override
  public IMetadataType unmarshal(String v) throws Exception {
    return convert(v.contains(".") ? new BigDecimal(v) : new BigInteger(v));
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
  private IMetadataType convert(Number v) throws Exception {
    /**
     * Validate the max/min values.
     */
    if (minInclusive != null && v.doubleValue() < minInclusive) {
      throw new Exception(this.getClass().getSimpleName() + " [" + minInclusive + "] minimum value violation [" + v + "]");
    }
    if (maxInclusive != null && v.doubleValue() > maxInclusive) {
      throw new Exception(this.getClass().getSimpleName() + " [" + maxInclusive + "] maximum value violation [" + v + "]");
    }
    /**
     * Validate the digit count.
     */
    if (v instanceof BigInteger) {
      if (totalDigits != null && totalDigits > getDigitCount((BigInteger) v)) {
        throw new Exception(this.getClass().getSimpleName() + " [" + totalDigits + "] maximum digits violation [" + v + "]");
      }
      return new TInteger((BigInteger) v);
    } else if (v instanceof BigDecimal) {
      BigDecimal bd = new BigDecimal(v.doubleValue()).setScale(fractionDigits, RoundingMode.CEILING);
      if (totalDigits < bd.precision()) {
        throw new Exception(this.getClass().getSimpleName() + " [" + totalDigits + "] maximum digits violation [" + bd + "]");
      }
      return new TDecimal(bd);
    }
    /**
     * Default is fall through.
     */
    return new TDouble((Double) v);
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
}
