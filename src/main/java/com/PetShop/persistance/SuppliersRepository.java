package com.PetShop.persistance;

import com.PetShop.persistance.crud.SuppliersCrudRepository;
import com.PetShop.persistance.entity.Owner;
import com.PetShop.persistance.entity.Suppliers;

import java.util.List;
import java.util.Optional;

public class SuppliersRepository {
    private SuppliersCrudRepository SuppliersCrudRepository;

    public List<Suppliers> getAll() {
    return (List<Suppliers>) SuppliersCrudRepository.findAll();
 }

    public Optional<Suppliers> getSuppliersByID(int id){
        return SuppliersCrudRepository.findById(id);
    }
    public Suppliers save (Suppliers suppliers){
        return SuppliersCrudRepository.save(suppliers);
    }
    public void delete (int id){
        SuppliersCrudRepository.deleteById(id);
    }
}
