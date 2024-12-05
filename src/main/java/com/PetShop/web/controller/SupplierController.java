package com.PetShop.web.controller;

import com.PetShop.domain.dto.SupplierDTO;
import com.PetShop.domain.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/getAll")
    public List<SupplierDTO> getAll() {
        return supplierService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<SupplierDTO> getSupplierById(@PathVariable("id") int id) {
        return supplierService.getSupplierById(id);
    }

    @PostMapping("/save")
    public SupplierDTO save(@RequestBody SupplierDTO supplierDTO) {
        return supplierService.save(supplierDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return supplierService.delete(id);
    }

    @GetMapping("/existsSupplier/{id}")
    public boolean existsSupplier(@PathVariable("id") int id) {
        return supplierService.existsSupplier(id);
    }

    @GetMapping("/countSuppliers")
    public long countSuppliers() {
        return supplierService.countAll();
    }
}
