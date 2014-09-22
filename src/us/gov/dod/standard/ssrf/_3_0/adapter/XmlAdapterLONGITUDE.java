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
 * Lon: Enter the geographical longitude (degrees, minutes, seconds, and
 * hemisphere E or W) of the Point or center of the Ellipse. If the seconds are
 * not known, use 00, except in the case of navigation aid systems,
 * geostationary satellites, and microwave facilities where seconds are
 * required. Use leading zeros as appropriate for degrees, minutes, or seconds.
 * Degrees longitude require three digits. Seconds may have a decimal point
 * followed by up to two decimals. Enter E or W immediately following the
 * seconds. The format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
 * <p>
 * [XSD ERR REGEX] This data item MUST comply to the regular expression:
 * "([0-9]{7}(.[0-9]{1,2})?(E|W))|X"
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public class XmlAdapterLONGITUDE extends XmlAdapter<String, Number> {

  @Override
  public String marshal(Number v) throws Exception {
    DecimalFormat dfD = new DecimalFormat("###");
    DecimalFormat dfM = new DecimalFormat("###");
    DecimalFormat dfS = new DecimalFormat("##.##");
    StringBuilder sb = new StringBuilder();
    double d = v.doubleValue();
    sb.append(dfD.format(Math.abs(d)))
      .append(dfM.format(Math.floor(Math.abs(d) * 60 % 60)))
      .append(dfS.format(Math.abs(d) * 3600 % 60))
      .append(d > 0 ? "E" : "W");
    return sb.toString();
  }

  @Override
  public Number unmarshal(String v) throws Exception {
    if ("X".equals(v)) {
      return 0;
    }

    Pattern pattern = Pattern.compile("(\\d\\d\\d)(\\d\\d)(\\d\\d\\.?\\d?\\d?)([EW])");
    Matcher matcher = pattern.matcher(v);
    if (matcher.matches()) {
      Double decimalDegree = Double.valueOf(matcher.group(1)) + (Double.valueOf(matcher.group(2)) + (Double.valueOf(matcher.group(3)) / 60)) / 60;
      double directionMultiplier = 1;
      if ("W".equalsIgnoreCase(matcher.group(4))) {
        directionMultiplier = -1;
      }
      return directionMultiplier * decimalDegree;
    }
    throw new Exception(this.getClass().getSimpleName() + " [" + pattern + "] string pattern violation: ([0-9]{7}(.[0-9]{1,2})?(E|W))|X");
  }
}
