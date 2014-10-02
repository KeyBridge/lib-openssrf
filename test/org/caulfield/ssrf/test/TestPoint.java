package org.caulfield.ssrf.test;

import us.gov.dod.standard.ssrf._3_1.location.Point;

/**
 *
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public class TestPoint {

  public static void main(String[] args) {
    Point point = new Point();
    point.withLat(34.123);
    point.withLon(-77.456);

    System.out.println("Should read 34° 7' 22.80\" N 77° 27' 21.60\" W ");

    System.out.println("Point " + point);

  }
}
