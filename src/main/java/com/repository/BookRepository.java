package com.repository;

import org.springframework.stereotype.Repository;
import com.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
