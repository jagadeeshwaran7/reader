package com.reader.reader.services;

import com.reader.reader.database.entity.CategoryEntity;
import com.reader.reader.database.repo.CategoryRepo;
import com.reader.reader.database.repo.CollectionRepo;
import com.reader.reader.models.Book;
import com.reader.reader.models.Category;
import com.reader.reader.transformer.CategoryTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    public static CategoryRepo categoryRepo;
    private final CategoryTransformer categoryTransformer;
    @Override
    public List<String> getAllCategory() {
        List<String> categoryList = new ArrayList<>();
        for (CategoryEntity categoryEntity: categoryRepo.findAll()) {
            categoryList.add(categoryEntity.getName());
        }
        return categoryList;
    }

    @Override
    public void createCategory(Category category) {
        categoryRepo.save(categoryTransformer.toTransformCategoryEntity(category));
    }
}
