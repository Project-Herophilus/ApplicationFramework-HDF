package com.ibm.panache;

import com.ibm.pojo.PractitionerResource.Practitioner;
import com.ibm.pojo.PractitionerRoleResource.PractitionerRole;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;


import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProviderStorage {
    @Incoming("fhirsvr_practitioner")
    @Blocking
    @Transactional
    public void store(Practitioner practitioner){
        Provider provider = new Provider();
        PractitionerRole practitionerRole = new PractitionerRole();
        String id = "";
        String name = "";
        System.out.println(practitioner.getResourceType());
        try {
            id = practitioner.getId();
            provider.id = id;
            name = practitioner.getName().toString();
            provider.provider_name = name;
            provider.npi = practitioner.getIdentifier().toString();
            provider.dea = practitioner.getQualification().toString();
            provider.specialty_concept_id = practitionerRole.getResource().getSpecialty().toString();
            provider.care_site_id = practitionerRole.getResource().getLocation().toString();
            provider.year_of_birth = practitioner.getPeriod().getStart();
            provider.gender_concept_id = practitioner.getName().getGender();
        }catch (NullPointerException e){
            provider.id = null;
            provider.provider_name = null;
            provider.npi = null;
            provider.dea = null;
            provider.specialty_concept_id = null;
            provider.care_site_id = null;
            provider.year_of_birth = null;
            provider.gender_concept_id = null;
        }

        Provider providerId = Provider.findProvider(practitioner.getId());
        if(providerId !=null){
            System.out.println("Existing record");
            Provider.update("provider_name=?1, npi=?2,dea=?3,specialty_concept_id=?4,care_site_id=?5,year_of_birth=?6,gender_concept_id=?7  where id=?8",
                    name,practitioner.getIdentifier().toString(),practitioner.getQualification().toString(),
                    practitionerRole.getResource().getSpecialty().toString(),practitionerRole.getResource().getLocation().toString(),
                    practitioner.getPeriod().getStart(),practitioner.getName().getGender(),id);
        } else{
            System.out.println("New Record");
            provider.persist();

        }

    }
}
