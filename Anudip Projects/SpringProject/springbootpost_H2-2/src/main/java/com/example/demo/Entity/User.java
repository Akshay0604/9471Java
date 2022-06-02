package com.example.demo.Entity;

import java.util.Date;

public class User {
private Integer id;
private String name;
private Date date;
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", date=" + date + "]";
}
public User(Integer id, String name, Date date) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}



}
