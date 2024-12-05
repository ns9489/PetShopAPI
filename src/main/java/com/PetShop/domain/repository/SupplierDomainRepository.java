package com.PetShop.domain.repository;

import com.PetShop.domain.SupplierDomain;
import com.PetShop.domain.dto.SupplierDTO;

import java.util.List;
import java.util.Optional;

public interface SupplierDomainRepository {
    List<SupplierDTO> getAll();
    Optional<SupplierDTO> getSupplierById(int id);
    SupplierDTO save(SupplierDTO supplierDTO);
    void delete(int id);
    boolean existsSupplier(int id);
    long countAll();
}
