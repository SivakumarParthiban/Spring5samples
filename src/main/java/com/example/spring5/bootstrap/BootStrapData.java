package com.example.spring5.bootstrap;

import java.util.Collections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring5.domain.Author;
import com.example.spring5.domain.Book;
import com.example.spring5.domain.Publisher;
import com.example.spring5.repositories.AuthorRepository;
import com.example.spring5.repositories.BookRepository;
import com.example.spring5.repositories.PublisherRepository;


@Component
public class BootStrapData implements CommandLineRunner{
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	


	@Override
	public void run(String... args) throws Exception {
		
		
		Publisher publisher =new Publisher();
		publisher.setName("Siva Publications");
		publisher.setAddressLine1("6606 camden bay dr");
		publisher.setCity("Tampa");
		publisher.setState("Florida");
		publisher.setZipcode("33635");

		Author author=new Author("Eric","Evans");
		Book book=new Book("Domain Driven Design","1234567");
		author.getBooks().add(book);
		book.getAuthors().add(author);
		book.setPublisher(publisher);
		
		publisherRepository.save(publisher);
		authorRepository.save(author);
		bookRepository.save(book);
		
		Author rod=new Author("rod","Johnson");
		Book noEJB=new Book("J2EE development without EJB","234989");
		
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
	}

}
