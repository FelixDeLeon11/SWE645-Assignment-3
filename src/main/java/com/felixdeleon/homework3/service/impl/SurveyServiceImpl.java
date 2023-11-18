package com.felixdeleon.homework3.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.felixdeleon.homework3.model.Survey;
import com.felixdeleon.homework3.repository.SurveyRepository;
import com.felixdeleon.homework3.service.StudentService;


@Service
public class SurveyServiceImpl implements StudentService{
	public SurveyRepository surveyRepo;
	
	public SurveyServiceImpl(SurveyRepository surveyRepo) {
		super();
		this.surveyRepo = surveyRepo;
	}
	
	@Override
	public Survey saveSurvey(Survey survey) {
		return surveyRepo.save(survey);
	}
	
	@Override
	public List<Survey> getAllSurveys(){
		return surveyRepo.findAll();
	}
	
	@Override
	public Survey getSurveyById(long id) {
		java.util.Optional<Survey> survey = surveyRepo.findById(id);
		
		return survey.get();
	}
	
	public Survey updateSurvey(Survey survey, long id) {
		Survey existingSurvey = surveyRepo.findById(id).orElseThrow();
		
		existingSurvey.setfirstname(survey.getfirstname());
		existingSurvey.setlastname(survey.getlastname());
		existingSurvey.setstreetaddress(survey.getstreetaddress());
		existingSurvey.setcity(survey.getcity());
		existingSurvey.setstate(survey.getstate());
		existingSurvey.setzip(survey.getzip());
		existingSurvey.setphonenumber(survey.getphonenumber());
		existingSurvey.setemail(survey.getemail());
		existingSurvey.setdate(survey.getdate());
		existingSurvey.setcampuslikes(survey.getcampuslikes());
		existingSurvey.setinterest(survey.getinterest());
		existingSurvey.setrecommendation(survey.getrecommendation());
		
		surveyRepo.save(existingSurvey);
		
		return existingSurvey;
	}
	
	public void deleteSurvey(long id) {
		surveyRepo.findById(id);
		surveyRepo.deleteById(id);
	}
	
	public void deleteAllSurveys() {
		surveyRepo.deleteAll();
	}
}
