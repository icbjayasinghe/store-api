package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class ParentCategoryToParentCategoryDtoConverter implements Converter<ParentCategory, ParentCategoryDto> {
    @Override
    public ParentCategoryDto convert(ParentCategory parentCategory) {
        ParentCategoryDto parentCategoryDto = ParentCategoryDto.builder()
                .parentCategoryId(parentCategory.getParentCategoryId())
                .name(parentCategory.getName())
                .photoUrl(parentCategory.getPhotoUrl())
                .status(parentCategory.getStatus())
                .build();
        return parentCategoryDto;
    }
}
