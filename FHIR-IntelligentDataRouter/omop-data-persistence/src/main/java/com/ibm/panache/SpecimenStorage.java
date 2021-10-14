package com.ibm.panache;

import com.ibm.pojo.SpecimenResource.Identifier;
import com.ibm.pojo.SpecimenResource.Specimen;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class SpecimenStorage {

    @Incoming("fhirsvr_specimen")
    @Blocking
    @Transactional
    public void store(Specimen specimen) {
        SpecimenTest specimenTest = new SpecimenTest();
        String id = "";
        id = specimen.id;
        try {
            specimenTest.id = id;
            specimenTest.disease_status_concept_id = specimen.getType().getCoding().toString();
            specimenTest.person_id = specimen.getSubject().toString();
            specimenTest.specimen_concept_id = specimen.getType().toString();
            specimenTest.specimen_type_concept_id = specimen.getType().coding.toString();
            specimenTest.specimen_date = specimen.getCollection().getCollectedDateTime();
            specimenTest.specimen_dateTime = specimen.getCollection().getCollectedDateTime().toString();
            specimenTest.quantity = specimen.getCollection().getQuantity().toString();
            specimenTest.unit_concept_id = specimen.getCollection().getQuantity().toString();
            specimenTest.anatomic_site_concept_id = specimen.getCollection().getBodySite().toString();
        }catch (NullPointerException e){
            specimenTest.id = null;
            specimenTest.disease_status_concept_id = null;
            specimenTest.person_id = null;
            specimenTest.specimen_concept_id = null;
            specimenTest.specimen_type_concept_id = null;
            specimenTest.specimen_date = null;
            specimenTest.specimen_dateTime = null;
            specimenTest.quantity = null;
            specimenTest.unit_concept_id = null;
            specimenTest.anatomic_site_concept_id = null;
        }

        SpecimenTest specimenId = SpecimenTest.findSpecimen(specimen.getId());
        if(specimenId !=null){
            System.out.println("Existing record");
            SpecimenTest.update("disease_status_concept_id=?1,person_id=?2,specimen_concept_id=?3,specimen_type_concept_id=?4, specimen_date=?5,specimen_dateTime=?6,quantity,unit_concept_id=?7,anatomic_site_concept_id=?8 where id=?9",
                    specimen.getType().getCoding().toString(),specimen.getSubject(),specimen.getType().toString(),
                    specimen.getType().coding.toString(),specimen.getCollection().getCollectedDateTime(),
                    specimen.getCollection().getCollectedDateTime().toString(),specimen.getCollection().getQuantity().toString(),
                    specimen.getCollection().getQuantity().toString(),specimen.getCollection().getBodySite().toString(),id);
        } else{
            System.out.println("New Record");
            specimenTest.persist();

        }
    }
}
