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

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Set;
import junit.framework.TestCase;
import us.gov.dod.standard.ssrf.SSRFTestUtility;
import us.gov.dod.standard.ssrf.SSRFUtility;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterFREQM;
import us.gov.dod.standard.ssrf._3_1.assignment.Assigned;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;

/**
 *
 * @author jesse
 */
public class MiscTest extends TestCase {

  public MiscTest() {
  }

  public void testAdapter() throws Exception {
    XmlAdapterFREQM adapter = new XmlAdapterFREQM();
    Number n;
//            = 25213532.3219061530409284092384;
    n = 177102387.22020063;
    String string = adapter.marshal(n);
    System.out.println(n + " marshals to " + string);

    DecimalFormat df = new DecimalFormat("#######.#########");
    System.out.println("number: " + df.format(177102387.22020063));

  }

  public void _testAdapter() throws Exception {
    XmlAdapterFREQM adapter = new XmlAdapterFREQM();
    Number n = 25213932.3219061530409284092384;
    String string = adapter.marshal(n);
    System.out.println(n + " marshals to " + string);

  }

  public void _testSuperClass() throws Exception {
//    Assigned a = new Assigned();
//    SSRFTestUtility.fill(a, true);

    for (Field declaredField : Assigned.class.getDeclaredFields()) {
      System.out.println(declaredField.getName());

      Class<?> type = declaredField.getType();
      Type genericType = declaredField.getGenericType();
      System.out.println("  Type " + type.getSimpleName());
      System.out.println("  Generic Type " + genericType);

      if (type.equals(Set.class)) {
        Type[] typeArgs = ((ParameterizedType) genericType).getActualTypeArguments();
        for (int i = 0; i < typeArgs.length; i++) {
          System.out.println("    " + i + " " + typeArgs[i]);
        }

        Type fieldType = ((ParameterizedType) genericType).getActualTypeArguments()[0];
        System.out.println("    Internal Type: " + fieldType);

        Class<?> fieldClass = Class.forName(fieldType.toString().replace("class ", "").trim());

        System.out.println("    Field Class : " + fieldClass.getSimpleName());

        Object instance = fieldClass.getConstructor().newInstance();

        System.out.println("    Instance: " + instance);

      }

    }

  }

  public void _testMinimumPositiveFill() throws Exception {

    ExtReferenceRef ref = new ExtReferenceRef()
            .withValue(new Contact().getSerial().toString())
            .withCls(ListCCL.UNCLASSIFIED)
            .withIdx(120938);

    System.out.println(ref);

    SSRFTestUtility.fill(ref, true);

    System.out.println(SSRFUtility.marshal(ref));

    TOA t = new TOA()
            .withExtReferenceRef(ref);

//    SSRFTestUtility.fill(t, true);
    System.out.println(SSRFUtility.marshal(t));

//    TDecimal td = new TDecimal(12093812.1023810938);    td.setCls(ListCCL.UNCLASSIFIED);    System.out.println("TD " + td);    System.out.println(SSRFUtility.marshal(td));
  }

}
