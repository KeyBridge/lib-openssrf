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
 * SSRF DateTime type adapter.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public class XmlAdapterDATETIME extends AXmlAdapterCalendar {

  /**
   * The DateTime pattern.
   * <p>
   * DT is a date / time value formatted in 20 to 24 characters as
   * YYYY-MM-DDThh:mm:ss[.ddd]Z (year-
   * month-day"T"hours:minutes:seconds.milliseconds"Z"), where the milliseconds
   * part is optional. This format is compliant with the W3C Recommendation on
   * XML Schema.
   */
  private static final String PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

  public XmlAdapterDATETIME() {
    super(PATTERN);
  }

}
