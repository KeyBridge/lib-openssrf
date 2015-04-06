/* 
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.forceelement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.ForceElement;
import us.gov.dod.standard.ssrf._3_1.RFSystem;
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
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockNum", propOrder = {
  "stockNum",
  "type"
})
public class StockNum {

  /**
   * US:StockNum - Stock Number (Required)    * <p>
   * The stock number of the system/equipment.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "StockNum", required = true)
  private S50 stockNum;
  /**
   * US:Type - Stock Number Type (Optional)    * <p>
   * The type of stock number.
   * <p>
   * Format is L:UNS
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Type", required = false)
  private S25 type;

  /**
   * Get the stock number of the system/equipment..
   * <p>
   * @return a {@link S50} instance
   * @since 3.1.0
   */
  public S50 getStockNum() {
    return stockNum;
  }

  /**
   * Set the stock number of the system/equipment..
   * <p>
   * @param value a {@link S50} instance
   * @since 3.1.0
   */
  public void setStockNum(S50 value) {
    this.stockNum = value;
  }

  /**
   * Determine if the StockNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetStockNum() {
    return (this.stockNum != null ? this.stockNum.isSetValue() : false);
  }

  /**
   * Get the type of stock number..
   * <p>
   * @return a {@link S25} instance
   * @since 3.1.0
   */
  public S25 getType() {
    return type;
  }

  /**
   * Set the type of stock number..
   * <p>
   * @param value a {@link S25} instance
   * @since 3.1.0
   */
  public void setType(S25 value) {
    this.type = value;
  }

  /**
   * Determine if the Type is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetType() {
    return (this.type != null ? this.type.isSetValue() : false);
  }

  /**
   * Set the stock number of the system/equipment.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current StockNum object instance.
   * @since 3.1.0
   */
  public StockNum withStockNum(String value) {
    setStockNum(new S50(value));
    return this;
  }

  /**
   * Set the type of stock number.
   * <p>
   * @param value An instances of type {@link String}.
   * @return The current StockNum object instance.
   * @since 3.1.0
   */
  public StockNum withType(String value) {
    setType(new S25(value));
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
   * {@link StockNum} requires {@link S50 StockNum}.
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
