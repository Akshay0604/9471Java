package com.demo.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int book_id;
private String book_name;
public Library() {}
public Library(int book_id, String book_name, Student student) {
	super();
	this.book_id = book_id;
	this.book_name = book_name;
	this.student = student;
}
@OneToOne
private Student student;
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
}
