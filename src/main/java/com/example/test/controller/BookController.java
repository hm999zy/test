package com.example.test.controller;

import com.example.test.model.Book;
import com.example.test.service.IBookService;
import com.example.test.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {


    private JsonData jsonData=new JsonData();
    @Autowired
    IBookService bookService;
    /**
     * 单个查询
     */
    @GetMapping("/loadBookById")
    public JsonData loadBookById(Book book){
        Book b = this.bookService.GetIdBook(book);
        jsonData.setRow(b);
        return this.jsonData;
    }

    /**
     * 增加
     */
    @GetMapping("/addBook")
    public JsonData addBook(Book book){
        int i = this.bookService.addBook(book);
        jsonData.setRow(i);
        return this.jsonData;
    }

    /**
     * 修改
     */
    @GetMapping("/editBook")
    public JsonData editBook(Book book){
        int i = this.bookService.updateBook(book);
        jsonData.setCode(i);
        return this.jsonData;
    }

    /**
     * 删除
     */
    @GetMapping("/delBook")
    public JsonData delBook(Book book){
        int i = this.bookService.delBook(book);
        jsonData.setCode(i);
        return this.jsonData;
    }

    @GetMapping("/listBook")
    public JsonData listBook(Book book){
        List<Book> books = this.bookService.ListBook(book);
        jsonData.setRows(books);
        return this.jsonData;
    }
}
