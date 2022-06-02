package com.example.BookProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.BookProject.Department.Department;
import com.example.BookProject.Service.DepartmentService;



@RestController

public class DepartmentController {
	
	@Autowired(required=true)
	private DepartmentService departservice;
	
	
	@GetMapping("/departments")
	public List<Department> getDepartments()
	{
		return  departservice.getDepartment();
	}
	
	@PostMapping("/department")
	public Department addDepartments(@RequestBody Department department )
	{
		return  departservice.addDepartment(department);
	}
	
	
}
