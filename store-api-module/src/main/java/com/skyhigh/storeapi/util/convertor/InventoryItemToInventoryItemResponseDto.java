package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Batch;
import com.skyhigh.storeapi.model.Branch;
import com.skyhigh.storeapi.model.Category;
import com.skyhigh.storeapi.model.InventoryItem;
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
        BatchDto batchDto = BatchDto.builder()
                .batchId(batch.getBatchId())
                .batchNumber(batch.getBatchNumber())
                .photoUrl(batch.getPhotoUrl())
                .manufactureDate(batch.getManufactureDate())
                .expireDate(batch.getExpireDate())
                .status(batch.getStatus())
                .skuId(batch.getSku().getSkuId())
                .build();
        Branch branch = inventoryItem.getBranch();

        AddressDto addressDto = conversionService.convert(branch.getAddress());

        BranchDto branchDto = BranchDto.builder()
                .branchId(branch.getBranchId())
                .branchName(branch.getBranchName())
                .address(addressDto)
                .status(branch.getStatus())
                .storeId(branch.getStore().getStoreId())
                .photoUrl(batch.getPhotoUrl()).build();

        InventoryItemResponseDto itemResponseDto = InventoryItemResponseDto.builder()
                .inventoryItemId(inventoryItem.getInventoryItemId())
                .status(inventoryItem.getStatus())
                .batch(batchDto)
                .branch(branchDto)
                .buyingPrice(inventoryItem.getBuyingPrice())
                .sellingPrice(inventoryItem.getSellingPrice())
                .inboundDate(inventoryItem.getInboundDate())
                .quantity(inventoryItem.getQuantity())
                .build();

        return itemResponseDto;
    }
}
