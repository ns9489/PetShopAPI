package com.PetShop.domain.repository;

import com.PetShop.domain.dto.MedicalAppointmentDTO;

import java.util.List;
import java.util.Optional;

public interface MedicalAppointmentDomainRepository {
    List<MedicalAppointmentDTO> getAll();
    Optional<MedicalAppointmentDTO> getMedicalAppointmentById(int id);
    MedicalAppointmentDTO save(MedicalAppointmentDTO medicalAppointmentDTO);
    void delete(int id);
    boolean existsMedicalAppointment(int id);
    long countAll();
}
