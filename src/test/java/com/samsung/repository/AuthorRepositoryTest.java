package com.samsung.repository;

import com.samsung.domain.Author;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJdbcTest
class AuthorRepositoryTest {
    @Autowired // ���� � ��������� ��������������� ��� � ������ ��� � ����������, ������� �� �������
    private AuthorRepository authorRepository;


}