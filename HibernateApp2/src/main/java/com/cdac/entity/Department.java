package com.cdac.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_dept")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int deptId;
  private String dname;


private String hod;
  
  @OneToOne(mappedBy = "dept",cascade = CascadeType.ALL )
  private Student student;
  
  
  public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public String getHod() {
	return hod;
}

public void setHod(String hod) {
	this.hod = hod;
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}
  
}
