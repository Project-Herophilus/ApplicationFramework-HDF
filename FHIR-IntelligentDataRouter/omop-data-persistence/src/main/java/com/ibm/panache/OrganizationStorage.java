package com.ibm.panache;

import com.ibm.pojo.OrganizationResource.Organization;

import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;


import java.util.List;

@ApplicationScoped
public class OrganizationStorage {

    @Incoming("fhirsvr_organization")
    @Blocking
    @Transactional
    public void store(Organization organization) {
        OrganizationInfo orgInfo=new OrganizationInfo();
        System.out.println(organization.getResourceType());

        String id=organization.getId();
        System.out.println(id);
        orgInfo.id=id;
       orgInfo.resourceType=organization.getResourceType();
       String name=organization.getName();
       System.out.println(name);
        orgInfo.name=name;

        if (OrganizationInfo.count("id",id)>0){
            System.out.println("Existing record");
            OrganizationInfo.update("name=?1 where id=?2",name,id);
        } else{
            System.out.println("New Record");
            orgInfo.persist();

        }

    }

}
