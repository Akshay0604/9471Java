package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "story")
public class Story {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int storyId;

@Column(name = "story_name")
private String storyName;

@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JoinColumn(name = "book_id",referencedColumnName = "bookId")
@JsonIgnoreProperties("storyList")
private Book book;

public int getStoryId() {
	return storyId;
}

public void setStoryId(int storyId) {
	this.storyId = storyId;
}

public String getStoryName() {
	return storyName;
}

public void setStoryName(String storyName) {
	this.storyName = storyName;
}

public Book getBook() {
	return book;
}

public void setBook(Book book) {
	this.book = book;
}
}
