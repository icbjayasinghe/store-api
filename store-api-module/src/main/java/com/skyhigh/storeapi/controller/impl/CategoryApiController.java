package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.CategoryApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.CategoryDto;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;


import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import com.skyhigh.storeapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class CategoryApiController implements CategoryApi {

    private final NativeWebRequest request;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    public CategoryApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<CategoryResponseDto> addCategory(CategoryDto categoryDto) {
        CategoryResponseDto categoryResDto = categoryService.createCategory(categoryDto);
        return ResponseEntity.ok(categoryResDto);
    }

    @Override
    public ResponseEntity<CategoryResponseDto> updateCategory(CategoryDto categoryDto) {
        CategoryResponseDto categoryResDto = categoryService.updateCategory(categoryDto);
        return ResponseEntity.ok(categoryResDto);
    }

    @Override
    public ResponseEntity<CategoryResponseDto> getCategoryById(Long categoryId) {
        CategoryResponseDto categoryResDto = categoryService.getCategory(categoryId);
        if (categoryResDto == null) {
            throw new ResourceNotFoundException("Category with ID :"+categoryId+" Not Found!");
        }
        return ResponseEntity.ok(categoryResDto);
    }
}
