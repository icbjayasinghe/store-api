package com.skyhigh.storeapi.util.convertor;

import org.springframework.core.convert.converter.Converter;
import com.skyhigh.storeapi.model.Store;
import com.skyhigh.storeapi.model.dto.AddressDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreToStoreDto implements Converter<Store, StoreDto> {
    @Autowired
    AddressToAddressDto conversionService;
    @Override
    public StoreDto convert(Store store) {
        AddressDto addressDto = conversionService.convert(store.getAddress());
        StoreDto storeDto = StoreDto.builder()
                .storeId(store.getStoreId())
                .storeName(store.getStoreName())
                .photoUrl(store.getPhotoUrl())
                .status(store.getStatus())
                .address(addressDto)
                .build();
        return storeDto;
    }
}
