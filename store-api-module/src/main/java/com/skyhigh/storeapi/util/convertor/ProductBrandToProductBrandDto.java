package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.ProductBrand;
import com.skyhigh.storeapi.model.dto.ProductBrandDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class ProductBrandToProductBrandDto implements Converter<ProductBrand, ProductBrandDto> {
    @Override
    public ProductBrandDto convert(ProductBrand productBrand) {
        ProductBrandDto productBrandDto = ProductBrandDto.builder()
                .brandId(productBrand.getBrandId())
                .brandName(productBrand.getBrandName())
                .photoUrl(productBrand.getPhotoUrl())
                .status(productBrand.getStatus())
                .build();
        return productBrandDto;
    }
}
