package com.bms.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.model.Book;

@Repository
public class BookDaoImpl implements BookDAO{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addBook(Book book) {
		
		book.setAuditFields();
		getCurrentSession().save(book);
	}

	

	@Override
	public Book getBook(int id) {
		Book book = (Book) getCurrentSession().get(Book.class, id);
		return book;
	}

	@Override
	public void updateBook(Book book) {
		Book bookToUpdate = getBook(book.getBookId());
		bookToUpdate.setBookTitlePrm(book.getBookTitlePrm());
		bookToUpdate.setIsbn(book.getIsbn());
		bookToUpdate.setPublishedDate(book.getPublishedDate());
		bookToUpdate.setTotalPages(book.getTotalPages());
		bookToUpdate.setCategoryId(book.getCategoryId());
		bookToUpdate.setPublisherId(book.getPublisherId());
		bookToUpdate.setTotalPages(book.getTotalPages());
		
		bookToUpdate.setAuditFields();
		getCurrentSession().update(bookToUpdate);

	}

	@Override
	public void deleteBook(int id) {
		Book book = getBook(id);
		if (book != null)
			getCurrentSession().delete(book);
	}

	@Override
	public List<Book> getBooks() {
		return getCurrentSession().createQuery("from Book").list();
	}

}
