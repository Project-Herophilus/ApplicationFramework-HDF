package com.ibm.pojo.RiskAssessmentResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class RiskAssessment {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public BasedOn basedOn;
    public Parent parent;
    public String status;
    public Method method;
    public Subject subject;
    public Code code;
    public Encounter encounter;
    public String occurrenceDateTime;
    public Performer performer;
    public List<Basis> basis;
    public List<Prediction> prediction;
    public Condition condition;
    public List<Note> note;
    public List<Contained> contained;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public BasedOn getBasedOn(){return basedOn;}
    public void setBasedOn(BasedOn basedOn){this.basedOn=basedOn;}

    public Parent getParent(){return parent;}
    public void setParent(Parent parent){this.parent=parent;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public Method getMethod(){return method;}
    public void setMethod(Method method){this.method=method;}

    public Subject getSubject(){return subject;}
    public void setSubject(Subject subject){this.subject=subject;}

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public Encounter getEncounter(){return encounter;}
    public void setEncounter(Encounter encounter){this.encounter=encounter;}

    public String getOccurrenceDateTime(){return occurrenceDateTime;}
    public void setOccurrenceDateTime(String occurrenceDateTime){this.occurrenceDateTime=occurrenceDateTime;}

    public Performer getPerformer(){return performer;}
    public void setPerformer(Performer performer){this.performer=performer;}

    public List<Basis> getBasis(){return basis;}
    public void setBasis(List<Basis> basis){this.basis=basis;}

    public List<Prediction> getPrediction(){return prediction;}
    public void setPrediction(List<Prediction> prediction){this.prediction=prediction;}

    public Condition getCondition(){return condition;}
    public void setCondition(Condition condition){this.condition=condition;}

    public List<Note> getNote(){return note;}
    public void setNote(List<Note> note){this.note=note;}

    public List<Contained> getContained(){return contained;}
    public void setContained(List<Contained> contained){this.contained=contained;}


    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
