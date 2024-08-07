package com.PetShop.persistance;

import com.PetShop.persistance.crud.OwnerCrudRepository;
import com.PetShop.persistance.entity.Owner;


import java.util.List;

public class OwnerRepository {
    private OwnerCrudRepository OwnerCrudRepository;

    public List<Owner> getAll(){
        return (List<Owner>) OwnerCrudRepository.findAll();

    }
}
