package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Veterinarian;
import org.springframework.data.repository.CrudRepository;

public interface VeterinarianCrudRepository extends CrudRepository<Veterinarian, Integer> {
}
