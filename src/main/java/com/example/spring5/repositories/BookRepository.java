package com.example.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long>{

}
