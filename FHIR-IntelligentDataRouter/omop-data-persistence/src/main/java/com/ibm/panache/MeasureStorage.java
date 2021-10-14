package com.ibm.panache;


import com.ibm.pojo.MeasureResource.Measure;

import io.smallrye.reactive.messaging.annotations.Blocking;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;


import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class MeasureStorage {


    @Incoming("fhirsvr_measure")
    @Blocking
    @Transactional
    public void store(Measure measure) {


        MeasureTest msrTest=new MeasureTest();
        System.out.println(measure.getResourceType());
        String id=measure.getId();
        msrTest.id=id;
        String name=measure.getName();
        msrTest.name=name;
        String group=measure.getGroup().get(0).getId();
        msrTest.groups=group;
        String date=measure.getDate();
        msrTest.date=date;
        String code=measure.getGroup().get(0).getCode().getCoding().get(0).getCode();
        msrTest.code=code;
        String description=measure.getDescription();
        msrTest.description=description;
        String publisher=measure.getPublisher();
        msrTest.publisher=publisher;
        String purpose=measure.getPurpose();
        msrTest.purpose=purpose;
        String type=measure.getType().get(0).getCoding().get(0).getCode();
        msrTest.type=type;


        if (MeasureTest.count("id",id)>0){
            MeasureTest.update("name=?1,group=?2,date=?3,code=?4,description=?5,publisher=?6,purpose=?7,type=?8 where id=?9"
                    ,name,group,date,code,description,publisher,purpose,type,id);
        } else{
            msrTest.persist();

        }
        

    }

}
