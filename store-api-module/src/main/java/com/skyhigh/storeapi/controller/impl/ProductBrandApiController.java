package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.ProductBrandApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;
import com.skyhigh.storeapi.model.dto.ModelApiResponse;
import com.skyhigh.storeapi.model.dto.ProductBrandDto;


import com.skyhigh.storeapi.service.ParentCategoryService;
import com.skyhigh.storeapi.service.ProductBrandService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
public class ProductBrandApiController implements ProductBrandApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(ProductBrandApiController.class);

    @Autowired
    private ProductBrandService productBrandService;

    @Autowired
    public ProductBrandApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ProductBrandDto> addProductBrand(ProductBrandDto productBrandDto) {
        ProductBrandDto productBrandResDto = productBrandService.createProductBrand(productBrandDto);
        return ResponseEntity.ok(productBrandResDto);
    }

    @Override
    public ResponseEntity<ProductBrandDto> getProductBrandById(Long brandId) {
        ProductBrandDto productBrandResDto = productBrandService.getProductBrand(brandId);
        if (productBrandResDto == null) {
            throw new ResourceNotFoundException("Product Brand with ID :"+brandId+" Not Found!");
        }
        return ResponseEntity.ok(productBrandResDto);
    }
}
