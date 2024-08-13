package com.PetShop.persistance;

import com.PetShop.persistance.crud.EmployeCrudRepository;
import com.PetShop.persistance.entity.Employe;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeRepository {
    private EmployeCrudRepository employeCrudRepository;

    public List<Employe> getAll(){
        return (List<Employe>) employeCrudRepository.findAll();
    }

    public Optional<Employe> getEmployeByID(int id){
        return employeCrudRepository.findById(id);
    }
    public Employe save(Employe employe){
        return employeCrudRepository.save(employe);
    }
    public void delete (int id){
        employeCrudRepository.deleteById(id);
    }

    public boolean existsEmploye(int id){
        return employeCrudRepository.existsById(id);
    }
    public long countAll(){
        return employeCrudRepository.count();
    }
}
