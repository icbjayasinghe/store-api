package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.Product;
import com.skyhigh.storeapi.model.ProductBrand;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findProductByProductNameAndCategoryAndProductBrand(String productName, Category category, ProductBrand productBrand);
}
