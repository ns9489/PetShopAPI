package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetCrudRepository extends CrudRepository<Pet,Integer>{
}
