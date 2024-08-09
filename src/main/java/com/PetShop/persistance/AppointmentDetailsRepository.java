package com.PetShop.persistance;

import com.PetShop.persistance.crud.AppointmentDetailsCrudRepository;
import com.PetShop.persistance.entity.AppointmentDetails;
import com.PetShop.persistance.entity.Pet;

import java.util.List;
import java.util.Optional;

public class AppointmentDetailsRepository {
    private AppointmentDetailsCrudRepository appointmentDetailsCrudRepository;


    public List<appointmentDetails> getAll() {
        return (List<appointmentDetails>) appointmentDetailsCrudRepository.findAll();
    }

    public Optional<AppointmentDetails> getPetById(int id) {
        return appointmentDetailsCrudRepository.findById(id);
    }

    public AppointmentDetails (AppointmentDetails appointmentDetails) {
        return appointmentDetailsCrudRepository.save(AppointmentDetails);
    }

    public void delete(int Id) {
        appointmentDetailsCrudRepository.deleteById(Id);
    }
}
