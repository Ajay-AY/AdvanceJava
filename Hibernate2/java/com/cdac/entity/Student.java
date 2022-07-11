package com.cdac.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_stud")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int rollNo;
	
 private String name;
 private String email;

private LocalDate yearOfAdms;
 @OneToOne
 @JoinColumn(name = "dept_id")
 private Department dept;
 
 public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
 
 
public int getRollNo() {
	return rollNo;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getYearOfAdms() {
	return yearOfAdms;
}
public void setYearOfAdms(LocalDate yearOfAdms) {
	this.yearOfAdms = yearOfAdms;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
 
 
 
}
