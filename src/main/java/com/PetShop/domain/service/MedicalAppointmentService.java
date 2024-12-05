package com.PetShop.domain.service;

import com.PetShop.domain.dto.MedicalAppointmentDTO;
import com.PetShop.domain.repository.MedicalAppointmentDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalAppointmentService {

    @Autowired
    private MedicalAppointmentDomainRepository medicalAppointmentDomainRepository;

    public List<MedicalAppointmentDTO> getAll() {
        return medicalAppointmentDomainRepository.getAll();
    }

    public Optional<MedicalAppointmentDTO> getMedicalAppointmentById(int id) {
        return medicalAppointmentDomainRepository.getMedicalAppointmentById(id);
    }

    public MedicalAppointmentDTO save(MedicalAppointmentDTO medicalAppointmentDTO) {
        return medicalAppointmentDomainRepository.save(medicalAppointmentDTO);
    }

    public boolean delete(int id) {
        return getMedicalAppointmentById(id).map(medicalAppointment -> {
            medicalAppointmentDomainRepository.delete(id);
            return true;
        }).orElse(false);
    }

    public boolean existsMedicalAppointment(int id) {
        return medicalAppointmentDomainRepository.existsMedicalAppointment(id);
    }

    public long countAll() {
        return medicalAppointmentDomainRepository.countAll();
    }
}
