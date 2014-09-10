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
package us.gov.dod.standard.ssrf._3_0.datatype;

import java.math.BigInteger;
import java.util.List;
import us.gov.dod.standard.ssrf._3_0.enumerate.ListCCL;

/**
 * Interface class representing the SSRF Standard Metadata Attributes.
 * <p>
 * This interface defines the minimum required contract for any implementing
 * datatype class that wishes to incorporate metadata.
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
public interface IStandardMetadataAttributes {

  /**
   * Gets the value of the cls property.
   * <p>
   * @return possible object is {@link ListCCL }
   * <p>
   */
  public ListCCL getCls();

  /**
   * Gets the value of the remarks property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the remarks property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRemarks().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   * <p>
   * <p>
   * @return
   */
  public List<BigInteger> getRemarks();

  /**
   * Gets the value of the extReferences property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the extReferences property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getExtReferences().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   * <p>
   * <p>
   * @return
   */
  public List<BigInteger> getExtReferences();

  /**
   * Gets the value of the legacyReleasability property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getLegacyReleasability();

  /**
   * Gets the value of the quality property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getQuality();

  /**
   * Gets the value of the recommendedValue property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getRecommendedValue();

  /**
   * Gets the value of the availability property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getAvailability();
}
