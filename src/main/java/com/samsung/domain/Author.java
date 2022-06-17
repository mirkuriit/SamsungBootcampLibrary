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
@Table(name = "author") // таблица, к которой привязана сущность
public class Author {

    @Id // Ключевое поле
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private int id;

    @Column(name = "name")
    private String name;
}
