package com.ibm.panache;

import com.ibm.pojo.PatientResource.Patient;
import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;


import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;


@ApplicationScoped
public class PersonStorage {
    @Incoming("fhirsvr_patient")
    @Blocking
    @Transactional
    public void store(Patient patient) {
        Person person = new Person();
        System.out.println(patient);
        person.id = patient.getId();
        person.birth_datetime = patient.getBirthDate();
        person.death_datetime = patient.getDeceasedDateTime();
        person.day_of_birth = patient.getBirthDate();
        person.month_of_birth = patient.getBirthDate();
        person.year_of_birth = patient.getBirthDate();
        person.location_id=  patient.getAddress().getText();
        //person.provider_id = patient.getGeneralPractitioner().getReference();
        person.gender_concept_id = patient.getGender();

        Person personID = Person.findPerson(patient.getId());

        if(personID !=null){
            System.out.println("Record");
            Person.update("birth_datetime=?1, death_datetime=?2, day_of_birth=?3,month_of_birth=?4, year_of_birth=?5, location=?6, gender_concept_id=?7 where id=?8",
                    patient.getBirthDate(),patient.getDeceasedDateTime(),patient.getBirthDate(),patient.getBirthDate(),patient.getBirthDate(),patient.getGender(), patient.getId());

        }
        else {
            System.out.println("New Record");
            person.persist();
            System.out.println("Else person id" + patient.getId());
        }
    }
}

