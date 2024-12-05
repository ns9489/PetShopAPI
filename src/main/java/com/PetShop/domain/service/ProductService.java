package com.PetShop.domain.service;

import com.PetShop.domain.dto.ProductDTO;
import com.PetShop.domain.repository.ProductDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDomainRepository productDomainRepository;

    public List<ProductDTO> getAll() {
        return productDomainRepository.getAll();
    }

    public Optional<ProductDTO> getProductById(int id) {
        return productDomainRepository.getProductById(id);
    }

    public ProductDTO save(ProductDTO productDTO) {
        return productDomainRepository.save(productDTO);
    }

    public boolean delete(int id) {
        return getProductById(id).map(product -> {
            productDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsProduct(int id) {
        return productDomainRepository.existsProduct(id);
    }

    public long countAll() {
        return productDomainRepository.countAll();
    }
}
