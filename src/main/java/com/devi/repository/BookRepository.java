package com.devi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devi.user.Book;



@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
