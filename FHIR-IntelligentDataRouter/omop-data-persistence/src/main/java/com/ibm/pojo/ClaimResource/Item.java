package com.ibm.pojo.ClaimResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


import java.util.List;

public class Item {

    public int sequence;
    public Revenue revenue;
    public Category category;
    public List<Integer> careTeamSequence;
    public List<Integer> informationSequence;
    public List<Integer> diagnosisSequence;
    public ProductOrService productOrService;
    public List<Modifier> modifier;
    public List<ProgramCode> programCode;
    public String servicedDate;
    public LocationCodeableConcept locationCodeableConcept;
    public UnitPrice unitPrice;
    public double factor;
    public Quantity quantity;
    public Net net;
    public List<Udi> udi;
    public BodySite bodySite;
    public List<SubSite> subSite;
    public List<Integer> procedureSequence;
    public List<Detail> detail;
    public List<Encounter> encounter;


    public int getSequence(){return sequence;}
    public void setSequence(int sequence){this.sequence=sequence;}
    public Revenue getRevenue(){return revenue;}
    public void setRevenue(Revenue revenue){this.revenue=revenue;}

    public Category getCategory(){return category;}
    public void setCategory(Category category){this.category=category;}

    public List<Integer> getCareTeamSequence(){return careTeamSequence;}
    public void setCareTeamSequence(List<Integer> careTeamSequence){this.careTeamSequence=careTeamSequence;}

    public List<Integer> getInformationSequence(){return informationSequence;}
    public void setInformationSequence(List<Integer> informationSequence){this.informationSequence=informationSequence;}

    public List<Integer> getDiagnosisSequence(){return diagnosisSequence;}
    public void setDiagnosisSequence(List<Integer> diagnosisSequence){this.diagnosisSequence=diagnosisSequence;}

    public ProductOrService getProductOrService(){return productOrService;}
    public void setProductOrService(ProductOrService productOrService){this.productOrService=productOrService;}

    public List<Modifier> getModifier(){return modifier;}
    public void setModifier(List<Modifier> modifier){this.modifier=modifier;}

    public List<ProgramCode> getProgramCode(){return programCode;}
    public void setProgramCode(List<ProgramCode> programCode){this.programCode=programCode;}

    public String getServicedDate(){return servicedDate;}
    public void setServicedDate(String servicedDate){this.servicedDate=servicedDate;}

    public LocationCodeableConcept getLocationCodeableConcept(){return locationCodeableConcept;}
    public void setLocationCodeableConcept(LocationCodeableConcept locationCodeableConcept){this.locationCodeableConcept=locationCodeableConcept;}

    public UnitPrice getUnitPrice(){return unitPrice;}
    public void setUnitPrice(UnitPrice unitPrice){this.unitPrice=unitPrice;}

    public double getFactor(){return factor;}
    public void setFactor(double factor){this.factor=factor;}

    public Quantity getQuantity(){return quantity;}
    public void setQuantity(Quantity quantity){this.quantity=quantity;}

    public Net getNet(){return net;}
    public void setNet(Net net){this.net=net;}

    public List<Udi> getUdi(){return udi;}
    public void setUdi(List<Udi> udi){this.udi=udi;}

    public BodySite getBodySite(){return bodySite;}
    public void setBodySite(BodySite bodySite){this.bodySite=bodySite;}

    public List<SubSite> getSubSite(){return subSite;}
    public void setSubSite(List<SubSite> subSite){this.subSite=subSite;}

    public List<Integer> getProcedureSequence(){return procedureSequence;}
    public void setProcedureSequence(List<Integer> procedureSequence){this.procedureSequence=procedureSequence;}

    public List<Detail> getDetail(){return detail;}
    public void setDetail(List<Detail> detail){this.detail=detail;}

    public List<Encounter> getEncounter(){return encounter;}
    public void setEncounter(List<Encounter> encounter){this.encounter=encounter;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
