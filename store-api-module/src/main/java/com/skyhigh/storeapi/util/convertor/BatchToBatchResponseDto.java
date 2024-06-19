package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Batch;
import com.skyhigh.storeapi.model.Branch;
import com.skyhigh.storeapi.model.Sku;
import com.skyhigh.storeapi.model.dto.BatchResponseDto;
import com.skyhigh.storeapi.model.dto.BranchDto;
import com.skyhigh.storeapi.model.dto.SkuDto;
import com.skyhigh.storeapi.repository.SkuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class BatchToBatchResponseDto implements Converter<Batch, BatchResponseDto> {

    @Autowired
    SkuRepository skuRepository;

    @Override
    public BatchResponseDto convert(Batch batch) {
        Sku sku = skuRepository.findById(batch.getSkuId()).get();

        SkuDto skuDto = SkuDto.builder()
                .skuId(sku.getSkuId())
                .skuName(sku.getSkuName())
                .photoUrl(sku.getPhotoUrl())
                .productId(sku.getProduct().getProductId())
                .concatProductName(sku.getConcatProductName())
                .status(sku.getStatus())
                .build();

        BatchResponseDto batchResponseDto = BatchResponseDto.builder()
                .batchId(batch.getBatchId())
                .batchNumber(batch.getBatchNumber())
                .photoUrl(batch.getPhotoUrl())
                .buyingPrice(batch.getBuyingPrice())
                .sellingPrice(batch.getSellingPrice())
                .inboundDate(batch.getInboundDate())
                .status(batch.getStatus())
                .sku(skuDto)
                .build();
        return batchResponseDto;
    }
}
