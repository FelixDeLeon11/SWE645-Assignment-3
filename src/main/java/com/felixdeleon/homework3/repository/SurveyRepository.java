package com.felixdeleon.homework3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felixdeleon.homework3.model.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
	
}
