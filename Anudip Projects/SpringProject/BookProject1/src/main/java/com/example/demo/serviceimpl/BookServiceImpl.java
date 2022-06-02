package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Story;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    public Book saveBook(Book book) {
        List<Story> storyList = new ArrayList<>();
        // create first story
        Story story1 = new Story();
        story1.setStoryName("Arrays");
        // create second story
        Story story2 = new Story();
        story2.setStoryName("Pointers");
        // create third story
        Story story3 = new Story();
        story3.setStoryName("Loops");
        // add all story into storyList. Till here we have prepared data for OneToMany
        storyList.add(story1);
        storyList.add(story2);
        storyList.add(story3);
        // Prepare data for ManyToOne
        story1.setBook(book);
        story2.setBook(book);
        story3.setBook(book);
        book.setStoryList(storyList);
        book = bookRepository.save(book);
        return book;
    }
    public Book findByBookId(int bookId) {
        Book book = bookRepository.findByBookId(bookId);
        return book;
    }
}