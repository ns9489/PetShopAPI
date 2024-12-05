package com.PetShop.persistence;

import com.PetShop.domain.dto.ProductDTO;
import com.PetShop.domain.repository.ProductDomainRepository;
import com.PetShop.persistence.crud.ProductCrudRepository;
import com.PetShop.persistence.entity.Product;
import com.PetShop.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements ProductDomainRepository {
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductCrudRepository productCrudRepository;

    @Override
    public List<ProductDTO> getAll() {
        List<Product> products = (List<Product>) productCrudRepository.findAll();
        return productMapper.toProductDTO(products);
    }

    @Override
    public Optional<ProductDTO> getProductById(int id) {
        return productCrudRepository.findById(id).map(productMapper::toProductDTO);
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = productMapper.toProduct(productDTO);
        return productMapper.toProductDTO(productCrudRepository.save(product));
    }

    @Override
    public void delete(int id) {
        productCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsProduct(int id) {
        return productCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return productCrudRepository.count();
    }
}
