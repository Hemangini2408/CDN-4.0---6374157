package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        // Ensure bookRepository is injected
        if (bookRepository != null) {
            String book = bookRepository.getBookName();
            System.out.println("Book: " + book);
        } else {
            System.out.println("BookRepository is not injected!");
        }
    }
}
