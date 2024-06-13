package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Product;
import com.skyhigh.storeapi.model.Sku;
import com.skyhigh.storeapi.model.dto.ProductDto;
import com.skyhigh.storeapi.model.dto.SkuResponseDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class SkuToSkuResponseDto implements Converter<Sku, SkuResponseDto> {


    @Override
    public SkuResponseDto convert(Sku sku) {
        Product product = sku.getProduct();
        ProductDto productDto = ProductDto.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .brandId(product.getProductBrand().getBrandId())
                .status(product.getStatus())
                .categoryId(product.getCategory().getCategoryId())
                .photoUrl(product.getPhotoUrl())
                .build();
        SkuResponseDto skuResponseDto = SkuResponseDto.builder()
                .skuId(sku.getSkuId())
                .skuName(sku.getSkuName())
                .concatProductName(sku.getConcatProductName())
                .photoUrl(sku.getPhotoUrl())
                .status(sku.getStatus())
                .product(productDto)
                .build();
        return skuResponseDto;
    }
}
