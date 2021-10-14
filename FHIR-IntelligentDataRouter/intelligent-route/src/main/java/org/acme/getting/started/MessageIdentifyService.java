package org.acme.getting.started;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.json.JSONObject;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAttribute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Base64;


@Path("/message")
public class MessageIdentifyService {


    @ConfigProperty(name="fhir.url")
    String url;
    @ConfigProperty(name="connecthl7.url")
    String connecthl7url;

        @POST
        @Path("identify")
        public Response identifyMessage(String input) {
            String fileType="";
            try {

                    System.out.println(input);



                    if(input.contains("{") && input.contains("resourceType")){
                        System.out.println("The received file is of type FHIR");
                        JSONObject inputJsonObj = new JSONObject(input.substring(input.indexOf('{')));
                       String resourceType = (String) inputJsonObj.get("resourceType");                  
                       System.out.println("Resource type is " + resourceType);
                       if(resourceType.equalsIgnoreCase("allergyIntolerance")){
                           fileType = "FHIR: allergyintolerance";
                           String urlToSend = url+"iDaaS/allergyintolerance";
                           System.out.println(urlToSend);
                           invokeIDAAS(urlToSend,input);
                       }
                       else if(resourceType.equalsIgnoreCase("patient")){
                           fileType = "FHIR: patient";
                           String urlToSend = url+"iDaaS/patient";
                           invokeIDAAS(urlToSend,input);
                       }
                       else if (resourceType.equalsIgnoreCase("observation")){
                           fileType = "FHIR: observation";
                           String urlToSend = url+"iDaaS/observation";
                           invokeIDAAS(urlToSend,input);

                       }
                       else if (resourceType.equalsIgnoreCase("claim")){
                           fileType = "FHIR: claim";
                           String urlToSend = url+"iDaaS/claim";
                           invokeIDAAS(urlToSend,input);

                       }
                       else if (resourceType.equalsIgnoreCase("immunization")){
                        fileType = "FHIR: immunization";
                        String urlToSend = url+"iDaaS/immunization";
                        invokeIDAAS(urlToSend,input);

                        }
                       else if(resourceType.equalsIgnoreCase("bundle")){
                        fileType = "FHIR: bundle";
                        String urlToSend = url+"iDaaS/bundle";
                        invokeIDAAS(urlToSend,input);
                    }


                    }
                    else if (input.matches("(?s).*(<(\\w+)[^>]*>.*</\\2>|<(\\w+)[^>]*/>).*")){
                        fileType = "CCDA";
                        String urlToSend = connecthl7url+"iDaaS/ccda";
                        invokeIDAAS(urlToSend,input);
                    }

                    else{
                        System.out.println("Unknown file type");
                        fileType = "Unknown";
                    }
                    System.out.println("Done");

                } catch (Exception e) {
                    e.printStackTrace();
                }
              return Response.status(200)
                    .entity("IdentifyMessage is called, Received file is of type : " + fileType).build();

        }

    private void invokeIDAAS(String urlToSend, String input) {
         StringBuilder builder = new StringBuilder();
         InputStreamReader in = null;
        try {
            URL url = new URL(urlToSend);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            OutputStream os = urlConnection.getOutputStream();
            os.write(input.getBytes());
            os.flush();
            if (urlConnection != null && urlConnection.getInputStream() != null) {
                in = new InputStreamReader(urlConnection.getInputStream(),
                        Charset.defaultCharset());
                BufferedReader bufferedReader = new BufferedReader(in);

                if (bufferedReader != null) {
                    int cp;
                    while ((cp = bufferedReader.read()) != -1) {
                        builder.append((char) cp);
                    }
                    bufferedReader.close();
                }
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:" + urlToSend, e);
        }

        String message =  builder.toString();
        System.out.println(message);
    }




}

