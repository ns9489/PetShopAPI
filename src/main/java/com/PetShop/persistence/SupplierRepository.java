package com.PetShop.persistence;

import com.PetShop.domain.dto.SupplierDTO;
import com.PetShop.domain.repository.SupplierDomainRepository;
import com.PetShop.persistence.crud.SupplierCrudRepository;
import com.PetShop.persistence.entity.Supplier;
import com.PetShop.persistence.mapper.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SupplierRepository implements SupplierDomainRepository {
    @Autowired
    private SupplierMapper supplierMapper;

    @Autowired
    private SupplierCrudRepository supplierCrudRepository;

    @Override
    public List<SupplierDTO> getAll() {
        List<Supplier> suppliers = (List<Supplier>) supplierCrudRepository.findAll();
        return supplierMapper.toSupplierDTO(suppliers);
    }

    @Override
    public Optional<SupplierDTO> getSupplierById(int id) {
        return supplierCrudRepository.findById(id).map(supplierMapper::toSupplierDTO);
    }

    @Override
    public SupplierDTO save(SupplierDTO supplierDTO) {
        Supplier supplier = supplierMapper.toSupplier(supplierDTO);
        return supplierMapper.toSupplierDTO(supplierCrudRepository.save(supplier));
    }

    @Override
    public void delete(int id) {
        supplierCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsSupplier(int id) {
        return supplierCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return supplierCrudRepository.count();
    }
}
