package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.CategoryDto;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto getCategory(Long categoryId);
}
