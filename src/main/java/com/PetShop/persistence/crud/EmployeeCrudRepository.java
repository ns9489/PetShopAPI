package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeCrudRepository extends CrudRepository<Employee,Integer> {
}
