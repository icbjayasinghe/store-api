package com.skyhigh.storeapi.service.impl;

import com.skyhigh.storeapi.model.Address;
import com.skyhigh.storeapi.model.Branch;
import com.skyhigh.storeapi.model.ParentCategory;
import com.skyhigh.storeapi.model.Store;
import com.skyhigh.storeapi.model.dto.BranchDto;
import com.skyhigh.storeapi.model.dto.BranchResponseDto;
import com.skyhigh.storeapi.model.dto.StoreDto;
import com.skyhigh.storeapi.repository.AddressRepository;
import com.skyhigh.storeapi.repository.BranchRepository;
import com.skyhigh.storeapi.repository.StoreRepository;
import com.skyhigh.storeapi.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public BranchResponseDto createBranch(BranchDto branchDto) {
        try {
            Address address = Address.builder()
                    .addresLine1(branchDto.getAddress().getAddresLine1())
                    .addresLine2(branchDto.getAddress().getAddresLine2())
                    .city(branchDto.getAddress().getCity())
                    .country(branchDto.getAddress().getCountry())
                    .state(branchDto.getAddress().getState())
                    .zip(branchDto.getAddress().getZip())
                    .build();
            address = addressRepository.save(address);
            Store store = storeRepository.findById(branchDto.getStoreId()).orElseThrow(
                    () -> new NotFoundException("Store not found")
            );
            Branch branch = Branch.builder()
                    .branchName(branchDto.getBranchName())
                    .address(address)
                    .photoUrl(branchDto.getPhotoUrl())
                    .status(branchDto.getStatus())
                    .store(store)
                    .build();
            branch = branchRepository.save(branch);
            BranchResponseDto branchRes = conversionService.convert(branch, BranchResponseDto.class);
            return branchRes;
        }catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public BranchResponseDto getBranch(Long branchId) {
        Optional<Branch> branch = branchRepository.findById(branchId);
        BranchResponseDto branchDtoRes = conversionService.convert(branch.get(), BranchResponseDto.class);
        return branchDtoRes;
    }
}
