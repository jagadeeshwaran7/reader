package com.reader.reader.database.repo;

import com.reader.reader.database.entity.CollectionEntity;
import org.springframework.data.repository.CrudRepository;

public interface CollectionRepo extends CrudRepository<CollectionEntity, Integer> {
}
