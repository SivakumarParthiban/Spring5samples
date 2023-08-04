package com.example.spring5.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import com.example.spring5.domain.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	@ManyToMany( mappedBy="authors")
	private Set<Book> books;

	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.books = books;
	}

	public Author() {
		super();
	}
	
}
