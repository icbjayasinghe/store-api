package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.InventoryItemApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.BatchResponseDto;
import com.skyhigh.storeapi.model.dto.InventoryItemDto;
import com.skyhigh.storeapi.model.dto.InventoryItemResponseDto;


import com.skyhigh.storeapi.model.enums.InventoryItemStatus;
import com.skyhigh.storeapi.service.BatchService;
import com.skyhigh.storeapi.service.InventoryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class InventoryItemApiController implements InventoryItemApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(InventoryItemApiController.class);

    @Autowired
    InventoryService inventoryService;

    @Autowired
    public InventoryItemApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<InventoryItemResponseDto> addInventoryItem(InventoryItemDto inventoryItemDto) {
        InventoryItemResponseDto itemResponseDto = inventoryService.createInventoryItem(inventoryItemDto);
        return ResponseEntity.ok(itemResponseDto);
    }

    @Override
    public ResponseEntity<Void> deleteInventoryItem(Long inventoryItemId, String apiKey) {
        return InventoryItemApi.super.deleteInventoryItem(inventoryItemId, apiKey);
    }

    @Override
    public ResponseEntity<List<InventoryItemResponseDto>> findInventoryItemByBranch(Long branchId, InventoryItemStatus status) {
        List<InventoryItemResponseDto> itemResponseDtoList = inventoryService.getInventoryItemByBranch(branchId, status);
        return ResponseEntity.ok(itemResponseDtoList);
    }

    @Override
    public ResponseEntity<List<InventoryItemResponseDto>> findInventoryItemByStatus(String status) {
        return InventoryItemApi.super.findInventoryItemByStatus(status);
    }

    @Override
    public ResponseEntity<InventoryItemResponseDto> getInventoryItemById(Long inventoryItemId) {
        InventoryItemResponseDto inventoryItemResponseDto = inventoryService.getInventory(inventoryItemId);
        if (inventoryItemResponseDto == null) {
            throw new ResourceNotFoundException("Inventory with ID :"+inventoryItemId+" Not Found!");
        }
        return ResponseEntity.ok(inventoryItemResponseDto);
    }

    @Override
    public ResponseEntity<InventoryItemResponseDto> updateInventoryItem(InventoryItemDto inventoryItemDto) {
        return InventoryItemApi.super.updateInventoryItem(inventoryItemDto);
    }

    @Override
    public ResponseEntity<Void> updateInventoryItemWithForm(Long inventoryItemId, Long branchId, Long batchId, Long quantity, String status) {
        return InventoryItemApi.super.updateInventoryItemWithForm(inventoryItemId, branchId, batchId, quantity, status);
    }
}
