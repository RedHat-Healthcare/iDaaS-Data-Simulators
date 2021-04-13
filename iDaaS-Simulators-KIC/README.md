# Demo-iDAAS-KIC
Demonstration for iDAAS KIC.

This solution contains three supporting directories. The intent of these artifacts to enable
resources to work locally: <br/>
1. platform-scripts: support running amq, amq-streams (kafka) and doing very specific things with 
Kafka such as: creating/listing and deleting topics needed for this solution
and also building and packaging the solution as well. All the scripts are named to describe their capabilities <br/>
2. platform-testdata: sample transactions to leverage for using the platform. 

## Scenario: Integration 
This is a simulator that reads from a directory and send ALL files to the operations queue defined for iDaaS KIC.

### Integration Data Flow Steps
 
1. Any external connecting system will use an HL7 client (external to this application) will connect to the specifically defined HL7
Server socket (one socket per datatype) and typically stay connected.
2. The HL7 client will send a single HL7 based transaction to the HL7 server.
3. iDAAS Connect HL7 will do the following actions:<br/>
    a. Receive the HL7 message. Internally, it will audit the data it received to 
    a specifically defined topic.<br/>
    b. The HL7 message will then be processed to a specifically defined topic for this implementation. There is a 
    specific topic pattern -  for the facility and application each data type has a specific topic define for it.
    For example: MCTN_MMS_ADT, MCTN_MMS_ORM, etc. <br/>
    c. An acknowledgement will then be sent back to the hl7 client (this tells the client he can send the next message,
    if the client does not get this in a timely manner it will resend the same message again until he receives an ACK).<br/>
    d. The acknowledgement is also sent to the auditing topic location.<br/>
    
## Builds
This section will cover both local and automated builds.

### Local Builds
Within the code base you can find the local build commands in the /platform-scripts directory
1.  Run the build-solution.sh script
It will run the maven commands to build and then package up the solution. The package will use the usual settings
in the pom.xml file. It pulls the version and concatenates the version to the output jar it builds.
Additionally, there is a copy statement to remove any specific version, so it outputs idaas-connect-hl7.jar

### Automated Builds
Automated Builds are going to be done in Azure Pipelines

## Running
In order to run multiple iDaaS integration applications we had to ensure the internal http ports that
the application uses. In order to do this we set the server.port property.

```properties
server.port=9980
```

Once built you can run the solution by executing `./platform-scripts/start-solution.sh`. 
The script will startup Kafka and iDAAS server.

Alternatively, if you have a running instance of Kafka, you can start a solution with:
`./platform-scripts/start-solution-with-kafka-brokers.sh --idaas.kafkaBrokers=host1:port1,host2:port2`.
The script will startup iDAAS server.

It is possible to overwrite configuration by:
1. Providing parameters via command line e.g.
`./start-solution.sh --idaas.kicADTDirectory=\data\mylocation`
2. Creating an application.properties next to the idaas-kic.jar in the target directory
3. Creating a properties file in a custom location `./start-solution.sh --spring.config.location=file:./config/application.properties`

Supported properties include:
```properties
idaas.kafkaBrokers=localhost:9092 #a comma separated list of kafka brokers e.g. host1:port1,host2:port2
kicADTDirectory=data/kic
idaas.vxuPort=10008
```

# Getting Involved
Here are a few ways you can get or stay involved.
 
## Ongoing Enhancements
We maintain all enhancements within the Git Hub portal under the 
<a href="https://github.com/RedHat-Healthcare/iDAAS-Connect-HL7/projects" target="_blank">projects tab</a>

## Defects/Bugs
All defects or bugs should be submitted through the Git Hub Portal under the 
<a href="https://github.com/RedHat-Healthcare/iDAAS-Connect-HL7/issues" target="_blank">issues tab</a>

## Chat and Collaboration
You can always leverage <a href="https://redhathealthcare.zulipchat.com" target="_blank">Red Hat Healthcare's ZuilpChat area</a>
and find all the specific areas for iDAAS-Connect-HL7. We look forward to any feedback!!

If you would like to contribute feel free to, contributions are always welcome!!!! 

Happy using and coding....

