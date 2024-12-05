package com.PetShop.persistence;

import com.PetShop.domain.dto.MedicalAppointmentDTO;
import com.PetShop.domain.repository.MedicalAppointmentDomainRepository;
import com.PetShop.persistence.crud.MedicalAppointmentCrudRepository;
import com.PetShop.persistence.entity.MedicalAppointment;
import com.PetShop.persistence.mapper.MedicalAppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedicalAppointmentRepository implements MedicalAppointmentDomainRepository {
    @Autowired
    private MedicalAppointmentMapper medicalAppointmentMapper;

    @Autowired
    private MedicalAppointmentCrudRepository medicalAppointmentCrudRepository;

    @Override
    public List<MedicalAppointmentDTO> getAll() {
        List<MedicalAppointment> medicalAppointments = (List<MedicalAppointment>) medicalAppointmentCrudRepository.findAll();
        return medicalAppointmentMapper.toMedicalAppointmentDTO(medicalAppointments);
    }

    @Override
    public Optional<MedicalAppointmentDTO> getMedicalAppointmentById(int id) {
        return medicalAppointmentCrudRepository.findById(id).map(medicalAppointmentMapper::toMedicalAppointmentDTO);
    }

    @Override
    public MedicalAppointmentDTO save(MedicalAppointmentDTO medicalAppointmentDTO) {
        MedicalAppointment medicalAppointment = medicalAppointmentMapper.toMedicalAppointment(medicalAppointmentDTO);
        return medicalAppointmentMapper.toMedicalAppointmentDTO(medicalAppointmentCrudRepository.save(medicalAppointment));
    }

    @Override
    public void delete(int id) {
        medicalAppointmentCrudRepository.deleteById(id);
    }

    @Override
    public boolean existsMedicalAppointment(int id) {
        return medicalAppointmentCrudRepository.existsById(id);
    }

    @Override
    public long countAll() {
        return medicalAppointmentCrudRepository.count();
    }
}
