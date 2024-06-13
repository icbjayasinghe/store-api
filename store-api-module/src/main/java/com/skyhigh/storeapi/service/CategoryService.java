package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.CategoryDto;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;

public interface CategoryService {
    CategoryResponseDto createCategory(CategoryDto categoryDto);
    CategoryResponseDto getCategory(Long categoryId);
    CategoryResponseDto updateCategory(CategoryDto categoryDto);
}
