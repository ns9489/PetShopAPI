package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.AppointmentDetails;
import com.PetShop.persistance.entity.Owner;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentDetailsCrudRepository extends CrudRepository <AppointmentDetails, Integer> {
}
