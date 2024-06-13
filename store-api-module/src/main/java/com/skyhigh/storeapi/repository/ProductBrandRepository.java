package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.ProductBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBrandRepository extends JpaRepository<ProductBrand, Long> {
    ProductBrand findProductBrandByBrandName(String brandName);

}
