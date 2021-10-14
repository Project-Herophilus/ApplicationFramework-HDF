package com.ibm.domain;

import java.util.List;

public class PatientInfo {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public boolean active;
    public List<Name> name;
    public List<Telecom> telecom;
    public String gender;
    public String birthDate;
    public BirthDate _birthDate;
    public boolean deceasedBoolean;
    public List<Address> address;
    public List<Contact> contact;
    public ManagingOrganization managingOrganization;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
    }

    public List<Telecom> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public BirthDate get_birthDate() {
        return _birthDate;
    }

    public void set_birthDate(BirthDate _birthDate) {
        this._birthDate = _birthDate;
    }

    public boolean isDeceasedBoolean() {
        return deceasedBoolean;
    }

    public void setDeceasedBoolean(boolean deceasedBoolean) {
        this.deceasedBoolean = deceasedBoolean;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public ManagingOrganization getManagingOrganization() {
        return managingOrganization;
    }

    public void setManagingOrganization(ManagingOrganization managingOrganization) {
        this.managingOrganization = managingOrganization;
    }
}
