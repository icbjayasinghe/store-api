package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.ParentCategoryDto;

public interface ParentCategoryService {
    ParentCategoryDto createParentCategory(ParentCategoryDto parentCategoryDto);
    ParentCategoryDto getParentCategory(Long parentCategoryId);
    ParentCategoryDto updateParentCategory(ParentCategoryDto parentCategoryDto);
}
