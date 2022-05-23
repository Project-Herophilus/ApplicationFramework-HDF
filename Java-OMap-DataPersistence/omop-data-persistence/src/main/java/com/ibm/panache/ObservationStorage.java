package com.ibm.panache;

import com.ibm.pojo.ObservationResource.Observation;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;


@ApplicationScoped
public class ObservationStorage {
    @Incoming("fhirsvr_observation")
    @Blocking
    @Transactional
    public void store(Observation observation) {

        ObservationTest observationTest=new ObservationTest();
        System.out.println(observation.toString());
        observationTest.id=observation.getId();
        observationTest.qualifier_concept_id = observation.code.toString();
        observationTest.unit_concept_id = observation.getValueQuantity().value;
        observationTest.provider_id = observation.getPerformer().toString();
        observationTest.visit_occurrence_id = observation.getEncounter().toString();
        observationTest.person_id = observation.getSubject().toString();
        observationTest.observation_concept_id = observation.code.toString();
        observationTest.observation_date = observation.getEffectiveDateTime();
        observationTest.observation_datetime = observation.getEffectiveDateTime();
        observationTest.observation_type_concept_id = observation.getCategory().toString();
        observationTest.value_as_number = observation.getValueQuantity().value;
        observationTest.value_as_string = observation.getValueQuantity().toString();
        observationTest.value_as_concept_id = observation.getCode().coding.toString();

        ObservationTest obsId = ObservationTest.findObs(observation.getId());
        if(obsId !=null){
            ObservationTest.update("qualifier_concept_id=?1,unit_concept_id=?2,provider_id=?3,visit_occurrence_id=?4,person_id=?5,observation_concept_id=?6,observation_date=?7,observation_datetime=?8,observation_type_concept_id=?9,value_as_number=?10,value_as_string=?11,value_as_concept_id=?12 where id=?13",
                    observation.code.toString(),(int) observation.getValueQuantity().value,observation.getPerformer().toString(),observation.getEncounter().toString(),
                    observation.getSubject().toString(),observation.code.toString(),observation.getEffectiveDateTime(),
                    observation.getEffectiveDateTime(),observation.getCategory().toString(),(int) observation.getValueQuantity().value,
                    observation.getValueQuantity().toString(),observation.getCode().coding.toString(),observation.getId());
        } else{
            observationTest.persist();
        }
    }
}
