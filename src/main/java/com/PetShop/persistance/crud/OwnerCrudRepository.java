package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerCrudRepository extends CrudRepository<Owner, Integer> {
}

