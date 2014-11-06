/* 
 * Copyright 2014 Key Bridge Global LLC.
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
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
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS50.class)
  private TString stockNum;
  /**
   * US:Type - Stock Number Type (Optional)
   * <p>
   * The type of stock number.
   * <p>
   * Format is L:UNS
   */
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS25.class)
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
