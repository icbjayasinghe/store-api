package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.ProductDto;
import com.skyhigh.storeapi.model.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto createProduct(ProductDto productDto);

    ProductResponseDto getProduct(Long productId);
}
