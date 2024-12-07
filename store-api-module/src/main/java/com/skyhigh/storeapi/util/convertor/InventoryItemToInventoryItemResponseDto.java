package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.*;
import com.skyhigh.storeapi.model.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class InventoryItemToInventoryItemResponseDto implements Converter<InventoryItem, InventoryItemResponseDto> {

    @Autowired
    AddressToAddressDto conversionService;

    @Override
    public InventoryItemResponseDto convert(InventoryItem inventoryItem) {
        Batch batch = inventoryItem.getBatch();
        Sku sku = batch.getSku();

        InventoryItemResponseDto itemResponseDto = InventoryItemResponseDto.builder()
                .inventoryItemId(inventoryItem.getInventoryItemId())
                .status(inventoryItem.getStatus())
                .batchNumber(batch.getBatchNumber())
                .expireDate(batch.getExpireDate())
                .manufactureDate(batch.getManufactureDate())
                .skuName(sku.getSkuName())
                .buyingPrice(inventoryItem.getBuyingPrice())
                .sellingPrice(inventoryItem.getSellingPrice())
                .inboundDate(inventoryItem.getInboundDate())
                .quantity(inventoryItem.getQuantity())
                .build();

        return itemResponseDto;
    }
}
