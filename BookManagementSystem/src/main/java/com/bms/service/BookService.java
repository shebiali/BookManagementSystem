package com.bms.service;

import java.util.List;

import com.bms.model.Book;

public interface BookService {

    public void addBook(Book book);
    public Book getBook(int id);
    public void updateBook(Book book);
    public void deleteBook(int id);
    public List<Book> getBooks();

}

