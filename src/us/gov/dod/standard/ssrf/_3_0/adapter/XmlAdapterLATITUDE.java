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

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XML data type adapter for the SSRF LAT data type.
 * <p>
 * Lat: Enter the geographical latitude (degrees, minutes, seconds and
 * hemisphere N or S) of the Point or center of the Ellipse. Same remarks for
 * seconds and leading zeros. Enter N or S immediately following the seconds.
 * The format is: ddmmss.hhH (where ".hh" is optional and H = N or S).
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "([0-9]{6}(.[0-9]{1,2})?(N|S))|X"
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public class XmlAdapterLATITUDE extends XmlAdapter<String, Number> {

  @Override
  public String marshal(Number v) throws Exception {
    DecimalFormat dfDM = new DecimalFormat("##");
    DecimalFormat dfS = new DecimalFormat("##.##");
    StringBuilder sb = new StringBuilder();
    double d = v.doubleValue();
    sb.append(dfDM.format(Math.abs(d)))
      .append(dfDM.format(Math.floor(Math.abs(d) * 60 % 60)))
      .append(dfS.format(Math.abs(d) * 3600 % 60))
      .append(d > 0 ? "N" : "S");
    return sb.toString();
  }

  @Override
  public Number unmarshal(String v) throws Exception {
    if ("X".equals(v)) {
      return 0;
    }

    Pattern pattern = Pattern.compile("(\\d\\d)(\\d\\d)(\\d\\d\\.?\\d?\\d?)([NS])");
    Matcher matcher = pattern.matcher(v);
    if (matcher.matches()) {
      Double decimalDegree = Double.valueOf(matcher.group(1)) + (Double.valueOf(matcher.group(2)) + (Double.valueOf(matcher.group(3)) / 60)) / 60;
      double directionMultiplier = 1;
      if ("S".equalsIgnoreCase(matcher.group(4)) || "W".equalsIgnoreCase(matcher.group(4))) {
        directionMultiplier = -1;
      }
      return directionMultiplier * decimalDegree;
    }
    throw new Exception(this.getClass().getSimpleName() + " [" + pattern + "] string pattern violation: ([0-9]{6}(.[0-9]{1,2})?(N|S))|X");
  }
}
