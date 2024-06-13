package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.exception.customException.AlreadyExistException;
import com.skyhigh.storeapi.model.*;
import com.skyhigh.storeapi.model.dto.ProductResponseDto;
import com.skyhigh.storeapi.model.dto.SkuDto;
import com.skyhigh.storeapi.model.dto.SkuResponseDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import com.skyhigh.storeapi.model.enums.SkuStatus;
import com.skyhigh.storeapi.repository.CategoryRepository;
import com.skyhigh.storeapi.repository.ProductBrandRepository;
import com.skyhigh.storeapi.repository.ProductRepository;
import com.skyhigh.storeapi.repository.SkuRepository;
import com.skyhigh.storeapi.service.SkuService;
import com.skyhigh.storeapi.util.SkuNameCreatorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    SkuRepository skuRepository;

    @Autowired
    SkuNameCreatorUtil skuNameCreatorUtil;

    @Autowired
    ConversionService conversionService;

    @Override
    public SkuResponseDto createSku(SkuDto skuDto) {
        try {
            Product product = productRepository.findById(skuDto.getProductId())
                    .orElseThrow(
                            () -> new NotFoundException("Product not found")
                    );
            String concatProductName = skuNameCreatorUtil.concatProductName(product, skuDto.getSkuName());
            Sku sku = Sku.builder()
                    .skuName(skuDto.getSkuName())
                    .concatProductName(concatProductName)
                    .photoUrl(skuDto.getPhotoUrl())
                    .status(skuDto.getStatus())
                    .product(product)
                    .build();
            sku = skuRepository.save(sku);
            SkuResponseDto skuResponseDto = conversionService.convert(sku, SkuResponseDto.class);
            return skuResponseDto;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public SkuResponseDto getSku(Long skuId) {
        Optional<Sku> sku = skuRepository.findById(skuId);
        SkuResponseDto skuResponseDto = conversionService.convert(sku.get(), SkuResponseDto.class);
        return skuResponseDto;
    }

    @Override
    public List<SkuResponseDto> getSkusByStatus(String status) {
        List<Sku> skuList = skuRepository.findAllByStatus(SkuStatus.valueOf(status));
        List<SkuResponseDto> skuResponseDtoList =skuList.stream().map( sku ->
                conversionService.convert(sku, SkuResponseDto.class)
        ).collect(Collectors.toList());
        return skuResponseDtoList;
    }
}
