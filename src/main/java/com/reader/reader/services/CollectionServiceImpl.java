package com.reader.reader.services;

import com.reader.reader.database.entity.CollectionEntity;
import com.reader.reader.database.repo.BookRepo;
import com.reader.reader.database.repo.CollectionRepo;
import com.reader.reader.models.Book;
import com.reader.reader.models.Collection;
import com.reader.reader.transformer.BookTransformer;
import com.reader.reader.transformer.CollectionTransformer;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectionServiceImpl implements CollectionService{
    private final CollectionRepo collectionRepo;
    private final BookTransformer bookTransformer;
    private final CollectionTransformer collectionTransformer;
    private final List<Book> bookList = new ArrayList<>();
    public List<Book> getBooksByCategory(String categoryName) {
        for (CollectionEntity collectionEntity: collectionRepo.findAll()) {
            if (collectionEntity.getCategoryEntity().getName().equals(categoryName)) {
                bookList.add(bookTransformer.transformToBook(collectionEntity.getBookEntity()));
            }
        }
        return bookList;
    }

    @Override
    public void addToCategory(@NotNull Collection collection) {
        collectionRepo.save(collectionTransformer.toTransformEntity(collection));
    }
}
