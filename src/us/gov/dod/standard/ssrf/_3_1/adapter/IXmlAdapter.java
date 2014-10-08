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
package us.gov.dod.standard.ssrf._3_1.adapter;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

/**
 * Use an adapter that implements {@link XmlAdapter} for custom marshaling.
 * <p>
 * <b> Usage: </b>
 * The <tt>@XmlJavaTypeAdapter</tt> annotation can be used with the following
 * program elements:
 * <ul>
 * <li> a JavaBean property </li>
 * <li> field </li>
 * <li> parameter </li>
 * <li> package </li>
 * <li> from within {@link XmlJavaTypeAdapters} </li>
 * </ul>
 * <p>
 * When <tt>@XmlJavaTypeAdapter</tt> annotation is defined on a class, it
 * applies to all references to the class.
 * <p>
 * When <tt>@XmlJavaTypeAdapter</tt> annotation is defined at the package level
 * it applies to all references from within the package to
 * <tt>@XmlJavaTypeAdapter.type()</tt>.
 * <p>
 * When <tt>@XmlJavaTypeAdapter</tt> annotation is defined on the field,
 * property or parameter, then the annotation applies to the field, property or
 * the parameter only.
 * <p>
 * A <tt>@XmlJavaTypeAdapter</tt> annotation on a field, property or parameter
 * overrides the <tt>@XmlJavaTypeAdapter</tt> annotation associated with the
 * class being referenced by the field, property or parameter.
 * <p>
 * A <tt>@XmlJavaTypeAdapter</tt> annotation on a class overrides the
 * <tt>@XmlJavaTypeAdapter</tt> annotation specified at the package level for
 * that class.
 * <p>
 * <p>
 * This annotation can be used with the following other annotations: null {@link XmlElement}, {@link XmlAttribute}, {@link XmlElementRef},
 * {@link XmlElementRefs}, {@link XmlAnyElement}. This can also be used at the
 * package level with the following annotations: null {@link XmlAccessorType}, {@link XmlSchema}, {@link XmlSchemaType},
 * {@link XmlSchemaTypes}.
 * <p>
 * <p>
 * <b> Example: </b> See example in {@link XmlAdapter}
 * <p>
 * @author <ul><li>Sekhar Vajjhala, Sun Microsystems Inc.</li> <li> Kohsuke
 * Kawaguchi, Sun Microsystems Inc.</li></ul>
 * @since JAXB2.0
 * @see XmlAdapter
 * @author Jesse Caulfield <jesse@caulfield.org>
 */
@Retention(RUNTIME)
@Target({PACKAGE, FIELD, METHOD, TYPE, PARAMETER})
public @interface IXmlAdapter {

  /**
   * Points to the class that converts a value type to a bound type or vice
   * versa. See {@link XmlAdapter} for more details.
   * <p>
   * @return
   */
  Class<? extends XmlAdapter<?, ?>> value();

  /**
   * If this annotation is used at the package level, then value of the type()
   * must be specified.
   * <p>
   * @return
   */
  Class<?> type() default DEFAULT.class;

  /**
   * Used in {@link XmlJavaTypeAdapter#type()} to signal that the type be
   * inferred from the signature of the field, property, parameter or the class.
   */
  @SuppressWarnings("PublicInnerClass")
  static final class DEFAULT {
  }
}
