package com.samsung.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // автоматические сеттеры и геттеры
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity  // говорим, что это сущность которая является отображением в базе данных
@Table(name = "comment") // таблица, к которой привязана сущность
public class Comment {

    @Id // Ключевое поле
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private int id;

    @Column(name = "content") // ривязка к полю таблицы
    private String content;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // отношение многие к одному; при удалении книги удаляются все комменты; вытаскивать только комменты
    @JoinColumn(name = "book_id") // привязка к полю таблицы, которая связана с другой таблицей
    private Book book;
}
