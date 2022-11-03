package com.ibm.pojo.AdverseEventResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Causality {
    public Assessment assessment;
    public String productRelatedness;
    public Method method;
    public Author author;

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public Method getMethod() { return method; }
    public void setMethod(Method method) { this.method = method; }

    public String getProductRelatedness() { return productRelatedness; }
    public void setProductRelatedness(String productRelatedness) { this.productRelatedness = productRelatedness; }

    public Assessment getAssessment() { return assessment; }
    public void setAssessment(Assessment assessment) { this.assessment = assessment; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
