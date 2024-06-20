package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.BatchDto;
import com.skyhigh.storeapi.model.dto.BatchResponseDto;

import java.util.List;

public interface BatchService {
    BatchResponseDto createBatch(BatchDto batchDto);

    BatchResponseDto getBatch(Long batchId);

    List<BatchResponseDto> getBatchesByStatus(String status);
}
