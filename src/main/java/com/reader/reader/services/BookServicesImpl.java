package com.reader.reader.services;

import com.reader.reader.database.entity.BookEntity;
import com.reader.reader.database.repo.BookRepo;
import com.reader.reader.models.Book;
import com.reader.reader.transformer.BookTransformer;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServicesImpl implements BookServices {

    private final BookRepo bookRepo;
    private final BookTransformer bookTransformer;

    @Override
    public void createBook(Book book) {
        bookRepo.save(bookTransformer.TransformToBookEntity(book));
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();
        for (BookEntity bookEntity : bookRepo.findAll()) {
            bookList.add(bookTransformer.transformToBook(bookEntity));
        }
        return bookList;
    }

    @Override
    public Book getBookByName(String bookName) {
        for (BookEntity bookEntity: bookRepo.findAll()) {
            if (bookEntity.getName().equals(bookName)) {
                return bookTransformer.transformToBook(bookEntity);
            }
        }
        return null;
    }
}
