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
package us.gov.dod.standard.ssrf._3_0.adapter;

/**
 * XML data type adapter for the SSRF SERIAL data type.
 * <p>
 * Serial: The attribute serial is composed of four parts separated by colons
 * (":"). The maximum total length is 29 characters (5+1+4+1+2+1+15).
 * <p>
 * Part 1 is the Country and is always REQUIRED. It contains one to five
 * alphabetic uppercase characters representing either the ITU country code or
 * the NATO Command code identifying the originator or organisation responsible
 * for maintaining the dataset, as listed in Code List CCY.
 * <p>
 * Part 2 is the orgCode and is OPTIONAL. It may contain one to four
 * alphanumeric characters (no spaces nor special characters) representing a
 * code for an Organisation within the country or command. It will normally
 * indicate the organisation responsible for maintaining the dataset. Domain
 * naming is left at the discretion of each country, but should be managed by a
 * central authority in the country to allow deconfliction and uniqueness. It
 * should enable the location in the data repository where this dataset
 * information is stored.
 * <p>
 * Part 3 is the Dataset Type and MUST contain a two-character code from the
 * table in the Introduction section identifying the type of dataset (LO for a
 * Location, etc).
 * <p>
 * Part 4 is a Serial Identifier and is always REQUIRED. It contains one to
 * fifteen alphanumeric characters (including spaces and special characters),
 * whose meaning is left at the discretion of each domain manager.
 * <p>
 *
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "[A-Z0-9-]{1,5}:\\w{0,4}:[A-Z]{2}: \\S{1,15}"
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public class XmlAdapterSERIAL extends AXmlAdapterString {

  public XmlAdapterSERIAL() {
    super(1, 29, false, "[A-Z0-9-]{1,5}:\\w{0,4}:[A-Z]{2}:\\S{1,15}");
  }
}
