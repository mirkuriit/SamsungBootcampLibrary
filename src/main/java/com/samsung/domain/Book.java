package com.samsung.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data // автоматические сеттеры и геттеры
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity  // говорим, что это сущность которая является отображением в базе данных
@Table(name = "book") // таблица, к которой привязана сущность
public class Book {

    @Id // Ключевое поле
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private int id;

    @Column(name = "name") // ривязка к полю таблицы
    private String name;

    @ManyToOne(targetEntity = Author.class, fetch = FetchType.LAZY) // отношение многие к одному; привязка к авторам; вытаскивать только книги
    @JoinColumn(name = "author_id") // привязка к полю таблицы, которая связана с другой таблицей
    private Author author;

    @ManyToOne(targetEntity = Genre.class, fetch = FetchType.LAZY) // отношение многие к одному; привязка к жанрам; вытаскивать только книги
    @JoinColumn(name = "genre_id") // привязка к полю таблицы, которая связана с другой таблицей
    private Genre genre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book") // mappedBy - двустороння связь сущностей книга-комментарий
    private List<Comment> commentList;
}
