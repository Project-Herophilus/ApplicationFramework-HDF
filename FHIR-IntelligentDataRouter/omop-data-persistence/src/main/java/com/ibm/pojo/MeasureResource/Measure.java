package com.ibm.pojo.MeasureResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


import java.util.List;

public class Measure {

    public String resourceType;
    public String id;
    public Text text;
    public String url;
    public List<Identifier> identifier;
    public String version;
    public String name;
    public String title;
    public String status;
    public boolean experimental;
    public String date;
    public String description;
    public String publisher;
    public List<Contact> contact;
    public List<UseContext> useContext;
    public List<Jurisdiction> jurisdiction;
    public String purpose;
    public List<Topic> topic;
    public String copyright;
    public String approvalDate;
    public String lastReviewDate;
    public EffectivePeriod effectivePeriod;
    public List<Author> author;
    public List<RelatedArtifact> relatedArtifact;
    public List<String> library;
    public String disclaimer;
    public Scoring scoring;
    public List<Type> type;
    public String rationale;
    public String clinicalRecommendationStatement;
    public ImprovementNotation improvementNotation;
    public List<String> definition;
    public String guidance;
    public List<Group> group;
    public List<SupplementalData> supplementalData;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public String getUrl(){return url;}
    public void setUrl(String url){this.url=url;}


    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public String getVersion(){return version;}
    public void setVersion(String version){this.version=version;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public boolean isExperimental(){return experimental;}
    public void setExperimental(boolean experimental){this.experimental=experimental;}

    public String getDate(){return date;}
    public void setDate(String date){this.date=date;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public String getPublisher(){return publisher;}
    public void setPublisher(String publisher){this.publisher=publisher;}

    public List<Contact> getContact(){return contact;}
    public void setContact(List<Contact> contact){this.contact=contact;}

    public List<UseContext> getUseContext(){return useContext;}
    public void setUseContextt(List<UseContext> useContext){this.useContext=useContext;}

    public List<Jurisdiction> getJurisdiction(){return jurisdiction;}
    public void setJurisdiction(List<Jurisdiction> jurisdiction){this.jurisdiction=jurisdiction;}

    public String getPurpose(){return purpose;}
    public void setPurpose(String purpose){this.purpose=purpose;}

    public List<Topic> getTopic(){return topic;}
    public void setTopic(List<Topic> topic){this.topic=topic;}

    public String getCopyright(){return copyright;}
    public void setCopyright(String copyright){this.copyright=copyright;}

    public String getApprovalDate(){return approvalDate;}
    public void setApprovalDate(String approvalDate){this.approvalDate=approvalDate;}

    public String getLastReviewDate(){return lastReviewDate;}
    public void setLastReviewDate(String lastReviewDate){this.lastReviewDate=lastReviewDate;}

    public EffectivePeriod getEffectivePeriod(){return effectivePeriod;}
    public void setEffectivePeriod(EffectivePeriod effectivePeriod){this.effectivePeriod=effectivePeriod;}

    public List<Author> getAuthor(){return author;}
    public void setAuthor(List<Author> author){this.author=author;}

    public List<RelatedArtifact> getRelatedArtifact(){return relatedArtifact;}
    public void setRelatedArtifact(List<RelatedArtifact> relatedArtifact){this.relatedArtifact=relatedArtifact;}

    public List<String> getLibrary(){return library;}
    public void setLibrary(List<String> library){this.library=library;}

    public String getDisclaimer(){return disclaimer;}
    public void setDisclaimer(String disclaimer){this.disclaimer=disclaimer;}

    public Scoring getScoring(){return scoring;}
    public void setScoring(Scoring scoring){this.scoring=scoring;}

    public List<Type> getType(){return type;}
    public void setType(List<Type> type){this.type=type;}

    public String getRationale(){return rationale;}
    public void setRationale(String rationale){this.rationale=rationale;}

    public String getClinicalRecommendationStatement(){return clinicalRecommendationStatement;}
    public void setClinicalRecommendationStatement(String clinicalRecommendationStatement){this.clinicalRecommendationStatement=clinicalRecommendationStatement;}

    public ImprovementNotation getImprovementNotation(){return improvementNotation;}
    public void setImprovementNotation(ImprovementNotation improvementNotation){this.improvementNotation=improvementNotation;}

    public List<String> getDefinition(){return definition;}
    public void setDefinition(List<String> definition){this.definition=definition;}

    public String getGuidance(){return guidance;}
    public void setGuidance(String guidance){this.rationale=rationale;}

    public List<Group> getGroup(){return group;}
    public void setGroup(List<Group> group){this.group=group;}

    public List<SupplementalData> getSupplementalData(){return supplementalData;}
    public void setSupplementalData(List<SupplementalData> supplementalData){this.supplementalData=supplementalData;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
