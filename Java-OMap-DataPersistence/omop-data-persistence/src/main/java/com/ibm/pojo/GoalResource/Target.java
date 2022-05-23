package com.ibm.pojo.GoalResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Target {
    public Measure measure;
    public DetailRange detailRange;
    public String dueDate;

    public DetailRange getDetailRange() { return detailRange; }

    public void setDetailRange(DetailRange detailRange) { this.detailRange = detailRange; }

    public Measure getMeasure() { return measure; }

    public void setMeasure(Measure measure) { this.measure = measure; }

    public String getDueDate() { return dueDate; }

    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public String toString() { return ReflectionToStringBuilder.toString(this); }
}
