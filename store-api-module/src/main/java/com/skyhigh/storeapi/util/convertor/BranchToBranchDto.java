package com.skyhigh.storeapi.util.convertor;

import com.skyhigh.storeapi.model.Branch;
import com.skyhigh.storeapi.model.dto.AddressDto;
import com.skyhigh.storeapi.model.dto.BranchDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class BranchToBranchDto implements Converter<Branch, BranchDto> {

    @Autowired
    AddressToAddressDto conversionService;

    @Override
    public BranchDto convert(Branch branch) {
        AddressDto addressDto = conversionService.convert(branch.getAddress());
        BranchDto branchDto = BranchDto.builder()
                .branchId(branch.getBranchId())
                .branchName(branch.getBranchName())
                .photoUrl(branch.getPhotoUrl())
                .status(branch.getStatus())
                .address(addressDto)
                .storeId(branch.getStoreId())
                .build();
        return branchDto;
    }
}
