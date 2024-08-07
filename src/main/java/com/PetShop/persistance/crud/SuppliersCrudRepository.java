package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Suppliers;
import org.springframework.data.repository.CrudRepository;

import java.util.function.Supplier;

public interface SuppliersCrudRepository extends CrudRepository<Suppliers, Integer> {
}
