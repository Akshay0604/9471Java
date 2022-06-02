package com.demo.manytomany.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int book_id;
private String book_name;
@ManyToMany(targetEntity = Student.class)
private List stud;
public Library() {}
public Library( String book_name, List stud) {
	super();
	this.book_id = book_id;
	this.book_name = book_name;
	this.stud = stud;
}
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
public List getStud() {
	return stud;
}
public void setStud(List stud) {
	this.stud = stud;
}


}
