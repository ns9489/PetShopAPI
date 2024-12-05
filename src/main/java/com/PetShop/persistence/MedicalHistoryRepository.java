package com.PetShop.persistence;

import com.PetShop.domain.dto.MedicalHistoryDTO;
import com.PetShop.domain.repository.MedicalHistoryDomainRepository;
import com.PetShop.persistence.crud.MedicalHistoryCrudRepository;
import com.PetShop.persistence.entity.MedicalHistory;
import com.PetShop.persistence.mapper.MedicalHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicalHistoryRepository implements MedicalHistoryDomainRepository {
    @Autowired
    private MedicalHistoryMapper medicalHistoryMapper;

    @Autowired
    private MedicalHistoryCrudRepository medicalHistoryCrudRepository;

    @Override
    public List<MedicalHistoryDTO> getAll() {
        List<MedicalHistory> medicalHistories = (List<MedicalHistory>) medicalHistoryCrudRepository.findAll();
        return medicalHistoryMapper.toMedicalHistoryDTO(medicalHistories);
    }

    @Override
    public Optional<MedicalHistoryDTO> getMedicalHistoryById(int id) {
        return medicalHistoryCrudRepository.findById(id).map(medicalHistoryMapper::toMedicalHistoryDTO);
    }

    @Override
    public MedicalHistoryDTO save(MedicalHistoryDTO medicalHistoryDTO) {
        MedicalHistory medicalHistory = medicalHistoryMapper.toMedicalHistory(medicalHistoryDTO);
        return medicalHistoryMapper.toMedicalHistoryDTO(medicalHistoryCrudRepository.save(medicalHistory));
    }

    @Override
    public void delete(int id) {
        medicalHistoryCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsMedicalHistory(int id) {
        return medicalHistoryCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return medicalHistoryCrudRepository.count();
    }
}
