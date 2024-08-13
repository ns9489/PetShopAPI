package com.PetShop.persistance;

import com.PetShop.persistance.crud.ProductCrudRepository;
import com.PetShop.persistance.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private ProductCrudRepository ProductCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) ProductCrudRepository.findAll();
    }

    public Optional<Product> getProductByID(int id){
        return ProductCrudRepository.findById(id);
    }
    public Product save (Product product){
        return ProductCrudRepository.save(product);
    }
    public void delete (int id){
        ProductCrudRepository.deleteById(id);
    }

    public boolean existsProduct(int id){
        return ProductCrudRepository.existsById(id);
    }
    public long countAll(){
        return ProductCrudRepository.count();
    }
}
