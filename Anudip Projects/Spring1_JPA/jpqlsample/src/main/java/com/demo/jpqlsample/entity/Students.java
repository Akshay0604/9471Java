package com.demo.jpqlsample.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
@NamedQuery(name = "find name" , query = "Select s from Students s")
public class Students{
	@Id
	
private int id;
private String name;
private int age;
public Students(int age) {
	super();
	this.age = age;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Students() {}
public Students(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
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
}
