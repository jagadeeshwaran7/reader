package com.reader.reader.database.repo;

import com.reader.reader.database.entity.CategoryEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories(basePackages="com.reader.reader.database")
public interface CategoryRepo extends CrudRepository<CategoryEntity, Integer> {
}
