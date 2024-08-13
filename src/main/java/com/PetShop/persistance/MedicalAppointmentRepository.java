package com.PetShop.persistance;

import com.PetShop.persistance.crud.MedicalAppointmentCrudRepository;
import com.PetShop.persistance.entity.MedicalAppointment;
import com.PetShop.persistance.entity.MedicalHistory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicalAppointmentRepository {
    private MedicalAppointmentCrudRepository medicalAppointmentCrudRepository;


    public List<MedicalAppointment> getAll(){
        return (List<MedicalAppointment>) medicalAppointmentCrudRepository.findAll();
    }
    public Optional<MedicalAppointment> getMedicalAppointmentlByID(int id){
        return medicalAppointmentCrudRepository.findById(id);
    }
    public MedicalAppointment save (MedicalAppointment medicalAppointment){

        return medicalAppointmentCrudRepository.save( medicalAppointment);
    }
    public void delete (int id){
        medicalAppointmentCrudRepository.deleteById(id);
    }


}
