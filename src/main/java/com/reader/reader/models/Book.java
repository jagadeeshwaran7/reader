package com.reader.reader.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Book {
    private final Integer id;
    private final Integer code;
    private final String name;
    private String description;
}
