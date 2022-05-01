package com.ibm.panache;

import com.ibm.pojo.ProcedureResource.Procedure;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.Date;

@ApplicationScoped
public class ProcedureStorage {
    @Incoming("fhirsvr_procedure")
    @Blocking
    @Transactional
    public void store(Procedure procedure) {
        Procedureinfo procedureTest = new Procedureinfo();
        System.out.println(procedure.getResourceType());
        String id = "";

        try {
            id = procedure.getId();
            procedureTest.id = id;
            procedureTest.visit_occurrence_id = procedure.getEncounter().toString();
            procedureTest.person_id = procedure.getSubject().toString();
            procedureTest.procedure_source_concept_id = procedure.getCode().toString();
            procedureTest.procedure_date = procedure.getPerformedDateTime();
            procedureTest.procedure_datetime = procedure.getPerformedDateTime();
            procedureTest.procedure_type_concept_id = procedure.getCode().getCoding().toString();
            procedureTest.quantity = procedure.getCode().getCoding().toString();
            procedureTest.provider_id = procedure.getPerformer().getActor().toString();
        }catch (NullPointerException e){
            id = procedure.getId();
            procedureTest.id = null;
            procedureTest.visit_occurrence_id = null;
            procedureTest.person_id = null;
            procedureTest.procedure_source_concept_id = null;
            procedureTest.procedure_date = null;
            procedureTest.procedure_datetime = null;
            procedureTest.procedure_type_concept_id = null;
            procedureTest.quantity = null;
            procedureTest.provider_id = null;
        }

        Procedureinfo procedureId = Procedureinfo.findProcedure(procedure.getId());
        if(procedureId !=null){
            System.out.println("Existing record");
            SpecimenTest.update("visit_occurrence_id=?1,person_id=?2,procedure_source_concept_id=?3,procedure_date=?4, procedure_datetime=?5,procedure_type_concept_id=?6,quantity=?7,provider_id=?8 where id=?9",
                    procedure.getEncounter().toString(),procedure.getSubject().toString(),
                    procedure.getCode().toString(),procedure.getPerformedDateTime(),procedure.getPerformedDateTime(),
                    procedure.getCode().getCoding().toString(),procedure.getCode().getCoding().toString(),
                    procedure.getPerformer().getActor().toString(),id);

        } else{
            System.out.println("New Record");
            procedureTest.persist();

        }
    }
}
