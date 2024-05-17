package com.agesadev.knhts.simple.knhts.repository;


import com.agesadev.knhts.simple.knhts.model.ConceptModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CacheRepository extends JpaRepository<ConceptModel, Long> {
}