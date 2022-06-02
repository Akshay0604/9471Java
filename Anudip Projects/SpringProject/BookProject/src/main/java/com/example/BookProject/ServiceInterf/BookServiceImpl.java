package com.example.BookProject.ServiceInterf;

import java.util.List;
import java.util.Optional;

import com.example.BookProject.Book.Book;

public interface BookServiceImpl {
	public List<Book> allBooks();
	public Book addBook(Book book);
	public Optional<Book> getById(Integer id);
	public void deleteBook(Integer id);
	public void updateBook(Integer id,Book book);
	public Book addBooktoDepartment(Integer bookid, Integer departid);

}
