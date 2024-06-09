package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.ProductBrandDto;

public interface ProductBrandService {
    ProductBrandDto createProductBrand(ProductBrandDto productBrandDto);

    ProductBrandDto getProductBrand(Long brandId);
}
