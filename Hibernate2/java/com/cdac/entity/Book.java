package com.cdac.entity;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name ="tbl_book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
  private int id;
  private String name;
  private double price;
  @ManyToMany
   @JoinTable(name="tbl_book_author",
   joinColumns= @JoinColumn(name="book_id"),
   inverseJoinColumns = @JoinColumn(name = "author_id"))
  private List<Author> author;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public List<Author> getAuthor() {
	return author;
}
public void setAuthor(List<Author> author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
}


  
  
  
}
