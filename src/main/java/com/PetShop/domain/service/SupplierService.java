package com.PetShop.domain.service;

import com.PetShop.domain.dto.SupplierDTO;
import com.PetShop.domain.repository.SupplierDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierDomainRepository supplierDomainRepository;

    public List<SupplierDTO> getAll() {
        return supplierDomainRepository.getAll();
    }

    public Optional<SupplierDTO> getSupplierById(int id) {
        return supplierDomainRepository.getSupplierById(id);
    }

    public SupplierDTO save(SupplierDTO supplierDTO) {
        return supplierDomainRepository.save(supplierDTO);
    }

    public boolean delete(int id) {
        return getSupplierById(id).map(supplier -> {
            supplierDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsSupplier(int id) {
        return supplierDomainRepository.existsSupplier(id);
    }

    public long countAll() {
        return supplierDomainRepository.countAll();
    }
}
