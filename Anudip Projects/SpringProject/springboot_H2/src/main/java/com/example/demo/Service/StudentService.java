package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.repository.StudentRepository;

@Service  
	public class StudentService   
	{  
	@Autowired  
	StudentRepository studentRepository;  
	//getting all student records  
	public List<Student> getAllStudent()   
	{  
	List<Student> students = new ArrayList<Student>();  
	studentRepository.findAll().forEach(student -> students.add(student));  
	return students;  
	}  
	//getting a specific record  
	public Student getStudentById(int id)   
	{  
	return studentRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Student student)   
	{  
	studentRepository.save(student);  
	}  
	//deleting a specific record  
	public void delete(int id)   
	{  
	studentRepository.deleteById(id);  
	}  
	}  
