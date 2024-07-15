package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.BookEntity;
import com.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	BookRepository bookRepo;
	
	@GetMapping("/listbooks")
	public String listBooks(Model model) {
		List<BookEntity> books = bookRepo.findAll();
		model.addAttribute("list", books);
		return "ListBooks";
	}
	
	@PostMapping
	public String saveBook(BookEntity bookEntity) {
		bookEntity.getAuthor();
		bookEntity.getGenre();
		
		return "NewBook";
	}
}