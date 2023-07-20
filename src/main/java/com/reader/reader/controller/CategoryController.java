package com.reader.reader.controller;

import com.reader.reader.models.Category;
import com.reader.reader.models.Collection;
import com.reader.reader.services.CategoryService;
import com.reader.reader.services.CollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("category")
@RestController
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CollectionService collectionService;

    @GetMapping("/getall")
    public Object getAllCategory() {
        List<String> response = categoryService.getAllCategory();
        if (response == null) {
            return "Category not found";
        } else {
            return response;
        }
    }


    @PutMapping("/createcategory")
    public void createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
    }

    @PutMapping("/addBookToCat")
    public void addBookToCategory(@RequestBody Collection collection) {
        collectionService.addToCategory(collection);
    }
}
