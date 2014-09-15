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

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.AStandardMetadataAttributes;

/**
 * <p>
 * Java class for EmsClass complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="EmsClass"> &lt;simpleContent> &lt;extension
 * base="&lt;urn:us:gov:dod:standard:ssrf:3.0.0>EmsDes"> &lt;attGroup
 * ref="{urn:us:gov:dod:standard:ssrf:3.0.0}metadata"/> &lt;attribute
 * name="explainInformationTypeX"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}MEMO" /> &lt;attribute
 * name="explainModulationTypeX" type="{urn:us:gov:dod:standard:ssrf:3.0.0}MEMO"
 * /> &lt;attribute name="explainNatureOfSignalX"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}MEMO" /> &lt;/extension>
 * &lt;/simpleContent> &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmsClass")
public class EmsClass extends AStandardMetadataAttributes {

  /**
   * The value to which the metadata attributes are associated. Expected Class
   * types are String, BigDecimal and BigInteger.
   */
  @XmlValue
  protected String value;

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public EmsClass(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value
   */
  public void setValue(String value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  @XmlAttribute(name = "explainInformationTypeX")
  protected String explainInformationTypeX;
  @XmlAttribute(name = "explainModulationTypeX")
  protected String explainModulationTypeX;
  @XmlAttribute(name = "explainNatureOfSignalX")
  protected String explainNatureOfSignalX;

  /**
   * Gets the value of the explainInformationTypeX property.
   * <p>
   * @return
   */
  public String getExplainInformationTypeX() {
    return explainInformationTypeX;
  }

  /**
   * Sets the value of the explainInformationTypeX property.
   * <p>
   * @param value
   */
  public void setExplainInformationTypeX(String value) {
    this.explainInformationTypeX = value;
  }

  public boolean isSetExplainInformationTypeX() {
    return (this.explainInformationTypeX != null);
  }

  /**
   * Gets the value of the explainModulationTypeX property.
   * <p>
   * @return
   */
  public String getExplainModulationTypeX() {
    return explainModulationTypeX;
  }

  /**
   * Sets the value of the explainModulationTypeX property.
   * <p>
   * @param value
   */
  public void setExplainModulationTypeX(String value) {
    this.explainModulationTypeX = value;
  }

  public boolean isSetExplainModulationTypeX() {
    return (this.explainModulationTypeX != null);
  }

  /**
   * Gets the value of the explainNatureOfSignalX property.
   * <p>
   * @return
   */
  public String getExplainNatureOfSignalX() {
    return explainNatureOfSignalX;
  }

  /**
   * Sets the value of the explainNatureOfSignalX property.
   * <p>
   * @param value
   */
  public void setExplainNatureOfSignalX(String value) {
    this.explainNatureOfSignalX = value;
  }

  public boolean isSetExplainNatureOfSignalX() {
    return (this.explainNatureOfSignalX != null);
  }

  public EmsClass withExplainInformationTypeX(String value) {
    setExplainInformationTypeX(value);
    return this;
  }

  public EmsClass withExplainModulationTypeX(String value) {
    setExplainModulationTypeX(value);
    return this;
  }

  public EmsClass withExplainNatureOfSignalX(String value) {
    setExplainNatureOfSignalX(value);
    return this;
  }

}
