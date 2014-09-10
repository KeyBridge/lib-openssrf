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
package org.caulfield.ssrf.utility;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

/**
 * A set of JAXB marshaling and un-marshaling utilities. These methods help to
 * serialize and un-serialize object representations to and from XML.
 * <p/>
 * @author jesse
 */
public class JaxbUtility {

  /**
   * Marshal an entity class into a XML String representation.
   * <p/>
   * The output of this method is typically either written to a file or sent via
   * a SOAP communication link.
   * <p/>
   * @param <T>   the entity class type
   * @param clazz the entity class to be written
   * @return the entity class serialized into XML form
   * @throws JAXBException if the entity class cannot be marshaled (serialized)
   */
  public static <T> String marshal(T clazz) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(clazz.getClass());
    Marshaller marshaller = jaxbContext.createMarshaller();
    /**
     * Add newlines to the output. This helps visually inspect the output.
     */
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    StringWriter stringWriter = new StringWriter();
    marshaller.marshal(clazz, stringWriter);
    return stringWriter.toString();
  }

  /**
   * Retrieve and parse an XML file into a container class. This method calls
   * the JAXB Unmarshaller and returns a class containing all of the content
   * defined in the XML file.
   * <p/>
   * @param <T>   the class type that is returned
   * @param uri   a URI to the XML source file (e.g. http:// ... file:/// ....
   *              etc.)
   * @param clazz the class type that is parsed - this is the same as the class
   *              type that is returned
   * @return the XML source file parsed into the identified class type
   * @throws JAXBException         if the XML source file does not match the
   *                               input class type
   * @throws MalformedURLException if the URI cannot be converted into a URL
   */
  public static <T> T unmarshal(URI uri, Class<T> clazz) throws JAXBException, MalformedURLException {
    return unmarshal(uri.toURL(), clazz);
  }

  /**
   * Retrieve and parse and XML file into a container class. This method calls
   * the JAXB Unmarshaller and returns a class containing all of the content
   * defined in the XML file.
   * <p/>
   * @param <T>   the class type that is returned
   * @param url   a URL to the XML source file (e.g. file:/// ....)
   * @param clazz the class type that is parsed - this is the same as the class
   *              type that is returned
   * @return the XML source file parsed into the identified class type
   * @throws JAXBException if the XML source file does not match the input class
   *                       type
   */
  public static <T> T unmarshal(URL url, Class<T> clazz) throws JAXBException {
    Unmarshaller unmarshaller = JAXBContext.newInstance(clazz).createUnmarshaller();
    return clazz.cast(unmarshaller.unmarshal(url));
  }

  /**
   * Parse an XML file into a container class. This method calls the JAXB
   * un-marshaller and returns a class containing all of the content defined in
   * the XML file.
   * <p/>
   * @param <T>   the class type that is returned
   * @param xml   the XML source content
   * @param clazz the class type that is parsed - this is the same as the class
   *              type that is returned
   * @return the XML source file parsed into the identified class type
   * @throws JAXBException if the XML source file does not match the input class
   *                       type
   */
  public static <T> T unmarshal(String xml, Class<T> clazz) throws JAXBException {
    Unmarshaller unmarshaller = JAXBContext.newInstance(clazz).createUnmarshaller();
    return clazz.cast(unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes())));
  }

  /**
   * Parse a W3C Document into a container class. This method calls the JAXB
   * un-marshaller and returns a class containing all of the content defined in
   * the XML file.
   * <p/>
   * Developer note: Using this method can be problematic. Prefer to use
   * {@link #unmarshal(java.lang.String, java.lang.Class)} if possible.
   * <p/>
   * @param <T>      the class type that is returned
   * @param document the W3C document to be parsed
   * @param clazz    the class type that is parsed - this is the same as the
   *                 class type that is returned
   * @return the XML source file parsed into the identified class type
   * @throws JAXBException if the XML source file does not match the input class
   *                       type
   */
  public static <T> T unmarshal(Document document, Class<T> clazz) throws JAXBException {
    Unmarshaller unmarshaller = JAXBContext.newInstance(clazz).createUnmarshaller();
    return clazz.cast(unmarshaller.unmarshal(document, clazz).getValue());
  }

  /**
   * Helper method to print a W3C document.
   * <p>
   * @param doc a W3C document.
   * @return the document as an XML string. null upon error
   */
  public static String documentToString(Document doc) {
    try {
      DOMSource domSource = new DOMSource(doc);
      StringWriter writer = new StringWriter();
      StreamResult result = new StreamResult(writer);
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();
      transformer.transform(domSource, result);
      return writer.toString();
    } catch (TransformerFactoryConfigurationError | TransformerException exception) {
      return null;
    }
  }
}
