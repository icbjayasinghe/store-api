package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.exception.customException.AlreadyExistException;
import com.skyhigh.storeapi.model.Batch;
import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.Sku;
import com.skyhigh.storeapi.model.dto.BatchDto;
import com.skyhigh.storeapi.model.dto.BatchResponseDto;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;
import com.skyhigh.storeapi.model.dto.SkuResponseDto;
import com.skyhigh.storeapi.model.enums.BatchStatus;
import com.skyhigh.storeapi.model.enums.SkuStatus;
import com.skyhigh.storeapi.repository.BatchRepository;
import com.skyhigh.storeapi.repository.SkuRepository;
import com.skyhigh.storeapi.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    SkuRepository skuRepository;

    @Autowired
    BatchRepository batchRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public BatchResponseDto createBatch(BatchDto batchDto) {
        try {
            Sku sku = skuRepository.findById(batchDto.getSkuId()).orElseThrow(
                    () -> new NotFoundException("SKU not found")
            );
            Batch batch = Batch.builder()
                    .batchNumber(batchDto.getBatchNumber())
                    .buyingPrice(batchDto.getBuyingPrice())
                    .sellingPrice(batchDto.getSellingPrice())
                    .inboundDate(batchDto.getInboundDate())
                    .photoUrl(batchDto.getPhotoUrl())
                    .skuId(batchDto.getSkuId())
                    .status(batchDto.getStatus())
                    .createdAt(OffsetDateTime.now())
                    .updatedAt(OffsetDateTime.now())
                    .build();
            batch = batchRepository.save(batch);
            BatchResponseDto batchResponseDto = conversionService.convert(batch, BatchResponseDto.class);
            return batchResponseDto;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public BatchResponseDto getBatch(Long batchId) {
        Optional<Batch> batch = batchRepository.findById(batchId);
        BatchResponseDto batchResponseDto = conversionService.convert(batch.get(), BatchResponseDto.class);
        return batchResponseDto;
    }

    @Override
    public List<BatchResponseDto> getBatchesByStatus(String status) {
        List<Batch> batchList = batchRepository.findAllByStatus(BatchStatus.valueOf(status));
        List<BatchResponseDto> batchResponseDtoList =batchList.stream().map( batch ->
                conversionService.convert(batch, BatchResponseDto.class)
        ).collect(Collectors.toList());
        return batchResponseDtoList;
    }
}
