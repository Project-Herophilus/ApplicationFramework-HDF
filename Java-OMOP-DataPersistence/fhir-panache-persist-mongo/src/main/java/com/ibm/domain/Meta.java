package com.ibm.domain; 
import java.util.List; 
public class Meta{
    public List<Extension> extension;
    public List<String> profile;

    public List<Extension> getExtension() {
        return extension;
    }

    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    public List<String> getProfile() {
        return profile;
    }

    public void setProfile(List<String> profile) {
        this.profile = profile;
    }
}
