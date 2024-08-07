package com.PetShop.persistance;

import com.PetShop.persistance.crud.PetCrudRepository;
import com.PetShop.persistance.crud.ProductCrudRepository;
import com.PetShop.persistance.entity.Product;

import java.util.List;

public class ProductRepository {

    private ProductCrudRepository ProductCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) ProductCrudRepository.findAll();
    }
}
