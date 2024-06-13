package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.SkuDto;
import com.skyhigh.storeapi.model.dto.SkuResponseDto;

import java.util.List;

public interface SkuService {
    SkuResponseDto createSku(SkuDto skuDto);

    SkuResponseDto getSku(Long skuId);

    List<SkuResponseDto> getSkusByStatus(String status);
}
