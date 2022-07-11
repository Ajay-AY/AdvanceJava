package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Customer;
import com.cdac.entity.Department;
import com.cdac.entity.Employee;
import com.cdac.entity.Student;

public class StudentDeptDao {
  
	public void add(Department dept) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(dept); // insert
		
		tx.commit();
		emf.close();
	}
	public void add(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(student); // insert
		
		tx.commit();
		emf.close();
	}
	
	public Department checkDname(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Department dep = em.find(Department.class,id);
		
		emf.close();
		return dep;
	}
	
	
	public List<Department> fetchAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Query q =  em.createQuery("select d from Department d"); //HQL /JPQL
		List<Department> list = q.getResultList();
		
		emf.close();
		return list;
	}
}
