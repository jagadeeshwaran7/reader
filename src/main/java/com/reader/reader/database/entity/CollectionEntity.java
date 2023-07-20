package com.reader.reader.database.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Collection")
@RequiredArgsConstructor
public class CollectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToOne
    private  CategoryEntity categoryEntity;

    @OneToOne
    private  BookEntity bookEntity;
}
