package com.ibm.pojo;

import com.ibm.pojo.ProcedureResource.Procedure;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class ProcedureDeserializer extends ObjectMapperDeserializer<Procedure> {
    public ProcedureDeserializer(){
        super(Procedure.class);
    }
}
