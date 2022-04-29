package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * https://www.hl7.org/fhir/appointment.html
 * Represents a FHIR Appointment Resource
 * This will only contain fields
 * If other structures are referenced are used they can be populated directly
 * The intent is to use these libraries as DTO objects to populate and pass into building methods for simplicity
 *
 */
public class Appointment {
    public String AppointmentIdentifier;
    public String AppointmentStatus;
    public String AppointmentPriority;
    public String AppointmentDescription;
    public String AppointmentStart;
    public String AppointmentEnd;
    public String AppointmentMinutesDuration;
    public String AppointmentCreated;
    public String AppointmentComment;
    public String AppointmentPatientInstruction;
    public String AppointmentParticipantRequired;
    public String AppointmentParticipantStatus;

    // Getters and Setters
    public String getAppointmentIdentifier() {
        return AppointmentIdentifier;
    }

    public void setAppointmentIdentifier(String appointmentIdentifier) {
        AppointmentIdentifier = appointmentIdentifier;
    }

    public String getAppointmentStatus() {
        return AppointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        AppointmentStatus = appointmentStatus;
    }

    public String getAppointmentPriority() {
        return AppointmentPriority;
    }

    public void setAppointmentPriority(String appointmentPriority) {
        AppointmentPriority = appointmentPriority;
    }

    public String getAppointmentDescription() {
        return AppointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        AppointmentDescription = appointmentDescription;
    }

    public String getAppointmentStart() {
        return AppointmentStart;
    }

    public void setAppointmentStart(String appointmentStart) {
        AppointmentStart = appointmentStart;
    }

    public String getAppointmentEnd() {
        return AppointmentEnd;
    }

    public void setAppointmentEnd(String appointmentEnd) {
        AppointmentEnd = appointmentEnd;
    }

    public String getAppointmentMinutesDuration() {
        return AppointmentMinutesDuration;
    }

    public void setAppointmentMinutesDuration(String appointmentMinutesDuration) {
        AppointmentMinutesDuration = appointmentMinutesDuration;
    }

    public String getAppointmentCreated() {
        return AppointmentCreated;
    }

    public void setAppointmentCreated(String appointmentCreated) {
        AppointmentCreated = appointmentCreated;
    }

    public String getAppointmentComment() {
        return AppointmentComment;
    }

    public void setAppointmentComment(String appointmentComment) {
        AppointmentComment = appointmentComment;
    }

    public String getAppointmentPatientInstruction() {
        return AppointmentPatientInstruction;
    }

    public void setAppointmentPatientInstruction(String appointmentPatientInstruction) {
        AppointmentPatientInstruction = appointmentPatientInstruction;
    }

    public String getAppointmentParticipantRequired() {
        return AppointmentParticipantRequired;
    }

    public void setAppointmentParticipantRequired(String appointmentParticipantRequired) {
        AppointmentParticipantRequired = appointmentParticipantRequired;
    }

    public String getAppointmentParticipantStatus() {
        return AppointmentParticipantStatus;
    }

    public void setAppointmentParticipantStatus(String appointmentParticipantStatus) {
        AppointmentParticipantStatus = appointmentParticipantStatus;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
