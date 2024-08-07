package com.PetShop.persistance;

import com.PetShop.persistance.crud.SuppliersCrudRepository;
import com.PetShop.persistance.entity.Suppliers;

import java.util.List;

public class SuppliersRepository {
    private SuppliersCrudRepository SuppliersCrudRepository;

    public List<Suppliers> getAll() {
    return (List<Suppliers>) SuppliersCrudRepository.findAll();
 }
}
