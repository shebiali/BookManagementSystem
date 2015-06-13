package com.bms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author syed9090
 *
 */

@Entity 
@Table(name="Book") 
public class Book implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOOK_ID")
	private Integer bookId;
	
	@Column(name="BOOK_TITLE_PRM", nullable=false)
	private String bookTitlePrm;
	
	@Column(name="ISBN", nullable=true)
	private String isbn;
	
	@Column(name="TOTAL_PAGES", nullable=true)
	private Integer totalPages;
	
	@Column(name="PUBLISHED_DATE", nullable=true)
	private Date publishedDate;
	
	@Column(name="PUBLISHER_ID", nullable=false)
	private String publisherId;
	
	@Column(name="CATEGORY_ID", nullable=false)
	private String categoryId;
	
	@Column(name="CREATED_ON")
	private Date createdOn;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_ON")
	private Date updatedOn;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;

	
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	public void setAuditFields() {
		/*
		 * For auditting purpose
		 */
		if(createdOn==null){
			//It is new book
			
			createdOn =  (Date) Calendar.getInstance().getTime();
			updatedOn =  (Date) Calendar.getInstance().getTime();
			createdBy = "loggedInUser";
			updatedBy = "loggedInUser";
		}else
			
			updatedOn =  (Date) Calendar.getInstance().getTime();
			updatedBy = "loggedInUser";
		
		
	}
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookTitlePrm() {
		return bookTitlePrm;
	}
	public void setBookTitlePrm(String bookTitlePrm) {
		this.bookTitlePrm = bookTitlePrm;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
}
