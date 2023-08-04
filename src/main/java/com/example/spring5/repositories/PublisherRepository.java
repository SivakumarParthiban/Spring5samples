package com.example.spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
