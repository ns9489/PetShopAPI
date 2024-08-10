package com.PetShop.persistance;

import com.PetShop.persistance.crud.OwnerCrudRepository;
import com.PetShop.persistance.entity.Employe;
import com.PetShop.persistance.entity.Owner;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public class OwnerRepository {
    private OwnerCrudRepository OwnerCrudRepository;

    public List<Owner> getAll(){
        return (List<Owner>) OwnerCrudRepository.findAll();
    }

    public Optional<Owner> getOwnerByID(int id){
        return OwnerCrudRepository.findById(id);
    }
    public Owner save (Owner owner){
        return OwnerCrudRepository.save(owner);
    }
    public void delete (int id){
        OwnerCrudRepository.deleteById(id);
    }
}
