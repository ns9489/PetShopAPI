package com.PetShop.persistance;

import com.PetShop.persistance.crud.VeterinarianCrudRepository;
import com.PetShop.persistance.entity.Veterinarian;

import java.util.List;

public class VeterinarianRepository {
    private VeterinarianCrudRepository VeterinarianCrudRepository;

    public List<Veterinarian> getAll() {
        return (List<Veterinarian>) VeterinarianCrudRepository.findAll();
    }
}
