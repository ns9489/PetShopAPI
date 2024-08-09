package com.PetShop.persistance.crud;

import com.PetShop.persistance.entity.MedicalHistory;
import org.springframework.data.repository.CrudRepository;

public interface MedicalHistoryCrudRepository extends CrudRepository<MedicalHistory, Integer> {
}
