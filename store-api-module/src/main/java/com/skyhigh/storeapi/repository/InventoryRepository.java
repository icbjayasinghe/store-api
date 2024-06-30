package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.InventoryItem;
import com.skyhigh.storeapi.model.dto.InventoryGrpItemDto;
import com.skyhigh.storeapi.model.enums.InventoryItemStatus;
import com.skyhigh.storeapi.model.enums.ProductStatus;
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

    @Query("SELECT new com.skyhigh.storeapi.model.dto.InventoryGrpItemDto(c.categoryName, pb.brandName, p.productName, p.productId, sum(i.quantity), max(i.inboundDate)) FROM InventoryItem i " +
            "inner join Batch b " +
            "on i.batch.batchId = b.batchId " +
            "inner join Sku s " +
            "on i.batch.sku.skuId = s.skuId " +
            "inner join Product p " +
            "on i.batch.sku.product.productId = p.productId " +
            "inner join ProductBrand pb " +
            "on i.batch.sku.product.productBrand.brandId = pb.brandId " +
            "inner join Category c " +
            "on i.batch.sku.product.category.categoryId = c.categoryId " +
            "where b.branch.branchId = :branchId " +
            "and p.status = :status " +
            "GROUP BY i.batch.sku.product")
    List<InventoryGrpItemDto> findAllByBranchAndGroupByProduct(Long branchId, ProductStatus status);

    @Query("SELECT i from InventoryItem i " +
            "inner join Batch b " +
            "on i.batch.batchId = b.batchId " +
            "inner join Sku s " +
            "on i.batch.sku.skuId = s.skuId " +
            "inner join Product p " +
            "on i.batch.sku.product.productId = p.productId " +
            "where p.productId = :productId")
    List<InventoryItem> findAllByProduct(Long productId);
}
