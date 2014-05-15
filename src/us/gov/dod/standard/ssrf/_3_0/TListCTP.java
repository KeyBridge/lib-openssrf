/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield.
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
package us.gov.dod.standard.ssrf._3_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for TListCTP complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TListCTP">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:us:gov:dod:standard:ssrf:3.0.0>ListCTP">
 *       &lt;attGroup ref="{urn:us:gov:dod:standard:ssrf:3.0.0}metadata"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TListCTP", propOrder = {
  "value"
})
public class TListCTP {

  @XmlValue
  protected ListCTP value;
  @XmlAttribute(name = "cls", required = true)
  protected ListCCL cls;
  @XmlAttribute(name = "remarks")
  protected List<BigInteger> remarks;
  @XmlAttribute(name = "extReferences")
  protected List<BigInteger> extReferences;
  @XmlAttribute(name = "legacyReleasability")
  protected String legacyReleasability;
  @XmlAttribute(name = "quality")
  protected String quality;
  @XmlAttribute(name = "recommendedValue")
  protected String recommendedValue;
  @XmlAttribute(name = "availability")
  protected String availability;

  /**
   * Gets the value of the value property.
   * <p>
   * @return possible object is {@link ListCTP }
   * <p>
   */
  public ListCTP getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value allowed object is {@link ListCTP }
   * <p>
   */
  public void setValue(ListCTP value) {
    this.value = value;
  }

  /**
   * Gets the value of the cls property.
   * <p>
   * @return possible object is {@link ListCCL }
   * <p>
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Sets the value of the cls property.
   * <p>
   * @param value allowed object is {@link ListCCL }
   * <p>
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

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
   */
  public List<BigInteger> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
    }
    return this.remarks;
  }

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
   */
  public List<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new ArrayList<>();
    }
    return this.extReferences;
  }

  /**
   * Gets the value of the legacyReleasability property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Sets the value of the legacyReleasability property.
   * <p>
   * @param value allowed object is {@link String }
   * <p>
   */
  public void setLegacyReleasability(String value) {
    this.legacyReleasability = value;
  }

  /**
   * Gets the value of the quality property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getQuality() {
    return quality;
  }

  /**
   * Sets the value of the quality property.
   * <p>
   * @param value allowed object is {@link String }
   * <p>
   */
  public void setQuality(String value) {
    this.quality = value;
  }

  /**
   * Gets the value of the recommendedValue property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Sets the value of the recommendedValue property.
   * <p>
   * @param value allowed object is {@link String }
   * <p>
   */
  public void setRecommendedValue(String value) {
    this.recommendedValue = value;
  }

  /**
   * Gets the value of the availability property.
   * <p>
   * @return possible object is {@link String }
   * <p>
   */
  public String getAvailability() {
    return availability;
  }

  /**
   * Sets the value of the availability property.
   * <p>
   * @param value allowed object is {@link String }
   * <p>
   */
  public void setAvailability(String value) {
    this.availability = value;
  }

}
