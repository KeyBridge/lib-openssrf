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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.datatype.*;

/**
 * <p>
 * Java class for CurvePoint complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="CurvePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offset" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TFreqOffset"/>
 *         &lt;element name="Level" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TCurvePointLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePoint", propOrder = {
  "offset",
  "level"
})
public class CurvePoint {

  @XmlElement(name = "Offset", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterFREQOFFSET.class)
  private TDecimal offset;
  @XmlElement(name = "Level", required = true)
  @XmlJavaTypeAdapter(type = TDecimal.class, value = XmlAdapterCURVEPOINTLEVEL.class)
  private TDecimal level;

  /**
   * Gets the value of the offset property.
   * <p>
   * @return possible object is {@link TFreqOffset }
   * <p>
   */
  public TDecimal getOffset() {
    return offset;
  }

  /**
   * Sets the value of the offset property.
   * <p>
   * @param value allowed object is {@link TFreqOffset }
   * <p>
   */
  public void setOffset(TDecimal value) {
    this.offset = value;
  }

  public boolean isSetOffset() {
    return (this.offset != null);
  }

  /**
   * Gets the value of the level property.
   * <p>
   * @return possible object is {@link TCurvePointLevel }
   * <p>
   */
  public TDecimal getLevel() {
    return level;
  }

  /**
   * Sets the value of the level property.
   * <p>
   * @param value allowed object is {@link TCurvePointLevel }
   * <p>
   */
  public void setLevel(TDecimal value) {
    this.level = value;
  }

  public boolean isSetLevel() {
    return (this.level != null);
  }

  public CurvePoint withOffset(Double value) {
    setOffset(new TDecimal(value));
    return this;
  }

  public CurvePoint withLevel(Double value) {
    setLevel(new TDecimal(value));
    return this;
  }

}
