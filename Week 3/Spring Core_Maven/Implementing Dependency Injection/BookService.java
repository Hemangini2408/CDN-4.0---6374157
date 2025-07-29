package com.example.library;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Setter for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        List<Book> books = bookRepository.getAllBooks();
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}
