package com.reader.reader.services;

import com.reader.reader.models.Book;
import com.reader.reader.models.Category;

import java.util.List;

public interface CategoryService {
    public List<String> getAllCategory();
    public void createCategory(Category category);
}
