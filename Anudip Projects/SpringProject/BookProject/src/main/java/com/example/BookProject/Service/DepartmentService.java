package com.example.BookProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.BookProject.Department.Department;

import com.example.BookProject.Repository.DepartmentRepository;
import com.example.BookProject.ServiceInterf.DepartmentServiceImpl;

@Service
public class DepartmentService implements DepartmentServiceImpl {
    
	@Autowired
	private DepartmentRepository departrepo;
	
		
	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return departrepo.findAll();
		
	}

	@Override
	public Department addDepartment(Department department) {
		
		// TODO Auto-generated method stub
		return departrepo.save(department);
	}

	

}
