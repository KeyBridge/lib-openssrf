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
package us.gov.dod.standard.ssrf._3_1.metadata;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Enumerated list of METADATA availability comments.
 * <p>
 * This is an OpenSSRF custom field supporting the availability field:
 * US:availability - data supporting legacy equipment certification business
 * practice.
 * <p>
 * Values should be selected from one of "Unknown", "N/A", "Not Available" or
 * "Not Applicable", when data is not available.
 * <p>
 * @author jesse
 */
@XmlEnum
public enum ListAvailability {

  UNKNOWN,
  NA,
  NOT_AVAILABLE,
  NOT_APPLICABLE,
  OTHER;

}
