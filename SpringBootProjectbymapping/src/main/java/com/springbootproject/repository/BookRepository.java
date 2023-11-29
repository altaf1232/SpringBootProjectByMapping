package com.springbootproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.entity.BookEntity;
@Repository
public interface BookRepository extends CrudRepository<BookEntity,Integer> {
}
