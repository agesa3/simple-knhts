package com.agesadev.knhts.simple.knhts.service;


import com.agesadev.knhts.simple.knhts.model.ConceptModel;
import jakarta.persistence.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ConceptService {

    @Cacheable(cacheNames = "concepts")
    public ConceptModel getConceptById(String id) {
        // Fetch concept data from an external source or database
        // For this example, we'll return a hardcoded ConceptModel
        return createDummyConceptModel(id);
    }

    private ConceptModel createDummyConceptModel(String id) {
        ConceptModel concept = new ConceptModel();
        concept.setId(id);
        concept.setUuid("136640");
        concept.setConceptClass("Symptom/Finding");
        concept.setDatatype("Document");
        concept.setUrl("/orgs/WHO/sources/ICD-11/concepts/136640/");
        concept.setRetired(false);
        concept.setSource("ICD-11");
        concept.setOwner("WHO");
        concept.setOwnerType("Organization");
        concept.setOwnerUrl("/orgs/WHO/");
        concept.setDisplayName("hugo");
        concept.setDisplayLocale("en");
        concept.setVersion("136640");
        concept.setVersionCreatedBy("ocladmin");
        concept.setVersionCreatedOn(new Date());
        concept.setVersionsUrl("/orgs/WHO/sources/ICD-11/concepts/136640/versions/");
        concept.setVersionUrl("/orgs/WHO/sources/ICD-11/concepts/136640/136641/");
        concept.setType("Concept");
        concept.setVersionedObjectId(136640);
        concept.setVersionUpdatedOn(new Date());
        concept.setVersionUpdatedBy("ocladmin");
        concept.setLatestSourceVersion(null);
        return concept;
    }
}