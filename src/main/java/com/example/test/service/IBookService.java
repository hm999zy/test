package com.example.test.service;

import com.example.test.model.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookService {

    /**
     * 增加
     * @param book
     * @return
     */
    int addBook(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    int updateBook(Book book);

    /**
     * 删除
     * @param book
     * @return
     */
    int delBook(Book book);

    /**
     * 单个查询
     * @param book
     * @return
     */
    Book GetIdBook(Book book);

    List<Book> ListBook(Book book);
}
