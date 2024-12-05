package com.PetShop.domain.service;

import com.PetShop.domain.dto.MedicalHistoryDTO;
import com.PetShop.domain.repository.MedicalHistoryDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalHistoryService {

    @Autowired
    private MedicalHistoryDomainRepository medicalHistoryDomainRepository;

    public List<MedicalHistoryDTO> getAll() {
        return medicalHistoryDomainRepository.getAll();
    }

    public Optional<MedicalHistoryDTO> getMedicalHistoryById(int id) {
        return medicalHistoryDomainRepository.getMedicalHistoryById(id);
    }

    public MedicalHistoryDTO save(MedicalHistoryDTO medicalHistoryDTO) {
        return medicalHistoryDomainRepository.save(medicalHistoryDTO);
    }

    public boolean delete(int id) {
        return getMedicalHistoryById(id).map(medicalHistory -> {
            medicalHistoryDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsMedicalHistory(int id) {
        return medicalHistoryDomainRepository.existsMedicalHistory(id);
    }

    public long countAll() {
        return medicalHistoryDomainRepository.countAll();
    }
}
