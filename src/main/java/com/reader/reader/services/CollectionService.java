package com.reader.reader.services;

import com.reader.reader.database.repo.CategoryRepo;
import com.reader.reader.models.Book;
import com.reader.reader.models.Collection;
import lombok.RequiredArgsConstructor;

import java.util.List;
public interface CollectionService {

    public List<Book> getBooksByCategory(String categoryName);
    public void addToCategory(Collection collection);
}
