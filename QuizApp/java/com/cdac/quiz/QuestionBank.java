package com.cdac.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
 private Map<String,List<Question>> questionBank = new HashMap<>();


 public void addNewSubject(String subject) {
 questionBank.put(subject, new ArrayList<>());
 }
 
 public void addNewQuestion(String subject,Question question) {
	 List<Question> questions = questionBank.get(subject);
	 questions.add(question);
 }
 
 public List<Question> fetchQuestionsOn(String subject) {
		return questionBank.get(subject);
	}

}