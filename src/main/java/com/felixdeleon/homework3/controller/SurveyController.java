package com.felixdeleon.homework3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felixdeleon.homework3.model.Survey;
import com.felixdeleon.homework3.service.StudentService;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {
	private StudentService surveyService;
	
	public SurveyController(StudentService surveyService) {
		super();
		this.surveyService = surveyService;
	}
	
	@PostMapping
	public Survey saveSurvey(@RequestBody Survey survey) {
		
		return surveyService.saveSurvey(survey);
	}
	
	@GetMapping
	public List<Survey> getAllSurveys(){
		return surveyService.getAllSurveys();
	}
	
	@PutMapping("{id}")
	public String updateSurvey(@PathVariable("id") long id, @RequestBody Survey survey) {
		surveyService.updateSurvey(survey, id);
		
//		HttpHeaders responseHeaders = new HttpHeaders();
//		   responseHeaders.set("MyResponseHeader", "MyValue");
//		   return new ResponseEntity<Survey>(responseHeaders, HttpStatus.CREATED);
		
		return "Survey updated successfully";
	}
	
	@DeleteMapping("{id}")
	public String deleteSurvey(@PathVariable("id") long id){
		surveyService.deleteSurvey(id);
		
//		return new ResponseEntity<Survey>(HttpStatus.OK);
		return "Survey deleted successfully";
	}
	
	@DeleteMapping
	public String deleteAllSurveys() {
		surveyService.deleteAllSurveys();
		
		return "All surveys deleted successfully";
	}
}
