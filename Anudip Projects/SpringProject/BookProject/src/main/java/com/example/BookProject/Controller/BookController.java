package com.example.BookProject.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookProject.Book.Book;
import com.example.BookProject.Service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;

	@GetMapping("/books")
	public List<Book> allBooks() {
		return bookservice.allBooks();
	}

	@GetMapping("/book{id}")
	public Optional<Book> getById(@PathVariable Integer id) {
		return bookservice.getById(id);
	}

	@PostMapping("/bookpost")
	public String addBook(@RequestBody Book book) {
		bookservice.addBook(book);
		return "Book added";

	}

	@DeleteMapping("/deletebook{id}")
	public String deleteBook(@PathVariable Integer id) {
		bookservice.deleteBook(id);
		return "Book deleted!!!";
	}

	@PutMapping("/updatebook{id}")
	public String updateBook(@PathVariable Integer id, @RequestBody Book book) {
		bookservice.updateBook(id, book);
		return "Book Updated!!!";
	}

	@PutMapping("/{bookid}/book/{departid}")
	public Book addBooktoDepartment(@PathVariable Integer bookid, @PathVariable Integer departid) {
		return bookservice.addBooktoDepartment(bookid, departid);

	}

}
