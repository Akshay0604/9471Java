package com.example.BookProject.Book;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.BookProject.Department.Department;

@Entity
public class Book {

	@Id
	// @NotNull(message = "Name is mandatory")
	private int book_id;
	@NotNull
	@Size(min = 2, message = "bookname have at least 2 characters")
	private String book_name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id", referencedColumnName = "department_id")
	private Department department;

	public void setDepartmentToBook(Department department) {
		this.department = department;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int book_id, String book_name, Department department) {
		this.book_id = book_id;
		this.book_name = book_name;
		this.department = department;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
