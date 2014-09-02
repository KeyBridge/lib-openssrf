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

import us.gov.dod.standard.ssrf._3_0.datatype.TMEMO;
import us.gov.dod.standard.ssrf._3_0.datatype.TListCAO;
import us.gov.dod.standard.ssrf._3_0.datatype.TUS3;
import us.gov.dod.standard.ssrf._3_0.datatype.TS25;
import us.gov.dod.standard.ssrf._3_0.datatype.TD;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

/**
 * <p>
 * Java class for CodeList complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="CodeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS25"/>
 *         &lt;element name="CodeListCode" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TUS3"/>
 *         &lt;element name="EffectiveDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 *         &lt;element name="Description" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TMEMO" minOccurs="0"/>
 *         &lt;element name="Origin" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCAO" minOccurs="0"/>
 *         &lt;element name="Code" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Code" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeList", propOrder = {
  "action",
  "codeListCode",
  "effectiveDate",
  "description",
  "origin",
  "code"
})
public class CodeList {

  @XmlElement(name = "Action", required = true)
  protected TS25 action;
  @XmlElement(name = "CodeListCode", required = true)
  protected TUS3 codeListCode;
  @XmlElement(name = "EffectiveDate", required = true)
  protected TD effectiveDate;
  @XmlElementRef(name = "Description", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TMEMO> description;
  @XmlElementRef(name = "Origin", namespace = "urn:us:gov:dod:standard:ssrf:3.0.0", type = JAXBElement.class, required = false)
  protected JAXBElement<TListCAO> origin;
  @XmlElement(name = "Code")
  protected List<Code> code;

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
   * Gets the value of the codeListCode property.
   * <p>
   * @return possible object is {@link TUS3 }
   * <p>
   */
  public TUS3 getCodeListCode() {
    return codeListCode;
  }

  /**
   * Sets the value of the codeListCode property.
   * <p>
   * @param value allowed object is {@link TUS3 }
   * <p>
   */
  public void setCodeListCode(TUS3 value) {
    this.codeListCode = value;
  }

  /**
   * Gets the value of the effectiveDate property.
   * <p>
   * @return possible object is {@link TD }
   * <p>
   */
  public TD getEffectiveDate() {
    return effectiveDate;
  }

  /**
   * Sets the value of the effectiveDate property.
   * <p>
   * @param value allowed object is {@link TD }
   * <p>
   */
  public void setEffectiveDate(TD value) {
    this.effectiveDate = value;
  }

  /**
   * Gets the value of the description property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public JAXBElement<TMEMO> getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TMEMO }{@code >}
   * <p>
   */
  public void setDescription(JAXBElement<TMEMO> value) {
    this.description = value;
  }

  /**
   * Gets the value of the origin property.
   * <p>
   * @return possible object is
   *         {@link JAXBElement }{@code <}{@link TListCAO }{@code >}
   * <p>
   */
  public JAXBElement<TListCAO> getOrigin() {
    return origin;
  }

  /**
   * Sets the value of the origin property.
   * <p>
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link TListCAO }{@code >}
   * <p>
   */
  public void setOrigin(JAXBElement<TListCAO> value) {
    this.origin = value;
  }

  /**
   * Gets the value of the code property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the code property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCode().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Code }
   * <p>
   * <p>
   */
  public List<Code> getCode() {
    if (code == null) {
      code = new ArrayList<>();
    }
    return this.code;
  }

}
