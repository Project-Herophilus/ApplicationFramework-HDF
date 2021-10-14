package com.ibm.pojo;

import com.ibm.pojo.MedicationAdministrationResource.MedicationAdministration;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MedicationAdministrationDeserializer extends ObjectMapperDeserializer<MedicationAdministration> {
    public MedicationAdministrationDeserializer(){
        super(MedicationAdministration.class);
    }
}
