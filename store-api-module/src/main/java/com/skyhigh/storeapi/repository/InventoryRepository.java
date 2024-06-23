package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.InventoryItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<InventoryItem, Long> {
}
