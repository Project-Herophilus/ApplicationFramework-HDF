package com.ibm.panache;


import com.ibm.pojo.ClaimResource.Claims;
import com.ibm.pojo.PatientResource.Coding;
import com.ibm.pojo.PatientResource.MaritalStatus;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;


import java.util.List;

@ApplicationScoped
public class ClaimsStorage {

    @Incoming("fhirsvr_claim")
    @Blocking
    @Transactional
    public void store(Claims claims) {
        ClaimHDR claimdata=new ClaimHDR();
        System.out.println(claims.getResourceType());
        String id=claims.getId();
        claimdata.id=id;
        claimdata.resourceType=claims.getResourceType();
        claimdata.status=claims.getStatus();
        double claimAmt=0.00;
        try{
            claimAmt=claims.getTotal().getValue();
            claimdata.claimAmount=claimAmt;
            claimdata.currency=claims.getTotal().getCurrency();

        } catch(NullPointerException e) {
            claimAmt=0.00;
            claimdata.claimAmount=claimAmt;
            claimdata.currency="NA";

        }

        String patRef=claims.getPatient().getReference();
        claimdata.patientRef=patRef;

        if (ClaimHDR.count("id",id)>0){
            System.out.println("Existing record");
            ClaimHDR.update("claimAmount=?1 where id=?2",claimAmt,id);
        } else{
            System.out.println("New Record");
            claimdata.persist();

        }

    }



}
