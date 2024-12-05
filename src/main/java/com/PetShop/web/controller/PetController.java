package com.PetShop.web.controller;

import com.PetShop.domain.dto.PetDTO;
import com.PetShop.domain.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/getAll")
    public List<PetDTO> getAll() {
        return petService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<PetDTO> getPetById(@PathVariable("id") int id) {
        return petService.getPetById(id);
    }

    @PostMapping("/save")
    public PetDTO save(@RequestBody PetDTO petDTO) {
        return petService.save(petDTO);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return petService.delete(id);
    }

    @GetMapping("/existsPet/{id}")
    public boolean existsPet(@PathVariable("id") int id) {
        return petService.existsPet(id);
    }

    @GetMapping("/countPets")
    public long countPets() {
        return petService.countAll();
    }
}
