package com.PetShop.persistance;

import com.PetShop.persistance.crud.VeterinarianCrudRepository;
import com.PetShop.persistance.entity.Owner;
import com.PetShop.persistance.entity.Veterinarian;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VeterinarianRepository {
    private VeterinarianCrudRepository VeterinarianCrudRepository;

    public List<Veterinarian> getAll() {
        return (List<Veterinarian>) VeterinarianCrudRepository.findAll();
    }

    public Optional<Veterinarian> getVeterinarianByID(int id){
        return VeterinarianCrudRepository.findById(id);
    }
    public Veterinarian save (Veterinarian veterinarian){
        return VeterinarianCrudRepository.save(veterinarian);
    }
    public void delete (int id){
        VeterinarianCrudRepository.deleteById(id);
    }
}
