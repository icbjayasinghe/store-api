package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.model.Address;
import com.skyhigh.storeapi.model.Store;
import com.skyhigh.storeapi.model.dto.*;
import com.skyhigh.storeapi.model.enums.StoreConfDto;
import com.skyhigh.storeapi.repository.AddressRepository;
import com.skyhigh.storeapi.repository.BranchRepository;
import com.skyhigh.storeapi.repository.StoreRepository;
import com.skyhigh.storeapi.service.StoreService;
import com.skyhigh.storeapi.util.RoleFilterUtil;
import com.skyhigh.storeapi.util.TokenConversionUtil;
import org.keycloak.representations.AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Map;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    ConversionService conversionService;

    @Autowired
    TokenConversionUtil tokenConversionUtil;

    @Autowired
    RoleFilterUtil roleFilterUtil;

    @Override
    public StoreDto createStore(StoreDto storeDto) {
        try {
            Address address = Address.builder()
                    .addresLine1(storeDto.getAddress().getAddresLine1())
                    .addresLine2(storeDto.getAddress().getAddresLine2())
                    .city(storeDto.getAddress().getCity())
                    .country(storeDto.getAddress().getCountry())
                    .state(storeDto.getAddress().getState())
                    .zip(storeDto.getAddress().getZip())
                    .build();
            address = addressRepository.save(address);
            Store store = Store.builder()
                    .storeName(storeDto.getStoreName())
                    .status(storeDto.getStatus())
                    .photoUrl(storeDto.getPhotoUrl())
                    .address(address)
                    .build();
            store = storeRepository.save(store);
            StoreDto storeDtoRes = conversionService.convert(store, StoreDto.class);
            return storeDtoRes;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public StoreDto getStore(Long storeId) {
        Optional<Store> store = storeRepository.findById(storeId);
        StoreDto storeDtoRes = conversionService.convert(store.get(), StoreDto.class);
        return storeDtoRes;
    }

    @Override
    public StoreDto updateStore(StoreDto storeDto) {
        return null;
    }

    @Override
    public StoreConfDto getStoreConfig(NativeWebRequest request) {
        StoreConfDto storeConfDto = new StoreConfDto();
        AccessToken accessToken = tokenConversionUtil.getAccessToken(request);

        Map<String, Object> customPrams = accessToken.getOtherClaims();
        if (customPrams.containsKey("store_id")) {
            Long storeId = Long.valueOf(String.valueOf(customPrams.get("store_id")));
            Optional<Store> store = storeRepository.findById(storeId);
            StoreDto storeDto = conversionService.convert(store.get(), StoreDto.class);
            storeConfDto.setStore(storeDto);
        }
        UserConfDto userConfDto = new UserConfDto(accessToken.getGivenName(), accessToken.getFamilyName(), roleFilterUtil.filterAppRole(accessToken.getRealmAccess().getRoles()));
        storeConfDto.setUser(userConfDto);
        return storeConfDto;
    }
}
