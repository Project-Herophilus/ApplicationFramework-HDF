package com.ibm.panache;

import com.ibm.r3.bundle.domain.CdaBundle;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class CdaBundleDeserializer extends ObjectMapperDeserializer<CdaBundle> {
    public CdaBundleDeserializer(){
        super(CdaBundle.class);
    }
}