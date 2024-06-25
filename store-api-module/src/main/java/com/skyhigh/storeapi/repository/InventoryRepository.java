package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.InventoryItem;
import com.skyhigh.storeapi.model.enums.InventoryItemStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends CrudRepository<InventoryItem, Long> {
    @Query("SELECT i FROM InventoryItem i " +
            "inner join Batch b " +
            "on i.batch.batchId = b.batchId " +
            "where b.branch.branchId = :branchId " +
            "and i.status = :status")
    List<InventoryItem> findAllByBranchAndStatus(Long branchId, InventoryItemStatus status);

    @Query("SELECT i FROM InventoryItem i " +
            "inner join Batch b " +
            "on i.batch.batchId = b.batchId " +
            "where b.branch.branchId = :branchId ")
    List<InventoryItem> findAllByBranch(Long branchId);
}
