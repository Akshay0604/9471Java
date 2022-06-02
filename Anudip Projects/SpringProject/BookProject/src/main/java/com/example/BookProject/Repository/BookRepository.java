package com.example.BookProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookProject.Book.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
