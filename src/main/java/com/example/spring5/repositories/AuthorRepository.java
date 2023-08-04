package com.example.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
