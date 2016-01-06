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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.SchemaRoot;

/**
 * SMADEF-XML. This is the ROOT element for any SMADEF-XML message. It contains
 * all SMADEF-XML attributes and content.
 * <p>
 * A SMADEF-XML message may contain any number of datasets.
 *
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/29/2014
 * @deprecated Since 3.1.0rc1 SMADEF is not not implemented. Contact Key Bridge
 * to request this data type and associated utilities are added to the
 * development road map.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMADEF")
@Deprecated
public class SMADEF extends SchemaRoot<SMADEF> {

}
