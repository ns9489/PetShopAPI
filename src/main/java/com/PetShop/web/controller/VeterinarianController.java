package com.PetShop.web.controller;

import com.PetShop.domain.dto.VeterinarianDTO;
import com.PetShop.domain.service.VeterinarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinarians")
public class VeterinarianController {

    @Autowired
    private VeterinarianService veterinarianService;

    @GetMapping("/getAll")
    public List<VeterinarianDTO> getAll() {
        return veterinarianService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<VeterinarianDTO> getVeterinarianById(@PathVariable("id") int id) {
        return veterinarianService.getVeterinarianById(id);
    }

    @PostMapping("/save")
    public VeterinarianDTO save(@RequestBody VeterinarianDTO veterinarianDTO) {
        return veterinarianService.save(veterinarianDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return veterinarianService.deleteById(id);
    }

    @GetMapping("/existsVeterinarian/{id}")
    public boolean existsVeterinarian(@PathVariable("id") int id) {
        return veterinarianService.existsVeterinarian(id);
    }

    @GetMapping("/countVeterinarians")
    public long countVeterinarians() {
        return veterinarianService.countAll();
    }
}
