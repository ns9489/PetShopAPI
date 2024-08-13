package com.PetShop.persistance;

import com.PetShop.persistance.crud.VeterinarianCrudRepository;
import com.PetShop.persistance.entity.Veterinarian;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VeterinarianRepository {
    private VeterinarianCrudRepository veterinarianCrudRepository;

    public List<Veterinarian> getAll() {
        return (List<Veterinarian>) veterinarianCrudRepository.findAll();
    }

    public Optional<Veterinarian> getVeterinarianByID(int id){
        return veterinarianCrudRepository.findById(id);
    }
    public Veterinarian save (Veterinarian veterinarian){
        return veterinarianCrudRepository.save(veterinarian);
    }
    public void delete (int id){
        veterinarianCrudRepository.deleteById(id);
    }

    public boolean existsVeterinarian(int id){
        return veterinarianCrudRepository.existsById(id);
    }
    public long countAll(){
        return veterinarianCrudRepository.count();
    }
}
