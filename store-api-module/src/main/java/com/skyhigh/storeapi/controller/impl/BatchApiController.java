package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.BatchApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.BatchDto;
import com.skyhigh.storeapi.model.dto.BatchResponseDto;


import com.skyhigh.storeapi.model.dto.BranchResponseDto;
import com.skyhigh.storeapi.model.dto.SkuResponseDto;
import com.skyhigh.storeapi.service.BatchService;
import com.skyhigh.storeapi.service.BranchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-17T22:49:14.789018+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class BatchApiController implements BatchApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(BatchApiController.class);

    @Autowired
    BatchService batchService;

    @Autowired
    public BatchApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<BatchResponseDto> addBatch(BatchDto batchDto) {
        BatchResponseDto batchResponseDto = batchService.createBatch(batchDto);
        return ResponseEntity.ok(batchResponseDto);
    }

    @Override
    public ResponseEntity<Void> deleteBatch(Long batchId, String apiKey) {
        return BatchApi.super.deleteBatch(batchId, apiKey);
    }

    @Override
    public ResponseEntity<List<BatchResponseDto>> findBatchByStatus(String status) {
        List<BatchResponseDto> batchResponseDtoList = batchService.getBatchesByStatus(status);
        return ResponseEntity.ok(batchResponseDtoList);
    }

    @Override
    public ResponseEntity<BatchResponseDto> getBatchById(Long batchId) {
        BatchResponseDto batchResponseDto = batchService.getBatch(batchId);
        if (batchResponseDto == null) {
            throw new ResourceNotFoundException("Batch with ID :"+batchId+" Not Found!");
        }
        return ResponseEntity.ok(batchResponseDto);
    }

    @Override
    public ResponseEntity<BatchResponseDto> updateBatch(BatchDto batchDto) {
        return BatchApi.super.updateBatch(batchDto);
    }

    @Override
    public ResponseEntity<Void> updateBatchWithForm(Long batchId, String batchName, Double buyingPrice, Double sellingPrice, String status) {
        return BatchApi.super.updateBatchWithForm(batchId, batchName, buyingPrice, sellingPrice, status);
    }
}