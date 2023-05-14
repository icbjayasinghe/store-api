package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.exception.customException.AlreadyExistException;
import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import com.skyhigh.storeapi.repository.ParentCategoryRepository;
import com.skyhigh.storeapi.service.ParentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParentCategoryServiceImpl implements ParentCategoryService {

    @Autowired
    ParentCategoryRepository parentCategoryRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public ParentCategoryDto createParentCategory(ParentCategoryDto parentCategoryDto) {
        try {
            ParentCategory existParentCategory = parentCategoryRepository.findParentCategoryByName(parentCategoryDto.getName());
            if (existParentCategory != null) {
                throw new AlreadyExistException("Parent category already exist");
            }
            ParentCategory parentCategory = ParentCategory.builder()
                    .name(parentCategoryDto.getName())
                    .status(parentCategoryDto.getStatus())
                    .photoUrl(parentCategoryDto.getPhotoUrl())
                    .parentCategoryId(parentCategoryDto.getParentCategoryId())
                    .build();
            parentCategory = parentCategoryRepository.save(parentCategory);
            ParentCategoryDto parentCategoryDtoRes = conversionService.convert(parentCategory, ParentCategoryDto.class);
            return parentCategoryDtoRes;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ParentCategoryDto getParentCategory(Long parentCategoryId) {
        Optional<ParentCategory> parentCategory = parentCategoryRepository.findById(parentCategoryId);
        ParentCategoryDto parentCategoryDtoRes = conversionService.convert(parentCategory.get(), ParentCategoryDto.class);
        return parentCategoryDtoRes;
    }
}
