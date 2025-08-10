package com.library.repository;

import com.library.model.Book;

public class BookRepositoryImpl implements BookRepository {
    @Override
    public Book getBook() {
        return new Book("Spring in Action");
    }
}
