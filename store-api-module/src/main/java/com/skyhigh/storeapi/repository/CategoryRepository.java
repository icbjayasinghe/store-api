package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findCategoryByCategoryName(String name);
}
