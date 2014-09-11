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
package us.gov.dod.standard.ssrf;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._3_0.metadata.lists.ListCCL;

/**
 * Abstract class representing the SSRF Standard Metadata Attributes complement.
 * <p>
 * Metadata fields are defined in the SSRF XSD as the "metadata" attribute
 * group. These attributes apply to all data items, to all leaf elements
 * wihthout sub-elements (but with content), and to the Common element. All SSRF
 * field types extend this abstract class to support these optional metadata
 * fields.
 * <p>
 * Example: (Dummy classification for demonstration only). In this case, the
 * power value is Unclassified, but the associated remark is Confidential
 * releasable to three nations only.
 * <p>
 * <code><pre>
 * &lt;Transmitter cls="C"&gt;
 *   &lt;Serial cls="U"&gt;USA::TX:2011-00001&lt;/Serial&gt;
 *   &lt;ExtReferenceRef cls="U" idx="1"&gt;USA::EX:12&lt;/ExtReferenceRef&gt;
 *   &lt;ExtReferenceRef cls="U" idx="2"&gt;FRA::EX:34&lt;/ExtReferenceRef&gt;
 *   &lt;Remarks cls="U" idx="1"&gt;This is a JTIDS Class 2H terminal&lt;/Remarks&gt;
 *   &lt;...Ten Other Remarks...&gt;
 *   &lt;Remarks cls="C" release="USA GBR CAN" idx="12"&gt;All modes are limited to 200W&lt;/Remarks&gt;
 *   &lt;Other_Transmitter_Elements/&gt;
 *   &lt;Power cls="U" <strong>extReferences="1 2"</strong> <strong>remarkReferences="1 12"</strong>&gt;23&lt;/Power&gt;
 * &lt;/Transmitter&gt;
 * </pre></code>
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AStandardMetadataAttributes", propOrder = {
  "value"
})
public abstract class AStandardMetadataAttributes implements IStandardMetadataAttributes {

  /**
   * cls (Attribute): The classification of the current data item. This
   * attribute is REQUIRED on each data item, even if the classification is "U".
   * [XSD ERR CODELIST] This data item MUST use one of the codes from Code List
   * CCL:
   * <ul>
   * <li>U Unclassified (DEFAULT)</li>
   * <li>R Restricted (This classification SHALL NOT be used in USA-created
   * datasets)</li>
   * <li>C Confidential</li>
   * <li>S Secret</li>
   * <li>T Top Secret</li></ul>
   */
  @XmlAttribute(name = "cls", required = true)
  protected ListCCL cls = ListCCL.U;
  /**
   * remarkReferences (Attribute): The list of indices referring to an Remarks
   * index applicable to the current data item.
   * <p>
   * Developer note: This cross-reference index should be automatically
   * populated when a user creates a Remarks association with this datatype
   * instance.
   */
  @XmlAttribute(name = "remarks")
  protected List<BigInteger> remarkReferences;
  /**
   * extReferences (Attribute): The list of indices referring to an
   * ExtReferenceRef index applicable to the current data item.
   * <p>
   * Developer note: This cross-reference index be automatically populated when
   * a user creates an ExtReferenceRef association with this datatype instance.
   */
  @XmlAttribute(name = "extReferences")
  protected List<BigInteger> extReferences;
  /**
   * legacyReleasability (Attribute) (US): One or more special handling
   * instructions in sentence format, not code format. For example, "Approved
   * for public release; distribution is unlimited". Multiple special handling
   * instructions are separated by "|” (i.e., ASCII character #124).
   */
  @XmlAttribute(name = "legacyReleasability")
  protected String legacyReleasability;
  /**
   * quality (Attribute) (US): A quality indicator for the data in this XML
   * element. For example, "Outlier" or "Non- CodeList".
   */
  @XmlAttribute(name = "quality")
  protected String quality;
  /**
   * recommendedValue (Attribute) (US): The manually entered, automatically
   * calculated or statistically derived probable correct value for data items
   * with negative quality entries.
   */
  @XmlAttribute(name = "recommendedValue")
  protected String recommendedValue;
  /**
   * availability (Attribute) (US): The issue with data availability, if any.
   * For example, "Unknown", "Not Available" or "Not Applicable".
   */
  @XmlAttribute(name = "availability")
  protected String availability;

  /**
   * Gets the value of the cls property.
   * <p>
   * @return 
   */
  @Override
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Sets the value of the cls property.
   * <p>
   * @param value 
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Gets the value of the remarkReferences property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the remarkReferences property.
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
     * 
   * <p>
   * <p>
   * @return
   */
  @Override
  public List<BigInteger> getRemarkReferences() {
    if (remarkReferences == null) {
      remarkReferences = new ArrayList<>();
    }
    return this.remarkReferences;
  }

  public boolean isSetRemarkReferences() {
    return ((this.remarkReferences != null) && (!this.remarkReferences.isEmpty()));
  }

  public void unsetRemarkReferences() {
    this.remarkReferences = null;
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
     * 
   * <p>
   * <p>
   * @return
   */
  @Override
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
   * @return 
   */
  @Override
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Sets the value of the legacyReleasability property.
   * <p>
   * @param value 
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
   * @return 
   */
  @Override
  public String getQuality() {
    return quality;
  }

  /**
   * Sets the value of the quality property.
   * <p>
   * @param value 
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
   * @return 
   */
  @Override
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Sets the value of the recommendedValue property.
   * <p>
   * @param value 
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
   * @return 
   */
  @Override
  public String getAvailability() {
    return availability;
  }

  /**
   * Sets the value of the availability property.
   * <p>
   * @param value 
   */
  public void setAvailability(String value) {
    this.availability = value;
  }

  public boolean isSetAvailability() {
    return (this.availability != null);
  }

  /**
   * Shortcut to {@link #withCls(us.gov.dod.standard.ssrf._3_0.ListCCL)}
   * <p>
   * With the indicated classification. Classification is defaulted to U
   * (Unclassified) and this method is only required when the classification is
   * to be set otherwise.
   * <p>
   * @param value the new classification
   * @return this instance
   */
  public IStandardMetadataAttributes withClassification(ListCCL value) {
    setCls(value);
    return this;
  }

  /**
   * With the indicated classification. Classification is defaulted to U
   * (Unclassified) and this method is only required when the classification is
   * to be set otherwise.
   * <p>
   * @param value the new classification
   * @return this instance
   */
  public IStandardMetadataAttributes withCls(ListCCL value) {
    setCls(value);
    return this;
  }

  public IStandardMetadataAttributes withRemarks(BigInteger... values) {
    if (values != null) {
      getRemarkReferences().addAll(Arrays.asList(values));
    }
    return this;
  }

  public IStandardMetadataAttributes withRemarkReferences(Collection<BigInteger> values) {
    if (values != null) {
      getRemarkReferences().addAll(values);
    }
    return this;
  }

  public IStandardMetadataAttributes withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(Arrays.asList(values));
    }
    return this;
  }

  public IStandardMetadataAttributes withExtReferences(Collection<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return this;
  }

  public IStandardMetadataAttributes withLegacyReleasability(String value) {
    setLegacyReleasability(value);
    return this;
  }

  public IStandardMetadataAttributes withQuality(String value) {
    setQuality(value);
    return this;
  }

  public IStandardMetadataAttributes withRecommendedValue(String value) {
    setRecommendedValue(value);
    return this;
  }

  public IStandardMetadataAttributes withAvailability(String value) {
    setAvailability(value);
    return this;
  }

}
