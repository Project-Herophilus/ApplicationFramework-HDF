package com.ibm.domain;

import java.util.Date;
import java.util.List;

public class Observation {
    public String resourceType;
    public String id;
    public Text text;
    public List<Identifier> identifier;
    public String status;
    public Code code;
    public Subject subject;
    public EffectivePeriod effectivePeriod;
    public Date issued;
    public List<Performer> performer;
    public ValueQuantity valueQuantity;
    public List<Interpretation> interpretation;
    public List<ReferenceRange> referenceRange;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public EffectivePeriod getEffectivePeriod() {
        return effectivePeriod;
    }

    public void setEffectivePeriod(EffectivePeriod effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }

    public List<Performer> getPerformer() {
        return performer;
    }

    public void setPerformer(List<Performer> performer) {
        this.performer = performer;
    }

    public ValueQuantity getValueQuantity() {
        return valueQuantity;
    }

    public void setValueQuantity(ValueQuantity valueQuantity) {
        this.valueQuantity = valueQuantity;
    }

    public List<Interpretation> getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(List<Interpretation> interpretation) {
        this.interpretation = interpretation;
    }

    public List<ReferenceRange> getReferenceRange() {
        return referenceRange;
    }

    public void setReferenceRange(List<ReferenceRange> referenceRange) {
        this.referenceRange = referenceRange;
    }
}
