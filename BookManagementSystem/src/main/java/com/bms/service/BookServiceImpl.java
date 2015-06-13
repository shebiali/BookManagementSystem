package com.bms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bms.model.Book;
import com.bms.repository.BookDAO;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDao;

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);

	}

	@Override
	public Book getBook(int id) {
		return bookDao.getBook(id);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);

	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

	@Override
	public List<Book> getBooks() {
		return bookDao.getBooks();
	}

}
