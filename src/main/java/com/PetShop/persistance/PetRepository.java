package com.PetShop.persistance;

import com.PetShop.persistance.crud.PetCrudRepository;
import com.PetShop.persistance.entity.Pet;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Optional;

public class PetRepository {
    private PetCrudRepository PetCrudRepository;

    public List<Pet> getAll() {
    return (List<Pet>) PetCrudRepository.findAll();
    }

    public Optional<Pet> getPetById(int id) {
        return PetCrudRepository.findById(id);
    }

    public Pet save (Pet pet) {
        return PetCrudRepository.save(pet);
    }

    public void delete(int Id) {
        PetCrudRepository.deleteById(Id);
    }
}
