package com.PetShop.persistence.crud;

import com.PetShop.persistence.entity.MedicalHistory;
import org.springframework.data.repository.CrudRepository;

public interface MedicalHistoryCrudRepository extends CrudRepository<MedicalHistory,Integer> {
}
