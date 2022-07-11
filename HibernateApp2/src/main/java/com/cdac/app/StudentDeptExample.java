package com.cdac.app;

import java.time.LocalDate;

import com.cdac.dao.StudentDeptDao;
import com.cdac.entity.Department;

import com.cdac.entity.Student;

public class StudentDeptExample {

	public static void main(String[] args) {
		StudentDeptDao dao= new StudentDeptDao();
		
		Student st = new Student();
		st.setName("Mno");
		st.setEmail("abc@gmail.com");
		st.setYearOfAdms(LocalDate.of(2022, 06, 15));
		
		Department d = new Department();
		d.setDname("Mech");
		d.setHod("XYZ");
		
		st.setDept(d);
		d.setStudent(st);
		
		dao.add(d);
		
		
	}

}
