package com.ibm.pojo.FamilyMemberHistoryResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Text {
    public String status;
    public String div;

    public void setStatus(String status) { this.status = status; }

    public String getStatus() { return status; }

    public String getDiv() { return div; }

    public void setDiv(String div) { this.div = div; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
