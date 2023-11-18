package com.felixdeleon.homework3.service;

import java.util.List;

import com.felixdeleon.homework3.model.Survey;

public interface StudentService {
	Survey saveSurvey(Survey survey);
	List<Survey> getAllSurveys();
	Survey getSurveyById(long id);
	Survey updateSurvey(Survey survey, long id);
	void deleteSurvey(long id);
	void deleteAllSurveys();
}
