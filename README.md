# iDaaS-Route
iDaaS-Route and Data Distribution is intended to be used for teams that want to be able to build and/or leverage 
assets of various types for an even driven architecture. 

The intent of this specific reference architecture is to be able publish and/or subscribe to events and process them for
various healthcare centric business needs.

# Routers
The following is our attempt to help provide some context to the specific Routers contained within this reference 
architecture.

|<b> Name | Programming Language | Business Purpose/Usage/Need |
| :---        | :----   | :--- |
|DMN-IntelligentDataRouter | Camel/Fuse with Drools/Decision Mgmt and Java| Intended to be a demonsration of how to leverage business rules real time to look and data and route it| 
|iDaaS-Component-Router | Express| Handles publishing and subscribing to FHIR bundles and deserializing them into their appropriate end points for iDaaS-Connect| 
|iDaaS-Route-DataDist | Camel/Fuse with Java| Intended to be a demonsration of how to take an event and process it to several different topics| 
|Quarkus-DMN-IntelligentDataRouter | Camel/Fuse with Drools/Decision Mgmt and Quarkus| Intended to be a demonsration of how to leverage business rules real time to look and data and route it| 
