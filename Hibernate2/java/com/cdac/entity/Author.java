package com.cdac.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_author")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
  private int id;
  private String name;
  private String email;
  @ManyToMany(mappedBy="author",cascade = CascadeType.ALL)
  private List<Book> book;
  
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Book> getBook() {
	return book;
}
public void setBook(List<Book> book) {
	this.book = book;
}
}
