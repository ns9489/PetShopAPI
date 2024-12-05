package com.PetShop.web.controller;

import com.PetShop.domain.dto.ProductDTO;
import com.PetShop.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<ProductDTO> getProductById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/save")
    public ProductDTO save(@RequestBody ProductDTO productDTO) {
        return productService.save(productDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return productService.delete(id);
    }

    @GetMapping("/existsProduct/{id}")
    public boolean existsProduct(@PathVariable("id") int id) {
        return productService.existsProduct(id);
    }

    @GetMapping("/countProducts")
    public long countProducts() {
        return productService.countAll();
    }
}
