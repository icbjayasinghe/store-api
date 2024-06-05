package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.StoreApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.ParentCategoryDto;
import com.skyhigh.storeapi.model.dto.StoreConfDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import com.skyhigh.storeapi.service.StoreService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.IDToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;


import java.security.Principal;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class StoreApiController implements StoreApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(ParentCategoryApiController.class);

    @Autowired
    StoreService storeService;

    @Autowired
    public StoreApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<StoreDto> addStore(StoreDto storeDto) {
        StoreDto storeDtoRes = storeService.createStore(storeDto);
        return ResponseEntity.ok(storeDtoRes);
    }

    @Override
    public ResponseEntity<StoreDto> getStoreById(Long storeId) {
        StoreDto storeDtoRes = storeService.getStore(storeId);
        if (storeDtoRes == null) {
            logger.error("Store with ID :"+storeId+" Not Found!");
            throw new ResourceNotFoundException("Store with ID :"+storeId+" Not Found!");
        }
        logger.debug("Store returned successfully : {}", () -> storeDtoRes);
        return ResponseEntity.ok(storeDtoRes);
    }

    @Override
    public ResponseEntity<StoreConfDto> findStoreDetails() {
        logger.debug("ICB " +request.getHeader("Authorization"));
        StoreConfDto storeConfDtoRes = storeService.getStoreConfig(request);
        logger.debug("Store config returned successfully : {}", () -> storeConfDtoRes);
        return ResponseEntity.ok(storeConfDtoRes);
    }

}
