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
package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;
import us.gov.dod.standard.ssrf._3_1.metadata.IMetadataType;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 * A simple String instance with SSRF Standard Metadata Attributes. This
 * corresponds to the "xs:string" string type.
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TString", propOrder = {"value"})
public class TString extends AMetadata<TString> implements IMetadataType, Comparable<TString> {

  /**
   * The value to which the metadata attributes are associated.
   */
  @XmlValue
  protected String value;

  /**
   * Construct a new data type instance with the indicated value.
   * <p>
   * @param value the value
   */
  public TString(String value) {
    this.value = value;
  }

  /**
   * Empty constructor.
   */
  public TString() {
  }

  /**
   * Gets the value of the value property.
   * <p>
   * @return the value of the value property.
   */
  @Override
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

  /**
   * Determine if the Value is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Sets the value of the value property.
   * <p>
   * @param value the value to set
   * @return this TString instance
   */
  public TString withValue(String value) {
    setValue(value);
    return this;
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TString} requires {@link ListCCL cls} and {@link String value}
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

  /**
   * Get the configured value.
   * <p>
   * @return the value.
   */
  @Override
  public String toString() {
    return value;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the String value.
   * <p>
   * @return a unique hash code.
   */
  @Override
  public int hashCode() {
    int hash = 3;
    hash = 79 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the String value.
   * <p>
   * @param obj the other object
   * @return TRUE if the string values match.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((TString) obj).getValue());
  }

  /**
   * Comparison and sorting is alphabetical based upon the String value.
   * <p>
   * @param o the other TString value
   * @return alphabetical sort order
   */
  @Override
  public int compareTo(TString o) {
    if (o == null) {
      return 1;
    }
    if (value == null) {
      return -1;
    }
    return value.compareTo(o.getValue());
  }//</editor-fold>

}
