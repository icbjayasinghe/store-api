package com.skyhigh.storeapi.controller.impl;

import com.skyhigh.storeapi.controller.BranchApi;
import com.skyhigh.storeapi.exception.customException.ResourceNotFoundException;
import com.skyhigh.storeapi.model.dto.BranchDto;
import com.skyhigh.storeapi.model.dto.BranchResponseDto;


import com.skyhigh.storeapi.model.dto.StoreDto;
import com.skyhigh.storeapi.service.BranchService;
import com.skyhigh.storeapi.service.StoreService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T20:13:57.830681+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.storeAPIOpenAPI30.base-path:/api/v3}")
public class BranchApiController implements BranchApi {

    private final NativeWebRequest request;

    private static final Logger logger = LogManager.getLogger(ParentCategoryApiController.class);

    @Autowired
    BranchService branchService;

    @Autowired
    public BranchApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<BranchResponseDto> addBranch(BranchDto branchDto) {
        BranchResponseDto branchDtoRes = branchService.createBranch(branchDto);
        return ResponseEntity.ok(branchDtoRes);
    }

    @Override
    public ResponseEntity<BranchResponseDto> getBranchById(Long branchId) {
        BranchResponseDto branchRes = branchService.getBranch(branchId);
        if (branchRes == null) {
            logger.error("Branch with ID :"+branchId+" Not Found!");
            throw new ResourceNotFoundException("Branch with ID :"+branchId+" Not Found!");
        }
        logger.debug("Branch returned successfully : {}", () -> branchRes);
        return ResponseEntity.ok(branchRes);
    }
}
