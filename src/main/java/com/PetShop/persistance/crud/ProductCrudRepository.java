package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer>{
}
