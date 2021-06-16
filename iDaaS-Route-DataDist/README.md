# iDAAS Route DataDistribution
iDAAS Route data distribution is part of the iDAAS Connect family within iDAAS. iDAAS Connect is the family of capabilities that specifically address data .
connectivity and data distribution of information. 

Before data can be distributed it MUST enter into the iDAAS platform from one one of the iDAAS Connect family that help 
organizations connect to data: HL7 (iDAAS-Connect-HL7), FHIR (iDAAS-Connect-FHIR), Third Party/Other (iDAAS-Connect-ThirdParty).

Why not implement this directly within the iDAAS Connect components that connect to data? You most certainly could; however, we 
wanted to ensure with this accelerator platform we include a very specific capability to enable the separation of inbound data and 
any routing activities. Our reason is to ensure that anything processing inbound data to a platform be able to focus on that
key need and not risk potential downtime for other related tasks.
  
## Relevant Implementation Design

As with all iDAAS ever component has a specific relevant design implementation. 

## Pre-Requisites
For all iDaaS design patterns it should be assumed that you will either install as part of this effort, or have the following:

1. An existing Kafka (or some flavor of it) up and running. Please see the following files we have included to try and help: <br/>
[Kafka](https://github.com/RedHat-Healthcare/iDaaS-Demos/blob/master/Kafka.md)<br/>
[KafkaWindows](https://github.com/RedHat-Healthcare/iDaaS-Demos/blob/master/KafkaWindows.md)<br/>
No matter the platform chosen it is important to know that the Kafka out of the box implementation might require some changes depending upon your implementation needs. Here are a few we have made to ensure: <br/>
In /config/consumer.properties file we will be enhancing the property of auto.offset.reset to earliest. This is intended to enable any new system entering the group to read ALL the messages from the start. <br/>
auto.offset.reset=earliest <br/>
2. Some understanding of building, deploying Java artifacts and the commands associated. If using Maven commands then Maven would need to be intalled and runing for the environment you are using. More details about Maven can be found [here](https://maven.apache.org/install.html)<br/>
3. An internet connection with active internet connectivity, this is to ensure that if any Maven commands are
run and any libraries need to be pulled down they can.<br/>

We also leverage [Kafka Tools](https://kafkatool.com/) to help us show Kafka details and transactions; however, you can leverage
code or various other Kafka technologies ot view the topics.

## Scenario: Integration
This repository follows a very common general facility based implementation. The implementation
is of a facility, we have named MCTN for an application we have named MMS. This implementation
specifically defines one FHIR endpoint per FHIR resource.

### Integration Data Flow Steps

1. This respository acts as a demonstration of how to seperate concerns and have a specific component route the inbound data to many different topics for multiple potential usages

# Start The Engine!!!

This section covers the running of the solution. There are several options to start the Engine Up!!!

## Step 1: Kafka Server To Connect To
In order for ANY processing to occur you must have a Kafka server running that this accelerator is configured to connect to.
Please see the following files we have included to try and help: <br/>
[Kafka](https://github.com/RedHat-Healthcare/iDaaS-Demos/blob/master/Kafka.md)<br/>
[KafkaWindows](https://github.com/RedHat-Healthcare/iDaaS-Demos/blob/master/KafkaWindows.md)<br/>

## Step 2: Running the App: Maven or Code Editor
This section covers how to get the application started.

### Design Pattern/Accelerator Configuration
All iDaaS Design Pattern/Accelelrators have application.properties files to enable some level of reusability of code and simplfying configurational enhancements.<br/>
In order to run multiple iDaaS integration applications we had to ensure the internal http ports that
the application uses. In order to do this we MUST set the server.port property otherwise it defaults to port 8080 and ANY additional
components will fail to start. iDaaS Connect HL7 uses 9980. You can change this, but you will have to ensure other applications are not
using the port you specify.

Alternatively, if you have a running instance of Kafka, you can start a solution with:
`./platform-scripts/start-solution-with-kafka-brokers.sh --idaas.kafkaBrokers=host1:port1,host2:port2`.
The script will startup iDAAS server.

It is possible to overwrite configuration by:
1. Providing parameters via command line e.g.
2. Leverage the respective application.properties file in the correct location to ensure the properties are properly set
To use with a custom location `./start-solution.sh --spring.config.location=file:./config/application.properties`. However,
if you run from a Java IDE or from any command line that just invokes the jar it will automatically pull the application.properties
file in the resources directory closest to the jar file.

As you look at the properties the idaas.fhirVendor on startup determines the FHIR Server that would be
leveraged:
Supported properties include:
```
idaas.kafkaBrokers=localhost:9092
```