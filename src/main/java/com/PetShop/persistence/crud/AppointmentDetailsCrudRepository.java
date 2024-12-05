package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.AppointmentDetails;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentDetailsCrudRepository extends CrudRepository<AppointmentDetails, Integer> {
}
