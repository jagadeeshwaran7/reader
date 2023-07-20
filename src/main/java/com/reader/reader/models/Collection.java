package com.reader.reader.models;

import com.reader.reader.database.entity.BookEntity;
import com.reader.reader.database.entity.CollectionEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Collection {

    private Integer id;
    private String bookName;
    private String categoryName;
}
