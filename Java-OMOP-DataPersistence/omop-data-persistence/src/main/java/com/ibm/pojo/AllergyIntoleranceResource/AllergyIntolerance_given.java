package com.ibm.pojo.AllergyIntoleranceResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * https://www.hl7.org/fhir/allergyintolerance.html
 * Represents a FHIR AllergyIntolerance Resource
 * This will only contain fields
 * If other structures are referenced are used they can be populated directly
 * The intent is to use these libraries as DTO objects to populate and pass into building methods for simplicity
 *
 */
public class AllergyIntolerance_given {
    public String AllergyIntoleranceIdentifier;
    public String AllergyIntoleranceType;
    public String AllergyIntoleranceCategory;
    public String AllergyIntoleranceCriticality;
    public String AllergyIntoleranceOnsetOnsetDateTime;
    public String AllergyIntoleranceOnsetAge;
    public String AllergyIntoleranceOnsetPeriod;
    public String AllergyIntoleranceOnsetRange;
    public String AllergyIntoleranceString;
    public String AllergyIntoleranceRecordedDate;
    public String AllergyIntoleranceLastOccurrence;
    public String AllergyIntoleranceReactionDescription;
    public String AllergyIntoleranceOnset;
    public String AllergyIntoleranceSeverity;

    // Getters and Setters
    public String getAllergyIntoleranceIdentifier() {
        return AllergyIntoleranceIdentifier;
    }

    public void setAllergyIntoleranceIdentifier(String allergyIntoleranceIdentifier) {
        AllergyIntoleranceIdentifier = allergyIntoleranceIdentifier;
    }

    public String getAllergyIntoleranceType() {
        return AllergyIntoleranceType;
    }

    public void setAllergyIntoleranceType(String allergyIntoleranceType) {
        AllergyIntoleranceType = allergyIntoleranceType;
    }

    public String getAllergyIntoleranceCategory() {
        return AllergyIntoleranceCategory;
    }

    public void setAllergyIntoleranceCategory(String allergyIntoleranceCategory) {
        AllergyIntoleranceCategory = allergyIntoleranceCategory;
    }

    public String getAllergyIntoleranceCriticality() {
        return AllergyIntoleranceCriticality;
    }

    public void setAllergyIntoleranceCriticality(String allergyIntoleranceCriticality) {
        AllergyIntoleranceCriticality = allergyIntoleranceCriticality;
    }

    public String getAllergyIntoleranceOnsetOnsetDateTime() {
        return AllergyIntoleranceOnsetOnsetDateTime;
    }

    public void setAllergyIntoleranceOnsetOnsetDateTime(String allergyIntoleranceOnsetOnsetDateTime) {
        AllergyIntoleranceOnsetOnsetDateTime = allergyIntoleranceOnsetOnsetDateTime;
    }

    public String getAllergyIntoleranceOnsetAge() {
        return AllergyIntoleranceOnsetAge;
    }

    public void setAllergyIntoleranceOnsetAge(String allergyIntoleranceOnsetAge) {
        AllergyIntoleranceOnsetAge = allergyIntoleranceOnsetAge;
    }

    public String getAllergyIntoleranceOnsetPeriod() {
        return AllergyIntoleranceOnsetPeriod;
    }

    public void setAllergyIntoleranceOnsetPeriod(String allergyIntoleranceOnsetPeriod) {
        AllergyIntoleranceOnsetPeriod = allergyIntoleranceOnsetPeriod;
    }

    public String getAllergyIntoleranceOnsetRange() {
        return AllergyIntoleranceOnsetRange;
    }

    public void setAllergyIntoleranceOnsetRange(String allergyIntoleranceOnsetRange) {
        AllergyIntoleranceOnsetRange = allergyIntoleranceOnsetRange;
    }

    public String getAllergyIntoleranceString() {
        return AllergyIntoleranceString;
    }

    public void setAllergyIntoleranceString(String allergyIntoleranceString) {
        AllergyIntoleranceString = allergyIntoleranceString;
    }

    public String getAllergyIntoleranceRecordedDate() {
        return AllergyIntoleranceRecordedDate;
    }

    public void setAllergyIntoleranceRecordedDate(String allergyIntoleranceRecordedDate) {
        AllergyIntoleranceRecordedDate = allergyIntoleranceRecordedDate;
    }

    public String getAllergyIntoleranceLastOccurrence() {
        return AllergyIntoleranceLastOccurrence;
    }

    public void setAllergyIntoleranceLastOccurrence(String allergyIntoleranceLastOccurrence) {
        AllergyIntoleranceLastOccurrence = allergyIntoleranceLastOccurrence;
    }

    public String getAllergyIntoleranceReactionDescription() {
        return AllergyIntoleranceReactionDescription;
    }

    public void setAllergyIntoleranceReactionDescription(String allergyIntoleranceReactionDescription) {
        AllergyIntoleranceReactionDescription = allergyIntoleranceReactionDescription;
    }

    public String getAllergyIntoleranceOnset() {
        return AllergyIntoleranceOnset;
    }

    public void setAllergyIntoleranceOnset(String allergyIntoleranceOnset) {
        AllergyIntoleranceOnset = allergyIntoleranceOnset;
    }

    public String getAllergyIntoleranceSeverity() {
        return AllergyIntoleranceSeverity;
    }

    public void setAllergyIntoleranceSeverity(String allergyIntoleranceSeverity) {
        AllergyIntoleranceSeverity = allergyIntoleranceSeverity;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
