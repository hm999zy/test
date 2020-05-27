package com.example.test.service.impl;

import com.example.test.mapper.BookMapper;
import com.example.test.model.Book;
import com.example.test.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return this.bookMapper.insert(book);
    }

    @Override
    public int updateBook(Book book) {
        return this.bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public int delBook(Book book) {
        return this.bookMapper.deleteByPrimaryKey(book.getBookId());
    }

    @Override
    public Book GetIdBook(Book book) {
        return this.bookMapper.selectByPrimaryKey(book.getBookId());
    }

    @Override
    public List<Book> ListBook(Book book) {
        return this.bookMapper.ListBook(book);
    }
}
