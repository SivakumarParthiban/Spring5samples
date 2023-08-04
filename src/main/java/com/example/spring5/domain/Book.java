package com.example.spring5.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String isbn;
	@ManyToMany
	@JoinTable(name="author_book", joinColumns= @JoinColumn(name="book_id"),
	 inverseJoinColumns= @JoinColumn(name="author_id"))
	private Set<Author> authors=new HashSet();

	public Book(String title, String isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authors = authors;
	}

	public Book() {
		super();
	}
	

}
