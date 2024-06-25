package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.model.Batch;
import com.skyhigh.storeapi.model.Branch;
import com.skyhigh.storeapi.model.InventoryItem;
import com.skyhigh.storeapi.model.Sku;
import com.skyhigh.storeapi.model.dto.BatchResponseDto;
import com.skyhigh.storeapi.model.dto.InventoryItemDto;
import com.skyhigh.storeapi.model.dto.InventoryItemResponseDto;
import com.skyhigh.storeapi.model.enums.BatchStatus;
import com.skyhigh.storeapi.model.enums.InventoryItemStatus;
import com.skyhigh.storeapi.repository.BatchRepository;
import com.skyhigh.storeapi.repository.BranchRepository;
import com.skyhigh.storeapi.repository.InventoryRepository;
import com.skyhigh.storeapi.service.InventoryService;
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
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    @Autowired
    BatchRepository batchRepository;

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public InventoryItemResponseDto getInventory(Long inventoryItemId) {
        Optional<InventoryItem> inventoryItem = inventoryRepository.findById(inventoryItemId);
        InventoryItemResponseDto itemResponseDto = conversionService.convert(inventoryItem.get(), InventoryItemResponseDto.class);
        return itemResponseDto;
    }

    @Override
    public InventoryItemResponseDto createInventoryItem(InventoryItemDto inventoryItemDto) {
        try {
            Batch batch = batchRepository.findById(inventoryItemDto.getBatchId()).orElseThrow(
                    () -> new NotFoundException("Batch not found")
            );
            InventoryItem inventoryItem = InventoryItem.builder()
                    .quantity(inventoryItemDto.getQuantity())
                    .batch(batch)
                    .status(inventoryItemDto.getStatus())
                    .inboundDate(inventoryItemDto.getInboundDate())
                    .createdAt(OffsetDateTime.now())
                    .updatedAt(OffsetDateTime.now())
                    .build();
            inventoryItem = inventoryRepository.save(inventoryItem);
            InventoryItemResponseDto itemResponseDto = conversionService.convert(inventoryItem, InventoryItemResponseDto.class);
            return itemResponseDto;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<InventoryItemResponseDto> getInventoryItemByBranch(Long branchId, InventoryItemStatus status) {
        try {
            Branch branch = branchRepository.findById(branchId).orElseThrow(
                    () -> new NotFoundException("Branch not found")
            );
            List<InventoryItem> inventoryItems;
            if (status != null) {
                inventoryItems = inventoryRepository.findAllByBranchAndStatus(branchId, status);
            } else {
                inventoryItems = inventoryRepository.findAllByBranch(branchId);
            }
            List<InventoryItemResponseDto> itemResponseDtoList = inventoryItems.stream().map( inventoryItem ->
                    conversionService.convert(inventoryItem, InventoryItemResponseDto.class)
            ).collect(Collectors.toList());
            return itemResponseDtoList;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        }catch (Exception e) {
            throw e;
        }

    }
}
