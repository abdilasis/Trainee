package com.qa.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subjectName;
	private String subjectGrade;

	public Subject() {
	}

	public Subject(String subjectName, String subjectGrade) {
		this.subjectName = subjectName;
		this.subjectGrade = subjectGrade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectGrade() {
		return subjectGrade;
	}

	public void setSubjectGrade(String subjectGrade) {
		this.subjectGrade = subjectGrade;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", subjectName=" + subjectName + ", subjectGrade=" + subjectGrade + "]";
	}
}
