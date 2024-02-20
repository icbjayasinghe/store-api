package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Address;
import com.skyhigh.storeapi.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
