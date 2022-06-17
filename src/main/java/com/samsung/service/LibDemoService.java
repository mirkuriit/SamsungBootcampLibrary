package com.samsung.service;

import com.samsung.domain.Author;
import com.samsung.domain.Book;
import com.samsung.domain.Comment;
import com.samsung.repository.AuthorRepository;
import com.samsung.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor // Создает конструктор, в котором инизиализируются final поля
public class LibDemoService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public void autorDemo(){
        List<Author> authorList = authorRepository.findAll();

        System.out.println("========");
        for (Author author : authorList){
            System.out.println(author);
        }

        Author author = Author.builder()
                .name("Иван")
                .build();

        authorRepository.save(author);
        authorList = authorRepository.findAll();

        System.out.println("========");
        for (Author author1 : authorList){
            System.out.println(author1);
        }
    }

    @Transactional
    public void bookDemo(){

        List<Book> bookList = bookRepository.findAll();

        for (Book book: bookList) {
            System.out.println( book.getName() + ":");
            System.out.println( book.getAuthor().getName() + "," + book.getGenre().getName());

            List<Comment> commentList = book.getCommentList();
            for (Comment comment : commentList){
                System.out.println(comment.getContent());
            }
        }
        bookList.stream().map(Book::getName).forEach(System.out::println);

    }

}
