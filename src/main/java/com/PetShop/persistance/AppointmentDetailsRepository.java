package com.PetShop.persistance;

import com.PetShop.persistance.crud.AppointmentDetailsCrudRepository;
import com.PetShop.persistance.entity.AppointmentDetails;
import com.PetShop.persistance.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AppointmentDetailsRepository {
    private AppointmentDetailsCrudRepository appointmentDetailsCrudRepository;


    public List<AppointmentDetails> getAll() {
        return (List<AppointmentDetails>) appointmentDetailsCrudRepository.findAll();
    }

    public Optional<AppointmentDetails> getPetById(int id) {
        return appointmentDetailsCrudRepository.findById(id);
    }

    public AppointmentDetails Save (AppointmentDetails appointmentDetails) {
        return appointmentDetailsCrudRepository.save(appointmentDetails);
    }

    public void delete(int Id) {
        appointmentDetailsCrudRepository.deleteById(Id);
    }
}
