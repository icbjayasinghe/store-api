package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.ParentCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentCategoryRepository extends JpaRepository<ParentCategory, Long> {
    ParentCategory findParentCategoryByName(String name);

}
