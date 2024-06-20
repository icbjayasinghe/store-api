package com.skyhigh.storeapi.repository;

import com.skyhigh.storeapi.model.Batch;
import com.skyhigh.storeapi.model.enums.BatchStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Long> {

    List<Batch> findAllByStatus(BatchStatus status);
}
