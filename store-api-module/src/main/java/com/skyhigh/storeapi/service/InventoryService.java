package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.InventoryItemDto;
import com.skyhigh.storeapi.model.dto.InventoryItemResponseDto;

public interface InventoryService {
    InventoryItemResponseDto getInventory(Long inventoryItemId);

    InventoryItemResponseDto createInventoryItem(InventoryItemDto inventoryItemDto);
}
