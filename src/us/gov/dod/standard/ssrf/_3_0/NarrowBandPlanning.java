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

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TDecimal;

/**
 * <p>
 * Java class for NarrowBandPlanning complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="NarrowBandPlanning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeDate" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/>
 *         &lt;element name="NBFreq" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NarrowBandPlanning", propOrder = {
  "changeDate",
  "nbFreq"
})
public class NarrowBandPlanning {

  @XmlElement(name = "ChangeDate", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar changeDate;
  @XmlElement(name = "NBFreq", required = false)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQM.class)
  private TDecimal nbFreq;

  /**
   * Gets the value of the changeDate property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TCalendar getChangeDate() {
    return changeDate;
  }

  /**
   * Sets the value of the changeDate property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setChangeDate(TCalendar value) {
    this.changeDate = value;
  }

  public boolean isSetChangeDate() {
    return (this.changeDate != null);
  }

  /**
   * Gets the value of the nbFreq property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TDecimal getNBFreq() {
    return nbFreq;
  }

  /**
   * Sets the value of the nbFreq property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setNBFreq(TDecimal value) {
    this.nbFreq = value;
  }

  public boolean isSetNBFreq() {
    return (this.nbFreq != null);
  }

  public NarrowBandPlanning withChangeDate(Calendar value) {
    setChangeDate(new TCalendar(value));
    return this;
  }

  public NarrowBandPlanning withNBFreq(Double value) {
    setNBFreq(new TDecimal(value));
    return this;
  }

}
