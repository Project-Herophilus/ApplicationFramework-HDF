package com.ibm.pojo.EncounterResource;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


import java.util.List;

public class Hospitalization {
    public Origin origin;
    public PreAdmissionIdentifier preAdmissionIdentifier;
    public AdmitSource admitSource;
    public DischargeDisposition dischargeDisposition;
    public ReAdmission reAdmission;
    public List<DietPreference> dietPreference;
    public List<SpecialCourtesy> specialCourtesy;
    public List<SpecialArrangement> specialArrangement;
    public Destination destination;


    public Origin getOrigin(){return origin;}
    public void setOrigin(Origin origin){this.origin=origin;}

    public PreAdmissionIdentifier getPreAdmissionIdentifier(){return preAdmissionIdentifier;}
    public void setPreAdmissionIdentifier(PreAdmissionIdentifier preAdmissionIdentifier){this.preAdmissionIdentifier=preAdmissionIdentifier;}

    public AdmitSource getAdmitSource(){return admitSource;}
    public void setAdmitSource(AdmitSource admitSource){this.admitSource=admitSource;}

    public DischargeDisposition getDischargeDisposition(){return dischargeDisposition;}
    public void setDischargeDisposition(DischargeDisposition dischargeDisposition){this.dischargeDisposition=dischargeDisposition;}

    public ReAdmission getReAdmission(){return reAdmission;}
    public void setReAdmission(ReAdmission reAdmission){this.reAdmission=reAdmission;}

    public List<DietPreference> getDietPreference(){return dietPreference;}
    public void setDietPreference(List<DietPreference> dietPreference){this.dietPreference=dietPreference;}

    public List<SpecialCourtesy> getSpecialCourtesy(){return specialCourtesy;}
    public void setSpecialCourtesy(List<SpecialCourtesy> specialCourtesy){this.specialCourtesy=specialCourtesy;}

    public List<SpecialArrangement> getSpecialArrangement(){return specialArrangement;}
    public void setSpecialArrangement(List<SpecialArrangement> specialArrangement){this.specialArrangement=specialArrangement;}

    public Destination getDestination(){return destination;}
    public void setDestination(Destination destination){this.destination=destination;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
