package com.bms.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bms.model.Book;
import com.bms.service.BookService;

@Controller
@RequestMapping(value="/book")

public class BookController {

	@Autowired
	private BookService bookService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addBookPage() {
		ModelAndView modelAndView = new ModelAndView("book-add");
		modelAndView.addObject("book", new Book());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingBook(@ModelAttribute Book book) {
		
		ModelAndView modelAndView = new ModelAndView("bmsHome");
		bookService.addBook(book);
		
		String message = "Book was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfBooks() {
		ModelAndView modelAndView = new ModelAndView("book-list");
		
		List<Book> books = bookService.getBooks();
		modelAndView.addObject("books", books);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editBookPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("book-edit");
		Book book = bookService.getBook(id);
		modelAndView.addObject("book",book);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView edditingBook(@ModelAttribute Book book, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("bmsHome");
		
		bookService.updateBook(book);
		
		String message = "Book was successfully edited.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteBook(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("bmsHome");
		bookService.deleteBook(id);
		String message = "Book was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
