/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.forceelement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.adapter.XmlTypeValidator;
import us.gov.dod.standard.ssrf._3_1.ForceElement;
import us.gov.dod.standard.ssrf._3_1.RFSystem;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;

/**
 * StockNum (US) provides the equipment stock number and indicates the type of
 * stock number.
 * <p>
 * Element of {@link ForceElement}, {@link RFSystem}
 * <p>
 * Example:
 * <pre>
 * &lt;StockNum&gt;
 *   &lt;Number&gt;0967-01-234-6799&lt;/Number&gt;
 *   &lt;Type&gt;N&lt;/Type&gt;
 * &lt;/StockNum&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 09/30/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockNum", propOrder = {
  "stockNum",
  "type"
})
public class StockNum {

  /**
   * US:StockNum - Stock Number (Required)
   * <p>
   * The stock number of the system/equipment.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "StockNum", required = true)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString stockNum;
  /**
   * US:Type - Stock Number Type (Optional)
   * <p>
   * The type of stock number.
   * <p>
   * Format is L:UNS
   */
  @XmlElement(name = "Type", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS25.class)
  private TString type;

  /**
   * Get the stock number of the system/equipment.
   * <p>
   * @return the StockNum value in a {@link TString} data type
   */
  public TString getStockNum() {
    return stockNum;
  }

  /**
   * Set the stock number of the system/equipment.
   * <p>
   * @param value the StockNum value in a {@link TString} data type
   */
  public void setStockNum(TString value) {
    this.stockNum = value;
  }

  /**
   * Determine if the StockNum is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStockNum() {
    return (this.stockNum != null ? this.stockNum.isSetValue() : false);
  }

  /**
   * Get the type of stock number.
   * <p>
   * @return the Type value in a {@link TString} data type
   */
  public TString getType() {
    return type;
  }

  /**
   * Set the type of stock number.
   * <p>
   * @param value the Type value in a {@link TString} data type
   */
  public void setType(TString value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Set the stock number of the system/equipment.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StockNum object instance
   */
  public StockNum withStockNum(String value) {
    setStockNum(new TString(value));
    return this;
  }

  /**
   * Set the type of stock number.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StockNum object instance
   */
  public StockNum withType(String value) {
    setType(new TString(value));
    return this;
  }

  /**
   * Get a string representation of this StockNum instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "StockNum {"
      + (stockNum != null ? " stockNum [" + stockNum + "]" : "")
      + (type != null ? " type [" + type + "]" : "")
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StockNum} requires {@link TString StockNum}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetStockNum();
  }

}
