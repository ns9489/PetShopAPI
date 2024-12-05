package com.PetShop.domain.repository;


import com.PetShop.domain.dto.MedicalHistoryDTO;

import java.util.List;
import java.util.Optional;

public interface MedicalHistoryDomainRepository {
    List<MedicalHistoryDTO> getAll();
    Optional<MedicalHistoryDTO> getMedicalHistoryById(int id);
    MedicalHistoryDTO save(MedicalHistoryDTO medicalHistoryDTO);
    void delete(int id);
    boolean existsMedicalHistory(int id);
    long countAll();
}
