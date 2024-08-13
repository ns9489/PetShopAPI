package com.PetShop.persistance;

import com.PetShop.persistance.crud.SuppliersCrudRepository;
import com.PetShop.persistance.entity.Owner;
import com.PetShop.persistance.entity.Suppliers;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SuppliersRepository {
    private SuppliersCrudRepository suppliersCrudRepository;

    public List<Suppliers> getAll() {
    return (List<Suppliers>) suppliersCrudRepository.findAll();
 }

    public Optional<Suppliers> getSuppliersByID(int id){
        return suppliersCrudRepository.findById(id);
    }
    public Suppliers save (Suppliers suppliers){
        return suppliersCrudRepository.save(suppliers);
    }
    public void delete (int id){
        suppliersCrudRepository.deleteById(id);
    }

    public boolean existsProduct(int id){
        return suppliersCrudRepository.existsById(id);
    }
    public long countAll(){
        return suppliersCrudRepository.count();
    }

}
