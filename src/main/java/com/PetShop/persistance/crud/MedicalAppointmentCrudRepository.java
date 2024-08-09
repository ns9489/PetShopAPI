package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.MedicalAppointment;
import org.springframework.data.repository.CrudRepository;

public interface MedicalAppointmentCrudRepository extends CrudRepository<MedicalAppointment, Integer> {
}
