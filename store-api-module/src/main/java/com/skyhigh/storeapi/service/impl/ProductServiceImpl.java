package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.exception.customException.AlreadyExistException;
import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.Product;
import com.skyhigh.storeapi.model.ProductBrand;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;
import com.skyhigh.storeapi.model.dto.ProductDto;
import com.skyhigh.storeapi.model.dto.ProductResponseDto;
import com.skyhigh.storeapi.repository.CategoryRepository;
import com.skyhigh.storeapi.repository.ParentCategoryRepository;
import com.skyhigh.storeapi.repository.ProductBrandRepository;
import com.skyhigh.storeapi.repository.ProductRepository;
import com.skyhigh.storeapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductBrandRepository productBrandRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public ProductResponseDto createProduct(ProductDto productDto) {
        try {
            Category category = categoryRepository.findById(productDto.getCategoryId())
                    .orElseThrow(
                            () -> new NotFoundException("Category not found")
                    );
            ProductBrand productBrand = productBrandRepository.findById(productDto.getBrandId())
                    .orElseThrow(
                            () -> new NotFoundException("Product brand not found")
                    );
            Product existProduct = productRepository
                    .findProductByProductNameAndCategoryAndProductBrand(productDto.getProductName(), category, productBrand);
            if (existProduct != null) {
                throw new AlreadyExistException("Product already exist");
            }
            Product product = Product.builder()
                    .productName(productDto.getProductName())
                    .photoUrl(productDto.getPhotoUrl())
                    .productBrand(productBrand)
                    .category(category)
                    .status(productDto.getStatus())
                    .build();
            product = productRepository.save(product);
            ProductResponseDto productResDto = conversionService.convert(product, ProductResponseDto.class);
            return productResDto;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ProductResponseDto getProduct(Long productId) {
        Optional<Product> product = productRepository.findById(productId);
        ProductResponseDto productResDto = conversionService.convert(product.get(), ProductResponseDto.class);
        return productResDto;
    }
}
