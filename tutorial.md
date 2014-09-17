# Super Short Tutorial

SSRF has a rather narrow field of interest and a steep learning curve. We've tried to simplify this as much as possible, but there really is no way to escape using SSRF without having the document open for reference. To help get you started, here is our best attempt at a super short tutorial:

## SSRF Business Processes

SSRF supports numerous business processes, but these can be considered in five general categories.

 1. Query and Provide Reference Data
 2. Define Transmitters, Receivers and Antennas
 3. Spectrum Supportability Process
 4. Request & Provide Frequency Allotments & Assignments
 5. Report Interference

### Reference Data

SSRF includes a large set of pre-defined reference data and supports the query and distribution of other basic spectrum-related reference information. Two usefule examples are:

 * Codes: SSRF includes a large set of enumerated codes and data types. These codes, typically implemented as text strings, are used to populate data fields in other SSRF objects.
 * TOA: The SSRF `TOA` data object supports the conveyance of international Table of Allocation and channel plan information. For more information about TOAs see [Frequency Allocation](http://en.wikipedia.org/wiki/Frequency_allocation) at Wikipedia.

### Define Transmitters, Receivers and Antennas

SSRF supports the detailed description of TX and RX operating parameters and configurations. This type of information is needed and supports allocating spectrum use, certifying equipment, preparing allotments, engineering frequency assignments, and resolving frequency interference.

### Spectrum Supportability Process

SSRF includes data structures to support formal, automated collaboration and communication between disparate organizations for the research, request and conveyance of spectrum availability information. Note that availability does not mean authorization for use: that would be an allotment of assignment. Spectrum supportability consists of three business processes:

 1. Information pull: Research existing information to identify spectrum resources
 2. SSRequest: formal submission for supportability.
 3. SSReply: response with supportability information

### Request/Provide Frequency Allotments /Assignments

Once the total frequency requirement for a force is known, it should be submitted as a consolidated allotment request or as a series of assignment requests to the relevant spectrum management authority.

 * Allotment: Frequency allotments may be used within a nation or a command to decentralize the frequency management.
 * Assignment: Frequency resource authorized for use by a given SDS at a specified location or within an AOR.

### Report Interference

SSRF supports the formal reporting on a source and victim of an interference incident.

## Hello World

All access to the SSRF data model begins with the `SSRF` object, which is the XML root and single point of entry to the data model.

All objects in the OpenSSRF library are conventional [JavaBeans](http://en.wikipedia.org/wiki/JavaBeans) and may be programmed as such. In addition, a [fluent interface](http://en.wikipedia.org/wiki/Fluent_interface) has been incorporated throughout to assist developers build more readable and approachable code.

SSRF is an extremely flexible format, and the `SSRF` object is basically an empty container for whatever information you wish to put into it to accomplish your desired business objective. Below is an example constructor that builds an `SSRF` object, then adds a (partial) Contact and (partial) Assignment. Note that the same data structure can be constructed using conventional Javabean setters.

    SSRF ssrf = new SSRF()
      .withContact(new Contact()
        .withEMail(new EMail()
          .withAddress("john.doe@internet.com"))
        .withLastName("Doe")
        .withFirstName("John")
        .withTelephoneFax(new TelephoneFax()
          .withNumber("(123)456.7890")))
      .withAssignment(new Assignment()
        .withCaseNum(new CaseNum()
          .withType("callsign")
          .withIdentifier("CFDB-TV")
          .withCountry(ListCAO.CAN)));

__end

