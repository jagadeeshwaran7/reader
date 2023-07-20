package com.reader.reader.transformer;

import com.reader.reader.database.entity.BookEntity;
import com.reader.reader.database.entity.CategoryEntity;
import com.reader.reader.database.entity.CollectionEntity;
import com.reader.reader.database.repo.BookRepo;
import com.reader.reader.database.repo.CategoryRepo;
import com.reader.reader.models.Collection;
import org.jetbrains.annotations.NotNull;

public class CollectionTransformer extends BookRepo{
    private final CategoryRepo categoryRepo;
    public CollectionEntity toTransformEntity(Collection collection) {
        Integer id = collection.getId();
        String bookName = collection.getBookName();
        String categoryName = collection.getCategoryName();

        CollectionEntity collectionEntity = new CollectionEntity();
        collectionEntity.setId(id);

        for (@NotNull BookEntity book : bookRepo.findAll()) {

            if (book.getName().equals(bookName)) {
                collectionEntity.setBookEntity(book);
                break;
            }
        }

        for (CategoryEntity categoryEntity : categoryRepo.findAll()) {
            if (categoryEntity.getName().equals(categoryName)) {
                collectionEntity.setCategoryEntity(categoryEntity);
                break;
            }
        }
        return collectionEntity;
    }

    public Collection toTransformModel(@NotNull CollectionEntity collectionEntity) {
        Collection collection = new Collection();
        collection.setId(collectionEntity.getId());
        collection.setBookName(collectionEntity.getBookEntity().getName());
        collection.setCategoryName(collectionEntity.getCategoryEntity().getName());
        return collection;
    }
}
