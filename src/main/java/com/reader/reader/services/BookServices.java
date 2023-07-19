package com.reader.reader.services;

import com.reader.reader.models.Book;

import java.util.List;

public interface BookServices {
    void createBook(Book book);
    List<Book> getAllBooks();
    Book getBookByName(String bookName);

}
