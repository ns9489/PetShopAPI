package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeCrudRepository extends CrudRepository<Employe, Integer>{
}
