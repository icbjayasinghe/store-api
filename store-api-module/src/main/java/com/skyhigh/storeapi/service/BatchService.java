package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.BatchDto;
import com.skyhigh.storeapi.model.dto.BatchResponseDto;

public interface BatchService {
    BatchResponseDto createBatch(BatchDto batchDto);
}
