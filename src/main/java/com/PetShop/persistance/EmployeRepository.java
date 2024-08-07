package com.PetShop.persistance;

import com.PetShop.persistance.crud.EmployeCrudRepository;
import com.PetShop.persistance.entity.Employe;

import java.util.List;

public class EmployeRepository {
    private EmployeCrudRepository EmployeCrudRepository;

    public List<Employe> getAll(){
        return (List<Employe>) EmployeCrudRepository.findAll();
    }
}
