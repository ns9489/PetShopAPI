package com.PetShop.domain.repository;

import com.PetShop.domain.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductDomainRepository {
    List<ProductDTO> getAll();
    Optional<ProductDTO> getProductById(int id);
    ProductDTO save(ProductDTO productDTO);
    void delete(int id);
    boolean existsProduct(int id);
    long countAll();
}
