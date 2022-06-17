package com.samsung;

import com.samsung.domain.Author;
import com.samsung.domain.Book;
import com.samsung.domain.Comment;
import com.samsung.domain.Genre;
import com.samsung.repository.AuthorRepository;
import com.samsung.repository.BookRepository;
import com.samsung.repository.CommentRepository;
import com.samsung.repository.GenreRepository;
import com.samsung.service.LibDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        context.getBean(LibDemoService.class).autorDemo();
        context.getBean(LibDemoService.class).bookDemo();


        context.close();



//        try {
//            Console.main(args);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
