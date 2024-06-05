package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Branch;
import com.skyhigh.storeapi.model.Store;
import com.skyhigh.storeapi.model.dto.AddressDto;
import com.skyhigh.storeapi.model.dto.BranchResponseDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import com.skyhigh.storeapi.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class BranchToBranchResponseDto implements Converter<Branch, BranchResponseDto> {
    @Autowired
    AddressToAddressDto addressToAddressDto;
    @Autowired
    StoreToStoreDto storeToStoreDto;
    @Autowired
    StoreRepository storeRepository;

    @Override
    public BranchResponseDto convert(Branch branch) {
        AddressDto addressDto = addressToAddressDto.convert(branch.getAddress());
        Store store = storeRepository.findById(branch.getStoreId()).get();
        StoreDto storeDto = storeToStoreDto.convert(store);
        BranchResponseDto branchResponseDto = BranchResponseDto.builder()
                .branchId(branch.getBranchId())
                .store(storeDto)
                .branchName(branch.getBranchName())
                .photoUrl(branch.getPhotoUrl())
                .address(addressDto)
                .status(branch.getStatus())
                .build();
        return branchResponseDto;
    }
}
