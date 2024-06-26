package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.ProductApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.*;


import com.skyhigh.storeapi.service.ProductService;
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
public class ProductApiController implements ProductApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(ProductApiController.class);

    @Autowired
    private ProductService productService;

    @Autowired
    public ProductApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<ProductResponseDto> addProduct(ProductDto productDto) {
        ProductResponseDto productResponseDto = productService.createProduct(productDto);
        return ResponseEntity.ok(productResponseDto);
    }

    @Override
    public ResponseEntity<ProductResponseDto> getProductById(Long productId) {
        ProductResponseDto productResDto = productService.getProduct(productId);
        if (productResDto == null) {
            throw new ResourceNotFoundException("Product with ID :"+productId+" Not Found!");
        }
        return ResponseEntity.ok(productResDto);
    }
}
