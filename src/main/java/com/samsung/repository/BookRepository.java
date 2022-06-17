package com.samsung.repository;

import com.samsung.domain.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    @Override
    @EntityGraph(attributePaths = {"author", "genre", "commentList"}) // присоедимнение к таблице других талиц для решения проблемы n + 1
    List<Book> findAll();
}
