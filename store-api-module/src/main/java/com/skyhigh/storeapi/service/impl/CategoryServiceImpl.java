package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.model.dto.CategoryDto;
import com.skyhigh.storeapi.repository.CategoryRepository;
import com.skyhigh.storeapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {

        return null;
    }

    @Override
    public CategoryDto getCategory(Long categoryId) {
        return null;
    }
}
