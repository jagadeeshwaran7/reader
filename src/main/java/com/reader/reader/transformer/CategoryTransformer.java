package com.reader.reader.transformer;

import com.reader.reader.database.entity.CategoryEntity;
import com.reader.reader.models.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoryTransformer {

    Category toTransformCategory(CategoryEntity categoryEntity);
    CategoryEntity toTransformCategoryEntity(Category category);
}
