package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        Book book = bookRepository.getBook();
        System.out.println("Book Name: " + book.getName());
    }
}
