package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.exception.customException.AlreadyExistException;
import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.ProductBrand;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import com.skyhigh.storeapi.model.dto.ProductBrandDto;
import com.skyhigh.storeapi.repository.ParentCategoryRepository;
import com.skyhigh.storeapi.repository.ProductBrandRepository;
import com.skyhigh.storeapi.service.ProductBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductBrandServiceImpl implements ProductBrandService {

    @Autowired
    ProductBrandRepository productBrandRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public ProductBrandDto createProductBrand(ProductBrandDto productBrandDto) {
        try {
            ProductBrand existProductBrand = productBrandRepository.findProductBrandByBrandName(productBrandDto.getBrandName());
            if (existProductBrand != null) {
                throw new AlreadyExistException("Product Brand already exist");
            }
            ProductBrand productBrand = ProductBrand.builder()
                    .brandName(productBrandDto.getBrandName())
                    .photoUrl(productBrandDto.getPhotoUrl())
                    .status(productBrandDto.getStatus())
                    .build();
            productBrand = productBrandRepository.save(productBrand);
            ProductBrandDto productBrandDtoRes = conversionService.convert(productBrand, ProductBrandDto.class);
            return productBrandDtoRes;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ProductBrandDto getProductBrand(Long brandId) {
        Optional<ProductBrand> productBrand = productBrandRepository.findById(brandId);
        ProductBrandDto productBrandDtoRes = conversionService.convert(productBrand.get(), ProductBrandDto.class);
        return productBrandDtoRes;
    }
}
