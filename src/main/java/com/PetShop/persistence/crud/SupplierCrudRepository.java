package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierCrudRepository extends CrudRepository<Supplier,Integer> {
}
