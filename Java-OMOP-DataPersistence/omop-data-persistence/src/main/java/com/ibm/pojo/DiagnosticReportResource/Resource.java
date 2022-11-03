package com.ibm.pojo.DiagnosticReportResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Resource {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public List<BasedOn> basedOn;
    public String status;
    public List<Category> category;
    public Code code;
    public Subject subject;
    public String issued;
    public List<Performer> performer;
    public List<Result> result;
    public String conclusion;
    public List<ConclusionCode> conclusionCode;
    public List<Extension> extension;
    public String intent;
    public Encounter encounter;
    public Requester requester;
    public List<Note> note;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public List<BasedOn> getBasedOn(){return basedOn;}
    public void setBasedOn(List<BasedOn> basedOn){this.basedOn=basedOn;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public List<Category> getCategory(){return category;}
    public void setCategory(List<Category> category){this.category=category;}

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public Subject getSubject(){return subject;}
    public void setSubject(Subject subject){this.subject=subject;}

    public String getIssued(){return issued;}
    public void setIssued(String issued){this.issued=issued;}

    public List<Performer> getPerformer(){return performer;}
    public void setPerformer(List<Performer> performer){this.performer=performer;}

    public List<Result> getResult(){return result;}
    public void setResult(List<Result> result){this.result=result;}

    public String getConclusion(){return conclusion;}
    public void setConclusion(String conclusion){this.conclusion=conclusion;}

    public List<ConclusionCode> getConclusionCode(){return conclusionCode;}
    public void setConclusionCode(List<ConclusionCode> conclusionCode){this.conclusion=conclusion;}

    public List<Extension> getExtension(){return extension;}
    public void setExtension(List<Extension> extension){this.extension=extension;}

    public String getIntent(){return intent;}
    public void setIntent(String intent){this.intent=intent;}

    public Encounter getEncounter(){return encounter;}
    public void setEncounter(Encounter encounter){this.encounter=encounter;}

    public Requester getRequester(){return requester;}
    public void setRequester(Requester requester){this.requester=requester;}

    public List<Note> getNote(){return note;}
    public void setNote(List<Note> note){this.note=note;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
