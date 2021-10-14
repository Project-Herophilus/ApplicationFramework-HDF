package com.ibm;

import com.ibm.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fhir")
public class FhirController {} /*{

    @Autowired
    private FhirService fhirService;

    @GetMapping
    public String hello() {
        return "Hello Spring";
    }

    @PostMapping("/care-plan")
    public ResponseEntity saveCarePlan(@RequestBody CarePlan fhirRequest){
        System.out.println(fhirRequest.toString());
        fhirService.saveData(fhirRequest);
        boolean result = true;
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(new FhirRequest());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new FhirRequest());
        }
    }

    @PostMapping("/allergy")
    public ResponseEntity saveAllergy(@RequestBody AllergyIntolerance fhirRequest){
        System.out.println(fhirRequest.toString());
        fhirService.saveData(fhirRequest);
        boolean result = true;
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(new FhirRequest());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new FhirRequest());
        }
    }
    @PostMapping("/condition")
    public ResponseEntity saveAllergy(@RequestBody Condition fhirRequest){
        System.out.println(fhirRequest.toString());
        fhirService.saveData(fhirRequest);
        boolean result = true;
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(new FhirRequest());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new FhirRequest());
        }
    }

    @PostMapping("/clinical-impression")
    public ResponseEntity saveAllergy(@RequestBody ClinicalImpression fhirRequest){
        System.out.println(fhirRequest.toString());
        fhirService.saveData(fhirRequest);
        boolean result = true;
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(new FhirRequest());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new FhirRequest());
        }
    }
    @PostMapping("/diagnostic-report")
    public ResponseEntity saveAllergy(@RequestBody DiagnosticReport fhirRequest){
        System.out.println(fhirRequest.toString());
        fhirService.saveData(fhirRequest);
        boolean result = true;
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(new FhirRequest());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new FhirRequest());
        }
    }
}*/
