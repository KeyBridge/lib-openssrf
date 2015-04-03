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
package us.gov.dod.standard.ssrf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility class to wrap the Unix <code>xmllint</code> command in a Java process
 * and make that program accessible for XML document testing and schema
 * validation.
 * <p>
 * <em>From http://xmlsoft.org/xmldtd.html#validate</em>
 * <p>
 * DTD is the acronym for Document Type Definition. This is a description of the
 * content for a family of XML files. This is part of the XML 1.0 specification,
 * and allows one to describe and verify that a given document instance conforms
 * to the set of rules detailing its structure and content.
 * <p>
 * Validation is the process of checking a document against a DTD (more
 * generally against a set of construction rules).
 * <p>
 * The validation process and building DTDs are the two most difficult parts of
 * the XML life cycle. Briefly a DTD defines all the possible elements to be
 * found within your document, what is the formal shape of your document tree
 * (by defining the allowed content of an element; either text, a regular
 * expression for the allowed list of children, or mixed content i.e. both text
 * and children). The DTD also defines the valid attributes for all elements and
 * the types of those attributes.
 * <p>
 * The simplest way is to use the xmllint program included with libxml. The
 * --valid option turns-on validation of the files given as input. For example
 * the following validates a copy of the first revision of the XML 1.0
 * specification:
 * <code>xmllint --valid --noout test/valid/REC-xml-19980210.xml</code>
 * <p>
 * @author jesse
 * @since 3.1.0 03/31/15
 * @see <a href="http://xmlsoft.org/xmldtd.html">Validation</a>
 */
public class XmlLint {

  private static final Logger logger = Logger.getLogger(XmlLint.class.getName());

  /**
   * xmllint return codes provide information that can be used when calling it
   * from scripts. The return code number corresponds to the array index entry.
   * e.g. Return code zero (0) corresponds to array entry 0 = No error".
   */
  private static final String[] EXIT = new String[]{"No error",
                                                    "Unclassified",
                                                    "Error in DTD",
                                                    "Validation error",
                                                    "Validation error",
                                                    "Error in schema compilation",
                                                    "Error writing output",
                                                    "Error in pattern (generated when --pattern option is used)",
                                                    "Error in Reader registration (generated when --chkregister option is used)",
                                                    "Out of memory error"};

  /**
   * xmllint - command line XML tool
   * <p>
   * The xmllint program parses one or more XML files, specified on the command
   * line as XML-FILE (or the standard input if the filename provided is - ). It
   * prints various types of output, depending upon the options selected. It is
   * useful for detecting errors both in XML code and in the XML parser itself.
   * <p>
   * xmllint return codes provide information that can be used when calling it
   * from scripts.
   * <ul>
   * <li> 0 No error</li>
   * <li> 1 Unclassified</li>
   * <li> 2 Error in DTD</li>
   * <li> 3 Validation error</li>
   * <li> 4 Validation error</li>
   * <li> 5 Error in schema compilation</li>
   * <li> 6 Error writing output</li>
   * <li> 7 Error in pattern (generated when --pattern option is used)</li>
   * <li> 8 Error in Reader registration (generated when --chkregister option is
   * used)</li>
   * <li> 9 Out of memory error</li>
   * </ul>
   * <p>
   * @see <a href="http://www.xmlsoft.org/">libxml</a>
   * @author Jesse Caulfield <jesse@caulfield.org>
   * @since 03/31/15
   */
  private static final String XMLLINT = "/usr/bin/xmllint";

  /**
   * Parse and validate an XML data file instance against a corresponding XSD
   * schema file.
   * <p>
   * @param xml    the XML data as an in-memory String
   * @param schema the XSD schema file
   * @throws IOException          if the Unix XMLLINT process fails to
   *                              initialize
   * @throws InterruptedException if the Unix XMLLINT process is interrupted
   * @throws Exception            if the XML data file does not validate against
   *                              the schema
   */
  public static Set<String> validate(String xml, Path schema) throws IOException, InterruptedException, Exception {
    Path tempFile = Files.createTempFile(null, ".xml");
    tempFile.toFile().deleteOnExit();
    Files.write(tempFile, xml.getBytes());
    return XmlLint.validate(tempFile, schema);
  }

  /**
   * Parse and validate an XML data file instance against a corresponding XSD
   * schema file.
   * <p>
   * @param xml    the XML data file
   * @param schema the XSD schema file
   * @throws IOException          if the Unix XMLLINT process fails to
   *                              initialize
   * @throws InterruptedException if the Unix XMLLINT process is interrupted
   * @throws Exception            if the XML data file does not validate against
   *                              the schema
   */
  public static Set<String> validate(Path xml, Path schema) throws IOException, InterruptedException, Exception {

    /**
     * Build the command as a string then run the command in a UNIX Shell. This
     * simplifies setting the various command parameters. Also note that on
     * UNIX-like systems the shell only executes programs residing in the
     * current directory if given an unambiguous path to it.
     */
    StringBuilder xmllint = new StringBuilder(XMLLINT)
            .append(" --noout ") // Suppress output. By default, xmllint outputs the result tree.
            .append(" --schema ").append(schema) // Use a W3C XML Schema file named SCHEMA for validation.
            .append(" ").append(xml);
    /**
     * Initialize the ProcessBuilder.
     */
    ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh", "-c", xmllint.toString());
    logger.log(Level.FINE, "xmllint: {0} ", xmllint.toString());
    /**
     * Sets the source and destination for subprocess standard I/O to be the
     * same as those of the current Java process. This is a convenience method.
     * An invocation of the form pb.inheritIO() behaves in exactly the same way
     * as the invocation pb.redirectInput(Redirect.INHERIT)
     * .redirectOutput(Redirect.INHERIT) .redirectError(Redirect.INHERIT)
     * <p>
     * This gives behavior equivalent to most operating system command
     * interpreters, or the standard C library function system()
     */
//    processBuilder.inheritIO();
    /**
     * Set the working directory. This is used to load supplementary XSD files
     * are locally referenced (e.g. on the same file system) by the schema.
     */
    processBuilder.directory(schema.getParent().toFile());
    logger.log(Level.FINE, "xmllint: working directory {0} ", schema.getParent());
    /**
     * Tells whether this process builder merges standard error and standard
     * output.
     * <p>
     * If this property is true, then any error output generated by subprocesses
     * subsequently started by this object's ProcessBuilder.start() method will
     * be merged with the standard output, so that both can be read using the
     * Process.getInputStream() method. This makes it easier to correlate error
     * messages with the corresponding output.
     */
    processBuilder.redirectErrorStream(true); // important
    /**
     * Sets this process builder standard output destination. If the destination
     * is Redirect.PIPE (the initial value), then the standard output of a
     * subprocess can be read using the input stream returned by
     * Process.getInputStream().
     */
//    processBuilder.redirectOutput(ProcessBuilder.Redirect.PIPE);
//    processBuilder.redirectError(ProcessBuilder.Redirect.PIPE);
//    processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
//    processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
    /**
     * Start the process.
     */
    Process process = processBuilder.start();
    /**
     * Log the process output with duration. Since the program is configured to
     * run silently only an error would be reported.
     */
    Set<String> messages = new TreeSet<>();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
      String line;
      while ((line = reader.readLine()) != null) {
        logger.log(Level.FINE, "xmllint {0}", line);
        /**
         * Only log xmllint error details. Remove the transient tempfile from
         * the logger output..
         */
        if (line.matches("\\s*/tmp/\\w+.xml:\\d+:.*")) {
          messages.add("    xmllint " + line.replaceAll("\\s*/tmp/\\w+.xml:\\d+:", ""));
        }
      }
    }
    /**
     * Error if the process did not return zero.
     * <p>
     * waitfor() causes the current thread to wait, if necessary, until the
     * process represented by this Process object has terminated. This method
     * returns immediately if the subprocess has already terminated. If the
     * subprocess has not yet terminated, the calling thread will be blocked
     * until the subprocess exits.
     */
    int exitCode = process.waitFor();
    /**
     * If the XML LINT process exited cleanly then log the success. Always
     * return a (non-null) message set.
     */
    if (exitCode == 0) {
      logger.log(Level.FINE, "xmllint validates OK");
    } else {
      messages.add("xmllint: " + EXIT[exitCode]);
    }
    return messages;
  }

}
