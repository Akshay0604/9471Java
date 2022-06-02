package com.example.BookProject.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookProject.Book.Book;
import com.example.BookProject.Department.Department;
import com.example.BookProject.Repository.BookRepository;
import com.example.BookProject.Repository.DepartmentRepository;
import com.example.BookProject.ServiceInterf.BookServiceImpl;

@Service
public class BookService implements BookServiceImpl {

	@Autowired
	private BookRepository bookrepo;
	
	@Autowired
	private DepartmentRepository departrepo;
	
	
	@Override
	public List<Book> allBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}


	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		 return bookrepo.save(book);
		 
	
	}


	@Override
	public Optional<Book> getById(Integer id) {
		
		return bookrepo.findById(id);
	}
	
	@Override
	public void deleteBook(Integer Id)
	{
		bookrepo.deleteById(Id);
	}


	@Override
	public void updateBook(Integer id, Book book) {
		Book b1=bookrepo.getById(id);
		b1=book;
		bookrepo.save(b1);
		
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public Book addBooktoDepartment(Integer bookid, Integer departid) {
		Department department=departrepo.findById(departid).get();
		Book book= bookrepo.findById(bookid).get();
		book.setDepartmentToBook(department);
		// TODO Auto-generated method stub
		
		return bookrepo.save(book);
	}
	

}
