package com.example.test.service.impl;

import com.example.test.model.Book;
import com.example.test.service.IBookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@MapperScan("com.example.test.mapper")
@EnableTransactionManagement
@SpringBootTest
class BookServiceImplTest {

    @Autowired
    private IBookService bookService;
    private Book book=new Book();

    @BeforeEach
    public void Before(){
        this.book=new Book();
    }

    @Test
    void listBook() {
        List<Book> books = this.bookService.ListBook(this.book);
        System.out.println(books.size());
        System.out.println("dsfsf");
    }
}