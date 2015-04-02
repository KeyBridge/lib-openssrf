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
package us.gov.dod.standard.ssrf._3_1;

import junit.framework.TestCase;

/**
 *
 * @author jesse
 */
public class AdministrativeTest extends TestCase {

  public AdministrativeTest() {
  }

  public void testSomeMethod() {
    Integer totalDigits = 3;
    Integer fractionDigits = null;

    Double maxInclusive = Math.pow(10, (totalDigits - (fractionDigits != null ? fractionDigits : 0))) - 1;

    System.out.println("max " + maxInclusive);

  }

}
