package com.ibm.pojo.ObservationResource;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import sun.awt.SunHints;

import java.util.List;

public class Observation {

    public String resourceType;
    public String id;
    public Meta meta;
    public Text text;
    public List<Contained> contained;
    public List<Identifier> identifier;
    public List<PartOf> partOf;
    public List<BasedOn> basedOn;
    public String status;
    public List<Category> category;
    public Code code;
    public Subject subject;
    public String effectiveDateTime;
    public ValueQuantity valueQuantity;
    public List<Performer> performer;
    public List<Interpretation> interpretation;
    public Device device;
    public Method method;
    public Specimen specimen;
    public List<ReferenceRange> referenceRange;
    public BodySite bodySite;
    public List<Note> note;
    public List<Component> component;
    public List<DerivedFrom> derivedFrom;
    public List<Encounter> encounter;
    public List<Focus> focus;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Meta getMeta(){return meta;}
    public void setMeta(Meta meta){this.meta=meta;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public List<Contained> getContained(){return contained;}
    public void setContained(List<Contained> Contained){this.contained=contained;}

    public List<BasedOn> getBasedOn(){return basedOn;}
    public void setBasedOn(List<BasedOn> basedOn){this.basedOn=basedOn;}

    public List<PartOf> getPartOf(){return partOf;}
    public void setPartOf(List<PartOf> partOf){this.partOf=partOf;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public List<Category> getCategory(){return category;}
    public void setCategory(List<Category> category){this.category=category;}

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public Subject getSubject(){return subject;}
    public void setSubject(Subject subject){this.subject=subject;}

    public String getEffectiveDateTime(){return effectiveDateTime;}
    public void setEffectiveDateTime(String effectiveDateTime){this.effectiveDateTime=effectiveDateTime;}

    public ValueQuantity getValueQuantity(){return valueQuantity;}
    public void setValueQuantity(ValueQuantity valueQuantity){this.valueQuantity=valueQuantity;}

    public List<Performer> getPerformer(){return performer;}
    public void setPerformer(List<Performer> performer){this.performer=performer;}

    public List<Interpretation> getInterpretation(){return interpretation;}
    public void setInterpretation(List<Interpretation> interpretation){this.interpretation=interpretation;}

    public Device getDevice(){return device;}
    public void setDevice(Device device){this.device=device;}

    public Method getMethod(){return method;}
    public void setMethod(Method method){this.method=method;}

    public Specimen getSpecimen(){return specimen;}
    public void setSpecimen(Specimen specimen){this.specimen=specimen;}

    public List<ReferenceRange> getReferenceRange(){return referenceRange;}
    public void setReferenceRange(List<ReferenceRange> referenceRange){this.referenceRange=referenceRange;}

    public BodySite getBodySite(){return bodySite;}
    public void setBodySite(BodySite bodySite){this.bodySite=bodySite;}

    public List<Note> getNote(){return note;}
    public void setNote(List<Note> note){this.note=note;}

    public List<Component> getComponent(){return component;}
    public void setComponent(List<Component> component){this.component=component;}

    public List<DerivedFrom> getDerivedFrom(){return derivedFrom;}
    public void setDerivedFrom(List<DerivedFrom> derivedFrom){this.derivedFrom=derivedFrom;}

    public List<Encounter> getEncounter(){return encounter;}
    public void setEncounter(List<Encounter> encounter){this.encounter=encounter;}

    public List<Focus> getFocus(){return focus;}
    public void setFocus(List<Focus> focus){this.focus=focus;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
