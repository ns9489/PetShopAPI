package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerCrudRepository extends CrudRepository<Owner,Integer> {
}
