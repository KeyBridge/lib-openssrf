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
package us.gov.dod.standard.ssrf._3_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_0.enumerate.*;

/**
 * <p>
 * Java class for TReleasability complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="TReleasability">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:us:gov:dod:standard:ssrf:3.0.0>Releasability">
 *       &lt;attGroup ref="{urn:us:gov:dod:standard:ssrf:3.0.0}metadata"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TReleasability", propOrder = {
  "value"
})
public class TReleasability {

  @XmlValue
  private List<ListCCY> value;
  @XmlAttribute(name = "cls", required = true)
  private ListCCL cls;
  @XmlAttribute(name = "remarks")
  private List<BigInteger> remarks;
  @XmlAttribute(name = "extReferences")
  private List<BigInteger> extReferences;
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
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the value property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValue().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link ListCCY }
   * <p>
   * <p>
   * @return
   */
  public List<ListCCY> getValue() {
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

  public boolean isSetCls() {
    return (this.cls != null);
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
   * @return
   */
  public List<BigInteger> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
    }
    return this.remarks;
  }

  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  public void unsetRemarks() {
    this.remarks = null;
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
   * @return
   */
  public List<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new ArrayList<>();
    }
    return this.extReferences;
  }

  public boolean isSetExtReferences() {
    return ((this.extReferences != null) && (!this.extReferences.isEmpty()));
  }

  public void unsetExtReferences() {
    this.extReferences = null;
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

  public boolean isSetLegacyReleasability() {
    return (this.legacyReleasability != null);
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

  public boolean isSetQuality() {
    return (this.quality != null);
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

  public boolean isSetRecommendedValue() {
    return (this.recommendedValue != null);
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

  public boolean isSetAvailability() {
    return (this.availability != null);
  }

  public TReleasability withValue(ListCCY... values) {
    if (values != null) {
      getValue().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TReleasability withValue(Collection<ListCCY> values) {
    if (values != null) {
      getValue().addAll(values);
    }
    return this;
  }

  public TReleasability withCls(ListCCL value) {
    setCls(value);
    return this;
  }

  public TReleasability withRemarks(BigInteger... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TReleasability withRemarks(Collection<BigInteger> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return this;
  }

  public TReleasability withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(Arrays.asList(values));
    }
    return this;
  }

  public TReleasability withExtReferences(Collection<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return this;
  }

  public TReleasability withLegacyReleasability(String value) {
    setLegacyReleasability(value);
    return this;
  }

  public TReleasability withQuality(String value) {
    setQuality(value);
    return this;
  }

  public TReleasability withRecommendedValue(String value) {
    setRecommendedValue(value);
    return this;
  }

  public TReleasability withAvailability(String value) {
    setAvailability(value);
    return this;
  }

}
