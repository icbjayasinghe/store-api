package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.SkuApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.ModelApiResponse;
import com.skyhigh.storeapi.model.dto.ProductResponseDto;
import com.skyhigh.storeapi.model.dto.SkuDto;
import com.skyhigh.storeapi.model.dto.SkuResponseDto;


import com.skyhigh.storeapi.service.ProductService;
import com.skyhigh.storeapi.service.SkuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class SkuApiController implements SkuApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(SkuApiController.class);

    @Autowired
    private SkuService skuService;

    @Autowired
    public SkuApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<SkuResponseDto> addSku(SkuDto skuDto) {
        SkuResponseDto skuResponseDto = skuService.createSku(skuDto);
        return ResponseEntity.ok(skuResponseDto);
    }

    @Override
    public ResponseEntity<SkuResponseDto> getSkuById(Long skuId) {
        SkuResponseDto skuResponseDto = skuService.getSku(skuId);
        if (skuResponseDto == null) {
            throw new ResourceNotFoundException("SKU with ID :"+skuId+" Not Found!");
        }
        return ResponseEntity.ok(skuResponseDto);
    }

    @Override
    public ResponseEntity<List<SkuResponseDto>> findSkuByStatus(String status) {
        List<SkuResponseDto> skuResponseDtoList = skuService.getSkusByStatus(status);
        return ResponseEntity.ok(skuResponseDtoList);
    }
}
