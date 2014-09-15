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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ListCCL.
 * <p>
 * A 1-letter designator representing the security classification of the
 * dataset.
 * <p>
 * The overall security classification of the frequency proposal, assignment,
 * allotment, antenna, Spectrum Supportability, transmitter/ receiver equipment
 * or other dataset.
 * <p>
 * Note for the USA: The letter "R" MUST NOT be used in USA created datasets.
 */
@XmlType(name = "ListCCL")
@XmlEnum
public enum ListCCL {

  /**
   * Unclassified
   */
  U,
  /**
   * Restricted (This classification SHALL NOT be used in USA-created datasets)
   */
  R,
  /**
   * Confidential
   */
  C,
  /**
   * Secret
   */
  S,
  /**
   * Top Secret
   */
  T;

  public String value() {
    return name();
  }

  public static ListCCL fromValue(String v) {
    return valueOf(v);
  }

}
