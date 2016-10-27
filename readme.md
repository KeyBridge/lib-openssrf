# OpenSSRF v3.1.0 Release 1.0.0

## Reference Implementation Production Release
OpenSSRF is an open source reference implementation of the Standard Spectrum Resource 
Format (SSRF). The specification is defined in MC4EB Pub 8. 

The goal of this project is to develop and publish a complete and certifiably 
compliant reference implementation of the most recent Standard Spectrum Resource Format
(currently version 3.1.0) into Java.

See the [tutorial](tutorial.md) for a brief how-to.

This software project implements the SSRF specification Version 3.1.0 (2014-09-16 with corrections).
Previous versions released by this project include v1.2.4b and v3.0.0. 
Visit [OpenSSRF.org](http://openssrf.org) for details.

### Sponsor Opportunity
Contact [Key Bridge Global LLC](https://keybridgeglobal.com) or the [Wireless Innovation Forum](http://www.wirelessinnovation.org) to join or to sponsor this project.

## In this Release
In April 2015 The software contained in this release (Rel. 1.0.0) passed all certification tests and is officially recognized by the Defense Information Systems Agency (DISA) as a complete and compliant implementation of the SSRF v3.1.0 data format specification. 

### Testing Software
The utilities developed to automate certification testing and evaluation of this software library are available for download at [lib-openssrf-test](https://github.com/KeyBridge/lib-openssrf-test).

### OpenSSRF Features
Special attention and effort has been invested in the development of OpenSSRF to organize the software, to improve the approachability of the underlying SSRF logical data model, and to add methods and techniques to simplify the construction of SSRF data structures.

 * Data type validation: A comprehensive data type validation strategy has been incorporated into the software to implement and enforce the SSRF data format and validation rules.
 * Pick lists: Support for pick lists has been updated to match both the schema and text of the specification.
 * Software packaging: SSRF data types are organized naturally according to their use and parent-child relationship with other data types.
 * Software abstraction and simplification: Metadata and other common elements and data attributes have been consolidated into several abstract classes and types.
 * Developer utilities: Methods supporting the fluent programming interface have been introduced throughout the new software library.
 * A sophisticated set of utilities for automated XML reading, writing, assembly and validation
 * Content validation: Required attributes and elements are validated.
 * Patterned fields: Formatted string patterned fields are programmatically generated. Direct user input is not required. 
 * Indexed cross-referencing: SSRF cross referencing between data element is fully automatic.
 * Metadata configuration: Metadata fields are automatically configured using a powerful SSRF properties configuration utility.
 * Improved field type and pattern validation.
 * Automated assembly, construction, writing and reading of the Message type is complete.
 * Correct handling of abstract frequency data types

### Not in this Release (TODO or Not TODO)
The following issues are left to the application developer:
 * Date and DateTime components: Hour, Minute, Second, Days of Week/Month and Year data types are represented by complex String patterns that are cumbersome and difficult to parse or process automatically. See, for example, the _Hours_ type used in Assignment, FEDeployment, JRFL and JRFLEntry. Date and DateTime fields are parsed automatically into Java Calendar objects but Date and DateTime component fields are left as Strings. 
 * Product-specific identifications: A few fields buried deep within the frequency Assignment record are represented by String patterns that appear to require product or network-specific automated parsing and processing
 * Emission classification: Some RF emission classification patterns do not appear to match industry standards and require custom parsing and processing
 * External references: The software does not contain hooks to automate external references by file or URI
 
## SSRF Background
SSRF is based on the NATO Spectrum Management Allied Data Exchange Format-eXtensible Markup Language
(SMADEF-XML) data standard. NTIA’s Office of Spectrum Management Data Dictionary (OSMDD) is expected to
also be compatible with SSRF and SMADEF-XML. 

Standard Spectrum Resource Format (SSRF)-compliant systems are able to exchange spectrum data with the
National Telecommunications and Information Administration (NTIA), the North Atlantic Treaty Organization
(NATO), and with Combined Communications-Electronics Board (CCEB) nations.

Standard Spectrum Resource Format (SSRF) was originally a format for exchanging data related to spectrum
management within the United States Department of Defense (DOD). Within this context, SSRF-compliant 
systems are able to exchange electromagnetic spectrum data with the National Telecommunications and Information
Administration (NTIA), the North Atlantic Treaty Organization (NATO), and with Combined
Communications-Electronics Board (CCEB) nations.

## Background of this Project
This project is managed by the Open Standard Spectrum Resource Format (SSRF) group and organized
within the Wireless Innovation Forum's [Spectrum Innovation Committee](http://groups.winnforum.org/spectrum_innovation_committee).

## Availability and Use
The source code and documentation within this project are available under the Apache 2.0 license, copies of which are included in the source tree and documentation directories.

You are free to download, use and modify this project without restriction, subject to the terms of the Apache 2.0 license.

## Give Back
Your code and contributions are welcome. There are two ways you can give back and help improve and perfect this reference implementation.

 1. Join the Wireless Innovation Forum. By joining the Forum you gain formal and informal access to a large community of like-minded companies, government agencies and individuals working together for a common goal. Forum members may also participate in the architecture committee of this software project and also influence future development and improvement of the SSRF specification.
 2. Contribute software. Anyone can fork the code and submit your updates, fixes, utilities and other contributions directly to Key Bridge. We will review and incorporate anything that is helpful.

## References
 * [OpenSSRF.org](http://openssrf.org)
 * [Key Bridge LLC](https://keybridgeglobal.com)
 * [Standard Spectrum Resource Format (SSRF) -- MCEB Pub 8](https://acc.dau.mil/CommunityBrowser.aspx?id=283273&lang=en-US)
 * [Wireless Innovation Forum](http://www.wirelessinnovation.org)



