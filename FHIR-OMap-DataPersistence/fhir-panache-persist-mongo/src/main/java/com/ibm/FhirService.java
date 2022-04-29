package com.ibm;
import com.ibm.domain.*;
import com.ibm.panache.*;
import com.mongodb.MongoWriteException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class FhirService{} /*{

   // @Transactional
    public void saveData(AllergyIntolerance fhirRequest) {
        if (null != fhirRequest) {
            AllergyIntoleranceEntity fhirRequestEntity = new AllergyIntoleranceEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.category = fhirRequest.category;
            fhirRequestEntity.criticality = fhirRequest.criticality;
            fhirRequestEntity.recordedDate = getDate(fhirRequest.recordedDate);
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.clinicalStatus = getClinicalStatusEntity(fhirRequest.clinicalStatus);
            fhirRequestEntity.patient = getPatientEntity(fhirRequest.patient);
            fhirRequestEntity.reaction = getReactionEntities(fhirRequest.reaction);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.verificationStatus = getVerificationStatusEntity(fhirRequest.verificationStatus);
            fhirRequestEntity.subject = null; //getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.meta = null; // getMetaEntity(fhirRequest.meta);
            fhirRequestEntity.statusCode = null; // fhirRequest.statusCode;
            fhirRequestEntity.intent = null; // fhirRequest.intent;
            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    public void saveData(CarePlan fhirRequest) {
        if (null != fhirRequest) {
            CarePlanEntity fhirRequestEntity = new CarePlanEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.criticality = fhirRequest.criticality;
            fhirRequestEntity.recordedDate = fhirRequest.recordedDate;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.clinicalStatus = getClinicalStatusEntity(fhirRequest.clinicalStatus);
            fhirRequestEntity.reaction = getReactionEntities(fhirRequest.reaction);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.verificationStatus = getVerificationStatusEntity(fhirRequest.verificationStatus);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.meta = getMetaEntity(fhirRequest.meta);
            fhirRequestEntity.status = fhirRequest.status;
            fhirRequestEntity.intent = fhirRequest.intent;
            fhirRequestEntity.category = getCategoryEntities(fhirRequest.category);
            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    public void saveData(Condition fhirRequest) {
        if (null != fhirRequest) {
            ConditionEntity  fhirRequestEntity = new ConditionEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.criticality = fhirRequest.criticality;
            fhirRequestEntity.recordedDate = fhirRequest.recordedDate;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.clinicalStatus = getClinicalStatusEntity(fhirRequest.clinicalStatus);
            fhirRequestEntity.reaction = getReactionEntities(fhirRequest.reaction);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.verificationStatus = getVerificationStatusEntity(fhirRequest.verificationStatus);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.meta = getMetaEntity(fhirRequest.meta);
            fhirRequestEntity.statusCode = fhirRequest.statusCode;
            fhirRequestEntity.intent = fhirRequest.intent;
            fhirRequestEntity.category = getCategoryEntities(fhirRequest.category);
            fhirRequestEntity.onsetDateTime = fhirRequest.onsetDateTime;
            try {
                fhirRequestEntity.persist();
            } catch (MongoWriteException e){
                fhirRequestEntity.update();
            }
        }
    }

    public void saveData(ClinicalImpression fhirRequest) {
        if (null != fhirRequest) {
            ClinicalImpressionEntity  fhirRequestEntity = new ClinicalImpressionEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.criticality = fhirRequest.criticality;
            fhirRequestEntity.recordedDate = fhirRequest.recordedDate;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.clinicalStatus = getClinicalStatusEntity(fhirRequest.clinicalStatus);
            fhirRequestEntity.reaction = getReactionEntities(fhirRequest.reaction);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.verificationStatus = getVerificationStatusEntity(fhirRequest.verificationStatus);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.meta = getMetaEntity(fhirRequest.meta);
            fhirRequestEntity.statusCode = fhirRequest.statusCode;
            fhirRequestEntity.intent = fhirRequest.intent;
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

    public void saveData(DiagnosticReport fhirRequest) {
        if (null != fhirRequest) {
            DiagnosticReportEntity fhirRequestEntity = new DiagnosticReportEntity();
            fhirRequestEntity.id = fhirRequest.id;
            fhirRequestEntity.criticality = fhirRequest.criticality;
            fhirRequestEntity.recordedDate = fhirRequest.recordedDate;
            fhirRequestEntity.resourceType = fhirRequest.resourceType;
            fhirRequestEntity.code = getCodeEntity(fhirRequest.code);
            fhirRequestEntity.clinicalStatus = getClinicalStatusEntity(fhirRequest.clinicalStatus);
            fhirRequestEntity.reaction = getReactionEntities(fhirRequest.reaction);
            fhirRequestEntity.text = getTextEntity(fhirRequest.text);
            fhirRequestEntity.verificationStatus = getVerificationStatusEntity(fhirRequest.verificationStatus);
            fhirRequestEntity.subject = getSubjectEntity(fhirRequest.subject);
            fhirRequestEntity.meta = getMetaEntity(fhirRequest.meta);
            fhirRequestEntity.statusCode = fhirRequest.statusCode;
            fhirRequestEntity.intent = fhirRequest.intent;
            fhirRequestEntity.category = getCategoryEntities(fhirRequest.category);
            fhirRequestEntity.effectiveDateTime = fhirRequest.effectiveDateTime;
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

    private List<ResultEntity> getResultsEntities(List<Result> results){
        List<ResultEntity> resultEntityList = Collections.EMPTY_LIST;
        if (null != results && results.size() > 0) {
            resultEntityList = new ArrayList<>(results.size());
            for (Result result : results) {
                ResultEntity resultEntity = new ResultEntity();
                resultEntity.display = result.display;
                resultEntity.reference = result.reference;
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
                performerEntity.display = performer.display;
                performerEntity.reference = performer.display;
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
                presentedFormEntity.contentType = presentedForm.contentType;
                presentedFormEntity.hash = presentedForm.hash;
                presentedFormEntity.url = presentedForm.url;
                presentedFormEntity.data = presentedForm.data;
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
                itemEntity.display = item.display;
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
                problemEntity.display = problem.display;
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
                identifierEntity.value = identifier.value;
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
        encounterEntity.reference = encounter.reference;
        return encounterEntity;
    }
    private AssessorEntity getAssessorEntity(Assessor assessor){
        if(null == assessor){
            return null;
        }
        AssessorEntity assessorEntity = new AssessorEntity();
        assessorEntity.reference = assessor.reference;
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        return dateFormat.format(date);
    }
    private List<CategoryEntity> getCategoryEntities(List<Category> categoryLis){
        List<CategoryEntity> categoryEntities = Collections.EMPTY_LIST;
        if (null != categoryLis && categoryLis.size() > 0) {
            categoryEntities = new ArrayList<>(categoryLis.size());
            for (Category category : categoryLis) {
                CategoryEntity categoryEntity = new CategoryEntity();
                categoryEntity.coding = getCodingEntities(category.coding);
                categoryEntity.text = category.text;
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
                extensionEntity.url = extension.url;
                extensionEntity.valueMarkdown = extension.valueMarkdown;
                extensionEntity.valueString = extension.valueString;
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
        subjectEntity.display = subject.display;
        subjectEntity.reference = subject.reference;
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
        textEntity.div = text.div;
        textEntity.status = text.status;
        return textEntity;
    }

    private List<ReactionEntity> getReactionEntities(List<Reaction> reactions){
        List<ReactionEntity> reactionEntities = Collections.EMPTY_LIST;
        if (null != reactions && reactions.size() > 0) {
            reactionEntities = new ArrayList<>(reactions.size());
            for (Reaction reaction : reactions) {
                ReactionEntity reactionEntity = new ReactionEntity();
                reactionEntity.manifestation = getMainfestationEntities(reaction.manifestation);
                reactionEntity.severity = reaction.severity;
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
        patientEntity.reference = patient.reference;
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
                codingEntity.code = coding.code;
                codingEntity.display = coding.display;
                codingEntity.system = coding.system;
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
}*/
