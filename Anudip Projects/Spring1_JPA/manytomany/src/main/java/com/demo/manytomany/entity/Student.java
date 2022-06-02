package com.demo.manytomany.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
public Student() {}
public Student( String name, List book_issue) {
	super();
	this.id = id;
	this.name = name;
	this.book_issue = book_issue;
}
@ManyToMany(targetEntity = Library.class)
private List book_issue;
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
public List getBook_issue() {
	return book_issue;
}
public void setBook_issue(List book_issue) {
	this.book_issue = book_issue;
}
}
