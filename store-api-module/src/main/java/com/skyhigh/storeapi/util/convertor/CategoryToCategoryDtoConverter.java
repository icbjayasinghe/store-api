package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.dto.CategoryDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class CategoryToCategoryDtoConverter implements Converter<Category, CategoryDto> {
    @Override
    public CategoryDto convert(Category category) {
        CategoryDto categoryDto = CategoryDto.builder()
                .categoryId(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .parentCategoryId(category.getParentCategory().getParentCategoryId())
                .status(category.getStatus())
                .photoUrl(category.getPhotoUrl())
                .build();
        return categoryDto;
    }
}
