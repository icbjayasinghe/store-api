package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.ProductDto;
import com.skyhigh.storeapi.model.dto.ProductResponseDto;

public interface ProductService {
    ProductResponseDto createProductService(ProductDto productDto);
}
