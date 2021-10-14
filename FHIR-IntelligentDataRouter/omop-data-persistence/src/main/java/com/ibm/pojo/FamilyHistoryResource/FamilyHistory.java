package com.ibm.pojo.FamilyHistoryResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents a family history context
 *
 */
public class FamilyHistory {

	public String resourceType;
	public String id;
	public Text text;
	public List<Identifier> identifier;
	public List<String> instantiatesUri;
	public String status;
	public Patient patient;
	public String date;
	public Relationship relationship;
	public Sex sex;
	public List<Condition> condition;

	public String getResourceType(){return resourceType;}
	public void setResourceType(String resourceType){this.resourceType=resourceType;}

	public String getId(){return id;}
	public void setId(String id){this.id=id;}

	public Text getText(){return text;}
	public void setText(Text text){this.text=text;}

	public List<Identifier> getIdentifier(){return identifier;}
	public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

	public List<String> getInstantiatesUri(){return instantiatesUri;}
	public void setInstantiatesUri(List<String> instantiatesUri){this.instantiatesUri=instantiatesUri;}

	public String getStatus(){return status;}
	public void setStatus(String status){this.status=status;}

	public Patient getPatient(){return patient;}
	public void setPatient(Patient patient){this.patient=patient;}

	public String getDate(){return date;}
	public void setDate(String date){this.date=date;}

	public Relationship getRelationship(){return relationship;}
	public void setRelationship(Relationship relationship){this.relationship=relationship;}

	public Sex getSex(){return sex;}
	public void setSex(Sex sex){this.sex=sex;}

	public List<Condition> getCondition(){return condition;}
	public void setCondition(List<Condition> condition){this.condition=condition;}
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
