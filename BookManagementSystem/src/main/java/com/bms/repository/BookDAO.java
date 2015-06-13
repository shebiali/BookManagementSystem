package com.bms.repository;

import java.util.List;

import com.bms.model.Book;

/**
 * @author syed9090
 *
 */
public interface BookDAO {

    public void addBook(Book Book);
    public Book getBook(int id);
    public void updateBook(Book book);
    public void deleteBook(int id);
    public List<Book> getBooks();
    
}
