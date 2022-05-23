package com.ibm.pojo.ImmunizationRecommendationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Recommendation {
    public List<VaccineCode> vaccineCode;
    public ForecastStatus forecastStatus;
    public List<DateCriterion> dateCriterion;
    public String description;
    public String series;
    public int doseNumberPositiveInt;
    public int seriesDosesPositiveInt;
    public List<SupportingImmunization> supportingImmunization;
    public List<SupportingPatientInformation> supportingPatientInformation;

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public ForecastStatus getForecastStatus() { return forecastStatus; }

    public void setForecastStatus(ForecastStatus forecastStatus) { this.forecastStatus = forecastStatus; }

    public int getDoseNumberPositiveInt() { return doseNumberPositiveInt; }

    public void setDoseNumberPositiveInt(int doseNumberPositiveInt) { this.doseNumberPositiveInt = doseNumberPositiveInt; }

    public int getSeriesDosesPositiveInt() { return seriesDosesPositiveInt; }

    public void setSeriesDosesPositiveInt(int seriesDosesPositiveInt) { this.seriesDosesPositiveInt = seriesDosesPositiveInt; }

    public List<DateCriterion> getDateCriterion() { return dateCriterion; }

    public void setDateCriterion(List<DateCriterion> dateCriterion) { this.dateCriterion = dateCriterion; }

    public List<SupportingImmunization> getSupportingImmunization() { return supportingImmunization; }

    public void setSupportingImmunization(List<SupportingImmunization> supportingImmunization) { this.supportingImmunization = supportingImmunization; }

    public List<SupportingPatientInformation> getSupportingPatientInformation() { return supportingPatientInformation; }

    public void setSupportingPatientInformation(List<SupportingPatientInformation> supportingPatientInformation) { this.supportingPatientInformation = supportingPatientInformation; }

    public List<VaccineCode> getVaccineCode() { return vaccineCode; }

    public void setVaccineCode(List<VaccineCode> vaccineCode) { this.vaccineCode = vaccineCode; }

    public String getSeries() { return series; }

    public void setSeries(String series) { this.series = series; }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
