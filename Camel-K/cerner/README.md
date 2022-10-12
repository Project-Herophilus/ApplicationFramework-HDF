# Cerner Authentication

## Docref example

This example creates a REST endpoint where data posted is proxied to Cerner after proper authentication. 

This is meant as an internal only service to help simplify internal flows from multiple sources. For production, source validation and network policies would need to be implemented to prevent invalid data from being posted.

### Required information

Access to CERNER requires a user to review several legal statements and register to gain access to sandboxes (https://code.cerner.com/apiaccess).

CERNER/FHIR implements oauth2, has multiple endpoints depending on needs and the type of purchase done.

Main Cerner Authentication documentation: https://fhir.cerner.com/authorization - and requires at least the following data points found on the account profile once registered:

* scope (see details on authorization page)
* tenant_id
* client-id (account)
* API key (secret)

To authenticate, a POST to Cerner's authroization server with the client-id:API-key base64 encoded for a Basic AUTH, with a www-form-encoded posted value of the scope, a token will be returned in JSON on successful access.

On subsequent access, an Authentication: Bearer <token> needs to be passed as a header; and the token has a limited life-time in minutes to avoid permanent reuse.

This flow is implemented in the [cerner-docref.yaml](cerner-docref.yaml) camel-k workflow. 

### Setup

After enabling camel-k in the namespace, create a secret using the format in [cerner-auth-data.csv](cerner-auth-data.csv):

`oc create secret generic cerner --from-env-file=cerner-auth-data.csv`

Ensure the values required for authentication is provided in this file. Note, for SmilesCDR and other solutions, this same process can be used, so keeping Authentication and FHIR REST end points as parameters, allows the same code to be used in different implementations.

Data fields:
* account: client-id
* secret: API key/secret - this needs to be created once the account is setup.
* tenant-id:  UUID representing your tenant
* authserver: Can be the public authentication server or any other oaut providing end point (authentication.cerner.com:443)
* fhir-server: REST endpoint for the data area you're accessing at Cerner (sandbox or real system).

### Implement

If done through a larger set of CICD/DevOps Pipeline you can generate YAML to trigger the integration and use it as part of a HELM Chart, OpenShift template or the like. However, it's extremely easy to get the integration/reset service running:

`kamel run cerner-docref.yaml --config=secret:cerner`

If you use `kamel get` you can see the integration get created and running.  To see the end-point created: `oc get ksvc'. You can then post a FHIR docref object to this service and it will get inserted into Cerner authenticated. 
