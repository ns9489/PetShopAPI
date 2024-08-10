package com.PetShop.persistance;

import com.PetShop.persistance.crud.PetCrudRepository;
import com.PetShop.persistance.entity.Pet;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository {
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll() {
        return (List<Pet>) petCrudRepository.findAll();
    }

    /*public  List<Pet> getBySpecies(String species){
        return petCrudRepository.findBySpeciesOrderByNameAsc(species);
    }*/

    public Optional<Pet> getPetById(Integer id) {
        return petCrudRepository.findById(id);
    }

    public Pet save (Pet pet) {
        return petCrudRepository.save(pet);
    }

    public void delete(int Id) {
        petCrudRepository.deleteById(Id);
    }
    public boolean existsPet(int id){
        return petCrudRepository.existsById(id);
  }
    public long countAll(){
        return petCrudRepository.count();
    }
}
