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
public class AppointmentResponse {
    public String AppointmentResponseIdentifier;
    public String AppointmentResponseStart;
    public String AppointmentResponseEnd;
    public String AppointmentResponseParticipantStatus;
    public String AppointmentResponseComment;
    // Getters and Setters
    public String getAppointmentResponseIdentifier() {
        return AppointmentResponseIdentifier;
    }

    public void setAppointmentResponseIdentifier(String appointmentResponseIdentifier) {
        AppointmentResponseIdentifier = appointmentResponseIdentifier;
    }

    public String getAppointmentResponseStart() {
        return AppointmentResponseStart;
    }

    public void setAppointmentResponseStart(String appointmentResponseStart) {
        AppointmentResponseStart = appointmentResponseStart;
    }

    public String getAppointmentResponseEnd() {
        return AppointmentResponseEnd;
    }

    public void setAppointmentResponseEnd(String appointmentResponseEnd) {
        AppointmentResponseEnd = appointmentResponseEnd;
    }

    public String getAppointmentResponseParticipantStatus() {
        return AppointmentResponseParticipantStatus;
    }

    public void setAppointmentResponseParticipantStatus(String appointmentResponseParticipantStatus) {
        AppointmentResponseParticipantStatus = appointmentResponseParticipantStatus;
    }

    public String getAppointmentResponseComment() {
        return AppointmentResponseComment;
    }

    public void setAppointmentResponseComment(String appointmentResponseComment) {
        AppointmentResponseComment = appointmentResponseComment;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
