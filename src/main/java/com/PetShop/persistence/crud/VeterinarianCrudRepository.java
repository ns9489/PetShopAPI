package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.Veterinarian;
import org.springframework.data.repository.CrudRepository;

public interface VeterinarianCrudRepository extends CrudRepository<Veterinarian,Integer> {
}
