package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.InventoryItemDto;
import com.skyhigh.storeapi.model.dto.InventoryItemResponseDto;
import com.skyhigh.storeapi.model.enums.InventoryItemStatus;

import java.util.List;

public interface InventoryService {
    InventoryItemResponseDto getInventory(Long inventoryItemId);

    InventoryItemResponseDto createInventoryItem(InventoryItemDto inventoryItemDto);

    List<InventoryItemResponseDto> getInventoryItemByBranch(Long branchId, InventoryItemStatus status);
}
