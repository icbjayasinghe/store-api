package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.ParentCategoryApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;


import com.skyhigh.storeapi.service.ParentCategoryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class ParentCategoryApiController implements ParentCategoryApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(ParentCategoryApiController.class);

    @Autowired
    private ParentCategoryService parentCategoryService;

    @Autowired
    public ParentCategoryApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ParentCategoryDto> addParentCategory(ParentCategoryDto parentCategoryDto) {
        ParentCategoryDto parentCategoryDtoRes = parentCategoryService.createParentCategory(parentCategoryDto);
        return ResponseEntity.ok(parentCategoryDtoRes);
    }

    @Override
    public ResponseEntity<ParentCategoryDto> getParentCategoryById(Long parentCategoryId) {
        ParentCategoryDto parentCategoryDtoRes = parentCategoryService.getParentCategory(parentCategoryId);
        if (parentCategoryDtoRes == null) {
            logger.error("Parent with ID :"+parentCategoryId+" Not Found!");
            throw new ResourceNotFoundException("Parent with ID :"+parentCategoryId+" Not Found!");
        }
        logger.debug("Parent category returned successfully : {}", () -> parentCategoryDtoRes);
        return ResponseEntity.ok(parentCategoryDtoRes);
    }

    @Override
    public ResponseEntity<ParentCategoryDto> updateParentCategory(ParentCategoryDto parentCategoryDto) {
        logger.debug("Received update request for Parent Category: {}", () -> parentCategoryDto);
        ParentCategoryDto parentCategoryDtoRes = parentCategoryService.updateParentCategory(parentCategoryDto);
        logger.debug("Parent category returned successfully : {}", () -> parentCategoryDtoRes);
        return ResponseEntity.ok(parentCategoryDtoRes);
    }
}
