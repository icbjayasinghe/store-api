package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.exception.customException.AlreadyExistException;
import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.dto.CategoryDto;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import com.skyhigh.storeapi.repository.CategoryRepository;
import com.skyhigh.storeapi.repository.ParentCategoryRepository;
import com.skyhigh.storeapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ParentCategoryRepository parentCategoryRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public CategoryResponseDto createCategory(CategoryDto categoryDto) {
        try {
            Category existCategory = categoryRepository.findCategoryByCategoryName(categoryDto.getCategoryName());
            if (existCategory != null) {
                throw new AlreadyExistException("Category already exist");
            }
            ParentCategory parentCategory = parentCategoryRepository.findById(categoryDto.getParentCategoryId()).orElseThrow(
                    () -> new NotFoundException("Parent Category not found")
            );
            Category category = Category.builder()
                    .categoryName(categoryDto.getCategoryName())
                    .status(categoryDto.getStatus())
                    .photoUrl(categoryDto.getPhotoUrl())
                    .parentCategory(parentCategory)
                    .categoryId(categoryDto.getCategoryId())
                    .build();
            category = categoryRepository.save(category);
            CategoryResponseDto categoryResDto = conversionService.convert(category, CategoryResponseDto.class);
            return categoryResDto;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public CategoryResponseDto getCategory(Long categoryId) {
        Optional<Category> category = categoryRepository.findById(categoryId);
        CategoryResponseDto categoryResDto = conversionService.convert(category.get(), CategoryResponseDto.class);
        return categoryResDto;
    }

    @Override
    public CategoryResponseDto updateCategory(CategoryDto categoryDto) {
        Category category = categoryRepository.findById(categoryDto.getCategoryId()).orElseThrow(
                () -> new NotFoundException("Category with ID :"+categoryDto.getCategoryId()+" Not Found!")
        );
        ParentCategory parentCategory = parentCategoryRepository.findById(categoryDto.getParentCategoryId()).orElseThrow(
                () -> new NotFoundException("Parent Category with ID :"+categoryDto.getParentCategoryId()+" Not Found!")
        );
        category.setCategoryName(categoryDto.getCategoryName());
        category.setParentCategory(parentCategory);
        category.setStatus(category.getStatus());
        category.setPhotoUrl(category.getPhotoUrl());
        category = categoryRepository.save(category);
        CategoryResponseDto categoryResDto = conversionService.convert(category, CategoryResponseDto.class);
        return categoryResDto;
    }
}
