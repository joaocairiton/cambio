package com.cairiton.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cairiton.bookservice.model.Book;


public interface BookRepository  extends JpaRepository<Book, Long>{
	
	

}
