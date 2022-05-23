package com.ibm.panache;
import com.ibm.pojo.EncounterResource.Encounter;

import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class VisitStorage {

    @Incoming("fhirsvr_encounter")
    @Blocking
    @Transactional
    public void store(Encounter encounter) {
       VisitInfo visitInfo =new VisitInfo();
        System.out.println(encounter.getResourceType());
        System.out.println(encounter);

        visitInfo.id=encounter.getId();
        //visitInfo.care_site_id = encounter.getEncounterLocation().getLocation().getReference();
        visitInfo.admitted_from_concept_id = encounter.getHospitalization().getAdmitSource().toString();
        //visitInfo.discharge_to_concept_id = encounter.getEncounterLocation().getLocation().toString();
        visitInfo.preceding_visit_occurrence_id = encounter.getPartOf().toString();
        visitInfo.person_id = encounter.getSubject().toString();
        visitInfo.visit_concept_id = encounter.getType().toString();
        visitInfo.visit_start_date = encounter.getPeriod().getStart();
        visitInfo.visit_start_datetime = encounter.getPeriod().getStart();
        visitInfo.visit_end_date = encounter.getPeriod().getEnd();
        visitInfo.visit_end_datetime = encounter.getPeriod().getEnd();
        visitInfo.visit_type_concept_id = encounter.getType().toString();


        VisitInfo visitId = VisitInfo.findVisit(encounter.getId());
        if(visitId !=null){
            System.out.println("Existing record");
            VisitInfo.update("admitted_from_concept_id=?1,preceding_visit_occurrence_id=?2,person_id=?3,visit_concept_id=?4,visit_start_date=?5,visit_start_datetime=?6,visit_end_date=?7,visit_end_datetime=?8,visit_type_concept_id=?9, where id=?10",
                    encounter.getHospitalization().getAdmitSource().toString(),encounter.getPartOf().toString(),
                    encounter.getSubject().toString(),encounter.getType().toString(),encounter.getPeriod().getStart(),encounter.getPeriod().getStart(),
                    encounter.getPeriod().getEnd(),encounter.getPeriod().getEnd(),encounter.getType().toString(),encounter.getId());
        } else{
            System.out.println("New Record");
            visitInfo.persist();

       }

    }

}
