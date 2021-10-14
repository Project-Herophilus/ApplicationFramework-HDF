package com.ibm.pojo.PatientResource;

import java.util.List;


public class Patient {

    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public boolean active;
    public List<Name> name;
    public List<Telecom> telecom;
    public String gender;
    public String birthDate;
    public String deceasedDateTime;
    public MaritalStatus maritalStatus;
    public BirthDate birthDatePkg;
    public boolean deceasedBoolean;
    public Address address;
    public List<Contact> contact;
    public List<Communication> communication;
    public ManagingOrganization managingOrganization;
    public List<Link> link;
    public List<Photo> photo;
    public GeneralPractitioner generalPractitioner;

    public GeneralPractitioner getGeneralPractitioner() {
        return generalPractitioner;
    }

    public void setGeneralPractitioner(GeneralPractitioner generalPractitioner) {
        this.generalPractitioner = generalPractitioner;
    }

    public String getResourceType(){return resourceType;}
    public void setResourceType(String resourceType){this.resourceType=resourceType;}

    public String getId(){return id;}
    public void setId(String id){this.id=id;}

    public Text getText(){return text;}
    public void setText(Text text){this.text=text;}

    public List<Identifier> getIdentifier(){return identifier;}
    public void setIdentifier(List<Identifier> identifier){this.identifier=identifier;}

    public boolean isActive(){return active;}
    public void setActive(boolean active){this.active=active;}

    public List<Name> getName(){return name;}
    public void setName(List<Name> name){this.name=name;}

    public List<Telecom> getTelecom(){return telecom;}
    public void setTelecom(List<Telecom> telecom){this.telecom=telecom;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender=gender;}

    public String getBirthDate(){return birthDate;}
    public void setBirthDate(String birthDate){this.birthDate=birthDate;}

    public String getDeceasedDateTime(){return deceasedDateTime;}
    public void setDeceasedDateTime(String deceasedDateTime){this.deceasedDateTime=deceasedDateTime;}

    public MaritalStatus getMaritalStatus(){return maritalStatus;}
    public void setMaritalStatus(MaritalStatus maritalStatus){this.maritalStatus=maritalStatus;}

    public BirthDate getBirthDatePkg(){return birthDatePkg;}
    public void setBirthDatePkg(BirthDate birthDatePkg){this.birthDatePkg=birthDatePkg;}

    public boolean isDeceasedBoolean(){return deceasedBoolean;}
    public void setDeceasedBoolean(boolean deceasedBoolean){this.deceasedBoolean=deceasedBoolean;}

    public Address getAddress(){return address;}
    public void setAddress(Address address){this.address=address;}

    public List<Contact> getContact(){return contact;}
    public void setContact(List<Contact> contact){this.contact=contact;}

    public List<Communication> getCommunication(){return communication;}
    public void setCommunication(List<Communication> communication){this.communication=communication;}

    public ManagingOrganization getManagingOrganization(){return managingOrganization;}
    public void setManagingOrganization(ManagingOrganization managingOrganization){this.managingOrganization=managingOrganization;}

    public List<Link> getLink(){return link;}
    public void setLink(List<Link> link){this.link=link;}

    public List<Photo> getPhoto(){return photo;}
    public void setPhoto(List<Photo> photo){this.photo=photo;}

    @Override
    public String toString() {
        return "Patient{" +
                "resourceType='" + resourceType + '\'' +
                ", id='" + id + '\'' +
                ", text=" + text +
                ", identifier=" + identifier +
                ", active=" + active +
                ", name=" + name +
                ", telecom=" + telecom +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deceasedDateTime='" + deceasedDateTime + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", birthDatePkg=" + birthDatePkg +
                ", deceasedBoolean=" + deceasedBoolean +
                ", address=" + address +
                ", contact=" + contact +
                ", communication=" + communication +
                ", managingOrganization=" + managingOrganization +
                ", link=" + link +
                ", photo=" + photo +
                ", generalPractitioner=" + generalPractitioner +
                '}';
    }
}
