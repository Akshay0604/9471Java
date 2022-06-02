package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>  
	{  
	}  

