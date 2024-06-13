package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.Product;
import com.skyhigh.storeapi.model.ProductBrand;
import com.skyhigh.storeapi.model.dto.*;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class ProductToProductResponseDto implements Converter<Product, ProductResponseDto> {

    @Override
    public ProductResponseDto convert(Product product) {

        Category category = product.getCategory();
        CategoryDto categoryDto = CategoryDto.builder()
                .categoryId(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .photoUrl(category.getPhotoUrl())
                .parentCategoryId(category.getParentCategory().getParentCategoryId())
                .status(category.getStatus())
                .build();
        ProductBrand brand = product.getProductBrand();
        ProductBrandDto productBrandDto = ProductBrandDto.builder()
                .brandId(brand.getBrandId())
                .brandName(brand.getBrandName())
                .photoUrl(brand.getPhotoUrl())
                .status(brand.getStatus())
                .build();
        ProductResponseDto productResponseDto = ProductResponseDto.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .category(categoryDto)
                .photoUrl(product.getPhotoUrl())
                .status(product.getStatus())
                .brand(productBrandDto)
                .build();
        return productResponseDto;
    }
}
