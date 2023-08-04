package com.example.spring5.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring5.domain.Author;
import com.example.spring5.domain.Book;
import com.example.spring5.repositories.AuthorRepository;
import com.example.spring5.repositories.BookRepository;


@Component
public class BootStrapData implements CommandLineRunner{
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Author author=new Author("Eric","Evans");
		Book book=new Book("Domain Driven Design","1234567");
		authorRepository.save(author);
		bookRepository.save(book);
		
		Author rod=new Author("rod","Johnson");
		Book noEJB=new Book("J2EE development without EJB","234989");
		
	
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
	}

}
