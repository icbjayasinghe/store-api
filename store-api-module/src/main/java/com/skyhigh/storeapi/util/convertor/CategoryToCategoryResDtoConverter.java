package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class CategoryToCategoryResDtoConverter implements Converter<Category, CategoryResponseDto> {

    @Autowired
    ParentCategoryToParentCategoryDtoConverter conversionService;

    @Override
    public CategoryResponseDto convert(Category category) {
        ParentCategoryDto parentCategoryDto = conversionService.convert(category.getParentCategory());
        CategoryResponseDto categoryResDto = CategoryResponseDto.builder()
                .categoryId(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .parentCategory(parentCategoryDto)
                .status(category.getStatus())
                .photoUrl(category.getPhotoUrl())
                .build();
        return categoryResDto;
    }
}
