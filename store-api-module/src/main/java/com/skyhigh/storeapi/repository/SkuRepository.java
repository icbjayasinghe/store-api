package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Sku;
import com.skyhigh.storeapi.model.enums.SkuStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkuRepository extends JpaRepository<Sku, Long> {
    List<Sku> findAllByStatus(SkuStatus status);
}
