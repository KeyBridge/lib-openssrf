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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ClsDerived complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="ClsDerived">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD"/>
 *         &lt;element name="Title" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30"/>
 *         &lt;element name="Org" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsDerived", propOrder = {
  "date",
  "title",
  "org"
})
public class ClsDerived {

  @XmlElement(name = "Date", required = true)
  protected TD date;
  @XmlElement(name = "Title", required = true)
  protected TS30 title;
  @XmlElement(name = "Org", required = true)
  protected TS30 org;

  /**
   * Gets the value of the date property.
   * <p>
   * @return possible object is {@link TD }
   * <p>
   */
  public TD getDate() {
    return date;
  }

  /**
   * Sets the value of the date property.
   * <p>
   * @param value allowed object is {@link TD }
   * <p>
   */
  public void setDate(TD value) {
    this.date = value;
  }

  /**
   * Gets the value of the title property.
   * <p>
   * @return possible object is {@link TS30 }
   * <p>
   */
  public TS30 getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p>
   * @param value allowed object is {@link TS30 }
   * <p>
   */
  public void setTitle(TS30 value) {
    this.title = value;
  }

  /**
   * Gets the value of the org property.
   * <p>
   * @return possible object is {@link TS30 }
   * <p>
   */
  public TS30 getOrg() {
    return org;
  }

  /**
   * Sets the value of the org property.
   * <p>
   * @param value allowed object is {@link TS30 }
   * <p>
   */
  public void setOrg(TS30 value) {
    this.org = value;
  }

}
