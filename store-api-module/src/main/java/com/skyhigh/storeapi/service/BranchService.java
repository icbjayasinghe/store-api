package com.skyhigh.storeapi.service;

import com.skyhigh.storeapi.model.dto.BranchDto;
import com.skyhigh.storeapi.model.dto.BranchResponseDto;

public interface BranchService {
    BranchResponseDto createBranch(BranchDto branchDto);

    BranchResponseDto getBranch(Long branchId);
}
