OpenSSRF Reference Implementation V0.2
======================================

OpenSSRF is an open source reference implementation of the Standard Spectrum Resource Format (SSRF). The specification is defined in MCEB Pub 8 Version 3.0 as of 2012-04-26. 

The goal of this project is to develop and publish a complete and certifiably compliant reference implementation of the Standard Spectrum Resource Format (version 3.x) into Java.

See the [tutorial]{tutorial.md} for a brief how-to.

In this Release
---------------
The software contained in this release is a completely redeveloped and rewritten implementation of the SSRF data format specification. Special attention and effort has been invested to organize the software, to improve the approachability of the underlying SSRF logical data model, and to add methods and techniques to simplify the construction of SSRF data structures.

A few key features in this release:

 * Data type validation: A comprehensive data type validation strategy has been incorporated into the software to implement and enforce the SSRF data format and validation rules.
 * Pick lists: Support for pick lists has been updated to match both the schema and text of the specification.
 * Software packaging: The SSRF library contains 417 different data types, each mapping to a discreet implementation class. These have been reorganized into 15 logical software packages according to logical hierarchy, function and class-type association.
 * Software abstraction and simplification: Metadata and other common elements and data attributes have been consolidated into several abstract classes and types.
 * Developer utilities: Methods supporting the fliend programming interface have been introduced throughout the new software library.

Not in this Release (TODO List)
-------------------------------
This release still leaves many important SSRF implementation requirements unaddressed and it is expected that not all requirements have yet been identified.

 * Content validation: Required attributes and elements are not yet validated.
 * Patterned fields: Several SSRF data types include formatted string patterned fields. These fields should be programmatically generated an not rely upon user input.
 * Indexed cross-referencing: SSRF supports cross referencing of another data element within the same SSRF message by that element’s index number.
 * External references: SSRF supports the incorporation of external references by file or URI.
 * Metadata configuration: Metadata fields in this SSRF release must be manually configured for each data type.

SSRF Background
---------------

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

Background of this Project
--------------------------

In 2013 Key Bridge approached officials at the DoD to use SSRF on a license-free, commercial basis and,
upon receiving positive response, collaborated with the Wireless Innovation Forum to initiate 
a joint Government-Industry work group to develop and publish an open source, license-free reference 
implementation of the most recent SSRF specification. 

This project is managed by the Open Standard Spectrum Resource Format (SSRF) group and organized
by the Wireless Innovation Forum's [Spectrum Innovation Committee](http://groups.winnforum.org/spectrum_innovation_committee).

Availability and Use
--------------------

The source code and documentation within this project are available under the MIT license, copies of which are
included in the source tree and documentation directories.

You are free to download, use and modify this project without restriction, subject to the terms of the MIT license.

Give Back
---------

Your code and contributions are welcome. There are two ways you can give back and help improve and perfect this reference implementation.

 1. Join the Wireless Innovation Forum. By joining the Forum you gain formal and informal access to a large community of like-minded companies, government agencies and individuals working together for a common goal. Forum members may also participate in the architecture committee of this software project and also influence future development and improvement of the SSRF specification.
 2. Contribute software. Anyone can fork the code and submit your updates, fixes, utilities and other contributions directly to Key Bridge. We will review and incorporate anything that is helpful.

References
----------

 * [Key Bridge Global LLC](https://keybridgeglobal.com)
 * [Standard Spectrum Resource Format (SSRF) -- MCEB Pub 8](https://acc.dau.mil/CommunityBrowser.aspx?id=283273&lang=en-US)
 * [Wireless Innovation Forum](http://www.wirelessinnovation.org)



