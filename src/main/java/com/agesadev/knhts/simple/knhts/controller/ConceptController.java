package com.agesadev.knhts.simple.knhts.controller;


import com.agesadev.knhts.simple.knhts.model.ConceptModel;
import com.agesadev.knhts.simple.knhts.service.ConceptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class ConceptController {
    private final ConceptService conceptService;

    public ConceptController(ConceptService conceptService) {
        this.conceptService = conceptService;
    }

    @GetMapping("/concepts/{id}")
    public ResponseEntity<ConceptModel> getConceptById(@PathVariable String id) {
        ConceptModel concept = conceptService.getConceptById(id);
        if (concept == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
        return ResponseEntity.ok(concept);
    }
}