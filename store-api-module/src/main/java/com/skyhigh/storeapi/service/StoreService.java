package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.StoreConfDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import org.springframework.web.context.request.NativeWebRequest;

public interface StoreService {
    StoreDto createStore(StoreDto storeDto);
    StoreDto getStore(Long storeId);
    StoreDto updateStore(StoreDto storeDto);
    StoreConfDto getStoreConfig(NativeWebRequest request);
}
