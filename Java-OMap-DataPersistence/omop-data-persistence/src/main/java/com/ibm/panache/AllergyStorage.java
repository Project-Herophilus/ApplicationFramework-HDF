package com.ibm.panache;

import com.ibm.pojo.AllergyIntoleranceResource.AllergyIntolerence;
import com.ibm.pojo.AllergyIntoleranceResource.Coding;
import com.ibm.pojo.PatientResource.MaritalStatus;
import io.smallrye.reactive.messaging.annotations.Blocking;
import com.ibm.pojo.AllergyIntoleranceResource.Note;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;


import java.util.List;

@ApplicationScoped
public class AllergyStorage {

    @Incoming("fhirsvr_allergyintolerance")
    @Blocking
    @Transactional
    public void store(AllergyIntolerence allergyIntolerence) {
        //Price price = new Price();
        Allergy allergy=new Allergy();
        Allergy allergy1=new Allergy();
        //ObjectMapper mapper=new ObjectMapper();
       // try {
            //AllergyIntolerence allergy = mapper.readValue(inputjson, AllergyIntolerence.class);
            System.out.println(allergyIntolerence.getResourceType());
            String id=allergyIntolerence.getId();
           List<Coding> obj=allergyIntolerence.getCode().getCoding();
           String code=obj.get(0).getCode();
            allergy.code=code;
           allergy.id=id;

           String patRef=allergyIntolerence.getPatient().getReference();
           String patient=patRef.substring(patRef.lastIndexOf('/')+1);
           allergy.patient=patient;
        String descriptions=null;
            try{
                List<Note> noteObj=allergyIntolerence.getNote();
                descriptions=noteObj.get(0).getText();
                allergy.description=descriptions;
                System.out.println(descriptions);

            } catch(NullPointerException e) {
                descriptions="Not available in source";
                allergy.description=descriptions;

            }

        //Optional<AllergyTest> optional = AllergyTest.findByIdOptional(id);
        //allergy1=optional.orElse(allergy);

        if (Allergy.count("id",id)>0){
            System.out.println("Existing record");
            Allergy.update("code=?1,patient=?2,description=?3 where id=?4",code,patient,descriptions,id);
        } else{
            System.out.println("New Record");
            allergy.persist();

        }


    }

}
