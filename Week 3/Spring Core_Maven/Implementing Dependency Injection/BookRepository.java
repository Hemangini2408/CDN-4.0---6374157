package com.example.library;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<Book> getAllBooks() {
        return Arrays.asList(
            new Book("Java Fundamentals"),
            new Book("Spring in Action"),
            new Book("Clean Code")
        );
    }
}
