/*
 * Copyright 2014 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1.adapter;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XML Adapter that supports the use of standard {@link XmlAdapter} for field
 * validation but is NOT recognized by JAXB during marshaling and unmarshaling.
 * <p>
 * <b> Usage: </b>
 * The <tt>@XmlTypeValidator</tt> annotation can be used with the following
 * program elements:
 * <ul>
 * <li> a JavaBean property </li>
 * <li> field </li>
 * <li> parameter </li>
 * <li> package </li>
 * <li> from within {@link XmlTypeValidators} </li>
 * </ul>
 * <p>
 * When <tt>@XmlTypeValidator</tt> annotation is defined on a class, it applies
 * to all references to the class.
 * <br/>
 * When <tt>@XmlTypeValidator</tt> annotation is defined at the package level it
 * applies to all references from within the package to
 * <tt>@XmlTypeValidator.type()</tt>.
 * <br/>
 * When <tt>@XmlTypeValidator</tt> annotation is defined on the field, property
 * or parameter, then the annotation applies to the field, property or the
 * parameter only.
 * <br/>
 * A <tt>@XmlTypeValidator</tt> annotation on a field, property or parameter
 * overrides the <tt>@XmlTypeValidator</tt> annotation associated with the class
 * being referenced by the field, property or parameter.
 * <br/>
 * A <tt>@XmlTypeValidator</tt> annotation on a class overrides the
 * <tt>@XmlTypeValidator</tt> annotation specified at the package level for that
 * class.
 * <p>
 * This is annotation can be used with any other valid annotation. e.g. {@link XmlElement}, {@link XmlAttribute}, {@link XmlElementRef},
 * {@link XmlElementRefs}, {@link XmlAnyElement}. This can also be used at the
 * package level with other valid annotations such as {@link XmlAccessorType}, {@link XmlSchema}, {@link XmlSchemaType},
 * {@link XmlSchemaTypes}.
 * <p>
 * <b> Example: </b>
 * <code>@XmlTypeValidator(type = TCalendar.class, value = XmlAdapterDATE.class)</code>
 * <p>
 * @author Jesse Caulfield <jesse@caulfield.org>
 * @since SSRF 3.1.0
 * @see XmlAdapter
 */
@Retention(RUNTIME)
@Target({PACKAGE, FIELD, METHOD, TYPE, PARAMETER})
public @interface XmlTypeValidator {

  /**
   * Points to the class that converts a value type to a bound type or vice
   * versa. See {@link XmlAdapter} for more details.
   * <p>
   * @return
   */
  public Class<? extends XmlAdapter> value();

  /**
   * If this annotation is used at the package level, then value of the type()
   * must be specified.
   * <p>
   * @return
   */
  public Class<?> type() default DEFAULT.class;

  /**
   * Used in {@link XmlTypeValidator#type()} to signal that the type be inferred
   * from the signature of the field, property, parameter or the class.
   */
  @SuppressWarnings("PublicInnerClass")
  static final class DEFAULT {
  }
}
