package com.example.BookProject.Department;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.BookProject.Book.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
	@Id
	private int department_id;
	private String department_name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "department")
	private List<Book> enrolledBooks=new ArrayList<Book>();
	
	

}
