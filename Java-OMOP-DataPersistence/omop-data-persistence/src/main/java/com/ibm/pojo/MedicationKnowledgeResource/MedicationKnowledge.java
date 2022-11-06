package com.ibm.pojo.MedicationKnowledgeResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class MedicationKnowledge {
    public String resourceType;
    public String id;
    public Text text;
    public List<Contained> contained;
    public Code code;
    public String status;
    public Manufacturer manufacturer;
    public DoseForm doseForm;
    public Amount amount;
    public List<String> synonym;
    public List<RelatedMedicationKnowledge> relatedMedicationKnowledge;
    public ProductType productType;
    public AssociatedMedication associatedMedication;
    public List<Monograph> monograph;
    public List<Ingredient> ingredients;
    public IntendedRoute intendedRoute;
    public List<Cost> cost;
    public List<MonitoringProgram> monitoringProgram;
    public List<AdministrationGuidelines> administrationGuidelines;
    public List<MedicineClassification> medicineClassification;
    public Packaging packaging;
    public List<DrugCharacteristic> drugCharacteristics;
    public String contraindication;
    public List<Regulatory> regulatory;

    public List<Regulatory> getRegulatory() { return regulatory; }
    public void setRegulatory(List<Regulatory> regulatory) { this.regulatory = regulatory; }

    public String getContraindication() { return contraindication; }
    public void setContraindication(String contraindication) { this.contraindication = contraindication; }

    public List<DrugCharacteristic> getDrugCharacteristics() { return drugCharacteristics; }
    public void setDrugCharacteristics(List<DrugCharacteristic> drugCharacteristics) { this.drugCharacteristics = drugCharacteristics; }

    public Packaging getPackaging() { return packaging; }
    public void setPackaging(Packaging packaging) { this.packaging = packaging; }

    public List<MedicineClassification> getMedicineClassification() { return medicineClassification; }
    public void setMedicineClassification(List<MedicineClassification> medicineClassification) { this.medicineClassification = medicineClassification; }

    public List<AdministrationGuidelines> getAdministrationGuidelines() { return administrationGuidelines; }
    public void setAdministrationGuidelines(List<AdministrationGuidelines> administrationGuidelines) { this.administrationGuidelines = administrationGuidelines; }

    public List<MonitoringProgram> getMonitoringProgram() { return monitoringProgram; }
    public void setMonitoringProgram(List<MonitoringProgram> monitoringProgram) { this.monitoringProgram = monitoringProgram; }

    public List<Cost> getCost() { return cost; }
    public void setCost(List<Cost> cost) { this.cost = cost; }


    public IntendedRoute getIntendedRoute() { return intendedRoute; }
    public void setIntendedRoute(IntendedRoute intendedRoute) { this.intendedRoute = intendedRoute; }

    public List<Ingredient> getIngredients() { return ingredients; }
    public void setIngredients(List<Ingredient> ingredients) { this.ingredients = ingredients; }

    public List<Monograph> getMonograph() { return monograph; }
    public void setMonograph(List<Monograph> monograph) { this.monograph = monograph; }

    public AssociatedMedication getAssociatedMedication() { return associatedMedication; }
    public void setAssociatedMedication(AssociatedMedication associatedMedication) { this.associatedMedication = associatedMedication; }

    public ProductType getProductType() { return productType; }
    public void setProductType(ProductType productType) { this.productType = productType; }

    public List<RelatedMedicationKnowledge> getRelatedMedicationKnowledge() { return relatedMedicationKnowledge; }
    public void setRelatedMedicationKnowledge(List<RelatedMedicationKnowledge> relatedMedicationKnowledge) { this.relatedMedicationKnowledge = relatedMedicationKnowledge; }

    public Text getText() { return text; }
    public void setText(Text text) { this.text = text; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getResourceType() { return resourceType; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Amount getAmount() { return amount; }
    public void setAmount(Amount amount) { this.amount = amount; }

    public Code getCode() { return code; }
    public void setCode(Code code) { this.code = code; }

    public DoseForm getDoseForm() { return doseForm; }
    public void setDoseForm(DoseForm doseForm) { this.doseForm = doseForm; }

    public List<Contained> getContained() { return contained; }
    public void setContained(List<Contained> contained) { this.contained = contained; }

    public List<String> getSynonym() { return synonym; }
    public void setSynonym(List<String> synonym) { this.synonym = synonym; }

    public Manufacturer getManufacturer() { return manufacturer; }
    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
