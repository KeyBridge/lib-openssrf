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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Administrative complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <pre>
 * &lt;complexType name="Administrative">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Dataset" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Dataset" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="CodeList" type="{urn:us:gov:dod:standard:ssrf:3.0.0}CodeList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrative", propOrder = {
  "action",
  "dataset",
  "codeList"
})
public class Administrative
  extends Common {

  @XmlElement(name = "Action", required = true)
  protected TS25 action;
  @XmlElement(name = "Dataset")
  protected List<Dataset> dataset;
  @XmlElement(name = "CodeList")
  protected List<CodeList> codeList;

  /**
   * Gets the value of the action property.
   * <p>
   * @return possible object is {@link TS25 }
   * <p>
   */
  public TS25 getAction() {
    return action;
  }

  /**
   * Sets the value of the action property.
   * <p>
   * @param value allowed object is {@link TS25 }
   * <p>
   */
  public void setAction(TS25 value) {
    this.action = value;
  }

  /**
   * Gets the value of the dataset property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the dataset property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDataset().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Dataset }
   * <p>
   * <p>
   */
  public List<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new ArrayList<>();
    }
    return this.dataset;
  }

  /**
   * Gets the value of the codeList property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the codeList property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCodeList().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link CodeList }
   * <p>
   * <p>
   */
  public List<CodeList> getCodeList() {
    if (codeList == null) {
      codeList = new ArrayList<>();
    }
    return this.codeList;
  }

}
