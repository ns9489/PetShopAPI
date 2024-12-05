package com.PetShop.web.controller;

import com.PetShop.domain.dto.OwnerDTO;
import com.PetShop.domain.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/getAll")
    public List<OwnerDTO> getAll() {
        return ownerService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<OwnerDTO> getOwnerById(@PathVariable("id") int id) {
        return ownerService.getOwnerById(id);
    }

    @PostMapping("/save")
    public OwnerDTO save(@RequestBody OwnerDTO ownerDTO) {
        return ownerService.save(ownerDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return ownerService.delete(id);
    }

    @GetMapping("/existsOwner/{id}")
    public boolean existsOwner(@PathVariable("id") int id) {
        return ownerService.existsOwner(id);
    }

    @GetMapping("/countOwners")
    public long countOwners() {
        return ownerService.countAll();
    }
}
