package com.ibm.pojo.ClaimResource;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.sql.Ref;
import java.util.List;

public class Claims {

    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public String status;
    public Type type;
    public SubType subType;
    public String use;
    public BillablePeriod billablePeriod;
    public Patient patient;
    public String created;
    public Enterer enterer;
    public Facility facility;
    public Accident accident;
    public Insurer insurer;
    public Provider provider;
    public Priority priority;
    public List<Related> related;
    public FundsReserve fundsReserve;
    public Payee payee;
    public Prescription prescription;
    public OriginalPrescription originalPrescription;
    public Referral referral;
    public List<CareTeam> careTeam;
    public List<SupportingInfo> supportingInfo;
    public List<Diagnosis> diagnosis;
    public List<Procedure> procedure;
    public List<Insurance> insurance;
    public List<Item> item;
    public Total total;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public List<Contained> getContained(){return contained;}
    public void setContained(List<Contained> contained){this.contained=contained;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public Type getType(){return type;}
    public void setType(Type type){this.type=type;}


    public SubType getSubType(){return subType;}
    public void setSubType(SubType subType){this.subType=subType;}

    public Enterer getEnterer(){return enterer;}
    public void setEnterer(Enterer enterer){this.enterer=enterer;}

    public Facility getFacility(){return facility;}
    public void setFacility(Facility facility){this.facility=facility;}

    public Accident getAccident(){return accident;}
    public void setAccident(Accident accident){this.accident=accident;}

    public String getUse(){return use;}
    public void setUse(String use){this.use=use;}

    public BillablePeriod getBillablePeriod(){return billablePeriod;}
    public void setBillablePeriod(BillablePeriod billablePeriod){this.billablePeriod=billablePeriod;}

    public Patient getPatient(){return patient;}
    public void setPatient(Patient patient){this.patient=patient;}

    public String getCreated(){return created;}
    public void setCreated(String created){this.created=created;}

    public Insurer getInsurer(){return insurer;}
    public void setInsurer(Insurer insurer){this.insurer=insurer;}

    public Provider getProvider(){return provider;}
    public void setProvider(Provider provider){this.provider=provider;}

    public Priority getPriority(){return priority;}
    public void setPriority(Priority priority){this.priority=priority;}

    public List<Related> getRelated(){return related;}
    public void setRelated(List<Related> related){this.related=related;}

    public FundsReserve getFundsReserve(){return fundsReserve;}
    public void setFundsReserve(FundsReserve fundsReserve){this.fundsReserve=fundsReserve;}

    public Payee getPayee(){return payee;}
    public void setPayee(Payee payee){this.payee=payee;}

    public Prescription getPrescription(){return prescription;}
    public void setPrescription(Prescription prescription){this.prescription=prescription;}

    public OriginalPrescription getOriginalPrescription(){return originalPrescription;}
    public void setOriginalPrescription(OriginalPrescription originalPrescription){this.originalPrescription=originalPrescription;}

    public Referral getReferral(){return referral;}
    public void setReferral(Referral referral){this.referral=referral;}

    public List<CareTeam> getCareTeam(){return careTeam;}
    public void setCareTeam(List<CareTeam> careTeam){this.careTeam=careTeam;}

    public List<SupportingInfo> getSupportingInfo(){return supportingInfo;}
    public void setSupportingInfo(List<SupportingInfo> supportingInfo){this.supportingInfo=supportingInfo;}

    public List<Diagnosis> getDiagnosis(){return diagnosis;}
    public void setDiagnosis(List<Diagnosis> diagnosis){this.diagnosis=diagnosis;}

    public List<Procedure> getProcedure(){return procedure;}
    public void setProcedure(List<Procedure> procedure){this.procedure=procedure;}

    public List<Insurance> getInsurance(){return insurance;}
    public void setInsurance(List<Insurance> insurance){this.insurance=insurance;}

    public List<Item> getItem(){return item;}
    public void setItem(List<Item> item){this.item=item;}

    public Total getTotal(){return total;}
    public void setTotal(Total total){this.total=total;}



    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
