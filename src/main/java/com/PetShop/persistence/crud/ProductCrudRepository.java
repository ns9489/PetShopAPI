package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
}
