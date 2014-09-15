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
package us.gov.dod.standard.ssrf._3_0.metadata;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AStandardMetadataAttributes;

/**
 * Java class for TIdxList complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="TIdxList"> &lt;simpleContent> &lt;extension
 * base="&lt;urn:us:gov:dod:standard:ssrf:3.0.0>IdxList"> &lt;attGroup
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}metadata"/> &lt;/extension>
 * &lt;/simpleContent> &lt;/complexType>
 * </pre>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIdxList")
public class TIdxList extends AStandardMetadataAttributes {

  /**
   * The value to which the metadata attributes are associated. Expected Class
   * types are String, BigDecimal and BigInteger.
   */
  @XmlValue
  protected List<BigInteger> value;

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public TIdxList(List<BigInteger> value) {
    this.value = value;
  }

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public TIdxList(BigInteger... value) {
    if (value != null) {
      getValue().addAll(Arrays.asList(value));
    }
  }

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public TIdxList(Integer value) {
    if (value != null) {
      getValue().add(BigInteger.valueOf(value));
    }
  }

  /**
   * Gets the value of the value property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the value property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValue().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public final List<BigInteger> getValue() {
    if (value == null) {
      value = new ArrayList<>();
    }
    return this.value;
  }

  public boolean isSetValue() {
    return ((this.value != null) && (!this.value.isEmpty()));
  }

  public void unsetValue() {
    this.value = null;
  }

  public void addValue(BigInteger value) {
    getValue().add(value);
  }

  public void addValue(Integer value) {
    getValue().add(BigInteger.valueOf(value));
  }

}
