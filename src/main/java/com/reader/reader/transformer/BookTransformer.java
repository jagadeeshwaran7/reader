package com.reader.reader.transformer;

import com.reader.reader.database.entity.BookEntity;
import com.reader.reader.models.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookTransformer {
    Book transformToBook(BookEntity bookEntity);
    BookEntity TransformToBookEntity(Book book);
}
