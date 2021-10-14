package com.ibm.panache;

import com.ibm.domain.*;
import com.ibm.r3.bundle.domain.CdaBundle;
import com.ibm.r3.bundle.domain.Entry;
import com.ibm.r3.bundle.domain.Resource;
import com.mongodb.MongoWriteException;
import io.smallrye.common.annotation.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@ApplicationScoped
public class FhirStorage {

    @Incoming("fhirsvr_allergyintolerance")
    @Blocking
    public void saveData(AllergyIntolerance fhirRequest) {
        if (null != fhirRequest) {
            AllergyIntoleranceEntity fhirRequestEntity = new AllergyIntoleranceEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.category = fhirRequest.category;
            fhirRequestEntity.criticality = getValue(fhirRequest.criticality);
            fhirRequestEntity.recordedDate = getDate(fhirRequest.recordedDate);
            fhirRequestEntity.resourceType = getValue(fhirRequest.resourceType);
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.clinicalStatus = getClinicalStatusEntity(fhirRequest.clinicalStatus);
            fhirRequestEntity.patient = getPatientEntity(fhirRequest.patient);
            fhirRequestEntity.reaction = getReactionEntities(fhirRequest.reaction);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.verificationStatus = getVerificationStatusEntity(fhirRequest.verificationStatus);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }



    @Incoming("fhirsvr_careplan")
    @Blocking
    public void saveData(CarePlan fhirRequest) {
        if (null != fhirRequest) {
            CarePlanEntity fhirRequestEntity = new CarePlanEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.status = fhirRequest.status;
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.intent = fhirRequest.intent;
            fhirRequestEntity.category = getCategoryEntities(fhirRequest.category);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_condition")
    @Blocking
    public void saveData(Condition fhirRequest) {
        if (null != fhirRequest) {
            ConditionEntity  fhirRequestEntity = new ConditionEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.clinicalStatus = getClinicalStatusEntity(fhirRequest.clinicalStatus);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.verificationStatus = getVerificationStatusEntity(fhirRequest.verificationStatus);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.category = getCategoryEntities(fhirRequest.category);
            fhirRequestEntity.onsetDateTime = fhirRequest.onsetDateTime;

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_clinicalimpression")
    @Blocking
    public void saveData(ClinicalImpression fhirRequest) {
        if (null != fhirRequest) {
            ClinicalImpressionEntity  fhirRequestEntity = new ClinicalImpressionEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.effectivePeriod = getEffectivePeriodEntity(fhirRequest.effectivePeriod);
            fhirRequestEntity.assessor = getAssessorEntity(fhirRequest.assessor);
            fhirRequestEntity.date = getDate(fhirRequest.date);
            fhirRequestEntity.encounter = getEncounterEntity(fhirRequest.encounter);
            fhirRequestEntity.finding = getFindingEntities(fhirRequest.finding);
            fhirRequestEntity.identifier = getIdentifierEntities(fhirRequest.identifier);
            fhirRequestEntity.problem = getProblemEntities(fhirRequest.problem);
            fhirRequestEntity.summary = fhirRequest.summary;
            fhirRequestEntity.description = fhirRequest.description;
            fhirRequestEntity.investigation = getInvestigationEntities(fhirRequest.investigation);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_diagnosticreport")
    @Blocking
    public void saveData(DiagnosticReport fhirRequest) {
        if (null != fhirRequest) {
            DiagnosticReportEntity fhirRequestEntity = new DiagnosticReportEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.meta = getMetaEntity(fhirRequest.meta);
            fhirRequestEntity.category = getCategoryEntities(fhirRequest.category);
            fhirRequestEntity.effectiveDateTime = getDate(fhirRequest.effectiveDateTime);
            fhirRequestEntity.presentedForm = getPresentedFormEntities(fhirRequest.presentedForm);
            fhirRequestEntity.issued = getDate(fhirRequest.issued);
            fhirRequestEntity.performer = getPerformerEntities(fhirRequest.performer);
            fhirRequestEntity.result = getResultsEntities(fhirRequest.result);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_encounter")
    @Blocking
    public void saveData(EncounterInfo fhirRequest) {
        if (null != fhirRequest) {
            EncounterInfoEntity fhirRequestEntity = new EncounterInfoEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.classInfo = getClassInfoEntity(fhirRequest.classInfo);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_goal")
    @Blocking
    public void saveData(Goal fhirRequest) {
        if (null != fhirRequest) {
            GoalEntity fhirRequestEntity = new GoalEntity();
            fhirRequestEntity.id = fhirRequest.id;

            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.lifecycleStatus = fhirRequest.lifecycleStatus;
            fhirRequestEntity.description = getDescriptionEntity(fhirRequest.description);
            fhirRequestEntity.target = getTargetEntities(fhirRequest.target);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_immunization")
    @Blocking
    public void saveData(Immunization fhirRequest) {
        if (null != fhirRequest) {
            ImmunizationEntity fhirRequestEntity = new ImmunizationEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.vaccineCode = getVaccineCodeEntity(fhirRequest.vaccineCode);
            fhirRequestEntity.occurrenceDateTime = getValue(fhirRequest.occurrenceDateTime);
            fhirRequestEntity.primarySource = fhirRequest.primarySource;
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_location")
    @Blocking
    public void saveData(Location fhirRequest) {
        if (null != fhirRequest) {
            LocationEntity fhirRequestEntity = new LocationEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.name = fhirRequest.name;
            fhirRequestEntity.description = fhirRequest.description;
            fhirRequestEntity.identifier = getIdentifierEntities(fhirRequest.identifier);
            fhirRequestEntity.telecom = getTelecomEntities(fhirRequest.telecom);
            fhirRequestEntity.address = getAddressEntity(fhirRequest.address);
            fhirRequestEntity.position = getPositionEntity(fhirRequest.position);
            fhirRequestEntity.managingOrganization = getManagingOrganizationEntity(fhirRequest.managingOrganization);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("fhirsvr_patient")
    @Blocking
    public void saveData(PatientInfo fhirRequest) {
        if (null != fhirRequest) {
            PatientInfoEntity fhirRequestEntity = new PatientInfoEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.name = getNamesEntities(fhirRequest.name);
            fhirRequestEntity.identifier = getIdentifierEntities(fhirRequest.identifier);
            fhirRequestEntity.telecom = getTelecomEntities(fhirRequest.telecom);
            fhirRequestEntity.address = getAddressEntities(fhirRequest.address);
            fhirRequestEntity.birthDate = getValue(fhirRequest.birthDate);
            fhirRequestEntity.gender = fhirRequest.gender;
            fhirRequestEntity.active = fhirRequest.active;
            fhirRequestEntity.extension = Collections.EMPTY_LIST;
            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }


    @Incoming("fhirsvr_observation")
    @Blocking
    public void saveData(Observation fhirRequest) {
        if (null != fhirRequest) {
            ObservationEntity fhirRequestEntity = new ObservationEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.category = Collections.EMPTY_LIST;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.component = Collections.EMPTY_LIST;
            fhirRequestEntity.status = getValue(fhirRequest.status);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.effectiveDateTime = getDate(fhirRequest.effectivePeriod.start);
            fhirRequestEntity.valueQuantity = getValueQuantityEntity(fhirRequest.valueQuantity);
            fhirRequestEntity.referenceRange = getReferenceRangeEntities(fhirRequest.referenceRange);

            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    @Incoming("mctn_mms_ccda")
    @Blocking
    public void saveData(CdaBundle cdaBundle) {
        if (null != cdaBundle){
            System.out.println("cdaBundle resourceType:" + cdaBundle.resourceType);
            List<Entry> entryList = cdaBundle.entry;
            System.out.println(cdaBundle.entry.size());
            if(null !=  entryList && entryList.size() > 0){
                for (Entry entry: entryList) {
                    System.out.println(entry.resource.resourceType);
                    switch (entry.resource.resourceType) {
                        case "Patient":
                            savePatient(entry.resource);
                            break;
                        case "AllergyIntolerance":
                            saveAllergyIntolerance(entry.resource);
                            break;
                        case "Observation":
                            saveObservation(entry.resource);
                            break;
                        case "Encounter":
                            saveEncounter(entry.resource);
                            break;
                        case "Condition":
                            saveCondition(entry.resource);
                            break;
                        case "Immunization":
                            saveImmunization(entry.resource);
                            break;
                        default:
                            System.out.println(entry.resource.resourceType);
                    }
                }

            }
        }
    }

    private void saveImmunization(Resource resource){
        ImmunizationEntity fhirRequestEntity = new ImmunizationEntity();
        fhirRequestEntity.id = resource.id;
        fhirRequestEntity.resourceType = resource.resourceType;
        fhirRequestEntity.vaccineCode = getCdaVaccineCodeEntity(resource.vaccineCode);
        fhirRequestEntity.occurrenceDateTime = getValue(resource.assertedDate);
        fhirRequestEntity.primarySource = resource.primarySource;
        fhirRequestEntity.text = getCdaTextEntity(resource.text);

        try {
            fhirRequestEntity.persist();
        } catch (MongoWriteException e){
            fhirRequestEntity.update();
        }
    }

    private VaccineCodeEntity getCdaVaccineCodeEntity(com.ibm.r3.bundle.domain.VaccineCode vaccineCode){
        if(null == vaccineCode){
            return null;
        }
        VaccineCodeEntity vaccineCodeEntity = new VaccineCodeEntity();
        vaccineCodeEntity.coding = getCdaCodingEntities(vaccineCode.coding);
        return vaccineCodeEntity;
    }

    private void saveCondition(Resource resource){
        ConditionEntity  fhirRequestEntity = new ConditionEntity();
        fhirRequestEntity.id = resource.id;
        fhirRequestEntity.resourceType = resource.resourceType;
        // fhirRequestEntity.code = getCdaCodeEntity(resource.code);
        fhirRequestEntity.clinicalStatus = getCdaClinicalStatusEntity(resource.clinicalStatus);
        fhirRequestEntity.text = getCdaTextEntity(resource.text);
        fhirRequestEntity.verificationStatus = getCdaVerificationStatusEntity(resource.verificationStatus);
        fhirRequestEntity.subject = getCdaSubjectEntity(resource.subject);
        List<Object> category = resource.category;
        fhirRequestEntity.category = getCdaCategoryEntities(resource.category);
        fhirRequestEntity.onsetDateTime = resource.onsetDateTime;

        try {
            fhirRequestEntity.persist();
        } catch (MongoWriteException e){
            fhirRequestEntity.update();
        }
    }

    private List<CategoryEntity> getCdaCategoryEntities(List<Object> categories){
        List<CategoryEntity> typeEntityList  = Collections.EMPTY_LIST;
        if (null != categories && categories.size() > 0) {
            typeEntityList = new ArrayList<>(categories.size());
            for (Object obj : categories) {
                if(obj instanceof Category){
                    com.ibm.r3.bundle.domain.Category category =  (com.ibm.r3.bundle.domain.Category)obj;
                    CategoryEntity categoryEntity = new CategoryEntity();
                    categoryEntity.coding = getCdaCodingEntities(category.coding);
                    typeEntityList.add(categoryEntity);
                }

            }
        }
        return typeEntityList;
    }

    private void saveEncounter(Resource resource){
        EncounterInfoEntity fhirRequestEntity = new EncounterInfoEntity();
        fhirRequestEntity.id = resource.id;
        fhirRequestEntity.resourceType = resource.resourceType;
        fhirRequestEntity.meta = getCdaMetaEntity(resource.meta);
        fhirRequestEntity.status = resource.status;
        fhirRequestEntity.text = getTextEntity(null);
        fhirRequestEntity.classInfo = getClassInfoEntity(null);
        fhirRequestEntity.subject = getCdaSubjectEntity(resource.subject);
        fhirRequestEntity.period = getCdaPeriodEntity(resource.period);
        if (resource.type instanceof List){
           // fhirRequestEntity.type = getCdaTypeEntity(resource.type);
        }


        try {
            fhirRequestEntity.persist();
        } catch (MongoWriteException e){
            fhirRequestEntity.update();
        }
    }

    private PeriodEntity getCdaPeriodEntity(com.ibm.r3.bundle.domain.Period period){
        if(null == period){
            return null;
        }
        PeriodEntity periodEntity = new PeriodEntity();
        periodEntity.end = getValue(period.end);
        periodEntity.start = getValue(period.start);
        return periodEntity;
    }

    private List<TypeEntity> getCdaTypeEntity(List<com.ibm.r3.bundle.domain.Type> types){
        List<TypeEntity> typeEntityList  = Collections.EMPTY_LIST;
        if (null != types && types.size() > 0) {
            typeEntityList = new ArrayList<>(types.size());
            for (com.ibm.r3.bundle.domain.Type type : types) {
                TypeEntity typeEntity = new TypeEntity();
                typeEntity.coding = getCdaCodingEntities(type.coding);
                typeEntity.text = getValue(type.text);
                typeEntityList.add(typeEntity);
            }
        }
        return typeEntityList;
    }

    private MetaEntity getCdaMetaEntity(com.ibm.r3.bundle.domain.Meta meta){
        if(null == meta){
            return null;
        }
        MetaEntity metaEntity = new MetaEntity();
        metaEntity.profile = meta.profile;
        metaEntity.extension = Collections.EMPTY_LIST;
        return metaEntity;
    }


    private void saveObservation(Resource resource){
        ObservationEntity fhirRequestEntity = new ObservationEntity();
        fhirRequestEntity.id = resource.id;
        fhirRequestEntity.resourceType = resource.resourceType;
        fhirRequestEntity.text = getCdaTextEntity(resource.text);
        fhirRequestEntity.category = Collections.EMPTY_LIST;
        // fhirRequestEntity.code = getCdaCodeEntity(resource.code);
        fhirRequestEntity.component = Collections.EMPTY_LIST;
        fhirRequestEntity.status = getValue(resource.status);
        fhirRequestEntity.subject = getCdaSubjectEntity(resource.subject);
        fhirRequestEntity.effectiveDateTime = getDate(resource.effectivePeriod.start);
        fhirRequestEntity.valueQuantity = getCdaValueQuantityEntity(resource.valueQuantity);
        fhirRequestEntity.referenceRange = Collections.EMPTY_LIST;
        try {
            fhirRequestEntity.persist();
        } catch (MongoWriteException e){
            fhirRequestEntity.update();
        }
    }

    private ValueQuantityEntity getCdaValueQuantityEntity(com.ibm.r3.bundle.domain.ValueQuantity valueQuantity){
        if(null == valueQuantity){
            return null;
        }
        ValueQuantityEntity valueQuantityEntity = new ValueQuantityEntity();
        valueQuantityEntity.code = getValue(null);
        valueQuantityEntity.value = valueQuantity.value;
        valueQuantityEntity.unit = getValue(valueQuantity.unit);
        valueQuantityEntity.system = getValue(null);
        return valueQuantityEntity;
    }

    private SubjectEntity getCdaSubjectEntity(com.ibm.r3.bundle.domain.Subject subject){
        if(null == subject){
            return null;
        }
        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.display = getValue(subject.display);
        subjectEntity.reference = getValue(subject.reference);
        return subjectEntity;
    }

    private CodeEntity getCdaCodeEntity(com.ibm.r3.bundle.domain.Code code){
        if(null == code){
            return null;
        }
        CodeEntity codeEntity = new CodeEntity();
        codeEntity.coding = getCdaCodingEntities(code.coding);
        return codeEntity;
    }


    private void savePatient(Resource resource){
        PatientInfoEntity fhirRequestEntity = new PatientInfoEntity();
        fhirRequestEntity.id = resource.id;
        fhirRequestEntity.resourceType = resource.resourceType;
        fhirRequestEntity.text = getCdaTextEntity(resource.text);
        // fhirRequestEntity.name = getCdaNamesEntities(resource.name);
        fhirRequestEntity.identifier = Collections.EMPTY_LIST;
        fhirRequestEntity.telecom = getCdaTelecomEntities(resource.telecom);
        fhirRequestEntity.address = getCdaAddressEntities(resource.address);
        fhirRequestEntity.birthDate = getValue(resource.birthDate);
        fhirRequestEntity.gender = resource.gender;
        fhirRequestEntity.extension = Collections.EMPTY_LIST;
        try {
            fhirRequestEntity.persist();
        } catch (MongoWriteException e){
            fhirRequestEntity.update();
        }
    }

    private List<TelecomEntity> getCdaTelecomEntities(List<com.ibm.r3.bundle.domain.Telecom> telecoms){
        List<TelecomEntity> telecomEntityList = Collections.EMPTY_LIST;
        if (null != telecoms && telecoms.size() > 0) {
            telecomEntityList = new ArrayList<>(telecoms.size());
            for (com.ibm.r3.bundle.domain.Telecom telecom : telecoms) {
                TelecomEntity telecomEntity = new TelecomEntity();
                telecomEntity.system = getValue(telecom.system);
                telecomEntity.value = getValue(telecom.value);
                telecomEntityList.add(telecomEntity);
            }
        }
        return telecomEntityList;
    }

    private List<AddressEntity> getCdaAddressEntities(List<com.ibm.r3.bundle.domain.Address> addresses){
        List<AddressEntity> addressEntityList = Collections.EMPTY_LIST;
        if (null != addresses && addresses.size() > 0) {
            addressEntityList = new ArrayList<>(addresses.size());
            for (com.ibm.r3.bundle.domain.Address address : addresses) {
                AddressEntity addressEntity = new AddressEntity();
                addressEntity.state = getValue(address.state);
                addressEntity.line = address.line;
                addressEntity.country = getValue(address.country);
                addressEntity.city = getValue(address.city);
                addressEntityList.add(addressEntity);
            }
        }
        return addressEntityList;
    }
    private List<IdentifierEntity> getCdaIdentifierEntities(List<com.ibm.r3.bundle.domain.Identifier> identifiers){
        List<IdentifierEntity> identifierEntityList = Collections.EMPTY_LIST;
        if (null != identifiers && identifiers.size() > 0) {
            identifierEntityList = new ArrayList<>(identifiers.size());
            for (com.ibm.r3.bundle.domain.Identifier identifier : identifiers) {
                IdentifierEntity identifierEntity = new IdentifierEntity();
                identifierEntity.value = getValue(identifier.value);
                identifierEntityList.add(identifierEntity);
            }
        }
        return identifierEntityList;
    }
    private List<NameEntity> getCdaNamesEntities(List<com.ibm.r3.bundle.domain.Name> names){
        List<NameEntity> nameEntityList = Collections.EMPTY_LIST;
        if (null != names && names.size() > 0) {
            nameEntityList = new ArrayList<>(names.size());
            for (com.ibm.r3.bundle.domain.Name name : names) {
                NameEntity nameEntity = new NameEntity();
                nameEntity.family = getValue(name.family);
                nameEntity.given = name.given;
                nameEntity.period = getPeriodEntity(null);
                nameEntity.suffix = Collections.EMPTY_LIST;

                nameEntityList.add(nameEntity);
            }
        }
        return nameEntityList;
    }

    private TextEntity getCdaTextEntity(com.ibm.r3.bundle.domain.Text text){
        if(null == text){
            return null;
        }
        TextEntity textEntity = new TextEntity();
        textEntity.div = getValue(text.div);
        textEntity.status = getValue(text.status);
        return textEntity;
    }
    private TextEntity getCdaTextEntity(String status){
        if(null == status){
            return null;
        }
        TextEntity textEntity = new TextEntity();
        textEntity.div = getValue(null);
        textEntity.status = getValue(status);
        return textEntity;
    }
    private void saveAllergyIntolerance(Resource resource){

        AllergyIntoleranceEntity fhirRequestEntity = new AllergyIntoleranceEntity();
        fhirRequestEntity.id = resource.id;
        fhirRequestEntity.category = getCdaStringCategory(resource.category);
        fhirRequestEntity.criticality = getValue(null);
        fhirRequestEntity.recordedDate = resource.onsetDateTime;
        fhirRequestEntity.resourceType = getValue(resource.resourceType);
        fhirRequestEntity.clinicalStatus = getCdaClinicalStatusEntity(resource.clinicalStatus);
        fhirRequestEntity.patient = getCdaPatientEntity(resource.patient);
        fhirRequestEntity.reaction = getCdaReactionEntities(resource.reaction);
        fhirRequestEntity.text = getCdaTextEntity(resource.text);
        fhirRequestEntity.verificationStatus = getCdaVerificationStatusEntity(resource.verificationStatus);
        fhirRequestEntity.status = resource.clinicalStatus;


        try {
            fhirRequestEntity.persist();
        } catch (MongoWriteException e){
            fhirRequestEntity.update();
        }
    }
    private  List<String> getCdaStringCategory( List<Object> categories){
        List<String> typeEntityList  = Collections.EMPTY_LIST;
        if (null != categories && categories.size() > 0) {
            typeEntityList = new ArrayList<>(categories.size());
            for (Object obj : categories) {
                if(obj instanceof String){
                    typeEntityList.add(obj.toString());
                }
            }
        }
        return typeEntityList;
    }

    private VerificationStatusEntity getCdaVerificationStatusEntity(String verificationStatus){
        if(null == verificationStatus){
            return null;
        }
        VerificationStatusEntity verificationStatusEntity = new VerificationStatusEntity();
        CodingEntity codingEntity = new CodingEntity();
        codingEntity.display = verificationStatus;
        List<CodingEntity> codingEntityList = new ArrayList<>(1);
        codingEntityList.add(codingEntity);
        verificationStatusEntity.coding =  codingEntityList;
        return verificationStatusEntity;
    }

    private List<ReactionEntity> getCdaReactionEntities(List<com.ibm.r3.bundle.domain.Reaction> reactions){
        List<ReactionEntity> reactionEntities = Collections.EMPTY_LIST;
        if (null != reactions && reactions.size() > 0) {
            reactionEntities = new ArrayList<>(reactions.size());
            for (com.ibm.r3.bundle.domain.Reaction reaction : reactions) {
                ReactionEntity reactionEntity = new ReactionEntity();
                reactionEntity.manifestation = getCdaMainfestationEntities(reaction.manifestation);
                reactionEntity.severity = getValue(reaction.severity);
                reactionEntities.add(reactionEntity);
            }
        }
        return reactionEntities;
    }

    private List<ManifestationEntity> getCdaMainfestationEntities(List<com.ibm.r3.bundle.domain.Manifestation> manifestations){
        List<ManifestationEntity> manifestationEntities = Collections.EMPTY_LIST;
        if (null != manifestations && manifestations.size() > 0) {
            manifestationEntities = new ArrayList<>(manifestations.size());
            for (com.ibm.r3.bundle.domain.Manifestation manifestation : manifestations) {
                ManifestationEntity manifestationEntity = new ManifestationEntity();
                manifestationEntity.coding = getCdaCodingEntities(manifestation.coding);
                manifestationEntities.add(manifestationEntity);
            }
        }
        return manifestationEntities;
    }

    private List<CodingEntity> getCdaCodingEntities(List<com.ibm.r3.bundle.domain.Coding> codings){
        List<CodingEntity> codingEntities = Collections.EMPTY_LIST;
        if (null != codings && codings.size() > 0) {
            codingEntities = new ArrayList<>(codings.size());
            for (com.ibm.r3.bundle.domain.Coding coding : codings) {
                CodingEntity codingEntity = new CodingEntity();
                codingEntity.code = getValue(coding.code);
                codingEntity.display = getValue(coding.display);
                codingEntity.system = getValue(coding.system);
                codingEntities.add(codingEntity);
            }
        }
        return codingEntities;
    }

    private PatientEntity getCdaPatientEntity(com.ibm.r3.bundle.domain.Patient patient){
        if(null == patient){
            return null;
        }
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.reference = getValue(patient.reference);
        return patientEntity;
    }

    private ClinicalStatusEntity getCdaClinicalStatusEntity(String clinicalStatus){
        if(null == clinicalStatus){
            return null;
        }
        ClinicalStatusEntity clinicalStatusEntity = new ClinicalStatusEntity();
        clinicalStatusEntity.coding = getCodingEntities(null);
        return clinicalStatusEntity;
    }

    private CodeEntity getCdaCodeEntity(com.ibm.r3.bundle.domain.Coding code){
        if(null == code){
            return null;
        }
        CodeEntity codeEntity = new CodeEntity();
        codeEntity.coding = getCdaCodingEntities(code);
        return codeEntity;
    }

    private List<CodingEntity> getCdaCodingEntities(com.ibm.r3.bundle.domain.Coding coding){
        List<CodingEntity> codingEntities = Collections.EMPTY_LIST;
        if (null != coding ) {
            codingEntities = new ArrayList<>(1);
            CodingEntity codingEntity = new CodingEntity();
            codingEntity.code = getValue(coding.code);
            codingEntity.display = getValue(coding.display);
            codingEntity.system = getValue(coding.system);
            codingEntities.add(codingEntity);
        }
        return codingEntities;
    }

    private List<ReferenceRangeEntity> getReferenceRangeEntities(List<ReferenceRange> referenceRanges){
        List<ReferenceRangeEntity> referenceRangeEntityList = Collections.EMPTY_LIST;
        if (null != referenceRanges && referenceRanges.size() > 0) {
            referenceRangeEntityList = new ArrayList<>(referenceRanges.size());
            for (ReferenceRange referenceRange : referenceRanges) {
                ReferenceRangeEntity referenceRangeEntity = new ReferenceRangeEntity();
                referenceRangeEntity.appliesTo = Collections.EMPTY_LIST;
                referenceRangeEntity.low = getLowEntity(referenceRange.low);
                referenceRangeEntity.high = getHighEntity(referenceRange.high);
                referenceRangeEntityList.add(referenceRangeEntity);
            }
        }
        return referenceRangeEntityList;
    }

    private LowEntity getLowEntity(Low low){
        if(null == low){
            return null;
        }
        LowEntity lowEntity = new LowEntity();
        lowEntity.code = getValue(low.code);
        lowEntity.value = low.value;
        lowEntity.unit = getValue(low.unit);
        lowEntity.system = getValue(low.system);
        return lowEntity;
    }

    private HighEntity getHighEntity(High high){
        if(null == high){
            return null;
        }
        HighEntity highEntity = new HighEntity();
        highEntity.code = getValue(high.code);
        highEntity.value = high.value;
        highEntity.unit = getValue(high.unit);
        highEntity.system = getValue(high.system);
        return highEntity;
    }


    private ValueQuantityEntity getValueQuantityEntity(ValueQuantity valueQuantity){
        if(null == valueQuantity){
            return null;
        }
        ValueQuantityEntity valueQuantityEntity = new ValueQuantityEntity();
        valueQuantityEntity.code = getValue(valueQuantity.code);
        valueQuantityEntity.value = valueQuantity.value;
        valueQuantityEntity.unit = getValue(valueQuantity.unit);
        valueQuantityEntity.system = getValue(valueQuantity.system);
        return valueQuantityEntity;
    }

    private List<AddressEntity> getAddressEntities( List<Address> addresses){
        List<AddressEntity> addressEntityList = Collections.EMPTY_LIST;
        if (null != addresses && addresses.size() > 0) {
            addressEntityList = new ArrayList<>(addresses.size());
            for (Address address : addresses) {
                AddressEntity addressEntity = new AddressEntity();
                addressEntity.state = getValue(address.state);
                addressEntity.line = address.line;
                addressEntity.country = getValue(address.country);
                addressEntity.city = getValue(address.city);
                addressEntityList.add(addressEntity);
            }
        }
        return addressEntityList;
    }

    private  List<NameEntity> getNamesEntities(List<Name> names){
        List<NameEntity> nameEntityList = Collections.EMPTY_LIST;
        if (null != names && names.size() > 0) {
            nameEntityList = new ArrayList<>(names.size());
            for (Name name : names) {
                NameEntity nameEntity = new NameEntity();
                nameEntity.family = getValue(name.family);
                nameEntity.given = name.given;
                nameEntity.period = getPeriodEntity(name.period);
                nameEntity.suffix = Collections.EMPTY_LIST;

                nameEntityList.add(nameEntity);
            }
        }
        return nameEntityList;
    }

    private PeriodEntity getPeriodEntity(Period period){
        if(null == period){
            return null;
        }
        PeriodEntity periodEntity = new PeriodEntity();
        periodEntity.end = getValue(getDate(period.end));
        periodEntity.start = getValue(getDate(period.start));
        return periodEntity;
    }
    private String getValue(String value){
        if (null == value){
            return "unknown";
        }
        return value;
    }

    private ManagingOrganizationEntity getManagingOrganizationEntity(ManagingOrganization managingOrganization){
        if(null == managingOrganization){
            return null;
        }
        ManagingOrganizationEntity managingOrganizationEntity = new ManagingOrganizationEntity();
        managingOrganizationEntity.display = getValue(managingOrganization.display);
        return managingOrganizationEntity;
    }

    private PositionEntity getPositionEntity(Position position){
        if(null == position){
            return null;
        }
        PositionEntity positionEntity = new PositionEntity();
        positionEntity.latitude = position.latitude;
        positionEntity.longitude = position.longitude;
        return positionEntity;
    }

    private AddressEntity getAddressEntity(Address address){
        if(null == address){
            return null;
        }
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.city = getValue(address.city);
        addressEntity.country = getValue(address.country);
        addressEntity.line = address.line;
        addressEntity.state = getValue(address.state);
        return addressEntity;
    }

    private List<TelecomEntity> getTelecomEntities(List<Telecom> telecoms){
        List<TelecomEntity> telecomEntityList = Collections.EMPTY_LIST;
        if (null != telecoms && telecoms.size() > 0) {
            telecomEntityList = new ArrayList<>(telecoms.size());
            for (Telecom telecom : telecoms) {
                TelecomEntity telecomEntity = new TelecomEntity();
                telecomEntity.system = getValue(telecom.system);
                telecomEntity.value = getValue(telecom.value);
                telecomEntityList.add(telecomEntity);
            }
        }
        return telecomEntityList;
    }

    private VaccineCodeEntity getVaccineCodeEntity(VaccineCode vaccineCode){
        if(null == vaccineCode){
            return null;
        }
        VaccineCodeEntity vaccineCodeEntity = new VaccineCodeEntity();
        vaccineCodeEntity.coding = getCodingEntities(vaccineCode.coding);
        return vaccineCodeEntity;
    }

    private List<TargetEntity> getTargetEntities(List<Target> targets){
        List<TargetEntity> targetEntityList = Collections.EMPTY_LIST;
        if (null != targets && targets.size() > 0) {
            targetEntityList = new ArrayList<>(targets.size());
            for (Target target : targets) {
                TargetEntity targetEntity  = new TargetEntity();
                targetEntity.dueDate = getValue(target.dueDate);
                targetEntityList.add(targetEntity);
            }
        }
        return targetEntityList;
    }

    private DescriptionEntity getDescriptionEntity(Description description){
        if(null == description){
            return null;
        }
        DescriptionEntity descriptionEntity = new DescriptionEntity();
        descriptionEntity.text = getValue(description.text);
        return descriptionEntity;
    }

    private List<TypeEntity> getTypeEntities( List<Type> types){
        List<TypeEntity> typeEntityList = Collections.EMPTY_LIST;
        if (null != types && types.size() > 0) {
            typeEntityList = new ArrayList<>(types.size());
            for (Type type : types) {
                TypeEntity typeEntity = new TypeEntity();
                typeEntity.coding = getCodingEntities(type.coding);
                typeEntity.text = getValue(type.text);
                typeEntityList.add(typeEntity);
            }
        }
        return typeEntityList;
    }

    private ClassInfoEntity getClassInfoEntity(ClassInfo classInfo){
        if(null == classInfo){
            return null;
        }
        ClassInfoEntity classInfoEntity = new ClassInfoEntity();
        classInfoEntity.code = getValue(classInfo.code);
        classInfoEntity.display = getValue(classInfo.display);
        classInfoEntity.system = getValue(classInfo.system);
        return classInfoEntity;
    }

    private List<ResultEntity> getResultsEntities(List<Result> results){
        List<ResultEntity> resultEntityList = Collections.EMPTY_LIST;
        if (null != results && results.size() > 0) {
            resultEntityList = new ArrayList<>(results.size());
            for (Result result : results) {
                ResultEntity resultEntity = new ResultEntity();
                resultEntity.display = getValue(result.display);
                resultEntity.reference = getValue(result.reference);
                resultEntityList.add(resultEntity);
            }
        }
        return resultEntityList;
    }

    private List<PerformerEntity> getPerformerEntities(List<Performer> performers){
        List<PerformerEntity> performerEntityList = Collections.EMPTY_LIST;
        if (null != performers && performers.size() > 0) {
            performerEntityList = new ArrayList<>(performers.size());
            for (Performer performer : performers) {
                PerformerEntity performerEntity = new PerformerEntity();
                performerEntity.display = getValue(performer.display);
                performerEntity.reference = getValue(performer.display);
                performerEntityList.add(performerEntity);
            }
        }
        return performerEntityList;
    }


    private List<PresentedFormEntity> getPresentedFormEntities(List<PresentedForm> presentedForms){
        List<PresentedFormEntity> presentedFormEntityList = Collections.EMPTY_LIST;
        if (null != presentedForms && presentedForms.size() > 0) {
            presentedFormEntityList = new ArrayList<>(presentedForms.size());
            for (PresentedForm presentedForm : presentedForms) {
                PresentedFormEntity presentedFormEntity = new PresentedFormEntity();
                presentedFormEntity.contentType = getValue(presentedForm.contentType);
                presentedFormEntity.hash = getValue(presentedForm.hash);
                presentedFormEntity.url = getValue(presentedForm.url);
                presentedFormEntity.data = getValue(presentedForm.data);
                presentedFormEntityList.add(presentedFormEntity);

            }
        }
        return presentedFormEntityList;
    }

    private  List<InvestigationEntity> getInvestigationEntities(List<Investigation> investigations){
        List<InvestigationEntity> investigationEntityList = Collections.EMPTY_LIST;
        if (null != investigations && investigations.size() > 0) {
            investigationEntityList = new ArrayList<>(investigations.size());
            for (Investigation investigation : investigations) {
                InvestigationEntity investigationEntity = new InvestigationEntity();
                investigationEntity.item = getItemEntities(investigation.item);
                investigationEntity.code = getCodeEntity(investigation.code);
                investigationEntityList.add(investigationEntity);
            }
        }
        return investigationEntityList;
    }

    private List<ItemEntity> getItemEntities(List<Item> items){
        List<ItemEntity> itemEntityList = Collections.EMPTY_LIST;
        if (null != items && items.size() > 0) {
            itemEntityList = new ArrayList<>(items.size());
            for (Item item : items) {
                ItemEntity itemEntity = new ItemEntity();
                itemEntity.display = getValue(item.display);
                itemEntityList.add(itemEntity);
            }
        }
        return itemEntityList;
    }
    private List<ProblemEntity> getProblemEntities(List<Problem> problems){
        List<ProblemEntity> problemEntityList = Collections.EMPTY_LIST;
        if (null != problems && problems.size() > 0) {
            problemEntityList = new ArrayList<>(problems.size());
            for (Problem problem : problems) {
                ProblemEntity problemEntity = new ProblemEntity();
                problemEntity.display = getValue(problem.display);
                problemEntityList.add(problemEntity);
            }
        }
        return problemEntityList;
    }
    private  List<IdentifierEntity> getIdentifierEntities( List<Identifier> identifiers){
        List<IdentifierEntity> identifierEntityList = Collections.EMPTY_LIST;
        if (null != identifiers && identifiers.size() > 0) {
            identifierEntityList = new ArrayList<>(identifiers.size());
            for (Identifier identifier : identifiers) {
                IdentifierEntity identifierEntity = new IdentifierEntity();
                identifierEntity.value = getValue(identifier.value);
                identifierEntityList.add(identifierEntity);
            }
        }
        return identifierEntityList;
    }

    private List<FindingEntity> getFindingEntities(List<Finding> findings){
        List<FindingEntity> findingEntityList = Collections.EMPTY_LIST;
        if (null != findings && findings.size() > 0) {
            findingEntityList = new ArrayList<>(findings.size());
            for (Finding finding : findings) {
                FindingEntity findingEntity = new FindingEntity();
                findingEntity.itemCodeableConcept = getItemCodeableConceptEntity(finding.itemCodeableConcept);
                findingEntityList.add(findingEntity);
            }
        }
        return findingEntityList;
    }
    private ItemCodeableConceptEntity getItemCodeableConceptEntity(ItemCodeableConcept itemCodeableConcept){
        if(null == itemCodeableConcept){
            return null;
        }

        ItemCodeableConceptEntity itemCodeableConceptEntity = new ItemCodeableConceptEntity();
        itemCodeableConceptEntity.coding = getCodingEntities(itemCodeableConcept.coding);
        return itemCodeableConceptEntity;
    }

    private EncounterEntity getEncounterEntity(Encounter encounter){
        if(null == encounter){
            return null;
        }
        EncounterEntity encounterEntity = new EncounterEntity();
        encounterEntity.reference = getValue(encounter.reference);
        return encounterEntity;
    }
    private AssessorEntity getAssessorEntity(Assessor assessor){
        if(null == assessor){
            return null;
        }
        AssessorEntity assessorEntity = new AssessorEntity();
        assessorEntity.reference = getValue(assessor.reference);
        return assessorEntity;
    }

    private EffectivePeriodEntity getEffectivePeriodEntity(EffectivePeriod effectivePeriod){
        if(null == effectivePeriod){
            return null;
        }
        EffectivePeriodEntity effectivePeriodEntity = new EffectivePeriodEntity();
        effectivePeriodEntity.end = getDate(effectivePeriod.end);
        effectivePeriodEntity.start = getDate(effectivePeriod.start);
        return effectivePeriodEntity;
    }

    private String getDate(Date date){
        if(null == date){
            return null;
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        return dateFormat.format(date);
    }
    private List<CategoryEntity> getCategoryEntities(List<Category> categoryLis){
        List<CategoryEntity> categoryEntities = Collections.EMPTY_LIST;
        if (null != categoryLis && categoryLis.size() > 0) {
            categoryEntities = new ArrayList<>(categoryLis.size());
            for (Category category : categoryLis) {
                CategoryEntity categoryEntity = new CategoryEntity();
                categoryEntity.coding = getCodingEntities(category.coding);
                categoryEntity.text = getValue(category.text);
                categoryEntities.add(categoryEntity);
            }
        }
        return categoryEntities;
    }
    private MetaEntity getMetaEntity(Meta meta){
        if(null == meta){
            return null;
        }
        MetaEntity metaEntity = new MetaEntity();
        metaEntity.extension = getExtensionEntities(meta.extension);
        metaEntity.profile = meta.profile;
        return metaEntity;
    }

    private List<ExtensionEntity> getExtensionEntities(List<Extension> extensions){
        List<ExtensionEntity> extensionEntities = Collections.EMPTY_LIST;
        if (null != extensions && extensions.size() > 0) {
            extensionEntities = new ArrayList<>(extensions.size());
            for (Extension extension : extensions) {
                ExtensionEntity extensionEntity = new ExtensionEntity();
                extensionEntity.url = getValue(extension.url);
                extensionEntity.valueMarkdown = getValue(extension.valueMarkdown);
                extensionEntity.valueString = getValue(extension.valueString);
                extensionEntities.add(extensionEntity);
            }
        }
        return extensionEntities;
    }
    private SubjectEntity getSubjectEntity(Subject subject){
        if(null == subject){
            return null;
        }
        SubjectEntity subjectEntity = new SubjectEntity();
        subjectEntity.display = getValue(subject.display);
        subjectEntity.reference = getValue(subject.reference);
        return subjectEntity;
    }

    private VerificationStatusEntity getVerificationStatusEntity(VerificationStatus verificationStatus){
        if(null == verificationStatus){
            return null;
        }
        VerificationStatusEntity verificationStatusEntity = new VerificationStatusEntity();
        verificationStatusEntity.coding = getCodingEntities(verificationStatus.coding);
        return verificationStatusEntity;
    }

    private TextEntity getTextEntity(Text text){
        if(null == text){
            return null;
        }
        TextEntity textEntity = new TextEntity();
        textEntity.div = getValue(text.div);
        textEntity.status = getValue(text.status);
        return textEntity;
    }

    private List<ReactionEntity> getReactionEntities(List<Reaction> reactions){
        List<ReactionEntity> reactionEntities = Collections.EMPTY_LIST;
        if (null != reactions && reactions.size() > 0) {
            reactionEntities = new ArrayList<>(reactions.size());
            for (Reaction reaction : reactions) {
                ReactionEntity reactionEntity = new ReactionEntity();
                reactionEntity.manifestation = getMainfestationEntities(reaction.manifestation);
                reactionEntity.severity = getValue(reaction.severity);
                reactionEntities.add(reactionEntity);
            }
        }
        return reactionEntities;
    }

    private List<ManifestationEntity> getMainfestationEntities(List<Manifestation> manifestations){
        List<ManifestationEntity> manifestationEntities = Collections.EMPTY_LIST;
        if (null != manifestations && manifestations.size() > 0) {
            manifestationEntities = new ArrayList<>(manifestations.size());
            for (Manifestation manifestation : manifestations) {
                ManifestationEntity manifestationEntity = new ManifestationEntity();
                manifestationEntity.coding = getCodingEntities(manifestation.coding);
                manifestationEntities.add(manifestationEntity);
            }
        }
        return manifestationEntities;
    }


    private PatientEntity getPatientEntity(Patient patient){
        if(null == patient){
            return null;
        }
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.reference = getValue(patient.reference);
        return patientEntity;
    }

    private ClinicalStatusEntity getClinicalStatusEntity(ClinicalStatus clinicalStatus){
        if(null == clinicalStatus){
            return null;
        }
        ClinicalStatusEntity clinicalStatusEntity = new ClinicalStatusEntity();
        clinicalStatusEntity.coding = getCodingEntities(clinicalStatus.coding);
        return clinicalStatusEntity;
    }
    private CodeEntity getCodeEntity(Code code){
        if(null == code){
            return null;
        }
        CodeEntity codeEntity = new CodeEntity();
        codeEntity.coding = getCodingEntities(code.coding);
        return codeEntity;
    }

    private List<CodingEntity> getCodingEntities(List<Coding> codings){
        List<CodingEntity> codingEntities = Collections.EMPTY_LIST;
        if (null != codings && codings.size() > 0) {
            codingEntities = new ArrayList<>(codings.size());
            for (Coding coding : codings) {
                CodingEntity codingEntity = new CodingEntity();
                codingEntity.code = getValue(coding.code);
                codingEntity.display = getValue(coding.display);
                codingEntity.system = getValue(coding.system);
                codingEntities.add(codingEntity);
            }
        }
        return codingEntities;
    }

    private String listToString(List<String> valueList){
        StringBuilder values = new StringBuilder();
        if (null != valueList && valueList.size() > 0){
            for (String value : valueList) {
                values.append(value + " ");
            }
        }
        return values.toString().trim();
    }
}
