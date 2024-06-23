package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Batch;
import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.InventoryItem;
import com.skyhigh.storeapi.model.dto.BatchDto;
import com.skyhigh.storeapi.model.dto.CategoryResponseDto;
import com.skyhigh.storeapi.model.dto.InventoryItemResponseDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class InventoryItemToInventoryItemResponseDto implements Converter<InventoryItem, InventoryItemResponseDto> {

    @Override
    public InventoryItemResponseDto convert(InventoryItem inventoryItem) {
        Batch batch = inventoryItem.getBatch();
        BatchDto batchDto = BatchDto.builder()
                .batchId(batch.getBatchId())
                .batchNumber(batch.getBatchNumber())
                .buyingPrice(batch.getBuyingPrice())
                .sellingPrice(batch.getSellingPrice())
                .photoUrl(batch.getPhotoUrl())
                .inboundDate(batch.getInboundDate())
                .status(batch.getStatus())
                .branchId(batch.getBranch().getBranchId())
                .skuId(batch.getSku().getSkuId())
                .build();
        InventoryItemResponseDto itemResponseDto = InventoryItemResponseDto.builder()
                .inventoryItemId(inventoryItem.getInventoryItemId())
                .status(inventoryItem.getStatus())
                .batch(batchDto)
                .inboundDate(inventoryItem.getInboundDate())
                .quantity(inventoryItem.getQuantity())
                .build();
        return itemResponseDto;
    }
}
