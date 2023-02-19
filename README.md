# Application Framework for HDF (Healthcare Data Foundation)
Application Framework for HDF is intended to enable a consistent way for data driven assets that 
can be used for a variety of needs with the HDF (Healthcare Data Foundation) event driven architecture. This repository has several vastly different and unique technologies that are all used
for one purpose, to provide innovative ways to process and leverage data.

Always remember our cloud first approach to everything we do: <br/>

![iDaaS Data Flow - Detailed.png](https://github.com/Project-Herophilus/Project-Herophilus-Assets/blob/main/images/iDaaS-Platform/Implementations-Gen-CloudAgnostic.png)
<br/>


# Specifically Developed Accelerators
We have a variety of assets that have been contributed with several different technologies.

## Camel Based Accelerators
Specific accelerators that are created using Camel.

| Accelerator                                                                                                                 | Details                                                                                                                                           |
|:----------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------| 
| [Camel DataTier](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Camel-DataTier)                   | Camel Based application that enables data tier processing for several common enterprise data platforms such as DataBricks, MongoDB and SnowFlake. |
| [Camel DMN Routing](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Camel-DMN-DataRouting) | Camel based application that uses DMN based rules to dynamically route data.                                                                      |
| [Camel-PublicCloud](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Camel-PublicCloud)     | Camel based assets that work with supporting data to all the common Camel public cloud connectors.                                                |
| [CamelK-Cerner](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/CamelK-Cerner)              | Camel based specific Assets that work with Cerner EHR platform and their APIs.                                                                    |

## Java Based Accelerators
Specific accelerators that are created using Java.

| Accelerator                              | Details |
|:-----------------------------------------|:----------------------------| 
|[Java OMOP Persistence](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Java-OMOP-DataPersistence)|A set of Java developed assets that process healthcare data into the OMOP Industry Std.|

## Node Based Accelerators
Specific accelerators that are created using Node.

| Accelerator                                                                                                                                           | Details                                                                                                            |
|:------------------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------| 
| [Node-FHIRBundleToResource-DataRouter](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Node-FHIRBundleToResource-DataRouter) | Node based application that enables routing FHIR resource bundles to FHIR servers specific FHIR resource endpoints |
| [Node-Intelligent-DataRouter](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Node-Intelligent-DataRouter)                   | Node based routing application. It can dynamically route data based on several common attributes.                  |
| [Node-Notifier](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Node-Notifier)                                               | Node based notification enabled platform for communicating via SMS, Email, Slack and other communication methods.  |
| [Node-PublicCloud](https://github.com/Project-Herophilus/ApplicationFramework-HDF/tree/main/Node-PublicCloud)                                         | Node based asset to work with all the public cloud vendors existing APIs to leverage their PaaS and SaaS services. |
