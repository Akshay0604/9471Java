package com.example.BookProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookProject.Department.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
