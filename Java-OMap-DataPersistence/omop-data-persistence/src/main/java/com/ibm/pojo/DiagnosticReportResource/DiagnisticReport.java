package com.ibm.pojo.DiagnosticReportResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class DiagnisticReport {
    public String resourceType;
    public String id;
    public String type;
    public List<Entry> entry;
    public Text text;
    public String status;
    public List<Category> category;
    public Code code;
    public Subject subject;
    public String effectiveDateTime;
    public String issued;
    public List<Performer> performer;
    public List<ImagingStudy> imagingStudy;
    public String conclusion;
    public List<ConclusionCode> conclusionCode;


    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

public String getType(){return type;}
public void setType(String type){this.type=type;}

public List<Entry> getEntry(){return entry;}
public void setEntry(List<Entry> entry){this.entry=entry;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

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

    public String getIssued(){return issued;}
    public void setIssued(String issued){this.issued=issued;}

    public List<Performer> getPerformer(){return performer;}
    public void setPerformer(List<Performer> performer){this.performer=performer;}

    public List<ImagingStudy> getImagingStudy(){return imagingStudy;}
    public void setImagingStudy(List<ImagingStudy> imagingStudy){this.imagingStudy=imagingStudy;}

    public String getConclusion(){return conclusion;}
    public void setConclusion(String conclusion){this.conclusion=conclusion;}

    public List<ConclusionCode> getConclusionCode(){return conclusionCode;}
    public void setConclusionCode(List<ConclusionCode> conclusionCode){this.conclusion=conclusion;}





    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
