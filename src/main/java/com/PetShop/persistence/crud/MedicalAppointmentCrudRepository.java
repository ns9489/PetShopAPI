package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.MedicalAppointment;
import org.springframework.data.repository.CrudRepository;

public interface MedicalAppointmentCrudRepository extends CrudRepository<MedicalAppointment,Integer> {
}
