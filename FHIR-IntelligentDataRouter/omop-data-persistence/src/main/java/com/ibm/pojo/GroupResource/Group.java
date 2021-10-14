package com.ibm.pojo.GroupResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Group {
    public String resourceType;
    public String id;
    public Text text;
    public List<Extension> extension;
    public List<Identifier> identifier;
    public boolean active;
    public String type;
    public boolean actual;
    public Code code;
    public String name;
    public int quantity;
    public List<Characteristic> characteristic;
    public List<Member> member;

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(String id){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public List<Extension> getExtension(){return extension;}
    public void setExtension(List<Extension> extension){this.extension=extension;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public boolean isActive(){return active;}
    public void setActive(boolean active){this.active=active;}

    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public boolean isActual(){return actual;}
    public void setActual(boolean actual){this.actual=actual;}

    public Code getCode(){return code;}
    public void setCode(Code code){this.code=code;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity=quantity;}

    public List<Characteristic> getCharacteristic(){return characteristic;}
    public void setCharacteristic(List<Characteristic> characteristic){this.characteristic=characteristic;}

    public List<Member> getMember(){return member;}
    public void setMember(List<Member> member){this.member=member;}

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }



}
