package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;


@Component
public interface BookService {

    public Book saveBook(Book book);

    public Book findByBookId(int bookId);
}